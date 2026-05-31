package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᛸᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1064 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1064 f3853;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f3854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f3855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f3856;

    static {
        String[] strArr = AbstractC1471.f5234;
        f3853 = new C1064("DisableXLogHook");
        f3854 = "测试/仅限开发者使用";
        f3855 = "禁止日志";
        f3856 = "禁止 XLog 日志文件在 MicroMsg 生成";
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.xlog.app.XLogSetup")).m3560();
        c2004M3560.f6475 = "keep_setupXLog";
        Class cls = Boolean.TYPE;
        C3752 c3752M4303 = m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(Integer.class), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(String.class)}, 7, c2004M3560), 1);
        f3853.m3444(c3752M4303, new C1055(9));
        c3752M4303.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f3856;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f3855;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f3854;
    }
}
