package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NumberUtils;
import com.alibaba.fastjson2.util.StringUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
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
import p000.AbstractC1225feyxiexzfUjhhgtg;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONWriterUTF16 extends JSONWriter {
    static final long BYTE_VEC_64_DOUBLE_QUOTE = 9570295239278626L;
    static final long BYTE_VEC_64_SINGLE_QUOTE = 10977691597996071L;
    static final int[] HEX256;
    static final int QUOTE2_COLON;
    static final int QUOTE_COLON;
    static final long REF_0;
    static final long REF_1;
    protected final long byteVectorQuote;
    final JSONFactory.CacheItem cacheItem;
    protected char[] chars;

    static {
        int[] iArr = new int[bc.e];
        int i = 0;
        while (i < 16) {
            short s = (short) (i < 10 ? i + 48 : i + 87);
            int i2 = 0;
            while (i2 < 16) {
                iArr[(i << 4) + i2] = (((short) (i2 < 10 ? i2 + 48 : i2 + 87)) << 16) | s;
                i2++;
            }
            i++;
        }
        if (JDKUtils.BIG_ENDIAN) {
            for (int i3 = 0; i3 < 256; i3++) {
                iArr[i3] = Integer.reverseBytes(iArr[i3] << 8);
            }
        }
        HEX256 = iArr;
        char[] cArr = {'{', '\"', '$', 'r', 'e', 'f', '\"', ':'};
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        REF_0 = unsafe.getLong(cArr, j);
        REF_1 = unsafe.getLong(cArr, 8 + j);
        QUOTE2_COLON = unsafe.getInt(cArr, j + 12);
        cArr[6] = '\'';
        QUOTE_COLON = unsafe.getInt(cArr, j + 12);
    }

    public JSONWriterUTF16(JSONWriter.Context context) {
        super(context, null, false, StandardCharsets.UTF_16);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        this.chars = andSet == null ? new char[8192] : andSet;
        this.byteVectorQuote = this.useSingleQuote ? -2821266740684990248L : -2459565876494606883L;
    }

    public static long expand(long j) {
        return ((j & 4278190080L) << 24) | (255 & j) | ((65280 & j) << 8) | ((16711680 & j) << 16);
    }

    private char[] grow(int i) {
        grow0(i);
        return this.chars;
    }

    private int indent(char[] cArr, int i) {
        cArr[i] = '\n';
        int i2 = i + 1;
        byte b = this.pretty;
        int i3 = (this.level * b) + i2;
        Arrays.fill(cArr, i2, i3, b == 1 ? '\t' : ' ');
        return i3;
    }

    public static void putLong(char[] cArr, int i, int i2, int i3) {
        int[] iArr = HEX256;
        long jReverseBytes = (((long) iArr[i3 & 255]) << 32) | ((long) iArr[i2 & 255]);
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i) << 1);
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes << 8);
        }
        unsafe.putLong(cArr, j, jReverseBytes);
    }

    private void writeQuote() {
        int i = this.off;
        if (i == this.chars.length) {
            grow(i + 1);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        this.off = i2 + 1;
        cArr[i2] = this.quote;
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.chars;
        if (cArr.length > 8388608) {
            return;
        }
        JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, cArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void endArray() {
        int i = this.level - 1;
        this.level = i;
        int iIndent = this.off;
        int i2 = iIndent + 1;
        byte b = this.pretty;
        int i3 = i2 + (b == 0 ? 0 : (b * i) + 1);
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = ']';
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
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        cArrGrow[iIndent] = '}';
        this.off = iIndent + 1;
        this.startObject = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final Object ensureCapacity(int i) {
        char[] cArr = this.chars;
        if (i < cArr.length) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, newCapacity(i, cArr.length));
        this.chars = cArrCopyOf;
        return cArrCopyOf;
    }

    public final void ensureCapacityInternal(int i) {
        if (i > this.chars.length) {
            grow0(i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void flushTo(Writer writer) {
        try {
            int i = this.off;
            if (i > 0) {
                writer.write(this.chars, 0, i);
                this.off = 0;
            }
        } catch (IOException e) {
            throw new JSONException("flushTo error", e);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes() {
        int i = 0;
        while (true) {
            int i2 = this.off;
            if (i >= i2) {
                byte[] bArr = new byte[i2];
                for (int i3 = 0; i3 < this.off; i3++) {
                    bArr[i3] = (byte) this.chars[i3];
                }
                return bArr;
            }
            char[] cArr = this.chars;
            if (cArr[i] >= 128) {
                byte[] bArr2 = new byte[i2 * 3];
                return Arrays.copyOf(bArr2, IOUtils.encodeUTF8(cArr, 0, i2, bArr2, 0));
            }
            i++;
        }
    }

    public final void grow0(int i) {
        char[] cArr = this.chars;
        this.chars = Arrays.copyOf(cArr, newCapacity(i, cArr.length));
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
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        int iIndent = i2 + 1;
        cArrGrow[i2] = '[';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
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
        char[] cArrGrow = this.chars;
        int i3 = (this.pretty * this.level) + i2 + 3;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        int iIndent = i2 + 1;
        cArrGrow[i2] = '{';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    public final String toString() {
        return new String(this.chars, 0, this.off);
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
        if ((context.features & JSONWriter.NONE_DIRECT_FEATURES) != 0) {
            context.getObjectWriter(map.getClass()).write(this, map, null, null, 0L);
            return;
        }
        writeRaw('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (this.context.features & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    writeRaw(',');
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    writeString((String) key);
                } else {
                    writeAny(key);
                }
                writeRaw(':');
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
        writeRaw('}');
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write0(char c) {
        int i = this.off;
        char[] cArrGrow = this.chars;
        if (i == cArrGrow.length) {
            cArrGrow = grow(i + 1);
        }
        cArrGrow[i] = c;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeBase64(byte[] bArr) {
        if (bArr == null) {
            writeArrayNull();
            return;
        }
        int length = (((bArr.length - 1) / 3) + 1) << 2;
        int i = this.off;
        ensureCapacityInternal(length + i + 2);
        char[] cArr = this.chars;
        int i2 = i + 1;
        cArr[i] = this.quote;
        int length2 = (bArr.length / 3) * 3;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 2;
            int i5 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16);
            i3 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            char[] cArr2 = JSONFactory.CA;
            cArr[i2] = cArr2[(i6 >>> 18) & 63];
            cArr[i2 + 1] = cArr2[(i6 >>> 12) & 63];
            cArr[i2 + 2] = cArr2[(i6 >>> 6) & 63];
            cArr[i2 + 3] = cArr2[i6 & 63];
            i2 += 4;
        }
        int length3 = bArr.length - length2;
        if (length3 > 0) {
            int i7 = ((bArr[length2] & 255) << 10) | (length3 == 2 ? (bArr[bArr.length - 1] & 255) << 2 : 0);
            char[] cArr3 = JSONFactory.CA;
            cArr[i2] = cArr3[i7 >> 12];
            cArr[i2 + 1] = cArr3[(i7 >>> 6) & 63];
            cArr[i2 + 2] = length3 == 2 ? cArr3[i7 & 63] : '=';
            cArr[i2 + 3] = '=';
            i2 += 4;
        }
        cArr[i2] = this.quote;
        this.off = i2 + 1;
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
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        if (zIsWriteAsString) {
            cArrGrow[i] = '\"';
            i++;
        }
        string.getChars(0, length, cArrGrow, i);
        int i3 = i + length;
        if (zIsWriteAsString) {
            cArrGrow[i3] = '\"';
            i3++;
        }
        this.off = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z) {
        int i;
        int i2 = this.off + 5;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        int i3 = this.off;
        if ((this.context.features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
            i = i3 + 1;
            cArrGrow[i3] = z ? '1' : '0';
        } else if (z) {
            cArrGrow[i3] = 't';
            cArrGrow[i3 + 1] = 'r';
            cArrGrow[i3 + 2] = 'u';
            cArrGrow[i3 + 3] = 'e';
            i = i3 + 4;
        } else {
            cArrGrow[i3] = 'f';
            cArrGrow[i3 + 1] = 'a';
            cArrGrow[i3 + 2] = 'l';
            cArrGrow[i3 + 3] = 's';
            cArrGrow[i3 + 4] = 'e';
            i = i3 + 5;
        }
        this.off = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeChar(char c) {
        int i;
        int i2 = this.off;
        char[] cArrGrow = this.chars;
        int i3 = i2 + 8;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        int i4 = i2 + 1;
        char c2 = this.quote;
        cArrGrow[i2] = c2;
        if (c == '\"' || c == '\'') {
            if (c == c2) {
                cArrGrow[i4] = '\\';
                i4 = i2 + 2;
            }
            i = i4 + 1;
            cArrGrow[i4] = c;
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
                    cArrGrow[i4] = '\\';
                    cArrGrow[i2 + 2] = 'u';
                    cArrGrow[i2 + 3] = '0';
                    cArrGrow[i2 + 4] = '0';
                    cArrGrow[i2 + 5] = '0';
                    cArrGrow[i2 + 6] = (char) (c + '0');
                    i = i2 + 7;
                    break;
                case '\b':
                case '\t':
                case '\n':
                case Opcodes.FCONST_1 /* 12 */:
                case '\r':
                    StringUtils.writeEscapedChar(cArrGrow, i4, c);
                    i = i2 + 3;
                    break;
                case 11:
                case Opcodes.DCONST_0 /* 14 */:
                case 15:
                    cArrGrow[i4] = '\\';
                    cArrGrow[i2 + 2] = 'u';
                    cArrGrow[i2 + 3] = '0';
                    cArrGrow[i2 + 4] = '0';
                    cArrGrow[i2 + 5] = '0';
                    cArrGrow[i2 + 6] = (char) (c + 'W');
                    i = i2 + 7;
                    break;
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
                    cArrGrow[i4] = '\\';
                    cArrGrow[i2 + 2] = 'u';
                    cArrGrow[i2 + 3] = '0';
                    cArrGrow[i2 + 4] = '0';
                    cArrGrow[i2 + 5] = '1';
                    cArrGrow[i2 + 6] = (char) (c + ' ');
                    i = i2 + 7;
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    cArrGrow[i4] = '\\';
                    cArrGrow[i2 + 2] = 'u';
                    cArrGrow[i2 + 3] = '0';
                    cArrGrow[i2 + 4] = '0';
                    cArrGrow[i2 + 5] = '1';
                    cArrGrow[i2 + 6] = (char) (c + 'G');
                    i = i2 + 7;
                    break;
                default:
                    i = i2 + 2;
                    cArrGrow[i4] = c;
                    break;
            }
        } else {
            StringUtils.writeEscapedChar(cArrGrow, i4, c);
            i = i2 + 3;
        }
        cArrGrow[i] = this.quote;
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeColon() {
        int i = this.off;
        char[] cArrGrow = this.chars;
        if (i == cArrGrow.length) {
            cArrGrow = grow(i + 1);
        }
        cArrGrow[i] = ':';
        this.off = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeComma() {
        this.startObject = false;
        int i = this.off;
        int i2 = (this.pretty * this.level) + i + 2;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        int iIndent = i + 1;
        cArrGrow[i] = ',';
        if (this.pretty != 0) {
            iIndent = indent(cArrGrow, iIndent);
        }
        this.off = iIndent;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime14(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.off;
        int i8 = i7 + 16;
        char[] cArrGrow = this.chars;
        if (i8 > cArrGrow.length) {
            cArrGrow = grow(i8);
        }
        cArrGrow[i7] = this.quote;
        if (i < 0 || i > 9999) {
            throw JSONWriter.illegalYear(i);
        }
        int i9 = i / 100;
        IOUtils.writeDigitPair(cArrGrow, i7 + 1, i9);
        IOUtils.writeDigitPair(cArrGrow, i7 + 3, i - (i9 * 100));
        IOUtils.writeDigitPair(cArrGrow, i7 + 5, i2);
        IOUtils.writeDigitPair(cArrGrow, i7 + 7, i3);
        IOUtils.writeDigitPair(cArrGrow, i7 + 9, i4);
        IOUtils.writeDigitPair(cArrGrow, i7 + 11, i5);
        IOUtils.writeDigitPair(cArrGrow, i7 + 13, i6);
        cArrGrow[i7 + 15] = this.quote;
        this.off = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateTime19(int i, int i2, int i3, int i4, int i5, int i6) {
        char[] cArrGrow = this.chars;
        int i7 = this.off;
        if (i7 + 21 > cArrGrow.length) {
            cArrGrow = grow(i7 + 21);
        }
        int i8 = this.off;
        cArrGrow[i8] = this.quote;
        if (i < 0 || i > 9999) {
            throw JSONWriter.illegalYear(i);
        }
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i8 + 1, i, i2, i3);
        cArrGrow[iWriteLocalDate] = ' ';
        IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, i4, i5, i6);
        cArrGrow[iWriteLocalDate + 9] = this.quote;
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
        char[] cArrGrow = this.chars;
        if (i11 > cArrGrow.length) {
            cArrGrow = grow(i11);
        }
        cArrGrow[i10] = this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i10 + 1, i, i2, i3);
        cArrGrow[iWriteLocalDate] = z ? 'T' : ' ';
        IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, i4, i5, i6);
        int i12 = iWriteLocalDate + 9;
        if (i7 > 0) {
            int i13 = i7 / 10;
            int i14 = i13 / 10;
            if (i7 - (i13 * 10) != 0) {
                IOUtils.putLongLE(cArrGrow, i12, (IOUtils.DIGITS_K_64[i7 & 1023] & (-65536)) | IOUtils.DOT_X0);
                i12 = iWriteLocalDate + 13;
            } else {
                int i15 = iWriteLocalDate + 10;
                cArrGrow[i12] = '.';
                if (i13 - (i14 * 10) != 0) {
                    IOUtils.writeDigitPair(cArrGrow, i15, i13);
                    i12 = iWriteLocalDate + 12;
                } else {
                    i12 = iWriteLocalDate + 11;
                    cArrGrow[i15] = (char) ((byte) (i14 + 48));
                }
            }
        }
        if (z) {
            int i16 = i8 / 3600;
            if (i8 == 0) {
                cArrGrow[i12] = 'Z';
                i12++;
            } else {
                int iAbs = Math.abs(i16);
                cArrGrow[i12] = i16 >= 0 ? '+' : '-';
                IOUtils.writeDigitPair(cArrGrow, i12 + 1, iAbs);
                cArrGrow[i12 + 3] = ':';
                int i17 = (i8 - (i16 * 3600)) / 60;
                if (i17 < 0) {
                    i17 = -i17;
                }
                IOUtils.writeDigitPair(cArrGrow, i12 + 4, i17);
                i12 += 6;
            }
        }
        cArrGrow[i12] = this.quote;
        this.off = i12 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD10(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 13;
        char[] cArrGrow = this.chars;
        if (i5 > cArrGrow.length) {
            cArrGrow = grow(i5);
        }
        cArrGrow[i4] = this.quote;
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i4 + 1, i, i2, i3);
        cArrGrow[iWriteLocalDate] = this.quote;
        this.off = iWriteLocalDate + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDateYYYMMDD8(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 10;
        char[] cArrGrow = this.chars;
        if (i5 > cArrGrow.length) {
            cArrGrow = grow(i5);
        }
        cArrGrow[i4] = this.quote;
        if (i < 0 || i > 9999) {
            throw JSONWriter.illegalYear(i);
        }
        int i6 = i / 100;
        IOUtils.writeDigitPair(cArrGrow, i4 + 1, i6);
        IOUtils.writeDigitPair(cArrGrow, i4 + 3, i - (i6 * 100));
        IOUtils.writeDigitPair(cArrGrow, i4 + 5, i2);
        IOUtils.writeDigitPair(cArrGrow, i4 + 7, i3);
        cArrGrow[i4 + 9] = this.quote;
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
        char[] cArrGrow = this.chars;
        if (iAbs > cArrGrow.length) {
            cArrGrow = grow(iAbs);
        }
        if (zIsWriteAsString) {
            cArrGrow[i] = '\"';
            i++;
        }
        boolean z = (j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0;
        if (iPrecision >= 19 || (iScale = bigDecimal.scale()) < 0) {
            if (z) {
                string = bigDecimal.toPlainString();
            } else {
                string = bigDecimal.toString();
            }
            string.getChars(0, string.length(), cArrGrow, i);
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
                    string.getChars(0, string.length(), cArrGrow, i);
                    length = string.length() + i;
                } else {
                    length = IOUtils.writeDecimal(cArrGrow, i, j4, iScale);
                }
            } else {
                if (z) {
                    string = bigDecimal.toPlainString();
                } else {
                    string = bigDecimal.toString();
                }
                string.getChars(0, string.length(), cArrGrow, i);
                length = string.length() + i;
            }
        }
        if (zIsWriteAsString) {
            cArrGrow[length] = '\"';
            length++;
        }
        this.off = length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDouble(double d) {
        int i;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z3 = (!z2 || Double.isFinite(d)) ? z : false;
        int i2 = this.off;
        int i3 = i2 + 24;
        if (z3) {
            i3 = i2 + 26;
        }
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        char[] cArr = cArrGrow;
        if (z3) {
            cArr[i2] = '\"';
            i = i2 + 1;
        } else {
            i = i2;
        }
        int iWriteDouble = NumberUtils.writeDouble(cArr, i, d, true, z2);
        if (z3) {
            cArr[iWriteDouble] = '\"';
            iWriteDouble++;
        }
        this.off = iWriteDouble;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeDoubleArray(double d, double d2) {
        int i;
        int iWriteDouble;
        int i2;
        int iWriteDouble2;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i3 = this.off;
        int i4 = i3 + 51;
        if (z) {
            i4 = i3 + 55;
        }
        char[] cArrGrow = this.chars;
        if (i4 > cArrGrow.length) {
            cArrGrow = grow(i4);
        }
        char[] cArr = cArrGrow;
        int i5 = i3 + 1;
        cArr[i3] = '[';
        if (Double.isFinite(d)) {
            if (z) {
                cArr[i5] = '\"';
                i = i3 + 2;
            } else {
                i = i5;
            }
            iWriteDouble = NumberUtils.writeDouble(cArr, i, d, true, false);
            if (z) {
                cArr[iWriteDouble] = '\"';
                iWriteDouble++;
            }
        } else {
            iWriteDouble = NumberUtils.writeDouble(cArr, i5, d, true, z2);
        }
        int i6 = iWriteDouble + 1;
        cArr[iWriteDouble] = ',';
        if (Double.isFinite(d2)) {
            if (z) {
                cArr[i6] = '\"';
                i2 = iWriteDouble + 2;
            } else {
                i2 = i6;
            }
            iWriteDouble2 = NumberUtils.writeDouble(cArr, i2, d2, true, false);
            if (z) {
                cArr[iWriteDouble2] = '\"';
                iWriteDouble2++;
            }
        } else {
            iWriteDouble2 = NumberUtils.writeDouble(cArr, i6, d2, true, z2);
        }
        cArr[iWriteDouble2] = ']';
        this.off = iWriteDouble2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float f) {
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        boolean z3 = (!z2 || Float.isFinite(f)) ? z : false;
        int i = this.off;
        int i2 = i + 15;
        if (z3) {
            i2 = i + 17;
        }
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        if (z3) {
            cArrGrow[i] = '\"';
            i++;
        }
        int iWriteFloat = NumberUtils.writeFloat(cArrGrow, i, f, true, z2);
        if (z3) {
            cArrGrow[iWriteFloat] = '\"';
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
        char[] cArrGrow = this.chars;
        int i2 = length + i + 2;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        cArrGrow[i] = 'x';
        cArrGrow[i + 1] = '\'';
        int i3 = i + 2;
        for (byte b : bArr) {
            int i4 = (b & 255) >> 4;
            int i5 = b & ek.m;
            int i6 = 55;
            cArrGrow[i3] = (char) (i4 + (i4 < 10 ? 48 : 55));
            int i7 = i3 + 1;
            if (i5 < 10) {
                i6 = 48;
            }
            cArrGrow[i7] = (char) (i5 + i6);
            i3 += 2;
        }
        cArrGrow[i3] = '\'';
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt16(short s) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int i2 = i + 7;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        if (z) {
            cArrGrow[i] = this.quote;
            i++;
        }
        int iWriteInt16 = IOUtils.writeInt16(cArrGrow, i, s);
        if (z) {
            cArrGrow[iWriteInt16] = this.quote;
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
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(iArr.length, 13, i, 2);
        char[] cArrGrow = this.chars;
        if (iM2691Ujhhgtgfeyxiexzf > cArrGrow.length) {
            cArrGrow = grow(iM2691Ujhhgtgfeyxiexzf);
        }
        int i2 = i + 1;
        cArrGrow[i] = '[';
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                cArrGrow[i2] = ',';
                i2++;
            }
            if (z) {
                cArrGrow[i2] = this.quote;
                i2++;
            }
            int iWriteInt32 = IOUtils.writeInt32(cArrGrow, i2, iArr[i3]);
            if (z) {
                i2 = iWriteInt32 + 1;
                cArrGrow[iWriteInt32] = this.quote;
            } else {
                i2 = iWriteInt32;
            }
        }
        cArrGrow[i2] = ']';
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
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int iWriteInt64 = i + 1;
        cArrGrow[i] = '[';
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (i2 != 0) {
                cArrGrow[iWriteInt64] = ',';
                iWriteInt64++;
            }
            long j = jArr[i2];
            boolean zIsWriteAsString = JSONWriter.isWriteAsString(j, this.context.features);
            if (zIsWriteAsString) {
                cArrGrow[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
            iWriteInt64 = IOUtils.writeInt64(cArrGrow, iWriteInt64, j);
            if (zIsWriteAsString) {
                cArrGrow[iWriteInt64] = this.quote;
                iWriteInt64++;
            }
        }
        cArrGrow[iWriteInt64] = ']';
        this.off = iWriteInt64 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte b) {
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int i2 = i + 7;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        if (z) {
            cArrGrow[i] = this.quote;
            i++;
        }
        int iWriteInt8 = IOUtils.writeInt8(cArrGrow, i, b);
        if (z) {
            cArrGrow[iWriteInt8] = this.quote;
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
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int i2 = (size * 23) + i + 2;
        if (i2 >= this.chars.length) {
            grow0(i2);
        }
        char[] cArr = this.chars;
        int i3 = i + 1;
        cArr[i] = '[';
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 != 0) {
                cArr[i3] = ',';
                i3++;
            }
            Integer num = list.get(i4);
            if (num == null) {
                cArr[i3] = 'n';
                cArr[i3 + 1] = 'u';
                cArr[i3 + 2] = 'l';
                cArr[i3 + 3] = 'l';
                i3 += 4;
            } else {
                int iIntValue = num.intValue();
                if (z) {
                    cArr[i3] = this.quote;
                    i3++;
                }
                int iWriteInt32 = IOUtils.writeInt32(cArr, i3, iIntValue);
                if (z) {
                    i3 = iWriteInt32 + 1;
                    cArr[iWriteInt32] = this.quote;
                } else {
                    i3 = iWriteInt32;
                }
            }
        }
        cArr[i3] = ']';
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
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        int iWriteInt64 = i + 1;
        cArrGrow[i] = '[';
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                cArrGrow[iWriteInt64] = ',';
                iWriteInt64++;
            }
            Long l = list.get(i3);
            if (l == null) {
                cArrGrow[iWriteInt64] = 'n';
                cArrGrow[iWriteInt64 + 1] = 'u';
                cArrGrow[iWriteInt64 + 2] = 'l';
                cArrGrow[iWriteInt64 + 3] = 'l';
                iWriteInt64 += 4;
            } else {
                long jLongValue = l.longValue();
                boolean zIsWriteAsString = JSONWriter.isWriteAsString(jLongValue, this.context.features);
                if (zIsWriteAsString) {
                    cArrGrow[iWriteInt64] = this.quote;
                    iWriteInt64++;
                }
                iWriteInt64 = IOUtils.writeInt64(cArrGrow, iWriteInt64, jLongValue);
                if (zIsWriteAsString) {
                    cArrGrow[iWriteInt64] = this.quote;
                    iWriteInt64++;
                }
            }
        }
        cArrGrow[iWriteInt64] = ']';
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
            char[] cArrGrow = this.chars;
            if (i2 > cArrGrow.length) {
                cArrGrow = grow(i2);
            }
            cArrGrow[i] = this.quote;
            int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            cArrGrow[iWriteLocalDate] = this.quote;
            this.off = iWriteLocalDate + 1;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalDateTime(LocalDateTime localDateTime) {
        int i = this.off;
        int i2 = i + 38;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        int i3 = i + 1;
        cArrGrow[i] = this.quote;
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i3, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = ' ';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        cArrGrow[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(LocalTime localTime) {
        int i = this.off;
        int i2 = i + 20;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        cArrGrow[i] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, i + 1, localTime);
        cArrGrow[iWriteLocalTime] = this.quote;
        this.off = iWriteLocalTime + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName10Raw(long j, long j2) {
        int i;
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 18;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i3 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i3);
            } else {
                i = i3;
            }
            putLong(cArr, i, j, j2);
            this.off = i + 13;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        this.off = i + 13;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName11Raw(long j, long j2) {
        int i;
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 18;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i3 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i3);
            } else {
                i = i3;
            }
            putLong(cArr, i, j, j2);
            this.off = i + 14;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        this.off = i + 14;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName12Raw(long j, long j2) {
        int i;
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 18;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i3 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i3);
            } else {
                i = i3;
            }
            putLong(cArr, i, j, j2);
            this.off = i + 15;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        this.off = i + 15;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName13Raw(long j, long j2) {
        int i;
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 18;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i3 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i3);
            } else {
                i = i3;
            }
            putLong(cArr, i, j, j2);
            this.off = i + 16;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        this.off = i + 16;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName14Raw(long j, long j2) {
        int i;
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 19;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i3 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i3);
            } else {
                i = i3;
            }
            putLong(cArr, i, j, j2);
            int i4 = i;
            cArr[i4 + 16] = ':';
            this.off = i4 + 17;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        int i5 = i;
        cArr[i5 + 16] = ':';
        this.off = i5 + 17;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName15Raw(long j, long j2) {
        int i;
        int i2;
        int iIndent = this.off;
        int i3 = (this.pretty * this.level) + iIndent + 20;
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        char[] cArr = cArrGrow;
        if (!this.startObject) {
            int i4 = iIndent + 1;
            cArr[iIndent] = ',';
            if (this.pretty != 0) {
                iIndent = indent(cArr, i4);
            } else {
                i = i4;
            }
            putLong(cArr, i, j, j2);
            int i5 = i;
            int i6 = i5 + 16;
            if (this.useSingleQuote) {
                i2 = QUOTE_COLON;
            } else {
                i2 = QUOTE2_COLON;
            }
            IOUtils.putIntUnaligned(cArr, i6, i2);
            this.off = i5 + 18;
        }
        this.startObject = false;
        i = iIndent;
        putLong(cArr, i, j, j2);
        int i7 = i;
        int i8 = i7 + 16;
        if (this.useSingleQuote) {
            i2 = QUOTE_COLON;
        } else {
            i2 = QUOTE2_COLON;
        }
        IOUtils.putIntUnaligned(cArr, i8, i2);
        this.off = i7 + 18;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName16Raw(long j, long j2) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 21;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        char[] cArr = cArrGrow;
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArr[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArr, i2) : i2;
        }
        cArr[iIndent] = this.quote;
        putLong(cArr, iIndent + 1, j, j2);
        IOUtils.putIntUnaligned(cArr, iIndent + 17, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 19;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName2Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        this.off = iIndent + 5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName3Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        this.off = iIndent + 6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName4Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        this.off = iIndent + 7;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName5Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 10;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        this.off = iIndent + 8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName6Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 11;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        cArrGrow[iIndent + 8] = ':';
        this.off = iIndent + 9;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName7Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 12;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        putLong(cArrGrow, iIndent, j);
        IOUtils.putIntUnaligned(cArrGrow, iIndent + 8, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 10;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName8Raw(long j) {
        int iIndent = this.off;
        int i = (this.pretty * this.level) + iIndent + 13;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i2 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i2) : i2;
        }
        cArrGrow[iIndent] = this.quote;
        putLong(cArrGrow, iIndent + 1, j);
        IOUtils.putIntUnaligned(cArrGrow, iIndent + 9, this.useSingleQuote ? QUOTE_COLON : QUOTE2_COLON);
        this.off = iIndent + 11;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName9Raw(long j, int i) {
        int iIndent = this.off;
        int i2 = (this.pretty * this.level) + iIndent + 14;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i3 = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i3) : i3;
        }
        putLong(cArrGrow, iIndent, j, i);
        this.off = iIndent + 12;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr) {
        int iIndent = this.off;
        int length = (this.pretty * this.level) + cArr.length + iIndent + 2;
        char[] cArrGrow = this.chars;
        if (length > cArrGrow.length) {
            cArrGrow = grow(length);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            int i = iIndent + 1;
            cArrGrow[iIndent] = ',';
            iIndent = this.pretty != 0 ? indent(cArrGrow, i) : i;
        }
        System.arraycopy(cArr, 0, cArrGrow, iIndent, cArr.length);
        this.off = iIndent + cArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNull() {
        int i = this.off;
        int i2 = i + 4;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        IOUtils.putNULL(cArrGrow, i);
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
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        cArrGrow[i] = this.quote;
        LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, localDateTime.toLocalTime());
        ZoneOffset offset = offsetDateTime.getOffset();
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArrGrow, iWriteLocalTime);
            length = id.length() + iWriteLocalTime;
        }
        cArrGrow[length] = this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(OffsetTime offsetTime) {
        int length;
        if (offsetTime == null) {
            writeNull();
            return;
        }
        ZoneOffset offset = offsetTime.getOffset();
        int i = this.off;
        int i2 = i + 28;
        char[] cArrGrow = this.chars;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        cArrGrow[i] = this.quote;
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, i + 1, offsetTime.toLocalTime());
        if (offset.getTotalSeconds() == 0) {
            length = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else {
            String id = offset.getId();
            id.getChars(0, id.length(), cArrGrow, iWriteLocalTime);
            length = id.length() + iWriteLocalTime;
        }
        cArrGrow[length] = this.quote;
        this.off = length + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(String str) {
        int length = str.length();
        int i = this.off;
        char[] cArrGrow = this.chars;
        int i2 = i + length;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        str.getChars(0, length, cArrGrow, i);
        this.off = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeReference(String str) {
        this.lastReference = str;
        int i = this.off;
        char[] cArrGrow = this.chars;
        int i2 = i + 9;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        char[] cArr = cArrGrow;
        long j = (((long) i) << 1) + JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j, REF_0);
        unsafe.putLong(cArr, j + 8, REF_1);
        this.off = i + 8;
        writeString(str);
        int i3 = this.off;
        char[] cArrGrow2 = this.chars;
        if (i3 == cArrGrow2.length) {
            cArrGrow2 = grow(i3 + 1);
        }
        cArrGrow2[i3] = '}';
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(List<String> list) {
        if (this.pretty != 0) {
            super.writeString(list);
            return;
        }
        int i = this.off;
        if (i == this.chars.length) {
            grow(i + 1);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        this.off = i2 + 1;
        cArr[i2] = '[';
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                int i4 = this.off;
                if (i4 == this.chars.length) {
                    grow(i4 + 1);
                }
                char[] cArr2 = this.chars;
                int i5 = this.off;
                this.off = i5 + 1;
                cArr2[i5] = ',';
            }
            writeString(list.get(i3));
        }
        int i6 = this.off;
        if (i6 == this.chars.length) {
            grow(i6 + 1);
        }
        char[] cArr3 = this.chars;
        int i7 = this.off;
        this.off = i7 + 1;
        cArr3[i7] = ']';
    }

    public final void writeStringBrowserSecure(char[] cArr) {
        int i = 0;
        boolean z = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i2 = this.off;
        int length = cArr.length + i2 + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr2 = this.chars;
        int i3 = i2 + 1;
        cArr2[i2] = this.quote;
        int length2 = cArr.length;
        while (i < length2) {
            char c = IOUtils.getChar(cArr, i);
            if (c == '\\' || c == this.quote || c < ' ' || c == '<' || c == '>' || c == '(' || c == ')' || (z && c > 127)) {
                writeStringEscape(cArr);
                return;
            } else {
                cArr2[i3] = c;
                i++;
                i3++;
            }
        }
        cArr2[i3] = this.quote;
        this.off = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0050. Please report as an issue. */
    public final void writeStringEscape(String str) {
        int i;
        int length = str.length();
        char c = this.quote;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i2 = this.off;
        ensureCapacityInternal(AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(length, 6, i2, 2));
        char[] cArr = this.chars;
        int i3 = i2 + 1;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\"') {
                if (cCharAt == c) {
                    cArr[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr[i3] = cCharAt;
                i3 = i;
            } else if (cCharAt != '<' && cCharAt != '>') {
                if (cCharAt != '\\') {
                    switch (cCharAt) {
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
                            StringUtils.writeU4Hex2(cArr, i3, cCharAt);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case Opcodes.FCONST_1 /* 12 */:
                        case '\r':
                            break;
                        default:
                            switch (cCharAt) {
                                case '\'':
                                    if (cCharAt == c) {
                                        cArr[i3] = '\\';
                                        i3++;
                                    }
                                    i = i3 + 1;
                                    cArr[i3] = cCharAt;
                                    i3 = i;
                                    break;
                                case '(':
                                case ')':
                                    if (z2) {
                                        StringUtils.writeU4HexU(cArr, i3, cCharAt);
                                        i3 += 6;
                                    } else {
                                        i = i3 + 1;
                                        cArr[i3] = cCharAt;
                                        i3 = i;
                                    }
                                    break;
                                default:
                                    if (!z || cCharAt <= 127) {
                                        i = i3 + 1;
                                        cArr[i3] = cCharAt;
                                        i3 = i;
                                    } else {
                                        StringUtils.writeU4HexU(cArr, i3, cCharAt);
                                        i3 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                StringUtils.writeEscapedChar(cArr, i3, cCharAt);
                i3 += 2;
            } else if (z2) {
                StringUtils.writeU4HexU(cArr, i3, cCharAt);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr[i3] = cCharAt;
                i3 = i;
            }
        }
        cArr[i3] = c;
        this.off = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0054. Please report as an issue. */
    public final void writeStringEscapeUTF16(byte[] bArr) {
        int i;
        int length = bArr.length;
        char c = this.quote;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i2 = this.off;
        ensureCapacityInternal(AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(length, 6, i2, 2));
        char[] cArr = this.chars;
        int i3 = i2 + 1;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4 += 2) {
            char c2 = JDKUtils.UNSAFE.getChar(bArr, ((long) Unsafe.ARRAY_BYTE_BASE_OFFSET) + ((long) i4));
            if (c2 == '\"') {
                if (c2 == c) {
                    cArr[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr[i3] = c2;
                i3 = i;
            } else if (c2 != '<' && c2 != '>') {
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
                            StringUtils.writeU4Hex2(cArr, i3, c2);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case Opcodes.FCONST_1 /* 12 */:
                        case '\r':
                            break;
                        default:
                            switch (c2) {
                                case '\'':
                                    if (c2 == c) {
                                        cArr[i3] = '\\';
                                        i3++;
                                    }
                                    i = i3 + 1;
                                    cArr[i3] = c2;
                                    i3 = i;
                                    break;
                                case '(':
                                case ')':
                                    if (z2) {
                                        StringUtils.writeU4HexU(cArr, i3, c2);
                                        i3 += 6;
                                    } else {
                                        i = i3 + 1;
                                        cArr[i3] = c2;
                                        i3 = i;
                                    }
                                    break;
                                default:
                                    if (!z || c2 <= 127) {
                                        i = i3 + 1;
                                        cArr[i3] = c2;
                                        i3 = i;
                                    } else {
                                        StringUtils.writeU4HexU(cArr, i3, c2);
                                        i3 += 6;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                StringUtils.writeEscapedChar(cArr, i3, c2);
                i3 += 2;
            } else if (z2) {
                StringUtils.writeU4HexU(cArr, i3, c2);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr[i3] = c2;
                i3 = i;
            }
        }
        cArr[i3] = c;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] bArr) {
        if ((this.context.features & JSONWriter.MASK_BROWSER_SECURE) != 0) {
            writeStringLatin1BrowserSecure(bArr);
            return;
        }
        int i = this.off;
        char[] cArrGrow = this.chars;
        int length = bArr.length + i + 2;
        if (length >= cArrGrow.length) {
            cArrGrow = grow(length);
        }
        int i2 = i + 1;
        cArrGrow[i] = this.quote;
        long j = this.byteVectorQuote;
        int length2 = bArr.length & (-8);
        int i3 = 0;
        while (i3 < length2) {
            long longLE = IOUtils.getLongLE(bArr, i3);
            if (!StringUtils.noneEscaped(longLE, j)) {
                break;
            }
            IOUtils.putLongLE(cArrGrow, i2, expand(longLE));
            IOUtils.putLongLE(cArrGrow, i2 + 4, expand(longLE >>> 32));
            i2 += 8;
            i3 += 8;
        }
        int i4 = i3;
        while (true) {
            int i5 = i2;
            if (i4 >= bArr.length) {
                cArrGrow[i5] = this.quote;
                this.off = i5 + 1;
                return;
            }
            byte b = bArr[i4];
            if (b == 92 || b == this.quote || b < 32) {
                int length3 = (bArr.length * 5) + length;
                if (length3 >= cArrGrow.length) {
                    cArrGrow = grow(length3);
                }
                this.off = StringUtils.writeLatin1EscapedRest(cArrGrow, i5, bArr, i4, this.quote, this.context.features);
                return;
            }
            i2 = i5 + 1;
            cArrGrow[i5] = (char) b;
            i4++;
        }
    }

    public final void writeStringLatin1BrowserSecure(byte[] bArr) {
        int i = this.off;
        int length = bArr.length + i + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr = this.chars;
        int i2 = i + 1;
        cArr[i] = this.quote;
        int length2 = bArr.length;
        int i3 = 0;
        while (i3 < length2) {
            byte b = bArr[i3];
            if (b == 92 || b == this.quote || b < 32 || b == 60 || b == 62 || b == 40 || b == 41) {
                this.off = i;
                writeStringEscape(bArr);
                return;
            } else {
                cArr[i2] = (char) b;
                i3++;
                i2++;
            }
        }
        cArr[i2] = this.quote;
        this.off = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] bArr) {
        char c;
        if (bArr == null) {
            writeStringNull();
            return;
        }
        long j = 0;
        if ((this.context.features & (JSONWriter.Feature.BrowserSecure.mask | JSONWriter.Feature.EscapeNoneAscii.mask)) != 0) {
            writeStringUTF16BrowserSecure(bArr);
            return;
        }
        int i = this.off;
        int length = bArr.length + i + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        long j2 = this.byteVectorQuote;
        char[] cArr = this.chars;
        int i2 = i + 1;
        cArr[i] = this.quote;
        int length2 = bArr.length >> 1;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 8;
            if (i4 >= length2) {
                int i5 = i3 + 1;
                c = IOUtils.getChar(bArr, i3);
                if (c != '\\') {
                }
                writeStringEscapeUTF16(bArr);
                return;
            }
            long longLE = IOUtils.getLongLE(bArr, i3 << 1);
            long longLE2 = IOUtils.getLongLE(bArr, (i3 + 4) << 1);
            if (((longLE | longLE2) & (-71777214294589696L)) == j && StringUtils.noneEscaped((longLE << 8) | longLE2, j2)) {
                IOUtils.putLongLE(cArr, i2, longLE);
                IOUtils.putLongLE(cArr, i2 + 4, longLE2);
                i2 += 8;
                i3 = i4;
            } else {
                int i6 = i3 + 1;
                c = IOUtils.getChar(bArr, i3);
                if (c != '\\' || c == this.quote || c < ' ') {
                    writeStringEscapeUTF16(bArr);
                    return;
                } else {
                    cArr[i2] = c;
                    i2++;
                    i3 = i6;
                }
            }
            j = 0;
        }
        cArr[i2] = this.quote;
        this.off = i2 + 1;
    }

    public final void writeStringUTF16BrowserSecure(byte[] bArr) {
        int i = 0;
        boolean z = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i2 = this.off;
        int length = bArr.length + i2 + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        char[] cArr = this.chars;
        int i3 = i2 + 1;
        cArr[i2] = this.quote;
        int length2 = bArr.length >> 1;
        while (i < length2) {
            char c = IOUtils.getChar(bArr, i);
            if (c == '\\' || c == this.quote || c < ' ' || c == '<' || c == '>' || c == '(' || c == ')' || (z && c > 127)) {
                writeStringEscapeUTF16(bArr);
                return;
            } else {
                cArr[i3] = c;
                i++;
                i3++;
            }
        }
        cArr[i3] = this.quote;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeTimeHHMMSS8(int i, int i2, int i3) {
        int i4 = this.off;
        int i5 = i4 + 10;
        char[] cArrGrow = this.chars;
        if (i5 > cArrGrow.length) {
            cArrGrow = grow(i5);
        }
        cArrGrow[i4] = (char) ((byte) this.quote);
        IOUtils.writeDigitPair(cArrGrow, i4 + 1, i);
        cArrGrow[i4 + 3] = ':';
        IOUtils.writeDigitPair(cArrGrow, i4 + 4, i2);
        cArrGrow[i4 + 6] = ':';
        IOUtils.writeDigitPair(cArrGrow, i4 + 7, i3);
        cArrGrow[i4 + 9] = (char) ((byte) this.quote);
        this.off = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeUUID(UUID uuid) {
        if (uuid == null) {
            writeNull();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.off + 38;
        char[] cArrGrow = this.chars;
        if (i > cArrGrow.length) {
            cArrGrow = grow(i);
        }
        int i2 = this.off;
        cArrGrow[i2] = '\"';
        putLong(cArrGrow, i2 + 1, (int) (mostSignificantBits >> 56), (int) (mostSignificantBits >> 48));
        putLong(cArrGrow, i2 + 5, (int) (mostSignificantBits >> 40), (int) (mostSignificantBits >> 32));
        cArrGrow[i2 + 9] = '-';
        int i3 = (int) mostSignificantBits;
        putLong(cArrGrow, i2 + 10, i3 >> 24, i3 >> 16);
        cArrGrow[i2 + 14] = '-';
        putLong(cArrGrow, i2 + 15, i3 >> 8, i3);
        cArrGrow[i2 + 19] = '-';
        putLong(cArrGrow, i2 + 20, (int) (leastSignificantBits >> 56), (int) (leastSignificantBits >> 48));
        cArrGrow[i2 + 24] = '-';
        putLong(cArrGrow, i2 + 25, (int) (leastSignificantBits >> 40), (int) (leastSignificantBits >> 32));
        int i4 = (int) leastSignificantBits;
        putLong(cArrGrow, i2 + 29, i4 >> 24, i4 >> 16);
        putLong(cArrGrow, i2 + 33, i4 >> 8, i4);
        cArrGrow[i2 + 37] = '\"';
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
        char[] cArrGrow = this.chars;
        if (i4 > cArrGrow.length) {
            cArrGrow = grow(i4);
        }
        cArrGrow[i3] = this.quote;
        LocalDate localDate = zonedDateTime.toLocalDate();
        int iWriteLocalDate = IOUtils.writeLocalDate(cArrGrow, i3 + 1, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        cArrGrow[iWriteLocalDate] = 'T';
        int iWriteLocalTime = IOUtils.writeLocalTime(cArrGrow, iWriteLocalDate + 1, zonedDateTime.toLocalTime());
        if (i == 1) {
            i2 = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = 'Z';
        } else if (cCharAt == '+' || cCharAt == '-') {
            id.getChars(0, length, cArrGrow, iWriteLocalTime);
            i2 = iWriteLocalTime + length;
        } else {
            int i5 = iWriteLocalTime + 1;
            cArrGrow[iWriteLocalTime] = '[';
            id.getChars(0, length, cArrGrow, i5);
            int i6 = i5 + length;
            cArrGrow[i6] = ']';
            i2 = i6 + 1;
        }
        cArrGrow[i2] = this.quote;
        this.off = i2 + 1;
    }

    private static void putLong(char[] cArr, int i, long j) {
        long j2 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j2, (255 & j) | ((65280 & j) << 8) | ((16711680 & j) << 16) | ((4278190080L & j) << 24));
        unsafe.putLong(cArr, 8 + j2, ((1095216660480L & j) >> 32) | ((280375465082880L & j) >> 24) | ((71776119061217280L & j) >> 16) | ((j & (-72057594037927936L)) >> 8));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new JSONException("out is nulll");
        }
        int i = 0;
        while (true) {
            int i2 = this.off;
            if (i < i2) {
                char[] cArr = this.chars;
                if (cArr[i] >= 128) {
                    byte[] bArr = new byte[i2 * 3];
                    int iEncodeUTF8 = IOUtils.encodeUTF8(cArr, 0, i2, bArr, 0);
                    outputStream.write(bArr, 0, iEncodeUTF8);
                    this.off = 0;
                    return iEncodeUTF8;
                }
                i++;
            } else {
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 < this.off; i3++) {
                    bArr2[i3] = (byte) this.chars[i3];
                }
                outputStream.write(bArr2);
                this.off = 0;
                return i2;
            }
        }
    }

    private static void putLong(char[] cArr, int i, long j, int i2) {
        long j2 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j2, (j & 255) | ((j & 65280) << 8) | ((j & 16711680) << 16) | ((j & 4278190080L) << 24));
        unsafe.putLong(cArr, j2 + 8, ((j & 1095216660480L) >> 32) | ((j & 280375465082880L) >> 24) | ((j & 71776119061217280L) >> 16) | ((j & (-72057594037927936L)) >> 8));
        long j3 = i2;
        unsafe.putLong(cArr, j2 + 16, ((j3 & 4278190080L) << 24) | (j3 & 255) | ((j3 & 65280) << 8) | ((j3 & 16711680) << 16));
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char[] cArr, int i, int i2) {
        int i3 = this.off;
        char[] cArrGrow = this.chars;
        int i4 = i3 + i2;
        if (i4 > cArrGrow.length) {
            cArrGrow = grow(i4);
        }
        System.arraycopy(cArr, i, cArrGrow, i3, i2);
        this.off = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final byte[] getBytes(Charset charset) {
        int i;
        int i2 = 0;
        while (true) {
            i = this.off;
            if (i2 < i) {
                if (this.chars[i2] >= 128) {
                    break;
                }
                i2++;
            } else {
                if (charset != StandardCharsets.UTF_8 && charset != StandardCharsets.ISO_8859_1 && charset != StandardCharsets.US_ASCII) {
                    break;
                }
                byte[] bArr = new byte[i];
                for (int i3 = 0; i3 < this.off; i3++) {
                    bArr[i3] = (byte) this.chars[i3];
                }
                return bArr;
            }
        }
        String str = new String(this.chars, 0, i);
        if (charset == null) {
            charset = StandardCharsets.UTF_8;
        }
        return str.getBytes(charset);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt8(byte[] bArr) {
        if (bArr == null) {
            writeNull();
            return;
        }
        boolean z = (this.context.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.off;
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(bArr.length, 5, i, 2);
        char[] cArrGrow = this.chars;
        if (iM2691Ujhhgtgfeyxiexzf > cArrGrow.length) {
            cArrGrow = grow(iM2691Ujhhgtgfeyxiexzf);
        }
        int i2 = i + 1;
        cArrGrow[i] = '[';
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (i3 != 0) {
                cArrGrow[i2] = ',';
                i2++;
            }
            if (z) {
                cArrGrow[i2] = this.quote;
                i2++;
            }
            int iWriteInt8 = IOUtils.writeInt8(cArrGrow, i2, bArr[i3]);
            if (z) {
                i2 = iWriteInt8 + 1;
                cArrGrow[iWriteInt8] = this.quote;
            } else {
                i2 = iWriteInt8;
            }
        }
        cArrGrow[i2] = ']';
        this.off = i2 + 1;
    }

    private static void putLong(char[] cArr, int i, long j, long j2) {
        long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i) << 1);
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putLong(cArr, j3, (j & 255) | ((j & 65280) << 8) | ((j & 16711680) << 16) | ((j & 4278190080L) << 24));
        unsafe.putLong(cArr, j3 + 8, ((j & 1095216660480L) >> 32) | ((j & 280375465082880L) >> 24) | ((j & 71776119061217280L) >> 16) | ((j & (-72057594037927936L)) >> 8));
        unsafe.putLong(cArr, j3 + 16, (j2 & 255) | ((j2 & 65280) << 8) | ((j2 & 16711680) << 16) | ((j2 & 4278190080L) << 24));
        unsafe.putLong(cArr, j3 + 24, ((j2 & 1095216660480L) >> 32) | ((j2 & 280375465082880L) >> 24) | ((j2 & 71776119061217280L) >> 16) | ((j2 & (-72057594037927936L)) >> 8));
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
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(dArr.length, 27, i3, 1);
        char[] cArrGrow = this.chars;
        if (iM2691Ujhhgtgfeyxiexzf > cArrGrow.length) {
            cArrGrow = grow(iM2691Ujhhgtgfeyxiexzf);
        }
        char[] cArr = cArrGrow;
        int iWriteDouble = i3 + 1;
        cArr[i3] = '[';
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 != 0) {
                cArr[iWriteDouble] = ',';
                i = iWriteDouble + 1;
            } else {
                i = iWriteDouble;
            }
            if (!Double.isFinite(dArr[i4])) {
                iWriteDouble = NumberUtils.writeDouble(cArr, i, dArr[i4], true, z2);
            } else {
                if (z) {
                    cArr[i] = '\"';
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                iWriteDouble = NumberUtils.writeDouble(cArr, i2, dArr[i4], true, false);
                if (z) {
                    cArr[iWriteDouble] = '\"';
                    iWriteDouble++;
                }
            }
        }
        cArr[iWriteDouble] = ']';
        this.off = iWriteDouble + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeFloat(float[] fArr) {
        if (fArr == null) {
            writeArrayNull();
            return;
        }
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.WriteFloatSpecialAsString.mask) != 0;
        int i = this.off;
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(fArr.length, 18, i, 2);
        char[] cArrGrow = this.chars;
        if (iM2691Ujhhgtgfeyxiexzf > cArrGrow.length) {
            cArrGrow = grow(iM2691Ujhhgtgfeyxiexzf);
        }
        int iWriteFloat = i + 1;
        cArrGrow[i] = '[';
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                cArrGrow[iWriteFloat] = ',';
                iWriteFloat++;
            }
            if (!Float.isFinite(fArr[i2])) {
                iWriteFloat = NumberUtils.writeFloat(cArrGrow, iWriteFloat, fArr[i2], true, z2);
            } else {
                if (z) {
                    cArrGrow[iWriteFloat] = '\"';
                    iWriteFloat++;
                }
                iWriteFloat = NumberUtils.writeFloat(cArrGrow, iWriteFloat, fArr[i2], true, false);
                if (z) {
                    cArrGrow[iWriteFloat] = '\"';
                    iWriteFloat++;
                }
            }
        }
        cArrGrow[iWriteFloat] = ']';
        this.off = iWriteFloat + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(char[] cArr, int i, int i2) {
        int i3 = this.off;
        int i4 = (this.pretty * this.level) + i3 + i2 + 2;
        char[] cArrGrow = this.chars;
        if (i4 > cArrGrow.length) {
            cArrGrow = grow(i4);
        }
        if (this.startObject) {
            this.startObject = false;
        } else {
            cArrGrow[i3] = ',';
            i3++;
        }
        System.arraycopy(cArr, i, cArrGrow, i3, i2);
        this.off = i3 + i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c) {
        int i = this.off;
        if (i == this.chars.length) {
            grow0(i + 1);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        this.off = i2 + 1;
        cArr[i2] = c;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.BrowserSecure.mask) != 0;
        char c = this.quote;
        int length = str.length();
        int i = this.off + length + 2;
        if (i >= this.chars.length) {
            grow(i);
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == c || cCharAt < ' ' || ((z2 && (cCharAt == '<' || cCharAt == '>' || cCharAt == '(' || cCharAt == ')')) || (z && cCharAt > 127))) {
                writeStringEscape(str);
                return;
            }
        }
        int i3 = this.off;
        char[] cArr = this.chars;
        int i4 = i3 + 1;
        cArr[i3] = c;
        str.getChars(0, length, cArr, i4);
        int i5 = i4 + length;
        cArr[i5] = c;
        this.off = i5 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt32(int i) {
        boolean z = (this.context.features & 256) != 0;
        int i2 = this.off;
        int i3 = i2 + 13;
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        if (z) {
            cArrGrow[i2] = this.quote;
            i2++;
        }
        int iWriteInt32 = IOUtils.writeInt32(cArrGrow, i2, i);
        if (z) {
            cArrGrow[iWriteInt32] = this.quote;
            iWriteInt32++;
        }
        this.off = iWriteInt32;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final int flushTo(OutputStream outputStream, Charset charset) throws IOException {
        if (this.off == 0) {
            return 0;
        }
        if (outputStream != null) {
            byte[] bytes = getBytes(charset);
            outputStream.write(bytes);
            this.off = 0;
            return bytes.length;
        }
        throw new JSONException("out is null");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeInt64(long j) {
        int i;
        long j2 = this.context.features;
        int i2 = this.off;
        int i3 = i2 + 23;
        char[] cArrGrow = this.chars;
        if (i3 > cArrGrow.length) {
            cArrGrow = grow(i3);
        }
        boolean zIsWriteAsString = JSONWriter.isWriteAsString(j, j2);
        if (zIsWriteAsString) {
            cArrGrow[i2] = this.quote;
            i2++;
        }
        int iWriteInt64 = IOUtils.writeInt64(cArrGrow, i2, j);
        if (zIsWriteAsString) {
            i = iWriteInt64 + 1;
            cArrGrow[iWriteInt64] = this.quote;
        } else {
            if ((512 & j2) != 0 && (j2 & JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = iWriteInt64 + 1;
                cArrGrow[iWriteInt64] = 'L';
            }
            this.off = iWriteInt64;
        }
        iWriteInt64 = i;
        this.off = iWriteInt64;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(char c, char c2) {
        int i = this.off;
        char[] cArrGrow = this.chars;
        int i2 = i + 2;
        if (i2 > cArrGrow.length) {
            cArrGrow = grow(i2);
        }
        cArrGrow[i] = c;
        cArrGrow[i + 1] = c2;
        this.off = i2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x004c. Please report as an issue. */
    public final void writeStringEscape(char[] cArr) {
        int i;
        int length = cArr.length;
        char c = this.quote;
        long j = this.context.features;
        boolean z = (JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i2 = this.off;
        ensureCapacityInternal(AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(length, 6, i2, 2));
        char[] cArr2 = this.chars;
        int i3 = i2 + 1;
        cArr2[i2] = c;
        for (char c2 : cArr) {
            if (c2 == '\"') {
                if (c2 == c) {
                    cArr2[i3] = '\\';
                    i3++;
                }
                i = i3 + 1;
                cArr2[i3] = c2;
                i3 = i;
            } else if (c2 != '<' && c2 != '>') {
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
                            StringUtils.writeU4Hex2(cArr2, i3, c2);
                            i3 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case Opcodes.FCONST_1 /* 12 */:
                        case '\r':
                            break;
                        default:
                            switch (c2) {
                                case '\'':
                                    if (c2 == c) {
                                        cArr2[i3] = '\\';
                                        i3++;
                                    }
                                    i = i3 + 1;
                                    cArr2[i3] = c2;
                                    i3 = i;
                                    break;
                                case '(':
                                case ')':
                                    if (z2) {
                                        StringUtils.writeU4HexU(cArr2, i3, c2);
                                        i3 += 6;
                                    } else {
                                        i = i3 + 1;
                                        cArr2[i3] = c2;
                                        i3 = i;
                                    }
                                    break;
                                default:
                                    if (z && c2 > 127) {
                                        StringUtils.writeU4HexU(cArr2, i3, c2);
                                        i3 += 6;
                                    } else {
                                        i = i3 + 1;
                                        cArr2[i3] = c2;
                                        i3 = i;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                StringUtils.writeEscapedChar(cArr2, i3, c2);
                i3 += 2;
            } else if (z2) {
                StringUtils.writeU4HexU(cArr2, i3, c2);
                i3 += 6;
            } else {
                i = i3 + 1;
                cArr2[i3] = c2;
                i3 = i;
            }
        }
        cArr2[i3] = c;
        this.off = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeNameRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeRaw(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
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
    public final void writeInt64(Long l) {
        if (l == null) {
            writeInt64Null();
        } else {
            writeInt64(l.longValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr, int i, int i2, boolean z) {
        int i3;
        boolean z2 = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        char c = this.quote;
        int i4 = this.off;
        int i5 = (z2 ? i2 * 6 : i2 * 2) + (z ? i4 + 2 : i4);
        char[] cArrGrow = this.chars;
        if (i5 - cArrGrow.length > 0) {
            cArrGrow = grow(i5);
        }
        if (z) {
            cArrGrow[i4] = c;
            i4++;
        }
        int iMin = Math.min(i2 + i, cArr.length);
        while (i < iMin) {
            char c2 = cArr[i];
            if (c2 == '\"' || c2 == '\'') {
                if (c2 == c) {
                    cArrGrow[i4] = '\\';
                    i4++;
                }
                i3 = i4 + 1;
                cArrGrow[i4] = c2;
            } else {
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
                            StringUtils.writeU4Hex2(cArrGrow, i4, c2);
                            i4 += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case Opcodes.FCONST_1 /* 12 */:
                        case '\r':
                            StringUtils.writeEscapedChar(cArrGrow, i4, c2);
                            i4 += 2;
                            break;
                        default:
                            if (z2 && c2 > 127) {
                                StringUtils.writeU4HexU(cArrGrow, i4, c2);
                                i4 += 6;
                            } else {
                                i3 = i4 + 1;
                                cArrGrow[i4] = c2;
                            }
                            break;
                    }
                } else {
                    StringUtils.writeEscapedChar(cArrGrow, i4, c2);
                    i4 += 2;
                }
                i++;
            }
            i4 = i3;
            i++;
        }
        if (z) {
            cArrGrow[i4] = c;
            i4++;
        }
        this.off = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write(List list) {
        if (list == null) {
            writeArrayNull();
            return;
        }
        long j = JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask;
        JSONWriter.Context context = this.context;
        if ((j & context.features) != 0) {
            context.getObjectWriter(list.getClass()).write(this, list, null, null, 0L);
            return;
        }
        int i = this.off;
        if (i == this.chars.length) {
            grow0(i + 1);
        }
        char[] cArr = this.chars;
        int i2 = this.off;
        this.off = i2 + 1;
        cArr[i2] = '[';
        boolean z = true;
        int i3 = 0;
        while (i3 < list.size()) {
            Object obj = list.get(i3);
            if (!z) {
                int i4 = this.off;
                if (i4 == this.chars.length) {
                    grow(i4 + 1);
                }
                char[] cArr2 = this.chars;
                int i5 = this.off;
                this.off = i5 + 1;
                cArr2[i5] = ',';
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
        if (i6 == this.chars.length) {
            grow(i6 + 1);
        }
        char[] cArr3 = this.chars;
        int i7 = this.off;
        this.off = i7 + 1;
        cArr3[i7] = ']';
    }

    public final void writeStringEscape(byte[] bArr) {
        int i = this.off;
        char[] cArrGrow = this.chars;
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(bArr.length, 6, i, 2);
        if (iM2691Ujhhgtgfeyxiexzf >= cArrGrow.length) {
            cArrGrow = grow(iM2691Ujhhgtgfeyxiexzf);
        }
        char[] cArr = cArrGrow;
        char c = this.quote;
        cArr[i] = c;
        this.off = StringUtils.writeLatin1EscapedRest(cArr, i + 1, bArr, 0, c, this.context.features);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(String[] strArr) {
        if (this.pretty == 0 && strArr != null) {
            int i = this.off;
            if (i == this.chars.length) {
                grow(i + 1);
            }
            char[] cArr = this.chars;
            int i2 = this.off;
            this.off = i2 + 1;
            cArr[i2] = '[';
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 != 0) {
                    int i4 = this.off;
                    if (i4 == this.chars.length) {
                        grow(i4 + 1);
                    }
                    char[] cArr2 = this.chars;
                    int i5 = this.off;
                    this.off = i5 + 1;
                    cArr2[i5] = ',';
                }
                writeString(strArr[i3]);
            }
            int i6 = this.off;
            if (i6 == this.chars.length) {
                grow(i6 + 1);
            }
            char[] cArr3 = this.chars;
            int i7 = this.off;
            this.off = i7 + 1;
            cArr3[i7] = ']';
            return;
        }
        super.writeString(strArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(boolean z) {
        char[] cArr = this.chars;
        int i = this.off;
        this.off = i + 1;
        cArr[i] = this.quote;
        writeBool(z);
        char[] cArr2 = this.chars;
        int i2 = this.off;
        this.off = i2 + 1;
        cArr2[i2] = this.quote;
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

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr) {
        char c;
        if (cArr == null) {
            writeStringNull();
            return;
        }
        long j = 0;
        if ((this.context.features & (JSONWriter.Feature.BrowserSecure.mask | JSONWriter.Feature.EscapeNoneAscii.mask)) != 0) {
            writeStringBrowserSecure(cArr);
            return;
        }
        int i = this.off;
        int length = cArr.length + i + 2;
        if (length >= this.chars.length) {
            grow(length);
        }
        long j2 = this.byteVectorQuote;
        char[] cArr2 = this.chars;
        int i2 = i + 1;
        cArr2[i] = this.quote;
        int length2 = cArr.length;
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 8;
            if (i4 < length2) {
                long longLE = IOUtils.getLongLE(cArr, i3);
                long longLE2 = IOUtils.getLongLE(cArr, i3 + 4);
                if (((longLE | longLE2) & (-71777214294589696L)) == j && StringUtils.noneEscaped((longLE << 8) | longLE2, j2)) {
                    IOUtils.putLongLE(cArr2, i2, longLE);
                    IOUtils.putLongLE(cArr2, i2 + 4, longLE2);
                    i2 += 8;
                    i3 = i4;
                } else {
                    int i5 = i3 + 1;
                    c = IOUtils.getChar(cArr, i3);
                    if (c == '\\' && c != this.quote && c >= ' ') {
                        cArr2[i2] = c;
                        i2++;
                        i3 = i5;
                    } else {
                        writeStringEscape(cArr);
                        return;
                    }
                }
            } else {
                int i6 = i3 + 1;
                c = IOUtils.getChar(cArr, i3);
                if (c == '\\') {
                }
                writeStringEscape(cArr);
                return;
            }
            j = 0;
        }
        cArr2[i2] = this.quote;
        this.off = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(char[] cArr, int i, int i2) {
        if (cArr == null) {
            writeStringNull();
            return;
        }
        boolean z = (this.context.features & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        for (int i3 = i; i3 < i2; i3++) {
            char c = cArr[i3];
            if (c == '\\' || c == this.quote || c < ' ') {
                z = true;
                break;
            }
        }
        if (!z) {
            int i4 = this.off;
            int i5 = i4 + i2 + 2;
            char[] cArrGrow = this.chars;
            if (i5 > cArrGrow.length) {
                cArrGrow = grow(i5);
            }
            int i6 = i4 + 1;
            cArrGrow[i4] = this.quote;
            System.arraycopy(cArr, i, cArrGrow, i6, i2);
            int i7 = i6 + i2;
            cArrGrow[i7] = this.quote;
            this.off = i7 + 1;
            return;
        }
        writeStringEscape(new String(cArr, i, i2));
    }
}
