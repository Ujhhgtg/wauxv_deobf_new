package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class aa implements z {
    private long a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.z
    public void a(long j) {
        this.a = j;
    }

    @Override // com.umeng.analytics.pro.z
    public long a() {
        return this.a;
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(jCurrentTimeMillis + appkey + "02:00:00:00:00:00");
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.z
    public boolean a(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j == 0 || jCurrentTimeMillis - j >= this.a) && j2 > 0 && jCurrentTimeMillis - j2 > this.a;
    }

    @Override // com.umeng.analytics.pro.z
    public void a(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong("session_end_time", 0L);
            editorEdit.putLong("a_start_time", jCurrentTimeMillis);
            editorEdit.putLong("a_end_time", 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
