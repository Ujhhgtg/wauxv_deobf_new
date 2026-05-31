package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0996 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3630 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2563 f3631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f3632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f3633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1001 f3634;

    public C0996(C1001 c1001, AbstractC2563 abstractC2563, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3634 = c1001;
        this.f3631 = abstractC2563;
        this.f3633 = viewPropertyAnimator;
        this.f3632 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3630) {
            case 1:
                this.f3632.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3630) {
            case 0:
                this.f3633.setListener(null);
                this.f3632.setAlpha(1.0f);
                C1001 c1001 = this.f3634;
                AbstractC2563 abstractC2563 = this.f3631;
                c1001.m4469(abstractC2563);
                c1001.f3668.remove(abstractC2563);
                c1001.m2694();
                break;
            default:
                this.f3633.setListener(null);
                C1001 c1002 = this.f3634;
                AbstractC2563 abstractC2564 = this.f3631;
                c1002.m4469(abstractC2564);
                c1002.f3666.remove(abstractC2564);
                c1002.m2694();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3630) {
            case 0:
                this.f3634.getClass();
                break;
            default:
                this.f3634.getClass();
                break;
        }
    }

    public C0996(C1001 c1001, AbstractC2563 abstractC2563, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3634 = c1001;
        this.f3631 = abstractC2563;
        this.f3632 = view;
        this.f3633 = viewPropertyAnimator;
    }
}
