package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴ要点脸能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0353Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1044feyxiexzfUjhhgtg f1996Ujhhgtgfeyxiexzf = new C1044feyxiexzfUjhhgtg(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1044feyxiexzfUjhhgtg f1997Ujhhgtgfeyxiexzf = new C1044feyxiexzfUjhhgtg(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0353Ujhhgtgfeyxiexzf m1539Ujhhgtgfeyxiexzf(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m1540Ujhhgtgfeyxiexzf(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m1540Ujhhgtgfeyxiexzf(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C0353Ujhhgtgfeyxiexzf m1540Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        C0353Ujhhgtgfeyxiexzf c0353Ujhhgtgfeyxiexzf = new C0353Ujhhgtgfeyxiexzf();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0353Ujhhgtgfeyxiexzf.f1997Ujhhgtgfeyxiexzf.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC3036feyxiexzfUjhhgtg.f9414Ujhhgtgfeyxiexzf;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC3036feyxiexzfUjhhgtg.f9415Ujhhgtgfeyxiexzf;
            }
            C0354Ujhhgtgfeyxiexzf c0354Ujhhgtgfeyxiexzf = new C0354Ujhhgtgfeyxiexzf();
            c0354Ujhhgtgfeyxiexzf.f2001Ujhhgtgfeyxiexzf = 0;
            c0354Ujhhgtgfeyxiexzf.f2002Ujhhgtgfeyxiexzf = 1;
            c0354Ujhhgtgfeyxiexzf.f1998Ujhhgtgfeyxiexzf = startDelay;
            c0354Ujhhgtgfeyxiexzf.f1999Ujhhgtgfeyxiexzf = duration;
            c0354Ujhhgtgfeyxiexzf.f2000Ujhhgtgfeyxiexzf = interpolator;
            c0354Ujhhgtgfeyxiexzf.f2001Ujhhgtgfeyxiexzf = objectAnimator.getRepeatCount();
            c0354Ujhhgtgfeyxiexzf.f2002Ujhhgtgfeyxiexzf = objectAnimator.getRepeatMode();
            c0353Ujhhgtgfeyxiexzf.f1996Ujhhgtgfeyxiexzf.put(propertyName, c0354Ujhhgtgfeyxiexzf);
        }
        return c0353Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0353Ujhhgtgfeyxiexzf) {
            return this.f1996Ujhhgtgfeyxiexzf.equals(((C0353Ujhhgtgfeyxiexzf) obj).f1996Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1996Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "\n" + C0353Ujhhgtgfeyxiexzf.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1996Ujhhgtgfeyxiexzf + "}\n";
    }
}
