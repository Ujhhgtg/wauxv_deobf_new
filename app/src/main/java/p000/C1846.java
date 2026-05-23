package p000;

import android.content.Intent;
import java.util.Iterator;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1846 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1846 f6140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1742[] f6141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static C2022 f6142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0243 f6143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f6144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f6145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final String f6146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1837 f6147;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String[] f6148;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final boolean f6149;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6141 = new InterfaceC1742[]{new C2425(C1846.class, "RedirectUIClass", "getRedirectUIClass()Ljava/lang/Class;")};
        f6140 = new C1846("LocationHook");
        f6143 = AbstractC0710.m2135("com.tencent.mm.plugin.location.ui.RedirectUI", new C0104(27), 2);
        f6144 = "辅助";
        f6145 = "虚拟定位";
        f6146 = "将腾讯定位SDK结果虚拟为指定经纬度";
        f6147 = new C1837(6);
        f6148 = new String[]{EnumC3675.f11514.f11518, EnumC3675.f11515.f11518};
        f6149 = true;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1839.f6132, dexKitBridge, new C1837(10));
        AbstractC1574.findMethod(C1840.f6133, dexKitBridge, new C1837(11));
        AbstractC1574.findMethod(C1838.f6131, dexKitBridge, new C1837(12));
        AbstractC1574.findMethod(C1841.f6134, dexKitBridge, new C1837(13));
    }

    @Override // p000.AbstractC2867, p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final String[] mo1238() {
        return f6148;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        InterfaceC1742 interfaceC1742 = f6141[0];
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(f6143.m1323()).m3492();
        c1973M3492.name = "onActivityResult";
        Class cls = Integer.TYPE;
        C3689 c3689M4174 = m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(Intent.class)}, 3, c1973M3492), 1);
        f6140.m3262(c3689M4174, new C1837(7));
        c3689M4174.applyHook();
        Iterator it = AbstractC0745.listOf(C1839.f6132, C1840.f6133, C1838.f6131).iterator();
        while (it.hasNext()) {
            AbstractC1574.m3316((AbstractC1021) it.next(), new C1837(8));
        }
        AbstractC1574.m3316(C1841.f6134, new C1837(9));
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f6146;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f6145;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f6144;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f6147;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f6149;
    }
}
