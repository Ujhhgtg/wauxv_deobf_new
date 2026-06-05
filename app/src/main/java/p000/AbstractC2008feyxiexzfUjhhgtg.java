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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱ要点脸ᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2008feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ThreadLocal f6595Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int[] f6596Ujhhgtgfeyxiexzf = {-16842910};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f6597Ujhhgtgfeyxiexzf = {R.attr.state_focused};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f6598Ujhhgtgfeyxiexzf = {R.attr.state_pressed};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final int[] f6599Ujhhgtgfeyxiexzf = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int[] f6600Ujhhgtgfeyxiexzf = new int[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final int[] f6601Ujhhgtgfeyxiexzf = new int[1];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3348Ujhhgtgfeyxiexzf(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0801feyxiexzfUjhhgtg.f3165Ujhhgtgfeyxiexzf);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(Opcodes.LNEG)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m3349Ujhhgtgfeyxiexzf(Context context, int i) {
        ColorStateList colorStateListM3351Ujhhgtgfeyxiexzf = m3351Ujhhgtgfeyxiexzf(context, i);
        if (colorStateListM3351Ujhhgtgfeyxiexzf != null && colorStateListM3351Ujhhgtgfeyxiexzf.isStateful()) {
            return colorStateListM3351Ujhhgtgfeyxiexzf.getColorForState(f6596Ujhhgtgfeyxiexzf, colorStateListM3351Ujhhgtgfeyxiexzf.getDefaultColor());
        }
        ThreadLocal threadLocal = f6595Ujhhgtgfeyxiexzf;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM3350Ujhhgtgfeyxiexzf = m3350Ujhhgtgfeyxiexzf(context, i);
        return AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(iM3350Ujhhgtgfeyxiexzf, Math.round(Color.alpha(iM3350Ujhhgtgfeyxiexzf) * f));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m3350Ujhhgtgfeyxiexzf(Context context, int i) {
        int[] iArr = f6601Ujhhgtgfeyxiexzf;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static ColorStateList m3351Ujhhgtgfeyxiexzf(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6601Ujhhgtgfeyxiexzf;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
