package com.uyumao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONObject;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class h extends BroadcastReceiver {
    public long a = 0;

    /* JADX INFO: compiled from: obf */
    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ JSONObject b;

        public a(h hVar, Context context, JSONObject jSONObject) {
            this.a = context;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.getCacheDir().getPath());
            e.a(new File(AbstractC2784.m4752(sb, File.separator, "net_change")), (this.b.toString() + "\n").getBytes(), true);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String strA;
        String str;
        String strD;
        String str2;
        JSONObject jSONObject;
        String str3;
        String str4;
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && e.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i = 1;
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                JSONObject jSONObject2 = null;
                if (networkInfo.isConnected() && networkInfo2.isConnected()) {
                    if (this.a >= 0 && System.currentTimeMillis() - this.a <= 500) {
                        return;
                    }
                    this.a = System.currentTimeMillis();
                    Log.i("NetChangeReceiver", "WIFI已连接,移动数据已连接");
                    if (d.c) {
                        String[] strArrG = e.g(context);
                        str4 = strArrG[0];
                        str3 = strArrG[1];
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    strA = e.a(networkInfo2);
                    str = str3;
                    i = 3;
                    str2 = str4;
                    strD = e.d(context);
                } else if (networkInfo.isConnected() || !networkInfo2.isConnected()) {
                    if (!networkInfo.isConnected() || networkInfo2.isConnected()) {
                        Log.i("NetChangeReceiver", "WIFI已断开,移动数据已断开");
                        i = 0;
                    } else {
                        if (this.a >= 0 && System.currentTimeMillis() - this.a <= 500) {
                            return;
                        }
                        this.a = System.currentTimeMillis();
                        Log.i("NetChangeReceiver", "WIFI已连接,移动数据已断开");
                        if (d.c) {
                            String[] strArrG2 = e.g(context);
                            str2 = strArrG2[0];
                            str = strArrG2[1];
                            strA = null;
                            strD = null;
                        }
                    }
                    strA = null;
                    str = null;
                    strD = null;
                    str2 = null;
                } else {
                    Log.i("NetChangeReceiver", "WIFI已断开,移动数据已连接");
                    strA = e.a(networkInfo2);
                    i = 2;
                    strD = e.d(context);
                    str = null;
                    str2 = null;
                }
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", i);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                            jSONObject.put("wifi_ssid", str2);
                            jSONObject.put("wifi_bssid", str);
                        }
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strD)) {
                            jSONObject.put("mobile_type", strA);
                            jSONObject.put("mobile_carrier", strD);
                        }
                        jSONObject.put("systemtime", System.currentTimeMillis());
                    } catch (Throwable th) {
                        th = th;
                        jSONObject2 = jSONObject;
                        th.printStackTrace();
                        jSONObject = jSONObject2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                if (jSONObject != null) {
                    Log.d("NetChangeReceiver", jSONObject.toString());
                    try {
                        l.a().b().execute(new a(this, context, jSONObject));
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
