package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2491feyxiexzfUjhhgtg implements InterfaceC2630Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2878feyxiexzfUjhhgtg f8134Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int[] f8135Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int[] f8136Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int[] f8137Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf[] f8138Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2650feyxiexzfUjhhgtg[] f8139Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f8140Ujhhgtgfeyxiexzf;

    public C2491feyxiexzfUjhhgtg(C2878feyxiexzfUjhhgtg c2878feyxiexzfUjhhgtg) {
        this.f8134Ujhhgtgfeyxiexzf = c2878feyxiexzfUjhhgtg;
        int i = ((C2610Ujhhgtgfeyxiexzf) c2878feyxiexzfUjhhgtg.f9143Ujhhgtgfeyxiexzf.f8254Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).f8422Ujhhgtgfeyxiexzf + 1;
        this.f8135Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4568Ujhhgtgfeyxiexzf(i);
        this.f8136Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4568Ujhhgtgfeyxiexzf(i);
        this.f8137Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4568Ujhhgtgfeyxiexzf(i);
        this.f8138Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf[i];
        this.f8139Ujhhgtgfeyxiexzf = new C2650feyxiexzfUjhhgtg[i];
        this.f8140Ujhhgtgfeyxiexzf = -1;
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo3763Ujhhgtgfeyxiexzf(int i, int i2, C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, ArrayList arrayList) {
        m3767Ujhhgtgfeyxiexzf(i, i2, true);
        m3768Ujhhgtgfeyxiexzf(i, i2, true);
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo3764Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, int i5) {
        if (i != 169) {
            m3767Ujhhgtgfeyxiexzf(i2, i3, true);
        } else {
            m3767Ujhhgtgfeyxiexzf(i2, i3, false);
            this.f8138Ujhhgtgfeyxiexzf[i2] = C0684Ujhhgtgfeyxiexzf.f2812Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3765Ujhhgtgfeyxiexzf(int i, boolean z) {
        if (!AbstractC3085Ujhhgtgfeyxiexzf.m4558Ujhhgtgfeyxiexzf(this.f8136Ujhhgtgfeyxiexzf, i)) {
            AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(this.f8135Ujhhgtgfeyxiexzf, i);
        }
        if (z) {
            AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(this.f8137Ujhhgtgfeyxiexzf, i);
        }
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo3766Ujhhgtgfeyxiexzf(int i, int i2, int i3, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf, int i4) {
        m3767Ujhhgtgfeyxiexzf(i2, i3, true);
        if ((abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3152Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3057Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3146Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf)) {
            m3768Ujhhgtgfeyxiexzf(i2, i3, true);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3767Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(this.f8136Ujhhgtgfeyxiexzf, i);
        if (z) {
            m3765Ujhhgtgfeyxiexzf(i + i2, false);
        } else {
            AbstractC3085Ujhhgtgfeyxiexzf.m4570Ujhhgtgfeyxiexzf(this.f8137Ujhhgtgfeyxiexzf, i + i2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3768Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        C2650feyxiexzfUjhhgtg c2650feyxiexzfUjhhgtg;
        C0684Ujhhgtgfeyxiexzf c0684UjhhgtgfeyxiexzfM1941Ujhhgtgfeyxiexzf;
        int i3 = i2 + i;
        if (z) {
            m3765Ujhhgtgfeyxiexzf(i3, true);
        }
        C2650feyxiexzfUjhhgtg c2650feyxiexzfUjhhgtg2 = this.f8134Ujhhgtgfeyxiexzf.f9143Ujhhgtgfeyxiexzf.f8255Ujhhgtgfeyxiexzf;
        int length = c2650feyxiexzfUjhhgtg2.f10801Ujhhgtgfeyxiexzf.length;
        C2649feyxiexzfUjhhgtg[] c2649feyxiexzfUjhhgtgArr = new C2649feyxiexzfUjhhgtg[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            C2649feyxiexzfUjhhgtg c2649feyxiexzfUjhhgtg = (C2649feyxiexzfUjhhgtg) c2650feyxiexzfUjhhgtg2.m4969Ujhhgtgfeyxiexzf(i5);
            if (i >= c2649feyxiexzfUjhhgtg.f8503Ujhhgtgfeyxiexzf && i < c2649feyxiexzfUjhhgtg.f8504Ujhhgtgfeyxiexzf) {
                C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c2649feyxiexzfUjhhgtg.f8506Ujhhgtgfeyxiexzf;
                if (c3057Ujhhgtgfeyxiexzf == null) {
                    c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9453Ujhhgtgfeyxiexzf;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= i4) {
                        c2649feyxiexzfUjhhgtgArr[i4] = c2649feyxiexzfUjhhgtg;
                        i4++;
                        break;
                    }
                    C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf2 = c2649feyxiexzfUjhhgtgArr[i6].f8506Ujhhgtgfeyxiexzf;
                    if (c3057Ujhhgtgfeyxiexzf2 == null) {
                        c3057Ujhhgtgfeyxiexzf2 = C3057Ujhhgtgfeyxiexzf.f9453Ujhhgtgfeyxiexzf;
                    }
                    if (c3057Ujhhgtgfeyxiexzf2 == c3057Ujhhgtgfeyxiexzf || c3057Ujhhgtgfeyxiexzf2 == C3057Ujhhgtgfeyxiexzf.f9453Ujhhgtgfeyxiexzf) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        if (i4 == 0) {
            c2650feyxiexzfUjhhgtg = C2650feyxiexzfUjhhgtg.f8507Ujhhgtgfeyxiexzf;
        } else {
            c2650feyxiexzfUjhhgtg = new C2650feyxiexzfUjhhgtg(i4);
            for (int i7 = 0; i7 < i4; i7++) {
                C2649feyxiexzfUjhhgtg c2649feyxiexzfUjhhgtg2 = c2649feyxiexzfUjhhgtgArr[i7];
                if (c2649feyxiexzfUjhhgtg2 == null) {
                    throw new NullPointerException("item == null");
                }
                c2650feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i7, c2649feyxiexzfUjhhgtg2);
            }
            c2650feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
        }
        this.f8139Ujhhgtgfeyxiexzf[i] = c2650feyxiexzfUjhhgtg;
        if (!z) {
            i3 = -1;
        }
        c2650feyxiexzfUjhhgtg.getClass();
        if (i3 < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i8 = i3 < 0 ? 0 : 1;
        int length2 = c2650feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        if (length2 == 0) {
            c0684UjhhgtgfeyxiexzfM1941Ujhhgtgfeyxiexzf = i8 != 0 ? C0684Ujhhgtgfeyxiexzf.m1941Ujhhgtgfeyxiexzf(i3) : C0684Ujhhgtgfeyxiexzf.f2812Ujhhgtgfeyxiexzf;
        } else {
            C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(length2 + i8);
            for (int i9 = 0; i9 < length2; i9++) {
                c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(((C2649feyxiexzfUjhhgtg) c2650feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i9)).f8505Ujhhgtgfeyxiexzf);
            }
            if (i8 != 0) {
                c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i3);
            }
            c0684Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
            c0684UjhhgtgfeyxiexzfM1941Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
        }
        this.f8138Ujhhgtgfeyxiexzf[i] = c0684UjhhgtgfeyxiexzfM1941Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo3769Ujhhgtgfeyxiexzf(int i, int i2) {
        m3767Ujhhgtgfeyxiexzf(i2, 1, true);
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo3770Ujhhgtgfeyxiexzf(int i, int i2, C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg, int i3) {
        m3767Ujhhgtgfeyxiexzf(i, i2, false);
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = (C0684Ujhhgtgfeyxiexzf) c3366feyxiexzfUjhhgtg.f10528Ujhhgtgfeyxiexzf;
        m3765Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(c3366feyxiexzfUjhhgtg.f10526Ujhhgtgfeyxiexzf), true);
        int i4 = c3366feyxiexzfUjhhgtg.f10526Ujhhgtgfeyxiexzf;
        for (int i5 = 0; i5 < i4; i5++) {
            m3765Ujhhgtgfeyxiexzf(c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i5), true);
        }
        this.f8138Ujhhgtgfeyxiexzf[i] = c0684Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int mo3771Ujhhgtgfeyxiexzf() {
        return this.f8140Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void mo3772Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        C0684Ujhhgtgfeyxiexzf[] c0684UjhhgtgfeyxiexzfArr = this.f8138Ujhhgtgfeyxiexzf;
        if (i != 167) {
            if (i == 168) {
                m3765Ujhhgtgfeyxiexzf(i2, true);
            }
            int i5 = i2 + i3;
            m3767Ujhhgtgfeyxiexzf(i2, i3, true);
            m3765Ujhhgtgfeyxiexzf(i5, true);
            C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(2);
            c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i5);
            c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i4);
            c0684Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
            c0684UjhhgtgfeyxiexzfArr[i2] = c0684Ujhhgtgfeyxiexzf;
        } else {
            m3767Ujhhgtgfeyxiexzf(i2, i3, false);
            c0684UjhhgtgfeyxiexzfArr[i2] = C0684Ujhhgtgfeyxiexzf.m1941Ujhhgtgfeyxiexzf(i4);
        }
        m3765Ujhhgtgfeyxiexzf(i4, true);
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo3773Ujhhgtgfeyxiexzf(int i, int i2, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        if (i == 108 || i == 112) {
            m3767Ujhhgtgfeyxiexzf(i2, 1, true);
            if (c1784feyxiexzfUjhhgtg == C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf || c1784feyxiexzfUjhhgtg == C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf) {
                m3768Ujhhgtgfeyxiexzf(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m3767Ujhhgtgfeyxiexzf(i2, 1, false);
            this.f8138Ujhhgtgfeyxiexzf[i2] = C0684Ujhhgtgfeyxiexzf.f2812Ujhhgtgfeyxiexzf;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m3767Ujhhgtgfeyxiexzf(i2, 1, false);
                m3768Ujhhgtgfeyxiexzf(i2, 1, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case Opcodes.IALOAD /* 46 */:
                    case 47:
                    case 48:
                    case 49:
                    case Opcodes.AALOAD /* 50 */:
                    case Opcodes.BALOAD /* 51 */:
                    case 52:
                    case Opcodes.SALOAD /* 53 */:
                        break;
                    default:
                        switch (i) {
                            case Opcodes.IASTORE /* 79 */:
                            case 80:
                            case 81:
                            case 82:
                            case Opcodes.AASTORE /* 83 */:
                            case Opcodes.BASTORE /* 84 */:
                            case Opcodes.CASTORE /* 85 */:
                            case 86:
                                break;
                            default:
                                m3767Ujhhgtgfeyxiexzf(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m3767Ujhhgtgfeyxiexzf(i2, 1, true);
        m3768Ujhhgtgfeyxiexzf(i2, 1, true);
    }
}
