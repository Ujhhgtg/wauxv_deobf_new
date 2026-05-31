package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᤝᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3684 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3684 f11475 = new C3684();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m5226(C3684 c3684, String str) {
        Object objInvoke;
        c3684.getClass();
        Method methodM2610 = AbstractC0972.m2610(C3683.f11474);
        if (Modifier.isStatic(methodM2610.getModifiers())) {
            objInvoke = methodM2610.invoke(null, str, true);
        } else {
            C2725 c2725 = C2725.f8744;
            Class<?> declaringClass = methodM2610.getDeclaringClass();
            c2725.getClass();
            objInvoke = methodM2610.invoke(C2725.m4690(declaringClass), null, str, true);
        }
        "null cannot be cast to non-null type kotlin.String";
        return (String) objInvoke;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C3682.f11473, dexKitBridge, new C3563(26));
        AbstractC0972.m2592(C3683.f11474, dexKitBridge, new C3563(27));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
