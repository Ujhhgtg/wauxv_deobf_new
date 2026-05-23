package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import p000.AbstractC0861;
import p000.AbstractC2462;
import p000.AbstractC3570;
import p000.AbstractC3578;
import p000.AbstractC3583;
import p000.C0094;
import p000.C0171;
import p000.C0864;
import p000.C0866;
import p000.C2103;
import p000.C2139;
import p000.C2380;
import p000.C2705;
import p000.C3669;
import p000.InterfaceC0862;
import p000.InterfaceC2137;
import p000.InterfaceC2138;
import p000.ViewGroupOnHierarchyChangeListenerC0863;
import p000.ViewTreeObserverOnPreDrawListenerC0865;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2137, InterfaceC2138 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final String f214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final Class[] f215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final C0171 f217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final C2380 f218;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f219;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2103 f220;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f221;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f222;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int[] f223;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int[] f224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int[] f227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public View f228;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public View f229;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC0865 f230;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f231;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C3669 f232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Drawable f234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C0094 f236;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C2139 f237;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f214 = r0 != null ? r0.getName() : null;
        f217 = new C0171(1);
        f215 = new Class[]{Context.class, AttributeSet.class};
        f216 = new ThreadLocal();
        f218 = new C2380(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f219 = new ArrayList();
        this.f220 = new C2103(3);
        this.f221 = new ArrayList();
        this.f222 = new ArrayList();
        this.f223 = new int[2];
        this.f224 = new int[2];
        this.f237 = new C2139();
        int[] iArr = AbstractC2462.f7818;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f227 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f227;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f234 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m75();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0863(this));
        Field field = AbstractC3578.f11184;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static Rect m59() {
        Rect rect = (Rect) f218.mo1312();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m60(int i, Rect rect, Rect rect2, C0864 c0864, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c0864.f3279;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0864.f3280;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C0864 m61(View view) {
        C0864 c0864 = (C0864) view.getLayoutParams();
        if (!c0864.f3278) {
            InterfaceC0862 interfaceC0862 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0862 = (InterfaceC0862) superclass.getAnnotation(InterfaceC0862.class);
                if (interfaceC0862 != null) {
                    break;
                }
            }
            if (interfaceC0862 != null) {
                try {
                    AbstractC0861 abstractC0861 = (AbstractC0861) interfaceC0862.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0861 abstractC0862 = c0864.f3277;
                    if (abstractC0862 != abstractC0861) {
                        if (abstractC0862 != null) {
                            abstractC0862.mo639();
                        }
                        c0864.f3277 = abstractC0861;
                        c0864.f3278 = true;
                        if (true) {
                            abstractC0861.mo638(c0864);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0862.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0864.f3278 = true;
        }
        return c0864;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m62(View view, int i) {
        C0864 c0864 = (C0864) view.getLayoutParams();
        int i2 = c0864.f3285;
        if (i2 != i) {
            Field field = AbstractC3578.f11184;
            view.offsetLeftAndRight(i - i2);
            c0864.f3285 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static void m63(View view, int i) {
        C0864 c0864 = (C0864) view.getLayoutParams();
        int i2 = c0864.f3286;
        if (i2 != i) {
            Field field = AbstractC3578.f11184;
            view.offsetTopAndBottom(i - i2);
            c0864.f3286 = i;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0864) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0861 abstractC0861 = ((C0864) view.getLayoutParams()).f3277;
        if (abstractC0861 != null) {
            
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f234;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0864();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0864(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m73();
        return Collections.unmodifiableList(this.f219);
    }

    public final C3669 getLastWindowInsets() {
        return this.f232;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2139 c2139 = this.f237;
        return c2139.f7077 | c2139.f7076;
    }

    public Drawable getStatusBarBackground() {
        return this.f234;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m74(false);
        if (this.f231) {
            if (this.f230 == null) {
                this.f230 = new ViewTreeObserverOnPreDrawListenerC0865(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f230);
        }
        if (this.f232 == null) {
            Field field = AbstractC3578.f11184;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f226 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74(false);
        if (this.f231 && this.f230 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f230);
        }
        View view = this.f229;
        if (view != null) {
            mo15(view, 0);
        }
        this.f226 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f233 || this.f234 == null) {
            return;
        }
        C3669 c3669 = this.f232;
        int iM5301 = c3669 != null ? c3669.m5301() : 0;
        if (iM5301 > 0) {
            this.f234.setBounds(0, 0, getWidth(), iM5301);
            this.f234.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m74(true);
        }
        boolean zM72 = m72(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM72;
        }
        m74(true);
        return zM72;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0861 abstractC0861;
        Field field = AbstractC3578.f11184;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f219;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0861 = ((C0864) view.getLayoutParams()).f3277) == null || !abstractC0861.mo620(this, view, layoutDirection))) {
                m71(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0861 abstractC0861;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zMo621;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m73();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            C2705 c2705 = (C2705) coordinatorLayout.f220.f6938;
            int i13 = c2705.f8716;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) c2705.m4707(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.f231) {
            if (z) {
                if (coordinatorLayout.f226) {
                    if (coordinatorLayout.f230 == null) {
                        coordinatorLayout.f230 = new ViewTreeObserverOnPreDrawListenerC0865(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f230);
                }
                coordinatorLayout.f231 = true;
            } else {
                if (coordinatorLayout.f226 && coordinatorLayout.f230 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f230);
                }
                coordinatorLayout.f231 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        Field field = AbstractC3578.f11184;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.f232 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f219;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                C0864 c0864 = (C0864) view2.getLayoutParams();
                int i19 = c0864.f3281;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM68 = coordinatorLayout.m68(i19);
                    int i20 = c0864.f3279;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z3) && !(absoluteGravity == 5 && z3)) {
                        if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                            iMax = Math.max(0, iM68 - paddingLeft);
                        }
                        if (z4 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int i21 = coordinatorLayout.f232.f11452.mo5266().f5582 + coordinatorLayout.f232.f11452.mo5266().f5580;
                            int iM5300 = coordinatorLayout.f232.m5300() + coordinatorLayout.f232.m5301();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i21, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM5300, mode2);
                        }
                        abstractC0861 = c0864.f3277;
                        if (abstractC0861 != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i22 = iMakeMeasureSpec;
                            i11 = i17;
                            int i23 = iMakeMeasureSpec2;
                            zMo621 = abstractC0861.mo621(this, view2, i22, i5, i23);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            i10 = i23;
                            if (zMo621) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM68);
                    }
                    int i24 = size3;
                    i5 = iMax;
                    i4 = i24;
                    if (z4) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    abstractC0861 = c0864.f3277;
                    if (abstractC0861 != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i25 = iMakeMeasureSpec;
                        i11 = i17;
                        int i26 = iMakeMeasureSpec2;
                        zMo621 = abstractC0861.mo621(this, view2, i25, i5, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i10 = i26;
                        if (zMo621) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                abstractC0861 = c0864.f3277;
                if (abstractC0861 != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i27 = iMakeMeasureSpec;
                    i11 = i17;
                    int i28 = iMakeMeasureSpec2;
                    zMo621 = abstractC0861.mo621(this, view2, i27, i5, i28);
                    view = view2;
                    iMakeMeasureSpec = i27;
                    i10 = i28;
                    if (zMo621) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0864).leftMargin + ((ViewGroup.MarginLayoutParams) c0864).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0864).topMargin + ((ViewGroup.MarginLayoutParams) c0864).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i29 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0864 c0864 = (C0864) childAt.getLayoutParams();
                if (c0864.m2384(0)) {
                    AbstractC0861 abstractC0861 = c0864.f3277;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0861 abstractC0861;
        int childCount = getChildCount();
        boolean zMo640 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0864 c0864 = (C0864) childAt.getLayoutParams();
                if (c0864.m2384(0) && (abstractC0861 = c0864.f3277) != null) {
                    zMo640 |= abstractC0861.mo640(view);
                }
            }
        }
        return zMo640;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo16(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo12(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo14(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0866)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0866 c0866 = (C0866) parcelable;
        super.onRestoreInstanceState(c0866.f986);
        SparseArray sparseArray = c0866.f3294;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0861 abstractC0861 = m61(childAt).f3277;
            if (id != -1 && abstractC0861 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0861.mo624(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo625;
        C0866 c0866 = new C0866(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0861 abstractC0861 = ((C0864) childAt.getLayoutParams()).f3277;
            if (id != -1 && abstractC0861 != null && (parcelableMo625 = abstractC0861.mo625(childAt)) != null) {
                sparseArray.append(id, parcelableMo625);
            }
        }
        c0866.f3294 = sparseArray;
        return c0866;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo13(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo15(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM72;
        boolean zMo628;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f228 == null) {
            zM72 = m72(motionEvent, 1);
            if (!zM72) {
                zMo628 = false;
            }
            motionEventObtain = null;
            if (this.f228 == null) {
                zMo628 |= super.onTouchEvent(motionEvent);
            } else if (zM72) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && true) {
                return zMo628;
            }
            m74(false);
            return zMo628;
        }
        zM72 = false;
        AbstractC0861 abstractC0861 = ((C0864) this.f228.getLayoutParams()).f3277;
        if (abstractC0861 != null) {
            zMo628 = abstractC0861.mo628(this.f228, motionEvent);
        } else {
            zMo628 = false;
        }
        motionEventObtain = null;
        if (this.f228 == null) {
            zMo628 |= super.onTouchEvent(motionEvent);
        } else if (false) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (false) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m74(false);
        return zMo628;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0861 abstractC0861 = ((C0864) view.getLayoutParams()).f3277;
        if (abstractC0861 != null) {
            abstractC0861.mo632(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f225) {
            return;
        }
        m74(false);
        this.f225 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m75();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f235 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f234;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f234 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f234.setState(getDrawableState());
                }
                Drawable drawable3 = this.f234;
                Field field = AbstractC3578.f11184;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f234.setVisible(getVisibility() == 0, false);
                this.f234.setCallback(this);
            }
            Field field2 = AbstractC3578.f11184;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f234;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f234.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f234;
    }

    @Override // p000.InterfaceC2138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo11(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0861 abstractC0861;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0864 c0864 = (C0864) childAt.getLayoutParams();
                if (c0864.m2384(i5) && (abstractC0861 = c0864.f3277) != null) {
                    int[] iArr2 = this.f223;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0861.mo623(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m70(1);
        }
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo12(View view, int i, int i2, int i3, int i4, int i5) {
        mo11(view, i, i2, i3, i4, 0, this.f224);
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo13(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0864 c0864 = (C0864) childAt.getLayoutParams();
                AbstractC0861 abstractC0861 = c0864.f3277;
                if (abstractC0861 != null) {
                    boolean zMo626 = abstractC0861.mo626(childAt, i, i2);
                    z |= zMo626;
                    if (i2 == 0) {
                        c0864.f3289 = zMo626;
                    } else if (i2 == 1) {
                        c0864.f3290 = zMo626;
                    }
                } else if (i2 == 0) {
                    c0864.f3289 = false;
                } else if (i2 == 1) {
                    c0864.f3290 = false;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo14(View view, View view2, int i, int i2) {
        C2139 c2139 = this.f237;
        if (i2 == 1) {
            c2139.f7077 = i;
        } else {
            c2139.f7076 = i;
        }
        this.f229 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            
        }
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo15(View view, int i) {
        C2139 c2139 = this.f237;
        if (i == 1) {
            c2139.f7077 = 0;
        } else {
            c2139.f7076 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0864 c0864 = (C0864) childAt.getLayoutParams();
            if (c0864.m2384(i)) {
                AbstractC0861 abstractC0861 = c0864.f3277;
                if (abstractC0861 != null) {
                    abstractC0861.mo627(childAt, view, i);
                }
                if (i == 0) {
                    c0864.f3289 = false;
                } else if (i == 1) {
                    c0864.f3290 = false;
                }
            }
        }
        this.f229 = null;
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo16(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0861 abstractC0861;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0864 c0864 = (C0864) childAt.getLayoutParams();
                if (c0864.m2384(i3) && (abstractC0861 = c0864.f3277) != null) {
                    int[] iArr2 = this.f223;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0861.mo622(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m70(1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m64(C0864 c0864, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0864).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0864).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0864).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0864).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m65(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m67(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList m66(View view) {
        C2705 c2705 = (C2705) this.f220.f6938;
        int i = c2705.f8716;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c2705.m4707(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2705.m4706(i2));
            }
        }
        ArrayList arrayList3 = this.f222;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m67(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC3583.f11213;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC3583.f11213;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC3583.m5201(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC3583.f11214;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m68(int i) {
        int[] iArr = this.f227;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean m69(View view, int i, int i2) {
        C2380 c2380 = f218;
        Rect rectM59 = m59();
        m67(rectM59, view);
        try {
            return rectM59.contains(i, i2);
        } finally {
            rectM59.setEmpty();
            c2380.mo1311(rectM59);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m70(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        C0864 c0864;
        int i10;
        View view;
        AbstractC0861 abstractC0861;
        Field field = AbstractC3578.f11184;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f219;
        int size = arrayList2.size();
        Rect rectM59 = m59();
        Rect rectM510 = m59();
        Rect rectM511 = m59();
        int i11 = 0;
        while (true) {
            C2380 c2380 = f218;
            if (i11 >= size) {
                Rect rect2 = rectM511;
                rectM59.setEmpty();
                c2380.mo1311(rectM59);
                rectM510.setEmpty();
                c2380.mo1311(rectM510);
                rect2.setEmpty();
                c2380.mo1311(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            C0864 c0865 = (C0864) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectM511;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (c0865.f3288 == ((View) arrayList2.get(i12))) {
                        C0864 c0866 = (C0864) view2.getLayoutParams();
                        if (c0866.f3287 != null) {
                            Rect rectM512 = m59();
                            Rect rectM513 = m59();
                            C0864 c0867 = c0865;
                            Rect rectM514 = m59();
                            m67(rectM512, c0866.f3287);
                            m65(view2, rectM513, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            c0864 = c0867;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m60(layoutDirection, rectM512, rectM514, c0866, measuredWidth, measuredHeight);
                            boolean z3 = (rectM514.left == rectM513.left && rectM514.top == rectM513.top) ? false : true;
                            m64(c0866, rectM514, measuredWidth, measuredHeight);
                            int i13 = rectM514.left - rectM513.left;
                            int i14 = rectM514.top - rectM513.top;
                            if (i13 != 0) {
                                Field field2 = AbstractC3578.f11184;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                Field field3 = AbstractC3578.f11184;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (abstractC0861 = c0866.f3277) != null) {
                                abstractC0861.mo631(this, view, c0866.f3287);
                            }
                            rectM512.setEmpty();
                            c2380.mo1311(rectM512);
                            rectM513.setEmpty();
                            c2380.mo1311(rectM513);
                            rectM514.setEmpty();
                            c2380.mo1311(rectM514);
                        } else {
                            c0864 = c0865;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        c0864 = c0865;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    c0865 = c0864;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectM511 = rectM511;
                }
                ArrayList arrayList3 = arrayList2;
                C0864 c0868 = c0865;
                int i15 = size;
                Rect rect3 = rectM511;
                i2 = i11;
                View view4 = view2;
                m65(view4, rectM510, true);
                if (c0868.f3283 != 0 && !rectM510.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0868.f3283, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectM59.top = Math.max(rectM59.top, rectM510.bottom);
                    } else if (i16 == 80) {
                        rectM59.bottom = Math.max(rectM59.bottom, getHeight() - rectM510.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectM59.left = Math.max(rectM59.left, rectM510.right);
                    } else if (i17 == 5) {
                        rectM59.right = Math.max(rectM59.right, getWidth() - rectM510.left);
                    }
                }
                if (c0868.f3284 != 0 && view4.getVisibility() == 0) {
                    Field field4 = AbstractC3578.f11184;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C0864 c0869 = (C0864) view4.getLayoutParams();
                        AbstractC0861 abstractC0862 = c0869.f3277;
                        Rect rectM515 = m59();
                        Rect rectM516 = m59();
                        rectM516.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC0862 == null || !abstractC0862.mo680(view4)) {
                            rectM515.set(rectM516);
                        } else if (!rectM516.contains(rectM515)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM515.toShortString() + " | Bounds:" + rectM516.toShortString());
                        }
                        rectM516.setEmpty();
                        c2380.mo1311(rectM516);
                        if (rectM515.isEmpty()) {
                            rectM515.setEmpty();
                            c2380.mo1311(rectM515);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0869.f3284, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM515.top - ((ViewGroup.MarginLayoutParams) c0869).topMargin) - c0869.f3286) >= (i9 = rectM59.top)) {
                                z = false;
                            } else {
                                m63(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM515.bottom) - ((ViewGroup.MarginLayoutParams) c0869).bottomMargin) + c0869.f3286) < (i7 = rectM59.bottom)) {
                                m63(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m63(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM515.left - ((ViewGroup.MarginLayoutParams) c0869).leftMargin) - c0869.f3285) >= (i6 = rectM59.left)) {
                                z2 = false;
                            } else {
                                m62(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM515.right) - ((ViewGroup.MarginLayoutParams) c0869).rightMargin) + c0869.f3285) < (i4 = rectM59.right)) {
                                m62(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m62(view4, 0);
                            }
                            rectM515.setEmpty();
                            c2380.mo1311(rectM515);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C0864) view4.getLayoutParams()).f3291);
                    if (rect.equals(rectM510)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((C0864) view4.getLayoutParams()).f3291.set(rectM510);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        AbstractC0861 abstractC0863 = ((C0864) view5.getLayoutParams()).f3277;
                        if (abstractC0863 != null) {
                            abstractC0863.mo630(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectM511 = rect;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m71(View view, int i) {
        int i2;
        C0864 c0864 = (C0864) view.getLayoutParams();
        View view2 = c0864.f3287;
        if (view2 == null && c0864.f3282 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C2380 c2380 = f218;
        if (view2 != null) {
            Rect rectM59 = m59();
            Rect rectM510 = m59();
            try {
                m67(rectM59, view2);
                C0864 c0865 = (C0864) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m60(i, rectM59, rectM510, c0865, measuredWidth, measuredHeight);
                m64(c0865, rectM510, measuredWidth, measuredHeight);
                view.layout(rectM510.left, rectM510.top, rectM510.right, rectM510.bottom);
                return;
            } finally {
                rectM59.setEmpty();
                c2380.mo1311(rectM59);
                rectM510.setEmpty();
                c2380.mo1311(rectM510);
            }
        }
        int i3 = c0864.f3281;
        if (i3 < 0) {
            C0864 c0866 = (C0864) view.getLayoutParams();
            Rect rectM511 = m59();
            rectM511.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0866).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0866).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0866).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0866).bottomMargin);
            if (this.f232 != null) {
                Field field = AbstractC3578.f11184;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM511.left = this.f232.f11452.mo5266().f5580 + rectM511.left;
                    rectM511.top = this.f232.m5301() + rectM511.top;
                    rectM511.right -= this.f232.f11452.mo5266().f5582;
                    rectM511.bottom -= this.f232.m5300();
                }
            }
            Rect rectM512 = m59();
            int i4 = c0866.f3279;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM511, rectM512, i);
            view.layout(rectM512.left, rectM512.top, rectM512.right, rectM512.bottom);
            rectM511.setEmpty();
            c2380.mo1311(rectM511);
            rectM512.setEmpty();
            c2380.mo1311(rectM512);
            return;
        }
        C0864 c0867 = (C0864) view.getLayoutParams();
        int i5 = c0867.f3279;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM68 = m68(i3) - measuredWidth2;
        if (i6 == 1) {
            iM68 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM68 += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0867).leftMargin, Math.min(iM68, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0867).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0867).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0867).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean m72(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f221;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0171 c0171 = f217;
        if (c0171 != null) {
            Collections.sort(arrayList, c0171);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo619 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0861 abstractC0861 = ((C0864) view.getLayoutParams()).f3277;
            if (zMo619 && actionMasked != 0) {
                if (abstractC0861 != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0861.mo619(this, view, motionEventObtain);
                    } else if (true) {
                        abstractC0861.mo628(view, motionEventObtain);
                    }
                }
            } else if (!zMo619 && abstractC0861 != null) {
                if (i == 0) {
                    zMo619 = abstractC0861.mo619(this, view, motionEvent);
                } else if (i == 1) {
                    zMo619 = abstractC0861.mo628(view, motionEvent);
                }
                if (zMo619) {
                    this.f228 = view;
                }
            }
        }
        arrayList.clear();
        return zMo619;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m73() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m73():void");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m74(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0861 abstractC0861 = ((C0864) childAt.getLayoutParams()).f3277;
            if (abstractC0861 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0861.mo619(this, childAt, motionEventObtain);
                } else {
                    abstractC0861.mo628(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            
        }
        this.f228 = null;
        this.f225 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m75() {
        Field field = AbstractC3578.f11184;
        if (!getFitsSystemWindows()) {
            AbstractC3570.m5151(this, null);
            return;
        }
        if (this.f236 == null) {
            this.f236 = new C0094(10, this);
        }
        AbstractC3570.m5151(this, this.f236);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0864) {
            return new C0864((C0864) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0864((ViewGroup.MarginLayoutParams) layoutParams) : new C0864(layoutParams);
    }
}
