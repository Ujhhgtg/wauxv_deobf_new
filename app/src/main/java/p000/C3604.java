package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᛸᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3604 extends AnimatorListenerAdapter implements InterfaceC3435 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final View f11250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ViewGroup f11252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f11254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f11255 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f11253 = true;

    public C3604(View view, int i) {
        this.f11250 = view;
        this.f11251 = i;
        this.f11252 = (ViewGroup) view.getParent();
        m5216(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f11255 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f11255) {
            AbstractC3595.m5205(this.f11250, this.f11251);
            ViewGroup viewGroup = this.f11252;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m5216(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2011() {
        m5216(false);
        if (this.f11255) {
            return;
        }
        AbstractC3595.m5205(this.f11250, this.f11251);
    }

    @Override // p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2012(AbstractC3436 abstractC3436) {
        abstractC3436.mo1417(this);
    }

    @Override // p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2013() {
        m5216(true);
        if (this.f11255) {
            return;
        }
        AbstractC3595.m5205(this.f11250, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m5216(boolean z) {
        ViewGroup viewGroup;
        if (!this.f11253 || this.f11254 == z || (viewGroup = this.f11252) == null) {
            return;
        }
        this.f11254 = z;
        AbstractC1270.m2995(viewGroup, z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC3595.m5205(this.f11250, 0);
            ViewGroup viewGroup = this.f11252;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f11255) {
            AbstractC3595.m5205(this.f11250, this.f11251);
            ViewGroup viewGroup = this.f11252;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m5216(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2949(AbstractC3436 abstractC3436) {
    }

    @Override // p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2014(AbstractC3436 abstractC3436) {
    }
}
