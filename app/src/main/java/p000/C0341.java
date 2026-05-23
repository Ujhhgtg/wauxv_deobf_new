package p000;

import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0341 extends AbstractC2707 {

    public boolean f1624;

    public static boolean m1454(InterfaceC2225 interfaceC2225, C0550 c0550, RunnableC1668 runnableC1668) throws C1230 {
        Object objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
        if (objMo306 != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objMo306)).booleanValue();
        }
        throw new C1230("Condition evaluates to void type", interfaceC2225, c0550);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        Object objMo306;
        if (m1454(this.f8721[0], c0550, runnableC1668)) {
            if (this.f1624) {
                objMo306 = null;
            } else {
                objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
            }
        } else if (m4710().length > 2) {
            objMo306 = this.f8721[2].mo306(c0550, runnableC1668);
        } else if (this.f1624) {
            objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
        } else {
            objMo306 = null;
        }
        return objMo306 instanceof C2588 ? objMo306 : Primitive.VOID;
    }
}
