package p000;

import de.robv.android.xposed.XposedBridge;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3512 extends AbstractC1823 implements InterfaceC1582 {

    public static final C3512 f11014 = new C3512();

    public static void m5097(Object obj) {
        XposedBridge.invokeOriginalMethod(AbstractC1574.dexToMethod(C3507.f11009), obj, new Object[0]);
    }

    public static Object m5098(C3512 c3512, int i) {
        
        return AbstractC1574.dexToCtor(C3506.f11008).newInstance(Integer.valueOf(i), null);
    }

    public static void m5099(Object obj, String str) {
        AbstractC1574.dexToMethod(C3508.f11010).invoke(obj, str);
    }

    public static void m5100(Object obj, String str) {
        AbstractC1574.dexToMethod(C3509.f11011).invoke(obj, str);
    }

    public static void m5101(Object obj, String str) {
        AbstractC1574.dexToMethod(C3510.f11012).invoke(obj, str);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C3506.f11008, dexKitBridge, new C3424(5));
        AbstractC1574.findMethod(C3508.f11010, dexKitBridge, new C3424(8));
        AbstractC1574.findMethod(C3511.f11013, dexKitBridge, new C3424(9));
        AbstractC1574.findMethod(C3510.f11012, dexKitBridge, new C3424(10));
        AbstractC1574.findMethod(C3509.f11011, dexKitBridge, new C3424(11));
        AbstractC1574.findMethod(C3507.f11009, dexKitBridge, new C3424(12));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
