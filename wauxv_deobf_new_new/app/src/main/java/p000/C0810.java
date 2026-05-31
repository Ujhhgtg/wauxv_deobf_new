package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0810 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0810 f3180 = new C0810();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static List m2476() {
        Method methodM2610 = AbstractC0972.m2610(C0807.f3177);
        C0806.f3176.getClass();
        Object objInvoke = methodM2610.invoke(C0806.m2475(), null);
        "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>";
        return (List) objInvoke;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static List m2477(String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodM2610 = AbstractC0972.m2610(C0809.f3179);
        C0806.f3176.getClass();
        Object objInvoke = methodM2610.invoke(C0806.m2475(), str);
        List list = objInvoke instanceof List ? (List) objInvoke : null;
        return list == null ? C1191.f4326 : list;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0808.f3178, dexKitBridge, new C0801(9));
        AbstractC0972.m2592(C0807.f3177, dexKitBridge, new C0801(10));
        AbstractC0972.m2592(C0809.f3179, dexKitBridge, new C0801(11));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final Class m2478() {
        return AbstractC0972.m2610(C0808.f3178).getDeclaringClass();
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
