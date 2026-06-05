package p000;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛴ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2478feyxiexzfUjhhgtg implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8103Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2478feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8102Ujhhgtgfeyxiexzf = i;
        this.f8103Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f8102Ujhhgtgfeyxiexzf;
        Object obj = this.f8103Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC2475feyxiexzfUjhhgtg abstractC2475feyxiexzfUjhhgtg = (AbstractC2475feyxiexzfUjhhgtg) obj;
                for (C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg : abstractC2475feyxiexzfUjhhgtg.f8038Ujhhgtgfeyxiexzf) {
                    c1759feyxiexzfUjhhgtg.f5917feyxiexzfUjhhgtg = 1.2f;
                    c1759feyxiexzfUjhhgtg.f5915feyxiexzfUjhhgtg = fFloatValue;
                    c1759feyxiexzfUjhhgtg.f5916feyxiexzfUjhhgtg = fFloatValue;
                    c1759feyxiexzfUjhhgtg.f5918feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4510Ujhhgtgfeyxiexzf(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    c1759feyxiexzfUjhhgtg.invalidateSelf();
                }
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                abstractC2475feyxiexzfUjhhgtg.postInvalidateOnAnimation();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = ((BottomSheetBehavior) obj).f646Ujhhgtgfeyxiexzf;
                if (c0226Ujhhgtgfeyxiexzf != null) {
                    c0226Ujhhgtgfeyxiexzf.m1370Ujhhgtgfeyxiexzf(fFloatValue2);
                }
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf = (C3419Ujhhgtgfeyxiexzf) obj;
                c3419Ujhhgtgfeyxiexzf.f10650Ujhhgtgfeyxiexzf.setAlpha(iFloatValue);
                c3419Ujhhgtgfeyxiexzf.f10651Ujhhgtgfeyxiexzf.setAlpha(iFloatValue);
                c3419Ujhhgtgfeyxiexzf.f10666Ujhhgtgfeyxiexzf.invalidate();
                break;
            case 3:
                ((C0697Ujhhgtgfeyxiexzf) obj).f2865Ujhhgtgfeyxiexzf = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((C1981Ujhhgtgfeyxiexzf) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 5:
                ((TextInputLayout) obj).f936Ujhhgtgfeyxiexzf.m4187Ujhhgtgfeyxiexzf(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
                break;
        }
    }
}
