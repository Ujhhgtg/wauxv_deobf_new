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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final int[] f2249 = {R.attr.colorBackground};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0348 f2250 = new C0348(14);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f2251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2252;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Rect f2253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Rect f2254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0519 f2255;

    public AbstractC0539(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, me.hd.wauxv.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.f2253 = rect;
        this.f2254 = new Rect();
        C0519 c0519 = new C0519(this);
        this.f2255 = c0519;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2514.f7954, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f2249);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(me.hd.wauxv.R.color.cardview_light_background) : getResources().getColor(me.hd.wauxv.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f2251 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f2252 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C2663 c2663 = new C2663(colorStateListValueOf, dimension);
        c0519.f2208 = c2663;
        setBackgroundDrawable(c2663);
        setClipToOutline(true);
        setElevation(dimension2);
        f2250.m1623(c0519, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C2663) ((Drawable) this.f2255.f2208)).f8633;
    }

    public float getCardElevation() {
        return ((AbstractC0539) this.f2255.f2209).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2253.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2253.left;
    }

    public int getContentPaddingRight() {
        return this.f2253.right;
    }

    public int getContentPaddingTop() {
        return this.f2253.top;
    }

    public float getMaxCardElevation() {
        return ((C2663) ((Drawable) this.f2255.f2208)).f8630;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2252;
    }

    public float getRadius() {
        return ((C2663) ((Drawable) this.f2255.f2208)).f8626;
    }

    public boolean getUseCompatPadding() {
        return this.f2251;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C2663 c2663 = (C2663) ((Drawable) this.f2255.f2208);
        if (colorStateListValueOf == null) {
            c2663.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c2663.f8633 = colorStateListValueOf;
        c2663.f8627.setColor(colorStateListValueOf.getColorForState(c2663.getState(), c2663.f8633.getDefaultColor()));
        c2663.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((AbstractC0539) this.f2255.f2209).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f2250.m1623(this.f2255, f);
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
        if (z != this.f2252) {
            this.f2252 = z;
            C0519 c0519 = this.f2255;
            f2250.m1623(c0519, ((C2663) ((Drawable) c0519.f2208)).f8630);
        }
    }

    public void setRadius(float f) {
        C2663 c2663 = (C2663) ((Drawable) this.f2255.f2208);
        if (f == c2663.f8626) {
            return;
        }
        c2663.f8626 = f;
        c2663.m4659(null);
        c2663.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2251 != z) {
            this.f2251 = z;
            C0519 c0519 = this.f2255;
            f2250.m1623(c0519, ((C2663) ((Drawable) c0519.f2208)).f8630);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C2663 c2663 = (C2663) ((Drawable) this.f2255.f2208);
        if (colorStateList == null) {
            c2663.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c2663.f8633 = colorStateList;
        c2663.f8627.setColor(colorStateList.getColorForState(c2663.getState(), c2663.f8633.getDefaultColor()));
        c2663.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
