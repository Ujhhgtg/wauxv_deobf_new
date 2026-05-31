package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import me.hd.wauxv.R;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC2521;
import p000.AbstractC2739;
import p000.C0232;
import p000.C1948;
import p000.C2738;
import p000.C2740;
import p000.C2750;
import p000.InterfaceC2749;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends C0232 implements InterfaceC2749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2740 f770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final RectF f771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final RectF f772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Paint f773;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Paint f774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Path f775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public ColorStateList f776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1948 f777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C2738 f778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public float f779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Path f780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int f781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int f783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final int f785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int f786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f787;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f770 = AbstractC2739.f8810;
        this.f775 = new Path();
        this.f787 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f774 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f771 = new RectF();
        this.f772 = new RectF();
        this.f780 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2521.f8013, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f776 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 9);
        this.f779 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f781 = dimensionPixelSize;
        this.f782 = dimensionPixelSize;
        this.f783 = dimensionPixelSize;
        this.f784 = dimensionPixelSize;
        this.f781 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f782 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f783 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f784 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f785 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f786 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f773 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f778 = C2738.m4725(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m4722();
        setOutlineProvider(new C2750(this));
    }

    public int getContentPaddingBottom() {
        return this.f784;
    }

    public final int getContentPaddingEnd() {
        int i = this.f786;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m825() ? this.f781 : this.f783;
    }

    public int getContentPaddingLeft() {
        int i = this.f786;
        int i2 = this.f785;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m825() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!m825() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f781;
    }

    public int getContentPaddingRight() {
        int i = this.f786;
        int i2 = this.f785;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m825() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m825() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f783;
    }

    public final int getContentPaddingStart() {
        int i = this.f785;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m825() ? this.f783 : this.f781;
    }

    public int getContentPaddingTop() {
        return this.f782;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C2738 getShapeAppearanceModel() {
        return this.f778;
    }

    public ColorStateList getStrokeColor() {
        return this.f776;
    }

    public float getStrokeWidth() {
        return this.f779;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f780, this.f774);
        if (this.f776 == null) {
            return;
        }
        float f = this.f779;
        Paint paint = this.f773;
        paint.setStrokeWidth(f);
        int colorForState = this.f776.getColorForState(getDrawableState(), this.f776.getDefaultColor());
        if (this.f779 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f775, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f787 && isLayoutDirectionResolved()) {
            this.f787 = true;
            if (!isPaddingRelative() && this.f785 == Integer.MIN_VALUE && this.f786 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m826(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p000.InterfaceC2749
    public void setShapeAppearanceModel(C2738 c2738) {
        this.f778 = c2738;
        C1948 c1948 = this.f777;
        if (c1948 != null) {
            c1948.setShapeAppearanceModel(c2738);
        }
        m826(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f776 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AbstractC1469.m3333(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f779 != f) {
            this.f779 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m825() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m826(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.f771;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        C2738 c2738 = this.f778;
        C2740 c2740 = this.f770;
        Path path = this.f775;
        c2740.m4729(c2738, 1.0f, rectF, null, path);
        Path path2 = this.f780;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f772;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }
}
