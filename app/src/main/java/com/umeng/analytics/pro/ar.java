package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ar implements Runnable {
    public static final String a = "https://aspect-upush.umeng.com/occa/v1/event/report";
    public static final String b = "https://cnlogs.umeng.com/ext_event";
    public static final String c = "https://cnlogs.umeng.com/uapp_ekverr_logs";
    public static final String d = "https://cnlogs.umeng.com/common_inout_logs";
    private String e;
    private String f;
    private String g;

    public ar(String str, JSONObject jSONObject) {
        this.g = null;
        this.e = str;
        this.f = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(this.f)) {
                return;
            }
            aq.a(this.e, this.f.getBytes(), this.g);
        } catch (Throwable unused) {
        }
    }

    public ar(String str, JSONObject jSONObject, String str2) {
        this.g = null;
        this.e = str;
        this.f = jSONObject.toString();
        this.g = str2;
    }
}
