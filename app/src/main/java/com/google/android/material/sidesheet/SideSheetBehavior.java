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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.AbstractC3723feyxiexzfUjhhgtg;
import p000.C0063Ujhhgtgfeyxiexzf;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C1014feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C1049feyxiexzfUjhhgtg;
import p000.C1900feyxiexzfUjhhgtg;
import p000.C2450feyxiexzfUjhhgtg;
import p000.C2668feyxiexzfUjhhgtg;
import p000.C2923Ujhhgtgfeyxiexzf;
import p000.C2956feyxiexzfUjhhgtg;
import p000.C3726feyxiexzfUjhhgtg;
import p000.InterfaceC2973feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC3723feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractC3593Ujhhgtgfeyxiexzf f837Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0226Ujhhgtgfeyxiexzf f838Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ColorStateList f839Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1017feyxiexzfUjhhgtg f840Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2450feyxiexzfUjhhgtg f841Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f842Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean f843Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f844Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C1900feyxiexzfUjhhgtg f845Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f846Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final float f847Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f848Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f849Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f850Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f851Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public WeakReference f852Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public WeakReference f853Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f854Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public VelocityTracker f855Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f856Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final LinkedHashSet f857Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2668feyxiexzfUjhhgtg f858Ujhhgtgfeyxiexzf;

    public SideSheetBehavior() {
        this.f841Ujhhgtgfeyxiexzf = new C2450feyxiexzfUjhhgtg(this);
        this.f843Ujhhgtgfeyxiexzf = true;
        this.f844Ujhhgtgfeyxiexzf = 5;
        this.f847Ujhhgtgfeyxiexzf = 0.1f;
        this.f854Ujhhgtgfeyxiexzf = -1;
        this.f857Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f858Ujhhgtgfeyxiexzf = new C2668feyxiexzfUjhhgtg(this, 1);
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo780Ujhhgtgfeyxiexzf(C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg) {
        this.f852Ujhhgtgfeyxiexzf = null;
        this.f845Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo781Ujhhgtgfeyxiexzf() {
        this.f852Ujhhgtgfeyxiexzf = null;
        this.f845Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo761Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC1901feyxiexzfUjhhgtg.m3257Ujhhgtgfeyxiexzf(view) == null) || !this.f843Ujhhgtgfeyxiexzf) {
            this.f846Ujhhgtgfeyxiexzf = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f855Ujhhgtgfeyxiexzf) != null) {
            velocityTracker.recycle();
            this.f855Ujhhgtgfeyxiexzf = null;
        }
        if (this.f855Ujhhgtgfeyxiexzf == null) {
            this.f855Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f855Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f856Ujhhgtgfeyxiexzf = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f846Ujhhgtgfeyxiexzf) {
            this.f846Ujhhgtgfeyxiexzf = false;
            return false;
        }
        return (this.f846Ujhhgtgfeyxiexzf || (c1900feyxiexzfUjhhgtg = this.f845Ujhhgtgfeyxiexzf) == null || !c1900feyxiexzfUjhhgtg.m3253Ujhhgtgfeyxiexzf(motionEvent)) ? false : true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo762Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f852Ujhhgtgfeyxiexzf;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f838Ujhhgtgfeyxiexzf;
        int iMo1065Ujhhgtgfeyxiexzf = 0;
        if (weakReference == null) {
            this.f852Ujhhgtgfeyxiexzf = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationMedium2, 300);
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort3, Opcodes.FCMPG);
            AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0226Ujhhgtgfeyxiexzf != null) {
                view.setBackground(c0226Ujhhgtgfeyxiexzf);
                float elevation = this.f842Ujhhgtgfeyxiexzf;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(elevation);
            } else {
                ColorStateList colorStateList = this.f839Ujhhgtgfeyxiexzf;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i4 = this.f844Ujhhgtgfeyxiexzf == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m833Ujhhgtgfeyxiexzf();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC1901feyxiexzfUjhhgtg.m3257Ujhhgtgfeyxiexzf(view) == null) {
                AbstractC1901feyxiexzfUjhhgtg.m3266Ujhhgtgfeyxiexzf(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C3726feyxiexzfUjhhgtg) view.getLayoutParams()).f11776Ujhhgtgfeyxiexzf, i) == 3 ? 1 : 0;
        AbstractC3593Ujhhgtgfeyxiexzf abstractC3593Ujhhgtgfeyxiexzf = this.f837Ujhhgtgfeyxiexzf;
        if (abstractC3593Ujhhgtgfeyxiexzf == null || abstractC3593Ujhhgtgfeyxiexzf.mo1067Ujhhgtgfeyxiexzf() != i5) {
            C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = null;
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f840Ujhhgtgfeyxiexzf;
            if (i5 == 0) {
                this.f837Ujhhgtgfeyxiexzf = new C0063Ujhhgtgfeyxiexzf(this, i3);
                if (c1017feyxiexzfUjhhgtg != null) {
                    WeakReference weakReference2 = this.f852Ujhhgtgfeyxiexzf;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C3726feyxiexzfUjhhgtg)) {
                        c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view3.getLayoutParams();
                    }
                    if (c3726feyxiexzfUjhhgtg == null || ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin <= 0) {
                        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg.m2514Ujhhgtgfeyxiexzf();
                        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(0.0f);
                        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(0.0f);
                        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf = c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf();
                        if (c0226Ujhhgtgfeyxiexzf != null) {
                            c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f837Ujhhgtgfeyxiexzf = new C0063Ujhhgtgfeyxiexzf(this, iMo1065Ujhhgtgfeyxiexzf);
                if (c1017feyxiexzfUjhhgtg != null) {
                    WeakReference weakReference3 = this.f852Ujhhgtgfeyxiexzf;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C3726feyxiexzfUjhhgtg)) {
                        c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view2.getLayoutParams();
                    }
                    if (c3726feyxiexzfUjhhgtg == null || ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin <= 0) {
                        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf2 = c1017feyxiexzfUjhhgtg.m2514Ujhhgtgfeyxiexzf();
                        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf2.f3952Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(0.0f);
                        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf2.f3955Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(0.0f);
                        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf2 = c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf2.m2507Ujhhgtgfeyxiexzf();
                        if (c0226Ujhhgtgfeyxiexzf != null) {
                            c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf2);
                        }
                    }
                }
            }
        }
        if (this.f845Ujhhgtgfeyxiexzf == null) {
            this.f845Ujhhgtgfeyxiexzf = new C1900feyxiexzfUjhhgtg(coordinatorLayout.getContext(), coordinatorLayout, this.f858Ujhhgtgfeyxiexzf);
        }
        int iMo1065Ujhhgtgfeyxiexzf2 = this.f837Ujhhgtgfeyxiexzf.mo1065Ujhhgtgfeyxiexzf(view);
        coordinatorLayout.m71Ujhhgtgfeyxiexzf(view, i);
        this.f849Ujhhgtgfeyxiexzf = coordinatorLayout.getWidth();
        this.f850Ujhhgtgfeyxiexzf = this.f837Ujhhgtgfeyxiexzf.mo1066Ujhhgtgfeyxiexzf(coordinatorLayout);
        this.f848Ujhhgtgfeyxiexzf = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f851Ujhhgtgfeyxiexzf = marginLayoutParams != null ? this.f837Ujhhgtgfeyxiexzf.mo1059Ujhhgtgfeyxiexzf(marginLayoutParams) : 0;
        int i6 = this.f844Ujhhgtgfeyxiexzf;
        if (i6 == 1 || i6 == 2) {
            iMo1065Ujhhgtgfeyxiexzf = iMo1065Ujhhgtgfeyxiexzf2 - this.f837Ujhhgtgfeyxiexzf.mo1065Ujhhgtgfeyxiexzf(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f844Ujhhgtgfeyxiexzf);
            }
            iMo1065Ujhhgtgfeyxiexzf = this.f837Ujhhgtgfeyxiexzf.mo1062Ujhhgtgfeyxiexzf();
        }
        view.offsetLeftAndRight(iMo1065Ujhhgtgfeyxiexzf);
        if (this.f853Ujhhgtgfeyxiexzf == null && (i2 = this.f854Ujhhgtgfeyxiexzf) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f853Ujhhgtgfeyxiexzf = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f857Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo763Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final void mo766Ujhhgtgfeyxiexzf(View view, Parcelable parcelable) {
        int i = ((C1049feyxiexzfUjhhgtg) parcelable).f4100Ujhhgtgfeyxiexzf;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f844Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Parcelable mo767Ujhhgtgfeyxiexzf(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1049feyxiexzfUjhhgtg(this);
    }

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final boolean mo770Ujhhgtgfeyxiexzf(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f844Ujhhgtgfeyxiexzf == 1 && actionMasked == 0) {
            return true;
        }
        if (m831Ujhhgtgfeyxiexzf()) {
            this.f845Ujhhgtgfeyxiexzf.m3247Ujhhgtgfeyxiexzf(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f855Ujhhgtgfeyxiexzf) != null) {
            velocityTracker.recycle();
            this.f855Ujhhgtgfeyxiexzf = null;
        }
        if (this.f855Ujhhgtgfeyxiexzf == null) {
            this.f855Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f855Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        if (m831Ujhhgtgfeyxiexzf() && actionMasked == 2 && !this.f846Ujhhgtgfeyxiexzf && m831Ujhhgtgfeyxiexzf()) {
            float fAbs = Math.abs(this.f856Ujhhgtgfeyxiexzf - motionEvent.getX());
            C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = this.f845Ujhhgtgfeyxiexzf;
            if (fAbs > c1900feyxiexzfUjhhgtg.f6335Ujhhgtgfeyxiexzf) {
                c1900feyxiexzfUjhhgtg.m3239Ujhhgtgfeyxiexzf(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f846Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m830Ujhhgtgfeyxiexzf(int i) {
        View view;
        if (this.f844Ujhhgtgfeyxiexzf == i) {
            return;
        }
        this.f844Ujhhgtgfeyxiexzf = i;
        WeakReference weakReference = this.f852Ujhhgtgfeyxiexzf;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f844Ujhhgtgfeyxiexzf == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f857Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
        m833Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean m831Ujhhgtgfeyxiexzf() {
        if (this.f845Ujhhgtgfeyxiexzf != null) {
            return this.f843Ujhhgtgfeyxiexzf || this.f844Ujhhgtgfeyxiexzf == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m3252Ujhhgtgfeyxiexzf(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m830Ujhhgtgfeyxiexzf(2);
        r2.f841Ujhhgtgfeyxiexzf.m3692Ujhhgtgfeyxiexzf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m832Ujhhgtgfeyxiexzf(View view, int i, boolean z) {
        int iMo1061Ujhhgtgfeyxiexzf;
        if (i == 3) {
            iMo1061Ujhhgtgfeyxiexzf = this.f837Ujhhgtgfeyxiexzf.mo1061Ujhhgtgfeyxiexzf();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Invalid state to get outer edge offset: "));
            }
            iMo1061Ujhhgtgfeyxiexzf = this.f837Ujhhgtgfeyxiexzf.mo1062Ujhhgtgfeyxiexzf();
        }
        C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = this.f845Ujhhgtgfeyxiexzf;
        if (c1900feyxiexzfUjhhgtg != null) {
            if (!z) {
                int top = view.getTop();
                c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf = view;
                c1900feyxiexzfUjhhgtg.f6336Ujhhgtgfeyxiexzf = -1;
                boolean zM3245Ujhhgtgfeyxiexzf = c1900feyxiexzfUjhhgtg.m3245Ujhhgtgfeyxiexzf(iMo1061Ujhhgtgfeyxiexzf, top, 0, 0);
                if (!zM3245Ujhhgtgfeyxiexzf && c1900feyxiexzfUjhhgtg.f6334Ujhhgtgfeyxiexzf == 0 && c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf != null) {
                    c1900feyxiexzfUjhhgtg.f6351Ujhhgtgfeyxiexzf = null;
                }
            }
        }
        m830Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m833Ujhhgtgfeyxiexzf() {
        View view;
        WeakReference weakReference = this.f852Ujhhgtgfeyxiexzf;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 262144);
        AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
        AbstractC1901feyxiexzfUjhhgtg.m3262Ujhhgtgfeyxiexzf(view, 1048576);
        AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, 0);
        final int i = 5;
        if (this.f844Ujhhgtgfeyxiexzf != 5) {
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9259Ujhhgtgfeyxiexzf, new InterfaceC2973feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ要点脸能不能ᛱUjhhgtgᛱᛴ
                @Override // p000.InterfaceC2973feyxiexzfUjhhgtg
                /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
                public final boolean mo2012Ujhhgtgfeyxiexzf(View view2) {
                    int i2 = i;
                    int i3 = 1;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f4098Ujhhgtgfeyxiexzf;
                    WeakReference weakReference2 = sideSheetBehavior.f852Ujhhgtgfeyxiexzf;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m830Ujhhgtgfeyxiexzf(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f852Ujhhgtgfeyxiexzf.get();
                    RunnableC0892feyxiexzfUjhhgtg runnableC0892feyxiexzfUjhhgtg = new RunnableC0892feyxiexzfUjhhgtg(i2, i3, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC0892feyxiexzfUjhhgtg);
                            return true;
                        }
                    }
                    runnableC0892feyxiexzfUjhhgtg.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f844Ujhhgtgfeyxiexzf != 3) {
            AbstractC1901feyxiexzfUjhhgtg.m3263Ujhhgtgfeyxiexzf(view, C2956feyxiexzfUjhhgtg.f9257Ujhhgtgfeyxiexzf, new InterfaceC2973feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ要点脸能不能ᛱUjhhgtgᛱᛴ
                @Override // p000.InterfaceC2973feyxiexzfUjhhgtg
                /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
                public final boolean mo2012Ujhhgtgfeyxiexzf(View view2) {
                    int i3 = i2;
                    int i4 = 1;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f4098Ujhhgtgfeyxiexzf;
                    WeakReference weakReference2 = sideSheetBehavior.f852Ujhhgtgfeyxiexzf;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m830Ujhhgtgfeyxiexzf(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f852Ujhhgtgfeyxiexzf.get();
                    RunnableC0892feyxiexzfUjhhgtg runnableC0892feyxiexzfUjhhgtg = new RunnableC0892feyxiexzfUjhhgtg(i3, i4, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                        if (view3.isAttachedToWindow()) {
                            view3.post(runnableC0892feyxiexzfUjhhgtg);
                            return true;
                        }
                    }
                    runnableC0892feyxiexzfUjhhgtg.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f841Ujhhgtgfeyxiexzf = new C2450feyxiexzfUjhhgtg(this);
        this.f843Ujhhgtgfeyxiexzf = true;
        this.f844Ujhhgtgfeyxiexzf = 5;
        this.f847Ujhhgtgfeyxiexzf = 0.1f;
        this.f854Ujhhgtgfeyxiexzf = -1;
        this.f857Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f858Ujhhgtgfeyxiexzf = new C2668feyxiexzfUjhhgtg(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3145feyxiexzfUjhhgtg);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f839Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f840Ujhhgtgfeyxiexzf = C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m2507Ujhhgtgfeyxiexzf();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f854Ujhhgtgfeyxiexzf = resourceId;
            WeakReference weakReference = this.f853Ujhhgtgfeyxiexzf;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f853Ujhhgtgfeyxiexzf = null;
            WeakReference weakReference2 = this.f852Ujhhgtgfeyxiexzf;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f840Ujhhgtgfeyxiexzf;
        if (c1017feyxiexzfUjhhgtg != null) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg);
            this.f838Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context);
            ColorStateList colorStateList = this.f839Ujhhgtgfeyxiexzf;
            if (colorStateList != null) {
                this.f838Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f838Ujhhgtgfeyxiexzf.setTint(typedValue.data);
            }
        }
        this.f842Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f843Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
