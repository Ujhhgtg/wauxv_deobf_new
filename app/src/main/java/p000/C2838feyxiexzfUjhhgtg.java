package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛳ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2838feyxiexzfUjhhgtg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9017Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ C2834feyxiexzfUjhhgtg f9018Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2838feyxiexzfUjhhgtg(C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg, int i) {
        this.f9017Ujhhgtgfeyxiexzf = i;
        this.f9018Ujhhgtgfeyxiexzf = c2834feyxiexzfUjhhgtg;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9017Ujhhgtgfeyxiexzf) {
            case 1:
                this.f9018Ujhhgtgfeyxiexzf.f10413Ujhhgtgfeyxiexzf.m4833Ujhhgtgfeyxiexzf(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9017Ujhhgtgfeyxiexzf) {
            case 0:
                this.f9018Ujhhgtgfeyxiexzf.f10413Ujhhgtgfeyxiexzf.m4833Ujhhgtgfeyxiexzf(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
