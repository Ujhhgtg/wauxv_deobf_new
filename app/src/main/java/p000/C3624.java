package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3624 extends AbstractC1823 implements InterfaceC1582 {

    public static final C3624 f11326 = new C3624();

    public static String m5220(C3624 c3624, String str) {
        Object objInvoke;
        
        Method methodM3315 = AbstractC1574.dexToMethod(C3623.f11325);
        if (Modifier.isStatic(methodM3315.getModifiers())) {
            objInvoke = methodM3315.invoke(null, str, true);
        } else {
            C2663 c2663 = C2663.f8577;
            Class<?> declaringClass = methodM3315.getDeclaringClass();
            
            objInvoke = methodM3315.invoke(C2663.m4656(declaringClass), null, str, true);
        }
        return (String) objInvoke;
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C3622.f11324, dexKitBridge, new C3618(4));
        AbstractC1574.findMethod(C3623.f11325, dexKitBridge, new C3618(5));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
