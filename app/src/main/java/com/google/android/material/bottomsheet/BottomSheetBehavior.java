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
import p000.AbstractC0861;
import p000.AbstractC1194;
import p000.AbstractC1459;
import p000.AbstractC1574;
import p000.AbstractC2467;
import p000.AbstractC2784;
import p000.AbstractC3453;
import p000.AbstractC3578;
import p000.C0077;
import p000.C0078;
import p000.C0085;
import p000.C0362;
import p000.C0385;
import p000.C0408;
import p000.C0452;
import p000.C0453;
import p000.C0454;
import p000.C0864;
import p000.C1647;
import p000.C1916;
import p000.C1917;
import p000.C2677;
import p000.C3579;
import p000.RunnableC0228;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1917 f580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ColorStateList f581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean f585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean f586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean f587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean f588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean f589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean f590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean f591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final boolean f592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final boolean f595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C2677 f596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C0362 f598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final ValueAnimator f599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final float f603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final float f605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public boolean f606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean f608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int f609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C3579 f610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public boolean f611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public int f612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public boolean f613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final float f614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public int f615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public int f616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public int f617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public WeakReference f618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public WeakReference f619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public VelocityTracker f621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public int f622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public int f623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public boolean f624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public HashMap f625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public final SparseIntArray f626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final C0453 f627;

    public BottomSheetBehavior() {
        this.f572 = 0;
        this.f573 = true;
        this.f582 = -1;
        this.f583 = -1;
        this.f598 = new C0362(this);
        this.f603 = 0.5f;
        this.f605 = -1.0f;
        this.f608 = true;
        this.f609 = 4;
        this.f614 = 0.1f;
        this.f620 = new ArrayList();
        this.f623 = -1;
        this.f626 = new SparseIntArray();
        this.f627 = new C0453(this, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static View m636(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = AbstractC3578.f11184;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM636 = m636(viewGroup.getChildAt(i));
            if (viewM636 != null) {
                return viewM636;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m637(int i, int i2, int i3, int i4) {
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
        return View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo638(C0864 c0864) {
        this.f618 = null;
        this.f610 = null;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo639() {
        this.f618 = null;
        this.f610 = null;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo619(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C3579 c3579;
        if (!view.isShown() || !this.f608) {
            this.f611 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f622 = -1;
            this.f623 = -1;
            VelocityTracker velocityTracker = this.f621;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f621 = null;
            }
        }
        if (this.f621 == null) {
            this.f621 = VelocityTracker.obtain();
        }
        this.f621.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f623 = (int) motionEvent.getY();
            if (this.f609 != 2) {
                WeakReference weakReference = this.f619;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m69(view2, x, this.f623)) {
                    this.f622 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f624 = true;
                }
            }
            this.f611 = this.f622 == -1 && !coordinatorLayout.m69(view, x, this.f623);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f624 = false;
            this.f622 = -1;
            if (this.f611) {
                this.f611 = false;
                return false;
            }
        }
        if (this.f611 || (c3579 = this.f610) == null || !c3579.m5195(motionEvent)) {
            WeakReference weakReference2 = this.f619;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f611 || this.f609 == 1 || coordinatorLayout.m69(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f610 == null || (i = this.f623) == -1 || Math.abs(i - motionEvent.getY()) <= this.f610.f11191) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = AbstractC3578.f11184;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f618 == null) {
            this.f578 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f585 || this.f577) ? false : true;
            if (this.f586 || this.f587 || this.f588 || this.f590 || this.f591 || this.f592 || z) {
                AbstractC1459.m3179(view, new C0452(this, z));
            }
            AbstractC3578.m5179(view, new C1647(view));
            this.f618 = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1574.m3309(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1574.m3308(context, R.attr.motionDurationMedium2, 300);
            AbstractC1574.m3308(context, R.attr.motionDurationShort3, 150);
            AbstractC1574.m3308(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C1917 c1917 = this.f580;
            if (c1917 != null) {
                view.setBackground(c1917);
                float elevation = this.f605;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1917.m3715(elevation);
            } else {
                ColorStateList colorStateList = this.f581;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m653();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f610 == null) {
            this.f610 = new C3579(coordinatorLayout.getContext(), coordinatorLayout, this.f627);
        }
        int top = view.getTop();
        coordinatorLayout.m71(view, i);
        this.f616 = coordinatorLayout.getWidth();
        this.f617 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f615 = height;
        int iMin = this.f617;
        int i2 = iMin - height;
        int i3 = this.f594;
        if (i2 < i3) {
            boolean z2 = this.f589;
            int i4 = this.f583;
            if (z2) {
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.f615 = iMin;
            } else {
                int iMin2 = iMin - i3;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.f615 = iMin2;
            }
        }
        this.f601 = Math.max(0, this.f617 - this.f615);
        this.f602 = (int) ((1.0f - this.f603) * this.f617);
        m641();
        int i5 = this.f609;
        if (i5 == 3) {
            view.offsetTopAndBottom(m645());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.f602);
        } else if (this.f606 && i5 == 5) {
            view.offsetTopAndBottom(this.f617);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.f604);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m654(this.f609, false);
        this.f619 = new WeakReference(m636(view));
        ArrayList arrayList = this.f620;
        if (arrayList.size() <= 0) {
            return true;
        }
        
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo621(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m637(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f582, marginLayoutParams.width), m637(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f583, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean mo640(View view) {
        WeakReference weakReference = this.f619;
        return (weakReference == null || view != weakReference.get() || this.f609 == 3) ? false : true;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo622(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f619;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f608;
        if (i2 > 0) {
            if (i4 < m645()) {
                int iM645 = top - m645();
                iArr[1] = iM645;
                int i5 = -iM645;
                Field field = AbstractC3578.f11184;
                view.offsetTopAndBottom(i5);
                m650(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field2 = AbstractC3578.f11184;
                view.offsetTopAndBottom(-i2);
                m650(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f604;
            if (i4 > i6 && !this.f606) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                Field field3 = AbstractC3578.f11184;
                view.offsetTopAndBottom(i8);
                m650(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                Field field4 = AbstractC3578.f11184;
                view.offsetTopAndBottom(-i2);
                m650(1);
            }
        }
        m644(view.getTop());
        this.f612 = i2;
        this.f613 = true;
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo624(View view, Parcelable parcelable) {
        C0454 c0454 = (C0454) parcelable;
        int i = this.f572;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f576 = c0454.f2026;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f573 = c0454.f2027;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f606 = c0454.f2028;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f607 = c0454.f2029;
            }
        }
        int i2 = c0454.f2025;
        if (i2 == 1 || i2 == 2) {
            this.f609 = 4;
        } else {
            this.f609 = i2;
        }
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Parcelable mo625(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0454(this);
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final boolean mo626(View view, int i, int i2) {
        this.f612 = 0;
        this.f613 = false;
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
    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo627(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m645()) {
            m650(3);
            return;
        }
        WeakReference weakReference = this.f619;
        if (weakReference != null && view2 == weakReference.get() && this.f613) {
            if (this.f612 > 0) {
                if (!this.f573 && view.getTop() > this.f602) {
                    i3 = 6;
                }
            } else if (this.f606) {
                VelocityTracker velocityTracker = this.f621;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f574);
                    yVelocity = this.f621.getYVelocity(this.f622);
                }
                if (m651(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f612 == 0) {
                    top2 = view.getTop();
                    if (this.f573) {
                        i2 = this.f602;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f604)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f604)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f601) >= Math.abs(top2 - this.f604)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f573) {
                        top = view.getTop();
                        if (Math.abs(top - this.f602) < Math.abs(top - this.f604)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f612 == 0) {
                top2 = view.getTop();
                if (this.f573) {
                    i2 = this.f602;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f604)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f604)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f601) >= Math.abs(top2 - this.f604)) {
                    i3 = 4;
                }
            } else {
                if (!this.f573) {
                    top = view.getTop();
                    if (Math.abs(top - this.f602) < Math.abs(top - this.f604)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            m652(view, i3, false);
            this.f613 = false;
        }
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo628(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f609;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C3579 c3579 = this.f610;
        if (c3579 != null && (this.f608 || i == 1)) {
            c3579.m5189(motionEvent);
        }
        if (actionMasked == 0) {
            this.f622 = -1;
            this.f623 = -1;
            VelocityTracker velocityTracker = this.f621;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f621 = null;
            }
        }
        if (this.f621 == null) {
            this.f621 = VelocityTracker.obtain();
        }
        this.f621.addMovement(motionEvent);
        if (this.f610 != null && ((this.f608 || this.f609 == 1) && actionMasked == 2 && !this.f611)) {
            float fAbs = Math.abs(this.f623 - motionEvent.getY());
            C3579 c35710 = this.f610;
            if (fAbs > c35710.f11191) {
                c35710.m5181(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f611;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m641() {
        int iM643 = m643();
        if (this.f573) {
            this.f604 = Math.max(this.f617 - iM643, this.f601);
        } else {
            this.f604 = this.f617 - iM643;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final float m642() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f580 != null && (weakReference = this.f618) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f618.get();
            if (m647() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C1917 c1917 = this.f580;
                float fMo916 = c1917.f6332.f6314.f8632.mo916(c1917.m3712());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fMo916 <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fMo916;
                    }
                } else {
                    f = 0.0f;
                }
                C1917 c1918 = this.f580;
                float fMo917 = c1918.f6332.f6314.f8633.mo916(c1918.m3712());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo917 > 0.0f) {
                        f2 = radius2 / fMo917;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int m643() {
        int i;
        if (this.f577) {
            return Math.min(Math.max(this.f578, this.f617 - ((this.f616 * 9) / 16)), this.f615) + this.f593;
        }
        return (this.f585 || this.f586 || (i = this.f584) <= 0) ? this.f576 + this.f593 : Math.max(this.f576, i + this.f579);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m644(int i) {
        if (((View) this.f618.get()) != null) {
            ArrayList arrayList = this.f620;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f604;
            if (i <= i2 && i2 != m645()) {
                m645();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int m645() {
        if (this.f573) {
            return this.f601;
        }
        return Math.max(this.f600, this.f589 ? 0 : this.f594);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int m646(int i) {
        if (i == 3) {
            return m645();
        }
        if (i == 4) {
            return this.f604;
        }
        if (i == 5) {
            return this.f617;
        }
        if (i == 6) {
            return this.f602;
        }
        throw new IllegalArgumentException(AbstractC1194.m2779(i, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m647() {
        WeakReference weakReference = this.f618;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f618.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m648(int i) {
        if (i == -1) {
            if (this.f577) {
                return;
            } else {
                this.f577 = true;
            }
        } else {
            if (!this.f577 && this.f576 == i) {
                return;
            }
            this.f577 = false;
            this.f576 = Math.max(0, i);
        }
        m656();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m649(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC2784.m4752(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f606 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.f573 && m646(6) <= this.f601) ? 3 : i;
        WeakReference weakReference = this.f618;
        if (weakReference == null || weakReference.get() == null) {
            m650(i);
            return;
        }
        View view = (View) this.f618.get();
        RunnableC0228 runnableC0228 = new RunnableC0228(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = AbstractC3578.f11184;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0228);
                return;
            }
        }
        runnableC0228.run();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void m650(int i) {
        if (this.f609 == i) {
            return;
        }
        this.f609 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f606;
        }
        WeakReference weakReference = this.f618;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m655(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m655(false);
        }
        m654(i, true);
        ArrayList arrayList = this.f620;
        if (arrayList.size() <= 0) {
            m653();
        } else {
            
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m651(View view, float f) {
        if (this.f607) {
            return true;
        }
        if (view.getTop() < this.f604) {
            return false;
        }
        return Math.abs(((f * this.f614) + ((float) view.getTop())) - ((float) this.f604)) / ((float) m643()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m650(2);
        m654(r4, true);
        r2.f598.m1474(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m5194(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m652(View view, int i, boolean z) {
        int iM646 = m646(i);
        C3579 c3579 = this.f610;
        if (c3579 != null) {
            if (!z) {
                int left = view.getLeft();
                c3579.f11207 = view;
                c3579.f11192 = -1;
                boolean zM5187 = c3579.m5187(left, iM646, 0, 0);
                if (!zM5187 && c3579.f11190 == 0 && c3579.f11207 != null) {
                    c3579.f11207 = null;
                }
            }
        }
        m650(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m653() {
        View view;
        int iM1062;
        WeakReference weakReference = this.f618;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3578.m5174(view, 524288);
        AbstractC3578.m5172(view, 0);
        AbstractC3578.m5174(view, 262144);
        AbstractC3578.m5172(view, 0);
        AbstractC3578.m5174(view, 1048576);
        AbstractC3578.m5172(view, 0);
        SparseIntArray sparseIntArray = this.f626;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC3578.m5174(view, i);
            AbstractC3578.m5172(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.f573 && this.f609 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0408 c0408 = new C0408(6, 3, this);
            ArrayList arrayListM5170 = AbstractC3578.m5170(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM5170.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = AbstractC3578.f11186;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListM5170.size(); i7++) {
                            z &= ((C0085) arrayListM5170.get(i7)).m1062() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iM1062 = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0085) arrayListM5170.get(i3)).f1038).getLabel())) {
                    iM1062 = ((C0085) arrayListM5170.get(i3)).m1062();
                    break;
                }
                i3++;
            }
            if (iM1062 != -1) {
                C0085 c0085 = new C0085(null, iM1062, string, c0408, null);
                View.AccessibilityDelegate accessibilityDelegateM5168 = AbstractC3578.m5168(view);
                C0078 c0078 = accessibilityDelegateM5168 == null ? null : accessibilityDelegateM5168 instanceof C0077 ? ((C0077) accessibilityDelegateM5168).f1022 : new C0078(accessibilityDelegateM5168);
                if (c0078 == null) {
                    c0078 = new C0078();
                }
                AbstractC3578.m5177(view, c0078);
                AbstractC3578.m5174(view, c0085.m1062());
                AbstractC3578.m5170(view).add(c0085);
                AbstractC3578.m5172(view, 0);
            }
            sparseIntArray.put(0, iM1062);
        }
        if (this.f606) {
            int i8 = 5;
            if (this.f609 != 5) {
                AbstractC3578.m5175(view, C0085.f1032, new C0408(5, 3, this));
            }
        }
        int i9 = this.f609;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            AbstractC3578.m5175(view, C0085.f1031, new C0408(this.f573 ? 4 : 6, 3, this));
            return;
        }
        if (i9 == 4) {
            AbstractC3578.m5175(view, C0085.f1030, new C0408(this.f573 ? 3 : 6, 3, this));
        } else {
            if (i9 != 6) {
                return;
            }
            AbstractC3578.m5175(view, C0085.f1031, new C0408(4, 3, this));
            AbstractC3578.m5175(view, C0085.f1030, new C0408(3, 3, this));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m654(int i, boolean z) {
        C1917 c1917;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f609 == 3 && (this.f595 || m647());
        if (this.f597 == z2 || (c1917 = this.f580) == null) {
            return;
        }
        this.f597 = z2;
        ValueAnimator valueAnimator = this.f599;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c1917.f6332.f6322, z2 ? m642() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM642 = this.f597 ? m642() : 1.0f;
        C1916 c1916 = c1917.f6332;
        if (c1916.f6322 != fM642) {
            c1916.f6322 = fM642;
            c1917.f6336 = true;
            c1917.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m655(boolean z) {
        WeakReference weakReference = this.f618;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f625 != null) {
                    return;
                } else {
                    this.f625 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f618.get() && z) {
                    this.f625.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f625 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m656() {
        View view;
        if (this.f618 != null) {
            m641();
            if (this.f609 != 4 || (view = (View) this.f618.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f572 = 0;
        int i2 = 1;
        this.f573 = true;
        this.f582 = -1;
        this.f583 = -1;
        this.f598 = new C0362(this);
        this.f603 = 0.5f;
        this.f605 = -1.0f;
        this.f608 = true;
        this.f609 = 4;
        this.f614 = 0.1f;
        this.f620 = new ArrayList();
        this.f623 = -1;
        this.f626 = new SparseIntArray();
        this.f627 = new C0453(this, 0);
        this.f579 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7841);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f581 = AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f596 = C2677.m4688(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m3876();
        }
        C2677 c2677 = this.f596;
        if (c2677 != null) {
            C1917 c1917 = new C1917(c2677);
            this.f580 = c1917;
            c1917.m3714(context);
            ColorStateList colorStateList = this.f581;
            if (colorStateList != null) {
                this.f580.m3716(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f580.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m642(), 1.0f);
        this.f599 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f599.addUpdateListener(new C0385(1, this));
        this.f605 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f582 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f583 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m648(-1);
        } else {
            m648(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f606 != z) {
            this.f606 = z;
            if (!z && this.f609 == 5) {
                m649(4);
            }
            m653();
        }
        this.f585 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f573 != z2) {
            this.f573 = z2;
            if (this.f618 != null) {
                m641();
            }
            m650((this.f573 && this.f609 == 6) ? 3 : this.f609);
            m654(this.f609, true);
            m653();
        }
        this.f607 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f608 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f572 = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f603 = f;
            if (this.f618 != null) {
                this.f602 = (int) ((1.0f - f) * this.f617);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f600 = i3;
                    m654(this.f609, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f600 = dimensionPixelOffset;
                    m654(this.f609, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f575 = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f586 = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f587 = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f588 = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f589 = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f590 = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f591 = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f592 = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f595 = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f574 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000.AbstractC0861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo623(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
