package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1016 extends AbstractC2867 {

    public static final C1016 f3715;

    public static final String f3716;

    public static final String f3717;

    static {
        String[] strArr = AbstractC1574.f5469;
        f3715 = new C1016("DevLogHook");
        f3716 = "测试-仅限开发者使用";
        f3717 = "调试日志";
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        Object next;
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        List listM1389 = AbstractC0270.m1389(new String[]{"com.tencent.mars.xlog.MMXlog", "com.tencent.mars.xlog.Xlog"});
        
        ClassLoader classLoaderM3275 = C1565.m3275();
        Iterator it = listM1389.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC0710.m2134(classLoaderM3275, (String) next));
        String str = (String) next;
        Class clsM2130 = str != null ? AbstractC0710.m2130(classLoaderM3275, str) : null;
        if (clsM2130 == null) {
            throw new NoClassDefFoundError("VariousClass matches failed of " + listM1389 + ".");
        }
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(clsM2130).m3492();
        c1973M3492.name = "logMonitor";
        Class cls = Long.TYPE;
        C0707 c0707M4527 = AbstractC2519.classToKClass(cls);
        Class cls2 = Integer.TYPE;
        C3689 c3689M4174 = m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{c0707M4527, AbstractC2519.classToKClass(cls2), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(cls2), AbstractC2519.classToKClass(cls2), AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(String.class)}, 10, c1973M3492), 1);
        f3715.hookBefore(c3689M4174, new C0853(26));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f3717;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f3716;
    }

    @Override // p000.AbstractC2867
    public final boolean mo2591() {
        return false;
    }
}
