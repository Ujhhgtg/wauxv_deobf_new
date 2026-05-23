package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2918 {

    public static final ThreadLocal f9368 = new ThreadLocal();

    public static final int[] f9369 = {-16842910};

    public static final int[] f9370 = {16842908};

    public static final int[] f9371 = {16842919};

    public static final int[] f9372 = {16842912};

    public static final int[] f9373 = new int[0];

    public static final int[] f9374 = new int[1];

    public static void m4917(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2470.f7884);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int m4918(Context context, int i) {
        ColorStateList colorStateListM4920 = m4920(context, i);
        if (colorStateListM4920 != null && colorStateListM4920.isStateful()) {
            return colorStateListM4920.getColorForState(f9369, colorStateListM4920.getDefaultColor());
        }
        ThreadLocal threadLocal = f9368;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int iM4919 = m4919(context, i);
        return AbstractC0752.m2226(iM4919, Math.round(Color.alpha(iM4919) * f));
    }

    public static int m4919(Context context, int i) {
        int[] iArr = f9374;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList m4920(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f9374;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC2203.m4030(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
