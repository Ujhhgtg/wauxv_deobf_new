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
import p000.AbstractC0164;
import p000.AbstractC0861;
import p000.AbstractC1194;
import p000.AbstractC1574;
import p000.C0123;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public TimeInterpolator f560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public TimeInterpolator f561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ViewPropertyAnimator f564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f557 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f562 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f563 = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f562 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f558 = AbstractC1574.m3308(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f559 = AbstractC1574.m3308(view.getContext(), R.attr.motionDurationMedium4, Opcodes.DRETURN);
        this.f560 = AbstractC1574.m3309(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1188);
        this.f561 = AbstractC1574.m3309(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1187);
        return false;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo623(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f557;
        if (i > 0) {
            if (this.f563 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f564;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f563 = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC1194.m2777(it);
            }
            this.f564 = view.animate().translationY(this.f562).setInterpolator(this.f561).setDuration(this.f559).setListener(new C0123(4, this));
            return;
        }
        if (i >= 0 || this.f563 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f564;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f563 = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC1194.m2777(it2);
        }
        this.f564 = view.animate().translationY(0).setInterpolator(this.f560).setDuration(this.f558).setListener(new C0123(4, this));
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public boolean mo626(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
