package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0260 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f1488;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260(C0261 c0261, String str) {
        super(1);
        this.f1488 = str;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1478(C1927 c1927) {
        Object c2641;
        try {
            Object[] objArrM3881 = c1927.m3881();
            c2641 = null;
            Object obj = objArrM3881 != null ? objArrM3881[0] : null;
            Application application = obj instanceof Application ? (Application) obj : null;
            if (application != null) {
                Iterator it = C0261.f1492.entrySet().iterator();
                if (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                try {
                    if (C0261.f1491) {
                        return;
                    }
                    boolean zEquals = C0261.m1484().equals("android");
                    String str = this.f1488;
                    if (zEquals && !str.equals("android")) {
                        return;
                    }
                    C3749 c3749 = C3749.f11738;
                    if (c3749 == null) {
                        c3749 = new C3749();
                        C3749.f11738 = c3749;
                    }
                    c3749.m5355(application, str);
                    C0261.f1491 = true;
                } catch (Throwable unused) {
                }
                c2641 = application;
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            c1927.m3882(thM4616);
        }
    }
}
