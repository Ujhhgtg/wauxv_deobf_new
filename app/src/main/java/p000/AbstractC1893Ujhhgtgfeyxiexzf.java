package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳᛱUjhhgtgᛱ能不能要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1893Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3225Ujhhgtgfeyxiexzf(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C2256feyxiexzfUjhhgtg m3226Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, Rect rect) {
        WindowInsets windowInsetsM3453Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.m3453Ujhhgtgfeyxiexzf();
        if (windowInsetsM3453Ujhhgtgfeyxiexzf != null) {
            return C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(view, view.computeSystemWindowInsets(windowInsetsM3453Ujhhgtgfeyxiexzf, rect));
        }
        rect.setEmpty();
        return c2256feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m3227Ujhhgtgfeyxiexzf(View view, InterfaceC1319feyxiexzfUjhhgtg interfaceC1319feyxiexzfUjhhgtg) {
        ViewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg viewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg = interfaceC1319feyxiexzfUjhhgtg != null ? new ViewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg(view, interfaceC1319feyxiexzfUjhhgtg) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1910feyxiexzfUjhhgtg);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
