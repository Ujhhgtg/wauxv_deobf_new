package p000;

import java.util.Collections;
import java.util.Locale;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᛸᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2741 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2741 f8814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String[] f8815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f8818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2734 f8819;

    static {
        AbstractC1574.m3300(-600019816151732L);
        AbstractC1574.m3300(-600174434974388L);
        String[] strArr = AbstractC1574.f5469;
        f8814 = new C2741("SnsInfoHook");
        f8815 = new String[]{"${originalText}", "${time}", "${type}", "${snsId}", "${userName}"};
        f8816 = "朋友圈";
        f8817 = "朋友圈底部详情";
        f8818 = "为朋友圈列表项的底部添加自定义文本";
        f8819 = new C2734(2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static String m4730(Object obj) {
        int i = 0;
        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.name = "field_snsId";
        long jLongValue = ((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).longValue();
        C1299 c1299M3491 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3491.name = "field_userName";
        String str = (String) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024();
        C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3492.name = "field_createTime";
        int iIntValue = ((Number) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024()).intValue();
        C1299 c1299M3493 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3493.name = "field_type";
        int iIntValue2 = ((Number) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024()).intValue();
        String strM4857 = AbstractC2849.m4857(C2739.f8812.m2542(), "${time}", AbstractC3681.m5339(((long) iIntValue) * 1000, C2740.f8813.m2542(), null, 2));
        String str2 = "${type}";
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        AbstractC3681.m5317(16);
        String string = Integer.toString(iIntValue2, 16);
        "toString(...)";
        String upperCase = string.toUpperCase(Locale.ROOT);
        "toUpperCase(...)";
        sb.append(upperCase);
        return AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(strM4857, "${type}", sb.toString()), "${snsId}", String.valueOf(jLongValue)), "${userName}", str);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        if (!AbstractC3471.m5079(WeChatVersions.f11530) && !AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
            AbstractC1574.findMethod(C2737.f8810, dexKitBridge, new C2734(5));
        } else {
            AbstractC1574.findMethod(C2736.f8809, dexKitBridge, new C2734(3));
            AbstractC1574.findMethod(C2735.f8808, dexKitBridge, new C2734(4));
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        boolean zM5079 = AbstractC3471.m5079(WeChatVersions.f11530);
        C2741 c2741 = f8814;
        if (zM5079 || AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
            C3689 c3689M4172 = C2309.createHook(c2741, Collections.singletonList(AbstractC1574.dexToMethod(C2736.f8809)));
            c2741.m3262(c3689M4172, new C2734(6));
            c3689M4172.applyHook();
        } else {
            C3689 c3689M4173 = C2309.createHook(c2741, Collections.singletonList(AbstractC1574.dexToMethod(C2737.f8810)));
            c2741.m3262(c3689M4173, new C2659(28));
            c3689M4173.applyHook();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8818;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8817;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8816;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f8819;
    }
}
