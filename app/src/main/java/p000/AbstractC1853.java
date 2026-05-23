package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1853 {

    public static final double f6167 = 1.0d / Math.pow(10.0d, 6.0d);

    public static final /* synthetic */ int f6168 = 0;

    public static double m3620(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f6167;
    }
}
