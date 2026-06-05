package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛴᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2507feyxiexzfUjhhgtg extends AbstractC2485feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8186Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f8187Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final View.OnClickListener f8188Ujhhgtgfeyxiexzf;

    public C2507feyxiexzfUjhhgtg(String str, String str2, View.OnClickListener onClickListener) {
        this.f8186Ujhhgtgfeyxiexzf = str;
        this.f8187Ujhhgtgfeyxiexzf = str2;
        this.f8188Ujhhgtgfeyxiexzf = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2507feyxiexzfUjhhgtg)) {
            return false;
        }
        C2507feyxiexzfUjhhgtg c2507feyxiexzfUjhhgtg = (C2507feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8186Ujhhgtgfeyxiexzf, c2507feyxiexzfUjhhgtg.f8186Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8187Ujhhgtgfeyxiexzf, c2507feyxiexzfUjhhgtg.f8187Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8188Ujhhgtgfeyxiexzf, c2507feyxiexzfUjhhgtg.f8188Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = this.f8186Ujhhgtgfeyxiexzf.hashCode() * 31;
        String str = this.f8187Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f8188Ujhhgtgfeyxiexzf;
        return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("Content(title=");
        sb.append(this.f8186Ujhhgtgfeyxiexzf);
        sb.append(", desc=");
        sb.append(this.f8187Ujhhgtgfeyxiexzf);
        sb.append(", onClick=");
        sb.append(this.f8188Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
