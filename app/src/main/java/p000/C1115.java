package p000;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1115 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4162;

    public /* synthetic */ C1115(int i, Object obj) {
        this.f4161 = i;
        this.f4162 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        switch (this.f4161) {
            case 0:
                C1118 c1118 = (C1118) this.f4162;
                c1118.getClass();
                c1118.f4376.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                View view = ((C1803) this.f4162).f6025;
                Object animatedValue = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Float";
                view.setTranslationX(((Float) animatedValue).floatValue());
                break;
            case 2:
                Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC1964(0, (AbstractC1966) this.f4162));
                break;
            case 3:
                C2296 c2296 = (C2296) this.f4162;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2296.f7404 = fFloatValue;
                float f2 = 1.0f;
                float f3 = 0.0f;
                if (fFloatValue > 0.5f) {
                    f3 = (fFloatValue - 0.5f) * 2.0f;
                    f = 0.0f;
                } else if (fFloatValue > 0.33f) {
                    f2 = (fFloatValue - 0.33f) * 6.0f;
                    f = 0.0f;
                } else {
                    f = 1.0f - (fFloatValue * 3.0f);
                    f2 = 0.0f;
                }
                c2296.f7402 = c2296.f7399.getInterpolation(f2) * 0.8f;
                c2296.f7397 = c2296.f7400.getInterpolation(f3) * 45;
                c2296.f7403 = c2296.f7401.getInterpolation(f);
                c2296.invalidateSelf();
                break;
            default:
                C2865 c2865 = (C2865) this.f4162;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Int";
                c2865.scrollTo(((Integer) animatedValue2).intValue(), 0);
                break;
        }
    }
}
