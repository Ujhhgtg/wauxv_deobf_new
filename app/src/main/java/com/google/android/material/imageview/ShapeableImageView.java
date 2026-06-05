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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1016feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C1002feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C1024feyxiexzfUjhhgtg;
import p000.C2343Ujhhgtgfeyxiexzf;
import p000.InterfaceC1006feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends C2343Ujhhgtgfeyxiexzf implements InterfaceC1006feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C1024feyxiexzfUjhhgtg f784Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final RectF f785Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final RectF f786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Paint f787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Paint f788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Path f789Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f790Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public C0226Ujhhgtgfeyxiexzf f791Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public C1017feyxiexzfUjhhgtg f792Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Path f794Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f795Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f796Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int f797Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f798Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f799Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f800Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f801Ujhhgtgfeyxiexzf;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f784Ujhhgtgfeyxiexzf = AbstractC1016feyxiexzfUjhhgtg.f3972Ujhhgtgfeyxiexzf;
        this.f789Ujhhgtgfeyxiexzf = new Path();
        this.f801Ujhhgtgfeyxiexzf = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f788Ujhhgtgfeyxiexzf = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f785Ujhhgtgfeyxiexzf = new RectF();
        this.f786Ujhhgtgfeyxiexzf = new RectF();
        this.f794Ujhhgtgfeyxiexzf = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3144feyxiexzfUjhhgtg, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f790Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 9);
        this.f793Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f795Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f796Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f797Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f798Ujhhgtgfeyxiexzf = dimensionPixelSize;
        this.f795Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f796Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f797Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f798Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f799Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f800Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f787Ujhhgtgfeyxiexzf = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f792Ujhhgtgfeyxiexzf = C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m2507Ujhhgtgfeyxiexzf();
        setOutlineProvider(new C1002feyxiexzfUjhhgtg(this));
    }

    public int getContentPaddingBottom() {
        return this.f798Ujhhgtgfeyxiexzf;
    }

    public final int getContentPaddingEnd() {
        int i = this.f800Ujhhgtgfeyxiexzf;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m824Ujhhgtgfeyxiexzf() ? this.f795Ujhhgtgfeyxiexzf : this.f797Ujhhgtgfeyxiexzf;
    }

    public int getContentPaddingLeft() {
        int i = this.f800Ujhhgtgfeyxiexzf;
        int i2 = this.f799Ujhhgtgfeyxiexzf;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m824Ujhhgtgfeyxiexzf() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!m824Ujhhgtgfeyxiexzf() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f795Ujhhgtgfeyxiexzf;
    }

    public int getContentPaddingRight() {
        int i = this.f800Ujhhgtgfeyxiexzf;
        int i2 = this.f799Ujhhgtgfeyxiexzf;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m824Ujhhgtgfeyxiexzf() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m824Ujhhgtgfeyxiexzf() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f797Ujhhgtgfeyxiexzf;
    }

    public final int getContentPaddingStart() {
        int i = this.f799Ujhhgtgfeyxiexzf;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m824Ujhhgtgfeyxiexzf() ? this.f797Ujhhgtgfeyxiexzf : this.f795Ujhhgtgfeyxiexzf;
    }

    public int getContentPaddingTop() {
        return this.f796Ujhhgtgfeyxiexzf;
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

    public C1017feyxiexzfUjhhgtg getShapeAppearanceModel() {
        return this.f792Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getStrokeColor() {
        return this.f790Ujhhgtgfeyxiexzf;
    }

    public float getStrokeWidth() {
        return this.f793Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f794Ujhhgtgfeyxiexzf, this.f788Ujhhgtgfeyxiexzf);
        if (this.f790Ujhhgtgfeyxiexzf == null) {
            return;
        }
        float f = this.f793Ujhhgtgfeyxiexzf;
        Paint paint = this.f787Ujhhgtgfeyxiexzf;
        paint.setStrokeWidth(f);
        int colorForState = this.f790Ujhhgtgfeyxiexzf.getColorForState(getDrawableState(), this.f790Ujhhgtgfeyxiexzf.getDefaultColor());
        if (this.f793Ujhhgtgfeyxiexzf <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f789Ujhhgtgfeyxiexzf, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f801Ujhhgtgfeyxiexzf && isLayoutDirectionResolved()) {
            this.f801Ujhhgtgfeyxiexzf = true;
            if (!isPaddingRelative() && this.f799Ujhhgtgfeyxiexzf == Integer.MIN_VALUE && this.f800Ujhhgtgfeyxiexzf == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m825Ujhhgtgfeyxiexzf(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p000.InterfaceC1006feyxiexzfUjhhgtg
    public void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f792Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f791Ujhhgtgfeyxiexzf;
        if (c0226Ujhhgtgfeyxiexzf != null) {
            c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        }
        m825Ujhhgtgfeyxiexzf(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f790Ujhhgtgfeyxiexzf = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f793Ujhhgtgfeyxiexzf != f) {
            this.f793Ujhhgtgfeyxiexzf = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m824Ujhhgtgfeyxiexzf() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m825Ujhhgtgfeyxiexzf(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.f785Ujhhgtgfeyxiexzf;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f792Ujhhgtgfeyxiexzf;
        C1024feyxiexzfUjhhgtg c1024feyxiexzfUjhhgtg = this.f784Ujhhgtgfeyxiexzf;
        Path path = this.f789Ujhhgtgfeyxiexzf;
        c1024feyxiexzfUjhhgtg.m2520Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg, 1.0f, rectF, null, path);
        Path path2 = this.f794Ujhhgtgfeyxiexzf;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f786Ujhhgtgfeyxiexzf;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }
}
