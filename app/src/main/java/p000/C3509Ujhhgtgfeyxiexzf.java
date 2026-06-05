package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3509Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter implements InterfaceC1746feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final View f10921Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f10922Ujhhgtgfeyxiexzf = false;

    public C3509Ujhhgtgfeyxiexzf(View view) {
        this.f10921Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3524Ujhhgtgfeyxiexzf(this.f10921Ujhhgtgfeyxiexzf, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f10921Ujhhgtgfeyxiexzf;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f10922Ujhhgtgfeyxiexzf = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo3006Ujhhgtgfeyxiexzf() {
        View view = this.f10921Ujhhgtgfeyxiexzf;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3523Ujhhgtgfeyxiexzf(view) : 0.0f));
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo3009Ujhhgtgfeyxiexzf() {
        this.f10921Ujhhgtgfeyxiexzf.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f10922Ujhhgtgfeyxiexzf;
        View view = this.f10921Ujhhgtgfeyxiexzf;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
        c2311Ujhhgtgfeyxiexzf.mo3524Ujhhgtgfeyxiexzf(view, 1.0f);
        c2311Ujhhgtgfeyxiexzf.getClass();
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo3005Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3007Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo3008Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3010Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }
}
