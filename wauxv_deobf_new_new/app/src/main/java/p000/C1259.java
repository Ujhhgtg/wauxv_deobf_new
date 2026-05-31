package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1259 extends C0102 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1260 f4575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259(AbstractC1260 abstractC1260) {
        super(0);
        this.f4575 = abstractC1260;
    }

    @Override // p000.C0102
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final C0100 mo1265(int i) {
        return new C0100(AccessibilityNodeInfo.obtain(this.f4575.m3065(i).f1113));
    }

    @Override // p000.C0102
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final C0100 mo1266(int i) {
        AbstractC1260 abstractC1260 = this.f4575;
        int i2 = i == 2 ? abstractC1260.f4586 : abstractC1260.f4587;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1265(i2);
    }

    @Override // p000.C0102
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final boolean mo1269(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC1260 abstractC1260 = this.f4575;
        View view = abstractC1260.f4584;
        if (i == -1) {
            Field field = AbstractC3638.f11333;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC1260.m3066(i);
        }
        if (i2 == 2) {
            return abstractC1260.m3059(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return abstractC1260.mo1651(i, i2, bundle);
            }
            if (abstractC1260.f4586 != i) {
                return false;
            }
            abstractC1260.f4586 = Integer.MIN_VALUE;
            view.invalidate();
            abstractC1260.m3067(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = abstractC1260.f4583;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC1260.f4586) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            abstractC1260.f4586 = Integer.MIN_VALUE;
            view.invalidate();
            abstractC1260.m3067(i3, 65536);
        }
        abstractC1260.f4586 = i;
        view.invalidate();
        abstractC1260.m3067(i, 32768);
        return true;
    }
}
