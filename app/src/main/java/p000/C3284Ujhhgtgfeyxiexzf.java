package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3284Ujhhgtgfeyxiexzf extends AbstractC3389Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final WeakReference f10311Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final WeakReference f10312Ujhhgtgfeyxiexzf;

    public C3284Ujhhgtgfeyxiexzf(TextView textView, C3283Ujhhgtgfeyxiexzf c3283Ujhhgtgfeyxiexzf) {
        this.f10311Ujhhgtgfeyxiexzf = new WeakReference(textView);
        this.f10312Ujhhgtgfeyxiexzf = new WeakReference(c3283Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3389Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo4784Ujhhgtgfeyxiexzf() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f10311Ujhhgtgfeyxiexzf.get();
        InputFilter inputFilter = (InputFilter) this.f10312Ujhhgtgfeyxiexzf.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
                    if (text == null) {
                        length = 0;
                    } else {
                        c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM4911Ujhhgtgfeyxiexzf = c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4911Ujhhgtgfeyxiexzf(text, 0, length);
                    if (text == charSequenceM4911Ujhhgtgfeyxiexzf) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM4911Ujhhgtgfeyxiexzf);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM4911Ujhhgtgfeyxiexzf);
                    textView.setText(charSequenceM4911Ujhhgtgfeyxiexzf);
                    if (charSequenceM4911Ujhhgtgfeyxiexzf instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM4911Ujhhgtgfeyxiexzf;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
