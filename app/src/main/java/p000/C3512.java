package p000;

import de.robv.android.xposed.XposedBridge;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤝᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3512 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C3512 f11014 = new C3512();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m5097(Object obj) {
        XposedBridge.invokeOriginalMethod(AbstractC1574.m3315(C3507.f11009), obj, new Object[0]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static Object m5098(C3512 c3512, int i) {
        c3512.getClass();
        return AbstractC1574.m3314(C3506.f11008).newInstance(Integer.valueOf(i), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m5099(Object obj, String str) {
        AbstractC1574.m3315(C3508.f11010).invoke(obj, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m5100(Object obj, String str) {
        AbstractC1574.m3315(C3509.f11011).invoke(obj, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m5101(Object obj, String str) {
        AbstractC1574.m3315(C3510.f11012).invoke(obj, str);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C3506.f11008, dexKitBridge, new C3424(5));
        AbstractC1574.m3295(C3508.f11010, dexKitBridge, new C3424(8));
        AbstractC1574.m3295(C3511.f11013, dexKitBridge, new C3424(9));
        AbstractC1574.m3295(C3510.f11012, dexKitBridge, new C3424(10));
        AbstractC1574.m3295(C3509.f11011, dexKitBridge, new C3424(11));
        AbstractC1574.m3295(C3507.f11009, dexKitBridge, new C3424(12));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
