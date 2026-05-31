package p000;

import java.util.ArrayList;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2815 extends AbstractC2927 implements InterfaceC1594, InterfaceC1614 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2815 f9003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f9004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f9005;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f9006;

    static {
        String[] strArr = AbstractC1471.f5234;
        f9003 = new C2815("SnsLabelFilterHook");
        f9004 = "朋友圈";
        f9005 = "朋友圈标签过滤";
        f9006 = "可通过顶栏菜单过滤指定标签的朋友圈";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m4766(String str) {
        String[] strArr = AbstractC1471.f5234;
        if (str.equals("SELECT rowid, * FROM SnsInfo WHERE (SnsInfo.sourceType & 2) <> 0 ORDER BY SnsInfo.createTime DESC LIMIT 10 OFFSET 0")) {
            Set<String> setM2665 = C2814.f9002.m2665();
            if (setM2665.isEmpty()) {
                setM2665 = null;
            }
            if (setM2665 != null && !setM2665.contains("default")) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : setM2665) {
                    C0810.f3180.getClass();
                    AbstractC0745.m2316(arrayList, C0810.m2477(str2));
                }
                return "SELECT rowid, * FROM SnsInfo WHERE ((SnsInfo.sourceType & 2) <> 0) AND (SnsInfo.userName IN " + AbstractC0739.m2295(AbstractC0739.m2307(arrayList), null, "(", ")", new C2801(7), 25) + ") ORDER BY SnsInfo.createTime DESC LIMIT 1000";
            }
        }
        return str;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2813.f9001, dexKitBridge, new C2801(8));
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2141(C1574 c1574, String str) {
        if (mo3445()) {
            String strM4766 = m4766(str);
            if (AbstractC1469.m3322(strM4766, str)) {
                return;
            }
            c1574.getClass();
            new C0383(1, 6, c1574).m1714(strM4766);
        }
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo3506(C1574 c1574, String str) {
        if (mo3445()) {
            String strM4766 = m4766(str);
            if (AbstractC1469.m3322(strM4766, str)) {
                return;
            }
            c1574.getClass();
            new C0383(0, 6, c1574).m1714(strM4766);
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI")).m3560();
        c2004M3560.f6475 = "onCreate";
        C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
        C2815 c2815 = f9003;
        C3752 c3752M4303 = c2815.m4303(c2013, 1);
        c2815.m3443(c3752M4303, new C2801(9));
        c3752M4303.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f9006;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f9005;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f9004;
    }
}
