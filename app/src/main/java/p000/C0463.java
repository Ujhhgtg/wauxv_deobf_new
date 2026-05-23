package p000;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0463 extends AbstractC2867 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0463 f2038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C2873 f2040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2873 f2041;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2873 f2042;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2873 f2043;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2873 f2044;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final String f2045;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String f2046;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final String f2047;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final C0316 f2048;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final boolean f2049;

    static {
        AbstractC1574.m3300(-476612520835764L);
        AbstractC1574.m3300(-476625405737652L);
        AbstractC1574.m3300(-476638290639540L);
        AbstractC1574.m3300(-476651175541428L);
        String[] strArr = AbstractC1574.f5469;
        f2038 = new C0463("BottomTabCustomHook");
        C2873 c2873 = AbstractC2342.f7529;
        f2039 = AbstractC2342.m4330("Resource", "BottomTab");
        f2040 = new C2873(new C0104(6));
        f2041 = new C2873(new C0104(7));
        f2042 = new C2873(new C0104(8));
        f2043 = new C2873(new C0104(9));
        f2044 = new C2873(new C0104(10));
        f2045 = "美化";
        f2046 = "底栏自定义";
        f2047 = "替换主页底部标签栏相关资源为自定义";
        f2048 = new C0316(13);
        f2049 = true;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        C0796 c0796M3486 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.ui.LauncherUIBottomTabView")).m3486();
        c0796M3486.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(Context.class)}, 1));
        C0798 c0798 = (C0798) AbstractC0744.firstInList(c0796M3486.m2344());
        C0463 c0463 = f2038;
        C3689 c3689M4174 = c0463.m4174(c0798, 1);
        c0463.m3262(c3689M4174, new C0316(14));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2047;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2046;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2045;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f2048;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f2049;
    }
}
