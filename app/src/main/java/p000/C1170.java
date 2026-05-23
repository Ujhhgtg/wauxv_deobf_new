package p000;

import android.content.Context;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1170 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1170 f4301 = new C1170();

    public static String m2762(String str) {
        int i = 0;
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C1150.m2760()).m3492();
        c1973M3492.returnType = AbstractC2519.classToKClass(String.class);
        return (String) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(Context.class), AbstractC2519.classToKClass(String.class)}, 2, c1973M3492)).invoke(null, str);
    }

    public static void m2763(C1170 c1170, String str, Object obj) {
        
        int i = 0;
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C1150.m2760()).m3492();
        c1973M3492.returnType = Void.TYPE;
        c1973M3492.f4482 = new C1148(19);
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
        int parameterCount = c1982.f6566.getParameterCount();
        if (parameterCount == 4) {
            c1982.m3831(str, obj, null, null);
        } else if (parameterCount != 5) {
            c1982.m3831(str, obj, null);
        } else {
            c1982.m3831(str, obj, null, null, 0);
        }
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1169.f4300, dexKitBridge, new C1148(20));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
