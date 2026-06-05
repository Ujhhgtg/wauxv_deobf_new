package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3503feyxiexzfUjhhgtg extends C2965Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3504feyxiexzfUjhhgtg f10904Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3503feyxiexzfUjhhgtg(AbstractC3504feyxiexzfUjhhgtg abstractC3504feyxiexzfUjhhgtg) {
        super(0);
        this.f10904Ujhhgtgfeyxiexzf = abstractC3504feyxiexzfUjhhgtg;
    }

    @Override // p000.C2965Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final C2963feyxiexzfUjhhgtg mo4447feyxiexzfUjhhgtg(int i) {
        return new C2963feyxiexzfUjhhgtg(AccessibilityNodeInfo.obtain(this.f10904Ujhhgtgfeyxiexzf.m5023Ujhhgtgfeyxiexzf(i).f9272Ujhhgtgfeyxiexzf));
    }

    @Override // p000.C2965Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final C2963feyxiexzfUjhhgtg mo4448feyxiexzfUjhhgtg(int i) {
        AbstractC3504feyxiexzfUjhhgtg abstractC3504feyxiexzfUjhhgtg = this.f10904Ujhhgtgfeyxiexzf;
        int i2 = i == 2 ? abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf : abstractC3504feyxiexzfUjhhgtg.f10916Ujhhgtgfeyxiexzf;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo4447feyxiexzfUjhhgtg(i2);
    }

    @Override // p000.C2965Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ */
    public final boolean mo4451feyxiexzfUjhhgtg(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC3504feyxiexzfUjhhgtg abstractC3504feyxiexzfUjhhgtg = this.f10904Ujhhgtgfeyxiexzf;
        View view = abstractC3504feyxiexzfUjhhgtg.f10913Ujhhgtgfeyxiexzf;
        if (i == -1) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC3504feyxiexzfUjhhgtg.m5024Ujhhgtgfeyxiexzf(i);
        }
        if (i2 == 2) {
            return abstractC3504feyxiexzfUjhhgtg.m5017Ujhhgtgfeyxiexzf(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return abstractC3504feyxiexzfUjhhgtg.mo3730Ujhhgtgfeyxiexzf(i, i2, bundle);
            }
            if (abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf != i) {
                return false;
            }
            abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            view.invalidate();
            abstractC3504feyxiexzfUjhhgtg.m5025Ujhhgtgfeyxiexzf(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = abstractC3504feyxiexzfUjhhgtg.f10912Ujhhgtgfeyxiexzf;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            view.invalidate();
            abstractC3504feyxiexzfUjhhgtg.m5025Ujhhgtgfeyxiexzf(i3, 65536);
        }
        abstractC3504feyxiexzfUjhhgtg.f10915Ujhhgtgfeyxiexzf = i;
        view.invalidate();
        abstractC3504feyxiexzfUjhhgtg.m5025Ujhhgtgfeyxiexzf(i, 32768);
        return true;
    }
}
