package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.HookEntry;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1562 f5434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean f5435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final HookEntry f5436;

    static {
        AbstractC1574.m3300(-84550726187700L);
        f5434 = new C1562();
        f5436 = HookEntry.f968;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3265(C1562 c1562, XC_LoadPackage.LoadPackageParam loadPackageParam, int i) {
        Object c2585;
        Object c2586;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        int i2;
        C1538 c1538;
        String str;
        boolean z = (i & 1) == 0;
        C2310 c2310M5355 = null;
        XC_LoadPackage.LoadPackageParam loadPackageParam2 = (i & 2) != 0 ? null : loadPackageParam;
        
        String[] strArr = AbstractC1574.f5469;
        boolean z2 = f5435;
        Object c2587 = Unit.INSTANCE;
        if (!z2) {
            try {
                
                AbstractC1270.f4644 = "WAuxiliary";
                AbstractC2205.f7173 = false;
                if (!C3692.f11602 && C3692.f11607 != null) {
                    C3678.m5308(4, "You cannot load a hooker in \"onInit\" or \"onXposedEvent\" method! Aborted", null);
                    return;
                }
                C1538 c1539 = new C1538(23);
                boolean z3 = C3692.f11601;
                if (C3692.m5357()) {
                    C3692.f11607 = c1539;
                } else {
                    C3678.m5308(2, "Could not found any available Hook APIs in current environment! Aborted", null);
                }
                C3692.f11602 = true;
                c2585 = c2587;
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    C3678.m5308(4, "YukiHookAPI try to load hook entry class failed", thM4594);
                }
            } catch (Throwable th) {
                c2585 = new C2585(th);
            }
        }
        int i3 = (z || loadPackageParam2 == null) ? 1 : 2;
        String str2 = (loadPackageParam2 == null || (str = loadPackageParam2.packageName) == null) ? null : str;
        String str3 = loadPackageParam2 != null ? loadPackageParam2.processName : null;
        if (loadPackageParam2 == null || (classLoader = loadPackageParam2.classLoader) == null) {
            try {
                c2586 = XposedBridge.BOOTCLASSLOADER;
            } catch (Throwable th2) {
                c2586 = new C2585(th2);
            }
            if (c2586 instanceof C2585) {
                c2586 = null;
            }
            classLoader = (ClassLoader) c2586;
        }
        ClassLoader classLoader3 = classLoader;
        ApplicationInfo applicationInfo = loadPackageParam2 != null ? loadPackageParam2.appInfo : null;
        boolean z4 = C3692.f11601;
        if ((AbstractC2207.m4087(str2, "com.miui.contentcatcher") || AbstractC2207.m4087(str2, "com.miui.catcherpatch")) && (classLoader2 = C3692.class.getClassLoader()) != null && AbstractC0710.m2134(classLoader2, "android.miui.R")) {
            return;
        }
        int iM4759 = AbstractC2784.m4759(i3);
        if (iM4759 != 0) {
            if (iM4759 != 1) {
                if (iM4759 != 2) {
                    throw new C0761();
                }
                if (!C3692.m5356(3, str2)) {
                    
                    if (AbstractC2207.m4087(str2, C0251.m1338())) {
                        c2310M5355 = C3692.m5355(3, str2, null, null, null, null, 28);
                    }
                }
            } else if (!C3692.m5356(2, str2)) {
                c2310M5355 = C3692.m5355(2, str2, str3, classLoader3, applicationInfo, null, 32);
            }
            i2 = 1;
        } else {
            i2 = 1;
            c2310M5355 = C3692.m5355(1, "android", "android", classLoader3, null, null, 48);
        }
        if (c2310M5355 != null) {
            try {
                int i4 = c2310M5355.f7438;
                if ((i4 == 1 || (true && (c2310M5355.f7441 instanceof PathClassLoader))) && (c1538 = C3692.f11607) != null) {
                    LinkedHashMap linkedHashMap = C3692.f11604;
                    String str4 = "android-zygote";
                    C2309 c2309 = (C2309) linkedHashMap.get(i4 == 1 ? "android-zygote" : c2310M5355.f7439);
                    if (c2309 == null) {
                        c2309 = new C2309();
                        if (c2310M5355.f7438 != 1) {
                            str4 = c2310M5355.f7439;
                        }
                        linkedHashMap.put(str4, c2309);
                    }
                    c2309.f7437 = c2310M5355;
                    c1538.invoke(c2309);
                }
                if (c2310M5355.f7438 != 1 && c2310M5355.f7439.equals(C3692.f11608)) {
                    C0251 c0251 = C0251.f1415;
                    ClassLoader classLoader4 = c2310M5355.f7441;
                    int i5 = c2310M5355.f7438;
                    
                    C0251.m1339(classLoader4, i5);
                }
                if (c2310M5355.f7438 == 2) {
                    C0251.f1415.m1340(c2310M5355.f7439);
                }
            } catch (Throwable th3) {
                c2587 = new C2585(th3);
            }
            Throwable thM4595 = C2586.m4594(c2587);
            if (thM4595 != null) {
                C3678.m5308(4, "An exception occurred in the Hooking Process of YukiHookAPI", thM4595);
            }
        }
    }
}
