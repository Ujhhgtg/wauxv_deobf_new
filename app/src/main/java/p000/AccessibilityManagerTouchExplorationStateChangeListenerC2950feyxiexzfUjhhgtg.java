package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2579Ujhhgtgfeyxiexzf f9253Ujhhgtgfeyxiexzf;

    public AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg(C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf) {
        this.f9253Ujhhgtgfeyxiexzf = c2579Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg) {
            return this.f9253Ujhhgtgfeyxiexzf.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg) obj).f9253Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9253Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = (C3245feyxiexzfUjhhgtg) this.f9253Ujhhgtgfeyxiexzf.f8346Ujhhgtgfeyxiexzf;
        AutoCompleteTextView autoCompleteTextView = c3245feyxiexzfUjhhgtg.f10173Ujhhgtgfeyxiexzf;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c3245feyxiexzfUjhhgtg.f10415Ujhhgtgfeyxiexzf;
        int i = z ? 2 : 1;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
