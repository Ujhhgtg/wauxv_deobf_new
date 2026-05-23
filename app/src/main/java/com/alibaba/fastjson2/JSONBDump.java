package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import okhttp3.HttpUrl;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONBDump {
    static Charset GB18030;
    final byte[] bytes;
    final JSONWriter jsonWriter;
    String lastReference;
    int offset;
    final boolean raw;
    int strBegin;
    int strlen;
    byte strtype;
    final SymbolTable symbolTable;
    final Map<Integer, String> symbols;
    byte type;

    public JSONBDump(byte[] bArr, boolean z) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z;
        this.jsonWriter = JSONWriter.ofPretty();
        this.symbolTable = null;
        dumpAny();
    }

    private void dumpAny() {
        int int32Value;
        BigInteger bigIntegerValueOf;
        String str;
        String str2;
        int i = this.offset;
        byte[] bArr = this.bytes;
        if (i >= bArr.length) {
            return;
        }
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        this.type = b;
        String string = null;
        if (b == -90) {
            dumpObject(null);
            return;
        }
        if (b != 72) {
            if (b == -88) {
                int i3 = i + 2;
                this.offset = i3;
                int i4 = bArr[i2] << 8;
                int i5 = i + 3;
                this.offset = i5;
                int i6 = i4 + (bArr[i3] & 255);
                int i7 = i + 4;
                this.offset = i7;
                byte b2 = bArr[i5];
                int i8 = i + 5;
                this.offset = i8;
                byte b3 = bArr[i7];
                int i9 = i + 6;
                this.offset = i9;
                byte b4 = bArr[i8];
                int i10 = i + 7;
                this.offset = i10;
                byte b5 = bArr[i9];
                this.offset = i + 8;
                this.jsonWriter.writeLocalDateTime(LocalDateTime.of(i6, b2, b3, b4, b5, bArr[i10], readInt32Value()));
                return;
            }
            if (b == -87) {
                int i11 = i + 2;
                this.offset = i11;
                int i12 = bArr[i2] << 8;
                int i13 = i + 3;
                this.offset = i13;
                int i14 = i12 + (bArr[i11] & 255);
                int i15 = i + 4;
                this.offset = i15;
                byte b6 = bArr[i13];
                this.offset = i + 5;
                this.jsonWriter.writeLocalDate(LocalDate.of(i14, b6, bArr[i15]));
                return;
            }
            switch (b) {
                case -112:
                    this.jsonWriter.writeChar((char) readInt32Value());
                    return;
                case -111:
                    int int32Value2 = readInt32Value();
                    byte[] bArr2 = new byte[int32Value2];
                    System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value2);
                    this.offset += int32Value2;
                    this.jsonWriter.writeBinary(bArr2);
                    return;
                case -110:
                    if (isInt()) {
                        int32Value = readInt32Value();
                    } else {
                        string = readString();
                        int32Value = readInt32Value();
                        this.symbols.put(Integer.valueOf(int32Value), string);
                    }
                    if (!this.raw && this.bytes[this.offset] == -90) {
                        if (string == null) {
                            string = getString(int32Value);
                        }
                        this.offset++;
                        dumpObject(string);
                        return;
                    }
                    this.jsonWriter.startObject();
                    this.jsonWriter.writeName("@type");
                    this.jsonWriter.writeColon();
                    if (string == null) {
                        if (int32Value >= 0) {
                            this.jsonWriter.writeString("#" + int32Value);
                        } else if (this.raw) {
                            this.jsonWriter.writeString("#" + int32Value);
                        } else {
                            this.jsonWriter.writeString(this.symbolTable.getName(-int32Value));
                        }
                    } else if (this.raw) {
                        this.jsonWriter.writeString(string + "#" + int32Value);
                    } else {
                        this.jsonWriter.writeString(string);
                    }
                    this.jsonWriter.writeName(ObjectReader.VALUE_NAME);
                    this.jsonWriter.writeColon();
                    dumpAny();
                    this.jsonWriter.endObject();
                    return;
                case -109:
                    dumpReference();
                    return;
                default:
                    switch (b) {
                        case -85:
                        case -66:
                            long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i2]) << 56);
                            this.offset = i + 9;
                            this.jsonWriter.writeInt64(j);
                            return;
                        case -84:
                        case -83:
                            break;
                        case -82:
                            this.jsonWriter.writeInstant(Instant.ofEpochSecond(readInt64Value(), readInt32Value()));
                            return;
                        case -81:
                            this.jsonWriter.writeNull();
                            return;
                        case -80:
                            this.jsonWriter.writeBool(false);
                            return;
                        case -79:
                            this.jsonWriter.writeBool(true);
                            return;
                        case -78:
                            this.jsonWriter.writeDouble(0.0d);
                            return;
                        case -77:
                            this.jsonWriter.writeDouble(1.0d);
                            return;
                        case -76:
                            this.jsonWriter.writeDouble(readInt64Value());
                            return;
                        case -75:
                            long j2 = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i2]) << 56);
                            this.offset = i + 9;
                            this.jsonWriter.writeDouble(Double.longBitsToDouble(j2));
                            return;
                        case -74:
                            this.jsonWriter.writeFloat(readInt32Value());
                            return;
                        case -73:
                            int i16 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i2] << 24);
                            this.offset = i + 5;
                            this.jsonWriter.writeFloat(Float.intBitsToFloat(i16));
                            return;
                        case -72:
                            this.jsonWriter.writeDecimal(BigDecimal.valueOf(readInt64Value()), 0L, null);
                            return;
                        case -71:
                            int int32Value3 = readInt32Value();
                            byte[] bArr3 = this.bytes;
                            int i17 = this.offset;
                            int i18 = i17 + 1;
                            this.offset = i18;
                            byte b7 = bArr3[i17];
                            if (b7 == -70) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt64Value());
                            } else if (b7 == -66) {
                                bigIntegerValueOf = BigInteger.valueOf(IOUtils.getLongBE(bArr3, i18));
                                this.offset += 8;
                            } else if (b7 == 72) {
                                bigIntegerValueOf = BigInteger.valueOf(readInt32Value());
                            } else if (b7 >= -16 && b7 <= 47) {
                                bigIntegerValueOf = BigInteger.valueOf(b7);
                            } else if (b7 >= 48 && b7 <= 63) {
                                int i19 = (b7 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                this.offset = i17 + 2;
                                bigIntegerValueOf = BigInteger.valueOf(i19 + (bArr3[i18] & 255));
                            } else if (b7 < 64 || b7 > 71) {
                                int int32Value4 = readInt32Value();
                                byte[] bArr4 = new byte[int32Value4];
                                System.arraycopy(this.bytes, this.offset, bArr4, 0, int32Value4);
                                this.offset += int32Value4;
                                bigIntegerValueOf = new BigInteger(bArr4);
                            } else {
                                int i20 = (b7 + JSONB.Constants.BC_INT16) << 16;
                                int i21 = i17 + 2;
                                this.offset = i21;
                                int i22 = i20 + ((bArr3[i18] & 255) << 8);
                                this.offset = i17 + 3;
                                bigIntegerValueOf = BigInteger.valueOf(i22 + (bArr3[i21] & 255));
                            }
                            this.jsonWriter.writeDecimal(int32Value3 == 0 ? new BigDecimal(bigIntegerValueOf) : new BigDecimal(bigIntegerValueOf, int32Value3), 0L, null);
                            return;
                        case -70:
                            this.jsonWriter.writeInt64(readInt64Value());
                            return;
                        case -69:
                            int int32Value5 = readInt32Value();
                            byte[] bArr5 = new byte[int32Value5];
                            System.arraycopy(this.bytes, this.offset, bArr5, 0, int32Value5);
                            this.offset += int32Value5;
                            this.jsonWriter.writeBigInt(new BigInteger(bArr5));
                            return;
                        case -68:
                            JSONWriter jSONWriter = this.jsonWriter;
                            int i23 = i + 2;
                            this.offset = i23;
                            int i24 = bArr[i2] << 8;
                            this.offset = i + 3;
                            jSONWriter.writeInt16((short) (i24 + (bArr[i23] & 255)));
                            return;
                        case -67:
                            JSONWriter jSONWriter2 = this.jsonWriter;
                            this.offset = i + 2;
                            jSONWriter2.writeInt8(bArr[i2]);
                            return;
                        case -65:
                            int i25 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i2] << 24);
                            this.offset = i + 5;
                            this.jsonWriter.writeInt64(i25);
                            return;
                        default:
                            switch (b) {
                                case 122:
                                    int length = readLength();
                                    String str3 = new String(this.bytes, this.offset, length, StandardCharsets.UTF_8);
                                    this.offset += length;
                                    this.jsonWriter.writeString(str3);
                                    return;
                                case Opcodes.LSHR /* 123 */:
                                    int length2 = readLength();
                                    String str4 = new String(this.bytes, this.offset, length2, StandardCharsets.UTF_16);
                                    this.offset += length2;
                                    this.jsonWriter.writeString(str4);
                                    return;
                                case Opcodes.IUSHR /* 124 */:
                                    int length3 = readLength();
                                    BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
                                    if (biFunction == null || JDKUtils.BIG_ENDIAN) {
                                        str = new String(this.bytes, this.offset, length3, StandardCharsets.UTF_16LE);
                                    } else {
                                        byte[] bArr6 = new byte[length3];
                                        System.arraycopy(this.bytes, this.offset, bArr6, 0, length3);
                                        str = biFunction.apply(bArr6, JDKUtils.UTF16);
                                    }
                                    this.offset += length3;
                                    this.jsonWriter.writeString(str);
                                    return;
                                case Opcodes.LUSHR /* 125 */:
                                    int length4 = readLength();
                                    BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
                                    if (biFunction2 == null || !JDKUtils.BIG_ENDIAN) {
                                        str2 = new String(this.bytes, this.offset, length4, StandardCharsets.UTF_16BE);
                                    } else {
                                        byte[] bArr7 = new byte[length4];
                                        System.arraycopy(this.bytes, this.offset, bArr7, 0, length4);
                                        str2 = biFunction2.apply(bArr7, JDKUtils.UTF16);
                                    }
                                    this.offset += length4;
                                    this.jsonWriter.writeString(str2);
                                    return;
                                case 126:
                                    if (GB18030 == null) {
                                        GB18030 = Charset.forName("GB18030");
                                    }
                                    int length5 = readLength();
                                    String str5 = new String(this.bytes, this.offset, length5, GB18030);
                                    this.offset += length5;
                                    this.jsonWriter.writeString(str5);
                                    return;
                                case 127:
                                    if (isInt()) {
                                        int int32Value6 = readInt32Value();
                                        if (!this.raw) {
                                            this.jsonWriter.writeString(getString(int32Value6));
                                            return;
                                        }
                                        this.jsonWriter.writeString("#" + int32Value6);
                                        return;
                                    }
                                    String string2 = readString();
                                    int int32Value7 = readInt32Value();
                                    this.symbols.put(Integer.valueOf(int32Value7), string2);
                                    if (!this.raw) {
                                        this.jsonWriter.writeString(string2);
                                        return;
                                    }
                                    this.jsonWriter.writeString(string2 + "#" + int32Value7);
                                    return;
                                default:
                                    if (b >= -16 && b <= 47) {
                                        this.jsonWriter.writeInt32(b);
                                        return;
                                    }
                                    if (b >= -40 && b <= -17) {
                                        this.jsonWriter.writeInt64(b + 32);
                                        return;
                                    }
                                    if (b >= 48 && b <= 63) {
                                        int i26 = (b + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                                        this.offset = i + 2;
                                        this.jsonWriter.writeInt32(i26 + (bArr[i2] & 255));
                                        return;
                                    }
                                    if (b >= 64 && b <= 71) {
                                        int i27 = (b + JSONB.Constants.BC_INT16) << 16;
                                        int i28 = i + 2;
                                        this.offset = i28;
                                        int i29 = i27 + ((bArr[i2] & 255) << 8);
                                        this.offset = i + 3;
                                        this.jsonWriter.writeInt32(i29 + (bArr[i28] & 255));
                                        return;
                                    }
                                    if (b >= -56 && b <= -41) {
                                        int i30 = (b + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
                                        this.offset = i + 2;
                                        this.jsonWriter.writeInt32(i30 + (bArr[i2] & 255));
                                        return;
                                    }
                                    if (b >= -64 && b <= -57) {
                                        int i31 = i + 2;
                                        this.offset = i31;
                                        int i32 = ((b + 60) << 16) + ((bArr[i2] & 255) << 8);
                                        this.offset = i + 3;
                                        this.jsonWriter.writeInt64(i32 + (bArr[i31] & 255));
                                        return;
                                    }
                                    if (b >= -108 && b <= -92) {
                                        dumpArray();
                                        return;
                                    }
                                    if (b < 73) {
                                        throw new JSONException("not support type : " + JSONB.typeName(this.type) + ", offset " + this.offset);
                                    }
                                    int length6 = b == 121 ? readLength() : b + JSONB.Constants.BC_FLOAT;
                                    this.strlen = length6;
                                    if (length6 < 0) {
                                        this.jsonWriter.writeRaw("{\"$symbol\":");
                                        this.jsonWriter.writeInt32(this.strlen);
                                        this.jsonWriter.writeRaw("}");
                                        return;
                                    } else {
                                        String str6 = new String(this.bytes, this.offset, length6, StandardCharsets.ISO_8859_1);
                                        this.offset += this.strlen;
                                        this.jsonWriter.writeString(str6);
                                        return;
                                    }
                            }
                    }
                    break;
            }
        }
        int i33 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i2] << 24);
        this.offset = i + 5;
        this.jsonWriter.writeInt32(i33);
    }

    private void dumpArray() {
        byte b;
        byte b2 = this.type;
        int length = b2 == -92 ? readLength() : b2 + 108;
        if (length == 0) {
            this.jsonWriter.writeRaw(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        if (length == 1) {
            this.type = this.bytes[this.offset];
            if (isInt() || (b = this.type) == -81 || (b >= 73 && b <= 120)) {
                this.jsonWriter.writeRaw("[");
                dumpAny();
                this.jsonWriter.writeRaw("]");
                return;
            }
        }
        this.jsonWriter.startArray();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                this.jsonWriter.writeComma();
            }
            if (isReference()) {
                dumpReference();
            } else {
                dumpAny();
            }
        }
        this.jsonWriter.endArray();
    }

    private void dumpObject(String str) {
        if (str != null) {
            this.jsonWriter.startObject();
            this.jsonWriter.writeName("@type");
            this.jsonWriter.writeColon();
            this.jsonWriter.writeString(str);
        } else {
            if (this.bytes[this.offset] == -91) {
                this.jsonWriter.writeRaw("{}");
                this.offset++;
                return;
            }
            this.jsonWriter.startObject();
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.bytes;
            int i2 = this.offset;
            byte b = bArr[i2];
            if (b == -109) {
                dumpReference();
            } else {
                if (b == -91) {
                    this.offset = i2 + 1;
                    this.jsonWriter.endObject();
                    return;
                }
                if (b == 127) {
                    this.offset = i2 + 1;
                    if (isInt()) {
                        int int32Value = readInt32Value();
                        if (this.raw) {
                            this.jsonWriter.writeName("#" + int32Value);
                        } else {
                            this.jsonWriter.writeName(getString(int32Value));
                        }
                    } else {
                        String string = readString();
                        int int32Value2 = readInt32Value();
                        this.symbols.put(Integer.valueOf(int32Value2), string);
                        if (this.raw) {
                            this.jsonWriter.writeName(string + "#" + int32Value2);
                        } else {
                            this.jsonWriter.writeName(string);
                        }
                    }
                } else if (isString()) {
                    this.jsonWriter.writeName(readString());
                } else if (b >= -16 && b <= 72) {
                    this.jsonWriter.writeName(readInt32Value());
                } else if ((b < -40 || b > -17) && b != -66) {
                    if (i != 0) {
                        this.jsonWriter.writeComma();
                    }
                    dumpAny();
                } else {
                    this.jsonWriter.writeName(readInt64Value());
                }
            }
            i++;
            this.jsonWriter.writeColon();
            if (isReference()) {
                dumpReference();
            } else {
                dumpAny();
            }
        }
    }

    private void dumpReference() {
        this.jsonWriter.writeRaw("{\"$ref\":");
        String reference = readReference();
        this.jsonWriter.writeString(reference);
        if (!"#-1".equals(reference)) {
            this.lastReference = reference;
        }
        this.jsonWriter.writeRaw("}");
    }

    public String getString(int i) {
        String name = i < 0 ? this.symbolTable.getName(-i) : this.symbols.get(Integer.valueOf(i));
        if (name != null) {
            return name;
        }
        throw new JSONException(AbstractC1194.m2779(i, "symbol not found : "));
    }

    public boolean isInt() {
        byte b = this.bytes[this.offset];
        return (b >= -70 && b <= 72) || b == -83 || b == -84 || b == -85;
    }

    public boolean isReference() {
        int i = this.offset;
        byte[] bArr = this.bytes;
        return i < bArr.length && bArr[i] == -109;
    }

    public boolean isString() {
        byte b = this.bytes[this.offset];
        return b >= 73 && b <= 125;
    }

    public int readInt32Value() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        if (b >= -16 && b <= 47) {
            return b;
        }
        if (b >= 48 && b <= 63) {
            int i3 = (b + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i + 2;
            return i3 + (bArr[i2] & 255);
        }
        if (b >= 64 && b <= 71) {
            int i4 = (b + JSONB.Constants.BC_INT16) << 16;
            int i5 = i + 2;
            this.offset = i5;
            int i6 = i4 + ((bArr[i2] & 255) << 8);
            this.offset = i + 3;
            return i6 + (bArr[i5] & 255);
        }
        if (b == -84 || b == -83 || b == 72) {
            int i7 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i2] << 24);
            this.offset = i + 5;
            return i7;
        }
        throw new JSONException("readInt32Value not support " + JSONB.typeName(b) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    public long readInt64Value() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        if (b >= -16 && b <= 47) {
            return b;
        }
        if (b >= 48 && b <= 63) {
            int i3 = (b - JSONB.Constants.BC_INT32_BYTE_ZERO) << 8;
            this.offset = i + 2;
            return i3 + (bArr[i2] & 255);
        }
        if (b >= 64 && b <= 71) {
            int i4 = (b + JSONB.Constants.BC_INT16) << 16;
            int i5 = i + 2;
            this.offset = i5;
            int i6 = i4 + ((bArr[i2] & 255) << 8);
            this.offset = i + 3;
            return i6 + (bArr[i5] & 255);
        }
        if (b >= -40 && b <= -17) {
            return ((long) (b - JSONB.Constants.BC_INT64_NUM_MIN)) - 8;
        }
        if (b >= -56 && b <= -41) {
            int i7 = (b + JSONB.Constants.BC_INT32_BYTE_MIN) << 8;
            this.offset = i + 2;
            return i7 + (bArr[i2] & 255);
        }
        if (b >= -64 && b <= -57) {
            int i8 = i + 2;
            this.offset = i8;
            int i9 = ((b + 60) << 16) + ((bArr[i2] & 255) << 8);
            this.offset = i + 3;
            return i9 + (bArr[i8] & 255);
        }
        if (b != -85) {
            if (b != 72) {
                switch (b) {
                    case -68:
                        int i10 = (bArr[i + 2] & 255) + (bArr[i2] << 8);
                        this.offset = i + 3;
                        return i10;
                    case -67:
                        this.offset = i + 2;
                        return bArr[i2];
                    case -66:
                        break;
                    case -65:
                        break;
                    default:
                        throw new JSONException("readInt64Value not support " + JSONB.typeName(b) + ", offset " + this.offset + "/" + this.bytes.length);
                }
            }
            int i11 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i2] << 24);
            this.offset = i + 5;
            return i11;
        }
        long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i2]) << 56);
        this.offset = i + 9;
        return j;
    }

    public int readLength() {
        int i;
        byte b;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 1;
        this.offset = i3;
        byte b2 = bArr[i2];
        if (b2 >= -16 && b2 <= 47) {
            return b2;
        }
        if (b2 >= 64 && b2 <= 71) {
            int i4 = (b2 + JSONB.Constants.BC_INT16) << 16;
            int i5 = i2 + 2;
            this.offset = i5;
            i = i4 + ((bArr[i3] & 255) << 8);
            this.offset = i2 + 3;
            b = bArr[i5];
        } else {
            if (b2 < 48 || b2 > 63) {
                if (b2 != 72) {
                    throw new JSONException(AbstractC1194.m2779(b2, "not support length type : "));
                }
                int i6 = i2 + 2;
                this.offset = i6;
                int i7 = bArr[i3] << 24;
                int i8 = i2 + 3;
                this.offset = i8;
                int i9 = i7 + ((bArr[i6] & 255) << 16);
                int i10 = i2 + 4;
                this.offset = i10;
                int i11 = i9 + ((bArr[i8] & 255) << 8);
                this.offset = i2 + 5;
                return i11 + (bArr[i10] & 255);
            }
            i = (b2 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
            this.offset = i2 + 2;
            b = bArr[i3];
        }
        return i + (b & 255);
    }

    public String readReference() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -109) {
            return null;
        }
        this.offset = i + 1;
        if (isString()) {
            return readString();
        }
        throw new JSONException("reference not support input " + JSONB.typeName(this.type));
    }

    public String readString() {
        Charset charset;
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        this.strtype = b;
        this.strBegin = i2;
        if (b >= 73 && b <= 121) {
            if (b == 121) {
                this.strlen = readLength();
                this.strBegin = this.offset;
            } else {
                this.strlen = b - 73;
            }
            charset = StandardCharsets.ISO_8859_1;
        } else if (b == 122) {
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_8;
        } else if (b == 123) {
            this.strlen = readLength();
            this.strBegin = this.offset;
            charset = StandardCharsets.UTF_16;
        } else if (b == 124) {
            int length = readLength();
            this.strlen = length;
            int i3 = this.offset;
            this.strBegin = i3;
            BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
            if (biFunction != null && !JDKUtils.BIG_ENDIAN) {
                byte[] bArr2 = new byte[length];
                System.arraycopy(this.bytes, i3, bArr2, 0, length);
                String strApply = biFunction.apply(bArr2, JDKUtils.UTF16);
                this.offset += this.strlen;
                return strApply;
            }
            charset = StandardCharsets.UTF_16LE;
        } else {
            if (b != 125) {
                throw new JSONException("readString not support type " + JSONB.typeName(this.strtype) + ", offset " + this.offset + "/" + this.bytes.length);
            }
            int length2 = readLength();
            this.strlen = length2;
            int i4 = this.offset;
            this.strBegin = i4;
            BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
            if (biFunction2 != null && JDKUtils.BIG_ENDIAN) {
                byte[] bArr3 = new byte[length2];
                System.arraycopy(this.bytes, i4, bArr3, 0, length2);
                String strApply2 = biFunction2.apply(bArr3, JDKUtils.UTF16);
                this.offset += this.strlen;
                return strApply2;
            }
            charset = StandardCharsets.UTF_16BE;
        }
        int i5 = this.strlen;
        if (i5 < 0) {
            return this.symbolTable.getName(-i5);
        }
        String str = new String(this.bytes, this.offset, i5, charset);
        this.offset += this.strlen;
        return str;
    }

    public String toString() {
        return this.jsonWriter.toString();
    }

    public JSONBDump(byte[] bArr, SymbolTable symbolTable, boolean z) {
        this.symbols = new HashMap();
        this.bytes = bArr;
        this.raw = z;
        this.symbolTable = symbolTable;
        this.jsonWriter = JSONWriter.ofPretty();
        dumpAny();
    }
}
