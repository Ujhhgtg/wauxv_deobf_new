package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 {

    public final Context f6393;

    public final ActivityManager f6394;

    public final C1744 f6395;

    public final float f6396;

    public C1939(Context context) {
        this.f6396 = 1;
        this.f6393 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f6394 = activityManager;
        this.f6395 = new C1744(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f6396 = 0.0f;
        }
    }
}
