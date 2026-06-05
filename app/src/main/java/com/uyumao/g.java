package com.uyumao;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.analytics.pro.bc;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static HandlerThread a;
    public static Handler b;
    public static HashMap<Integer, a> c;

    /* JADX INFO: compiled from: obf */
    public interface a {
        void a(Object obj, int i);
    }

    public static void a(Context context, int i, int i2, a aVar, Object obj, long j) {
        if (context == null || aVar == null) {
            return;
        }
        if (c == null) {
            c = new HashMap<>();
        }
        Integer numValueOf = Integer.valueOf(i2 / 100);
        if (!c.containsKey(numValueOf)) {
            c.put(numValueOf, aVar);
        }
        if (a == null || b == null) {
            synchronized (g.class) {
                try {
                    if (a == null) {
                        HandlerThread handlerThread = new HandlerThread("yumao_ccg");
                        a = handlerThread;
                        handlerThread.start();
                        if (b == null) {
                            b = new f(a.getLooper());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            Handler handler = b;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = i;
                messageObtainMessage.arg1 = i2;
                messageObtainMessage.obj = obj;
                b.sendMessageDelayed(messageObtainMessage, j);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(Context context, int i, a aVar, Object obj) {
        a(context, bc.e, i, aVar, obj, 0L);
    }
}
