package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᛸᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3488 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f10966 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f10967;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f10968;

    public C3488(C3707 c3707, View view) {
        this.f10967 = c3707;
        this.f10968 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10966) {
            case 0:
                ((C0274) this.f10967).remove(animator);
                ((AbstractC3493) this.f10968).f10993.remove(animator);
                break;
            default:
                C3707 c3707 = (C3707) this.f10967;
                c3707.f11565.mo5249(1.0f);
                C3703.m5239(c3707, (View) this.f10968);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10966) {
            case 0:
                ((AbstractC3493) this.f10968).f10993.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C3488(AbstractC3493 abstractC3493, C0274 c0274) {
        this.f10968 = abstractC3493;
        this.f10967 = c0274;
    }
}
