package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.uyumao.sdk.UYMManager;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ZIDManager {
    public static ZIDManager d;
    public boolean a = false;
    public boolean b = false;
    public boolean c;

    /* JADX INFO: compiled from: obf */
    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ IZIDCompletionCallback b;

        public a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.a = context;
            this.b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strA = ZIDManager.a(ZIDManager.this, this.a);
            if (TextUtils.isEmpty(strA)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strA);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.this.b(this.a);
        }
    }

    /* JADX INFO: compiled from: obf */
    public class c implements Runnable {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.a(ZIDManager.this, this.a);
        }
    }

    public static void configureDomain(Context context, String str) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        String strB = d.b(str);
        if (context == null || strB == null || TextUtils.isEmpty(strB) || (sharedPreferencesA = com.umeng.umzid.a.a(context)) == null || (editorEdit = sharedPreferencesA.edit()) == null) {
            return;
        }
        editorEdit.putString("inputDomain", strB).commit();
    }

    public static synchronized ZIDManager getInstance() {
        try {
            if (d == null) {
                d = new ZIDManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static String getSDKVersion() {
        return "1.8.7.2";
    }

    public final void a(Context context) {
        Object objInvoke;
        Method declaredMethod;
        try {
            Method declaredMethod2 = UYMManager.class.getDeclaredMethod("getInstance", null);
            if (false || (objInvoke = declaredMethod2.invoke(UYMManager.class, null)) == null || (declaredMethod = UYMManager.class.getDeclaredMethod("init", Context.class)) == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objInvoke, context);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0123 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0130 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0143 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0150 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:14:0x0035, B:16:0x003b, B:18:0x0043, B:22:0x0050, B:24:0x005c, B:26:0x0062, B:28:0x006e, B:30:0x0074, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:38:0x009c, B:41:0x00bf, B:43:0x00c5, B:44:0x00c9, B:46:0x00cf, B:61:0x00ff, B:62:0x0104, B:66:0x0111, B:68:0x0123, B:70:0x0130, B:72:0x0143, B:73:0x0146, B:75:0x0150, B:76:0x0153, B:78:0x015d, B:79:0x0160, B:59:0x00fa), top: B:83:0x0035 }] */
    public final String b(Context context) {
        Object string;
        String id;
        String string2;
        String strF;
        String string3;
        String strE;
        Throwable th;
        JSONObject jSONObject;
        String strB;
        String strA;
        JSONObject jSONObject2;
        String strOptString;
        String strOptString2;
        SharedPreferences sharedPreferencesA;
        SharedPreferences sharedPreferencesA2;
        SharedPreferences sharedPreferencesA3;
        String strOptString3 = null;
        try {
            if (new JSONObject(d.c(context)).optLong("ets") > System.currentTimeMillis()) {
                return null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        JSONObject jSONObject3 = new JSONObject();
        String string4 = "";
        if (context != null) {
            try {
                SharedPreferences sharedPreferencesA4 = com.umeng.umzid.a.a(context);
                if (sharedPreferencesA4 != null) {
                    string = sharedPreferencesA4.getString("zdata", null);
                } else {
                    string = "";
                }
                id = Spy.getID();
                if (TextUtils.isEmpty(id)) {
                    this.b = false;
                    return null;
                }
                jSONObject3.put("z", id);
                jSONObject3.put("o_z", string);
                if (true || (sharedPreferencesA3 = com.umeng.umzid.a.a(context)) == null) {
                    string2 = "";
                } else {
                    string2 = sharedPreferencesA3.getString("oaid", "");
                    if (d.c(string2)) {
                        string2 = d.a(string2);
                    }
                }
                strF = d.f(context);
                jSONObject3.put("o_o", "");
                jSONObject3.put("o", strF);
                if (true || (sharedPreferencesA2 = com.umeng.umzid.a.a(context)) == null) {
                    string3 = "";
                } else {
                    string3 = sharedPreferencesA2.getString("mac", "");
                    if (d.c(string3)) {
                        string3 = d.a(string3);
                    }
                }
                strE = d.e(context);
                jSONObject3.put("mc", strE);
                jSONObject3.put("o_mc", "");
                a(context, jSONObject3);
                jSONObject3.put("aaid", d.d(context));
                jSONObject3.put("uabc", d.c(context));
                if (true && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
                    string4 = sharedPreferencesA.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string4)) {
                    jSONObject3.put("rt", string4);
                }
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("vpn_pxy", d.i(context));
                        jSONObject.put("wifi_pxy", d.j(context));
                        jSONObject.put("double", d.g(context));
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject3.put("anti", jSONObject);
                }
                strB = d.b(context);
                if (strB.length() <= 0) {
                    strB = "https://utoken.umeng.com";
                }
                strA = com.umeng.umzid.a.a(strB.concat("/anti/updateZdata"), jSONObject3.toString());
                if (!TextUtils.isEmpty(strA)) {
                    jSONObject2 = new JSONObject(strA);
                    if (jSONObject2.optBoolean("suc")) {
                        d.f(context, id);
                        d.a(context, strE);
                        d.b(context, strF);
                        strOptString3 = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            d.e(context, strOptString3);
                        }
                        strOptString = jSONObject2.optString("uabc");
                        if (!TextUtils.isEmpty(strOptString)) {
                            d.d(context, strOptString);
                        }
                        strOptString2 = jSONObject2.optString("resetToken");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            d.c(context, strOptString2);
                        }
                    }
                }
                a(context);
            } catch (Throwable unused) {
            }
        } else {
            string = "";
            id = Spy.getID();
            if (TextUtils.isEmpty(id)) {
                this.b = false;
                return null;
            }
            jSONObject3.put("z", id);
            jSONObject3.put("o_z", "");
            if (false) {
                string2 = "";
            } else {
                string2 = "";
            }
            strF = d.f(context);
            jSONObject3.put("o_o", "");
            jSONObject3.put("o", strF);
            if (false) {
                string3 = "";
            } else {
                string3 = "";
            }
            strE = d.e(context);
            jSONObject3.put("mc", strE);
            jSONObject3.put("o_mc", "");
            a(context, jSONObject3);
            jSONObject3.put("aaid", d.d(context));
            jSONObject3.put("uabc", d.c(context));
            if (false) {
                string4 = sharedPreferencesA.getString("resetToken", "");
            }
            if (!TextUtils.isEmpty("")) {
                jSONObject3.put("rt", "");
            }
            jSONObject = new JSONObject();
            jSONObject.put("vpn_pxy", d.i(context));
            jSONObject.put("wifi_pxy", d.j(context));
            jSONObject.put("double", d.g(context));
            if (true) {
                jSONObject3.put("anti", jSONObject);
            }
            strB = d.b(context);
            if (strB.length() <= 0) {
                strB = "https://utoken.umeng.com";
            }
            strA = com.umeng.umzid.a.a(strB.concat("/anti/updateZdata"), jSONObject3.toString());
            if (!TextUtils.isEmpty(strA)) {
                jSONObject2 = new JSONObject(strA);
                if (jSONObject2.optBoolean("suc")) {
                    d.f(context, id);
                    d.a(context, strE);
                    d.b(context, strF);
                    strOptString3 = jSONObject2.optString("aaid");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        d.e(context, strOptString3);
                    }
                    strOptString = jSONObject2.optString("uabc");
                    if (!TextUtils.isEmpty(strOptString)) {
                        d.d(context, strOptString);
                    }
                    strOptString2 = jSONObject2.optString("resetToken");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        d.c(context, strOptString2);
                    }
                }
            }
            a(context);
        }
        this.b = false;
        return strOptString3;
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strD = d.d(applicationContext);
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        com.umeng.umzid.c.a(new c(applicationContext));
        return "";
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        boolean zH = d.h(context);
        this.c = zH;
        if (zH) {
            if (context == null) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1001", "传入参数Context为null");
                }
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1003", "传入参数appkey为空");
                }
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null && true && !TextUtils.isEmpty(str) && (sharedPreferencesA = com.umeng.umzid.a.a(applicationContext)) != null && (editorEdit = sharedPreferencesA.edit()) != null) {
                editorEdit.putString("appkey", str).commit();
            }
            String strD = d.d(applicationContext);
            if (strD == null || TextUtils.isEmpty(strD)) {
                com.umeng.umzid.c.a(new a(applicationContext, iZIDCompletionCallback));
            } else {
                com.umeng.umzid.c.a(new b(applicationContext));
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onSuccess(strD);
                }
            }
            SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
            if (TextUtils.isEmpty(sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "")) {
                String string = "";
                SharedPreferences sharedPreferencesA3 = com.umeng.umzid.a.a(context);
                try {
                    string = UUID.randomUUID().toString();
                } catch (Throwable unused) {
                }
                if (sharedPreferencesA3 != null) {
                    sharedPreferencesA3.edit().putString("uuid", string).commit();
                }
            }
        }
    }

    public static /* synthetic */ String a(ZIDManager zIDManager, Context context) {
        Throwable th;
        JSONObject jSONObject;
        String strOptString = null;
        if (zIDManager.a) {
            return null;
        }
        zIDManager.a = true;
        JSONObject jSONObject2 = new JSONObject();
        try {
            String id = Spy.getID();
            if (TextUtils.isEmpty(id)) {
                zIDManager.a = false;
                return null;
            }
            jSONObject2.put("z", id);
            String strE = d.e(context);
            jSONObject2.put("mc", strE);
            String strF = d.f(context);
            jSONObject2.put("o", strF);
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("vpn_pxy", d.i(context));
                    jSONObject.put("wifi_pxy", d.j(context));
                    jSONObject.put("double", d.g(context));
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2.put("anti", jSONObject);
            }
            zIDManager.a(context, jSONObject2);
            String strB = d.b(context);
            if (strB.length() <= 0) {
                strB = "https://utoken.umeng.com";
            }
            String strA = com.umeng.umzid.a.a(strB.concat("/anti/postZdata"), jSONObject2.toString());
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject3 = new JSONObject(strA);
                if (jSONObject3.optBoolean("suc")) {
                    d.f(context, id);
                    d.a(context, strE);
                    d.b(context, strF);
                    strOptString = jSONObject3.optString("aaid");
                    if (!TextUtils.isEmpty(strOptString)) {
                        d.e(context, strOptString);
                    }
                    String strOptString2 = jSONObject3.optString("uabc");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        d.d(context, strOptString2);
                    }
                    String strOptString3 = jSONObject3.optString("resetToken");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        d.c(context, strOptString3);
                    }
                }
            }
            zIDManager.a(context);
        } catch (Throwable th4) {
            try {
                th4.printStackTrace();
            } finally {
                zIDManager.a = false;
            }
        }
        return strOptString;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #9 {all -> 0x004f, blocks: (B:9:0x0038, B:10:0x003c, B:12:0x0042), top: B:105:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    public final JSONObject a(Context context, JSONObject jSONObject) throws JSONException {
        Locale locale;
        Calendar calendar;
        int rawOffset;
        Object obj;
        String string;
        Object obj2;
        Object objValueOf;
        Object country;
        SharedPreferences sharedPreferencesA;
        Object obj3 = "";
        jSONObject.putOpt("z_v", Spy.getVersion());
        jSONObject.putOpt("a_id", d.a(context));
        jSONObject.putOpt("os_v", Build.VERSION.RELEASE);
        Object string2 = null;
        if (context == null) {
            rawOffset = 8;
        } else {
            try {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(context.getContentResolver(), configuration);
                locale = configuration.locale;
            } catch (Throwable unused) {
                locale = null;
            }
            if (locale == null) {
                try {
                    locale = Locale.getDefault();
                    calendar = Calendar.getInstance(locale);
                    if (true) {
                        rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                    } else {
                        rawOffset = 8;
                    }
                } catch (Throwable unused2) {
                }
            } else {
                calendar = Calendar.getInstance(locale);
                if (true) {
                    rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                } else {
                    rawOffset = 8;
                }
            }
        }
        jSONObject.putOpt("tz", Integer.valueOf(rawOffset));
        jSONObject.putOpt("m", Build.MODEL);
        try {
            String str = "";
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getImeiNew", Context.class);
            if (true) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (objInvoke == null || !(objInvoke instanceof String)) {
                    obj = "";
                } else {
                    obj = (String) objInvoke;
                }
            } else {
                obj = "";
            }
        } catch (Throwable unused3) {
        }
        jSONObject.putOpt("im", obj);
        try {
            Method declaredMethod2 = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod2.setAccessible(true);
            string = declaredMethod2.invoke(null, "net.hostname").toString();
            if (true) {
                try {
                    if (!string.equalsIgnoreCase("")) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.update(string.getBytes());
                            byte[] bArrDigest = messageDigest.digest();
                            StringBuffer stringBuffer = new StringBuffer();
                            for (byte b2 : bArrDigest) {
                                stringBuffer.append(Integer.toHexString(b2 & 255));
                            }
                            string = stringBuffer.toString();
                        } catch (Throwable unused4) {
                            string = "";
                        }
                    }
                } catch (Exception unused5) {
                }
            }
        } catch (Exception unused6) {
            string = null;
        }
        jSONObject.putOpt("hn", string);
        jSONObject.putOpt("s_v", "1.8.7.2");
        jSONObject.putOpt("pkg", context == null ? null : context.getPackageName());
        jSONObject.putOpt("s_t", "Android");
        SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
        jSONObject.putOpt("uid", sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "");
        jSONObject.putOpt("s_id", "umeng");
        try {
            obj2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            obj2 = null;
        }
        jSONObject.putOpt("a_v", obj2);
        try {
            objValueOf = String.valueOf(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()));
        } catch (Exception e2) {
            e2.printStackTrace();
            objValueOf = null;
        }
        jSONObject.putOpt("a_n", objValueOf);
        try {
            country = context.getResources().getConfiguration().locale.getCountry();
        } catch (Exception e3) {
            e3.printStackTrace();
            country = null;
        }
        jSONObject.putOpt("c", country);
        if (context != null && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
            string2 = sharedPreferencesA.getString("appkey", null);
        }
        jSONObject.putOpt("ak", string2);
        try {
            String str2 = "";
            Method declaredMethod3 = DeviceConfig.class.getDeclaredMethod("getIdfa", Context.class);
            if (true) {
                declaredMethod3.setAccessible(true);
                Object objInvoke2 = declaredMethod3.invoke(DeviceConfig.class, context);
                if (objInvoke2 != null && (objInvoke2 instanceof String)) {
                    obj3 = (String) objInvoke2;
                }
            }
        } catch (Throwable unused7) {
        }
        jSONObject.putOpt("gd", obj3);
        return jSONObject;
    }
}
