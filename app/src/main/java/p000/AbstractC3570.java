package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3570 {
    public static void m5149(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static C3669 m5150(View view, C3669 c3669, Rect rect) {
        WindowInsets windowInsetsM5302 = c3669.m5302();
        if (windowInsetsM5302 != null) {
            return C3669.m5299(view, view.computeSystemWindowInsets(windowInsetsM5302, rect));
        }
        rect.setEmpty();
        return c3669;
    }

    public static void m5151(View view, InterfaceC2274 interfaceC2274) {
        ViewOnApplyWindowInsetsListenerC3569 viewOnApplyWindowInsetsListenerC3569 = interfaceC2274 != null ? new ViewOnApplyWindowInsetsListenerC3569(view, interfaceC2274) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC3569);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC3569 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3569);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
