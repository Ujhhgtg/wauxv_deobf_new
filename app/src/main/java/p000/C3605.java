package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3605 extends AnimatorListenerAdapter implements InterfaceC3435 {

    public final ViewGroup f11256;

    public final View f11257;

    public final View f11258;

    public boolean f11259 = true;

    public final /* synthetic */ C1264 f11260;

    public C3605(C1264 c1264, ViewGroup viewGroup, View view, View view2) {
        this.f11260 = c1264;
        this.f11256 = viewGroup;
        this.f11257 = view;
        this.f11258 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m5217();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f11256.getOverlay().remove(this.f11257);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f11257;
        if (view.getParent() == null) {
            this.f11256.getOverlay().add(view);
        } else {
            this.f11260.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f11258;
            View view2 = this.f11257;
            view.setTag(R.id.save_overlay_view, view2);
            this.f11256.getOverlay().add(view2);
            this.f11259 = true;
        }
    }

    @Override // p000.InterfaceC3435
    public final void mo2012(AbstractC3436 abstractC3436) {
        abstractC3436.mo1417(this);
    }

    @Override // p000.InterfaceC3435
    public final void mo2014(AbstractC3436 abstractC3436) {
        if (this.f11259) {
            m5217();
        }
    }

    public final void m5217() {
        this.f11258.setTag(R.id.save_overlay_view, null);
        this.f11256.getOverlay().remove(this.f11257);
        this.f11259 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m5217();
    }

    @Override // p000.InterfaceC3435
    public final void mo2011() {
    }

    @Override // p000.InterfaceC3435
    public final void mo2013() {
    }

    @Override // p000.InterfaceC3435
    public final void mo2949(AbstractC3436 abstractC3436) {
    }
}
