package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴ能不能要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0947feyxiexzfUjhhgtg extends Drawable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public float f3798Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Paint f3799Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final RectF f3800Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f3801Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f3802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public ColorStateList f3805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public PorterDuffColorFilter f3806Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f3807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3803Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f3804Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public PorterDuff.Mode f3808Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;

    public C0947feyxiexzfUjhhgtg(ColorStateList colorStateList, float f) {
        this.f3798Ujhhgtgfeyxiexzf = f;
        Paint paint = new Paint(5);
        this.f3799Ujhhgtgfeyxiexzf = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f3805Ujhhgtgfeyxiexzf = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f3805Ujhhgtgfeyxiexzf.getDefaultColor()));
        this.f3800Ujhhgtgfeyxiexzf = new RectF();
        this.f3801Ujhhgtgfeyxiexzf = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f3806Ujhhgtgfeyxiexzf;
        Paint paint = this.f3799Ujhhgtgfeyxiexzf;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3806Ujhhgtgfeyxiexzf);
            z = true;
        }
        RectF rectF = this.f3800Ujhhgtgfeyxiexzf;
        float f = this.f3798Ujhhgtgfeyxiexzf;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f3801Ujhhgtgfeyxiexzf, this.f3798Ujhhgtgfeyxiexzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f3807Ujhhgtgfeyxiexzf;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3805Ujhhgtgfeyxiexzf;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2438Ujhhgtgfeyxiexzf(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3805Ujhhgtgfeyxiexzf;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f3799Ujhhgtgfeyxiexzf;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3807Ujhhgtgfeyxiexzf;
        if (colorStateList2 == null || (mode = this.f3808Ujhhgtgfeyxiexzf) == null) {
            return z;
        }
        this.f3806Ujhhgtgfeyxiexzf = m2437Ujhhgtgfeyxiexzf(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3799Ujhhgtgfeyxiexzf.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3799Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f3807Ujhhgtgfeyxiexzf = colorStateList;
        this.f3806Ujhhgtgfeyxiexzf = m2437Ujhhgtgfeyxiexzf(colorStateList, this.f3808Ujhhgtgfeyxiexzf);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f3808Ujhhgtgfeyxiexzf = mode;
        this.f3806Ujhhgtgfeyxiexzf = m2437Ujhhgtgfeyxiexzf(this.f3807Ujhhgtgfeyxiexzf, mode);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final PorterDuffColorFilter m2437Ujhhgtgfeyxiexzf(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2438Ujhhgtgfeyxiexzf(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f3800Ujhhgtgfeyxiexzf;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f3801Ujhhgtgfeyxiexzf;
        rect2.set(rect);
        if (this.f3803Ujhhgtgfeyxiexzf) {
            rect2.inset((int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2433Ujhhgtgfeyxiexzf(this.f3802Ujhhgtgfeyxiexzf, this.f3798Ujhhgtgfeyxiexzf, this.f3804Ujhhgtgfeyxiexzf)), (int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2434Ujhhgtgfeyxiexzf(this.f3802Ujhhgtgfeyxiexzf, this.f3798Ujhhgtgfeyxiexzf, this.f3804Ujhhgtgfeyxiexzf)));
            rectF.set(rect2);
        }
    }
}
