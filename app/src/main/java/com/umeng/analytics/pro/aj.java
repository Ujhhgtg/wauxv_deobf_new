package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class aj implements ad {
    private int a;

    public aj(int i) {
        this.a = i;
    }

    @Override // com.umeng.analytics.pro.ad
    public boolean a() {
        long j = 0;
        try {
            SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                j = sharedPreferencesA.getLong("cl_count", 0L);
                if (j >= this.a) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        UMRTLog.i("MobclickRT", "launch times skipped. times: " + j + " ; config: " + this.a);
        return false;
    }

    @Override // com.umeng.analytics.pro.ad
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ad
    public long c() {
        return 0L;
    }
}
