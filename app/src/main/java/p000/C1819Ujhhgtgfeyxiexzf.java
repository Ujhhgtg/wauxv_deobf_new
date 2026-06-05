package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1819Ujhhgtgfeyxiexzf {
    public static final C1823Ujhhgtgfeyxiexzf Companion = new C1823Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Long f6119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f6120Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1819Ujhhgtgfeyxiexzf(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1822Ujhhgtgfeyxiexzf.f6145Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6119Ujhhgtgfeyxiexzf = l;
        this.f6120Ujhhgtgfeyxiexzf = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1819Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1819Ujhhgtgfeyxiexzf c1819Ujhhgtgfeyxiexzf = (C1819Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6119Ujhhgtgfeyxiexzf, c1819Ujhhgtgfeyxiexzf.f6119Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6120Ujhhgtgfeyxiexzf, c1819Ujhhgtgfeyxiexzf.f6120Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Long l = this.f6119Ujhhgtgfeyxiexzf;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f6120Ujhhgtgfeyxiexzf;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928601665105298826L, strArr));
        sb.append(this.f6119Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928601699465037194L, strArr));
        sb.append(this.f6120Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
