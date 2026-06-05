package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2078feyxiexzfUjhhgtg implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f6820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ View f6821Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2079feyxiexzfUjhhgtg f6822Ujhhgtgfeyxiexzf;

    public C2078feyxiexzfUjhhgtg(C2079feyxiexzfUjhhgtg c2079feyxiexzfUjhhgtg, View view, View view2) {
        this.f6822Ujhhgtgfeyxiexzf = c2079feyxiexzfUjhhgtg;
        this.f6820Ujhhgtgfeyxiexzf = view;
        this.f6821Ujhhgtgfeyxiexzf = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6822Ujhhgtgfeyxiexzf.m3382Ujhhgtgfeyxiexzf(this.f6820Ujhhgtgfeyxiexzf, this.f6821Ujhhgtgfeyxiexzf, valueAnimator.getAnimatedFraction());
    }
}
