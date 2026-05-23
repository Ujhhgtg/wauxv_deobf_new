package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2239 {

    public static String f7253;

    public static ServiceConnectionC2238 f7256;

    public final Context f7257;

    public final NotificationManager f7258;

    public static final Object f7252 = new Object();

    public static HashSet f7254 = new HashSet();

    public static final Object f7255 = new Object();

    public C2239(Context context) {
        this.f7257 = context;
        this.f7258 = (NotificationManager) context.getSystemService("notification");
    }

    public final void m4148(String str, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f7258.notify(str, 0, notification);
            return;
        }
        C2235 c2235 = new C2235(this.f7257.getPackageName(), str, notification);
        synchronized (f7255) {
            try {
                if (f7256 == null) {
                    f7256 = new ServiceConnectionC2238(this.f7257.getApplicationContext());
                }
                f7256.f7249.obtainMessage(0, c2235).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7258.cancel(str, 0);
    }
}
