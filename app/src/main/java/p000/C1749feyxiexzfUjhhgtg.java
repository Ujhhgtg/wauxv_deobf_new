package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1749feyxiexzfUjhhgtg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5889Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f5890Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f5891Ujhhgtgfeyxiexzf;

    public C1749feyxiexzfUjhhgtg(C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg, View view) {
        this.f5890Ujhhgtgfeyxiexzf = c2234feyxiexzfUjhhgtg;
        this.f5891Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5889Ujhhgtgfeyxiexzf) {
            case 0:
                ((C2412Ujhhgtgfeyxiexzf) this.f5890Ujhhgtgfeyxiexzf).remove(animator);
                ((AbstractC1747feyxiexzfUjhhgtg) this.f5891Ujhhgtgfeyxiexzf).f5872Ujhhgtgfeyxiexzf.remove(animator);
                break;
            default:
                C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg = (C2234feyxiexzfUjhhgtg) this.f5890Ujhhgtgfeyxiexzf;
                c2234feyxiexzfUjhhgtg.f7273Ujhhgtgfeyxiexzf.mo3400Ujhhgtgfeyxiexzf(1.0f);
                C2237feyxiexzfUjhhgtg.m3402Ujhhgtgfeyxiexzf(c2234feyxiexzfUjhhgtg, (View) this.f5891Ujhhgtgfeyxiexzf);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5889Ujhhgtgfeyxiexzf) {
            case 0:
                ((AbstractC1747feyxiexzfUjhhgtg) this.f5891Ujhhgtgfeyxiexzf).f5872Ujhhgtgfeyxiexzf.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1749feyxiexzfUjhhgtg(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        this.f5891Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtg;
        this.f5890Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
    }
}
