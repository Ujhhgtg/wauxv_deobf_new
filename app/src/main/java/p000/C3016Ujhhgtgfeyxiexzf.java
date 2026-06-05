package p000;

import com.umeng.analytics.pro.g;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3016Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f9371Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f9372Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Object f9373Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f9374Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3016Ujhhgtgfeyxiexzf)) {
                return false;
            }
            C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf = (C3016Ujhhgtgfeyxiexzf) obj;
            int i = this.f9371Ujhhgtgfeyxiexzf;
            if (i != c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf) {
                return false;
            }
            if (i != 8 || Math.abs(this.f9374Ujhhgtgfeyxiexzf - this.f9372Ujhhgtgfeyxiexzf) != 1 || this.f9374Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf || this.f9372Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf) {
                if (this.f9374Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf || this.f9372Ujhhgtgfeyxiexzf != c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf) {
                    return false;
                }
                Object obj2 = this.f9373Ujhhgtgfeyxiexzf;
                if (obj2 != null) {
                    if (!obj2.equals(c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf)) {
                        return false;
                    }
                } else if (c3016Ujhhgtgfeyxiexzf.f9373Ujhhgtgfeyxiexzf != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f9371Ujhhgtgfeyxiexzf * 31) + this.f9372Ujhhgtgfeyxiexzf) * 31) + this.f9374Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f9371Ujhhgtgfeyxiexzf;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = g.R;
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f9372Ujhhgtgfeyxiexzf);
        sb.append("c:");
        sb.append(this.f9374Ujhhgtgfeyxiexzf);
        sb.append(",p:");
        sb.append(this.f9373Ujhhgtgfeyxiexzf);
        sb.append("]");
        return sb.toString();
    }
}
