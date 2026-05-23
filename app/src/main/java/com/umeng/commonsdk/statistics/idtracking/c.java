package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.be;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    public static final String a = be.b().b(be.l);
    public static final String b = "key_umeng_sp_honor_oaid";
    private static final String c = "honor_oaid";
    private Context d;

    public c(Context context) {
        super(c);
        this.d = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** HonorOaidTracker.getId(): oaid开关已关闭。");
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = this.d.getSharedPreferences(a, 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(b, "");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
