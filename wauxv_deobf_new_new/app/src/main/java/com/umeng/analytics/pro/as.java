package com.umeng.analytics.pro;

import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class as implements Runnable {
    public static final String a = "https://ucc.umeng.com/v2/inn/fetch";
    private String b;
    private String c;
    private String d;

    public as(String str, JSONObject jSONObject, String str2) {
        this.b = str;
        this.c = jSONObject.toString();
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] bArrA = aq.a(this.b, this.c);
            if (bArrA != null) {
                JSONObject jSONObject2 = new JSONObject(new String(bArrA));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sourceIucc", this.d);
                    jSONObject3.put("config", jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused2) {
        }
        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 102, com.umeng.ccg.d.a(), jSONObject);
    }
}
