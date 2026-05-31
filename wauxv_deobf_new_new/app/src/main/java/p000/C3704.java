package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᤝᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3704 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC0573 f11556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public List f11557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ArrayList f11558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final HashMap f11559;

    public C3704(AbstractC0573 abstractC0573) {
        super(abstractC0573.f2365);
        this.f11559 = new HashMap();
        this.f11556 = abstractC0573;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m5245(windowInsetsAnimation);
        this.f11556.mo2116();
        this.f11559.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m5245(windowInsetsAnimation);
        this.f11556.mo2117();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f11558;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f11558 = arrayList2;
            this.f11557 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1188 = AbstractC0092.m1188(list.get(size));
            C3707 c3707M5245 = m5245(windowInsetsAnimationM1188);
            c3707M5245.f11565.mo5249(windowInsetsAnimationM1188.getFraction());
            this.f11558.add(c3707M5245);
        }
        return this.f11556.mo2118(C3729.m5305(null, windowInsets), this.f11557).m5308();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m5245(windowInsetsAnimation);
        C2885 c2885Mo2119 = this.f11556.mo2119(new C2885(bounds));
        c2885Mo2119.getClass();
        AbstractC0092.m1191();
        return AbstractC0092.m1186(((C1660) c2885Mo2119.f9234).m3541(), ((C1660) c2885Mo2119.f9235).m3541());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3707 m5245(WindowInsetsAnimation windowInsetsAnimation) {
        C3707 c3707 = (C3707) this.f11559.get(windowInsetsAnimation);
        if (c3707 != null) {
            return c3707;
        }
        C3707 c3708 = new C3707(0, null, 0L);
        c3708.f11565 = new C3705(windowInsetsAnimation);
        this.f11559.put(windowInsetsAnimation, c3708);
        return c3708;
    }
}
