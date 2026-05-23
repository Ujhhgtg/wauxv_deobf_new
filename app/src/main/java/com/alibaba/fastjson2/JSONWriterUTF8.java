package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import com.alibaba.fastjson2.util.StringUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import p000.AbstractC2784;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF8 extends JSONWriter {
    static final short QUOTE2_COLON;
    static final short QUOTE_COLON;
    static final long REF;
    private final long byteVectorQuote;
    byte[] bytes;
    final JSONFactory.CacheItem cacheItem;

    static {
        byte[] bArr = {JSONB.Constants.BC_STR_UTF16, 34, 36, 114, 101, 102, 34, 58};
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        REF = unsafe.getLong(bArr, j);
        QUOTE2_COLON = unsafe.getShort(bArr, j + 6);
        bArr[6] = 39;
        QUOTE_COLON = unsafe.getShort(bArr, j + 6);
    }

    public JSONWriterUTF8(JSONWriter.Context context) {
        super(context, null, false, StandardCharsets.UTF_8);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        this.bytes = andSet == null ? new byte[8192] : andSet;
        this.byteVectorQuote = this.useSingleQuote ? -2821266740684990248L : -2459565876494606883L;
    }

    private static long expand(long j) {
        long j2 = (j & (-281470681743361L)) | ((j << 16) & 281470681743360L);
        long j3 = (j2 & (-71776119077928961L)) | ((j2 << 8) & 71776119077928960L);
        return ((j3 & (-1080880403494997761L)) | ((j3 << 4) & 1080880403494997760L)) & 1085102592571150095L;
    }

    private byte[] grow(int i) {
        grow0(i);
        return this.bytes;
    }

    private void grow0(int i) {
        byte[] bArr = this.bytes;
        this.bytes = Arrays.copyOf(bArr, newCapacity(i, bArr.length));
    }

    private byte[] grow1(int i) {
        byte[] bArr = this.bytes;
        return i == bArr.length ? grow(i + 1) : bArr;
    }

    private static long hex8(long j) {
        long jExpand = expand(j);
        long j2 = (434041037028460038L + jExpand) & 1157442765409226768L;
        long j3 = (((j2 << 1) + (j2 >> 1)) - (j2 >> 4)) + 3472328296227680304L + jExpand;
        return !JDKUtils.BIG_ENDIAN ? Long.reverseBytes(j3) : j3;
    }

    private int indent(byte[] bArr, int i) {
        bArr[i] = 10;
        int i2 = i + 1;
        byte b = this.pretty;
        int i3 = (this.level * b) + i2;
        Arrays.fill(bArr, i2, i3, b == 1 ? (byte) 9 : (byte) 32);
        return i3;
    }

    private void writeQuote() {
        writeRaw((byte) this.quote);
    }

    private void writeStringJDK8(String str) {
        JSONWriterUTF8 jSONWriterUTF8;
        char c;
        char[] charArray = JDKUtils.getCharArray(str);
        long j = this.context.features;
        boolean z = true;
        boolean z2 = (JSONWriter.Feature.BrowserSecure.mask & j) != 0;
        if ((j & JSONWriter.Feature.EscapeNoneAscii.mask) == 0) {
            z = false;
        }
        int i = this.off;
        int iM4736 = AbstractC2784.m4736(charArray.length, 3, i, 2);
        if (z || z2) {
            iM4736 += charArray.length * 3;
        }
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        bArrGrow[i] = (byte) this.quote;
        int i2 = 0;
        int i3 = i + 1;
        while (i2 < charArray.length && (c = charArray[i2]) != this.quote && c != '\\' && c >= ' ' && c <= 127 && (!z2 || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArrGrow[i3] = (byte) c;
            i2++;
            i3++;
        }
        if (i2 == charArray.length) {
            bArrGrow[i3] = (byte) this.quote;
            this.off = i3 + 1;
            return;
        }
        this.off = i3;
        if (i2 < charArray.length) {
            jSONWriterUTF8 = this;
            jSONWriterUTF8.writeStringEscapedRest(charArray, charArray.length, z2, z, i2);
        } else {
            jSONWriterUTF8 = this;
        }
        byte[] bArr = jSONWriterUTF8.bytes;
        int i4 = jSONWriterUTF8.off;
        jSONWriterUTF8.off = i4 + 1;
        bArr[i4] = (byte) jSONWriterUTF8.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.bytes;
        if (bArr.length > 8388608) {
            return;
        }
        JSONFactory.BYTES_UPDATER.lazySet(this.cacheItem, bArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void endArray() {
        int i = this.level - 1;
        this.level = i;
        int iIndent = this.off;
        int i2 = iIndent + 1;
        byte b = this.pretty;
        int i3 = i2 + (b == 0 ? 0 : (b * i) + 1);
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        bArrGrow[iIndent] = 93;
        this.off = iIndent + 1;
        this.startObject = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void endObject() {
        int i = this.level - 1;
        this.level = i;
        int iIndent = this.off;
        int i2 = iIndent + 1;
        byte b = this.pretty;
        int i3 = i2 + (b == 0 ? 0 : (b * i) + 1);
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        bArrGrow[iIndent] = JSONB.Constants.BC_STR_UTF16BE;
        this.off = iIndent + 1;
        this.startObject = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final Object ensureCapacity(int i) {
        byte[] bArr = this.bytes;
        if (i < bArr.length) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, newCapacity(i, bArr.length));
        this.bytes = bArrCopyOf;
        return bArrCopyOf;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream) throws IOException {
        int i = this.off;
        if (i > 0) {
            outputStream.write(this.bytes, 0, i);
            this.off = 0;
        }
        return i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes() {
        return Arrays.copyOf(this.bytes, this.off);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int size() {
        return this.off;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void startArray() {
        int i = this.level + 1;
        this.level = i;
        if (i > this.context.maxLevel) {
            overflowLevel();
        }
        int i2 = this.off;
        int i3 = (this.pretty * this.level) + i2 + 3;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        int iIndent = i2 + 1;
        bArrGrow[i2] = 91;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void startObject() {
        int i = this.level + 1;
        this.level = i;
        if (i > this.context.maxLevel) {
            overflowLevel();
        }
        this.startObject = true;
        int i2 = this.off;
        int i3 = (this.pretty * this.level) + i2 + 3;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        int iIndent = i2 + 1;
        bArrGrow[i2] = JSONB.Constants.BC_STR_UTF16;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    public final String toString() {
        return new String(this.bytes, 0, this.off, StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write(Map<?, ?> map) {
        if (this.pretty != 0) {
            super.write(map);
            return;
        }
        if (map == null) {
            writeNull();
            return;
        }
        JSONWriter.Context context = this.context;
        long j = context.features;
        if ((JSONWriter.NONE_DIRECT_FEATURES & j) != 0) {
            context.getObjectWriter(map.getClass()).write(this, map, null, null, 0L);
            return;
        }
        int i = this.off;
        if (i == this.bytes.length) {
            grow(i + 1);
        }
        byte[] bArr = this.bytes;
        int i2 = this.off;
        this.off = i2 + 1;
        bArr[i2] = JSONB.Constants.BC_STR_UTF16;
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (16 & j) != 0) {
                if (!z) {
                    int i3 = this.off;
                    if (i3 == this.bytes.length) {
                        grow0(i3 + 1);
                    }
                    byte[] bArr2 = this.bytes;
                    int i4 = this.off;
                    this.off = i4 + 1;
                    bArr2[i4] = 44;
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    writeString((String) key);
                } else {
                    writeAny(key);
                }
                int i5 = this.off;
                if (i5 == this.bytes.length) {
                    grow0(i5 + 1);
                }
                byte[] bArr3 = this.bytes;
                int i6 = this.off;
                this.off = i6 + 1;
                bArr3[i6] = 58;
                if (value == null) {
                    writeNull();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        writeString((String) value);
                    } else if (cls == Integer.class) {
                        writeInt32((Integer) value);
                    } else if (cls == Long.class) {
                        writeInt64((Long) value);
                    } else if (cls == Boolean.class) {
                        writeBool(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        writeDecimal((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        write((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        write((JSONObject) value);
                    } else {
                        this.context.getObjectWriter(cls, cls).write(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        int i7 = this.off;
        if (i7 == this.bytes.length) {
            grow(i7 + 1);
        }
        byte[] bArr4 = this.bytes;
        int i8 = this.off;
        this.off = i8 + 1;
        bArr4[i8] = JSONB.Constants.BC_STR_UTF16BE;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write0(char c) {
        int i = this.off;
        if (i == this.bytes.length) {
            grow0(i + 1);
        }
        this.bytes[i] = (byte) c;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeBase64(byte[] bArr) {
        int length = (((bArr.length - 1) / 3) + 1) << 2;
        int i = this.off;
        int i2 = length + i + 2;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        int i3 = i + 1;
        bArrGrow[i] = (byte) this.quote;
        int length2 = (bArr.length / 3) * 3;
        int i4 = 0;
        while (i4 < length2) {
            int i5 = i4 + 2;
            int i6 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 += 3;
            int i7 = i6 | (bArr[i5] & 255);
            char[] cArr = JSONFactory.CA;
            bArrGrow[i3] = (byte) cArr[(i7 >>> 18) & 63];
            bArrGrow[i3 + 1] = (byte) cArr[(i7 >>> 12) & 63];
            bArrGrow[i3 + 2] = (byte) cArr[(i7 >>> 6) & 63];
            bArrGrow[i3 + 3] = (byte) cArr[i7 & 63];
            i3 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i8 = ((bArr[length2] & 255) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & 255) << 2 : 0);
            char[] cArr2 = JSONFactory.CA;
            bArrGrow[i3] = (byte) cArr2[i8 >> 12];
            bArrGrow[i3 + 1] = (byte) cArr2[(i8 >>> 6) & 63];
            bArrGrow[i3 + 2] = length3 == 2 ? (byte) cArr2[i8 & 63] : (byte) 61;
            bArrGrow[i3 + 3] = 61;
            i3 += 4;
        }
        bArrGrow[i3] = (byte) this.quote;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeBigInt(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            writeNumberNull(j);
            return;
        }
        if (TypeUtils.isInt64(bigInteger) && j == 0) {
            writeInt64(bigInteger.longValue());
            return;
        }
        String string = bigInteger.toString(10);
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(bigInteger, j | this.context.features);
        int i = this.off;
        int length = string.length();
        int i2 = i + length + (zIsWriteAsString ? 2 : 0);
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        if (zIsWriteAsString) {
            bArrGrow[i] = 34;
            i++;
        }
        string.getBytes(0, length, bArrGrow, i);
        int i3 = i + length;
        if (zIsWriteAsString) {
            bArrGrow[i3] = 34;
            i3++;
        }
        this.off = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z) {
        int iPutBoolean;
        int i = this.off + 5;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        int i2 = this.off;
        if ((this.context.features & 128) != 0) {
            iPutBoolean = i2 + 1;
            bArrGrow[i2] = (byte) (z ? 49 : 48);
        } else {
            iPutBoolean = IOUtils.putBoolean(bArrGrow, i2, z);
        }
        this.off = iPutBoolean;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeChar(char c) {
        int i;
        int i2 = this.off;
        byte[] bArrGrow = this.bytes;
        int i3 = i2 + 8;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        int i4 = i2 + 1;
        char c2 = this.quote;
        bArrGrow[i2] = (byte) c2;
        if (c > 127) {
            if (c >= 55296 && c < 57344) {
                throw new JSONException("illegal char " + c);
            }
            if (c > 2047) {
                bArrGrow[i4] = (byte) (((c >> '\f') & 15) | 224);
                bArrGrow[i2 + 2] = (byte) (((c >> 6) & 63) | 128);
                bArrGrow[i2 + 3] = (byte) ((c & '?') | 128);
                i = i2 + 4;
            } else {
                bArrGrow[i4] = (byte) (((c >> 6) & 31) | Opcodes.CHECKCAST);
                bArrGrow[i2 + 2] = (byte) ((c & '?') | 128);
                i = i2 + 3;
            }
        } else if (c != '\\') {
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 11:
                case Opcodes.DCONST_0 /* 14 */:
                case 15:
                case 16:
                case Opcodes.SIPUSH /* 17 */:
                case Opcodes.LDC /* 18 */:
                case 19:
                case 20:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.DLOAD /* 24 */:
                case Opcodes.ALOAD /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    StringUtils.writeU4Hex2(bArrGrow, i4, c);
                    i = i2 + 7;
                    break;
                case '\b':
                case '\t':
                case '\n':
                case Opcodes.FCONST_1 /* 12 */:
                case '\r':
                    StringUtils.writeEscapedChar(bArrGrow, i4, c);
                    i = i2 + 3;
                    break;
                default:
                    if (c != c2) {
                        i = i2 + 2;
                        bArrGrow[i4] = (byte) c;
                    } else {
                        bArrGrow[i4] = 92;
                        bArrGrow[i2 + 2] = (byte) c2;
                        i = i2 + 3;
                    }
                    break;
            }
        } else {
            StringUtils.writeEscapedChar(bArrGrow, i4, c);
            i = i2 + 3;
        }
        bArrGrow[i] = (byte) this.quote;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeColon() {
        int i = this.off;
        grow1(i)[i] = 58;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeComma() {
        this.startObject = false;
        int i = this.off;
        int i2 = (this.pretty * this.level) + i + 2;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        int iIndent = i + 1;
        bArrGrow[i] = 44;
        if (this.pretty != 0) {
            iIndent = indent(bArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime14(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.off;
        int i8 = i7 + 16;
        byte[] bArrGrow = this.bytes;
        if (i8 > bArrGrow.length) {
            bArrGrow = grow(i8);
        }
        bArrGrow[i7] = (byte) this.quote;
        if (i < 0 || i > 9999) {
            throw JSONWriter.illegalYear(i);
        }
        int i9 = i / 100;
        IOUtils.writeDigitPair(bArrGrow, i7 + 1, i9);
        IOUtils.writeDigitPair(bArrGrow, i7 + 3, i - (i9 * 100));
        IOUtils.writeDigitPair(bArrGrow, i7 + 5, i2);
        IOUtils.writeDigitPair(bArrGrow, i7 + 7, i3);
        IOUtils.writeDigitPair(bArrGrow, i7 + 9, i4);
        IOUtils.writeDigitPair(bArrGrow, i7 + 11, i5);
        IOUtils.writeDigitPair(bArrGrow, i7 + 13, i6);
        bArrGrow[i7 + 15] = (byte) this.quote;
        this.off = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime19(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.off;
        int i8 = i7 + 21;
        byte[] bArrGrow = this.bytes;
        if (i8 > bArrGrow.length) {
            bArrGrow = grow(i8);
        }
        bArrGrow[i7] = (byte) this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i7 + 1, i, i2, i3);
        bArrGrow[iWriteLocalDate] = 32;
        IOUtils.writeLocalTime(bArrGrow, iWriteLocalDate + 1, i4, i5, i6);
        bArrGrow[iWriteLocalDate + 9] = (byte) this.quote;
        this.off = iWriteLocalDate + 10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTimeISO8601(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        if (z) {
            i9 = i8 == 0 ? 1 : 6;
        } else {
            i9 = 0;
        }
        int i10 = this.off;
        int i11 = i10 + 25 + i9;
        byte[] bArrGrow = this.bytes;
        if (i11 > bArrGrow.length) {
            bArrGrow = grow(i11);
        }
        bArrGrow[i10] = (byte) this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i10 + 1, i, i2, i3);
        bArrGrow[iWriteLocalDate] = (byte) (z ? 84 : 32);
        IOUtils.writeLocalTime(bArrGrow, iWriteLocalDate + 1, i4, i5, i6);
        int i12 = iWriteLocalDate + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                IOUtils.putIntLE(bArrGrow, i12, (IOUtils.DIGITS_K_32[i7 & 1023] & (-256)) | 46);
                i12 = iWriteLocalDate + 13;
            } else {
                int i15 = iWriteLocalDate + 10;
                bArrGrow[i12] = 46;
                if (i13 - (i14 * 10) != 0) {
                    IOUtils.writeDigitPair(bArrGrow, i15, i13);
                    i12 = iWriteLocalDate + 12;
                } else {
                    i12 = iWriteLocalDate + 11;
                    bArrGrow[i15] = (byte) (i14 + 48);
                }
            }
        }
        if (z) {
            int i16 = i8 / 3600;
            if (i8 == 0) {
                bArrGrow[i12] = 90;
                i12++;
            } else {
                int iAbs = Math.abs(i16);
                bArrGrow[i12] = i16 >= 0 ? (byte) 43 : (byte) 45;
                IOUtils.writeDigitPair(bArrGrow, i12 + 1, iAbs);
                bArrGrow[i12 + 3] = 58;
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                IOUtils.writeDigitPair(bArrGrow, i12 + 4, i17);
                i12 += 6;
            }
        }
        bArrGrow[i12] = (byte) this.quote;
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD10(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 13;
        byte[] bArrGrow = this.bytes;
        if (i5 > bArrGrow.length) {
            bArrGrow = grow(i5);
        }
        bArrGrow[i4] = (byte) this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i4 + 1, i, i2, i3);
        bArrGrow[iWriteLocalDate] = (byte) this.quote;
        this.off = iWriteLocalDate + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD8(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 10;
        byte[] bArrGrow = this.bytes;
        if (i5 > bArrGrow.length) {
            bArrGrow = grow(i5);
        }
        bArrGrow[i4] = (byte) this.quote;
        if (i < 0 || i > 9999) {
            throw JSONWriter.illegalYear(i);
        }
        int i6 = i / 100;
        IOUtils.writeDigitPair(bArrGrow, i4 + 1, i6);
        IOUtils.writeDigitPair(bArrGrow, i4 + 3, i - (i6 * 100));
        IOUtils.writeDigitPair(bArrGrow, i4 + 5, i2);
        IOUtils.writeDigitPair(bArrGrow, i4 + 7, i3);
        bArrGrow[i4 + 9] = (byte) this.quote;
        this.off = i5;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDecimal(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        String string;
        int length;
        int iScale;
        if (bigDecimal == null) {
            writeDecimalNull();
            return;
        }
        if (decimalFormat != null) {
            writeRaw(decimalFormat.format(bigDecimal));
            return;
        }
        long j2 = j | this.context.features;
        int iPrecision = bigDecimal.precision();
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(bigDecimal, j2);
        int i = this.off;
        int iAbs = Math.abs(bigDecimal.scale()) + i + iPrecision + 7;
        byte[] bArrGrow = this.bytes;
        if (iAbs > bArrGrow.length) {
            bArrGrow = grow(iAbs);
        }
        if (zIsWriteAsString) {
            bArrGrow[i] = 34;
            i++;
        }
        boolean z = (j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0;
        if (iPrecision >= 19 || (iScale = bigDecimal.scale()) < 0) {
            if (z) {
                string = bigDecimal.toPlainString();
            } else {
                string = bigDecimal.toString();
            }
            string.getBytes(0, string.length(), bArrGrow, i);
            length = string.length() + i;
        } else {
            long j3 = JDKUtils.FIELD_DECIMAL_INT_COMPACT_OFFSET;
            if (j3 != -1) {
                long j4 = JDKUtils.UNSAFE.getLong(bigDecimal, j3);
                if (j4 == Long.MIN_VALUE || z) {
                    if (z) {
                        string = bigDecimal.toPlainString();
                    } else {
                        string = bigDecimal.toString();
                    }
                    string.getBytes(0, string.length(), bArrGrow, i);
                    length = string.length() + i;
                } else {
                    length = IOUtils.writeDecimal(bArrGrow, i, j4, iScale);
                }
            } else {
                if (z) {
                    string = bigDecimal.toPlainString();
                } else {
                    string = bigDecimal.toString();
                }
                string.getBytes(0, string.length(), bArrGrow, i);
                length = string.length() + i;
            }
        }
        if (zIsWriteAsString) {
            bArrGrow[length] = 34;
            length++;
        }
        this.off = length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDouble(double d) {
        int i;
        long j = this.context.features;
        boolean z = (256 & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z3 = (!z2 || Double.isFinite(d)) ? z : false;
        int i2 = this.off;
        int i3 = i2 + 26;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        byte[] bArr = bArrGrow;
        if (z3) {
            bArr[i2] = 34;
            i = i2 + 1;
        } else {
            i = i2;
        }
        int iWriteDouble = NumberUtils.writeDouble(bArr, i, d, true, z2);
        if (z3) {
            bArr[iWriteDouble] = 34;
            iWriteDouble++;
        }
        this.off = iWriteDouble;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float f) {
        long j = this.context.features;
        boolean z = (256 & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z3 = (!z2 || Float.isFinite(f)) ? z : false;
        int i = this.off;
        int i2 = i + 17;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        if (z3) {
            bArrGrow[i] = 34;
            i++;
        }
        int iWriteFloat = NumberUtils.writeFloat(bArrGrow, i, f, true, z2);
        if (z3) {
            bArrGrow[iWriteFloat] = 34;
            iWriteFloat++;
        }
        this.off = iWriteFloat;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeHex(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        int length = (bArr.length * 2) + 3;
        int i = this.off;
        int i2 = length + i + 2;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        IOUtils.putShortLE(bArrGrow, i, (short) 10104);
        int i3 = i + 2;
        for (byte b : bArr) {
            IOUtils.putShortLE(bArrGrow, i3, IOUtils.hex2U(b));
            i3 += 2;
        }
        bArrGrow[i3] = 39;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt16(short s) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int i2 = i + 7;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        if (z) {
            bArrGrow[i] = (byte) this.quote;
            i++;
        }
        int iWriteInt16 = IOUtils.writeInt16(bArrGrow, i, s);
        if (z) {
            bArrGrow[iWriteInt16] = (byte) this.quote;
            iWriteInt16++;
        }
        this.off = iWriteInt16;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(int[] iArr) {
        if (iArr == null) {
            writeNull();
            return;
        }
        boolean z = (this.context.features & 256) != 0;
        int i = this.off;
        int iM4736 = AbstractC2784.m4736(iArr.length, 13, i, 2);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int i2 = i + 1;
        bArrGrow[i] = 91;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                bArrGrow[i2] = 44;
                i2++;
            }
            if (z) {
                bArrGrow[i2] = (byte) this.quote;
                i2++;
            }
            int iWriteInt32 = IOUtils.writeInt32(bArrGrow, i2, iArr[i3]);
            if (z) {
                i2 = iWriteInt32 + 1;
                bArrGrow[iWriteInt32] = (byte) this.quote;
            } else {
                i2 = iWriteInt32;
            }
        }
        bArrGrow[i2] = 93;
        this.off = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(long[] jArr) {
        if (jArr == null) {
            writeNull();
            return;
        }
        int i = this.off;
        int length = (jArr.length * 23) + i + 2;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        int iWriteInt64 = i + 1;
        bArrGrow[i] = 91;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                bArrGrow[iWriteInt64] = 44;
                iWriteInt64++;
            }
            long j = jArr[i2];
            boolean zIsWriteAsString = JSONWriter.isWriteAsString(j, this.context.features);
            if (zIsWriteAsString) {
                bArrGrow[iWriteInt64] = (byte) this.quote;
                iWriteInt64++;
            }
            iWriteInt64 = IOUtils.writeInt64(bArrGrow, iWriteInt64, j);
            if (zIsWriteAsString) {
                bArrGrow[iWriteInt64] = (byte) this.quote;
                iWriteInt64++;
            }
        }
        bArrGrow[iWriteInt64] = 93;
        this.off = iWriteInt64 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte b) {
        boolean z = (this.context.features & 256) != 0;
        int i = this.off;
        int i2 = i + 5;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        if (z) {
            bArrGrow[i] = (byte) this.quote;
            i++;
        }
        int iWriteInt8 = IOUtils.writeInt8(bArrGrow, i, b);
        if (z) {
            bArrGrow[iWriteInt8] = (byte) this.quote;
            iWriteInt8++;
        }
        this.off = iWriteInt8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeListInt32(List<Integer> list) {
        if (list == null) {
            writeNull();
            return;
        }
        int size = list.size();
        boolean z = (this.context.features & 256) != 0;
        int i = this.off;
        int i2 = (size * 23) + i + 2;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        int i3 = i + 1;
        bArrGrow[i] = 91;
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 != 0) {
                bArrGrow[i3] = 44;
                i3++;
            }
            Integer num = list.get(i4);
            if (num == null) {
                IOUtils.putNULL(bArrGrow, i3);
                i3 += 4;
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    bArrGrow[i3] = (byte) this.quote;
                    i3++;
                }
                int iWriteInt32 = IOUtils.writeInt32(bArrGrow, i3, iIntValue);
                if (z) {
                    i3 = iWriteInt32 + 1;
                    bArrGrow[iWriteInt32] = (byte) this.quote;
                } else {
                    i3 = iWriteInt32;
                }
            }
        }
        bArrGrow[i3] = 93;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeListInt64(List<Long> list) {
        if (list == null) {
            writeNull();
            return;
        }
        int size = list.size();
        int i = this.off;
        int i2 = (size * 23) + i + 2;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        int iWriteInt64 = i + 1;
        bArrGrow[i] = 91;
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                bArrGrow[iWriteInt64] = 44;
                iWriteInt64++;
            }
            Long l = list.get(i3);
            if (l == null) {
                IOUtils.putNULL(bArrGrow, iWriteInt64);
                iWriteInt64 += 4;
            } else {
                long jLongValue = l.longValue();
                boolean zIsWriteAsString = JSONWriter.isWriteAsString(jLongValue, this.context.features);
                if (zIsWriteAsString) {
                    bArrGrow[iWriteInt64] = (byte) this.quote;
                    iWriteInt64++;
                }
                iWriteInt64 = IOUtils.writeInt64(bArrGrow, iWriteInt64, jLongValue);
                if (zIsWriteAsString) {
                    bArrGrow[iWriteInt64] = (byte) this.quote;
                    iWriteInt64++;
                }
            }
        }
        bArrGrow[iWriteInt64] = 93;
        this.off = iWriteInt64 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            writeNull();
            return;
        }
        if (this.context.dateFormat == null || !writeLocalDateWithFormat(localDate)) {
            int i = this.off;
            int i2 = i + 18;
            byte[] bArrGrow = this.bytes;
            if (i2 > bArrGrow.length) {
                bArrGrow = grow(i2);
            }
            bArrGrow[i] = (byte) this.quote;
            int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            bArrGrow[iWriteLocalDate] = (byte) this.quote;
            this.off = iWriteLocalDate + 1;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalDateTime(LocalDateTime localDateTime) {
        int i = this.off;
        int i2 = i + 38;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        int i3 = i + 1;
        bArrGrow[i] = (byte) this.quote;
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArrGrow[iWriteLocalDate] = 32;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        bArrGrow[iWriteLocalTime] = (byte) this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(LocalTime localTime) {
        int i = this.off;
        int i2 = i + 20;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        bArrGrow[i] = (byte) this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArrGrow, i + 1, localTime);
        bArrGrow[iWriteLocalTime] = (byte) this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName10Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, j3 + j4 + 8, j2);
        this.off = iIndent + 13;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName11Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, j3 + j4 + 8, j2);
        this.off = iIndent + 14;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName12Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, j3 + j4 + 8, j2);
        this.off = iIndent + 15;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName13Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 18;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, j3 + j4 + 8, j2);
        this.off = iIndent + 16;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName14Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 19;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, j3 + j4 + 8, j2);
        bArr[iIndent + 16] = 58;
        this.off = iIndent + 17;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName15Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 20;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, 8 + j3 + j4, j2);
        unsafe.putShort(bArr, j3 + j4 + 16, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 18;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName16Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 21;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        bArr[iIndent] = (byte) this.quote;
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = iIndent + 1;
        unsafe.putLong(bArr, j3 + j4, j);
        unsafe.putLong(bArr, 8 + j3 + j4, j2);
        unsafe.putShort(bArr, j3 + j4 + 16, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 19;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName2Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        this.off = iIndent + 5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName3Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        this.off = iIndent + 6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName4Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        this.off = iIndent + 7;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName5Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        this.off = iIndent + 8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName6Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 11;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        bArr[iIndent + 8] = 58;
        this.off = iIndent + 9;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName7Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 12;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) iIndent), j);
        bArr[iIndent + 8] = (byte) this.quote;
        bArr[iIndent + 9] = 58;
        this.off = iIndent + 10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 13;
        byte[] bArrGrow = this.bytes;
        if (i > bArrGrow.length) {
            bArrGrow = grow(i);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i2) : i2;
        }
        bArr[iIndent] = (byte) this.quote;
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = iIndent;
        unsafe.putLong(bArr, j2 + j3 + 1, j);
        unsafe.putShort(bArr, j2 + j3 + 9, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName9Raw(long j, int i) {
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 14;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        byte[] bArr = bArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i3 = iIndent + 1;
            bArr[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArr, i3) : i3;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j3 = iIndent;
        unsafe.putLong(bArr, j2 + j3, j);
        unsafe.putInt(bArr, j2 + j3 + 8, i);
        this.off = iIndent + 12;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(byte[] bArr) {
        int iIndent = this.off;
        int length = (this.pretty * this.level) + bArr.length + iIndent + 2;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i = iIndent + 1;
            bArrGrow[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArrGrow, i) : i;
        }
        System.arraycopy(bArr, 0, bArrGrow, iIndent, bArr.length);
        this.off = iIndent + bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNull() {
        int i = this.off;
        byte[] bArrGrow = this.bytes;
        int i2 = i + 4;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        IOUtils.putNULL(bArrGrow, i);
        this.off = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetDateTime(OffsetDateTime offsetDateTime) {
        int length;
        if (offsetDateTime == null) {
            writeNull();
            return;
        }
        int i = this.off;
        int i2 = i + 45;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        bArrGrow[i] = (byte) this.quote;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArrGrow[iWriteLocalDate] = 84;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            bArrGrow[iWriteLocalTime] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArrGrow, iWriteLocalTime);
            length = id.length() + iWriteLocalTime;
        }
        bArrGrow[length] = (byte) this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            writeNull();
            return;
        }
        int i = this.off;
        int i2 = i + 28;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        bArrGrow[i] = (byte) this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArrGrow, i + 1, offsetTime.toLocalTime());
        ZoneOffset offset = offsetTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            bArrGrow[iWriteLocalTime] = 90;
        } else {
            String id = offset.getId();
            id.getBytes(0, id.length(), bArrGrow, iWriteLocalTime);
            length = id.length() + iWriteLocalTime;
        }
        bArrGrow[length] = (byte) this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(String str) {
        char[] charArray = JDKUtils.getCharArray(str);
        int i = this.off;
        int length = (charArray.length * 3) + i;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        for (char c : charArray) {
            if (c >= 1 && c <= 127) {
                bArrGrow[i] = (byte) c;
                i++;
            } else if (c > 2047) {
                bArrGrow[i] = (byte) (((c >> '\f') & 15) | 224);
                bArrGrow[i + 1] = (byte) (((c >> 6) & 63) | 128);
                bArrGrow[i + 2] = (byte) ((c & '?') | 128);
                i += 3;
            } else {
                bArrGrow[i] = (byte) (((c >> 6) & 31) | Opcodes.CHECKCAST);
                bArrGrow[i + 1] = (byte) ((c & '?') | 128);
                i += 2;
            }
        }
        this.off = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeReference(String str) {
        this.lastReference = str;
        int i = this.off;
        byte[] bArrGrow = this.bytes;
        int i2 = i + 8;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        JDKUtils.UNSAFE.putLong(bArrGrow, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i), REF);
        this.off = i2;
        writeString(str);
        writeRaw(JSONB.Constants.BC_STR_UTF16BE);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(String[] strArr) {
        if (this.pretty != 0 || strArr == null) {
            super.writeString(strArr);
            return;
        }
        int i = this.off;
        grow1(i)[i] = 91;
        this.off = i + 1;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 != 0) {
                int i3 = this.off;
                grow1(i3)[i3] = 44;
                this.off = i3 + 1;
            }
            writeString(strArr[i2]);
        }
        int i4 = this.off;
        grow1(i4)[i4] = 93;
        this.off = i4 + 1;
    }

    public final void writeStringEscaped(byte[] bArr) {
        int iM4736 = AbstractC2784.m4736(bArr.length, 6, this.off, 2);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        this.off = StringUtils.writeLatin1Escaped(bArrGrow, this.off, bArr, (byte) this.quote, this.context.features);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0031. Please report as an issue. */
    public final void writeStringEscapedRest(char[] cArr, int i, boolean z, boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        int iM4736 = AbstractC2784.m4736(cArr.length - i2, 6, this.off, 2);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int i6 = this.off;
        while (i2 < i) {
            char c = cArr[i2];
            if (c <= 127) {
                if (c != '(' && c != ')' && c != '<' && c != '>') {
                    if (c != '\\') {
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case Opcodes.DCONST_0 /* 14 */:
                            case 15:
                            case 16:
                            case Opcodes.SIPUSH /* 17 */:
                            case Opcodes.LDC /* 18 */:
                            case 19:
                            case 20:
                            case Opcodes.ILOAD /* 21 */:
                            case Opcodes.LLOAD /* 22 */:
                            case Opcodes.FLOAD /* 23 */:
                            case Opcodes.DLOAD /* 24 */:
                            case Opcodes.ALOAD /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                StringUtils.writeU4Hex2(bArrGrow, i6, c);
                                i6 += 6;
                                break;
                            case '\b':
                            case '\t':
                            case '\n':
                            case Opcodes.FCONST_1 /* 12 */:
                            case '\r':
                                StringUtils.writeEscapedChar(bArrGrow, i6, c);
                                break;
                            default:
                                char c2 = this.quote;
                                if (c != c2) {
                                    i5 = i6 + 1;
                                    bArrGrow[i6] = (byte) c;
                                    i6 = i5;
                                } else {
                                    bArrGrow[i6] = 92;
                                    bArrGrow[i6 + 1] = (byte) c2;
                                }
                                break;
                        }
                    } else {
                        StringUtils.writeEscapedChar(bArrGrow, i6, c);
                    }
                    i6 += 2;
                } else if (z) {
                    StringUtils.writeU4HexU(bArrGrow, i6, c);
                    i6 += 6;
                } else {
                    i5 = i6 + 1;
                    bArrGrow[i6] = (byte) c;
                    i6 = i5;
                }
            } else if (z2) {
                StringUtils.writeU4HexU(bArrGrow, i6, c);
                i6 += 6;
            } else if (c >= 55296 && c < 57344) {
                if (c < 56320) {
                    if (cArr.length - i2 < 2) {
                        i4 = -1;
                    } else {
                        char c3 = cArr[i2 + 1];
                        if (c3 < 56320 || c3 >= 57344) {
                            i3 = i6 + 1;
                            bArrGrow[i6] = JSONB.Constants.BC_INT32_BYTE_MAX;
                        } else {
                            i4 = ((c << '\n') + c3) - 56613888;
                        }
                    }
                    if (i4 < 0) {
                        i3 = i6 + 1;
                        bArrGrow[i6] = JSONB.Constants.BC_INT32_BYTE_MAX;
                    } else {
                        bArrGrow[i6] = (byte) ((i4 >> 18) | 240);
                        bArrGrow[i6 + 1] = (byte) (((i4 >> 12) & 63) | 128);
                        bArrGrow[i6 + 2] = (byte) ((63 & (i4 >> 6)) | 128);
                        bArrGrow[i6 + 3] = (byte) ((i4 & 63) | 128);
                        i3 = i6 + 4;
                        i2++;
                    }
                } else {
                    i3 = i6 + 1;
                    bArrGrow[i6] = JSONB.Constants.BC_INT32_BYTE_MAX;
                }
                i6 = i3;
            } else if (c > 2047) {
                bArrGrow[i6] = (byte) (((c >> '\f') & 15) | 224);
                bArrGrow[i6 + 1] = (byte) ((63 & (c >> 6)) | 128);
                bArrGrow[i6 + 2] = (byte) ((c & '?') | 128);
                i6 += 3;
            } else {
                bArrGrow[i6] = (byte) (((c >> 6) & 31) | Opcodes.CHECKCAST);
                bArrGrow[i6 + 1] = (byte) ((c & '?') | 128);
                i6 += 2;
            }
            i2++;
        }
        this.off = i6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeStringLatin1(byte[] bArr) {
        if ((this.context.features & JSONWriter.MASK_BROWSER_SECURE) != 0) {
            writeStringLatin1BrowserSecure(bArr);
            return;
        }
        byte b = (byte) this.quote;
        if (StringUtils.escaped(bArr, b, this.byteVectorQuote)) {
            writeStringEscaped(bArr);
            return;
        }
        int i = this.off;
        int length = bArr.length + i + 2;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        this.off = StringUtils.writeLatin1(bArrGrow, i, bArr, b);
    }

    public final void writeStringLatin1BrowserSecure(byte[] bArr) {
        byte b;
        byte b2 = (byte) this.quote;
        int i = 0;
        while (i < bArr.length && (b = bArr[i]) != b2 && b != 92 && b >= 32 && b != 60 && b != 62 && b != 40 && b != 41) {
            i++;
        }
        int i2 = this.off;
        if (i != bArr.length) {
            writeStringEscaped(bArr);
            return;
        }
        int length = bArr.length + i2 + 2;
        byte[] bArrGrow = this.bytes;
        if (length > bArrGrow.length) {
            bArrGrow = grow(length);
        }
        bArrGrow[i2] = b2;
        System.arraycopy(bArr, 0, bArrGrow, i2 + 1, bArr.length);
        int length2 = bArr.length + 1 + i2;
        bArrGrow[length2] = b2;
        this.off = length2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeStringUTF16(byte[] bArr) {
        if (bArr == null) {
            writeStringNull();
            return;
        }
        int i = this.off;
        byte[] bArrGrow = this.bytes;
        int iM4736 = AbstractC2784.m4736(bArr.length, 6, i, 2);
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        this.off = StringUtils.writeUTF16(bArrGrow, i, bArr, (byte) this.quote, this.context.features);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeTimeHHMMSS8(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 10;
        byte[] bArrGrow = this.bytes;
        if (i5 > bArrGrow.length) {
            bArrGrow = grow(i5);
        }
        bArrGrow[i4] = (byte) this.quote;
        IOUtils.writeLocalTime(bArrGrow, i4 + 1, i, i2, i3);
        bArrGrow[i4 + 9] = (byte) this.quote;
        this.off = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeUUID(UUID uuid) {
        if (uuid == null) {
            writeNull();
            return;
        }
        int i = this.off;
        int i2 = i + 38;
        byte[] bArrGrow = this.bytes;
        if (i2 > bArrGrow.length) {
            bArrGrow = grow(i2);
        }
        byte[] bArr = bArrGrow;
        byte b = (byte) this.quote;
        long j = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putByte(bArr, j, b);
        unsafe.putByte(bArr, 9 + j, (byte) 45);
        unsafe.putByte(bArr, 14 + j, (byte) 45);
        unsafe.putByte(bArr, 19 + j, (byte) 45);
        unsafe.putByte(bArr, 24 + j, (byte) 45);
        unsafe.putByte(bArr, 37 + j, b);
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long jHex8 = hex8(mostSignificantBits >>> 32);
        long jHex9 = hex8(mostSignificantBits);
        unsafe.putLong(bArr, 1 + j, jHex8);
        unsafe.putInt(bArr, 10 + j, (int) jHex9);
        unsafe.putInt(bArr, 15 + j, (int) (jHex9 >>> 32));
        long jHex10 = hex8(leastSignificantBits >>> 32);
        long jHex11 = hex8(leastSignificantBits);
        unsafe.putInt(bArr, 20 + j, (int) jHex10);
        unsafe.putInt(bArr, 25 + j, (int) (jHex10 >>> 32));
        unsafe.putLong(bArr, j + 29, jHex11);
        this.off += 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeZonedDateTime(ZonedDateTime zonedDateTime) {
        char cCharAt;
        int i;
        int i2;
        if (zonedDateTime == null) {
            writeNull();
            return;
        }
        ZoneId zone = zonedDateTime.getZone();
        String id = zone.getId();
        int length = id.length();
        if (ZoneOffset.UTC == zone || (length <= 3 && ("UTC".equals(id) || "Z".equals(id)))) {
            id = "Z";
            cCharAt = 0;
            i = 1;
        } else {
            if (length != 0) {
                cCharAt = id.charAt(0);
                if (cCharAt == '+' || cCharAt == '-') {
                    i = length;
                }
            } else {
                cCharAt = 0;
            }
            i = length + 2;
        }
        int i3 = this.off;
        int i4 = i3 + i + 38;
        byte[] bArrGrow = this.bytes;
        if (i4 > bArrGrow.length) {
            bArrGrow = grow(i4);
        }
        bArrGrow[i3] = (byte) this.quote;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(bArrGrow, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        bArrGrow[iWriteLocalDate] = 84;
        int iWriteLocalTime = IOUtils.writeLocalTime(bArrGrow, iWriteLocalDate + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iWriteLocalTime + 1;
            bArrGrow[iWriteLocalTime] = 90;
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getBytes(0, length, bArrGrow, iWriteLocalTime);
            i2 = iWriteLocalTime + length;
        } else {
            int i5 = iWriteLocalTime + 1;
            bArrGrow[iWriteLocalTime] = 91;
            id.getBytes(0, length, bArrGrow, i5);
            int i6 = i5 + length;
            bArrGrow[i6] = 93;
            i2 = i6 + 1;
        }
        bArrGrow[i2] = (byte) this.quote;
        this.off = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes(Charset charset) {
        return charset == StandardCharsets.UTF_8 ? Arrays.copyOf(this.bytes, this.off) : toString().getBytes(charset);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream, Charset charset) throws IOException {
        boolean zBooleanValue;
        int i = this.off;
        if (i == 0) {
            return 0;
        }
        if (charset != null && charset != StandardCharsets.UTF_8 && charset != StandardCharsets.US_ASCII) {
            if (charset == StandardCharsets.ISO_8859_1) {
                MethodHandle methodHandle = JDKUtils.METHOD_HANDLE_HAS_NEGATIVE;
                if (methodHandle != null) {
                    try {
                        byte[] bArr = this.bytes;
                        zBooleanValue = (Boolean) methodHandle.invoke(bArr, 0, bArr.length).booleanValue();
                    } catch (Throwable unused) {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    int i2 = this.off;
                    outputStream.write(this.bytes, 0, i2);
                    this.off = 0;
                    return i2;
                }
            }
            byte[] bytes = new String(this.bytes, 0, this.off).getBytes(charset);
            outputStream.write(bytes);
            return bytes.length;
        }
        outputStream.write(this.bytes, 0, i);
        this.off = 0;
        return i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        boolean z = (this.context.features & 256) != 0;
        int i = this.off;
        int iM4736 = AbstractC2784.m4736(bArr.length, 5, i, 2);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int i2 = i + 1;
        bArrGrow[i] = 91;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (i3 != 0) {
                bArrGrow[i2] = 44;
                i2++;
            }
            if (z) {
                bArrGrow[i2] = (byte) this.quote;
                i2++;
            }
            int iWriteInt8 = IOUtils.writeInt8(bArrGrow, i2, bArr[i3]);
            if (z) {
                i2 = iWriteInt8 + 1;
                bArrGrow[iWriteInt8] = (byte) this.quote;
            } else {
                i2 = iWriteInt8;
            }
        }
        bArrGrow[i2] = 93;
        this.off = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDouble(double[] dArr) {
        int i;
        int i2;
        if (dArr == null) {
            writeNull();
            return;
        }
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i3 = this.off;
        int iM4736 = AbstractC2784.m4736(dArr.length, 27, i3, 1);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        byte[] bArr = bArrGrow;
        int iWriteDouble = i3 + 1;
        bArr[i3] = 91;
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 != 0) {
                bArr[iWriteDouble] = 44;
                i = iWriteDouble + 1;
            } else {
                i = iWriteDouble;
            }
            if (!Double.isFinite(dArr[i4])) {
                iWriteDouble = NumberUtils.writeDouble(bArr, i, dArr[i4], true, z2);
            } else {
                if (z) {
                    bArr[i] = 34;
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                iWriteDouble = NumberUtils.writeDouble(bArr, i2, dArr[i4], true, false);
                if (z) {
                    bArr[iWriteDouble] = 34;
                    iWriteDouble++;
                }
            }
        }
        bArr[iWriteDouble] = 93;
        this.off = iWriteDouble + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        long j = this.context.features;
        boolean z = (256 & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i = this.off;
        int iM4736 = AbstractC2784.m4736(fArr.length, z ? 16 : 18, i, 1);
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int iWriteFloat = i + 1;
        bArrGrow[i] = 91;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                bArrGrow[iWriteFloat] = 44;
                iWriteFloat++;
            }
            if (!Float.isFinite(fArr[i2])) {
                iWriteFloat = NumberUtils.writeFloat(bArrGrow, iWriteFloat, fArr[i2], true, z2);
            } else {
                if (z) {
                    bArrGrow[iWriteFloat] = 34;
                    iWriteFloat++;
                }
                iWriteFloat = NumberUtils.writeFloat(bArrGrow, iWriteFloat, fArr[i2], true, false);
                if (z) {
                    bArrGrow[iWriteFloat] = 34;
                    iWriteFloat++;
                }
            }
        }
        bArrGrow[iWriteFloat] = 93;
        this.off = iWriteFloat + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(byte[] bArr, int i, int i2) {
        int iIndent = this.off;
        int i3 = (this.pretty * this.level) + iIndent + i2 + 2;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        if (!this.startObject) {
            int i4 = iIndent + 1;
            bArrGrow[iIndent] = 44;
            iIndent = this.pretty != 0 ? indent(bArrGrow, i4) : i4;
        }
        this.startObject = false;
        System.arraycopy(bArr, i, bArrGrow, iIndent, i2);
        this.off = iIndent + i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(Integer num) {
        if (num == null) {
            writeNumberNull();
        } else {
            writeInt32(num.intValue());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(byte[] bArr) {
        int i = this.off;
        int length = bArr.length + i;
        if (length > this.bytes.length) {
            grow(length);
        }
        System.arraycopy(bArr, 0, this.bytes, i, bArr.length);
        this.off = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(long j) {
        int i;
        long j2 = this.context.features;
        int i2 = this.off;
        int i3 = i2 + 23;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(j, j2);
        if (zIsWriteAsString) {
            bArrGrow[i2] = (byte) this.quote;
            i2++;
        }
        int iWriteInt64 = IOUtils.writeInt64(bArrGrow, i2, j);
        if (zIsWriteAsString) {
            i = iWriteInt64 + 1;
            bArrGrow[iWriteInt64] = (byte) this.quote;
        } else {
            if ((512 & j2) != 0 && (j2 & JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iWriteInt64 + 1;
                bArrGrow[iWriteInt64] = 76;
            }
            this.off = iWriteInt64;
        }
        iWriteInt64 = i;
        this.off = iWriteInt64;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(List<String> list) {
        if (this.pretty != 0) {
            super.writeString(list);
            return;
        }
        int i = this.off;
        grow1(i)[i] = 91;
        this.off = i + 1;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                int i3 = this.off;
                grow1(i3)[i3] = 44;
                this.off = i3 + 1;
            }
            String str = list.get(i2);
            if (str == null) {
                writeStringNull();
            } else {
                Function<String, byte[]> function = JDKUtils.STRING_VALUE;
                if (function != null) {
                    byte[] bArrApply = function.apply(str);
                    if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
                        writeStringLatin1(bArrApply);
                    } else {
                        writeStringUTF16(bArrApply);
                    }
                } else {
                    writeStringJDK8(str);
                }
            }
        }
        int i4 = this.off;
        grow1(i4)[i4] = 93;
        this.off = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(int i) {
        boolean z = (this.context.features & 256) != 0;
        int i2 = this.off;
        int i3 = i2 + 13;
        byte[] bArrGrow = this.bytes;
        if (i3 > bArrGrow.length) {
            bArrGrow = grow(i3);
        }
        if (z) {
            bArrGrow[i2] = (byte) this.quote;
            i2++;
        }
        int iWriteInt32 = IOUtils.writeInt32(bArrGrow, i2, i);
        if (z) {
            bArrGrow[iWriteInt32] = (byte) this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(byte b) {
        int i = this.off;
        grow1(i)[i] = b;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c) {
        if (c <= 128) {
            int i = this.off;
            if (i == this.bytes.length) {
                grow0(i + 1);
            }
            byte[] bArr = this.bytes;
            int i2 = this.off;
            this.off = i2 + 1;
            bArr[i2] = (byte) c;
            return;
        }
        throw new JSONException("not support " + c);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr, int i, int i2) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(Long l) {
        if (l == null) {
            writeNumberNull();
        } else {
            writeInt64(l.longValue());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c, char c2) {
        if (c <= 128 && c2 <= 128) {
            int i = this.off;
            byte[] bArrGrow = this.bytes;
            int i2 = i + 2;
            if (i2 > bArrGrow.length) {
                bArrGrow = grow(i2);
            }
            bArrGrow[i] = (byte) c;
            bArrGrow[i + 1] = (byte) c2;
            this.off = i2;
            return;
        }
        throw new JSONException("not support " + c + ", " + c2);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(boolean z) {
        byte b = (byte) this.quote;
        byte[] bArr = this.bytes;
        int i = this.off;
        this.off = i + 1;
        bArr[i] = b;
        writeBool(z);
        byte[] bArr2 = this.bytes;
        int i2 = this.off;
        this.off = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        JSONWriter.Context context = this.context;
        if ((context.features & 67309568) != 0) {
            context.getObjectWriter(list.getClass()).write(this, list, null, null, 0L);
            return;
        }
        int i = this.off;
        if (i == this.bytes.length) {
            grow(i + 1);
        }
        byte[] bArr = this.bytes;
        int i2 = this.off;
        this.off = i2 + 1;
        bArr[i2] = 91;
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.off;
                if (i4 == this.bytes.length) {
                    grow(i4 + 1);
                }
                byte[] bArr2 = this.bytes;
                int i5 = this.off;
                this.off = i5 + 1;
                bArr2[i5] = 44;
            }
            if (obj == null) {
                writeNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == String.class) {
                    writeString((String) obj);
                } else if (cls == Integer.class) {
                    writeInt32((Integer) obj);
                } else if (cls == Long.class) {
                    writeInt64((Long) obj);
                } else if (cls == Boolean.class) {
                    writeBool(((Boolean) obj).booleanValue());
                } else if (cls == BigDecimal.class) {
                    writeDecimal((BigDecimal) obj, 0L, null);
                } else if (cls == JSONArray.class) {
                    write((JSONArray) obj);
                } else if (cls == JSONObject.class) {
                    write((JSONObject) obj);
                } else {
                    this.context.getObjectWriter(cls, cls).write(this, obj, null, null, 0L);
                }
            }
            i3++;
            z = false;
        }
        int i6 = this.off;
        if (i6 == this.bytes.length) {
            grow(i6 + 1);
        }
        byte[] bArr3 = this.bytes;
        int i7 = this.off;
        this.off = i7 + 1;
        bArr3[i7] = 93;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(byte b) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            writeQuote();
        }
        writeInt8(b);
        if (z) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(short s) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            writeQuote();
        }
        writeInt16(s);
        if (z) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(int i) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) == 0;
        if (z) {
            writeQuote();
        }
        writeInt32(i);
        if (z) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(long j) {
        boolean z = (this.context.features & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) == 0;
        if (z) {
            writeQuote();
        }
        writeInt64(j);
        if (z) {
            writeQuote();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        Function<String, byte[]> function = JDKUtils.STRING_VALUE;
        if (function != null) {
            byte[] bArrApply = function.apply(str);
            if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
                writeStringLatin1(bArrApply);
                return;
            } else {
                writeStringUTF16(bArrApply);
                return;
            }
        }
        writeStringJDK8(str);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr) {
        JSONWriterUTF8 jSONWriterUTF8;
        char c;
        if (cArr == null) {
            writeStringNull();
            return;
        }
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i = this.off;
        int iM4736 = AbstractC2784.m4736(cArr.length, 3, i, 2);
        if (z2 || z) {
            iM4736 += cArr.length * 3;
        }
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int i2 = i + 1;
        bArrGrow[i] = (byte) this.quote;
        int i3 = 0;
        while (i3 < cArr.length && (c = cArr[i3]) != this.quote && c != '\\' && c >= ' ' && c <= 127 && (!z || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArrGrow[i2] = (byte) c;
            i3++;
            i2++;
        }
        this.off = i2;
        if (i3 < cArr.length) {
            jSONWriterUTF8 = this;
            jSONWriterUTF8.writeStringEscapedRest(cArr, cArr.length, z, z2, i3);
        } else {
            jSONWriterUTF8 = this;
        }
        byte[] bArr = jSONWriterUTF8.bytes;
        int i4 = jSONWriterUTF8.off;
        jSONWriterUTF8.off = i4 + 1;
        bArr[i4] = (byte) jSONWriterUTF8.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr, int i, int i2) {
        if (cArr == null) {
            if (isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                writeString("");
                return;
            } else {
                writeNull();
                return;
            }
        }
        int i3 = i + i2;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i4 = this.off;
        int i5 = i2 * 3;
        int i6 = i4 + i5 + 2;
        if (z2 || z) {
            i6 += i5;
        }
        byte[] bArrGrow = this.bytes;
        if (i6 > bArrGrow.length) {
            bArrGrow = grow(i6);
        }
        int i7 = i4 + 1;
        bArrGrow[i4] = (byte) this.quote;
        int i8 = i;
        while (i8 < i3) {
            char c = cArr[i8];
            if (c == this.quote || c == '\\' || c < ' ' || c > 127 || (z && (c == '<' || c == '>' || c == '(' || c == ')'))) {
                break;
            }
            bArrGrow[i7] = (byte) c;
            i8++;
            i7++;
        }
        this.off = i7;
        if (i8 < i3) {
            writeStringEscapedRest(cArr, i3, z, z2, i8);
        }
        byte[] bArr = this.bytes;
        int i9 = this.off;
        this.off = i9 + 1;
        bArr[i9] = (byte) this.quote;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr, int i, int i2, boolean z) {
        int i3;
        int i4;
        char c;
        boolean z2 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int iM4736 = AbstractC2784.m4736(cArr.length, 3, this.off, 2);
        if (z2) {
            iM4736 += i2 * 3;
        }
        byte[] bArrGrow = this.bytes;
        if (iM4736 > bArrGrow.length) {
            bArrGrow = grow(iM4736);
        }
        int i5 = this.off;
        if (z) {
            bArrGrow[i5] = (byte) this.quote;
            i5++;
        }
        int i6 = i + i2;
        int i7 = i5;
        int i8 = i;
        while (i8 < i6 && (c = cArr[i8]) != this.quote && c != '\\' && c >= ' ' && c <= 127) {
            bArrGrow[i7] = (byte) c;
            i8++;
            i7++;
        }
        if (i8 == i6) {
            if (z) {
                bArrGrow[i7] = (byte) this.quote;
                i7++;
            }
            this.off = i7;
            return;
        }
        while (i8 < i6) {
            char c2 = cArr[i8];
            if (c2 <= 127) {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case Opcodes.DCONST_0 /* 14 */:
                        case 15:
                        case 16:
                        case Opcodes.SIPUSH /* 17 */:
                        case Opcodes.LDC /* 18 */:
                        case 19:
                        case 20:
                        case Opcodes.ILOAD /* 21 */:
                        case Opcodes.LLOAD /* 22 */:
                        case Opcodes.FLOAD /* 23 */:
                        case Opcodes.DLOAD /* 24 */:
                        case Opcodes.ALOAD /* 25 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            StringUtils.writeU4Hex2(bArrGrow, i7, c2);
                            i7 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case Opcodes.FCONST_1 /* 12 */:
                        case '\r':
                            StringUtils.writeEscapedChar(bArrGrow, i7, c2);
                            i7 += 2;
                            break;
                        default:
                            char c3 = this.quote;
                            if (c2 == c3) {
                                bArrGrow[i7] = 92;
                                bArrGrow[i7 + 1] = (byte) c3;
                                i7 += 2;
                            } else {
                                bArrGrow[i7] = (byte) c2;
                                i7++;
                            }
                            break;
                    }
                } else {
                    StringUtils.writeEscapedChar(bArrGrow, i7, c2);
                    i7 += 2;
                }
            } else if (z2) {
                StringUtils.writeU4HexU(bArrGrow, i7, c2);
                i7 += 6;
            } else if (c2 >= 55296 && c2 < 57344) {
                if (c2 < 56320) {
                    if (cArr.length - i8 < 2) {
                        i4 = -1;
                    } else {
                        char c4 = cArr[i8 + 1];
                        if (c4 < 56320 || c4 >= 57344) {
                            i3 = i7 + 1;
                            bArrGrow[i7] = JSONB.Constants.BC_INT32_BYTE_MAX;
                        } else {
                            i4 = ((c2 << '\n') + c4) - 56613888;
                        }
                    }
                    if (i4 < 0) {
                        i3 = i7 + 1;
                        bArrGrow[i7] = JSONB.Constants.BC_INT32_BYTE_MAX;
                    } else {
                        bArrGrow[i7] = (byte) ((i4 >> 18) | 240);
                        bArrGrow[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
                        bArrGrow[i7 + 2] = (byte) ((63 & (i4 >> 6)) | 128);
                        bArrGrow[i7 + 3] = (byte) ((i4 & 63) | 128);
                        i3 = i7 + 4;
                        i8++;
                    }
                } else {
                    i3 = i7 + 1;
                    bArrGrow[i7] = JSONB.Constants.BC_INT32_BYTE_MAX;
                }
                i7 = i3;
            } else if (c2 > 2047) {
                bArrGrow[i7] = (byte) (((c2 >> '\f') & 15) | 224);
                bArrGrow[i7 + 1] = (byte) ((63 & (c2 >> 6)) | 128);
                bArrGrow[i7 + 2] = (byte) ((c2 & '?') | 128);
                i7 += 3;
            } else {
                bArrGrow[i7] = (byte) (((c2 >> 6) & 31) | Opcodes.CHECKCAST);
                bArrGrow[i7 + 1] = (byte) ((c2 & '?') | 128);
                i7 += 2;
            }
            i8++;
        }
        if (z) {
            bArrGrow[i7] = (byte) this.quote;
            i7++;
        }
        this.off = i7;
    }
}
