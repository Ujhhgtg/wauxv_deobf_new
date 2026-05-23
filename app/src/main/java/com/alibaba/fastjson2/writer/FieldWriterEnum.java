package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterEnum extends FieldWriter {
    final Enum[] enumConstants;
    final Class enumType;
    final long[] hashCodes;
    final long[] hashCodesSymbolCache;
    final char[][] utf16ValueCache;
    final byte[][] utf8ValueCache;
    final char[][] valueNameCacheUTF16;
    final byte[][] valueNameCacheUTF8;

    public FieldWriterEnum(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class<? extends Enum> cls, Field field, Method method, Function function) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, function);
        this.enumType = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.enumConstants = enumArr;
        this.hashCodes = new long[enumArr.length];
        this.hashCodesSymbolCache = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i2 >= enumArr2.length) {
                this.valueNameCacheUTF8 = new byte[enumArr2.length][];
                this.valueNameCacheUTF16 = new char[enumArr2.length][];
                this.utf8ValueCache = new byte[enumArr2.length][];
                this.utf16ValueCache = new char[enumArr2.length][];
                return;
            }
            this.hashCodes[i2] = Fnv.hashCode64(enumArr2[i2].name());
            i2++;
        }
    }

    private byte[] getBytes(int i) {
        int iStringSize = IOUtils.stringSize(i);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + iStringSize);
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length);
        IOUtils.getChars(i, bArrCopyOf2.length, bArrCopyOf2);
        return bArrCopyOf2;
    }

    private char[] getChars(int i) {
        int iStringSize = IOUtils.stringSize(i);
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + iStringSize);
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        IOUtils.getChars(i, cArrCopyOf2.length, cArrCopyOf2);
        return cArrCopyOf2;
    }

    private byte[] getNameBytes(int i) {
        byte[] bytes = this.enumConstants[i].name().getBytes(StandardCharsets.UTF_8);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + bytes.length + 2);
        byte[] bArr2 = this.nameWithColonUTF8;
        bArrCopyOf[bArr2.length] = 34;
        int length = bArr2.length + 1;
        int length2 = bytes.length;
        int i2 = 0;
        while (i2 < length2) {
            bArrCopyOf[length] = bytes[i2];
            i2++;
            length++;
        }
        bArrCopyOf[bArrCopyOf.length - 1] = 34;
        return bArrCopyOf;
    }

    private char[] getNameChars(int i) {
        String strName = this.enumConstants[i].name();
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, strName.length() + cArr.length + 2);
        cArrCopyOf[this.nameWithColonUTF16.length] = '\"';
        strName.getChars(0, strName.length(), cArrCopyOf, this.nameWithColonUTF16.length + 1);
        cArrCopyOf[cArrCopyOf.length - 1] = '\"';
        return cArrCopyOf;
    }

    private void writeEnumUsingOrdinal(JSONWriter jSONWriter, int i) {
        if ((this.features & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.utf8) {
                byte[][] bArr = this.utf8ValueCache;
                byte[] bytes = bArr[i];
                if (bytes == null) {
                    bytes = getBytes(i);
                    bArr[i] = bytes;
                }
                jSONWriter.writeNameRaw(bytes);
                return;
            }
            if (jSONWriter.utf16) {
                char[][] cArr = this.utf16ValueCache;
                char[] chars = cArr[i];
                if (chars == null) {
                    chars = getChars(i);
                    cArr[i] = chars;
                }
                jSONWriter.writeNameRaw(chars);
                return;
            }
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeInt32(i);
    }

    private void writeJSONBToString(JSONWriter jSONWriter, Enum r8, SymbolTable symbolTable) {
        int ordinalByHashCode;
        if (symbolTable != null) {
            int iIdentityHashCode = System.identityHashCode(symbolTable);
            long j = this.nameSymbolCache;
            if (j == 0) {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            } else if (((int) j) == iIdentityHashCode) {
                ordinalByHashCode = (int) (j >> 32);
            } else {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        } else {
            ordinalByHashCode = -1;
        }
        if (ordinalByHashCode != -1) {
            jSONWriter.writeSymbol(-ordinalByHashCode);
        } else {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
        jSONWriter.writeString(r8.toString());
    }

    private boolean writeSymbolNameOrdinal(JSONWriter jSONWriter, int i, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int ordinalByHashCode2;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j = this.hashCodesSymbolCache[i];
        if (j == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i]);
            this.hashCodesSymbolCache[i] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCodes[i]);
            this.hashCodesSymbolCache[i] = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode < 0) {
            return false;
        }
        long j2 = this.nameSymbolCache;
        if (j2 == 0) {
            ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
            if (ordinalByHashCode2 != -1) {
                this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j2) == iIdentityHashCode) {
            ordinalByHashCode2 = (int) (j2 >> 32);
        } else {
            ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode2 != -1) {
            jSONWriter.writeSymbol(-ordinalByHashCode2);
        } else {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
        jSONWriter.writeRaw(121);
        jSONWriter.writeInt32(-ordinalByHashCode);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        Enum r7 = (Enum) getFieldValue(obj);
        if (r7 != null) {
            if (jSONWriter.jsonb) {
                writeEnumJSONB(jSONWriter, r7);
            } else {
                writeEnum(jSONWriter, r7);
            }
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNull();
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnum(JSONWriter jSONWriter, Enum r10) {
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & features) == 0) {
            if (jSONWriter.jsonb) {
                writeEnumJSONB(jSONWriter, r10);
                return;
            }
            int iOrdinal = r10.ordinal();
            if ((JSONWriter.Feature.WriteEnumUsingOrdinal.mask & features) != 0) {
                writeEnumUsingOrdinal(jSONWriter, iOrdinal);
                return;
            }
            if ((features & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
                if (jSONWriter.utf8) {
                    byte[][] bArr = this.valueNameCacheUTF8;
                    byte[] nameBytes = bArr[iOrdinal];
                    if (nameBytes == null) {
                        nameBytes = getNameBytes(iOrdinal);
                        bArr[iOrdinal] = nameBytes;
                    }
                    jSONWriter.writeNameRaw(nameBytes);
                    return;
                }
                if (jSONWriter.utf16) {
                    char[][] cArr = this.valueNameCacheUTF16;
                    char[] nameChars = cArr[iOrdinal];
                    if (nameChars == null) {
                        nameChars = getNameChars(iOrdinal);
                        cArr[iOrdinal] = nameChars;
                    }
                    jSONWriter.writeNameRaw(nameChars);
                    return;
                }
            }
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeString(r10.toString());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnumJSONB(JSONWriter jSONWriter, Enum r11) {
        int ordinalByHashCode;
        if (r11 == null) {
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        long j = JSONWriter.Feature.WriteEnumUsingToString.mask;
        boolean z = ((JSONWriter.Feature.WriteEnumsUsingName.mask | j) & features) == 0;
        boolean z2 = (features & j) != 0;
        int iOrdinal = r11.ordinal();
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !z || z2 || !writeSymbolNameOrdinal(jSONWriter, iOrdinal, symbolTable)) {
            if (z2) {
                writeJSONBToString(jSONWriter, r11, symbolTable);
                return;
            }
            if (!z) {
                writeFieldName(jSONWriter);
                jSONWriter.writeString(r11.name());
                return;
            }
            if (symbolTable != null) {
                int iIdentityHashCode = System.identityHashCode(symbolTable);
                long j2 = this.nameSymbolCache;
                if (j2 == 0) {
                    ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                    this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
                } else if (((int) j2) == iIdentityHashCode) {
                    ordinalByHashCode = (int) (j2 >> 32);
                } else {
                    ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
                    this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
                }
            } else {
                ordinalByHashCode = -1;
            }
            if (ordinalByHashCode != -1) {
                jSONWriter.writeSymbol(-ordinalByHashCode);
            } else {
                jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
            }
            jSONWriter.writeInt32(iOrdinal);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final int writeEnumValueJSONB(byte[] bArr, int i, Enum r10, SymbolTable symbolTable, long j) {
        if (r10 == null) {
            bArr[i] = -81;
            return i + 1;
        }
        long j2 = j | this.features;
        long j3 = JSONWriter.Feature.WriteEnumUsingToString.mask;
        boolean z = ((JSONWriter.Feature.WriteEnumsUsingName.mask | j3) & j2) == 0;
        String string = (j2 & j3) != 0 ? r10.toString() : r10.name();
        if (IOUtils.isASCII(string)) {
            return JSONB.IO.writeSymbol(bArr, i, string, symbolTable);
        }
        return z ? JSONB.IO.writeInt32(bArr, i, r10.ordinal()) : JSONB.IO.writeString(bArr, i, string);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeValue(JSONWriter jSONWriter, Object obj) {
        jSONWriter.writeEnum((Enum) getFieldValue(obj));
    }
}
