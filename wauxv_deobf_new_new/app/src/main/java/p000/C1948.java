package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲈᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1948 extends Drawable implements InterfaceC2749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final Paint f6436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1947 f6437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC2747[] f6438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC2747[] f6439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final BitSet f6440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f6441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Matrix f6442;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Path f6443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Path f6444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final RectF f6445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final RectF f6446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Region f6447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Region f6448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C2738 f6449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Paint f6450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Paint f6451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C2736 f6452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final C1681 f6453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2740 f6454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public PorterDuffColorFilter f6455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public PorterDuffColorFilter f6456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final RectF f6457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f6458;

    static {
        Paint paint = new Paint(1);
        f6436 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C1948() {
        this(new C2738());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.f6455;
        Paint paint = this.f6450;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f6437.f6429;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6456;
        Paint paint2 = this.f6451;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f6437.f6428);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f6437.f6429;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f6441;
        Path path = this.f6443;
        if (z) {
            float f = -(m3911() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C2738 c2738 = this.f6437.f6419;
            C2737 c2737M4728 = c2738.m4728();
            InterfaceC0873 c0156 = c2738.f8802;
            if (!(c0156 instanceof C2586)) {
                c0156 = new C0156(f, c0156);
            }
            c2737M4728.f8790 = c0156;
            InterfaceC0873 c0157 = c2738.f8803;
            if (!(c0157 instanceof C2586)) {
                c0157 = new C0156(f, c0157);
            }
            c2737M4728.f8791 = c0157;
            InterfaceC0873 c0158 = c2738.f8805;
            if (!(c0158 instanceof C2586)) {
                c0158 = new C0156(f, c0158);
            }
            c2737M4728.f8793 = c0158;
            InterfaceC0873 c0159 = c2738.f8804;
            if (!(c0159 instanceof C2586)) {
                c0159 = new C0156(f, c0159);
            }
            c2737M4728.f8792 = c0159;
            C2738 c2738M4722 = c2737M4728.m4722();
            this.f6449 = c2738M4722;
            float f2 = this.f6437.f6427;
            RectF rectFM3909 = m3909();
            RectF rectF = this.f6446;
            rectF.set(rectFM3909);
            float strokeWidth = m3911() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f6454.m4729(c2738M4722, f2, rectF, null, this.f6444);
            m3905(m3909(), path);
            this.f6441 = false;
        }
        C1947 c1947 = this.f6437;
        int i3 = c1947.f6432;
        if (i3 != 1 && c1947.f6433 > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!c1947.f6419.m4727(m3909()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    double d = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f6437.f6434)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f6437.f6434)));
                    if (!this.f6458) {
                        RectF rectF2 = this.f6457;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC2844.m4770(this.f6437.f6433, 2, (int) rectF2.width(), iWidth), AbstractC2844.m4770(this.f6437.f6433, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.f6437.f6433) - iWidth;
                        float f4 = (getBounds().top - this.f6437.f6433) - iHeight;
                        canvas2.translate(-f3, -f4);
                        m3907(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m3907(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.f6437.f6434)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f6437.f6434)));
                if (!this.f6458) {
                    RectF rectF3 = this.f6457;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                m3907(canvas);
                canvas.restore();
            }
        }
        C1947 c1948 = this.f6437;
        Paint.Style style = c1948.f6435;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m3908(canvas, paint, path, c1948.f6419, m3909());
        }
        if (m3911()) {
            mo2558(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6437.f6429;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6437;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C1947 c1947 = this.f6437;
        if (c1947.f6432 == 2) {
            return;
        }
        if (c1947.f6419.m4727(m3909())) {
            outline.setRoundRect(getBounds(), m3910() * this.f6437.f6427);
            return;
        }
        RectF rectFM3909 = m3909();
        Path path = this.f6443;
        m3905(rectFM3909, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC1110.m2822(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC1109.m2821(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1109.m2821(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6437.f6425;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f6447;
        region.set(bounds);
        RectF rectFM3909 = m3909();
        Path path = this.f6443;
        m3905(rectFM3909, path);
        Region region2 = this.f6448;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6441 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f6437.f6423;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f6437.getClass();
        ColorStateList colorStateList2 = this.f6437.f6422;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f6437.f6421;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6437 = new C1947(this.f6437);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6441 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p000.InterfaceC2965
    public boolean onStateChange(int[] iArr) {
        boolean z = m3919(iArr) || m3920();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1947 c1947 = this.f6437;
        if (c1947.f6429 != i) {
            c1947.f6429 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6437.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC2749
    public final void setShapeAppearanceModel(C2738 c2738) {
        this.f6437.f6419 = c2738;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6437.f6423 = colorStateList;
        m3920();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1947 c1947 = this.f6437;
        if (c1947.f6424 != mode) {
            c1947.f6424 = mode;
            m3920();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1580() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3905(RectF rectF, Path path) {
        C1947 c1947 = this.f6437;
        this.f6454.m4729(c1947.f6419, c1947.f6427, rectF, this.f6453, path);
        if (this.f6437.f6426 != 1.0f) {
            Matrix matrix = this.f6442;
            matrix.reset();
            float f = this.f6437.f6426;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f6457, true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3906(int i) {
        int i2;
        C1947 c1947 = this.f6437;
        float f = c1947.f6431 + 0.0f + c1947.f6430;
        C1142 c1142 = c1947.f6420;
        if (c1142 == null || !c1142.f4238 || AbstractC0747.m2326(i, 255) != c1142.f4241) {
            return i;
        }
        float f2 = c1142.f4242;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM3368 = AbstractC1470.m3368(AbstractC0747.m2326(i, 255), c1142.f4239, fMin);
        if (fMin > 0.0f && (i2 = c1142.f4240) != 0) {
            iM3368 = AbstractC0747.m2324(AbstractC0747.m2326(i2, C1142.f4237), iM3368);
        }
        return AbstractC0747.m2326(iM3368, iAlpha);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3907(Canvas canvas) {
        if (this.f6440.cardinality() > 0) {
            Log.w("ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲈᲀᛸᤝ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f6437.f6434;
        Path path = this.f6443;
        C2736 c2736 = this.f6452;
        if (i != 0) {
            canvas.drawPath(path, c2736.f8778);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC2747 abstractC2747 = this.f6438[i2];
            int i3 = this.f6437.f6433;
            Matrix matrix = AbstractC2747.f8839;
            abstractC2747.mo4731(matrix, c2736, i3, canvas);
            this.f6439[i2].mo4731(matrix, c2736, this.f6437.f6433, canvas);
        }
        if (this.f6458) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f6437.f6434));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f6437.f6434));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f6436);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3908(Canvas canvas, Paint paint, Path path, C2738 c2738, RectF rectF) {
        if (!c2738.m4727(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo1060 = c2738.f8803.mo1060(rectF) * this.f6437.f6427;
            canvas.drawRoundRect(rectF, fMo1060, fMo1060, paint);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo2558(Canvas canvas) {
        C2738 c2738 = this.f6449;
        RectF rectFM3909 = m3909();
        RectF rectF = this.f6446;
        rectF.set(rectFM3909);
        boolean zM3911 = m3911();
        Paint paint = this.f6451;
        float strokeWidth = zM3911 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m3908(canvas, paint, this.f6444, c2738, rectF);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final RectF m3909() {
        Rect bounds = getBounds();
        RectF rectF = this.f6445;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float m3910() {
        return this.f6437.f6419.f8802.mo1060(m3909());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m3911() {
        Paint.Style style = this.f6437.f6435;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6451.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3912(Context context) {
        this.f6437.f6420 = new C1142(context);
        m3921();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3913(float f) {
        C1947 c1947 = this.f6437;
        if (c1947.f6431 != f) {
            c1947.f6431 = f;
            m3921();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3914(ColorStateList colorStateList) {
        C1947 c1947 = this.f6437;
        if (c1947.f6421 != colorStateList) {
            c1947.f6421 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3915(float f) {
        C1947 c1947 = this.f6437;
        if (c1947.f6427 != f) {
            c1947.f6427 = f;
            this.f6441 = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3916() {
        this.f6452.m4721(-12303292);
        this.f6437.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3917() {
        C1947 c1947 = this.f6437;
        if (c1947.f6432 != 2) {
            c1947.f6432 = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3918(ColorStateList colorStateList) {
        C1947 c1947 = this.f6437;
        if (c1947.f6422 != colorStateList) {
            c1947.f6422 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m3919(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6437.f6421 == null || color2 == (colorForState2 = this.f6437.f6421.getColorForState(iArr, (color2 = (paint2 = this.f6450).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f6437.f6422 == null || color == (colorForState = this.f6437.f6422.getColorForState(iArr, (color = (paint = this.f6451).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean m3920() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6455;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f6456;
        C1947 c1947 = this.f6437;
        ColorStateList colorStateList = c1947.f6423;
        PorterDuff.Mode mode = c1947.f6424;
        if (colorStateList == null || mode == null) {
            int color = this.f6450.getColor();
            int iM3906 = m3906(color);
            porterDuffColorFilter = iM3906 != color ? new PorterDuffColorFilter(iM3906, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m3906(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f6455 = porterDuffColorFilter;
        this.f6437.getClass();
        this.f6456 = null;
        this.f6437.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f6455) && Objects.equals(porterDuffColorFilter3, this.f6456)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m3921() {
        C1947 c1947 = this.f6437;
        float f = c1947.f6431 + 0.0f;
        c1947.f6433 = (int) Math.ceil(0.75f * f);
        this.f6437.f6434 = (int) Math.ceil(f * 0.25f);
        m3920();
        super.invalidateSelf();
    }

    public C1948(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2738.m4725(context, attributeSet, i, i2).m4722());
    }

    public C1948(C2738 c2738) {
        this(new C1947(c2738));
    }

    public C1948(C1947 c1947) {
        C2740 c2740;
        this.f6438 = new AbstractC2747[4];
        this.f6439 = new AbstractC2747[4];
        this.f6440 = new BitSet(8);
        this.f6442 = new Matrix();
        this.f6443 = new Path();
        this.f6444 = new Path();
        this.f6445 = new RectF();
        this.f6446 = new RectF();
        this.f6447 = new Region();
        this.f6448 = new Region();
        Paint paint = new Paint(1);
        this.f6450 = paint;
        Paint paint2 = new Paint(1);
        this.f6451 = paint2;
        this.f6452 = new C2736();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c2740 = AbstractC2739.f8810;
        } else {
            c2740 = new C2740();
        }
        this.f6454 = c2740;
        this.f6457 = new RectF();
        this.f6458 = true;
        this.f6437 = c1947;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m3920();
        m3919(getState());
        this.f6453 = new C1681(this);
    }
}
