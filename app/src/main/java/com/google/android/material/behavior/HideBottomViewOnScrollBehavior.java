package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC3036feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3723feyxiexzfUjhhgtg;
import p000.C2994Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC3723feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f624Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f625Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public TimeInterpolator f626Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public TimeInterpolator f627Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public ViewPropertyAnimator f630Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet f623Ujhhgtgfeyxiexzf = new LinkedHashSet();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f628Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f629Ujhhgtgfeyxiexzf = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public boolean mo762Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f628Ujhhgtgfeyxiexzf = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f624Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f625Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(view.getContext(), R.attr.motionDurationMedium4, Opcodes.DRETURN);
        this.f626Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9415Ujhhgtgfeyxiexzf);
        this.f627Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9414Ujhhgtgfeyxiexzf);
        return false;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo765Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f623Ujhhgtgfeyxiexzf;
        if (i > 0) {
            if (this.f629Ujhhgtgfeyxiexzf == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f630Ujhhgtgfeyxiexzf;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f629Ujhhgtgfeyxiexzf = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
            }
            this.f630Ujhhgtgfeyxiexzf = view.animate().translationY(this.f628Ujhhgtgfeyxiexzf).setInterpolator(this.f627Ujhhgtgfeyxiexzf).setDuration(this.f625Ujhhgtgfeyxiexzf).setListener(new C2994Ujhhgtgfeyxiexzf(4, this));
            return;
        }
        if (i >= 0 || this.f629Ujhhgtgfeyxiexzf == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f630Ujhhgtgfeyxiexzf;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f629Ujhhgtgfeyxiexzf = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it2);
        }
        this.f630Ujhhgtgfeyxiexzf = view.animate().translationY(0).setInterpolator(this.f626Ujhhgtgfeyxiexzf).setDuration(this.f624Ujhhgtgfeyxiexzf).setListener(new C2994Ujhhgtgfeyxiexzf(4, this));
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public boolean mo768Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
