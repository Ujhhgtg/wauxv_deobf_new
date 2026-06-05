package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2228feyxiexzfUjhhgtg implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2234feyxiexzfUjhhgtg f7249Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C2256feyxiexzfUjhhgtg f7250Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2256feyxiexzfUjhhgtg f7251Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7252Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ View f7253Ujhhgtgfeyxiexzf;

    public C2228feyxiexzfUjhhgtg(C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg2, int i, View view) {
        this.f7249Ujhhgtgfeyxiexzf = c2234feyxiexzfUjhhgtg;
        this.f7250Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
        this.f7251Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg2;
        this.f7252Ujhhgtgfeyxiexzf = i;
        this.f7253Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC2269Ujhhgtgfeyxiexzf c2243feyxiexzfUjhhgtg;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg = this.f7249Ujhhgtgfeyxiexzf;
        AbstractC2235feyxiexzfUjhhgtg abstractC2235feyxiexzfUjhhgtg = c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf;
        abstractC2235feyxiexzfUjhhgtg.mo3400Ujhhgtgfeyxiexzf(animatedFraction);
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = this.f7250Ujhhgtgfeyxiexzf;
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf;
        float fMo3398Ujhhgtgfeyxiexzf = abstractC2235feyxiexzfUjhhgtg.mo3398Ujhhgtgfeyxiexzf();
        PathInterpolator pathInterpolator = C2237feyxiexzfUjhhgtg.f7280Ujhhgtgfeyxiexzf;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c2243feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtg);
        } else if (i >= 35) {
            c2243feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
        } else if (i >= 34) {
            c2243feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
        } else if (i >= 31) {
            c2243feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
        } else if (i >= 30) {
            c2243feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
        } else {
            c2243feyxiexzfUjhhgtg = i >= 29 ? new C2243feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg) : new C2242feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.f7252Ujhhgtgfeyxiexzf & i2) == 0) {
                c2243feyxiexzfUjhhgtg.mo3408Ujhhgtgfeyxiexzf(i2, c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i2));
            } else {
                C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf = c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i2);
                C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2 = this.f7251Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(i2);
                float f = 1.0f - fMo3398Ujhhgtgfeyxiexzf;
                c2243feyxiexzfUjhhgtg.mo3408Ujhhgtgfeyxiexzf(i2, C2256feyxiexzfUjhhgtg.m3449Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf, (int) (((double) ((c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf - c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2818Ujhhgtgfeyxiexzf) * f)) + 0.5d), (int) (((double) ((c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf - c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2819Ujhhgtgfeyxiexzf) * f)) + 0.5d), (int) (((double) ((c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf - c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2820Ujhhgtgfeyxiexzf) * f)) + 0.5d), (int) (((double) ((c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2821Ujhhgtgfeyxiexzf - c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2821Ujhhgtgfeyxiexzf) * f)) + 0.5d)));
            }
        }
        C2237feyxiexzfUjhhgtg.m3404Ujhhgtgfeyxiexzf(this.f7253Ujhhgtgfeyxiexzf, c2243feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf(), Collections.singletonList(c2234feyxiexzfUjhhgtg));
    }
}
