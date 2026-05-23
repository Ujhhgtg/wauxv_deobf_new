package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.pro.ba;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bb implements ba.a {

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final bb a = new bb();

        private a() {
        }
    }

    public static bb a() {
        return a.a;
    }

    @Override // com.umeng.analytics.pro.ba.a
    public void a(Object obj, int i) {
        JSONObject jSONObjectA;
        if (i != 101) {
            UMRTLog.i("MobclickRT", "[CkHandler]: unknown event type!");
            return;
        }
        UMRTLog.i("MobclickRT", "[CkHandler]:recv CkDispatch.CHECK event!");
        Context appContext = UMGlobalContext.getAppContext();
        if (!UMConfigure.getInitStatus() || appContext == null || UMConfigure.needSendZcfgEnv(appContext) || com.umeng.commonsdk.utils.c.a() || FieldManager.allow("ekv_smart_check") || SdkVersion.SDK_TYPE == 1 || !(obj instanceof bc)) {
            return;
        }
        try {
            JSONObject jSONObjectG = ((bc) obj).g();
            if (!jSONObjectG.has("eID") || (jSONObjectA = bd.a(appContext)) == null) {
                return;
            }
            bd.a(jSONObjectA, jSONObjectG);
            aw.a(new ar("https://cnlogs.umeng.com/uapp_ekverr_logs", jSONObjectA, "appkey"), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }
}
