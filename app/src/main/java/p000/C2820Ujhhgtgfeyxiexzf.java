package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱ要点脸ᛳᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2820Ujhhgtgfeyxiexzf extends AbstractC3504feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ Chip f8973Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2820Ujhhgtgfeyxiexzf(Chip chip, Chip chip2) {
        super(chip2);
        this.f8973Ujhhgtgfeyxiexzf = chip;
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final int mo3728Ujhhgtgfeyxiexzf(float f, float f2) {
        Rect rect = Chip.f755feyxiexzfUjhhgtg;
        Chip chip = this.f8973Ujhhgtgfeyxiexzf;
        return (chip.m818Ujhhgtgfeyxiexzf() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo3729Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf;
        arrayList.add(0);
        Rect rect = Chip.f755feyxiexzfUjhhgtg;
        Chip chip = this.f8973Ujhhgtgfeyxiexzf;
        if (!chip.m818Ujhhgtgfeyxiexzf() || (c2802Ujhhgtgfeyxiexzf = chip.f758Ujhhgtgfeyxiexzf) == null || !c2802Ujhhgtgfeyxiexzf.f8862feyxiexzfUjhhgtg || chip.f761Ujhhgtgfeyxiexzf == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final boolean mo3730Ujhhgtgfeyxiexzf(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f8973Ujhhgtgfeyxiexzf;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f761Ujhhgtgfeyxiexzf;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f773Ujhhgtgfeyxiexzf) {
                    chip.f772Ujhhgtgfeyxiexzf.m5025Ujhhgtgfeyxiexzf(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void mo4153Ujhhgtgfeyxiexzf(C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        Chip chip = this.f8973Ujhhgtgfeyxiexzf;
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = chip.f758Ujhhgtgfeyxiexzf;
        accessibilityNodeInfo.setCheckable(c2802Ujhhgtgfeyxiexzf != null && c2802Ujhhgtgfeyxiexzf.f8868feyxiexzfUjhhgtg);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final void mo3731Ujhhgtgfeyxiexzf(int i, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f755feyxiexzfUjhhgtg);
            return;
        }
        Chip chip = this.f8973Ujhhgtgfeyxiexzf;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9254Ujhhgtgfeyxiexzf);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // p000.AbstractC3504feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo4154Ujhhgtgfeyxiexzf(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f8973Ujhhgtgfeyxiexzf;
            chip.f767Ujhhgtgfeyxiexzf = z;
            chip.refreshDrawableState();
        }
    }
}
