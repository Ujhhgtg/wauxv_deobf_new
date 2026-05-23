package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2824 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2824 f9070 = new C2824();

    public static Object m4798() {
        int i = 0;
        
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2663.m4656(AbstractC1574.dexToClass(C2823.f9069))).m3492();
        
        c1973M3492.returnType = AbstractC1574.dexToClass(C0856.f3271);
        return ((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2820.f9066, dexKitBridge, new C2798(10));
        AbstractC1574.findMethod(C2822.f9068, dexKitBridge, new C2798(11));
        AbstractC1574.findMethod(C2821.f9067, dexKitBridge, new C2798(12));
        AbstractC1574.findMethod(C2823.f9069, dexKitBridge, new C2798(13));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
