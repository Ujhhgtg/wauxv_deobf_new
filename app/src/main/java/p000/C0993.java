package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0993 extends AnimatorListenerAdapter {

    public final /* synthetic */ AbstractC2508 f3619;

    public final /* synthetic */ int f3620;

    public final /* synthetic */ View f3621;

    public final /* synthetic */ int f3622;

    public final /* synthetic */ ViewPropertyAnimator f3623;

    public final /* synthetic */ C0997 f3624;

    public C0993(C0997 c0997, AbstractC2508 abstractC2508, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3624 = c0997;
        this.f3619 = abstractC2508;
        this.f3620 = i;
        this.f3621 = view;
        this.f3622 = i2;
        this.f3623 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3620;
        View view = this.f3621;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3622 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3623.setListener(null);
        C0997 c0997 = this.f3624;
        AbstractC2508 abstractC2508 = this.f3619;
        c0997.m4447(abstractC2508);
        c0997.f3651.remove(abstractC2508);
        c0997.m2570();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        
    }
}
