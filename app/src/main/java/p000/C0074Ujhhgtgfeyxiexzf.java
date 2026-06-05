package p000;

import android.animation.ValueAnimator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0074Ujhhgtgfeyxiexzf implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1130Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0113Ujhhgtgfeyxiexzf f1131Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0074Ujhhgtgfeyxiexzf(C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf, int i) {
        this.f1130Ujhhgtgfeyxiexzf = i;
        this.f1131Ujhhgtgfeyxiexzf = c0113Ujhhgtgfeyxiexzf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1130Ujhhgtgfeyxiexzf) {
            case 0:
                C0113Ujhhgtgfeyxiexzf.m1168Ujhhgtgfeyxiexzf(this.f1131Ujhhgtgfeyxiexzf, valueAnimator);
                break;
            default:
                Object animatedValue = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Float";
                float fFloatValue = ((Float) animatedValue).floatValue();
                C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf = this.f1131Ujhhgtgfeyxiexzf;
                c0113Ujhhgtgfeyxiexzf.f1252Ujhhgtgfeyxiexzf = fFloatValue;
                c0113Ujhhgtgfeyxiexzf.m1177Ujhhgtgfeyxiexzf();
                break;
        }
    }
}
