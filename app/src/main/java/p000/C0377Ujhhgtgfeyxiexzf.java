package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能要点脸ᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0377Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f2084Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ActivityManager f2085Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f2086Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f2087Ujhhgtgfeyxiexzf;

    public C0377Ujhhgtgfeyxiexzf(Context context) {
        this.f2087Ujhhgtgfeyxiexzf = 1;
        this.f2084Ujhhgtgfeyxiexzf = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f2085Ujhhgtgfeyxiexzf = activityManager;
        this.f2086Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f2087Ujhhgtgfeyxiexzf = 0.0f;
        }
    }
}
