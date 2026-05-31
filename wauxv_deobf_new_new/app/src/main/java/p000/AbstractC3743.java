package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲀᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3743 extends C2342 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final void m5322(C2342 c2342) {
        Object c2641;
        this.f7559 = c2342.f7559;
        try {
            mo3442();
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            ArrayList arrayList = C3741.f11709;
            C3741.m5317(4, "An exception occurred in " + this, thM4616);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public abstract void mo3442();
}
