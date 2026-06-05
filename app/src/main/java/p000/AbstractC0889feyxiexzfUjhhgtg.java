package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0889feyxiexzfUjhhgtg {
    static {
        new C3511Ujhhgtgfeyxiexzf(2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Drawable m2368Ujhhgtgfeyxiexzf(Context context, int i) {
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
        Drawable drawable = resources.getDrawable(i, theme);
        if (drawable == null) {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Class<Drawable> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Drawable.class));
        throw new IllegalStateException(("Drawable type cannot cast to " + (clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Drawable.class) + ".").toString());
    }
}
