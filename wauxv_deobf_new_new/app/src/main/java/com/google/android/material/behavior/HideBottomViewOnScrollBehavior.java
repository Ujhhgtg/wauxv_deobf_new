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
import p000.AbstractC0172;
import p000.AbstractC0860;
import p000.AbstractC1095;
import p000.AbstractC3744;
import p000.C0131;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0860 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public TimeInterpolator f612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public TimeInterpolator f613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ViewPropertyAnimator f616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f609 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f614 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f615 = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f614 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f610 = AbstractC3744.m5341(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f611 = AbstractC3744.m5341(view.getContext(), R.attr.motionDurationMedium4, Opcodes.DRETURN);
        this.f612 = AbstractC3744.m5342(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1256);
        this.f613 = AbstractC3744.m5342(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1255);
        return false;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo766(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f609;
        if (i > 0) {
            if (this.f615 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f616;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f615 = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC1095.m2792(it);
            }
            this.f616 = view.animate().translationY(this.f614).setInterpolator(this.f613).setDuration(this.f611).setListener(new C0131(this, 4));
            return;
        }
        if (i >= 0 || this.f615 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f616;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f615 = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC1095.m2792(it2);
        }
        this.f616 = view.animate().translationY(0).setInterpolator(this.f612).setDuration(this.f610).setListener(new C0131(this, 4));
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public boolean mo769(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
