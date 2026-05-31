package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f6498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ActivityManager f6499;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1681 f6500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f6501;

    public C1970(Context context) {
        this.f6501 = 1;
        this.f6498 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f6499 = activityManager;
        this.f6500 = new C1681(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f6501 = 0.0f;
        }
    }
}
