package com.umeng.ccg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CcgAgent {
    private static Object lock = new Object();
    private static Object configUpdateLock = new Object();
    private static ArrayList<ConfigListener> callbacks = new ArrayList<>();
    private static ArrayList<ConfigUpdateListener> updateCallbacks = new ArrayList<>();
    private static Object actionInfoLock = new Object();
    private static Map<String, ActionInfo> actionInfoTable = new HashMap();
    private static Map<String, ArrayList<String>> forbidSdkTable = new HashMap();
    private static volatile int actUpFlag = 0;
    private static volatile long actUpTs = 0;

    static {
        forbidSdkTable.put(a.e, new ArrayList<>());
        forbidSdkTable.put(a.d, new ArrayList<>());
        forbidSdkTable.put(a.b, new ArrayList<>());
        forbidSdkTable.put(a.c, new ArrayList<>());
    }

    public static int getActUpFlag() {
        return actUpFlag;
    }

    public static Map<String, String> getActUpInfo() {
        HashMap map = new HashMap();
        map.put("flag", String.valueOf(actUpFlag));
        map.put("ts", String.valueOf(actUpTs));
        return map;
    }

    public static ActionInfo getActionInfo(String str) {
        ActionInfo actionInfo;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (actionInfoLock) {
            try {
                actionInfo = actionInfoTable.containsKey(str) ? actionInfoTable.get(str) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return actionInfo;
    }

    public static String[] getCollectItemList() {
        return new String[]{a.e, a.d, a.b, a.c};
    }

    public static void getConfigInfo(ConfigResult configResult) {
        if (configResult != null) {
            configResult.onConfigInfo(d.a().b(UMGlobalContext.getAppContext()));
        }
    }

    public static ArrayList<String> getForbidSdkArray(String str) {
        if (forbidSdkTable.containsKey(str)) {
            return forbidSdkTable.get(str);
        }
        return null;
    }

    public static ArrayList<String> getRegistedModuleList() {
        ArrayList<String> arrayList;
        synchronized (actionInfoLock) {
            arrayList = new ArrayList<>(actionInfoTable.keySet());
        }
        return arrayList;
    }

    public static boolean hasRegistedActionInfo() {
        boolean z;
        synchronized (actionInfoLock) {
            z = actionInfoTable.size() > 0;
        }
        return z;
    }

    public static void init(Context context) {
        d.a().a(context);
    }

    public static void notifyConfigChanged(JSONObject jSONObject) {
        synchronized (configUpdateLock) {
            try {
                int size = updateCallbacks.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        updateCallbacks.get(i).onConfigUpdate(jSONObject);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void notifyConfigReady(JSONObject jSONObject) {
        synchronized (lock) {
            try {
                int size = callbacks.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        callbacks.get(i).onConfigReady(jSONObject);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void onActUpEvent(String str, String str2, Bundle bundle) {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "umc_cfg: call b a.");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "onActUpEvent: type or token agument is empty string, pls check!");
            MLog.e("onActUpEvent: type、token参数不能为null或者空字符串！");
            return;
        }
        String string = "";
        if (bundle != null) {
            try {
                string = bundle.getString("ss");
            } catch (Throwable unused) {
                return;
            }
        }
        String str3 = string;
        boolean z = true;
        actUpFlag = 1;
        actUpTs = System.currentTimeMillis();
        long initCompleteTs = UMConfigure.getInitCompleteTs();
        if (initCompleteTs != 0 && System.currentTimeMillis() - initCompleteTs > 6000) {
            z = false;
        }
        boolean z2 = z;
        JSONObject jSONObjectA = d.a().a(str, str2, str3, actUpTs, z2);
        if (jSONObjectA != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "umc_cfg: upload b a. cd_flag is " + z2);
            aw.a(new ar(ar.b, jSONObjectA), 0L, TimeUnit.SECONDS);
            Thread.sleep(2000L);
        }
    }

    public static void registerActionInfo(ActionInfo actionInfo) {
        Context appContext = UMGlobalContext.getAppContext();
        if (actionInfo != null) {
            synchronized (actionInfoLock) {
                try {
                    String module = actionInfo.getModule(UMGlobalContext.getAppContext());
                    if (!TextUtils.isEmpty(module) && !actionInfoTable.containsKey(module)) {
                        String[] supportAction = actionInfo.getSupportAction(appContext);
                        if (supportAction != null) {
                            for (String str : supportAction) {
                                boolean switchState = actionInfo.getSwitchState(appContext, str);
                                if (forbidSdkTable.containsKey(str)) {
                                    ArrayList<String> arrayList = forbidSdkTable.get(str);
                                    if (!switchState) {
                                        arrayList.add(module);
                                    }
                                }
                            }
                        }
                        actionInfoTable.put(module, actionInfo);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void registerConfigListener(ConfigListener configListener) {
        if (configListener != null) {
            synchronized (lock) {
                callbacks.add(configListener);
            }
        }
    }

    public static void registerConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        if (configUpdateListener != null) {
            synchronized (configUpdateLock) {
                updateCallbacks.add(configUpdateListener);
            }
        }
    }
}
