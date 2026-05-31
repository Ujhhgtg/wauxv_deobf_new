package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲀᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 extends AnimatorListenerAdapter implements InterfaceC3492 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final View f4592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f4593 = false;

    public C1265(View view) {
        this.f4592 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC3655.f11380.mo3496(this.f4592, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4592;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4593 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2108() {
        View view = this.f4592;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC3655.f11380.mo3495(view) : 0.0f));
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2110() {
        this.f4592.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f4593;
        View view = this.f4592;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C3660 c3660 = AbstractC3655.f11380;
        c3660.mo3496(view, 1.0f);
        c3660.getClass();
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo3068(AbstractC3493 abstractC3493) {
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2109(AbstractC3493 abstractC3493) {
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo3069(AbstractC3493 abstractC3493) {
    }

    @Override // p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2111(AbstractC3493 abstractC3493) {
    }
}
