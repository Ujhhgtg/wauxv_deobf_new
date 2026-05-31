package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import me.hd.wauxv.R;
import p000.AbstractC1469;
import p000.AbstractC1586;
import p000.AbstractC2234;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC3528;
import p000.AbstractC3638;
import p000.C0179;
import p000.C1948;
import p000.MenuC1975;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f603 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public Integer f604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public boolean f605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public boolean f606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public ImageView.ScaleType f607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public Boolean f608;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context2, attributeSet, AbstractC2521.f8007, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM4263.hasValue(2)) {
            setNavigationIconTint(typedArrayM4263.getColor(2, -1));
        }
        this.f605 = typedArrayM4263.getBoolean(4, false);
        this.f606 = typedArrayM4263.getBoolean(3, false);
        int i = typedArrayM4263.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f603;
            if (i < scaleTypeArr.length) {
                this.f607 = scaleTypeArr[i];
            }
        }
        if (typedArrayM4263.hasValue(0)) {
            this.f608 = Boolean.valueOf(typedArrayM4263.getBoolean(0, false));
        }
        typedArrayM4263.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC2234.m4170(background);
        if (colorStateListValueOf != null) {
            C1948 c1948 = new C1948();
            c1948.m3914(colorStateListValueOf);
            c1948.m3912(context2);
            Field field = AbstractC3638.f11333;
            c1948.m3913(getElevation());
            setBackground(c1948);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f607;
    }

    public Integer getNavigationIconTint() {
        return this.f604;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1948) {
            AbstractC1586.m3489(this, (C1948) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0179 c0179 = AbstractC3528.f11116;
        ImageView imageView2 = null;
        if (this.f605 || this.f606) {
            ArrayList arrayListM5098 = AbstractC3528.m5098(this, getTitle());
            TextView textView = arrayListM5098.isEmpty() ? null : (TextView) Collections.min(arrayListM5098, c0179);
            ArrayList arrayListM5099 = AbstractC3528.m5098(this, getSubtitle());
            TextView textView2 = arrayListM5099.isEmpty() ? null : (TextView) Collections.max(arrayListM5099, c0179);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f605 && textView != null) {
                    m777(textView, pair);
                }
                if (this.f606 && textView2 != null) {
                    m777(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f608;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f607;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1948) {
            ((C1948) background).m3913(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f608;
        if (bool == null || bool.booleanValue() != z) {
            this.f608 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f607 != scaleType) {
            this.f607 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f604 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f604.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f604 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f606 != z) {
            this.f606 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f605 != z) {
            this.f605 = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo42(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC1975;
        if (z) {
            ((MenuC1975) menu).m3966();
        }
        super.mo42(i);
        if (z) {
            ((MenuC1975) menu).m3965();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m777(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
