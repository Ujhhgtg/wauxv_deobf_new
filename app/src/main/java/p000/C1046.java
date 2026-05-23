package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 extends AbstractC1966 {

    public EnumC1256 f3814;

    public int f3815;

    private final float getStartAngle() {
        EnumC2381 positionGravity = getPositionGravity();
        EnumC1256 enumC1256 = EnumC1256.f4574;
        EnumC2381 enumC2381 = EnumC2381.f7639;
        if (positionGravity == enumC2381 && getExpandDirection() == enumC1256) {
            return 270.0f;
        }
        EnumC2381 positionGravity2 = getPositionGravity();
        EnumC1256 enumC1257 = EnumC1256.f4573;
        if (positionGravity2 == enumC2381 && getExpandDirection() == enumC1257) {
            return 0.0f;
        }
        EnumC2381 positionGravity3 = getPositionGravity();
        EnumC2381 enumC2382 = EnumC2381.f7640;
        if (positionGravity3 == enumC2382 && getExpandDirection() == enumC1257) {
            return 180.0f;
        }
        if (getPositionGravity() == enumC2382 && getExpandDirection() == enumC1256) {
            return 270.0f;
        }
        EnumC2381 positionGravity4 = getPositionGravity();
        EnumC2381 enumC2383 = EnumC2381.f7638;
        if (positionGravity4 == enumC2383 && getExpandDirection() == enumC1256) {
            return 90.0f;
        }
        if (getPositionGravity() == enumC2383 && getExpandDirection() == enumC1257) {
            return 180.0f;
        }
        EnumC2381 positionGravity5 = getPositionGravity();
        EnumC2381 enumC2384 = EnumC2381.f7637;
        if (positionGravity5 == enumC2384 && getExpandDirection() == enumC1257) {
            return 0.0f;
        }
        if (getPositionGravity() == enumC2384 && getExpandDirection() == enumC1256) {
            return 90.0f;
        }
        return (getPositionGravity() == EnumC2381.f7636 && getExpandDirection() == enumC1256) ? 90.0f : 0.0f;
    }

    public final EnumC1256 getExpandDirection() {
        EnumC1256 enumC1256 = this.f3814;
        if (enumC1256 != null) {
            return enumC1256;
        }
        return null;
    }

    public final int getMarginBetweenMenuItems() {
        return this.f3815;
    }

    public final void setExpandDirection(EnumC1256 enumC1256) {
        this.f3814 = enumC1256;
    }

    public final void setMarginBetweenMenuItems(int i) {
        this.f3815 = i;
    }

    @Override // p000.AbstractC1966
    public final void mo2615() {
        C1046 c1046 = this;
        ArrayList<ValueAnimator> arrayList = c1046.f6532;
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        arrayList.clear();
        float startAngle = c1046.getStartAngle();
        int childCount = c1046.getMetaBallsContainerFrameLayout().getChildCount() - 1;
        long delayBetweenItemsAnimation = 0;
        int i = 0;
        int i2 = 1;
        while (i < childCount) {
            float f = (float) ((((double) startAngle) * 3.141592653589793d) / ((double) 180.0f));
            float f2 = 1.0f;
            if (c1046.getPositionGravity() == EnumC2381.f7636 && i % 2 != 0) {
                f2 = -1.0f;
            }
            if (i > 0 && f2 > 0.0f) {
                i2++;
            }
            int i3 = i2;
            double d = f;
            float fCos = c1046.f3815 * i3 * f2 * ((float) Math.cos(d));
            float fSin = c1046.f3815 * i3 * f2 * ((float) Math.sin(d));
            View childAt = c1046.getMetaBallsContainerFrameLayout().getChildAt(i);
            long openAnimationDuration = (long) (c1046.getOpenAnimationDuration() * 0.125f);
            long openAnimationDuration2 = (long) (c1046.getOpenAnimationDuration() * 0.33f);
            c1046.m3794(childAt, fCos, fSin, delayBetweenItemsAnimation, c1046.getOpenInterpolatorAnimator(), c1046.getOpenAnimationDuration());
            long j = delayBetweenItemsAnimation;
            AbstractC1966.m3792(this, childAt, 1.0f, openAnimationDuration, j);
            ImageView imageView = (ImageView) childAt;
            m3796(imageView.getDrawable(), j + openAnimationDuration2, openAnimationDuration2, 255, true);
            delayBetweenItemsAnimation = getDelayBetweenItemsAnimation() + j;
            imageView.setEnabled(true);
            i++;
            c1046 = this;
            i2 = i3;
        }
        long j2 = delayBetweenItemsAnimation;
        AbstractC1966.m3792(this, getMenuButton(), 0.78f, 300L, 0L);
        if (this.f2850) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(j2 + this.f6520);
            duration.addUpdateListener(new C1115(2, this));
            duration.start();
        }
    }
}
