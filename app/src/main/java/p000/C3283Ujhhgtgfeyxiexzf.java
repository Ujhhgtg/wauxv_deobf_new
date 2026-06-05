package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3283Ujhhgtgfeyxiexzf implements InputFilter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextView f10309Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3284Ujhhgtgfeyxiexzf f10310Ujhhgtgfeyxiexzf;

    public C3283Ujhhgtgfeyxiexzf(TextView textView) {
        this.f10309Ujhhgtgfeyxiexzf = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f10309Ujhhgtgfeyxiexzf;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM4908Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4908Ujhhgtgfeyxiexzf();
        if (iM4908Ujhhgtgfeyxiexzf != 0) {
            if (iM4908Ujhhgtgfeyxiexzf == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4911Ujhhgtgfeyxiexzf(charSequence, 0, charSequence.length());
            }
            if (iM4908Ujhhgtgfeyxiexzf != 3) {
                return charSequence;
            }
        }
        C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
        if (this.f10310Ujhhgtgfeyxiexzf == null) {
            this.f10310Ujhhgtgfeyxiexzf = new C3284Ujhhgtgfeyxiexzf(textView, this);
        }
        c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4912Ujhhgtgfeyxiexzf(this.f10310Ujhhgtgfeyxiexzf);
        return charSequence;
    }
}
