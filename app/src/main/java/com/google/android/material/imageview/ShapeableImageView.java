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
import p000.AbstractC2203;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC2678;
import p000.AbstractC3453;
import p000.C0222;
import p000.C1917;
import p000.C2677;
import p000.C2679;
import p000.C2689;
import p000.InterfaceC2688;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends C0222 implements InterfaceC2688 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2679 f704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final RectF f705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final RectF f706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Paint f707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Paint f708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Path f709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ColorStateList f710;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1917 f711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C2677 f712;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public float f713;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Path f714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int f716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f717;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final int f718;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int f719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int f720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f721;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f704 = AbstractC2678.f8640;
        this.f709 = new Path();
        this.f721 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f708 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f705 = new RectF();
        this.f706 = new RectF();
        this.f714 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2467.f7863, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f710 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 9);
        this.f713 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f715 = dimensionPixelSize;
        this.f716 = dimensionPixelSize;
        this.f717 = dimensionPixelSize;
        this.f718 = dimensionPixelSize;
        this.f715 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f716 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f717 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f718 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f719 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -2147483648);
        this.f720 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -2147483648);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f707 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f712 = C2677.m4688(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m3876();
        setOutlineProvider(new C2689(this));
    }

    public int getContentPaddingBottom() {
        return this.f718;
    }

    public final int getContentPaddingEnd() {
        int i = this.f720;
        if (i != -2147483648) {
            return i;
        }
        return m681() ? this.f715 : this.f717;
    }

    public int getContentPaddingLeft() {
        int i = this.f720;
        int i2 = this.f719;
        if (i2 != -2147483648 || i != -2147483648) {
            if (m681() && i != -2147483648) {
                return i;
            }
            if (!m681() && i2 != -2147483648) {
                return i2;
            }
        }
        return this.f715;
    }

    public int getContentPaddingRight() {
        int i = this.f720;
        int i2 = this.f719;
        if (i2 != -2147483648 || i != -2147483648) {
            if (m681() && i2 != -2147483648) {
                return i2;
            }
            if (!m681() && i != -2147483648) {
                return i;
            }
        }
        return this.f717;
    }

    public final int getContentPaddingStart() {
        int i = this.f719;
        if (i != -2147483648) {
            return i;
        }
        return m681() ? this.f717 : this.f715;
    }

    public int getContentPaddingTop() {
        return this.f716;
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

    public C2677 getShapeAppearanceModel() {
        return this.f712;
    }

    public ColorStateList getStrokeColor() {
        return this.f710;
    }

    public float getStrokeWidth() {
        return this.f713;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f714, this.f708);
        if (this.f710 == null) {
            return;
        }
        float f = this.f713;
        Paint paint = this.f707;
        paint.setStrokeWidth(f);
        int colorForState = this.f710.getColorForState(getDrawableState(), this.f710.getDefaultColor());
        if (this.f713 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f709, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f721 && isLayoutDirectionResolved()) {
            this.f721 = true;
            if (!isPaddingRelative() && this.f719 == -2147483648 && this.f720 == -2147483648) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m682(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p000.InterfaceC2688
    public void setShapeAppearanceModel(C2677 c2677) {
        this.f712 = c2677;
        C1917 c1917 = this.f711;
        if (c1917 != null) {
            c1917.setShapeAppearanceModel(c2677);
        }
        m682(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f710 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AbstractC2203.m4030(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f713 != f) {
            this.f713 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m681() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m682(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.f705;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        C2677 c2677 = this.f712;
        C2679 c2679 = this.f704;
        Path path = this.f709;
        c2679.m4692(c2677, 1.0f, rectF, null, path);
        Path path2 = this.f714;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f706;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }
}
