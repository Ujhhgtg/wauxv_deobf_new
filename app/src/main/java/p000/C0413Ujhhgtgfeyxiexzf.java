package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ要点脸ᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0413Ujhhgtgfeyxiexzf implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ float f2235Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0410Ujhhgtgfeyxiexzf f2236Ujhhgtgfeyxiexzf;

    public C0413Ujhhgtgfeyxiexzf(AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf, float f) {
        this.f2236Ujhhgtgfeyxiexzf = abstractC0410Ujhhgtgfeyxiexzf;
        this.f2235Ujhhgtgfeyxiexzf = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2236Ujhhgtgfeyxiexzf.m1696Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f2235Ujhhgtgfeyxiexzf);
    }
}
