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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴ能不能ᛳ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0226Ujhhgtgfeyxiexzf extends Drawable implements InterfaceC1006feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Paint f1526feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0223Ujhhgtgfeyxiexzf f1527Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC1004feyxiexzfUjhhgtg[] f1528Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC1004feyxiexzfUjhhgtg[] f1529Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final BitSet f1530Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f1531Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Matrix f1532Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Path f1533Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Path f1534Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final RectF f1535Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f1536Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Region f1537Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Region f1538Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C1017feyxiexzfUjhhgtg f1539Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Paint f1540Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final Paint f1541Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C1015feyxiexzfUjhhgtg f1542Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f1543Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final C1024feyxiexzfUjhhgtg f1544Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public PorterDuffColorFilter f1545Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PorterDuffColorFilter f1546Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final RectF f1547Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1548Ujhhgtgfeyxiexzf;

    static {
        Paint paint = new Paint(1);
        f1526feyxiexzfUjhhgtg = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0226Ujhhgtgfeyxiexzf() {
        this(new C1017feyxiexzfUjhhgtg());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.f1545Ujhhgtgfeyxiexzf;
        Paint paint = this.f1540Ujhhgtgfeyxiexzf;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f1527Ujhhgtgfeyxiexzf.f1516Ujhhgtgfeyxiexzf;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1546Ujhhgtgfeyxiexzf;
        Paint paint2 = this.f1541Ujhhgtgfeyxiexzf;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f1527Ujhhgtgfeyxiexzf.f1516Ujhhgtgfeyxiexzf;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f1531Ujhhgtgfeyxiexzf;
        Path path = this.f1533Ujhhgtgfeyxiexzf;
        if (z) {
            float f = -(m1366Ujhhgtgfeyxiexzf() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf;
            C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg.m2514Ujhhgtgfeyxiexzf();
            InterfaceC3736Ujhhgtgfeyxiexzf c3019feyxiexzfUjhhgtg = c1017feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf;
            if (!(c3019feyxiexzfUjhhgtg instanceof C0971feyxiexzfUjhhgtg)) {
                c3019feyxiexzfUjhhgtg = new C3019feyxiexzfUjhhgtg(f, c3019feyxiexzfUjhhgtg);
            }
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3952Ujhhgtgfeyxiexzf = c3019feyxiexzfUjhhgtg;
            InterfaceC3736Ujhhgtgfeyxiexzf c3019feyxiexzfUjhhgtg2 = c1017feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf;
            if (!(c3019feyxiexzfUjhhgtg2 instanceof C0971feyxiexzfUjhhgtg)) {
                c3019feyxiexzfUjhhgtg2 = new C3019feyxiexzfUjhhgtg(f, c3019feyxiexzfUjhhgtg2);
            }
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3953Ujhhgtgfeyxiexzf = c3019feyxiexzfUjhhgtg2;
            InterfaceC3736Ujhhgtgfeyxiexzf c3019feyxiexzfUjhhgtg3 = c1017feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf;
            if (!(c3019feyxiexzfUjhhgtg3 instanceof C0971feyxiexzfUjhhgtg)) {
                c3019feyxiexzfUjhhgtg3 = new C3019feyxiexzfUjhhgtg(f, c3019feyxiexzfUjhhgtg3);
            }
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3955Ujhhgtgfeyxiexzf = c3019feyxiexzfUjhhgtg3;
            InterfaceC3736Ujhhgtgfeyxiexzf c3019feyxiexzfUjhhgtg4 = c1017feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf;
            if (!(c3019feyxiexzfUjhhgtg4 instanceof C0971feyxiexzfUjhhgtg)) {
                c3019feyxiexzfUjhhgtg4 = new C3019feyxiexzfUjhhgtg(f, c3019feyxiexzfUjhhgtg4);
            }
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.f3954Ujhhgtgfeyxiexzf = c3019feyxiexzfUjhhgtg4;
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf = c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf();
            this.f1539Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf;
            float f2 = this.f1527Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf;
            RectF rectFM1364Ujhhgtgfeyxiexzf = m1364Ujhhgtgfeyxiexzf();
            RectF rectF = this.f1536Ujhhgtgfeyxiexzf;
            rectF.set(rectFM1364Ujhhgtgfeyxiexzf);
            float strokeWidth = m1366Ujhhgtgfeyxiexzf() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1544Ujhhgtgfeyxiexzf.m2520Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtgM2507Ujhhgtgfeyxiexzf, f2, rectF, null, this.f1534Ujhhgtgfeyxiexzf);
            m1359Ujhhgtgfeyxiexzf(m1364Ujhhgtgfeyxiexzf(), path);
            this.f1531Ujhhgtgfeyxiexzf = false;
        }
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        int i3 = c0223Ujhhgtgfeyxiexzf.f1519Ujhhgtgfeyxiexzf;
        if (i3 != 1 && c0223Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!c0223Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(m1364Ujhhgtgfeyxiexzf()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    double d = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf)));
                    if (!this.f1548Ujhhgtgfeyxiexzf) {
                        RectF rectF2 = this.f1547Ujhhgtgfeyxiexzf;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf, 2, (int) rectF2.width(), iWidth), AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf) - iWidth;
                        float f4 = (getBounds().top - this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf) - iHeight;
                        canvas2.translate(-f3, -f4);
                        m1361Ujhhgtgfeyxiexzf(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m1361Ujhhgtgfeyxiexzf(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf)));
                if (!this.f1548Ujhhgtgfeyxiexzf) {
                    RectF rectF3 = this.f1547Ujhhgtgfeyxiexzf;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                m1361Ujhhgtgfeyxiexzf(canvas);
                canvas.restore();
            }
        }
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf2 = this.f1527Ujhhgtgfeyxiexzf;
        Paint.Style style = c0223Ujhhgtgfeyxiexzf2.f1522Ujhhgtgfeyxiexzf;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m1362Ujhhgtgfeyxiexzf(canvas, paint, path, c0223Ujhhgtgfeyxiexzf2.f1506Ujhhgtgfeyxiexzf, m1364Ujhhgtgfeyxiexzf());
        }
        if (m1366Ujhhgtgfeyxiexzf()) {
            mo1363Ujhhgtgfeyxiexzf(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1527Ujhhgtgfeyxiexzf.f1516Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1527Ujhhgtgfeyxiexzf;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1519Ujhhgtgfeyxiexzf == 2) {
            return;
        }
        if (c0223Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(m1364Ujhhgtgfeyxiexzf())) {
            outline.setRoundRect(getBounds(), m1365Ujhhgtgfeyxiexzf() * this.f1527Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf);
            return;
        }
        RectF rectFM1364Ujhhgtgfeyxiexzf = m1364Ujhhgtgfeyxiexzf();
        Path path = this.f1533Ujhhgtgfeyxiexzf;
        m1359Ujhhgtgfeyxiexzf(rectFM1364Ujhhgtgfeyxiexzf, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC3251feyxiexzfUjhhgtg.m4755Ujhhgtgfeyxiexzf(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC3250feyxiexzfUjhhgtg.m4754Ujhhgtgfeyxiexzf(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC3250feyxiexzfUjhhgtg.m4754Ujhhgtgfeyxiexzf(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1527Ujhhgtgfeyxiexzf.f1512Ujhhgtgfeyxiexzf;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1537Ujhhgtgfeyxiexzf;
        region.set(bounds);
        RectF rectFM1364Ujhhgtgfeyxiexzf = m1364Ujhhgtgfeyxiexzf();
        Path path = this.f1533Ujhhgtgfeyxiexzf;
        m1359Ujhhgtgfeyxiexzf(rectFM1364Ujhhgtgfeyxiexzf, path);
        Region region2 = this.f1538Ujhhgtgfeyxiexzf;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1531Ujhhgtgfeyxiexzf = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1527Ujhhgtgfeyxiexzf.f1510Ujhhgtgfeyxiexzf;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1527Ujhhgtgfeyxiexzf.getClass();
        ColorStateList colorStateList2 = this.f1527Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1527Ujhhgtgfeyxiexzf = new C0223Ujhhgtgfeyxiexzf(this.f1527Ujhhgtgfeyxiexzf);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f1531Ujhhgtgfeyxiexzf = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m1374Ujhhgtgfeyxiexzf(iArr) || m1375Ujhhgtgfeyxiexzf();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1516Ujhhgtgfeyxiexzf != i) {
            c0223Ujhhgtgfeyxiexzf.f1516Ujhhgtgfeyxiexzf = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1527Ujhhgtgfeyxiexzf.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC1006feyxiexzfUjhhgtg
    public final void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1527Ujhhgtgfeyxiexzf.f1510Ujhhgtgfeyxiexzf = colorStateList;
        m1375Ujhhgtgfeyxiexzf();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1511Ujhhgtgfeyxiexzf != mode) {
            c0223Ujhhgtgfeyxiexzf.f1511Ujhhgtgfeyxiexzf = mode;
            m1375Ujhhgtgfeyxiexzf();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void mo1358Ujhhgtgfeyxiexzf() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1359Ujhhgtgfeyxiexzf(RectF rectF, Path path) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        this.f1544Ujhhgtgfeyxiexzf.m2520Ujhhgtgfeyxiexzf(c0223Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf, c0223Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf, rectF, this.f1543Ujhhgtgfeyxiexzf, path);
        if (this.f1527Ujhhgtgfeyxiexzf.f1513Ujhhgtgfeyxiexzf != 1.0f) {
            Matrix matrix = this.f1532Ujhhgtgfeyxiexzf;
            matrix.reset();
            float f = this.f1527Ujhhgtgfeyxiexzf.f1513Ujhhgtgfeyxiexzf;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1547Ujhhgtgfeyxiexzf, true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m1360Ujhhgtgfeyxiexzf(int i) {
        int i2;
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        float f = c0223Ujhhgtgfeyxiexzf.f1518Ujhhgtgfeyxiexzf + 0.0f + c0223Ujhhgtgfeyxiexzf.f1517Ujhhgtgfeyxiexzf;
        C3385Ujhhgtgfeyxiexzf c3385Ujhhgtgfeyxiexzf = c0223Ujhhgtgfeyxiexzf.f1507Ujhhgtgfeyxiexzf;
        if (c3385Ujhhgtgfeyxiexzf == null || !c3385Ujhhgtgfeyxiexzf.f10580Ujhhgtgfeyxiexzf || AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i, 255) != c3385Ujhhgtgfeyxiexzf.f10583Ujhhgtgfeyxiexzf) {
            return i;
        }
        float f2 = c3385Ujhhgtgfeyxiexzf.f10584Ujhhgtgfeyxiexzf;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM4216feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i, 255), c3385Ujhhgtgfeyxiexzf.f10581Ujhhgtgfeyxiexzf, fMin);
        if (fMin > 0.0f && (i2 = c3385Ujhhgtgfeyxiexzf.f10582Ujhhgtgfeyxiexzf) != 0) {
            iM4216feyxiexzfUjhhgtg = AbstractC2857Ujhhgtgfeyxiexzf.m4260Ujhhgtgfeyxiexzf(AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(i2, C3385Ujhhgtgfeyxiexzf.f10579Ujhhgtgfeyxiexzf), iM4216feyxiexzfUjhhgtg);
        }
        return AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(iM4216feyxiexzfUjhhgtg, iAlpha);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1361Ujhhgtgfeyxiexzf(Canvas canvas) {
        if (this.f1530Ujhhgtgfeyxiexzf.cardinality() > 0) {
            Log.w("上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴ能不能ᛳ要点脸ᛱfeyxiexzfᛱ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf;
        Path path = this.f1533Ujhhgtgfeyxiexzf;
        C1015feyxiexzfUjhhgtg c1015feyxiexzfUjhhgtg = this.f1542Ujhhgtgfeyxiexzf;
        if (i != 0) {
            canvas.drawPath(path, c1015feyxiexzfUjhhgtg.f3964Ujhhgtgfeyxiexzf);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC1004feyxiexzfUjhhgtg abstractC1004feyxiexzfUjhhgtg = this.f1528Ujhhgtgfeyxiexzf[i2];
            int i3 = this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf;
            Matrix matrix = AbstractC1004feyxiexzfUjhhgtg.f3923Ujhhgtgfeyxiexzf;
            abstractC1004feyxiexzfUjhhgtg.mo2501Ujhhgtgfeyxiexzf(matrix, c1015feyxiexzfUjhhgtg, i3, canvas);
            this.f1529Ujhhgtgfeyxiexzf[i2].mo2501Ujhhgtgfeyxiexzf(matrix, c1015feyxiexzfUjhhgtg, this.f1527Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf, canvas);
        }
        if (this.f1548Ujhhgtgfeyxiexzf) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1526feyxiexzfUjhhgtg);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1362Ujhhgtgfeyxiexzf(Canvas canvas, Paint paint, Path path, C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg, RectF rectF) {
        if (!c1017feyxiexzfUjhhgtg.m2513Ujhhgtgfeyxiexzf(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo2475Ujhhgtgfeyxiexzf = c1017feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(rectF) * this.f1527Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf;
            canvas.drawRoundRect(rectF, fMo2475Ujhhgtgfeyxiexzf, fMo2475Ujhhgtgfeyxiexzf, paint);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo1363Ujhhgtgfeyxiexzf(Canvas canvas) {
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f1539Ujhhgtgfeyxiexzf;
        RectF rectFM1364Ujhhgtgfeyxiexzf = m1364Ujhhgtgfeyxiexzf();
        RectF rectF = this.f1536Ujhhgtgfeyxiexzf;
        rectF.set(rectFM1364Ujhhgtgfeyxiexzf);
        boolean zM1366Ujhhgtgfeyxiexzf = m1366Ujhhgtgfeyxiexzf();
        Paint paint = this.f1541Ujhhgtgfeyxiexzf;
        float strokeWidth = zM1366Ujhhgtgfeyxiexzf ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m1362Ujhhgtgfeyxiexzf(canvas, paint, this.f1534Ujhhgtgfeyxiexzf, c1017feyxiexzfUjhhgtg, rectF);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final RectF m1364Ujhhgtgfeyxiexzf() {
        Rect bounds = getBounds();
        RectF rectF = this.f1535Ujhhgtgfeyxiexzf;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float m1365Ujhhgtgfeyxiexzf() {
        return this.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.f3977Ujhhgtgfeyxiexzf.mo2475Ujhhgtgfeyxiexzf(m1364Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m1366Ujhhgtgfeyxiexzf() {
        Paint.Style style = this.f1527Ujhhgtgfeyxiexzf.f1522Ujhhgtgfeyxiexzf;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1541Ujhhgtgfeyxiexzf.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1367Ujhhgtgfeyxiexzf(Context context) {
        this.f1527Ujhhgtgfeyxiexzf.f1507Ujhhgtgfeyxiexzf = new C3385Ujhhgtgfeyxiexzf(context);
        m1376Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m1368Ujhhgtgfeyxiexzf(float f) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1518Ujhhgtgfeyxiexzf != f) {
            c0223Ujhhgtgfeyxiexzf.f1518Ujhhgtgfeyxiexzf = f;
            m1376Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1369Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf != colorStateList) {
            c0223Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m1370Ujhhgtgfeyxiexzf(float f) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf != f) {
            c0223Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf = f;
            this.f1531Ujhhgtgfeyxiexzf = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m1371Ujhhgtgfeyxiexzf() {
        this.f1542Ujhhgtgfeyxiexzf.m2509Ujhhgtgfeyxiexzf(-12303292);
        this.f1527Ujhhgtgfeyxiexzf.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1372Ujhhgtgfeyxiexzf() {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1519Ujhhgtgfeyxiexzf != 2) {
            c0223Ujhhgtgfeyxiexzf.f1519Ujhhgtgfeyxiexzf = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1373Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf != colorStateList) {
            c0223Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m1374Ujhhgtgfeyxiexzf(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf == null || color2 == (colorForState2 = this.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf.getColorForState(iArr, (color2 = (paint2 = this.f1540Ujhhgtgfeyxiexzf).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f1527Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf == null || color == (colorForState = this.f1527Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf.getColorForState(iArr, (color = (paint = this.f1541Ujhhgtgfeyxiexzf).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m1375Ujhhgtgfeyxiexzf() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1545Ujhhgtgfeyxiexzf;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1546Ujhhgtgfeyxiexzf;
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList = c0223Ujhhgtgfeyxiexzf.f1510Ujhhgtgfeyxiexzf;
        PorterDuff.Mode mode = c0223Ujhhgtgfeyxiexzf.f1511Ujhhgtgfeyxiexzf;
        if (colorStateList == null || mode == null) {
            int color = this.f1540Ujhhgtgfeyxiexzf.getColor();
            int iM1360Ujhhgtgfeyxiexzf = m1360Ujhhgtgfeyxiexzf(color);
            porterDuffColorFilter = iM1360Ujhhgtgfeyxiexzf != color ? new PorterDuffColorFilter(iM1360Ujhhgtgfeyxiexzf, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1360Ujhhgtgfeyxiexzf(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1545Ujhhgtgfeyxiexzf = porterDuffColorFilter;
        this.f1527Ujhhgtgfeyxiexzf.getClass();
        this.f1546Ujhhgtgfeyxiexzf = null;
        this.f1527Ujhhgtgfeyxiexzf.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1545Ujhhgtgfeyxiexzf) && Objects.equals(porterDuffColorFilter3, this.f1546Ujhhgtgfeyxiexzf)) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m1376Ujhhgtgfeyxiexzf() {
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = this.f1527Ujhhgtgfeyxiexzf;
        float f = c0223Ujhhgtgfeyxiexzf.f1518Ujhhgtgfeyxiexzf + 0.0f;
        c0223Ujhhgtgfeyxiexzf.f1520Ujhhgtgfeyxiexzf = (int) Math.ceil(0.75f * f);
        this.f1527Ujhhgtgfeyxiexzf.f1521Ujhhgtgfeyxiexzf = (int) Math.ceil(f * 0.25f);
        m1375Ujhhgtgfeyxiexzf();
        super.invalidateSelf();
    }

    public C0226Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context, attributeSet, i, i2).m2507Ujhhgtgfeyxiexzf());
    }

    public C0226Ujhhgtgfeyxiexzf(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this(new C0223Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg));
    }

    public C0226Ujhhgtgfeyxiexzf(C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf) {
        C1024feyxiexzfUjhhgtg c1024feyxiexzfUjhhgtg;
        this.f1528Ujhhgtgfeyxiexzf = new AbstractC1004feyxiexzfUjhhgtg[4];
        this.f1529Ujhhgtgfeyxiexzf = new AbstractC1004feyxiexzfUjhhgtg[4];
        this.f1530Ujhhgtgfeyxiexzf = new BitSet(8);
        this.f1532Ujhhgtgfeyxiexzf = new Matrix();
        this.f1533Ujhhgtgfeyxiexzf = new Path();
        this.f1534Ujhhgtgfeyxiexzf = new Path();
        this.f1535Ujhhgtgfeyxiexzf = new RectF();
        this.f1536Ujhhgtgfeyxiexzf = new RectF();
        this.f1537Ujhhgtgfeyxiexzf = new Region();
        this.f1538Ujhhgtgfeyxiexzf = new Region();
        Paint paint = new Paint(1);
        this.f1540Ujhhgtgfeyxiexzf = paint;
        Paint paint2 = new Paint(1);
        this.f1541Ujhhgtgfeyxiexzf = paint2;
        this.f1542Ujhhgtgfeyxiexzf = new C1015feyxiexzfUjhhgtg();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1024feyxiexzfUjhhgtg = AbstractC1016feyxiexzfUjhhgtg.f3972Ujhhgtgfeyxiexzf;
        } else {
            c1024feyxiexzfUjhhgtg = new C1024feyxiexzfUjhhgtg();
        }
        this.f1544Ujhhgtgfeyxiexzf = c1024feyxiexzfUjhhgtg;
        this.f1547Ujhhgtgfeyxiexzf = new RectF();
        this.f1548Ujhhgtgfeyxiexzf = true;
        this.f1527Ujhhgtgfeyxiexzf = c0223Ujhhgtgfeyxiexzf;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1375Ujhhgtgfeyxiexzf();
        m1374Ujhhgtgfeyxiexzf(getState());
        this.f1543Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);
    }
}
