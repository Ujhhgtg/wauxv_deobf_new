package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᤞᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1212 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f4347;

    public C1212(C1213 c1213) {
        this.f4347 = c1213;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2935(TextInputLayout textInputLayout) {
        C1213 c1213 = this.f4347;
        C1211 c1211 = c1213.f4369;
        if (c1213.f4366 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c1213.f4366;
        if (editText != null) {
            editText.removeTextChangedListener(c1211);
            if (c1213.f4366.getOnFocusChangeListener() == c1213.m2937().mo2240()) {
                c1213.f4366.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c1213.f4366 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c1211);
        }
        c1213.m2937().mo2243(c1213.f4366);
        c1213.m2945(c1213.m2937());
    }
}
