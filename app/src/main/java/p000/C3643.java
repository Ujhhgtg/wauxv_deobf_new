package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3643 extends AbstractC3646 {

    public static final PathInterpolator f11403 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static final C1271 f11404 = new C1271();

    public static final DecelerateInterpolator f11405 = new DecelerateInterpolator(1.5f);

    public static final AccelerateInterpolator f11406 = new AccelerateInterpolator(1.5f);

    public static void m5233(C3647 c3647, View view) {
        AbstractC0592 abstractC0592M5238 = m5238(view);
        if (abstractC0592M5238 != null) {
            abstractC0592M5238.mo2019();
            if (abstractC0592M5238.f2399 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5233(c3647, viewGroup.getChildAt(i));
            }
        }
    }

    public static void m5234(View view, C3647 c3647, C3669 c3669, boolean z) {
        AbstractC0592 abstractC0592M5238 = m5238(view);
        if (abstractC0592M5238 != null) {
            abstractC0592M5238.f2400 = c3669;
            if (!z) {
                abstractC0592M5238.mo2020();
                z = abstractC0592M5238.f2399 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5234(viewGroup.getChildAt(i), c3647, c3669, z);
            }
        }
    }

    public static void m5235(View view, C3669 c3669, List list) {
        AbstractC0592 abstractC0592M5238 = m5238(view);
        if (abstractC0592M5238 != null) {
            c3669 = abstractC0592M5238.mo2021(c3669, list);
            if (abstractC0592M5238.f2399 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5235(viewGroup.getChildAt(i), c3669, list);
            }
        }
    }

    public static void m5236(View view, C3647 c3647, C2825 c2825) {
        AbstractC0592 abstractC0592M5238 = m5238(view);
        if (abstractC0592M5238 != null) {
            abstractC0592M5238.mo2022(c2825);
            if (abstractC0592M5238.f2399 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m5236(viewGroup.getChildAt(i), c3647, c2825);
            }
        }
    }

    public static WindowInsets m5237(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0592 m5238(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC3642) {
            return ((ViewOnApplyWindowInsetsListenerC3642) tag).f11401;
        }
        return null;
    }
}
