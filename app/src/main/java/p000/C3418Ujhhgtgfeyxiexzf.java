package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱUjhhgtgᛱ能不能ᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3418Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f10644Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3419Ujhhgtgfeyxiexzf f10645Ujhhgtgfeyxiexzf;

    public C3418Ujhhgtgfeyxiexzf(C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf) {
        this.f10645Ujhhgtgfeyxiexzf = c3419Ujhhgtgfeyxiexzf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10644Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f10644Ujhhgtgfeyxiexzf) {
            this.f10644Ujhhgtgfeyxiexzf = false;
            return;
        }
        C3419Ujhhgtgfeyxiexzf c3419Ujhhgtgfeyxiexzf = this.f10645Ujhhgtgfeyxiexzf;
        if (((Float) c3419Ujhhgtgfeyxiexzf.f10673feyxiexzfUjhhgtg.getAnimatedValue()).floatValue() == 0.0f) {
            c3419Ujhhgtgfeyxiexzf.f10674feyxiexzfUjhhgtg = 0;
            c3419Ujhhgtgfeyxiexzf.m4917Ujhhgtgfeyxiexzf(0);
        } else {
            c3419Ujhhgtgfeyxiexzf.f10674feyxiexzfUjhhgtg = 2;
            c3419Ujhhgtgfeyxiexzf.f10666Ujhhgtgfeyxiexzf.invalidate();
        }
    }
}
