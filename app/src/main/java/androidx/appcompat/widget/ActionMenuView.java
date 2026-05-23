package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000.AbstractC1785;
import p000.C0094;
import p000.C0130;
import p000.C0133;
import p000.C0136;
import p000.C0138;
import p000.C1133;
import p000.C1784;
import p000.C3411;
import p000.InterfaceC0137;
import p000.InterfaceC0139;
import p000.InterfaceC1943;
import p000.InterfaceC1957;
import p000.MenuC1944;
import p000.MenuItemC1946;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1785 implements InterfaceC1943, InterfaceC1957 {

    public MenuC1944 f79;

    public Context f80;

    public int f81;

    public C0136 f82;

    public C3411 f83;

    public boolean f84;

    public int f85;

    public final int f86;

    public final int f87;

    public InterfaceC0139 f88;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f86 = (int) (56.0f * f);
        this.f87 = (int) (f * 4.0f);
        this.f80 = context;
        this.f81 = 0;
    }

    public static C0138 m20() {
        C0138 c0138 = new C0138(-2, -2);
        c0138.f1128 = false;
        ((LinearLayout.LayoutParams) c0138).gravity = 16;
        return c0138;
    }

    public static C0138 m21(ViewGroup.LayoutParams layoutParams) {
        C0138 c0138;
        if (layoutParams == null) {
            return m20();
        }
        if (layoutParams instanceof C0138) {
            C0138 c0139 = (C0138) layoutParams;
            c0138 = new C0138(c0139);
            c0138.f1128 = c0139.f1128;
        } else {
            c0138 = new C0138(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0138).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0138).gravity = 16;
        }
        return c0138;
    }

    @Override // p000.AbstractC1785, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0138;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC1785, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m20();
    }

    @Override // p000.AbstractC1785, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m21(layoutParams);
    }

    public Menu getMenu() {
        if (this.f79 == null) {
            Context context = getContext();
            MenuC1944 menuC1944 = new MenuC1944(context);
            this.f79 = menuC1944;
            menuC1944.f6411 = new C0094(2, this);
            C0136 c0136 = new C0136(context);
            this.f82 = c0136;
            c0136.f1115 = true;
            c0136.f1116 = true;
            c0136.f1109 = new C1133();
            this.f79.m3755(c0136, this.f80);
            C0136 c0137 = this.f82;
            c0137.f1111 = this;
            this.f79 = c0137.f1107;
        }
        return this.f79;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0136 c0136 = this.f82;
        C0133 c0133 = c0136.f1112;
        if (c0133 != null) {
            return c0133.getDrawable();
        }
        if (c0136.f1114) {
            return c0136.f1113;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f81;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0136 c0136 = this.f82;
        if (c0136 != null) {
            c0136.mo1137(false);
            C0130 c0130 = this.f82.f1122;
            if (c0130 == null || !c0130.m3781()) {
                return;
            }
            this.f82.m1141();
            this.f82.m1146();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0136 c0136 = this.f82;
        if (c0136 != null) {
            c0136.m1141();
            C0130 c0130 = c0136.f1123;
            if (c0130 == null || !c0130.m3781()) {
                return;
            }
            c0130.f6465.dismiss();
        }
    }

    @Override // p000.AbstractC1785, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f84) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0138 c0138 = (C0138) childAt.getLayoutParams();
                if (c0138.f1128) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m25(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0138).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0138).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0138).leftMargin) + ((LinearLayout.LayoutParams) c0138).rightMargin;
                    m25(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0138 c0139 = (C0138) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0139.f1128) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0139).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0139).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0138 c01310 = (C0138) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c01310.f1128) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c01310).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c01310).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC1785, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC1944 menuC1944;
        boolean z = this.f84;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f84 = z2;
        if (z != z2) {
            this.f85 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f84 && (menuC1944 = this.f79) != null && size != this.f85) {
            this.f85 = size;
            menuC1944.m3768(true);
        }
        int childCount = getChildCount();
        if (!this.f84 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0138 c0138 = (C0138) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0138).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0138).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f86;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f87;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0138 c0139 = (C0138) childAt.getLayoutParams();
                c0139.f1133 = false;
                c0139.f1130 = 0;
                c0139.f1129 = 0;
                c0139.f1131 = false;
                ((LinearLayout.LayoutParams) c0139).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0139).rightMargin = 0;
                c0139.f1132 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c0139.f1128 ? 1 : i10;
                C0138 c01310 = (C0138) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, -2147483648), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c01310.f1131 = !c01310.f1128 && z6;
                c01310.f1129 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c0139.f1131) {
                    i15++;
                }
                if (c0139.f1128) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = 2147483647;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C0138 c01311 = (C0138) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c01311.f1131) {
                    int i28 = c01311.f1129;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0138 c01312 = (C0138) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c01312.f1132) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c01312.f1129 += r11;
                    c01312.f1133 = r11;
                    i23--;
                } else if (c01312.f1129 == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C0138) getChildAt(0).getLayoutParams()).f1132) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C0138) getChildAt(i31).getLayoutParams()).f1132) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0138 c01313 = (C0138) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c01313.f1130 = i32;
                        c01313.f1133 = true;
                        if (i33 == 0 && !c01313.f1132) {
                            ((LinearLayout.LayoutParams) c01313).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c01313.f1128) {
                        c01313.f1130 = i32;
                        c01313.f1133 = true;
                        ((LinearLayout.LayoutParams) c01313).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c01313).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c01313).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0138 c01314 = (C0138) childAt4.getLayoutParams();
                if (c01314.f1133) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c01314.f1129 * i22) + c01314.f1130, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f82.f1120 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0139 interfaceC0139) {
        this.f88 = interfaceC0139;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0136 c0136 = this.f82;
        C0133 c0133 = c0136.f1112;
        if (c0133 != null) {
            c0133.setImageDrawable(drawable);
        } else {
            c0136.f1114 = true;
            c0136.f1113 = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.f81 != i) {
            this.f81 = i;
            if (i == 0) {
                this.f80 = getContext();
            } else {
                this.f80 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0136 c0136) {
        this.f82 = c0136;
        c0136.f1111 = this;
        this.f79 = c0136.f1107;
    }

    @Override // p000.InterfaceC1943
    public final boolean mo6(MenuItemC1946 menuItemC1946) {
        return this.f79.m3769(menuItemC1946, null, 0);
    }

    @Override // p000.AbstractC1785
    public final /* bridge */ /* synthetic */ C1784 generateDefaultLayoutParams() {
        return m20();
    }

    @Override // p000.AbstractC1785
    public final C1784 generateLayoutParams(AttributeSet attributeSet) {
        return new C0138(getContext(), attributeSet);
    }

    @Override // p000.AbstractC1785
    public final /* bridge */ /* synthetic */ C1784 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m21(layoutParams);
    }

    public final boolean m25(int i) {
        boolean zMo1 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0137)) {
            zMo1 = ((InterfaceC0137) childAt).mo1();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0137)) ? zMo1 : ((InterfaceC0137) childAt2).mo3() | zMo1;
    }

    @Override // p000.AbstractC1785, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0138(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z) {
    }
}
