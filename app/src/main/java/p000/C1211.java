package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1211 {

    public final /* synthetic */ C1212 f4350;

    public C1211(C1212 c1212) {
        this.f4350 = c1212;
    }

    public final void m2813(TextInputLayout textInputLayout) {
        C1212 c1212 = this.f4350;
        C1210 c1210 = c1212.f4372;
        if (c1212.f4369 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c1212.f4369;
        if (editText != null) {
            editText.removeTextChangedListener(c1210);
            if (c1212.f4369.getOnFocusChangeListener() == c1212.m2815().mo2148()) {
                c1212.f4369.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c1212.f4369 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c1210);
        }
        c1212.m2815().mo2151(c1212.f4369);
        c1212.m2823(c1212.m2815());
    }
}
