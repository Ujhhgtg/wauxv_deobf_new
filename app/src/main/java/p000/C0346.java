package p000;

import bsh.AbstractC0009;
import bsh.C0006;
import bsh.C0007;
import bsh.Primitive;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0346 extends AbstractC2707 {
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        C0007 c0007M1929 = c0550.m1929();
        C0326 c0326 = (C0326) this.f8721[0];
        if ("fail".equals(c0326.f1577)) {
            runnableC1668.f5634.f506 = this;
        }
        C0007 c0007 = c0007M1929.f494;
        if (c0007 != null && c0007.f508 && (c0326.f1577.equals("super") || c0326.f1577.equals("this"))) {
            return Primitive.VOID;
        }
        C0006 c0006M352 = c0007M1929.m352(c0326.f1577);
        try {
            return c0006M352.m335(runnableC1668, ((C0327) this.f8721[1]).m1434(c0550, runnableC1668), c0550, this);
        } catch (InvocationTargetException e) {
            throw AbstractC0009.m409(e, c0006M352.f485, c0550, this);
        } catch (C2518 e2) {
            throw new C1230("Error in method invocation: " + e2.getMessage(), this, c0550, e2);
        } catch (C3523 e3) {
            throw e3.mo4643(this, c0550);
        }
    }
}
