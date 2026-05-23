package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0726 extends AnimatorListenerAdapter {

    public final /* synthetic */ int f2744;

    public final /* synthetic */ C0727 f2745;

    public /* synthetic */ C0726(C0727 c0727, int i) {
        this.f2744 = i;
        this.f2745 = c0727;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2744) {
            case 1:
                this.f2745.f4374.m2821(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2744) {
            case 0:
                this.f2745.f4374.m2821(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
