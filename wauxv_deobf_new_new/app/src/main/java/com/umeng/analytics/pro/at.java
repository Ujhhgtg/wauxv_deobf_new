package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.sdk.UYMManager;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class at {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(Context context, String str, String str2) {
        return context == null ? str2 : UMEnvelopeBuild.imprintProperty(context, str, str2);
    }

    public static void a(Context context, String str) {
        try {
            Method declaredMethod = UYMManager.class.getDeclaredMethod("processEvent", Context.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(UYMManager.class, context, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(bv.aZ, com.umeng.commonsdk.internal.a.e);
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
            map.put(bv.ba, UMUtils.VALUE_ANALYTICS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
            map.put(bv.bb, UMUtils.VALUE_GAME_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
            map.put(bv.bc, UMUtils.VALUE_PUSH_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
            map.put(bv.bd, UMUtils.VALUE_SHARE_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
            map.put(bv.be, UMUtils.VALUE_APM_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
            map.put(bv.bf, UMUtils.VALUE_VERIFY_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
            map.put(bv.bg, UMUtils.VALUE_SMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
            map.put(bv.bh, UMUtils.VALUE_REC_VERSION_NAME);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
            map.put(bv.bi, UMUtils.VALUE_VISUAL_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
            map.put(bv.bj, UMUtils.VALUE_ASMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
            map.put(bv.bk, UMUtils.VALUE_LINK_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
            map.put(bv.bl, UMUtils.VALUE_ABTEST_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANTI_VERSION)) {
            map.put(bv.bm, UMUtils.VALUE_ANTI_VERSION);
        }
        return map;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        String str;
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String strValueOf = String.valueOf(itKeys.next());
                if (!TextUtils.isEmpty(strValueOf) && (str = (String) jSONObject.get(strValueOf)) != null) {
                    map.put(strValueOf, str);
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static int a(int i, int i2) {
        return i >= i2 ? i2 : new Random().nextInt(i2 - i) + i + 1;
    }
}
