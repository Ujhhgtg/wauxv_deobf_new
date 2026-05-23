package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0992 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3614 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2508 f3615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f3616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f3617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0997 f3618;

    public C0992(C0997 c0997, AbstractC2508 abstractC2508, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3618 = c0997;
        this.f3615 = abstractC2508;
        this.f3617 = viewPropertyAnimator;
        this.f3616 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3614) {
            case 1:
                this.f3616.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3614) {
            case 0:
                this.f3617.setListener(null);
                this.f3616.setAlpha(1.0f);
                C0997 c0997 = this.f3618;
                AbstractC2508 abstractC2508 = this.f3615;
                c0997.m4447(abstractC2508);
                c0997.f3652.remove(abstractC2508);
                c0997.m2570();
                break;
            default:
                this.f3617.setListener(null);
                C0997 c0998 = this.f3618;
                AbstractC2508 abstractC2509 = this.f3615;
                c0998.m4447(abstractC2509);
                c0998.f3650.remove(abstractC2509);
                c0998.m2570();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3614) {
            case 0:
                this.f3618.getClass();
                break;
            default:
                this.f3618.getClass();
                break;
        }
    }

    public C0992(C0997 c0997, AbstractC2508 abstractC2508, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3618 = c0997;
        this.f3615 = abstractC2508;
        this.f3616 = view;
        this.f3617 = viewPropertyAnimator;
    }
}
