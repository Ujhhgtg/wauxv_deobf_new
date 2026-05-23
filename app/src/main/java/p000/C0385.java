package p000;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0385 implements ValueAnimator.AnimatorUpdateListener {

    public final /* synthetic */ int f1787;

    public final /* synthetic */ Object f1788;

    public /* synthetic */ C0385(int i, Object obj) {
        this.f1787 = i;
        this.f1788 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1787;
        Object obj = this.f1788;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC0389 abstractC0389 = (AbstractC0389) obj;
                for (C3420 c3420 : abstractC0389.f1810) {
                    c3420.f10791 = 1.2f;
                    c3420.f10789 = fFloatValue;
                    c3420.f10790 = fFloatValue;
                    c3420.f10792 = AbstractC0164.m1212(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    c3420.invalidateSelf();
                }
                Field field = AbstractC3578.f11184;
                abstractC0389.postInvalidateOnAnimation();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1917 c1917 = ((BottomSheetBehavior) obj).f580;
                if (c1917 != null) {
                    C1916 c1916 = c1917.f6332;
                    if (c1916.f6322 != fFloatValue2) {
                        c1916.f6322 = fFloatValue2;
                        c1917.f6336 = true;
                        c1917.invalidateSelf();
                    }
                }
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1275 c1275 = (C1275) obj;
                c1275.f4658.setAlpha(iFloatValue);
                c1275.f4659.setAlpha(iFloatValue);
                c1275.f4674.invalidate();
                break;
            case 3:
                ((C1679) obj).f5678 = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((C2891) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 5:
                ((TextInputLayout) obj).f856.m2168(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
