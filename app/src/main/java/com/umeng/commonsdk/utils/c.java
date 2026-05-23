package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.be;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c {
    private static final String b = "lastReqTime";
    private static final int c = 48;
    private static final int d = 1;
    private static final int e = 720;
    private static final String f = "iss";
    private static final String g = "sinr";
    private static final String h = "clean";
    private static boolean i;
    private static int j;
    private static final String a = be.b().b("sli");
    private static Object k = new Object();

    static {
        i = false;
        j = 720;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(appContext, "iss", "");
            if (TextUtils.isEmpty(strImprintProperty) || !"1".equals(strImprintProperty)) {
                return;
            }
            synchronized (k) {
                i = true;
            }
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(appContext, "sinr", "");
            if (TextUtils.isEmpty("1")) {
                j = 48;
                return;
            }
            try {
                j = a(Integer.parseInt(strImprintProperty2));
            } catch (Throwable unused) {
                j = 48;
            }
        }
    }

    private static int a(int i2) {
        if (i2 > 720) {
            return 720;
        }
        if (i2 < 1) {
            return 1;
        }
        return i2;
    }

    public static long b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("lastReqTime", 0L);
        }
        return 0L;
    }

    public static void c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("clean", true).commit();
        }
    }

    public static void d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("clean", false).commit();
        }
    }

    public static boolean e(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("clean", false);
        }
        return false;
    }

    public static boolean a() {
        boolean z;
        synchronized (k) {
            z = i;
        }
        return z;
    }

    public static int a(Context context) {
        int i2;
        synchronized (k) {
            i2 = j;
        }
        return i2;
    }

    public static boolean a(long j2, long j3, int i2) {
        Date date = new Date(j3);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j2));
        calendar.add(10, i2);
        return date.after(calendar.getTime());
    }

    public static void a(Context context, long j2) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastReqTime", j2).commit();
        }
    }
}
