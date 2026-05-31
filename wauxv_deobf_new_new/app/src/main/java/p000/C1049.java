package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1049 extends AbstractC1997 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public EnumC1258 f3821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public int f3822;

    private final float getStartAngle() {
        EnumC2434 positionGravity = getPositionGravity();
        EnumC1258 enumC1258 = EnumC1258.f4573;
        EnumC2434 enumC2434 = EnumC2434.f7783;
        if (positionGravity == enumC2434 && getExpandDirection() == enumC1258) {
            return 270.0f;
        }
        EnumC2434 positionGravity2 = getPositionGravity();
        EnumC1258 enumC1259 = EnumC1258.f4572;
        if (positionGravity2 == enumC2434 && getExpandDirection() == enumC1259) {
            return 0.0f;
        }
        EnumC2434 positionGravity3 = getPositionGravity();
        EnumC2434 enumC2435 = EnumC2434.f7784;
        if (positionGravity3 == enumC2435 && getExpandDirection() == enumC1259) {
            return 180.0f;
        }
        if (getPositionGravity() == enumC2435 && getExpandDirection() == enumC1258) {
            return 270.0f;
        }
        EnumC2434 positionGravity4 = getPositionGravity();
        EnumC2434 enumC2436 = EnumC2434.f7782;
        if (positionGravity4 == enumC2436 && getExpandDirection() == enumC1258) {
            return 90.0f;
        }
        if (getPositionGravity() == enumC2436 && getExpandDirection() == enumC1259) {
            return 180.0f;
        }
        EnumC2434 positionGravity5 = getPositionGravity();
        EnumC2434 enumC2437 = EnumC2434.f7781;
        if (positionGravity5 == enumC2437 && getExpandDirection() == enumC1259) {
            return 0.0f;
        }
        if (getPositionGravity() == enumC2437 && getExpandDirection() == enumC1258) {
            return 90.0f;
        }
        return (getPositionGravity() == EnumC2434.f7780 && getExpandDirection() == enumC1258) ? 90.0f : 0.0f;
    }

    public final EnumC1258 getExpandDirection() {
        EnumC1258 enumC1258 = this.f3821;
        if (enumC1258 != null) {
            return enumC1258;
        }
        return null;
    }

    public final int getMarginBetweenMenuItems() {
        return this.f3822;
    }

    public final void setExpandDirection(EnumC1258 enumC1258) {
        this.f3821 = enumC1258;
    }

    public final void setMarginBetweenMenuItems(int i) {
        this.f3822 = i;
    }

    @Override // p000.AbstractC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2739() {
        C1049 c1049 = this;
        ArrayList<ValueAnimator> arrayList = c1049.f6637;
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        arrayList.clear();
        float startAngle = c1049.getStartAngle();
        int childCount = c1049.getMetaBallsContainerFrameLayout().getChildCount() - 1;
        long delayBetweenItemsAnimation = 0;
        int i = 0;
        int i2 = 1;
        while (i < childCount) {
            float f = (float) ((((double) startAngle) * 3.141592653589793d) / ((double) 180.0f));
            float f2 = 1.0f;
            if (c1049.getPositionGravity() == EnumC2434.f7780 && i % 2 != 0) {
                f2 = -1.0f;
            }
            if (i > 0 && f2 > 0.0f) {
                i2++;
            }
            int i3 = i2;
            double d = f;
            float fCos = c1049.f3822 * i3 * f2 * ((float) Math.cos(d));
            float fSin = c1049.f3822 * i3 * f2 * ((float) Math.sin(d));
            View childAt = c1049.getMetaBallsContainerFrameLayout().getChildAt(i);
            long openAnimationDuration = (long) (c1049.getOpenAnimationDuration() * 0.125f);
            long openAnimationDuration2 = (long) (c1049.getOpenAnimationDuration() * 0.33f);
            c1049.m3988(childAt, fCos, fSin, delayBetweenItemsAnimation, c1049.getOpenInterpolatorAnimator(), c1049.getOpenAnimationDuration());
            long j = delayBetweenItemsAnimation;
            AbstractC1997.m3986(this, childAt, 1.0f, openAnimationDuration, j);
            ImageView imageView = (ImageView) childAt;
            m3990(imageView.getDrawable(), j + openAnimationDuration2, openAnimationDuration2, 255, true);
            delayBetweenItemsAnimation = getDelayBetweenItemsAnimation() + j;
            imageView.setEnabled(true);
            i++;
            c1049 = this;
            i2 = i3;
        }
        long j2 = delayBetweenItemsAnimation;
        AbstractC1997.m3986(this, getMenuButton(), 0.78f, 300L, 0L);
        if (this.f2850) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(j2 + this.f6625);
            duration.addUpdateListener(new C1121(this, 2));
            duration.start();
        }
    }
}
