package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.h;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.r;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class x implements ab.a {
    public static final String a = "session_start_time";
    public static final String b = "session_end_time";
    public static final String c = "session_id";
    public static final String d = "pre_session_id";
    public static final String e = "a_start_time";
    public static final String f = "a_end_time";
    public static final String g = "fg_count";
    private static String h = null;
    private static Context i = null;
    private static boolean j = false;
    private static long k = 0;
    private static boolean l = true;
    private static long m;

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final x a = new x();

        private a() {
        }
    }

    public static x a() {
        return "session_start_time".a;
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(i);
        if (sharedPreferences != null) {
            long j2 = sharedPreferences.getLong("fg_count", 0L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putLong("fg_count", j2 + 1);
                editorEdit.commit();
            }
        }
    }

    private void d(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putLong("fg_count", 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    private String e(Context context) {
        if (i == null && context != null) {
            i = context.getApplicationContext();
        }
        String strD = ab.a().d(i);
        try {
            f(context);
            r.a(i).d((Object) null);
        } catch (Throwable unused) {
        }
        return strD;
    }

    private void f(Context context) {
        r.a(context).b(context);
        r.a(context).d();
    }

    public void c(Context context, Object obj) {
        try {
            if (i == null && context != null) {
                i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong("a_start_time", 0L) == 0) {
                MLog.e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            UMRTLog.i("MobclickRT", "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong("a_end_time", jLongValue);
            editorEdit.putLong("session_end_time", jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    private x() {
        ab.a().a(this);
    }

    public static long a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong("fg_count", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void a(Context context, long j2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(i);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong("session_start_time", j2);
        editorEdit.commit();
    }

    public void b(Context context, Object obj) {
        long jLongValue;
        try {
            if (i == null) {
                i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                jLongValue = System.currentTimeMillis();
            } else {
                jLongValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(i);
            if (sharedPreferences == null) {
                return;
            }
            k = sharedPreferences.getLong("a_end_time", 0L);
            UMRTLog.i("MobclickRT", "------>>> lastActivityEndTime: " + k);
            String string = sharedPreferences.getString("fg_count".aF, "");
            String appVersionName = UMUtils.getAppVersionName(i);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.i("MobclickRT", "--->>> requestNewInstantSessionIf: version upgrade");
                editorEdit.putLong("session_start_time", jLongValue);
                editorEdit.commit();
                r.a(i).a((Object) null, true);
                UMRTLog.i("MobclickRT", "--->>> force generate new session: session id = " + ab.a().c(i));
                j = true;
                a(i, jLongValue, true);
                return;
            }
            if (ab.a().e(i)) {
                UMRTLog.i("MobclickRT", "--->>> More then 30 sec from last session.");
                j = true;
                editorEdit.putLong("session_start_time", jLongValue);
                editorEdit.commit();
                a(i, jLongValue, false);
                return;
            }
            UMRTLog.i("MobclickRT", "--->>> less then 30 sec from last session, do nothing.");
            j = false;
        } catch (Throwable unused) {
        }
    }

    public void a(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (i == null && context != null) {
                i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(i);
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
                String string = sharedPreferences.getString("fg_count".aF, "");
                String appVersionName = UMUtils.getAppVersionName(i);
                if (TextUtils.isEmpty(string)) {
                    editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                    editorEdit.putString("fg_count".aF, appVersionName);
                    editorEdit.commit();
                } else if (!string.equals(appVersionName)) {
                    UMRTLog.i("MobclickRT", "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                    int i2 = sharedPreferences.getInt("versioncode", 0);
                    String string2 = sharedPreferences.getString("pre_date", "");
                    String string3 = sharedPreferences.getString("pre_version", "");
                    String string4 = sharedPreferences.getString("fg_count".aF, "");
                    editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                    editorEdit.putString("fg_count".aF, appVersionName);
                    editorEdit.putString("vers_date", string2);
                    editorEdit.putString("vers_pre_version", string3);
                    editorEdit.putString("cur_version", string4);
                    editorEdit.putInt("vers_code", i2);
                    editorEdit.putString("vers_name", string);
                    editorEdit.commit();
                    if (l) {
                        l = false;
                    }
                    if (j) {
                        j = false;
                        b(i, jLongValue, true);
                        b(i, jLongValue);
                        return;
                    }
                    return;
                }
                if (j) {
                    j = false;
                    if (l) {
                        l = false;
                    }
                    h = e(context);
                    MLog.d("创建新会话: " + h);
                    UMRTLog.i("MobclickRT", "mSessionChanged flag has been set, Start new session: " + h);
                    return;
                }
                h = sharedPreferences.getString("session_id", null);
                editorEdit.putLong("a_start_time", jLongValue);
                editorEdit.putLong("a_end_time", 0L);
                editorEdit.commit();
                MLog.d("延续上一个会话: " + h);
                UMRTLog.i("MobclickRT", "Extend current session: " + h);
                if (l) {
                    l = false;
                    if (FieldManager.allow("header_foreground_count")) {
                        Context context2 = i;
                        UMWorkDispatch.sendEventEx(context2, 8213, CoreProtocol.getInstance(context2), null, 0L);
                    }
                }
                f(context);
                r.a(i).a(false);
            }
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public String c(Context context) {
        try {
            if (h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return h;
    }

    @Deprecated
    public String c() {
        return c(i);
    }

    public boolean b(Context context, long j2, boolean z) {
        String strA;
        long j3;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null && (strA = ab.a().a(i)) != null) {
                long j4 = sharedPreferences.getLong("a_start_time", 0L);
                long j5 = sharedPreferences.getLong("a_end_time", 0L);
                if (j4 <= 0 || j5 != 0) {
                    return false;
                }
                try {
                    if (z) {
                        j3 = k;
                        if (j3 == 0) {
                            UMRTLog.i("MobclickRT", "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j2);
                            j3 = j2;
                        } else {
                            UMRTLog.i("MobclickRT", "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + k);
                        }
                        c(i, Long.valueOf(j3));
                    } else {
                        c(i, Long.valueOf(j2));
                        j3 = j2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put(h.d.a.g, j3);
                    } else {
                        jSONObject.put(h.d.a.g, j2);
                    }
                    JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
                    if (jSONObjectB != null && jSONObjectB.length() > 0) {
                        jSONObject.put("__sp", jSONObjectB);
                    }
                    JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
                    if (jSONObjectC != null && jSONObjectC.length() > 0) {
                        jSONObject.put("__pp", jSONObjectC);
                    }
                    if (FieldManager.allow("header_foreground_count")) {
                        UMRTLog.e("MobclickRT", "--->>>*** foregroundCount = " + m);
                        jSONObject.put(h.d.a.h, m);
                        m = 0L;
                    } else {
                        jSONObject.put(h.d.a.h, 0L);
                    }
                    l.a(context).a(strA, jSONObject, l.a.END);
                    r.a(i).e();
                } catch (Throwable unused) {
                }
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public String a(Context context, long j2, boolean z) {
        String strB = ab.a().b(context);
        UMRTLog.i("MobclickRT", "--->>> onInstantSessionInternal: current session id = " + strB);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j2);
            JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
            if (jSONObjectB != null && jSONObjectB.length() > 0) {
                jSONObject.put("__sp", jSONObjectB);
            }
            JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
            if (jSONObjectC != null && jSONObjectC.length() > 0) {
                jSONObject.put("__pp", jSONObjectC);
            }
            l.a(context).a(strB, jSONObject, l.a.INSTANTSESSIONBEGIN);
            r.a(context).a(jSONObject, z);
        } catch (Throwable unused) {
        }
        return strB;
    }

    public void b(Context context, long j2) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            r.a(i).c((Object) null);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public String b() {
        return h;
    }

    @Override // com.umeng.analytics.pro.ab.a
    public void a(String str, String str2, long j2, long j3, long j4) {
        a(i, str2, j2, j3, j4);
        UMRTLog.i("MobclickRT", "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = i;
            UMWorkDispatch.sendEvent(context, 36945, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.ab.a
    public void a(String str, long j2, long j3, long j4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, j2);
    }

    private void a(Context context, String str, long j2, long j3, long j4) {
        if (TextUtils.isEmpty(h)) {
            h = ab.a().a(i);
        }
        if (TextUtils.isEmpty(str) || str.equals(h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(h.d.a.g, j3);
            jSONObject.put(h.d.a.h, j4);
            JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
            if (jSONObjectB != null && jSONObjectB.length() > 0) {
                jSONObject.put("__sp", jSONObjectB);
            }
            JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
            if (jSONObjectC != null && jSONObjectC.length() > 0) {
                jSONObject.put("__pp", jSONObjectC);
            }
            l.a(context).a(h, jSONObject, l.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j2);
            l.a(context).a(str, jSONObject2, l.a.BEGIN);
            if (FieldManager.allow("header_foreground_count")) {
                m = j4;
                d(context);
                Context context2 = i;
                UMWorkDispatch.sendEventEx(context2, 8213, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        h = str;
    }

    private void a(String str, long j2) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(i);
        if (sharedPreferences == null) {
            return;
        }
        long j3 = sharedPreferences.getLong("session_end_time", 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j2);
            jSONObject.put(h.d.a.g, j3);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("fg_count".C, location[0]);
                jSONObject2.put("fg_count".D, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(h.d.a.e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i2 = i.getApplicationInfo().uid;
            if (i2 == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i2))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i2))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("fg_count".H, jLongValue);
                jSONObject3.put("fg_count".G, jLongValue2);
                jSONObject.put(h.d.a.d, jSONObject3);
            }
            l.a(i).a(str, jSONObject, l.a.NEWSESSION);
            y.a(i);
            o.c(i);
        } catch (Throwable unused) {
        }
    }
}
