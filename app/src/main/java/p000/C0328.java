package p000;

import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0328 extends AbstractC2707 {

    public Class f1578;

    public int f1579;

    public int f1580;

    public int[] f1581;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1579 + ", " + this.f1580;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1230 {
        InterfaceC2225 interfaceC2225 = this.f8721[0];
        if (!(interfaceC2225 instanceof C0329)) {
            this.f1581 = new int[this.f1579];
            for (int i = 0; i < this.f1579; i++) {
                try {
                    this.f1581[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, this.f8721[i].mo306(c0550, runnableC1668))).intValue();
                } catch (Exception e) {
                    throw new C1230(AbstractC1194.m2780(i, "Array index: ", " length does not evaluate to an integer"), this, c0550, e);
                }
            }
            return Primitive.VOID;
        }
        Object objM1438 = ((C0329) interfaceC2225).m1438(this.f1578, this.f1580, c0550, runnableC1668);
        if (objM1438.getClass().isArray()) {
            int[] iArrM3967 = AbstractC2201.m3967(objM1438);
            this.f1581 = iArrM3967;
            if (-1 == this.f1580) {
                this.f1580 = iArrM3967.length;
            }
            if (iArrM3967.length != this.f1580) {
                StringBuilder sb = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                sb.append(this.f1580);
                sb.append(" dimensional array, but initializer is a ");
                throw new C1230(AbstractC2784.m4751(sb, this.f1581.length, " dimensional array"), this, c0550);
            }
        }
        return objM1438;
    }
}
