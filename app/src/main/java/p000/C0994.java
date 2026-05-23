package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0994 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0995 f3626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f3627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f3628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0997 f3629;

    public /* synthetic */ C0994(C0997 c0997, C0995 c0995, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3625 = i;
        this.f3629 = c0997;
        this.f3626 = c0995;
        this.f3627 = viewPropertyAnimator;
        this.f3628 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3625) {
            case 0:
                this.f3627.setListener(null);
                View view = this.f3628;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0995 c0995 = this.f3626;
                AbstractC2508 abstractC2508 = c0995.f3630;
                C0997 c0997 = this.f3629;
                c0997.m4447(abstractC2508);
                c0997.f3653.remove(c0995.f3630);
                c0997.m2570();
                break;
            default:
                this.f3627.setListener(null);
                View view2 = this.f3628;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0995 c0996 = this.f3626;
                AbstractC2508 abstractC2509 = c0996.f3631;
                C0997 c0998 = this.f3629;
                c0998.m4447(abstractC2509);
                c0998.f3653.remove(c0996.f3631);
                c0998.m2570();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3625) {
            case 0:
                AbstractC2508 abstractC2508 = this.f3626.f3630;
                this.f3629.getClass();
                break;
            default:
                AbstractC2508 abstractC2509 = this.f3626.f3631;
                this.f3629.getClass();
                break;
        }
    }
}
