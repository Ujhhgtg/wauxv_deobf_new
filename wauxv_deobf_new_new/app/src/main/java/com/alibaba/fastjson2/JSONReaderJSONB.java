package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array;
import com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray;
import com.alibaba.fastjson2.reader.ObjectReaderImplStringArray;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.bc;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import okhttp3.internal.ws.WebSocketProtocol;
import org.repackage.com.miui.deviceid.BuildConfig;
import p000.AbstractC1095;
import p000.AbstractC2647;
import p000.AbstractC2844;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderJSONB extends JSONReader {
    static final byte[] FIXED_TYPE_SIZE;
    static Charset GB18030;
    final byte[] bytes;
    final JSONFactory.CacheItem cacheItem;
    char[] charBuf;
    final int end;
    final int length;
    int strBegin;
    int strlen;
    byte strtype;
    int symbol0Begin;
    long symbol0Hash;
    int symbol0Length;
    byte symbol0StrType;
    final SymbolTable symbolTable;
    long[] symbols;
    byte type;
    byte[] valueBytes;
    static final long BASE = JDKUtils.UNSAFE.arrayBaseOffset(byte[].class);
    static final byte[] SHANGHAI_ZONE_ID_NAME_BYTES = JSONB.toBytes(DateUtils.SHANGHAI_ZONE_ID_NAME);

    static {
        byte[] bArr = new byte[bc.e];
        for (int i = -16; i < 47; i++) {
            bArr[i & 255] = 1;
        }
        for (int i2 = 48; i2 < 63; i2++) {
            bArr[i2 & 255] = 2;
        }
        for (int i3 = 64; i3 < 71; i3++) {
            bArr[i3 & 255] = 3;
        }
        for (int i4 = -40; i4 < -17; i4++) {
            bArr[i4 & 255] = 1;
        }
        for (int i5 = -56; i5 < -41; i5++) {
            bArr[i5 & 255] = 2;
        }
        for (int i6 = -64; i6 < -57; i6++) {
            bArr[i6 & 255] = 3;
        }
        for (int i7 = 73; i7 < 120; i7++) {
            bArr[i7 & 255] = (byte) (i7 - 72);
        }
        bArr[148] = 1;
        bArr[73] = 1;
        bArr[175] = 1;
        bArr[176] = 1;
        bArr[177] = 1;
        bArr[189] = 2;
        bArr[188] = 3;
        bArr[72] = 5;
        bArr[172] = 5;
        bArr[183] = 5;
        bArr[191] = 5;
        bArr[190] = 9;
        bArr[171] = 9;
        bArr[181] = 9;
        bArr[121] = -1;
        bArr[122] = -1;
        bArr[123] = -1;
        bArr[124] = -1;
        bArr[125] = -1;
        FIXED_TYPE_SIZE = bArr;
    }

    public JSONReaderJSONB(JSONReader.Context context, InputStream inputStream) {
        super(context, true, false);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i = context.bufferSize;
        andSet = andSet == null ? new byte[i] : andSet;
        int i2 = 0;
        while (true) {
            try {
                int i3 = inputStream.read(andSet, i2, andSet.length - i2);
                if (i3 == -1) {
                    this.bytes = andSet;
                    this.offset = 0;
                    this.length = i2;
                    this.end = i2;
                    this.symbolTable = context.symbolTable;
                    return;
                }
                i2 += i3;
                if (i2 == andSet.length) {
                    andSet = Arrays.copyOf(andSet, andSet.length + i);
                }
            } catch (IOException e) {
                throw new JSONException("read error", e);
            }
        }
    }

    public static int check3(int i, int i2) {
        if (i + 3 < i2) {
            return i;
        }
        throw outOfBoundsCheckFromToIndex(i, i2);
    }

    public static int check7(int i, int i2) {
        if (i + 7 < i2) {
            return i;
        }
        throw outOfBoundsCheckFromToIndex(i, i2);
    }

    private static int getInt3(byte[] bArr, int i, int i2) {
        return ((i2 - 68) << 16) + (IOUtils.getShortBE(bArr, i) & 65535);
    }

    private static int getIntByte(byte[] bArr, int i, int i2) {
        return ((i2 - 56) << 8) + (bArr[i] & 255);
    }

    private static int getLong3(byte[] bArr, int i, int i2) {
        return ((i2 + 60) << 16) + (IOUtils.getShortBE(bArr, i) & 65535);
    }

    private static int getLongByte(byte[] bArr, int i, int i2) {
        return ((i2 + 48) << 8) + (bArr[i] & 255);
    }

    private ObjectReader getObjectReaderContext(ObjectReader objectReader, Class cls, ClassLoader classLoader) {
        String string = getString();
        Class<?> mapping = TypeUtils.getMapping(string);
        if (mapping == null) {
            if (classLoader == null) {
                try {
                    classLoader = JSON.class.getClassLoader();
                } catch (ClassNotFoundException unused) {
                }
            }
            mapping = classLoader.loadClass(string);
        }
        return (mapping == null || cls.equals(mapping)) ? objectReader : getObjectReader(mapping);
    }

    public static JSONException notSupportType(byte b) {
        return new JSONException("name not support input : " + JSONB.typeName(b));
    }

    public static JSONException outOfBoundsCheckFromToIndex(int i, int i2) {
        return new JSONException(AbstractC2844.m4779(i, "offset overflow, offset ", ", end ", i2));
    }

    private BigInteger readBigInteger0(byte b) {
        byte[] bArr = this.bytes;
        int i = this.end;
        if (b == -111) {
            int int32Value = readInt32Value();
            byte[] bArr2 = new byte[int32Value];
            System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value);
            this.offset += int32Value;
            return new BigInteger(bArr2);
        }
        if (b == -71) {
            int int32Value2 = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value2 == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value2)).toBigInteger();
        }
        if (b != 72) {
            if (b == 124) {
                int int32Value3 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value3, StandardCharsets.UTF_16LE);
                this.offset += int32Value3;
                return str.indexOf(46) == -1 ? new BigInteger(str) : TypeUtils.toBigDecimal(str).toBigInteger();
            }
            if (b == 121) {
                int int32Value4 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value4, StandardCharsets.ISO_8859_1);
                this.offset += int32Value4;
                return str2.indexOf(46) == -1 ? new BigInteger(str2) : TypeUtils.toBigDecimal(str2).toBigInteger();
            }
            if (b == 122) {
                int int32Value5 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value5, StandardCharsets.UTF_8);
                this.offset += int32Value5;
                return str3.indexOf(46) == -1 ? new BigInteger(str3) : TypeUtils.toBigDecimal(str3).toBigInteger();
            }
            switch (b) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigInteger.ZERO;
                case -79:
                case -77:
                    return BigInteger.ONE;
                case -76:
                    return BigInteger.valueOf(readInt64Value());
                case -75:
                    long longBE = IOUtils.getLongBE(bArr, check7(this.offset, i));
                    this.offset += 8;
                    return BigInteger.valueOf((long) Double.longBitsToDouble(longBE));
                case -74:
                    return BigInteger.valueOf(readInt32Value());
                case -73:
                    int intBE = IOUtils.getIntBE(bArr, check3(this.offset, i));
                    this.offset += 4;
                    return BigInteger.valueOf((long) Float.intBitsToFloat(intBE));
                default:
                    switch (b) {
                        case -68:
                            int i2 = this.offset;
                            int i3 = (bArr[i2 + 1] & 255) + (bArr[i2] << 8);
                            this.offset = i2 + 2;
                            return BigInteger.valueOf(i3);
                        case -67:
                            int i4 = this.offset;
                            this.offset = i4 + 1;
                            return BigInteger.valueOf(bArr[i4]);
                        case -66:
                            long longBE2 = IOUtils.getLongBE(bArr, check7(this.offset, i));
                            this.offset += 8;
                            return BigInteger.valueOf(longBE2);
                        case -65:
                            break;
                        default:
                            if (JSONB.isInt32Num(b)) {
                                return BigInteger.valueOf(b);
                            }
                            if (JSONB.isInt32Byte(b)) {
                                int i5 = this.offset;
                                this.offset = i5 + 1;
                                return BigInteger.valueOf(getIntByte(bArr, i5, b));
                            }
                            if (JSONB.isInt32Short(b)) {
                                int i6 = this.offset;
                                if (i6 + 1 < i) {
                                    int int3 = getInt3(bArr, i6, b);
                                    this.offset += 2;
                                    return BigInteger.valueOf(int3);
                                }
                            }
                            if (JSONB.isInt64Num(b)) {
                                return BigInteger.valueOf(b + 32);
                            }
                            if (JSONB.isInt64Byte(b)) {
                                int i7 = this.offset;
                                this.offset = i7 + 1;
                                return BigInteger.valueOf(getLongByte(bArr, i7, b));
                            }
                            if (JSONB.isInt64Short(b)) {
                                int i8 = this.offset;
                                if (i8 + 1 < i) {
                                    int long3 = getLong3(bArr, i8, b);
                                    this.offset += 2;
                                    return BigInteger.valueOf(long3);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw notSupportType(b);
                            }
                            int i9 = b - 73;
                            String fixedAsciiString = readFixedAsciiString(i9);
                            this.offset += i9;
                            return new BigInteger(fixedAsciiString);
                    }
                    break;
            }
        }
        int intBE2 = IOUtils.getIntBE(bArr, check3(this.offset, i));
        this.offset += 4;
        return BigInteger.valueOf(intBE2);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0184  */
    /* JADX WARN: Code duplicated, block: B:121:0x018a  */
    /* JADX WARN: Code duplicated, block: B:123:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0190  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    private boolean readBoolValue0(byte b) {
        boolean z;
        int i;
        byte b2;
        int length;
        int i2;
        byte b3;
        int i3;
        int i4;
        byte b4;
        Charset charset;
        byte[] bArr = this.bytes;
        if (b == -81) {
            if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                throw new JSONException(info("long value not support input null"));
            }
            this.wasNull = true;
            return false;
        }
        if (b != 74) {
            if (b == 0) {
                return false;
            }
            if (b == 1) {
                return true;
            }
            if (b == 77) {
                z = false;
            } else if (b != 78) {
                switch (b) {
                    case 121:
                    case 122:
                        z = false;
                        break;
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.IUSHR /* 124 */:
                    case Opcodes.LUSHR /* 125 */:
                        int length2 = readLength();
                        this.strlen = length2;
                        byte[] bArr2 = new byte[length2];
                        System.arraycopy(bArr, this.offset, bArr2, 0, length2);
                        if (b == 125) {
                            charset = StandardCharsets.UTF_16BE;
                        } else {
                            charset = b == 124 ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_16;
                        }
                        String str = new String(bArr2, charset);
                        this.offset += this.strlen;
                        switch (str) {
                            case "0":
                            case "N":
                            case "FALSE":
                            case "false":
                                return false;
                            case "1":
                            case "Y":
                            case "TRUE":
                            case "true":
                                return true;
                            default:
                                throw new JSONException("not support input ".concat(str));
                        }
                    default:
                        throw notSupportType(b);
                }
            } else {
                z = false;
                i = this.offset;
                b2 = bArr[i];
                if (b2 != 102 && bArr[i + 1] == 97 && bArr[i + 2] == 108 && bArr[i + 3] == 115 && bArr[i + 4] == 101) {
                    this.offset = i + 5;
                    return z;
                }
                if (b2 == 70 && bArr[i + 1] == 65 && bArr[i + 2] == 76 && bArr[i + 3] == 83 && bArr[i + 4] == 69) {
                    this.offset = i + 5;
                    return z;
                }
            }
            length = readLength();
            this.strlen = length;
            if (length == 1) {
                i4 = this.offset;
                b4 = bArr[i4];
                if (b4 == 89) {
                    this.offset = i4 + 1;
                    return true;
                }
                if (b4 == 78) {
                    this.offset = i4 + 1;
                    return true;
                }
            } else {
                if (length == 4) {
                    i3 = this.offset;
                    if (bArr[i3] == 116 && bArr[i3 + 1] == 114 && bArr[i3 + 2] == 117 && bArr[i3 + 3] == 101) {
                        this.offset = i3 + 4;
                        return true;
                    }
                }
                if (length == 5) {
                    i2 = this.offset;
                    b3 = bArr[i2];
                    if (b3 != 102 && bArr[i2 + 1] == 97 && bArr[i2 + 2] == 108 && bArr[i2 + 3] == 115 && bArr[i2 + 4] == 101) {
                        this.offset = i2 + 5;
                        return z;
                    }
                    if (b3 == 70 && bArr[i2 + 1] == 65 && bArr[i2 + 2] == 76 && bArr[i2 + 3] == 83 && bArr[i2 + 4] == 69) {
                        this.offset = i2 + 5;
                        return z;
                    }
                }
            }
            String str2 = new String(bArr, this.offset, length, StandardCharsets.ISO_8859_1);
            this.offset += this.strlen;
            throw new JSONException("not support input ".concat(str2));
        }
        int i5 = this.offset;
        byte b5 = bArr[i5];
        z = false;
        if (b5 == 49 || b5 == 89) {
            this.offset = i5 + 1;
            return true;
        }
        if (b5 == 48 || b5 == 78) {
            this.offset = i5 + 1;
            return false;
        }
        int i6 = this.offset;
        byte b6 = bArr[i6];
        if (b6 == 116 && bArr[i6 + 1] == 114 && bArr[i6 + 2] == 117 && bArr[i6 + 3] == 101) {
            this.offset = i6 + 4;
            return true;
        }
        if (b6 == 84 && bArr[i6 + 1] == 82 && bArr[i6 + 2] == 85 && bArr[i6 + 3] == 69) {
            this.offset = i6 + 4;
            return true;
        }
        i = this.offset;
        b2 = bArr[i];
        if (b2 != 102) {
        }
        if (b2 == 70) {
            this.offset = i + 5;
            return z;
        }
        length = readLength();
        this.strlen = length;
        if (length == 1) {
            i4 = this.offset;
            b4 = bArr[i4];
            if (b4 == 89) {
                this.offset = i4 + 1;
                return true;
            }
            if (b4 == 78) {
                this.offset = i4 + 1;
                return true;
            }
        } else {
            if (length == 4) {
                i3 = this.offset;
                if (bArr[i3] == 116) {
                    this.offset = i3 + 4;
                    return true;
                }
            }
            if (length == 5) {
                i2 = this.offset;
                b3 = bArr[i2];
                if (b3 != 102) {
                }
                if (b3 == 70) {
                    this.offset = i2 + 5;
                    return z;
                }
            }
        }
        String str3 = new String(bArr, this.offset, length, StandardCharsets.ISO_8859_1);
        this.offset += this.strlen;
        throw new JSONException("not support input ".concat(str3));
    }

    private BigDecimal readDecimal0(byte b) {
        int i = this.end;
        if (b != 72) {
            if (b == 124) {
                int int32Value = readInt32Value();
                String str = new String(this.bytes, this.offset, int32Value, StandardCharsets.UTF_16LE);
                this.offset += int32Value;
                return TypeUtils.toBigDecimal(str);
            }
            if (b == 121) {
                int int32Value2 = readInt32Value();
                String str2 = new String(this.bytes, this.offset, int32Value2, StandardCharsets.ISO_8859_1);
                this.offset += int32Value2;
                return TypeUtils.toBigDecimal(str2);
            }
            if (b == 122) {
                int int32Value3 = readInt32Value();
                String str3 = new String(this.bytes, this.offset, int32Value3, StandardCharsets.UTF_8);
                this.offset += int32Value3;
                return TypeUtils.toBigDecimal(str3);
            }
            switch (b) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigDecimal.ZERO;
                case -79:
                case -77:
                    return BigDecimal.ONE;
                case -76:
                    return BigDecimal.valueOf(readInt64Value());
                case -75:
                    long longBE = IOUtils.getLongBE(this.bytes, check7(this.offset, i));
                    this.offset += 8;
                    return BigDecimal.valueOf((long) Double.longBitsToDouble(longBE));
                case -74:
                    return BigDecimal.valueOf(readInt32Value());
                case -73:
                    int intBE = IOUtils.getIntBE(this.bytes, check3(this.offset, i));
                    this.offset += 4;
                    return BigDecimal.valueOf((long) Float.intBitsToFloat(intBE));
                default:
                    switch (b) {
                        case -69:
                            return new BigDecimal(readBigInteger());
                        case -68:
                            byte[] bArr = this.bytes;
                            int i2 = this.offset;
                            int i3 = (bArr[i2 + 1] & 255) + (bArr[i2] << 8);
                            this.offset = i2 + 2;
                            return BigDecimal.valueOf(i3);
                        case -67:
                            byte[] bArr2 = this.bytes;
                            int i4 = this.offset;
                            this.offset = i4 + 1;
                            return BigDecimal.valueOf(bArr2[i4]);
                        case -66:
                            long longBE2 = IOUtils.getLongBE(this.bytes, check7(this.offset, i));
                            this.offset += 8;
                            return BigDecimal.valueOf(longBE2);
                        case -65:
                            break;
                        default:
                            if (JSONB.isInt32Num(b)) {
                                return BigDecimal.valueOf(b);
                            }
                            if (JSONB.isInt32Byte(b)) {
                                byte[] bArr3 = this.bytes;
                                int i5 = this.offset;
                                this.offset = i5 + 1;
                                return BigDecimal.valueOf(getIntByte(bArr3, i5, b));
                            }
                            if (JSONB.isInt32Short(b)) {
                                int i6 = this.offset;
                                if (i6 + 1 < i) {
                                    int int3 = getInt3(this.bytes, i6, b);
                                    this.offset += 2;
                                    return BigDecimal.valueOf(int3);
                                }
                            }
                            if (JSONB.isInt64Num(b)) {
                                return BigDecimal.valueOf(b + 32);
                            }
                            if (JSONB.isInt64Byte(b)) {
                                byte[] bArr4 = this.bytes;
                                int i7 = this.offset;
                                this.offset = i7 + 1;
                                return BigDecimal.valueOf(getLongByte(bArr4, i7, b));
                            }
                            if (JSONB.isInt64Short(b)) {
                                int i8 = this.offset;
                                if (i8 + 1 < i) {
                                    int long3 = getLong3(this.bytes, i8, b);
                                    this.offset += 2;
                                    return BigDecimal.valueOf(long3);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw notSupportType(b);
                            }
                            int i9 = b - 73;
                            String fixedAsciiString = readFixedAsciiString(i9);
                            this.offset += i9;
                            return TypeUtils.toBigDecimal(fixedAsciiString);
                    }
                    break;
            }
        }
        int intBE2 = IOUtils.getIntBE(this.bytes, check3(this.offset, i));
        this.offset += 4;
        return BigDecimal.valueOf(intBE2);
    }

    private double readDoubleValue0() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        int i3 = this.end;
        if (b == -74) {
            return readInt32Value();
        }
        if (b == -73) {
            int intBE = IOUtils.getIntBE(bArr, check3(i2, i3));
            this.offset += 4;
            return Float.intBitsToFloat(intBE);
        }
        if (b == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int int32Value2 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
                this.offset += int32Value2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
            }
            if (b == 121) {
                int int32Value3 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
                this.offset += int32Value3;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
            }
            if (b == 122) {
                int int32Value4 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
                this.offset += int32Value4;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                        throw new JSONException(info("long value not support input null"));
                    }
                    this.wasNull = true;
                    return 0.0d;
                case -80:
                case -78:
                    return 0.0d;
                case -79:
                case -77:
                    return 1.0d;
                case -76:
                    return readInt64Value();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & 255) + (bArr[i2] << 8);
                            this.offset = i + 3;
                            return i4;
                        case -67:
                            this.offset = i + 2;
                            return bArr[i2];
                        case -66:
                            long longBE = IOUtils.getLongBE(bArr, check7(i2, i3));
                            this.offset += 8;
                            return longBE;
                        case -65:
                            break;
                        default:
                            if (JSONB.isInt32Num(b)) {
                                return b;
                            }
                            if (JSONB.isInt32Byte(b)) {
                                int i5 = this.offset;
                                this.offset = i5 + 1;
                                return getIntByte(bArr, i5, b);
                            }
                            if (JSONB.isInt32Short(b)) {
                                int i6 = this.offset;
                                if (i6 + 1 < i3) {
                                    int int3 = getInt3(bArr, i6, b);
                                    this.offset += 2;
                                    return int3;
                                }
                            }
                            if (JSONB.isInt64Num(b)) {
                                return ((long) (b + 40)) - 8;
                            }
                            if (JSONB.isInt64Byte(b)) {
                                int i7 = this.offset;
                                this.offset = i7 + 1;
                                return getLongByte(bArr, i7, b);
                            }
                            if (JSONB.isInt64Short(b)) {
                                int i8 = this.offset;
                                if (i8 + 1 < i3) {
                                    int long3 = getLong3(bArr, i8, b);
                                    this.offset += 2;
                                    return long3;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw notSupportType(b);
                            }
                            int i9 = b - 73;
                            String fixedAsciiString = readFixedAsciiString(i9);
                            this.offset += i9;
                            return fixedAsciiString.indexOf(46) == -1 ? new BigInteger(fixedAsciiString).doubleValue() : TypeUtils.toBigDecimal(fixedAsciiString).doubleValue();
                    }
                    break;
            }
        }
        int intBE2 = IOUtils.getIntBE(bArr, check3(i2, i3));
        this.offset += 4;
        return intBE2;
    }

    private float readFloat0() {
        int i = this.end;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 1;
        this.offset = i3;
        byte b = bArr[i2];
        if (b == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int int32Value2 = readInt32Value();
                String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
                this.offset += int32Value2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
            }
            if (b == 121) {
                int int32Value3 = readInt32Value();
                String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
                this.offset += int32Value3;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
            }
            if (b == 122) {
                int int32Value4 = readInt32Value();
                String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
                this.offset += int32Value4;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                        throw new JSONException(info("long value not support input null"));
                    }
                    this.wasNull = true;
                    return 0.0f;
                case -80:
                case -78:
                    return 0.0f;
                case -79:
                case -77:
                    return 1.0f;
                case -76:
                    return readInt64Value();
                case -75:
                    long longBE = IOUtils.getLongBE(bArr, check7(i3, i));
                    this.offset += 8;
                    return (float) Double.longBitsToDouble(longBE);
                case -74:
                    return readInt32Value();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i2 + 2] & 255) + (bArr[i3] << 8);
                            this.offset = i2 + 3;
                            return i4;
                        case -67:
                            this.offset = i2 + 2;
                            return bArr[i3];
                        case -66:
                            long longBE2 = IOUtils.getLongBE(bArr, check7(i3, i));
                            this.offset += 8;
                            return longBE2;
                        case -65:
                            break;
                        default:
                            if (JSONB.isInt32Num(b)) {
                                return b;
                            }
                            if (JSONB.isInt32Byte(b)) {
                                int i5 = this.offset;
                                this.offset = i5 + 1;
                                return getIntByte(bArr, i5, b);
                            }
                            if (JSONB.isInt32Short(b)) {
                                int i6 = this.offset;
                                if (i6 + 1 < i) {
                                    int int3 = getInt3(bArr, i6, b);
                                    this.offset += 2;
                                    return int3;
                                }
                            }
                            if (JSONB.isInt64Num(b)) {
                                return b + 32;
                            }
                            if (JSONB.isInt64Byte(b)) {
                                int i7 = this.offset;
                                this.offset = i7 + 1;
                                return getLongByte(bArr, i7, b);
                            }
                            if (JSONB.isInt64Short(b)) {
                                int i8 = this.offset;
                                if (i8 + 1 < i) {
                                    int long3 = getLong3(bArr, i8, b);
                                    this.offset += 2;
                                    return long3;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw notSupportType(b);
                            }
                            int i9 = b - 73;
                            String fixedAsciiString = readFixedAsciiString(i9);
                            this.offset += i9;
                            return fixedAsciiString.indexOf(46) == -1 ? new BigInteger(fixedAsciiString).floatValue() : TypeUtils.toBigDecimal(fixedAsciiString).floatValue();
                    }
                    break;
            }
        }
        int intBE = IOUtils.getIntBE(bArr, check3(i3, i));
        this.offset += 4;
        return intBE;
    }

    private void readGB18030() {
        this.strlen = readLength();
        this.strBegin = this.offset;
        if (GB18030 == null) {
            GB18030 = Charset.forName("GB18030");
        }
    }

    private int readInt32Value0(byte[] bArr, byte b) {
        if (JSONB.isInt64Num(b)) {
            return b + 32;
        }
        if (JSONB.isInt64Byte(b)) {
            int i = this.offset;
            this.offset = i + 1;
            return getLongByte(bArr, i, b);
        }
        int i2 = this.end;
        if (JSONB.isInt64Short(b)) {
            int i3 = this.offset;
            if (i3 + 1 < i2) {
                int long3 = getLong3(bArr, i3, b);
                this.offset += 2;
                return long3;
            }
        }
        if (b == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).intValue();
        }
        if (b == 124) {
            int int32Value2 = readInt32Value();
            String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
            this.offset += int32Value2;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
        }
        if (b == 121) {
            int int32Value3 = readInt32Value();
            String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
            this.offset += int32Value3;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
        }
        if (b == 122) {
            int int32Value4 = readInt32Value();
            String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
            this.offset += int32Value4;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
        }
        switch (b) {
            case -85:
                long longBE = IOUtils.getLongBE(bArr, check7(this.offset, i2));
                this.offset += 8;
                return (int) longBE;
            case -84:
            case -83:
                break;
            default:
                switch (b) {
                    case -81:
                        if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                            throw new JSONException(info("int value not support input null"));
                        }
                        this.wasNull = true;
                        return 0;
                    case -80:
                    case -78:
                        return 0;
                    case -79:
                    case -77:
                        return 1;
                    case -76:
                        return (int) readInt64Value();
                    case -75:
                        this.offset--;
                        return (int) readDoubleValue();
                    case -74:
                        return readInt32Value();
                    case -73:
                        int intBE = IOUtils.getIntBE(bArr, check3(this.offset, i2));
                        this.offset += 4;
                        return (int) Float.intBitsToFloat(intBE);
                    default:
                        switch (b) {
                            case -68:
                                int i4 = this.offset;
                                int i5 = (bArr[i4 + 1] & 255) + (bArr[i4] << 8);
                                this.offset = i4 + 2;
                                return i5;
                            case -67:
                                int i6 = this.offset;
                                this.offset = i6 + 1;
                                return bArr[i6];
                            case -66:
                                long longBE2 = IOUtils.getLongBE(bArr, check7(this.offset, i2));
                                this.offset += 8;
                                return (int) longBE2;
                            case -65:
                                break;
                            default:
                                if (b < 73 || b > 120) {
                                    throw readInt32ValueError(b);
                                }
                                int i7 = b - 73;
                                String fixedAsciiString = readFixedAsciiString(i7);
                                this.offset += i7;
                                return fixedAsciiString.indexOf(46) == -1 ? new BigInteger(fixedAsciiString).intValue() : TypeUtils.toBigDecimal(fixedAsciiString).intValue();
                        }
                        break;
                }
                break;
        }
        int intBE2 = IOUtils.getIntBE(bArr, check3(this.offset, i2));
        this.offset += 4;
        return intBE2;
    }

    private long readInt64Value0(byte[] bArr, byte b) {
        int i = this.offset;
        if (JSONB.isInt32Num(b)) {
            return b;
        }
        if (JSONB.isInt32Byte(b)) {
            long intByte = getIntByte(bArr, i, b);
            this.offset = i + 1;
            return intByte;
        }
        if (JSONB.isInt32Short(b) && i + 1 < this.end) {
            this.offset = i + 2;
            return getInt3(bArr, i, b);
        }
        if (b == -71) {
            int int32Value = readInt32Value();
            BigInteger bigInteger = readBigInteger();
            return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).longValue();
        }
        if (b == 72) {
            int intBE = IOUtils.getIntBE(bArr, check3(this.offset, this.end));
            this.offset += 4;
            return intBE;
        }
        if (b == 124) {
            int int32Value2 = readInt32Value();
            String str = new String(bArr, this.offset, int32Value2, StandardCharsets.UTF_16LE);
            this.offset += int32Value2;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.toBigDecimal(str).intValue();
        }
        if (b == -68) {
            int i2 = this.offset;
            int i3 = (bArr[i2 + 1] & 255) + (bArr[i2] << 8);
            this.offset = i2 + 2;
            return i3;
        }
        if (b == -67) {
            int i4 = this.offset;
            this.offset = i4 + 1;
            return bArr[i4];
        }
        if (b == 121) {
            int int32Value3 = readInt32Value();
            String str2 = new String(bArr, this.offset, int32Value3, StandardCharsets.ISO_8859_1);
            this.offset += int32Value3;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.toBigDecimal(str2).intValue();
        }
        if (b == 122) {
            int int32Value4 = readInt32Value();
            String str3 = new String(bArr, this.offset, int32Value4, StandardCharsets.UTF_8);
            this.offset += int32Value4;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.toBigDecimal(str3).intValue();
        }
        switch (b) {
            case -85:
                long longBE = IOUtils.getLongBE(bArr, check7(this.offset, this.end));
                this.offset += 8;
                return longBE;
            case -84:
                long intBE2 = IOUtils.getIntBE(bArr, check3(this.offset, this.end));
                this.offset += 4;
                return intBE2 * 1000;
            case -83:
                long intBE3 = IOUtils.getIntBE(bArr, check3(this.offset, this.end));
                this.offset += 4;
                return intBE3 * 60000;
            default:
                switch (b) {
                    case -81:
                        if ((this.context.features & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                            throw new JSONException(info("long value not support input null"));
                        }
                        this.wasNull = true;
                        return 0L;
                    case -80:
                    case -78:
                        return 0L;
                    case -79:
                    case -77:
                        return 1L;
                    case -76:
                        return readInt64Value();
                    case -75:
                        this.offset--;
                        return (long) readDoubleValue();
                    case -74:
                        return readInt32Value();
                    case -73:
                        int intBE4 = IOUtils.getIntBE(bArr, check3(this.offset, this.end));
                        this.offset += 4;
                        return (long) Float.intBitsToFloat(intBE4);
                    default:
                        if (b < 73 || b > 120) {
                            throw readInt64ValueError(b);
                        }
                        int i5 = b - 73;
                        String fixedAsciiString = readFixedAsciiString(i5);
                        this.offset += i5;
                        return fixedAsciiString.indexOf(46) == -1 ? new BigInteger(fixedAsciiString).longValue() : TypeUtils.toBigDecimal(fixedAsciiString).longValue();
                }
        }
    }

    private LocalDate readLocalDate0(int i) {
        if (i == -88) {
            return readLocalDateTime().toLocalDate();
        }
        if (i == -86) {
            return readZonedDateTime().toLocalDate();
        }
        if (i >= 73 && i <= 120) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    return readLocalDate8();
                case 9:
                    return readLocalDate9();
                case 10:
                    return readLocalDate10();
                case 11:
                    return readLocalDate11();
                default:
                    if (this.bytes[this.offset + stringLength] == 90) {
                        return readZonedDateTime().toInstant().atZone(this.context.getZoneId()).toLocalDate();
                    }
                    StringBuilder sbM2802 = AbstractC1095.m2802(stringLength, "TODO : ", ", ");
                    sbM2802.append(readString());
                    throw new JSONException(sbM2802.toString());
            }
        }
        if (i == 122 || i == 121) {
            this.strtype = (byte) i;
            this.offset++;
            int length = readLength();
            this.strlen = length;
            switch (length) {
                case 8:
                    return readLocalDate8();
                case 9:
                    return readLocalDate9();
                case 10:
                    return readLocalDate10();
                case 11:
                    return readLocalDate11();
            }
        }
        throw notSupportType((byte) i);
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.time.LocalDateTime] */
    private LocalDateTime readLocalDateTime0(int i) {
        if (i == -87) {
            LocalDate localDate = readLocalDate();
            if (localDate == null) {
                return null;
            }
            return LocalDateTime.of(localDate, LocalTime.MIN);
        }
        if (i == -86) {
            return readZonedDateTime().toLocalDateTime();
        }
        if (i < 73 || i > 120) {
            throw notSupportType((byte) i);
        }
        int stringLength = getStringLength();
        switch (stringLength) {
            case 8:
                LocalDate localDate8 = readLocalDate8();
                if (localDate8 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate8, LocalTime.MIN);
            case 9:
                LocalDate localDate9 = readLocalDate9();
                if (localDate9 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate9, LocalTime.MIN);
            case 10:
                LocalDate localDate10 = readLocalDate10();
                if (localDate10 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate10, LocalTime.MIN);
            case 11:
                LocalDate localDate11 = readLocalDate11();
                if (localDate11 == null) {
                    return null;
                }
                return LocalDateTime.of(localDate11, LocalTime.MIN);
            case 16:
                return readLocalDateTime16();
            case Opcodes.SIPUSH /* 17 */:
                return readLocalDateTime17();
            case Opcodes.LDC /* 18 */:
                return readLocalDateTime18();
            case 19:
                return readLocalDateTime19();
            case 20:
                return readLocalDateTime20();
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
                LocalDateTime localDateTimeX = readLocalDateTimeX(stringLength);
                if (localDateTimeX != null) {
                    return localDateTimeX;
                }
                ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                if (zonedDateTimeX != null) {
                    return zonedDateTimeX.toLocalDateTime();
                }
                break;
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(stringLength, "TODO : ", ", ");
        sbM2802.append(readString());
        throw new JSONException(sbM2802.toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    private String readStringNonAscii() {
        Charset charset;
        String utf16be;
        Charset charset2;
        byte b = this.strtype;
        if (b < 73 || b > 121) {
            if (b == 122) {
                utf16be = readStringUTF8();
                charset2 = StandardCharsets.UTF_8;
            } else if (b == 123) {
                this.strlen = readLength();
                this.strBegin = this.offset;
                charset = StandardCharsets.UTF_16;
            } else if (b == 124) {
                utf16be = readUTF16LE();
                charset2 = StandardCharsets.UTF_16LE;
            } else if (b == 125) {
                utf16be = readUTF16BE();
                if (utf16be != null) {
                    return utf16be;
                }
                charset2 = StandardCharsets.UTF_16BE;
            } else {
                if (b != 126) {
                    return readStringTypeNotMatch();
                }
                readGB18030();
                charset = GB18030;
            }
            if (utf16be != null) {
                return readString(charset2);
            }
            if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                utf16be = utf16be.trim();
            }
            if (utf16be.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                return utf16be;
            }
            return null;
        }
        charset = StandardCharsets.ISO_8859_1;
        charset2 = charset;
        utf16be = null;
        if (utf16be != null) {
            return readString(charset2);
        }
        if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
            utf16be = utf16be.trim();
        }
        if (utf16be.isEmpty()) {
        }
        return utf16be;
    }

    private String readStringTypeNotMatch() {
        int i = this.end;
        byte b = this.strtype;
        if (JSONB.isInt32Num(b)) {
            return Byte.toString(b);
        }
        if (JSONB.isInt32Byte(b)) {
            byte[] bArr = this.bytes;
            int i2 = this.offset;
            this.offset = i2 + 1;
            return Integer.toString(getIntByte(bArr, i2, b));
        }
        if (JSONB.isInt32Short(b)) {
            int i3 = this.offset;
            if (i3 + 1 < i) {
                int int3 = getInt3(this.bytes, i3, b);
                this.offset += 2;
                return Integer.toString(int3);
            }
        }
        if (JSONB.isInt64Num(b)) {
            return Integer.toString(b + 32);
        }
        if (JSONB.isInt64Byte(b)) {
            byte[] bArr2 = this.bytes;
            int i4 = this.offset;
            this.offset = i4 + 1;
            return Integer.toString(getLongByte(bArr2, i4, b));
        }
        if (JSONB.isInt64Short(b)) {
            int i5 = this.offset;
            if (i5 + 1 < i) {
                int long3 = getLong3(this.bytes, i5, b);
                this.offset += 2;
                return Integer.toString(long3);
            }
        }
        if (b == -110) {
            this.offset--;
            Object any = readAny();
            if (any == null) {
                return null;
            }
            return JSON.toJSONString(any, JSONWriter.Feature.WriteThrowableClassName);
        }
        if (b == -81) {
            return null;
        }
        if (b != 72) {
            if (b == -66) {
                long longBE = IOUtils.getLongBE(this.bytes, check7(this.offset, i));
                this.offset += 8;
                return Long.toString(longBE);
            }
            if (b != -65) {
                switch (b) {
                    case -85:
                        long longBE2 = IOUtils.getLongBE(this.bytes, check7(this.offset, i));
                        this.offset += 8;
                        return DateUtils.toString(new Date(longBE2));
                    case -84:
                        long intBE = ((long) IOUtils.getIntBE(this.bytes, check3(this.offset, i))) * 1000;
                        this.offset += 4;
                        return DateUtils.toString(new Date(intBE));
                    case -83:
                        long intBE2 = ((long) IOUtils.getIntBE(this.bytes, check3(this.offset, i))) * 60000;
                        this.offset += 4;
                        return DateUtils.toString(new Date(intBE2));
                    default:
                        switch (b) {
                            case -78:
                                return "0.0";
                            case -77:
                                return BuildConfig.f;
                            case -76:
                                return Double.toString(readInt64Value());
                            case -75:
                                long longBE3 = IOUtils.getLongBE(this.bytes, check7(this.offset, i));
                                this.offset += 8;
                                return Double.toString(Double.longBitsToDouble(longBE3));
                            case -74:
                                return Float.toString(readInt32Value());
                            case -73:
                                int intBE3 = IOUtils.getIntBE(this.bytes, check3(this.offset, i));
                                this.offset += 4;
                                return Float.toString(Float.intBitsToFloat(intBE3));
                            case -72:
                            case -70:
                                return Long.toString(readInt64Value());
                            case -71:
                                int int32Value = readInt32Value();
                                BigInteger bigInteger = readBigInteger();
                                return (int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value)).toString();
                            case -69:
                                int int32Value2 = readInt32Value();
                                byte[] bArr3 = new byte[int32Value2];
                                System.arraycopy(this.bytes, this.offset, bArr3, 0, int32Value2);
                                this.offset += int32Value2;
                                return new BigInteger(bArr3).toString();
                            default:
                                throw notSupportString();
                        }
                }
            }
        }
        int intBE4 = IOUtils.getIntBE(this.bytes, check3(this.offset, i));
        this.offset += 4;
        return Long.toString(intBE4);
    }

    private String readStringUTF8() {
        byte b = this.bytes[this.offset];
        if (JSONB.isInt32Num(b)) {
            this.offset++;
            this.strlen = b;
        } else if (JSONB.isInt32Byte(b)) {
            this.strlen = getIntByte(this.bytes, this.offset + 1, b);
            this.offset += 2;
        } else {
            this.strlen = readLength();
        }
        this.strBegin = this.offset;
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction != null && !JDKUtils.BIG_ENDIAN) {
            if (this.valueBytes == null) {
                byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(this.cacheItem, null);
                this.valueBytes = andSet;
                if (andSet == null) {
                    this.valueBytes = new byte[8192];
                }
            }
            int i = this.strlen;
            int i2 = i << 1;
            if (i2 > this.valueBytes.length) {
                this.valueBytes = new byte[i2];
            }
            int iDecodeUTF8 = IOUtils.decodeUTF8(this.bytes, this.offset, i, this.valueBytes);
            if (iDecodeUTF8 != -1) {
                byte[] bArr = new byte[iDecodeUTF8];
                System.arraycopy(this.valueBytes, 0, bArr, 0, iDecodeUTF8);
                String strApply = biFunction.apply(bArr, JDKUtils.UTF16);
                this.offset += this.strlen;
                if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                    strApply = strApply.trim();
                }
                if (!strApply.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                    return strApply;
                }
                return null;
            }
        }
        return null;
    }

    private ZonedDateTime readTimestampWithTimeZone() {
        ZoneId zoneId;
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        int i3 = bArr[i] << 8;
        int i4 = i + 2;
        this.offset = i4;
        int i5 = i3 + (bArr[i2] & 255);
        int i6 = i + 3;
        this.offset = i6;
        byte b = bArr[i4];
        int i7 = i + 4;
        this.offset = i7;
        byte b2 = bArr[i6];
        int i8 = i + 5;
        this.offset = i8;
        byte b3 = bArr[i7];
        int i9 = i + 6;
        this.offset = i9;
        byte b4 = bArr[i8];
        this.offset = i + 7;
        byte b5 = bArr[i9];
        int int32Value = readInt32Value();
        byte[] bArr2 = SHANGHAI_ZONE_ID_NAME_BYTES;
        if (this.offset + bArr2.length >= bArr.length) {
            zoneId = DateUtils.getZoneId(readString(), DateUtils.SHANGHAI_ZONE_ID);
            break;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= bArr2.length) {
                this.offset += bArr2.length;
                zoneId = DateUtils.SHANGHAI_ZONE_ID;
                break;
            }
            if (bArr[this.offset + i10] != bArr2[i10]) {
                zoneId = DateUtils.getZoneId(readString(), DateUtils.SHANGHAI_ZONE_ID);
                break;
            }
            i10++;
        }
        return ZonedDateTime.of(LocalDateTime.of(i5, b, b2, b3, b4, b5, int32Value), zoneId);
    }

    private String readUTF16BE() {
        int length = readLength();
        this.strlen = length;
        int i = this.offset;
        this.strBegin = i;
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction == null || !JDKUtils.BIG_ENDIAN) {
            return null;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(this.bytes, i, bArr, 0, length);
        String strApply = biFunction.apply(bArr, JDKUtils.UTF16);
        this.offset += this.strlen;
        if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
            strApply = strApply.trim();
        }
        if (!strApply.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
            return strApply;
        }
        return null;
    }

    private String readUTF16LE() {
        byte b = this.bytes[this.offset];
        if (JSONB.isInt32Num(b)) {
            this.offset++;
            this.strlen = b;
        } else if (JSONB.isInt32Byte(b)) {
            this.strlen = getIntByte(this.bytes, this.offset + 1, b);
            this.offset += 2;
        } else {
            this.strlen = readLength();
        }
        int i = this.offset;
        this.strBegin = i;
        int i2 = this.strlen;
        if (i2 == 0) {
            return "";
        }
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        if (biFunction == null || JDKUtils.BIG_ENDIAN) {
            return null;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.bytes, i, bArr, 0, i2);
        String strApply = biFunction.apply(bArr, JDKUtils.UTF16);
        this.offset += this.strlen;
        if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
            strApply = strApply.trim();
        }
        if (!strApply.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
            return strApply;
        }
        return null;
    }

    private ZonedDateTime readZonedDateTime0(int i) {
        if (i == -88) {
            byte[] bArr = this.bytes;
            int i2 = this.offset;
            int i3 = i2 + 1;
            this.offset = i3;
            int i4 = bArr[i2] << 8;
            int i5 = i2 + 2;
            this.offset = i5;
            int i6 = i4 + (bArr[i3] & 255);
            int i7 = i2 + 3;
            this.offset = i7;
            byte b = bArr[i5];
            int i8 = i2 + 4;
            this.offset = i8;
            byte b2 = bArr[i7];
            int i9 = i2 + 5;
            this.offset = i9;
            byte b3 = bArr[i8];
            int i10 = i2 + 6;
            this.offset = i10;
            byte b4 = bArr[i9];
            this.offset = i2 + 7;
            return ZonedDateTime.of(LocalDateTime.of(i6, b, b2, b3, b4, bArr[i10], readInt32Value()), DateUtils.DEFAULT_ZONE_ID);
        }
        if (i == -87) {
            byte[] bArr2 = this.bytes;
            int i11 = this.offset;
            int i12 = i11 + 1;
            this.offset = i12;
            int i13 = bArr2[i11] << 8;
            int i14 = i11 + 2;
            this.offset = i14;
            int i15 = i13 + (bArr2[i12] & 255);
            int i16 = i11 + 3;
            this.offset = i16;
            byte b5 = bArr2[i14];
            this.offset = i11 + 4;
            return ZonedDateTime.of(LocalDate.of(i15, b5, bArr2[i16]), LocalTime.MIN, DateUtils.DEFAULT_ZONE_ID);
        }
        if (i != -66) {
            switch (i) {
                case -85:
                    break;
                case -84:
                    long intBE = IOUtils.getIntBE(this.bytes, check3(this.offset, this.end));
                    this.offset += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(intBE), DateUtils.DEFAULT_ZONE_ID);
                case -83:
                    long intBE2 = IOUtils.getIntBE(this.bytes, check3(this.offset, this.end));
                    this.offset += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(intBE2 * 60), DateUtils.DEFAULT_ZONE_ID);
                case -82:
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(readInt64Value(), readInt32Value()), DateUtils.DEFAULT_ZONE_ID);
                case -81:
                    return null;
                default:
                    if (i < 73 || i > 120) {
                        throw notSupportType((byte) i);
                    }
                    this.offset--;
                    return readZonedDateTimeX(i - 73);
            }
        }
        long longBE = IOUtils.getLongBE(this.bytes, check7(this.offset, this.end));
        this.offset += 8;
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(longBE), DateUtils.DEFAULT_ZONE_ID);
    }

    public static JSONException typeRefNotFound(int i) {
        throw new JSONException(AbstractC1095.m2794(i, "type ref not found : "));
    }

    public void autoTypeError() {
        throw new JSONException("autoType not support : " + getString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public ObjectReader checkAutoType(Class cls, long j, long j2) {
        Class objectClass;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        ObjectReader objectReaderCheckAutoTypeWithHandler;
        ObjectReader objectReader;
        Class objectClass2;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -110) {
            return null;
        }
        this.offset = i + 1;
        JSONReader.Context context = this.context;
        long typeHashCode = readTypeHashCode();
        if (j == typeHashCode && (objectClass2 = (objectReader = context.getObjectReader(cls)).getObjectClass()) != null && objectClass2 == cls) {
            context.provider.registerIfAbsent(typeHashCode, objectReader);
            return objectReader;
        }
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (objectReaderCheckAutoTypeWithHandler = checkAutoTypeWithHandler(cls, j2, autoTypeBeforeHandler, typeHashCode)) != null) {
            return objectReaderCheckAutoTypeWithHandler;
        }
        long j3 = context.features | j2;
        if ((JSONReader.Feature.SupportAutoType.mask & j3) == 0) {
            if ((JSONReader.Feature.ErrorOnNotSupportAutoType.mask & j3) == 0) {
                return null;
            }
            autoTypeError();
        }
        ObjectReader objectReader2 = context.provider.getObjectReader(typeHashCode);
        if (objectReader2 != null && (objectClass = objectReader2.getObjectClass()) != null && (classLoader = objectClass.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
            objectReader2 = getObjectReaderContext(objectReader2, objectClass, contextClassLoader);
        }
        if (objectReader2 == null && (objectReader2 = context.provider.getObjectReader(getString(), cls, j3)) == null) {
            if ((j3 & JSONReader.Feature.ErrorOnNotSupportAutoType.mask) == 0) {
                return null;
            }
            autoTypeError();
        }
        this.type = this.bytes[this.offset];
        return objectReader2;
    }

    public ObjectReader checkAutoTypeWithHandler(Class cls, long j, JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler, long j2) {
        Class<?> clsApply = autoTypeBeforeHandler.apply(j2, (Class<?>) cls, j);
        if (clsApply == null) {
            clsApply = autoTypeBeforeHandler.apply(getString(), (Class<?>) cls, j);
        }
        if (clsApply != null) {
            return this.context.getObjectReader(clsApply);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.valueBytes;
        if (bArr != null && bArr.length < 8388608) {
            JSONFactory.BYTES_UPDATER.lazySet(this.cacheItem, bArr);
        }
        char[] cArr = this.charBuf;
        if (cArr == null || cArr.length >= 8388608) {
            return;
        }
        JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, cArr);
    }

    public String error(byte b) {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(JSONB.typeName(b));
        if (isString()) {
            int i = this.offset;
            this.offset = i - 1;
            try {
                string = readString();
            } catch (Throwable unused) {
                string = null;
            }
            if (string != null) {
                sb.append(' ');
                sb.append(string);
            }
            this.offset = i;
        }
        sb.append(", offset ");
        sb.append(this.offset);
        sb.append('/');
        sb.append(this.bytes.length);
        return sb.toString();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String getFieldName() {
        return getString();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[LOOP:1: B:30:0x0073->B:32:0x0077, LOOP_END] */
    public long getNameHashCode() {
        long j;
        long j2;
        long j3;
        int i = this.strBegin;
        int i2 = 0;
        long j4 = 0;
        int i3 = 0;
        while (i3 < this.strlen) {
            byte[] bArr = this.bytes;
            byte b = bArr[i];
            if (b < 0 || i3 >= 8 || (i3 == 0 && bArr[this.strBegin] == 0)) {
                i = this.strBegin;
                j4 = 0;
                if (j4 != 0) {
                    return j4;
                }
                j = Fnv.MAGIC_HASH_CODE;
                while (i2 < this.strlen) {
                    j = (j ^ ((long) this.bytes[i])) * Fnv.MAGIC_PRIME;
                    i2++;
                    i++;
                }
                return j;
            }
            switch (i3) {
                case 0:
                    j4 = b;
                    continue;
                    i3++;
                    i++;
                    break;
                case 1:
                    j2 = b << 8;
                    j3 = 255;
                    break;
                case 2:
                    j2 = b << 16;
                    j3 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                    break;
                case 3:
                    j2 = b << 24;
                    j3 = 16777215;
                    break;
                case 4:
                    j2 = ((long) b) << 32;
                    j3 = 4294967295L;
                    break;
                case 5:
                    j2 = ((long) b) << 40;
                    j3 = 1099511627775L;
                    break;
                case 6:
                    j2 = ((long) b) << 48;
                    j3 = 281474976710655L;
                    break;
                case 7:
                    j2 = ((long) b) << 56;
                    j3 = 72057594037927935L;
                    break;
                default:
                    continue;
                    i3++;
                    i++;
                    break;
            }
            j4 = (j4 & j3) + j2;
            i3++;
            i++;
        }
        if (j4 != 0) {
            return j4;
        }
        j = Fnv.MAGIC_HASH_CODE;
        while (i2 < this.strlen) {
            j = (j ^ ((long) this.bytes[i])) * Fnv.MAGIC_PRIME;
            i2++;
            i++;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
        byte b;
        long j;
        long j2;
        int i = this.strBegin;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (i3 < this.strlen) {
            byte[] bArr = this.bytes;
            byte b2 = bArr[i];
            if (b2 < 0 || i3 >= 8 || (i3 == 0 && bArr[this.strBegin] == 0)) {
                i = this.strBegin;
                j3 = 0;
                if (j3 != 0) {
                    return j3;
                }
                long j4 = Fnv.MAGIC_HASH_CODE;
                while (i2 < this.strlen) {
                    int i4 = i + 1;
                    b = this.bytes[i];
                    if (b >= 65 && b <= 90) {
                        b = (byte) (b + 32);
                    }
                    if (b == 95 && b != 45 && b != 32) {
                        j4 = (j4 ^ ((long) b)) * Fnv.MAGIC_PRIME;
                    }
                    i2++;
                    i = i4;
                }
                return j4;
            }
            if ((b2 != 95 && b2 != 45 && b2 != 32) || bArr[i + 1] == b2) {
                if (b2 >= 65 && b2 <= 90) {
                    b2 = (byte) (b2 + 32);
                }
                switch (i3) {
                    case 0:
                        j3 = b2;
                        break;
                    case 1:
                        j = b2 << 8;
                        j2 = 255;
                        j3 = (j3 & j2) + j;
                        break;
                    case 2:
                        j = b2 << 16;
                        j2 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        j3 = (j3 & j2) + j;
                        break;
                    case 3:
                        j = b2 << 24;
                        j2 = 16777215;
                        j3 = (j3 & j2) + j;
                        break;
                    case 4:
                        j = ((long) b2) << 32;
                        j2 = 4294967295L;
                        j3 = (j3 & j2) + j;
                        break;
                    case 5:
                        j = ((long) b2) << 40;
                        j2 = 1099511627775L;
                        j3 = (j3 & j2) + j;
                        break;
                    case 6:
                        j = ((long) b2) << 48;
                        j2 = 281474976710655L;
                        j3 = (j3 & j2) + j;
                        break;
                    case 7:
                        j = ((long) b2) << 56;
                        j2 = 72057594037927935L;
                        j3 = (j3 & j2) + j;
                        break;
                }
                i3++;
            }
            i++;
        }
        if (j3 != 0) {
            return j3;
        }
        long j5 = Fnv.MAGIC_HASH_CODE;
        while (i2 < this.strlen) {
            int i5 = i + 1;
            b = this.bytes[i];
            if (b >= 65) {
                b = (byte) (b + 32);
            }
            if (b == 95) {
            }
            i2++;
            i = i5;
        }
        return j5;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int getRawInt() {
        int i = this.offset;
        if (i + 3 < this.end) {
            return JDKUtils.UNSAFE.getInt(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i));
        }
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getRawLong() {
        int i = this.offset;
        if (i + 7 < this.end) {
            return JDKUtils.UNSAFE.getLong(this.bytes, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i));
        }
        return 0L;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String getString() {
        Charset charset;
        byte b = this.strtype;
        int i = this.strlen;
        if (b == -81) {
            return null;
        }
        if (i < 0) {
            return this.symbolTable.getName(-i);
        }
        if (b == 121) {
            charset = StandardCharsets.ISO_8859_1;
        } else if (b < 73 || b > 120) {
            if (b == 122) {
                charset = StandardCharsets.UTF_8;
            } else if (b == 123) {
                charset = StandardCharsets.UTF_16;
            } else if (b == 124) {
                charset = StandardCharsets.UTF_16LE;
            } else {
                if (b != 125) {
                    throw notSupportType(b);
                }
                charset = StandardCharsets.UTF_16BE;
            }
        } else {
            if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                return JDKUtils.latin1StringJDK8(this.bytes, this.strBegin, i);
            }
            BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
            if (biFunction != null) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.bytes, this.strBegin, bArr, 0, i);
                return biFunction.apply(bArr, JDKUtils.LATIN1);
            }
            charset = StandardCharsets.ISO_8859_1;
        }
        return new String(this.bytes, this.strBegin, i, charset);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int getStringLength() {
        byte b = this.bytes[this.offset];
        this.type = b;
        if (b < 73 || b >= 120) {
            throw new UnsupportedOperationException();
        }
        return b - 73;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte getType() {
        return this.bytes[this.offset];
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isArray() {
        byte b;
        int i = this.offset;
        return i < this.end && (b = this.bytes[i]) >= -108 && b <= -92;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isBinary() {
        return this.bytes[this.offset] == -111;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isDate() {
        byte b = this.bytes[this.offset];
        return b >= -89 && b <= -82;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isEnd() {
        return this.offset >= this.end;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isInt() {
        byte b = this.bytes[this.offset];
        return (b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNull() {
        return this.bytes[this.offset] == -81;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNumber() {
        byte b = this.bytes[this.offset];
        return b >= -78 && b <= 72;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isObject() {
        int i = this.offset;
        return i < this.end && this.bytes[i] == -90;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isReference() {
        int i = this.offset;
        byte[] bArr = this.bytes;
        return i < bArr.length && bArr[i] == -109;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isString() {
        int i = this.offset;
        if (i >= this.end) {
            return false;
        }
        byte b = this.bytes[i];
        this.type = b;
        return b >= 73;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public JSONReader.SavePoint mark() {
        return new JSONReader.SavePoint(this.offset, this.type);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
        this.offset++;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayStart() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfInfinity() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c, char c2) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchTypedAny() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -110) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match10(long j) {
        byte[] bArr = this.bytes;
        int i = this.offset + 11;
        if (i >= this.end || (JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i)) - 7) & 72057594037927935L) != j) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match11(long j) {
        byte[] bArr = this.bytes;
        int i = this.offset + 12;
        if (i >= this.end || JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i)) - 8) != j) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match12(long j, byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 13;
        if (i2 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i2)) - 9) != j || bArr[i + 12] != b) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match13(long j, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 14;
        if (i2 + 15 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = BASE;
        long j3 = i3;
        if (unsafe.getLong(bArr, (j2 + j3) - 10) != j || unsafe.getShort(bArr, (j2 + j3) - 2) != i) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match14(long j, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 15;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = BASE;
        long j3 = i2;
        if (unsafe.getLong(bArr, (j2 + j3) - 11) != j || (unsafe.getInt(bArr, (j2 + j3) - 3) & 16777215) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match15(long j, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 16;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = BASE;
        long j3 = i2;
        if (unsafe.getLong(bArr, (j2 + j3) - 12) != j || unsafe.getInt(bArr, (j2 + j3) - 4) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match16(long j, int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 17;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j2 = BASE;
        long j3 = i3;
        if (unsafe.getLong(bArr, (j2 + j3) - 13) != j || unsafe.getInt(bArr, (j2 + j3) - 5) != i || bArr[i2 + 16] != b) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match17(long j, long j2) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 18;
        if (i + 19 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i2;
        if (unsafe.getLong(bArr, (j3 + j4) - 14) != j || (unsafe.getLong(bArr, (j3 + j4) - 6) & 281474976710655L) != j2) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match18(long j, long j2) {
        byte[] bArr = this.bytes;
        int i = this.offset + 19;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i;
        if (unsafe.getLong(bArr, (j3 + j4) - 15) != j || (unsafe.getLong(bArr, (j3 + j4) - 7) & 72057594037927935L) != j2) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match19(long j, long j2) {
        byte[] bArr = this.bytes;
        int i = this.offset + 20;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i;
        if (unsafe.getLong(bArr, (j3 + j4) - 16) != j || unsafe.getLong(bArr, (j3 + j4) - 8) != j2) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match2() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match20(long j, long j2, byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 21;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i2;
        if (unsafe.getLong(bArr, (j3 + j4) - 17) != j || unsafe.getLong(bArr, (j3 + j4) - 9) != j2 || bArr[i + 20] != b) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match21(long j, long j2, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 22;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i2;
        if (unsafe.getLong(bArr, (j3 + j4) - 18) != j || unsafe.getLong(bArr, (j3 + j4) - 10) != j2 || unsafe.getShort(bArr, (j3 + j4) - 2) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match22(long j, long j2, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 23;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i2;
        if (unsafe.getLong(bArr, (j3 + j4) - 19) != j || unsafe.getLong(bArr, (j3 + j4) - 11) != j2 || (unsafe.getInt(bArr, (j3 + j4) - 3) & 16777215) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match23(long j, long j2, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 24;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i2;
        if (unsafe.getLong(bArr, (j3 + j4) - 20) != j || unsafe.getLong(bArr, (j3 + j4) - 12) != j2 || unsafe.getInt(bArr, (j3 + j4) - 4) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match24(long j, long j2, int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 25;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = BASE;
        long j4 = i3;
        if (unsafe.getLong(bArr, (j3 + j4) - 21) != j || unsafe.getLong(bArr, (j3 + j4) - 13) != j2 || unsafe.getInt(bArr, (j3 + j4) - 5) != i || bArr[i2 + 24] != b) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match25(long j, long j2, long j3) {
        byte[] bArr = this.bytes;
        int i = this.offset + 26;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i;
        if (unsafe.getLong(bArr, (j4 + j5) - 22) != j || unsafe.getLong(bArr, (j4 + j5) - 14) != j2 || (unsafe.getLong(bArr, (j4 + j5) - 6) & 281474976710655L) != j3) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match26(long j, long j2, long j3) {
        byte[] bArr = this.bytes;
        int i = this.offset + 27;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i;
        if (unsafe.getLong(bArr, (j4 + j5) - 23) != j || unsafe.getLong(bArr, (j4 + j5) - 15) != j2 || (unsafe.getLong(bArr, (j4 + j5) - 7) & 72057594037927935L) != j3) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match27(long j, long j2, long j3) {
        byte[] bArr = this.bytes;
        int i = this.offset + 28;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i;
        if (unsafe.getLong(bArr, (j4 + j5) - 24) != j || unsafe.getLong(bArr, (j4 + j5) - 16) != j2 || unsafe.getLong(bArr, (j4 + j5) - 8) != j3) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match28(long j, long j2, long j3, byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 29;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i2;
        if (unsafe.getLong(bArr, (j4 + j5) - 25) != j || unsafe.getLong(bArr, (j4 + j5) - 17) != j2 || unsafe.getLong(bArr, (j4 + j5) - 9) != j3 || bArr[i + 28] != b) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match29(long j, long j2, long j3, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 30;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i2;
        if (unsafe.getLong(bArr, (j4 + j5) - 26) != j || unsafe.getLong(bArr, (j4 + j5) - 18) != j2 || unsafe.getLong(bArr, (j4 + j5) - 10) != j3 || unsafe.getShort(bArr, (j4 + j5) - 2) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match3() {
        int i = this.offset + 4;
        if (i > this.end) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match30(long j, long j2, long j3, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 31;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i2;
        if (unsafe.getLong(bArr, (j4 + j5) - 27) != j || unsafe.getLong(bArr, (j4 + j5) - 19) != j2 || unsafe.getLong(bArr, (j4 + j5) - 11) != j3 || (unsafe.getInt(bArr, (j4 + j5) - 3) & 16777215) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match31(long j, long j2, long j3, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 32;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i2;
        if (unsafe.getLong(bArr, (j4 + j5) - 28) != j || unsafe.getLong(bArr, (j4 + j5) - 20) != j2 || unsafe.getLong(bArr, (j4 + j5) - 12) != j3 || unsafe.getInt(bArr, (j4 + j5) - 4) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match32(long j, long j2, long j3, int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 33;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = BASE;
        long j5 = i3;
        if (unsafe.getLong(bArr, (j4 + j5) - 29) != j || unsafe.getLong(bArr, (j4 + j5) - 21) != j2 || unsafe.getLong(bArr, (j4 + j5) - 13) != j3 || unsafe.getInt(bArr, (j4 + j5) - 5) != i || bArr[i2 + 32] != b) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match33(long j, long j2, long j3, long j4) {
        byte[] bArr = this.bytes;
        int i = this.offset + 34;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i;
        if (unsafe.getLong(bArr, (j5 + j6) - 30) != j || unsafe.getLong(bArr, (j5 + j6) - 22) != j2 || unsafe.getLong(bArr, (j5 + j6) - 14) != j3 || (unsafe.getLong(bArr, (j5 + j6) - 6) & 281474976710655L) != j4) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match34(long j, long j2, long j3, long j4) {
        byte[] bArr = this.bytes;
        int i = this.offset + 35;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i;
        if (unsafe.getLong(bArr, (j5 + j6) - 31) != j || unsafe.getLong(bArr, (j5 + j6) - 23) != j2 || unsafe.getLong(bArr, (j5 + j6) - 15) != j3 || (unsafe.getLong(bArr, (j5 + j6) - 7) & 72057594037927935L) != j4) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match35(long j, long j2, long j3, long j4) {
        byte[] bArr = this.bytes;
        int i = this.offset + 36;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i;
        if (unsafe.getLong(bArr, (j5 + j6) - 32) != j || unsafe.getLong(bArr, (j5 + j6) - 24) != j2 || unsafe.getLong(bArr, (j5 + j6) - 16) != j3 || unsafe.getLong(bArr, (j5 + j6) - 8) != j4) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match36(long j, long j2, long j3, long j4, byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 37;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i2;
        if (unsafe.getLong(bArr, (j5 + j6) - 33) != j || unsafe.getLong(bArr, (j5 + j6) - 25) != j2 || unsafe.getLong(bArr, (j5 + j6) - 17) != j3 || unsafe.getLong(bArr, (j5 + j6) - 9) != j4 || bArr[i + 36] != b) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match37(long j, long j2, long j3, long j4, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 38;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i2;
        if (unsafe.getLong(bArr, (j5 + j6) - 34) != j || unsafe.getLong(bArr, (j5 + j6) - 26) != j2 || unsafe.getLong(bArr, (j5 + j6) - 18) != j3 || unsafe.getLong(bArr, (j5 + j6) - 10) != j4 || unsafe.getShort(bArr, (j5 + j6) - 2) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match38(long j, long j2, long j3, long j4, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 39;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i2;
        if (unsafe.getLong(bArr, (j5 + j6) - 35) != j || unsafe.getLong(bArr, (j5 + j6) - 27) != j2 || unsafe.getLong(bArr, (j5 + j6) - 19) != j3 || unsafe.getLong(bArr, (j5 + j6) - 11) != j4 || (unsafe.getInt(bArr, (j5 + j6) - 3) & 16777215) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match39(long j, long j2, long j3, long j4, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 40;
        if (i2 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i2;
        if (unsafe.getLong(bArr, (j5 + j6) - 36) != j || unsafe.getLong(bArr, (j5 + j6) - 28) != j2 || unsafe.getLong(bArr, (j5 + j6) - 20) != j3 || unsafe.getLong(bArr, (j5 + j6) - 12) != j4 || unsafe.getInt(bArr, (j5 + j6) - 4) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match4(byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 5;
        if (i2 > this.end || bArr[i + 4] != b) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match40(long j, long j2, long j3, long j4, int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 41;
        if (i3 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = BASE;
        long j6 = i3;
        if (unsafe.getLong(bArr, (j5 + j6) - 37) != j || unsafe.getLong(bArr, (j5 + j6) - 29) != j2 || unsafe.getLong(bArr, (j5 + j6) - 21) != j3 || unsafe.getLong(bArr, (j5 + j6) - 13) != j4 || unsafe.getInt(bArr, (j5 + j6) - 5) != i || bArr[i2 + 40] != b) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match41(long j, long j2, long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i = this.offset + 42;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = BASE;
        long j7 = i;
        if (unsafe.getLong(bArr, (j6 + j7) - 38) != j || unsafe.getLong(bArr, (j6 + j7) - 30) != j2 || unsafe.getLong(bArr, (j6 + j7) - 22) != j3 || unsafe.getLong(bArr, (j6 + j7) - 14) != j4 || (unsafe.getLong(bArr, (j6 + j7) - 6) & 281474976710655L) != j5) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match42(long j, long j2, long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i = this.offset + 43;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = BASE;
        long j7 = i;
        if (unsafe.getLong(bArr, (j6 + j7) - 39) != j || unsafe.getLong(bArr, (j6 + j7) - 31) != j2 || unsafe.getLong(bArr, (j6 + j7) - 23) != j3 || unsafe.getLong(bArr, (j6 + j7) - 15) != j4 || (unsafe.getLong(bArr, (j6 + j7) - 7) & 72057594037927935L) != j5) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match43(long j, long j2, long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i = this.offset + 44;
        if (i >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j6 = BASE;
        long j7 = i;
        if (unsafe.getLong(bArr, (j6 + j7) - 40) != j || unsafe.getLong(bArr, (j6 + j7) - 32) != j2 || unsafe.getLong(bArr, (j6 + j7) - 24) != j3 || unsafe.getLong(bArr, (j6 + j7) - 16) != j4 || unsafe.getLong(bArr, (j6 + j7) - 8) != j5) {
            return false;
        }
        this.offset = i;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match5(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 6;
        if (i2 > this.end || JDKUtils.UNSAFE.getShort(bArr, (BASE + ((long) i2)) - 2) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match6(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 7;
        if (i2 > this.end || (JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i2)) - 3) & 16777215) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match7(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset + 8;
        if (i2 > this.end || JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i2)) - 4) != i) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match8(int i, byte b) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = i2 + 9;
        if (i3 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (BASE + ((long) i3)) - 5) != i || bArr[i2 + 8] != b) {
            return false;
        }
        this.offset = i3;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match9(long j) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 10;
        if (i + 11 >= this.end || (JDKUtils.UNSAFE.getLong(bArr, (BASE + ((long) i2)) - 6) & 281474976710655L) != j) {
            return false;
        }
        this.offset = i2;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNull() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -81) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
        int i = this.offset;
        byte b = this.bytes[i];
        if (b != -81 && b != 73) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
        int i = this.offset;
        if (this.bytes[i] != -91) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
        int i = this.offset;
        if (this.bytes[i] != -90) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfSet() {
        return false;
    }

    public JSONException notSupportString() {
        throw new JSONException("readString not support type " + JSONB.typeName(this.strtype) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(Type type) {
        JSONReader.Context context = this.context;
        return (T) context.provider.getObjectReader(type, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(this, null, null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONReaderJSONB] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    @Override // com.alibaba.fastjson2.JSONReader
    public Object readAny() {
        Object fieldName;
        ?? r17;
        Object object;
        String str;
        String str2;
        int i = this.end;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        if (i2 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.offset + "/" + bArr.length);
        }
        int i3 = i2 + 1;
        this.offset = i3;
        byte b = bArr[i2];
        this.type = b;
        if (b == 72) {
            int intBE = IOUtils.getIntBE(bArr, check3(i3, i));
            this.offset += 4;
            return Integer.valueOf(intBE);
        }
        Class cls = null;
        switch (b) {
            case -112:
                return Character.valueOf((char) readInt32Value());
            case -111:
                int length = readLength();
                byte[] bArr2 = this.bytes;
                int i4 = this.offset;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i4, i4 + length);
                this.offset += length;
                return bArrCopyOfRange;
            case -110:
                long typeHashCode = readTypeHashCode();
                JSONReader.Context context = this.context;
                JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = context.autoTypeBeforeHandler;
                if (autoTypeBeforeHandler != null) {
                    Class<?> clsApply = autoTypeBeforeHandler.apply(typeHashCode, (Class<?>) null, context.features);
                    if (clsApply == null) {
                        String string = getString();
                        JSONReader.Context context2 = this.context;
                        clsApply = context2.autoTypeBeforeHandler.apply(string, (Class<?>) null, context2.features);
                    }
                    if (clsApply != null) {
                        return this.context.getObjectReader(clsApply).readJSONBObject(this, null, null, 0L);
                    }
                }
                JSONReader.Context context3 = this.context;
                if ((context3.features & JSONReader.Feature.SupportAutoType.mask) == 0) {
                    if (isObject()) {
                        return readObject();
                    }
                    if (isArray()) {
                        return readArray();
                    }
                    throw new JSONException("autoType not support , offset " + this.offset + "/" + bArr.length);
                }
                ObjectReader objectReaderAutoType = context3.getObjectReaderAutoType(typeHashCode);
                if (objectReaderAutoType == null) {
                    String string2 = getString();
                    ObjectReader objectReaderAutoType2 = this.context.getObjectReaderAutoType(string2, null);
                    if (objectReaderAutoType2 == null) {
                        StringBuilder sbM4625 = AbstractC2647.m4625("autoType not support : ", string2, ", offset ");
                        sbM4625.append(this.offset);
                        sbM4625.append("/");
                        sbM4625.append(bArr.length);
                        throw new JSONException(sbM4625.toString());
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                return objectReaderAutoType.readJSONBObject(this, null, null, 0L);
            default:
                byte b2 = 73;
                int i5 = 0;
                switch (b) {
                    case -90:
                        ?? r3 = 1;
                        boolean z = (this.context.features & JSONReader.Feature.SupportAutoType.mask) != 0;
                        Map jSONObject = null;
                        while (true) {
                            int i6 = this.offset;
                            byte b3 = bArr[i6];
                            if (b3 == -91) {
                                this.offset = i6 + r3;
                                if (jSONObject == null) {
                                    return (this.context.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject();
                                }
                                return jSONObject;
                            }
                            if (!z || i5 != 0 || b3 < b2) {
                                fieldName = b3 >= b2 ? readFieldName() : readAny();
                            } else {
                                if (readFieldNameHashCode() == ObjectReader.HASH_TYPE) {
                                    ObjectReader objectReaderAutoType3 = this.context.getObjectReaderAutoType(readValueHashCode());
                                    if (objectReaderAutoType3 == null) {
                                        String string3 = getString();
                                        ObjectReader objectReaderAutoType4 = this.context.getObjectReaderAutoType(string3, cls);
                                        if (objectReaderAutoType4 == null) {
                                            StringBuilder sbM4626 = AbstractC2647.m4625("autoType not support : ", string3, ", offset ");
                                            sbM4626.append(this.offset);
                                            sbM4626.append("/");
                                            sbM4626.append(bArr.length);
                                            throw new JSONException(sbM4626.toString());
                                        }
                                        objectReaderAutoType3 = objectReaderAutoType4;
                                    }
                                    this.typeRedirect = r3;
                                    return objectReaderAutoType3.readJSONBObject(this, null, null, 0L);
                                }
                                fieldName = getFieldName();
                            }
                            if (jSONObject == null) {
                                ?? r18 = r3;
                                if ((JSONReader.Feature.UseNativeObject.mask & this.context.features) != 0) {
                                    jSONObject = new HashMap();
                                    r17 = r18;
                                } else {
                                    jSONObject = new JSONObject();
                                    r17 = r18;
                                }
                            } else {
                                r17 = r3;
                            }
                            if (isReference()) {
                                String reference = readReference();
                                if ("..".equals(reference)) {
                                    jSONObject.put(fieldName, jSONObject);
                                } else {
                                    addResolveTask(jSONObject, fieldName, JSONPath.of(reference));
                                    jSONObject.put(fieldName, cls);
                                }
                            } else {
                                byte b4 = bArr[this.offset];
                                if (b4 >= b2 && b4 <= 126) {
                                    object = readString();
                                } else if (JSONB.isInt32Num(b4)) {
                                    this.offset++;
                                    object = Integer.valueOf(b4);
                                } else if (b4 == -79) {
                                    this.offset++;
                                    object = Boolean.TRUE;
                                } else if (b4 == -80) {
                                    this.offset++;
                                    object = Boolean.FALSE;
                                } else {
                                    object = b4 == -90 ? readObject() : readAny();
                                }
                                if (object != null || (this.context.features & JSONReader.Feature.IgnoreNullPropertyValue.mask) == 0) {
                                    jSONObject.put(fieldName, object);
                                }
                            }
                            i5++;
                            r3 = r17;
                            cls = null;
                            b2 = 73;
                        }
                        break;
                    case -89:
                        int i7 = i2 + 2;
                        this.offset = i7;
                        byte b5 = bArr[i3];
                        int i8 = i2 + 3;
                        this.offset = i8;
                        byte b6 = bArr[i7];
                        this.offset = i2 + 4;
                        return LocalTime.of(b5, b6, bArr[i8], readInt32Value());
                    case -88:
                        int i9 = i2 + 2;
                        this.offset = i9;
                        int i10 = bArr[i3] << 8;
                        int i11 = i2 + 3;
                        this.offset = i11;
                        int i12 = i10 + (bArr[i9] & 255);
                        int i13 = i2 + 4;
                        this.offset = i13;
                        byte b7 = bArr[i11];
                        int i14 = i2 + 5;
                        this.offset = i14;
                        byte b8 = bArr[i13];
                        int i15 = i2 + 6;
                        this.offset = i15;
                        byte b9 = bArr[i14];
                        int i16 = i2 + 7;
                        this.offset = i16;
                        byte b10 = bArr[i15];
                        this.offset = i2 + 8;
                        return LocalDateTime.of(i12, b7, b8, b9, b10, bArr[i16], readInt32Value());
                    case -87:
                        int i17 = i2 + 2;
                        this.offset = i17;
                        int i18 = bArr[i3] << 8;
                        int i19 = i2 + 3;
                        this.offset = i19;
                        int i20 = i18 + (bArr[i17] & 255);
                        int i21 = i2 + 4;
                        this.offset = i21;
                        byte b11 = bArr[i19];
                        this.offset = i2 + 5;
                        return LocalDate.of(i20, b11, bArr[i21]);
                    case -86:
                        return readTimestampWithTimeZone();
                    case -85:
                        long longBE = IOUtils.getLongBE(bArr, check7(i3, i));
                        this.offset += 8;
                        return new Date(longBE);
                    case -84:
                        long intBE2 = IOUtils.getIntBE(bArr, check3(i3, i));
                        this.offset += 4;
                        return new Date(intBE2 * 1000);
                    case -83:
                        long intBE3 = IOUtils.getIntBE(bArr, check3(i3, i));
                        this.offset += 4;
                        return new Date(intBE3 * 60000);
                    case -82:
                        return Instant.ofEpochSecond(readInt64Value(), readInt32Value());
                    case -81:
                        return null;
                    case -80:
                        return Boolean.FALSE;
                    case -79:
                        return Boolean.TRUE;
                    case -78:
                        return Double.valueOf(0.0d);
                    case -77:
                        return Double.valueOf(1.0d);
                    case -76:
                        return Double.valueOf(readInt64Value());
                    case -75:
                        long longBE2 = IOUtils.getLongBE(bArr, check7(i3, i));
                        this.offset += 8;
                        return Double.valueOf(Double.longBitsToDouble(longBE2));
                    case -74:
                        return Float.valueOf(readInt32Value());
                    case -73:
                        int intBE4 = IOUtils.getIntBE(bArr, check3(i3, i));
                        this.offset += 4;
                        return Float.valueOf(Float.intBitsToFloat(intBE4));
                    case -72:
                        return BigDecimal.valueOf(readInt64Value());
                    case -71:
                        int int32Value = readInt32Value();
                        BigInteger bigInteger = readBigInteger();
                        return int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value);
                    case -70:
                        return BigInteger.valueOf(readInt64Value());
                    case -69:
                        int int32Value2 = readInt32Value();
                        byte[] bArr3 = new byte[int32Value2];
                        System.arraycopy(bArr, this.offset, bArr3, 0, int32Value2);
                        this.offset += int32Value2;
                        return new BigInteger(bArr3);
                    case -68:
                        int i22 = i2 + 2;
                        this.offset = i22;
                        int i23 = bArr[i3] << 8;
                        this.offset = i2 + 3;
                        return Short.valueOf((short) (i23 + (bArr[i22] & 255)));
                    case -67:
                        this.offset = i2 + 2;
                        return Byte.valueOf(bArr[i3]);
                    case -66:
                        long longBE3 = IOUtils.getLongBE(bArr, check7(i3, i));
                        this.offset += 8;
                        return Long.valueOf(longBE3);
                    case -65:
                        int intBE5 = IOUtils.getIntBE(bArr, check3(i3, i));
                        this.offset += 4;
                        return Long.valueOf(intBE5);
                    default:
                        switch (b) {
                            case 122:
                                int length2 = readLength();
                                BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
                                if (biFunction != null && !JDKUtils.BIG_ENDIAN) {
                                    if (this.valueBytes == null) {
                                        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(this.cacheItem, null);
                                        this.valueBytes = andSet;
                                        if (andSet == null) {
                                            this.valueBytes = new byte[8192];
                                        }
                                    }
                                    int i24 = length2 << 1;
                                    if (i24 > this.valueBytes.length) {
                                        this.valueBytes = new byte[i24];
                                    }
                                    int iDecodeUTF8 = IOUtils.decodeUTF8(bArr, this.offset, length2, this.valueBytes);
                                    if (iDecodeUTF8 != -1) {
                                        byte[] bArr4 = new byte[iDecodeUTF8];
                                        System.arraycopy(this.valueBytes, 0, bArr4, 0, iDecodeUTF8);
                                        String strApply = biFunction.apply(bArr4, JDKUtils.UTF16);
                                        this.offset += length2;
                                        return strApply;
                                    }
                                }
                                String str3 = new String(bArr, this.offset, length2, StandardCharsets.UTF_8);
                                this.offset += length2;
                                return str3;
                            case Opcodes.LSHR /* 123 */:
                                int length3 = readLength();
                                String str4 = new String(bArr, this.offset, length3, StandardCharsets.UTF_16);
                                this.offset += length3;
                                return str4;
                            case Opcodes.IUSHR /* 124 */:
                                int length4 = readLength();
                                BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
                                if (biFunction2 == null || JDKUtils.BIG_ENDIAN) {
                                    str = new String(bArr, this.offset, length4, StandardCharsets.UTF_16LE);
                                } else {
                                    byte[] bArr5 = new byte[length4];
                                    System.arraycopy(bArr, this.offset, bArr5, 0, length4);
                                    str = biFunction2.apply(bArr5, length4 == 0 ? JDKUtils.LATIN1 : JDKUtils.UTF16);
                                }
                                this.offset += length4;
                                return str;
                            case Opcodes.LUSHR /* 125 */:
                                int length5 = readLength();
                                BiFunction<byte[], Byte, String> biFunction3 = JDKUtils.STRING_CREATOR_JDK11;
                                if (biFunction3 == null || !JDKUtils.BIG_ENDIAN) {
                                    str2 = new String(bArr, this.offset, length5, StandardCharsets.UTF_16BE);
                                } else {
                                    byte[] bArr6 = new byte[length5];
                                    System.arraycopy(bArr, this.offset, bArr6, 0, length5);
                                    str2 = biFunction3.apply(bArr6, length5 == 0 ? JDKUtils.LATIN1 : JDKUtils.UTF16);
                                }
                                this.offset += length5;
                                return str2;
                            case 126:
                                if (GB18030 == null) {
                                    GB18030 = Charset.forName("GB18030");
                                }
                                int length6 = readLength();
                                String str5 = new String(bArr, this.offset, length6, GB18030);
                                this.offset += length6;
                                return str5;
                            default:
                                if (JSONB.isInt32Num(b)) {
                                    return Integer.valueOf(b);
                                }
                                if (JSONB.isInt32Byte(b)) {
                                    int i25 = this.offset;
                                    this.offset = i25 + 1;
                                    return Integer.valueOf(getIntByte(bArr, i25, b));
                                }
                                if (JSONB.isInt32Short(b)) {
                                    int i26 = this.offset;
                                    if (i26 + 1 < i) {
                                        int int3 = getInt3(bArr, i26, b);
                                        this.offset += 2;
                                        return Integer.valueOf(int3);
                                    }
                                }
                                if (JSONB.isInt64Num(b)) {
                                    return Long.valueOf(((long) (b + 40)) - 8);
                                }
                                if (JSONB.isInt64Byte(b)) {
                                    int i27 = this.offset;
                                    this.offset = i27 + 1;
                                    return Long.valueOf(getLongByte(bArr, i27, b));
                                }
                                if (JSONB.isInt64Short(b)) {
                                    int i28 = this.offset;
                                    if (i28 + 1 < i) {
                                        long long3 = getLong3(bArr, i28, b);
                                        this.offset += 2;
                                        return Long.valueOf(long3);
                                    }
                                }
                                if (b >= -108 && b <= -92) {
                                    int length7 = b == -92 ? readLength() : b + 108;
                                    if (length7 == 0) {
                                        JSONReader.Context context4 = this.context;
                                        if ((context4.features & JSONReader.Feature.UseNativeObject.mask) != 0) {
                                            return new ArrayList();
                                        }
                                        Supplier<List> supplier = context4.arraySupplier;
                                        return supplier != null ? supplier.get() : new JSONArray();
                                    }
                                    List arrayList = (this.context.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(length7) : new JSONArray(length7);
                                    while (i5 < length7) {
                                        if (isReference()) {
                                            String reference2 = readReference();
                                            if ("..".equals(reference2)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                addResolveTask(arrayList, i5, JSONPath.of(reference2));
                                            }
                                        } else {
                                            arrayList.add(readAny());
                                        }
                                        i5++;
                                    }
                                    return arrayList;
                                }
                                if (b < 73 || b > 121) {
                                    if (b != 127) {
                                        throw new JSONException("not support type : " + error(b));
                                    }
                                    int length8 = readLength();
                                    this.strlen = length8;
                                    if (length8 < 0) {
                                        return this.symbolTable.getName(-length8);
                                    }
                                    throw new JSONException("not support symbol : " + this.strlen);
                                }
                                int length9 = b == 121 ? readLength() : b - 73;
                                this.strlen = length9;
                                if (length9 < 0) {
                                    return this.symbolTable.getName(-length9);
                                }
                                if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                                    String strLatin1StringJDK8 = JDKUtils.latin1StringJDK8(bArr, this.offset, length9);
                                    this.offset += this.strlen;
                                    if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                                        strLatin1StringJDK8 = strLatin1StringJDK8.trim();
                                    }
                                    if (!strLatin1StringJDK8.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                                        return strLatin1StringJDK8;
                                    }
                                    return null;
                                }
                                BiFunction<byte[], Byte, String> biFunction4 = JDKUtils.STRING_CREATOR_JDK11;
                                if (biFunction4 == null) {
                                    String str6 = new String(bArr, this.offset, length9, StandardCharsets.ISO_8859_1);
                                    this.offset += this.strlen;
                                    if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                                        str6 = str6.trim();
                                    }
                                    if (!str6.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                                        return str6;
                                    }
                                    return null;
                                }
                                byte[] bArr7 = new byte[length9];
                                System.arraycopy(bArr, this.offset, bArr7, 0, length9);
                                this.offset += this.strlen;
                                String strApply2 = biFunction4.apply(bArr7, JDKUtils.LATIN1);
                                if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                                    strApply2 = strApply2.trim();
                                }
                                if (!strApply2.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
                                    return strApply2;
                                }
                                return null;
                        }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    public Object readAnyObject() {
        ObjectReader objectReader;
        Class objectClass;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -110) {
            return readAny();
        }
        JSONReader.Context context = this.context;
        this.offset = i + 1;
        long typeHashCode = readTypeHashCode();
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler == null) {
            objectReader = null;
        } else {
            Class<?> clsApply = autoTypeBeforeHandler.apply(typeHashCode, Object.class, 0L);
            if (clsApply == null) {
                clsApply = autoTypeBeforeHandler.apply(getString(), Object.class, 0L);
            }
            if (clsApply != null) {
                objectReader = context.getObjectReader(clsApply);
            } else {
                objectReader = null;
            }
        }
        long j = context.features;
        if (objectReader == null) {
            if ((JSONReader.Feature.SupportAutoType.mask & j) == 0) {
                if ((JSONReader.Feature.ErrorOnNotSupportAutoType.mask & j) == 0) {
                    return null;
                }
                autoTypeError();
            }
            objectReader = context.provider.getObjectReader(typeHashCode);
        }
        if (objectReader != null && (objectClass = objectReader.getObjectClass()) != null && (classLoader = objectClass.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
            objectReader = getObjectReaderContext(objectReader, objectClass, contextClassLoader);
        }
        if (objectReader == null && (objectReader = context.provider.getObjectReader(getString(), Object.class, j)) == null) {
            if ((JSONReader.Feature.ErrorOnNotSupportAutoType.mask & j) == 0) {
                return null;
            }
            autoTypeError();
        }
        ObjectReader objectReader2 = objectReader;
        this.type = this.bytes[this.offset];
        return objectReader2.readJSONBObject(this, Object.class, null, context.features);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    @Override // com.alibaba.fastjson2.JSONReader
    public List readArray() {
        Object any;
        String reference;
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i = 0; i < iStartArray; i++) {
            int i2 = this.bytes[this.offset];
            if (i2 >= 73 && i2 <= 126) {
                any = readString();
            } else if (JSONB.isInt32Num(i2)) {
                this.offset++;
                any = Integer.valueOf(i2);
            } else if (i2 == -79) {
                this.offset++;
                any = Boolean.TRUE;
            } else if (i2 == -80) {
                this.offset++;
                any = Boolean.FALSE;
            } else if (i2 == -90) {
                any = readObject();
            } else if (i2 == -66) {
                int i3 = this.offset + 1;
                this.offset = i3;
                any = Long.valueOf(IOUtils.getLongBE(this.bytes, check7(i3, this.end)));
                this.offset += 8;
            } else if (i2 >= -108 && i2 <= -92) {
                this.offset++;
                int length = i2 == -92 ? readLength() : i2 + Opcodes.IDIV;
                if (length == 0) {
                    JSONReader.Context context = this.context;
                    if ((context.features & JSONReader.Feature.UseNativeObject.mask) != 0) {
                        any = new ArrayList();
                    } else {
                        Supplier<List> supplier = context.arraySupplier;
                        any = supplier != null ? supplier.get() : new JSONArray();
                    }
                } else {
                    List arrayList = (this.context.features & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(length) : new JSONArray(length);
                    for (int i4 = 0; i4 < length; i4++) {
                        if (isReference()) {
                            String reference2 = readReference();
                            if ("..".equals(reference2)) {
                                arrayList.add(arrayList);
                            } else {
                                arrayList.add(null);
                                addResolveTask(arrayList, i4, JSONPath.of(reference2));
                            }
                        } else {
                            byte b = this.bytes[this.offset];
                            arrayList.add((b < 73 || b > 126) ? b == -90 ? readObject() : readAny() : readString());
                        }
                    }
                    any = arrayList;
                }
            } else if (JSONB.isInt32Byte(i2)) {
                any = Integer.valueOf(getIntByte(this.bytes, this.offset + 1, i2));
                this.offset += 2;
            } else {
                if (JSONB.isInt64Short(i2)) {
                    int i5 = this.offset;
                    if (i5 + 2 < this.end) {
                        int long3 = getLong3(this.bytes, i5 + 1, i2);
                        this.offset += 3;
                        any = Integer.valueOf(long3);
                    } else if (i2 == 72) {
                        any = Integer.valueOf(IOUtils.getIntBE(this.bytes, check3(this.offset + 1, this.end)));
                        this.offset += 5;
                    } else if (i2 == -109) {
                        reference = readReference();
                        if ("..".equals(reference)) {
                            any = jSONArray;
                        } else {
                            addResolveTask(jSONArray, i, JSONPath.of(reference));
                        }
                    } else {
                        any = readAny();
                    }
                } else if (i2 == 72) {
                    any = Integer.valueOf(IOUtils.getIntBE(this.bytes, check3(this.offset + 1, this.end)));
                    this.offset += 5;
                } else if (i2 == -109) {
                    reference = readReference();
                    if ("..".equals(reference)) {
                        any = jSONArray;
                    } else {
                        addResolveTask(jSONArray, i, JSONPath.of(reference));
                    }
                } else {
                    any = readAny();
                }
            }
            jSONArray.add(any);
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigDecimal readBigDecimal() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b != -71) {
            return b == -72 ? BigDecimal.valueOf(readInt64Value()) : readDecimal0(b);
        }
        int int32Value = readInt32Value();
        int i2 = this.offset;
        byte b2 = bArr[i2];
        if (b2 == -70) {
            this.offset = i2 + 1;
            return BigDecimal.valueOf(readInt64Value(), int32Value);
        }
        if (b2 == 72) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(IOUtils.getIntBE(bArr, check3(i2 + 1, this.end)), int32Value);
            this.offset += 5;
            return bigDecimalValueOf;
        }
        if (b2 != -66) {
            BigInteger bigInteger = readBigInteger();
            return int32Value == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value);
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(IOUtils.getLongBE(bArr, check7(i2 + 1, this.end)), int32Value);
        this.offset += 9;
        return bigDecimalValueOf2;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigInteger readBigInteger() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(readInt64Value());
        }
        if (b != -69) {
            return readBigInteger0(b);
        }
        int int32Value = readInt32Value();
        byte[] bArr2 = new byte[int32Value];
        System.arraycopy(this.bytes, this.offset, bArr2, 0, int32Value);
        this.offset += int32Value;
        return new BigInteger(bArr2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readBinary() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b != -111) {
            throw notSupportType(b);
        }
        int length = readLength();
        byte[] bArr2 = new byte[length];
        System.arraycopy(this.bytes, this.offset, bArr2, 0, length);
        this.offset += length;
        return bArr2;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Boolean readBool() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b == -81) {
            return null;
        }
        if (b == -79) {
            return Boolean.TRUE;
        }
        return b == -80 ? Boolean.FALSE : Boolean.valueOf(readBoolValue0(b));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readBoolValue() {
        this.wasNull = false;
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b == -79) {
            return true;
        }
        if (b == -80) {
            return false;
        }
        return readBoolValue0(b);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public char readCharValue() {
        int int32Value;
        byte[] bArr = this.bytes;
        int i = this.offset;
        byte b = bArr[i];
        if (b == -112) {
            this.offset = i + 1;
            int32Value = readInt32Value();
        } else {
            if (b == 73) {
                this.offset = i + 1;
                return (char) 0;
            }
            if (b <= 73 || b >= 120) {
                String string = readString();
                if (string == null || string.isEmpty()) {
                    return (char) 0;
                }
                return string.charAt(0);
            }
            this.offset = i + 2;
            int32Value = bArr[i + 1] & 255;
        }
        return (char) int32Value;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date readDate() {
        long j;
        int i;
        int i2 = this.offset;
        byte[] bArr = this.bytes;
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (bArr[i2]) {
            case -89:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.of(1970, 1, 1), readLocalTime()), this.context.getZoneId(), null);
                break;
            case -88:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(readLocalDateTime(), this.context.getZoneId(), null);
                break;
            case -87:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(readLocalDate(), LocalTime.MIN), this.context.getZoneId(), null);
                break;
            case -86:
                this.offset = i2 + 1;
                zonedDateTimeOfLocal = readTimestampWithTimeZone();
                break;
            case -85:
                long longBE = IOUtils.getLongBE(bArr, i2 + 1);
                this.offset += 9;
                return new Date(longBE);
            case -84:
                long intBE = IOUtils.getIntBE(bArr, check3(i2 + 1, this.end));
                this.offset += 5;
                return new Date(intBE * 1000);
            case -83:
                long intBE2 = IOUtils.getIntBE(bArr, check3(i2 + 1, this.end));
                this.offset += 5;
                return new Date(intBE2 * 60000);
            case -82:
                this.offset = i2 + 1;
                return Date.from(Instant.ofEpochSecond(readInt64Value(), readInt32Value()));
        }
        if (zonedDateTimeOfLocal == null) {
            return super.readDate();
        }
        long epochSecond = zonedDateTimeOfLocal.toEpochSecond();
        int nano = zonedDateTimeOfLocal.toLocalTime().getNano();
        if (epochSecond >= 0 || nano <= 0) {
            j = epochSecond * 1000;
            i = nano / 1000000;
        } else {
            j = (epochSecond + 1) * 1000;
            i = (nano / 1000000) - 1000;
        }
        return new Date(j + ((long) i));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public double readDoubleValue() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -75) {
            return readDoubleValue0();
        }
        long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((255 & ((long) bArr[i + 2])) << 48) + (((long) bArr[i + 1]) << 56);
        this.offset = i + 9;
        return Double.longBitsToDouble(j);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:150:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:152:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x04db  */
    /* JADX WARN: Code duplicated, block: B:156:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0389  */
    /* JADX WARN: Code duplicated, block: B:91:0x038c  */
    /* JADX WARN: Code duplicated, block: B:92:0x038e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0392  */
    /* JADX WARN: Code duplicated, block: B:95:0x039e  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public String readFieldName() {
        Charset charset;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i2;
        int i3;
        String strApply;
        BiFunction<byte[], Byte, String> biFunction;
        String string;
        int i4;
        int int32Value;
        int i5;
        long[] jArr;
        byte[] bArr = this.bytes;
        int i6 = this.offset;
        int i7 = i6 + 1;
        this.offset = i7;
        byte b = bArr[i6];
        this.strtype = b;
        String strApply2 = null;
        Charset charset2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        strApply2 = null;
        if (b == -81) {
            return null;
        }
        Object[] objArr = b == 127;
        char c = '\b';
        int i8 = 32;
        if (objArr != false) {
            b = bArr[i7];
            this.strtype = b;
            if (JSONB.isInt32(b)) {
                int int32Value2 = readInt32Value();
                if (int32Value2 < 0) {
                    return this.symbolTable.getName(-int32Value2);
                }
                if (int32Value2 == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    return getFieldName();
                }
                long j11 = this.symbols[(int32Value2 * 2) + 1];
                int i9 = (int) j11;
                this.strtype = (byte) i9;
                this.strlen = i9 >> 8;
                this.strBegin = (int) (j11 >> 32);
                return getString();
            }
            this.offset++;
        }
        int i10 = this.offset;
        this.strBegin = i10;
        if (b != 74) {
            if (b == 75) {
                string = TypeUtils.toString((char) (bArr[i10] & 255), (char) (bArr[i10 + 1] & 255));
                this.strlen = 2;
                this.offset += 2;
            } else if (b < 73 || b > 121) {
                c = '\b';
                i8 = 32;
                if (b == 122) {
                    this.strlen = readLength();
                    this.strBegin = this.offset;
                    BiFunction<byte[], Byte, String> biFunction2 = JDKUtils.STRING_CREATOR_JDK11;
                    if (biFunction2 != null && !JDKUtils.BIG_ENDIAN) {
                        if (this.valueBytes == null) {
                            byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(this.cacheItem, null);
                            this.valueBytes = andSet;
                            if (andSet == null) {
                                this.valueBytes = new byte[8192];
                            }
                        }
                        int i11 = this.strlen;
                        int i12 = i11 << 1;
                        if (i12 > this.valueBytes.length) {
                            this.valueBytes = new byte[i12];
                        }
                        int iDecodeUTF8 = IOUtils.decodeUTF8(bArr, this.offset, i11, this.valueBytes);
                        if (iDecodeUTF8 != -1) {
                            byte[] bArr2 = new byte[iDecodeUTF8];
                            System.arraycopy(this.valueBytes, 0, bArr2, 0, iDecodeUTF8);
                            strApply2 = biFunction2.apply(bArr2, JDKUtils.UTF16);
                            this.offset += this.strlen;
                        }
                    }
                    charset = StandardCharsets.UTF_8;
                } else if (b == 123) {
                    this.strlen = readLength();
                    this.strBegin = this.offset;
                    charset = StandardCharsets.UTF_16;
                } else if (b == 124) {
                    int length = readLength();
                    this.strlen = length;
                    int i13 = this.offset;
                    this.strBegin = i13;
                    BiFunction<byte[], Byte, String> biFunction3 = JDKUtils.STRING_CREATOR_JDK11;
                    if (biFunction3 != null && !JDKUtils.BIG_ENDIAN) {
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, i13, bArr3, 0, length);
                        strApply2 = biFunction3.apply(bArr3, JDKUtils.UTF16);
                        this.offset += this.strlen;
                    }
                    charset = StandardCharsets.UTF_16LE;
                } else if (b == 125) {
                    int length2 = readLength();
                    this.strlen = length2;
                    int i14 = this.offset;
                    this.strBegin = i14;
                    BiFunction<byte[], Byte, String> biFunction4 = JDKUtils.STRING_CREATOR_JDK11;
                    if (biFunction4 != null && JDKUtils.BIG_ENDIAN) {
                        byte[] bArr4 = new byte[length2];
                        System.arraycopy(bArr, i14, bArr4, 0, length2);
                        strApply2 = biFunction4.apply(bArr4, JDKUtils.UTF16);
                        this.offset += this.strlen;
                    }
                    charset = StandardCharsets.UTF_16BE;
                } else if (b == 126) {
                    this.strlen = readLength();
                    if (GB18030 == null) {
                        GB18030 = Charset.forName("GB18030");
                    }
                    charset = GB18030;
                } else {
                    charset = null;
                }
            } else {
                if (b == 121) {
                    this.strlen = readLength();
                    this.strBegin = this.offset;
                } else {
                    int i15 = b + JSONB.Constants.BC_FLOAT;
                    this.strlen = i15;
                    if (i10 + i15 > bArr.length) {
                        throw new JSONException("illegal jsonb data");
                    }
                    switch (i15) {
                        case 3:
                            c = '\b';
                            i8 = 32;
                            j = -1;
                            j2 = ((long) (bArr[i10 + 2] << 16)) + ((((long) bArr[i10 + 1]) & 255) << 8);
                            j3 = ((long) bArr[i10]) & 255;
                            j4 = j2 + j3;
                            j5 = j4;
                            j6 = j;
                            break;
                        case 4:
                            c = '\b';
                            i8 = 32;
                            j = -1;
                            j4 = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i10));
                            j5 = j4;
                            j6 = j;
                            break;
                        case 5:
                            i8 = 32;
                            j = -1;
                            j2 = ((long) bArr[i10 + 4]) << 32;
                            i = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i10));
                            j3 = ((long) i) & 4294967295L;
                            j4 = j2 + j3;
                            j5 = j4;
                            j6 = j;
                            break;
                        case 6:
                            i8 = 32;
                            j = -1;
                            j2 = (((long) bArr[i10 + 5]) << 40) + ((((long) bArr[i10 + 4]) & 255) << 32);
                            i = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i10));
                            j3 = ((long) i) & 4294967295L;
                            j4 = j2 + j3;
                            j5 = j4;
                            j6 = j;
                            break;
                        case 7:
                            i8 = 32;
                            j = -1;
                            j2 = (((long) bArr[i10 + 6]) << 48) + ((((long) bArr[i10 + 5]) & 255) << 40) + ((((long) bArr[i10 + 4]) & 255) << 32);
                            i = JDKUtils.UNSAFE.getInt(bArr, BASE + ((long) i10));
                            j3 = ((long) i) & 4294967295L;
                            j4 = j2 + j3;
                            j5 = j4;
                            j6 = j;
                            break;
                        case 8:
                            c = '\b';
                            i8 = 32;
                            j = -1;
                            j4 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i10));
                            j5 = j4;
                            j6 = j;
                            break;
                        case 9:
                            c = '\b';
                            j = -1;
                            j7 = bArr[i10];
                            j8 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i10) + 1);
                            j6 = j8;
                            j5 = j7;
                            break;
                        case 10:
                            c = '\b';
                            j = -1;
                            Unsafe unsafe = JDKUtils.UNSAFE;
                            long j12 = BASE;
                            long j13 = i10;
                            j7 = unsafe.getShort(bArr, j12 + j13);
                            j8 = unsafe.getLong(bArr, j12 + j13 + 2);
                            j6 = j8;
                            j5 = j7;
                            break;
                        case 11:
                            c = '\b';
                            j = -1;
                            j7 = ((long) (bArr[i10] << 16)) + ((((long) bArr[i10 + 1]) & 255) << 8) + (((long) bArr[i10 + 2]) & 255);
                            j8 = JDKUtils.UNSAFE.getLong(bArr, BASE + ((long) i10) + 3);
                            j6 = j8;
                            j5 = j7;
                            break;
                        case Opcodes.FCONST_1 /* 12 */:
                            c = '\b';
                            j = -1;
                            Unsafe unsafe2 = JDKUtils.UNSAFE;
                            long j14 = BASE;
                            long j15 = i10;
                            j7 = unsafe2.getInt(bArr, j14 + j15);
                            j8 = unsafe2.getLong(bArr, j14 + j15 + 4);
                            j6 = j8;
                            j5 = j7;
                            break;
                        case 13:
                            i8 = 32;
                            j = -1;
                            long j16 = ((long) bArr[i10 + 4]) << 32;
                            Unsafe unsafe3 = JDKUtils.UNSAFE;
                            long j17 = BASE;
                            long j18 = i10;
                            j9 = j16 + (((long) unsafe3.getInt(bArr, j17 + j18)) & 4294967295L);
                            j10 = unsafe3.getLong(bArr, j17 + j18 + 5);
                            j5 = j9;
                            j6 = j10;
                            break;
                        case Opcodes.DCONST_0 /* 14 */:
                            i8 = 32;
                            j = -1;
                            long j19 = (((long) bArr[i10 + 5]) << 40) + ((((long) bArr[i10 + 4]) & 255) << 32);
                            Unsafe unsafe4 = JDKUtils.UNSAFE;
                            long j20 = BASE;
                            long j21 = i10;
                            j9 = j19 + (((long) unsafe4.getInt(bArr, j20 + j21)) & 4294967295L);
                            j10 = unsafe4.getLong(bArr, j20 + j21 + 6);
                            j5 = j9;
                            j6 = j10;
                            break;
                        case 15:
                            j = -1;
                            long j22 = (((long) bArr[i10 + 6]) << 48) + ((((long) bArr[i10 + 5]) & 255) << 40) + ((((long) bArr[i10 + 4]) & 255) << 32);
                            Unsafe unsafe5 = JDKUtils.UNSAFE;
                            long j23 = BASE;
                            long j24 = i10;
                            i8 = 32;
                            j9 = j22 + (((long) unsafe5.getInt(bArr, j23 + j24)) & 4294967295L);
                            j10 = unsafe5.getLong(bArr, j23 + j24 + 7);
                            j5 = j9;
                            j6 = j10;
                            break;
                        case 16:
                            Unsafe unsafe6 = JDKUtils.UNSAFE;
                            long j25 = BASE;
                            c = '\b';
                            long j26 = i10;
                            j = -1;
                            j7 = unsafe6.getLong(bArr, j25 + j26);
                            j6 = unsafe6.getLong(bArr, j25 + j26 + 8);
                            i8 = 32;
                            j5 = j7;
                            break;
                    }
                    i2 = this.strlen;
                    i3 = this.offset;
                    if (bArr[(i3 + i2) - 1] > 0 || j5 == j) {
                        strApply = null;
                    } else if (j6 != j) {
                        long j27 = j5 ^ j6;
                        JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr = JSONFactory.NAME_CACHE2;
                        int length3 = ((int) (j27 ^ (j27 >>> i8))) & (nameCacheEntry2Arr.length - 1);
                        JSONFactory.NameCacheEntry2 nameCacheEntry2 = nameCacheEntry2Arr[length3];
                        if (nameCacheEntry2 == null) {
                            strApply = JDKUtils.STRING_CREATOR_JDK8 != null ? JDKUtils.latin1StringJDK8(bArr, i3, i2) : new String(bArr, i3, i2, StandardCharsets.ISO_8859_1);
                            nameCacheEntry2Arr[length3] = new JSONFactory.NameCacheEntry2(strApply, j5, j6);
                            this.offset += i2;
                        } else {
                            if (nameCacheEntry2.value0 == j5 && nameCacheEntry2.value1 == j6) {
                                this.offset = i3 + i2;
                                strApply = nameCacheEntry2.name;
                            } else {
                                strApply = null;
                            }
                        }
                    } else {
                        long j28 = j5;
                        JSONFactory.NameCacheEntry[] nameCacheEntryArr = JSONFactory.NAME_CACHE;
                        int length4 = ((int) ((j28 >>> i8) ^ j28)) & (nameCacheEntryArr.length - 1);
                        JSONFactory.NameCacheEntry nameCacheEntry = nameCacheEntryArr[length4];
                        if (nameCacheEntry == null) {
                            strApply = JDKUtils.STRING_CREATOR_JDK8 != null ? JDKUtils.latin1StringJDK8(bArr, i3, i2) : new String(bArr, i3, i2, StandardCharsets.ISO_8859_1);
                            nameCacheEntryArr[length4] = new JSONFactory.NameCacheEntry(strApply, j28);
                            this.offset += i2;
                        } else if (nameCacheEntry.value == j28) {
                            this.offset = i3 + i2;
                            strApply = nameCacheEntry.name;
                        } else {
                            strApply = null;
                        }
                    }
                    if (strApply == null) {
                        if (i2 >= 0) {
                            if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                                strApply = JDKUtils.latin1StringJDK8(bArr, this.offset, i2);
                                this.offset += i2;
                            } else {
                                biFunction = JDKUtils.STRING_CREATOR_JDK11;
                                if (biFunction != null) {
                                    byte[] bArr5 = new byte[i2];
                                    System.arraycopy(bArr, this.offset, bArr5, 0, i2);
                                    strApply = biFunction.apply(bArr5, JDKUtils.LATIN1);
                                    this.offset += i2;
                                }
                            }
                        }
                        charset2 = StandardCharsets.ISO_8859_1;
                    }
                    charset = charset2;
                    strApply2 = strApply;
                }
                c = '\b';
                i8 = 32;
                j5 = -1;
                j6 = -1;
                j = -1;
                i2 = this.strlen;
                i3 = this.offset;
                if (bArr[(i3 + i2) - 1] > 0) {
                    strApply = null;
                } else {
                    strApply = null;
                }
                if (strApply == null) {
                    if (i2 >= 0) {
                        if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                            strApply = JDKUtils.latin1StringJDK8(bArr, this.offset, i2);
                            this.offset += i2;
                        } else {
                            biFunction = JDKUtils.STRING_CREATOR_JDK11;
                            if (biFunction != null) {
                                byte[] bArr6 = new byte[i2];
                                System.arraycopy(bArr, this.offset, bArr6, 0, i2);
                                strApply = biFunction.apply(bArr6, JDKUtils.LATIN1);
                                this.offset += i2;
                            }
                        }
                    }
                    charset2 = StandardCharsets.ISO_8859_1;
                }
                charset = charset2;
                strApply2 = strApply;
            }
            i4 = this.strlen;
            if (i4 < 0) {
                strApply2 = this.symbolTable.getName(-i4);
            }
            if (strApply2 == null) {
                strApply2 = new String(bArr, this.offset, this.strlen, charset);
                this.offset += this.strlen;
            }
            if (objArr != false) {
                int32Value = readInt32Value();
                if (int32Value == 0) {
                    this.symbol0Begin = this.strBegin;
                    this.symbol0Length = this.strlen;
                    this.symbol0StrType = b;
                    return strApply2;
                }
                int i16 = int32Value * 2;
                i5 = i16 + 2;
                jArr = this.symbols;
                if (jArr == null) {
                    this.symbols = new long[Math.max(i5, i8)];
                } else if (jArr.length < i5) {
                    this.symbols = Arrays.copyOf(jArr, jArr.length + 16);
                }
                this.symbols[i16 + 1] = (((long) this.strBegin) << 32) + (((long) this.strlen) << c) + ((long) b);
            }
            return strApply2;
        }
        string = TypeUtils.toString((char) (bArr[i10] & 255));
        this.strlen = 1;
        this.offset++;
        strApply2 = string;
        charset = null;
        c = '\b';
        i8 = 32;
        i4 = this.strlen;
        if (i4 < 0) {
            strApply2 = this.symbolTable.getName(-i4);
        }
        if (strApply2 == null) {
            strApply2 = new String(bArr, this.offset, this.strlen, charset);
            this.offset += this.strlen;
        }
        if (objArr != false) {
            int32Value = readInt32Value();
            if (int32Value == 0) {
                this.symbol0Begin = this.strBegin;
                this.symbol0Length = this.strlen;
                this.symbol0StrType = b;
                return strApply2;
            }
            int i17 = int32Value * 2;
            i5 = i17 + 2;
            jArr = this.symbols;
            if (jArr == null) {
                this.symbols = new long[Math.max(i5, i8)];
            } else if (jArr.length < i5) {
                this.symbols = Arrays.copyOf(jArr, jArr.length + 16);
            }
            this.symbols[i17 + 1] = (((long) this.strBegin) << 32) + (((long) this.strlen) << c) + ((long) b);
        }
        return strApply2;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
        int length;
        long j;
        long hashCode;
        int i;
        long j2;
        long j3;
        int int32Value;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        int i4 = i3 + 1;
        this.offset = i4;
        byte b = bArr[i3];
        this.strtype = b;
        boolean z = b == 127;
        char c = '\b';
        byte b2 = b;
        if (z) {
            byte b3 = bArr[i4];
            this.strtype = b3;
            if (JSONB.isInt32(b3)) {
                if (b3 <= 47) {
                    this.offset++;
                } else {
                    int32Value = readInt32Value();
                }
                if (i2 < 0) {
                    i2 = int32Value;
                    i2 = b3;
                    return this.symbolTable.getHashCode(-i2);
                }
                if (i2 == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    if (this.symbol0Hash == 0) {
                        this.symbol0Hash = getNameHashCode();
                    }
                    return this.symbol0Hash;
                }
                int i5 = i2 * 2;
                long[] jArr = this.symbols;
                long j4 = jArr[i5 + 1];
                int i6 = (int) j4;
                this.strtype = (byte) i6;
                this.strlen = i6 >> 8;
                this.strBegin = (int) (j4 >> 32);
                long j5 = jArr[i5];
                if (j5 != 0) {
                    return j5;
                }
                long nameHashCode = getNameHashCode();
                this.symbols[i5] = nameHashCode;
                return nameHashCode;
            }
            this.offset++;
            b2 = b3;
        }
        if (b2 >= 73 && b2 <= 120) {
            length = b2 + JSONB.Constants.BC_FLOAT;
        } else {
            if (b2 != 121 && b2 != 122) {
                throw readFieldNameHashCodeError();
            }
            length = readLength();
        }
        this.strlen = length;
        int i7 = this.offset;
        this.strBegin = i7;
        if (length < 0) {
            hashCode = this.symbolTable.getHashCode(-length);
            c = '\b';
        } else {
            if (length <= 8 && i7 + length <= bArr.length) {
                long j6 = ((long) i7) + BASE;
                switch (length) {
                    case 1:
                        i = bArr[i7];
                        j = i;
                        break;
                    case 2:
                        c = '\b';
                        j = ((long) JDKUtils.UNSAFE.getShort(bArr, j6)) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        break;
                    case 3:
                        j2 = bArr[i7 + 2] << 16;
                        j3 = ((long) JDKUtils.UNSAFE.getShort(bArr, j6)) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                        j = j2 + j3;
                        break;
                    case 4:
                        i = JDKUtils.UNSAFE.getInt(bArr, j6);
                        j = i;
                        break;
                    case 5:
                        j2 = ((long) bArr[i7 + 4]) << 32;
                        j3 = ((long) JDKUtils.UNSAFE.getInt(bArr, j6)) & 4294967295L;
                        j = j2 + j3;
                        break;
                    case 6:
                        c = '\b';
                        Unsafe unsafe = JDKUtils.UNSAFE;
                        j = (((long) unsafe.getShort(bArr, 4 + j6)) << 32) + (((long) unsafe.getInt(bArr, j6)) & 4294967295L);
                        break;
                    case 7:
                        c = '\b';
                        j = (((long) bArr[i7 + 6]) << 48) + ((((long) bArr[i7 + 5]) & 255) << 40) + ((((long) bArr[i7 + 4]) & 255) << 32) + (((long) JDKUtils.UNSAFE.getInt(bArr, j6)) & 4294967295L);
                        break;
                    default:
                        c = '\b';
                        j = JDKUtils.UNSAFE.getLong(bArr, j6);
                        break;
                }
            } else {
                c = '\b';
                j = 0;
            }
            if (j != 0) {
                this.offset += length;
                hashCode = j;
            } else {
                hashCode = -3750763034362895579L;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = this.offset;
                    this.offset = i9 + 1;
                    hashCode = Fnv.MAGIC_PRIME * (((long) bArr[i9]) ^ hashCode);
                }
            }
        }
        if (z) {
            int int32Value2 = bArr[this.offset];
            if (JSONB.isInt32Num(int32Value2)) {
                this.offset++;
            } else {
                int32Value2 = readInt32Value();
            }
            if (int32Value2 == 0) {
                this.symbol0Begin = this.strBegin;
                this.symbol0Length = length;
                this.symbol0StrType = b2;
                this.symbol0Hash = hashCode;
                return hashCode;
            }
            int i10 = int32Value2 << 1;
            int i11 = i10 + 2;
            long[] jArr2 = this.symbols;
            if (jArr2 == null) {
                this.symbols = new long[Math.max(i11, 32)];
            } else if (jArr2.length < i11) {
                this.symbols = Arrays.copyOf(jArr2, i10 + 18);
            }
            long[] jArr3 = this.symbols;
            jArr3[i10] = hashCode;
            jArr3[i10 + 1] = (((long) this.strBegin) << 32) + (((long) length) << c) + ((long) b2);
        }
        return hashCode;
    }

    public JSONException readFieldNameHashCodeError() {
        StringBuilder sb = new StringBuilder("fieldName not support input type ");
        sb.append(JSONB.typeName(this.strtype));
        if (this.strtype == -109) {
            sb.append(" ");
            sb.append(readString());
        }
        sb.append(", offset ");
        sb.append(this.offset);
        return new JSONException(sb.toString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
        return readFieldNameHashCode();
    }

    public String readFixedAsciiString(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        if (i == 1) {
            return TypeUtils.toString((char) (bArr[i2] & 255));
        }
        if (i == 2) {
            return TypeUtils.toString((char) (bArr[i2] & 255), (char) (bArr[i2 + 1] & 255));
        }
        return JDKUtils.STRING_CREATOR_JDK8 != null ? JDKUtils.latin1StringJDK8(bArr, i2, i) : new String(bArr, i2, i, StandardCharsets.ISO_8859_1);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Float readFloat() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        byte b = bArr[i];
        if (b == -73) {
            int i2 = (bArr[i + 4] & 255) + ((bArr[i + 3] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + (bArr[i + 1] << 24);
            this.offset = i + 5;
            return Float.valueOf(Float.intBitsToFloat(i2));
        }
        if (b != -81) {
            return Float.valueOf(readFloat0());
        }
        this.offset = i + 1;
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public float readFloatValue() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -73) {
            return readFloat0();
        }
        int intBE = IOUtils.getIntBE(bArr, check3(i + 1, this.end));
        this.offset = i + 5;
        return Float.intBitsToFloat(intBE);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readHex() {
        String string = readString();
        int length = string.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = string.charAt(i2);
            char cCharAt2 = string.charAt(i2 + 1);
            char c = '7';
            int i3 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c = '0';
            }
            bArr[i] = (byte) ((cCharAt2 - c) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readIfNull() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != -81) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Instant readInstant() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    long intBE = IOUtils.getIntBE(bArr, check3(i2, this.end));
                    this.offset += 4;
                    return Instant.ofEpochSecond(intBE, 0L);
                case -83:
                    long intBE2 = IOUtils.getIntBE(bArr, check3(i2, this.end));
                    this.offset += 4;
                    return Instant.ofEpochSecond(intBE2 * 60, 0L);
                case -82:
                    return Instant.ofEpochSecond(readInt64Value(), readInt32Value());
                case -81:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        long longBE = IOUtils.getLongBE(bArr, check7(i2, this.end));
        this.offset += 8;
        return Instant.ofEpochMilli(longBE);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Integer readInt32() {
        int i;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = this.end;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b == -81) {
            this.offset = i4;
            return null;
        }
        if (!JSONB.isInt32Num(b)) {
            if (JSONB.isInt32Byte(b)) {
                i = b;
                int intByte = getIntByte(bArr, i4, b);
                i4 = i2 + 2;
                i = intByte;
            } else if (!JSONB.isInt32Short(b) || i2 + 2 >= i3) {
                i = b;
                i = b;
                if (b != 72 || i2 + 4 >= i3) {
                    this.offset = i4;
                    return Integer.valueOf(readInt32Value0(bArr, b));
                }
                int intBE = IOUtils.getIntBE(bArr, i4);
                i4 = i2 + 5;
                i = intBE;
            } else {
                i = b;
                int int3 = getInt3(bArr, i4, b);
                i4 = i2 + 3;
                i = int3;
            }
        }
        i = b;
        this.offset = i4;
        return Integer.valueOf(i);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int readInt32Value() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = this.end;
        int i3 = i + 1;
        int intBE = bArr[i];
        if (!JSONB.isInt32Num(intBE)) {
            if (JSONB.isInt32Byte(intBE)) {
                intBE = getIntByte(bArr, i3, intBE);
                i3 = i + 2;
            } else if (JSONB.isInt32Short(intBE) && i + 2 < i2) {
                intBE = getInt3(bArr, i3, intBE);
                i3 = i + 3;
            } else {
                if (intBE != 72 || i + 4 >= i2) {
                    this.offset = i3;
                    return readInt32Value0(bArr, (byte) intBE);
                }
                intBE = IOUtils.getIntBE(bArr, i3);
                i3 = i + 5;
            }
        }
        this.offset = i3;
        return intBE;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int[] readInt32ValueArray() {
        if (nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = readTypeHashCode();
            if (typeHashCode != ObjectReaderImplInt64ValueArray.HASH_TYPE && typeHashCode != ObjectReaderImplInt64Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                throw new JSONException(info("not support " + getString()));
            }
        }
        int iStartArray = startArray();
        if (iStartArray == -1) {
            return null;
        }
        int[] iArr = new int[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            iArr[i] = readInt32Value();
        }
        return iArr;
    }

    public JSONException readInt32ValueError(byte b) {
        throw new JSONException("readInt32Value not support " + JSONB.typeName(b) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Long readInt64() {
        long longBE;
        int i;
        long longByte;
        long j;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = this.end;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b == -81) {
            this.offset = i4;
            return null;
        }
        if (JSONB.isInt64Num(b)) {
            j = b + 32;
        } else {
            if (JSONB.isInt64Byte(b)) {
                longByte = getLongByte(bArr, i4, b);
                i4 = i2 + 2;
            } else {
                if (JSONB.isInt64Short(b) && i2 + 2 < i3) {
                    longBE = getLong3(bArr, i4, b);
                    i = i2 + 3;
                } else if (b == -65 && i2 + 4 < i3) {
                    longBE = IOUtils.getIntBE(bArr, i4);
                    i = i2 + 5;
                } else {
                    if (b != -66 || i2 + 8 >= i3) {
                        this.offset = i4;
                        return Long.valueOf(readInt64Value0(bArr, b));
                    }
                    longBE = IOUtils.getLongBE(bArr, i4);
                    i = i2 + 9;
                }
                longByte = longBE;
                i4 = i;
            }
            j = longByte;
        }
        this.offset = i4;
        return Long.valueOf(j);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readInt64Value() {
        long longBE;
        int i;
        long longByte;
        long j;
        this.wasNull = false;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        int i3 = this.end;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (JSONB.isInt64Num(b)) {
            j = b + 32;
        } else {
            if (JSONB.isInt64Byte(b)) {
                longByte = getLongByte(bArr, i4, b);
                i4 = i2 + 2;
            } else {
                if (JSONB.isInt64Short(b) && i2 + 2 < i3) {
                    longBE = getLong3(bArr, i4, b);
                    i = i2 + 3;
                } else if (b == -65 && i2 + 4 < i3) {
                    longBE = IOUtils.getIntBE(bArr, i4);
                    i = i2 + 5;
                } else {
                    if (b != -66 || i2 + 8 >= i3) {
                        this.offset = i4;
                        return readInt64Value0(bArr, b);
                    }
                    longBE = IOUtils.getLongBE(bArr, i4);
                    i = i2 + 9;
                }
                longByte = longBE;
                i4 = i;
            }
            j = longByte;
        }
        this.offset = i4;
        return j;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long[] readInt64ValueArray() {
        if (nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = readTypeHashCode();
            if (typeHashCode != ObjectReaderImplInt64ValueArray.HASH_TYPE && typeHashCode != ObjectReaderImplInt64Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                throw new JSONException(info("not support " + getString()));
            }
        }
        int iStartArray = startArray();
        if (iStartArray == -1) {
            return null;
        }
        long[] jArr = new long[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            jArr[i] = readInt64Value();
        }
        return jArr;
    }

    public JSONException readInt64ValueError(byte b) {
        throw new JSONException("readInt64Value not support " + JSONB.typeName(b) + ", offset " + this.offset + "/" + this.bytes.length);
    }

    public int readLength() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = this.end;
        int i3 = i + 1;
        int intBE = bArr[i];
        if (!JSONB.isInt32Num(intBE)) {
            if (JSONB.isInt32Byte(intBE)) {
                intBE = getIntByte(bArr, i3, intBE);
                i3 = i + 2;
            } else if (JSONB.isInt32Short(intBE) && i + 2 < i2) {
                intBE = getInt3(bArr, i3, intBE);
                i3 = i + 3;
            } else {
                if (intBE != 72 || i + 4 >= i2) {
                    throw notSupportType((byte) intBE);
                }
                intBE = IOUtils.getIntBE(bArr, i3);
                i3 = i + 5;
                if (intBE > 268435456) {
                    throw new JSONException("input length overflow");
                }
            }
        }
        this.offset = i3;
        return intBE;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List readList(Type[] typeArr) {
        if (nextIfNull()) {
            return null;
        }
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i = 0; i < iStartArray; i++) {
            jSONArray.add(read(typeArr[i]));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate() {
        int i;
        int i2 = this.offset;
        byte[] bArr = this.bytes;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b != -87 || (i = i2 + 4) >= this.end) {
            if (b != -81) {
                return readLocalDate0(b);
            }
            this.offset = i3;
            return null;
        }
        short shortBE = IOUtils.getShortBE(bArr, i3);
        byte b2 = IOUtils.getByte(bArr, i2 + 3);
        byte b3 = IOUtils.getByte(bArr, i);
        this.offset = i2 + 5;
        return LocalDate.of(shortBE, b2, b3);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate10() {
        LocalDate localDate10;
        byte b = this.strtype;
        if ((b == 121 || b == 122) && this.strlen == 10) {
            localDate10 = DateUtils.parseLocalDate10(this.bytes, this.offset);
        } else {
            byte[] bArr = this.bytes;
            int i = this.offset;
            if (bArr[i] != 83 || (localDate10 = DateUtils.parseLocalDate10(bArr, i + 1)) == null) {
                throw new JSONException("date only support string input");
            }
        }
        this.offset += 11;
        return localDate10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate11() {
        LocalDate localDate11;
        byte b = this.strtype;
        if ((b == 121 || b == 122) && this.strlen == 11) {
            localDate11 = DateUtils.parseLocalDate11(this.bytes, this.offset);
        } else {
            byte[] bArr = this.bytes;
            int i = this.offset;
            if (bArr[i] != 84 || (localDate11 = DateUtils.parseLocalDate11(bArr, i + 1)) == null) {
                throw new JSONException("date only support string input");
            }
        }
        this.offset += 12;
        return localDate11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate8() {
        LocalDate localDate8;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 81 || (localDate8 = DateUtils.parseLocalDate8(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 9;
        return localDate8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate9() {
        LocalDate localDate9;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 82 || (localDate9 = DateUtils.parseLocalDate9(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 10;
        return localDate9;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        byte b = bArr[i];
        if (b != -88) {
            if (b != -81) {
                return readLocalDateTime0(b);
            }
            this.offset = i + 1;
            return null;
        }
        int i2 = i + 2;
        this.offset = i2;
        int i3 = bArr[i + 1] << 8;
        int i4 = i + 3;
        this.offset = i4;
        int i5 = i3 + (bArr[i2] & 255);
        int i6 = i + 4;
        this.offset = i6;
        byte b2 = bArr[i4];
        int i7 = i + 5;
        this.offset = i7;
        byte b3 = bArr[i6];
        int i8 = i + 6;
        this.offset = i8;
        byte b4 = bArr[i7];
        int i9 = i + 7;
        this.offset = i9;
        byte b5 = bArr[i8];
        this.offset = i + 8;
        return LocalDateTime.of(i5, b2, b3, b4, b5, bArr[i9], readInt32Value());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime12() {
        LocalDateTime localDateTime12;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 85 || (localDateTime12 = DateUtils.parseLocalDateTime12(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 13;
        return localDateTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime14() {
        LocalDateTime localDateTime14;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 87 || (localDateTime14 = DateUtils.parseLocalDateTime14(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 15;
        return localDateTime14;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime16() {
        LocalDateTime localDateTime16;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 89 || (localDateTime16 = DateUtils.parseLocalDateTime16(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 17;
        return localDateTime16;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime17() {
        LocalDateTime localDateTime17;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 90 || (localDateTime17 = DateUtils.parseLocalDateTime17(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 18;
        return localDateTime17;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime18() {
        LocalDateTime localDateTime18;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 91 || (localDateTime18 = DateUtils.parseLocalDateTime18(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 19;
        return localDateTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime19() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        byte b = bArr[i];
        this.type = b;
        if (b != 92) {
            throw new JSONException("date only support string input");
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(bArr, i + 1);
        if (localDateTime19 == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 20;
        return localDateTime19;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime20() {
        LocalDateTime localDateTime20;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 93 || (localDateTime20 = DateUtils.parseLocalDateTime20(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 21;
        return localDateTime20;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTimeX(int i) {
        LocalDateTime localDateTimeX;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        byte b = bArr[i2];
        this.type = b;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        }
        if (i >= 21 && i <= 29 && (localDateTimeX = DateUtils.parseLocalDateTimeX(bArr, i2 + 1, i)) != null) {
            this.offset = i + 1 + this.offset;
            return localDateTimeX;
        }
        throw new JSONException("illegal LocalDateTime string : " + readString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        byte b = bArr[i];
        if (b == -89) {
            int i2 = i + 2;
            this.offset = i2;
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            this.offset = i3;
            byte b3 = bArr[i2];
            this.offset = i + 4;
            return LocalTime.of(b2, b3, bArr[i3], readInt32Value());
        }
        if (b == -81) {
            this.offset = i + 1;
            return null;
        }
        if (b < 73 || b > 120) {
            throw new UnsupportedOperationException();
        }
        int stringLength = getStringLength();
        if (stringLength == 18) {
            return readLocalTime18();
        }
        switch (stringLength) {
            case 5:
                return readLocalTime5();
            case 6:
                return readLocalTime6();
            case 7:
                return readLocalTime7();
            case 8:
                return readLocalTime8();
            case 9:
                return readLocalTime9();
            case 10:
                return readLocalTime10();
            case 11:
                return readLocalTime11();
            case Opcodes.FCONST_1 /* 12 */:
                return readLocalTime12();
            default:
                throw new JSONException(AbstractC1095.m2794(stringLength, "not support len : "));
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime10() {
        LocalTime localTime10;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 83 || (localTime10 = DateUtils.parseLocalTime10(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 11;
        return localTime10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime11() {
        LocalTime localTime11;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 84 || (localTime11 = DateUtils.parseLocalTime11(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 12;
        return localTime11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime12() {
        LocalTime localTime12;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 85 || (localTime12 = DateUtils.parseLocalTime12(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 13;
        return localTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime15() {
        LocalTime localTime15;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 88 || (localTime15 = DateUtils.parseLocalTime15(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 16;
        return localTime15;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime18() {
        LocalTime localTime18;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 91 || (localTime18 = DateUtils.parseLocalTime18(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 19;
        return localTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime5() {
        LocalTime localTime5;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 78 || (localTime5 = DateUtils.parseLocalTime5(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 6;
        return localTime5;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime6() {
        LocalTime localTime6;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 79 || (localTime6 = DateUtils.parseLocalTime6(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 7;
        return localTime6;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime7() {
        LocalTime localTime7;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 80 || (localTime7 = DateUtils.parseLocalTime7(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 8;
        return localTime7;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime8() {
        LocalTime localTime8;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 81 || (localTime8 = DateUtils.parseLocalTime8(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 9;
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime9() {
        LocalTime localTime8;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 82 || (localTime8 = DateUtils.parseLocalTime8(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.offset += 10;
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readMillis19() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != 92) {
            throw new JSONException("date only support string input");
        }
        long millis19 = DateUtils.parseMillis19(bArr, i + 1, this.context.zoneId);
        this.offset += 20;
        return millis19;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readNull() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        this.type = b;
        if (b == -81) {
            return;
        }
        throw new JSONException("null not match, " + ((int) this.type));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date readNullOrNewDate() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Number readNumber() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (JSONB.isInt32Num(b)) {
            return Integer.valueOf(b);
        }
        if (JSONB.isInt32Byte(b)) {
            byte[] bArr2 = this.bytes;
            int i2 = this.offset;
            this.offset = i2 + 1;
            return Integer.valueOf(getIntByte(bArr2, i2, b));
        }
        int i3 = this.end;
        if (JSONB.isInt32Short(b)) {
            int i4 = this.offset;
            if (i4 + 1 < i3) {
                int int3 = getInt3(this.bytes, i4, b);
                this.offset += 2;
                return Integer.valueOf(int3);
            }
        }
        if (JSONB.isInt64Num(b)) {
            return Long.valueOf(((long) (b + 40)) - 8);
        }
        if (JSONB.isInt64Byte(b)) {
            byte[] bArr3 = this.bytes;
            int i5 = this.offset;
            this.offset = i5 + 1;
            return Long.valueOf(getLongByte(bArr3, i5, b));
        }
        if (JSONB.isInt64Short(b)) {
            int i6 = this.offset;
            if (i6 + 1 < i3) {
                int long3 = getLong3(this.bytes, i6, b);
                this.offset += 2;
                return Integer.valueOf(long3);
            }
        }
        if (b == -110) {
            throw new JSONException(AbstractC2844.m4790("not support input type : ", readString()));
        }
        if (b == 72) {
            int intBE = IOUtils.getIntBE(this.bytes, check3(this.offset, i3));
            this.offset += 4;
            return Integer.valueOf(intBE);
        }
        if (b == 121) {
            int int32Value = readInt32Value();
            String str = new String(this.bytes, this.offset, int32Value, StandardCharsets.ISO_8859_1);
            this.offset += int32Value;
            return TypeUtils.toBigDecimal(str);
        }
        if (b == 122) {
            int int32Value2 = readInt32Value();
            String str2 = new String(this.bytes, this.offset, int32Value2, StandardCharsets.UTF_8);
            this.offset += int32Value2;
            return TypeUtils.toBigDecimal(str2);
        }
        switch (b) {
            case -81:
                return null;
            case -80:
            case -78:
                return Double.valueOf(0.0d);
            case -79:
            case -77:
                return Double.valueOf(1.0d);
            case -76:
                return Double.valueOf(readInt64Value());
            case -75:
                long longBE = IOUtils.getLongBE(this.bytes, check7(this.offset, i3));
                this.offset += 8;
                return Double.valueOf(Double.longBitsToDouble(longBE));
            case -74:
                return Float.valueOf(readInt32Value());
            case -73:
                int intBE2 = IOUtils.getIntBE(this.bytes, check3(this.offset, i3));
                this.offset += 4;
                return Float.valueOf(Float.intBitsToFloat(intBE2));
            case -72:
                return BigDecimal.valueOf(readInt64Value());
            case -71:
                int int32Value3 = readInt32Value();
                BigInteger bigInteger = readBigInteger();
                return int32Value3 == 0 ? new BigDecimal(bigInteger) : new BigDecimal(bigInteger, int32Value3);
            case -70:
                return BigInteger.valueOf(readInt64Value());
            case -69:
                int int32Value4 = readInt32Value();
                byte[] bArr4 = new byte[int32Value4];
                System.arraycopy(this.bytes, this.offset, bArr4, 0, int32Value4);
                this.offset += int32Value4;
                return new BigInteger(bArr4);
            case -68:
                byte[] bArr5 = this.bytes;
                int i7 = this.offset;
                int i8 = (bArr5[i7 + 1] & 255) + (bArr5[i7] << 8);
                this.offset = i7 + 2;
                return Short.valueOf((short) i8);
            case -67:
                byte[] bArr6 = this.bytes;
                int i9 = this.offset;
                this.offset = i9 + 1;
                return Byte.valueOf(bArr6[i9]);
            case -66:
                long longBE2 = IOUtils.getLongBE(this.bytes, check7(this.offset, i3));
                this.offset += 8;
                return Long.valueOf(longBE2);
            case -65:
                int intBE3 = IOUtils.getIntBE(this.bytes, check3(this.offset, i3));
                this.offset += 4;
                return Long.valueOf(intBE3);
            default:
                if (b < 73 || b > 120) {
                    throw notSupportType(b);
                }
                int i10 = b - 73;
                String fixedAsciiString = readFixedAsciiString(i10);
                this.offset += i10;
                return TypeUtils.toBigDecimal(fixedAsciiString);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readNumber0() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONReaderJSONB] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // com.alibaba.fastjson2.JSONReader
    public Map<String, Object> readObject() {
        long j;
        Object any;
        int i;
        int length;
        int i2 = this.end;
        byte[] bArr = this.bytes;
        long j2 = this.context.features;
        int i3 = this.offset;
        int i4 = i3 + 1;
        this.offset = i4;
        byte b = bArr[i3];
        this.type = b;
        if (b == -81) {
            return null;
        }
        if (b < -90) {
            if (b == -110) {
                return (Map) checkAutoType(Map.class, 0L, 0L).readObject(this, null, null, 0L);
            }
            throw notSupportType(b);
        }
        long j3 = JSONReader.Feature.UseNativeObject.mask & j2;
        long j4 = 0;
        byte b2 = JSONB.Constants.BC_OBJECT_END;
        ?? map = j3 != 0 ? (JDKUtils.JVM_VERSION != 8 || bArr[i4] == -91) ? new HashMap() : new HashMap(10) : (JDKUtils.JVM_VERSION != 8 || bArr[i4] == -91) ? new JSONObject() : new JSONObject(10);
        while (true) {
            int i5 = this.offset;
            byte b3 = bArr[i5];
            this.type = b3;
            if (b3 == b2) {
                this.offset = i5 + 1;
                return map;
            }
            Object fieldName = isString() ? readFieldName() : readAny();
            int i6 = this.offset;
            if (i6 >= bArr.length || bArr[i6] != -109) {
                int i7 = bArr[i6];
                if (i7 < 73 || i7 > 126) {
                    if (JSONB.isInt32Num(i7)) {
                        this.offset++;
                        any = Integer.valueOf(i7);
                    } else {
                        j = j4;
                        if (i7 == -79) {
                            this.offset++;
                            any = Boolean.TRUE;
                        } else if (i7 == -80) {
                            this.offset++;
                            any = Boolean.FALSE;
                        } else if (i7 == -90) {
                            any = readObject();
                        } else if (i7 == -66) {
                            any = Long.valueOf(IOUtils.getLongBE(bArr, check7(this.offset + 1, i2)));
                            this.offset += 9;
                        } else if (i7 >= -108 && i7 <= -92) {
                            int i8 = this.offset + 1;
                            this.offset = i8;
                            if (i7 == -92) {
                                length = bArr[i8];
                                if (JSONB.isInt32Num(length)) {
                                    this.offset++;
                                } else {
                                    length = readLength();
                                }
                            } else {
                                length = i7 + Opcodes.IDIV;
                            }
                            if (length != 0) {
                                List arrayList = (JSONReader.Feature.UseNativeObject.mask & j2) != j ? new ArrayList(length) : new JSONArray(length);
                                for (int i9 = 0; i9 < length; i9++) {
                                    if (isReference()) {
                                        String reference = readReference();
                                        if ("..".equals(reference)) {
                                            arrayList.add(arrayList);
                                        } else {
                                            arrayList.add(null);
                                            addResolveTask(arrayList, i9, JSONPath.of(reference));
                                        }
                                    } else {
                                        ?? r13 = bArr[this.offset];
                                        arrayList.add((r13 < 73 || r13 > 126) ? r13 == -90 ? readObject() : readAny() : readString());
                                    }
                                }
                                any = arrayList;
                            } else if ((JSONReader.Feature.UseNativeObject.mask & j2) != j) {
                                any = new ArrayList();
                            } else {
                                Supplier<List> supplier = this.context.arraySupplier;
                                any = supplier != null ? supplier.get() : new JSONArray();
                            }
                        } else if (JSONB.isInt32Byte(i7)) {
                            any = Integer.valueOf(getIntByte(bArr, this.offset + 1, i7));
                            this.offset += 2;
                        } else if (JSONB.isInt32Short(i7)) {
                            int i10 = this.offset;
                            if (i10 + 1 < i2) {
                                int int3 = getInt3(bArr, i10 + 1, i7);
                                this.offset += 3;
                                any = Integer.valueOf(int3);
                            } else if (i7 == 72) {
                                i = this.offset;
                                if (i + 3 < i2) {
                                    int intBE = IOUtils.getIntBE(bArr, i + 1);
                                    this.offset += 5;
                                    any = Integer.valueOf(intBE);
                                } else {
                                    any = readAny();
                                }
                            } else {
                                any = readAny();
                            }
                        } else if (i7 == 72) {
                            i = this.offset;
                            if (i + 3 < i2) {
                                int intBE2 = IOUtils.getIntBE(bArr, i + 1);
                                this.offset += 5;
                                any = Integer.valueOf(intBE2);
                            } else {
                                any = readAny();
                            }
                        } else {
                            any = readAny();
                        }
                    }
                    if (any == null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) == j) {
                        map.put(fieldName, any);
                    }
                } else {
                    any = readString();
                }
                j = j4;
                if (any == null) {
                    map.put(fieldName, any);
                } else {
                    map.put(fieldName, any);
                }
            } else {
                String reference2 = readReference();
                if ("..".equals(reference2)) {
                    map.put(fieldName, map);
                } else {
                    addResolveTask(map, fieldName, JSONPath.of(reference2));
                }
                j = j4;
            }
            j4 = j;
            b2 = JSONB.Constants.BC_OBJECT_END;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public OffsetDateTime readOffsetDateTime() {
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return zonedDateTime.toOffsetDateTime();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public OffsetTime readOffsetTime() {
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return zonedDateTime.toOffsetDateTime().toOffsetTime();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String readPattern() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
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
        throw new JSONException("reference not support input " + error(this.type));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String readString() {
        int length;
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        this.strtype = b;
        String strLatin1StringJDK8 = null;
        if (b == -81) {
            return null;
        }
        this.strBegin = i2;
        if (b >= 73 && b <= 121) {
            if (b == 121) {
                length = bArr[i2];
                if (JSONB.isInt32Num(length)) {
                    this.offset++;
                } else {
                    length = readLength();
                }
                this.strBegin = this.offset;
            } else {
                length = b - 73;
            }
            this.strlen = length;
            if (length >= 0) {
                BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
                if (biFunction != null) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, this.offset, bArr2, 0, length);
                    strLatin1StringJDK8 = biFunction.apply(bArr2, JDKUtils.LATIN1);
                } else if (JDKUtils.STRING_CREATOR_JDK8 != null) {
                    strLatin1StringJDK8 = JDKUtils.latin1StringJDK8(bArr, this.offset, length);
                }
            }
            if (strLatin1StringJDK8 != null) {
                this.offset += length;
                return JSONReader.stringValue(strLatin1StringJDK8, this.context.features);
            }
        }
        return readStringNonAscii();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String[] readStringArray() {
        if (nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && readTypeHashCode() != ObjectReaderImplStringArray.HASH_TYPE) {
            throw new JSONException(info("not support type " + getString()));
        }
        int iStartArray = startArray();
        if (iStartArray == -1) {
            return null;
        }
        String[] strArr = new String[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            strArr[i] = readString();
        }
        return strArr;
    }

    public JSONException readStringError() {
        throw new JSONException("string value not support input " + JSONB.typeName(this.type) + " offset " + this.offset + "/" + this.bytes.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readTypeHashCode() {
        int i;
        int i2;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        byte b = bArr[i3];
        this.strtype = b;
        if (b == 121 && (i = bArr[i3 + 1]) > 8 && i <= 63) {
            if (i <= 47) {
                i2 = i3 + 2;
            } else {
                i = ((i - 56) << 8) + (bArr[i3 + 2] & 255);
                i2 = i3 + 3;
            }
            long j = Fnv.MAGIC_HASH_CODE;
            int i4 = 0;
            int i5 = i2;
            while (i4 < i) {
                j = (j ^ ((long) bArr[i5])) * Fnv.MAGIC_PRIME;
                i4++;
                i5++;
            }
            int i6 = bArr[i5];
            if (i6 >= 0 && i6 <= 47) {
                int i7 = i5 + 1;
                if (i6 == 0) {
                    this.symbol0Begin = i2;
                    this.symbol0Length = i;
                    this.symbol0StrType = b;
                    this.symbol0Hash = j;
                } else {
                    int i8 = i6 * 2;
                    int i9 = i8 + 2;
                    long[] jArr = this.symbols;
                    if (jArr == null) {
                        this.symbols = new long[Math.max(i9, 32)];
                    } else if (jArr.length < i9) {
                        this.symbols = Arrays.copyOf(jArr, i8 + 18);
                    }
                    this.symbols[i8 + 1] = (((long) i2) << 32) + (((long) i) << 8) + ((long) b);
                }
                this.strBegin = i2;
                this.strlen = i;
                this.offset = i7;
                return j;
            }
        }
        return readTypeHashCode0();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0282  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287 A[LOOP:3: B:127:0x0283->B:129:0x0287, LOOP_END] */
    public long readTypeHashCode0() {
        long hashCode;
        long j;
        long j2;
        long j3;
        int int32Value;
        int int32Value2;
        int i;
        int i2;
        long jHashCode64;
        byte b;
        int int32Value3;
        byte[] bArr = this.bytes;
        int i3 = this.offset;
        byte b2 = bArr[i3];
        this.strtype = b2;
        long j4 = 0;
        byte b3 = b2;
        if (b2 == 127) {
            int i4 = i3 + 1;
            this.offset = i4;
            b = bArr[i4];
            this.strtype = b;
            if (JSONB.isInt32(b)) {
                if (b <= 47) {
                    this.offset++;
                    int32Value3 = b;
                } else {
                    int32Value3 = readInt32Value();
                }
                if (int32Value3 < 0) {
                    return this.symbolTable.getHashCode(-int32Value3);
                }
                if (int32Value3 == 0) {
                    this.strtype = this.symbol0StrType;
                    this.strlen = this.symbol0Length;
                    this.strBegin = this.symbol0Begin;
                    if (this.symbol0Hash == 0) {
                        this.symbol0Hash = getNameHashCode();
                    }
                    return this.symbol0Hash;
                }
                int i5 = int32Value3 * 2;
                long[] jArr = this.symbols;
                long j5 = jArr[i5 + 1];
                int i6 = (int) j5;
                this.strtype = (byte) i6;
                this.strlen = i6 >> 8;
                this.strBegin = (int) (j5 >> 32);
                long j6 = jArr[i5];
                if (j6 != 0) {
                    return j6;
                }
                long nameHashCode = getNameHashCode();
                this.symbols[i5] = nameHashCode;
                return nameHashCode;
            }
        }
        b3 = b;
        if (JSONB.isInt32(b3)) {
            if (b3 <= 47) {
                this.offset++;
                i2 = b3;
            } else if (b3 <= 63) {
                int i7 = this.offset;
                int i8 = (b3 + JSONB.Constants.BC_INT64_BYTE_MIN) << 8;
                this.offset = i7 + 2;
                i = i8 + (bArr[i7 + 1] & 255);
            } else {
                int32Value2 = readInt32Value();
            }
            if (i2 == 0) {
                i2 = int32Value2;
                i2 = i;
                this.strtype = this.symbol0StrType;
                this.strlen = this.symbol0Length;
                this.strBegin = this.symbol0Begin;
                if (this.symbol0Hash == 0) {
                    this.symbol0Hash = Fnv.hashCode64(getString());
                }
                jHashCode64 = this.symbol0Hash;
            } else if (i2 < 0) {
                this.strlen = b3;
                jHashCode64 = this.symbolTable.getHashCode(-i2);
            } else {
                long[] jArr2 = this.symbols;
                int i9 = i2 * 2;
                long j7 = jArr2[i9];
                if (j7 == 0) {
                    long j8 = jArr2[i9 + 1];
                    int i10 = (int) j8;
                    this.strtype = (byte) i10;
                    this.strlen = i10 >> 8;
                    this.strBegin = (int) (j8 >> 32);
                    jHashCode64 = Fnv.hashCode64(getString());
                } else {
                    jHashCode64 = j7;
                }
            }
            if (jHashCode64 != -1) {
                return jHashCode64;
            }
            throw typeRefNotFound(i2);
        }
        int i11 = this.offset + 1;
        this.offset = i11;
        this.strBegin = i11;
        if (b3 >= 73 && b3 <= 120) {
            this.strlen = b3 + JSONB.Constants.BC_FLOAT;
        } else {
            if (b3 != 121 && b3 != 122 && b3 != 123 && b3 != 124 && b3 != 125) {
                throw readStringError();
            }
            int i12 = bArr[i11];
            if (JSONB.isInt32Num(i12)) {
                this.offset++;
                this.strlen = i12;
            } else if (JSONB.isInt32Byte(i12)) {
                int i13 = this.offset;
                this.offset = i13 + 2;
                this.strlen = getIntByte(bArr, i13 + 1, i12);
            } else {
                this.strlen = readLength();
            }
            this.strBegin = this.offset;
        }
        int i14 = this.strlen;
        if (i14 < 0) {
            hashCode = this.symbolTable.getHashCode(-i14);
        } else {
            long j9 = Fnv.MAGIC_HASH_CODE;
            if (b3 == 122) {
                int i15 = this.offset + i14;
                while (true) {
                    int i16 = this.offset;
                    if (i16 < i15) {
                        int iChar2_utf8 = bArr[i16];
                        if (iChar2_utf8 >= 0) {
                            this.offset = i16 + 1;
                        } else {
                            int i17 = iChar2_utf8 & 255;
                            switch (i17 >> 4) {
                                case Opcodes.FCONST_1 /* 12 */:
                                case 13:
                                    iChar2_utf8 = JSONReaderUTF8.char2_utf8(i17, bArr[i16 + 1], i16);
                                    this.offset += 2;
                                    break;
                                case Opcodes.DCONST_0 /* 14 */:
                                    iChar2_utf8 = JSONReaderUTF8.char2_utf8(i17, bArr[i16 + 1], bArr[i16 + 2], i16);
                                    this.offset += 3;
                                    break;
                                default:
                                    throw new JSONException("malformed input around byte " + this.offset);
                            }
                        }
                        j9 = (((long) iChar2_utf8) ^ j9) * Fnv.MAGIC_PRIME;
                    } else {
                        hashCode = j9;
                    }
                }
            } else {
                int i18 = 0;
                if (b3 == 123 || b3 == 125) {
                    hashCode = -3750763034362895579L;
                    while (i18 < this.strlen) {
                        int i19 = this.offset;
                        hashCode = (hashCode ^ ((long) ((char) ((bArr[(i19 + i18) + 1] & 255) | ((bArr[i19 + i18] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                        i18 += 2;
                    }
                } else if (b3 == 124) {
                    hashCode = -3750763034362895579L;
                    while (i18 < this.strlen) {
                        int i20 = this.offset;
                        hashCode = (hashCode ^ ((long) ((char) (((bArr[(i20 + i18) + 1] & 255) << 8) | (bArr[i20 + i18] & 255))))) * Fnv.MAGIC_PRIME;
                        i18 += 2;
                    }
                } else {
                    if (i14 <= 8) {
                        int i21 = this.offset;
                        long j10 = 0;
                        int i22 = 0;
                        while (true) {
                            if (i22 < this.strlen) {
                                int i23 = this.offset;
                                int i24 = bArr[i23];
                                if (i24 < 0 || (i24 == 0 && bArr[i21] == 0)) {
                                    j = j4;
                                    this.offset = i21;
                                } else {
                                    switch (i22) {
                                        case 0:
                                            j4 = j4;
                                            j10 = i24;
                                            continue;
                                            this.offset = i23 + 1;
                                            i22++;
                                            j4 = j4;
                                            break;
                                        case 1:
                                            j2 = i24 << 8;
                                            j3 = 255;
                                            break;
                                        case 2:
                                            j2 = i24 << 16;
                                            j3 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                            break;
                                        case 3:
                                            j2 = i24 << 24;
                                            j3 = 16777215;
                                            break;
                                        case 4:
                                            j2 = ((long) i24) << 32;
                                            j3 = 4294967295L;
                                            break;
                                        case 5:
                                            j2 = ((long) i24) << 40;
                                            j3 = 1099511627775L;
                                            break;
                                        case 6:
                                            j2 = ((long) i24) << 48;
                                            j3 = 281474976710655L;
                                            break;
                                        case 7:
                                            j2 = ((long) i24) << 56;
                                            j3 = 72057594037927935L;
                                            break;
                                        default:
                                            j4 = j4;
                                            continue;
                                            this.offset = i23 + 1;
                                            i22++;
                                            j4 = j4;
                                            break;
                                    }
                                    j10 = j2 + (j10 & j3);
                                    this.offset = i23 + 1;
                                    i22++;
                                    j4 = j4;
                                }
                            } else {
                                j = j4;
                                hashCode = j10;
                            }
                        }
                        if (hashCode == j) {
                            hashCode = -3750763034362895579L;
                            while (i18 < this.strlen) {
                                int i25 = this.offset;
                                this.offset = i25 + 1;
                                hashCode = (hashCode ^ ((long) bArr[i25])) * Fnv.MAGIC_PRIME;
                                i18++;
                            }
                        }
                    } else {
                        j = 0;
                    }
                    hashCode = j;
                    if (hashCode == j) {
                        hashCode = -3750763034362895579L;
                        while (i18 < this.strlen) {
                            int i26 = this.offset;
                            this.offset = i26 + 1;
                            hashCode = (hashCode ^ ((long) bArr[i26])) * Fnv.MAGIC_PRIME;
                            i18++;
                        }
                    }
                }
            }
        }
        byte b4 = bArr[this.offset];
        this.type = b4;
        if (JSONB.isInt32Num(b4)) {
            int32Value = this.type;
            this.offset++;
        } else {
            int32Value = readInt32Value();
        }
        if (int32Value == 0) {
            this.symbol0Begin = this.strBegin;
            this.symbol0Length = this.strlen;
            this.symbol0StrType = b3;
            this.symbol0Hash = hashCode;
            return hashCode;
        }
        int i27 = int32Value * 2;
        int i28 = i27 + 2;
        long[] jArr3 = this.symbols;
        if (jArr3 == null) {
            this.symbols = new long[Math.max(i28, 32)];
        } else if (jArr3.length < i28) {
            this.symbols = Arrays.copyOf(jArr3, i27 + 18);
        }
        this.symbols[i27 + 1] = (((long) this.strBegin) << 32) + (((long) this.strlen) << 8) + ((long) b3);
        return hashCode;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public UUID readUUID() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        if (b == -111) {
            this.offset = i + 2;
            byte b2 = bArr[i2];
            if (b2 != 16 && i + 17 >= this.end) {
                throw new JSONException(AbstractC1095.m2794(b2, "uuid not support "));
            }
            UUID uuid = new UUID(IOUtils.getLongBE(bArr, this.offset), IOUtils.getLongBE(bArr, this.offset + 8));
            this.offset += 16;
            return uuid;
        }
        if (b == -81) {
            return null;
        }
        if (b == 105) {
            UUID uuid32 = JSONReaderUTF8.readUUID32(bArr, i2);
            this.offset += 32;
            return uuid32;
        }
        if (b == 109) {
            if (bArr[i + 9] != 45 || bArr[i + 14] != 45 || bArr[i + 19] != 45 || bArr[i + 24] != 45) {
                throw new JSONException("Invalid UUID string:  ".concat(new String(bArr, this.offset, 36, StandardCharsets.ISO_8859_1)));
            }
            UUID uuid36 = JSONReaderUTF8.readUUID36(bArr, i2);
            this.offset += 36;
            return uuid36;
        }
        if (b != 121 && b != 122) {
            throw notSupportType(b);
        }
        int length = readLength();
        if (length == 32) {
            UUID uuid33 = JSONReaderUTF8.readUUID32(bArr, this.offset);
            this.offset += 32;
            return uuid33;
        }
        if (length == 36) {
            int i3 = this.offset;
            if (bArr[i3 + 8] == 45 && bArr[i3 + 13] == 45 && bArr[i3 + 18] == 45 && bArr[i3 + 23] == 45) {
                UUID uuid37 = JSONReaderUTF8.readUUID36(bArr, i3);
                this.offset += 36;
                return uuid37;
            }
        }
        throw new JSONException("Invalid UUID string:  ".concat(new String(bArr, this.offset, length, StandardCharsets.UTF_8)));
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0229 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x02ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:187:0x0325 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0158 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        this.strtype = b;
        this.strBegin = i2;
        if (b >= 73 && b <= 120) {
            this.strlen = b + JSONB.Constants.BC_FLOAT;
        } else {
            if (b != 121 && b != 122 && b != 123 && b != 124 && b != 125 && b != 127) {
                throw readStringError();
            }
            this.strlen = readLength();
            this.strBegin = this.offset;
        }
        int i3 = this.strlen;
        if (i3 < 0) {
            return this.symbolTable.getHashCode(-i3);
        }
        int i4 = 2;
        if (b != 122) {
            if (b == 123) {
                int i5 = this.offset;
                char c = bArr[i5];
                if (c != -2 || bArr[i5 + 1] != -1) {
                    if (c == -1 && bArr[i5 + 1] == -2) {
                        long j9 = Fnv.MAGIC_HASH_CODE;
                        while (i4 < this.strlen) {
                            int i6 = i5 + i4;
                            j9 = (j9 ^ ((long) ((char) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255))))) * Fnv.MAGIC_PRIME;
                            i4 += 2;
                        }
                        return j9;
                    }
                    long j10 = Fnv.MAGIC_HASH_CODE;
                    for (int i7 = 0; i7 < this.strlen; i7 += 2) {
                        int i8 = i5 + i7;
                        j10 = (j10 ^ ((long) ((char) (((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255))))) * Fnv.MAGIC_PRIME;
                    }
                    return j10;
                }
                if (i3 <= 16) {
                    long j11 = 0;
                    for (int i9 = 2; i9 < this.strlen; i9 += 2) {
                        int i10 = i5 + i9;
                        char c2 = (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
                        if (c2 > 127 || (i9 == 0 && c2 == 0)) {
                            j11 = 0;
                            if (j11 != 0) {
                                return j11;
                            }
                        } else {
                            byte b2 = (byte) c2;
                            switch ((i9 - 2) >> 1) {
                                case 0:
                                    j11 = b2;
                                    continue;
                                    break;
                                case 1:
                                    j7 = b2 << 8;
                                    j8 = j11 & 255;
                                    break;
                                case 2:
                                    j7 = b2 << 16;
                                    j8 = j11 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j7 = b2 << 24;
                                    j8 = j11 & 16777215;
                                    break;
                                case 4:
                                    j7 = ((long) b2) << 32;
                                    j8 = j11 & 4294967295L;
                                    break;
                                case 5:
                                    j7 = ((long) b2) << 40;
                                    j8 = j11 & 1099511627775L;
                                    break;
                                case 6:
                                    j7 = ((long) b2) << 48;
                                    j8 = j11 & 281474976710655L;
                                    break;
                                case 7:
                                    j7 = ((long) b2) << 56;
                                    j8 = j11 & 72057594037927935L;
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            j11 = j8 + j7;
                        }
                    }
                    if (j11 != 0) {
                        return j11;
                    }
                }
                long j12 = Fnv.MAGIC_HASH_CODE;
                while (i4 < this.strlen) {
                    int i11 = i5 + i4;
                    j12 = (j12 ^ ((long) ((char) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                    i4 += 2;
                }
                return j12;
            }
            if (b == 125) {
                int i12 = this.offset;
                if (i3 <= 16) {
                    long j13 = 0;
                    for (int i13 = 0; i13 < this.strlen; i13 += 2) {
                        int i14 = i12 + i13;
                        char c3 = (char) ((bArr[i14 + 1] & 255) | ((bArr[i14] & 255) << 8));
                        if (c3 > 127 || (i13 == 0 && c3 == 0)) {
                            j13 = 0;
                            if (j13 != 0) {
                                return j13;
                            }
                        } else {
                            byte b3 = (byte) c3;
                            switch (i13 >> 1) {
                                case 0:
                                    j13 = b3;
                                    continue;
                                    break;
                                case 1:
                                    j5 = b3 << 8;
                                    j6 = j13 & 255;
                                    break;
                                case 2:
                                    j5 = b3 << 16;
                                    j6 = j13 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j5 = b3 << 24;
                                    j6 = j13 & 16777215;
                                    break;
                                case 4:
                                    j5 = ((long) b3) << 32;
                                    j6 = j13 & 4294967295L;
                                    break;
                                case 5:
                                    j5 = ((long) b3) << 40;
                                    j6 = j13 & 1099511627775L;
                                    break;
                                case 6:
                                    j5 = ((long) b3) << 48;
                                    j6 = j13 & 281474976710655L;
                                    break;
                                case 7:
                                    j5 = ((long) b3) << 56;
                                    j6 = j13 & 72057594037927935L;
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            j13 = j6 + j5;
                        }
                    }
                    if (j13 != 0) {
                        return j13;
                    }
                }
                long j14 = Fnv.MAGIC_HASH_CODE;
                for (int i15 = 0; i15 < this.strlen; i15 += 2) {
                    int i16 = i12 + i15;
                    j14 = (j14 ^ ((long) ((char) ((bArr[i16 + 1] & 255) | ((bArr[i16] & 255) << 8))))) * Fnv.MAGIC_PRIME;
                }
                return j14;
            }
            if (b == 124) {
                int i17 = this.offset;
                if (i3 <= 16) {
                    long j15 = 0;
                    for (int i18 = 0; i18 < this.strlen; i18 += 2) {
                        int i19 = i17 + i18;
                        char c4 = (char) (((bArr[i19 + 1] & 255) << 8) | (bArr[i19] & 255));
                        if (c4 > 127 || (i18 == 0 && c4 == 0)) {
                            j15 = 0;
                            if (j15 != 0) {
                                return j15;
                            }
                        } else {
                            byte b4 = (byte) c4;
                            switch (i18 >> 1) {
                                case 0:
                                    j15 = b4;
                                    continue;
                                    break;
                                case 1:
                                    j3 = b4 << 8;
                                    j4 = j15 & 255;
                                    break;
                                case 2:
                                    j3 = b4 << 16;
                                    j4 = j15 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    break;
                                case 3:
                                    j3 = b4 << 24;
                                    j4 = j15 & 16777215;
                                    break;
                                case 4:
                                    j3 = ((long) b4) << 32;
                                    j4 = j15 & 4294967295L;
                                    break;
                                case 5:
                                    j3 = ((long) b4) << 40;
                                    j4 = j15 & 1099511627775L;
                                    break;
                                case 6:
                                    j3 = ((long) b4) << 48;
                                    j4 = j15 & 281474976710655L;
                                    break;
                                case 7:
                                    j3 = ((long) b4) << 56;
                                    j4 = j15 & 72057594037927935L;
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            j15 = j4 + j3;
                        }
                    }
                    if (j15 != 0) {
                        return j15;
                    }
                }
                long j16 = Fnv.MAGIC_HASH_CODE;
                for (int i20 = 0; i20 < this.strlen; i20 += 2) {
                    int i21 = i17 + i20;
                    j16 = (j16 ^ ((long) ((char) (((bArr[i21 + 1] & 255) << 8) | (bArr[i21] & 255))))) * Fnv.MAGIC_PRIME;
                }
                return j16;
            }
            if (i3 <= 8) {
                int i22 = this.offset;
                long j17 = 0;
                for (int i23 = 0; i23 < this.strlen; i23++) {
                    int i24 = this.offset;
                    int i25 = bArr[i24];
                    if (i25 < 0 || (i25 == 0 && bArr[i22] == 0)) {
                        this.offset = i22;
                        j17 = 0;
                        if (j17 != 0) {
                            return j17;
                        }
                    } else {
                        switch (i23) {
                            case 0:
                                j17 = i25;
                                continue;
                                this.offset = i24 + 1;
                                break;
                            case 1:
                                j = i25 << 8;
                                j2 = j17 & 255;
                                break;
                            case 2:
                                j = i25 << 16;
                                j2 = j17 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                break;
                            case 3:
                                j = i25 << 24;
                                j2 = j17 & 16777215;
                                break;
                            case 4:
                                j = ((long) i25) << 32;
                                j2 = j17 & 4294967295L;
                                break;
                            case 5:
                                j = ((long) i25) << 40;
                                j2 = j17 & 1099511627775L;
                                break;
                            case 6:
                                j = ((long) i25) << 48;
                                j2 = j17 & 281474976710655L;
                                break;
                            case 7:
                                j = ((long) i25) << 56;
                                j2 = j17 & 72057594037927935L;
                                break;
                            default:
                                continue;
                                this.offset = i24 + 1;
                                break;
                        }
                        j17 = j2 + j;
                        this.offset = i24 + 1;
                    }
                }
                if (j17 != 0) {
                    return j17;
                }
            }
            long j18 = Fnv.MAGIC_HASH_CODE;
            for (int i26 = 0; i26 < this.strlen; i26++) {
                int i27 = this.offset;
                this.offset = i27 + 1;
                j18 = (((long) bArr[i27]) ^ j18) * Fnv.MAGIC_PRIME;
            }
            return j18;
        }
        int i28 = this.offset + i3;
        long j19 = Fnv.MAGIC_HASH_CODE;
        while (true) {
            int i29 = this.offset;
            if (i29 >= i28) {
                return j19;
            }
            int iChar2_utf8 = bArr[i29];
            if (iChar2_utf8 >= 0) {
                this.offset = i29 + 1;
            } else {
                int i30 = iChar2_utf8 & 255;
                switch (i30 >> 4) {
                    case Opcodes.FCONST_1 /* 12 */:
                    case 13:
                        iChar2_utf8 = JSONReaderUTF8.char2_utf8(i30, bArr[i29 + 1], i29);
                        this.offset += 2;
                        break;
                    case Opcodes.DCONST_0 /* 14 */:
                        iChar2_utf8 = JSONReaderUTF8.char2_utf8(i30, bArr[i29 + 1], bArr[i29 + 2], i29);
                        this.offset += 3;
                        break;
                    default:
                        throw new JSONException("malformed input around byte " + this.offset);
                }
            }
            j19 = (((long) iChar2_utf8) ^ j19) * Fnv.MAGIC_PRIME;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public ZonedDateTime readZonedDateTime() {
        ZoneId zoneId;
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        if (b != -86) {
            return readZonedDateTime0(b);
        }
        int i3 = (bArr[i2] << 8) + (bArr[i + 2] & 255);
        byte b2 = bArr[i + 3];
        byte b3 = bArr[i + 4];
        byte b4 = bArr[i + 5];
        byte b5 = bArr[i + 6];
        byte b6 = bArr[i + 7];
        this.offset = i + 8;
        LocalDateTime localDateTimeOf = LocalDateTime.of(i3, b2, b3, b4, b5, b6, readInt32Value());
        if (readValueHashCode() == -4800907791268808639L) {
            zoneId = DateUtils.SHANGHAI_ZONE_ID;
        } else {
            String string = getString();
            ZoneId zoneId2 = this.context.getZoneId();
            zoneId = zoneId2.getId().equals(string) ? zoneId2 : DateUtils.getZoneId(string, DateUtils.SHANGHAI_ZONE_ID);
        }
        return ZonedDateTime.ofLocal(localDateTimeOf, zoneId, null);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public ZonedDateTime readZonedDateTimeX(int i) {
        ZonedDateTime zonedDateTime;
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        byte b = bArr[i2];
        this.type = b;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        }
        if (i >= 19 && (zonedDateTime = DateUtils.parseZonedDateTime(bArr, i2 + 1, i, this.context.zoneId)) != null) {
            this.offset = i + 1 + this.offset;
            return zonedDateTime;
        }
        throw new JSONException("illegal LocalDateTime string : " + readString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void reset(JSONReader.SavePoint savePoint) {
        this.offset = savePoint.offset;
        this.type = (byte) savePoint.current;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void skipComment() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean skipName() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        int i2 = i + 1;
        this.offset = i2;
        byte b = bArr[i];
        this.strtype = b;
        if (b >= 73 && b <= 120) {
            this.offset = (b - 73) + i2;
            return true;
        }
        if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            int length = readLength();
            this.strlen = length;
            this.offset += length;
            return true;
        }
        if (b != 127) {
            throw notSupportType(b);
        }
        byte b2 = bArr[i2];
        if (b2 >= -16 && b2 <= 72) {
            readInt32Value();
            return true;
        }
        readString();
        readInt32Value();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    @Override // com.alibaba.fastjson2.JSONReader
    public void skipValue() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        if (b != 72) {
            if (b != 73) {
                switch (b) {
                    case -111:
                        this.offset += readInt32Value();
                        return;
                    case -110:
                        readTypeHashCode();
                        skipValue();
                        return;
                    case -109:
                        if (!isString()) {
                            throw notSupportType(b);
                        }
                        skipName();
                        return;
                    case -108:
                        return;
                    default:
                        switch (b) {
                            case -90:
                                while (true) {
                                    byte[] bArr2 = this.bytes;
                                    int i2 = this.offset;
                                    byte b2 = bArr2[i2];
                                    if (b2 == -91) {
                                        this.offset = i2 + 1;
                                        return;
                                    }
                                    byte[] bArr3 = FIXED_TYPE_SIZE;
                                    byte b3 = bArr3[b2 & 255];
                                    if (b3 > 0) {
                                        this.offset = i2 + b3;
                                    } else if (b3 == -1) {
                                        this.offset = i2 + 1;
                                        this.offset += readInt32Value();
                                    } else {
                                        skipName();
                                    }
                                    byte[] bArr4 = this.bytes;
                                    int i3 = this.offset;
                                    byte b4 = bArr3[bArr4[i3] & 255];
                                    if (b4 > 0) {
                                        this.offset = i3 + b4;
                                    } else if (b4 == -1) {
                                        this.offset = i3 + 1;
                                        this.offset += readInt32Value();
                                    } else {
                                        skipValue();
                                    }
                                }
                                break;
                            case -89:
                                this.offset = i + 4;
                                readInt32Value();
                                return;
                            case -88:
                                this.offset = i + 8;
                                readInt32Value();
                                return;
                            case -87:
                            case -84:
                            case -83:
                                break;
                            case -86:
                                this.offset = i + 8;
                                readInt32Value();
                                readString();
                                return;
                            case -85:
                                this.offset = i + 9;
                                return;
                            default:
                                switch (b) {
                                    case -81:
                                    case -80:
                                    case -79:
                                    case -78:
                                    case -77:
                                        return;
                                    case -76:
                                    case -72:
                                        readInt64Value();
                                        return;
                                    case -75:
                                        this.offset = i + 9;
                                        return;
                                    case -74:
                                        readInt32Value();
                                        return;
                                    case -73:
                                        break;
                                    case -71:
                                        readInt32Value();
                                        readBigInteger();
                                        return;
                                    default:
                                        switch (b) {
                                            case -68:
                                                this.offset = i + 3;
                                                return;
                                            case -67:
                                                this.offset = i + 2;
                                                return;
                                            case -66:
                                                this.offset = i + 9;
                                                return;
                                            case -65:
                                                break;
                                            default:
                                                switch (b) {
                                                    case 121:
                                                    case 122:
                                                    case Opcodes.LSHR /* 123 */:
                                                    case Opcodes.IUSHR /* 124 */:
                                                    case Opcodes.LUSHR /* 125 */:
                                                        this.offset += readInt32Value();
                                                        return;
                                                    default:
                                                        if (JSONB.isInt32Num(b) || JSONB.isInt64Num(b)) {
                                                            return;
                                                        }
                                                        if (JSONB.isInt32Byte(b) || JSONB.isInt64Byte(b)) {
                                                            this.offset++;
                                                            return;
                                                        }
                                                        if (JSONB.isInt32Short(b) || JSONB.isInt64Short(b)) {
                                                            this.offset += 2;
                                                            return;
                                                        }
                                                        if (b >= 73 && b <= 120) {
                                                            this.offset = (b - 73) + this.offset;
                                                            return;
                                                        }
                                                        if (b < -108 || b > -92) {
                                                            throw notSupportType(b);
                                                        }
                                                        int int32Value = b == -92 ? readInt32Value() : b - (-108);
                                                        for (int i4 = 0; i4 < int32Value; i4++) {
                                                            byte[] bArr5 = FIXED_TYPE_SIZE;
                                                            byte[] bArr6 = this.bytes;
                                                            int i5 = this.offset;
                                                            byte b5 = bArr5[bArr6[i5] & 255];
                                                            if (b5 > 0) {
                                                                this.offset = i5 + b5;
                                                            } else if (b5 == -1) {
                                                                this.offset = i5 + 1;
                                                                this.offset += readInt32Value();
                                                            } else {
                                                                skipValue();
                                                            }
                                                        }
                                                        return;
                                                }
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                return;
            }
        }
        this.offset = i + 5;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int startArray() {
        byte[] bArr = this.bytes;
        int i = this.offset;
        this.offset = i + 1;
        byte b = bArr[i];
        this.type = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.ch = (char) (-b);
            return b - (-108);
        }
        if (b == -111) {
            return readInt32Value();
        }
        if (b == -92) {
            return readInt32Value();
        }
        throw new JSONException("array not support input " + error(b));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(byte b) {
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] != b) {
            return false;
        }
        this.offset = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c, char c2, char c3) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c, char c2, char c3, char c4) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c, char c2, char c3, char c4, char c5) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(Class<T> cls) {
        JSONReader.Context context = this.context;
        return (T) context.provider.getObjectReader(cls, (context.features & JSONReader.Feature.FieldBased.mask) != 0).readJSONBObject(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char c, char c2, char c3, char c4, char c5, char c6) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readReference(Collection collection, int i) {
        byte[] bArr = this.bytes;
        int i2 = this.offset;
        if (bArr[i2] != -109) {
            return false;
        }
        this.offset = i2 + 1;
        String string = readString();
        if ("..".equals(string)) {
            collection.add(collection);
        } else {
            addResolveTask(collection, i, JSONPath.of(string));
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void read(Map map, long j) {
        Object any;
        Object any2;
        byte[] bArr = this.bytes;
        int i = this.offset;
        if (bArr[i] == -90) {
            this.offset = i + 1;
            long features = j | this.context.getFeatures();
            while (true) {
                byte[] bArr2 = this.bytes;
                int i2 = this.offset;
                byte b = bArr2[i2];
                if (b == -91) {
                    this.offset = i2 + 1;
                    return;
                }
                if (b >= 73) {
                    any = readFieldName();
                } else {
                    any = readAny();
                }
                if (isReference()) {
                    String reference = readReference();
                    if ("..".equals(reference)) {
                        map.put(any, map);
                    } else {
                        addResolveTask(map, any, JSONPath.of(reference));
                        map.put(any, null);
                    }
                } else {
                    byte b2 = this.bytes[this.offset];
                    if (b2 >= 73 && b2 <= 126) {
                        any2 = readString();
                    } else if (JSONB.isInt32Num(b2)) {
                        this.offset++;
                        any2 = Integer.valueOf(b2);
                    } else if (b2 == -79) {
                        this.offset++;
                        any2 = Boolean.TRUE;
                    } else if (b2 == -80) {
                        this.offset++;
                        any2 = Boolean.FALSE;
                    } else if (b2 == -90) {
                        any2 = readObject();
                    } else {
                        any2 = readAny();
                    }
                    if (any2 != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & features) == 0) {
                        map.put(any, any2);
                    }
                }
            }
        } else {
            throw new JSONException("object not support input " + error(this.type));
        }
    }

    public JSONReaderJSONB(JSONReader.Context context, byte[] bArr, int i, int i2) {
        super(context, true, false);
        this.bytes = bArr;
        this.offset = i;
        this.length = i2;
        this.end = i + i2;
        this.symbolTable = context.symbolTable;
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        this.cacheItem = cacheItemArr[System.identityHashCode(Thread.currentThread()) & (cacheItemArr.length - 1)];
    }

    private String readString(Charset charset) {
        char[] andSet;
        String str;
        int i = this.strlen;
        if (i < 0) {
            return this.symbolTable.getName(-i);
        }
        if (JDKUtils.JVM_VERSION == 8 && this.strtype == 122 && i < 8192) {
            int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
            JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
            andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)], null);
            if (andSet == null) {
                andSet = new char[8192];
            }
        } else {
            andSet = null;
        }
        if (andSet != null) {
            str = new String(andSet, 0, IOUtils.decodeUTF8(this.bytes, this.offset, this.strlen, andSet));
            if (andSet.length < 8388608) {
                JSONFactory.CHARS_UPDATER.lazySet(this.cacheItem, andSet);
            }
        } else {
            str = new String(this.bytes, this.offset, this.strlen, charset);
        }
        this.offset += this.strlen;
        if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
            str = str.trim();
        }
        if (!str.isEmpty() || (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) == 0) {
            return str;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List readArray(Type type) {
        if (nextIfNull()) {
            return null;
        }
        if (this.bytes[this.offset] == -110) {
            Object any = readAny();
            if (any instanceof List) {
                return (List) any;
            }
            if (any instanceof Collection) {
                return new JSONArray((Collection<?>) any);
            }
            throw new JSONException(AbstractC1095.m2798(any, new StringBuilder("not support class ")));
        }
        int iStartArray = startArray();
        JSONArray jSONArray = new JSONArray(iStartArray);
        for (int i = 0; i < iStartArray; i++) {
            jSONArray.add(read(type));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readArray(Collection collection, Type type) {
        int iStartArray = startArray();
        for (int i = 0; i < iStartArray; i++) {
            collection.add(read(type));
        }
    }
}
