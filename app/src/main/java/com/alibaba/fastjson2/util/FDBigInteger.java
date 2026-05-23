package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FDBigInteger {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int[] data;
    private boolean immutable;
    private int nWords;
    private int offset;
    private static final int[] SMALL_5_POW = {1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
    private static final FDBigInteger[] POW_5_CACHE = new FDBigInteger[340];

    static {
        int i = 0;
        while (true) {
            int[] iArr = SMALL_5_POW;
            if (i >= 14) {
                break;
            }
            FDBigInteger fDBigInteger = new FDBigInteger(new int[]{iArr[i]}, 0);
            fDBigInteger.makeImmutable();
            POW_5_CACHE[i] = fDBigInteger;
            i++;
        }
        FDBigInteger fDBigIntegerMult = POW_5_CACHE[i - 1];
        while (i < 340) {
            FDBigInteger[] fDBigIntegerArr = POW_5_CACHE;
            fDBigIntegerMult = fDBigIntegerMult.mult(5);
            fDBigIntegerArr[i] = fDBigIntegerMult;
            fDBigIntegerMult.makeImmutable();
            i++;
        }
    }

    private FDBigInteger(int[] iArr, int i) {
        this.data = iArr;
        this.offset = i;
        this.nWords = iArr.length;
        trimLeadingZeros();
    }

    private static FDBigInteger big5pow(int i) {
        return i < 340 ? POW_5_CACHE[i] : big5powRec(i);
    }

    private static FDBigInteger big5powRec(int i) {
        if (i < 340) {
            return POW_5_CACHE[i];
        }
        int i2 = i >> 1;
        int i3 = i - i2;
        FDBigInteger fDBigIntegerBig5powRec = big5powRec(i2);
        int[] iArr = SMALL_5_POW;
        return i3 < iArr.length ? fDBigIntegerBig5powRec.mult(iArr[i3]) : fDBigIntegerBig5powRec.mult(big5powRec(i3));
    }

    private static int checkZeroTail(int[] iArr, int i) {
        while (i > 0) {
            i--;
            if (iArr[i] != 0) {
                return 1;
            }
        }
        return 0;
    }

    private static void leftShift(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        while (i > 0) {
            int i5 = iArr[i - 1];
            iArr2[i] = (i4 << i2) | (i5 >>> i3);
            i--;
            i4 = i5;
        }
        iArr2[0] = i4 << i2;
    }

    private FDBigInteger mult(int i) {
        int i2 = this.nWords;
        if (i2 == 0) {
            return this;
        }
        int[] iArr = new int[i2 + 1];
        mult(this.data, i2, i, iArr);
        return new FDBigInteger(iArr, this.offset);
    }

    private void multAddMe(int i, int i2) {
        int i3;
        long j = ((long) i) & 4294967295L;
        int[] iArr = this.data;
        long j2 = ((((long) iArr[0]) & 4294967295L) * j) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j2 >>> 32;
        int i4 = 1;
        while (true) {
            i3 = this.nWords;
            if (i4 >= i3) {
                break;
            }
            int[] iArr2 = this.data;
            long j4 = ((((long) iArr2[i4]) & 4294967295L) * j) + j3;
            iArr2[i4] = (int) j4;
            j3 = j4 >>> 32;
            i4++;
        }
        if (j3 != 0) {
            int[] iArr3 = this.data;
            this.nWords = i3 + 1;
            iArr3[i3] = (int) j3;
        }
    }

    private int size() {
        return this.nWords + this.offset;
    }

    private void trimLeadingZeros() {
        int i = this.nWords;
        if (i > 0) {
            int i2 = i - 1;
            if (this.data[i2] == 0) {
                while (i2 > 0 && this.data[i2 - 1] == 0) {
                    i2--;
                }
                this.nWords = i2;
                if (i2 == 0) {
                    this.offset = 0;
                }
            }
        }
    }

    public static FDBigInteger valueOfMulPow52(long j, int i, int i2) {
        int[] iArr;
        int i3 = (int) j;
        int i4 = (int) (j >>> 32);
        int i5 = i2 >> 5;
        int i6 = i2 & 31;
        if (i == 0) {
            if (i2 == 0) {
                return new FDBigInteger(new int[]{i3, i4}, 0);
            }
            if (i6 == 0) {
                return new FDBigInteger(new int[]{i3, i4}, i5);
            }
            int i7 = 32 - i6;
            return new FDBigInteger(new int[]{i3 << i6, (i3 >>> i7) | (i4 << i6), i4 >>> i7}, i5);
        }
        int[] iArr2 = SMALL_5_POW;
        if (i >= iArr2.length) {
            FDBigInteger fDBigIntegerBig5pow = big5pow(i);
            if (i4 == 0) {
                int i8 = fDBigIntegerBig5pow.nWords;
                iArr = new int[i8 + 1 + (i2 != 0 ? 1 : 0)];
                mult(fDBigIntegerBig5pow.data, i8, i3, iArr);
            } else {
                int i9 = fDBigIntegerBig5pow.nWords;
                iArr = new int[i9 + 2 + (i2 != 0 ? 1 : 0)];
                mult(fDBigIntegerBig5pow.data, i9, i3, i4, iArr);
            }
            return new FDBigInteger(iArr, fDBigIntegerBig5pow.offset).leftShift(i2);
        }
        long j2 = ((long) iArr2[i]) & 4294967295L;
        long j3 = (((long) i3) & 4294967295L) * j2;
        int i10 = (int) j3;
        long j4 = ((4294967295L & ((long) i4)) * j2) + (j3 >>> 32);
        int i11 = (int) j4;
        int i12 = (int) (j4 >>> 32);
        if (i6 == 0) {
            return new FDBigInteger(new int[]{i10, i11, i12}, i5);
        }
        int i13 = 32 - i6;
        return new FDBigInteger(new int[]{i10 << i6, (i10 >>> i13) | (i11 << i6), (i11 >>> i13) | (i12 << i6), i12 >>> i13}, i5);
    }

    public int cmp(FDBigInteger fDBigInteger) {
        int i = this.nWords;
        int i2 = this.offset + i;
        int i3 = fDBigInteger.nWords;
        int i4 = fDBigInteger.offset + i3;
        if (i2 > i4) {
            return 1;
        }
        if (i2 < i4) {
            return -1;
        }
        while (i > 0 && i3 > 0) {
            i--;
            int i5 = this.data[i];
            i3--;
            int i6 = fDBigInteger.data[i3];
            if (i5 != i6) {
                return (((long) i5) & 4294967295L) < (((long) i6) & 4294967295L) ? -1 : 1;
            }
        }
        if (i > 0) {
            return checkZeroTail(this.data, i);
        }
        if (i3 > 0) {
            return -checkZeroTail(fDBigInteger.data, i3);
        }
        return 0;
    }

    public int cmpPow52(int i, int i2) {
        if (i != 0) {
            return cmp(big5pow(i).leftShift(i2));
        }
        int i3 = i2 >> 5;
        int i4 = i2 & 31;
        int i5 = this.nWords;
        int i6 = this.offset + i5;
        int i7 = i3 + 1;
        if (i6 > i7) {
            return 1;
        }
        if (i6 < i7) {
            return -1;
        }
        int[] iArr = this.data;
        int i8 = iArr[i5 - 1];
        int i9 = 1 << i4;
        if (i8 != i9) {
            return (((long) i8) & 4294967295L) < (((long) i9) & 4294967295L) ? -1 : 1;
        }
        return checkZeroTail(iArr, i5 - 1);
    }

    public FDBigInteger leftInplaceSub(FDBigInteger fDBigInteger) {
        FDBigInteger fDBigInteger2 = this.immutable ? new FDBigInteger((int[]) this.data.clone(), this.offset) : this;
        int i = fDBigInteger.offset - fDBigInteger2.offset;
        int[] iArr = fDBigInteger.data;
        int[] iArr2 = fDBigInteger2.data;
        int i2 = fDBigInteger.nWords;
        int i3 = fDBigInteger2.nWords;
        int i4 = 0;
        if (i < 0) {
            int i5 = i3 - i;
            if (i5 < iArr2.length) {
                int i6 = -i;
                System.arraycopy(iArr2, 0, iArr2, i6, i3);
                Arrays.fill(iArr2, 0, i6, 0);
            } else {
                int[] iArr3 = new int[i5];
                System.arraycopy(iArr2, 0, iArr3, -i, i3);
                fDBigInteger2.data = iArr3;
                iArr2 = iArr3;
            }
            fDBigInteger2.offset = fDBigInteger.offset;
            fDBigInteger2.nWords = i5;
            i = 0;
            i3 = i5;
        }
        long j = 0;
        while (i4 < i2 && i < i3) {
            long j2 = ((((long) iArr2[i]) & 4294967295L) - (((long) iArr[i4]) & 4294967295L)) + j;
            iArr2[i] = (int) j2;
            j = j2 >> 32;
            i4++;
            i++;
            fDBigInteger2 = fDBigInteger2;
        }
        FDBigInteger fDBigInteger3 = fDBigInteger2;
        while (j != 0 && i < i3) {
            long j3 = (((long) iArr2[i]) & 4294967295L) + j;
            iArr2[i] = (int) j3;
            j = j3 >> 32;
            i++;
        }
        fDBigInteger3.trimLeadingZeros();
        return fDBigInteger3;
    }

    public void makeImmutable() {
        this.immutable = true;
    }

    public FDBigInteger multByPow52(int i, int i2) {
        FDBigInteger fDBigInteger;
        int i3 = this.nWords;
        if (i3 == 0) {
            return this;
        }
        if (i != 0) {
            int i4 = i2 != 0 ? 1 : 0;
            int[] iArr = SMALL_5_POW;
            if (i < iArr.length) {
                int[] iArr2 = new int[i3 + 1 + i4];
                mult(this.data, i3, iArr[i], iArr2);
                fDBigInteger = new FDBigInteger(iArr2, this.offset);
            } else {
                FDBigInteger fDBigIntegerBig5pow = big5pow(i);
                int[] iArr3 = new int[this.nWords + fDBigIntegerBig5pow.size() + i4];
                mult(this.data, this.nWords, fDBigIntegerBig5pow.data, fDBigIntegerBig5pow.nWords, iArr3);
                fDBigInteger = new FDBigInteger(iArr3, this.offset + fDBigIntegerBig5pow.offset);
            }
        } else {
            fDBigInteger = this;
        }
        return fDBigInteger.leftShift(i2);
    }

    public FDBigInteger rightInplaceSub(FDBigInteger fDBigInteger) {
        char c;
        long j;
        FDBigInteger fDBigInteger2 = fDBigInteger;
        if (fDBigInteger2.immutable) {
            fDBigInteger2 = new FDBigInteger((int[]) fDBigInteger2.data.clone(), fDBigInteger2.offset);
        }
        int i = this.offset - fDBigInteger2.offset;
        int[] iArrCopyOf = fDBigInteger2.data;
        int[] iArr = this.data;
        int i2 = fDBigInteger2.nWords;
        int i3 = this.nWords;
        int i4 = 0;
        if (i < 0) {
            if (i3 < iArrCopyOf.length) {
                int i5 = -i;
                System.arraycopy(iArrCopyOf, 0, iArrCopyOf, i5, i2);
                Arrays.fill(iArrCopyOf, 0, i5, 0);
            } else {
                int[] iArr2 = new int[i3];
                System.arraycopy(iArrCopyOf, 0, iArr2, -i, i2);
                fDBigInteger2.data = iArr2;
                iArrCopyOf = iArr2;
            }
            fDBigInteger2.offset = this.offset;
            i = 0;
        } else {
            int i6 = i3 + i;
            if (i6 >= iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                fDBigInteger2.data = iArrCopyOf;
            }
        }
        long j2 = 0;
        int i7 = 0;
        while (true) {
            c = ' ';
            j = 4294967295L;
            if (i7 >= i) {
                break;
            }
            long j3 = (-(4294967295L & ((long) iArrCopyOf[i7]))) + j2;
            iArrCopyOf[i7] = (int) j3;
            j2 = j3 >> 32;
            i7++;
        }
        while (i4 < i3) {
            char c2 = 32;
            long j4 = 4294967295L;
            long j5 = ((((long) iArr[i4]) & 4294967295L) - (((long) iArrCopyOf[i7]) & 4294967295L)) + j2;
            iArrCopyOf[i7] = (int) j5;
            j2 = j5 >> 32;
            i7++;
            i4++;
            c = 32;
            j = 4294967295L;
        }
        fDBigInteger2.nWords = i7;
        fDBigInteger2.trimLeadingZeros();
        return fDBigInteger2;
    }

    public FDBigInteger leftShift(int i) {
        int i2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = this.data;
        int i3 = this.nWords;
        int i4 = this.offset;
        if (i != 0 && i3 != 0) {
            int i5 = i >> 5;
            int i6 = i & 31;
            if (this.immutable) {
                if (i6 == 0) {
                    return new FDBigInteger(Arrays.copyOf(iArr4, i3), i4 + i5);
                }
                int i7 = 32 - i6;
                int i8 = i3 - 1;
                int i9 = iArr4[i8];
                int i10 = i9 >>> i7;
                if (i10 != 0) {
                    iArr3 = new int[i3 + 1];
                    iArr3[i3] = i10;
                } else {
                    iArr3 = new int[i3];
                }
                int[] iArr5 = iArr3;
                leftShift(iArr4, i8, iArr5, i6, i7, i9);
                return new FDBigInteger(iArr5, i4 + i5);
            }
            int i11 = i3;
            if (i6 != 0) {
                int i12 = 32 - i6;
                int i13 = 0;
                int i14 = iArr4[0];
                if ((i14 << i6) == 0) {
                    while (i13 < i11 - 1) {
                        int i15 = i13 + 1;
                        int i16 = iArr4[i15];
                        iArr4[i13] = (i14 >>> i12) | (i16 << i6);
                        i13 = i15;
                        i14 = i16;
                    }
                    int i17 = i14 >>> i12;
                    iArr4[i13] = i17;
                    i2 = i17 == 0 ? i11 - 1 : i11;
                    i4++;
                } else {
                    int i18 = i11 - 1;
                    int i19 = iArr4[i18];
                    int i20 = i19 >>> i12;
                    if (i20 != 0) {
                        if (i11 == iArr4.length) {
                            iArr2 = new int[i11 + 1];
                            this.data = iArr2;
                        } else {
                            iArr2 = iArr4;
                        }
                        iArr2[i11] = i20;
                        iArr = iArr2;
                        i11++;
                    } else {
                        iArr = iArr4;
                    }
                    leftShift(iArr4, i18, iArr, i6, i12, i19);
                    i2 = i11;
                }
            } else {
                i2 = i11;
            }
            this.nWords = i2;
            this.offset = i4 + i5;
        }
        return this;
    }

    private FDBigInteger mult(FDBigInteger fDBigInteger) {
        if (this.nWords == 0) {
            return this;
        }
        if (size() == 1) {
            return fDBigInteger.mult(this.data[0]);
        }
        if (fDBigInteger.nWords == 0) {
            return fDBigInteger;
        }
        if (fDBigInteger.size() == 1) {
            return mult(fDBigInteger.data[0]);
        }
        int i = this.nWords;
        int i2 = fDBigInteger.nWords;
        int[] iArr = new int[i + i2];
        mult(this.data, i, fDBigInteger.data, i2, iArr);
        return new FDBigInteger(iArr, this.offset + fDBigInteger.offset);
    }

    public FDBigInteger(long j, byte[] bArr, int i, int i2) {
        int[] iArr = new int[Math.max((i2 + 8) / 9, 2)];
        this.data = iArr;
        int i3 = 0;
        iArr[0] = (int) j;
        iArr[1] = (int) (j >>> 32);
        this.offset = 0;
        this.nWords = 2;
        int i4 = i2 - 5;
        while (i < i4) {
            int i5 = i + 5;
            int i6 = bArr[i] + -48;
            i++;
            while (i < i5) {
                i6 = ((i6 * 10) + bArr[i]) - 48;
                i++;
            }
            multAddMe(100000, i6);
        }
        int i7 = 1;
        while (i < i2) {
            i3 = ((i3 * 10) + bArr[i]) - 48;
            i7 *= 10;
            i++;
        }
        if (i7 != 1) {
            multAddMe(i7, i3);
        }
        trimLeadingZeros();
    }

    private static void mult(int[] iArr, int i, int i2, int[] iArr2) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = ((((long) iArr[i3]) & 4294967295L) * j) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        iArr2[i] = (int) j2;
    }

    private static void mult(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) iArr[i3]) & 4294967295L;
            long j2 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i3 + i4;
                long j3 = ((((long) iArr2[i4]) & 4294967295L) * j) + (((long) iArr3[i5]) & 4294967295L) + j2;
                iArr3[i5] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr3[i3 + i2] = (int) j2;
        }
    }

    private static void mult(int[] iArr, int i, int i2, int i3, int[] iArr2) {
        mult(iArr, i, i2, iArr2);
        long j = ((long) i3) & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 + 1;
            long j3 = ((((long) iArr[i4]) & 4294967295L) * j) + (((long) iArr2[i5]) & 4294967295L) + j2;
            iArr2[i5] = (int) j3;
            j2 = j3 >>> 32;
            i4 = i5;
        }
        iArr2[i + 1] = (int) j2;
    }
}
