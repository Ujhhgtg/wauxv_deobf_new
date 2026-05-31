package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import me.hd.wauxv.R;
import p000.AbstractC0860;
import p000.AbstractC1095;
import p000.AbstractC1471;
import p000.AbstractC2521;
import p000.AbstractC2844;
import p000.AbstractC3638;
import p000.AbstractC3744;
import p000.C0085;
import p000.C0086;
import p000.C0093;
import p000.C0337;
import p000.C0360;
import p000.C0383;
import p000.C0427;
import p000.C0428;
import p000.C0429;
import p000.C0863;
import p000.C1661;
import p000.C1948;
import p000.C2738;
import p000.C3639;
import p000.RunnableC0238;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0860 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1948 f632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ColorStateList f633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean f637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean f638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean f639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean f640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean f641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean f642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean f643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final boolean f644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f645;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final boolean f647;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C2738 f648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f649;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C0337 f650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final ValueAnimator f651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final float f655;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final float f657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public boolean f658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean f660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int f661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C3639 f662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public boolean f663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public int f664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public boolean f665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final float f666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public int f667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public int f668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public int f669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public WeakReference f670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public WeakReference f671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public VelocityTracker f673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public int f674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public int f675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public boolean f676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public HashMap f677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public final SparseIntArray f678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final C0428 f679;

    public BottomSheetBehavior() {
        this.f624 = 0;
        this.f625 = true;
        this.f634 = -1;
        this.f635 = -1;
        this.f650 = new C0337(this);
        this.f655 = 0.5f;
        this.f657 = -1.0f;
        this.f660 = true;
        this.f661 = 4;
        this.f666 = 0.1f;
        this.f672 = new ArrayList();
        this.f675 = -1;
        this.f678 = new SparseIntArray();
        this.f679 = new C0428(this, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static View m779(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = AbstractC3638.f11333;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM779 = m779(viewGroup.getChildAt(i));
            if (viewM779 != null) {
                return viewM779;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m780(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo781(C0863 c0863) {
        this.f670 = null;
        this.f662 = null;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo782() {
        this.f670 = null;
        this.f662 = null;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo762(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C3639 c3639;
        if (!view.isShown() || !this.f660) {
            this.f663 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f674 = -1;
            this.f675 = -1;
            VelocityTracker velocityTracker = this.f673;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f673 = null;
            }
        }
        if (this.f673 == null) {
            this.f673 = VelocityTracker.obtain();
        }
        this.f673.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f675 = (int) motionEvent.getY();
            if (this.f661 != 2) {
                WeakReference weakReference = this.f671;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m69(view2, x, this.f675)) {
                    this.f674 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f676 = true;
                }
            }
            this.f663 = this.f674 == -1 && !coordinatorLayout.m69(view, x, this.f675);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f676 = false;
            this.f674 = -1;
            if (this.f663) {
                this.f663 = false;
                return false;
            }
        }
        if (this.f663 || (c3639 = this.f662) == null || !c3639.m5201(motionEvent)) {
            WeakReference weakReference2 = this.f671;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f663 || this.f661 == 1 || coordinatorLayout.m69(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f662 == null || (i = this.f675) == -1 || Math.abs(i - motionEvent.getY()) <= this.f662.f11340) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3638.f11333;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f670 == null) {
            this.f630 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f637 || this.f629) ? false : true;
            if (this.f638 || this.f639 || this.f640 || this.f642 || this.f643 || this.f644 || z) {
                AbstractC1471.m3382(view, new C0427(this, z));
            }
            AbstractC3638.m5185(view, new C1661(view));
            this.f670 = new WeakReference(view);
            Context context = view.getContext();
            AbstractC3744.m5342(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC3744.m5341(context, R.attr.motionDurationMedium2, 300);
            AbstractC3744.m5341(context, R.attr.motionDurationShort3, Opcodes.FCMPG);
            AbstractC3744.m5341(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C1948 c1948 = this.f632;
            if (c1948 != null) {
                view.setBackground(c1948);
                float elevation = this.f657;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1948.m3913(elevation);
            } else {
                ColorStateList colorStateList = this.f633;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m796();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f662 == null) {
            this.f662 = new C3639(coordinatorLayout.getContext(), coordinatorLayout, this.f679);
        }
        int top = view.getTop();
        coordinatorLayout.m71(view, i);
        this.f668 = coordinatorLayout.getWidth();
        this.f669 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f667 = height;
        int iMin = this.f669;
        int i2 = iMin - height;
        int i3 = this.f646;
        if (i2 < i3) {
            boolean z2 = this.f641;
            int i4 = this.f635;
            if (z2) {
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.f667 = iMin;
            } else {
                int iMin2 = iMin - i3;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.f667 = iMin2;
            }
        }
        this.f653 = Math.max(0, this.f669 - this.f667);
        this.f654 = (int) ((1.0f - this.f655) * this.f669);
        m784();
        int i5 = this.f661;
        if (i5 == 3) {
            view.offsetTopAndBottom(m788());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.f654);
        } else if (this.f658 && i5 == 5) {
            view.offsetTopAndBottom(this.f669);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.f656);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m797(this.f661, false);
        this.f671 = new WeakReference(m779(view));
        ArrayList arrayList = this.f672;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo764(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m780(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f634, marginLayoutParams.width), m780(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f635, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean mo783(View view) {
        WeakReference weakReference = this.f671;
        return (weakReference == null || view != weakReference.get() || this.f661 == 3) ? false : true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo765(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f671;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f660;
        if (i2 > 0) {
            if (i4 < m788()) {
                int iM788 = top - m788();
                iArr[1] = iM788;
                int i5 = -iM788;
                Field field = AbstractC3638.f11333;
                view.offsetTopAndBottom(i5);
                m793(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field2 = AbstractC3638.f11333;
                view.offsetTopAndBottom(-i2);
                m793(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f656;
            if (i4 > i6 && !this.f658) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                Field field3 = AbstractC3638.f11333;
                view.offsetTopAndBottom(i8);
                m793(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field4 = AbstractC3638.f11333;
                view.offsetTopAndBottom(-i2);
                m793(1);
            }
        }
        m787(view.getTop());
        this.f664 = i2;
        this.f665 = true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo767(View view, Parcelable parcelable) {
        C0429 c0429 = (C0429) parcelable;
        int i = this.f624;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f628 = c0429.f1998;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f625 = c0429.f1999;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f658 = c0429.f2000;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f659 = c0429.f2001;
            }
        }
        int i2 = c0429.f1997;
        if (i2 == 1 || i2 == 2) {
            this.f661 = 4;
        } else {
            this.f661 = i2;
        }
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Parcelable mo768(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0429(this);
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final boolean mo769(View view, int i, int i2) {
        this.f664 = 0;
        this.f665 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo770(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m788()) {
            m793(3);
            return;
        }
        WeakReference weakReference = this.f671;
        if (weakReference != null && view2 == weakReference.get() && this.f665) {
            if (this.f664 > 0) {
                if (!this.f625 && view.getTop() > this.f654) {
                    i3 = 6;
                }
            } else if (this.f658) {
                VelocityTracker velocityTracker = this.f673;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f626);
                    yVelocity = this.f673.getYVelocity(this.f674);
                }
                if (m794(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f664 == 0) {
                    top2 = view.getTop();
                    if (this.f625) {
                        i2 = this.f654;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f656)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f656)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f653) >= Math.abs(top2 - this.f656)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f625) {
                        top = view.getTop();
                        if (Math.abs(top - this.f654) < Math.abs(top - this.f656)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f664 == 0) {
                top2 = view.getTop();
                if (this.f625) {
                    i2 = this.f654;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f656)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f656)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f653) >= Math.abs(top2 - this.f656)) {
                    i3 = 4;
                }
            } else {
                if (!this.f625) {
                    top = view.getTop();
                    if (Math.abs(top - this.f654) < Math.abs(top - this.f656)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            m795(view, i3, false);
            this.f665 = false;
        }
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo771(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f661;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C3639 c3639 = this.f662;
        if (c3639 != null && (this.f660 || i == 1)) {
            c3639.m5195(motionEvent);
        }
        if (actionMasked == 0) {
            this.f674 = -1;
            this.f675 = -1;
            VelocityTracker velocityTracker = this.f673;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f673 = null;
            }
        }
        if (this.f673 == null) {
            this.f673 = VelocityTracker.obtain();
        }
        this.f673.addMovement(motionEvent);
        if (this.f662 != null && ((this.f660 || this.f661 == 1) && actionMasked == 2 && !this.f663)) {
            float fAbs = Math.abs(this.f675 - motionEvent.getY());
            C3639 c36310 = this.f662;
            if (fAbs > c36310.f11340) {
                c36310.m5187(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f663;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m784() {
        int iM786 = m786();
        if (this.f625) {
            this.f656 = Math.max(this.f669 - iM786, this.f653);
        } else {
            this.f656 = this.f669 - iM786;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final float m785() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f632 != null && (weakReference = this.f670) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f670.get();
            if (m790() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM3910 = this.f632.m3910();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM3910 <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fM3910;
                    }
                } else {
                    f = 0.0f;
                }
                C1948 c1948 = this.f632;
                float fMo1060 = c1948.f6437.f6419.f8803.mo1060(c1948.m3909());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo1060 > 0.0f) {
                        f2 = radius2 / fMo1060;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int m786() {
        int i;
        if (this.f629) {
            return Math.min(Math.max(this.f630, this.f669 - ((this.f668 * 9) / 16)), this.f667) + this.f645;
        }
        return (this.f637 || this.f638 || (i = this.f636) <= 0) ? this.f628 + this.f645 : Math.max(this.f628, i + this.f631);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m787(int i) {
        if (((View) this.f670.get()) != null) {
            ArrayList arrayList = this.f672;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f656;
            if (i <= i2 && i2 != m788()) {
                m788();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int m788() {
        if (this.f625) {
            return this.f653;
        }
        return Math.max(this.f652, this.f641 ? 0 : this.f646);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int m789(int i) {
        if (i == 3) {
            return m788();
        }
        if (i == 4) {
            return this.f656;
        }
        if (i == 5) {
            return this.f669;
        }
        if (i == 6) {
            return this.f654;
        }
        throw new IllegalArgumentException(AbstractC1095.m2794(i, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m790() {
        WeakReference weakReference = this.f670;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f670.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m791(int i) {
        if (i == -1) {
            if (this.f629) {
                return;
            } else {
                this.f629 = true;
            }
        } else {
            if (!this.f629 && this.f628 == i) {
                return;
            }
            this.f629 = false;
            this.f628 = Math.max(0, i);
        }
        m799();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m792(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC2844.m4786(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f658 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f625 && m789(i) <= this.f653) ? 3 : i;
        WeakReference weakReference = this.f670;
        if (weakReference == null || weakReference.get() == null) {
            m793(i);
            return;
        }
        View view = (View) this.f670.get();
        RunnableC0238 runnableC0238 = new RunnableC0238(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = AbstractC3638.f11333;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0238);
                return;
            }
        }
        runnableC0238.run();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void m793(int i) {
        if (this.f661 == i) {
            return;
        }
        this.f661 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f658;
        }
        WeakReference weakReference = this.f670;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m798(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m798(false);
        }
        m797(i, true);
        ArrayList arrayList = this.f672;
        if (arrayList.size() <= 0) {
            m796();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m794(View view, float f) {
        if (this.f659) {
            return true;
        }
        if (view.getTop() < this.f656) {
            return false;
        }
        return Math.abs(((f * this.f666) + ((float) view.getTop())) - ((float) this.f656)) / ((float) m786()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m793(2);
        m797(r4, true);
        r2.f650.m1579(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m5200(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m795(View view, int i, boolean z) {
        int iM789 = m789(i);
        C3639 c3639 = this.f662;
        if (c3639 != null) {
            if (!z) {
                int left = view.getLeft();
                c3639.f11356 = view;
                c3639.f11341 = -1;
                boolean zM5193 = c3639.m5193(left, iM789, 0, 0);
                if (!zM5193 && c3639.f11339 == 0 && c3639.f11356 != null) {
                    c3639.f11356 = null;
                }
            }
        }
        m793(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m796() {
        View view;
        int iM1207;
        WeakReference weakReference = this.f670;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3638.m5180(view, 524288);
        AbstractC3638.m5178(view, 0);
        AbstractC3638.m5180(view, 262144);
        AbstractC3638.m5178(view, 0);
        AbstractC3638.m5180(view, 1048576);
        AbstractC3638.m5178(view, 0);
        SparseIntArray sparseIntArray = this.f678;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC3638.m5180(view, i);
            AbstractC3638.m5178(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.f625 && this.f661 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0383 c0383 = new C0383(i2, 3, this);
            ArrayList arrayListM5176 = AbstractC3638.m5176(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM5176.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = AbstractC3638.f11335;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListM5176.size(); i7++) {
                            z &= ((C0093) arrayListM5176.get(i7)).m1207() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iM1207 = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0093) arrayListM5176.get(i3)).f1106).getLabel())) {
                    iM1207 = ((C0093) arrayListM5176.get(i3)).m1207();
                    break;
                }
                i3++;
            }
            if (iM1207 != -1) {
                C0093 c0093 = new C0093(null, iM1207, string, c0383, null);
                View.AccessibilityDelegate accessibilityDelegateM5174 = AbstractC3638.m5174(view);
                C0086 c0086 = accessibilityDelegateM5174 == null ? null : accessibilityDelegateM5174 instanceof C0085 ? ((C0085) accessibilityDelegateM5174).f1090 : new C0086(accessibilityDelegateM5174);
                if (c0086 == null) {
                    c0086 = new C0086();
                }
                AbstractC3638.m5183(view, c0086);
                AbstractC3638.m5180(view, c0093.m1207());
                AbstractC3638.m5176(view).add(c0093);
                AbstractC3638.m5178(view, 0);
            }
            sparseIntArray.put(0, iM1207);
        }
        if (this.f658) {
            int i8 = 5;
            if (this.f661 != 5) {
                AbstractC3638.m5181(view, C0093.f1100, new C0383(i8, 3, this));
            }
        }
        int i9 = this.f661;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            AbstractC3638.m5181(view, C0093.f1099, new C0383(this.f625 ? 4 : 6, 3, this));
            return;
        }
        if (i9 == 4) {
            AbstractC3638.m5181(view, C0093.f1098, new C0383(this.f625 ? 3 : 6, 3, this));
        } else {
            if (i9 != 6) {
                return;
            }
            AbstractC3638.m5181(view, C0093.f1099, new C0383(i10, 3, this));
            AbstractC3638.m5181(view, C0093.f1098, new C0383(i11, 3, this));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m797(int i, boolean z) {
        C1948 c1948;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f661 == 3 && (this.f647 || m790());
        if (this.f649 == z2 || (c1948 = this.f632) == null) {
            return;
        }
        this.f649 = z2;
        ValueAnimator valueAnimator = this.f651;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c1948.m3915(this.f649 ? m785() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c1948.f6437.f6427, z2 ? m785() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m798(boolean z) {
        WeakReference weakReference = this.f670;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f677 != null) {
                    return;
                } else {
                    this.f677 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f670.get() && z) {
                    this.f677.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f677 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m799() {
        View view;
        if (this.f670 != null) {
            m784();
            if (this.f661 != 4 || (view = (View) this.f670.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f624 = 0;
        int i2 = 1;
        this.f625 = true;
        this.f634 = -1;
        this.f635 = -1;
        this.f650 = new C0337(this);
        this.f655 = 0.5f;
        this.f657 = -1.0f;
        this.f660 = true;
        this.f661 = 4;
        this.f666 = 0.1f;
        this.f672 = new ArrayList();
        this.f675 = -1;
        this.f678 = new SparseIntArray();
        this.f679 = new C0428(this, 0);
        this.f631 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f7987);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f633 = AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f648 = C2738.m4725(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m4722();
        }
        C2738 c2738 = this.f648;
        if (c2738 != null) {
            C1948 c1948 = new C1948(c2738);
            this.f632 = c1948;
            c1948.m3912(context);
            ColorStateList colorStateList = this.f633;
            if (colorStateList != null) {
                this.f632.m3914(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f632.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m785(), 1.0f);
        this.f651 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f651.addUpdateListener(new C0360(this, i2));
        this.f657 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f634 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f635 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m791(i);
        } else {
            m791(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f658 != z) {
            this.f658 = z;
            if (!z && this.f661 == 5) {
                m792(4);
            }
            m796();
        }
        this.f637 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f625 != z2) {
            this.f625 = z2;
            if (this.f670 != null) {
                m784();
            }
            m793((this.f625 && this.f661 == 6) ? 3 : this.f661);
            m797(this.f661, true);
            m796();
        }
        this.f659 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f660 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f624 = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f655 = f;
            if (this.f670 != null) {
                this.f654 = (int) ((1.0f - f) * this.f669);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f652 = i3;
                    m797(this.f661, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f652 = dimensionPixelOffset;
                    m797(this.f661, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f627 = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f638 = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f639 = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f640 = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f641 = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f642 = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f643 = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f644 = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f647 = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f626 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo766(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
