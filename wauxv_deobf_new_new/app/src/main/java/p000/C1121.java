package p000;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᤞᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1121 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4173;

    public /* synthetic */ C1121(Object obj, int i) {
        this.f4172 = i;
        this.f4173 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        switch (this.f4172) {
            case 0:
                C1124 c1124 = (C1124) this.f4173;
                c1124.getClass();
                c1124.f4373.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                C1941 c1941 = (C1941) this.f4173;
                c1941.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1941.f6399.setAlpha((int) (255.0f * fFloatValue));
                c1941.f6413 = fFloatValue;
                break;
            case 2:
                Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC1995((AbstractC1997) this.f4173, 0));
                break;
            case 3:
                C2329 c2329 = (C2329) this.f4173;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2329.f7526 = fFloatValue2;
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
                c2329.f7524 = c2329.f7521.getInterpolation(f2) * 0.8f;
                c2329.f7519 = c2329.f7522.getInterpolation(f3) * 45;
                c2329.f7525 = c2329.f7523.getInterpolation(f);
                c2329.invalidateSelf();
                break;
            default:
                C2925 c2925 = (C2925) this.f4173;
                Object animatedValue = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Int";
                c2925.scrollTo(((Integer) animatedValue).intValue(), 0);
                break;
        }
    }
}
