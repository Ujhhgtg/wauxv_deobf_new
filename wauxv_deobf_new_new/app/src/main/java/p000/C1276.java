package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1276 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f4652 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1277 f4653;

    public C1276(C1277 c1277) {
        this.f4653 = c1277;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4652 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4652) {
            this.f4652 = false;
            return;
        }
        C1277 c1277 = this.f4653;
        if (((Float) c1277.f4681.getAnimatedValue()).floatValue() == 0.0f) {
            c1277.f4682 = 0;
            c1277.m3113(0);
        } else {
            c1277.f4682 = 2;
            c1277.f4674.invalidate();
        }
    }
}
