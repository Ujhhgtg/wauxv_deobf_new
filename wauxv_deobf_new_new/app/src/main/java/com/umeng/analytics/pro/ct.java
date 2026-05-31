package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.service.UMGlobalContext;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ct implements cp {
    private int a;

    public ct(int i) {
        this.a = i;
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean a() {
        SharedPreferences sharedPreferencesA;
        try {
            Context appContext = UMGlobalContext.getAppContext();
            return (appContext == null || (sharedPreferencesA = cz.a(appContext)) == null || sharedPreferencesA.getInt("cl_count", 0) < this.a) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.cp
    public long c() {
        return 0L;
    }
}
