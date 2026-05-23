package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface JSONB {

    /* JADX INFO: compiled from: obf */
    public interface Constants {
        public static final int ARRAY_FIX_LEN = 15;
        public static final byte BC_ARRAY = -92;
        public static final byte BC_ARRAY_FIX_0 = -108;
        public static final byte BC_ARRAY_FIX_MAX = -93;
        public static final byte BC_ARRAY_FIX_MIN = -108;
        public static final byte BC_BIGINT = -69;
        public static final byte BC_BIGINT_LONG = -70;
        public static final byte BC_BINARY = -111;
        public static final byte BC_CHAR = -112;
        public static final byte BC_DECIMAL = -71;
        public static final byte BC_DECIMAL_LONG = -72;
        public static final byte BC_DOUBLE = -75;
        public static final byte BC_DOUBLE_LONG = -76;
        public static final byte BC_DOUBLE_NUM_0 = -78;
        public static final byte BC_DOUBLE_NUM_1 = -77;
        public static final byte BC_FALSE = -80;
        public static final byte BC_FLOAT = -73;
        public static final byte BC_FLOAT_INT = -74;
        public static final byte BC_INT16 = -68;
        public static final byte BC_INT32 = 72;
        public static final byte BC_INT32_BYTE_MAX = 63;
        public static final byte BC_INT32_BYTE_MIN = 48;
        public static final byte BC_INT32_BYTE_ZERO = 56;
        public static final byte BC_INT32_NUM_0 = 0;
        public static final byte BC_INT32_NUM_1 = 1;
        public static final byte BC_INT32_NUM_16 = 16;
        public static final byte BC_INT32_NUM_MAX = 47;
        public static final byte BC_INT32_NUM_MIN = -16;
        public static final byte BC_INT32_SHORT_MAX = 71;
        public static final byte BC_INT32_SHORT_MIN = 64;
        public static final byte BC_INT32_SHORT_ZERO = 68;
        public static final byte BC_INT64 = -66;
        public static final byte BC_INT64_BYTE_MAX = -41;
        public static final byte BC_INT64_BYTE_MIN = -56;
        public static final byte BC_INT64_BYTE_ZERO = -48;
        public static final byte BC_INT64_INT = -65;
        public static final byte BC_INT64_NUM_MAX = -17;
        public static final byte BC_INT64_NUM_MIN = -40;
        public static final byte BC_INT64_SHORT_MAX = -57;
        public static final byte BC_INT64_SHORT_MIN = -64;
        public static final byte BC_INT64_SHORT_ZERO = -60;
        public static final byte BC_INT8 = -67;
        public static final byte BC_LOCAL_DATE = -87;
        public static final byte BC_LOCAL_DATETIME = -88;
        public static final byte BC_LOCAL_TIME = -89;
        public static final byte BC_NULL = -81;
        public static final byte BC_OBJECT = -90;
        public static final byte BC_OBJECT_END = -91;
        public static final byte BC_REFERENCE = -109;
        public static final byte BC_STR_ASCII = 121;
        public static final byte BC_STR_ASCII_FIX_0 = 73;
        public static final byte BC_STR_ASCII_FIX_1 = 74;
        public static final byte BC_STR_ASCII_FIX_32 = 105;
        public static final byte BC_STR_ASCII_FIX_36 = 109;
        public static final byte BC_STR_ASCII_FIX_4 = 77;
        public static final byte BC_STR_ASCII_FIX_5 = 78;
        public static final byte BC_STR_ASCII_FIX_MAX = 120;
        public static final byte BC_STR_ASCII_FIX_MIN = 73;
        public static final byte BC_STR_GB18030 = 126;
        public static final byte BC_STR_UTF16 = 123;
        public static final byte BC_STR_UTF16BE = 125;
        public static final byte BC_STR_UTF16LE = 124;
        public static final byte BC_STR_UTF8 = 122;
        public static final byte BC_SYMBOL = 127;
        public static final byte BC_TIMESTAMP = -82;
        public static final byte BC_TIMESTAMP_MILLIS = -85;
        public static final byte BC_TIMESTAMP_MINUTES = -83;
        public static final byte BC_TIMESTAMP_SECONDS = -84;
        public static final byte BC_TIMESTAMP_WITH_TIMEZONE = -86;
        public static final byte BC_TRUE = -79;
        public static final byte BC_TYPED_ANY = -110;
        public static final int INT32_BYTE_MAX = 2047;
        public static final int INT32_BYTE_MIN = -2048;
        public static final int INT32_SHORT_MAX = 262143;
        public static final int INT32_SHORT_MIN = -262144;
        public static final int INT64_BYTE_MAX = 2047;
        public static final int INT64_BYTE_MIN = -2048;
        public static final int INT64_NUM_HIGH_VALUE = 15;
        public static final int INT64_NUM_LOW_VALUE = -8;
        public static final int INT64_SHORT_MAX = 262143;
        public static final int INT64_SHORT_MIN = -262144;
        public static final int STR_ASCII_FIX_LEN = 47;
    }

    /* JADX INFO: compiled from: obf */
    public interface IO {
        static int checkAndWriteTypeName(byte[] bArr, int i, Object obj, Class<?> cls, JSONWriter jSONWriter) {
            Class<?> cls2;
            long features = jSONWriter.getFeatures();
            return ((JSONWriter.Feature.WriteClassName.mask & features) == 0 || obj == null || (cls2 = obj.getClass()) == cls || ((JSONWriter.Feature.NotWriteHashMapArrayListClassName.mask & features) != 0 && (cls2 == HashMap.class || cls2 == ArrayList.class)) || ((features & JSONWriter.Feature.NotWriteRootClassName.mask) != 0 && obj == jSONWriter.rootObject)) ? i : writeTypeName(bArr, i, TypeUtils.getTypeName(cls2), jSONWriter);
        }

        static int enumCapacity(Enum r4, long j) {
            if ((24576 & j) != 0) {
                return stringCapacity((j & JSONWriter.Feature.WriteEnumUsingToString.mask) != 0 ? r4.toString() : r4.name());
            }
            return 5;
        }

        static int int64Capacity(Collection<Long> collection) {
            if (collection == null) {
                return 1;
            }
            return (collection.size() * 9) + stringCapacity(collection.getClass().getName()) + 7;
        }

        static int putStringSizeLarge(byte[] bArr, int i, int i2) {
            if (i2 <= 262143) {
                IOUtils.putIntBE(bArr, i, i2 + 2034499584);
                return i + 4;
            }
            IOUtils.putShortBE(bArr, i, (short) 31048);
            IOUtils.putIntBE(bArr, i + 2, i2);
            return i + 6;
        }

        static int putStringSizeSmall(byte[] bArr, int i, int i2) {
            bArr[i] = 121;
            IOUtils.putShortBE(bArr, i + 1, (short) (i2 + 14336));
            return i + 3;
        }

        static int sizeOfInt(int i) {
            if (i >= -16 && i <= 47) {
                return 1;
            }
            if (i < -2048 || i > 2047) {
                return (i < -262144 || i > 262143) ? 5 : 3;
            }
            return 2;
        }

        static int startArray(byte[] bArr, int i, int i2) {
            boolean z = i2 <= 15;
            int i3 = i + 1;
            bArr[i] = z ? (byte) (i2 - 108) : -92;
            return !z ? writeInt32(bArr, i3, i2) : i3;
        }

        static int stringCapacity(Collection<String> collection) {
            if (collection == null) {
                return 1;
            }
            int iStringCapacity = stringCapacity(collection.getClass().getName()) + 7;
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                iStringCapacity += stringCapacity(it.next());
            }
            return iStringCapacity;
        }

        static int writeBoolean(byte[] bArr, int i, Boolean bool) {
            byte b;
            if (bool == null) {
                b = -81;
            } else {
                b = bool.booleanValue() ? -79 : -80;
            }
            bArr[i] = b;
            return i + 1;
        }

        static int writeDouble(byte[] bArr, int i, Double d, long j) {
            if (d != null) {
                return writeDouble(bArr, i, d.doubleValue());
            }
            long j2 = j & 16777280;
            byte b = -78;
            bArr[i] = j2 == 0 ? (byte) -81 : (byte) -78;
            if (j2 == 0) {
                b = -81;
            }
            bArr[i] = b;
            return i + 1;
        }

        static int writeEnum(byte[] bArr, int i, Enum r6, long j) {
            if ((24576 & j) != 0) {
                return writeString(bArr, i, (j & JSONWriter.Feature.WriteEnumUsingToString.mask) != 0 ? r6.toString() : r6.name());
            }
            return writeInt32(bArr, i, r6.ordinal());
        }

        static int writeFloat(byte[] bArr, int i, Float f, long j) {
            float fFloatValue;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                if ((j & 16777280) == 0) {
                    bArr[i] = -81;
                    return i + 1;
                }
                fFloatValue = 0.0f;
            }
            return writeFloat(bArr, i, fFloatValue);
        }

        static int writeInstant(byte[] bArr, int i, Instant instant) {
            if (instant == null) {
                bArr[i] = -81;
                return i + 1;
            }
            bArr[i] = -82;
            return writeInt32(bArr, writeInt64(bArr, i + 1, instant.getEpochSecond()), instant.getNano());
        }

        static int writeInt16(byte[] bArr, int i, Short sh, long j) {
            if (sh == null) {
                bArr[i] = (j & 16777280) == 0 ? -81 : (byte) 0;
                return i + 1;
            }
            bArr[i] = -68;
            IOUtils.putShortBE(bArr, i + 1, sh.shortValue());
            return i + 3;
        }

        static int writeInt32(byte[] bArr, int i, Integer num, long j) {
            if (num != null) {
                return writeInt32(bArr, i, num.intValue());
            }
            bArr[i] = (j & 16777280) == 0 ? -81 : (byte) 0;
            return i + 1;
        }

        static int writeInt64(byte[] bArr, int i, Collection<Long> collection, long j) {
            if (collection == null) {
                bArr[i] = (j & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, collection.size());
            Iterator<Long> it = collection.iterator();
            while (it.hasNext()) {
                iStartArray = writeInt64(bArr, iStartArray, it.next(), j);
            }
            return iStartArray;
        }

        static int writeInt8(byte[] bArr, int i, Byte b, long j) {
            if (b == null) {
                bArr[i] = (j & 16777280) == 0 ? -81 : (byte) 0;
                return i + 1;
            }
            IOUtils.putShortLE(bArr, i, (short) ((b.byteValue() << 8) | 189));
            return i + 2;
        }

        static int writeLocalDate(byte[] bArr, int i, LocalDate localDate) {
            if (localDate == null) {
                bArr[i] = -81;
                return i + 1;
            }
            bArr[i] = -87;
            IOUtils.putIntBE(bArr, i + 1, localDate.getDayOfMonth() | (localDate.getYear() << 16) | (localDate.getMonthValue() << 8));
            return i + 5;
        }

        static int writeLocalDateTime(byte[] bArr, int i, LocalDateTime localDateTime) {
            if (localDateTime == null) {
                bArr[i] = -81;
                return i + 1;
            }
            IOUtils.putIntBE(bArr, i, (localDateTime.getYear() << 8) | (-1476395008) | localDateTime.getMonthValue());
            IOUtils.putIntBE(bArr, i + 4, (localDateTime.getDayOfMonth() << 24) | (localDateTime.getHour() << 16) | (localDateTime.getMinute() << 8) | localDateTime.getSecond());
            return writeInt32(bArr, i + 8, localDateTime.getNano());
        }

        static int writeLocalTime(byte[] bArr, int i, LocalTime localTime) {
            if (localTime == null) {
                bArr[i] = -81;
                return i + 1;
            }
            IOUtils.putIntBE(bArr, i, (localTime.getHour() << 16) | (-1493172224) | (localTime.getMinute() << 8) | localTime.getSecond());
            return writeInt32(bArr, i + 4, localTime.getNano());
        }

        static int writeNameRaw(byte[] bArr, int i, byte[] bArr2, long j, JSONWriter jSONWriter) {
            boolean z;
            int iPutIfAbsent;
            int ordinalByHashCode;
            SymbolTable symbolTable = jSONWriter.symbolTable;
            JSONWriterJSONB jSONWriterJSONB = (JSONWriterJSONB) jSONWriter;
            if (symbolTable == null || (ordinalByHashCode = symbolTable.getOrdinalByHashCode(j)) == -1) {
                if ((jSONWriter.context.features & JSONWriter.Feature.WriteNameAsSymbol.mask) == 0) {
                    System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                    return i + bArr2.length;
                }
                TLongIntHashMap tLongIntHashMap = jSONWriterJSONB.symbols;
                if (tLongIntHashMap != null) {
                    iPutIfAbsent = tLongIntHashMap.putIfAbsent(j, jSONWriterJSONB.symbolIndex);
                    int i2 = jSONWriterJSONB.symbolIndex;
                    z = true;
                    if (iPutIfAbsent == i2) {
                        jSONWriterJSONB.symbolIndex = i2 + 1;
                        z = false;
                    }
                } else {
                    TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap();
                    jSONWriterJSONB.symbols = tLongIntHashMap2;
                    int i3 = jSONWriterJSONB.symbolIndex;
                    jSONWriterJSONB.symbolIndex = i3 + 1;
                    tLongIntHashMap2.put(j, i3);
                    z = false;
                    iPutIfAbsent = i3;
                }
                if (!z) {
                    int i4 = i + 1;
                    bArr[i] = 127;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    if (iPutIfAbsent < -16 || iPutIfAbsent > 47) {
                        return writeInt32(bArr, length, iPutIfAbsent);
                    }
                    int i5 = length + 1;
                    bArr[length] = (byte) iPutIfAbsent;
                    return i5;
                }
                ordinalByHashCode = -iPutIfAbsent;
            }
            int i6 = i + 1;
            bArr[i] = 127;
            int i7 = -ordinalByHashCode;
            if (i7 < -16 || i7 > 47) {
                return writeInt32(bArr, i6, i7);
            }
            int i8 = i + 2;
            bArr[i6] = (byte) i7;
            return i8;
        }

        static int writeOffsetDateTime(byte[] bArr, int i, OffsetDateTime offsetDateTime) {
            if (offsetDateTime == null) {
                bArr[i] = -81;
            } else {
                IOUtils.putIntBE(bArr, i, (offsetDateTime.getYear() << 8) | (-1442840576) | offsetDateTime.getMonthValue());
                IOUtils.putIntBE(bArr, i + 4, (offsetDateTime.getDayOfMonth() << 24) | (offsetDateTime.getHour() << 16) | (offsetDateTime.getMinute() << 8) | offsetDateTime.getSecond());
                int iWriteInt32 = writeInt32(bArr, i + 8, offsetDateTime.getNano());
                String id = offsetDateTime.getOffset().getId();
                int length = id.length();
                bArr[iWriteInt32] = (byte) (length + 73);
                id.getBytes(0, length, bArr, iWriteInt32 + 1);
                i = iWriteInt32 + length;
            }
            return i + 1;
        }

        static int writeOffsetTime(byte[] bArr, int i, OffsetTime offsetTime) {
            if (offsetTime == null) {
                bArr[i] = -81;
            } else {
                IOUtils.putIntBE(bArr, i, -1442336255);
                IOUtils.putIntBE(bArr, i + 4, (offsetTime.getHour() << 16) | 16777216 | (offsetTime.getMinute() << 8) | offsetTime.getSecond());
                int iWriteInt32 = writeInt32(bArr, i + 8, offsetTime.getNano());
                String id = offsetTime.getOffset().getId();
                int length = id.length();
                bArr[iWriteInt32] = (byte) (length + 73);
                id.getBytes(0, length, bArr, iWriteInt32 + 1);
                i = iWriteInt32 + length;
            }
            return i + 1;
        }

        static int writeReference(byte[] bArr, int i, String str, JSONWriter jSONWriter) {
            if (jSONWriter.lastReference == str) {
                str = "#-1";
            } else {
                jSONWriter.lastReference = str;
            }
            bArr[i] = -109;
            return writeString(bArr, i + 1, str);
        }

        static int writeString(byte[] bArr, int i, Collection<String> collection, long j) {
            if (collection == null) {
                bArr[i] = (j & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, collection.size());
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                iStartArray = writeString(bArr, iStartArray, it.next());
            }
            return iStartArray;
        }

        static int writeStringLatin1(byte[] bArr, int i, byte[] bArr2) {
            int iPutStringSizeSmall;
            int length = bArr2.length;
            if (length <= 47) {
                iPutStringSizeSmall = i + 1;
                bArr[i] = (byte) (length + 73);
            } else {
                iPutStringSizeSmall = length <= 2047 ? putStringSizeSmall(bArr, i, length) : putStringSizeLarge(bArr, i, length);
            }
            System.arraycopy(bArr2, 0, bArr, iPutStringSizeSmall, bArr2.length);
            return iPutStringSizeSmall + length;
        }

        static int writeStringUTF16(byte[] bArr, int i, byte[] bArr2) {
            int length = bArr2.length;
            bArr[i] = JDKUtils.BIG_ENDIAN ? 125 : 124;
            int iWriteInt32 = writeInt32(bArr, i + 1, length);
            System.arraycopy(bArr2, 0, bArr, iWriteInt32, length);
            return iWriteInt32 + length;
        }

        static int writeSymbol(byte[] bArr, int i, String str, SymbolTable symbolTable) {
            if (str == null) {
                bArr[i] = -81;
                return i + 1;
            }
            int ordinal = symbolTable.getOrdinal(str);
            if (ordinal < 0) {
                return writeString(bArr, i, str);
            }
            bArr[i] = 121;
            return writeInt32(bArr, i + 1, -ordinal);
        }

        static int writeTypeName(byte[] bArr, int i, String str, JSONWriter jSONWriter) {
            int ordinalByHashCode;
            TLongIntHashMap tLongIntHashMap;
            JSONWriterJSONB jSONWriterJSONB = (JSONWriterJSONB) jSONWriter;
            SymbolTable symbolTable = jSONWriter.symbolTable;
            int i2 = i + 1;
            bArr[i] = -110;
            long jHashCode64 = Fnv.hashCode64(str);
            if (symbolTable != null) {
                ordinalByHashCode = symbolTable.getOrdinalByHashCode(jHashCode64);
                if (ordinalByHashCode == -1 && (tLongIntHashMap = jSONWriterJSONB.symbols) != null) {
                    ordinalByHashCode = tLongIntHashMap.get(jHashCode64);
                }
            } else {
                TLongIntHashMap tLongIntHashMap2 = jSONWriterJSONB.symbols;
                ordinalByHashCode = tLongIntHashMap2 != null ? tLongIntHashMap2.get(jHashCode64) : -1;
            }
            if (ordinalByHashCode != -1) {
                return writeInt32(bArr, i2, ordinalByHashCode);
            }
            if (jSONWriterJSONB.symbols == null) {
                jSONWriterJSONB.symbols = new TLongIntHashMap();
            }
            TLongIntHashMap tLongIntHashMap3 = jSONWriterJSONB.symbols;
            int i3 = jSONWriterJSONB.symbolIndex;
            jSONWriterJSONB.symbolIndex = i3 + 1;
            tLongIntHashMap3.put(jHashCode64, i3);
            return writeInt32(bArr, writeString(bArr, i2, str), i3);
        }

        static int writeUTF8(byte[] bArr, int i, char[] cArr, int i2, int i3) {
            int iSizeOfInt = sizeOfInt(i3 * 3);
            int i4 = i + iSizeOfInt + 1;
            int iEncodeUTF8 = ((IOUtils.encodeUTF8(cArr, i2, i3, bArr, i4) - i) - iSizeOfInt) - 1;
            int iSizeOfInt2 = sizeOfInt(iEncodeUTF8);
            if (iSizeOfInt != iSizeOfInt2) {
                System.arraycopy(bArr, i4, bArr, iSizeOfInt2 + i + 1, iEncodeUTF8);
            }
            bArr[i] = 122;
            return writeInt32(bArr, i + 1, iEncodeUTF8) + iEncodeUTF8;
        }

        static int writeUUID(byte[] bArr, int i, UUID uuid) {
            if (uuid == null) {
                bArr[i] = -81;
                return i + 1;
            }
            IOUtils.putShortLE(bArr, i, (short) 4241);
            IOUtils.putLongBE(bArr, i + 2, uuid.getMostSignificantBits());
            IOUtils.putLongBE(bArr, i + 10, uuid.getLeastSignificantBits());
            return i + 18;
        }

        static int writeBoolean(byte[] bArr, int i, boolean z) {
            bArr[i] = z ? -79 : -80;
            return i + 1;
        }

        static int writeBoolean(byte[] bArr, int i, boolean[] zArr) {
            if (zArr == null) {
                bArr[i] = -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, zArr.length);
            for (int i2 = 0; i2 < zArr.length; i2++) {
                bArr[iStartArray + i2] = zArr[i2] ? -79 : -80;
            }
            return iStartArray + zArr.length;
        }

        static int writeInt32(byte[] bArr, int i, int i2) {
            if (((i2 + 16) & (-64)) == 0) {
                int i3 = i + 1;
                bArr[i] = (byte) i2;
                return i3;
            }
            if (((i2 + 2048) & (-4096)) == 0) {
                IOUtils.putShortBE(bArr, i, (short) (i2 + 14336));
                return i + 2;
            }
            if (((262144 + i2) & (-524288)) == 0) {
                bArr[i] = (byte) ((i2 >> 16) + 68);
                IOUtils.putShortBE(bArr, i + 1, (short) i2);
                return i + 3;
            }
            bArr[i] = 72;
            IOUtils.putIntBE(bArr, i + 1, i2);
            return i + 5;
        }

        static int writeInt8(byte[] bArr, int i, byte b) {
            IOUtils.putShortLE(bArr, i, (short) ((b << 8) | 189));
            return i + 2;
        }

        static int stringCapacity(String[] strArr) {
            if (strArr == null) {
                return 1;
            }
            int iStringCapacity = 6;
            for (String str : strArr) {
                iStringCapacity += stringCapacity(str);
            }
            return iStringCapacity;
        }

        static int writeDouble(byte[] bArr, int i, double d) {
            if (d != 0.0d && d != 1.0d) {
                if (d >= -2.147483648E9 && d <= 2.147483647E9d) {
                    long j = (long) d;
                    if (j == d) {
                        bArr[i] = -76;
                        return writeInt64(bArr, i + 1, j);
                    }
                }
                bArr[i] = -75;
                IOUtils.putLongBE(bArr, i + 1, Double.doubleToLongBits(d));
                return i + 9;
            }
            bArr[i] = d == 0.0d ? -78 : -77;
            return i + 1;
        }

        static int writeFloat(byte[] bArr, int i, float[] fArr) {
            if (fArr == null) {
                bArr[i] = -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, fArr.length);
            for (float f : fArr) {
                iStartArray = writeFloat(bArr, iStartArray, f);
            }
            return iStartArray;
        }

        static int writeInt16(byte[] bArr, int i, short s) {
            bArr[i] = -68;
            IOUtils.putShortBE(bArr, i + 1, s);
            return i + 3;
        }

        static int stringCapacity(String str) {
            if (str == null) {
                return 0;
            }
            int length = str.length();
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            return (toIntFunction == null || JDKUtils.STRING_VALUE == null) ? (length * 3) + 6 : (length << toIntFunction.applyAsInt(str)) + 6;
        }

        static int writeInt64(byte[] bArr, int i, Long l, long j) {
            if (l == null) {
                bArr[i] = (j & 16777280) == 0 ? -81 : (byte) -32;
                return i + 1;
            }
            return writeInt64(bArr, i, l.longValue());
        }

        static int writeString(byte[] bArr, int i, String[] strArr, long j) {
            if (strArr == null) {
                bArr[i] = (j & JSONWriter.WRITE_ARRAY_NULL_MASK) != 0 ? (byte) -108 : -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, strArr.length);
            for (String str : strArr) {
                iStartArray = writeString(bArr, iStartArray, str);
            }
            return iStartArray;
        }

        static int writeStringLatin1(byte[] bArr, int i, char[] cArr, int i2, int i3) {
            int iWriteInt32;
            if (i3 <= 47) {
                iWriteInt32 = i + 1;
                bArr[i] = (byte) (i3 + 73);
            } else {
                bArr[i] = 121;
                if (i3 <= 2047) {
                    IOUtils.putShortBE(bArr, i + 1, (short) (i3 + 14336));
                    iWriteInt32 = i + 3;
                } else {
                    iWriteInt32 = writeInt32(bArr, i + 1, i3);
                }
            }
            int i4 = 0;
            while (i4 < i3) {
                bArr[iWriteInt32] = (byte) cArr[i2 + i4];
                i4++;
                iWriteInt32++;
            }
            return iWriteInt32;
        }

        static int writeSymbol(byte[] bArr, int i, int i2) {
            int i3 = i + 1;
            bArr[i] = 127;
            if (i2 >= -16 && i2 <= 47) {
                int i4 = i + 2;
                bArr[i3] = (byte) i2;
                return i4;
            }
            if (i2 >= -2048 && i2 <= 2047) {
                IOUtils.putShortBE(bArr, i3, (short) (i2 + 14336));
                return i + 3;
            }
            return writeInt32(bArr, i3, i2);
        }

        static int writeFloat(byte[] bArr, int i, float f) {
            int i2 = (int) f;
            if (i2 == f && ((262144 + i2) & (-524288)) == 0) {
                bArr[i] = -74;
                return writeInt32(bArr, i + 1, i2);
            }
            bArr[i] = -73;
            IOUtils.putIntBE(bArr, i + 1, Float.floatToIntBits(f));
            return i + 5;
        }

        static int writeInt64(byte[] bArr, int i, long j) {
            if (j >= -8 && j <= 15) {
                int i2 = i + 1;
                bArr[i] = (byte) (j - 32);
                return i2;
            }
            if (((2048L + j) & (-4096)) == 0) {
                IOUtils.putShortBE(bArr, i, (short) (j - 12288));
                return i + 2;
            }
            if (((262144 + j) & (-524288)) == 0) {
                bArr[i] = (byte) ((j >> 16) - 60);
                IOUtils.putShortBE(bArr, i + 1, (short) j);
                return i + 3;
            }
            if (((2147483648L + j) & (-4294967296L)) == 0) {
                bArr[i] = -65;
                IOUtils.putIntBE(bArr, i + 1, (int) j);
                return i + 5;
            }
            bArr[i] = -66;
            IOUtils.putLongBE(bArr, i + 1, j);
            return i + 9;
        }

        static int writeDouble(byte[] bArr, int i, double[] dArr) {
            if (dArr == null) {
                bArr[i] = -81;
                return i + 1;
            }
            int iStartArray = startArray(bArr, i, dArr.length);
            for (double d : dArr) {
                iStartArray = writeDouble(bArr, iStartArray, d);
            }
            return iStartArray;
        }

        static int writeString(byte[] bArr, int i, String str) {
            Function<String, byte[]> function;
            if (str == null) {
                bArr[i] = -81;
                return i + 1;
            }
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            if (toIntFunction != null && (function = JDKUtils.STRING_VALUE) != null) {
                int iApplyAsInt = toIntFunction.applyAsInt(str);
                byte[] bArrApply = function.apply(str);
                if (iApplyAsInt == 0) {
                    return writeStringLatin1(bArr, i, bArrApply);
                }
                return writeStringUTF16(bArr, i, bArrApply);
            }
            return writeString(bArr, i, JDKUtils.getCharArray(str));
        }

        static int writeString(byte[] bArr, int i, char[] cArr) {
            return writeString(bArr, i, cArr, 0, cArr.length);
        }

        static int writeString(byte[] bArr, int i, char[] cArr, int i2, int i3) {
            boolean zIsLatin1;
            if (i3 < 47) {
                int i4 = i + 1;
                bArr[i] = (byte) (i3 + 73);
                int i5 = i2 + i3;
                int i6 = i2;
                while (true) {
                    if (i6 >= i5) {
                        zIsLatin1 = true;
                        break;
                    }
                    char c = cArr[i6];
                    if (c > 255) {
                        zIsLatin1 = false;
                        break;
                    }
                    bArr[i4] = (byte) c;
                    i6++;
                    i4++;
                }
                if (zIsLatin1) {
                    return i4;
                }
            } else {
                zIsLatin1 = IOUtils.isLatin1(cArr, i2, i3);
            }
            if (zIsLatin1) {
                return writeStringLatin1(bArr, i, cArr, i2, i3);
            }
            return writeUTF8(bArr, i, cArr, i2, i3);
        }
    }

    static <T> T copy(T t, JSONWriter.Feature... featureArr) {
        return (T) JSON.copy(t, featureArr);
    }

    static void dump(byte[] bArr) {
        System.out.println(toJSONString(bArr, true));
    }

    static byte[] fromJSONBytes(byte[] bArr) {
        JSONReader jSONReaderOf = JSONReader.of(bArr);
        return toBytes(jSONReaderOf.getObjectReader(Object.class).readObject(jSONReaderOf, null, null, 0L));
    }

    static byte[] fromJSONString(String str) {
        return toBytes(JSON.parse(str));
    }

    static boolean isInt32(int i) {
        return i >= -16 && i <= 72;
    }

    static boolean isInt32Byte(int i) {
        return (i & 240) == 48;
    }

    static boolean isInt32ByteValue(int i) {
        return ((i + 2048) & (-4096)) != 0;
    }

    static boolean isInt32ByteValue1(int i) {
        return i >= -2048 && i <= 2047;
    }

    static boolean isInt32Num(int i) {
        return i >= -16 && i <= 47;
    }

    static boolean isInt32Short(int i) {
        return (i & 248) == 64;
    }

    static boolean isInt64Byte(int i) {
        return ((i + 56) & 240) == 0;
    }

    static boolean isInt64Num(int i) {
        return i >= -40 && i <= -17;
    }

    static boolean isInt64Short(int i) {
        return (i & 248) == 192;
    }

    static Object parse(byte[] bArr, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONArray parseArray(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            JSONArray jSONArray = (JSONArray) jSONReaderJSONB.readArray();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONArray);
            }
            jSONReaderJSONB.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static SymbolTable symbolTable(String... strArr) {
        return new SymbolTable(strArr);
    }

    static byte[] toBytes(boolean z) {
        return new byte[]{z ? -79 : -80};
    }

    static String toJSONString(byte[] bArr) {
        return new JSONBDump(bArr, false).toString();
    }

    static String typeName(byte b) {
        if (b == 72) {
            return AbstractC1194.m2781(72, new StringBuilder("INT32 "));
        }
        if (b == 127) {
            return AbstractC1194.m2781(127, new StringBuilder("SYMBOL "));
        }
        switch (b) {
            case -111:
                return AbstractC1194.m2781(-111, new StringBuilder("BINARY "));
            case -110:
                return AbstractC1194.m2781(-110, new StringBuilder("TYPED_ANY "));
            case -109:
                return AbstractC1194.m2781(-109, new StringBuilder("REFERENCE "));
            default:
                switch (b) {
                    case -91:
                        return AbstractC1194.m2781(-91, new StringBuilder("OBJECT_END "));
                    case -90:
                        return AbstractC1194.m2781(-90, new StringBuilder("OBJECT "));
                    case -89:
                        return AbstractC1194.m2781(-89, new StringBuilder("LOCAL_TIME "));
                    case -88:
                        return AbstractC1194.m2781(-88, new StringBuilder("LOCAL_DATETIME "));
                    case -87:
                        return AbstractC1194.m2781(-87, new StringBuilder("LOCAL_DATE "));
                    case -86:
                        return AbstractC1194.m2781(-86, new StringBuilder("TIMESTAMP_WITH_TIMEZONE "));
                    case -85:
                        return AbstractC1194.m2781(-85, new StringBuilder("TIMESTAMP_MILLIS "));
                    case -84:
                        return AbstractC1194.m2781(-84, new StringBuilder("TIMESTAMP_SECONDS "));
                    case -83:
                        return AbstractC1194.m2781(-83, new StringBuilder("TIMESTAMP_MINUTES "));
                    case -82:
                        return AbstractC1194.m2781(-82, new StringBuilder("TIMESTAMP "));
                    case -81:
                        return AbstractC1194.m2781(-81, new StringBuilder("NULL "));
                    case -80:
                        return AbstractC1194.m2781(-80, new StringBuilder("FALSE "));
                    case -79:
                        return AbstractC1194.m2781(-79, new StringBuilder("TRUE "));
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return AbstractC1194.m2781(b, new StringBuilder("DOUBLE "));
                    case -74:
                    case -73:
                        return AbstractC1194.m2781(b, new StringBuilder("FLOAT "));
                    case -72:
                    case -71:
                        return AbstractC1194.m2781(b, new StringBuilder("DECIMAL "));
                    case -70:
                    case -69:
                        return AbstractC1194.m2781(b, new StringBuilder("BIGINT "));
                    case -68:
                        return AbstractC1194.m2781(-68, new StringBuilder("INT16 "));
                    case -67:
                        return AbstractC1194.m2781(-67, new StringBuilder("INT8 "));
                    case -66:
                    case -65:
                        return AbstractC1194.m2781(b, new StringBuilder("INT64 "));
                    default:
                        switch (b) {
                            case 122:
                                return AbstractC1194.m2781(122, new StringBuilder("STR_UTF8 "));
                            case 123 /* 123 */:
                                return AbstractC1194.m2781(123, new StringBuilder("STR_UTF16 "));
                            case 124 /* 124 */:
                                return AbstractC1194.m2781(124, new StringBuilder("STR_UTF16LE "));
                            case 125 /* 125 */:
                                return AbstractC1194.m2781(125, new StringBuilder("STR_UTF16BE "));
                            default:
                                if (b >= -108 && b <= -92) {
                                    return AbstractC1194.m2781(b, new StringBuilder("ARRAY "));
                                }
                                if (b >= 73 && b <= 121) {
                                    return AbstractC1194.m2781(b, new StringBuilder("STR_ASCII "));
                                }
                                if (b >= -16 && b <= 47) {
                                    return AbstractC1194.m2781(b, new StringBuilder("INT32 "));
                                }
                                if (b >= 48 && b <= 63) {
                                    return AbstractC1194.m2781(b, new StringBuilder("INT32 "));
                                }
                                if (b >= 64 && b <= 71) {
                                    return AbstractC1194.m2781(b, new StringBuilder("INT32 "));
                                }
                                if (b >= -40 && b <= -17) {
                                    return AbstractC1194.m2781(b, new StringBuilder("INT64 "));
                                }
                                if (b < -56 || b > -41) {
                                    return (b < -64 || b > -57) ? Integer.toString(b) : AbstractC1194.m2781(b, new StringBuilder("INT64 "));
                                }
                                return AbstractC1194.m2781(b, new StringBuilder("INT64 "));
                        }
                }
        }
    }

    static int writeTo(OutputStream outputStream, Object obj, JSONWriter.Feature... featureArr) {
        try {
            JSONWriter jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
            try {
                jSONWriterJSONB.config(featureArr);
                if (obj == null) {
                    jSONWriterJSONB.writeNull();
                } else {
                    jSONWriterJSONB.setRootObject(obj);
                    Class<?> cls = obj.getClass();
                    jSONWriterJSONB.getObjectWriter(cls, cls).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
                int iFlushTo = jSONWriterJSONB.flushTo(outputStream);
                jSONWriterJSONB.close();
                return iFlushTo;
            } catch (Throwable th) {
                try {
                    jSONWriterJSONB.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new JSONException("writeJSONString error", e);
        }
    }

    static byte[] toBytes(int i) {
        if (i >= -16 && i <= 47) {
            return new byte[]{(byte) i};
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt32(i);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (true) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static String toJSONString(byte[] bArr, boolean z) {
        return new JSONBDump(bArr, z).toString();
    }

    static void dump(byte[] bArr, SymbolTable symbolTable) {
        System.out.println(new JSONBDump(bArr, symbolTable, true).toString());
    }

    static String toJSONString(byte[] bArr, SymbolTable symbolTable) {
        return toJSONString(bArr, symbolTable, false);
    }

    static String toJSONString(byte[] bArr, SymbolTable symbolTable, boolean z) {
        return new JSONBDump(bArr, symbolTable, z).toString();
    }

    static Object parse(byte[] bArr, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONArray parseArray(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            JSONArray jSONArray = (JSONArray) jSONReaderJSONB.readArray();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONArray);
            }
            jSONReaderJSONB.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONObject parseObject(byte[] bArr, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static byte[] toBytes(byte b) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt8(b);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (true) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[] toBytes(short s) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt16(s);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (true) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            Object any = jSONReaderJSONB.readAny();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(any);
            }
            jSONReaderJSONB.close();
            return any;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static JSONObject parseObject(InputStream inputStream, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            JSONObject jSONObject = (JSONObject) jSONReaderJSONB.readObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(jSONObject);
            }
            jSONReaderJSONB.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static byte[] toBytes(long j) {
        if (j >= -8 && j <= 15) {
            return new byte[]{(byte) (j - 32)};
        }
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB();
        try {
            jSONWriterOfJSONB.writeInt64(j);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (true) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Object parse(byte[] bArr, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), symbolTable, featureArr), bArr, 0, bArr.length);
        try {
            Object anyObject = jSONReaderJSONB.readAnyObject();
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(anyObject);
            }
            jSONReaderJSONB.close();
            return anyObject;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls) {
        T t;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t = (T) jSONReaderJSONB.readAny();
            } else {
                t = (T) defaultObjectReaderProvider.getObjectReader(cls, (JSONFactory.defaultReaderFeatures & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{type}, null, List.class);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = (List) jSONReaderJSONB.read(parameterizedTypeImpl);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static byte[] toBytes(String str) {
        byte[] bArrApply;
        int length;
        int i = 0;
        if (str == null) {
            return new byte[]{-81};
        }
        if (JDKUtils.JVM_VERSION == 8) {
            char[] charArray = JDKUtils.getCharArray(str);
            int length2 = charArray.length;
            if (length2 <= 47) {
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (charArray[i2] > 127) {
                            break;
                        }
                        i2++;
                    } else {
                        byte[] bArr = new byte[charArray.length + 1];
                        bArr[0] = (byte) (length2 + 73);
                        while (i < length2) {
                            int i3 = i + 1;
                            bArr[i3] = (byte) charArray[i];
                            i = i3;
                        }
                        return bArr;
                    }
                }
            }
        } else {
            Function<String, byte[]> function = JDKUtils.STRING_VALUE;
            if (function != null && JDKUtils.STRING_CODER.applyAsInt(str) == 0 && (length = (bArrApply = function.apply(str)).length) <= 47) {
                byte[] bArr2 = new byte[bArrApply.length + 1];
                bArr2[0] = (byte) (length + 73);
                System.arraycopy(bArrApply, 0, bArr2, 1, bArrApply.length);
                return bArr2;
            }
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider), null);
        try {
            jSONWriterJSONB.writeString(str);
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider), bArr, 0, bArr.length);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> List<T> parseArray(byte[] bArr, Type... typeArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider()), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Type... typeArr) {
        return (T) parseObject(bArr, new MultiType(typeArr));
    }

    static <T> List<T> parseArray(byte[] bArr, Type[] typeArr, JSONReader.Feature... featureArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(JSONFactory.getDefaultObjectReaderProvider(), featureArr), bArr, 0, bArr.length);
        try {
            List<T> list = jSONReaderJSONB.readList(typeArr);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(list);
            }
            jSONReaderJSONB.close();
            return list;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(new JSONReader.Context(defaultObjectReaderProvider, symbolTable), bArr, 0, bArr.length);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toBytes(String str, Charset charset) {
        byte b;
        if (str == null) {
            return new byte[]{-81};
        }
        if (charset == StandardCharsets.UTF_16) {
            b = 123;
        } else if (charset == StandardCharsets.UTF_16BE) {
            b = 125;
        } else if (charset == StandardCharsets.UTF_16LE) {
            b = 124;
        } else if (charset == StandardCharsets.UTF_8) {
            b = 122;
        } else if (charset == StandardCharsets.US_ASCII || charset == StandardCharsets.ISO_8859_1) {
            b = 121;
        } else {
            if (charset == null || !"GB18030".equals(charset.name())) {
                return toBytes(str);
            }
            b = 126;
        }
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        int i = length + 2;
        if (bytes.length > 47) {
            if (bytes.length <= 2047) {
                i = length + 3;
            } else {
                i = bytes.length <= 262143 ? length + 4 : length + 6;
            }
        }
        byte[] bArr = new byte[i];
        bArr[0] = b;
        System.arraycopy(bytes, 0, bArr, IO.writeInt32(bArr, 1, bytes.length), bytes.length);
        return bArr;
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, symbolTable, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, Filter filter, JSONReader.Feature... featureArr) {
        T t;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, filter, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                context.features |= feature.mask;
            } catch (Throwable th) {
                try {
                    jSONReaderJSONB.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (cls == Object.class) {
            t = (T) jSONReaderJSONB.readAnyObject();
        } else {
            t = (T) defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
        }
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t);
        }
        jSONReaderJSONB.close();
        return t;
    }

    static byte[] toBytes(Object obj) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                Class<?> cls = obj.getClass();
                context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toBytes(Object obj, JSONWriter.Context context) {
        if (context == null) {
            context = JSONFactory.createWriteContext();
        }
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.rootObject = obj;
                jSONWriterJSONB.path = JSONWriter.Path.ROOT;
                boolean z = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, z);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, SymbolTable symbolTable, Filter[] filterArr, JSONReader.Feature... featureArr) {
        T t;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, symbolTable, filterArr, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        for (JSONReader.Feature feature : featureArr) {
            try {
                context.features |= feature.mask;
            } catch (Throwable th) {
                try {
                    jSONReaderJSONB.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (type == Object.class) {
            t = (T) jSONReaderJSONB.readAnyObject();
        } else {
            t = (T) defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
        }
        if (jSONReaderJSONB.resolveTasks != null) {
            jSONReaderJSONB.handleResolveTasks(t);
        }
        jSONReaderJSONB.close();
        return t;
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                context.getObjectWriter(cls, cls).writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, TypeReference typeReference, JSONReader.Feature... featureArr) {
        return (T) parseObject(bArr, typeReference.getType(), featureArr);
    }

    static <T> T parseObject(InputStream inputStream, Class cls, JSONReader.Feature... featureArr) {
        return (T) parseObject(inputStream, cls, JSONFactory.createReadContext(featureArr));
    }

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Feature... featureArr) {
        return (T) parseObject(inputStream, type, JSONFactory.createReadContext(featureArr));
    }

    static <T> T parseObject(InputStream inputStream, Type type, JSONReader.Context context) {
        T t;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (type == Object.class) {
                t = (T) jSONReaderJSONB.readAny();
            } else {
                t = (T) context.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        return toBytes(obj, new JSONWriter.Context(new JSONWriter.Feature[0]), symbolTable, featureArr);
    }

    static byte[] toBytes(Object obj, JSONWriter.Context context, SymbolTable symbolTable, JSONWriter.Feature... featureArr) {
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(InputStream inputStream, Class cls, JSONReader.Context context) {
        T t;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, inputStream);
        try {
            if (cls == Object.class) {
                t = (T) jSONReaderJSONB.readAny();
            } else {
                t = (T) context.getObjectReader(cls).readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(InputStream inputStream, int i, Type type, JSONReader.Context context) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i) {
                andSet = new byte[i];
            }
            int i2 = inputStream.read(andSet, 0, i);
            if (i2 != i) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i + " but actual read: " + i2);
            }
            T t = (T) parseObject(andSet, 0, i, type, context);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t;
        } catch (Throwable th) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th;
        }
    }

    static byte[] toBytes(Object obj, SymbolTable symbolTable, Filter[] filterArr, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        context.configFilter(filterArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, symbolTable);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.setRootObject(obj);
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, (context.features & JSONWriter.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(InputStream inputStream, int i, Type type, JSONReader.Feature... featureArr) {
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, byte[]> atomicReferenceFieldUpdater = JSONFactory.BYTES_UPDATER;
        byte[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null) {
            andSet = new byte[8192];
        }
        try {
            if (andSet.length < i) {
                andSet = new byte[i];
            }
            int i2 = inputStream.read(andSet, 0, i);
            if (i2 != i) {
                throw new IllegalArgumentException("deserialize failed. expected read length: " + i + " but actual read: " + i2);
            }
            T t = (T) parseObject(andSet, 0, i, type, featureArr);
            atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            return t;
        } catch (Throwable th) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
            throw th;
        }
    }

    static byte[] toBytes(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.Context context = new JSONWriter.Context(JSONFactory.defaultObjectWriterProvider, featureArr);
        JSONWriterJSONB jSONWriterJSONB = new JSONWriterJSONB(context, null);
        try {
            if (obj == null) {
                jSONWriterJSONB.writeNull();
            } else {
                jSONWriterJSONB.rootObject = obj;
                jSONWriterJSONB.path = JSONWriter.Path.ROOT;
                boolean z = (context.features & JSONWriter.Feature.FieldBased.mask) != 0;
                Class<?> cls = obj.getClass();
                ObjectWriter objectWriter = context.provider.getObjectWriter(cls, cls, z);
                if ((context.features & JSONWriter.Feature.BeanToArray.mask) != 0) {
                    objectWriter.writeArrayMappingJSONB(jSONWriterJSONB, obj, null, null, 0L);
                } else {
                    objectWriter.writeJSONB(jSONWriterJSONB, obj, null, null, 0L);
                }
            }
            byte[] bytes = jSONWriterJSONB.getBytes();
            jSONWriterJSONB.close();
            return bytes;
        } catch (Throwable th) {
            try {
                jSONWriterJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Feature... featureArr) {
        T t;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t = (T) jSONReaderJSONB.readAnyObject();
            } else {
                ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) {
                    t = (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L);
                } else {
                    t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
                }
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Class<T> cls, JSONReader.Context context) {
        T t;
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            if (cls == Object.class) {
                t = (T) jSONReaderJSONB.readAnyObject();
            } else {
                ObjectReader objectReader = context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
                if ((context.features & JSONReader.Feature.SupportArrayToBean.mask) != 0 && jSONReaderJSONB.isArray() && (objectReader instanceof ObjectReaderBean)) {
                    t = (T) objectReader.readArrayMappingJSONBObject(jSONReaderJSONB, cls, null, 0L);
                } else {
                    t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
                }
            }
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, Type type, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, 0, bArr.length);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Class<T> cls) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Class<T> cls, JSONReader.Feature... featureArr) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        JSONReader.Context context = new JSONReader.Context(defaultObjectReaderProvider, featureArr);
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type, JSONReader.Context context) {
        JSONReaderJSONB jSONReaderJSONB = new JSONReaderJSONB(context, bArr, i, i2);
        try {
            T t = (T) context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type, JSONReader.Feature... featureArr) {
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(JSONFactory.createReadContext(featureArr), bArr, i, i2);
        try {
            T t = (T) jSONReaderJSONB.getObjectReader(type).readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Class<T> cls, SymbolTable symbolTable) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type, SymbolTable symbolTable) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Class<T> cls, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(cls);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, cls, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static <T> T parseObject(byte[] bArr, int i, int i2, Type type, SymbolTable symbolTable, JSONReader.Feature... featureArr) {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(symbolTable, featureArr);
        ObjectReader objectReader = contextCreateReadContext.getObjectReader(type);
        JSONReader jSONReaderJSONB = new JSONReaderJSONB(contextCreateReadContext, bArr, i, i2);
        try {
            T t = (T) objectReader.readJSONBObject(jSONReaderJSONB, type, null, 0L);
            if (jSONReaderJSONB.resolveTasks != null) {
                jSONReaderJSONB.handleResolveTasks(t);
            }
            jSONReaderJSONB.close();
            return t;
        } catch (Throwable th) {
            try {
                jSONReaderJSONB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
