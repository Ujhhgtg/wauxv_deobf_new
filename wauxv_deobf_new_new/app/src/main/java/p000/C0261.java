package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0261 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0261 f1489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1766[] f1490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f1491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f1492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0253 f1493;

    static {
        C2478 c2478 = new C2478(C0261.class, "ActivityThreadClass", "getActivityThreadClass()Ljava/lang/Class;");
        AbstractC2574.f8194.getClass();
        f1490 = new InterfaceC1766[]{c2478, new C2478(C0261.class, "ContextImplClass", "getContextImplClass()Ljava/lang/Class;"), new C2478(C0261.class, "ActivityManagerNativeClass", "getActivityManagerNativeClass()Ljava/lang/Class;"), new C2478(C0261.class, "SingletonClass", "getSingletonClass()Ljava/lang/Class;"), new C2478(C0261.class, "IActivityManagerClass", "getIActivityManagerClass()Ljava/lang/Class;"), new C2478(C0261.class, "ActivityTaskManagerClass", "getActivityTaskManagerClass()Ljava/lang/Class;"), new C2478(C0261.class, "IActivityTaskManagerClass", "getIActivityTaskManagerClass()Ljava/lang/Class;")};
        f1489 = new C0261();
        new LinkedHashMap();
        f1492 = new LinkedHashMap();
        f1493 = AbstractC0705.m2228("android.app.ActivityThread", null, 6);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ClassLoader m1482() {
        Class<AbstractC3744> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(AbstractC3744.class));
        ClassLoader classLoader = (clsM4232 != null ? clsM4232 : AbstractC3744.class).getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new IllegalStateException("Operating system not supported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Application m1483() {
        Object c2641;
        try {
            c2641 = AndroidAppHelper.currentApplication();
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        Application application = (Application) c2641;
        if (application != null) {
            return application;
        }
        int i = AbstractC1768.f5906;
        InterfaceC1766 interfaceC1766 = f1490[0];
        C1681 c1681M4712 = AbstractC2727.m4712(f1493.m1469());
        C2933 c2933 = C0160.f1227;
        ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
        c1681M4712.m3561(true);
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "currentApplication";
        C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
        if (c2013 != null) {
            return (Application) c2013.m4026(new Object[0]);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m1484() {
        Object c2641;
        String str;
        C1681 c1681M4713;
        Object objM3126;
        C1681 c1681M4714;
        try {
            c2641 = AndroidAppHelper.currentApplicationInfo();
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        ApplicationInfo applicationInfo = null;
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        ApplicationInfo applicationInfo2 = (ApplicationInfo) c2641;
        if (applicationInfo2 == null) {
            int i = AbstractC1768.f5906;
            f1489.getClass();
            InterfaceC1766 interfaceC1766 = f1490[0];
            C1681 c1681M4712 = AbstractC2727.m4712(f1493.m1469());
            C2933 c2933 = C0160.f1227;
            ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
            c1681M4712.m3561(true);
            C2004 c2004M3560 = c1681M4712.m3560();
            c2004M3560.f6475 = "currentActivityThread";
            c2004M3560.m3006();
            C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
            Object objM4025 = c2013 != null ? c2013.m4025(new Object[0]) : null;
            if (objM4025 != null) {
                c1681M4713 = AbstractC2727.m4713(objM4025);
                c1681M4713.m3561(true);
            } else {
                c1681M4713 = null;
            }
            if (c1681M4713 != null) {
                C1300 c1300M3558 = c1681M4713.m3558();
                c1300M3558.f6475 = "mBoundApplication";
                C1316 c1316 = (C1316) AbstractC0739.m2291(c1300M3558.m3117());
                if (c1316 != null) {
                    objM3126 = c1316.m3126();
                } else {
                    objM3126 = null;
                }
            } else {
                objM3126 = null;
            }
            if (objM3126 != null) {
                c1681M4714 = AbstractC2727.m4713(objM3126);
                c1681M4714.m3561(true);
            } else {
                c1681M4714 = null;
            }
            if (c1681M4714 != null) {
                C1300 c1300M3559 = c1681M4714.m3558();
                c1300M3559.f6475 = "appInfo";
                C1316 c1317 = (C1316) AbstractC0739.m2291(c1300M3559.m3117());
                if (c1317 != null) {
                    applicationInfo = (ApplicationInfo) c1317.m3127();
                }
            }
            applicationInfo2 = applicationInfo;
        }
        return (applicationInfo2 == null || (str = applicationInfo2.packageName) == null) ? "android" : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m1485(ClassLoader classLoader, int i) {
        Method method;
        String str = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv" instanceof C2641 ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv";
        if (str == null) {
            str = "";
        }
        Class clsM2226 = AbstractC0705.m2226(str, classLoader, 2);
        if (clsM2226 != null) {
            int i2 = AbstractC1768.f5906;
            C1681 c1681M4712 = AbstractC2727.m4712(clsM2226);
            c1681M4712.m3561(true);
            if (i == 3) {
                C2004 c2004M3560 = c1681M4712.m3560();
                c2004M3560.f6475 = "_--_";
                C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
                C0258 c0258 = new C0258(1, 1);
                if (c2013 == null || (method = c2013.f6671) == null) {
                    return;
                }
                AbstractC3528.m5100(method, c0258);
                return;
            }
            C2004 c2004M3561 = c1681M4712.m3560();
            c2004M3561.f6475 = "__--";
            AbstractC3528.m5099((C2013) AbstractC0739.m2291(c2004M3561.m3993()), new C0258(1, 2));
            C2004 c2004M3562 = c1681M4712.m3560();
            c2004M3562.f6475 = "_-_-";
            AbstractC3528.m5099((C2013) AbstractC0739.m2291(c2004M3562.m3993()), new C0258(1, 3));
            C2004 c2004M3563 = c1681M4712.m3560();
            c2004M3563.f6475 = "-__-";
            AbstractC3528.m5099((C2013) AbstractC0739.m2291(c2004M3563.m3993()), new C0258(1, 4));
            C2004 c2004M3564 = c1681M4712.m3560();
            c2004M3564.f6475 = "-_-_";
            AbstractC3528.m5099((C2013) AbstractC0739.m2291(c2004M3564.m3993()), new C0258(1, 5));
            C2004 c2004M3565 = c1681M4712.m3560();
            c2004M3565.f6475 = "___-";
            AbstractC3528.m5099((C2013) AbstractC0739.m2291(c2004M3565.m3993()), new C0258(1, 0));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1486(String str) {
        Method method;
        try {
            LinkedHashMap linkedHashMap = f1492;
            int i = 1;
            if (!linkedHashMap.isEmpty()) {
                int i2 = AbstractC1768.f5906;
                C1681 c1681M4711 = AbstractC2727.m4711(AbstractC2574.m4549(Application.class));
                c1681M4711.m3561(true);
                C2004 c2004M3560 = c1681M4711.m3560();
                c2004M3560.f6475 = "attach";
                c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Context.class)}, 1));
                AbstractC3528.m5099((C2013) AbstractC0739.m2290(c2004M3560.m3993()), new C0259(i, i));
                C2004 c2004M3561 = c1681M4711.m3560();
                c2004M3561.f6475 = "onTerminate";
                AbstractC3528.m5099((C2013) AbstractC0739.m2290(c2004M3561.m3993()), new C0259(i, 2));
                C2004 c2004M3562 = c1681M4711.m3560();
                c2004M3562.f6475 = "onLowMemory";
                AbstractC3528.m5099((C2013) AbstractC0739.m2290(c2004M3562.m3993()), new C0259(i, 3));
                C2004 c2004M3563 = c1681M4711.m3560();
                c2004M3563.f6475 = "onTrimMemory";
                c2004M3563.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Integer.TYPE)}, 1));
                AbstractC3528.m5099((C2013) AbstractC0739.m2290(c2004M3563.m3993()), new C0259(i, 4));
                C2004 c2004M3564 = c1681M4711.m3560();
                c2004M3564.f6475 = "onConfigurationChanged";
                AbstractC3528.m5099((C2013) AbstractC0739.m2290(c2004M3564.m3993()), new C0259(i, 0));
            }
            if (AbstractC2240.f7305 || !linkedHashMap.isEmpty()) {
                int i3 = AbstractC1768.f5906;
                C1681 c1681M4712 = AbstractC2727.m4711(AbstractC2574.m4549(Instrumentation.class));
                c1681M4712.m3561(true);
                C2004 c2004M3565 = c1681M4712.m3560();
                c2004M3565.f6475 = "callApplicationOnCreate";
                C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3565.m3993());
                C0260 c0260 = new C0260(this, str);
                if (c2013 == null || (method = c2013.f6671) == null) {
                    return;
                }
                AbstractC3528.m5100(method, c0260);
            }
        } catch (Throwable unused) {
        }
    }
}
