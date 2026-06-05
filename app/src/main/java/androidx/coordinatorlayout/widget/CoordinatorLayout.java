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
import p000.AbstractC0772feyxiexzfUjhhgtg;
import p000.AbstractC1893Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2294Ujhhgtgfeyxiexzf;
import p000.AbstractC3723feyxiexzfUjhhgtg;
import p000.C0416Ujhhgtgfeyxiexzf;
import p000.C0431Ujhhgtgfeyxiexzf;
import p000.C1044feyxiexzfUjhhgtg;
import p000.C1440feyxiexzfUjhhgtg;
import p000.C2256feyxiexzfUjhhgtg;
import p000.C2419Ujhhgtgfeyxiexzf;
import p000.C2965Ujhhgtgfeyxiexzf;
import p000.C3726feyxiexzfUjhhgtg;
import p000.C3728Ujhhgtgfeyxiexzf;
import p000.InterfaceC0429Ujhhgtgfeyxiexzf;
import p000.InterfaceC0432Ujhhgtgfeyxiexzf;
import p000.InterfaceC3724feyxiexzfUjhhgtg;
import p000.ViewGroupOnHierarchyChangeListenerC3725Ujhhgtgfeyxiexzf;
import p000.ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0429Ujhhgtgfeyxiexzf, InterfaceC0432Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f215Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final Class[] f216Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final ThreadLocal f217Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2419Ujhhgtgfeyxiexzf f218feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C1440feyxiexzfUjhhgtg f219feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0416Ujhhgtgfeyxiexzf f221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f222Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f223Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int[] f224Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int[] f225Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f226Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f227Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int[] f228Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View f229Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public View f230Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf f231Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f232Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f233Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f234Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f235Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f236Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public C2965Ujhhgtgfeyxiexzf f237Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C0431Ujhhgtgfeyxiexzf f238Ujhhgtgfeyxiexzf;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f215Ujhhgtgfeyxiexzf = r0 != null ? r0.getName() : null;
        f218feyxiexzfUjhhgtg = new C2419Ujhhgtgfeyxiexzf(4);
        f216Ujhhgtgfeyxiexzf = new Class[]{Context.class, AttributeSet.class};
        f217Ujhhgtgfeyxiexzf = new ThreadLocal();
        f219feyxiexzfUjhhgtg = new C1440feyxiexzfUjhhgtg(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f220Ujhhgtgfeyxiexzf = new ArrayList();
        this.f221Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(3);
        this.f222Ujhhgtgfeyxiexzf = new ArrayList();
        this.f223Ujhhgtgfeyxiexzf = new ArrayList();
        this.f224Ujhhgtgfeyxiexzf = new int[2];
        this.f225Ujhhgtgfeyxiexzf = new int[2];
        this.f238Ujhhgtgfeyxiexzf = new C0431Ujhhgtgfeyxiexzf();
        int[] iArr = AbstractC0772feyxiexzfUjhhgtg.f3054Ujhhgtgfeyxiexzf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f228Ujhhgtgfeyxiexzf = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f228Ujhhgtgfeyxiexzf;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f235Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m75Ujhhgtgfeyxiexzf();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC3725Ujhhgtgfeyxiexzf(this));
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static Rect m59Ujhhgtgfeyxiexzf() {
        Rect rect = (Rect) f219feyxiexzfUjhhgtg.mo2933Ujhhgtgfeyxiexzf();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m60Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2, C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c3726feyxiexzfUjhhgtg.f11776Ujhhgtgfeyxiexzf;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c3726feyxiexzfUjhhgtg.f11777Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C3726feyxiexzfUjhhgtg m61Ujhhgtgfeyxiexzf(View view) {
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
        if (!c3726feyxiexzfUjhhgtg.f11775Ujhhgtgfeyxiexzf) {
            InterfaceC3724feyxiexzfUjhhgtg interfaceC3724feyxiexzfUjhhgtg = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC3724feyxiexzfUjhhgtg = (InterfaceC3724feyxiexzfUjhhgtg) superclass.getAnnotation(InterfaceC3724feyxiexzfUjhhgtg.class);
                if (interfaceC3724feyxiexzfUjhhgtg != null) {
                    break;
                }
            }
            if (interfaceC3724feyxiexzfUjhhgtg != null) {
                try {
                    AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = (AbstractC3723feyxiexzfUjhhgtg) interfaceC3724feyxiexzfUjhhgtg.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg2 = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                    if (abstractC3723feyxiexzfUjhhgtg2 != abstractC3723feyxiexzfUjhhgtg) {
                        if (abstractC3723feyxiexzfUjhhgtg2 != null) {
                            abstractC3723feyxiexzfUjhhgtg2.mo781Ujhhgtgfeyxiexzf();
                        }
                        c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg;
                        c3726feyxiexzfUjhhgtg.f11775Ujhhgtgfeyxiexzf = true;
                        if (abstractC3723feyxiexzfUjhhgtg != null) {
                            abstractC3723feyxiexzfUjhhgtg.mo780Ujhhgtgfeyxiexzf(c3726feyxiexzfUjhhgtg);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC3724feyxiexzfUjhhgtg.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c3726feyxiexzfUjhhgtg.f11775Ujhhgtgfeyxiexzf = true;
        }
        return c3726feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m62Ujhhgtgfeyxiexzf(View view, int i) {
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
        int i2 = c3726feyxiexzfUjhhgtg.f11782Ujhhgtgfeyxiexzf;
        if (i2 != i) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            view.offsetLeftAndRight(i - i2);
            c3726feyxiexzfUjhhgtg.f11782Ujhhgtgfeyxiexzf = i;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m63Ujhhgtgfeyxiexzf(View view, int i) {
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
        int i2 = c3726feyxiexzfUjhhgtg.f11783Ujhhgtgfeyxiexzf;
        if (i2 != i) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            view.offsetTopAndBottom(i - i2);
            c3726feyxiexzfUjhhgtg.f11783Ujhhgtgfeyxiexzf = i;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3726feyxiexzfUjhhgtg) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) view.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
        if (abstractC3723feyxiexzfUjhhgtg != null) {
            abstractC3723feyxiexzfUjhhgtg.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f235Ujhhgtgfeyxiexzf;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3726feyxiexzfUjhhgtg();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3726feyxiexzfUjhhgtg(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m73Ujhhgtgfeyxiexzf();
        return Collections.unmodifiableList(this.f220Ujhhgtgfeyxiexzf);
    }

    public final C2256feyxiexzfUjhhgtg getLastWindowInsets() {
        return this.f233Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f238Ujhhgtgfeyxiexzf;
        return c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf | c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf;
    }

    public Drawable getStatusBarBackground() {
        return this.f235Ujhhgtgfeyxiexzf;
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
        m74Ujhhgtgfeyxiexzf(false);
        if (this.f232Ujhhgtgfeyxiexzf) {
            if (this.f231Ujhhgtgfeyxiexzf == null) {
                this.f231Ujhhgtgfeyxiexzf = new ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f231Ujhhgtgfeyxiexzf);
        }
        if (this.f233Ujhhgtgfeyxiexzf == null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f227Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74Ujhhgtgfeyxiexzf(false);
        if (this.f232Ujhhgtgfeyxiexzf && this.f231Ujhhgtgfeyxiexzf != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f231Ujhhgtgfeyxiexzf);
        }
        View view = this.f230Ujhhgtgfeyxiexzf;
        if (view != null) {
            mo15Ujhhgtgfeyxiexzf(view, 0);
        }
        this.f227Ujhhgtgfeyxiexzf = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f234Ujhhgtgfeyxiexzf || this.f235Ujhhgtgfeyxiexzf == null) {
            return;
        }
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = this.f233Ujhhgtgfeyxiexzf;
        int iM3452Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg != null ? c2256feyxiexzfUjhhgtg.m3452Ujhhgtgfeyxiexzf() : 0;
        if (iM3452Ujhhgtgfeyxiexzf > 0) {
            this.f235Ujhhgtgfeyxiexzf.setBounds(0, 0, getWidth(), iM3452Ujhhgtgfeyxiexzf);
            this.f235Ujhhgtgfeyxiexzf.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m74Ujhhgtgfeyxiexzf(true);
        }
        boolean zM72Ujhhgtgfeyxiexzf = m72Ujhhgtgfeyxiexzf(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM72Ujhhgtgfeyxiexzf;
        }
        m74Ujhhgtgfeyxiexzf(true);
        return zM72Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f220Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) view.getLayoutParams()).f11774Ujhhgtgfeyxiexzf) == null || !abstractC3723feyxiexzfUjhhgtg.mo762Ujhhgtgfeyxiexzf(this, view, layoutDirection))) {
                m71Ujhhgtgfeyxiexzf(view, layoutDirection);
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
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zMo763Ujhhgtgfeyxiexzf;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m73Ujhhgtgfeyxiexzf();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) coordinatorLayout.f221Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
            int i13 = c1044feyxiexzfUjhhgtg.f4069Ujhhgtgfeyxiexzf;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) c1044feyxiexzfUjhhgtg.m2540Ujhhgtgfeyxiexzf(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.f232Ujhhgtgfeyxiexzf) {
            if (z) {
                if (coordinatorLayout.f227Ujhhgtgfeyxiexzf) {
                    if (coordinatorLayout.f231Ujhhgtgfeyxiexzf == null) {
                        coordinatorLayout.f231Ujhhgtgfeyxiexzf = new ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f231Ujhhgtgfeyxiexzf);
                }
                coordinatorLayout.f232Ujhhgtgfeyxiexzf = true;
            } else {
                if (coordinatorLayout.f227Ujhhgtgfeyxiexzf && coordinatorLayout.f231Ujhhgtgfeyxiexzf != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f231Ujhhgtgfeyxiexzf);
                }
                coordinatorLayout.f232Ujhhgtgfeyxiexzf = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
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
        boolean z4 = coordinatorLayout.f233Ujhhgtgfeyxiexzf != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f220Ujhhgtgfeyxiexzf;
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
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view2.getLayoutParams();
                int i19 = c3726feyxiexzfUjhhgtg.f11778Ujhhgtgfeyxiexzf;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM68Ujhhgtgfeyxiexzf = coordinatorLayout.m68Ujhhgtgfeyxiexzf(i19);
                    int i20 = c3726feyxiexzfUjhhgtg.f11776Ujhhgtgfeyxiexzf;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z3) && !(absoluteGravity == 5 && z3)) {
                        if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                            iMax = Math.max(0, iM68Ujhhgtgfeyxiexzf - paddingLeft);
                        }
                        if (z4 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int i21 = coordinatorLayout.f233Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf + coordinatorLayout.f233Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf;
                            int iM3451Ujhhgtgfeyxiexzf = coordinatorLayout.f233Ujhhgtgfeyxiexzf.m3451Ujhhgtgfeyxiexzf() + coordinatorLayout.f233Ujhhgtgfeyxiexzf.m3452Ujhhgtgfeyxiexzf();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i21, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM3451Ujhhgtgfeyxiexzf, mode2);
                        }
                        abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                        if (abstractC3723feyxiexzfUjhhgtg != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i22 = iMakeMeasureSpec;
                            i11 = i17;
                            int i23 = iMakeMeasureSpec2;
                            zMo763Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo763Ujhhgtgfeyxiexzf(this, view2, i22, i5, i23);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            i10 = i23;
                            if (zMo763Ujhhgtgfeyxiexzf) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
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
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM68Ujhhgtgfeyxiexzf);
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
                    abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                    if (abstractC3723feyxiexzfUjhhgtg != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i25 = iMakeMeasureSpec;
                        i11 = i17;
                        int i26 = iMakeMeasureSpec2;
                        zMo763Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo763Ujhhgtgfeyxiexzf(this, view2, i25, i5, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i10 = i26;
                        if (zMo763Ujhhgtgfeyxiexzf) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
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
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
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
                abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                if (abstractC3723feyxiexzfUjhhgtg != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i27 = iMakeMeasureSpec;
                    i11 = i17;
                    int i28 = iMakeMeasureSpec2;
                    zMo763Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo763Ujhhgtgfeyxiexzf(this, view2, i27, i5, i28);
                    view = view2;
                    iMakeMeasureSpec = i27;
                    i10 = i28;
                    if (zMo763Ujhhgtgfeyxiexzf) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
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
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin);
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
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
                if (c3726feyxiexzfUjhhgtg.m5386Ujhhgtgfeyxiexzf(0)) {
                    AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        int childCount = getChildCount();
        boolean zMo782Ujhhgtgfeyxiexzf = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
                if (c3726feyxiexzfUjhhgtg.m5386Ujhhgtgfeyxiexzf(0) && (abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf) != null) {
                    zMo782Ujhhgtgfeyxiexzf |= abstractC3723feyxiexzfUjhhgtg.mo782Ujhhgtgfeyxiexzf(view);
                }
            }
        }
        return zMo782Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo16Ujhhgtgfeyxiexzf(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo12Ujhhgtgfeyxiexzf(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo14Ujhhgtgfeyxiexzf(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C3728Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3728Ujhhgtgfeyxiexzf c3728Ujhhgtgfeyxiexzf = (C3728Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c3728Ujhhgtgfeyxiexzf.f9210Ujhhgtgfeyxiexzf);
        SparseArray sparseArray = c3728Ujhhgtgfeyxiexzf.f11791Ujhhgtgfeyxiexzf;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = m61Ujhhgtgfeyxiexzf(childAt).f11774Ujhhgtgfeyxiexzf;
            if (id != -1 && abstractC3723feyxiexzfUjhhgtg != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC3723feyxiexzfUjhhgtg.mo766Ujhhgtgfeyxiexzf(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo767Ujhhgtgfeyxiexzf;
        C3728Ujhhgtgfeyxiexzf c3728Ujhhgtgfeyxiexzf = new C3728Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) childAt.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
            if (id != -1 && abstractC3723feyxiexzfUjhhgtg != null && (parcelableMo767Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo767Ujhhgtgfeyxiexzf(childAt)) != null) {
                sparseArray.append(id, parcelableMo767Ujhhgtgfeyxiexzf);
            }
        }
        c3728Ujhhgtgfeyxiexzf.f11791Ujhhgtgfeyxiexzf = sparseArray;
        return c3728Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo13Ujhhgtgfeyxiexzf(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo15Ujhhgtgfeyxiexzf(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM72Ujhhgtgfeyxiexzf;
        boolean zMo770Ujhhgtgfeyxiexzf;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f229Ujhhgtgfeyxiexzf == null) {
            zM72Ujhhgtgfeyxiexzf = m72Ujhhgtgfeyxiexzf(motionEvent, 1);
            if (!zM72Ujhhgtgfeyxiexzf) {
                zMo770Ujhhgtgfeyxiexzf = false;
            }
            motionEventObtain = null;
            if (this.f229Ujhhgtgfeyxiexzf == null) {
                zMo770Ujhhgtgfeyxiexzf |= super.onTouchEvent(motionEvent);
            } else if (zM72Ujhhgtgfeyxiexzf) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo770Ujhhgtgfeyxiexzf;
            }
            m74Ujhhgtgfeyxiexzf(false);
            return zMo770Ujhhgtgfeyxiexzf;
        }
        zM72Ujhhgtgfeyxiexzf = false;
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) this.f229Ujhhgtgfeyxiexzf.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
        if (abstractC3723feyxiexzfUjhhgtg != null) {
            zMo770Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo770Ujhhgtgfeyxiexzf(this.f229Ujhhgtgfeyxiexzf, motionEvent);
        } else {
            zMo770Ujhhgtgfeyxiexzf = false;
        }
        motionEventObtain = null;
        if (this.f229Ujhhgtgfeyxiexzf == null) {
            zMo770Ujhhgtgfeyxiexzf |= super.onTouchEvent(motionEvent);
        } else if (zM72Ujhhgtgfeyxiexzf) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m74Ujhhgtgfeyxiexzf(false);
        return zMo770Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) view.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
        if (abstractC3723feyxiexzfUjhhgtg != null) {
            abstractC3723feyxiexzfUjhhgtg.mo774Ujhhgtgfeyxiexzf(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f226Ujhhgtgfeyxiexzf) {
            return;
        }
        m74Ujhhgtgfeyxiexzf(false);
        this.f226Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m75Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f236Ujhhgtgfeyxiexzf = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f235Ujhhgtgfeyxiexzf;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f235Ujhhgtgfeyxiexzf = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f235Ujhhgtgfeyxiexzf.setState(getDrawableState());
                }
                Drawable drawable3 = this.f235Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f235Ujhhgtgfeyxiexzf.setVisible(getVisibility() == 0, false);
                this.f235Ujhhgtgfeyxiexzf.setCallback(this);
            }
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
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
        Drawable drawable = this.f235Ujhhgtgfeyxiexzf;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f235Ujhhgtgfeyxiexzf.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f235Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0432Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo11Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
                if (c3726feyxiexzfUjhhgtg.m5386Ujhhgtgfeyxiexzf(i5) && (abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf) != null) {
                    int[] iArr2 = this.f224Ujhhgtgfeyxiexzf;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3723feyxiexzfUjhhgtg.mo765Ujhhgtgfeyxiexzf(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m70Ujhhgtgfeyxiexzf(1);
        }
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo12Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5) {
        mo11Ujhhgtgfeyxiexzf(view, i, i2, i3, i4, 0, this.f225Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo13Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
                AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                if (abstractC3723feyxiexzfUjhhgtg != null) {
                    boolean zMo768Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo768Ujhhgtgfeyxiexzf(childAt, i, i2);
                    z |= zMo768Ujhhgtgfeyxiexzf;
                    if (i2 == 0) {
                        c3726feyxiexzfUjhhgtg.f11786Ujhhgtgfeyxiexzf = zMo768Ujhhgtgfeyxiexzf;
                    } else if (i2 == 1) {
                        c3726feyxiexzfUjhhgtg.f11787Ujhhgtgfeyxiexzf = zMo768Ujhhgtgfeyxiexzf;
                    }
                } else if (i2 == 0) {
                    c3726feyxiexzfUjhhgtg.f11786Ujhhgtgfeyxiexzf = false;
                } else if (i2 == 1) {
                    c3726feyxiexzfUjhhgtg.f11787Ujhhgtgfeyxiexzf = false;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo14Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f238Ujhhgtgfeyxiexzf;
        if (i2 == 1) {
            c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf = i;
        } else {
            c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf = i;
        }
        this.f230Ujhhgtgfeyxiexzf = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C3726feyxiexzfUjhhgtg) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo15Ujhhgtgfeyxiexzf(View view, int i) {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f238Ujhhgtgfeyxiexzf;
        if (i == 1) {
            c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf = 0;
        } else {
            c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
            if (c3726feyxiexzfUjhhgtg.m5386Ujhhgtgfeyxiexzf(i)) {
                AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf;
                if (abstractC3723feyxiexzfUjhhgtg != null) {
                    abstractC3723feyxiexzfUjhhgtg.mo769Ujhhgtgfeyxiexzf(childAt, view, i);
                }
                if (i == 0) {
                    c3726feyxiexzfUjhhgtg.f11786Ujhhgtgfeyxiexzf = false;
                } else if (i == 1) {
                    c3726feyxiexzfUjhhgtg.f11787Ujhhgtgfeyxiexzf = false;
                }
            }
        }
        this.f230Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo16Ujhhgtgfeyxiexzf(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) childAt.getLayoutParams();
                if (c3726feyxiexzfUjhhgtg.m5386Ujhhgtgfeyxiexzf(i3) && (abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg.f11774Ujhhgtgfeyxiexzf) != null) {
                    int[] iArr2 = this.f224Ujhhgtgfeyxiexzf;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3723feyxiexzfUjhhgtg.mo764Ujhhgtgfeyxiexzf(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m70Ujhhgtgfeyxiexzf(1);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m64Ujhhgtgfeyxiexzf(C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m65Ujhhgtgfeyxiexzf(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m67Ujhhgtgfeyxiexzf(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList m66Ujhhgtgfeyxiexzf(View view) {
        C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = (C1044feyxiexzfUjhhgtg) this.f221Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
        int i = c1044feyxiexzfUjhhgtg.f4069Ujhhgtgfeyxiexzf;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1044feyxiexzfUjhhgtg.m2540Ujhhgtgfeyxiexzf(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1044feyxiexzfUjhhgtg.m2536Ujhhgtgfeyxiexzf(i2));
            }
        }
        ArrayList arrayList3 = this.f223Ujhhgtgfeyxiexzf;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m67Ujhhgtgfeyxiexzf(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC2294Ujhhgtgfeyxiexzf.f7523Ujhhgtgfeyxiexzf;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC2294Ujhhgtgfeyxiexzf.f7523Ujhhgtgfeyxiexzf;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC2294Ujhhgtgfeyxiexzf.m3505Ujhhgtgfeyxiexzf(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC2294Ujhhgtgfeyxiexzf.f7524Ujhhgtgfeyxiexzf;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m68Ujhhgtgfeyxiexzf(int i) {
        int[] iArr = this.f228Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m69Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        C1440feyxiexzfUjhhgtg c1440feyxiexzfUjhhgtg = f219feyxiexzfUjhhgtg;
        Rect rectM59Ujhhgtgfeyxiexzf = m59Ujhhgtgfeyxiexzf();
        m67Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf, view);
        try {
            return rectM59Ujhhgtgfeyxiexzf.contains(i, i2);
        } finally {
            rectM59Ujhhgtgfeyxiexzf.setEmpty();
            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m70Ujhhgtgfeyxiexzf(int i) {
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
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg;
        int i10;
        View view;
        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f220Ujhhgtgfeyxiexzf;
        int size = arrayList2.size();
        Rect rectM59Ujhhgtgfeyxiexzf = m59Ujhhgtgfeyxiexzf();
        Rect rectM59Ujhhgtgfeyxiexzf2 = m59Ujhhgtgfeyxiexzf();
        Rect rectM59Ujhhgtgfeyxiexzf3 = m59Ujhhgtgfeyxiexzf();
        int i11 = 0;
        while (true) {
            C1440feyxiexzfUjhhgtg c1440feyxiexzfUjhhgtg = f219feyxiexzfUjhhgtg;
            if (i11 >= size) {
                Rect rect2 = rectM59Ujhhgtgfeyxiexzf3;
                rectM59Ujhhgtgfeyxiexzf.setEmpty();
                c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf);
                rectM59Ujhhgtgfeyxiexzf2.setEmpty();
                c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf2);
                rect2.setEmpty();
                c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg2 = (C3726feyxiexzfUjhhgtg) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectM59Ujhhgtgfeyxiexzf3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (c3726feyxiexzfUjhhgtg2.f11785Ujhhgtgfeyxiexzf == ((View) arrayList2.get(i12))) {
                        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg3 = (C3726feyxiexzfUjhhgtg) view2.getLayoutParams();
                        if (c3726feyxiexzfUjhhgtg3.f11784Ujhhgtgfeyxiexzf != null) {
                            Rect rectM59Ujhhgtgfeyxiexzf4 = m59Ujhhgtgfeyxiexzf();
                            Rect rectM59Ujhhgtgfeyxiexzf5 = m59Ujhhgtgfeyxiexzf();
                            C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg4 = c3726feyxiexzfUjhhgtg2;
                            Rect rectM59Ujhhgtgfeyxiexzf6 = m59Ujhhgtgfeyxiexzf();
                            m67Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf4, c3726feyxiexzfUjhhgtg3.f11784Ujhhgtgfeyxiexzf);
                            m65Ujhhgtgfeyxiexzf(view2, rectM59Ujhhgtgfeyxiexzf5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            c3726feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m60Ujhhgtgfeyxiexzf(layoutDirection, rectM59Ujhhgtgfeyxiexzf4, rectM59Ujhhgtgfeyxiexzf6, c3726feyxiexzfUjhhgtg3, measuredWidth, measuredHeight);
                            boolean z3 = (rectM59Ujhhgtgfeyxiexzf6.left == rectM59Ujhhgtgfeyxiexzf5.left && rectM59Ujhhgtgfeyxiexzf6.top == rectM59Ujhhgtgfeyxiexzf5.top) ? false : true;
                            m64Ujhhgtgfeyxiexzf(c3726feyxiexzfUjhhgtg3, rectM59Ujhhgtgfeyxiexzf6, measuredWidth, measuredHeight);
                            int i13 = rectM59Ujhhgtgfeyxiexzf6.left - rectM59Ujhhgtgfeyxiexzf5.left;
                            int i14 = rectM59Ujhhgtgfeyxiexzf6.top - rectM59Ujhhgtgfeyxiexzf5.top;
                            if (i13 != 0) {
                                Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                Field field3 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (abstractC3723feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg3.f11774Ujhhgtgfeyxiexzf) != null) {
                                abstractC3723feyxiexzfUjhhgtg.mo773Ujhhgtgfeyxiexzf(this, view, c3726feyxiexzfUjhhgtg3.f11784Ujhhgtgfeyxiexzf);
                            }
                            rectM59Ujhhgtgfeyxiexzf4.setEmpty();
                            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf4);
                            rectM59Ujhhgtgfeyxiexzf5.setEmpty();
                            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf5);
                            rectM59Ujhhgtgfeyxiexzf6.setEmpty();
                            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf6);
                        } else {
                            c3726feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        c3726feyxiexzfUjhhgtg = c3726feyxiexzfUjhhgtg2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    c3726feyxiexzfUjhhgtg2 = c3726feyxiexzfUjhhgtg;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectM59Ujhhgtgfeyxiexzf3 = rectM59Ujhhgtgfeyxiexzf3;
                }
                ArrayList arrayList3 = arrayList2;
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg5 = c3726feyxiexzfUjhhgtg2;
                int i15 = size;
                Rect rect3 = rectM59Ujhhgtgfeyxiexzf3;
                i2 = i11;
                View view4 = view2;
                m65Ujhhgtgfeyxiexzf(view4, rectM59Ujhhgtgfeyxiexzf2, true);
                if (c3726feyxiexzfUjhhgtg5.f11780Ujhhgtgfeyxiexzf != 0 && !rectM59Ujhhgtgfeyxiexzf2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c3726feyxiexzfUjhhgtg5.f11780Ujhhgtgfeyxiexzf, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectM59Ujhhgtgfeyxiexzf.top = Math.max(rectM59Ujhhgtgfeyxiexzf.top, rectM59Ujhhgtgfeyxiexzf2.bottom);
                    } else if (i16 == 80) {
                        rectM59Ujhhgtgfeyxiexzf.bottom = Math.max(rectM59Ujhhgtgfeyxiexzf.bottom, getHeight() - rectM59Ujhhgtgfeyxiexzf2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectM59Ujhhgtgfeyxiexzf.left = Math.max(rectM59Ujhhgtgfeyxiexzf.left, rectM59Ujhhgtgfeyxiexzf2.right);
                    } else if (i17 == 5) {
                        rectM59Ujhhgtgfeyxiexzf.right = Math.max(rectM59Ujhhgtgfeyxiexzf.right, getWidth() - rectM59Ujhhgtgfeyxiexzf2.left);
                    }
                }
                if (c3726feyxiexzfUjhhgtg5.f11781Ujhhgtgfeyxiexzf != 0 && view4.getVisibility() == 0) {
                    Field field4 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg6 = (C3726feyxiexzfUjhhgtg) view4.getLayoutParams();
                        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg2 = c3726feyxiexzfUjhhgtg6.f11774Ujhhgtgfeyxiexzf;
                        Rect rectM59Ujhhgtgfeyxiexzf7 = m59Ujhhgtgfeyxiexzf();
                        Rect rectM59Ujhhgtgfeyxiexzf8 = m59Ujhhgtgfeyxiexzf();
                        rectM59Ujhhgtgfeyxiexzf8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC3723feyxiexzfUjhhgtg2 == null || !abstractC3723feyxiexzfUjhhgtg2.mo823Ujhhgtgfeyxiexzf(view4)) {
                            rectM59Ujhhgtgfeyxiexzf7.set(rectM59Ujhhgtgfeyxiexzf8);
                        } else if (!rectM59Ujhhgtgfeyxiexzf8.contains(rectM59Ujhhgtgfeyxiexzf7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM59Ujhhgtgfeyxiexzf7.toShortString() + " | Bounds:" + rectM59Ujhhgtgfeyxiexzf8.toShortString());
                        }
                        rectM59Ujhhgtgfeyxiexzf8.setEmpty();
                        c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf8);
                        if (rectM59Ujhhgtgfeyxiexzf7.isEmpty()) {
                            rectM59Ujhhgtgfeyxiexzf7.setEmpty();
                            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c3726feyxiexzfUjhhgtg6.f11781Ujhhgtgfeyxiexzf, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM59Ujhhgtgfeyxiexzf7.top - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg6).topMargin) - c3726feyxiexzfUjhhgtg6.f11783Ujhhgtgfeyxiexzf) >= (i9 = rectM59Ujhhgtgfeyxiexzf.top)) {
                                z = false;
                            } else {
                                m63Ujhhgtgfeyxiexzf(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM59Ujhhgtgfeyxiexzf7.bottom) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg6).bottomMargin) + c3726feyxiexzfUjhhgtg6.f11783Ujhhgtgfeyxiexzf) < (i7 = rectM59Ujhhgtgfeyxiexzf.bottom)) {
                                m63Ujhhgtgfeyxiexzf(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m63Ujhhgtgfeyxiexzf(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM59Ujhhgtgfeyxiexzf7.left - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg6).leftMargin) - c3726feyxiexzfUjhhgtg6.f11782Ujhhgtgfeyxiexzf) >= (i6 = rectM59Ujhhgtgfeyxiexzf.left)) {
                                z2 = false;
                            } else {
                                m62Ujhhgtgfeyxiexzf(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM59Ujhhgtgfeyxiexzf7.right) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg6).rightMargin) + c3726feyxiexzfUjhhgtg6.f11782Ujhhgtgfeyxiexzf) < (i4 = rectM59Ujhhgtgfeyxiexzf.right)) {
                                m62Ujhhgtgfeyxiexzf(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m62Ujhhgtgfeyxiexzf(view4, 0);
                            }
                            rectM59Ujhhgtgfeyxiexzf7.setEmpty();
                            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C3726feyxiexzfUjhhgtg) view4.getLayoutParams()).f11788Ujhhgtgfeyxiexzf);
                    if (rect.equals(rectM59Ujhhgtgfeyxiexzf2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((C3726feyxiexzfUjhhgtg) view4.getLayoutParams()).f11788Ujhhgtgfeyxiexzf.set(rectM59Ujhhgtgfeyxiexzf2);
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
                        AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg3 = ((C3726feyxiexzfUjhhgtg) view5.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
                        if (abstractC3723feyxiexzfUjhhgtg3 != null) {
                            abstractC3723feyxiexzfUjhhgtg3.mo772Ujhhgtgfeyxiexzf(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectM59Ujhhgtgfeyxiexzf3 = rect;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m71Ujhhgtgfeyxiexzf(View view, int i) {
        int i2;
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
        View view2 = c3726feyxiexzfUjhhgtg.f11784Ujhhgtgfeyxiexzf;
        if (view2 == null && c3726feyxiexzfUjhhgtg.f11779Ujhhgtgfeyxiexzf != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C1440feyxiexzfUjhhgtg c1440feyxiexzfUjhhgtg = f219feyxiexzfUjhhgtg;
        if (view2 != null) {
            Rect rectM59Ujhhgtgfeyxiexzf = m59Ujhhgtgfeyxiexzf();
            Rect rectM59Ujhhgtgfeyxiexzf2 = m59Ujhhgtgfeyxiexzf();
            try {
                m67Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf, view2);
                C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg2 = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m60Ujhhgtgfeyxiexzf(i, rectM59Ujhhgtgfeyxiexzf, rectM59Ujhhgtgfeyxiexzf2, c3726feyxiexzfUjhhgtg2, measuredWidth, measuredHeight);
                m64Ujhhgtgfeyxiexzf(c3726feyxiexzfUjhhgtg2, rectM59Ujhhgtgfeyxiexzf2, measuredWidth, measuredHeight);
                view.layout(rectM59Ujhhgtgfeyxiexzf2.left, rectM59Ujhhgtgfeyxiexzf2.top, rectM59Ujhhgtgfeyxiexzf2.right, rectM59Ujhhgtgfeyxiexzf2.bottom);
                return;
            } finally {
                rectM59Ujhhgtgfeyxiexzf.setEmpty();
                c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf);
                rectM59Ujhhgtgfeyxiexzf2.setEmpty();
                c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf2);
            }
        }
        int i3 = c3726feyxiexzfUjhhgtg.f11778Ujhhgtgfeyxiexzf;
        if (i3 < 0) {
            C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg3 = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
            Rect rectM59Ujhhgtgfeyxiexzf3 = m59Ujhhgtgfeyxiexzf();
            rectM59Ujhhgtgfeyxiexzf3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg3).bottomMargin);
            if (this.f233Ujhhgtgfeyxiexzf != null) {
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM59Ujhhgtgfeyxiexzf3.left = this.f233Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf + rectM59Ujhhgtgfeyxiexzf3.left;
                    rectM59Ujhhgtgfeyxiexzf3.top = this.f233Ujhhgtgfeyxiexzf.m3452Ujhhgtgfeyxiexzf() + rectM59Ujhhgtgfeyxiexzf3.top;
                    rectM59Ujhhgtgfeyxiexzf3.right -= this.f233Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf;
                    rectM59Ujhhgtgfeyxiexzf3.bottom -= this.f233Ujhhgtgfeyxiexzf.m3451Ujhhgtgfeyxiexzf();
                }
            }
            Rect rectM59Ujhhgtgfeyxiexzf4 = m59Ujhhgtgfeyxiexzf();
            int i4 = c3726feyxiexzfUjhhgtg3.f11776Ujhhgtgfeyxiexzf;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM59Ujhhgtgfeyxiexzf3, rectM59Ujhhgtgfeyxiexzf4, i);
            view.layout(rectM59Ujhhgtgfeyxiexzf4.left, rectM59Ujhhgtgfeyxiexzf4.top, rectM59Ujhhgtgfeyxiexzf4.right, rectM59Ujhhgtgfeyxiexzf4.bottom);
            rectM59Ujhhgtgfeyxiexzf3.setEmpty();
            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf3);
            rectM59Ujhhgtgfeyxiexzf4.setEmpty();
            c1440feyxiexzfUjhhgtg.mo2932Ujhhgtgfeyxiexzf(rectM59Ujhhgtgfeyxiexzf4);
            return;
        }
        C3726feyxiexzfUjhhgtg c3726feyxiexzfUjhhgtg4 = (C3726feyxiexzfUjhhgtg) view.getLayoutParams();
        int i5 = c3726feyxiexzfUjhhgtg4.f11776Ujhhgtgfeyxiexzf;
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
        int iM68Ujhhgtgfeyxiexzf = m68Ujhhgtgfeyxiexzf(i3) - measuredWidth2;
        if (i6 == 1) {
            iM68Ujhhgtgfeyxiexzf += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM68Ujhhgtgfeyxiexzf += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg4).leftMargin, Math.min(iM68Ujhhgtgfeyxiexzf, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c3726feyxiexzfUjhhgtg4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m72Ujhhgtgfeyxiexzf(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f222Ujhhgtgfeyxiexzf;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C2419Ujhhgtgfeyxiexzf c2419Ujhhgtgfeyxiexzf = f218feyxiexzfUjhhgtg;
        if (c2419Ujhhgtgfeyxiexzf != null) {
            Collections.sort(arrayList, c2419Ujhhgtgfeyxiexzf);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo761Ujhhgtgfeyxiexzf = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) view.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
            if (zMo761Ujhhgtgfeyxiexzf && actionMasked != 0) {
                if (abstractC3723feyxiexzfUjhhgtg != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC3723feyxiexzfUjhhgtg.mo761Ujhhgtgfeyxiexzf(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC3723feyxiexzfUjhhgtg.mo770Ujhhgtgfeyxiexzf(view, motionEventObtain);
                    }
                }
            } else if (!zMo761Ujhhgtgfeyxiexzf && abstractC3723feyxiexzfUjhhgtg != null) {
                if (i == 0) {
                    zMo761Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo761Ujhhgtgfeyxiexzf(this, view, motionEvent);
                } else if (i == 1) {
                    zMo761Ujhhgtgfeyxiexzf = abstractC3723feyxiexzfUjhhgtg.mo770Ujhhgtgfeyxiexzf(view, motionEvent);
                }
                if (zMo761Ujhhgtgfeyxiexzf) {
                    this.f229Ujhhgtgfeyxiexzf = view;
                }
            }
        }
        arrayList.clear();
        return zMo761Ujhhgtgfeyxiexzf;
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m73Ujhhgtgfeyxiexzf() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m73Ujhhgtgfeyxiexzf():void");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m74Ujhhgtgfeyxiexzf(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC3723feyxiexzfUjhhgtg abstractC3723feyxiexzfUjhhgtg = ((C3726feyxiexzfUjhhgtg) childAt.getLayoutParams()).f11774Ujhhgtgfeyxiexzf;
            if (abstractC3723feyxiexzfUjhhgtg != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC3723feyxiexzfUjhhgtg.mo761Ujhhgtgfeyxiexzf(this, childAt, motionEventObtain);
                } else {
                    abstractC3723feyxiexzfUjhhgtg.mo770Ujhhgtgfeyxiexzf(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C3726feyxiexzfUjhhgtg) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f229Ujhhgtgfeyxiexzf = null;
        this.f226Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m75Ujhhgtgfeyxiexzf() {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        if (!getFitsSystemWindows()) {
            AbstractC1893Ujhhgtgfeyxiexzf.m3227Ujhhgtgfeyxiexzf(this, null);
            return;
        }
        if (this.f237Ujhhgtgfeyxiexzf == null) {
            this.f237Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(11, this);
        }
        AbstractC1893Ujhhgtgfeyxiexzf.m3227Ujhhgtgfeyxiexzf(this, this.f237Ujhhgtgfeyxiexzf);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C3726feyxiexzfUjhhgtg) {
            return new C3726feyxiexzfUjhhgtg((C3726feyxiexzfUjhhgtg) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3726feyxiexzfUjhhgtg((ViewGroup.MarginLayoutParams) layoutParams) : new C3726feyxiexzfUjhhgtg(layoutParams);
    }
}
