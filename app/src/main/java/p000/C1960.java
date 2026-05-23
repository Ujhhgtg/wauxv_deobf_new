package p000;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1960 implements ValueAnimator.AnimatorUpdateListener {

    public final /* synthetic */ int f6478;

    public final /* synthetic */ C0942 f6479;

    public /* synthetic */ C1960(C0942 c0942, int i) {
        this.f6478 = i;
        this.f6479 = c0942;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6478) {
            case 0:
                ((C1961) this.f6479.f3445).f6481.m763(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C1961) this.f6479.f3445).f6481.m763(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
