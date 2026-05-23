package com.uyumao;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.o;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: compiled from: obf */
    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public a(q qVar, Context context, int i, int i2, String str, long j) {
            this.a = context;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = j;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x018b */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                TreeSet treeSet = new TreeSet();
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = {18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, 14, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, 13, 3, 21, 21, 12, 40, 14, 29};
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 179, 187);
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, 179);
                    e.a(bArrCopyOf, bArrCopyOfRange);
                    e.a(bArrCopyOf, byteArrayOutputStream3);
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream3.toString());
                    Object objA = t.a(jSONObject.optString("c"), jSONObject.optString("p"), null, this.a, null);
                    int i = this.b;
                    Class cls = Integer.TYPE;
                    byteArrayOutputStream = byteArrayOutputStream3;
                    try {
                        if (1 == i) {
                            Object objA2 = t.a(jSONObject.optString("m"), jSONObject.optString("q"), new Class[]{t.a(jSONObject.optString("i")), cls}, objA, new Object[]{t.a(jSONObject.optString("i"), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject.optString("a")}), 0});
                            if (objA2 instanceof List) {
                                Field fieldA = t.a(jSONObject.optString("r"), jSONObject.optString("s"));
                                Field fieldA2 = t.a(jSONObject.optString("t"), jSONObject.optString("n"));
                                Iterator it = ((List) objA2).iterator();
                                while (it.hasNext()) {
                                    Object objA3 = t.a(fieldA2, t.a(fieldA, it.next()));
                                    if (objA3 != null) {
                                        treeSet.add((String) objA3);
                                    }
                                }
                            }
                        } else {
                            Object objA4 = t.a(jSONObject.optString("m"), jSONObject.optString("u"), new Class[]{cls}, objA, new Object[]{0});
                            if (objA4 instanceof List) {
                                Field fieldA3 = t.a(jSONObject.optString("v"), jSONObject.optString("n"));
                                Iterator it2 = ((List) objA4).iterator();
                                while (it2.hasNext()) {
                                    Object objA5 = t.a(fieldA3, it2.next());
                                    if (objA5 != null) {
                                        treeSet.add((String) objA5);
                                    }
                                }
                            }
                        }
                        if (treeSet.isEmpty()) {
                            n.a(byteArrayOutputStream);
                            return;
                        }
                        if (objA == null) {
                            n.a(byteArrayOutputStream);
                            return;
                        }
                        ArrayList<JSONArray> arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray();
                        Iterator it3 = treeSet.iterator();
                        int i2 = 0;
                        while (it3.hasNext()) {
                            Object objA6 = n.a(objA, (String) it3.next(), 0);
                            if (objA6 != null) {
                                p pVar = new p(objA, objA6);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("a", pVar.b);
                                jSONObject2.put("p", pVar.a);
                                jSONObject2.put("v", pVar.c);
                                jSONObject2.put("t", pVar.f);
                                jSONObject2.put("i", pVar.d);
                                jSONObject2.put("u", pVar.e);
                                jSONArray.put(jSONObject2);
                                i2++;
                                if (jSONArray.length() == this.c) {
                                    arrayList.add(jSONArray);
                                    jSONArray = new JSONArray();
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            arrayList.add(jSONArray);
                        }
                        if (arrayList.isEmpty()) {
                            n.a(byteArrayOutputStream);
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("zid", UMUtils.getZid(this.a));
                        jSONObject3.put("appkey", this.d);
                        jSONObject3.put("umid", UMUtils.getUMId(this.a));
                        jSONObject3.put("v", "2.0");
                        jSONObject3.put("sdk_v", "1.1.4");
                        jSONObject3.put("os_v", Build.VERSION.RELEASE);
                        jSONObject3.put("brand", n.b());
                        jSONObject3.put("model", n.c());
                        jSONObject3.put("smart_id", this.e);
                        jSONObject3.put("src", "risk");
                        jSONObject3.put("imei", DeviceConfig.getImeiNew(this.a));
                        try {
                            jSONObject3.put("oaid", DeviceConfig.getOaid(this.a));
                        } catch (Throwable unused) {
                        }
                        try {
                            jSONObject3.put("idfa", DeviceConfig.getIdfa(this.a));
                        } catch (Throwable unused2) {
                        }
                        jSONObject3.put("android_id", DeviceConfig.getAndroidId(this.a));
                        jSONObject3.put("pkg", this.a.getPackageName());
                        jSONObject3.put("app_v", UMUtils.getAppVersionName(this.a));
                        jSONObject3.put("board", n.a());
                        try {
                            Locale locale = UMUtils.getLocale(this.a);
                            if (locale != null) {
                                jSONObject3.put("os_lang", locale.getLanguage());
                            }
                        } catch (Throwable unused3) {
                        }
                        jSONObject3.put("c_ts", System.currentTimeMillis());
                        jSONObject3.put("total", i2);
                        try {
                            jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                            jSONObject3.put("os_t", this.a.getApplicationInfo().targetSdkVersion);
                            jSONObject3.put("grant", n.a(this.a) ? 1 : 0);
                        } catch (Throwable unused4) {
                        }
                        int i3 = 0;
                        for (JSONArray jSONArray2 : arrayList) {
                            i3++;
                            jSONObject3.put("batch", i3);
                            jSONObject3.put("data", jSONArray2);
                            try {
                                e.a(jSONObject3, "https://sss.umeng.com/api/v2/al", this.d);
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                        n.a(byteArrayOutputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream3;
                }
                byteArrayOutputStream2 = byteArrayOutputStream;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                th.getMessage();
            } finally {
                n.a(byteArrayOutputStream2);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        JSONObject jSONObjectA;
        Context context = e.a;
        if (o.a == null) {
            synchronized (o.class) {
                try {
                    if (o.a == null) {
                        o.a = new o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        o oVar = o.a;
        if (n.c(oVar.b)) {
            oVar.c.b("smart_lc", oVar.a() + 1);
        }
        String strM4752 = AbstractC2784.m4752(new StringBuilder(), oVar.c.a, "smart_lt");
        String strValueOf = String.valueOf(0);
        try {
            if (n.c(e.a)) {
                strValueOf = m.a().b.getString(strM4752, "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            i = Integer.parseInt(strValueOf);
        } catch (Exception unused) {
            i = 0;
        }
        if (oVar.a() >= i && oVar.a("smart_")) {
            try {
                Context context2 = e.a;
                String appkey = UMUtils.getAppkey(context2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("zid", UMUtils.getZid(context2));
                try {
                    jSONObject.put("imei", DeviceConfig.getImeiNew(context2));
                    jSONObject.put("oaid", DeviceConfig.getOaid(context2));
                } catch (Throwable unused2) {
                }
                try {
                    jSONObject.put("idfa", DeviceConfig.getIdfa(context2));
                } catch (Throwable unused3) {
                }
                jSONObject.put("umid", UMUtils.getUMId(context2));
                jSONObject.put("android_id", DeviceConfig.getAndroidId(context2));
                jSONObject.put("sdk_v", "1.1.4");
                jSONObject.put("os_v", Build.VERSION.RELEASE);
                jSONObject.put("lvl", Build.VERSION.SDK_INT);
                String[] networkAccessMode = UMUtils.getNetworkAccessMode(context2);
                if (TextUtils.isEmpty(networkAccessMode[0])) {
                    networkAccessMode[0] = "Unknown";
                }
                jSONObject.put("net", networkAccessMode[0]);
                jSONObject.put("brand", n.b());
                long jA = oVar.c.a("smart_ts", 0L);
                if (jA > 0) {
                    jSONObject.put("last", jA);
                }
                try {
                    jSONObjectA = e.a(jSONObject, "https://ccs.umeng.com/ra", appkey, false);
                } catch (Exception unused4) {
                    jSONObjectA = null;
                }
                if (jSONObjectA == null) {
                    oVar.a(7200L);
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    oVar.a(7200L);
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("aa");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                int iOptInt = jSONObjectOptJSONObject2.optInt("launch", 5);
                o.a aVar = oVar.c;
                aVar.a(aVar.a + "smart_lt", String.valueOf(iOptInt));
                if (oVar.a() < iOptInt) {
                    return;
                }
                oVar.a(jSONObjectOptJSONObject.optLong("ttl", 86400L));
                long jOptLong = jSONObjectOptJSONObject.optLong("id", -1L);
                if (jOptLong <= 0) {
                    return;
                }
                int iMax = Math.max(jSONObjectOptJSONObject2.optInt("batch", 300), 100);
                int iOptInt2 = jSONObjectOptJSONObject2.optInt("action", 1);
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("delay");
                if (iOptInt2 == 1 || iOptInt2 == 2) {
                    s.a(new a(this, context2, iOptInt2, iMax, appkey, jOptLong), iOptInt3, TimeUnit.SECONDS);
                }
            } catch (Throwable unused5) {
            }
        }
    }
}
