package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3433 {
    public static long m4942(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void m4943(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
