package com.umeng.analytics.pro;

import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cy implements Runnable {
    public static final String a = "https://ulogs.umeng.com/push_cloud_activation";
    public static final String b = "https://preulogs.umeng.com/push_cloud_activation";
    private String c;
    private String d;

    public cy(String str, JSONObject jSONObject) {
        this.c = str;
        this.d = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] bArrA = aq.a(this.c, this.d);
            if (bArrA != null) {
                JSONObject jSONObject2 = new JSONObject(new String(bArrA));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("config", jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused2) {
        }
        cm.a(UMGlobalContext.getAppContext(), 102, cn.a(), jSONObject);
    }
}
