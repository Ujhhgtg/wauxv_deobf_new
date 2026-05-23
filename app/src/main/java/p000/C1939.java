package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲈᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f6393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ActivityManager f6394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1744 f6395;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
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
