package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cz {
    public static final String a = "cl_count";
    public static final String b = "interval_";
    public static final String c = "config_ts";
    private static final String d = "ncc_sp_config_file";

    private cz() {
    }

    public static SharedPreferences a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(d, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferencesA;
        if (context == null || (sharedPreferencesA = a(context)) == null) {
            return;
        }
        sharedPreferencesA.edit().putInt("cl_count", sharedPreferencesA.getInt("cl_count", 0) + 1).apply();
    }

    public static int c(Context context) {
        SharedPreferences sharedPreferencesA;
        if (context == null || (sharedPreferencesA = a(context)) == null) {
            return 0;
        }
        return sharedPreferencesA.getInt("cl_count", 0);
    }
}
