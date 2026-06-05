package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3327Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3335feyxiexzfUjhhgtg f10368Ujhhgtgfeyxiexzf;

    public C3327Ujhhgtgfeyxiexzf(C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg) {
        this.f10368Ujhhgtgfeyxiexzf = c3335feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4817Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout) {
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = this.f10368Ujhhgtgfeyxiexzf;
        C3328Ujhhgtgfeyxiexzf c3328Ujhhgtgfeyxiexzf = c3335feyxiexzfUjhhgtg.f10411Ujhhgtgfeyxiexzf;
        if (c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf;
        if (editText != null) {
            editText.removeTextChangedListener(c3328Ujhhgtgfeyxiexzf);
            if (c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf.getOnFocusChangeListener() == c3335feyxiexzfUjhhgtg.m4827Ujhhgtgfeyxiexzf().mo4160Ujhhgtgfeyxiexzf()) {
                c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c3328Ujhhgtgfeyxiexzf);
        }
        c3335feyxiexzfUjhhgtg.m4827Ujhhgtgfeyxiexzf().mo2884Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.f10408Ujhhgtgfeyxiexzf);
        c3335feyxiexzfUjhhgtg.m4835Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.m4827Ujhhgtgfeyxiexzf());
    }
}
