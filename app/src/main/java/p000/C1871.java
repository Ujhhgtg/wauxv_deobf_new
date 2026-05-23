package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1871 extends C1870 {

    public C1216 f6218;

    @Override // p000.C1870
    public final int mo3650(Object obj) {
        InterfaceC2568 interfaceC2568 = (InterfaceC2568) obj;
        if (interfaceC2568 == null) {
            return 1;
        }
        return interfaceC2568.mo1207();
    }

    @Override // p000.C1870
    public final void mo3651(Object obj, Object obj2) {
        InterfaceC2568 interfaceC2568 = (InterfaceC2568) obj2;
        C1216 c1216 = this.f6218;
        if (c1216 == null || interfaceC2568 == null) {
            return;
        }
        c1216.f4391.m1680(interfaceC2568, true);
    }
}
