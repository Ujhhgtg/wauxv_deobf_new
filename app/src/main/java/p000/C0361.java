package p000;

import bsh.Primitive;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0361 extends AbstractC2707 implements InterfaceC2335 {

    public boolean f1679;

    public String f1680;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1680 + ": do=" + this.f1679;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        InterfaceC2225 interfaceC2225;
        InterfaceC2225 interfaceC2226;
        int i;
        String str;
        int length = m4710().length;
        boolean z = this.f1679;
        if (z) {
            InterfaceC2225[] interfaceC2225Arr = this.f8721;
            interfaceC2226 = interfaceC2225Arr[1];
            interfaceC2225 = interfaceC2225Arr[0];
        } else {
            InterfaceC2225[] interfaceC2225Arr2 = this.f8721;
            InterfaceC2225 interfaceC2227 = interfaceC2225Arr2[0];
            interfaceC2225 = length > 1 ? interfaceC2225Arr2[1] : null;
            interfaceC2226 = interfaceC2227;
        }
        while (!Thread.interrupted() && (z || C0341.m1454(interfaceC2226, c0550, runnableC1668))) {
            if (interfaceC2225 != null) {
                Object objM1448 = interfaceC2225 instanceof C0333 ? ((C0333) interfaceC2225).m1448(c0550, runnableC1668, null) : interfaceC2225.mo306(c0550, runnableC1668);
                if (objM1448 instanceof C2588) {
                    C2588 c2588 = (C2588) objM1448;
                    String str2 = c2588.f8195;
                    if ((str2 != null && ((str = this.f1680) == null || !str.equals(str2))) || (i = c2588.f8194) == 49) {
                        return objM1448;
                    }
                    if (i == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            z = false;
        }
        return Primitive.VOID;
    }
}
