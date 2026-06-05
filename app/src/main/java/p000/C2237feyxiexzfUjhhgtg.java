package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2237feyxiexzfUjhhgtg extends AbstractC2235feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final PathInterpolator f7280Ujhhgtgfeyxiexzf = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3415Ujhhgtgfeyxiexzf f7281Ujhhgtgfeyxiexzf = new C3415Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final DecelerateInterpolator f7282Ujhhgtgfeyxiexzf = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final AccelerateInterpolator f7283Ujhhgtgfeyxiexzf = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m3402Ujhhgtgfeyxiexzf(C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, View view) {
        AbstractC2684Ujhhgtgfeyxiexzf abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf = m3407Ujhhgtgfeyxiexzf(view);
        if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf != null) {
            abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.mo1959feyxiexzfUjhhgtg();
            if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3402Ujhhgtgfeyxiexzf(c2234feyxiexzfUjhhgtg, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m3403Ujhhgtgfeyxiexzf(View view, C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, boolean z) {
        AbstractC2684Ujhhgtgfeyxiexzf abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf = m3407Ujhhgtgfeyxiexzf(view);
        if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf != null) {
            abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8573Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
            if (!z) {
                abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.mo1960feyxiexzfUjhhgtg();
                z = abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3403Ujhhgtgfeyxiexzf(viewGroup.getChildAt(i), c2234feyxiexzfUjhhgtg, c2256feyxiexzfUjhhgtg, z);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m3404Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, List list) {
        AbstractC2684Ujhhgtgfeyxiexzf abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf = m3407Ujhhgtgfeyxiexzf(view);
        if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf != null) {
            c2256feyxiexzfUjhhgtg = abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.mo1961feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg, list);
            if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3404Ujhhgtgfeyxiexzf(viewGroup.getChildAt(i), c2256feyxiexzfUjhhgtg, list);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m3405Ujhhgtgfeyxiexzf(View view, C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg) {
        AbstractC2684Ujhhgtgfeyxiexzf abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf = m3407Ujhhgtgfeyxiexzf(view);
        if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf != null) {
            abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.mo1962feyxiexzfUjhhgtg(c2073feyxiexzfUjhhgtg);
            if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3405Ujhhgtgfeyxiexzf(viewGroup.getChildAt(i), c2234feyxiexzfUjhhgtg, c2073feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static WindowInsets m3406Ujhhgtgfeyxiexzf(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static AbstractC2684Ujhhgtgfeyxiexzf m3407Ujhhgtgfeyxiexzf(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg) {
            return ((ViewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg) tag).f7278Ujhhgtgfeyxiexzf;
        }
        return null;
    }
}
