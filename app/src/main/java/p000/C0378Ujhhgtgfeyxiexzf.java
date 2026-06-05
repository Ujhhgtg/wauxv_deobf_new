package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能要点脸ᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0378Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f2088Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f2089Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2090Ujhhgtgfeyxiexzf;

    public C0378Ujhhgtgfeyxiexzf(C0377Ujhhgtgfeyxiexzf c0377Ujhhgtgfeyxiexzf) {
        Context context = c0377Ujhhgtgfeyxiexzf.f2084Ujhhgtgfeyxiexzf;
        float f = c0377Ujhhgtgfeyxiexzf.f2087Ujhhgtgfeyxiexzf;
        ActivityManager activityManager = c0377Ujhhgtgfeyxiexzf.f2085Ujhhgtgfeyxiexzf;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f2090Ujhhgtgfeyxiexzf = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c0377Ujhhgtgfeyxiexzf.f2086Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f2089Ujhhgtgfeyxiexzf = iRound3;
            this.f2088Ujhhgtgfeyxiexzf = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.f2089Ujhhgtgfeyxiexzf = Math.round(2.0f * f3);
            this.f2088Ujhhgtgfeyxiexzf = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f2089Ujhhgtgfeyxiexzf));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f2088Ujhhgtgfeyxiexzf));
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
