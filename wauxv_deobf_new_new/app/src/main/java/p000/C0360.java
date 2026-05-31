package p000;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0360 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1759;

    public /* synthetic */ C0360(Object obj, int i) {
        this.f1758 = i;
        this.f1759 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1758;
        Object obj = this.f1759;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC0364 abstractC0364 = (AbstractC0364) obj;
                for (C3478 c3478 : abstractC0364.f1781) {
                    c3478.f10952 = 1.2f;
                    c3478.f10950 = fFloatValue;
                    c3478.f10951 = fFloatValue;
                    c3478.f10953 = AbstractC0172.m1358(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    c3478.invalidateSelf();
                }
                Field field = AbstractC3638.f11333;
                abstractC0364.postInvalidateOnAnimation();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1948 c1948 = ((BottomSheetBehavior) obj).f632;
                if (c1948 != null) {
                    c1948.m3915(fFloatValue2);
                }
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1277 c1277 = (C1277) obj;
                c1277.f4658.setAlpha(iFloatValue);
                c1277.f4659.setAlpha(iFloatValue);
                c1277.f4674.invalidate();
                break;
            case 3:
                ((C1696) obj).f5718 = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((C2950) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 5:
                ((TextInputLayout) obj).f922.m2260(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
