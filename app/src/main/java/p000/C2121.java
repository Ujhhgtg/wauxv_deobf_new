package p000;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2121 implements ValueAnimator.AnimatorUpdateListener {

    public final /* synthetic */ float f6983;

    public final /* synthetic */ AbstractC2123 f6984;

    public C2121(AbstractC2123 abstractC2123, float f) {
        this.f6984 = abstractC2123;
        this.f6983 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6984.m3937(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f6983);
    }
}
