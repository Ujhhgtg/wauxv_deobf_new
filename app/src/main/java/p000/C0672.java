package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0672 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0672 f2555 = new C0672();

    public static Object m2065() {
        int i = 0;
        C1878 c1878 = C1878.f6225;
        Class cls = (Class) AbstractC0270.m1385(AbstractC1574.dexToClass(C0671.f2554).getInterfaces());
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(AbstractC1574.dexToMethod(C1877.f6224).invoke(null, cls)).m3492();
        
        c1973M3492.returnType = AbstractC1574.dexToMethod(C0673.f2556).getDeclaringClass();
        return ((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0671.f2554, dexKitBridge, new C0645(19));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
