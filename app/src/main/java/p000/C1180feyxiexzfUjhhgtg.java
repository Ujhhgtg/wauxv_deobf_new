package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛲ要点脸ᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1180feyxiexzfUjhhgtg extends AbstractC1243feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f4470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f4471Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f4472Ujhhgtgfeyxiexzf;

    public C1180feyxiexzfUjhhgtg(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4472Ujhhgtgfeyxiexzf = swipeDismissBehavior;
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int mo2664Ujhhgtgfeyxiexzf(View view, int i) {
        int width;
        int width2;
        int width3;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f4472Ujhhgtgfeyxiexzf.f634Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            if (z) {
                width = this.f4470Ujhhgtgfeyxiexzf - view.getWidth();
                width2 = this.f4470Ujhhgtgfeyxiexzf;
            } else {
                width = this.f4470Ujhhgtgfeyxiexzf;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4470Ujhhgtgfeyxiexzf - view.getWidth();
            width2 = view.getWidth() + this.f4470Ujhhgtgfeyxiexzf;
        } else if (z) {
            width = this.f4470Ujhhgtgfeyxiexzf;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4470Ujhhgtgfeyxiexzf - view.getWidth();
            width2 = this.f4470Ujhhgtgfeyxiexzf;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int mo2665Ujhhgtgfeyxiexzf(View view, int i) {
        return view.getTop();
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int mo2666Ujhhgtgfeyxiexzf(View view) {
        return view.getWidth();
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void mo2667Ujhhgtgfeyxiexzf(View view, int i) {
        this.f4471Ujhhgtgfeyxiexzf = i;
        this.f4470Ujhhgtgfeyxiexzf = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4472Ujhhgtgfeyxiexzf;
            swipeDismissBehavior.f633Ujhhgtgfeyxiexzf = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f633Ujhhgtgfeyxiexzf = false;
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo2669Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4472Ujhhgtgfeyxiexzf;
        float f = width * swipeDismissBehavior.f635Ujhhgtgfeyxiexzf;
        float width2 = view.getWidth() * swipeDismissBehavior.f636Ujhhgtgfeyxiexzf;
        float fAbs = Math.abs(i - this.f4470Ujhhgtgfeyxiexzf);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo2670Ujhhgtgfeyxiexzf(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f4471Ujhhgtgfeyxiexzf = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f4472Ujhhgtgfeyxiexzf;
        if (f != 0.0f) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f634Ujhhgtgfeyxiexzf;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f4470Ujhhgtgfeyxiexzf;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f4470Ujhhgtgfeyxiexzf;
                    if (left < i2) {
                        i = this.f4470Ujhhgtgfeyxiexzf - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f4470Ujhhgtgfeyxiexzf - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f4470Ujhhgtgfeyxiexzf) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.f4470Ujhhgtgfeyxiexzf;
                    if (left < i2) {
                        i = this.f4470Ujhhgtgfeyxiexzf - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f4470Ujhhgtgfeyxiexzf - width;
                }
                z = true;
            } else {
                i = this.f4470Ujhhgtgfeyxiexzf;
            }
        }
        if (swipeDismissBehavior.f631Ujhhgtgfeyxiexzf.m3252Ujhhgtgfeyxiexzf(i, view.getTop())) {
            RunnableC3003feyxiexzfUjhhgtg runnableC3003feyxiexzfUjhhgtg = new RunnableC3003feyxiexzfUjhhgtg(swipeDismissBehavior, view, z);
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            view.postOnAnimation(runnableC3003feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo2671feyxiexzfUjhhgtg(View view, int i) {
        int i2 = this.f4471Ujhhgtgfeyxiexzf;
        return (i2 == -1 || i2 == i) && this.f4472Ujhhgtgfeyxiexzf.mo777Ujhhgtgfeyxiexzf(view);
    }

    @Override // p000.AbstractC1243feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo2668Ujhhgtgfeyxiexzf(int i) {
    }
}
