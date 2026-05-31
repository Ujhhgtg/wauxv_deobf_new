package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲀᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1168 extends AbstractC1146 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final WeakReference f4291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final WeakReference f4292;

    public C1168(TextView textView, C1169 c1169) {
        this.f4291 = new WeakReference(textView);
        this.f4292 = new WeakReference(c1169);
    }

    @Override // p000.AbstractC1146
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2896() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4291.get();
        InputFilter inputFilter = (InputFilter) this.f4292.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C1148 c1148M2897 = C1148.m2897();
                    if (text == null) {
                        length = 0;
                    } else {
                        c1148M2897.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM2901 = c1148M2897.m2901(text, 0, length);
                    if (text == charSequenceM2901) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM2901);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM2901);
                    textView.setText(charSequenceM2901);
                    if (charSequenceM2901 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM2901;
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
