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
import p000.AbstractC3471;
import p000.AbstractC3570;
import p000.AbstractC3578;
import p000.AbstractC3655;
import p000.C0123;
import p000.C0126;
import p000.C0127;
import p000.C1646;
import p000.C2139;
import p000.C3418;
import p000.C3648;
import p000.C3649;
import p000.C3650;
import p000.C3651;
import p000.C3652;
import p000.C3653;
import p000.C3654;
import p000.C3665;
import p000.C3669;
import p000.InterfaceC0125;
import p000.InterfaceC0975;
import p000.InterfaceC2137;
import p000.InterfaceC2138;
import p000.RunnableC0124;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2137, InterfaceC2138 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f51 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final C3669 f52;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final Rect f53;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f54;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ContentFrameLayout f55;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ActionBarContainer f56;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InterfaceC0975 f57;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Drawable f58;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f59;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f60;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f61;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f62;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f63;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Rect f64;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Rect f65;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Rect f66;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Rect f67;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C3669 f68;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C3669 f69;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public C3669 f70;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C3669 f71;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public OverScroller f72;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public ViewPropertyAnimator f73;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final C0123 f74;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final RunnableC0124 f75;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final RunnableC0124 f76;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C2139 f77;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C0127 f78;

    static {
        AbstractC3655 c3649;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c3649 = new C3654();
        } else if (i >= 35) {
            c3649 = new C3653();
        } else if (i >= 34) {
            c3649 = new C3652();
        } else if (i >= 31) {
            c3649 = new C3651();
        } else if (i >= 30) {
            c3649 = new C3650();
        } else {
            c3649 = i >= 29 ? new C3649() : new C3648();
        }
        c3649.mo5247(C1646.m3375(0, 1, 0, 1));
        f52 = c3649.mo5245();
        f53 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64 = new Rect();
        this.f65 = new Rect();
        this.f66 = new Rect();
        this.f67 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C3669 c3669 = C3669.f11451;
        this.f68 = c3669;
        this.f69 = c3669;
        this.f70 = c3669;
        this.f71 = c3669;
        this.f74 = new C0123(0, this);
        this.f75 = new RunnableC0124(this, 0);
        this.f76 = new RunnableC0124(this, 1);
        m18(context);
        this.f77 = new C2139();
        C0127 c0127 = new C0127(context);
        c0127.setWillNotDraw(true);
        this.f78 = c0127;
        addView(c0127);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m10(View view, Rect rect, boolean z) {
        boolean z2;
        C0126 c0126 = (C0126) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0126).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0126).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0126).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0126).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0126).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0126).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0126).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0126).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0126;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f58 != null) {
            if (this.f56.getVisibility() == 0) {
                translationY = (int) (this.f56.getTranslationY() + this.f56.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f58.setBounds(0, translationY, getWidth(), this.f58.getIntrinsicHeight() + translationY);
            this.f58.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0126(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0126(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f56;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2139 c2139 = this.f77;
        return c2139.f7077 | c2139.f7076;
    }

    public CharSequence getTitle() {
        m19();
        return ((C3418) this.f57).f10763.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m19();
        C3669 c3669M5299 = C3669.m5299(this, windowInsets);
        C3665 c3665 = c3669M5299.f11452;
        boolean zM10 = m10(this.f56, new Rect(c3665.mo5266().f5580, c3669M5299.m5301(), c3665.mo5266().f5582, c3669M5299.m5300()), false);
        Field field = AbstractC3578.f11184;
        Rect rect = this.f64;
        AbstractC3570.m5150(this, c3669M5299, rect);
        C3669 c3669Mo5269 = c3665.mo5269(rect.left, rect.top, rect.right, rect.bottom);
        this.f68 = c3669Mo5269;
        boolean z = true;
        if (!this.f69.equals(c3669Mo5269)) {
            this.f69 = this.f68;
            zM10 = true;
        }
        Rect rect2 = this.f65;
        if (rect2.equals(rect)) {
            z = zM10;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c3665.mo5287().f11452.mo5283().f11452.mo5282().m5302();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m18(getContext());
        Field field = AbstractC3578.f11184;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m17();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0126 c0126 = (C0126) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0126).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0126).topMargin + paddingTop;
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
        C3669 c3669;
        int i3;
        AbstractC3655 c3648;
        m19();
        measureChildWithMargins(this.f56, i, 0, i2, 0);
        C0126 c0126 = (C0126) this.f56.getLayoutParams();
        int iMax = Math.max(0, this.f56.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0126).leftMargin + ((ViewGroup.MarginLayoutParams) c0126).rightMargin);
        int iMax2 = Math.max(0, this.f56.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0126).topMargin + ((ViewGroup.MarginLayoutParams) c0126).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f56.getMeasuredState());
        Field field = AbstractC3578.f11184;
        boolean z = (getWindowSystemUiVisibility() & bc.e) != 0;
        if (z) {
            measuredHeight = this.f54;
            if (this.f60 && this.f56.getTabContainer() != null) {
                measuredHeight += this.f54;
            }
        } else {
            measuredHeight = this.f56.getVisibility() != 8 ? this.f56.getMeasuredHeight() : 0;
        }
        Rect rect = this.f64;
        Rect rect2 = this.f66;
        rect2.set(rect);
        this.f70 = this.f68;
        if (this.f59 || z) {
            C1646 c1646M3375 = C1646.m3375(this.f70.f11452.mo5266().f5580, this.f70.m5301() + measuredHeight, this.f70.f11452.mo5266().f5582, this.f70.m5300());
            c3669 = this.f70;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                c3648 = new C3654(c3669);
            } else if (i3 >= 35) {
                c3648 = new C3653(c3669);
            } else if (i3 >= 34) {
                c3648 = new C3652(c3669);
            } else if (i3 >= 31) {
                c3648 = new C3651(c3669);
            } else if (i3 >= 30) {
                c3648 = new C3650(c3669);
            } else if (i3 >= 29) {
                c3648 = new C3649(c3669);
            } else {
                c3648 = new C3648(c3669);
            }
            c3648.mo5247(c1646M3375);
            this.f70 = c3648.mo5245();
        } else {
            C0127 c0127 = this.f78;
            C3669 c36610 = f52;
            Rect rect3 = this.f67;
            AbstractC3570.m5150(c0127, c36610, rect3);
            if (rect3.equals(f53)) {
                C1646 c1646M3376 = C1646.m3375(this.f70.f11452.mo5266().f5580, this.f70.m5301() + measuredHeight, this.f70.f11452.mo5266().f5582, this.f70.m5300());
                c3669 = this.f70;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    c3648 = new C3654(c3669);
                } else if (i3 >= 35) {
                    c3648 = new C3653(c3669);
                } else if (i3 >= 34) {
                    c3648 = new C3652(c3669);
                } else if (i3 >= 31) {
                    c3648 = new C3651(c3669);
                } else if (i3 >= 30) {
                    c3648 = new C3650(c3669);
                } else if (i3 >= 29) {
                    c3648 = new C3649(c3669);
                } else {
                    c3648 = new C3648(c3669);
                }
                c3648.mo5247(c1646M3376);
                this.f70 = c3648.mo5245();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f70 = this.f70.f11452.mo5269(0, measuredHeight, 0, 0);
            }
        }
        m10(this.f55, rect2, true);
        if (!this.f71.equals(this.f70)) {
            C3669 c36611 = this.f70;
            this.f71 = c36611;
            AbstractC3578.m5167(this.f55, c36611);
        }
        measureChildWithMargins(this.f55, i, 0, i2, 0);
        C0126 c0128 = (C0126) this.f55.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f55.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0128).leftMargin + ((ViewGroup.MarginLayoutParams) c0128).rightMargin);
        int iMax4 = Math.max(iMax2, this.f55.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0128).topMargin + ((ViewGroup.MarginLayoutParams) c0128).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f55.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f61 || !z) {
            return false;
        }
        this.f72.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f72.getFinalY() > this.f56.getHeight()) {
            m17();
            this.f76.run();
        } else {
            m17();
            this.f75.run();
        }
        this.f62 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f63 + i2;
        this.f63 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f77.f7076 = i;
        this.f63 = getActionBarHideOffset();
        m17();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f56.getVisibility() != 0) {
            return false;
        }
        return this.f61;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f61 || this.f62) {
            return;
        }
        if (this.f63 <= this.f56.getHeight()) {
            m17();
            postDelayed(this.f75, 600L);
        } else {
            m17();
            postDelayed(this.f76, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m19();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        m17();
        this.f56.setTranslationY(-Math.max(0, Math.min(i, this.f56.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0125 interfaceC0125) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f60 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f61) {
            this.f61 = z;
            if (z) {
                return;
            }
            m17();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m19();
        C3418 c3418 = (C3418) this.f57;
        c3418.f10766 = i != 0 ? AbstractC3471.m5076(c3418.f10763.getContext(), i) : null;
        c3418.m4934();
    }

    public void setLogo(int i) {
        m19();
        C3418 c3418 = (C3418) this.f57;
        c3418.f10767 = i != 0 ? AbstractC3471.m5076(c3418.f10763.getContext(), i) : null;
        c3418.m4934();
    }

    public void setOverlayMode(boolean z) {
        this.f59 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m19();
        ((C3418) this.f57).f10773 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m19();
        C3418 c3418 = (C3418) this.f57;
        if (c3418.f10769) {
            return;
        }
        Toolbar toolbar = c3418.f10763;
        c3418.f10770 = charSequence;
        if ((c3418.f10764 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c3418.f10769) {
                AbstractC3578.m5178(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.InterfaceC2138
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo11(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo12(view, i, i2, i3, i4, i5);
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo12(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo13(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo14(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo15(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m17() {
        removeCallbacks(this.f75);
        removeCallbacks(this.f76);
        ViewPropertyAnimator viewPropertyAnimator = this.f73;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m18(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f51);
        this.f54 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f58 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f72 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m19() {
        InterfaceC0975 wrapper;
        if (this.f55 == null) {
            this.f55 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f56 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0975) {
                wrapper = (InterfaceC0975) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f57 = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0126(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m19();
        C3418 c3418 = (C3418) this.f57;
        c3418.f10766 = drawable;
        c3418.m4934();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC2137
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo16(View view, int i, int i2, int[] iArr, int i3) {
    }
}
