package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3595 {

    public static final C3600 f11231;

    public static final C0583 f11232;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11231 = new C3601(14);
        } else {
            f11231 = new C3600(14);
        }
        f11232 = new C0583(Float.class, "translationAlpha", 6);
        new C0583(Rect.class, "clipBounds", 7);
    }

    public static void m5204(View view, int i, int i2, int i3, int i4) {
        f11231.mo5213(view, i, i2, i3, i4);
    }

    public static void m5205(View view, int i) {
        f11231.mo3228(view, i);
    }
}
