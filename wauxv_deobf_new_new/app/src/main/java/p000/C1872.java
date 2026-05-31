package p000;

import android.content.Intent;
import java.util.Iterator;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1872 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1872 f6214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1766[] f6215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static C2048 f6216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C0253 f6217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f6218;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f6219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f6220;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1633 f6221;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String[] f6222;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final boolean f6223;

    static {
        String[] strArr = AbstractC1471.f5234;
        f6215 = new InterfaceC1766[]{new C2478(C1872.class, "RedirectUIClass", "getRedirectUIClass()Ljava/lang/Class;")};
        f6214 = new C1872("LocationHook");
        f6217 = AbstractC0705.m2228("com.tencent.mm.plugin.location.ui.RedirectUI", new C0112(27), 2);
        f6218 = "辅助";
        f6219 = "虚拟定位";
        f6220 = "将腾讯定位SDK结果虚拟为指定经纬度";
        f6221 = new C1633(22);
        f6222 = new String[]{EnumC3735.f11663.f11667, EnumC3735.f11664.f11667};
        f6223 = true;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1865.f6206, dexKitBridge, new C1633(26));
        AbstractC0972.m2592(C1866.f6207, dexKitBridge, new C1633(27));
        AbstractC0972.m2592(C1864.f6205, dexKitBridge, new C1633(28));
        AbstractC0972.m2592(C1867.f6208, dexKitBridge, new C1633(29));
    }

    @Override // p000.AbstractC2927, p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final String[] mo1384() {
        return f6222;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        InterfaceC1766 interfaceC1766 = f6215[0];
        C2004 c2004M3560 = AbstractC2727.m4712(f6217.m1469()).m3560();
        c2004M3560.f6475 = "onActivityResult";
        Class cls = Integer.TYPE;
        C3752 c3752M4303 = m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(Intent.class)}, 3, c2004M3560), 1);
        f6214.m3443(c3752M4303, new C1633(23));
        c3752M4303.m5360();
        Iterator it = AbstractC0740.m2311(C1865.f6206, C1866.f6207, C1864.f6205).iterator();
        while (it.hasNext()) {
            AbstractC0972.m2611((AbstractC1024) it.next(), new C1633(24));
        }
        AbstractC0972.m2611(C1867.f6208, new C1633(25));
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f6220;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f6219;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f6218;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f6221;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f6223;
    }
}
