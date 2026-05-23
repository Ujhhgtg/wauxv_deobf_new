package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2589 {

    public static final int[] f8198 = {16842919};

    public static final int[] f8199 = {16842908};

    public static final int[] f8200 = {16842913, 16842919};

    public static final int[] f8201 = {16842913};

    public static final int[] f8202 = {16842910, 16842919};

    public static final String f8203 = AbstractC2589.class.getSimpleName();

    public static ColorStateList m4595(ColorStateList colorStateList) {
        int[] iArr = f8199;
        return new ColorStateList(new int[][]{f8201, iArr, StateSet.NOTHING}, new int[]{m4596(colorStateList, f8200), m4596(colorStateList, iArr), m4596(colorStateList, f8198)});
    }

    public static int m4596(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC0752.m2226(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList m4597(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f8202, 0)) != 0) {
            Log.w(f8203, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean m4598(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
