package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1940 {

    public final int f6397;

    public final int f6398;

    public final int f6399;

    public C1940(C1939 c1939) {
        Context context = c1939.f6393;
        float f = c1939.f6396;
        ActivityManager activityManager = c1939.f6394;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f6399 = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c1939.f6395.f5843;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f6398 = iRound3;
            this.f6397 = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.f6398 = Math.round(2.0f * f3);
            this.f6397 = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f6398));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f6397));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
