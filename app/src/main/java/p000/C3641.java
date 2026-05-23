package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3641 implements ValueAnimator.AnimatorUpdateListener {

    public final /* synthetic */ C3647 f11396;

    public final /* synthetic */ C3669 f11397;

    public final /* synthetic */ C3669 f11398;

    public final /* synthetic */ int f11399;

    public final /* synthetic */ View f11400;

    public C3641(C3647 c3647, C3669 c3669, C3669 c36610, int i, View view) {
        this.f11396 = c3647;
        this.f11397 = c3669;
        this.f11398 = c36610;
        this.f11399 = i;
        this.f11400 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC3655 c3649;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3647 c3647 = this.f11396;
        AbstractC3646 abstractC3646 = c3647.f11416;
        abstractC3646.mo5243(animatedFraction);
        C3669 c3669 = this.f11397;
        C3665 c3665 = c3669.f11452;
        float fMo5241 = abstractC3646.mo5241();
        PathInterpolator pathInterpolator = C3643.f11403;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c3649 = new C3654(c3669);
        } else if (i >= 35) {
            c3649 = new C3653(c3669);
        } else if (i >= 34) {
            c3649 = new C3652(c3669);
        } else if (i >= 31) {
            c3649 = new C3651(c3669);
        } else if (i >= 30) {
            c3649 = new C3650(c3669);
        } else {
            c3649 = i >= 29 ? new C3649(c3669) : new C3648(c3669);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.f11399 & i2) == 0) {
                c3649.mo5251(i2, c3665.mo5265(i2));
            } else {
                C1646 c1646Mo5265 = c3665.mo5265(i2);
                C1646 c1646Mo5266 = this.f11398.f11452.mo5265(i2);
                float f = 1.0f - fMo5241;
                c3649.mo5251(i2, C3669.m5298(c1646Mo5265, (int) (((double) ((c1646Mo5265.f5580 - c1646Mo5266.f5580) * f)) + 0.5d), (int) (((double) ((c1646Mo5265.f5581 - c1646Mo5266.f5581) * f)) + 0.5d), (int) (((double) ((c1646Mo5265.f5582 - c1646Mo5266.f5582) * f)) + 0.5d), (int) (((double) ((c1646Mo5265.f5583 - c1646Mo5266.f5583) * f)) + 0.5d)));
            }
        }
        C3643.m5235(this.f11400, c3649.mo5245(), Collections.singletonList(c3647));
    }
}
