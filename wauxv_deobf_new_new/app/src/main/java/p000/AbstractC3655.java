package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᲀᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3655 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3660 f11380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C0564 f11381;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11380 = new C3661();
        } else {
            f11380 = new C3660();
        }
        f11381 = new C0564(Float.class, "translationAlpha", 6);
        new C0564(Rect.class, "clipBounds", 7);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m5210(View view, int i, int i2, int i3, int i4) {
        f11380.mo5219(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m5211(View view, int i) {
        f11380.mo3497(view, i);
    }
}
