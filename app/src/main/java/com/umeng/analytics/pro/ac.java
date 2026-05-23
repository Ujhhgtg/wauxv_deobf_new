package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.CcgAgent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ac implements ak {
    private String a;
    private ArrayList<ad> b;
    private String c;
    private String d;
    private String e;
    private String f;

    public ac(String str, ArrayList<ad> arrayList) {
        this.a = null;
        new ArrayList();
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = str;
        this.b = arrayList;
    }

    public String a() {
        return this.a;
    }

    @Override // com.umeng.analytics.pro.ak
    public void b(String str, JSONObject jSONObject) {
    }

    public String c() {
        return this.d;
    }

    private String c(String str) {
        String[] strArrSplit = str.split(",");
        String str2 = "";
        if (strArrSplit.length > 0) {
            ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(this.a);
            if (forbidSdkArray == null || forbidSdkArray.size() <= 0) {
                for (String str3 : strArrSplit) {
                    ActionInfo actionInfo = CcgAgent.getActionInfo(str3);
                    if (actionInfo != null) {
                        String[] supportAction = actionInfo.getSupportAction(UMGlobalContext.getAppContext());
                        if (supportAction.length > 0) {
                            for (String str4 : supportAction) {
                                if (this.a.equals(str4)) {
                                    str2 = str3;
                                    break;
                                }
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                return str2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                this.f = forbidSdkArray.toString();
                for (String str5 : strArrSplit) {
                    if (CcgAgent.getActionInfo(str5) != null && !forbidSdkArray.contains(str5)) {
                        return str5;
                    }
                }
            }
        }
        return str2;
    }

    public void a(String str) {
        this.c = str;
    }

    public String b() {
        return this.c;
    }

    @Override // com.umeng.analytics.pro.ak
    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            int size = this.b.size();
            if (size == 0) {
                return null;
            }
            for (int i = 0; i < size; i++) {
                if (this.b.get(i).b()) {
                    return null;
                }
            }
            if (CcgAgent.hasRegistedActionInfo() && !TextUtils.isEmpty(this.d)) {
                String strC = c(this.d);
                this.e = strC;
                if (TextUtils.isEmpty(strC)) {
                    UMRTLog.i("MobclickRT", "采集项：" + this.a + "; 未选中可用Module ; sdk: " + this.d);
                } else {
                    UMRTLog.i("MobclickRT", "采集项：" + this.a + "; 选中Module: " + this.e + "; sdk: " + this.d);
                }
            }
            ad adVar = this.b.get(size - 1);
            if (adVar == null || !(adVar instanceof ag)) {
                return null;
            }
            long jC = adVar.c();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("actionName", this.a);
                jSONObject2.put("sdk", this.d);
                jSONObject2.put("hit_sdk", this.c);
                jSONObject2.put("delay", jC);
                jSONObject2.put("local_hit_sdk", this.e);
                jSONObject2.put("forbid_sdk", this.f);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void b(String str) {
        this.d = str;
    }
}
