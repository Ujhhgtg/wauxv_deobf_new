package p000;

import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᤞᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1019 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1019 f3722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f3723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f3724;

    static {
        String[] strArr = AbstractC1471.f5234;
        f3722 = new C1019("DevLogHook");
        f3723 = "测试/仅限开发者使用";
        f3724 = "调试日志";
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        Object next;
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        List listM1535 = AbstractC0280.m1535(new String[]{"com.tencent.mars.xlog.MMXlog", "com.tencent.mars.xlog.Xlog"});
        C1576.f5470.getClass();
        ClassLoader classLoaderM3455 = C1576.m3455();
        Iterator it = listM1535.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC0705.m2227(classLoaderM3455, (String) next));
        String str = (String) next;
        Class clsM2223 = str != null ? AbstractC0705.m2223(classLoaderM3455, str) : null;
        if (clsM2223 == null) {
            throw new NoClassDefFoundError("VariousClass matches failed of " + listM1535 + ".");
        }
        C2004 c2004M3560 = AbstractC2727.m4712(clsM2223).m3560();
        c2004M3560.f6475 = "logMonitor";
        Class cls = Long.TYPE;
        C0702 c0702M4549 = AbstractC2574.m4549(cls);
        Class cls2 = Integer.TYPE;
        C3752 c3752M4303 = m4303((C2013) AbstractC2844.m4777(new Object[]{c0702M4549, AbstractC2574.m4549(cls2), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(cls2), AbstractC2574.m4549(cls2), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(String.class)}, 10, c2004M3560), 1);
        f3722.m3444(c3752M4303, new C0943(13));
        c3752M4303.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f3724;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f3723;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final boolean mo2715() {
        return false;
    }
}
