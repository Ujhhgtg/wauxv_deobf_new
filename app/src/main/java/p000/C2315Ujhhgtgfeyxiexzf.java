package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2315Ujhhgtgfeyxiexzf extends AnimatorListenerAdapter implements InterfaceC1746feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final View f7563Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f7564Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ViewGroup f7565Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f7567Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f7568Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f7566Ujhhgtgfeyxiexzf = true;

    public C2315Ujhhgtgfeyxiexzf(View view, int i) {
        this.f7563Ujhhgtgfeyxiexzf = view;
        this.f7564Ujhhgtgfeyxiexzf = i;
        this.f7565Ujhhgtgfeyxiexzf = (ViewGroup) view.getParent();
        m3526Ujhhgtgfeyxiexzf(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7568Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f7568Ujhhgtgfeyxiexzf) {
            AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(this.f7563Ujhhgtgfeyxiexzf, this.f7564Ujhhgtgfeyxiexzf);
            ViewGroup viewGroup = this.f7565Ujhhgtgfeyxiexzf;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m3526Ujhhgtgfeyxiexzf(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo3006Ujhhgtgfeyxiexzf() {
        m3526Ujhhgtgfeyxiexzf(false);
        if (this.f7568Ujhhgtgfeyxiexzf) {
            return;
        }
        AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(this.f7563Ujhhgtgfeyxiexzf, this.f7564Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3007Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
        abstractC1747feyxiexzfUjhhgtg.mo3035feyxiexzfUjhhgtg(this);
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo3009Ujhhgtgfeyxiexzf() {
        m3526Ujhhgtgfeyxiexzf(true);
        if (this.f7568Ujhhgtgfeyxiexzf) {
            return;
        }
        AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(this.f7563Ujhhgtgfeyxiexzf, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3526Ujhhgtgfeyxiexzf(boolean z) {
        ViewGroup viewGroup;
        if (!this.f7566Ujhhgtgfeyxiexzf || this.f7567Ujhhgtgfeyxiexzf == z || (viewGroup = this.f7565Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        this.f7567Ujhhgtgfeyxiexzf = z;
        AbstractC1252feyxiexzfUjhhgtg.m2790Ujhhgtgfeyxiexzf(viewGroup, z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(this.f7563Ujhhgtgfeyxiexzf, 0);
            ViewGroup viewGroup = this.f7565Ujhhgtgfeyxiexzf;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f7568Ujhhgtgfeyxiexzf) {
            AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(this.f7563Ujhhgtgfeyxiexzf, this.f7564Ujhhgtgfeyxiexzf);
            ViewGroup viewGroup = this.f7565Ujhhgtgfeyxiexzf;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m3526Ujhhgtgfeyxiexzf(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo3005Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }

    @Override // p000.InterfaceC1746feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3010Ujhhgtgfeyxiexzf(AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
    }
}
