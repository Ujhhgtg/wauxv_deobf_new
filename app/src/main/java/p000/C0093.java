package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0093 extends AccessibilityNodeProvider {

    public final C0094 f1047;

    public C0093(C0094 c0094) {
        this.f1047 = c0094;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0092 c0092Mo1119 = this.f1047.mo1119(i);
        if (c0092Mo1119 == null) {
            return null;
        }
        return c0092Mo1119.f1045;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0092 c0092Mo1120 = this.f1047.mo1120(i);
        if (c0092Mo1120 == null) {
            return null;
        }
        return c0092Mo1120.f1045;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f1047.mo1123(i, i2, bundle);
    }
}
