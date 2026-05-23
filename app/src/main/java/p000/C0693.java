package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲇᲁᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0693 extends AbstractC1258 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ Chip f2581;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0693(Chip chip, Chip chip2) {
        super(chip2);
        this.f2581 = chip;
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo1543(float f, float f2) {
        Rect rect = Chip.f682;
        Chip chip = this.f2581;
        return (chip.m675() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1544(ArrayList arrayList) {
        C0695 c0695;
        arrayList.add(0);
        Rect rect = Chip.f682;
        Chip chip = this.f2581;
        if (!chip.m675() || (c0695 = chip.f685) == null || !c0695.f2597 || chip.f688 == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final boolean mo1545(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f2581;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f688;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f699) {
                    chip.f698.m2948(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void mo2079(C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        Chip chip = this.f2581;
        C0695 c0695 = chip.f685;
        accessibilityNodeInfo.setCheckable(c0695 != null && c0695.f2603);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0092.m1095(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo1546(int i, C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f682);
            return;
        }
        Chip chip = this.f2581;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0092.m1089(C0085.f1027);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // p000.AbstractC1258
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo2080(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f2581;
            chip.f693 = z;
            chip.refreshDrawableState();
        }
    }
}
