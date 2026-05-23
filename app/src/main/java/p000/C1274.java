package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1274 extends AnimatorListenerAdapter {

    public boolean f4652 = false;

    public final /* synthetic */ C1275 f4653;

    public C1274(C1275 c1275) {
        this.f4653 = c1275;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4652 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4652) {
            this.f4652 = false;
            return;
        }
        C1275 c1275 = this.f4653;
        if (((Float) c1275.f4681.getAnimatedValue()).floatValue() == 0.0f) {
            c1275.f4682 = 0;
            c1275.m3010(0);
        } else {
            c1275.f4682 = 2;
            c1275.f4674.invalidate();
        }
    }
}
