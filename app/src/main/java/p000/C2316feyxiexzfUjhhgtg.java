package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2316feyxiexzfUjhhgtg extends AnimatorListenerAdapter implements InterfaceC1746feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ViewGroup f7569Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final View f7570Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final View f7571Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f7572Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C3510feyxiexzfUjhhgtg f7573Ujhhgtgfeyxiexzf;

    public C2316feyxiexzfUjhhgtg(C3510feyxiexzfUjhhgtg c3510feyxiexzfUjhhgtg, ViewGroup viewGroup, View view, View view2) {
        this.f7573Ujhhgtgfeyxiexzf = c3510feyxiexzfUjhhgtg;
        this.f7569Ujhhgtgfeyxiexzf = viewGroup;
        this.f7570Ujhhgtgfeyxiexzf = view;
        this.f7571Ujhhgtgfeyxiexzf = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3527Ujhhgtgfeyxiexzf();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f7569Ujhhgtgfeyxiexzf.getOverlay().remove(this.f7570Ujhhgtgfeyxiexzf);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f7570Ujhhgtgfeyxiexzf;
        if (view.getParent() == null) {
            this.f7569Ujhhgtgfeyxiexzf.getOverlay().add(view);
        } else {
            this.f7573Ujhhgtgfeyxiexzf.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f7571Ujhhgtgfeyxiexzf;
            View view2 = this.f7570Ujhhgtgfeyxiexzf;
            view.setTag(R.id.save_overlay_view, view2);
            this.f7569Ujhhgtgfeyxiexzf.getOverlay().add(view2);
            this.f7572Ujhhgtgfeyxiexzf = true;
        }
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3007Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
        abstractC1747feyxiexzfUjhhgtg.mo3035feyxiexzfUjhhgtg(this);
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3010Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
        if (this.f7572Ujhhgtgfeyxiexzf) {
            m3527Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3527Ujhhgtgfeyxiexzf() {
        this.f7571Ujhhgtgfeyxiexzf.setTag(R.id.save_overlay_view, null);
        this.f7569Ujhhgtgfeyxiexzf.getOverlay().remove(this.f7570Ujhhgtgfeyxiexzf);
        this.f7572Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m3527Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo3006Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo3009Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo3005Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }
}
