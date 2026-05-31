package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᲁᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2213 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2213 f7263 = new C2213();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m4153(C2213 c2213, Object obj) {
        c2213.getClass();
        Method methodM2610 = AbstractC0972.m2610(C2211.f7261);
        C1905.f6300.getClass();
        methodM2610.invoke(C1905.m3834(), obj, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m4154(Object obj, C2198 c2198) {
        int i = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4713(obj).m3560();
        c2004M3560.f6475 = "doScene";
        c2004M3560.f4484 = 2;
        c2004M3560.m3926();
        C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
        if (c2013 == null) {
            return;
        }
        Class<?> cls = c2013.f6671.getParameterTypes()[1];
        C1576.f5470.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(C1576.m3455(), new Class[]{cls}, new C0469(c2198, 1));
        Method methodM2610 = AbstractC0972.m2610(C2212.f7262);
        C1905.f6300.getClass();
        c2013.m4025(methodM2610.invoke(C1905.m3834(), null), objNewProxyInstance);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2211.f7261, dexKitBridge, new C2200(17));
        AbstractC0972.m2592(C2212.f7262, dexKitBridge, new C2200(18));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
