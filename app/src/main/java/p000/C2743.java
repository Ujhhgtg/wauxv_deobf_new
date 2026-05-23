package p000;

import java.lang.reflect.Method;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᤝᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2743 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2743 f8821 = new C2743();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m4731(String str) {
        C2742 c2742 = C2742.f8820;
        Method methodM3315 = AbstractC1574.dexToMethod(c2742);
        
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C2723.f8787)).m3492();
        c1973M3492.m3800(EnumC1999.STATIC);
        
        c1973M3492.returnType = AbstractC1574.dexToMethod(c2742).getDeclaringClass();
        return methodM3315.invoke(((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]), str);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2742.f8820, dexKitBridge, new C2734(7));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
