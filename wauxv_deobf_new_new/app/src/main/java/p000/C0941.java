package p000;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲈᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0941 extends AbstractC1272 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3452;

    public /* synthetic */ C0941(Object obj, int i) {
        this.f3451 = i;
        this.f3452 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m2553(Object obj) {
        long jM2378;
        int i = this.f3451;
        int i2 = 1;
        int i3 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f3452;
        switch (i) {
            case 0:
                C0776 c0776 = (C0776) obj2;
                C0942 c0942 = (C0942) c0776.f2881;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0776.f2880;
                C0776 c0777 = c0942.f3455;
                if (c0777 != null && ((MaxRelativeLayout) c0777.f2880) != null) {
                    int i4 = c0942.f3457;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c0942.m898() == null ? maxRelativeLayout.getContext() : c0942.m898(), i3);
                        jM2378 = c0776.m2378(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM2378);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM2378 = c0776.m2378(null);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(jM2378);
                    valueAnimatorOfFloat.addUpdateListener(new C0940(this, i2));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C1992 c1992 = (C1992) obj2;
                C1993 c1993 = c1992.f6600;
                c1993.f983.getClass();
                c1993.f983.getClass();
                c1993.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c1993.m898(), R.anim.anim_dialogx_default_exit);
                long jM3981 = c1992.m3981(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM3981);
                c1992.f6587.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setDuration(jM3981);
                valueAnimatorOfFloat2.addUpdateListener(new C1991(this, i2));
                valueAnimatorOfFloat2.start();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m2554(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f3451;
        long duration = 300;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f3452;
        int i3 = 0;
        switch (i) {
            case 0:
                C0776 c0776 = (C0776) obj2;
                C0942 c0942 = (C0942) c0776.f2881;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0776.f2880;
                C0776 c0777 = c0942.f3455;
                if (c0777 != null && ((MaxRelativeLayout) c0777.f2880) != null) {
                    int i4 = c0942.f3456;
                    if (i4 == R.anim.anim_dialogx_default_enter && c0942.f3457 == R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC2844.m4792(c0942.f3458)) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                c0942.f3456 = R.anim.anim_dialogx_top_enter;
                                c0942.f3457 = R.anim.anim_dialogx_top_exit;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                c0942.f3456 = R.anim.anim_dialogx_bottom_enter;
                                c0942.f3457 = R.anim.anim_dialogx_bottom_exit;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case Opcodes.FCONST_1 /* 12 */:
                                c0942.f3456 = R.anim.anim_dialogx_left_enter;
                                c0942.f3457 = R.anim.anim_dialogx_left_exit;
                                break;
                            case 13:
                            case Opcodes.DCONST_0 /* 14 */:
                            case 15:
                            case 16:
                                c0942.f3456 = R.anim.anim_dialogx_right_enter;
                                c0942.f3457 = R.anim.anim_dialogx_right_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c0942.m898(), c0942.f3456);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c0942.m898(), i2);
                    }
                    long duration2 = animationLoadAnimation.getDuration();
                    long j = c0942.f985;
                    if (j >= 0) {
                        duration2 = j;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    duration = animationLoadAnimation.getDuration() != 0 ? animationLoadAnimation.getDuration() : 300L;
                    long j2 = c0942.f985;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c0942.f3459;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c0776.f2879).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(duration);
                    valueAnimatorOfFloat.addUpdateListener(new C0940(this, i3));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C1992 c1992 = (C1992) obj2;
                C1993 c1993 = c1992.f6600;
                MaxRelativeLayout maxRelativeLayout2 = c1992.f6587;
                c1993.f983.getClass();
                c1993.f983.getClass();
                c1993.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c1993.m898(), R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                if (animation != null && animation.getDuration() != 0) {
                    duration = animation.getDuration();
                }
                long j3 = c1993.f985;
                if (j3 >= 0) {
                    duration = j3;
                }
                animationLoadAnimation2.setDuration(duration);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(duration);
                valueAnimatorOfFloat2.addUpdateListener(new C1991(this, i3));
                valueAnimatorOfFloat2.start();
                break;
        }
    }
}
