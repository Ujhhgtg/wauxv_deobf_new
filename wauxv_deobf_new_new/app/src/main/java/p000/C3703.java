package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3703 extends AbstractC3706 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final PathInterpolator f11552 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1273 f11553 = new C1273();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final DecelerateInterpolator f11554 = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final AccelerateInterpolator f11555 = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m5239(C3707 c3707, View view) {
        AbstractC0573 abstractC0573M5244 = m5244(view);
        if (abstractC0573M5244 != null) {
            abstractC0573M5244.mo2116();
            if (abstractC0573M5244.f2365 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5239(c3707, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m5240(View view, C3707 c3707, C3729 c3729, boolean z) {
        AbstractC0573 abstractC0573M5244 = m5244(view);
        if (abstractC0573M5244 != null) {
            abstractC0573M5244.f2366 = c3729;
            if (!z) {
                abstractC0573M5244.mo2117();
                z = abstractC0573M5244.f2365 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5240(viewGroup.getChildAt(i), c3707, c3729, z);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m5241(View view, C3729 c3729, List list) {
        AbstractC0573 abstractC0573M5244 = m5244(view);
        if (abstractC0573M5244 != null) {
            c3729 = abstractC0573M5244.mo2118(c3729, list);
            if (abstractC0573M5244.f2365 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5241(viewGroup.getChildAt(i), c3729, list);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m5242(View view, C3707 c3707, C2885 c2885) {
        AbstractC0573 abstractC0573M5244 = m5244(view);
        if (abstractC0573M5244 != null) {
            abstractC0573M5244.mo2119(c2885);
            if (abstractC0573M5244.f2365 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5242(viewGroup.getChildAt(i), c3707, c2885);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static WindowInsets m5243(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static AbstractC0573 m5244(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC3702) {
            return ((ViewOnApplyWindowInsetsListenerC3702) tag).f11550;
        }
        return null;
    }
}
