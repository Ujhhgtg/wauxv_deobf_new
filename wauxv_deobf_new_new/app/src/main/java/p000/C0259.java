package p000;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1487;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0259(int i, int i2) {
        super(i);
        this.f1487 = i2;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1478(C1927 c1927) {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        switch (this.f1487) {
            case 0:
                try {
                    Object obj = ((C1571) c1927.f6345).f5461.thisObject;
                    if ((obj instanceof Application ? (Application) obj : null) == null) {
                        return;
                    }
                    Object[] objArrM3881 = c1927.m3881();
                    Object obj2 = objArrM3881 != null ? objArrM3881[0] : null;
                    if ((obj2 instanceof Configuration ? (Configuration) obj2 : null) == null) {
                        return;
                    }
                    Iterator it = C0261.f1492.entrySet().iterator();
                    if (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    c2642 = C3554.UNIT;
                    Throwable thM4616 = C2642.m4616(c2642);
                    if (thM4616 != null) {
                        c1927.m3882(thM4616);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c2642 = new C2641(th);
                }
                break;
            case 1:
                try {
                    Iterator it2 = C0261.f1492.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((Map.Entry) it2.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3882 = c1927.m3881();
                        Object obj3 = objArrM3882 != null ? objArrM3882[0] : null;
                        if ((obj3 instanceof Context ? (Context) obj3 : null) != null) {
                            throw null;
                        }
                    }
                    c2644 = C3554.UNIT;
                } catch (Throwable th2) {
                    c2644 = new C2641(th2);
                }
                Throwable thM4617 = C2642.m4616(c2644);
                if (thM4617 != null) {
                    c1927.m3882(thM4617);
                    return;
                }
                return;
            case 2:
                try {
                    Iterator it3 = C0261.f1492.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (((Map.Entry) it3.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj4 = ((C1571) c1927.f6345).f5461.thisObject;
                        if ((obj4 instanceof Application ? (Application) obj4 : null) != null) {
                            throw null;
                        }
                    }
                    c2641 = C3554.UNIT;
                } catch (Throwable th3) {
                    c2641 = new C2641(th3);
                }
                Throwable thM4618 = C2642.m4616(c2641);
                if (thM4618 != null) {
                    c1927.m3882(thM4618);
                    return;
                }
                return;
            case 3:
                try {
                    Iterator it4 = C0261.f1492.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (((Map.Entry) it4.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj5 = ((C1571) c1927.f6345).f5461.thisObject;
                        if ((obj5 instanceof Application ? (Application) obj5 : null) != null) {
                            throw null;
                        }
                    }
                    c2645 = C3554.UNIT;
                } catch (Throwable th4) {
                    c2645 = new C2641(th4);
                }
                Throwable thM4619 = C2642.m4616(c2645);
                if (thM4619 != null) {
                    c1927.m3882(thM4619);
                    return;
                }
                return;
            default:
                try {
                    Object obj6 = ((C1571) c1927.f6345).f5461.thisObject;
                    if ((obj6 instanceof Application ? (Application) obj6 : null) == null) {
                        return;
                    }
                    Object[] objArrM3883 = c1927.m3881();
                    Object obj7 = objArrM3883 != null ? objArrM3883[0] : null;
                    if ((obj7 instanceof Integer ? (Integer) obj7 : null) != null) {
                        Iterator it5 = C0261.f1492.entrySet().iterator();
                        if (it5.hasNext()) {
                            if (((Map.Entry) it5.next()).getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                        c2643 = C3554.UNIT;
                        Throwable thM46110 = C2642.m4616(c2643);
                        if (thM46110 != null) {
                            c1927.m3882(thM46110);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    c2643 = new C2641(th5);
                }
                break;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo1479(C1927 c1927) {
        Object c2641;
        switch (this.f1487) {
            case 1:
                try {
                    Iterator it = C0261.f1492.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3881 = c1927.m3881();
                        Object obj = objArrM3881 != null ? objArrM3881[0] : null;
                        if ((obj instanceof Context ? (Context) obj : null) != null) {
                            throw null;
                        }
                    }
                    c2641 = C3554.UNIT;
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    c1927.m3882(thM4616);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
