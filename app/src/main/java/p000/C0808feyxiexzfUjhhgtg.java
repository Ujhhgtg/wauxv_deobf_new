package p000;

import com.umeng.analytics.pro.bc;
import java.math.BigInteger;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ要点脸能不能ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0808feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final BigInteger f3198Ujhhgtgfeyxiexzf = new BigInteger("ffffffffffffffff", 16);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final BigInteger[] f3199Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final BigInteger[] f3200Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final BigInteger[] f3201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final BigInteger[] f3202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3203Ujhhgtgfeyxiexzf;

    public C0808feyxiexzfUjhhgtg(BigInteger bigInteger) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        BigInteger[] bigIntegerArr = new BigInteger[8];
        for (int i = 0; i < 8; i++) {
            bigIntegerArr[i] = new BigInteger("9e3779b97f4a7c13", 16);
        }
        this.f3199Ujhhgtgfeyxiexzf = bigIntegerArr;
        BigInteger[] bigIntegerArr2 = new BigInteger[bc.e];
        for (int i2 = 0; i2 < 256; i2++) {
            bigIntegerArr2[i2] = BigInteger.ZERO;
        }
        this.f3200Ujhhgtgfeyxiexzf = bigIntegerArr2;
        BigInteger[] bigIntegerArr3 = new BigInteger[bc.e];
        for (int i3 = 0; i3 < 256; i3++) {
            bigIntegerArr3[i3] = BigInteger.ZERO;
        }
        this.f3201Ujhhgtgfeyxiexzf = bigIntegerArr3;
        BigInteger[] bigIntegerArr4 = new BigInteger[bc.e];
        for (int i4 = 0; i4 < 256; i4++) {
            bigIntegerArr4[i4] = BigInteger.ZERO;
        }
        this.f3202Ujhhgtgfeyxiexzf = bigIntegerArr4;
        this.f3203Ujhhgtgfeyxiexzf = 255;
        BigInteger[] bigIntegerArr5 = this.f3201Ujhhgtgfeyxiexzf;
        BigInteger[] bigIntegerArr6 = this.f3199Ujhhgtgfeyxiexzf;
        BigInteger[] bigIntegerArr7 = this.f3200Ujhhgtgfeyxiexzf;
        bigIntegerArr7[0] = bigInteger;
        for (int i5 = 0; i5 < 4; i5++) {
            m2155Ujhhgtgfeyxiexzf(bigIntegerArr6);
        }
        C0680Ujhhgtgfeyxiexzf c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2807Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(0, bigIntegerArr7.length), 8);
        int i6 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2805Ujhhgtgfeyxiexzf;
        int i7 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2806Ujhhgtgfeyxiexzf;
        int i8 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf.f2807Ujhhgtgfeyxiexzf;
        BigInteger bigInteger2 = f3198Ujhhgtgfeyxiexzf;
        if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
            while (true) {
                for (int i9 = 0; i9 < 8; i9++) {
                    BigInteger bigIntegerAdd = bigIntegerArr6[i9].add(bigIntegerArr7[i6 + i9]);
                    "add(...)";
                    bigIntegerArr6[i9] = bigIntegerAdd.and(bigInteger2);
                }
                m2155Ujhhgtgfeyxiexzf(bigIntegerArr6);
                for (int i10 = 0; i10 < 8; i10++) {
                    bigIntegerArr5[i6 + i10] = bigIntegerArr6[i10];
                }
                if (i6 == i7) {
                    break;
                } else {
                    i6 += i8;
                }
            }
        }
        C0680Ujhhgtgfeyxiexzf c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf2 = AbstractC1264feyxiexzfUjhhgtg.m2807Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(0, bigIntegerArr5.length), 8);
        int i11 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf2.f2805Ujhhgtgfeyxiexzf;
        int i12 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf2.f2806Ujhhgtgfeyxiexzf;
        int i13 = c0680UjhhgtgfeyxiexzfM2807Ujhhgtgfeyxiexzf2.f2807Ujhhgtgfeyxiexzf;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (true) {
                for (int i14 = 0; i14 < 8; i14++) {
                    BigInteger bigIntegerAdd2 = bigIntegerArr6[i14].add(bigIntegerArr5[i11 + i14]);
                    "add(...)";
                    bigIntegerArr6[i14] = bigIntegerAdd2.and(bigInteger2);
                }
                m2155Ujhhgtgfeyxiexzf(bigIntegerArr6);
                for (int i15 = 0; i15 < 8; i15++) {
                    bigIntegerArr5[i11 + i15] = bigIntegerArr6[i15];
                }
                if (i11 == i12) {
                    break;
                } else {
                    i11 += i13;
                }
            }
        }
        m2156Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m2155Ujhhgtgfeyxiexzf(BigInteger[] bigIntegerArr) {
        BigInteger bigIntegerSubtract = bigIntegerArr[0].subtract(bigIntegerArr[4]);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        "subtract(...)";
        BigInteger bigInteger = f3198Ujhhgtgfeyxiexzf;
        bigIntegerArr[0] = bigIntegerSubtract.and(bigInteger);
        BigInteger bigInteger2 = bigIntegerArr[5];
        BigInteger bigIntegerShiftRight = bigIntegerArr[7].shiftRight(9);
        "shiftRight(...)";
        bigIntegerArr[5] = bigInteger2.xor(bigIntegerShiftRight).and(bigInteger);
        BigInteger bigIntegerAdd = bigIntegerArr[7].add(bigIntegerArr[0]);
        "add(...)";
        bigIntegerArr[7] = bigIntegerAdd.and(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerArr[1].subtract(bigIntegerArr[5]);
        "subtract(...)";
        bigIntegerArr[1] = bigIntegerSubtract2.and(bigInteger);
        BigInteger bigInteger3 = bigIntegerArr[6];
        BigInteger bigIntegerShiftLeft = bigIntegerArr[0].shiftLeft(9);
        "shiftLeft(...)";
        bigIntegerArr[6] = bigInteger3.xor(bigIntegerShiftLeft).and(bigInteger);
        BigInteger bigIntegerAdd2 = bigIntegerArr[0].add(bigIntegerArr[1]);
        "add(...)";
        bigIntegerArr[0] = bigIntegerAdd2.and(bigInteger);
        BigInteger bigIntegerSubtract3 = bigIntegerArr[2].subtract(bigIntegerArr[6]);
        "subtract(...)";
        bigIntegerArr[2] = bigIntegerSubtract3.and(bigInteger);
        BigInteger bigInteger4 = bigIntegerArr[7];
        BigInteger bigIntegerShiftRight2 = bigIntegerArr[1].shiftRight(23);
        "shiftRight(...)";
        bigIntegerArr[7] = bigInteger4.xor(bigIntegerShiftRight2).and(bigInteger);
        BigInteger bigIntegerAdd3 = bigIntegerArr[1].add(bigIntegerArr[2]);
        "add(...)";
        bigIntegerArr[1] = bigIntegerAdd3.and(bigInteger);
        BigInteger bigIntegerSubtract4 = bigIntegerArr[3].subtract(bigIntegerArr[7]);
        "subtract(...)";
        bigIntegerArr[3] = bigIntegerSubtract4.and(bigInteger);
        BigInteger bigInteger5 = bigIntegerArr[0];
        BigInteger bigIntegerShiftLeft2 = bigIntegerArr[2].shiftLeft(15);
        "shiftLeft(...)";
        bigIntegerArr[0] = bigInteger5.xor(bigIntegerShiftLeft2).and(bigInteger);
        BigInteger bigIntegerAdd4 = bigIntegerArr[2].add(bigIntegerArr[3]);
        "add(...)";
        bigIntegerArr[2] = bigIntegerAdd4.and(bigInteger);
        BigInteger bigIntegerSubtract5 = bigIntegerArr[4].subtract(bigIntegerArr[0]);
        "subtract(...)";
        bigIntegerArr[4] = bigIntegerSubtract5.and(bigInteger);
        BigInteger bigInteger6 = bigIntegerArr[1];
        BigInteger bigIntegerShiftRight3 = bigIntegerArr[3].shiftRight(14);
        "shiftRight(...)";
        bigIntegerArr[1] = bigInteger6.xor(bigIntegerShiftRight3).and(bigInteger);
        BigInteger bigIntegerAdd5 = bigIntegerArr[3].add(bigIntegerArr[4]);
        "add(...)";
        bigIntegerArr[3] = bigIntegerAdd5.and(bigInteger);
        BigInteger bigIntegerSubtract6 = bigIntegerArr[5].subtract(bigIntegerArr[1]);
        "subtract(...)";
        bigIntegerArr[5] = bigIntegerSubtract6.and(bigInteger);
        BigInteger bigInteger7 = bigIntegerArr[2];
        BigInteger bigIntegerShiftLeft3 = bigIntegerArr[4].shiftLeft(20);
        "shiftLeft(...)";
        bigIntegerArr[2] = bigInteger7.xor(bigIntegerShiftLeft3).and(bigInteger);
        BigInteger bigIntegerAdd6 = bigIntegerArr[4].add(bigIntegerArr[5]);
        "add(...)";
        bigIntegerArr[4] = bigIntegerAdd6.and(bigInteger);
        BigInteger bigIntegerSubtract7 = bigIntegerArr[6].subtract(bigIntegerArr[2]);
        "subtract(...)";
        bigIntegerArr[6] = bigIntegerSubtract7.and(bigInteger);
        BigInteger bigInteger8 = bigIntegerArr[3];
        BigInteger bigIntegerShiftRight4 = bigIntegerArr[5].shiftRight(17);
        "shiftRight(...)";
        bigIntegerArr[3] = bigInteger8.xor(bigIntegerShiftRight4).and(bigInteger);
        BigInteger bigIntegerAdd7 = bigIntegerArr[5].add(bigIntegerArr[6]);
        "add(...)";
        bigIntegerArr[5] = bigIntegerAdd7.and(bigInteger);
        BigInteger bigIntegerSubtract8 = bigIntegerArr[7].subtract(bigIntegerArr[3]);
        "subtract(...)";
        bigIntegerArr[7] = bigIntegerSubtract8.and(bigInteger);
        BigInteger bigInteger9 = bigIntegerArr[4];
        BigInteger bigIntegerShiftLeft4 = bigIntegerArr[6].shiftLeft(14);
        "shiftLeft(...)";
        bigIntegerArr[4] = bigInteger9.xor(bigIntegerShiftLeft4).and(bigInteger);
        BigInteger bigIntegerAdd8 = bigIntegerArr[6].add(bigIntegerArr[7]);
        "add(...)";
        bigIntegerArr[6] = bigIntegerAdd8.and(bigInteger);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2156Ujhhgtgfeyxiexzf() {
        BigInteger[] bigIntegerArr = this.f3202Ujhhgtgfeyxiexzf;
        int i = 2;
        BigInteger bigIntegerAdd = bigIntegerArr[2].add(BigInteger.ONE);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        "add(...)";
        BigInteger bigInteger = f3198Ujhhgtgfeyxiexzf;
        bigIntegerArr[2] = bigIntegerAdd.and(bigInteger);
        int i2 = 1;
        BigInteger bigIntegerAdd2 = bigIntegerArr[1].add(bigIntegerArr[2]);
        "add(...)";
        bigIntegerArr[1] = bigIntegerAdd2.and(bigInteger);
        char c = 0;
        int i3 = 0;
        while (i3 < 256) {
            int i4 = i3 % 4;
            if (i4 == 0) {
                BigInteger bigInteger2 = bigIntegerArr[c];
                BigInteger bigIntegerShiftLeft = bigInteger2.shiftLeft(21);
                "shiftLeft(...)";
                bigIntegerArr[c] = bigInteger2.xor(bigIntegerShiftLeft).not().and(bigInteger);
            } else if (i4 == i2) {
                BigInteger bigInteger3 = bigIntegerArr[c];
                BigInteger bigIntegerShiftRight = bigInteger3.shiftRight(5);
                "shiftRight(...)";
                bigIntegerArr[c] = bigInteger3.xor(bigIntegerShiftRight);
            } else if (i4 == i) {
                BigInteger bigInteger4 = bigIntegerArr[c];
                BigInteger bigIntegerShiftLeft2 = bigInteger4.shiftLeft(12);
                "shiftLeft(...)";
                bigIntegerArr[c] = bigInteger4.xor(bigIntegerShiftLeft2);
            } else if (i4 == 3) {
                BigInteger bigInteger5 = bigIntegerArr[c];
                BigInteger bigIntegerShiftRight2 = bigInteger5.shiftRight(33);
                "shiftRight(...)";
                bigIntegerArr[c] = bigInteger5.xor(bigIntegerShiftRight2);
            }
            BigInteger bigInteger6 = bigIntegerArr[c];
            int i5 = (i3 + 128) % bc.e;
            BigInteger[] bigIntegerArr2 = this.f3201Ujhhgtgfeyxiexzf;
            BigInteger bigIntegerAdd3 = bigInteger6.add(bigIntegerArr2[i5]);
            "add(...)";
            bigIntegerArr[c] = bigIntegerAdd3.and(bigInteger);
            BigInteger bigInteger7 = bigIntegerArr2[i3];
            BigInteger bigIntegerShiftRight3 = bigInteger7.shiftRight(3);
            "shiftRight(...)";
            long j = bc.e;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
            int i6 = i2;
            "valueOf(...)";
            BigInteger bigIntegerAdd4 = bigIntegerArr2[bigIntegerShiftRight3.mod(bigIntegerValueOf).intValue()].add(bigIntegerArr[c]);
            int i7 = i3;
            "add(...)";
            BigInteger bigIntegerAdd5 = bigIntegerAdd4.add(bigIntegerArr[i6]);
            "add(...)";
            BigInteger bigIntegerAnd = bigIntegerAdd5.and(bigInteger);
            bigIntegerArr2[i7] = bigIntegerAnd;
            BigInteger bigIntegerShiftRight4 = bigIntegerAnd.shiftRight(11);
            "shiftRight(...)";
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(j);
            "valueOf(...)";
            BigInteger bigIntegerAdd6 = bigIntegerArr2[bigIntegerShiftRight4.mod(bigIntegerValueOf2).intValue()].add(bigInteger7);
            "add(...)";
            bigIntegerArr[i6] = bigIntegerAdd6.and(bigInteger);
            this.f3200Ujhhgtgfeyxiexzf[i7] = bigIntegerArr[i6];
            i3 = i7 + 1;
            i2 = i6;
            i = 2;
            c = 0;
        }
    }
}
