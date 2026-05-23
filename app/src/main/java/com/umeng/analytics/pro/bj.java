package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.umeng.analytics.pro.a;
import com.umeng.commonsdk.statistics.common.MLog;
import p000.AbstractC2668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bj implements bf {
    private static final String a = "FreemeDeviceIdSupplier---";
    private static final long b = 5000;
    private static final long c = 100;
    private static boolean d = false;
    private static volatile a e;
    private static final ServiceConnection h = new ServiceConnection() { // from class: com.umeng.analytics.pro.bj.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MLog.d("FreemeDeviceIdSupplier---CreatorService connected");
            a unused = bj.e = a.b.a(iBinder);
            boolean unused2 = bj.d = bj.e != null;
            MLog.d("FreemeDeviceIdSupplier---CreatorService bound: " + bj.d);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MLog.d("FreemeDeviceIdSupplier---CreatorService disconnected");
            a unused = bj.e = null;
            boolean unused2 = bj.d = false;
        }
    };
    private String f = "";
    private Context g;

    private static String c() {
        for (long j = 0; j < b; j += c) {
            if (d && e != null) {
                try {
                    String strB = e.b();
                    MLog.d("FreemeDeviceIdSupplier---Creator OAID: " + strB);
                    return strB;
                } catch (Exception e2) {
                    MLog.e("FreemeDeviceIdSupplier---Failed to get Creator OAID after connection", e2);
                    return null;
                }
            }
            try {
                Thread.sleep(c);
            } catch (InterruptedException e3) {
                MLog.e("FreemeDeviceIdSupplier---Interrupted while waiting for CreatorService", e3);
                return null;
            }
        }
        MLog.e("FreemeDeviceIdSupplier---Timeout waiting for CreatorService connection");
        return null;
    }

    private static boolean b(Context context) {
        if (!a(context, "com.android.creator")) {
            MLog.w("FreemeDeviceIdSupplier---Creator service package not available");
            return false;
        }
        try {
            Intent intent = new Intent("android.service.action.msa");
            intent.setPackage("com.android.creator");
            intent.setComponent(new ComponentName("com.android.creator", "com.android.creator.CreatorService"));
            boolean zBindService = context.bindService(intent, h, 1);
            MLog.d("FreemeDeviceIdSupplier---Binding CreatorService: " + zBindService);
            return zBindService;
        } catch (Exception e2) {
            MLog.e("FreemeDeviceIdSupplier---Failed to bind CreatorService", e2);
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.bf
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.g = context.getApplicationContext();
        if (d) {
            try {
                if (e != null) {
                    this.f = e.b();
                    MLog.d("FreemeDeviceIdSupplier---Creator OAID: " + this.f);
                    return this.f;
                }
            } catch (Exception e2) {
                MLog.e("FreemeDeviceIdSupplier---Failed to get Creator OAID", e2);
                return null;
            } finally {
                c(this.g);
            }
        }
        MLog.w("FreemeDeviceIdSupplier---CreatorService not bound, attempting to bind...");
        if (!b(context)) {
            MLog.e("FreemeDeviceIdSupplier---Failed to bind CreatorService for OAID");
            return null;
        }
        this.f = c();
        c(this.g);
        return this.f;
    }

    private static void c(Context context) {
        try {
            if (d) {
                context.unbindService(h);
                d = false;
                e = null;
                MLog.d("FreemeDeviceIdSupplier---CreatorService unbound");
            }
        } catch (Exception e2) {
            MLog.e("FreemeDeviceIdSupplier---Failed to unbind CreatorService", e2);
        }
    }

    private static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e2) {
            StringBuilder sbM4679 = AbstractC2668.m4679("FreemeDeviceIdSupplier---Package ", str, " not available: ");
            sbM4679.append(e2.getMessage());
            MLog.w(sbM4679.toString());
            return false;
        }
    }
}
