package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛲᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2374Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean f7727Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final LinkedHashMap f7728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2366Ujhhgtgfeyxiexzf f7729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC0150Ujhhgtgfeyxiexzf[] f7726Ujhhgtgfeyxiexzf = {new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "ActivityThreadClass", "getActivityThreadClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "ContextImplClass", "getContextImplClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "ActivityManagerNativeClass", "getActivityManagerNativeClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "SingletonClass", "getSingletonClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "IActivityManagerClass", "getIActivityManagerClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "ActivityTaskManagerClass", "getActivityTaskManagerClass()Ljava/lang/Class;"), new C0863feyxiexzfUjhhgtg(C2374Ujhhgtgfeyxiexzf.class, "IActivityTaskManagerClass", "getIActivityTaskManagerClass()Ljava/lang/Class;")};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2374Ujhhgtgfeyxiexzf f7725Ujhhgtgfeyxiexzf = new C2374Ujhhgtgfeyxiexzf();

    static {
        new LinkedHashMap();
        f7728Ujhhgtgfeyxiexzf = new LinkedHashMap();
        f7729Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4172Ujhhgtgfeyxiexzf("android.app.ActivityThread", null, 6);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static ClassLoader m3615Ujhhgtgfeyxiexzf() {
        Class<C3052Ujhhgtgfeyxiexzf> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C3052Ujhhgtgfeyxiexzf.class));
        ClassLoader classLoader = (clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : C3052Ujhhgtgfeyxiexzf.class).getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new IllegalStateException("Operating system not supported");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Application m3616Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        try {
            c0919feyxiexzfUjhhgtg = AndroidAppHelper.currentApplication();
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        Application application = (Application) c0919feyxiexzfUjhhgtg;
        if (application != null) {
            return application;
        }
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = f7726Ujhhgtgfeyxiexzf[0];
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(f7729Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
        ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
        c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "currentApplication";
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
        if (c0393Ujhhgtgfeyxiexzf != null) {
            return (Application) c0393Ujhhgtgfeyxiexzf.m1650Ujhhgtgfeyxiexzf(new Object[0]);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m3617Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        String str;
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg;
        Object objM4938Ujhhgtgfeyxiexzf;
        C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2;
        try {
            c0919feyxiexzfUjhhgtg = AndroidAppHelper.currentApplicationInfo();
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        ApplicationInfo applicationInfo = null;
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        ApplicationInfo applicationInfo2 = (ApplicationInfo) c0919feyxiexzfUjhhgtg;
        if (applicationInfo2 == null) {
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            f7725Ujhhgtgfeyxiexzf.getClass();
            InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = f7726Ujhhgtgfeyxiexzf[0];
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(f7729Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
            c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "currentActivityThread";
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4862Ujhhgtgfeyxiexzf();
            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
            Object objM1649Ujhhgtgfeyxiexzf = c0393Ujhhgtgfeyxiexzf != null ? c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(new Object[0]) : null;
            if (objM1649Ujhhgtgfeyxiexzf != null) {
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1649Ujhhgtgfeyxiexzf);
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            } else {
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = null;
            }
            if (c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg != null) {
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "mBoundApplication";
                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf());
                if (c3438feyxiexzfUjhhgtg != null) {
                    objM4938Ujhhgtgfeyxiexzf = c3438feyxiexzfUjhhgtg.m4938Ujhhgtgfeyxiexzf();
                } else {
                    objM4938Ujhhgtgfeyxiexzf = null;
                }
            } else {
                objM4938Ujhhgtgfeyxiexzf = null;
            }
            if (objM4938Ujhhgtgfeyxiexzf != null) {
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf);
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2025Ujhhgtgfeyxiexzf(true);
            } else {
                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2 = null;
            }
            if (c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2 != null) {
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "appInfo";
                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg2 = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf());
                if (c3438feyxiexzfUjhhgtg2 != null) {
                    applicationInfo = (ApplicationInfo) c3438feyxiexzfUjhhgtg2.m4939Ujhhgtgfeyxiexzf();
                }
            }
            applicationInfo2 = applicationInfo;
        }
        return (applicationInfo2 == null || (str = applicationInfo2.packageName) == null) ? "android" : str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m3618Ujhhgtgfeyxiexzf(ClassLoader classLoader, int i) {
        Method method;
        String str = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv" instanceof C0919feyxiexzfUjhhgtg ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv";
        if (str == null) {
            str = "";
        }
        Class clsM4170Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4170Ujhhgtgfeyxiexzf(str, classLoader, 2);
        if (clsM4170Ujhhgtgfeyxiexzf != null) {
            int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(clsM4170Ujhhgtgfeyxiexzf);
            c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            if (i == 3) {
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "_--_";
                C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
                C2376Ujhhgtgfeyxiexzf c2376Ujhhgtgfeyxiexzf = new C2376Ujhhgtgfeyxiexzf(1, 1);
                if (c0393Ujhhgtgfeyxiexzf == null || (method = c0393Ujhhgtgfeyxiexzf.f2132Ujhhgtgfeyxiexzf) == null) {
                    return;
                }
                AbstractC0615Ujhhgtgfeyxiexzf.m1886Ujhhgtgfeyxiexzf(method, c2376Ujhhgtgfeyxiexzf);
                return;
            }
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "__--";
            AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf()), new C2376Ujhhgtgfeyxiexzf(1, 2));
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "_-_-";
            AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf()), new C2376Ujhhgtgfeyxiexzf(1, 3));
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "-__-";
            AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf()), new C2376Ujhhgtgfeyxiexzf(1, 4));
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "-_-_";
            AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.m1635Ujhhgtgfeyxiexzf()), new C2376Ujhhgtgfeyxiexzf(1, 5));
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "___-";
            AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.m1635Ujhhgtgfeyxiexzf()), new C2376Ujhhgtgfeyxiexzf(1, 0));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3619Ujhhgtgfeyxiexzf(String str) {
        Method method;
        try {
            LinkedHashMap linkedHashMap = f7728Ujhhgtgfeyxiexzf;
            int i = 1;
            if (!linkedHashMap.isEmpty()) {
                int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Application.class));
                c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "attach";
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class)}, 1));
                AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf()), new C2372Ujhhgtgfeyxiexzf(i, i));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "onTerminate";
                AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf()), new C2372Ujhhgtgfeyxiexzf(i, 2));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "onLowMemory";
                AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf()), new C2372Ujhhgtgfeyxiexzf(i, 3));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "onTrimMemory";
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE)}, 1));
                AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf()), new C2372Ujhhgtgfeyxiexzf(i, 4));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "onConfigurationChanged";
                AbstractC0615Ujhhgtgfeyxiexzf.m1885Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.m1635Ujhhgtgfeyxiexzf()), new C2372Ujhhgtgfeyxiexzf(i, 0));
            }
            if (AbstractC3594Ujhhgtgfeyxiexzf.f11192Ujhhgtgfeyxiexzf || !linkedHashMap.isEmpty()) {
                int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Instrumentation.class));
                c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg2.m2025Ujhhgtgfeyxiexzf(true);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6 = c0709UjhhgtgfeyxiexzfM5190feyxiexzfUjhhgtg2.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "callApplicationOnCreate";
                C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.m1635Ujhhgtgfeyxiexzf());
                C2371Ujhhgtgfeyxiexzf c2371Ujhhgtgfeyxiexzf = new C2371Ujhhgtgfeyxiexzf(this, str);
                if (c0393Ujhhgtgfeyxiexzf == null || (method = c0393Ujhhgtgfeyxiexzf.f2132Ujhhgtgfeyxiexzf) == null) {
                    return;
                }
                AbstractC0615Ujhhgtgfeyxiexzf.m1886Ujhhgtgfeyxiexzf(method, c2371Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable unused) {
        }
    }
}
