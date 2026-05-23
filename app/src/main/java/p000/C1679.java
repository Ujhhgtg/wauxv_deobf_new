package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1679 implements Animator.AnimatorListener {

    public final float f5666;

    public final float f5667;

    public final float f5668;

    public final float f5669;

    public final AbstractC2508 f5670;

    public final int f5671;

    public final ValueAnimator f5672;

    public boolean f5673;

    public float f5674;

    public float f5675;

    public boolean f5676 = false;

    public boolean f5677 = false;

    public float f5678;

    public final /* synthetic */ int f5679;

    public final /* synthetic */ AbstractC2508 f5680;

    public final /* synthetic */ C1682 f5681;

    public C1679(C1682 c1682, AbstractC2508 abstractC2508, int i, float f, float f2, float f3, float f4, int i2, AbstractC2508 abstractC2509) {
        this.f5681 = c1682;
        this.f5679 = i2;
        this.f5680 = abstractC2509;
        this.f5671 = i;
        this.f5670 = abstractC2508;
        this.f5666 = f;
        this.f5667 = f2;
        this.f5668 = f3;
        this.f5669 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5672 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0385(3, this));
        valueAnimatorOfFloat.setTarget(abstractC2508.f8006);
        valueAnimatorOfFloat.addListener(this);
        this.f5678 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5678 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3408(animator);
        if (this.f5676) {
            return;
        }
        int i = this.f5679;
        AbstractC2508 abstractC2508 = this.f5680;
        C1682 c1682 = this.f5681;
        if (i <= 0) {
            
            C0662.m2043(abstractC2508);
        } else {
            c1682.f5685.add(abstractC2508.f8006);
            this.f5673 = true;
            if (true) {
                c1682.f5702.post(new RunnableC0132(c1682, this, i));
            }
        }
        View view = c1682.f5707;
        View view2 = abstractC2508.f8006;
        if (view == view2) {
            c1682.m3419(view2);
        }
    }

    public final void m3408(Animator animator) {
        if (!this.f5677) {
            this.f5670.m4524(true);
        }
        this.f5677 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
