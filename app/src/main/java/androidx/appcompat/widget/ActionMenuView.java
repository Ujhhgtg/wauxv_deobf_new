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
import p000.AbstractC0086Ujhhgtgfeyxiexzf;
import p000.C0090Ujhhgtgfeyxiexzf;
import p000.C1723Ujhhgtgfeyxiexzf;
import p000.C2965Ujhhgtgfeyxiexzf;
import p000.C3001Ujhhgtgfeyxiexzf;
import p000.C3004feyxiexzfUjhhgtg;
import p000.C3007Ujhhgtgfeyxiexzf;
import p000.C3009feyxiexzfUjhhgtg;
import p000.C3382feyxiexzfUjhhgtg;
import p000.InterfaceC0356Ujhhgtgfeyxiexzf;
import p000.InterfaceC0370Ujhhgtgfeyxiexzf;
import p000.InterfaceC3008Ujhhgtgfeyxiexzf;
import p000.InterfaceC3010feyxiexzfUjhhgtg;
import p000.MenuC0355Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0086Ujhhgtgfeyxiexzf implements InterfaceC0356Ujhhgtgfeyxiexzf, InterfaceC0370Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuC0355Ujhhgtgfeyxiexzf f80Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public Context f81Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f82Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public C3007Ujhhgtgfeyxiexzf f83Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C1723Ujhhgtgfeyxiexzf f84Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f85Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f86Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f87feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f88feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public InterfaceC3010feyxiexzfUjhhgtg f89feyxiexzfUjhhgtg;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f87feyxiexzfUjhhgtg = (int) (56.0f * f);
        this.f88feyxiexzfUjhhgtg = (int) (f * 4.0f);
        this.f81Ujhhgtgfeyxiexzf = context;
        this.f82Ujhhgtgfeyxiexzf = 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C3009feyxiexzfUjhhgtg m20Ujhhgtgfeyxiexzf() {
        C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg = new C3009feyxiexzfUjhhgtg(-2, -2);
        c3009feyxiexzfUjhhgtg.f9355Ujhhgtgfeyxiexzf = false;
        ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).gravity = 16;
        return c3009feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C3009feyxiexzfUjhhgtg m21Ujhhgtgfeyxiexzf(ViewGroup.LayoutParams layoutParams) {
        C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg;
        if (layoutParams == null) {
            return m20Ujhhgtgfeyxiexzf();
        }
        if (layoutParams instanceof C3009feyxiexzfUjhhgtg) {
            C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg2 = (C3009feyxiexzfUjhhgtg) layoutParams;
            c3009feyxiexzfUjhhgtg = new C3009feyxiexzfUjhhgtg(c3009feyxiexzfUjhhgtg2);
            c3009feyxiexzfUjhhgtg.f9355Ujhhgtgfeyxiexzf = c3009feyxiexzfUjhhgtg2.f9355Ujhhgtgfeyxiexzf;
        } else {
            c3009feyxiexzfUjhhgtg = new C3009feyxiexzfUjhhgtg(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).gravity <= 0) {
            ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).gravity = 16;
        }
        return c3009feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3009feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m20Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m21Ujhhgtgfeyxiexzf(layoutParams);
    }

    public Menu getMenu() {
        if (this.f80Ujhhgtgfeyxiexzf == null) {
            Context context = getContext();
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = new MenuC0355Ujhhgtgfeyxiexzf(context);
            this.f80Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
            menuC0355Ujhhgtgfeyxiexzf.f2008Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(2, this);
            C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = new C3007Ujhhgtgfeyxiexzf(context);
            this.f83Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf;
            c3007Ujhhgtgfeyxiexzf.f9342Ujhhgtgfeyxiexzf = true;
            c3007Ujhhgtgfeyxiexzf.f9343Ujhhgtgfeyxiexzf = true;
            c3007Ujhhgtgfeyxiexzf.f9336Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();
            this.f80Ujhhgtgfeyxiexzf.m1543Ujhhgtgfeyxiexzf(c3007Ujhhgtgfeyxiexzf, this.f81Ujhhgtgfeyxiexzf);
            C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf2 = this.f83Ujhhgtgfeyxiexzf;
            c3007Ujhhgtgfeyxiexzf2.f9338Ujhhgtgfeyxiexzf = this;
            this.f80Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf2.f9334Ujhhgtgfeyxiexzf;
        }
        return this.f80Ujhhgtgfeyxiexzf;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = this.f83Ujhhgtgfeyxiexzf;
        C3004feyxiexzfUjhhgtg c3004feyxiexzfUjhhgtg = c3007Ujhhgtgfeyxiexzf.f9339Ujhhgtgfeyxiexzf;
        if (c3004feyxiexzfUjhhgtg != null) {
            return c3004feyxiexzfUjhhgtg.getDrawable();
        }
        if (c3007Ujhhgtgfeyxiexzf.f9341Ujhhgtgfeyxiexzf) {
            return c3007Ujhhgtgfeyxiexzf.f9340Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f82Ujhhgtgfeyxiexzf;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = this.f83Ujhhgtgfeyxiexzf;
        if (c3007Ujhhgtgfeyxiexzf != null) {
            c3007Ujhhgtgfeyxiexzf.mo1593Ujhhgtgfeyxiexzf(false);
            C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf = this.f83Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf;
            if (c3001Ujhhgtgfeyxiexzf == null || !c3001Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) {
                return;
            }
            this.f83Ujhhgtgfeyxiexzf.m4457Ujhhgtgfeyxiexzf();
            this.f83Ujhhgtgfeyxiexzf.m4458Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = this.f83Ujhhgtgfeyxiexzf;
        if (c3007Ujhhgtgfeyxiexzf != null) {
            c3007Ujhhgtgfeyxiexzf.m4457Ujhhgtgfeyxiexzf();
            C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9350Ujhhgtgfeyxiexzf;
            if (c3001Ujhhgtgfeyxiexzf == null || !c3001Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) {
                return;
            }
            c3001Ujhhgtgfeyxiexzf.f2066Ujhhgtgfeyxiexzf.dismiss();
        }
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f85Ujhhgtgfeyxiexzf) {
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
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg = (C3009feyxiexzfUjhhgtg) childAt.getLayoutParams();
                if (c3009feyxiexzfUjhhgtg.f9355Ujhhgtgfeyxiexzf) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m25Ujhhgtgfeyxiexzf(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).leftMargin) + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).rightMargin;
                    m25Ujhhgtgfeyxiexzf(i9);
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
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg2 = (C3009feyxiexzfUjhhgtg) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c3009feyxiexzfUjhhgtg2.f9355Ujhhgtgfeyxiexzf) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg3 = (C3009feyxiexzfUjhhgtg) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c3009feyxiexzfUjhhgtg3.f9355Ujhhgtgfeyxiexzf) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf;
        boolean z = this.f85Ujhhgtgfeyxiexzf;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f85Ujhhgtgfeyxiexzf = z2;
        if (z != z2) {
            this.f86Ujhhgtgfeyxiexzf = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f85Ujhhgtgfeyxiexzf && (menuC0355Ujhhgtgfeyxiexzf = this.f80Ujhhgtgfeyxiexzf) != null && size != this.f86Ujhhgtgfeyxiexzf) {
            this.f86Ujhhgtgfeyxiexzf = size;
            menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
        }
        int childCount = getChildCount();
        if (!this.f85Ujhhgtgfeyxiexzf || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg = (C3009feyxiexzfUjhhgtg) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).rightMargin = 0;
                ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg).leftMargin = 0;
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
        int i9 = this.f87feyxiexzfUjhhgtg;
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
            i3 = this.f88feyxiexzfUjhhgtg;
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
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg2 = (C3009feyxiexzfUjhhgtg) childAt.getLayoutParams();
                c3009feyxiexzfUjhhgtg2.f9360Ujhhgtgfeyxiexzf = false;
                c3009feyxiexzfUjhhgtg2.f9357Ujhhgtgfeyxiexzf = 0;
                c3009feyxiexzfUjhhgtg2.f9356Ujhhgtgfeyxiexzf = 0;
                c3009feyxiexzfUjhhgtg2.f9358Ujhhgtgfeyxiexzf = false;
                ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg2).rightMargin = 0;
                c3009feyxiexzfUjhhgtg2.f9359Ujhhgtgfeyxiexzf = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c3009feyxiexzfUjhhgtg2.f9355Ujhhgtgfeyxiexzf ? 1 : i10;
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg3 = (C3009feyxiexzfUjhhgtg) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c3009feyxiexzfUjhhgtg3.f9358Ujhhgtgfeyxiexzf = !c3009feyxiexzfUjhhgtg3.f9355Ujhhgtgfeyxiexzf && z6;
                c3009feyxiexzfUjhhgtg3.f9356Ujhhgtgfeyxiexzf = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c3009feyxiexzfUjhhgtg2.f9358Ujhhgtgfeyxiexzf) {
                    i15++;
                }
                if (c3009feyxiexzfUjhhgtg2.f9355Ujhhgtgfeyxiexzf) {
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
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg4 = (C3009feyxiexzfUjhhgtg) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c3009feyxiexzfUjhhgtg4.f9358Ujhhgtgfeyxiexzf) {
                    int i28 = c3009feyxiexzfUjhhgtg4.f9356Ujhhgtgfeyxiexzf;
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
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg5 = (C3009feyxiexzfUjhhgtg) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c3009feyxiexzfUjhhgtg5.f9359Ujhhgtgfeyxiexzf) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c3009feyxiexzfUjhhgtg5.f9356Ujhhgtgfeyxiexzf += r11;
                    c3009feyxiexzfUjhhgtg5.f9360Ujhhgtgfeyxiexzf = r11;
                    i23--;
                } else if (c3009feyxiexzfUjhhgtg5.f9356Ujhhgtgfeyxiexzf == i29) {
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
                if ((j & 1) != 0 && !((C3009feyxiexzfUjhhgtg) getChildAt(0).getLayoutParams()).f9359Ujhhgtgfeyxiexzf) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C3009feyxiexzfUjhhgtg) getChildAt(i31).getLayoutParams()).f9359Ujhhgtgfeyxiexzf) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg6 = (C3009feyxiexzfUjhhgtg) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c3009feyxiexzfUjhhgtg6.f9357Ujhhgtgfeyxiexzf = i32;
                        c3009feyxiexzfUjhhgtg6.f9360Ujhhgtgfeyxiexzf = true;
                        if (i33 == 0 && !c3009feyxiexzfUjhhgtg6.f9359Ujhhgtgfeyxiexzf) {
                            ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c3009feyxiexzfUjhhgtg6.f9355Ujhhgtgfeyxiexzf) {
                        c3009feyxiexzfUjhhgtg6.f9357Ujhhgtgfeyxiexzf = i32;
                        c3009feyxiexzfUjhhgtg6.f9360Ujhhgtgfeyxiexzf = true;
                        ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c3009feyxiexzfUjhhgtg6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C3009feyxiexzfUjhhgtg c3009feyxiexzfUjhhgtg7 = (C3009feyxiexzfUjhhgtg) childAt4.getLayoutParams();
                if (c3009feyxiexzfUjhhgtg7.f9360Ujhhgtgfeyxiexzf) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c3009feyxiexzfUjhhgtg7.f9356Ujhhgtgfeyxiexzf * i22) + c3009feyxiexzfUjhhgtg7.f9357Ujhhgtgfeyxiexzf, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f83Ujhhgtgfeyxiexzf.f9347Ujhhgtgfeyxiexzf = z;
    }

    public void setOnMenuItemClickListener(InterfaceC3010feyxiexzfUjhhgtg interfaceC3010feyxiexzfUjhhgtg) {
        this.f89feyxiexzfUjhhgtg = interfaceC3010feyxiexzfUjhhgtg;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = this.f83Ujhhgtgfeyxiexzf;
        C3004feyxiexzfUjhhgtg c3004feyxiexzfUjhhgtg = c3007Ujhhgtgfeyxiexzf.f9339Ujhhgtgfeyxiexzf;
        if (c3004feyxiexzfUjhhgtg != null) {
            c3004feyxiexzfUjhhgtg.setImageDrawable(drawable);
        } else {
            c3007Ujhhgtgfeyxiexzf.f9341Ujhhgtgfeyxiexzf = true;
            c3007Ujhhgtgfeyxiexzf.f9340Ujhhgtgfeyxiexzf = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.f82Ujhhgtgfeyxiexzf != i) {
            this.f82Ujhhgtgfeyxiexzf = i;
            if (i == 0) {
                this.f81Ujhhgtgfeyxiexzf = getContext();
            } else {
                this.f81Ujhhgtgfeyxiexzf = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf) {
        this.f83Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf;
        c3007Ujhhgtgfeyxiexzf.f9338Ujhhgtgfeyxiexzf = this;
        this.f80Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9334Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0356Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo6Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        return this.f80Ujhhgtgfeyxiexzf.m1557Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf, null, 0);
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0090Ujhhgtgfeyxiexzf generateDefaultLayoutParams() {
        return m20Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0090Ujhhgtgfeyxiexzf generateLayoutParams(AttributeSet attributeSet) {
        return new C3009feyxiexzfUjhhgtg(getContext(), attributeSet);
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0090Ujhhgtgfeyxiexzf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m21Ujhhgtgfeyxiexzf(layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean m25Ujhhgtgfeyxiexzf(int i) {
        boolean zMo1Ujhhgtgfeyxiexzf = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC3008Ujhhgtgfeyxiexzf)) {
            zMo1Ujhhgtgfeyxiexzf = ((InterfaceC3008Ujhhgtgfeyxiexzf) childAt).mo1Ujhhgtgfeyxiexzf();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC3008Ujhhgtgfeyxiexzf)) ? zMo1Ujhhgtgfeyxiexzf : ((InterfaceC3008Ujhhgtgfeyxiexzf) childAt2).mo3Ujhhgtgfeyxiexzf() | zMo1Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3009feyxiexzfUjhhgtg(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z) {
    }
}
