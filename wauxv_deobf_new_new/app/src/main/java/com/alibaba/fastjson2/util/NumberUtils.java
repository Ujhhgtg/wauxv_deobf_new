package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.connection.RealConnection;
import p000.AbstractC1095;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NumberUtils {
    static final long INFI;
    static final long INFINITY;
    static final int MOD_DOUBLE_EXP = 2047;
    static final long MOD_DOUBLE_MANTISSA = 4503599627370495L;
    static final int MOD_FLOAT_EXP = 255;
    static final int MOD_FLOAT_MANTISSA = 8388607;
    static final LongBiFunction MULTIPLY_HIGH;
    static final double[] NEGATIVE_DECIMAL_POWER;
    static final char[][] NEGATIVE_DECIMAL_POWER_CHARS;
    static final long NITY;
    static final double[] POSITIVE_DECIMAL_POWER;
    static final char[][] POSITIVE_DECIMAL_POWER_CHARS;
    static final long[] POW10_LONG_VALUES;
    static final BigInteger[] POW5_BI_VALUES;
    static final long[] POW5_LONG_VALUES;
    static final short[] TWO_DIGITS_16_BITS;
    static final int[] TWO_DIGITS_32_BITS;

    /* JADX INFO: compiled from: obf */
    @FunctionalInterface
    public interface LongBiFunction {
        long multiplyHigh(long j, long j2);
    }

    static {
        LongBiFunction c0021;
        long j;
        int i;
        int i2;
        if (JDKUtils.JVM_VERSION <= 8 || JDKUtils.ANDROID) {
            c0021 = null;
        } else {
            try {
                MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(NumberUtils.class);
                Class cls = Long.TYPE;
                MethodType methodType = MethodType.methodType(cls, cls, cls);
                c0021 = (LongBiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "multiplyHigh", MethodType.methodType(LongBiFunction.class), methodType, lookupTrustedLookup.findStatic(Math.class, "multiplyHigh", methodType), methodType).getTarget().invokeExact();
            } catch (Throwable unused) {
                c0021 = null;
            }
        }
        if (c0021 == null) {
            c0021 = new C0021();
        }
        MULTIPLY_HIGH = c0021;
        INFINITY = IOUtils.getLongUnaligned("Infinity".getBytes(StandardCharsets.ISO_8859_1), 0);
        char[] charArray = "Infinity".toCharArray();
        INFI = IOUtils.getLongUnaligned(charArray, 0);
        NITY = IOUtils.getLongUnaligned(charArray, 4);
        double[] dArr = new double[325];
        POSITIVE_DECIMAL_POWER = dArr;
        NEGATIVE_DECIMAL_POWER = new double[325];
        POW10_LONG_VALUES = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L, Long.MAX_VALUE};
        POW5_LONG_VALUES = new long[27];
        POW5_BI_VALUES = new BigInteger[343];
        int length = dArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            POSITIVE_DECIMAL_POWER[i3] = Double.valueOf("1.0E" + i3).doubleValue();
            NEGATIVE_DECIMAL_POWER[i3] = Double.valueOf("1.0E-" + i3).doubleValue();
        }
        double[] dArr2 = NEGATIVE_DECIMAL_POWER;
        dArr2[dArr2.length - 1] = Double.MIN_VALUE;
        int i4 = 0;
        long j2 = 1;
        while (true) {
            long[] jArr = POW5_LONG_VALUES;
            if (i4 >= jArr.length) {
                break;
            }
            jArr[i4] = j2;
            j2 *= 5;
            i4++;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
        POW5_BI_VALUES[0] = BigInteger.ONE;
        int i5 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = POW5_BI_VALUES;
            if (i5 >= bigIntegerArr.length) {
                break;
            }
            bigIntegerArr[i5] = bigIntegerValueOf.pow(i5);
            i5++;
        }
        char[][] cArr = new char[325][];
        POSITIVE_DECIMAL_POWER_CHARS = cArr;
        NEGATIVE_DECIMAL_POWER_CHARS = new char[325][];
        int length2 = cArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            String strM2794 = AbstractC1095.m2794(i6, "1.0E");
            String strM2795 = AbstractC1095.m2794(i6, "1.0E-");
            POSITIVE_DECIMAL_POWER_CHARS[i6] = strM2794.toCharArray();
            NEGATIVE_DECIMAL_POWER_CHARS[i6] = strM2795.toCharArray();
        }
        char[][] cArr2 = NEGATIVE_DECIMAL_POWER_CHARS;
        cArr2[cArr2.length - 1] = "4.9E-324".toCharArray();
        TWO_DIGITS_32_BITS = new int[100];
        TWO_DIGITS_16_BITS = new short[100];
        for (long j3 = 0; j3 < 10; j3++) {
            for (long j4 = 0; j4 < 10; j4++) {
                if (JDKUtils.BIG_ENDIAN) {
                    j = ((j3 + 48) << 16) | (48 + j4);
                    i = (((int) j3) + 48) << 8;
                    i2 = (int) j4;
                } else {
                    j = ((j4 + 48) << 16) | (48 + j3);
                    i = (((int) j4) + 48) << 8;
                    i2 = (int) j3;
                }
                int i7 = i | (i2 + 48);
                int i8 = (int) ((j3 * 10) + j4);
                TWO_DIGITS_32_BITS[i8] = (int) j;
                TWO_DIGITS_16_BITS[i8] = (short) i7;
            }
        }
    }

    private NumberUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:96:0x019f  */
    public static Scientific doubleToScientific(double d) {
        int i;
        long j;
        long j2;
        long jMultiplyHighAndShift;
        long j3;
        boolean z;
        int i2;
        int i3;
        long j4;
        char c;
        if (d == Double.MIN_VALUE) {
            return Scientific.DOUBLE_MIN;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i4 = ((int) (jDoubleToRawLongBits >> 52)) & 2047;
        long j5 = MOD_DOUBLE_MANTISSA & jDoubleToRawLongBits;
        boolean z2 = j5 > 0;
        if (i4 > 0) {
            if (i4 == 2047) {
                return Scientific.SCIENTIFIC_NULL;
            }
            j = FieldInfo.FIELD_MASK | j5;
            i = i4 - 1075;
        } else {
            if (j5 == 0) {
                return jDoubleToRawLongBits == 0 ? Scientific.ZERO : Scientific.NEGATIVE_ZERO;
            }
            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j5) - 11;
            i = (-1074) - iNumberOfLeadingZeros;
            j = j5 << iNumberOfLeadingZeros;
        }
        if (i >= 0) {
            ED ed = ED.E2_D_A[i];
            i2 = ed.e10;
            i3 = ed.adl;
            j3 = ed.d3;
            j2 = ed.d4;
            if (ed.b) {
                c = '\n';
                long j6 = ed.bv;
                if (j >= j6) {
                    if (j > j6) {
                        i2++;
                        i3++;
                    } else {
                        int i5 = i2 + 1;
                        if (d == POSITIVE_DECIMAL_POWER[i5]) {
                            return new Scientific(i5, true);
                        }
                    }
                }
            } else {
                c = '\n';
            }
            int i6 = ed.o5;
            int i7 = i + i6;
            if (i6 < 0) {
                ED5 ed5 = ED5.ED5_A[-i6];
                jMultiplyHighAndShift = multiplyHighAndShift(j << c, ed5.oy, ed5.of, 32 - ((i7 - 10) - ed5.ob));
                if (i6 != -1 || i7 >= 11) {
                    z = false;
                }
            } else {
                jMultiplyHighAndShift = (j * POW5_LONG_VALUES[i6]) << i7;
            }
            z = true;
        } else {
            ED ed2 = ED.E5_D_A[-i];
            int i8 = ed2.e10;
            int i9 = ed2.adl;
            long j7 = ed2.d3;
            j2 = ed2.d4;
            if (ed2.b) {
                long j8 = ed2.bv;
                if (j >= j8) {
                    if (j > j8) {
                        i8++;
                        i9++;
                    } else {
                        if (i8 >= -1) {
                            int i10 = i8 + 1;
                            if (d == POSITIVE_DECIMAL_POWER[i10]) {
                                return new Scientific(i10, true);
                            }
                        }
                        if (i8 < -1 && d == NEGATIVE_DECIMAL_POWER[(-i8) - 1]) {
                            return new Scientific(i8 + 1, true);
                        }
                    }
                }
            }
            int i11 = ed2.o5;
            int i12 = i + i11;
            if (i12 < 0) {
                long[] jArr = POW5_LONG_VALUES;
                if (i11 < jArr.length) {
                    jMultiplyHighAndShift = multiplyHighAndShift(j, jArr[i11], -i12);
                } else if (i11 < jArr.length + 4) {
                    jMultiplyHighAndShift = multiplyHighAndShift(j * jArr[(i11 - jArr.length) + 1], jArr[jArr.length - 1], -i12);
                } else {
                    ED5 ed6 = ED5.ED5_A[i11];
                    jMultiplyHighAndShift = multiplyHighAndShift(j << 10, ed6.y, ed6.f, (-(ed6.dfb + i12)) + 10);
                }
            } else {
                jMultiplyHighAndShift = (POW5_LONG_VALUES[i11] * j) << i12;
            }
            j3 = j7;
            z = false;
            i2 = i8;
            i3 = i9;
        }
        if (z) {
            long j9 = jMultiplyHighAndShift / 10;
            if (i3 == 16) {
                i3--;
                j9 = (j9 + 5) / 10;
            }
            return new Scientific(j9, i3 + 2, i2);
        }
        long j10 = jMultiplyHighAndShift / 1000;
        long j11 = jMultiplyHighAndShift - (1000 * j10);
        int i13 = ((10001 - (j11 * 10)) << 1) <= j2 ? 1 : 0;
        if (i13 == 0) {
            if (((j11 + 1) << (z2 ? (char) 1 : (char) 2)) <= j3) {
                j4 = j10 + ((long) i13);
                i3--;
            } else if (z2) {
                j4 = (jMultiplyHighAndShift + 50) / 100;
            } else {
                j4 = (jMultiplyHighAndShift + 5) / 10;
                i3++;
            }
        } else {
            j4 = j10 + ((long) i13);
            i3--;
        }
        return new Scientific(j4, i3 + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    public static Scientific floatToScientific(float f) {
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        long jMultiplyHighAndShift;
        long j2;
        int i6;
        int i7;
        long jMultiplyHigh;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i8 = (iFloatToRawIntBits >> 23) & MOD_FLOAT_EXP;
        int i9 = MOD_FLOAT_MANTISSA & iFloatToRawIntBits;
        boolean z = i9 > 0;
        if (i8 > 0) {
            if (i8 == MOD_FLOAT_EXP) {
                return Scientific.SCIENTIFIC_NULL;
            }
            i2 = 8388608 | i9;
            i = i8 - 150;
        } else {
            if (i9 == 0) {
                return iFloatToRawIntBits == 0 ? Scientific.ZERO : Scientific.NEGATIVE_ZERO;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i9) - 8;
            i = (-149) - iNumberOfLeadingZeros;
            i2 = i9 << iNumberOfLeadingZeros;
        }
        if (i >= 0) {
            ED ed = EF.E2_F_A[i];
            i4 = ed.e10;
            i5 = ed.adl;
            j = ed.d4;
            if (ed.b && i2 > ed.bv) {
                i4++;
                i5++;
            }
            int i10 = ed.o5 + 6;
            int i11 = i + i10;
            if (i10 >= 0) {
                i3 = 1;
                jMultiplyHighAndShift = (((long) i2) * POW5_LONG_VALUES[i10]) << i11;
            } else if (i11 < 40) {
                jMultiplyHighAndShift = (((long) i2) << i11) / POW5_LONG_VALUES[-i10];
                i3 = 1;
            } else {
                ED5 ed5 = ED5.ED5_A[-i10];
                i3 = 1;
                jMultiplyHighAndShift = multiplyHighAndShift(((long) i2) << 39, ed5.oy, ed5.of, (ed5.ob + 71) - i11);
            }
        } else {
            i3 = 1;
            ED ed2 = EF.E5_F_A[-i];
            int i12 = ed2.e10;
            int i13 = ed2.adl;
            j = ed2.d4;
            if (ed2.b && i2 > ed2.bv) {
                i12++;
                i13++;
            }
            i4 = i12;
            i5 = i13;
            int i14 = ed2.o5 + 6;
            int i15 = i + i14;
            if (i15 >= 0) {
                jMultiplyHighAndShift = (POW5_LONG_VALUES[i14] * ((long) i2)) << i15;
            } else if (i14 < 17) {
                jMultiplyHighAndShift = (((long) i2) * POW5_LONG_VALUES[i14]) >> (-i15);
            } else {
                long[] jArr = POW5_LONG_VALUES;
                if (i14 < jArr.length) {
                    jMultiplyHighAndShift = multiplyHighAndShift(i2, jArr[i14], -i15);
                } else if (i14 < jArr.length + 4) {
                    jMultiplyHighAndShift = multiplyHighAndShift(((long) i2) * jArr[(i14 - jArr.length) + 1], jArr[jArr.length - 1], -i15);
                } else {
                    ED5 ed6 = ED5.ED5_A[i14];
                    jMultiplyHighAndShift = multiplyHighAndShift(((long) i2) << 39, ed6.y, ed6.f, (-(ed6.dfb + i15)) + 39);
                }
            }
        }
        if (jMultiplyHighAndShift < 1000000000) {
            return new Scientific(MULTIPLY_HIGH.multiplyHigh(jMultiplyHighAndShift, 7737125245533626719L) >> 22, 2, i4);
        }
        LongBiFunction longBiFunction = MULTIPLY_HIGH;
        long jMultiplyHigh2 = longBiFunction.multiplyHigh(jMultiplyHighAndShift, 4951760157141521100L) >> 28;
        long j3 = jMultiplyHighAndShift - (1000000000 * jMultiplyHigh2);
        int i16 = ((1000000001 - j3) << i3) <= j ? i3 : 0;
        if (i16 == 0) {
            if (((j3 + 1) << (z ? i3 : 2)) <= j) {
                j2 = jMultiplyHigh2 + ((long) i16);
                i6 = i5 - 1;
                if (i16 == 0 && POW10_LONG_VALUES[i6] == j2) {
                    i4++;
                    j2 = 1;
                    i7 = 0;
                } else {
                    i7 = i6;
                }
            } else {
                if (z) {
                    jMultiplyHigh = (longBiFunction.multiplyHigh(jMultiplyHighAndShift, 6189700196426901375L) >> 25) + ((long) (j3 % 100000000 >= 50000000 ? i3 : 0));
                    i7 = i5;
                } else {
                    jMultiplyHigh = (longBiFunction.multiplyHigh(jMultiplyHighAndShift, 7737125245533626719L) >> 22) + ((long) (j3 % 10000000 >= 5000000 ? i3 : 0));
                    i7 = i5 + 1;
                }
                j2 = jMultiplyHigh;
            }
        } else {
            j2 = jMultiplyHigh2 + ((long) i16);
            i6 = i5 - 1;
            if (i16 == 0) {
                i7 = i6;
            } else {
                i7 = i6;
            }
        }
        return new Scientific(j2, i7 + 1, i4);
    }

    public static long multiplyHigh(long j, long j2) {
        long j3 = j >> 32;
        long j4 = j & 4294967295L;
        long j5 = j2 >> 32;
        long j6 = j2 & 4294967295L;
        long j7 = (j6 * j3) + ((j4 * j6) >>> 32);
        return (j3 * j5) + (j7 >> 32) + (((j4 * j5) + (4294967295L & j7)) >> 32);
    }

    public static long multiplyHighAndShift(long j, long j2, int i) {
        long jMultiplyHigh = MULTIPLY_HIGH.multiplyHigh(j, j2);
        if (i >= 64) {
            return jMultiplyHigh >>> (i - 64);
        }
        return ((j * j2) >>> i) | (jMultiplyHigh << (64 - i));
    }

    private static int writeDecimal(long j, int i, int i2, byte[] bArr, int i3) {
        long j2;
        int i4;
        int iWriteInt64;
        int i5 = i2;
        if ((j & 1) == 0 && j % 5 == 0) {
            j2 = j;
            int i6 = i;
            while (j2 % 100 == 0) {
                i6 -= 2;
                j2 /= 100;
                if (i6 == 1) {
                    break;
                }
            }
            if ((1 & j2) == 0 && j2 % 5 == 0 && j2 > 0) {
                i4 = i6 - 1;
                j2 /= 10;
            } else {
                i4 = i6;
            }
        } else {
            j2 = j;
            i4 = i;
        }
        if (i5 < -3 || i5 >= 7) {
            if (i4 == 1) {
                bArr[i3] = (byte) (j2 + 48);
                IOUtils.putShortUnaligned(bArr, i3 + 1, IOUtils.DOT_ZERO_16);
                iWriteInt64 = i3 + 3;
            } else {
                int i7 = i4 - 2;
                long j3 = POW10_LONG_VALUES[i7];
                int i8 = (int) (j2 / j3);
                bArr[i3] = (byte) (i8 + 48);
                bArr[i3 + 1] = 46;
                int i9 = i3 + 2;
                long j4 = j2 - (((long) i8) * j3);
                while (true) {
                    i7--;
                    if (i7 <= -1 || j4 >= POW10_LONG_VALUES[i7]) {
                        break;
                    }
                    bArr[i9] = JSONB.Constants.BC_INT32_BYTE_MIN;
                    i9++;
                }
                iWriteInt64 = IOUtils.writeInt64(bArr, i9, j4);
            }
            int i10 = iWriteInt64 + 1;
            bArr[iWriteInt64] = 69;
            if (i5 < 0) {
                bArr[i10] = 45;
                i5 = -i5;
                i10 = iWriteInt64 + 2;
            }
            if (i5 > 99) {
                int i11 = (int) ((((long) i5) * 1374389535) >> 37);
                bArr[i10] = (byte) (i11 + 48);
                IOUtils.putShortUnaligned(bArr, i10 + 1, TWO_DIGITS_16_BITS[i5 - (i11 * 100)]);
                return i10 + 3;
            }
            if (i5 > 9) {
                IOUtils.putShortUnaligned(bArr, i10, TWO_DIGITS_16_BITS[i5]);
                return i10 + 2;
            }
            int i12 = i10 + 1;
            bArr[i10] = (byte) (i5 + 48);
            return i12;
        }
        if (i5 < 0) {
            IOUtils.putShortUnaligned(bArr, i3, IOUtils.ZERO_DOT_16);
            int i13 = i3 + 2;
            if (i5 == -2) {
                bArr[i13] = JSONB.Constants.BC_INT32_BYTE_MIN;
                i13 = i3 + 3;
            } else if (i5 == -3) {
                IOUtils.putShortUnaligned(bArr, i13, (short) 12336);
                i13 = i3 + 4;
            }
            return IOUtils.writeInt64(bArr, i13, j2);
        }
        int i14 = (i4 - 1) - i5;
        if (i14 <= 0) {
            int iWriteInt65 = IOUtils.writeInt64(bArr, i3, j2);
            int i15 = -i14;
            if (i15 > 0) {
                int i16 = 0;
                while (i16 < i15) {
                    bArr[iWriteInt65] = JSONB.Constants.BC_INT32_BYTE_MIN;
                    i16++;
                    iWriteInt65++;
                }
            }
            IOUtils.putShortUnaligned(bArr, iWriteInt65, IOUtils.DOT_ZERO_16);
            return iWriteInt65 + 2;
        }
        int i17 = i14 - 1;
        long j5 = POW10_LONG_VALUES[i17];
        long j6 = (int) (j2 / j5);
        int iWriteInt32 = IOUtils.writeInt32(bArr, i3, j6);
        int i18 = iWriteInt32 + 1;
        bArr[iWriteInt32] = 46;
        long j7 = j2 - (j6 * j5);
        while (true) {
            i17--;
            if (i17 <= -1 || j7 >= POW10_LONG_VALUES[i17]) {
                break;
            }
            bArr[i18] = JSONB.Constants.BC_INT32_BYTE_MIN;
            i18++;
        }
        return IOUtils.writeInt64(bArr, i18, j7);
    }

    public static int writeDouble(byte[] bArr, int i, double d, boolean z, boolean z2) {
        int i2;
        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY || d == Double.NEGATIVE_INFINITY) {
            return writeSpecial(bArr, i, (float) d, z, z2);
        }
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = JSONB.Constants.BC_INT32_BYTE_MIN;
            IOUtils.putShortUnaligned(bArr, i + 1, IOUtils.DOT_ZERO_16);
            return i + 3;
        }
        if (d < 0.0d) {
            bArr[i] = 45;
            d = -d;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        long j = (long) d;
        if (d == j) {
            int iStringSize = IOUtils.stringSize(j);
            return writeDecimal(j, iStringSize, iStringSize - 1, bArr, i2);
        }
        Scientific scientificDoubleToScientific = doubleToScientific(d);
        int i3 = scientificDoubleToScientific.e10;
        if (!scientificDoubleToScientific.b) {
            return writeDecimal(scientificDoubleToScientific.output, scientificDoubleToScientific.count, i3, bArr, i2);
        }
        int i4 = 0;
        if (i3 >= 0) {
            char[] cArr = POSITIVE_DECIMAL_POWER_CHARS[i3];
            int length = cArr.length;
            while (i4 < length) {
                bArr[i2] = (byte) cArr[i4];
                i4++;
                i2++;
            }
            return i2;
        }
        char[] cArr2 = NEGATIVE_DECIMAL_POWER_CHARS[-i3];
        int length2 = cArr2.length;
        while (i4 < length2) {
            bArr[i2] = (byte) cArr2[i4];
            i4++;
            i2++;
        }
        return i2;
    }

    public static int writeFloat(byte[] bArr, int i, float f, boolean z, boolean z2) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            return writeSpecial(bArr, i, f, z, z2);
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = JSONB.Constants.BC_INT32_BYTE_MIN;
            IOUtils.putShortUnaligned(bArr, i + 1, IOUtils.DOT_ZERO_16);
            return i + 3;
        }
        if (f < 0.0f) {
            bArr[i] = 45;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        Scientific scientificFloatToScientific = floatToScientific(f);
        return writeDecimal(scientificFloatToScientific.output, scientificFloatToScientific.count, scientificFloatToScientific.e10, bArr, i2);
    }

    private static int writeSpecial(byte[] bArr, int i, float f, boolean z, boolean z2) {
        int i2;
        if (z && !z2) {
            IOUtils.putIntUnaligned(bArr, i, IOUtils.NULL_32);
            return i + 4;
        }
        if (z2) {
            bArr[i] = 34;
            i++;
        }
        if (Float.isNaN(f)) {
            bArr[i] = JSONB.Constants.BC_STR_ASCII_FIX_5;
            bArr[i + 1] = 97;
            bArr[i + 2] = JSONB.Constants.BC_STR_ASCII_FIX_5;
            i2 = i + 3;
        } else {
            if (f < 0.0f) {
                bArr[i] = 45;
                i++;
            }
            IOUtils.putLongUnaligned(bArr, i, INFINITY);
            i2 = i + 8;
        }
        if (!z2) {
            return i2;
        }
        int i3 = i2 + 1;
        bArr[i2] = 34;
        return i3;
    }

    public static long multiplyHighAndShift(long j, long j2, long j3, int i) {
        int i2 = i - 64;
        LongBiFunction longBiFunction = MULTIPLY_HIGH;
        long jMultiplyHigh = longBiFunction.multiplyHigh(j, j2);
        long j4 = j2 * j;
        long jMultiplyHigh2 = (longBiFunction.multiplyHigh(j, j3) << 32) + ((j * j3) >>> 32);
        long j5 = j4 + jMultiplyHigh2;
        if ((j4 | jMultiplyHigh2) < 0 && ((j4 & jMultiplyHigh2) < 0 || j5 >= 0)) {
            jMultiplyHigh++;
        }
        if (i2 >= 0) {
            return jMultiplyHigh >>> i2;
        }
        return (j5 >>> i) | (jMultiplyHigh << (-i2));
    }

    public static int writeFloat(char[] cArr, int i, float f, boolean z, boolean z2) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            return writeSpecial(cArr, i, f, z, z2);
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                cArr[i] = '-';
                i++;
            }
            cArr[i] = '0';
            IOUtils.putIntUnaligned(cArr, i + 1, IOUtils.DOT_ZERO_32);
            return i + 3;
        }
        if (f < 0.0f) {
            cArr[i] = '-';
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        Scientific scientificFloatToScientific = floatToScientific(f);
        return writeDecimal(scientificFloatToScientific.output, scientificFloatToScientific.count, scientificFloatToScientific.e10, cArr, i2);
    }

    private static int writeSpecial(char[] cArr, int i, float f, boolean z, boolean z2) {
        int i2;
        if (z && !z2) {
            IOUtils.putLongUnaligned(cArr, i, IOUtils.NULL_64);
            return i + 4;
        }
        if (z2) {
            cArr[i] = '\"';
            i++;
        }
        if (Float.isNaN(f)) {
            cArr[i] = 'N';
            cArr[i + 1] = 'a';
            cArr[i + 2] = 'N';
            i2 = i + 3;
        } else {
            if (f < 0.0f) {
                cArr[i] = '-';
                i++;
            }
            IOUtils.putLongUnaligned(cArr, i, INFI);
            IOUtils.putLongUnaligned(cArr, i + 4, NITY);
            i2 = i + 8;
        }
        if (!z2) {
            return i2;
        }
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        return i3;
    }

    public static int writeDouble(char[] cArr, int i, double d, boolean z, boolean z2) {
        int i2;
        int length;
        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY || d == Double.NEGATIVE_INFINITY) {
            return writeSpecial(cArr, i, (float) d, z, z2);
        }
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                cArr[i] = '-';
                i++;
            }
            cArr[i] = '0';
            IOUtils.putIntUnaligned(cArr, i + 1, IOUtils.DOT_ZERO_32);
            return i + 3;
        }
        if (d < 0.0d) {
            cArr[i] = '-';
            d = -d;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        long j = (long) d;
        if (d == j) {
            int iStringSize = IOUtils.stringSize(j);
            return writeDecimal(j, iStringSize, iStringSize - 1, cArr, i2);
        }
        Scientific scientificDoubleToScientific = doubleToScientific(d);
        int i3 = scientificDoubleToScientific.e10;
        if (!scientificDoubleToScientific.b) {
            return writeDecimal(scientificDoubleToScientific.output, scientificDoubleToScientific.count, i3, cArr, i2);
        }
        if (i3 >= 0) {
            char[] cArr2 = POSITIVE_DECIMAL_POWER_CHARS[i3];
            System.arraycopy(cArr2, 0, cArr, i2, cArr2.length);
            length = cArr2.length;
        } else {
            char[] cArr3 = NEGATIVE_DECIMAL_POWER_CHARS[-i3];
            System.arraycopy(cArr3, 0, cArr, i2, cArr3.length);
            length = cArr3.length;
        }
        return i2 + length;
    }

    private static int writeDecimal(long j, int i, int i2, char[] cArr, int i3) {
        long j2;
        int i4;
        int iWriteInt64;
        int i5 = i2;
        if ((j & 1) == 0 && j % 5 == 0) {
            j2 = j;
            int i6 = i;
            while (j2 % 100 == 0) {
                i6 -= 2;
                j2 /= 100;
                if (i6 == 1) {
                    break;
                }
            }
            if ((1 & j2) == 0 && j2 % 5 == 0 && j2 > 0) {
                i4 = i6 - 1;
                j2 /= 10;
            } else {
                i4 = i6;
            }
        } else {
            j2 = j;
            i4 = i;
        }
        if (i5 < -3 || i5 >= 7) {
            if (i4 == 1) {
                cArr[i3] = (char) (j2 + 48);
                IOUtils.putIntUnaligned(cArr, i3 + 1, IOUtils.DOT_ZERO_32);
                iWriteInt64 = i3 + 3;
            } else {
                int i7 = i4 - 2;
                long j3 = POW10_LONG_VALUES[i7];
                int i8 = (int) (j2 / j3);
                cArr[i3] = (char) (i8 + 48);
                cArr[i3 + 1] = '.';
                int i9 = i3 + 2;
                long j4 = j2 - (((long) i8) * j3);
                while (true) {
                    i7--;
                    if (i7 <= -1 || j4 >= POW10_LONG_VALUES[i7]) {
                        break;
                    }
                    cArr[i9] = '0';
                    i9++;
                }
                iWriteInt64 = IOUtils.writeInt64(cArr, i9, j4);
            }
            int i10 = iWriteInt64 + 1;
            cArr[iWriteInt64] = 'E';
            if (i5 < 0) {
                cArr[i10] = '-';
                i5 = -i5;
                i10 = iWriteInt64 + 2;
            }
            if (i5 > 99) {
                int i11 = (int) ((((long) i5) * 1374389535) >> 37);
                cArr[i10] = (char) (i11 + 48);
                IOUtils.putIntUnaligned(cArr, i10 + 1, TWO_DIGITS_32_BITS[i5 - (i11 * 100)]);
                return i10 + 3;
            }
            if (i5 > 9) {
                IOUtils.putIntUnaligned(cArr, i10, TWO_DIGITS_32_BITS[i5]);
                return i10 + 2;
            }
            int i12 = i10 + 1;
            cArr[i10] = (char) (i5 + 48);
            return i12;
        }
        if (i5 < 0) {
            IOUtils.putIntUnaligned(cArr, i3, IOUtils.ZERO_DOT_32);
            int i13 = i3 + 2;
            if (i5 == -2) {
                cArr[i13] = '0';
                i13 = i3 + 3;
            } else if (i5 == -3) {
                IOUtils.putIntUnaligned(cArr, i13, 3145776);
                i13 = i3 + 4;
            }
            return IOUtils.writeInt64(cArr, i13, j2);
        }
        int i14 = (i4 - 1) - i5;
        if (i14 > 0) {
            int i15 = i14 - 1;
            long j5 = POW10_LONG_VALUES[i15];
            long j6 = (int) (j2 / j5);
            int iWriteInt65 = IOUtils.writeInt64(cArr, i3, j6);
            int i16 = iWriteInt65 + 1;
            cArr[iWriteInt65] = '.';
            long j7 = j2 - (j6 * j5);
            while (true) {
                i15--;
                if (i15 <= -1 || j7 >= POW10_LONG_VALUES[i15]) {
                    break;
                }
                cArr[i16] = '0';
                i16++;
            }
            return IOUtils.writeInt64(cArr, i16, j7);
        }
        int iWriteInt66 = IOUtils.writeInt64(cArr, i3, j2);
        int i17 = -i14;
        if (i17 > 0) {
            int i18 = 0;
            while (i18 < i17) {
                cArr[iWriteInt66] = '0';
                i18++;
                iWriteInt66++;
            }
        }
        IOUtils.putIntUnaligned(cArr, iWriteInt66, IOUtils.DOT_ZERO_32);
        return iWriteInt66 + 2;
    }
}
