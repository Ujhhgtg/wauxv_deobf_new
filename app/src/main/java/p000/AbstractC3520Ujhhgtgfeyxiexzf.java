package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3520Ujhhgtgfeyxiexzf extends AbstractC0086Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f10998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final Rect f10999Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final Rect f11000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f11001Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f11002Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f11003Ujhhgtgfeyxiexzf;

    public AbstractC3520Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10999Ujhhgtgfeyxiexzf = new Rect();
        this.f11000Ujhhgtgfeyxiexzf = new Rect();
        this.f11001Ujhhgtgfeyxiexzf = Opcodes.DNEG;
        this.f11002Ujhhgtgfeyxiexzf = true;
        this.f11003Ujhhgtgfeyxiexzf = false;
        AbstractC1243feyxiexzfUjhhgtg.m2730Ujhhgtgfeyxiexzf(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0799feyxiexzfUjhhgtg.f3128Ujhhgtgfeyxiexzf;
        AbstractC1243feyxiexzfUjhhgtg.m2731Ujhhgtgfeyxiexzf(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f11001Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(1, this.f11001Ujhhgtgfeyxiexzf);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f11002Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f10998Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            if (this.f11003Ujhhgtgfeyxiexzf) {
                this.f11003Ujhhgtgfeyxiexzf = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f11002Ujhhgtgfeyxiexzf;
                Rect rect = this.f10999Ujhhgtgfeyxiexzf;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f11001Ujhhgtgfeyxiexzf;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f11000Ujhhgtgfeyxiexzf;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f10998Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10998Ujhhgtgfeyxiexzf;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f10998Ujhhgtgfeyxiexzf.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f10998Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f11001Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10998Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.AbstractC0086Ujhhgtgfeyxiexzf, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11003Ujhhgtgfeyxiexzf = z | this.f11003Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11003Ujhhgtgfeyxiexzf = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f10998Ujhhgtgfeyxiexzf;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f10998Ujhhgtgfeyxiexzf);
            }
            this.f10998Ujhhgtgfeyxiexzf = drawable;
            this.f11003Ujhhgtgfeyxiexzf = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f11001Ujhhgtgfeyxiexzf == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f11001Ujhhgtgfeyxiexzf != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f11001Ujhhgtgfeyxiexzf = i;
            if (i == 119 && this.f10998Ujhhgtgfeyxiexzf != null) {
                this.f10998Ujhhgtgfeyxiexzf.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10998Ujhhgtgfeyxiexzf;
    }
}
