package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0684 extends C0078 {

    public final /* synthetic */ int f2567;

    public final /* synthetic */ View f2568;

    public /* synthetic */ C0684(View view, int i) {
        this.f2567 = i;
        this.f2568 = view;
    }

    @Override // p000.C0078
    public void mo964(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2567) {
            case 0:
                super.mo964(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2568).f724);
                break;
            default:
                super.mo964(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0078
    public final void mo722(View view, C0092 c0092) {
        int i = this.f2567;
        View view2 = this.f2568;
        View.AccessibilityDelegate accessibilityDelegate = this.f1024;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f725);
                accessibilityNodeInfo.setChecked(checkableImageButton.f724);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0092.f1045);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i2 = 0;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i3 = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m663(i5)) {
                                i4++;
                            }
                        }
                    }
                }
                c0092.m1096(C0091.m1085(0, 1, i3, 1, ((MaterialButton) view).f641));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0092.f1045;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).f730);
                break;
        }
    }
}
