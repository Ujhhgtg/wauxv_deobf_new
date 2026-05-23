package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1263 extends AnimatorListenerAdapter implements InterfaceC3435 {

    public final View f4593;

    public boolean f4594 = false;

    public C1263(View view) {
        this.f4593 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC3595.f11231.mo3227(this.f4593, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4593;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4594 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p000.InterfaceC3435
    public final void mo2011() {
        View view = this.f4593;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC3595.f11231.mo3226(view) : 0.0f));
    }

    @Override // p000.InterfaceC3435
    public final void mo2013() {
        this.f4593.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f4594;
        View view = this.f4593;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C3600 c3600 = AbstractC3595.f11231;
        c3600.mo3227(view, 1.0f);
        
    }

    @Override // p000.InterfaceC3435
    public final void mo2949(AbstractC3436 abstractC3436) {
    }

    @Override // p000.InterfaceC3435
    public final void mo2012(AbstractC3436 abstractC3436) {
    }

    @Override // p000.InterfaceC3435
    public final void mo2950(AbstractC3436 abstractC3436) {
    }

    @Override // p000.InterfaceC3435
    public final void mo2014(AbstractC3436 abstractC3436) {
    }
}
