package p000;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3235feyxiexzfUjhhgtg implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10150Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10151Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3235feyxiexzfUjhhgtg(int i, Object obj) {
        this.f10150Ujhhgtgfeyxiexzf = i;
        this.f10151Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        switch (this.f10150Ujhhgtgfeyxiexzf) {
            case 0:
                C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = (C3245feyxiexzfUjhhgtg) this.f10151Ujhhgtgfeyxiexzf;
                c3245feyxiexzfUjhhgtg.getClass();
                c3245feyxiexzfUjhhgtg.f10415Ujhhgtgfeyxiexzf.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = (C0197Ujhhgtgfeyxiexzf) this.f10151Ujhhgtgfeyxiexzf;
                c0197Ujhhgtgfeyxiexzf.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0197Ujhhgtgfeyxiexzf.f1434Ujhhgtgfeyxiexzf.setAlpha((int) (255.0f * fFloatValue));
                c0197Ujhhgtgfeyxiexzf.f1448Ujhhgtgfeyxiexzf = fFloatValue;
                break;
            case 2:
                Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0402Ujhhgtgfeyxiexzf((AbstractC0384Ujhhgtgfeyxiexzf) this.f10151Ujhhgtgfeyxiexzf));
                break;
            case 3:
                C1464feyxiexzfUjhhgtg c1464feyxiexzfUjhhgtg = (C1464feyxiexzfUjhhgtg) this.f10151Ujhhgtgfeyxiexzf;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1464feyxiexzfUjhhgtg.f5095Ujhhgtgfeyxiexzf = fFloatValue2;
                float f2 = 1.0f;
                float f3 = 0.0f;
                if (fFloatValue2 > 0.5f) {
                    f3 = (fFloatValue2 - 0.5f) * 2.0f;
                    f = 0.0f;
                } else if (fFloatValue2 > 0.33f) {
                    f2 = (fFloatValue2 - 0.33f) * 6.0f;
                    f = 0.0f;
                } else {
                    f = 1.0f - (fFloatValue2 * 3.0f);
                    f2 = 0.0f;
                }
                c1464feyxiexzfUjhhgtg.f5093Ujhhgtgfeyxiexzf = c1464feyxiexzfUjhhgtg.f5090Ujhhgtgfeyxiexzf.getInterpolation(f2) * 0.8f;
                c1464feyxiexzfUjhhgtg.f5088Ujhhgtgfeyxiexzf = c1464feyxiexzfUjhhgtg.f5091Ujhhgtgfeyxiexzf.getInterpolation(f3) * 45;
                c1464feyxiexzfUjhhgtg.f5094Ujhhgtgfeyxiexzf = c1464feyxiexzfUjhhgtg.f5092Ujhhgtgfeyxiexzf.getInterpolation(f);
                c1464feyxiexzfUjhhgtg.invalidateSelf();
                break;
            default:
                C1177feyxiexzfUjhhgtg c1177feyxiexzfUjhhgtg = (C1177feyxiexzfUjhhgtg) this.f10151Ujhhgtgfeyxiexzf;
                Object animatedValue = valueAnimator.getAnimatedValue();
                MagicFactory.get(4928456104368670090L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                c1177feyxiexzfUjhhgtg.scrollTo(((Integer) animatedValue).intValue(), 0);
                break;
        }
    }
}
