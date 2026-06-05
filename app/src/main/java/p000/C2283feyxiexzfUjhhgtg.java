package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2283feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean f7478Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean f7479Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean f7480Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C0561Ujhhgtgfeyxiexzf f7484Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final LinkedHashMap f7481Ujhhgtgfeyxiexzf = new LinkedHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final LinkedHashSet f7482Ujhhgtgfeyxiexzf = new LinkedHashSet();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final LinkedHashMap f7483Ujhhgtgfeyxiexzf = new LinkedHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static String f7485Ujhhgtgfeyxiexzf = "";

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String f7486Ujhhgtgfeyxiexzf = "";

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C1478feyxiexzfUjhhgtg m3478Ujhhgtgfeyxiexzf(int i, String str, String str2, ClassLoader classLoader, ApplicationInfo applicationInfo, AbstractC0922feyxiexzfUjhhgtg abstractC0922feyxiexzfUjhhgtg, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            classLoader = null;
        }
        if ((i2 & 16) != 0) {
            applicationInfo = null;
        }
        f7480Ujhhgtgfeyxiexzf = i == 1;
        LinkedHashMap linkedHashMap = f7483Ujhhgtgfeyxiexzf;
        if (linkedHashMap.get(str) != null) {
            C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = (C1478feyxiexzfUjhhgtg) linkedHashMap.get(str);
            if (c1478feyxiexzfUjhhgtg != null) {
                c1478feyxiexzfUjhhgtg.f5129Ujhhgtgfeyxiexzf = i;
                if (str != null) {
                    if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
                        str = null;
                    }
                    if (str != null) {
                        c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf = str;
                    }
                }
                if (str2 != null) {
                    if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        c1478feyxiexzfUjhhgtg.f5131Ujhhgtgfeyxiexzf = str2;
                    }
                }
                if (classLoader != null) {
                    ClassLoader classLoader2 = (i == 1 || (classLoader instanceof PathClassLoader)) ? classLoader : null;
                    if (classLoader2 != null) {
                        c1478feyxiexzfUjhhgtg.f5132Ujhhgtgfeyxiexzf = classLoader2;
                    }
                }
                if (applicationInfo != null) {
                    c1478feyxiexzfUjhhgtg.f5133Ujhhgtgfeyxiexzf = applicationInfo;
                }
                return c1478feyxiexzfUjhhgtg;
            }
        } else if (i == 1 || classLoader != null) {
            String str3 = str == null ? "android" : str;
            if (str2 == null) {
                str2 = "android";
            }
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg2 = new C1478feyxiexzfUjhhgtg();
            c1478feyxiexzfUjhhgtg2.f5129Ujhhgtgfeyxiexzf = i;
            c1478feyxiexzfUjhhgtg2.f5130Ujhhgtgfeyxiexzf = str3;
            c1478feyxiexzfUjhhgtg2.f5131Ujhhgtgfeyxiexzf = str2;
            c1478feyxiexzfUjhhgtg2.f5132Ujhhgtgfeyxiexzf = classLoader;
            c1478feyxiexzfUjhhgtg2.f5133Ujhhgtgfeyxiexzf = applicationInfo;
            if (str == null) {
                str = "android";
            }
            linkedHashMap.put(str, c1478feyxiexzfUjhhgtg2);
            return c1478feyxiexzfUjhhgtg2;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean m3479Ujhhgtgfeyxiexzf(int i, String str) {
        if (str == null) {
            return false;
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, ":");
        sbM4805Ujhhgtgfeyxiexzf.append(AbstractC3317feyxiexzfUjhhgtg.m4811Ujhhgtgfeyxiexzf(i));
        String string = sbM4805Ujhhgtgfeyxiexzf.toString();
        LinkedHashSet linkedHashSet = f7482Ujhhgtgfeyxiexzf;
        if (linkedHashSet.contains(string)) {
            return true;
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf2 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, ":");
        sbM4805Ujhhgtgfeyxiexzf2.append(AbstractC3317feyxiexzfUjhhgtg.m4811Ujhhgtgfeyxiexzf(i));
        linkedHashSet.add(sbM4805Ujhhgtgfeyxiexzf2.toString());
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean m3480Ujhhgtgfeyxiexzf() {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        int i = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
        if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c0919feyxiexzfUjhhgtg = Boolean.TRUE;
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
            if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                c0919feyxiexzfUjhhgtg = null;
            }
            Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            i = 2;
        }
        return (i != 2) && f7478Ujhhgtgfeyxiexzf;
    }
}
