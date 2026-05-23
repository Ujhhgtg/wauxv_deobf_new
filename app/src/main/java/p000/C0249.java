package p000;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲀᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0249 extends AbstractC0567 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1413;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0249(int i, int i2) {
        super(i);
        this.f1413 = i2;
    }

    @Override // p000.AbstractC0567
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1332(C1676 c1676) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        switch (this.f1413) {
            case 0:
                try {
                    Object obj = ((C1559) c1676.f5661).f5430.thisObject;
                    if ((obj instanceof Application ? (Application) obj : null) == null) {
                        return;
                    }
                    Object[] objArrM3406 = c1676.m3406();
                    Object obj2 = objArrM3406 != null ? objArrM3406[0] : null;
                    if ((obj2 instanceof Configuration ? (Configuration) obj2 : null) == null) {
                        return;
                    }
                    Iterator it = C0251.f1418.entrySet().iterator();
                    if (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    c2586 = C3497.f10997;
                    Throwable thM4594 = C2586.m4594(c2586);
                    if (thM4594 != null) {
                        c1676.m3407(thM4594);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c2586 = new C2585(th);
                }
                break;
            case 1:
                try {
                    Iterator it2 = C0251.f1418.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((Map.Entry) it2.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3407 = c1676.m3406();
                        Object obj3 = objArrM3407 != null ? objArrM3407[0] : null;
                        if ((obj3 instanceof Context ? (Context) obj3 : null) != null) {
                            throw null;
                        }
                    }
                    c2588 = C3497.f10997;
                } catch (Throwable th2) {
                    c2588 = new C2585(th2);
                }
                Throwable thM4595 = C2586.m4594(c2588);
                if (thM4595 != null) {
                    c1676.m3407(thM4595);
                    return;
                }
                return;
            case 2:
                try {
                    Iterator it3 = C0251.f1418.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (((Map.Entry) it3.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj4 = ((C1559) c1676.f5661).f5430.thisObject;
                        if ((obj4 instanceof Application ? (Application) obj4 : null) != null) {
                            throw null;
                        }
                    }
                    c2585 = C3497.f10997;
                } catch (Throwable th3) {
                    c2585 = new C2585(th3);
                }
                Throwable thM4596 = C2586.m4594(c2585);
                if (thM4596 != null) {
                    c1676.m3407(thM4596);
                    return;
                }
                return;
            case 3:
                try {
                    Iterator it4 = C0251.f1418.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (((Map.Entry) it4.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj5 = ((C1559) c1676.f5661).f5430.thisObject;
                        if ((obj5 instanceof Application ? (Application) obj5 : null) != null) {
                            throw null;
                        }
                    }
                    c2589 = C3497.f10997;
                } catch (Throwable th4) {
                    c2589 = new C2585(th4);
                }
                Throwable thM4597 = C2586.m4594(c2589);
                if (thM4597 != null) {
                    c1676.m3407(thM4597);
                    return;
                }
                return;
            default:
                try {
                    Object obj6 = ((C1559) c1676.f5661).f5430.thisObject;
                    if ((obj6 instanceof Application ? (Application) obj6 : null) == null) {
                        return;
                    }
                    Object[] objArrM3408 = c1676.m3406();
                    Object obj7 = objArrM3408 != null ? objArrM3408[0] : null;
                    if ((obj7 instanceof Integer ? (Integer) obj7 : null) != null) {
                        Iterator it5 = C0251.f1418.entrySet().iterator();
                        if (it5.hasNext()) {
                            if (((Map.Entry) it5.next()).getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                        c2587 = C3497.f10997;
                        Throwable thM4598 = C2586.m4594(c2587);
                        if (thM4598 != null) {
                            c1676.m3407(thM4598);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    c2587 = new C2585(th5);
                }
                break;
        }
    }

    @Override // p000.AbstractC0567
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo1333(C1676 c1676) {
        Object c2585;
        switch (this.f1413) {
            case 1:
                try {
                    Iterator it = C0251.f1418.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3406 = c1676.m3406();
                        Object obj = objArrM3406 != null ? objArrM3406[0] : null;
                        if ((obj instanceof Context ? (Context) obj : null) != null) {
                            throw null;
                        }
                    }
                    c2585 = C3497.f10997;
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    c1676.m3407(thM4594);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
