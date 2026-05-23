package p000;

import java.util.ArrayList;
import java.util.Set;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2755 extends AbstractC2867 implements InterfaceC1582, InterfaceC1601 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2755 f8841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8844;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8841 = new C2755("SnsLabelFilterHook");
        f8842 = "朋友圈";
        f8843 = "朋友圈标签过滤";
        f8844 = "可通过顶栏菜单过滤指定标签的朋友圈";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static String m4732(String str) {
        String[] strArr = AbstractC1574.f5469;
        if (str.equals("SELECT rowid, * FROM SnsInfo WHERE (SnsInfo.sourceType & 2) <> 0 ORDER BY SnsInfo.createTime DESC LIMIT 10 OFFSET 0")) {
            Set<String> setM2541 = C2754.f8840.m2541();
            if (setM2541.isEmpty()) {
                setM2541 = null;
            }
            if (setM2541 != null && !setM2541.contains("default")) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : setM2541) {
                    
                    AbstractC0750.m2217(arrayList, C0811.m2360(str2));
                }
                return "SELECT rowid, * FROM SnsInfo WHERE ((SnsInfo.sourceType & 2) <> 0) AND (SnsInfo.userName IN " + AbstractC0744.m2196(AbstractC0744.m2208(arrayList), null, "(", ")", new C2734(15), 25) + ") ORDER BY SnsInfo.createTime DESC LIMIT 1000";
            }
        }
        return str;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2753.f8839, dexKitBridge, new C2734(16));
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2031(C1563 c1563, String str) {
        if (mo3264()) {
            String strM4732 = m4732(str);
            if (AbstractC2207.m4087(strM4732, str)) {
                return;
            }
            
            new C0408(1, 6, c1563).m1608(strM4732);
        }
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo3342(C1563 c1563, String str) {
        if (mo3264()) {
            String strM4732 = m4732(str);
            if (AbstractC2207.m4087(strM4732, str)) {
                return;
            }
            
            new C0408(0, 6, c1563).m1608(strM4732);
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI")).m3492();
        c1973M3492.f6370 = "onCreate";
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.m3799());
        C2755 c2755 = f8841;
        C3689 c3689M4174 = c2755.m4174(c1982, 1);
        c2755.m3262(c3689M4174, new C2734(17));
        c3689M4174.m5352();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8844;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8843;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8842;
    }
}
