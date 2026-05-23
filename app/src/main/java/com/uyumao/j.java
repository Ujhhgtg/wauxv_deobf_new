package com.uyumao;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umeng.analytics.pro.cl;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class j {
    public static Context a;

    /* JADX INFO: compiled from: obf */
    public static class a {
        public static final j a = new j();
    }

    public synchronized i a() {
        i iVar;
        iVar = null;
        try {
            Intent intentRegisterReceiver = a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("voltage", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra4 = intentRegisterReceiver.getIntExtra(cl.i, 0);
            int i2 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i2 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i2 = 0;
                } else if (intExtra4 == 5) {
                    i2 = 2;
                }
            }
            int intExtra5 = intentRegisterReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i = 1;
            } else if (intExtra5 == 2) {
                i = 2;
            }
            i iVar2 = new i();
            try {
                iVar2.a = intExtra;
                iVar2.b = intExtra2;
                iVar2.d = i2;
                iVar2.c = intExtra3;
                iVar2.e = i;
                iVar2.f = System.currentTimeMillis();
            } catch (Throwable unused) {
            }
            iVar = iVar2;
        } catch (Throwable unused2) {
        }
        return iVar;
    }
}
