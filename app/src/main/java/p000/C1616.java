package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1616 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1616 f5487 = new C1616();

    public static String m3344(Object obj) {
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C1610.f5481)).m3492();
        c1973M3492.m3800(EnumC1999.STATIC);
        
        c1973M3492.returnType = AbstractC1574.dexToClass(C1615.f5486);
        MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0])).m3492();
        c1973M3493.returnType = AbstractC2519.classToKClass(String.class);
        
        return (String) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC1574.dexToClass(C2059.f6854)}, 1, c1973M3493)).invoke(obj);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1615.f5486, dexKitBridge, new C1608(5));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
