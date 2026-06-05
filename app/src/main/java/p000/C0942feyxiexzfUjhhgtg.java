package p000;

import android.graphics.Point;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴ能不能ᛱUjhhgtgᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0942feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f3786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f3787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Point f3788Ujhhgtgfeyxiexzf;

    public C0942feyxiexzfUjhhgtg(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f3786Ujhhgtgfeyxiexzf = i;
        this.f3787Ujhhgtgfeyxiexzf = i2;
        this.f3788Ujhhgtgfeyxiexzf = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0942feyxiexzfUjhhgtg) {
            C0942feyxiexzfUjhhgtg c0942feyxiexzfUjhhgtg = (C0942feyxiexzfUjhhgtg) obj;
            if (this.f3786Ujhhgtgfeyxiexzf == c0942feyxiexzfUjhhgtg.f3786Ujhhgtgfeyxiexzf && this.f3787Ujhhgtgfeyxiexzf == c0942feyxiexzfUjhhgtg.f3787Ujhhgtgfeyxiexzf && this.f3788Ujhhgtgfeyxiexzf.equals(c0942feyxiexzfUjhhgtg.f3788Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3788Ujhhgtgfeyxiexzf.hashCode() + (((this.f3786Ujhhgtgfeyxiexzf * 31) + this.f3787Ujhhgtgfeyxiexzf) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f3786Ujhhgtgfeyxiexzf;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f3787Ujhhgtgfeyxiexzf);
        sb.append(", center=");
        sb.append(this.f3788Ujhhgtgfeyxiexzf);
        sb.append('}');
        return sb.toString();
    }
}
