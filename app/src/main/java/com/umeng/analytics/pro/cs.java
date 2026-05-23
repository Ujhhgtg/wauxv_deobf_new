package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cs implements cp {
    private final String a;
    private final long b;

    public cs(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean a() {
        SharedPreferences sharedPreferencesA;
        try {
            Context appContext = UMGlobalContext.getAppContext();
            if (appContext == null || this.a == null || (sharedPreferencesA = cz.a(appContext)) == null) {
                return false;
            }
            long j = sharedPreferencesA.getLong("interval_" + HelperUtils.getMD5(this.a), 0L);
            if (j == 0 || (System.currentTimeMillis() - j) / 1000 >= this.b) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.cp
    public long c() {
        return 0L;
    }

    public void d() {
        SharedPreferences sharedPreferencesA;
        try {
            Context appContext = UMGlobalContext.getAppContext();
            if (appContext != null && this.a != null && (sharedPreferencesA = cz.a(appContext)) != null) {
                sharedPreferencesA.edit().putLong("interval_" + HelperUtils.getMD5(this.a), System.currentTimeMillis()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
