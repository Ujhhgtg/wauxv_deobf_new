package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛴ要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1979Ujhhgtgfeyxiexzf extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final TextInputLayout f6491Ujhhgtgfeyxiexzf;

    public C1979Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout) {
        this.f6491Ujhhgtgfeyxiexzf = textInputLayout;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f6491Ujhhgtgfeyxiexzf;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f935feyxiexzfUjhhgtg;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C1122feyxiexzfUjhhgtg c1122feyxiexzfUjhhgtg = textInputLayout.f867Ujhhgtgfeyxiexzf;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = c1122feyxiexzfUjhhgtg.f4225Ujhhgtgfeyxiexzf;
        if (c2384Ujhhgtgfeyxiexzf.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c2384Ujhhgtgfeyxiexzf);
            accessibilityNodeInfo.setTraversalAfter(c2384Ujhhgtgfeyxiexzf);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c1122feyxiexzfUjhhgtg.f4227Ujhhgtgfeyxiexzf);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (!z && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf2 = textInputLayout.f875Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg;
        if (c2384Ujhhgtgfeyxiexzf2 != null) {
            accessibilityNodeInfo.setLabelFor(c2384Ujhhgtgfeyxiexzf2);
        }
        textInputLayout.f868Ujhhgtgfeyxiexzf.m4827Ujhhgtgfeyxiexzf().mo4743Ujhhgtgfeyxiexzf(c2963feyxiexzfUjhhgtg);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo2166Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2166Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        this.f6491Ujhhgtgfeyxiexzf.f868Ujhhgtgfeyxiexzf.m4827Ujhhgtgfeyxiexzf().mo4744Ujhhgtgfeyxiexzf(accessibilityEvent);
    }
}
