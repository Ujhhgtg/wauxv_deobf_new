package p000;

import android.animation.Animator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2672 implements Animator.AnimatorListener {

    public final /* synthetic */ View f8600;

    public final /* synthetic */ ColorDrawable f8601;

    public C2672(View view, ColorDrawable colorDrawable) {
        this.f8600 = view;
        this.f8601 = colorDrawable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8600.getOverlay().remove(this.f8601);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
