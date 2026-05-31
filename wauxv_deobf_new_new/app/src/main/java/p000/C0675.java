package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲇᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0675 extends C0086 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f2566;

    public /* synthetic */ C0675(View view, int i) {
        this.f2565 = i;
        this.f2566 = view;
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1109(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2565) {
            case 0:
                super.mo1109(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2566).f790);
                break;
            default:
                super.mo1109(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0086
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo866(View view, C0100 c0100) {
        int i = this.f2565;
        View view2 = this.f2566;
        View.AccessibilityDelegate accessibilityDelegate = this.f1092;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f791);
                accessibilityNodeInfo.setChecked(checkableImageButton.f790);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0100.f1113);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i2 = MaterialButtonToggleGroup.f696;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i3 = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m806(i5)) {
                                i4++;
                            }
                        }
                    }
                }
                c0100.m1242(C0099.m1231(0, 1, i3, 1, ((MaterialButton) view).f693));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0100.f1113;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).f796);
                break;
        }
    }
}
