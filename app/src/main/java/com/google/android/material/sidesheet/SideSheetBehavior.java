package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;
import p000.AbstractC0861;
import p000.AbstractC1194;
import p000.AbstractC1574;
import p000.AbstractC2467;
import p000.AbstractC3453;
import p000.AbstractC3578;
import p000.C0053;
import p000.C0085;
import p000.C0362;
import p000.C0453;
import p000.C0864;
import p000.C1765;
import p000.C1917;
import p000.C2021;
import p000.C2677;
import p000.C2703;
import p000.C3579;
import p000.InterfaceC0102;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0861 {

    public AbstractC1574 f757;

    public final C1917 f758;

    public final ColorStateList f759;

    public final C2677 f760;

    public final C0362 f761;

    public final float f762;

    public final boolean f763;

    public int f764;

    public C3579 f765;

    public boolean f766;

    public final float f767;

    public int f768;

    public int f769;

    public int f770;

    public int f771;

    public WeakReference f772;

    public WeakReference f773;

    public final int f774;

    public VelocityTracker f775;

    public int f776;

    public final LinkedHashSet f777;

    public final C0453 f778;

    public SideSheetBehavior() {
        this.f761 = new C0362(this);
        this.f763 = true;
        this.f764 = 5;
        this.f767 = 0.1f;
        this.f774 = -1;
        this.f777 = new LinkedHashSet();
        this.f778 = new C0453(this, 1);
    }

    @Override // p000.AbstractC0861
    public final void mo638(C0864 c0864) {
        this.f772 = null;
        this.f765 = null;
    }

    @Override // p000.AbstractC0861
    public final void mo639() {
        this.f772 = null;
        this.f765 = null;
    }

    @Override // p000.AbstractC0861
    public final boolean mo619(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3579 c3579;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC3578.m5169(view) == null) || !this.f763) {
            this.f766 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f775) != null) {
            velocityTracker.recycle();
            this.f775 = null;
        }
        if (this.f775 == null) {
            this.f775 = VelocityTracker.obtain();
        }
        this.f775.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f776 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f766) {
            this.f766 = false;
            return false;
        }
        return (this.f766 || (c3579 = this.f765) == null || !c3579.m5195(motionEvent)) ? false : true;
    }

    @Override // p000.AbstractC0861
    public final boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        Field field = AbstractC3578.f11184;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f772;
        C1917 c1917 = this.f758;
        int iMo3326 = 0;
        if (weakReference == null) {
            this.f772 = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1574.m3309(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1574.m3308(context, R.attr.motionDurationMedium2, 300);
            AbstractC1574.m3308(context, R.attr.motionDurationShort3, 150);
            AbstractC1574.m3308(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c1917 != null) {
                view.setBackground(c1917);
                float elevation = this.f762;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1917.m3715(elevation);
            } else {
                ColorStateList colorStateList = this.f759;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i4 = this.f764 == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m690();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC3578.m5169(view) == null) {
                AbstractC3578.m5178(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0864) view.getLayoutParams()).f3279, i) == 3 ? 1 : 0;
        AbstractC1574 abstractC1574 = this.f757;
        if (abstractC1574 == null || abstractC1574.mo3328() != i5) {
            C0864 c0864 = null;
            C2677 c2677 = this.f760;
            if (i5 == 0) {
                this.f757 = new C1765(this, 1);
                if (c2677 != null) {
                    WeakReference weakReference2 = this.f772;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0864)) {
                        c0864 = (C0864) view3.getLayoutParams();
                    }
                    if (c0864 == null || ((ViewGroup.MarginLayoutParams) c0864).rightMargin <= 0) {
                        C2021 c2021M4691 = c2677.m4691();
                        c2021M4691.f6767 = new C0053(0.0f);
                        c2021M4691.f6768 = new C0053(0.0f);
                        C2677 c2677M3876 = c2021M4691.m3876();
                        if (c1917 != null) {
                            c1917.setShapeAppearanceModel(c2677M3876);
                        }
                    }
                }
            } else {
                if (false) {
                    throw new IllegalArgumentException(AbstractC1194.m2780(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f757 = new C1765(this, 0);
                if (c2677 != null) {
                    WeakReference weakReference3 = this.f772;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C0864)) {
                        c0864 = (C0864) view2.getLayoutParams();
                    }
                    if (c0864 == null || ((ViewGroup.MarginLayoutParams) c0864).leftMargin <= 0) {
                        C2021 c2021M4692 = c2677.m4691();
                        c2021M4692.f6766 = new C0053(0.0f);
                        c2021M4692.f6769 = new C0053(0.0f);
                        C2677 c2677M3877 = c2021M4692.m3876();
                        if (c1917 != null) {
                            c1917.setShapeAppearanceModel(c2677M3877);
                        }
                    }
                }
            }
        }
        if (this.f765 == null) {
            this.f765 = new C3579(coordinatorLayout.getContext(), coordinatorLayout, this.f778);
        }
        int iMo3327 = this.f757.mo3326(view);
        coordinatorLayout.m71(view, i);
        this.f769 = coordinatorLayout.getWidth();
        this.f770 = this.f757.mo3327(coordinatorLayout);
        this.f768 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f771 = marginLayoutParams != null ? this.f757.mo3320(marginLayoutParams) : 0;
        int i6 = this.f764;
        if (i6 == 1 || i6 == 2) {
            iMo3326 = iMo3327 - this.f757.mo3326(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f764);
            }
            iMo3326 = this.f757.mo3323();
        }
        view.offsetLeftAndRight(iMo3326);
        if (this.f773 == null && (i2 = this.f774) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f773 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f777.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC0861
    public final boolean mo621(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0861
    public final void mo624(View view, Parcelable parcelable) {
        int i = ((C2703) parcelable).f8713;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f764 = i;
    }

    @Override // p000.AbstractC0861
    public final Parcelable mo625(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2703(this);
    }

    @Override // p000.AbstractC0861
    public final boolean mo628(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f764 == 1 && actionMasked == 0) {
            return true;
        }
        if (m688()) {
            this.f765.m5189(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f775) != null) {
            velocityTracker.recycle();
            this.f775 = null;
        }
        if (this.f775 == null) {
            this.f775 = VelocityTracker.obtain();
        }
        this.f775.addMovement(motionEvent);
        if (m688() && actionMasked == 2 && !this.f766 && true) {
            float fAbs = Math.abs(this.f776 - motionEvent.getX());
            C3579 c3579 = this.f765;
            if (fAbs > c3579.f11191) {
                c3579.m5181(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f766;
    }

    public final void m687(int i) {
        View view;
        if (this.f764 == i) {
            return;
        }
        this.f764 = i;
        WeakReference weakReference = this.f772;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f764 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f777.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
        m690();
    }

    public final boolean m688() {
        if (this.f765 != null) {
            return this.f763 || this.f764 == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m5194(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m687(2);
        r2.f761.m1474(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m689(View view, int i, boolean z) {
        int iMo3322;
        if (i == 3) {
            iMo3322 = this.f757.mo3322();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC1194.m2779(i, "Invalid state to get outer edge offset: "));
            }
            iMo3322 = this.f757.mo3323();
        }
        C3579 c3579 = this.f765;
        if (c3579 != null) {
            if (!z) {
                int top = view.getTop();
                c3579.f11207 = view;
                c3579.f11192 = -1;
                boolean zM5187 = c3579.m5187(iMo3322, top, 0, 0);
                if (!zM5187 && c3579.f11190 == 0 && c3579.f11207 != null) {
                    c3579.f11207 = null;
                }
            }
        }
        m687(i);
    }

    public final void m690() {
        View view;
        WeakReference weakReference = this.f772;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3578.m5174(view, 262144);
        AbstractC3578.m5172(view, 0);
        AbstractC3578.m5174(view, 1048576);
        AbstractC3578.m5172(view, 0);
        final int i = 5;
        if (this.f764 != 5) {
            AbstractC3578.m5175(view, C0085.f1032, new InterfaceC0102() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᤝᲈᤞ
                @Override // p000.InterfaceC0102
                public final boolean mo1124(View view2) {
                    int i2 = 5;
                    int i3 = 1;
                    if (false) {
                        throw new IllegalArgumentException(AbstractC2784.m4752(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f8711;
                    WeakReference weakReference2 = sideSheetBehavior.f772;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m687(5);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f772.get();
                    RunnableC2581 runnableC2581 = new RunnableC2581(5, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC3578.f11184;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC2581);
                            return true;
                        }
                    }
                    runnableC2581.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f764 != 3) {
            AbstractC3578.m5175(view, C0085.f1030, new InterfaceC0102() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᤝᲈᤞ
                @Override // p000.InterfaceC0102
                public final boolean mo1124(View view2) {
                    int i3 = 3;
                    int i4 = 1;
                    if (false) {
                        throw new IllegalArgumentException(AbstractC2784.m4752(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f8711;
                    WeakReference weakReference2 = sideSheetBehavior.f772;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m687(3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f772.get();
                    RunnableC2581 runnableC2581 = new RunnableC2581(3, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC3578.f11184;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC2581);
                            return true;
                        }
                    }
                    runnableC2581.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f761 = new C0362(this);
        this.f763 = true;
        this.f764 = 5;
        this.f767 = 0.1f;
        this.f774 = -1;
        this.f777 = new LinkedHashSet();
        this.f778 = new C0453(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7864);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f759 = AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f760 = C2677.m4688(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m3876();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f774 = resourceId;
            WeakReference weakReference = this.f773;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f773 = null;
            WeakReference weakReference2 = this.f772;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = AbstractC3578.f11184;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C2677 c2677 = this.f760;
        if (c2677 != null) {
            C1917 c1917 = new C1917(c2677);
            this.f758 = c1917;
            c1917.m3714(context);
            ColorStateList colorStateList = this.f759;
            if (colorStateList != null) {
                this.f758.m3716(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f758.setTint(typedValue.data);
            }
        }
        this.f762 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f763 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
