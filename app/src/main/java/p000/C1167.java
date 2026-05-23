package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲇᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1167 implements InputFilter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextView f4296;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1166 f4297;

    public C1167(TextView textView) {
        this.f4296 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f4296;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM2754 = C1142.m2753().m2754();
        if (iM2754 != 0) {
            if (iM2754 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1142.m2753().m2757(charSequence, 0, charSequence.length());
            }
            if (iM2754 != 3) {
                return charSequence;
            }
        }
        C1142 c1142M2753 = C1142.m2753();
        if (this.f4297 == null) {
            this.f4297 = new C1166(textView, this);
        }
        c1142M2753.m2758(this.f4297);
        return charSequence;
    }
}
