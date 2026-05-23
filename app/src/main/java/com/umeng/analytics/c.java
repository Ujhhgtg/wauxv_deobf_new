package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.g;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c {
    private static final int a = 20;
    private static final String b = "umeng_pcp";
    private static final String c = "mob";
    private static final String d = "em";
    private static final String e = "cp";
    private static final String f = "pk";
    private static final String g = "pv";
    private static String[] h = new String[2];
    private static Object i = new Object();
    private static Map<String, Object> j = new HashMap();

    public static void a(Context context, String str, String str2) {
        String[] strArr = h;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            com.umeng.common.b.a(context).a(str, str2);
        }
    }

    public static void b(Context context) {
        String[] strArr = h;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            com.umeng.common.b.a(context).b();
        }
    }

    public static Map<String, Object> c(Context context) throws JSONException {
        SharedPreferences sharedPreferences = context.getSharedPreferences("umeng_pcp", 0);
        String string = sharedPreferences.getString("cp", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            String str = new String(ay.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
            if (str.length() <= 0) {
                return null;
            }
            HashMap map = new HashMap();
            try {
                JSONArray jSONArray = (JSONArray) new JSONTokener(str).nextValue();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    map.put(jSONObject.getString("pk"), jSONObject.get("pv"));
                }
                sharedPreferences.edit().putString("cp", "").apply();
                return map;
            } catch (Throwable unused) {
                return map;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String[] a(Context context) {
        String[] strArrA;
        if (!TextUtils.isEmpty(h[0]) && !TextUtils.isEmpty(h[1])) {
            return h;
        }
        if (context == null || (strArrA = com.umeng.common.b.a(context).a()) == null) {
            return null;
        }
        String[] strArr = h;
        strArr[0] = strArrA[0];
        strArr[1] = strArrA[1];
        return strArr;
    }

    public static void b(String str) {
        String strEncodeToString;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("umeng_pcp", 0);
                byte[] bArrA = ay.a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                if (bArrA.length == 0) {
                    strEncodeToString = "pv".Q;
                } else {
                    strEncodeToString = Base64.encodeToString(bArrA, 0);
                }
                sharedPreferences.edit().putString("em", strEncodeToString).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        String strEncodeToString;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("umeng_pcp", 0);
                byte[] bArrA = ay.a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                if (bArrA.length == 0) {
                    strEncodeToString = "pv".Q;
                } else {
                    strEncodeToString = Base64.encodeToString(bArrA, 0);
                }
                sharedPreferences.edit().putString("mob", strEncodeToString).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("umeng_pcp", 0);
                String string = sharedPreferences.getString("em", "");
                if ("pv".Q.equals(string)) {
                    sharedPreferences.edit().putString("em", "").apply();
                    return "";
                }
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                sharedPreferences.edit().putString("em", "").apply();
                return new String(ay.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences("umeng_pcp", 0);
                String string = sharedPreferences.getString("mob", "");
                if ("pv".Q.equals(string)) {
                    sharedPreferences.edit().putString("mob", "").apply();
                    return "";
                }
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                sharedPreferences.edit().putString("mob", "").apply();
                return new String(ay.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void a(Context context, Map<String, Object> map) {
        if (map != null) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                synchronized (i) {
                    try {
                        jSONStringer.array();
                        for (String str : map.keySet()) {
                            jSONStringer.object();
                            jSONStringer.key("pk");
                            jSONStringer.value(str);
                            jSONStringer.key("pv");
                            jSONStringer.value(map.get(str));
                            jSONStringer.endObject();
                        }
                        jSONStringer.endArray();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("umeng_pcp", 0);
                sharedPreferences.edit().putString("cp", Base64.encodeToString(ay.a(jSONStringer.toString().getBytes(), UMConfigure.sAppkey.getBytes()), 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, Object obj) {
        synchronized (i) {
            try {
                if (j.containsKey(str)) {
                    UMRTLog.i("MobclickRT", "更新账号自定义KV: key=" + str + "; val=" + obj);
                    j.put(str, obj);
                    a(UMGlobalContext.getAppContext(), j);
                } else if (j.size() < 20) {
                    UMRTLog.i("MobclickRT", "设置账号自定义KV: key=" + str + "; val=" + obj);
                    j.put(str, obj);
                    a(UMGlobalContext.getAppContext(), j);
                } else {
                    UMRTLog.i("MobclickRT", "设置账号自定义KV: 已经设置20个KV键值对，忽略设置请求。");
                    MLog.e("userProfile: Only 20 user-defined key-value pairs can be configured, please check!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
