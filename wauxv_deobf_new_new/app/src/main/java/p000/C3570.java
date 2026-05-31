package p000;

import de.robv.android.xposed.XposedBridge;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᤞᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3570 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3570 f11167 = new C3570();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m5109(Object obj) {
        XposedBridge.invokeOriginalMethod(AbstractC0972.m2610(C3565.f11162), obj, new Object[0]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static Object m5110(C3570 c3570, int i) {
        c3570.getClass();
        return AbstractC0972.m2609(C3564.f11161).newInstance(Integer.valueOf(i), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m5111(Object obj, String str) {
        AbstractC0972.m2610(C3566.f11163).invoke(obj, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m5112(Object obj, String str) {
        AbstractC0972.m2610(C3567.f11164).invoke(obj, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m5113(Object obj, String str) {
        AbstractC0972.m2610(C3568.f11165).invoke(obj, str);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C3564.f11161, dexKitBridge, new C2868(27));
        AbstractC0972.m2592(C3566.f11163, dexKitBridge, new C3563(0));
        AbstractC0972.m2592(C3569.f11166, dexKitBridge, new C3563(1));
        AbstractC0972.m2592(C3568.f11165, dexKitBridge, new C3563(2));
        AbstractC0972.m2592(C3567.f11164, dexKitBridge, new C3563(3));
        AbstractC0972.m2592(C3565.f11162, dexKitBridge, new C3563(4));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
