package p000;

import java.lang.reflect.Method;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᤞᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0819 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0819 f3207 = new C0819();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m2371(String str) {
        Method methodM3315 = AbstractC1574.dexToMethod(C0818.f3206);
        C2824 c2824 = C2824.f9070;
        
        int i = 0;
        
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2663.m4656(AbstractC1574.dexToClass(C2823.f9069))).m3492();
        
        c1973M3492.returnType = AbstractC1574.dexToClass(C0817.f3205);
        return methodM3315.invoke(((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]), str, Boolean.FALSE);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0817.f3205, dexKitBridge, new C0807(7));
        AbstractC1574.findMethod(C0818.f3206, dexKitBridge, new C0807(8));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
