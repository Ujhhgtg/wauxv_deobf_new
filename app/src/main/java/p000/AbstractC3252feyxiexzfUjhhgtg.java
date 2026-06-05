package p000;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3252feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int[] f10197Ujhhgtgfeyxiexzf = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int[] f10198Ujhhgtgfeyxiexzf = new int[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Rect f10199Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m4756Ujhhgtgfeyxiexzf(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f10197Ujhhgtgfeyxiexzf);
        } else {
            drawable.setState(f10198Ujhhgtgfeyxiexzf);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Rect m4757Ujhhgtgfeyxiexzf(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM4753Ujhhgtgfeyxiexzf = AbstractC3249feyxiexzfUjhhgtg.m4753Ujhhgtgfeyxiexzf(drawable);
            return new Rect(insetsM4753Ujhhgtgfeyxiexzf.left, insetsM4753Ujhhgtgfeyxiexzf.top, insetsM4753Ujhhgtgfeyxiexzf.right, insetsM4753Ujhhgtgfeyxiexzf.bottom);
        }
        if (i >= 29) {
            boolean z = AbstractC3248feyxiexzfUjhhgtg.f10191Ujhhgtgfeyxiexzf;
        } else if (AbstractC3248feyxiexzfUjhhgtg.f10191Ujhhgtgfeyxiexzf) {
            try {
                Object objInvoke = AbstractC3248feyxiexzfUjhhgtg.f10192Ujhhgtgfeyxiexzf.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC3248feyxiexzfUjhhgtg.f10193Ujhhgtgfeyxiexzf.getInt(objInvoke), AbstractC3248feyxiexzfUjhhgtg.f10194Ujhhgtgfeyxiexzf.getInt(objInvoke), AbstractC3248feyxiexzfUjhhgtg.f10195Ujhhgtgfeyxiexzf.getInt(objInvoke), AbstractC3248feyxiexzfUjhhgtg.f10196Ujhhgtgfeyxiexzf.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f10199Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static PorterDuff.Mode m4758Ujhhgtgfeyxiexzf(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Opcodes.DCONST_0 /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
