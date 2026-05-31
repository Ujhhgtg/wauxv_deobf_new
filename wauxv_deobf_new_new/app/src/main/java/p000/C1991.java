package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1991 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0941 f6584;

    public /* synthetic */ C1991(C0941 c0941, int i) {
        this.f6583 = i;
        this.f6584 = c0941;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6583) {
            case 0:
                ((C1992) this.f6584.f3452).f6586.m907(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C1992) this.f6584.f3452).f6586.m907(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
