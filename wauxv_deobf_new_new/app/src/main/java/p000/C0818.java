package p000;

import java.lang.reflect.Method;
import me.hd.wauxv.data.bean.ContactBean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0818 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0818 f3214 = new C0818();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m2487(String str) throws NoSuchMethodException {
        Method methodM2610 = AbstractC0972.m2610(C0817.f3213);
        C2884 c2884 = C2884.f9232;
        c2884.getClass();
        int i = AbstractC1768.f5906;
        C2725.f8744.getClass();
        c2884.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C2725.m4690(AbstractC0972.m2608(C2883.f9231))).m3560();
        f3214.getClass();
        c2004M3560.f6648 = AbstractC0972.m2608(C0816.f3212);
        return methodM2610.invoke(((C2013) AbstractC1095.m2793(c2004M3560)).m4025(new Object[0]), str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static String m2488(String str) {
        return new ContactBean(m2487(str)).getNickname();
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0816.f3212, dexKitBridge, new C0801(16));
        AbstractC0972.m2592(C0817.f3213, dexKitBridge, new C0801(17));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
