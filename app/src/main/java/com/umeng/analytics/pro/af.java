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
        this.d = Opcodes.GETFIELD;
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
                int iValueOf = jSONObject.has(com.umeng.ccg.a.G) ? Integer.valueOf(jSONObject.optInt(com.umeng.ccg.a.G)) : 1;
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
                    jSONObject2.put(com.umeng.ccg.a.F, str2);
                    jSONObject2.put(com.umeng.ccg.a.G, iIntValue);
                    jSONObject2.put(com.umeng.ccg.a.H, this.g);
                    jSONObject2.put("actionName", str);
                    jSONObject2.put(com.umeng.ccg.a.x, c());
                    jSONObject2.put(com.umeng.ccg.a.u, "uapp");
                    jSONObject2.put(com.umeng.ccg.a.v, "");
                    jSONObject2.put(com.umeng.ccg.a.w, "");
                    jSONObject2.put(com.umeng.ccg.a.C, this.b);
                    jSONObject2.put(com.umeng.ccg.a.B, this.a);
                    int i = i();
                    jSONObject2.put("delay", i);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "getNextTypeArg():: currIndex: " + this.g + "; delay: " + i);
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
                        int i4 = sharedPreferencesA.getInt(av.h, 0);
                        if (i4 < this.e) {
                            String str = (String) this.f.get(i4).first;
                            int iIntValue = ((Integer) this.f.get(i4).second).intValue();
                            jSONObject.put(com.umeng.ccg.a.F, str);
                            jSONObject.put(com.umeng.ccg.a.G, iIntValue);
                            jSONObject.put(com.umeng.ccg.a.H, i4);
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "selPoclicy: 0, currIndex: " + i4);
                            if (i4 < this.e - 1) {
                                i3 = i4 + 1;
                            }
                        } else {
                            String str2 = (String) this.f.get(0).first;
                            int iIntValue2 = ((Integer) this.f.get(0).second).intValue();
                            jSONObject.put(com.umeng.ccg.a.F, str2);
                            jSONObject.put(com.umeng.ccg.a.G, iIntValue2);
                            jSONObject.put(com.umeng.ccg.a.H, 0);
                        }
                        sharedPreferencesA.edit().putInt(av.h, i3).commit();
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    int randNumber = DeviceConfig.getRandNumber(0, this.e - 1);
                    String str3 = (String) this.f.get(randNumber).first;
                    int iIntValue3 = ((Integer) this.f.get(randNumber).second).intValue();
                    jSONObject.put(com.umeng.ccg.a.F, str3);
                    jSONObject.put(com.umeng.ccg.a.G, iIntValue3);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "selPoclicy: 1, currIndex: " + randNumber);
                    return;
                }
                if (i2 != 2 || (i = this.g) >= this.e) {
                    return;
                }
                String str4 = (String) this.f.get(i).first;
                int iIntValue4 = ((Integer) this.f.get(this.g).second).intValue();
                jSONObject.put(com.umeng.ccg.a.F, str4);
                jSONObject.put(com.umeng.ccg.a.G, iIntValue4);
                jSONObject.put(com.umeng.ccg.a.H, this.g);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "processInternal():: selPoclicy: 2, currIndex: " + this.g);
                this.g = this.g + 1;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.umeng.analytics.pro.ac, com.umeng.analytics.pro.ak
    public void b(String str, JSONObject jSONObject) {
        super.b(str, jSONObject);
        if (jSONObject.has(com.umeng.ccg.a.B)) {
            a(jSONObject.optInt(com.umeng.ccg.a.B));
        }
        if (jSONObject.has(com.umeng.ccg.a.C)) {
            b(jSONObject.optInt(com.umeng.ccg.a.C));
        }
        if (jSONObject.has(com.umeng.ccg.a.A)) {
            c(jSONObject.optString(com.umeng.ccg.a.A));
        }
        if (jSONObject.has(com.umeng.ccg.a.D)) {
            c(jSONObject.optInt(com.umeng.ccg.a.D));
        }
        if (jSONObject.has(com.umeng.ccg.a.E)) {
            d(jSONObject.optInt(com.umeng.ccg.a.E));
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
                jSONObjectA.put(com.umeng.ccg.a.C, this.b);
                jSONObjectA.put(com.umeng.ccg.a.B, this.a);
                int iOptInt = jSONObject.optInt(com.umeng.ccg.a.j);
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
