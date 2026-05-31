package p000;

import java.util.Collections;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᤝᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2800 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2800 f8975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String[] f8976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8979;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2751 f8980;

    static {
        AbstractC1471.m3394(-624376575687299L);
        AbstractC1471.m3394(-624531194509955L);
        String[] strArr = AbstractC1471.f5234;
        f8975 = new C2800("SnsInfoHook");
        f8976 = new String[]{"${originalText}", "${time}", "${type}", "${snsId}", "${userName}"};
        f8977 = "朋友圈";
        f8978 = "朋友圈底部详情";
        f8979 = "为朋友圈列表项的底部添加自定义文本";
        f8980 = new C2751(24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m4764(Object obj) {
        int i = AbstractC1768.f5906;
        C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
        String[] strArr = AbstractC1471.f5234;
        c1300M3558.f6475 = "field_snsId";
        long jLongValue = ((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).longValue();
        C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
        c1300M3559.f6475 = "field_userName";
        String str = (String) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127();
        C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
        c1300M35510.f6475 = "field_createTime";
        int iIntValue = ((Number) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127()).intValue();
        C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
        c1300M35511.f6475 = "field_type";
        int iIntValue2 = ((Number) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127()).intValue();
        String strM4918 = AbstractC2909.m4918(C2798.f8973.m2666(), "${time}", AbstractC2234.m4188(((long) iIntValue) * 1000, C2799.f8974.m2666(), null, 2));
        String str2 = "${type}";
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        AbstractC2727.m4694(16);
        String string = Integer.toString(iIntValue2, 16);
        "toString(...)";
        String upperCase = string.toUpperCase(Locale.ROOT);
        "toUpperCase(...)";
        sb.append(upperCase);
        return AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(strM4918, str2, sb.toString()), "${snsId}", String.valueOf(jLongValue)), "${userName}", str);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        if (!AbstractC0972.m2596(EnumC3737.f11679) && !AbstractC0972.m2597(EnumC3734.f11645)) {
            AbstractC0972.m2592(C2796.f8971, dexKitBridge, new C2751(27));
        } else {
            AbstractC0972.m2592(C2795.f8970, dexKitBridge, new C2751(25));
            AbstractC0972.m2592(C2794.f8969, dexKitBridge, new C2751(26));
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        boolean zM2596 = AbstractC0972.m2596(EnumC3737.f11679);
        C2800 c2800 = f8975;
        if (zM2596 || AbstractC0972.m2597(EnumC3734.f11645)) {
            C3752 c3752M4301 = C2342.m4301(c2800, Collections.singletonList(AbstractC0972.m2610(C2795.f8970)));
            c2800.m3443(c3752M4301, new C2751(28));
            c3752M4301.m5360();
        } else {
            C3752 c3752M4302 = C2342.m4301(c2800, Collections.singletonList(AbstractC0972.m2610(C2796.f8971)));
            c2800.m3443(c3752M4302, new C2751(20));
            c3752M4302.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8979;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8978;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8977;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f8980;
    }
}
