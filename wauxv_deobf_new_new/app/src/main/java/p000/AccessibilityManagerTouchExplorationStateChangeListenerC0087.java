package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0087 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0441 f1094;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0087(C0441 c0441) {
        this.f1094 = c0441;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0087) {
            return this.f1094.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0087) obj).f1094);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1094.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C1124 c1124 = (C1124) this.f1094.f2029;
        AutoCompleteTextView autoCompleteTextView = c1124.f4179;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c1124.f4373;
        int i = z ? 2 : 1;
        Field field = AbstractC3638.f11333;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
