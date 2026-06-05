package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2486feyxiexzfUjhhgtg extends AbstractC2485feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f8120Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final AbstractC2059Ujhhgtgfeyxiexzf f8121Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final View.OnClickListener f8122Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final View.OnLongClickListener f8123Ujhhgtgfeyxiexzf;

    public C2486feyxiexzfUjhhgtg(String str, String str2, AbstractC2059Ujhhgtgfeyxiexzf abstractC2059Ujhhgtgfeyxiexzf, View.OnClickListener onClickListener, ViewOnLongClickListenerC3075Ujhhgtgfeyxiexzf viewOnLongClickListenerC3075Ujhhgtgfeyxiexzf) {
        this.f8119Ujhhgtgfeyxiexzf = str;
        this.f8120Ujhhgtgfeyxiexzf = str2;
        this.f8121Ujhhgtgfeyxiexzf = abstractC2059Ujhhgtgfeyxiexzf;
        this.f8122Ujhhgtgfeyxiexzf = onClickListener;
        this.f8123Ujhhgtgfeyxiexzf = viewOnLongClickListenerC3075Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2486feyxiexzfUjhhgtg)) {
            return false;
        }
        C2486feyxiexzfUjhhgtg c2486feyxiexzfUjhhgtg = (C2486feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8119Ujhhgtgfeyxiexzf, c2486feyxiexzfUjhhgtg.f8119Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8120Ujhhgtgfeyxiexzf, c2486feyxiexzfUjhhgtg.f8120Ujhhgtgfeyxiexzf) && this.f8121Ujhhgtgfeyxiexzf.equals(c2486feyxiexzfUjhhgtg.f8121Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8122Ujhhgtgfeyxiexzf, c2486feyxiexzfUjhhgtg.f8122Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8123Ujhhgtgfeyxiexzf, c2486feyxiexzfUjhhgtg.f8123Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = this.f8119Ujhhgtgfeyxiexzf.hashCode() * 31;
        String str = this.f8120Ujhhgtgfeyxiexzf;
        int iHashCode2 = (this.f8121Ujhhgtgfeyxiexzf.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        View.OnClickListener onClickListener = this.f8122Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.f8123Ujhhgtgfeyxiexzf;
        return iHashCode3 + (onLongClickListener != null ? onLongClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928462594064254346L, strArr));
        sb.append(this.f8119Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928462533934712202L, strArr));
        sb.append(this.f8120Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928462637013927306L, strArr));
        sb.append(this.f8121Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928462602654188938L, strArr));
        sb.append(this.f8122Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928462692848502154L, strArr));
        sb.append(this.f8123Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
