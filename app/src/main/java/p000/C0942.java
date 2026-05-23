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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0942 extends AbstractC2201 {

    public final /* synthetic */ int f3444;

    public final /* synthetic */ Object f3445;

    public /* synthetic */ C0942(int i, Object obj) {
        this.f3444 = i;
        this.f3445 = obj;
    }

    public final void m2436(Object obj) {
        long jM2053;
        int i = this.f3444;
        int i2 = 1;
        int i3 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f3445;
        switch (i) {
            case 0:
                C0662 c0662 = (C0662) obj2;
                C0943 c0943 = (C0943) c0662.f2532;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0662.f2531;
                C0662 c0663 = c0943.f3448;
                if (c0663 != null && ((MaxRelativeLayout) c0663.f2531) != null) {
                    int i4 = c0943.f3450;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c0943.m754() == null ? maxRelativeLayout.getContext() : c0943.m754(), i3);
                        jM2053 = c0662.m2053(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM2053);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM2053 = c0662.m2053(null);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(jM2053);
                    valueAnimatorOfFloat.addUpdateListener(new C0941(this, 1));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C1961 c1961 = (C1961) obj2;
                C1962 c1962 = c1961.f6495;
                
                
                
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c1962.m754(), R.anim.anim_dialogx_default_exit);
                long jM3787 = c1961.m3787(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM3787);
                c1961.f6482.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setDuration(jM3787);
                valueAnimatorOfFloat2.addUpdateListener(new C1960(this, 1));
                valueAnimatorOfFloat2.start();
                break;
        }
    }

    public final void m2437(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f3444;
        long duration = 300;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f3445;
        int i3 = 0;
        switch (i) {
            case 0:
                C0662 c0662 = (C0662) obj2;
                C0943 c0943 = (C0943) c0662.f2532;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0662.f2531;
                C0662 c0663 = c0943.f3448;
                if (c0663 != null && ((MaxRelativeLayout) c0663.f2531) != null) {
                    int i4 = c0943.f3449;
                    if (i4 == R.anim.anim_dialogx_default_enter && c0943.f3450 == R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC2784.m4759(c0943.f3451)) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                c0943.f3449 = R.anim.anim_dialogx_top_enter;
                                c0943.f3450 = R.anim.anim_dialogx_top_exit;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                c0943.f3449 = R.anim.anim_dialogx_bottom_enter;
                                c0943.f3450 = R.anim.anim_dialogx_bottom_exit;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case 12 /* 12 */:
                                c0943.f3449 = R.anim.anim_dialogx_left_enter;
                                c0943.f3450 = R.anim.anim_dialogx_left_exit;
                                break;
                            case 13:
                            case 14 /* 14 */:
                            case 15:
                            case 16:
                                c0943.f3449 = R.anim.anim_dialogx_right_enter;
                                c0943.f3450 = R.anim.anim_dialogx_right_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c0943.m754(), c0943.f3449);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c0943.m754(), i2);
                    }
                    long duration2 = animationLoadAnimation.getDuration();
                    long j = c0943.f919;
                    if (j >= 0) {
                        duration2 = j;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    duration = animationLoadAnimation.getDuration() != 0 ? animationLoadAnimation.getDuration() : 300L;
                    long j2 = c0943.f919;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c0943.f3452;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c0662.f2530).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(duration);
                    valueAnimatorOfFloat.addUpdateListener(new C0941(this, 0));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C1961 c1961 = (C1961) obj2;
                C1962 c1962 = c1961.f6495;
                MaxRelativeLayout maxRelativeLayout2 = c1961.f6482;
                
                
                
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c1962.m754(), R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                if (animation != null && animation.getDuration() != 0) {
                    duration = animation.getDuration();
                }
                long j3 = c1962.f919;
                if (j3 >= 0) {
                    duration = j3;
                }
                animationLoadAnimation2.setDuration(duration);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(duration);
                valueAnimatorOfFloat2.addUpdateListener(new C1960(this, 0));
                valueAnimatorOfFloat2.start();
                break;
        }
    }
}
