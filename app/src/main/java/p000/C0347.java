package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0347 extends AbstractC2707 {

    public String f1646;

    public boolean f1647;

    public Class[] f1648;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1646 + ", final=" + this.f1647;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        Class[] clsArr = this.f1648;
        if (clsArr != null) {
            return clsArr;
        }
        this.f1648 = new Class[m4710().length > 0 ? m4710().length : 1];
        int i = 0;
        if (m4710().length != 0) {
            while (true) {
                if (i >= (m4710().length > 0 ? m4710().length : 1)) {
                    break;
                }
                this.f1648[i] = ((C0356) this.f8721[i]).m1467(c0550, runnableC1668);
                i++;
            }
        } else {
            this.f1648[0] = null;
        }
        return this.f1648;
    }
}
