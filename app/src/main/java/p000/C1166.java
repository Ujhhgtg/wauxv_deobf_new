package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1166 extends AbstractC1140 {

    public final WeakReference f4294;

    public final WeakReference f4295;

    public C1166(TextView textView, C1167 c1167) {
        this.f4294 = new WeakReference(textView);
        this.f4295 = new WeakReference(c1167);
    }

    @Override // p000.AbstractC1140
    public final void mo2752() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4294.get();
        InputFilter inputFilter = (InputFilter) this.f4295.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C1142 c1142M2753 = C1142.m2753();
                    if (text == null) {
                        length = 0;
                    } else {
                        
                        length = text.length();
                    }
                    CharSequence charSequenceM2757 = c1142M2753.m2757(text, 0, length);
                    if (text == charSequenceM2757) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM2757);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM2757);
                    textView.setText(charSequenceM2757);
                    if (charSequenceM2757 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM2757;
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
