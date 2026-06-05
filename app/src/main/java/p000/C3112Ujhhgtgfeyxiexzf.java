package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3112Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0821feyxiexzfUjhhgtg f9670Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9671Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f9672Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f9673Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f9674Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3116Ujhhgtgfeyxiexzf f9675Ujhhgtgfeyxiexzf;

    public C3112Ujhhgtgfeyxiexzf(C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9675Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf;
        this.f9670Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg;
        this.f9671Ujhhgtgfeyxiexzf = i;
        this.f9672Ujhhgtgfeyxiexzf = view;
        this.f9673Ujhhgtgfeyxiexzf = i2;
        this.f9674Ujhhgtgfeyxiexzf = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f9671Ujhhgtgfeyxiexzf;
        View view = this.f9672Ujhhgtgfeyxiexzf;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f9673Ujhhgtgfeyxiexzf != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9674Ujhhgtgfeyxiexzf.setListener(null);
        C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = this.f9675Ujhhgtgfeyxiexzf;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f9670Ujhhgtgfeyxiexzf;
        c3116Ujhhgtgfeyxiexzf.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        c3116Ujhhgtgfeyxiexzf.f9691Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg);
        c3116Ujhhgtgfeyxiexzf.m4646Ujhhgtgfeyxiexzf();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9675Ujhhgtgfeyxiexzf.getClass();
    }
}
