package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3164feyxiexzfUjhhgtg extends AbstractC0384Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public EnumC3502feyxiexzfUjhhgtg f9795feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f9796feyxiexzfUjhhgtg;

    private final float getStartAngle() {
        EnumC1443feyxiexzfUjhhgtg positionGravity = getPositionGravity();
        EnumC3502feyxiexzfUjhhgtg enumC3502feyxiexzfUjhhgtg = EnumC3502feyxiexzfUjhhgtg.f10902Ujhhgtgfeyxiexzf;
        EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg = EnumC1443feyxiexzfUjhhgtg.f5051Ujhhgtgfeyxiexzf;
        if (positionGravity == enumC1443feyxiexzfUjhhgtg && getExpandDirection() == enumC3502feyxiexzfUjhhgtg) {
            return 270.0f;
        }
        EnumC1443feyxiexzfUjhhgtg positionGravity2 = getPositionGravity();
        EnumC3502feyxiexzfUjhhgtg enumC3502feyxiexzfUjhhgtg2 = EnumC3502feyxiexzfUjhhgtg.f10901Ujhhgtgfeyxiexzf;
        if (positionGravity2 == enumC1443feyxiexzfUjhhgtg && getExpandDirection() == enumC3502feyxiexzfUjhhgtg2) {
            return 0.0f;
        }
        EnumC1443feyxiexzfUjhhgtg positionGravity3 = getPositionGravity();
        EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg2 = EnumC1443feyxiexzfUjhhgtg.f5052Ujhhgtgfeyxiexzf;
        if (positionGravity3 == enumC1443feyxiexzfUjhhgtg2 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg2) {
            return 180.0f;
        }
        if (getPositionGravity() == enumC1443feyxiexzfUjhhgtg2 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg) {
            return 270.0f;
        }
        EnumC1443feyxiexzfUjhhgtg positionGravity4 = getPositionGravity();
        EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg3 = EnumC1443feyxiexzfUjhhgtg.f5050Ujhhgtgfeyxiexzf;
        if (positionGravity4 == enumC1443feyxiexzfUjhhgtg3 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg) {
            return 90.0f;
        }
        if (getPositionGravity() == enumC1443feyxiexzfUjhhgtg3 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg2) {
            return 180.0f;
        }
        EnumC1443feyxiexzfUjhhgtg positionGravity5 = getPositionGravity();
        EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg4 = EnumC1443feyxiexzfUjhhgtg.f5049Ujhhgtgfeyxiexzf;
        if (positionGravity5 == enumC1443feyxiexzfUjhhgtg4 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg2) {
            return 0.0f;
        }
        if (getPositionGravity() == enumC1443feyxiexzfUjhhgtg4 && getExpandDirection() == enumC3502feyxiexzfUjhhgtg) {
            return 90.0f;
        }
        return (getPositionGravity() == EnumC1443feyxiexzfUjhhgtg.f5048Ujhhgtgfeyxiexzf && getExpandDirection() == enumC3502feyxiexzfUjhhgtg) ? 90.0f : 0.0f;
    }

    public final EnumC3502feyxiexzfUjhhgtg getExpandDirection() {
        EnumC3502feyxiexzfUjhhgtg enumC3502feyxiexzfUjhhgtg = this.f9795feyxiexzfUjhhgtg;
        if (enumC3502feyxiexzfUjhhgtg != null) {
            return enumC3502feyxiexzfUjhhgtg;
        }
        return null;
    }

    public final int getMarginBetweenMenuItems() {
        return this.f9796feyxiexzfUjhhgtg;
    }

    public final void setExpandDirection(EnumC3502feyxiexzfUjhhgtg enumC3502feyxiexzfUjhhgtg) {
        this.f9795feyxiexzfUjhhgtg = enumC3502feyxiexzfUjhhgtg;
    }

    public final void setMarginBetweenMenuItems(int i) {
        this.f9796feyxiexzfUjhhgtg = i;
    }

    @Override // p000.AbstractC0384Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1631Ujhhgtgfeyxiexzf() {
        C3164feyxiexzfUjhhgtg c3164feyxiexzfUjhhgtg = this;
        ArrayList<ValueAnimator> arrayList = c3164feyxiexzfUjhhgtg.f2111Ujhhgtgfeyxiexzf;
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        arrayList.clear();
        float startAngle = c3164feyxiexzfUjhhgtg.getStartAngle();
        int childCount = c3164feyxiexzfUjhhgtg.getMetaBallsContainerFrameLayout().getChildCount() - 1;
        long delayBetweenItemsAnimation = 0;
        int i = 0;
        int i2 = 1;
        while (i < childCount) {
            float f = (float) ((((double) startAngle) * 3.141592653589793d) / ((double) 180.0f));
            float f2 = 1.0f;
            if (c3164feyxiexzfUjhhgtg.getPositionGravity() == EnumC1443feyxiexzfUjhhgtg.f5048Ujhhgtgfeyxiexzf && i % 2 != 0) {
                f2 = -1.0f;
            }
            if (i > 0 && f2 > 0.0f) {
                i2++;
            }
            int i3 = i2;
            double d = f;
            float fCos = c3164feyxiexzfUjhhgtg.f9796feyxiexzfUjhhgtg * i3 * f2 * ((float) Math.cos(d));
            float fSin = c3164feyxiexzfUjhhgtg.f9796feyxiexzfUjhhgtg * i3 * f2 * ((float) Math.sin(d));
            View childAt = c3164feyxiexzfUjhhgtg.getMetaBallsContainerFrameLayout().getChildAt(i);
            long openAnimationDuration = (long) (c3164feyxiexzfUjhhgtg.getOpenAnimationDuration() * 0.125f);
            long openAnimationDuration2 = (long) (c3164feyxiexzfUjhhgtg.getOpenAnimationDuration() * 0.33f);
            c3164feyxiexzfUjhhgtg.m1628Ujhhgtgfeyxiexzf(childAt, fCos, fSin, delayBetweenItemsAnimation, c3164feyxiexzfUjhhgtg.getOpenInterpolatorAnimator(), c3164feyxiexzfUjhhgtg.getOpenAnimationDuration());
            long j = delayBetweenItemsAnimation;
            AbstractC0384Ujhhgtgfeyxiexzf.m1626Ujhhgtgfeyxiexzf(this, childAt, 1.0f, openAnimationDuration, j);
            ImageView imageView = (ImageView) childAt;
            m1630Ujhhgtgfeyxiexzf(imageView.getDrawable(), j + openAnimationDuration2, openAnimationDuration2, 255, true);
            delayBetweenItemsAnimation = getDelayBetweenItemsAnimation() + j;
            imageView.setEnabled(true);
            i++;
            c3164feyxiexzfUjhhgtg = this;
            i2 = i3;
        }
        long j2 = delayBetweenItemsAnimation;
        AbstractC0384Ujhhgtgfeyxiexzf.m1626Ujhhgtgfeyxiexzf(this, getMenuButton(), 0.78f, 300L, 0L);
        if (this.f9160Ujhhgtgfeyxiexzf) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(j2 + this.f2099Ujhhgtgfeyxiexzf);
            duration.addUpdateListener(new C3235feyxiexzfUjhhgtg(2, this));
            duration.start();
        }
    }
}
