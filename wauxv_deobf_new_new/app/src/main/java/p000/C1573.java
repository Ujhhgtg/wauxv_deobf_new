package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.HookEntry;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1573 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1573 f5464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean f5465;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final HookEntry f5466;

    static {
        AbstractC1471.m3394(-85680302586499L);
        f5464 = new C1573();
        f5466 = HookEntry.f1034;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3446(C1573 c1573, XC_LoadPackage.LoadPackageParam loadPackageParam, int i) {
        Object c2641;
        Object c2642;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        int i2;
        C1559 c1559;
        String str;
        boolean z = (i & 1) == 0;
        C2343 c2343M5363 = null;
        XC_LoadPackage.LoadPackageParam loadPackageParam2 = (i & 2) != 0 ? null : loadPackageParam;
        c1573.getClass();
        String[] strArr = AbstractC1471.f5234;
        boolean z2 = f5465;
        Object c2643 = C3554.UNIT;
        if (!z2) {
            try {
                f5466.getClass();
                AbstractC0738.f2835 = "WAuxiliary";
                AbstractC2240.f7305 = false;
                if (!C3755.f11759 && C3755.f11764 != null) {
                    C3741.m5317(4, "You cannot load a hooker in \"onInit\" or \"onXposedEvent\" method! Aborted", null);
                    return;
                }
                C1559 c15510 = new C1559(9);
                boolean z3 = C3755.f11758;
                if (C3755.m5365()) {
                    C3755.f11764 = c15510;
                } else {
                    C3741.m5317(2, "Could not found any available Hook APIs in current environment! Aborted", null);
                }
                C3755.f11759 = true;
                c2641 = c2643;
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    C3741.m5317(4, "YukiHookAPI try to load hook entry class failed", thM4616);
                }
            } catch (Throwable th) {
                c2641 = new C2641(th);
            }
        }
        int i3 = (z || loadPackageParam2 == null) ? 1 : 2;
        String str2 = (loadPackageParam2 == null || (str = loadPackageParam2.packageName) == null) ? null : str;
        String str3 = loadPackageParam2 != null ? loadPackageParam2.processName : null;
        if (loadPackageParam2 == null || (classLoader = loadPackageParam2.classLoader) == null) {
            try {
                c2642 = XposedBridge.BOOTCLASSLOADER;
            } catch (Throwable th2) {
                c2642 = new C2641(th2);
            }
            if (c2642 instanceof C2641) {
                c2642 = null;
            }
            classLoader = (ClassLoader) c2642;
        }
        ClassLoader classLoader3 = classLoader;
        ApplicationInfo applicationInfo = loadPackageParam2 != null ? loadPackageParam2.appInfo : null;
        boolean z4 = C3755.f11758;
        if ((AbstractC1469.m3322(str2, "com.miui.contentcatcher") || AbstractC1469.m3322(str2, "com.miui.catcherpatch")) && (classLoader2 = C3755.class.getClassLoader()) != null && AbstractC0705.m2227(classLoader2, "android.miui.R")) {
            return;
        }
        int iM4792 = AbstractC2844.m4792(i3);
        if (iM4792 != 0) {
            if (iM4792 != 1) {
                if (iM4792 != 2) {
                    throw new C0758();
                }
                if (!C3755.m5364(3, str2)) {
                    C0261.f1489.getClass();
                    if (AbstractC1469.m3322(str2, C0261.m1484())) {
                        c2343M5363 = C3755.m5363(3, str2, null, null, null, null, 28);
                    }
                }
            } else if (!C3755.m5364(2, str2)) {
                c2343M5363 = C3755.m5363(2, str2, str3, classLoader3, applicationInfo, null, 32);
            }
            i2 = 1;
        } else {
            i2 = 1;
            c2343M5363 = C3755.m5363(1, "android", "android", classLoader3, null, null, 48);
        }
        if (c2343M5363 != null) {
            try {
                int i4 = c2343M5363.f7560;
                if ((i4 == i2 || (i4 != i2 && (c2343M5363.f7563 instanceof PathClassLoader))) && (c1559 = C3755.f11764) != null) {
                    LinkedHashMap linkedHashMap = C3755.f11761;
                    String str4 = "android-zygote";
                    C2342 c2342 = (C2342) linkedHashMap.get(i4 == 1 ? "android-zygote" : c2343M5363.f7561);
                    if (c2342 == null) {
                        c2342 = new C2342();
                        if (c2343M5363.f7560 != 1) {
                            str4 = c2343M5363.f7561;
                        }
                        linkedHashMap.put(str4, c2342);
                    }
                    c2342.f7559 = c2343M5363;
                    c1559.invoke(c2342);
                }
                if (c2343M5363.f7560 != i2 && c2343M5363.f7561.equals(C3755.f11765)) {
                    C0261 c0261 = C0261.f1489;
                    ClassLoader classLoader4 = c2343M5363.f7563;
                    int i5 = c2343M5363.f7560;
                    c0261.getClass();
                    C0261.m1485(classLoader4, i5);
                }
                if (c2343M5363.f7560 == 2) {
                    C0261.f1489.m1486(c2343M5363.f7561);
                }
            } catch (Throwable th3) {
                c2643 = new C2641(th3);
            }
            Throwable thM4617 = C2642.m4616(c2643);
            if (thM4617 != null) {
                C3741.m5317(4, "An exception occurred in the Hooking Process of YukiHookAPI", thM4617);
            }
        }
    }
}
