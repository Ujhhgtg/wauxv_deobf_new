package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3572feyxiexzfUjhhgtg implements Cloneable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0420Ujhhgtgfeyxiexzf f11105Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        return (obj instanceof C3572feyxiexzfUjhhgtg) && m5109Ujhhgtgfeyxiexzf(obj);
    }

    public final int hashCode() {
        return m5110Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3572feyxiexzfUjhhgtg clone() {
        try {
            return (C3572feyxiexzfUjhhgtg) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m5109Ujhhgtgfeyxiexzf(Object obj) {
        if (obj instanceof C3572feyxiexzfUjhhgtg) {
            return AbstractC1860Ujhhgtgfeyxiexzf.m3193Ujhhgtgfeyxiexzf(this.f11105Ujhhgtgfeyxiexzf, ((C3572feyxiexzfUjhhgtg) obj).f11105Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m5110Ujhhgtgfeyxiexzf() {
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = this.f11105Ujhhgtgfeyxiexzf;
        if (c0420Ujhhgtgfeyxiexzf != null) {
            return c0420Ujhhgtgfeyxiexzf.hashCode();
        }
        return 0;
    }
}
