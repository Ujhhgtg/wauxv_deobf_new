package com.uyumao;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.g;
import com.uyumao.sdk.UYMManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d implements g.a {
    public static volatile boolean a = true;
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    public static volatile boolean d = true;
    public static volatile boolean e = true;
    public static volatile boolean f = true;
    public static Context g = null;
    public static JSONObject h = null;
    public static JSONObject i = null;
    public static JSONObject j = null;
    public static JSONObject k = null;
    public static volatile boolean l = false;
    public static Map<String, Integer> m;
    public static LocationListener n;

    /* JADX INFO: compiled from: obf */
    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(d dVar, String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.g, "https://yumao.puata.info/cc_info", this.a);
        }
    }

    /* JADX INFO: compiled from: obf */
    public class c implements Runnable {
        public final /* synthetic */ String a;

        public c(d dVar, String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.g, "https://yumao.puata.info/cc_info", this.a);
        }
    }

    /* JADX INFO: renamed from: com.uyumao.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: obf */
    public class RunnableC0044d implements Runnable {
        public final /* synthetic */ String a;

        public RunnableC0044d(d dVar, String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.g, "https://yumao.puata.info/cc_info", this.a);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class e {
        public static final d a = new d();
    }

    static {
        HashMap map = new HashMap();
        m = map;
        map.put(com.umeng.ccg.a.b, 101);
        m.put(com.umeng.ccg.a.c, 102);
        m.put(com.umeng.ccg.a.d, 103);
        m.put(com.umeng.ccg.a.e, 104);
        n = new a();
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Object objOptString = jSONObject2.optString(com.umeng.ccg.a.u);
            String strOptString = jSONObject2.optString(com.umeng.ccg.a.x);
            jSONObject.put(com.umeng.ccg.a.u, objOptString);
            String[] strArrSplit = strOptString.split(",");
            JSONArray jSONArray = new JSONArray();
            for (String str : strArrSplit) {
                jSONArray.put(str);
            }
            jSONObject.put(com.umeng.ccg.a.x, jSONArray);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = h;
        if (jSONObject != null && jSONObject.length() > 0) {
            return h;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(bv.x, AnalyticsConstants.SDK_TYPE);
            jSONObject2.put("dm", Build.MODEL);
            jSONObject2.put("av", DeviceConfig.getAppVersionName(context));
            jSONObject2.put(bv.g, UMUtils.getUMId(context));
            jSONObject2.put("ov", Build.VERSION.RELEASE);
            jSONObject2.put("chn", UMUtils.getChannel(context));
            if (UMUtils.getActiveUser(context) != null && UMUtils.getActiveUser(context).length == 2) {
                jSONObject2.put(com.umeng.analytics.pro.g.N, UMUtils.getActiveUser(context)[1]);
            } else {
                jSONObject2.put(com.umeng.analytics.pro.g.N, "");
            }
            jSONObject2.put(bv.af, UMUtils.getZid(context));
            jSONObject2.put("sv", UYMManager.getSdkVersion());
            jSONObject2.put("ak", UMUtils.getAppkey(context));
            jSONObject2.put("idfa", DeviceConfig.getIdfa(context));
            jSONObject2.put("db", Build.BRAND);
            jSONObject2.put("aid", DeviceConfig.getAndroidId(context));
            jSONObject2.put("oaid", DeviceConfig.getOaid(context));
            jSONObject2.put("imei", DeviceConfig.getImeiNew(context));
            jSONObject2.put("boa", Build.BOARD);
            jSONObject2.put("mant", Build.TIME);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject2.put("ct", localeInfo[0]);
            jSONObject2.put("lang", localeInfo[1]);
            jSONObject2.put("tz", DeviceConfig.getTimeZone(context));
            jSONObject2.put("pkg", DeviceConfig.getPackageName(context));
            jSONObject2.put("disn", DeviceConfig.getAppName(context));
            String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
            if (!"Wi-Fi".equals(networkAccessMode[0])) {
                if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put("ac", "2G/3G");
                } else {
                    jSONObject2.put("ac", "unknown");
                }
            } else {
                jSONObject2.put("ac", "wifi");
            }
            if (!"".equals(networkAccessMode[1])) {
                jSONObject2.put("ast", networkAccessMode[1]);
            }
            jSONObject2.put("nt", DeviceConfig.getNetworkType(context));
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject2.put("device_token", deviceToken);
            }
            h = jSONObject2;
        } catch (Throwable unused) {
        }
        return h;
    }

    /* JADX INFO: compiled from: obf */
    public static class a implements LocationListener {
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            boolean unused = d.l = true;
            try {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                long time = location.getTime();
                double altitude = location.hasAltitude() ? location.getAltitude() : 0.0d;
                double speed = location.hasSpeed() ? location.getSpeed() : 0.0d;
                JSONObject jSONObject = new JSONObject();
                d.j = jSONObject;
                jSONObject.put(com.umeng.analytics.pro.g.C, latitude);
                d.j.put(com.umeng.analytics.pro.g.D, longitude);
                d.j.put("alt", altitude);
                d.j.put("acc", speed);
                d.j.put("lts", time);
                g.a(d.g, 203, e.a, d.k);
            } catch (Throwable unused2) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #3 {all -> 0x017d, blocks: (B:99:0x0175, B:101:0x017a), top: B:152:0x0175 }] */
    @Override // com.uyumao.g.a
    public void a(Object obj, int i2) {
        LocationManager locationManager;
        JSONArray jSONArrayA;
        LocationManager locationManager2;
        Future<?> future;
        String str = "network";
        JSONObject jSONObject = null;
        if (i2 == 202) {
            if (l) {
                return;
            }
            Context context = g;
            LocationListener locationListener = n;
            if (context != null && locationListener != null) {
                try {
                    if (com.uyumao.e.a(context, "android.permission.ACCESS_FINE_LOCATION") && com.uyumao.e.a(context, "android.permission.ACCESS_COARSE_LOCATION") && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
                        locationManager.removeUpdates(locationListener);
                    }
                } catch (Throwable unused) {
                }
            }
            j = null;
            g.a(g, 203, e.a, k);
            return;
        }
        try {
            if (i2 != 203) {
                switch (i2) {
                    case 101:
                        if (com.uyumao.e.b().booleanValue() && obj != null && (obj instanceof JSONObject)) {
                            JSONArray jSONArrayE = c ? com.uyumao.e.e(g) : null;
                            JSONArray jSONArrayF = d ? com.uyumao.e.f(g) : null;
                            if (jSONArrayE != null || jSONArrayF != null) {
                                JSONObject jSONObjectA = a(g);
                                a(jSONObjectA, (JSONObject) obj);
                                try {
                                    JSONObject jSONObject2 = new JSONObject(jSONObjectA.toString());
                                    if (jSONArrayE == null) {
                                        if (jSONArrayF != null) {
                                            jSONObject2.put("wifi_list", jSONArrayF);
                                        }
                                        break;
                                    } else {
                                        try {
                                            jSONObject2.put("wifi", jSONArrayE);
                                            if (jSONArrayF != null) {
                                                jSONObject2.put("wifi_list", jSONArrayF);
                                            }
                                            break;
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    jSONObject = jSONObject2;
                                } catch (Throwable unused3) {
                                }
                                s.a(new b(this, jSONObject.toString()), 0L, TimeUnit.SECONDS);
                            }
                        }
                        break;
                    case 102:
                        if (com.uyumao.e.b().booleanValue() && e && obj != null && (obj instanceof JSONObject) && (jSONArrayA = com.uyumao.e.a(g)) != null && jSONArrayA.length() > 0) {
                            JSONObject jSONObjectA2 = a(g);
                            a(jSONObjectA2, (JSONObject) obj);
                            try {
                                JSONObject jSONObject3 = new JSONObject(jSONObjectA2.toString());
                                try {
                                    jSONObject3.put("bs", jSONArrayA);
                                    break;
                                } catch (Throwable unused4) {
                                }
                                jSONObject = jSONObject3;
                            } catch (Throwable unused5) {
                            }
                            s.a(new c(this, jSONObject.toString()), 0L, TimeUnit.SECONDS);
                        }
                        break;
                    case 103:
                        if (com.uyumao.e.b().booleanValue() && obj != null && (obj instanceof JSONObject)) {
                            k = (JSONObject) obj;
                            if (b) {
                                i = com.uyumao.e.b(g);
                            }
                            if (a) {
                                Context context2 = g;
                                LocationListener locationListener2 = n;
                                if (context2 != null && locationListener2 != null) {
                                    try {
                                        if (com.uyumao.e.a(context2, "android.permission.ACCESS_FINE_LOCATION") && com.uyumao.e.a(context2, "android.permission.ACCESS_COARSE_LOCATION") && (locationManager2 = (LocationManager) context2.getSystemService("location")) != null) {
                                            List<String> providers = locationManager2.getProviders(true);
                                            if (providers.contains("gps")) {
                                                str = "gps";
                                            } else if (providers.contains("network")) {
                                            }
                                            locationManager2.requestSingleUpdate(str, locationListener2, (Looper) null);
                                        }
                                        break;
                                    } catch (Throwable unused6) {
                                    }
                                }
                                g.a(g, bc.e, 202, e.a, k, 30000L);
                            } else {
                                g.a(g, 203, e.a, k);
                            }
                        }
                        break;
                    case 104:
                        Log.i("CCG", "recv Dispatch.CL_APL msg.");
                        if (!f) {
                            Log.i("CCG", "apl switch is off, ignore collect trigger.");
                            break;
                        } else if (obj != null && (obj instanceof JSONObject)) {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            WeakReference<Future<?>> weakReference = com.uyumao.e.c;
                            if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
                                com.uyumao.e.c = new WeakReference<>(s.a(new r(jSONObject4)));
                            }
                            break;
                        }
                        break;
                }
                return;
            }
            if ((i == null && j == null) || obj == null || !(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObjectA3 = a(g);
            a(jSONObjectA3, k);
            JSONArray jSONArrayA2 = com.uyumao.e.a(i, j);
            try {
                JSONObject jSONObject5 = new JSONObject(jSONObjectA3.toString());
                try {
                    jSONObject5.put("lbs", jSONArrayA2);
                } catch (Throwable unused7) {
                }
                jSONObject = jSONObject5;
            } catch (Throwable unused8) {
            }
            s.a(new RunnableC0044d(this, jSONObject.toString()), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused9) {
        }
    }
}
