package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴ要点脸ᛲᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1335feyxiexzfUjhhgtg extends AbstractC0691Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4812Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f4813Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C0295Ujhhgtgfeyxiexzf f4814Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f4815Ujhhgtgfeyxiexzf;

    public AbstractC1335feyxiexzfUjhhgtg(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f4812Ujhhgtgfeyxiexzf = i;
        this.f4813Ujhhgtgfeyxiexzf = i2;
        this.f4814Ujhhgtgfeyxiexzf = null;
        this.f4815Ujhhgtgfeyxiexzf = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg = (AbstractC1335feyxiexzfUjhhgtg) obj;
        if (this == abstractC1335feyxiexzfUjhhgtg) {
            return 0;
        }
        EnumC0704Ujhhgtgfeyxiexzf enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf = mo1275Ujhhgtgfeyxiexzf();
        EnumC0704Ujhhgtgfeyxiexzf enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf2 = abstractC1335feyxiexzfUjhhgtg.mo1275Ujhhgtgfeyxiexzf();
        return enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf != enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf2 ? enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf.compareTo(enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf2) : mo2622Ujhhgtgfeyxiexzf(abstractC1335feyxiexzfUjhhgtg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg = (AbstractC1335feyxiexzfUjhhgtg) obj;
        return mo1275Ujhhgtgfeyxiexzf() == abstractC1335feyxiexzfUjhhgtg.mo1275Ujhhgtgfeyxiexzf() && mo2622Ujhhgtgfeyxiexzf(abstractC1335feyxiexzfUjhhgtg) == 0;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1294Ujhhgtgfeyxiexzf() {
        int i = this.f4813Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1295Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        c2608Ujhhgtgfeyxiexzf.m3885Ujhhgtgfeyxiexzf(this.f4812Ujhhgtgfeyxiexzf);
        try {
            if (this.f4813Ujhhgtgfeyxiexzf < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iM2857Ujhhgtgfeyxiexzf = m2857Ujhhgtgfeyxiexzf();
            if (c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf == iM2857Ujhhgtgfeyxiexzf) {
                mo1276Ujhhgtgfeyxiexzf(c3268feyxiexzfUjhhgtg, c2608Ujhhgtgfeyxiexzf);
                return;
            }
            throw new C3355feyxiexzfUjhhgtg("expected cursor " + iM2857Ujhhgtgfeyxiexzf + "; actual value: " + c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf, null);
        } catch (RuntimeException e) {
            throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public int mo2622Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m2857Ujhhgtgfeyxiexzf() {
        int i = this.f4815Ujhhgtgfeyxiexzf;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = this.f4814Ujhhgtgfeyxiexzf;
        if (i < 0) {
            c0295Ujhhgtgfeyxiexzf.getClass();
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = c0295Ujhhgtgfeyxiexzf.f4174Ujhhgtgfeyxiexzf;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String m2858Ujhhgtgfeyxiexzf() {
        return "[" + Integer.toHexString(m2857Ujhhgtgfeyxiexzf()) + ']';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m2859Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f4814Ujhhgtgfeyxiexzf != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f4812Ujhhgtgfeyxiexzf - 1;
        int i3 = (i + i2) & (~i2);
        this.f4814Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf;
        this.f4815Ujhhgtgfeyxiexzf = i3;
        mo2860Ujhhgtgfeyxiexzf(c0295Ujhhgtgfeyxiexzf, i3);
        return i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2861Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f4813Ujhhgtgfeyxiexzf >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f4813Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public abstract void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo2860Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf, int i) {
    }
}
