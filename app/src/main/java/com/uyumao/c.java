package com.uyumao;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a = false;
    public static h b;

    public static JSONObject a(Context context, i iVar, JSONArray jSONArray) {
        JSONObject jSONObject;
        String strValueOf;
        String strValueOf2 = "";
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("ak", UMUtils.getAppkey(context));
                if (UMUtils.getUMId(context) == null) {
                    jSONObject.put("umid", "");
                } else {
                    jSONObject.put("umid", UMUtils.getUMId(context));
                }
                if (UMUtils.getActiveUser(context) == null || UMUtils.getActiveUser(context).length != 2) {
                    jSONObject.put("puid", "");
                } else {
                    jSONObject.put("puid", UMUtils.getActiveUser(context)[1]);
                }
                if (DeviceConfig.getAndroidId(context) == null) {
                    jSONObject.put("aid", "");
                } else {
                    jSONObject.put("aid", DeviceConfig.getAndroidId(context));
                }
                if (UMUtils.getZid(context) == null) {
                    jSONObject.put("atoken", "");
                } else {
                    jSONObject.put("atoken", UMUtils.getZid(context));
                }
                jSONObject.put("oaid", DeviceConfig.getOaid(context));
                jSONObject.put("idfa", DeviceConfig.getIdfa(context));
                jSONObject.put("db", Build.BRAND);
                jSONObject.put("dm", Build.MODEL);
                jSONObject.put("os", "Android");
                jSONObject.put("ov", Build.VERSION.RELEASE);
                jSONObject.put("sv", "1.1.4");
                jSONObject.put("av", DeviceConfig.getAppVersionName(context));
                jSONObject.put("chn", UMUtils.getChannel(context));
                jSONObject.put("cts", System.currentTimeMillis());
                jSONObject.put("pkg", DeviceConfig.getPackageName(context));
                String string = context.getSharedPreferences("uyumao_info", 0).getString("imp", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("imp", string);
                }
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iVar != null) {
                jSONObject2.put("le", iVar.a);
                jSONObject2.put("vo", iVar.b);
                jSONObject2.put("te", iVar.c);
                jSONObject2.put("st", iVar.d);
                jSONObject2.put("ch", iVar.e);
                jSONObject2.put("ts", iVar.f);
            }
            JSONObject jSONObject3 = new JSONObject();
            if (context == null) {
                strValueOf = "";
            } else {
                try {
                    strValueOf = String.valueOf(context.getResources().getConfiguration().mcc);
                } catch (Throwable unused) {
                    strValueOf = "";
                }
            }
            jSONObject3.put("mcc", strValueOf);
            if (context != null) {
                try {
                    int i = context.getResources().getConfiguration().mnc;
                    strValueOf2 = i < 10 ? String.format("%02d", Integer.valueOf(i)) : String.valueOf(i);
                } catch (Throwable unused2) {
                }
            }
            jSONObject3.put("mnc", strValueOf2);
            jSONObject3.put("net", e.c(context)[0]);
            jSONObject3.put("battery", jSONObject2);
            if (jSONArray != null && jSONArray.length() != 0) {
                jSONObject3.put("net_state", jSONArray);
            }
            jSONObject.put("anti", jSONObject3);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(Context context, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            Log.e("UYMInnerManager", "JSONObject in sendInitData() is null.");
            return;
        }
        String strA = k.a(context, "https://yumao.puata.info/anti_logs", jSONObject.toString());
        Log.d("UYMInnerManager", "msg: " + strA + "; json: " + jSONObject);
        if (strA == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strA);
            if (jSONObject2.has("imp")) {
                context.getSharedPreferences("uyumao_info", 0).edit().putString("imp", jSONObject2.optString("imp")).apply();
            }
            if (z) {
                if (jSONObject2.has("resp_code") && jSONObject2.optInt("resp_code") == 0) {
                    context.getSharedPreferences("uyumao_info", 0).edit().putBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), true).apply();
                }
                e.a(new File(context.getCacheDir() + File.separator + "net_change"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
