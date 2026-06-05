package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0216Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Class f1485Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f1486Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C3023feyxiexzfUjhhgtg f1487Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f1488Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1489Ujhhgtgfeyxiexzf = 1;

    public C0216Ujhhgtgfeyxiexzf(Class cls, Object obj) {
        this.f1485Ujhhgtgfeyxiexzf = cls;
        this.f1486Ujhhgtgfeyxiexzf = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0216Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0216Ujhhgtgfeyxiexzf c0216Ujhhgtgfeyxiexzf = (C0216Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1485Ujhhgtgfeyxiexzf, c0216Ujhhgtgfeyxiexzf.f1485Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1486Ujhhgtgfeyxiexzf, c0216Ujhhgtgfeyxiexzf.f1486Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1487Ujhhgtgfeyxiexzf, c0216Ujhhgtgfeyxiexzf.f1487Ujhhgtgfeyxiexzf) && this.f1488Ujhhgtgfeyxiexzf == c0216Ujhhgtgfeyxiexzf.f1488Ujhhgtgfeyxiexzf && this.f1489Ujhhgtgfeyxiexzf == c0216Ujhhgtgfeyxiexzf.f1489Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        int iHashCode = this.f1485Ujhhgtgfeyxiexzf.hashCode() * 31;
        Object obj = this.f1486Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C3023feyxiexzfUjhhgtg c3023feyxiexzfUjhhgtg = this.f1487Ujhhgtgfeyxiexzf;
        return AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f1489Ujhhgtgfeyxiexzf) + ((Boolean.hashCode(this.f1488Ujhhgtgfeyxiexzf) + ((iHashCode2 + (c3023feyxiexzfUjhhgtg != null ? c3023feyxiexzfUjhhgtg.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        C3023feyxiexzfUjhhgtg c3023feyxiexzfUjhhgtg = this.f1487Ujhhgtgfeyxiexzf;
        boolean z = this.f1488Ujhhgtgfeyxiexzf;
        int i = this.f1489Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder("Configuration(declaringClass=");
        sb.append(this.f1485Ujhhgtgfeyxiexzf);
        sb.append(", memberInstance=");
        sb.append(this.f1486Ujhhgtgfeyxiexzf);
        sb.append(", processorResolver=");
        sb.append(c3023feyxiexzfUjhhgtg);
        sb.append(", superclass=");
        sb.append(z);
        sb.append(", optional=");
        if (i == 1) {
            str = "NO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SILENT";
        } else {
            str = "NOTICE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
