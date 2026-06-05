package p000;

import java.util.BitSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛳᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0960feyxiexzfUjhhgtg extends AbstractC3474Ujhhgtgfeyxiexzf implements InterfaceC1790feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0960feyxiexzfUjhhgtg f3827Ujhhgtgfeyxiexzf = new C0960feyxiexzfUjhhgtg(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C0960feyxiexzfUjhhgtg m2445Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = new C0960feyxiexzfUjhhgtg(1);
        c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(0, c0961feyxiexzfUjhhgtg);
        return c0960feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C0960feyxiexzfUjhhgtg m2446Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2) {
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = new C0960feyxiexzfUjhhgtg(2);
        c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(0, c0961feyxiexzfUjhhgtg);
        c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(1, c0961feyxiexzfUjhhgtg2);
        return c0960feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC3474Ujhhgtgfeyxiexzf, p000.InterfaceC1790feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType(int i) {
        C1784feyxiexzfUjhhgtg type = ((C0961feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i)).f3831Ujhhgtgfeyxiexzf.getType();
        type.getClass();
        return type;
    }

    @Override // p000.InterfaceC1790feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg mo2447Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int m2448Ujhhgtgfeyxiexzf() {
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        int iM3119Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < length; i++) {
            iM3119Ujhhgtgfeyxiexzf += getType(i).m3119Ujhhgtgfeyxiexzf();
        }
        return iM3119Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C0960feyxiexzfUjhhgtg m2449Ujhhgtgfeyxiexzf(boolean z, BitSet bitSet) {
        Object[] objArr = this.f10801Ujhhgtgfeyxiexzf;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = new C0960feyxiexzfUjhhgtg(objArr.length);
        int i = 0;
        int iM2455Ujhhgtgfeyxiexzf = 0;
        while (i < length) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = (C0961feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i);
            if (bitSet == null || !bitSet.get(i)) {
                c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2459Ujhhgtgfeyxiexzf(iM2455Ujhhgtgfeyxiexzf);
                if (!z) {
                    iM2455Ujhhgtgfeyxiexzf += c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2455Ujhhgtgfeyxiexzf();
                }
            }
            c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i, c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf);
            i++;
            z = false;
        }
        if (!this.f2247Ujhhgtgfeyxiexzf) {
            c0960feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
        }
        return c0960feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0960feyxiexzfUjhhgtg m2450Ujhhgtgfeyxiexzf(int i) {
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        if (length == 0) {
            return this;
        }
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = new C0960feyxiexzfUjhhgtg(length);
        for (int i2 = 0; i2 < length; i2++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = (C0961feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i2);
            if (i != 0) {
                c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.m2459Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf + i);
            }
            c0960feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i2, c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf);
        }
        if (!this.f2247Ujhhgtgfeyxiexzf) {
            c0960feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf = false;
        }
        return c0960feyxiexzfUjhhgtg;
    }
}
