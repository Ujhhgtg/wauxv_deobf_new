package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能ᛱfeyxiexzfᛱ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0239Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f1566Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f1567Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0961feyxiexzfUjhhgtg f1568Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f1569Ujhhgtgfeyxiexzf;

    public C0239Ujhhgtgfeyxiexzf(int i, int i2, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (i2 == 0) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c0961feyxiexzfUjhhgtg.f3832Ujhhgtgfeyxiexzf == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f1566Ujhhgtgfeyxiexzf = i;
            this.f1567Ujhhgtgfeyxiexzf = i2;
            this.f1568Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtg;
            this.f1569Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.m4538Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0239Ujhhgtgfeyxiexzf) && compareTo((C0239Ujhhgtgfeyxiexzf) obj) == 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(this.f1566Ujhhgtgfeyxiexzf));
        sb.append(" ");
        switch (this.f1567Ujhhgtgfeyxiexzf) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "END_SIMPLY";
                break;
            case 3:
                str = "END_REPLACED";
                break;
            case 4:
                str = "END_MOVED";
                break;
            case 5:
                str = "END_CLOBBERED_BY_PREV";
                break;
            case 6:
                str = "END_CLOBBERED_BY_NEXT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f1568Ujhhgtgfeyxiexzf);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf) {
        int i = c0239Ujhhgtgfeyxiexzf.f1566Ujhhgtgfeyxiexzf;
        int i2 = this.f1566Ujhhgtgfeyxiexzf;
        if (i2 < i) {
            return -1;
        }
        if (i2 <= i) {
            boolean z = this.f1567Ujhhgtgfeyxiexzf == 1;
            if (z == (c0239Ujhhgtgfeyxiexzf.f1567Ujhhgtgfeyxiexzf == 1)) {
                return this.f1568Ujhhgtgfeyxiexzf.compareTo(c0239Ujhhgtgfeyxiexzf.f1568Ujhhgtgfeyxiexzf);
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf m1391Ujhhgtgfeyxiexzf() {
        return this.f1568Ujhhgtgfeyxiexzf.f3832Ujhhgtgfeyxiexzf.f1635Ujhhgtgfeyxiexzf;
    }
}
