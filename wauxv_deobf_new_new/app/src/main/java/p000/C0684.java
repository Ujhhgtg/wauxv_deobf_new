package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲀᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0684 extends AbstractC1260 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ Chip f2579;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684(Chip chip, Chip chip2) {
        super(chip2);
        this.f2579 = chip;
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo1649(float f, float f2) {
        Rect rect = Chip.f741;
        Chip chip = this.f2579;
        return (chip.m819() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1650(ArrayList arrayList) {
        C0686 c0686;
        arrayList.add(0);
        Rect rect = Chip.f741;
        Chip chip = this.f2579;
        if (!chip.m819() || (c0686 = chip.f744) == null || !c0686.f2595 || chip.f747 == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final boolean mo1651(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f2579;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f747;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f759) {
                    chip.f758.m3067(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void mo2174(C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        Chip chip = this.f2579;
        C0686 c0686 = chip.f744;
        accessibilityNodeInfo.setCheckable(c0686 != null && c0686.f2601);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0100.m1241(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo1652(int i, C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f741);
            return;
        }
        Chip chip = this.f2579;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0100.m1235(C0093.f1095);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // p000.AbstractC1260
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo2175(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f2579;
            chip.f753 = z;
            chip.refreshDrawableState();
        }
    }
}
