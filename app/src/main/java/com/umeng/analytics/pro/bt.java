package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bt {
    private static final String a = "ro.build.version.emui";
    private static final String b = "hw_sc.build.platform.version";
    private static final String c = "ro.build.freeme.label";
    private static final String d = "ro.build.freemeos_label";
    private static final String e = "FreemeOS";

    public static boolean a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return !TextUtils.isEmpty((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.flyme.version", ""));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return d() && !h();
    }

    public static boolean c() {
        return d() && h();
    }

    public static boolean d() {
        return Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    public static boolean e() {
        String str = Build.BRAND;
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            String strA = a(a);
            String strA2 = a(b);
            if (TextUtils.isEmpty(strA) && TextUtils.isEmpty(strA2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f() {
        return !TextUtils.isEmpty(a("ro.coolos.version"));
    }

    public static boolean g() {
        String strA = a(c);
        String strA2 = a(d);
        if (strA == null || !strA.equalsIgnoreCase(e)) {
            return strA2 != null && strA2.equalsIgnoreCase(e);
        }
        return true;
    }

    private static boolean h() {
        return !TextUtils.isEmpty(a(a));
    }

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
