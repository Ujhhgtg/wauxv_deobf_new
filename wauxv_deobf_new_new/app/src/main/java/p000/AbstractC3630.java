package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᲇᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3630 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m5155(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C3729 m5156(View view, C3729 c3729, Rect rect) {
        WindowInsets windowInsetsM5308 = c3729.m5308();
        if (windowInsetsM5308 != null) {
            return C3729.m5305(view, view.computeSystemWindowInsets(windowInsetsM5308, rect));
        }
        rect.setEmpty();
        return c3729;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m5157(View view, InterfaceC2306 interfaceC2306) {
        ViewOnApplyWindowInsetsListenerC3629 viewOnApplyWindowInsetsListenerC3629 = interfaceC2306 != null ? new ViewOnApplyWindowInsetsListenerC3629(view, interfaceC2306) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC3629);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC3629 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3629);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
