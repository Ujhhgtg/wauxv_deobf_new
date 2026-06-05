package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3111Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9665Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3119Ujhhgtgfeyxiexzf f9666Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f9667Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f9668Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3116Ujhhgtgfeyxiexzf f9669Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3111Ujhhgtgfeyxiexzf(C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf, C3119Ujhhgtgfeyxiexzf c3119Ujhhgtgfeyxiexzf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f9665Ujhhgtgfeyxiexzf = i;
        this.f9669Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf;
        this.f9666Ujhhgtgfeyxiexzf = c3119Ujhhgtgfeyxiexzf;
        this.f9667Ujhhgtgfeyxiexzf = viewPropertyAnimator;
        this.f9668Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9665Ujhhgtgfeyxiexzf) {
            case 0:
                this.f9667Ujhhgtgfeyxiexzf.setListener(null);
                View view = this.f9668Ujhhgtgfeyxiexzf;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C3119Ujhhgtgfeyxiexzf c3119Ujhhgtgfeyxiexzf = this.f9666Ujhhgtgfeyxiexzf;
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = c3119Ujhhgtgfeyxiexzf.f9695Ujhhgtgfeyxiexzf;
                C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = this.f9669Ujhhgtgfeyxiexzf;
                c3116Ujhhgtgfeyxiexzf.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
                c3116Ujhhgtgfeyxiexzf.f9693Ujhhgtgfeyxiexzf.remove(c3119Ujhhgtgfeyxiexzf.f9695Ujhhgtgfeyxiexzf);
                c3116Ujhhgtgfeyxiexzf.m4646Ujhhgtgfeyxiexzf();
                break;
            default:
                this.f9667Ujhhgtgfeyxiexzf.setListener(null);
                View view2 = this.f9668Ujhhgtgfeyxiexzf;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C3119Ujhhgtgfeyxiexzf c3119Ujhhgtgfeyxiexzf2 = this.f9666Ujhhgtgfeyxiexzf;
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = c3119Ujhhgtgfeyxiexzf2.f9696Ujhhgtgfeyxiexzf;
                C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf2 = this.f9669Ujhhgtgfeyxiexzf;
                c3116Ujhhgtgfeyxiexzf2.m2126Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg2);
                c3116Ujhhgtgfeyxiexzf2.f9693Ujhhgtgfeyxiexzf.remove(c3119Ujhhgtgfeyxiexzf2.f9696Ujhhgtgfeyxiexzf);
                c3116Ujhhgtgfeyxiexzf2.m4646Ujhhgtgfeyxiexzf();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f9665Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f9666Ujhhgtgfeyxiexzf.f9695Ujhhgtgfeyxiexzf;
                this.f9669Ujhhgtgfeyxiexzf.getClass();
                break;
            default:
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = this.f9666Ujhhgtgfeyxiexzf.f9696Ujhhgtgfeyxiexzf;
                this.f9669Ujhhgtgfeyxiexzf.getClass();
                break;
        }
    }
}
