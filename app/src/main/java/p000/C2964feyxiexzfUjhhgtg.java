package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2964feyxiexzfUjhhgtg extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2965Ujhhgtgfeyxiexzf f9274Ujhhgtgfeyxiexzf;

    public C2964feyxiexzfUjhhgtg(C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf) {
        this.f9274Ujhhgtgfeyxiexzf = c2965Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f9274Ujhhgtgfeyxiexzf.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtgMo4447feyxiexzfUjhhgtg = this.f9274Ujhhgtgfeyxiexzf.mo4447feyxiexzfUjhhgtg(i);
        if (c2963feyxiexzfUjhhgtgMo4447feyxiexzfUjhhgtg == null) {
            return null;
        }
        return c2963feyxiexzfUjhhgtgMo4447feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f9274Ujhhgtgfeyxiexzf.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtgMo4448feyxiexzfUjhhgtg = this.f9274Ujhhgtgfeyxiexzf.mo4448feyxiexzfUjhhgtg(i);
        if (c2963feyxiexzfUjhhgtgMo4448feyxiexzfUjhhgtg == null) {
            return null;
        }
        return c2963feyxiexzfUjhhgtgMo4448feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f9274Ujhhgtgfeyxiexzf.mo4451feyxiexzfUjhhgtg(i, i2, bundle);
    }
}
