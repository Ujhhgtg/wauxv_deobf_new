package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.Field;
import me.hd.wauxv.R;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1893Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2269Ujhhgtgfeyxiexzf;
import p000.C0431Ujhhgtgfeyxiexzf;
import p000.C0688Ujhhgtgfeyxiexzf;
import p000.C1762feyxiexzfUjhhgtg;
import p000.C2238feyxiexzfUjhhgtg;
import p000.C2239feyxiexzfUjhhgtg;
import p000.C2240feyxiexzfUjhhgtg;
import p000.C2241feyxiexzfUjhhgtg;
import p000.C2242feyxiexzfUjhhgtg;
import p000.C2243feyxiexzfUjhhgtg;
import p000.C2252Ujhhgtgfeyxiexzf;
import p000.C2256feyxiexzfUjhhgtg;
import p000.C2268Ujhhgtgfeyxiexzf;
import p000.C2994Ujhhgtgfeyxiexzf;
import p000.C2997feyxiexzfUjhhgtg;
import p000.C2998feyxiexzfUjhhgtg;
import p000.InterfaceC0429Ujhhgtgfeyxiexzf;
import p000.InterfaceC0432Ujhhgtgfeyxiexzf;
import p000.InterfaceC2996feyxiexzfUjhhgtg;
import p000.InterfaceC3094Ujhhgtgfeyxiexzf;
import p000.RunnableC2995feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0429Ujhhgtgfeyxiexzf, InterfaceC0432Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f52feyxiexzfUjhhgtg = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2256feyxiexzfUjhhgtg f53feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Rect f54feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f55Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ContentFrameLayout f56Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public ActionBarContainer f57Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC3094Ujhhgtgfeyxiexzf f58Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Drawable f59Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f60Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f61Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f62Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f63Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f64Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Rect f65Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Rect f66Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Rect f67Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Rect f68Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f69Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f70Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f71Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public C2256feyxiexzfUjhhgtg f72Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public OverScroller f73Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ViewPropertyAnimator f74Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C2994Ujhhgtgfeyxiexzf f75Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RunnableC2995feyxiexzfUjhhgtg f76Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final RunnableC2995feyxiexzfUjhhgtg f77feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0431Ujhhgtgfeyxiexzf f78feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2998feyxiexzfUjhhgtg f79feyxiexzfUjhhgtg;

    static {
        AbstractC2269Ujhhgtgfeyxiexzf c2243feyxiexzfUjhhgtg;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c2243feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf();
        } else if (i >= 35) {
            c2243feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg();
        } else if (i >= 34) {
            c2243feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg();
        } else if (i >= 31) {
            c2243feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg();
        } else if (i >= 30) {
            c2243feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg();
        } else {
            c2243feyxiexzfUjhhgtg = i >= 29 ? new C2243feyxiexzfUjhhgtg() : new C2242feyxiexzfUjhhgtg();
        }
        c2243feyxiexzfUjhhgtg.mo3413Ujhhgtgfeyxiexzf(C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(0, 1, 0, 1));
        f53feyxiexzfUjhhgtg = c2243feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf();
        f54feyxiexzfUjhhgtg = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65Ujhhgtgfeyxiexzf = new Rect();
        this.f66Ujhhgtgfeyxiexzf = new Rect();
        this.f67Ujhhgtgfeyxiexzf = new Rect();
        this.f68Ujhhgtgfeyxiexzf = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg = C2256feyxiexzfUjhhgtg.f7333Ujhhgtgfeyxiexzf;
        this.f69Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
        this.f70Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
        this.f71Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
        this.f72Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg;
        this.f75Ujhhgtgfeyxiexzf = new C2994Ujhhgtgfeyxiexzf(0, this);
        this.f76Ujhhgtgfeyxiexzf = new RunnableC2995feyxiexzfUjhhgtg(this, 0);
        this.f77feyxiexzfUjhhgtg = new RunnableC2995feyxiexzfUjhhgtg(this, 1);
        m18Ujhhgtgfeyxiexzf(context);
        this.f78feyxiexzfUjhhgtg = new C0431Ujhhgtgfeyxiexzf();
        C2998feyxiexzfUjhhgtg c2998feyxiexzfUjhhgtg = new C2998feyxiexzfUjhhgtg(context);
        c2998feyxiexzfUjhhgtg.setWillNotDraw(true);
        this.f79feyxiexzfUjhhgtg = c2998feyxiexzfUjhhgtg;
        addView(c2998feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static boolean m10Ujhhgtgfeyxiexzf(View view, Rect rect, boolean z) {
        boolean z2;
        C2997feyxiexzfUjhhgtg c2997feyxiexzfUjhhgtg = (C2997feyxiexzfUjhhgtg) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2997feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f59Ujhhgtgfeyxiexzf != null) {
            if (this.f57Ujhhgtgfeyxiexzf.getVisibility() == 0) {
                translationY = (int) (this.f57Ujhhgtgfeyxiexzf.getTranslationY() + this.f57Ujhhgtgfeyxiexzf.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f59Ujhhgtgfeyxiexzf.setBounds(0, translationY, getWidth(), this.f59Ujhhgtgfeyxiexzf.getIntrinsicHeight() + translationY);
            this.f59Ujhhgtgfeyxiexzf.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2997feyxiexzfUjhhgtg(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2997feyxiexzfUjhhgtg(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f57Ujhhgtgfeyxiexzf;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf = this.f78feyxiexzfUjhhgtg;
        return c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf | c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf;
    }

    public CharSequence getTitle() {
        m19Ujhhgtgfeyxiexzf();
        return ((C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf).f5924Ujhhgtgfeyxiexzf.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m19Ujhhgtgfeyxiexzf();
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(this, windowInsets);
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf;
        boolean zM10Ujhhgtgfeyxiexzf = m10Ujhhgtgfeyxiexzf(this.f57Ujhhgtgfeyxiexzf, new Rect(c2252Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.m3452Ujhhgtgfeyxiexzf(), c2252Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.m3451Ujhhgtgfeyxiexzf()), false);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        Rect rect = this.f65Ujhhgtgfeyxiexzf;
        AbstractC1893Ujhhgtgfeyxiexzf.m3226Ujhhgtgfeyxiexzf(this, c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf, rect);
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgMo3439Ujhhgtgfeyxiexzf = c2252Ujhhgtgfeyxiexzf.mo3439Ujhhgtgfeyxiexzf(rect.left, rect.top, rect.right, rect.bottom);
        this.f69Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgMo3439Ujhhgtgfeyxiexzf;
        boolean z = true;
        if (!this.f70Ujhhgtgfeyxiexzf.equals(c2256feyxiexzfUjhhgtgMo3439Ujhhgtgfeyxiexzf)) {
            this.f70Ujhhgtgfeyxiexzf = this.f69Ujhhgtgfeyxiexzf;
            zM10Ujhhgtgfeyxiexzf = true;
        }
        Rect rect2 = this.f66Ujhhgtgfeyxiexzf;
        if (rect2.equals(rect)) {
            z = zM10Ujhhgtgfeyxiexzf;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c2252Ujhhgtgfeyxiexzf.mo3426Ujhhgtgfeyxiexzf().f7334Ujhhgtgfeyxiexzf.mo3428Ujhhgtgfeyxiexzf().f7334Ujhhgtgfeyxiexzf.mo3427Ujhhgtgfeyxiexzf().m3453Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m18Ujhhgtgfeyxiexzf(getContext());
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m17Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2997feyxiexzfUjhhgtg c2997feyxiexzfUjhhgtg = (C2997feyxiexzfUjhhgtg) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0110  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg;
        int i3;
        AbstractC2269Ujhhgtgfeyxiexzf c2242feyxiexzfUjhhgtg;
        m19Ujhhgtgfeyxiexzf();
        measureChildWithMargins(this.f57Ujhhgtgfeyxiexzf, i, 0, i2, 0);
        C2997feyxiexzfUjhhgtg c2997feyxiexzfUjhhgtg = (C2997feyxiexzfUjhhgtg) this.f57Ujhhgtgfeyxiexzf.getLayoutParams();
        int iMax = Math.max(0, this.f57Ujhhgtgfeyxiexzf.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).leftMargin + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).rightMargin);
        int iMax2 = Math.max(0, this.f57Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).topMargin + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f57Ujhhgtgfeyxiexzf.getMeasuredState());
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean z = (getWindowSystemUiVisibility() & bc.e) != 0;
        if (z) {
            measuredHeight = this.f55Ujhhgtgfeyxiexzf;
            if (this.f61Ujhhgtgfeyxiexzf && this.f57Ujhhgtgfeyxiexzf.getTabContainer() != null) {
                measuredHeight += this.f55Ujhhgtgfeyxiexzf;
            }
        } else {
            measuredHeight = this.f57Ujhhgtgfeyxiexzf.getVisibility() != 8 ? this.f57Ujhhgtgfeyxiexzf.getMeasuredHeight() : 0;
        }
        Rect rect = this.f65Ujhhgtgfeyxiexzf;
        Rect rect2 = this.f67Ujhhgtgfeyxiexzf;
        rect2.set(rect);
        this.f71Ujhhgtgfeyxiexzf = this.f69Ujhhgtgfeyxiexzf;
        if (this.f60Ujhhgtgfeyxiexzf || z) {
            C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM1956Ujhhgtgfeyxiexzf = C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(this.f71Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf, this.f71Ujhhgtgfeyxiexzf.m3452Ujhhgtgfeyxiexzf() + measuredHeight, this.f71Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf, this.f71Ujhhgtgfeyxiexzf.m3451Ujhhgtgfeyxiexzf());
            c2256feyxiexzfUjhhgtg = this.f71Ujhhgtgfeyxiexzf;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                c2242feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtg);
            } else if (i3 >= 35) {
                c2242feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            } else if (i3 >= 34) {
                c2242feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            } else if (i3 >= 31) {
                c2242feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            } else if (i3 >= 30) {
                c2242feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            } else if (i3 >= 29) {
                c2242feyxiexzfUjhhgtg = new C2243feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            } else {
                c2242feyxiexzfUjhhgtg = new C2242feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
            }
            c2242feyxiexzfUjhhgtg.mo3413Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfM1956Ujhhgtgfeyxiexzf);
            this.f71Ujhhgtgfeyxiexzf = c2242feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf();
        } else {
            C2998feyxiexzfUjhhgtg c2998feyxiexzfUjhhgtg = this.f79feyxiexzfUjhhgtg;
            C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg2 = f53feyxiexzfUjhhgtg;
            Rect rect3 = this.f68Ujhhgtgfeyxiexzf;
            AbstractC1893Ujhhgtgfeyxiexzf.m3226Ujhhgtgfeyxiexzf(c2998feyxiexzfUjhhgtg, c2256feyxiexzfUjhhgtg2, rect3);
            if (rect3.equals(f54feyxiexzfUjhhgtg)) {
                C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfM1956Ujhhgtgfeyxiexzf2 = C0688Ujhhgtgfeyxiexzf.m1956Ujhhgtgfeyxiexzf(this.f71Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf, this.f71Ujhhgtgfeyxiexzf.m3452Ujhhgtgfeyxiexzf() + measuredHeight, this.f71Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf, this.f71Ujhhgtgfeyxiexzf.m3451Ujhhgtgfeyxiexzf());
                c2256feyxiexzfUjhhgtg = this.f71Ujhhgtgfeyxiexzf;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    c2242feyxiexzfUjhhgtg = new C2268Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtg);
                } else if (i3 >= 35) {
                    c2242feyxiexzfUjhhgtg = new C2240feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                } else if (i3 >= 34) {
                    c2242feyxiexzfUjhhgtg = new C2241feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                } else if (i3 >= 31) {
                    c2242feyxiexzfUjhhgtg = new C2238feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                } else if (i3 >= 30) {
                    c2242feyxiexzfUjhhgtg = new C2239feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                } else if (i3 >= 29) {
                    c2242feyxiexzfUjhhgtg = new C2243feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                } else {
                    c2242feyxiexzfUjhhgtg = new C2242feyxiexzfUjhhgtg(c2256feyxiexzfUjhhgtg);
                }
                c2242feyxiexzfUjhhgtg.mo3413Ujhhgtgfeyxiexzf(c0688UjhhgtgfeyxiexzfM1956Ujhhgtgfeyxiexzf2);
                this.f71Ujhhgtgfeyxiexzf = c2242feyxiexzfUjhhgtg.mo3411Ujhhgtgfeyxiexzf();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f71Ujhhgtgfeyxiexzf = this.f71Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3439Ujhhgtgfeyxiexzf(0, measuredHeight, 0, 0);
            }
        }
        m10Ujhhgtgfeyxiexzf(this.f56Ujhhgtgfeyxiexzf, rect2, true);
        if (!this.f72Ujhhgtgfeyxiexzf.equals(this.f71Ujhhgtgfeyxiexzf)) {
            C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg3 = this.f71Ujhhgtgfeyxiexzf;
            this.f72Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg3;
            AbstractC1901feyxiexzfUjhhgtg.m3255Ujhhgtgfeyxiexzf(this.f56Ujhhgtgfeyxiexzf, c2256feyxiexzfUjhhgtg3);
        }
        measureChildWithMargins(this.f56Ujhhgtgfeyxiexzf, i, 0, i2, 0);
        C2997feyxiexzfUjhhgtg c2997feyxiexzfUjhhgtg2 = (C2997feyxiexzfUjhhgtg) this.f56Ujhhgtgfeyxiexzf.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f56Ujhhgtgfeyxiexzf.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg2).leftMargin + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f56Ujhhgtgfeyxiexzf.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg2).topMargin + ((ViewGroup.MarginLayoutParams) c2997feyxiexzfUjhhgtg2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f56Ujhhgtgfeyxiexzf.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f62Ujhhgtgfeyxiexzf || !z) {
            return false;
        }
        this.f73Ujhhgtgfeyxiexzf.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f73Ujhhgtgfeyxiexzf.getFinalY() > this.f57Ujhhgtgfeyxiexzf.getHeight()) {
            m17Ujhhgtgfeyxiexzf();
            this.f77feyxiexzfUjhhgtg.run();
        } else {
            m17Ujhhgtgfeyxiexzf();
            this.f76Ujhhgtgfeyxiexzf.run();
        }
        this.f63Ujhhgtgfeyxiexzf = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f64Ujhhgtgfeyxiexzf + i2;
        this.f64Ujhhgtgfeyxiexzf = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f78feyxiexzfUjhhgtg.f2289Ujhhgtgfeyxiexzf = i;
        this.f64Ujhhgtgfeyxiexzf = getActionBarHideOffset();
        m17Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f57Ujhhgtgfeyxiexzf.getVisibility() != 0) {
            return false;
        }
        return this.f62Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f62Ujhhgtgfeyxiexzf || this.f63Ujhhgtgfeyxiexzf) {
            return;
        }
        if (this.f64Ujhhgtgfeyxiexzf <= this.f57Ujhhgtgfeyxiexzf.getHeight()) {
            m17Ujhhgtgfeyxiexzf();
            postDelayed(this.f76Ujhhgtgfeyxiexzf, 600L);
        } else {
            m17Ujhhgtgfeyxiexzf();
            postDelayed(this.f77feyxiexzfUjhhgtg, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m19Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        m17Ujhhgtgfeyxiexzf();
        this.f57Ujhhgtgfeyxiexzf.setTranslationY(-Math.max(0, Math.min(i, this.f57Ujhhgtgfeyxiexzf.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2996feyxiexzfUjhhgtg interfaceC2996feyxiexzfUjhhgtg) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f61Ujhhgtgfeyxiexzf = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f62Ujhhgtgfeyxiexzf) {
            this.f62Ujhhgtgfeyxiexzf = z;
            if (z) {
                return;
            }
            m17Ujhhgtgfeyxiexzf();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m19Ujhhgtgfeyxiexzf();
        C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = (C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf;
        c1762feyxiexzfUjhhgtg.f5927Ujhhgtgfeyxiexzf = i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c1762feyxiexzfUjhhgtg.f5924Ujhhgtgfeyxiexzf.getContext(), i) : null;
        c1762feyxiexzfUjhhgtg.m3058Ujhhgtgfeyxiexzf();
    }

    public void setLogo(int i) {
        m19Ujhhgtgfeyxiexzf();
        C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = (C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf;
        c1762feyxiexzfUjhhgtg.f5928Ujhhgtgfeyxiexzf = i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c1762feyxiexzfUjhhgtg.f5924Ujhhgtgfeyxiexzf.getContext(), i) : null;
        c1762feyxiexzfUjhhgtg.m3058Ujhhgtgfeyxiexzf();
    }

    public void setOverlayMode(boolean z) {
        this.f60Ujhhgtgfeyxiexzf = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m19Ujhhgtgfeyxiexzf();
        ((C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf).f5934Ujhhgtgfeyxiexzf = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m19Ujhhgtgfeyxiexzf();
        C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = (C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf;
        if (c1762feyxiexzfUjhhgtg.f5930Ujhhgtgfeyxiexzf) {
            return;
        }
        Toolbar toolbar = c1762feyxiexzfUjhhgtg.f5924Ujhhgtgfeyxiexzf;
        c1762feyxiexzfUjhhgtg.f5931Ujhhgtgfeyxiexzf = charSequence;
        if ((c1762feyxiexzfUjhhgtg.f5925Ujhhgtgfeyxiexzf & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1762feyxiexzfUjhhgtg.f5930Ujhhgtgfeyxiexzf) {
                AbstractC1901feyxiexzfUjhhgtg.m3266Ujhhgtgfeyxiexzf(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.InterfaceC0432Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo11Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo12Ujhhgtgfeyxiexzf(view, i, i2, i3, i4, i5);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo12Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean mo13Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo14Ujhhgtgfeyxiexzf(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo15Ujhhgtgfeyxiexzf(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m17Ujhhgtgfeyxiexzf() {
        removeCallbacks(this.f76Ujhhgtgfeyxiexzf);
        removeCallbacks(this.f77feyxiexzfUjhhgtg);
        ViewPropertyAnimator viewPropertyAnimator = this.f74Ujhhgtgfeyxiexzf;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m18Ujhhgtgfeyxiexzf(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f52feyxiexzfUjhhgtg);
        this.f55Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f59Ujhhgtgfeyxiexzf = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f73Ujhhgtgfeyxiexzf = new OverScroller(context);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m19Ujhhgtgfeyxiexzf() {
        InterfaceC3094Ujhhgtgfeyxiexzf wrapper;
        if (this.f56Ujhhgtgfeyxiexzf == null) {
            this.f56Ujhhgtgfeyxiexzf = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f57Ujhhgtgfeyxiexzf = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC3094Ujhhgtgfeyxiexzf) {
                wrapper = (InterfaceC3094Ujhhgtgfeyxiexzf) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f58Ujhhgtgfeyxiexzf = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2997feyxiexzfUjhhgtg(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m19Ujhhgtgfeyxiexzf();
        C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = (C1762feyxiexzfUjhhgtg) this.f58Ujhhgtgfeyxiexzf;
        c1762feyxiexzfUjhhgtg.f5927Ujhhgtgfeyxiexzf = drawable;
        c1762feyxiexzfUjhhgtg.m3058Ujhhgtgfeyxiexzf();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC0429Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void mo16Ujhhgtgfeyxiexzf(View view, int i, int i2, int[] iArr, int i3) {
    }
}
