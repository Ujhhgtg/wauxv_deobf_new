package com.umeng.analytics.pro;

import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cx {
    private int a;
    private String b;
    private String c;
    private int d;
    private a e;

    /* JADX INFO: compiled from: obf */
    public static class a {
        private String a;
        private String b;
        private String c;
        private String d;
        private List<b> e;

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public List<b> e() {
            return this.e;
        }

        public void a(String str) {
            this.a = str;
        }

        public void b(String str) {
            this.b = str;
        }

        public void c(String str) {
            this.c = str;
        }

        public void d(String str) {
            this.d = str;
        }

        public void a(List<b> list) {
            this.e = list;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b {
        private List<Integer> a;
        private String b;
        private List<Integer> c;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;

        public List<Integer> a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public List<Integer> c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }

        public String g() {
            return this.g;
        }

        public String h() {
            return this.h;
        }

        public void a(List<Integer> list) {
            this.a = list;
        }

        public void b(List<Integer> list) {
            this.c = list;
        }

        public void c(String str) {
            this.f = str;
        }

        public void d(String str) {
            this.g = str;
        }

        public void e(String str) {
            this.h = str;
        }

        public void a(String str) {
            this.b = str;
        }

        public void b(String str) {
            this.e = str;
        }

        public void a(int i) {
            this.d = i;
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public a e() {
        return this.e;
    }

    public void a(int i) {
        this.a = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public static cx a(JSONObject jSONObject) {
        cx cxVar = new cx();
        if (jSONObject != null) {
            try {
                cxVar.a(jSONObject.optInt("code"));
                cxVar.a(jSONObject.optString("msg"));
                cxVar.b(jSONObject.optString("version"));
                cxVar.b(jSONObject.optInt("status"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    a aVar = new a();
                    aVar.a(jSONObjectOptJSONObject.optString("delayTimes"));
                    aVar.b(jSONObjectOptJSONObject.optString("batchCount"));
                    aVar.c(jSONObjectOptJSONObject.optString("batchInterval"));
                    aVar.d(jSONObjectOptJSONObject.optString("actWhen"));
                    if (jSONObjectOptJSONObject.has("targets")) {
                        String strOptString = jSONObjectOptJSONObject.optString("targets");
                        if (!TextUtils.isEmpty(strOptString)) {
                            try {
                                JSONArray jSONArray = new JSONArray(new String(ay.a(Base64.decode(strOptString, 0), UMUtils.genSin())));
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                                    if (jSONObjectOptJSONObject2 != null) {
                                        b bVar = new b();
                                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("excludeWeekDays");
                                        if (jSONArrayOptJSONArray != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                                arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i2)));
                                            }
                                            bVar.a(arrayList2);
                                        }
                                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("excludeHours");
                                        if (jSONArrayOptJSONArray2 != null) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                                arrayList3.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i3)));
                                            }
                                            bVar.b(arrayList3);
                                        }
                                        bVar.a(jSONObjectOptJSONObject2.optString("appName"));
                                        bVar.a(jSONObjectOptJSONObject2.optInt("enable"));
                                        bVar.b(jSONObjectOptJSONObject2.optString("start"));
                                        bVar.c(jSONObjectOptJSONObject2.optString("end"));
                                        bVar.d(jSONObjectOptJSONObject2.optString("interval"));
                                        bVar.e(jSONObjectOptJSONObject2.optString("accType"));
                                        arrayList.add(bVar);
                                    }
                                }
                                aVar.a(arrayList);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    cxVar.a(aVar);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return cxVar;
    }
}
