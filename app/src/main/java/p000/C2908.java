package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2908 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f9356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ EditText f9357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f9358;

    public C2908(TextInputLayout textInputLayout, EditText editText) {
        this.f9358 = textInputLayout;
        this.f9357 = editText;
        this.f9356 = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f9358;
        textInputLayout.m712(!textInputLayout.f861, false);
        if (textInputLayout.f796) {
            textInputLayout.m705(editable);
        }
        if (textInputLayout.f804) {
            textInputLayout.m713(editable);
        }
        EditText editText = this.f9357;
        int lineCount = editText.getLineCount();
        int i = this.f9356;
        if (lineCount != i) {
            if (lineCount < i) {
                Field field = AbstractC3578.f11184;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f854;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f9356 = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
