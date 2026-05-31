package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bb;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.m;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.MLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MobclickAgent {

    /* JADX INFO: compiled from: obf */
    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);

        private int a;

        EScenarioType(int i) {
            this.a = i;
        }

        public int toValue() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().g(context);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    private static void disableExceptionCatch() {
        b.a().a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static b getAgent() {
        return b.a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().h(context);
    }

    private static void init(Context context) {
        b.a().a(context);
    }

    public static void onEvent(Context context, String str) {
        try {
            bc bcVar = new bc();
            bcVar.a(bc.a.ID).a(str);
            ba.a(context, 101, bb.a(), bcVar);
        } catch (Throwable unused) {
        }
        b.a().a(context, str, (String) null, -1L, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        HashMap map2;
        try {
            bc bcVar = new bc();
            if (map != null) {
                map2 = new HashMap();
                for (String str2 : map.keySet()) {
                    map2.put(str2, map.get(str2));
                }
            } else {
                map2 = null;
            }
            bcVar.a(bc.a.OBJECT_MAP).a(str).b(map2);
            ba.a(context, 101, bb.a(), bcVar);
        } catch (Throwable unused) {
        }
        if (map == null) {
            UMLog.aq(m.a, 0, "\\|");
        } else {
            b.a().a(context, str, map, -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i) {
        HashMap map2;
        try {
            bc bcVar = new bc();
            if (map != null) {
                map2 = new HashMap();
                for (String str2 : map.keySet()) {
                    map2.put(str2, map.get(str2));
                }
            } else {
                map2 = null;
            }
            bcVar.a(bc.a.STRING_MAP).a(str).a(map2).a(true);
            ba.a(context, 101, bb.a(), bcVar);
        } catch (Throwable unused) {
        }
        HashMap map3 = map == null ? new HashMap() : new HashMap(map);
        map3.put("__ct__", Integer.valueOf(i));
        b.a().a(context, str, map3, -1L);
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> map) {
        b.a().a(context, str, map);
    }

    public static void onKillProcess(Context context) {
        b.a().d(context);
    }

    public static void onPageEnd(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(m.D, 0, "\\|");
        } else {
            b.a().b(str);
        }
    }

    public static void onPageStart(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(m.C, 0, "\\|");
        } else {
            b.a().a(str);
        }
    }

    public static void onPause(Context context) {
        b.a().c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        b.a().j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.aq(m.n, 0, "\\|");
        } else {
            b.a().b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().a(context, jSONObject);
    }

    public static void reportError(Context context, String str) {
        try {
            Class<?> cls = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls.getDeclaredMethod("generateCustomLog", String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, str, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        b.a().a(z);
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().a(context, list);
    }

    private static void setGameScenarioType(Context context) {
        b.a().a(context, EScenarioType.E_UM_GAME);
    }

    public static void setLocation(double d, double d2) {
        b.a().a(d, d2);
    }

    public static void setOpenGLContext(GL10 gl10) {
        b.a().a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION = pageMode;
    }

    public static void setSecret(Context context, String str) {
        b.a().c(context, str);
    }

    public static void setSessionContinueMillis(long j) {
        if (j <= 30000) {
            j = 30000;
        }
        b.a().a(j);
    }

    private static void setSysListener(ISysListener iSysListener) {
        b.a().a(iSysListener);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().f(context, str);
    }

    public static void userProfile(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            MLog.e("userProfile: key is null or empty, please check!");
            return;
        }
        if (str.startsWith("_")) {
            MLog.e("userProfile: The user-defined key cannot start with an underscore, please check!");
            return;
        }
        if (Character.isDigit(str.charAt(0))) {
            MLog.e("userProfile: The user-defined key cannot start with an number, please check!");
            return;
        }
        for (char c : str.toCharArray()) {
            if ((c < 'a' || c > 'z') && !((c >= 'A' && c <= 'Z') || Character.isDigit(c) || c == '_')) {
                MLog.e("userProfile: The user-defined key contains invalid characters, please check!");
                return;
            }
        }
        if (obj == null) {
            MLog.e("userProfile: value is null, please check!");
        } else {
            b.a().a(str, obj);
        }
    }

    public static void userProfileEMail(String str) {
        if (str == null) {
            MLog.e("userProfileEMail: email value is null, please check!");
        } else {
            b.a().d(str);
        }
    }

    public static void userProfileMobile(String str) {
        if (str == null) {
            MLog.e("userProfileMobile: mobile value is null, please check!");
        } else {
            b.a().c(str);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.aq(m.t, 0, "\\|");
            return;
        }
        if (str2.length() > 64) {
            UMLog.aq(m.u, 0, "\\|");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            b.a().a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.aq(m.v, 0, "\\|");
        } else {
            b.a().a(str, str2);
        }
    }

    public static void reportError(Context context, Throwable th) {
        try {
            Class<?> cls = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls.getDeclaredMethod("generateCustomLog", Throwable.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, th, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void onEvent(Context context, String str, String str2) {
        try {
            bc bcVar = new bc();
            bcVar.a(bc.a.LABEL).a(str).b(str2);
            ba.a(context, 101, bb.a(), bcVar);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            UMLog.aq(m.k, 0, "\\|");
        } else {
            b.a().a(context, str, str2, -1L, 1);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        HashMap map2;
        try {
            bc bcVar = new bc();
            if (map != null) {
                map2 = new HashMap();
                for (String str2 : map.keySet()) {
                    map2.put(str2, map.get(str2));
                }
            } else {
                map2 = null;
            }
            bcVar.a(bc.a.STRING_MAP).a(str).a(map2);
            ba.a(context, 101, bb.a(), bcVar);
        } catch (Throwable unused) {
        }
        if (map == null) {
            UMLog.aq(m.a, 0, "\\|");
        } else {
            b.a().a(context, str, new HashMap(map), -1L);
        }
    }

    @Deprecated
    public static void enableEncrypt(boolean z) {
    }

    @Deprecated
    public static void setCheckDevice(boolean z) {
    }

    @Deprecated
    public static void setDebugMode(boolean z) {
    }

    @Deprecated
    public static void setLatencyWindow(long j) {
    }

    @Deprecated
    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }
}
