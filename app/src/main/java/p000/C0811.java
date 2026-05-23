package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0811 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0811 f3173 = new C0811();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static List m2360(String str) throws IllegalAccessException, InvocationTargetException {
        Method methodM3315 = AbstractC1574.m3315(C0810.f3172);
        C0806.f3168.getClass();
        Object objInvoke = methodM3315.invoke(C0806.m2359(), str);
        List list = objInvoke instanceof List ? (List) objInvoke : null;
        return list == null ? C1189.f4329 : list;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C0809.f3171, dexKitBridge, new C0807(0));
        AbstractC1574.m3295(C0808.f3170, dexKitBridge, new C0807(1));
        AbstractC1574.m3295(C0810.f3172, dexKitBridge, new C0807(2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Class m2361() {
        return AbstractC1574.m3315(C0809.f3171).getDeclaringClass();
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
