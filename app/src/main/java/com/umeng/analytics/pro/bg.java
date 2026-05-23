package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bg {
    private static bf a = null;
    private static String b = null;
    private static boolean c = false;

    public static synchronized String a(Context context) {
        if (!UMConfigure.shouldCollectOaid()) {
            UMRTLog.i("MobclickRT", "--->>>*** OpenDeviceId.getOAID(): oaid开关已关闭。");
            return null;
        }
        UMRTLog.i("MobclickRT", "--->>>*** real call OpenDeviceId.getOaid()");
        if (context == null) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        if (a == null) {
            a = bi.a();
        }
        bf bfVar = a;
        if (bfVar != null) {
            try {
                String strA = bfVar.a(context);
                if (!TextUtils.isEmpty(strA)) {
                    b = strA;
                }
                c = true;
                UMRTLog.i("MobclickRT", "OpenDeviceId:getOAID() result: " + b);
                return b;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String b(Context context) {
        if (UMConfigure.shouldCollectOaid()) {
            return c ? b : a(context);
        }
        UMRTLog.i("MobclickRT", "--->>>*** OpenDeviceId.getOAIDFromCache(): oaid开关已关闭。");
        return null;
    }

    @Deprecated
    public static synchronized String c(Context context) {
        if (UMConfigure.shouldCollectOaid()) {
            return null;
        }
        UMRTLog.i("MobclickRT", "--->>>*** OpenDeviceId.getHonorCompatibleOaid(): oaid开关已关闭。");
        return null;
    }

    @Deprecated
    public static synchronized String d(Context context) {
        if (UMConfigure.shouldCollectOaid()) {
            return null;
        }
        UMRTLog.i("MobclickRT", "--->>>*** OpenDeviceId.getHonorCompatibleOaidFromCache(): oaid开关已关闭。");
        return null;
    }
}
