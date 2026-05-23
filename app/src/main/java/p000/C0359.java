package p000;

import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0359 extends AbstractC2707 {

    public String f1675;

    public int f1676;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1675;
    }

    public final Object m1471(C0356 c0356, C2000 c2000, C0550 c0550, RunnableC1668 runnableC1668) {
        Object objMo306 = null;
        if (!c2000.m3864("final") && !Primitive.isWrapperType(c0356.f1666)) {
            objMo306 = Primitive.getDefaultValue(c0356.f1666);
        }
        if (m4710().length > 0) {
            InterfaceC2225 interfaceC2225 = this.f8721[0];
            if (interfaceC2225 instanceof C0329) {
                C0329 c0329 = (C0329) interfaceC2225;
                Class cls = c0356.f1666;
                int i = this.f1676;
                if (i <= 0 && (i = c0356.f1667) <= 0) {
                    i = -1;
                }
                objMo306 = c0329.m1438(cls, i, c0550, runnableC1668);
            } else {
                objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
            }
        }
        if (objMo306 != Primitive.VOID) {
            return objMo306;
        }
        throw new C1230("Void initializer.", this, c0550);
    }
}
