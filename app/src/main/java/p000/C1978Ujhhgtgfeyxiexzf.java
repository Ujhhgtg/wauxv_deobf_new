package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1978Ujhhgtgfeyxiexzf implements TextWatcher {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f6488Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ EditText f6489Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f6490Ujhhgtgfeyxiexzf;

    public C1978Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout, EditText editText) {
        this.f6490Ujhhgtgfeyxiexzf = textInputLayout;
        this.f6489Ujhhgtgfeyxiexzf = editText;
        this.f6488Ujhhgtgfeyxiexzf = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f6490Ujhhgtgfeyxiexzf;
        textInputLayout.m855Ujhhgtgfeyxiexzf(!textInputLayout.f941Ujhhgtgfeyxiexzf, false);
        if (textInputLayout.f876Ujhhgtgfeyxiexzf) {
            textInputLayout.m848Ujhhgtgfeyxiexzf(editable);
        }
        if (textInputLayout.f884Ujhhgtgfeyxiexzf) {
            textInputLayout.m856Ujhhgtgfeyxiexzf(editable);
        }
        EditText editText = this.f6489Ujhhgtgfeyxiexzf;
        int lineCount = editText.getLineCount();
        int i = this.f6488Ujhhgtgfeyxiexzf;
        if (lineCount != i) {
            if (lineCount < i) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f934Ujhhgtgfeyxiexzf;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f6488Ujhhgtgfeyxiexzf = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
