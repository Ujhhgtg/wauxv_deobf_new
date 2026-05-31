package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3701 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C3707 f11545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C3729 f11546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C3729 f11547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f11549;

    public C3701(C3707 c3707, C3729 c3729, C3729 c37210, int i, View view) {
        this.f11545 = c3707;
        this.f11546 = c3729;
        this.f11547 = c37210;
        this.f11548 = i;
        this.f11549 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC3715 c3709;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3707 c3707 = this.f11545;
        AbstractC3706 abstractC3706 = c3707.f11565;
        abstractC3706.mo5249(animatedFraction);
        C3729 c3729 = this.f11546;
        C3725 c3725 = c3729.f11601;
        float fMo5247 = abstractC3706.mo5247();
        PathInterpolator pathInterpolator = C3703.f11552;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c3709 = new C3714(c3729);
        } else if (i >= 35) {
            c3709 = new C3713(c3729);
        } else if (i >= 34) {
            c3709 = new C3712(c3729);
        } else if (i >= 31) {
            c3709 = new C3711(c3729);
        } else if (i >= 30) {
            c3709 = new C3710(c3729);
        } else {
            c3709 = i >= 29 ? new C3709(c3729) : new C3708(c3729);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.f11548 & i2) == 0) {
                c3709.mo5257(i2, c3725.mo5271(i2));
            } else {
                C1660 c1660Mo5271 = c3725.mo5271(i2);
                C1660 c1660Mo5272 = this.f11547.f11601.mo5271(i2);
                float f = 1.0f - fMo5247;
                c3709.mo5257(i2, C3729.m5304(c1660Mo5271, (int) (((double) ((c1660Mo5271.f5615 - c1660Mo5272.f5615) * f)) + 0.5d), (int) (((double) ((c1660Mo5271.f5616 - c1660Mo5272.f5616) * f)) + 0.5d), (int) (((double) ((c1660Mo5271.f5617 - c1660Mo5272.f5617) * f)) + 0.5d), (int) (((double) ((c1660Mo5271.f5618 - c1660Mo5272.f5618) * f)) + 0.5d)));
            }
        }
        C3703.m5241(this.f11549, c3709.mo5251(), Collections.singletonList(c3707));
    }
}
