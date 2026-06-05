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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲ能不能ᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3081Ujhhgtgfeyxiexzf extends AbstractC1937feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f9523Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f9524Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3081Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9523Ujhhgtgfeyxiexzf = i;
        this.f9524Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4547Ujhhgtgfeyxiexzf(Object obj) {
        long jM5278Ujhhgtgfeyxiexzf;
        int i = this.f9523Ujhhgtgfeyxiexzf;
        int i2 = 1;
        int i3 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f9524Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = (C3639Ujhhgtgfeyxiexzf) obj2;
                C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf;
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf2 = c3082Ujhhgtgfeyxiexzf.f9527feyxiexzfUjhhgtg;
                if (c3639Ujhhgtgfeyxiexzf2 != null && ((MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf2.f11370Ujhhgtgfeyxiexzf) != null) {
                    int i4 = c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c3082Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == null ? maxRelativeLayout.getContext() : c3082Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf(), i3);
                        jM5278Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf.m5278Ujhhgtgfeyxiexzf(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM5278Ujhhgtgfeyxiexzf);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM5278Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf.m5278Ujhhgtgfeyxiexzf(null);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(jM5278Ujhhgtgfeyxiexzf);
                    valueAnimatorOfFloat.addUpdateListener(new C3080Ujhhgtgfeyxiexzf(this, i2));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf = (C0399Ujhhgtgfeyxiexzf) obj2;
                C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf = c0399Ujhhgtgfeyxiexzf.f2163Ujhhgtgfeyxiexzf;
                c0400Ujhhgtgfeyxiexzf.f997Ujhhgtgfeyxiexzf.getClass();
                c0400Ujhhgtgfeyxiexzf.f997Ujhhgtgfeyxiexzf.getClass();
                c0400Ujhhgtgfeyxiexzf.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c0400Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf(), R.anim.anim_dialogx_default_exit);
                long jM1675Ujhhgtgfeyxiexzf = c0399Ujhhgtgfeyxiexzf.m1675Ujhhgtgfeyxiexzf(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM1675Ujhhgtgfeyxiexzf);
                c0399Ujhhgtgfeyxiexzf.f2150Ujhhgtgfeyxiexzf.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setDuration(jM1675Ujhhgtgfeyxiexzf);
                valueAnimatorOfFloat2.addUpdateListener(new C0398Ujhhgtgfeyxiexzf(this, i2));
                valueAnimatorOfFloat2.start();
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4548Ujhhgtgfeyxiexzf(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f9523Ujhhgtgfeyxiexzf;
        long duration = 300;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f9524Ujhhgtgfeyxiexzf;
        int i3 = 0;
        switch (i) {
            case 0:
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = (C3639Ujhhgtgfeyxiexzf) obj2;
                C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf;
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf2 = c3082Ujhhgtgfeyxiexzf.f9527feyxiexzfUjhhgtg;
                if (c3639Ujhhgtgfeyxiexzf2 != null && ((MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf2.f11370Ujhhgtgfeyxiexzf) != null) {
                    int i4 = c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg;
                    if (i4 == R.anim.anim_dialogx_default_enter && c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg == R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(c3082Ujhhgtgfeyxiexzf.f9530feyxiexzfUjhhgtg)) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg = R.anim.anim_dialogx_top_enter;
                                c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg = R.anim.anim_dialogx_top_exit;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg = R.anim.anim_dialogx_bottom_enter;
                                c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg = R.anim.anim_dialogx_bottom_exit;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case Opcodes.FCONST_1 /* 12 */:
                                c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg = R.anim.anim_dialogx_left_enter;
                                c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg = R.anim.anim_dialogx_left_exit;
                                break;
                            case 13:
                            case Opcodes.DCONST_0 /* 14 */:
                            case 15:
                            case 16:
                                c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg = R.anim.anim_dialogx_right_enter;
                                c3082Ujhhgtgfeyxiexzf.f9529feyxiexzfUjhhgtg = R.anim.anim_dialogx_right_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c3082Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf(), c3082Ujhhgtgfeyxiexzf.f9528feyxiexzfUjhhgtg);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c3082Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf(), i2);
                    }
                    long duration2 = animationLoadAnimation.getDuration();
                    long j = c3082Ujhhgtgfeyxiexzf.f999Ujhhgtgfeyxiexzf;
                    if (j >= 0) {
                        duration2 = j;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    duration = animationLoadAnimation.getDuration() != 0 ? animationLoadAnimation.getDuration() : 300L;
                    long j2 = c3082Ujhhgtgfeyxiexzf.f999Ujhhgtgfeyxiexzf;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c3082Ujhhgtgfeyxiexzf.f9531feyxiexzfUjhhgtg;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(duration);
                    valueAnimatorOfFloat.addUpdateListener(new C3080Ujhhgtgfeyxiexzf(this, i3));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf = (C0399Ujhhgtgfeyxiexzf) obj2;
                C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf = c0399Ujhhgtgfeyxiexzf.f2163Ujhhgtgfeyxiexzf;
                MaxRelativeLayout maxRelativeLayout2 = c0399Ujhhgtgfeyxiexzf.f2150Ujhhgtgfeyxiexzf;
                c0400Ujhhgtgfeyxiexzf.f997Ujhhgtgfeyxiexzf.getClass();
                c0400Ujhhgtgfeyxiexzf.f997Ujhhgtgfeyxiexzf.getClass();
                c0400Ujhhgtgfeyxiexzf.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c0400Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf(), R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                if (animation != null && animation.getDuration() != 0) {
                    duration = animation.getDuration();
                }
                long j3 = c0400Ujhhgtgfeyxiexzf.f999Ujhhgtgfeyxiexzf;
                if (j3 >= 0) {
                    duration = j3;
                }
                animationLoadAnimation2.setDuration(duration);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(duration);
                valueAnimatorOfFloat2.addUpdateListener(new C0398Ujhhgtgfeyxiexzf(this, i3));
                valueAnimatorOfFloat2.start();
                break;
        }
    }
}
