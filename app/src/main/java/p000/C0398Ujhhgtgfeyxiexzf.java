package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸能不能ᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0398Ujhhgtgfeyxiexzf implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2146Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3081Ujhhgtgfeyxiexzf f2147Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0398Ujhhgtgfeyxiexzf(C3081Ujhhgtgfeyxiexzf c3081Ujhhgtgfeyxiexzf, int i) {
        this.f2146Ujhhgtgfeyxiexzf = i;
        this.f2147Ujhhgtgfeyxiexzf = c3081Ujhhgtgfeyxiexzf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2146Ujhhgtgfeyxiexzf) {
            case 0:
                ((C0399Ujhhgtgfeyxiexzf) this.f2147Ujhhgtgfeyxiexzf.f9524Ujhhgtgfeyxiexzf).f2149Ujhhgtgfeyxiexzf.m908Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C0399Ujhhgtgfeyxiexzf) this.f2147Ujhhgtgfeyxiexzf.f9524Ujhhgtgfeyxiexzf).f2149Ujhhgtgfeyxiexzf.m908Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
