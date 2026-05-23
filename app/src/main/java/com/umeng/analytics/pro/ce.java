package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ce implements cd {
    private static final String a = "cache_domain";
    private static volatile String b = "";

    /* JADX INFO: compiled from: obf */
    public static class a {
        public static final ce a = new ce();

        private a() {
        }
    }

    public static ce b() {
        return "cache_domain".a;
    }

    private void d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
        if (sharedPreferences != null) {
            b = sharedPreferences.getString("cache_domain", "");
        }
    }

    private void e() {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("cache_domain", b).commit();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.cd
    public void a() {
    }

    public String c() {
        return b;
    }

    private ce() {
        d();
    }

    @Override // com.umeng.analytics.pro.cd
    public void a(Throwable th) {
    }

    @Override // com.umeng.analytics.pro.cd
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("Status") && jSONObject.getInt("Status") == 0 && jSONObject.has("Answer")) {
                String strOptString = jSONObject.optString("Answer");
                String strOptString2 = "";
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                if (jSONObject.has("ip")) {
                    strOptString2 = jSONObject.optString("ip");
                }
                UMRTLog.i("MobclickRT", "--->>> domain下发结果：" + strOptString);
                if (!TextUtils.isEmpty(strOptString2)) {
                    UMRTLog.i("MobclickRT", "--->>> 对应domain下发请求ip：" + strOptString2);
                }
                b = strOptString;
                e();
            }
        } catch (Throwable unused) {
        }
    }
}
