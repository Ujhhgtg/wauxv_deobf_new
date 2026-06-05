package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸ᛳᛱfeyxiexzfᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0511Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Class f2444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Class f2445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Class f2446Ujhhgtgfeyxiexzf;

    public C0511Ujhhgtgfeyxiexzf(Class cls, Class cls2, Class cls3) {
        this.f2444Ujhhgtgfeyxiexzf = cls;
        this.f2445Ujhhgtgfeyxiexzf = cls2;
        this.f2446Ujhhgtgfeyxiexzf = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0511Ujhhgtgfeyxiexzf.class != obj.getClass()) {
            return false;
        }
        C0511Ujhhgtgfeyxiexzf c0511Ujhhgtgfeyxiexzf = (C0511Ujhhgtgfeyxiexzf) obj;
        return this.f2444Ujhhgtgfeyxiexzf.equals(c0511Ujhhgtgfeyxiexzf.f2444Ujhhgtgfeyxiexzf) && this.f2445Ujhhgtgfeyxiexzf.equals(c0511Ujhhgtgfeyxiexzf.f2445Ujhhgtgfeyxiexzf) && AbstractC1860Ujhhgtgfeyxiexzf.m3193Ujhhgtgfeyxiexzf(this.f2446Ujhhgtgfeyxiexzf, c0511Ujhhgtgfeyxiexzf.f2446Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = (this.f2445Ujhhgtgfeyxiexzf.hashCode() + (this.f2444Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31;
        Class cls = this.f2446Ujhhgtgfeyxiexzf;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f2444Ujhhgtgfeyxiexzf + ", second=" + this.f2445Ujhhgtgfeyxiexzf + '}';
    }
}
