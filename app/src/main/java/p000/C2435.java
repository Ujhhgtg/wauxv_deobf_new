package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2435 extends AbstractC1438 implements InterfaceC1429 {
    @Override // p000.InterfaceC1429
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC2654 interfaceC2654 = (InterfaceC2654) obj;
        int iIntValue = ((Number) obj2).intValue();
        C2436 c2436 = (C2436) this.f2268;
        
        boolean z = false;
        if (!interfaceC2654.mo3477(iIntValue)) {
            InterfaceC2654 interfaceC2654Mo3476 = interfaceC2654.mo3476(iIntValue);
            AbstractC1460 abstractC1460Mo3472 = interfaceC2654Mo3476.mo3472();
            if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113) || AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9112)) {
                c2436.f7742 = false;
            } else if (interfaceC2654Mo3476.mo3470()) {
                c2436.f7742 = true;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
