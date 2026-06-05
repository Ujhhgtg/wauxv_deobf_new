package com.umeng.commonsdk;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.cn;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.CcgAgent;
import com.umeng.ccg.b;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMLogCommon;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.TagHelper;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.d;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.c;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;
import p000.AbstractC0924feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class UMConfigure {
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final String KEY_FILE_NAME_LOG = "LOG";
    private static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static final String TAG = "UMConfigure";
    private static final String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    private static final String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    private static final String WRAPER_TYPE_FLUTTER = "flutter";
    private static final String WRAPER_TYPE_HYBRID = "hybrid";
    private static final String WRAPER_TYPE_NATIVE = "native";
    private static final String WRAPER_TYPE_PHONEGAP = "phonegap";
    private static final String WRAPER_TYPE_REACTNATIVE = "react-native";
    private static final String WRAPER_TYPE_UNITY = "Unity";
    private static final String WRAPER_TYPE_WEEX = "weex";
    private static boolean debugLog = false;
    private static OnGetOaidListener mOnGetOaidListener;
    public static UMLog umDebugLog = new UMLog();
    private static boolean preInitComplete = false;
    private static Object PreInitLock = new Object();
    public static String sAppkey = "";
    public static String sChannel = "";
    public static boolean isInit = false;
    private static Object lock = new Object();
    private static int preInitInvokedFlag = 0;
    private static int policyGrantInvokedFlag = 0;
    private static int policyGrantResult = 0;
    private static boolean shouldCheckShareSdk = true;
    private static volatile boolean shouldCollectAid = true;
    private static volatile boolean shouldCollectOaid = true;
    private static volatile boolean shouldCollectImei = true;
    private static volatile boolean shouldCollectImsi = true;
    private static volatile boolean shouldCollectIccid = true;
    private static volatile boolean shouldCollectWiFiMac = true;
    private static volatile boolean shouldCollectApl = true;
    private static volatile boolean shouldOutputRT = false;
    public static MobclickAgent.PageMode AUTO_ACTIVITY_PAGE_COLLECTION = MobclickAgent.PageMode.AUTO;
    private static volatile long initCompleteTs = 0;
    private static UMAnalyticsCustomController customController = null;
    private static Object controllerLock = new Object();
    private static final String[] BUSINESS_TYPE = {"apm", "push", "share", "ulink", "uverify", "usms", "urec", "abtest", "game", bv.af};
    private static boolean isFinish = false;
    private static Object lockObject = new Object();

    /* JADX INFO: compiled from: obf */
    public enum BS_TYPE {
        APM,
        PUSH,
        SHARE,
        ULINK,
        UVERIFY,
        USMS,
        UREC,
        ABTEST,
        GAME,
        ZID
    }

    private static boolean checkShareSdk(Class<?> cls) {
        try {
            return cls.getDeclaredField("isZyb") != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void deleteModuleTag(BS_TYPE bs_type, String str) {
        if (bs_type == null) {
            Log.e("UMLog", UMLogCommon.SC_10025);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("UMLog", UMLogCommon.SC_10020);
            return;
        }
        try {
            if (str.trim().getBytes().length > 64) {
                Log.e("UMLog", UMLogCommon.SC_10021);
                return;
            }
            int iOrdinal = bs_type.ordinal();
            String[] strArr = BUSINESS_TYPE;
            String str2 = iOrdinal < strArr.length ? strArr[iOrdinal] : "";
            if (TextUtils.isEmpty(str2)) {
                Log.e("UMLog", UMLogCommon.SC_10022);
                return;
            }
            TagHelper.deleteModuleTag(str2 + "_" + str);
        } catch (Throwable unused) {
        }
    }

    private static void disableAidCollect() {
        try {
            Class<?> cls = getClass("com.umeng.socialize.UMShareAPI");
            Class<?> cls2 = getClass("com.uyumao.nns.zmd.ZmdManager");
            if (cls == null && cls2 == null) {
                return;
            }
            shouldCollectAid = false;
        } catch (Throwable unused) {
        }
    }

    private static void disableOaidCollect() {
        try {
            if (getClass("com.uyumao.nns.zmd.ZmdManager") != null) {
                shouldCollectOaid = false;
            }
        } catch (Throwable unused) {
        }
    }

    public static void enableApModeSwitch(boolean z) {
        b.c(z);
    }

    @Deprecated
    public static void enableAplCollection(boolean z) {
        shouldCollectApl = z;
    }

    public static void enableAzxSwitch(boolean z) {
        b.a(z);
    }

    public static void enableIccidCollection(boolean z) {
        shouldCollectIccid = z;
    }

    public static void enableImeiCollection(boolean z) {
        shouldCollectImei = z;
    }

    public static void enableImsiCollection(boolean z) {
        shouldCollectImsi = z;
    }

    public static void enableInstallReferrerCollection(boolean z) {
        d.a(z);
    }

    public static void enablePi(boolean z) {
        o.a(z);
    }

    public static void enablePo(boolean z) {
        o.b(z);
    }

    public static void enableUmcCfgSwitch(boolean z) {
        b.b(z);
    }

    public static void enableWiFiMacCollection(boolean z) {
        shouldCollectWiFiMac = z;
    }

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static String getCurrentActivityName() {
        return PageNameMonitor.getInstance().getCurrentActivityName();
    }

    public static UMAnalyticsCustomController getCustomController() {
        UMAnalyticsCustomController uMAnalyticsCustomController;
        synchronized (controllerLock) {
            uMAnalyticsCustomController = customController;
        }
        return uMAnalyticsCustomController;
    }

    private static Object getDecInstanceObject(Class<?> cls) {
        Constructor<?> declaredConstructor;
        if (cls == null) {
            return null;
        }
        try {
            declaredConstructor = cls.getDeclaredConstructor(null);
        } catch (NoSuchMethodException unused) {
            declaredConstructor = null;
        }
        if (declaredConstructor == null) {
            return null;
        }
        declaredConstructor.setAccessible(true);
        try {
            return declaredConstructor.newInstance(null);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused2) {
            return null;
        }
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        Method declaredMethod = null;
        if (cls != null) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
        }
        return declaredMethod;
    }

    public static long getInitCompleteTs() {
        return initCompleteTs;
    }

    public static boolean getInitStatus() {
        boolean z;
        synchronized (lockObject) {
            z = isFinish;
        }
        return z;
    }

    private static Map<String, String> getModuleTags() {
        try {
            return TagHelper.getModuleTags();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void getOaid(Context context, OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            if (debugLog) {
                Log.e(TAG, "context is null !!!");
                return;
            }
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        mOnGetOaidListener = onGetOaidListener;
        if (shouldCollectOaid) {
            new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMConfigure.4
                @Override // java.lang.Runnable
                public void run() {
                    String strB = bg.b(applicationContext);
                    if (UMConfigure.mOnGetOaidListener != null) {
                        UMConfigure.mOnGetOaidListener.onGetOaid(strB);
                    }
                }
            }).start();
            return;
        }
        OnGetOaidListener onGetOaidListener2 = mOnGetOaidListener;
        if (onGetOaidListener2 != null) {
            onGetOaidListener2.onGetOaid(null);
        }
    }

    public static String[] getTestDeviceInfo(Context context) {
        String[] strArr = new String[2];
        if (context != null) {
            try {
                strArr[0] = DeviceConfig.getDeviceIdForGeneral(context);
                strArr[1] = DeviceConfig.getMac(context);
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    public static String getUmengZID(Context context) {
        if (context != null) {
            return UMUtils.getZid(context.getApplicationContext());
        }
        return null;
    }

    private static void ignoreSdkCheck(Context context) {
        shouldCheckShareSdk = false;
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
        if (method == null || obj == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
        }
    }

    public static boolean isDebugLog() {
        return debugLog;
    }

    private static Boolean isInForeground() {
        return Boolean.valueOf(com.umeng.analytics.vshelper.b.d());
    }

    private static boolean isPreInit() {
        boolean z;
        synchronized (PreInitLock) {
            z = preInitComplete;
        }
        return z;
    }

    private static boolean isSilentMode() {
        boolean zA = c.a();
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> isSilentMode() return: " + zA);
        return zA;
    }

    private static boolean needCheckPolicyResult(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append(bz.m);
        return !new File(sb.toString()).exists();
    }

    public static boolean needSendZcfgEnv(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append(bz.l);
        return !new File(sb.toString()).exists();
    }

    public static void onActEvent(String str, String str2, Bundle bundle) {
        ck.a(str, str2, bundle);
    }

    public static void preInit(Context context, String str, String str2) {
        synchronized (lock) {
            preInitInvokedFlag = 1;
        }
        preInitInternal(context, str, str2);
    }

    private static void preInitInternal(Context context, String str, String str2) {
        if (context == null) {
            if (debugLog) {
                Log.e(TAG, "preInit: context is null, pls check!");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (SdkVersion.MINI_VERSION.equals(UMUtils.getSystemProperty("debug.umeng.rtlog", "0"))) {
            shouldOutputRT = true;
        }
        if (TextUtils.isEmpty(str)) {
            str = UMUtils.getAppkeyByXML(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = UMUtils.getChannelByXML(applicationContext);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "Unknown";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sAppkey = str;
        sChannel = str2;
        UMGlobalContext.getInstance(applicationContext);
        o.a(applicationContext);
        ck.a(applicationContext);
        if (!needSendZcfgEnv(applicationContext)) {
            FieldManager.a().a(applicationContext);
        }
        synchronized (PreInitLock) {
            preInitComplete = true;
        }
        boolean zA = c.a();
        if (debugLog && zA) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 当前处于静默模式!");
        }
    }

    public static void registerActionInfo(ActionInfo actionInfo) {
        CcgAgent.registerActionInfo(actionInfo);
    }

    public static void resetStorePath() {
        resetStorePrefix("um_");
    }

    public static void resetStorePrefix(String str) {
        be.b().a(str);
    }

    private static void setCheckDevice(boolean z) {
        AnalyticsConstants.CHECK_DEVICE = z;
    }

    public static void setCustomController(UMAnalyticsCustomController uMAnalyticsCustomController) {
        synchronized (controllerLock) {
            if (uMAnalyticsCustomController != null) {
                try {
                    customController = uMAnalyticsCustomController;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void setDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("UMLog", "setDomain: Parameter domain is null or empty string, do nothing.");
        } else {
            UMServerURL.DEFAULT_URL = str;
            UMServerURL.SECONDARY_URL = str;
        }
    }

    public static void setEncryptEnabled(boolean z) {
        com.umeng.commonsdk.statistics.b.a(z);
    }

    private static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public static void setInstallReferrer(String str, String str2) {
        d.a(str, str2);
    }

    private static void setLatencyWindow(long j) {
        a.c = ((int) j) * 1000;
    }

    public static void setLogEnabled(boolean z) {
        try {
            debugLog = z;
            MLog.DEBUG = z;
            Class<?> cls = getClass("com.umeng.message.PushAgent");
            Object decInstanceObject = getDecInstanceObject(cls);
            Class cls2 = Boolean.TYPE;
            invoke(getDecMethod(cls, KEY_METHOD_NAME_SETDEBUGMODE, new Class[]{cls2}), decInstanceObject, new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
            invoke(getDecMethod(getClass("com.umeng.umcrash.UMCrash"), "setDebug", new Class[]{cls2}), new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            if (debugLog) {
                AbstractC0924feyxiexzfUjhhgtg.m2421Ujhhgtgfeyxiexzf("set log enabled e is ", e, TAG);
            }
        } catch (Throwable th) {
            if (debugLog) {
                AbstractC0924feyxiexzfUjhhgtg.m2422Ujhhgtgfeyxiexzf("set log enabled e is ", TAG, th);
            }
        }
    }

    private static void setModuleTag(BS_TYPE bs_type, String str, String str2) {
        try {
            if (bs_type == null) {
                Log.e("UMLog", UMLogCommon.SC_10024);
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.trim().getBytes().length > 64) {
                    Log.e("UMLog", UMLogCommon.SC_10017);
                    return;
                }
                if (str2.trim().getBytes().length > 128) {
                    Log.e("UMLog", UMLogCommon.SC_10018);
                    return;
                }
                int iOrdinal = bs_type.ordinal();
                String[] strArr = BUSINESS_TYPE;
                String str3 = iOrdinal < strArr.length ? strArr[iOrdinal] : "";
                if (TextUtils.isEmpty(str3)) {
                    Log.e("UMLog", UMLogCommon.SC_10019);
                    return;
                }
                TagHelper.setModuleTag(str3 + "_" + str, str2);
                return;
            }
            Log.e("UMLog", UMLogCommon.SC_10016);
        } catch (Throwable unused) {
        }
    }

    public static void setProcessEvent(boolean z) {
        AnalyticsConstants.SUB_PROCESS_EVENT = z;
    }

    private static void setWraperType(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(WRAPER_TYPE_NATIVE)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_NATIVE;
                a.a = WRAPER_TYPE_NATIVE;
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_X)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_COCOS2DX_X;
                a.a = WRAPER_TYPE_COCOS2DX_X;
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_XLUA)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_COCOS2DX_XLUA;
                a.a = WRAPER_TYPE_COCOS2DX_XLUA;
            } else if (str.equals(WRAPER_TYPE_UNITY)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_UNITY;
                a.a = WRAPER_TYPE_UNITY;
            } else if (str.equals(WRAPER_TYPE_REACTNATIVE)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_REACTNATIVE;
                a.a = WRAPER_TYPE_REACTNATIVE;
            } else if (str.equals(WRAPER_TYPE_PHONEGAP)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_PHONEGAP;
                a.a = WRAPER_TYPE_PHONEGAP;
            } else if (str.equals(WRAPER_TYPE_WEEX)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_WEEX;
                a.a = WRAPER_TYPE_WEEX;
            } else if (str.equals(WRAPER_TYPE_HYBRID)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_HYBRID;
                a.a = WRAPER_TYPE_HYBRID;
            } else if (str.equals(WRAPER_TYPE_FLUTTER)) {
                com.umeng.commonsdk.stateless.a.a = WRAPER_TYPE_FLUTTER;
                a.a = WRAPER_TYPE_FLUTTER;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.umeng.commonsdk.stateless.a.b = str2;
        a.b = str2;
    }

    public static boolean shouldCollectAid() {
        return shouldCollectAid;
    }

    public static boolean shouldCollectApl() {
        return shouldCollectApl;
    }

    public static boolean shouldCollectIccid() {
        return shouldCollectIccid;
    }

    public static boolean shouldCollectImei() {
        return shouldCollectImei;
    }

    public static boolean shouldCollectImsi() {
        return shouldCollectImsi;
    }

    public static boolean shouldCollectOaid() {
        return shouldCollectOaid;
    }

    public static boolean shouldCollectWifiMac() {
        return shouldCollectWiFiMac;
    }

    public static boolean shouldOutput() {
        return shouldOutputRT;
    }

    public static void submitPolicyGrantResult(Context context, boolean z) {
        UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.B, com.umeng.commonsdk.internal.b.a(context).a(), null);
        synchronized (lock) {
            try {
                policyGrantInvokedFlag = 1;
                if (z) {
                    policyGrantResult = 1;
                } else {
                    policyGrantResult = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.z, com.umeng.commonsdk.internal.b.a(context).a(), Integer.valueOf(policyGrantResult));
    }

    public static void init(Context context, String str, String str2, int i, String str3) {
        Object objInvoke;
        Method declaredMethod;
        Class<?> cls;
        Method declaredMethod2;
        Method declaredMethod3;
        Object objInvoke2;
        Method declaredMethod4;
        try {
            try {
                if (debugLog) {
                    Log.i(TAG, "common version is 9.9.1");
                    Log.i(TAG, "common type is " + SdkVersion.SDK_TYPE);
                }
                if (context == null) {
                    if (debugLog) {
                        Log.e(TAG, "context is null !!!");
                        return;
                    }
                    return;
                }
                if (isInit) {
                    if (debugLog) {
                        Log.e(TAG, "has inited !!!");
                        return;
                    }
                    return;
                }
                final Context applicationContext = context.getApplicationContext();
                UMGlobalContext.getInstance(applicationContext);
                if (c.a()) {
                    if (!isPreInit()) {
                        preInitInternal(applicationContext, str, str2);
                        if (!isPreInit()) {
                            return;
                        }
                    }
                    UMWorkDispatch.sendEvent(applicationContext, com.umeng.commonsdk.internal.a.D, com.umeng.commonsdk.internal.b.a(applicationContext).a(), null);
                    return;
                }
                if (getClass("com.umeng.umzid.ZIDManager") == null) {
                    Log.e(TAG, "--->>> SDK 初始化失败，请检查是否集成umeng-asms-1.2.x.aar库。<<<--- ");
                    new Thread() { // from class: com.umeng.commonsdk.UMConfigure.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Looper.prepare();
                                Toast.makeText(applicationContext, "SDK 初始化失败，请检查是否集成umeng-asms-1.2.X.aar库。", 1).show();
                                Looper.loop();
                            } catch (Throwable unused) {
                            }
                        }
                    }.start();
                    return;
                }
                try {
                    Class<?> cls2 = getClass("com.umeng.message.PushAgent");
                    if (cls2 != null && !checkShareSdk(cls2)) {
                        Log.e("UMLog", UMLogCommon.SC_10015);
                        if (shouldCheckShareSdk) {
                            new Thread() { // from class: com.umeng.commonsdk.UMConfigure.2
                                @Override // java.lang.Thread, java.lang.Runnable
                                public void run() {
                                    try {
                                        Looper.prepare();
                                        Toast.makeText(applicationContext, UMLogCommon.SC_10015, 1).show();
                                        Looper.loop();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }.start();
                        }
                    }
                } catch (Throwable unused) {
                }
                try {
                    Class<?> cls3 = getClass("com.umeng.socialize.UMShareAPI");
                    if (cls3 != null && !checkShareSdk(cls3)) {
                        Log.e("UMLog", UMLogCommon.SC_10015);
                        if (shouldCheckShareSdk) {
                            new Thread() { // from class: com.umeng.commonsdk.UMConfigure.3
                                @Override // java.lang.Thread, java.lang.Runnable
                                public void run() {
                                    try {
                                        Looper.prepare();
                                        Toast.makeText(applicationContext, UMLogCommon.SC_10015, 1).show();
                                        Looper.loop();
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }.start();
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (!isPreInit()) {
                    preInitInternal(applicationContext, str, str2);
                    if (!isPreInit()) {
                        return;
                    }
                }
                UMEnvelopeBuild.registerNetReceiver(applicationContext);
                UMUtils.setAppkey(applicationContext, sAppkey);
                String lastAppkey = UMUtils.getLastAppkey(applicationContext);
                if (!TextUtils.isEmpty(sAppkey) && !sAppkey.equals(lastAppkey)) {
                    if (!TextUtils.isEmpty(lastAppkey) && debugLog) {
                        UMLog.mutlInfo(UMLogCommon.SC_10008, 2, "");
                    }
                    UMUtils.setLastAppkey(applicationContext, sAppkey);
                }
                if (debugLog) {
                    Log.i(TAG, "current appkey is " + sAppkey + ", last appkey is " + lastAppkey);
                }
                if (debugLog) {
                    String appkeyByXML = UMUtils.getAppkeyByXML(applicationContext);
                    if (!TextUtils.isEmpty(sAppkey) && !TextUtils.isEmpty(appkeyByXML) && !sAppkey.equals(appkeyByXML)) {
                        UMLog.mutlInfo(UMLogCommon.SC_10011, 3, "", new String[]{"@", "#"}, new String[]{sAppkey, appkeyByXML});
                    }
                }
                UMUtils.setChannel(applicationContext, sChannel);
                if (debugLog) {
                    Log.i(TAG, "channel is " + sChannel);
                }
                try {
                    Method declaredMethod5 = MobclickAgent.class.getDeclaredMethod("init", Context.class);
                    if (declaredMethod5 != null) {
                        declaredMethod5.setAccessible(true);
                        declaredMethod5.invoke(MobclickAgent.class, applicationContext);
                        if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> FirstResumeTrigger enabled.");
                            o.a(applicationContext).b(applicationContext);
                        } else {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> FirstResumeTrigger disabled.");
                        }
                        if (debugLog) {
                            UMLog.mutlInfo(UMLogCommon.SC_10003, 2, "");
                        }
                    }
                    Class.forName("com.umeng.analytics.game.UMGameAgent");
                    Method declaredMethod6 = MobclickAgent.class.getDeclaredMethod("setGameScenarioType", Context.class);
                    if (declaredMethod6 != null) {
                        declaredMethod6.setAccessible(true);
                        declaredMethod6.invoke(MobclickAgent.class, applicationContext);
                    }
                    if (com.umeng.commonsdk.statistics.b.a.indexOf("e") >= 0 && (declaredMethod4 = MobclickAgent.class.getDeclaredMethod("disableExceptionCatch", null)) != null) {
                        declaredMethod4.setAccessible(true);
                        declaredMethod4.invoke(MobclickAgent.class, null);
                    }
                } catch (Throwable unused3) {
                }
                try {
                    Class<?> cls4 = Class.forName("com.umeng.message.PushAgent");
                    Method declaredMethod7 = cls4.getDeclaredMethod("init", Context.class);
                    if (declaredMethod7 != null) {
                        declaredMethod7.setAccessible(true);
                        declaredMethod7.invoke(cls4, applicationContext);
                    }
                } catch (Throwable unused4) {
                }
                try {
                    Class<?> cls5 = Class.forName("com.umeng.message.MessageSharedPrefs");
                    Method declaredMethod8 = cls5.getDeclaredMethod("getInstance", Context.class);
                    if (declaredMethod8 != null && (objInvoke2 = declaredMethod8.invoke(cls5, applicationContext)) != null) {
                        Method declaredMethod9 = cls5.getDeclaredMethod("setMessageAppKey", String.class);
                        if (declaredMethod9 != null) {
                            declaredMethod9.setAccessible(true);
                            declaredMethod9.invoke(objInvoke2, sAppkey);
                            if (debugLog) {
                                UMLog.mutlInfo(UMLogCommon.SC_10004, 2, "");
                            }
                        }
                        Method declaredMethod10 = cls5.getDeclaredMethod(KEY_METHOD_NAME_PUSH_SETCHANNEL, String.class);
                        if (declaredMethod10 != null) {
                            declaredMethod10.setAccessible(true);
                            declaredMethod10.invoke(objInvoke2, sChannel);
                            if (debugLog) {
                                UMLog.mutlInfo(UMLogCommon.SC_10005, 2, "");
                            }
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            if (debugLog) {
                                Log.i(TAG, "push secret is " + str3);
                            }
                            Method declaredMethod11 = cls5.getDeclaredMethod("setMessageAppSecret", String.class);
                            if (declaredMethod11 != null) {
                                declaredMethod11.setAccessible(true);
                                declaredMethod11.invoke(objInvoke2, str3);
                                if (debugLog) {
                                    UMLog.mutlInfo(UMLogCommon.SC_10009, 2, "");
                                }
                            }
                        }
                    }
                } catch (Exception unused5) {
                }
                try {
                    Class<?> cls6 = getClass("com.umeng.socialize.UMShareAPI");
                    setFile(cls6, KEY_FILE_NAME_APPKEY, sAppkey);
                    if (cls6 != null && (declaredMethod3 = cls6.getDeclaredMethod("init", Context.class, String.class)) != null) {
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(cls6, applicationContext, sAppkey);
                        if (debugLog) {
                            UMLog.mutlInfo(UMLogCommon.SC_10006, 2, "");
                        }
                    }
                } catch (Throwable unused6) {
                }
                AnalyticsConstants.setDeviceType(i);
                try {
                    Class<?> cls7 = Class.forName("com.umeng.error.UMError");
                    Method declaredMethod12 = cls7.getDeclaredMethod("init", Context.class);
                    if (declaredMethod12 != null) {
                        declaredMethod12.setAccessible(true);
                        declaredMethod12.invoke(cls7, applicationContext);
                        if (debugLog) {
                            UMLog.mutlInfo(UMLogCommon.SC_10010, 2, "");
                        }
                    }
                } catch (Throwable unused7) {
                }
                try {
                    if (getClass("com.umeng.umefs.UMEfs") == null && (cls = getClass("com.umeng.umcrash.UMCrash")) != null) {
                        if (SdkVersion.SDK_TYPE == 1 && (declaredMethod2 = cls.getDeclaredMethod("useIntlServices", Boolean.TYPE)) != null) {
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(cls, Boolean.TRUE);
                        }
                        Method declaredMethod13 = cls.getDeclaredMethod("init", Context.class, String.class, String.class);
                        if (declaredMethod13 != null) {
                            declaredMethod13.setAccessible(true);
                            declaredMethod13.invoke(cls, applicationContext, sAppkey, sChannel);
                            if (debugLog) {
                                UMLog.mutlInfo(UMLogCommon.SC_10014, 2, "");
                            }
                        }
                    }
                } catch (Throwable unused8) {
                }
                try {
                    Method declaredMethod14 = Class.forName("com.umeng.vt.facade.EventFacade").getDeclaredMethod("init", Application.class, String.class, String.class, Integer.TYPE, String.class);
                    if (declaredMethod14 != null) {
                        declaredMethod14.invoke(null, applicationContext, sAppkey, sChannel, Integer.valueOf(i), str3);
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>初始化 EventFacade 成功.");
                    }
                } catch (Throwable unused9) {
                }
                try {
                    Method declaredMethod15 = Class.forName("com.umeng.vt.common.VTTracker").getDeclaredMethod("init", Application.class, String.class);
                    if (declaredMethod15 != null) {
                        declaredMethod15.invoke(null, applicationContext, sAppkey);
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>初始化 VTTracker 成功.");
                    }
                } catch (Throwable unused10) {
                }
                synchronized (lockObject) {
                    isFinish = true;
                }
                if (needCheckPolicyResult(applicationContext)) {
                    synchronized (lock) {
                        try {
                            if (preInitInvokedFlag == 0) {
                                Log.e(TAG, UMLogCommon.SC_10026);
                            }
                            if (policyGrantResult == 0) {
                                Log.e(TAG, UMLogCommon.SC_10028);
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(com.umeng.commonsdk.internal.a.J, preInitInvokedFlag);
                                jSONObject.put(com.umeng.commonsdk.internal.a.K, policyGrantInvokedFlag);
                                jSONObject.put("policyGrantResult", policyGrantResult);
                                UMWorkDispatch.sendEvent(applicationContext, com.umeng.commonsdk.internal.a.A, com.umeng.commonsdk.internal.b.a(applicationContext).a(), jSONObject);
                            } catch (Throwable unused11) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (needSendZcfgEnv(applicationContext)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 走零号报文发送逻辑");
                    UMWorkDispatch.sendEvent(applicationContext, com.umeng.commonsdk.internal.a.p, com.umeng.commonsdk.internal.b.a(applicationContext).a(), null);
                } else if (UMUtils.isMainProgress(applicationContext)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 走正常逻辑.");
                    if (FieldManager.b()) {
                        UMWorkDispatch.sendEvent(applicationContext, com.umeng.commonsdk.internal.a.y, com.umeng.commonsdk.internal.b.a(applicationContext).a(), null);
                    }
                    if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                        com.umeng.commonsdk.internal.c.a(applicationContext, false);
                    }
                }
                try {
                    if (UMUtils.isMainProgress(applicationContext)) {
                        cz.b(applicationContext);
                        cm.a(context, 105, cn.a(), null);
                    }
                } catch (Throwable unused12) {
                }
                if (isDebugLog()) {
                    UMConfigureInternation.doSelfCheck(applicationContext);
                }
                try {
                    Context applicationContext2 = context.getApplicationContext();
                    Class<?> cls8 = Class.forName("com.umeng.cconfig.UMRemoteConfig");
                    Method declaredMethod16 = cls8.getDeclaredMethod("getInstance", null);
                    if (declaredMethod16 != null && (objInvoke = declaredMethod16.invoke(cls8, null)) != null && (declaredMethod = cls8.getDeclaredMethod("init", Context.class)) != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(objInvoke, applicationContext2);
                    }
                } catch (Exception unused13) {
                }
                UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.F, com.umeng.commonsdk.internal.b.a(context).a(), null);
                if (!isInit) {
                    isInit = true;
                }
                initCompleteTs = System.currentTimeMillis();
                if (debugLog) {
                    UMLog.mutlInfo(UMLogCommon.SC_10029, 2, "");
                }
            } catch (Exception e) {
                if (debugLog) {
                    AbstractC0924feyxiexzfUjhhgtg.m2421Ujhhgtgfeyxiexzf("init e is ", e, TAG);
                }
            }
        } catch (Throwable th2) {
            if (debugLog) {
                AbstractC0924feyxiexzfUjhhgtg.m2422Ujhhgtgfeyxiexzf("init e is ", TAG, th2);
            }
        }
    }

    private static void invoke(Method method, Object[] objArr) {
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
