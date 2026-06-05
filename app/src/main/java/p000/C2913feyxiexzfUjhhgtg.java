package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴ要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2913feyxiexzfUjhhgtg extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f9196Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ View f9197Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2913feyxiexzfUjhhgtg(View view, int i) {
        this.f9196Ujhhgtgfeyxiexzf = i;
        this.f9197Ujhhgtgfeyxiexzf = view;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1258Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f9196Ujhhgtgfeyxiexzf) {
            case 0:
                super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f9197Ujhhgtgfeyxiexzf).f804Ujhhgtgfeyxiexzf);
                break;
            default:
                super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        int i = this.f9196Ujhhgtgfeyxiexzf;
        View view2 = this.f9197Ujhhgtgfeyxiexzf;
        View.AccessibilityDelegate accessibilityDelegate = this.f9251Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f805Ujhhgtgfeyxiexzf);
                accessibilityNodeInfo.setChecked(checkableImageButton.f804Ujhhgtgfeyxiexzf);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i2 = MaterialButtonToggleGroup.f710Ujhhgtgfeyxiexzf;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i3 = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m805Ujhhgtgfeyxiexzf(i5)) {
                                i4++;
                            }
                        }
                    }
                }
                c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(0, 1, i3, 1, ((MaterialButton) view).f707Ujhhgtgfeyxiexzf));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).f810feyxiexzfUjhhgtg);
                break;
        }
    }
}
