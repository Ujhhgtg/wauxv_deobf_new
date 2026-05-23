package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0326 extends AbstractC2707 {

    public String f1577;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1577;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        throw new C1669("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
    }

    public final Class m1432(C0550 c0550) {
        try {
            return c0550.m1929().m352(this.f1577).m337();
        } catch (ClassNotFoundException e) {
            throw new C1230(e.getMessage(), this, c0550, e);
        } catch (C3523 e2) {
            throw e2.mo4643(this, c0550);
        }
    }

    public final Object m1433(C0550 c0550, RunnableC1668 runnableC1668, boolean z) throws C1229 {
        try {
            return c0550.m1929().m352(this.f1577).m339(c0550, runnableC1668, z);
        } catch (C3523 e) {
            throw e.mo4643(this, c0550);
        }
    }
}
