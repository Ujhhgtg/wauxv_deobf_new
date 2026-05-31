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
import p000.AbstractC0860;
import p000.AbstractC1095;
import p000.AbstractC1471;
import p000.AbstractC2521;
import p000.AbstractC3638;
import p000.AbstractC3744;
import p000.C0060;
import p000.C0093;
import p000.C0337;
import p000.C0428;
import p000.C0863;
import p000.C1787;
import p000.C1948;
import p000.C2737;
import p000.C2738;
import p000.C2765;
import p000.C3639;
import p000.InterfaceC0110;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0860 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1787 f823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1948 f824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ColorStateList f825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2738 f826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0337 f827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C3639 f831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final float f833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public WeakReference f838;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public WeakReference f839;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public VelocityTracker f841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final LinkedHashSet f843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C0428 f844;

    public SideSheetBehavior() {
        this.f827 = new C0337(this);
        this.f829 = true;
        this.f830 = 5;
        this.f833 = 0.1f;
        this.f840 = -1;
        this.f843 = new LinkedHashSet();
        this.f844 = new C0428(this, 1);
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo781(C0863 c0863) {
        this.f838 = null;
        this.f831 = null;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo782() {
        this.f838 = null;
        this.f831 = null;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo762(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3639 c3639;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC3638.m5175(view) == null) || !this.f829) {
            this.f832 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f841) != null) {
            velocityTracker.recycle();
            this.f841 = null;
        }
        if (this.f841 == null) {
            this.f841 = VelocityTracker.obtain();
        }
        this.f841.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f842 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f832) {
            this.f832 = false;
            return false;
        }
        return (this.f832 || (c3639 = this.f831) == null || !c3639.m5201(motionEvent)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0214  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo763(CoordinatorLayout coordinatorLayout, View view, int i) {
        C0863 c0863;
        C2738 c2738;
        WeakReference weakReference;
        C2738 c2738M4722;
        View view2;
        WeakReference weakReference2;
        C2738 c2738M4723;
        View view3;
        int left;
        int i2;
        int i3;
        View viewFindViewById;
        int i4;
        Field field = AbstractC3638.f11333;
        int i5 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference3 = this.f838;
        C1948 c1948 = this.f824;
        int iM3681 = 0;
        if (weakReference3 == null) {
            this.f838 = new WeakReference(view);
            Context context = view.getContext();
            AbstractC3744.m5342(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC3744.m5341(context, R.attr.motionDurationMedium2, 300);
            AbstractC3744.m5341(context, R.attr.motionDurationShort3, Opcodes.FCMPG);
            AbstractC3744.m5341(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c1948 != null) {
                view.setBackground(c1948);
                float elevation = this.f828;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1948.m3913(elevation);
            } else {
                ColorStateList colorStateList = this.f825;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i6 = this.f830 == 5 ? 4 : 0;
            if (view.getVisibility() != i6) {
                view.setVisibility(i6);
            }
            m834();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC3638.m5175(view) == null) {
                AbstractC3638.m5184(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i7 = Gravity.getAbsoluteGravity(((C0863) view.getLayoutParams()).f3286, i) == 3 ? 1 : 0;
        C1787 c1787 = this.f823;
        if (c1787 != null) {
            switch (c1787.f5944) {
                case 0:
                    i4 = 1;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != i7) {
                c0863 = null;
                c2738 = this.f826;
                if (i7 == 0) {
                    this.f823 = new C1787(this, i5);
                    if (c2738 != null) {
                        weakReference2 = this.f838;
                        if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0863)) {
                            c0863 = (C0863) view3.getLayoutParams();
                        }
                        if (c0863 != null || ((ViewGroup.MarginLayoutParams) c0863).rightMargin <= 0) {
                            C2737 c2737M4728 = c2738.m4728();
                            c2737M4728.f8791 = new C0060(0.0f);
                            c2737M4728.f8792 = new C0060(0.0f);
                            c2738M4723 = c2737M4728.m4722();
                            if (c1948 != null) {
                                c1948.setShapeAppearanceModel(c2738M4723);
                            }
                        }
                    }
                } else {
                    if (i7 == 1) {
                        throw new IllegalArgumentException(AbstractC1095.m2795(i7, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    }
                    this.f823 = new C1787(this, iM3681);
                    if (c2738 != null) {
                        weakReference = this.f838;
                        if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof C0863)) {
                            c0863 = (C0863) view2.getLayoutParams();
                        }
                        if (c0863 != null || ((ViewGroup.MarginLayoutParams) c0863).leftMargin <= 0) {
                            C2737 c2737M4729 = c2738.m4728();
                            c2737M4729.f8790 = new C0060(0.0f);
                            c2737M4729.f8793 = new C0060(0.0f);
                            c2738M4722 = c2737M4729.m4722();
                            if (c1948 != null) {
                                c1948.setShapeAppearanceModel(c2738M4722);
                            }
                        }
                    }
                }
            }
        } else {
            c0863 = null;
            c2738 = this.f826;
            if (i7 == 0) {
                this.f823 = new C1787(this, i5);
                if (c2738 != null) {
                    weakReference2 = this.f838;
                    if (weakReference2 != null) {
                        c0863 = (C0863) view3.getLayoutParams();
                    }
                    if (c0863 != null) {
                        C2737 c2737M47210 = c2738.m4728();
                        c2737M47210.f8791 = new C0060(0.0f);
                        c2737M47210.f8792 = new C0060(0.0f);
                        c2738M4723 = c2737M47210.m4722();
                        if (c1948 != null) {
                            c1948.setShapeAppearanceModel(c2738M4723);
                        }
                    } else {
                        C2737 c2737M47211 = c2738.m4728();
                        c2737M47211.f8791 = new C0060(0.0f);
                        c2737M47211.f8792 = new C0060(0.0f);
                        c2738M4723 = c2737M47211.m4722();
                        if (c1948 != null) {
                            c1948.setShapeAppearanceModel(c2738M4723);
                        }
                    }
                }
            } else {
                if (i7 == 1) {
                    throw new IllegalArgumentException(AbstractC1095.m2795(i7, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f823 = new C1787(this, iM3681);
                if (c2738 != null) {
                    weakReference = this.f838;
                    if (weakReference != null) {
                        c0863 = (C0863) view2.getLayoutParams();
                    }
                    if (c0863 != null) {
                        C2737 c2737M47212 = c2738.m4728();
                        c2737M47212.f8790 = new C0060(0.0f);
                        c2737M47212.f8793 = new C0060(0.0f);
                        c2738M4722 = c2737M47212.m4722();
                        if (c1948 != null) {
                            c1948.setShapeAppearanceModel(c2738M4722);
                        }
                    } else {
                        C2737 c2737M47213 = c2738.m4728();
                        c2737M47213.f8790 = new C0060(0.0f);
                        c2737M47213.f8793 = new C0060(0.0f);
                        c2738M4722 = c2737M47213.m4722();
                        if (c1948 != null) {
                            c1948.setShapeAppearanceModel(c2738M4722);
                        }
                    }
                }
            }
        }
        if (this.f831 == null) {
            this.f831 = new C3639(coordinatorLayout.getContext(), coordinatorLayout, this.f844);
        }
        int iM3682 = this.f823.m3681(view);
        coordinatorLayout.m71(view, i);
        this.f835 = coordinatorLayout.getWidth();
        switch (this.f823.f5944) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.f836 = left;
        this.f834 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f823.f5944) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.f837 = i2;
        int i8 = this.f830;
        if (i8 == 1 || i8 == 2) {
            iM3681 = iM3682 - this.f823.m3681(view);
        } else if (i8 != 3) {
            if (i8 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f830);
            }
            iM3681 = this.f823.m3680();
        }
        view.offsetLeftAndRight(iM3681);
        if (this.f839 == null && (i3 = this.f840) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f839 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f843.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo764(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo767(View view, Parcelable parcelable) {
        int i = ((C2765) parcelable).f8884;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f830 = i;
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Parcelable mo768(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2765(this);
    }

    @Override // p000.AbstractC0860
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo771(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f830 == 1 && actionMasked == 0) {
            return true;
        }
        if (m832()) {
            this.f831.m5195(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f841) != null) {
            velocityTracker.recycle();
            this.f841 = null;
        }
        if (this.f841 == null) {
            this.f841 = VelocityTracker.obtain();
        }
        this.f841.addMovement(motionEvent);
        if (m832() && actionMasked == 2 && !this.f832 && m832()) {
            float fAbs = Math.abs(this.f842 - motionEvent.getX());
            C3639 c3639 = this.f831;
            if (fAbs > c3639.f11340) {
                c3639.m5187(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f832;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m831(int i) {
        View view;
        if (this.f830 == i) {
            return;
        }
        this.f830 = i;
        WeakReference weakReference = this.f838;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f830 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f843.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
        m834();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean m832() {
        if (this.f831 != null) {
            return this.f829 || this.f830 == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m5200(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m831(2);
        r2.f827.m1579(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m833(View view, int i, boolean z) {
        int iM3679;
        if (i == 3) {
            iM3679 = this.f823.m3679();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC1095.m2794(i, "Invalid state to get outer edge offset: "));
            }
            iM3679 = this.f823.m3680();
        }
        C3639 c3639 = this.f831;
        if (c3639 != null) {
            if (!z) {
                int top = view.getTop();
                c3639.f11356 = view;
                c3639.f11341 = -1;
                boolean zM5193 = c3639.m5193(iM3679, top, 0, 0);
                if (!zM5193 && c3639.f11339 == 0 && c3639.f11356 != null) {
                    c3639.f11356 = null;
                }
            }
        }
        m831(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m834() {
        View view;
        WeakReference weakReference = this.f838;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3638.m5180(view, 262144);
        AbstractC3638.m5178(view, 0);
        AbstractC3638.m5180(view, 1048576);
        AbstractC3638.m5178(view, 0);
        final int i = 5;
        if (this.f830 != 5) {
            AbstractC3638.m5181(view, C0093.f1100, new InterfaceC0110() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᤝᛸᲁ
                @Override // p000.InterfaceC0110
                /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
                public final boolean mo1270(View view2) {
                    int i2 = i;
                    int i3 = 1;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC2844.m4786(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f8882;
                    WeakReference weakReference2 = sideSheetBehavior.f838;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m831(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f838.get();
                    RunnableC2637 runnableC2637 = new RunnableC2637(i2, i3, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC3638.f11333;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC2637);
                            return true;
                        }
                    }
                    runnableC2637.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f830 != 3) {
            AbstractC3638.m5181(view, C0093.f1098, new InterfaceC0110() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᤝᛸᲁ
                @Override // p000.InterfaceC0110
                /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
                public final boolean mo1270(View view2) {
                    int i3 = i2;
                    int i4 = 1;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(AbstractC2844.m4786(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f8882;
                    WeakReference weakReference2 = sideSheetBehavior.f838;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m831(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f838.get();
                    RunnableC2637 runnableC2637 = new RunnableC2637(i3, i4, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC3638.f11333;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC2637);
                            return true;
                        }
                    }
                    runnableC2637.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f827 = new C0337(this);
        this.f829 = true;
        this.f830 = 5;
        this.f833 = 0.1f;
        this.f840 = -1;
        this.f843 = new LinkedHashSet();
        this.f844 = new C0428(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f8014);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f825 = AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f826 = C2738.m4725(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m4722();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f840 = resourceId;
            WeakReference weakReference = this.f839;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f839 = null;
            WeakReference weakReference2 = this.f838;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = AbstractC3638.f11333;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C2738 c2738 = this.f826;
        if (c2738 != null) {
            C1948 c1948 = new C1948(c2738);
            this.f824 = c1948;
            c1948.m3912(context);
            ColorStateList colorStateList = this.f825;
            if (colorStateList != null) {
                this.f824.m3914(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f824.setTint(typedValue.data);
            }
        }
        this.f828 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f829 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
