package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1888feyxiexzfUjhhgtg extends AbstractC1852Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final PorterDuff.Mode f6321Ujhhgtgfeyxiexzf = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C1881feyxiexzfUjhhgtg f6322Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public PorterDuffColorFilter f6323Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public ColorFilter f6324Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f6325Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f6326Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final float[] f6327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Matrix f6328Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Rect f6329Ujhhgtgfeyxiexzf;

    public C1888feyxiexzfUjhhgtg() {
        this.f6326Ujhhgtgfeyxiexzf = true;
        this.f6327Ujhhgtgfeyxiexzf = new float[9];
        this.f6328Ujhhgtgfeyxiexzf = new Matrix();
        this.f6329Ujhhgtgfeyxiexzf = new Rect();
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = new C1881feyxiexzfUjhhgtg();
        c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf = null;
        c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf = f6321Ujhhgtgfeyxiexzf;
        c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf = new C1878feyxiexzfUjhhgtg();
        this.f6322Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f6329Ujhhgtgfeyxiexzf;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6324Ujhhgtgfeyxiexzf;
        if (colorFilter == null) {
            colorFilter = this.f6323Ujhhgtgfeyxiexzf;
        }
        Matrix matrix = this.f6328Ujhhgtgfeyxiexzf;
        canvas.getMatrix(matrix);
        float[] fArr = this.f6327Ujhhgtgfeyxiexzf;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        Bitmap bitmap = c1881feyxiexzfUjhhgtg.f6286Ujhhgtgfeyxiexzf;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c1881feyxiexzfUjhhgtg.f6286Ujhhgtgfeyxiexzf.getHeight()) {
            c1881feyxiexzfUjhhgtg.f6286Ujhhgtgfeyxiexzf = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c1881feyxiexzfUjhhgtg.f6291Ujhhgtgfeyxiexzf = true;
        }
        if (this.f6326Ujhhgtgfeyxiexzf) {
            C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg2 = this.f6322Ujhhgtgfeyxiexzf;
            if (c1881feyxiexzfUjhhgtg2.f6291Ujhhgtgfeyxiexzf || c1881feyxiexzfUjhhgtg2.f6287Ujhhgtgfeyxiexzf != c1881feyxiexzfUjhhgtg2.f6283Ujhhgtgfeyxiexzf || c1881feyxiexzfUjhhgtg2.f6288Ujhhgtgfeyxiexzf != c1881feyxiexzfUjhhgtg2.f6284Ujhhgtgfeyxiexzf || c1881feyxiexzfUjhhgtg2.f6290Ujhhgtgfeyxiexzf != c1881feyxiexzfUjhhgtg2.f6285Ujhhgtgfeyxiexzf || c1881feyxiexzfUjhhgtg2.f6289Ujhhgtgfeyxiexzf != c1881feyxiexzfUjhhgtg2.f6282Ujhhgtgfeyxiexzf.getRootAlpha()) {
                C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg3 = this.f6322Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg3.f6286Ujhhgtgfeyxiexzf.eraseColor(0);
                Canvas canvas2 = new Canvas(c1881feyxiexzfUjhhgtg3.f6286Ujhhgtgfeyxiexzf);
                C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg = c1881feyxiexzfUjhhgtg3.f6282Ujhhgtgfeyxiexzf;
                c1878feyxiexzfUjhhgtg.m3206Ujhhgtgfeyxiexzf(c1878feyxiexzfUjhhgtg.f6268Ujhhgtgfeyxiexzf, C1878feyxiexzfUjhhgtg.f6261Ujhhgtgfeyxiexzf, canvas2, iMin, iMin2);
                C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg4 = this.f6322Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg4.f6287Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg4.f6283Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg4.f6288Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg4.f6284Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg4.f6289Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg4.f6282Ujhhgtgfeyxiexzf.getRootAlpha();
                c1881feyxiexzfUjhhgtg4.f6290Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg4.f6285Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg4.f6291Ujhhgtgfeyxiexzf = false;
            }
        } else {
            C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg5 = this.f6322Ujhhgtgfeyxiexzf;
            c1881feyxiexzfUjhhgtg5.f6286Ujhhgtgfeyxiexzf.eraseColor(0);
            Canvas canvas3 = new Canvas(c1881feyxiexzfUjhhgtg5.f6286Ujhhgtgfeyxiexzf);
            C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg2 = c1881feyxiexzfUjhhgtg5.f6282Ujhhgtgfeyxiexzf;
            c1878feyxiexzfUjhhgtg2.m3206Ujhhgtgfeyxiexzf(c1878feyxiexzfUjhhgtg2.f6268Ujhhgtgfeyxiexzf, C1878feyxiexzfUjhhgtg.f6261Ujhhgtgfeyxiexzf, canvas3, iMin, iMin2);
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg6 = this.f6322Ujhhgtgfeyxiexzf;
        if (c1881feyxiexzfUjhhgtg6.f6282Ujhhgtgfeyxiexzf.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1881feyxiexzfUjhhgtg6.f6292Ujhhgtgfeyxiexzf == null) {
                Paint paint2 = new Paint();
                c1881feyxiexzfUjhhgtg6.f6292Ujhhgtgfeyxiexzf = paint2;
                paint2.setFilterBitmap(true);
            }
            c1881feyxiexzfUjhhgtg6.f6292Ujhhgtgfeyxiexzf.setAlpha(c1881feyxiexzfUjhhgtg6.f6282Ujhhgtgfeyxiexzf.getRootAlpha());
            c1881feyxiexzfUjhhgtg6.f6292Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
            paint = c1881feyxiexzfUjhhgtg6.f6292Ujhhgtgfeyxiexzf;
        }
        canvas.drawBitmap(c1881feyxiexzfUjhhgtg6.f6286Ujhhgtgfeyxiexzf, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getAlpha() : this.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6322Ujhhgtgfeyxiexzf.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getColorFilter() : this.f6324Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6219Ujhhgtgfeyxiexzf != null) {
            return new C1880feyxiexzfUjhhgtg(this.f6219Ujhhgtgfeyxiexzf.getConstantState());
        }
        this.f6322Ujhhgtgfeyxiexzf.f6281Ujhhgtgfeyxiexzf = getChangingConfigurations();
        return this.f6322Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.f6270Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.f6269Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.isAutoMirrored() : this.f6322Ujhhgtgfeyxiexzf.f6285Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        if (c1881feyxiexzfUjhhgtg == null) {
            return false;
        }
        C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg = c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf;
        if (c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf == null) {
            c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf = Boolean.valueOf(c1878feyxiexzfUjhhgtg.f6268Ujhhgtgfeyxiexzf.mo3175Ujhhgtgfeyxiexzf());
        }
        if (c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f6322Ujhhgtgfeyxiexzf.f6283Ujhhgtgfeyxiexzf;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6325Ujhhgtgfeyxiexzf && super.mutate() == this) {
            C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
            C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg2 = new C1881feyxiexzfUjhhgtg();
            c1881feyxiexzfUjhhgtg2.f6283Ujhhgtgfeyxiexzf = null;
            c1881feyxiexzfUjhhgtg2.f6284Ujhhgtgfeyxiexzf = f6321Ujhhgtgfeyxiexzf;
            if (c1881feyxiexzfUjhhgtg != null) {
                c1881feyxiexzfUjhhgtg2.f6281Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg.f6281Ujhhgtgfeyxiexzf;
                C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg = new C1878feyxiexzfUjhhgtg(c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf);
                c1881feyxiexzfUjhhgtg2.f6282Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg;
                if (c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf.f6266Ujhhgtgfeyxiexzf != null) {
                    c1878feyxiexzfUjhhgtg.f6266Ujhhgtgfeyxiexzf = new Paint(c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf.f6266Ujhhgtgfeyxiexzf);
                }
                if (c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf.f6265Ujhhgtgfeyxiexzf != null) {
                    c1881feyxiexzfUjhhgtg2.f6282Ujhhgtgfeyxiexzf.f6265Ujhhgtgfeyxiexzf = new Paint(c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf.f6265Ujhhgtgfeyxiexzf);
                }
                c1881feyxiexzfUjhhgtg2.f6283Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg2.f6284Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf;
                c1881feyxiexzfUjhhgtg2.f6285Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg.f6285Ujhhgtgfeyxiexzf;
            }
            this.f6322Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg2;
            this.f6325Ujhhgtgfeyxiexzf = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList = c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf;
        if (colorStateList == null || (mode = c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf) == null) {
            z = false;
        } else {
            this.f6323Ujhhgtgfeyxiexzf = m3217Ujhhgtgfeyxiexzf(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg = c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf;
        if (c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf == null) {
            c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf = Boolean.valueOf(c1878feyxiexzfUjhhgtg.f6268Ujhhgtgfeyxiexzf.mo3175Ujhhgtgfeyxiexzf());
        }
        if (c1878feyxiexzfUjhhgtg.f6275Ujhhgtgfeyxiexzf.booleanValue()) {
            boolean zMo3176Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf.f6268Ujhhgtgfeyxiexzf.mo3176Ujhhgtgfeyxiexzf(iArr);
            c1881feyxiexzfUjhhgtg.f6291Ujhhgtgfeyxiexzf |= zMo3176Ujhhgtgfeyxiexzf;
            if (zMo3176Ujhhgtgfeyxiexzf) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.getRootAlpha() != i) {
            this.f6322Ujhhgtgfeyxiexzf.f6282Ujhhgtgfeyxiexzf.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f6322Ujhhgtgfeyxiexzf.f6285Ujhhgtgfeyxiexzf = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6324Ujhhgtgfeyxiexzf = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        if (c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf != colorStateList) {
            c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf = colorStateList;
            this.f6323Ujhhgtgfeyxiexzf = m3217Ujhhgtgfeyxiexzf(colorStateList, c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        if (c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf != mode) {
            c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf = mode;
            this.f6323Ujhhgtgfeyxiexzf = m3217Ujhhgtgfeyxiexzf(c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final PorterDuffColorFilter m3217Ujhhgtgfeyxiexzf(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f6219Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg = this.f6322Ujhhgtgfeyxiexzf;
        c1881feyxiexzfUjhhgtg.f6282Ujhhgtgfeyxiexzf = new C1878feyxiexzfUjhhgtg();
        TypedArray typedArrayM4521Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10962Ujhhgtgfeyxiexzf);
        C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg2 = this.f6322Ujhhgtgfeyxiexzf;
        C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg = c1881feyxiexzfUjhhgtg2.f6282Ujhhgtgfeyxiexzf;
        int i3 = !C3052Ujhhgtgfeyxiexzf.m4519Ujhhgtgfeyxiexzf(xmlPullParser, "tintMode") ? -1 : typedArrayM4521Ujhhgtgfeyxiexzf.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case Opcodes.DCONST_0 /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1881feyxiexzfUjhhgtg2.f6284Ujhhgtgfeyxiexzf = mode;
        ColorStateList colorStateListM4263Ujhhgtgfeyxiexzf = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM4521Ujhhgtgfeyxiexzf.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM4263Ujhhgtgfeyxiexzf = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM4521Ujhhgtgfeyxiexzf.getResources();
                int resourceId = typedArrayM4521Ujhhgtgfeyxiexzf.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC2858Ujhhgtgfeyxiexzf.f9117Ujhhgtgfeyxiexzf;
                try {
                    colorStateListM4263Ujhhgtgfeyxiexzf = AbstractC2858Ujhhgtgfeyxiexzf.m4263Ujhhgtgfeyxiexzf(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM4263Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            c1881feyxiexzfUjhhgtg2.f6283Ujhhgtgfeyxiexzf = colorStateList;
        }
        boolean z = c1881feyxiexzfUjhhgtg2.f6285Ujhhgtgfeyxiexzf;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM4521Ujhhgtgfeyxiexzf.getBoolean(5, z);
        }
        c1881feyxiexzfUjhhgtg2.f6285Ujhhgtgfeyxiexzf = z;
        float f = c1878feyxiexzfUjhhgtg.f6271Ujhhgtgfeyxiexzf;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(7, f);
        }
        c1878feyxiexzfUjhhgtg.f6271Ujhhgtgfeyxiexzf = f;
        float f2 = c1878feyxiexzfUjhhgtg.f6272Ujhhgtgfeyxiexzf;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(8, f2);
        }
        c1878feyxiexzfUjhhgtg.f6272Ujhhgtgfeyxiexzf = f2;
        if (c1878feyxiexzfUjhhgtg.f6271Ujhhgtgfeyxiexzf <= 0.0f) {
            throw new XmlPullParserException(typedArrayM4521Ujhhgtgfeyxiexzf.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c1878feyxiexzfUjhhgtg.f6269Ujhhgtgfeyxiexzf = typedArrayM4521Ujhhgtgfeyxiexzf.getDimension(3, c1878feyxiexzfUjhhgtg.f6269Ujhhgtgfeyxiexzf);
            float dimension = typedArrayM4521Ujhhgtgfeyxiexzf.getDimension(2, c1878feyxiexzfUjhhgtg.f6270Ujhhgtgfeyxiexzf);
            c1878feyxiexzfUjhhgtg.f6270Ujhhgtgfeyxiexzf = dimension;
            if (c1878feyxiexzfUjhhgtg.f6269Ujhhgtgfeyxiexzf <= 0.0f) {
                throw new XmlPullParserException(typedArrayM4521Ujhhgtgfeyxiexzf.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1878feyxiexzfUjhhgtg.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(4, alpha);
                }
                c1878feyxiexzfUjhhgtg.setAlpha(alpha);
                String string = typedArrayM4521Ujhhgtgfeyxiexzf.getString(0);
                if (string != null) {
                    c1878feyxiexzfUjhhgtg.f6274Ujhhgtgfeyxiexzf = string;
                    c1878feyxiexzfUjhhgtg.f6276Ujhhgtgfeyxiexzf.put(string, c1878feyxiexzfUjhhgtg);
                }
                typedArrayM4521Ujhhgtgfeyxiexzf.recycle();
                c1881feyxiexzfUjhhgtg.f6281Ujhhgtgfeyxiexzf = getChangingConfigurations();
                c1881feyxiexzfUjhhgtg.f6291Ujhhgtgfeyxiexzf = true;
                C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg3 = this.f6322Ujhhgtgfeyxiexzf;
                C1878feyxiexzfUjhhgtg c1878feyxiexzfUjhhgtg2 = c1881feyxiexzfUjhhgtg3.f6282Ujhhgtgfeyxiexzf;
                ArrayDeque arrayDeque = new ArrayDeque();
                C1882feyxiexzfUjhhgtg c1882feyxiexzfUjhhgtg = c1878feyxiexzfUjhhgtg2.f6268Ujhhgtgfeyxiexzf;
                C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = c1878feyxiexzfUjhhgtg2.f6276Ujhhgtgfeyxiexzf;
                arrayDeque.push(c1882feyxiexzfUjhhgtg);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1882feyxiexzfUjhhgtg c1882feyxiexzfUjhhgtg2 = (C1882feyxiexzfUjhhgtg) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            C1849Ujhhgtgfeyxiexzf c1849Ujhhgtgfeyxiexzf = new C1849Ujhhgtgfeyxiexzf();
                            c1849Ujhhgtgfeyxiexzf.f6192Ujhhgtgfeyxiexzf = 0.0f;
                            c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf = 1.0f;
                            c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf = 1.0f;
                            c1849Ujhhgtgfeyxiexzf.f6196Ujhhgtgfeyxiexzf = 0.0f;
                            c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf = 1.0f;
                            c1849Ujhhgtgfeyxiexzf.f6198Ujhhgtgfeyxiexzf = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1849Ujhhgtgfeyxiexzf.f6199Ujhhgtgfeyxiexzf = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c1849Ujhhgtgfeyxiexzf.f6200Ujhhgtgfeyxiexzf = join2;
                            c1849Ujhhgtgfeyxiexzf.f6201Ujhhgtgfeyxiexzf = 4.0f;
                            TypedArray typedArrayM4521Ujhhgtgfeyxiexzf2 = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10964Ujhhgtgfeyxiexzf);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM4521Ujhhgtgfeyxiexzf2.getString(0);
                                if (string2 != null) {
                                    c1849Ujhhgtgfeyxiexzf.f6278Ujhhgtgfeyxiexzf = string2;
                                }
                                String string3 = typedArrayM4521Ujhhgtgfeyxiexzf2.getString(2);
                                if (string3 != null) {
                                    c1849Ujhhgtgfeyxiexzf.f6277Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4202feyxiexzfUjhhgtg(string3);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6193Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4518Ujhhgtgfeyxiexzf(typedArrayM4521Ujhhgtgfeyxiexzf2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(12, f3);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6195Ujhhgtgfeyxiexzf = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM4521Ujhhgtgfeyxiexzf2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c1849Ujhhgtgfeyxiexzf.f6199Ujhhgtgfeyxiexzf;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c1849Ujhhgtgfeyxiexzf.f6199Ujhhgtgfeyxiexzf = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM4521Ujhhgtgfeyxiexzf2.getInt(9, -1) : -1;
                                Paint.Join join3 = c1849Ujhhgtgfeyxiexzf.f6200Ujhhgtgfeyxiexzf;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c1849Ujhhgtgfeyxiexzf.f6200Ujhhgtgfeyxiexzf = join;
                                float f4 = c1849Ujhhgtgfeyxiexzf.f6201Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(10, f4);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6201Ujhhgtgfeyxiexzf = f4;
                                c1849Ujhhgtgfeyxiexzf.f6191Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4518Ujhhgtgfeyxiexzf(typedArrayM4521Ujhhgtgfeyxiexzf2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(11, f5);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6194Ujhhgtgfeyxiexzf = f5;
                                float f6 = c1849Ujhhgtgfeyxiexzf.f6192Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(4, f6);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6192Ujhhgtgfeyxiexzf = f6;
                                float f7 = c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(6, f7);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6197Ujhhgtgfeyxiexzf = f7;
                                float f8 = c1849Ujhhgtgfeyxiexzf.f6198Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(7, f8);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6198Ujhhgtgfeyxiexzf = f8;
                                float f9 = c1849Ujhhgtgfeyxiexzf.f6196Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(5, f9);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6196Ujhhgtgfeyxiexzf = f9;
                                int i8 = c1849Ujhhgtgfeyxiexzf.f6279Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM4521Ujhhgtgfeyxiexzf2.getInt(13, i8);
                                }
                                c1849Ujhhgtgfeyxiexzf.f6279Ujhhgtgfeyxiexzf = i8;
                            }
                            typedArrayM4521Ujhhgtgfeyxiexzf2.recycle();
                            c1882feyxiexzfUjhhgtg2.f6294Ujhhgtgfeyxiexzf.add(c1849Ujhhgtgfeyxiexzf);
                            if (c1849Ujhhgtgfeyxiexzf.getPathName() != null) {
                                c2412Ujhhgtgfeyxiexzf.put(c1849Ujhhgtgfeyxiexzf.getPathName(), c1849Ujhhgtgfeyxiexzf);
                            }
                            c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C1848Ujhhgtgfeyxiexzf c1848Ujhhgtgfeyxiexzf = new C1848Ujhhgtgfeyxiexzf();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM4521Ujhhgtgfeyxiexzf3 = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10965Ujhhgtgfeyxiexzf);
                                    String string4 = typedArrayM4521Ujhhgtgfeyxiexzf3.getString(0);
                                    if (string4 != null) {
                                        c1848Ujhhgtgfeyxiexzf.f6278Ujhhgtgfeyxiexzf = string4;
                                    }
                                    String string5 = typedArrayM4521Ujhhgtgfeyxiexzf3.getString(1);
                                    if (string5 != null) {
                                        c1848Ujhhgtgfeyxiexzf.f6277Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4202feyxiexzfUjhhgtg(string5);
                                    }
                                    c1848Ujhhgtgfeyxiexzf.f6279Ujhhgtgfeyxiexzf = !C3052Ujhhgtgfeyxiexzf.m4519Ujhhgtgfeyxiexzf(xmlPullParser, "fillType") ? 0 : typedArrayM4521Ujhhgtgfeyxiexzf3.getInt(2, 0);
                                    typedArrayM4521Ujhhgtgfeyxiexzf3.recycle();
                                }
                                c1882feyxiexzfUjhhgtg2.f6294Ujhhgtgfeyxiexzf.add(c1848Ujhhgtgfeyxiexzf);
                                if (c1848Ujhhgtgfeyxiexzf.getPathName() != null) {
                                    c2412Ujhhgtgfeyxiexzf.put(c1848Ujhhgtgfeyxiexzf.getPathName(), c1848Ujhhgtgfeyxiexzf);
                                }
                                c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf;
                            } else if ("group".equals(name)) {
                                C1882feyxiexzfUjhhgtg c1882feyxiexzfUjhhgtg3 = new C1882feyxiexzfUjhhgtg();
                                TypedArray typedArrayM4521Ujhhgtgfeyxiexzf4 = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSet, AbstractC3516feyxiexzfUjhhgtg.f10963Ujhhgtgfeyxiexzf);
                                float f10 = c1882feyxiexzfUjhhgtg3.f6295Ujhhgtgfeyxiexzf;
                                if (C3052Ujhhgtgfeyxiexzf.m4519Ujhhgtgfeyxiexzf(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(5, f10);
                                }
                                c1882feyxiexzfUjhhgtg3.f6295Ujhhgtgfeyxiexzf = f10;
                                c1882feyxiexzfUjhhgtg3.f6296Ujhhgtgfeyxiexzf = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(1, c1882feyxiexzfUjhhgtg3.f6296Ujhhgtgfeyxiexzf);
                                c1882feyxiexzfUjhhgtg3.f6297Ujhhgtgfeyxiexzf = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(2, c1882feyxiexzfUjhhgtg3.f6297Ujhhgtgfeyxiexzf);
                                float f11 = c1882feyxiexzfUjhhgtg3.f6298Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(3, f11);
                                }
                                c1882feyxiexzfUjhhgtg3.f6298Ujhhgtgfeyxiexzf = f11;
                                float f12 = c1882feyxiexzfUjhhgtg3.f6299Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(4, f12);
                                }
                                c1882feyxiexzfUjhhgtg3.f6299Ujhhgtgfeyxiexzf = f12;
                                float f13 = c1882feyxiexzfUjhhgtg3.f6300Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(6, f13);
                                }
                                c1882feyxiexzfUjhhgtg3.f6300Ujhhgtgfeyxiexzf = f13;
                                float f14 = c1882feyxiexzfUjhhgtg3.f6301Ujhhgtgfeyxiexzf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM4521Ujhhgtgfeyxiexzf4.getFloat(7, f14);
                                }
                                c1882feyxiexzfUjhhgtg3.f6301Ujhhgtgfeyxiexzf = f14;
                                String string6 = typedArrayM4521Ujhhgtgfeyxiexzf4.getString(0);
                                if (string6 != null) {
                                    c1882feyxiexzfUjhhgtg3.f6303Ujhhgtgfeyxiexzf = string6;
                                }
                                c1882feyxiexzfUjhhgtg3.m3207Ujhhgtgfeyxiexzf();
                                typedArrayM4521Ujhhgtgfeyxiexzf4.recycle();
                                c1882feyxiexzfUjhhgtg2.f6294Ujhhgtgfeyxiexzf.add(c1882feyxiexzfUjhhgtg3);
                                arrayDeque.push(c1882feyxiexzfUjhhgtg3);
                                if (c1882feyxiexzfUjhhgtg3.getGroupName() != null) {
                                    c2412Ujhhgtgfeyxiexzf.put(c1882feyxiexzfUjhhgtg3.getGroupName(), c1882feyxiexzfUjhhgtg3);
                                }
                                c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg3.f6281Ujhhgtgfeyxiexzf;
                            }
                        }
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.f6323Ujhhgtgfeyxiexzf = m3217Ujhhgtgfeyxiexzf(c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf, c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM4521Ujhhgtgfeyxiexzf.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM4521Ujhhgtgfeyxiexzf.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1888feyxiexzfUjhhgtg(C1881feyxiexzfUjhhgtg c1881feyxiexzfUjhhgtg) {
        this.f6326Ujhhgtgfeyxiexzf = true;
        this.f6327Ujhhgtgfeyxiexzf = new float[9];
        this.f6328Ujhhgtgfeyxiexzf = new Matrix();
        this.f6329Ujhhgtgfeyxiexzf = new Rect();
        this.f6322Ujhhgtgfeyxiexzf = c1881feyxiexzfUjhhgtg;
        this.f6323Ujhhgtgfeyxiexzf = m3217Ujhhgtgfeyxiexzf(c1881feyxiexzfUjhhgtg.f6283Ujhhgtgfeyxiexzf, c1881feyxiexzfUjhhgtg.f6284Ujhhgtgfeyxiexzf);
    }
}
