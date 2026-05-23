package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲀᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1257 extends C0094 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1258 f4576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257(AbstractC1258 abstractC1258) {
        super(0);
        this.f4576 = abstractC1258;
    }

    @Override // p000.C0094
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final C0092 mo1119(int i) {
        return new C0092(AccessibilityNodeInfo.obtain(this.f4576.m2946(i).f1045));
    }

    @Override // p000.C0094
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final C0092 mo1120(int i) {
        AbstractC1258 abstractC1258 = this.f4576;
        int i2 = i == 2 ? abstractC1258.f4587 : abstractC1258.f4588;
        if (i2 == -2147483648) {
            return null;
        }
        return mo1119(i2);
    }

    @Override // p000.C0094
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final boolean mo1123(int i, int i2, Bundle bundle) {
        int i3;
        AbstractC1258 abstractC1258 = this.f4576;
        View view = abstractC1258.f4585;
        if (i == -1) {
            Field field = AbstractC3578.f11184;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return abstractC1258.m2947(i);
        }
        if (i2 == 2) {
            return abstractC1258.m2940(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return abstractC1258.mo1545(i, i2, bundle);
            }
            if (abstractC1258.f4587 != i) {
                return false;
            }
            abstractC1258.f4587 = -2147483648;
            view.invalidate();
            abstractC1258.m2948(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = abstractC1258.f4584;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC1258.f4587) == i) {
            return false;
        }
        if (i3 != -2147483648) {
            abstractC1258.f4587 = -2147483648;
            view.invalidate();
            abstractC1258.m2948(i3, 65536);
        }
        abstractC1258.f4587 = i;
        view.invalidate();
        abstractC1258.m2948(i, 32768);
        return true;
    }
}
