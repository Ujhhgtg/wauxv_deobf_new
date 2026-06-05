package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3109Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9657Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0821feyxiexzfUjhhgtg f9658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f9659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f9660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3116Ujhhgtgfeyxiexzf f9661Ujhhgtgfeyxiexzf;

    public C3109Ujhhgtgfeyxiexzf(C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9661Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf;
        this.f9658Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg;
        this.f9660Ujhhgtgfeyxiexzf = viewPropertyAnimator;
        this.f9659Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9657Ujhhgtgfeyxiexzf) {
            case 1:
                this.f9659Ujhhgtgfeyxiexzf.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9657Ujhhgtgfeyxiexzf) {
            case 0:
                this.f9660Ujhhgtgfeyxiexzf.setListener(null);
                this.f9659Ujhhgtgfeyxiexzf.setAlpha(1.0f);
                C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = this.f9661Ujhhgtgfeyxiexzf;
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f9658Ujhhgtgfeyxiexzf;
                c3116Ujhhgtgfeyxiexzf.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
                c3116Ujhhgtgfeyxiexzf.f9692Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg);
                c3116Ujhhgtgfeyxiexzf.m4646Ujhhgtgfeyxiexzf();
                break;
            default:
                this.f9660Ujhhgtgfeyxiexzf.setListener(null);
                C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf2 = this.f9661Ujhhgtgfeyxiexzf;
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = this.f9658Ujhhgtgfeyxiexzf;
                c3116Ujhhgtgfeyxiexzf2.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2);
                c3116Ujhhgtgfeyxiexzf2.f9690Ujhhgtgfeyxiexzf.remove(abstractC0821feyxiexzfUjhhgtg2);
                c3116Ujhhgtgfeyxiexzf2.m4646Ujhhgtgfeyxiexzf();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f9657Ujhhgtgfeyxiexzf) {
            case 0:
                this.f9661Ujhhgtgfeyxiexzf.getClass();
                break;
            default:
                this.f9661Ujhhgtgfeyxiexzf.getClass();
                break;
        }
    }

    public C3109Ujhhgtgfeyxiexzf(C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9661Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf;
        this.f9658Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg;
        this.f9659Ujhhgtgfeyxiexzf = view;
        this.f9660Ujhhgtgfeyxiexzf = viewPropertyAnimator;
    }
}
