package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.HookEntry;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛲ要点脸ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0582Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0582Ujhhgtgfeyxiexzf f2614Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean f2615Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final HookEntry f2616Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928230575635957130L);
        f2614Ujhhgtgfeyxiexzf = new C0582Ujhhgtgfeyxiexzf();
        f2616Ujhhgtgfeyxiexzf = HookEntry.f1048Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1861Ujhhgtgfeyxiexzf(C0582Ujhhgtgfeyxiexzf c0582Ujhhgtgfeyxiexzf, XC_LoadPackage.LoadPackageParam loadPackageParam, int i) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        int i2;
        C0561Ujhhgtgfeyxiexzf c0561Ujhhgtgfeyxiexzf;
        String str;
        boolean z = (i & 1) == 0;
        C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf = null;
        XC_LoadPackage.LoadPackageParam loadPackageParam2 = (i & 2) != 0 ? null : loadPackageParam;
        c0582Ujhhgtgfeyxiexzf.getClass();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        boolean z2 = f2615Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg3 = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        if (!z2) {
            try {
                f2616Ujhhgtgfeyxiexzf.getClass();
                AbstractC1937feyxiexzfUjhhgtg.f6409Ujhhgtgfeyxiexzf = MagicFactory.get(4928227363000419722L, strArr);
                AbstractC3594Ujhhgtgfeyxiexzf.f11192Ujhhgtgfeyxiexzf = false;
                if (!C2283feyxiexzfUjhhgtg.f7479Ujhhgtgfeyxiexzf && C2283feyxiexzfUjhhgtg.f7484Ujhhgtgfeyxiexzf != null) {
                    C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, MagicFactory.get(4928227556273948042L, strArr), null);
                    return;
                }
                C0561Ujhhgtgfeyxiexzf c0561Ujhhgtgfeyxiexzf2 = new C0561Ujhhgtgfeyxiexzf(11);
                boolean z3 = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
                if (C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf()) {
                    C2283feyxiexzfUjhhgtg.f7484Ujhhgtgfeyxiexzf = c0561Ujhhgtgfeyxiexzf2;
                } else {
                    C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(2, "Could not found any available Hook APIs in current environment! Aborted", null);
                }
                C2283feyxiexzfUjhhgtg.f7479Ujhhgtgfeyxiexzf = true;
                c0919feyxiexzfUjhhgtg = c0919feyxiexzfUjhhgtg3;
                Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                if (thM2409Ujhhgtgfeyxiexzf != null) {
                    C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, MagicFactory.get(4928226697280488842L, strArr), thM2409Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
        }
        int i3 = (z || loadPackageParam2 == null) ? 1 : 2;
        String str2 = (loadPackageParam2 == null || (str = loadPackageParam2.packageName) == null) ? null : str;
        String str3 = loadPackageParam2 != null ? loadPackageParam2.processName : null;
        if (loadPackageParam2 == null || (classLoader = loadPackageParam2.classLoader) == null) {
            try {
                c0919feyxiexzfUjhhgtg2 = XposedBridge.BOOTCLASSLOADER;
            } catch (Throwable th2) {
                c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
            }
            if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                c0919feyxiexzfUjhhgtg2 = null;
            }
            classLoader = (ClassLoader) c0919feyxiexzfUjhhgtg2;
        }
        ClassLoader classLoader3 = classLoader;
        ApplicationInfo applicationInfo = loadPackageParam2 != null ? loadPackageParam2.appInfo : null;
        boolean z4 = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
        if ((C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str2, "com.miui.contentcatcher") || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str2, "com.miui.catcherpatch")) && (classLoader2 = C2283feyxiexzfUjhhgtg.class.getClassLoader()) != null && AbstractC2842feyxiexzfUjhhgtg.m4171Ujhhgtgfeyxiexzf(classLoader2, "android.miui.R")) {
            return;
        }
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i3);
        if (iM2713feyxiexzfUjhhgtg != 0) {
            if (iM2713feyxiexzfUjhhgtg != 1) {
                if (iM2713feyxiexzfUjhhgtg != 2) {
                    throw new C2870Ujhhgtgfeyxiexzf();
                }
                if (!C2283feyxiexzfUjhhgtg.m3479Ujhhgtgfeyxiexzf(3, str2)) {
                    C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str2, C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf())) {
                        c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.m3478Ujhhgtgfeyxiexzf(3, str2, null, null, null, null, 28);
                    }
                }
            } else if (!C2283feyxiexzfUjhhgtg.m3479Ujhhgtgfeyxiexzf(2, str2)) {
                c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.m3478Ujhhgtgfeyxiexzf(2, str2, str3, classLoader3, applicationInfo, null, 32);
            }
            i2 = 1;
        } else {
            i2 = 1;
            c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.m3478Ujhhgtgfeyxiexzf(1, "android", "android", classLoader3, null, null, 48);
        }
        if (c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf != null) {
            try {
                int i4 = c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5129Ujhhgtgfeyxiexzf;
                if ((i4 == i2 || (i4 != i2 && (c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5132Ujhhgtgfeyxiexzf instanceof PathClassLoader))) && (c0561Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.f7484Ujhhgtgfeyxiexzf) != null) {
                    LinkedHashMap linkedHashMap = C2283feyxiexzfUjhhgtg.f7481Ujhhgtgfeyxiexzf;
                    String str4 = "android-zygote";
                    C1477feyxiexzfUjhhgtg c1477feyxiexzfUjhhgtg = (C1477feyxiexzfUjhhgtg) linkedHashMap.get(i4 == 1 ? "android-zygote" : c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5130Ujhhgtgfeyxiexzf);
                    if (c1477feyxiexzfUjhhgtg == null) {
                        c1477feyxiexzfUjhhgtg = new C1477feyxiexzfUjhhgtg();
                        if (c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5129Ujhhgtgfeyxiexzf != 1) {
                            str4 = c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5130Ujhhgtgfeyxiexzf;
                        }
                        linkedHashMap.put(str4, c1477feyxiexzfUjhhgtg);
                    }
                    c1477feyxiexzfUjhhgtg.f5128Ujhhgtgfeyxiexzf = c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf;
                    c0561Ujhhgtgfeyxiexzf.invoke(c1477feyxiexzfUjhhgtg);
                }
                if (c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5129Ujhhgtgfeyxiexzf != i2 && c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5130Ujhhgtgfeyxiexzf.equals(C2283feyxiexzfUjhhgtg.f7485Ujhhgtgfeyxiexzf)) {
                    C2374Ujhhgtgfeyxiexzf c2374Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf;
                    ClassLoader classLoader4 = c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5132Ujhhgtgfeyxiexzf;
                    int i5 = c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5129Ujhhgtgfeyxiexzf;
                    c2374Ujhhgtgfeyxiexzf.getClass();
                    C2374Ujhhgtgfeyxiexzf.m3618Ujhhgtgfeyxiexzf(classLoader4, i5);
                }
                if (c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5129Ujhhgtgfeyxiexzf == 2) {
                    C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.m3619Ujhhgtgfeyxiexzf(c1478feyxiexzfUjhhgtgM3478Ujhhgtgfeyxiexzf.f5130Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th3) {
                c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
            }
            Throwable thM2409Ujhhgtgfeyxiexzf2 = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg3);
            if (thM2409Ujhhgtgfeyxiexzf2 != null) {
                C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "An exception occurred in the Hooking Process of YukiHookAPI", thM2409Ujhhgtgfeyxiexzf2);
            }
        }
    }
}
