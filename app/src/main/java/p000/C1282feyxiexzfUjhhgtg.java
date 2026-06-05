package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛲᛴ要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1282feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String f4673Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static ServiceConnectionC1274feyxiexzfUjhhgtg f4676Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f4677Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final NotificationManager f4678Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Object f4672Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static HashSet f4674Ujhhgtgfeyxiexzf = new HashSet();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Object f4675Ujhhgtgfeyxiexzf = new Object();

    public C1282feyxiexzfUjhhgtg(Context context) {
        this.f4677Ujhhgtgfeyxiexzf = context;
        this.f4678Ujhhgtgfeyxiexzf = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2847Ujhhgtgfeyxiexzf(String str, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f4678Ujhhgtgfeyxiexzf.notify(str, 0, notification);
            return;
        }
        C1273feyxiexzfUjhhgtg c1273feyxiexzfUjhhgtg = new C1273feyxiexzfUjhhgtg(this.f4677Ujhhgtgfeyxiexzf.getPackageName(), str, notification);
        synchronized (f4675Ujhhgtgfeyxiexzf) {
            try {
                if (f4676Ujhhgtgfeyxiexzf == null) {
                    f4676Ujhhgtgfeyxiexzf = new ServiceConnectionC1274feyxiexzfUjhhgtg(this.f4677Ujhhgtgfeyxiexzf.getApplicationContext());
                }
                f4676Ujhhgtgfeyxiexzf.f4652Ujhhgtgfeyxiexzf.obtainMessage(0, c1273feyxiexzfUjhhgtg).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4678Ujhhgtgfeyxiexzf.cancel(str, 0);
    }
}
