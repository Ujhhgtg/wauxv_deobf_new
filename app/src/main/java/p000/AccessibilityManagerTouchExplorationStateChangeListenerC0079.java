package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0079 implements AccessibilityManager.TouchExplorationStateChangeListener {

    public final C0466 f1026;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0079(C0466 c0466) {
        this.f1026 = c0466;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0079) {
            return this.f1026.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0079) obj).f1026);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1026.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C1118 c1118 = (C1118) this.f1026.f2057;
        AutoCompleteTextView autoCompleteTextView = c1118.f4168;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c1118.f4376;
        int i = z ? 2 : 1;
        Field field = AbstractC3578.f11184;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
