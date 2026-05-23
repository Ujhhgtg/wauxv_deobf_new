package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.eu;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bm implements bf {
    private static final String a = "Lenovo";
    private static final String b = "com.zui.deviceidservice";
    private static final String c = "com.zui.deviceidservice.DeviceidService";
    private volatile String d = "";
    private CountDownLatch e;
    private Context f;

    @Override // com.umeng.analytics.pro.bf
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.f = context.getApplicationContext();
        this.e = new CountDownLatch(1);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.umeng.analytics.pro.bm.1
            @Override // android.content.ServiceConnection
            public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                bm bmVar;
                try {
                    eu euVarA = eu.b.a(iBinder);
                    if (euVarA != null) {
                        try {
                            bm.this.d = euVarA.a();
                            Log.d(bm.a, "Service onServiceConnected oaid = " + bm.this.d);
                            bmVar = bm.this;
                        } catch (RemoteException unused) {
                            bmVar = bm.this;
                        } finally {
                            bm.this.e.countDown();
                        }
                        CountDownLatch countDownLatch = bmVar.e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.i(bm.a, "Service onServiceDisconnected");
            }
        };
        try {
            Intent intent = new Intent();
            intent.setClassName(b, c);
            this.f.bindService(intent, serviceConnection, 1);
            if (!this.e.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(a, "getOAID time-out");
            }
            String str = this.d;
            this.f.unbindService(serviceConnection);
            return str;
        } catch (Throwable th) {
            try {
                Log.e(a, "getOAID interrupted. e=" + th.getMessage());
                return null;
            } finally {
                this.f.unbindService(serviceConnection);
            }
        }
    }
}
