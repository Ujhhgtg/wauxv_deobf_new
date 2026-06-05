package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.be;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class i extends a {
    public static final String a = be.b().b(be.l);
    public static final String b = "key_umeng_sp_oaid";
    public static final String c = "key_umeng_sp_oaid_required_time";
    private static final String d = "oaid";
    private Context e;

    public i(Context context) {
        super(d);
        this.e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** OaidTracking.getId(): oaid开关已关闭。");
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = this.e.getSharedPreferences(a, 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(b, "");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
