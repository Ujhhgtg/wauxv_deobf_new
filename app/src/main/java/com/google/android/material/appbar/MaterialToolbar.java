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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1252feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C2419Ujhhgtgfeyxiexzf;
import p000.MenuC0355Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f617Ujhhgtgfeyxiexzf = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public Integer f618feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f619feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public boolean f620feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ImageView.ScaleType f621feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Boolean f622Ujhhgtgfeyxiexzf;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3138Ujhhgtgfeyxiexzf, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(2)) {
            setNavigationIconTint(typedArrayM2740Ujhhgtgfeyxiexzf.getColor(2, -1));
        }
        this.f619feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(4, false);
        this.f620feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(3, false);
        int i = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f617Ujhhgtgfeyxiexzf;
            if (i < scaleTypeArr.length) {
                this.f621feyxiexzfUjhhgtg = scaleTypeArr[i];
            }
        }
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(0)) {
            this.f622Ujhhgtgfeyxiexzf = Boolean.valueOf(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(0, false));
        }
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC3593Ujhhgtgfeyxiexzf.m5157Ujhhgtgfeyxiexzf(background);
        if (colorStateListValueOf != null) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf();
            c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateListValueOf);
            c0226Ujhhgtgfeyxiexzf.m1367Ujhhgtgfeyxiexzf(context2);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(getElevation());
            setBackground(c0226Ujhhgtgfeyxiexzf);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f621feyxiexzfUjhhgtg;
    }

    public Integer getNavigationIconTint() {
        return this.f618feyxiexzfUjhhgtg;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, (C0226Ujhhgtgfeyxiexzf) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C2419Ujhhgtgfeyxiexzf c2419Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.f4603Ujhhgtgfeyxiexzf;
        ImageView imageView2 = null;
        if (this.f619feyxiexzfUjhhgtg || this.f620feyxiexzfUjhhgtg) {
            ArrayList arrayListM2785Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2785Ujhhgtgfeyxiexzf(this, getTitle());
            TextView textView = arrayListM2785Ujhhgtgfeyxiexzf.isEmpty() ? null : (TextView) Collections.min(arrayListM2785Ujhhgtgfeyxiexzf, c2419Ujhhgtgfeyxiexzf);
            ArrayList arrayListM2785Ujhhgtgfeyxiexzf2 = AbstractC1252feyxiexzfUjhhgtg.m2785Ujhhgtgfeyxiexzf(this, getSubtitle());
            TextView textView2 = arrayListM2785Ujhhgtgfeyxiexzf2.isEmpty() ? null : (TextView) Collections.max(arrayListM2785Ujhhgtgfeyxiexzf2, c2419Ujhhgtgfeyxiexzf);
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
                if (this.f619feyxiexzfUjhhgtg && textView != null) {
                    m776Ujhhgtgfeyxiexzf(textView, pair);
                }
                if (this.f620feyxiexzfUjhhgtg && textView2 != null) {
                    m776Ujhhgtgfeyxiexzf(textView2, pair);
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
            Boolean bool = this.f622Ujhhgtgfeyxiexzf;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f621feyxiexzfUjhhgtg;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0226Ujhhgtgfeyxiexzf) {
            ((C0226Ujhhgtgfeyxiexzf) background).m1368Ujhhgtgfeyxiexzf(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f622Ujhhgtgfeyxiexzf;
        if (bool == null || bool.booleanValue() != z) {
            this.f622Ujhhgtgfeyxiexzf = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f621feyxiexzfUjhhgtg != scaleType) {
            this.f621feyxiexzfUjhhgtg = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f618feyxiexzfUjhhgtg != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f618feyxiexzfUjhhgtg.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f618feyxiexzfUjhhgtg = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f620feyxiexzfUjhhgtg != z) {
            this.f620feyxiexzfUjhhgtg = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f619feyxiexzfUjhhgtg != z) {
            this.f619feyxiexzfUjhhgtg = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo42Ujhhgtgfeyxiexzf(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC0355Ujhhgtgfeyxiexzf;
        if (z) {
            ((MenuC0355Ujhhgtgfeyxiexzf) menu).m1560Ujhhgtgfeyxiexzf();
        }
        super.mo42Ujhhgtgfeyxiexzf(i);
        if (z) {
            ((MenuC0355Ujhhgtgfeyxiexzf) menu).m1559Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m776Ujhhgtgfeyxiexzf(TextView textView, Pair pair) {
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
