package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.AnalyticsConstants;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class au {
    private static String a = "";
    private static String b = "";
    private static final String c = "hw_sc.build.platform.version";
    private static final String d = "ro.build.version.emui";
    private static final String e = "ro.build.version.magic";
    private static final String f = "ro.miui.ui.version.name";
    private static final String g = "ro.build.version.opporom";
    private static final String h = "ro.vivo.os.name";
    private static final String i = "ro.vivo.os.version";
    private static final String j = "ro.build.version.oplusrom";
    private static final String k = "ro.rom.version";

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", null).invoke(cls, null));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(a)) {
            e(str);
        }
        return b;
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(" ", "").toUpperCase();
    }

    private static String d(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r5.equals("XIAOMI") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        if (r5.equals("REALME") != false) goto L46;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(String str) {
        try {
            String strC = c(str);
            switch (strC.hashCode()) {
                case -1881642058:
                    break;
                case -1706170181:
                    break;
                case -602397472:
                    if (strC.equals("ONEPLUS")) {
                        a = "HydrogenOS";
                        String strD = d("ro.rom.version");
                        if (TextUtils.isEmpty(strD)) {
                            a = "ColorOS";
                            strD = d("ro.build.version.oplusrom");
                        }
                        b = strD;
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                case 2432928:
                    if (strC.equals("OPPO")) {
                        a = "ColorOS";
                        b = d("ro.build.version.opporom");
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                case 2634924:
                    if (strC.equals("VIVO")) {
                        a = "Funtouch";
                        b = d("ro.vivo.os.version");
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                case 68924490:
                    if (strC.equals("HONOR")) {
                        if (!TextUtils.isEmpty(d("ro.build.version.magic"))) {
                            a = "MagicUI";
                            b = d("ro.build.version.magic");
                        } else {
                            a = "EMUI";
                            b = d("ro.build.version.emui");
                        }
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                case 77852109:
                    if (strC.equals("REDMI")) {
                        a = "MIUI";
                        b = d("ro.miui.ui.version.name");
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                case 2141820391:
                    if (strC.equals("HUAWEI")) {
                        if (!a()) {
                            a = "EMUI";
                            b = d("ro.build.version.emui");
                        } else {
                            b = d("hw_sc.build.platform.version");
                            a = "HarmonyOS";
                        }
                    }
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
                default:
                    a = "Android";
                    b = Build.VERSION.RELEASE;
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(a)) {
            e(str);
        }
        return a;
    }
}
