package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0164 {

    public static final LinearInterpolator f1185 = new LinearInterpolator();

    public static final C1271 f1186 = new C1271(C1271.f4648);

    public static final C1271 f1187 = new C1271();

    public static final C1271 f1188 = new C1271(C1271.f4649);

    public static final DecelerateInterpolator f1189 = new DecelerateInterpolator();

    public static float m1211(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float m1212(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : m1211(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int m1213(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
