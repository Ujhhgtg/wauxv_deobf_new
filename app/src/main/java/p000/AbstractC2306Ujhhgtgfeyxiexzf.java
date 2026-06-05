package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2306Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2311Ujhhgtgfeyxiexzf f7544Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f7545Ujhhgtgfeyxiexzf;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f7544Ujhhgtgfeyxiexzf = new C2312Ujhhgtgfeyxiexzf();
        } else {
            f7544Ujhhgtgfeyxiexzf = new C2311Ujhhgtgfeyxiexzf();
        }
        f7545Ujhhgtgfeyxiexzf = new C2700Ujhhgtgfeyxiexzf(Float.class, "translationAlpha", 6);
        new C2700Ujhhgtgfeyxiexzf(Rect.class, "clipBounds", 7);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3510Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4) {
        f7544Ujhhgtgfeyxiexzf.mo3520feyxiexzfUjhhgtg(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m3511Ujhhgtgfeyxiexzf(View view, int i) {
        f7544Ujhhgtgfeyxiexzf.mo3519feyxiexzfUjhhgtg(view, i);
    }
}
