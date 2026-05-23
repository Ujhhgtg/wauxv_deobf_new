package com.uyumao;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.ek;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {
    public final JSONObject a;

    /* JADX INFO: compiled from: obf */
    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public a(Context context, int i, int i2, String str) {
            this.a = context;
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x019f */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream;
            char c;
            int i;
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
                    int i2 = this.b;
                    byteArrayOutputStream = byteArrayOutputStream3;
                    Class cls = Integer.TYPE;
                    try {
                        if (1 == i2) {
                            c = 1;
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
                            c = 1;
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
                        int i3 = 0;
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
                                i3++;
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
                        jSONObject3.put("v", "3.0");
                        jSONObject3.put("sdk_v", "1.1.4");
                        jSONObject3.put("os_v", Build.VERSION.RELEASE);
                        jSONObject3.put("brand", n.b());
                        jSONObject3.put("model", n.c());
                        Object string = UUID.randomUUID().toString();
                        jSONObject3.put("uuid", string);
                        jSONObject3.put("smart_id", string);
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
                        jSONObject3.put("total", i3);
                        try {
                            jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                            jSONObject3.put("os_t", this.a.getApplicationInfo().targetSdkVersion);
                            jSONObject3.put("grant", n.a(this.a) ? 1 : 0);
                        } catch (Throwable unused4) {
                        }
                        try {
                            jSONObject3.put("os", "Android");
                            Object[] networkAccessMode = DeviceConfig.getNetworkAccessMode(this.a);
                            i = 0;
                            try {
                                if ("Wi-Fi".equals(networkAccessMode[0])) {
                                    jSONObject3.put("access", "wifi");
                                    i = 0;
                                } else {
                                    i = 0;
                                    if ("2G/3G".equals(networkAccessMode[0])) {
                                        jSONObject3.put("access", "2G/3G");
                                    } else {
                                        jSONObject3.put("access", "unknown");
                                    }
                                }
                                if (!"".equals(networkAccessMode[1])) {
                                    jSONObject3.put("sub_access", networkAccessMode[1]);
                                }
                                jSONObject3.put("display_name", DeviceConfig.getAppName(this.a));
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            i = 0;
                        }
                        try {
                            String[] strArrSplit = r.this.a.optString("sdk").split(",");
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                                jSONArray2.put(strArrSplit[i4]);
                            }
                            jSONObject3.put("sdk", jSONArray2);
                            jSONObject3.put("hit_sdk", r.this.a.optString("hit_sdk"));
                            jSONObject3.put("local_hit_sdk", r.this.a.optString("local_hit_sdk"));
                            String strOptString = r.this.a.optString("actionName");
                            JSONArray jSONArray3 = new JSONArray(r.this.a.optString("forbid_sdk"));
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(strOptString, jSONArray3);
                            jSONObject3.put("forbid_sdk", jSONObject4);
                        } catch (Throwable unused7) {
                        }
                        int size = arrayList.size();
                        int i5 = 0;
                        for (JSONArray jSONArray4 : arrayList) {
                            i5++;
                            jSONObject3.put("batch", i5);
                            jSONObject3.put("batch_num", size);
                            jSONObject3.put("batch_pkg_num", jSONArray4.length());
                            jSONObject3.put("apl", jSONArray4);
                            try {
                                e.a(jSONObject3, "https://yumao.puata.info/cc_info", this.d);
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

    public r(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null) {
            return;
        }
        try {
            Context context = e.a;
            String appkey = UMUtils.getAppkey(context);
            int iMax = Math.max(this.a.optInt("batch", 300), 100);
            int iOptInt = this.a.optInt("action", 1);
            if (iOptInt == 1 || iOptInt == 2) {
                s.a(new a(context, iOptInt, iMax, appkey), 0L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
    }
}
