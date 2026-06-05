package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛳᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0121Ujhhgtgfeyxiexzf extends AbstractC0158Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f1269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f1270Ujhhgtgfeyxiexzf;

    public C0121Ujhhgtgfeyxiexzf(String str, boolean z) {
        this.f1269Ujhhgtgfeyxiexzf = z;
        this.f1270Ujhhgtgfeyxiexzf = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0121Ujhhgtgfeyxiexzf.class != obj.getClass()) {
            return false;
        }
        C0121Ujhhgtgfeyxiexzf c0121Ujhhgtgfeyxiexzf = (C0121Ujhhgtgfeyxiexzf) obj;
        return this.f1269Ujhhgtgfeyxiexzf == c0121Ujhhgtgfeyxiexzf.f1269Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1270Ujhhgtgfeyxiexzf, c0121Ujhhgtgfeyxiexzf.f1270Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f1270Ujhhgtgfeyxiexzf.hashCode() + (Boolean.hashCode(this.f1269Ujhhgtgfeyxiexzf) * 31);
    }

    @Override // p000.AbstractC0158Ujhhgtgfeyxiexzf
    public final String toString() {
        boolean z = this.f1269Ujhhgtgfeyxiexzf;
        String str = this.f1270Ujhhgtgfeyxiexzf;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC1154feyxiexzfUjhhgtg.m2646Ujhhgtgfeyxiexzf(sb, str);
        return sb.toString();
    }

    @Override // p000.AbstractC0158Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String mo1181Ujhhgtgfeyxiexzf() {
        return this.f1270Ujhhgtgfeyxiexzf;
    }
}
