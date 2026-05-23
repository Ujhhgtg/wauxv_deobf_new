package p000;

import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0348 extends AbstractC2707 {

    public Object f1649;

    public boolean f1650;

    public boolean f1651;

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        return m1459(c0550, runnableC1668, false);
    }

    public final Object m1459(C0550 c0550, RunnableC1668 runnableC1668, boolean z) throws C1229 {
        Object obj;
        if (this.f1650 && (obj = this.f1649) != null) {
            return obj;
        }
        Object[] objArrM4710 = m4710();
        Object c1751 = objArrM4710[0];
        for (int i = 1; i < objArrM4710.length; i++) {
            C0349 c0349 = (C0349) this.f8721[i];
            int i2 = c0349.f1652;
            if (i2 == 5 && i != objArrM4710.length - 1) {
                throw new C1229("Method Reference must be the last suffix!", c0349, c0550);
            }
            if (i2 != 6) {
                if (c1751 instanceof InterfaceC2225) {
                    c1751 = c1751 instanceof C0326 ? ((C0326) c1751).m1433(c0550, runnableC1668, false) : ((InterfaceC2225) c1751).mo306(c0550, runnableC1668);
                } else if (c1751 instanceof C1751) {
                    try {
                        c1751 = ((C1751) c1751).m3498();
                    } catch (C3523 e) {
                        throw e.mo4643(c0349, c0550);
                    }
                }
                try {
                    int i3 = c0349.f1652;
                    if (i3 == 1) {
                        c1751 = c0349.m1461(c0550, runnableC1668, c1751, z);
                    } else if (i3 == 2) {
                        c1751 = c0349.m1462(c0550, runnableC1668, c1751, z);
                    } else if (i3 == 3) {
                        c1751 = c0349.m1464(c0550, runnableC1668, c1751, z);
                    } else if (i3 == 4) {
                        c1751 = c0349.m1463(c1751, c0550, runnableC1668);
                    } else {
                        if (i3 != 5) {
                            throw new C1669("Unknown suffix type");
                        }
                        String str = c0349.f1653;
                        C0495 c0495 = AbstractC0496.f2133;
                        c1751 = new C0494(c0349, c1751, str);
                    }
                } catch (C2518 e2) {
                    throw new C1229("reflection error: " + e2, c0349, c0550, e2);
                }
            } else {
                if (!(c1751 instanceof C0356)) {
                    throw new C1230("Attempt to use .class suffix on non class.", c0349, c0550);
                }
                if (z) {
                    throw new C1230("Can't assign .class", c0349, c0550);
                }
                c1751 = ((C0356) c1751).m1467(c0550, runnableC1668);
            }
        }
        if (c1751 instanceof InterfaceC2225) {
            if (!(c1751 instanceof C0326)) {
                if (z) {
                    throw new C1230("Can't assign to prefix.", this, c0550);
                }
                c1751 = ((InterfaceC2225) c1751).mo306(c0550, runnableC1668);
            } else if (z) {
                C0326 c0326 = (C0326) c1751;
                try {
                    c1751 = c0550.m1929().m352(c0326.f1577).m338(c0550, runnableC1668);
                } catch (C3523 e3) {
                    throw e3.mo4643(c0326, c0550);
                }
            } else {
                c1751 = ((C0326) c1751).m1433(c0550, runnableC1668, false);
            }
        }
        if (this.f1651) {
            if (c1751 == Primitive.VOID) {
                throw new C1230("illegal use of undefined variable or 'void' literal", this, c0550);
            }
            c1751 = new C1751(c1751);
        }
        if (this.f1650) {
            this.f1649 = c1751;
        }
        return c1751;
    }
}
