package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1169 implements InputFilter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextView f4293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1168 f4294;

    public C1169(TextView textView) {
        this.f4293 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f4293;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM2898 = C1148.m2897().m2898();
        if (iM2898 != 0) {
            if (iM2898 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1148.m2897().m2901(charSequence, 0, charSequence.length());
            }
            if (iM2898 != 3) {
                return charSequence;
            }
        }
        C1148 c1148M2897 = C1148.m2897();
        if (this.f4294 == null) {
            this.f4294 = new C1168(textView, this);
        }
        c1148M2897.m2902(this.f4294);
        return charSequence;
    }
}
