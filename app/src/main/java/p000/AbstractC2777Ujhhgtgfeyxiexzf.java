package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2777Ujhhgtgfeyxiexzf extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final int[] f8778Ujhhgtgfeyxiexzf = {R.attr.colorBackground};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2466feyxiexzfUjhhgtg f8779Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(14);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f8780Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f8781Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Rect f8782Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Rect f8783Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f8784Ujhhgtgfeyxiexzf;

    public AbstractC2777Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, me.hd.wauxv.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.f8782Ujhhgtgfeyxiexzf = rect;
        this.f8783Ujhhgtgfeyxiexzf = new Rect();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(this);
        this.f8784Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770feyxiexzfUjhhgtg.f3052Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f8778Ujhhgtgfeyxiexzf);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(me.hd.wauxv.R.color.cardview_light_background) : getResources().getColor(me.hd.wauxv.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f8780Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f8781Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = new C0947feyxiexzfUjhhgtg(colorStateListValueOf, dimension);
        c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf = c0947feyxiexzfUjhhgtg;
        setBackgroundDrawable(c0947feyxiexzfUjhhgtg);
        setClipToOutline(true);
        setElevation(dimension2);
        f8779Ujhhgtgfeyxiexzf.m3708feyxiexzfUjhhgtg(c2629Ujhhgtgfeyxiexzf, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)).f3805Ujhhgtgfeyxiexzf;
    }

    public float getCardElevation() {
        return ((AbstractC2777Ujhhgtgfeyxiexzf) this.f8784Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f8782Ujhhgtgfeyxiexzf.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8782Ujhhgtgfeyxiexzf.left;
    }

    public int getContentPaddingRight() {
        return this.f8782Ujhhgtgfeyxiexzf.right;
    }

    public int getContentPaddingTop() {
        return this.f8782Ujhhgtgfeyxiexzf.top;
    }

    public float getMaxCardElevation() {
        return ((C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)).f3802Ujhhgtgfeyxiexzf;
    }

    public boolean getPreventCornerOverlap() {
        return this.f8781Ujhhgtgfeyxiexzf;
    }

    public float getRadius() {
        return ((C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)).f3798Ujhhgtgfeyxiexzf;
    }

    public boolean getUseCompatPadding() {
        return this.f8780Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = (C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        if (colorStateListValueOf == null) {
            c0947feyxiexzfUjhhgtg.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c0947feyxiexzfUjhhgtg.f3805Ujhhgtgfeyxiexzf = colorStateListValueOf;
        c0947feyxiexzfUjhhgtg.f3799Ujhhgtgfeyxiexzf.setColor(colorStateListValueOf.getColorForState(c0947feyxiexzfUjhhgtg.getState(), c0947feyxiexzfUjhhgtg.f3805Ujhhgtgfeyxiexzf.getDefaultColor()));
        c0947feyxiexzfUjhhgtg.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((AbstractC2777Ujhhgtgfeyxiexzf) this.f8784Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f8779Ujhhgtgfeyxiexzf.m3708feyxiexzfUjhhgtg(this.f8784Ujhhgtgfeyxiexzf, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f8781Ujhhgtgfeyxiexzf) {
            this.f8781Ujhhgtgfeyxiexzf = z;
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f8784Ujhhgtgfeyxiexzf;
            f8779Ujhhgtgfeyxiexzf.m3708feyxiexzfUjhhgtg(c2629Ujhhgtgfeyxiexzf, ((C0947feyxiexzfUjhhgtg) ((Drawable) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)).f3802Ujhhgtgfeyxiexzf);
        }
    }

    public void setRadius(float f) {
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = (C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        if (f == c0947feyxiexzfUjhhgtg.f3798Ujhhgtgfeyxiexzf) {
            return;
        }
        c0947feyxiexzfUjhhgtg.f3798Ujhhgtgfeyxiexzf = f;
        c0947feyxiexzfUjhhgtg.m2438Ujhhgtgfeyxiexzf(null);
        c0947feyxiexzfUjhhgtg.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f8780Ujhhgtgfeyxiexzf != z) {
            this.f8780Ujhhgtgfeyxiexzf = z;
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f8784Ujhhgtgfeyxiexzf;
            f8779Ujhhgtgfeyxiexzf.m3708feyxiexzfUjhhgtg(c2629Ujhhgtgfeyxiexzf, ((C0947feyxiexzfUjhhgtg) ((Drawable) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)).f3802Ujhhgtgfeyxiexzf);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = (C0947feyxiexzfUjhhgtg) ((Drawable) this.f8784Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        if (colorStateList == null) {
            c0947feyxiexzfUjhhgtg.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0947feyxiexzfUjhhgtg.f3805Ujhhgtgfeyxiexzf = colorStateList;
        c0947feyxiexzfUjhhgtg.f3799Ujhhgtgfeyxiexzf.setColor(colorStateList.getColorForState(c0947feyxiexzfUjhhgtg.getState(), c0947feyxiexzfUjhhgtg.f3805Ujhhgtgfeyxiexzf.getDefaultColor()));
        c0947feyxiexzfUjhhgtg.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
