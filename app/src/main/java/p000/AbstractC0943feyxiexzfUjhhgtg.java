package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴ能不能ᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0943feyxiexzfUjhhgtg extends Drawable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final double f3789Ujhhgtgfeyxiexzf = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static float m2433Ujhhgtgfeyxiexzf(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f3789Ujhhgtgfeyxiexzf) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static float m2434Ujhhgtgfeyxiexzf(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f3789Ujhhgtgfeyxiexzf) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
