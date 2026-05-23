package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1164 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1164 f4291 = new C1164();

    public static Object m2761(String str) {
        int i = 0;
        
        C1176 c1176 = C1176.f4313;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(c1176)).m3492();
        c1973M3492.m3800(EnumC1999.STATIC);
        c1973M3492.returnType = AbstractC1574.dexToClass(c1176);
        MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0])).m3492();
        
        c1973M3493.returnType = AbstractC1574.dexToClass(C1163.f4290);
        MethodResolver c1973M3494 = AbstractC0968.startMethodResolution_(((C1982) AbstractC1194.m2778(c1973M3493)).m3831(new Object[0])).m3492();
        
        c1973M3494.returnType = AbstractC1574.dexToMethod(C1161.f4288).getDeclaringClass();
        return ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class)}, 1, c1973M3494)).m3831(str);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1163.f4290, dexKitBridge, new C1148(16));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
