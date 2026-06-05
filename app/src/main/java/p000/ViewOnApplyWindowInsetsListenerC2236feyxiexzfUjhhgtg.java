package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractC2684Ujhhgtgfeyxiexzf f7278Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f7279Ujhhgtgfeyxiexzf;

    public ViewOnApplyWindowInsetsListenerC2236feyxiexzfUjhhgtg(View view, AbstractC2684Ujhhgtgfeyxiexzf abstractC2684Ujhhgtgfeyxiexzf) {
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgMo3411Ujhhgtgfeyxiexzf;
        this.f7278Ujhhgtgfeyxiexzf = abstractC2684Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf = AbstractC1892Ujhhgtgfeyxiexzf.m3224Ujhhgtgfeyxiexzf(view);
        if (c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf != null) {
            int i = Build.VERSION.SDK_INT;
            c2256feyxiexzfUjhhgtgMo3411Ujhhgtgfeyxiexzf = (i >= 36 ? new C2268Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : i >= 35 ? new C2240feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : i >= 34 ? new C2241feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : i >= 31 ? new C2238feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : i >= 30 ? new C2239feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : i >= 29 ? new C2243feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf) : new C2242feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtgM3224Ujhhgtgfeyxiexzf)).mo3411Ujhhgtgfeyxiexzf();
        } else {
            c2256feyxiexzfUjhhgtgMo3411Ujhhgtgfeyxiexzf = null;
        }
        this.f7279Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgMo3411Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f7279Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(view, windowInsets);
            return C2237feyxiexzfUjhhgtg.m3406Ujhhgtgfeyxiexzf(view, windowInsets);
        }
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(view, windowInsets);
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf;
        if (this.f7279Ujhhgtgfeyxiexzf == null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            this.f7279Ujhhgtgfeyxiexzf = AbstractC1892Ujhhgtgfeyxiexzf.m3224Ujhhgtgfeyxiexzf(view);
        }
        if (this.f7279Ujhhgtgfeyxiexzf == null) {
            this.f7279Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
            return C2237feyxiexzfUjhhgtg.m3406Ujhhgtgfeyxiexzf(view, windowInsets);
        }
        AbstractC2684Ujhhgtgfeyxiexzf abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf = C2237feyxiexzfUjhhgtg.m3407Ujhhgtgfeyxiexzf(view);
        if (abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf != null && Objects.equals((C2256feyxiexzfUjhhgtg) abstractC2684UjhhgtgfeyxiexzfM3407Ujhhgtgfeyxiexzf.f8573Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf)) {
            return C2237feyxiexzfUjhhgtg.m3406Ujhhgtgfeyxiexzf(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = this.f7279Ujhhgtgfeyxiexzf;
        int i = 1;
        while (i <= 512) {
            C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf = c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i);
            C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2 = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i);
            int i2 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf;
            int i3 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf;
            int i4 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf;
            int i5 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf;
            int i6 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2818Ujhhgtgfeyxiexzf;
            int i7 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2821Ujhhgtgfeyxiexzf;
            int i8 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2820Ujhhgtgfeyxiexzf;
            int i9 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2819Ujhhgtgfeyxiexzf;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.f7279Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
            return C2237feyxiexzfUjhhgtg.m3406Ujhhgtgfeyxiexzf(view, windowInsets);
        }
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg2 = this.f7279Ujhhgtgfeyxiexzf;
        if ((i10 & 8) != 0) {
            interpolator = C2237feyxiexzfUjhhgtg.f7280Ujhhgtgfeyxiexzf;
        } else if ((i11 & 8) != 0) {
            interpolator = C2237feyxiexzfUjhhgtg.f7281Ujhhgtgfeyxiexzf;
        } else if ((i10 & 519) != 0) {
            interpolator = C2237feyxiexzfUjhhgtg.f7282Ujhhgtgfeyxiexzf;
        } else {
            interpolator = (i11 & 519) != 0 ? C2237feyxiexzfUjhhgtg.f7283Ujhhgtgfeyxiexzf : null;
        }
        C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg = new C2234feyxiexzfUjhhgtg(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf.mo3400Ujhhgtgfeyxiexzf(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf.mo3397Ujhhgtgfeyxiexzf());
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3 = c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i12);
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4 = c2256feyxiexzfUjhhgtg2.f7334Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i12);
        int iMin = Math.min(c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3.f2818Ujhhgtgfeyxiexzf, c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4.f2818Ujhhgtgfeyxiexzf);
        int i13 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3.f2819Ujhhgtgfeyxiexzf;
        int i14 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4.f2819Ujhhgtgfeyxiexzf;
        int iMin2 = Math.min(i13, i14);
        int i15 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3.f2820Ujhhgtgfeyxiexzf;
        int i16 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4.f2820Ujhhgtgfeyxiexzf;
        int iMin3 = Math.min(i15, i16);
        int i17 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3.f2821Ujhhgtgfeyxiexzf;
        int i18 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4.f2821Ujhhgtgfeyxiexzf;
        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = new C2073feyxiexzfUjhhgtg(C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(iMin, iMin2, iMin3, Math.min(i17, i18)), 5, C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(Math.max(c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf3.f2818Ujhhgtgfeyxiexzf, c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf4.f2818Ujhhgtgfeyxiexzf), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        C2237feyxiexzfUjhhgtg.m3403Ujhhgtgfeyxiexzf(view, c2234feyxiexzfUjhhgtg, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf, false);
        duration.addUpdateListener(new C2228feyxiexzfUjhhgtg(c2234feyxiexzfUjhhgtg, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtg2, i12, view));
        duration.addListener(new C1749feyxiexzfUjhhgtg(c2234feyxiexzfUjhhgtg, view));
        RunnableC2785Ujhhgtgfeyxiexzf runnableC2785Ujhhgtgfeyxiexzf = new RunnableC2785Ujhhgtgfeyxiexzf(view, c2234feyxiexzfUjhhgtg, c2073feyxiexzfUjhhgtg, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg viewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg = new ViewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg(view, runnableC2785Ujhhgtgfeyxiexzf);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1460feyxiexzfUjhhgtg);
        this.f7279Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
        return C2237feyxiexzfUjhhgtg.m3406Ujhhgtgfeyxiexzf(view, windowInsets);
    }
}
