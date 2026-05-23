package com.umeng.analytics.vshelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.r;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class b implements cf {
    private static final String a = "RealTimeDebugSwitch";
    private static volatile int b;

    @Override // com.umeng.analytics.pro.cf
    public void a() {
    }

    @Override // com.umeng.analytics.pro.cf
    public void b() {
    }

    @Override // com.umeng.analytics.pro.cf
    public void c() {
    }

    @Override // com.umeng.analytics.pro.cf
    public void d(Activity activity) {
        b--;
    }

    public static boolean d() {
        return b > 0;
    }

    @Override // com.umeng.analytics.pro.cf
    public void a(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.cf
    public void b(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.cf
    public void c(Activity activity) {
        b++;
    }

    @Override // com.umeng.analytics.pro.cf
    public void a(Activity activity, Bundle bundle) {
        long jLongValue;
        if (b == 0) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    String scheme = data.getScheme();
                    if (scheme != null && scheme.startsWith("um.")) {
                        String queryParameter = data.getQueryParameter("debugkey");
                        String queryParameter2 = data.getQueryParameter("sendaging");
                        if (TextUtils.isEmpty(queryParameter)) {
                            return;
                        }
                        if (TextUtils.isEmpty(queryParameter2)) {
                            jLongValue = 0;
                        } else {
                            try {
                                jLongValue = Long.valueOf(queryParameter2).longValue();
                            } catch (Throwable unused) {
                                jLongValue = 0;
                            }
                        }
                        HashMap map = new HashMap();
                        map.put("debugkey", queryParameter);
                        if (jLongValue < 0) {
                            if (AnalyticsConfig.isRealTimeDebugMode()) {
                                UMRTLog.i("MobclickRT", "--->>> call turnOffRealTimeDebug because sendaging < 0");
                                AnalyticsConfig.turnOffRealTimeDebug();
                                Context applicationContext = activity.getApplicationContext();
                                UMWorkDispatch.sendEvent(applicationContext, 8215, CoreProtocol.getInstance(applicationContext), null);
                                return;
                            }
                            UMRTLog.i("MobclickRT", "--->>> Not currently in RealTimeDebug mode and doing nothing.");
                            return;
                        }
                        if (jLongValue > 0) {
                            AnalyticsConfig.turnOnRealTimeDebug(map);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("startTime", System.currentTimeMillis());
                                if (jLongValue < 60) {
                                    jLongValue = 60;
                                }
                                if (jLongValue > 240) {
                                    jLongValue = 240;
                                }
                                jSONObject.put("period", jLongValue);
                                jSONObject.put("debugkey", queryParameter);
                            } catch (Throwable unused2) {
                            }
                            Context applicationContext2 = activity.getApplicationContext();
                            UMWorkDispatch.sendEvent(applicationContext2, 8214, CoreProtocol.getInstance(applicationContext2), jSONObject);
                            UMRTLog.i("MobclickRT", "--->>> turnOnRealTimeDebug[persistent] dk: " + queryParameter + "; period: " + jLongValue);
                            return;
                        }
                        AnalyticsConfig.turnOnRealTimeDebug(map);
                        Context applicationContext3 = activity.getApplicationContext();
                        UMWorkDispatch.sendEvent(applicationContext3, 8215, CoreProtocol.getInstance(applicationContext3), null);
                        UMRTLog.i("MobclickRT", "--->>> turnOnRealTimeDebug[non-persistent] dk: " + queryParameter);
                        return;
                    }
                    UMRTLog.i("MobclickRT", "--->>> scheme: " + scheme);
                    return;
                }
                UMRTLog.i("MobclickRT", "--->>> uri: null");
                return;
            }
            UMRTLog.i("MobclickRT", "--->>> intent: null");
        }
    }

    @Override // com.umeng.analytics.pro.cf
    public void b(Activity activity, Bundle bundle) {
    }

    @Override // com.umeng.analytics.pro.cf
    public void e(Activity activity) {
    }
}
