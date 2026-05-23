package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0251 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0251 f1415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC1742[] f1416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean f1417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f1418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0243 f1419;

    static {
        C2425 c2425 = new C2425(C0251.class, "ActivityThreadClass", "getActivityThreadClass()Ljava/lang/Class;");
        AbstractC2519.f8046.getClass();
        f1416 = new InterfaceC1742[]{c2425, new C2425(C0251.class, "ContextImplClass", "getContextImplClass()Ljava/lang/Class;"), new C2425(C0251.class, "ActivityManagerNativeClass", "getActivityManagerNativeClass()Ljava/lang/Class;"), new C2425(C0251.class, "SingletonClass", "getSingletonClass()Ljava/lang/Class;"), new C2425(C0251.class, "IActivityManagerClass", "getIActivityManagerClass()Ljava/lang/Class;"), new C2425(C0251.class, "ActivityTaskManagerClass", "getActivityTaskManagerClass()Ljava/lang/Class;"), new C2425(C0251.class, "IActivityTaskManagerClass", "getIActivityTaskManagerClass()Ljava/lang/Class;")};
        f1415 = new C0251();
        new LinkedHashMap();
        f1418 = new LinkedHashMap();
        f1419 = AbstractC0710.m2135("android.app.ActivityThread", null, 6);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ClassLoader m1336() {
        Class<AbstractC3681> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(AbstractC3681.class));
        ClassLoader classLoader = (clsM2183 != null ? clsM2183 : AbstractC3681.class).getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new IllegalStateException("Operating system not supported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Application m1337() {
        Object c2585;
        try {
            c2585 = AndroidAppHelper.currentApplication();
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        Application application = (Application) c2585;
        if (application != null) {
            return application;
        }
        int i = AbstractC1745.f5844;
        InterfaceC1742 interfaceC1742 = f1416[0];
        C1744 c1744M2483 = AbstractC0968.m2483(f1419.m1323());
        C2873 c2873 = C0152.f1159;
        ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
        c1744M2483.m3493(true);
        C1973 c1973M3492 = c1744M2483.m3492();
        c1973M3492.f6370 = "currentApplication";
        C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
        if (c1982 != null) {
            return (Application) c1982.m3832(new Object[0]);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m1338() {
        Object c2585;
        String str;
        C1744 c1744M2484;
        Object objM3023;
        C1744 c1744M2485;
        try {
            c2585 = AndroidAppHelper.currentApplicationInfo();
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        ApplicationInfo applicationInfo = null;
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        ApplicationInfo applicationInfo2 = (ApplicationInfo) c2585;
        if (applicationInfo2 == null) {
            int i = AbstractC1745.f5844;
            f1415.getClass();
            InterfaceC1742 interfaceC1742 = f1416[0];
            C1744 c1744M2483 = AbstractC0968.m2483(f1419.m1323());
            C2873 c2873 = C0152.f1159;
            ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
            c1744M2483.m3493(true);
            C1973 c1973M3492 = c1744M2483.m3492();
            c1973M3492.f6370 = "currentActivityThread";
            c1973M3492.m2887();
            C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
            Object objM3831 = c1982 != null ? c1982.m3831(new Object[0]) : null;
            if (objM3831 != null) {
                c1744M2484 = AbstractC0968.m2484(objM3831);
                c1744M2484.m3493(true);
            } else {
                c1744M2484 = null;
            }
            if (c1744M2484 != null) {
                C1299 c1299M3490 = c1744M2484.m3490();
                c1299M3490.f6370 = "mBoundApplication";
                C1315 c1315 = (C1315) AbstractC0744.m2192(c1299M3490.m3014());
                if (c1315 != null) {
                    objM3023 = c1315.m3023();
                } else {
                    objM3023 = null;
                }
            } else {
                objM3023 = null;
            }
            if (objM3023 != null) {
                c1744M2485 = AbstractC0968.m2484(objM3023);
                c1744M2485.m3493(true);
            } else {
                c1744M2485 = null;
            }
            if (c1744M2485 != null) {
                C1299 c1299M3491 = c1744M2485.m3490();
                c1299M3491.f6370 = "appInfo";
                C1315 c1316 = (C1315) AbstractC0744.m2192(c1299M3491.m3014());
                if (c1316 != null) {
                    applicationInfo = (ApplicationInfo) c1316.m3024();
                }
            }
            applicationInfo2 = applicationInfo;
        }
        return (applicationInfo2 == null || (str = applicationInfo2.packageName) == null) ? "android" : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m1339(ClassLoader classLoader, int i) {
        Method method;
        String str = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv" instanceof C2585 ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv";
        if (str == null) {
            str = "";
        }
        Class clsM2133 = AbstractC0710.m2133(str, classLoader, 2);
        if (clsM2133 != null) {
            int i2 = AbstractC1745.f5844;
            C1744 c1744M2483 = AbstractC0968.m2483(clsM2133);
            c1744M2483.m3493(true);
            if (i == 3) {
                C1973 c1973M3492 = c1744M2483.m3492();
                c1973M3492.f6370 = "_--_";
                C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
                C0248 c0248 = new C0248(1, 1);
                if (c1982 == null || (method = c1982.f6566) == null) {
                    return;
                }
                AbstractC2209.m4134(method, c0248);
                return;
            }
            C1973 c1973M3493 = c1744M2483.m3492();
            c1973M3493.f6370 = "__--";
            AbstractC2209.m4133((C1982) AbstractC0744.m2192(c1973M3493.m3799()), new C0248(1, 2));
            C1973 c1973M3494 = c1744M2483.m3492();
            c1973M3494.f6370 = "_-_-";
            AbstractC2209.m4133((C1982) AbstractC0744.m2192(c1973M3494.m3799()), new C0248(1, 3));
            C1973 c1973M3495 = c1744M2483.m3492();
            c1973M3495.f6370 = "-__-";
            AbstractC2209.m4133((C1982) AbstractC0744.m2192(c1973M3495.m3799()), new C0248(1, 4));
            C1973 c1973M3496 = c1744M2483.m3492();
            c1973M3496.f6370 = "-_-_";
            AbstractC2209.m4133((C1982) AbstractC0744.m2192(c1973M3496.m3799()), new C0248(1, 5));
            C1973 c1973M3497 = c1744M2483.m3492();
            c1973M3497.f6370 = "___-";
            AbstractC2209.m4133((C1982) AbstractC0744.m2192(c1973M3497.m3799()), new C0248(1, 0));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1340(String str) {
        Method method;
        try {
            LinkedHashMap linkedHashMap = f1418;
            int i = 1;
            if (!linkedHashMap.isEmpty()) {
                int i2 = AbstractC1745.f5844;
                C1744 c1744M2482 = AbstractC0968.m2482(AbstractC2519.m4527(Application.class));
                c1744M2482.m3493(true);
                C1973 c1973M3492 = c1744M2482.m3492();
                c1973M3492.f6370 = "attach";
                c1973M3492.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(Context.class)}, 1));
                AbstractC2209.m4133((C1982) AbstractC0744.m2191(c1973M3492.m3799()), new C0249(i, i));
                C1973 c1973M3493 = c1744M2482.m3492();
                c1973M3493.f6370 = "onTerminate";
                AbstractC2209.m4133((C1982) AbstractC0744.m2191(c1973M3493.m3799()), new C0249(i, 2));
                C1973 c1973M3494 = c1744M2482.m3492();
                c1973M3494.f6370 = "onLowMemory";
                AbstractC2209.m4133((C1982) AbstractC0744.m2191(c1973M3494.m3799()), new C0249(i, 3));
                C1973 c1973M3495 = c1744M2482.m3492();
                c1973M3495.f6370 = "onTrimMemory";
                c1973M3495.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(Integer.TYPE)}, 1));
                AbstractC2209.m4133((C1982) AbstractC0744.m2191(c1973M3495.m3799()), new C0249(i, 4));
                C1973 c1973M3496 = c1744M2482.m3492();
                c1973M3496.f6370 = "onConfigurationChanged";
                AbstractC2209.m4133((C1982) AbstractC0744.m2191(c1973M3496.m3799()), new C0249(i, 0));
            }
            if (AbstractC2205.f7173 || !linkedHashMap.isEmpty()) {
                int i3 = AbstractC1745.f5844;
                C1744 c1744M2483 = AbstractC0968.m2482(AbstractC2519.m4527(Instrumentation.class));
                c1744M2483.m3493(true);
                C1973 c1973M3497 = c1744M2483.m3492();
                c1973M3497.f6370 = "callApplicationOnCreate";
                C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3497.m3799());
                C0250 c0250 = new C0250(this, str);
                if (c1982 == null || (method = c1982.f6566) == null) {
                    return;
                }
                AbstractC2209.m4134(method, c0250);
            }
        } catch (Throwable unused) {
        }
    }
}
