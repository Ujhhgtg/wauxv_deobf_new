package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d {
    private static final boolean a = false;
    private static volatile JSONObject b = null;
    private static boolean c = true;
    private static final a d = new a();

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final String a = "ins_referrer";
        private JSONArray b;

        private JSONArray b(Context context) {
            String str;
            JSONObject jSONObjectD;
            JSONArray jSONArray = new JSONArray();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "[iReferrer] start");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (f() || bt.c()) {
                    str = "huawei";
                    jSONObjectD = d(context);
                } else if (g()) {
                    str = "honor";
                    jSONObjectD = c(context);
                } else if (b()) {
                    str = "xiaomi";
                    jSONObjectD = e(context);
                } else if (c()) {
                    str = "vivo";
                    jSONObjectD = f(context);
                } else if (e()) {
                    str = "samsung";
                    jSONObjectD = h(context);
                } else if (d()) {
                    str = "oppo";
                    jSONObjectD = g(context);
                } else {
                    str = null;
                    jSONObjectD = null;
                }
                if (jSONObjectD != null && jSONObjectD.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", str);
                    jSONObject.put("referrer", jSONObjectD);
                    jSONArray.put(jSONObject);
                    MLog.i("[iReferrer] get:" + jSONObject);
                }
            } catch (Throwable th) {
                UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "[iReferrer] result: " + jSONArray + " cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            return jSONArray;
        }

        private JSONObject c(Context context) {
            Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, 104, JSONB.Constants.BC_STR_ASCII_FIX_32, 104, 111, 110, 111, 114, 46, 97, 112, 112, JSONB.Constants.BC_STR_ASCII_FIX_36, 97, 114, 107, 101, 116, 46, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_36, 111, 110, 100, 97, 116, 97, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 116, 101, JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_INT32_NUM_MAX, 119, JSONB.Constants.BC_STR_ASCII_FIX_32, 115, 101, 112, 97, 99, 107, 97, 103, 101}));
            String[] strArr = {context.getPackageName()};
            if (a(context, uri.getAuthority())) {
                return a(context, uri, strArr);
            }
            return null;
        }

        private JSONObject d(Context context) {
            Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, 104, 117, 97, 119, 101, JSONB.Constants.BC_STR_ASCII_FIX_32, 46, 97, 112, 112, JSONB.Constants.BC_STR_ASCII_FIX_36, 97, 114, 107, 101, 116, 46, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_36, 111, 110, 100, 97, 116, 97, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 116, 101, JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_INT32_NUM_MAX, 53}));
            String[] strArr = {context.getPackageName()};
            if (a(context, uri.getAuthority())) {
                return a(context, uri, strArr);
            }
            return null;
        }

        private JSONObject e(Context context) {
            Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, JSONB.Constants.BC_STR_ASCII_FIX_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 97, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_32, 46, JSONB.Constants.BC_STR_ASCII_FIX_36, 97, 114, 107, 101, 116, 46, 112, 114, 111, 118, JSONB.Constants.BC_STR_ASCII_FIX_32, 100, 101, 114, 46, JSONB.Constants.BC_INT32_SHORT_ZERO, JSONB.Constants.BC_STR_ASCII_FIX_32, 114, 101, 99, 116, JSONB.Constants.BC_STR_ASCII_FIX_4, 97, JSONB.Constants.BC_STR_ASCII_FIX_32, 108, 80, 114, 111, 118, JSONB.Constants.BC_STR_ASCII_FIX_32, 100, 101, 114, JSONB.Constants.BC_INT32_NUM_MAX, 114, 101, 102, 101, 114, 114, 101, 114, JSONB.Constants.BC_INT32_NUM_MAX, 118, 51}));
            if (a(context, uri.getAuthority())) {
                return a(context, uri, null);
            }
            return null;
        }

        private JSONObject f(Context context) {
            try {
                Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, 98, 98, 107, 46, 97, 112, 112, 115, 116, 111, 114, 101, 46, 112, 114, 111, 118, JSONB.Constants.BC_STR_ASCII_FIX_32, 100, 101, 114, 46, 97, 112, 112, 115, 116, 97, 116, 117, 115}));
                if (!a(context, uri.getAuthority())) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putString(bv.o, context.getPackageName());
                Bundle bundleCall = context.getContentResolver().call(uri, "read_channel", (String) null, bundle);
                if (bundleCall != null && !bundleCall.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : bundleCall.keySet()) {
                        Object obj = bundleCall.get(str);
                        if (obj != null) {
                            jSONObject.put(str, obj.toString());
                        }
                    }
                    return jSONObject;
                }
                return null;
            } catch (Throwable th) {
                UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
                return null;
            }
        }

        private JSONObject g(Context context) {
            Bundle bundleCall;
            try {
                Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, 104, 101, JSONB.Constants.BC_STR_ASCII, 116, 97, 112, 46, JSONB.Constants.BC_STR_ASCII_FIX_36, 97, 114, 107, 101, 116, 46, 84, 114, 97, 99, 107, 80, 114, 111, 118, JSONB.Constants.BC_STR_ASCII_FIX_32, 100, 101, 114}));
                if (a(context, uri.getAuthority()) && (bundleCall = context.getContentResolver().call(uri, "getTrackInfo", (String) null, (Bundle) null)) != null && !bundleCall.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : bundleCall.keySet()) {
                        Object obj = bundleCall.get(str);
                        if (obj != null) {
                            jSONObject.put(str, obj.toString());
                        }
                    }
                    return jSONObject;
                }
                return null;
            } catch (Throwable th) {
                UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
                return null;
            }
        }

        private JSONObject h(Context context) {
            Uri uri = Uri.parse(new String(new byte[]{99, 111, 110, 116, 101, 110, 116, 58, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 99, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 46, 115, 101, 99, 46, 97, 110, 100, 114, 111, JSONB.Constants.BC_STR_ASCII_FIX_32, 100, 46, 97, 112, 112, 46, 115, 97, JSONB.Constants.BC_STR_ASCII_FIX_36, 115, 117, 110, 103, 97, 112, 112, 115, 46, 114, 101, 102, 101, 114, 114, 101, 114}));
            if (a(context, uri.getAuthority())) {
                return a(context, uri, null);
            }
            return null;
        }

        public JSONArray a(Context context) {
            JSONArray jSONArray = this.b;
            if (jSONArray != null) {
                if (jSONArray.length() > 0) {
                    return this.b;
                }
                return null;
            }
            if (!a()) {
                this.b = new JSONArray();
                return null;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString(a, null);
            if (string != null) {
                String str = new String(Base64.decode(string, 2));
                UMRTLog.i(UMRTLog.RTLOG_TAG, "[iReferrer] cache: ".concat(str));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("ver", 0) == 1) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ref");
                        this.b = jSONArrayOptJSONArray;
                        if (jSONArrayOptJSONArray == null) {
                            this.b = new JSONArray();
                        }
                        if (this.b.length() == 0) {
                            return null;
                        }
                        return this.b;
                    }
                } catch (Throwable unused) {
                }
            }
            this.b = b(context);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ver", 1);
                jSONObject2.put("ref", this.b);
                sharedPreferences.edit().putString(a, Base64.encodeToString(jSONObject2.toString().getBytes(), 2)).apply();
            } catch (Throwable th) {
                UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
            }
            if (this.b.length() > 0) {
                return this.b;
            }
            return null;
        }

        private a() {
        }

        private boolean e() {
            return a("SAMSUNG");
        }

        private boolean c() {
            return a("VIVO");
        }

        private boolean d() {
            return a("OPPO", "REALME", "ONEPLUS");
        }

        private boolean g() {
            return a("HONOR");
        }

        private boolean f() {
            return a("HUAWEI");
        }

        private boolean a() {
            return f() || b() || c() || e() || d() || g();
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0025 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r10
          0x0025: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v4 android.database.Cursor) binds: [B:18:0x0041, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        private JSONObject a(Context context, Uri uri, String[] strArr) {
            Throwable th;
            Cursor cursorQuery;
            try {
                cursorQuery = context.getContentResolver().query(uri, null, null, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            JSONObject jSONObjectA = a(cursorQuery);
                            try {
                                cursorQuery.close();
                            } catch (Throwable unused) {
                            }
                            return jSONObjectA;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
                        } finally {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
                if (cursorQuery != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
            return null;
        }

        private boolean b() {
            return a("XIAOMI", "REDMI", "BLACKSHARK");
        }

        private boolean a(Context context, String str) {
            try {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 0);
                if (providerInfoResolveContentProvider != null) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "[iReferrer] pi: " + providerInfoResolveContentProvider.packageName + "/" + providerInfoResolveContentProvider.name);
                    return true;
                }
            } catch (Throwable unused) {
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "[iReferrer] pi: null");
            return false;
        }

        private JSONObject a(Cursor cursor) {
            JSONObject jSONObject = new JSONObject();
            int iMin = Math.min(cursor.getColumnCount(), 20);
            for (int i = 0; i < iMin; i++) {
                try {
                    jSONObject.put(cursor.getColumnName(i), cursor.getString(i));
                } catch (Throwable th) {
                    UMRTLog.se(UMRTLog.RTLOG_TAG, "[iReferrer] failed: " + th.getMessage());
                }
            }
            return jSONObject;
        }

        private boolean a(String... strArr) {
            String str = Build.BRAND;
            String str2 = Build.MANUFACTURER;
            for (String str3 : strArr) {
                if (str3.equalsIgnoreCase(str) || str3.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static JSONArray a(Context context) {
        if (c && context != null) {
            return d.a(context);
        }
        return null;
    }

    public static JSONObject a() {
        return b;
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str.length() > 128) {
                MLog.w("[iReferrer] source too long[>128]: ".concat(str));
                return;
            }
            if (str2.length() > 4096) {
                MLog.w("[iReferrer] referrer too long[>4096]: ".concat(str2));
                return;
            }
            if (b == null) {
                b = new JSONObject();
            }
            try {
                b.put("source", str);
                b.put("referrer", str2);
            } catch (Throwable unused) {
            }
            MLog.i("[iReferrer] set: " + b);
            return;
        }
        MLog.w("[iReferrer] args cannot empty source: " + str + " referrer: " + str2);
    }

    public static void a(boolean z) {
        c = z;
    }
}
