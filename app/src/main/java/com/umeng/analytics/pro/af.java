package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class af extends ac {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private ArrayList<Pair<String, Integer>> f;
    private int g;

    public af(String str, ArrayList<ad> arrayList) {
        super(str, arrayList);
        this.c = 60;
        this.d = 180;
    }

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.c = i;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return at.a(this.c, this.d);
    }

    public ArrayList<Pair<String, Integer>> j() {
        return this.f;
    }

    @Override // com.umeng.analytics.pro.ac
    public String a() {
        return super.a();
    }

    @Override // com.umeng.analytics.pro.ac
    public String b() {
        return super.b();
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(new String(ay.a(Base64.decode(str, 0), UMUtils.genSin())));
            int length = jSONArray.length();
            if (length > 0) {
                this.f = new ArrayList<>();
            }
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.has(g.y) ? jSONObject.optString(g.y) : "";
                int iValueOf = jSONObject.has("mock") ? Integer.valueOf(jSONObject.optInt("mock")) : 1;
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f.add(new Pair<>(strOptString, iValueOf));
                }
            }
            this.e = this.f.size();
            this.g = 0;
        } catch (Throwable unused) {
        }
    }

    public void d(int i) {
        this.d = i;
    }

    @Override // com.umeng.analytics.pro.ac
    public void a(String str) {
        super.a(str);
    }

    @Override // com.umeng.analytics.pro.ac
    public void b(String str) {
        super.b(str);
    }

    public JSONObject d(String str) {
        JSONObject jSONObject = null;
        try {
            if (this.g < this.e) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String str2 = (String) this.f.get(this.g).first;
                    int iIntValue = ((Integer) this.f.get(this.g).second).intValue();
                    jSONObject2.put("target", str2);
                    jSONObject2.put("mock", iIntValue);
                    jSONObject2.put("index", this.g);
                    jSONObject2.put("actionName", str);
                    jSONObject2.put("sdk", c());
                    jSONObject2.put("hit_sdk", "uapp");
                    jSONObject2.put("local_hit_sdk", "");
                    jSONObject2.put("forbid_sdk", "");
                    jSONObject2.put("act_when", this.b);
                    jSONObject2.put("sel_policy", this.a);
                    int i = i();
                    jSONObject2.put("delay", i);
                    UMRTLog.i("MobclickRT", "getNextTypeArg():: currIndex: " + this.g + "; delay: " + i);
                    this.g = this.g + 1;
                    return jSONObject2;
                } catch (Throwable unused) {
                    jSONObject = jSONObject2;
                }
            } else {
                this.g = 0;
            }
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        int i;
        if (jSONObject != null) {
            try {
                int i2 = this.a;
                int i3 = 0;
                if (i2 == 0) {
                    SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
                    if (sharedPreferencesA != null) {
                        int i4 = sharedPreferencesA.getInt("last_type_index", 0);
                        if (i4 < this.e) {
                            String str = (String) this.f.get(i4).first;
                            int iIntValue = ((Integer) this.f.get(i4).second).intValue();
                            jSONObject.put("target", str);
                            jSONObject.put("mock", iIntValue);
                            jSONObject.put("index", i4);
                            UMRTLog.i("MobclickRT", "selPoclicy: 0, currIndex: " + i4);
                            if (i4 < this.e - 1) {
                                i3 = i4 + 1;
                            }
                        } else {
                            String str2 = (String) this.f.get(0).first;
                            int iIntValue2 = ((Integer) this.f.get(0).second).intValue();
                            jSONObject.put("target", str2);
                            jSONObject.put("mock", iIntValue2);
                            jSONObject.put("index", 0);
                        }
                        sharedPreferencesA.edit().putInt("last_type_index", i3).commit();
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    int randNumber = DeviceConfig.getRandNumber(0, this.e - 1);
                    String str3 = (String) this.f.get(randNumber).first;
                    int iIntValue3 = ((Integer) this.f.get(randNumber).second).intValue();
                    jSONObject.put("target", str3);
                    jSONObject.put("mock", iIntValue3);
                    UMRTLog.i("MobclickRT", "selPoclicy: 1, currIndex: " + randNumber);
                    return;
                }
                if (i2 != 2 || (i = this.g) >= this.e) {
                    return;
                }
                String str4 = (String) this.f.get(i).first;
                int iIntValue4 = ((Integer) this.f.get(this.g).second).intValue();
                jSONObject.put("target", str4);
                jSONObject.put("mock", iIntValue4);
                jSONObject.put("index", this.g);
                UMRTLog.i("MobclickRT", "processInternal():: selPoclicy: 2, currIndex: " + this.g);
                this.g = this.g + 1;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.umeng.analytics.pro.ac, com.umeng.analytics.pro.ak
    public void b(String str, JSONObject jSONObject) {
        super.b(str, jSONObject);
        if (jSONObject.has("sel_policy")) {
            a(jSONObject.optInt("sel_policy"));
        }
        if (jSONObject.has("act_when")) {
            b(jSONObject.optInt("act_when"));
        }
        if (jSONObject.has("signature")) {
            c(jSONObject.optString("signature"));
        }
        if (jSONObject.has("min_delay")) {
            c(jSONObject.optInt("min_delay"));
        }
        if (jSONObject.has("max_delay")) {
            d(jSONObject.optInt("max_delay"));
        }
    }

    @Override // com.umeng.analytics.pro.ac
    public String c() {
        return super.c();
    }

    @Override // com.umeng.analytics.pro.ac, com.umeng.analytics.pro.ak
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectA = super.a(str, jSONObject);
        if (this.e == 0) {
            return null;
        }
        if (jSONObject != null) {
            try {
                jSONObjectA.put("act_when", this.b);
                jSONObjectA.put("sel_policy", this.a);
                int iOptInt = jSONObject.optInt("scene");
                if (this.b == 0 && iOptInt == 202) {
                    a(jSONObjectA);
                }
                if (this.b == 1 && iOptInt == 304) {
                    a(jSONObjectA);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObjectA;
    }
}
