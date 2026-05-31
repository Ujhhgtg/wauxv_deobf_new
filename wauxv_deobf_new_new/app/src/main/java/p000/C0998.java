package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0998 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0999 f3642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f3643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f3644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1001 f3645;

    public /* synthetic */ C0998(C1001 c1001, C0999 c0999, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3641 = i;
        this.f3645 = c1001;
        this.f3642 = c0999;
        this.f3643 = viewPropertyAnimator;
        this.f3644 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3641) {
            case 0:
                this.f3643.setListener(null);
                View view = this.f3644;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0999 c0999 = this.f3642;
                AbstractC2563 abstractC2563 = c0999.f3646;
                C1001 c1001 = this.f3645;
                c1001.m4469(abstractC2563);
                c1001.f3669.remove(c0999.f3646);
                c1001.m2694();
                break;
            default:
                this.f3643.setListener(null);
                View view2 = this.f3644;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0999 c09910 = this.f3642;
                AbstractC2563 abstractC2564 = c09910.f3647;
                C1001 c1002 = this.f3645;
                c1002.m4469(abstractC2564);
                c1002.f3669.remove(c09910.f3647);
                c1002.m2694();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3641) {
            case 0:
                AbstractC2563 abstractC2563 = this.f3642.f3646;
                this.f3645.getClass();
                break;
            default:
                AbstractC2563 abstractC2564 = this.f3642.f3647;
                this.f3645.getClass();
                break;
        }
    }
}
