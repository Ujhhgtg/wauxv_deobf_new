package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛴᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0645Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2696Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ TextView f2697Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2698Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f2699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0654Ujhhgtgfeyxiexzf f2700Ujhhgtgfeyxiexzf;

    public C0645Ujhhgtgfeyxiexzf(C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf, int i, TextView textView, int i2, TextView textView2) {
        this.f2700Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf;
        this.f2696Ujhhgtgfeyxiexzf = i;
        this.f2697Ujhhgtgfeyxiexzf = textView;
        this.f2698Ujhhgtgfeyxiexzf = i2;
        this.f2699Ujhhgtgfeyxiexzf = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf;
        int i = this.f2696Ujhhgtgfeyxiexzf;
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this.f2700Ujhhgtgfeyxiexzf;
        c0654Ujhhgtgfeyxiexzf.f2729Ujhhgtgfeyxiexzf = i;
        c0654Ujhhgtgfeyxiexzf.f2727Ujhhgtgfeyxiexzf = null;
        TextView textView = this.f2697Ujhhgtgfeyxiexzf;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2698Ujhhgtgfeyxiexzf == 1 && (c2384Ujhhgtgfeyxiexzf = c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf) != null) {
                c2384Ujhhgtgfeyxiexzf.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2699Ujhhgtgfeyxiexzf;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2699Ujhhgtgfeyxiexzf;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
