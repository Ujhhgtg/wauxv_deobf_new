package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0909feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3639Ujhhgtgfeyxiexzf f3512Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2366Ujhhgtgfeyxiexzf f3513Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f3514Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0416Ujhhgtgfeyxiexzf f3515Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f3516Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int[] f3517Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f3518Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f3519Ujhhgtgfeyxiexzf;

    public C0909feyxiexzfUjhhgtg(C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf, int i, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf) {
        this.f3512Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf;
        this.f3513Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(c3639Ujhhgtgfeyxiexzf);
        this.f3518Ujhhgtgfeyxiexzf = i;
        boolean[] zArr = {true};
        C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg = (C2492feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf;
        C3647Ujhhgtgfeyxiexzf c3647Ujhhgtgfeyxiexzf = new C3647Ujhhgtgfeyxiexzf(zArr, c2492feyxiexzfUjhhgtg.m3774Ujhhgtgfeyxiexzf(), i);
        int length = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        for (int i2 = 0; i2 < length; i2++) {
            C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = ((C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i2)).f8153Ujhhgtgfeyxiexzf;
            int length2 = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            for (int i3 = 0; i3 < length2; i3++) {
                ((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i3)).mo1936Ujhhgtgfeyxiexzf(c3647Ujhhgtgfeyxiexzf);
            }
        }
        boolean z = zArr[0];
        this.f3519Ujhhgtgfeyxiexzf = z;
        Object[] objArr = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf;
        int length3 = objArr.length * 3;
        int length4 = objArr.length;
        int length5 = 0;
        for (int i4 = 0; i4 < length4; i4++) {
            C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg = (C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf[i4];
            if (c2495feyxiexzfUjhhgtg != null) {
                length5 += c2495feyxiexzfUjhhgtg.f8153Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            }
        }
        int i5 = length5 + length3;
        int iM3774Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg.m3774Ujhhgtgfeyxiexzf() + (z ? 0 : i);
        this.f3516Ujhhgtgfeyxiexzf = iM3774Ujhhgtgfeyxiexzf;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(c2697Ujhhgtgfeyxiexzf, i5, length3, iM3774Ujhhgtgfeyxiexzf, i);
        this.f3514Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
        this.f3515Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(this, c2629Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0960feyxiexzfUjhhgtg m2396Ujhhgtgfeyxiexzf(AbstractC0671Ujhhgtgfeyxiexzf abstractC0671Ujhhgtgfeyxiexzf, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf = abstractC0671Ujhhgtgfeyxiexzf.f2789Ujhhgtgfeyxiexzf;
        int i = abstractC0671Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf.f3750Ujhhgtgfeyxiexzf;
        if (i != 14 && i != 16) {
            switch (i) {
                case 20:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                    if (c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length == 2) {
                        c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf = C0960feyxiexzfUjhhgtg.m2446Ujhhgtgfeyxiexzf((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(1), (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(0));
                    }
                    break;
            }
        } else if (c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length == 2 && c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf == ((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(1)).f3830Ujhhgtgfeyxiexzf) {
            c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf = C0960feyxiexzfUjhhgtg.m2446Ujhhgtgfeyxiexzf((C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(1), (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(0));
        }
        if (c0961feyxiexzfUjhhgtg == null) {
            return c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf;
        }
        int length = c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = new C0960feyxiexzfUjhhgtg(length + 1);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i3, c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i2));
            i2 = i3;
        }
        c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(0, c0961feyxiexzfUjhhgtg);
        if (!c0960feyxiexzfUjhhgtgM2446Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf) {
            c0960feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
        }
        return c0960feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C2363Ujhhgtgfeyxiexzf m2397Ujhhgtgfeyxiexzf(C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf, int i, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf) {
        int i2;
        int i3;
        C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf;
        int iM1944Ujhhgtgfeyxiexzf;
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf;
        int i4 = c3639Ujhhgtgfeyxiexzf.f11368Ujhhgtgfeyxiexzf;
        C0909feyxiexzfUjhhgtg c0909feyxiexzfUjhhgtg = new C0909feyxiexzfUjhhgtg(c3639Ujhhgtgfeyxiexzf, i, c2697Ujhhgtgfeyxiexzf);
        C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg = (C2492feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf;
        int length = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        int iM1056Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg.m1056Ujhhgtgfeyxiexzf();
        int[] iArrM4568Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4568Ujhhgtgfeyxiexzf(iM1056Ujhhgtgfeyxiexzf);
        int[] iArrM4568Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4568Ujhhgtgfeyxiexzf(iM1056Ujhhgtgfeyxiexzf);
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, ((C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i5)).f8152Ujhhgtgfeyxiexzf);
        }
        int[] iArr = new int[length];
        int iM4557Ujhhgtgfeyxiexzf = i4;
        int i6 = 0;
        while (iM4557Ujhhgtgfeyxiexzf != -1) {
            while (true) {
                if (((C0684Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf) == null) {
                    int iM1056Ujhhgtgfeyxiexzf2 = c2492feyxiexzfUjhhgtg.m1056Ujhhgtgfeyxiexzf();
                    C0684Ujhhgtgfeyxiexzf[] c0684UjhhgtgfeyxiexzfArr = new C0684Ujhhgtgfeyxiexzf[iM1056Ujhhgtgfeyxiexzf2];
                    C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf2 = new C0684Ujhhgtgfeyxiexzf(10);
                    int i7 = 0;
                    for (int length2 = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length; i7 < length2; length2 = length2) {
                        C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg = (C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i7);
                        int i8 = i4;
                        int i9 = c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf;
                        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf3 = c2495feyxiexzfUjhhgtg.f8154Ujhhgtgfeyxiexzf;
                        int i10 = i7;
                        int i11 = c0684Ujhhgtgfeyxiexzf3.f2814Ujhhgtgfeyxiexzf;
                        if (i11 == 0) {
                            c0684Ujhhgtgfeyxiexzf2.m1942Ujhhgtgfeyxiexzf(i9);
                        } else {
                            int i12 = 0;
                            while (i12 < i11) {
                                int iM1944Ujhhgtgfeyxiexzf2 = c0684Ujhhgtgfeyxiexzf3.m1944Ujhhgtgfeyxiexzf(i12);
                                C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf4 = c0684UjhhgtgfeyxiexzfArr[iM1944Ujhhgtgfeyxiexzf2];
                                int i13 = i11;
                                if (c0684Ujhhgtgfeyxiexzf4 == null) {
                                    c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(10);
                                    c0684UjhhgtgfeyxiexzfArr[iM1944Ujhhgtgfeyxiexzf2] = c0684Ujhhgtgfeyxiexzf;
                                } else {
                                    c0684Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf4;
                                }
                                c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i9);
                                i12++;
                                i11 = i13;
                            }
                        }
                        i7 = i10 + 1;
                        i4 = i8;
                    }
                    i2 = i4;
                    for (int i14 = 0; i14 < iM1056Ujhhgtgfeyxiexzf2; i14++) {
                        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf5 = c0684UjhhgtgfeyxiexzfArr[i14];
                        if (c0684Ujhhgtgfeyxiexzf5 != null) {
                            c0684Ujhhgtgfeyxiexzf5.m1948Ujhhgtgfeyxiexzf();
                            c0684Ujhhgtgfeyxiexzf5.f2247Ujhhgtgfeyxiexzf = false;
                        }
                    }
                    c0684Ujhhgtgfeyxiexzf2.m1948Ujhhgtgfeyxiexzf();
                    c0684Ujhhgtgfeyxiexzf2.f2247Ujhhgtgfeyxiexzf = false;
                    if (c0684UjhhgtgfeyxiexzfArr[i2] == null) {
                        c0684UjhhgtgfeyxiexzfArr[i2] = C0684Ujhhgtgfeyxiexzf.f2812Ujhhgtgfeyxiexzf;
                    }
                    c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf = c0684UjhhgtgfeyxiexzfArr;
                    c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf2;
                } else {
                    i2 = i4;
                }
                C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf6 = ((C0684Ujhhgtgfeyxiexzf[]) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf)[iM4557Ujhhgtgfeyxiexzf];
                if (c0684Ujhhgtgfeyxiexzf6 == null) {
                    throw new RuntimeException("no such block: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(iM4557Ujhhgtgfeyxiexzf)));
                }
                int i15 = c0684Ujhhgtgfeyxiexzf6.f2814Ujhhgtgfeyxiexzf;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        break;
                    }
                    iM1944Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf6.m1944Ujhhgtgfeyxiexzf(i16);
                    if (AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf2, iM1944Ujhhgtgfeyxiexzf)) {
                        break;
                    }
                    if (AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, iM1944Ujhhgtgfeyxiexzf) && c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(iM1944Ujhhgtgfeyxiexzf).f8155Ujhhgtgfeyxiexzf == iM4557Ujhhgtgfeyxiexzf) {
                        break;
                    }
                    i16++;
                }
                AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf2, iM1944Ujhhgtgfeyxiexzf);
                iM4557Ujhhgtgfeyxiexzf = iM1944Ujhhgtgfeyxiexzf;
                i4 = i2;
            }
            int i17 = -1;
            while (iM4557Ujhhgtgfeyxiexzf != i17) {
                AbstractC3085Ujhhgtgfeyxiexzf.m4553Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, iM4557Ujhhgtgfeyxiexzf);
                AbstractC3085Ujhhgtgfeyxiexzf.m4553Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf2, iM4557Ujhhgtgfeyxiexzf);
                iArr[i6] = iM4557Ujhhgtgfeyxiexzf;
                i6++;
                C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf2 = c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(iM4557Ujhhgtgfeyxiexzf);
                C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf7 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf2.f8154Ujhhgtgfeyxiexzf;
                int i18 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf2.f8155Ujhhgtgfeyxiexzf;
                int i19 = c0684Ujhhgtgfeyxiexzf7.f2814Ujhhgtgfeyxiexzf;
                if (i19 == 0) {
                    i3 = -1;
                    c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf = null;
                } else if (i19 != 1) {
                    i3 = -1;
                    c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf = i18 != -1 ? c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(i18) : c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf7.m1944Ujhhgtgfeyxiexzf(0));
                } else {
                    i3 = -1;
                    c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf7.m1944Ujhhgtgfeyxiexzf(0));
                }
                if (c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf == null) {
                    break;
                }
                int i20 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf.f8152Ujhhgtgfeyxiexzf;
                if (AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, i20)) {
                    i18 = i20;
                } else if (i18 == i20 || i18 < 0 || !AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, i18)) {
                    int i21 = c0684Ujhhgtgfeyxiexzf7.f2814Ujhhgtgfeyxiexzf;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= i21) {
                            i18 = i3;
                            break;
                        }
                        int iM1944Ujhhgtgfeyxiexzf3 = c0684Ujhhgtgfeyxiexzf7.m1944Ujhhgtgfeyxiexzf(i22);
                        if (AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, iM1944Ujhhgtgfeyxiexzf3)) {
                            i18 = iM1944Ujhhgtgfeyxiexzf3;
                            break;
                        }
                        i22++;
                    }
                }
                int i23 = i3;
                iM4557Ujhhgtgfeyxiexzf = i18;
                i17 = i23;
            }
            iM4557Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4557Ujhhgtgfeyxiexzf(iArrM4568Ujhhgtgfeyxiexzf, 0);
            i4 = i2;
        }
        int i24 = -1;
        if (i6 != length) {
            throw new RuntimeException("shouldn't happen");
        }
        c0909feyxiexzfUjhhgtg.f3517Ujhhgtgfeyxiexzf = iArr;
        int i25 = 0;
        while (true) {
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = c0909feyxiexzfUjhhgtg.f3514Ujhhgtgfeyxiexzf;
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = c0909feyxiexzfUjhhgtg.f3513Ujhhgtgfeyxiexzf;
            if (i25 >= length) {
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = new C2366Ujhhgtgfeyxiexzf(c3639Ujhhgtgfeyxiexzf, c0909feyxiexzfUjhhgtg.f3517Ujhhgtgfeyxiexzf, c2366Ujhhgtgfeyxiexzf);
                C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg = (C1476feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
                ArrayList arrayList = (ArrayList) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
                if (arrayList == null) {
                    throw new UnsupportedOperationException("already processed");
                }
                int size = arrayList.size();
                for (int i26 = 0; i26 < size; i26++) {
                    c1476feyxiexzfUjhhgtg.m2988Ujhhgtgfeyxiexzf((AbstractC3068Ujhhgtgfeyxiexzf) ((ArrayList) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).get(i26));
                }
                c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf = null;
                C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf = new C2363Ujhhgtgfeyxiexzf();
                if (c1476feyxiexzfUjhhgtg == null) {
                    throw new NullPointerException("unprocessedInsns == null");
                }
                c2363Ujhhgtgfeyxiexzf.f7701Ujhhgtgfeyxiexzf = c1476feyxiexzfUjhhgtg;
                c2363Ujhhgtgfeyxiexzf.f7702Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf2;
                c2363Ujhhgtgfeyxiexzf.f7703Ujhhgtgfeyxiexzf = null;
                c2363Ujhhgtgfeyxiexzf.f7704Ujhhgtgfeyxiexzf = null;
                c2363Ujhhgtgfeyxiexzf.f7705Ujhhgtgfeyxiexzf = null;
                c2363Ujhhgtgfeyxiexzf.f7706Ujhhgtgfeyxiexzf = null;
                return c2363Ujhhgtgfeyxiexzf;
            }
            int i27 = i25 + 1;
            int i28 = i27 == length ? i24 : iArr[i27];
            C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3 = c2492feyxiexzfUjhhgtg.m3775Ujhhgtgfeyxiexzf(iArr[i25]);
            C2866feyxiexzfUjhhgtg[] c2866feyxiexzfUjhhgtgArr = (C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
            int i29 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3.f8152Ujhhgtgfeyxiexzf;
            int i30 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3.f8155Ujhhgtgfeyxiexzf;
            C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3.f8153Ujhhgtgfeyxiexzf;
            C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg = c2866feyxiexzfUjhhgtgArr[i29];
            C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg2 = (C1476feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
            C1476feyxiexzfUjhhgtg c1476feyxiexzfUjhhgtg3 = (C1476feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
            c1476feyxiexzfUjhhgtg2.m2988Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg);
            C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg2 = ((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf)[i29];
            C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = c0909feyxiexzfUjhhgtg.f3515Ujhhgtgfeyxiexzf;
            c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3;
            c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf = c2866feyxiexzfUjhhgtg2;
            int length3 = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg2 = c2492feyxiexzfUjhhgtg;
            for (int i31 = 0; i31 < length3; i31++) {
                ((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i31)).mo1936Ujhhgtgfeyxiexzf(c0416Ujhhgtgfeyxiexzf);
            }
            c1476feyxiexzfUjhhgtg3.m2988Ujhhgtgfeyxiexzf(((C2866feyxiexzfUjhhgtg[]) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf)[i29]);
            AbstractC0671Ujhhgtgfeyxiexzf abstractC0671UjhhgtgfeyxiexzfM3984Ujhhgtgfeyxiexzf = c2657Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf();
            if (i30 >= 0 && i30 != i28) {
                if (abstractC0671UjhhgtgfeyxiexzfM3984Ujhhgtgfeyxiexzf.f2786Ujhhgtgfeyxiexzf.f3754Ujhhgtgfeyxiexzf == 4) {
                    C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf8 = c2495feyxiexzfUjhhgtgM3775Ujhhgtgfeyxiexzf3.f8154Ujhhgtgfeyxiexzf;
                    if (c0684Ujhhgtgfeyxiexzf8.f2814Ujhhgtgfeyxiexzf != 2) {
                        throw new UnsupportedOperationException("block doesn't have exactly two successors");
                    }
                    int iM1944Ujhhgtgfeyxiexzf4 = c0684Ujhhgtgfeyxiexzf8.m1944Ujhhgtgfeyxiexzf(0);
                    if (iM1944Ujhhgtgfeyxiexzf4 == i30) {
                        iM1944Ujhhgtgfeyxiexzf4 = c0684Ujhhgtgfeyxiexzf8.m1944Ujhhgtgfeyxiexzf(1);
                    }
                    if (iM1944Ujhhgtgfeyxiexzf4 == i28) {
                        C2866feyxiexzfUjhhgtg c2866feyxiexzfUjhhgtg3 = c2866feyxiexzfUjhhgtgArr[i30];
                        int size2 = c1476feyxiexzfUjhhgtg3.f5122Ujhhgtgfeyxiexzf.size() - 2;
                        try {
                            c1476feyxiexzfUjhhgtg3.f5122Ujhhgtgfeyxiexzf.set(size2, ((C1966Ujhhgtgfeyxiexzf) c1476feyxiexzfUjhhgtg3.f5122Ujhhgtgfeyxiexzf.get(size2)).m3300Ujhhgtgfeyxiexzf(c2866feyxiexzfUjhhgtg3));
                        } catch (ClassCastException unused) {
                            throw new IllegalArgumentException("non-reversible instruction");
                        } catch (IndexOutOfBoundsException unused2) {
                            throw new IllegalArgumentException("too few instructions");
                        }
                    }
                }
                c1476feyxiexzfUjhhgtg3.m2988Ujhhgtgfeyxiexzf(new C1966Ujhhgtgfeyxiexzf(AbstractC3212feyxiexzfUjhhgtg.f9993feyxiexzfUjhhgtg, abstractC0671UjhhgtgfeyxiexzfM3984Ujhhgtgfeyxiexzf.f2787Ujhhgtgfeyxiexzf, C0960feyxiexzfUjhhgtg.f3827Ujhhgtgfeyxiexzf, c2866feyxiexzfUjhhgtgArr[i30]));
            }
            i25 = i27;
            c2492feyxiexzfUjhhgtg = c2492feyxiexzfUjhhgtg2;
            i24 = -1;
        }
    }
}
