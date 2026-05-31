package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲀᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2967 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f9523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ EditText f9524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f9525;

    public C2967(TextInputLayout textInputLayout, EditText editText) {
        this.f9525 = textInputLayout;
        this.f9524 = editText;
        this.f9523 = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f9525;
        textInputLayout.m856(!textInputLayout.f927, false);
        if (textInputLayout.f862) {
            textInputLayout.m849(editable);
        }
        if (textInputLayout.f870) {
            textInputLayout.m857(editable);
        }
        EditText editText = this.f9524;
        int lineCount = editText.getLineCount();
        int i = this.f9523;
        if (lineCount != i) {
            if (lineCount < i) {
                Field field = AbstractC3638.f11333;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f920;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f9523 = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
