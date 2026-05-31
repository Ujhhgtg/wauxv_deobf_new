package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2155 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ float f7107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2157 f7108;

    public C2155(AbstractC2157 abstractC2157, float f) {
        this.f7108 = abstractC2157;
        this.f7107 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7108.m4121(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f7107);
    }
}
