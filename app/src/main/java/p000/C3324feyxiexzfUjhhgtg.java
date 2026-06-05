package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3324feyxiexzfUjhhgtg implements TextWatcher {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final EditText f10362Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C3323feyxiexzfUjhhgtg f10363Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f10364Ujhhgtgfeyxiexzf = true;

    public C3324feyxiexzfUjhhgtg(EditText editText) {
        this.f10362Ujhhgtgfeyxiexzf = editText;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4813Ujhhgtgfeyxiexzf(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
            if (editableText == null) {
                length = 0;
            } else {
                c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.getClass();
                length = editableText.length();
            }
            c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4911Ujhhgtgfeyxiexzf(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f10362Ujhhgtgfeyxiexzf;
        if (editText.isInEditMode() || !this.f10364Ujhhgtgfeyxiexzf || C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4908Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4908Ujhhgtgfeyxiexzf();
        if (iM4908Ujhhgtgfeyxiexzf != 0) {
            if (iM4908Ujhhgtgfeyxiexzf == 1) {
                C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4911Ujhhgtgfeyxiexzf((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM4908Ujhhgtgfeyxiexzf != 3) {
                return;
            }
        }
        C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
        if (this.f10363Ujhhgtgfeyxiexzf == null) {
            this.f10363Ujhhgtgfeyxiexzf = new C3323feyxiexzfUjhhgtg(editText);
        }
        c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4912Ujhhgtgfeyxiexzf(this.f10363Ujhhgtgfeyxiexzf);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
