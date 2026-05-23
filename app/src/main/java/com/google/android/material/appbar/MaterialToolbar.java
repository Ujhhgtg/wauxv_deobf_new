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
import p000.AbstractC0743;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.C0171;
import p000.C1917;
import p000.MenuC1944;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    public static final ImageView.ScaleType[] f551 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public Integer f552;

    public boolean f553;

    public boolean f554;

    public ImageView.ScaleType f555;

    public Boolean f556;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context2, attributeSet, AbstractC2467.f7857, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM5082.hasValue(2)) {
            setNavigationIconTint(typedArrayM5082.getColor(2, -1));
        }
        this.f553 = typedArrayM5082.getBoolean(4, false);
        this.f554 = typedArrayM5082.getBoolean(3, false);
        int i = typedArrayM5082.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f551;
            if (i < scaleTypeArr.length) {
                this.f555 = scaleTypeArr[i];
            }
        }
        if (typedArrayM5082.hasValue(0)) {
            this.f556 = Boolean.valueOf(typedArrayM5082.getBoolean(0, false));
        }
        typedArrayM5082.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC3471.m5075(background);
        if (colorStateListValueOf != null) {
            C1917 c1917 = new C1917();
            c1917.m3716(colorStateListValueOf);
            c1917.m3714(context2);
            Field field = AbstractC3578.f11184;
            c1917.m3715(getElevation());
            setBackground(c1917);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f555;
    }

    public Integer getNavigationIconTint() {
        return this.f552;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1917) {
            AbstractC3471.m5086(this, (C1917) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0171 c0171 = AbstractC0743.f2839;
        ImageView imageView2 = null;
        if (this.f553 || this.f554) {
            ArrayList arrayListM2184 = AbstractC0743.m2184(this, getTitle());
            TextView textView = arrayListM2184.isEmpty() ? null : (TextView) Collections.min(arrayListM2184, c0171);
            ArrayList arrayListM2185 = AbstractC0743.m2184(this, getSubtitle());
            TextView textView2 = arrayListM2185.isEmpty() ? null : (TextView) Collections.max(arrayListM2185, c0171);
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
                if (this.f553 && textView != null) {
                    m634(textView, pair);
                }
                if (this.f554 && textView2 != null) {
                    m634(textView2, pair);
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
            Boolean bool = this.f556;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f555;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1917) {
            ((C1917) background).m3715(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f556;
        if (bool == null || bool.booleanValue() != z) {
            this.f556 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f555 != scaleType) {
            this.f555 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f552 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f552.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f552 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f554 != z) {
            this.f554 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f553 != z) {
            this.f553 = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void mo42(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC1944;
        if (z) {
            ((MenuC1944) menu).m3772();
        }
        super.mo42(i);
        if (z) {
            ((MenuC1944) menu).m3771();
        }
    }

    public final void m634(TextView textView, Pair pair) {
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
