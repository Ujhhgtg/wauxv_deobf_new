package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3663feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f11657Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f11658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f11659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f11660Ujhhgtgfeyxiexzf;

    public C3663feyxiexzfUjhhgtg(String str, String str2, String str3, boolean z) {
        this.f11657Ujhhgtgfeyxiexzf = str;
        this.f11658Ujhhgtgfeyxiexzf = str2;
        this.f11659Ujhhgtgfeyxiexzf = str3;
        this.f11660Ujhhgtgfeyxiexzf = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3663feyxiexzfUjhhgtg)) {
            return false;
        }
        C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = (C3663feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11657Ujhhgtgfeyxiexzf, c3663feyxiexzfUjhhgtg.f11657Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11658Ujhhgtgfeyxiexzf, c3663feyxiexzfUjhhgtg.f11658Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11659Ujhhgtgfeyxiexzf, c3663feyxiexzfUjhhgtg.f11659Ujhhgtgfeyxiexzf) && this.f11660Ujhhgtgfeyxiexzf == c3663feyxiexzfUjhhgtg.f11660Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11660Ujhhgtgfeyxiexzf) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(this.f11657Ujhhgtgfeyxiexzf.hashCode() * 31, 31, this.f11658Ujhhgtgfeyxiexzf), 31, this.f11659Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("ContactInfo(id=");
        sb.append(this.f11657Ujhhgtgfeyxiexzf);
        sb.append(", name=");
        sb.append(this.f11658Ujhhgtgfeyxiexzf);
        sb.append(", desc=");
        sb.append(this.f11659Ujhhgtgfeyxiexzf);
        sb.append(", isSelected=");
        sb.append(this.f11660Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
