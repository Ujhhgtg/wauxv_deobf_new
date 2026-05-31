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
import p000.AbstractC3630;
import p000.AbstractC3638;
import p000.AbstractC3715;
import p000.C0131;
import p000.C0134;
import p000.C0135;
import p000.C1660;
import p000.C1787;
import p000.C2173;
import p000.C3476;
import p000.C3708;
import p000.C3709;
import p000.C3710;
import p000.C3711;
import p000.C3712;
import p000.C3713;
import p000.C3714;
import p000.C3725;
import p000.C3729;
import p000.InterfaceC0133;
import p000.InterfaceC0979;
import p000.InterfaceC2171;
import p000.InterfaceC2172;
import p000.RunnableC0132;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2171, InterfaceC2172 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f51 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final C3729 f52;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final Rect f53;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f54;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ContentFrameLayout f55;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ActionBarContainer f56;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC0979 f57;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Drawable f58;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f59;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f60;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f61;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f62;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f63;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Rect f64;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Rect f65;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Rect f66;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Rect f67;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C3729 f68;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C3729 f69;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C3729 f70;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public C3729 f71;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public OverScroller f72;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ViewPropertyAnimator f73;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final C0131 f74;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final RunnableC0132 f75;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final RunnableC0132 f76;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final C2173 f77;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C0135 f78;

    static {
        AbstractC3715 c3709;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c3709 = new C3714();
        } else if (i >= 35) {
            c3709 = new C3713();
        } else if (i >= 34) {
            c3709 = new C3712();
        } else if (i >= 31) {
            c3709 = new C3711();
        } else if (i >= 30) {
            c3709 = new C3710();
        } else {
            c3709 = i >= 29 ? new C3709() : new C3708();
        }
        c3709.mo5253(C1660.m3539(0, 1, 0, 1));
        f52 = c3709.mo5251();
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
        C3729 c3729 = C3729.f11600;
        this.f68 = c3729;
        this.f69 = c3729;
        this.f70 = c3729;
        this.f71 = c3729;
        this.f74 = new C0131(this, 0);
        this.f75 = new RunnableC0132(this, 0);
        this.f76 = new RunnableC0132(this, 1);
        m18(context);
        this.f77 = new C2173();
        C0135 c0135 = new C0135(context);
        c0135.setWillNotDraw(true);
        this.f78 = c0135;
        addView(c0135);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m10(View view, Rect rect, boolean z) {
        boolean z2;
        C0134 c0134 = (C0134) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0134).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0134).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0134).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0134).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0134).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0134).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0134).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0134).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0134;
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
        return new C0134(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0134(getContext(), attributeSet);
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
        C2173 c2173 = this.f77;
        return c2173.f7201 | c2173.f7200;
    }

    public CharSequence getTitle() {
        m19();
        return ((C3476) this.f57).f10924.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m19();
        C3729 c3729M5305 = C3729.m5305(this, windowInsets);
        C3725 c3725 = c3729M5305.f11601;
        boolean zM10 = m10(this.f56, new Rect(c3725.mo5272().f5615, c3729M5305.m5307(), c3725.mo5272().f5617, c3729M5305.m5306()), false);
        Field field = AbstractC3638.f11333;
        Rect rect = this.f64;
        AbstractC3630.m5156(this, c3729M5305, rect);
        C3729 c3729Mo5275 = c3725.mo5275(rect.left, rect.top, rect.right, rect.bottom);
        this.f68 = c3729Mo5275;
        boolean z = true;
        if (!this.f69.equals(c3729Mo5275)) {
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
        return c3725.mo5293().f11601.mo5289().f11601.mo5288().m5308();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m18(getContext());
        Field field = AbstractC3638.f11333;
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
                C0134 c0134 = (C0134) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0134).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0134).topMargin + paddingTop;
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
        C3729 c3729;
        int i3;
        AbstractC3715 c3708;
        m19();
        measureChildWithMargins(this.f56, i, 0, i2, 0);
        C0134 c0134 = (C0134) this.f56.getLayoutParams();
        int iMax = Math.max(0, this.f56.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0134).leftMargin + ((ViewGroup.MarginLayoutParams) c0134).rightMargin);
        int iMax2 = Math.max(0, this.f56.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0134).topMargin + ((ViewGroup.MarginLayoutParams) c0134).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f56.getMeasuredState());
        Field field = AbstractC3638.f11333;
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
            C1660 c1660M3539 = C1660.m3539(this.f70.f11601.mo5272().f5615, this.f70.m5307() + measuredHeight, this.f70.f11601.mo5272().f5617, this.f70.m5306());
            c3729 = this.f70;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                c3708 = new C3714(c3729);
            } else if (i3 >= 35) {
                c3708 = new C3713(c3729);
            } else if (i3 >= 34) {
                c3708 = new C3712(c3729);
            } else if (i3 >= 31) {
                c3708 = new C3711(c3729);
            } else if (i3 >= 30) {
                c3708 = new C3710(c3729);
            } else if (i3 >= 29) {
                c3708 = new C3709(c3729);
            } else {
                c3708 = new C3708(c3729);
            }
            c3708.mo5253(c1660M3539);
            this.f70 = c3708.mo5251();
        } else {
            C0135 c0135 = this.f78;
            C3729 c37210 = f52;
            Rect rect3 = this.f67;
            AbstractC3630.m5156(c0135, c37210, rect3);
            if (rect3.equals(f53)) {
                C1660 c1660M35310 = C1660.m3539(this.f70.f11601.mo5272().f5615, this.f70.m5307() + measuredHeight, this.f70.f11601.mo5272().f5617, this.f70.m5306());
                c3729 = this.f70;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    c3708 = new C3714(c3729);
                } else if (i3 >= 35) {
                    c3708 = new C3713(c3729);
                } else if (i3 >= 34) {
                    c3708 = new C3712(c3729);
                } else if (i3 >= 31) {
                    c3708 = new C3711(c3729);
                } else if (i3 >= 30) {
                    c3708 = new C3710(c3729);
                } else if (i3 >= 29) {
                    c3708 = new C3709(c3729);
                } else {
                    c3708 = new C3708(c3729);
                }
                c3708.mo5253(c1660M35310);
                this.f70 = c3708.mo5251();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f70 = this.f70.f11601.mo5275(0, measuredHeight, 0, 0);
            }
        }
        m10(this.f55, rect2, true);
        if (!this.f71.equals(this.f70)) {
            C3729 c37211 = this.f70;
            this.f71 = c37211;
            AbstractC3638.m5173(this.f55, c37211);
        }
        measureChildWithMargins(this.f55, i, 0, i2, 0);
        C0134 c0136 = (C0134) this.f55.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f55.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0136).leftMargin + ((ViewGroup.MarginLayoutParams) c0136).rightMargin);
        int iMax4 = Math.max(iMax2, this.f55.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0136).topMargin + ((ViewGroup.MarginLayoutParams) c0136).bottomMargin);
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
        this.f77.f7200 = i;
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

    public void setActionBarVisibilityCallback(InterfaceC0133 interfaceC0133) {
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
        C3476 c3476 = (C3476) this.f57;
        c3476.f10927 = i != 0 ? C1787.m3667(c3476.f10924.getContext(), i) : null;
        c3476.m4996();
    }

    public void setLogo(int i) {
        m19();
        C3476 c3476 = (C3476) this.f57;
        c3476.f10928 = i != 0 ? C1787.m3667(c3476.f10924.getContext(), i) : null;
        c3476.m4996();
    }

    public void setOverlayMode(boolean z) {
        this.f59 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m19();
        ((C3476) this.f57).f10934 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m19();
        C3476 c3476 = (C3476) this.f57;
        if (c3476.f10930) {
            return;
        }
        Toolbar toolbar = c3476.f10924;
        c3476.f10931 = charSequence;
        if ((c3476.f10925 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c3476.f10930) {
                AbstractC3638.m5184(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.InterfaceC2172
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo11(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo12(view, i, i2, i3, i4, i5);
    }

    @Override // p000.InterfaceC2171
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo12(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC2171
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo13(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.InterfaceC2171
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo14(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC2171
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
        InterfaceC0979 wrapper;
        if (this.f55 == null) {
            this.f55 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f56 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0979) {
                wrapper = (InterfaceC0979) callbackFindViewById;
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
        return new C0134(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m19();
        C3476 c3476 = (C3476) this.f57;
        c3476.f10927 = drawable;
        c3476.m4996();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC2171
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo16(View view, int i, int i2, int[] iArr, int i3) {
    }
}
