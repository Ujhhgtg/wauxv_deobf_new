package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1878 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1878 f6225 = new C1878();

    public static Object m3655() {
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C1876.f6223)).m3492();
        
        c1973M3492.returnType = AbstractC1574.dexToClass(C0872.f3302);
        return ((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]);
    }

    public static Object m3656() {
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C1876.f6223)).m3492();
        
        c1973M3492.returnType = AbstractC1574.dexToMethod(C2178.f7139).getDeclaringClass();
        return ((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1876.f6223, dexKitBridge, new C1837(19));
        AbstractC1574.findMethod(C1877.f6224, dexKitBridge, new C1837(20));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
