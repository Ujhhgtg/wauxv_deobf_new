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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1917 extends Drawable implements InterfaceC2688 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Paint f6331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1916 f6332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC2686[] f6333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC2686[] f6334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final BitSet f6335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f6336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Matrix f6337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Path f6338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Path f6339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final RectF f6340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final RectF f6341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Region f6342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Region f6343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C2677 f6344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Paint f6345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Paint f6346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final C2676 f6347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C1744 f6348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C2679 f6349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public PorterDuffColorFilter f6350;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public PorterDuffColorFilter f6351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final RectF f6352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f6353;

    static {
        Paint paint = new Paint(1);
        f6331 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C1917() {
        this(new C2677());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.f6350;
        Paint paint = this.f6345;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f6332.f6324;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6351;
        Paint paint2 = this.f6346;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f6332.f6323);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f6332.f6324;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f6336;
        Path path = this.f6338;
        if (z) {
            float f = -(m3713() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C2677 c2677 = this.f6332.f6314;
            C2021 c2021M4691 = c2677.m4691();
            InterfaceC0874 c0148 = c2677.f8632;
            if (!(c0148 instanceof C2530)) {
                c0148 = new C0148(f, c0148);
            }
            c2021M4691.f6766 = c0148;
            InterfaceC0874 c0149 = c2677.f8633;
            if (!(c0149 instanceof C2530)) {
                c0149 = new C0148(f, c0149);
            }
            c2021M4691.f6767 = c0149;
            InterfaceC0874 c01410 = c2677.f8635;
            if (!(c01410 instanceof C2530)) {
                c01410 = new C0148(f, c01410);
            }
            c2021M4691.f6769 = c01410;
            InterfaceC0874 c01411 = c2677.f8634;
            if (!(c01411 instanceof C2530)) {
                c01411 = new C0148(f, c01411);
            }
            c2021M4691.f6768 = c01411;
            C2677 c2677M3876 = c2021M4691.m3876();
            this.f6344 = c2677M3876;
            float f2 = this.f6332.f6322;
            RectF rectFM3712 = m3712();
            RectF rectF = this.f6341;
            rectF.set(rectFM3712);
            float strokeWidth = m3713() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f6349.m4692(c2677M3876, f2, rectF, null, this.f6339);
            m3708(m3712(), path);
            this.f6336 = false;
        }
        C1916 c1916 = this.f6332;
        int i3 = c1916.f6327;
        if (i3 != 1 && c1916.f6328 > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!c1916.f6314.m4690(m3712()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    double d = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(0.0)) * ((double) this.f6332.f6329)), (int) (Math.cos(Math.toRadians(0.0)) * ((double) this.f6332.f6329)));
                    if (!this.f6353) {
                        RectF rectF2 = this.f6352;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC2784.m4736(this.f6332.f6328, 2, (int) rectF2.width(), iWidth), AbstractC2784.m4736(this.f6332.f6328, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.f6332.f6328) - iWidth;
                        float f4 = (getBounds().top - this.f6332.f6328) - iHeight;
                        canvas2.translate(-f3, -f4);
                        m3710(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m3710(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(0.0)) * ((double) this.f6332.f6329)), (int) (Math.cos(Math.toRadians(0.0)) * ((double) this.f6332.f6329)));
                if (!this.f6353) {
                    RectF rectF3 = this.f6352;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                m3710(canvas);
                canvas.restore();
            }
        }
        C1916 c1917 = this.f6332;
        Paint.Style style = c1917.f6330;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m3711(canvas, paint, path, c1917.f6314, m3712());
        }
        if (m3713()) {
            mo2439(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6332.f6324;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6332;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C1916 c1916 = this.f6332;
        if (c1916.f6327 == 2) {
            return;
        }
        if (c1916.f6314.m4690(m3712())) {
            outline.setRoundRect(getBounds(), this.f6332.f6314.f8632.mo916(m3712()) * this.f6332.f6322);
            return;
        }
        RectF rectFM3712 = m3712();
        Path path = this.f6338;
        m3708(rectFM3712, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC1104.m2673(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC1103.m2672(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1103.m2672(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6332.f6320;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f6342;
        region.set(bounds);
        RectF rectFM3712 = m3712();
        Path path = this.f6338;
        m3708(rectFM3712, path);
        Region region2 = this.f6343;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6336 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f6332.f6318;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        
        ColorStateList colorStateList2 = this.f6332.f6317;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f6332.f6316;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6332 = new C1916(this.f6332);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6336 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p000.InterfaceC2906
    public boolean onStateChange(int[] iArr) {
        boolean z = m3719(iArr) || m3720();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1916 c1916 = this.f6332;
        if (c1916.f6324 != i) {
            c1916.f6324 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC2688
    public final void setShapeAppearanceModel(C2677 c2677) {
        this.f6332.f6314 = c2677;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6332.f6318 = colorStateList;
        m3720();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1916 c1916 = this.f6332;
        if (c1916.f6319 != mode) {
            c1916.f6319 = mode;
            m3720();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1475() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3708(RectF rectF, Path path) {
        C1916 c1916 = this.f6332;
        this.f6349.m4692(c1916.f6314, c1916.f6322, rectF, this.f6348, path);
        if (this.f6332.f6321 != 1.0f) {
            Matrix matrix = this.f6337;
            matrix.reset();
            float f = this.f6332.f6321;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f6352, true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3709(int i) {
        int i2;
        C1916 c1916 = this.f6332;
        float f = c1916.f6326 + 0.0f + c1916.f6325;
        C1136 c1136 = c1916.f6315;
        if (c1136 == null || !c1136.f4226 || AbstractC0752.m2226(i, 255) != c1136.f4229) {
            return i;
        }
        float f2 = c1136.f4230;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM4137 = AbstractC2209.m4137(AbstractC0752.m2226(i, 255), c1136.f4227, fMin);
        if (fMin > 0.0f && (i2 = c1136.f4228) != 0) {
            iM4137 = AbstractC0752.m2224(AbstractC0752.m2226(i2, C1136.f4225), iM4137);
        }
        return AbstractC0752.m2226(iM4137, iAlpha);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3710(Canvas canvas) {
        if (this.f6335.cardinality() > 0) {
            Log.w("ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᲇᛸᤝ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f6332.f6329;
        Path path = this.f6338;
        C2676 c2676 = this.f6347;
        if (i != 0) {
            canvas.drawPath(path, c2676.f8620);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC2686 abstractC2686 = this.f6333[i2];
            int i3 = this.f6332.f6328;
            Matrix matrix = AbstractC2686.f8669;
            abstractC2686.mo4694(matrix, c2676, i3, canvas);
            this.f6334[i2].mo4694(matrix, c2676, this.f6332.f6328, canvas);
        }
        if (this.f6353) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(0.0)) * ((double) this.f6332.f6329));
            int iCos = (int) (Math.cos(Math.toRadians(0.0)) * ((double) this.f6332.f6329));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f6331);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3711(Canvas canvas, Paint paint, Path path, C2677 c2677, RectF rectF) {
        if (!c2677.m4690(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo916 = c2677.f8633.mo916(rectF) * this.f6332.f6322;
            canvas.drawRoundRect(rectF, fMo916, fMo916, paint);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo2439(Canvas canvas) {
        C2677 c2677 = this.f6344;
        RectF rectFM3712 = m3712();
        RectF rectF = this.f6341;
        rectF.set(rectFM3712);
        boolean zM3713 = m3713();
        Paint paint = this.f6346;
        float strokeWidth = zM3713 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m3711(canvas, paint, this.f6339, c2677, rectF);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final RectF m3712() {
        Rect bounds = getBounds();
        RectF rectF = this.f6340;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m3713() {
        Paint.Style style = this.f6332.f6330;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6346.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3714(Context context) {
        this.f6332.f6315 = new C1136(context);
        m3721();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3715(float f) {
        C1916 c1916 = this.f6332;
        if (c1916.f6326 != f) {
            c1916.f6326 = f;
            m3721();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3716(ColorStateList colorStateList) {
        C1916 c1916 = this.f6332;
        if (c1916.f6316 != colorStateList) {
            c1916.f6316 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3717() {
        C1916 c1916 = this.f6332;
        if (c1916.f6327 != 2) {
            c1916.f6327 = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3718(ColorStateList colorStateList) {
        C1916 c1916 = this.f6332;
        if (c1916.f6317 != colorStateList) {
            c1916.f6317 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m3719(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6332.f6316 == null || color2 == (colorForState2 = this.f6332.f6316.getColorForState(iArr, (color2 = (paint2 = this.f6345).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f6332.f6317 == null || color == (colorForState = this.f6332.f6317.getColorForState(iArr, (color = (paint = this.f6346).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean m3720() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6350;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f6351;
        C1916 c1916 = this.f6332;
        ColorStateList colorStateList = c1916.f6318;
        PorterDuff.Mode mode = c1916.f6319;
        if (colorStateList == null || mode == null) {
            int color = this.f6345.getColor();
            int iM3709 = m3709(color);
            porterDuffColorFilter = iM3709 != color ? new PorterDuffColorFilter(iM3709, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m3709(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f6350 = porterDuffColorFilter;
        
        this.f6351 = null;
        
        return (Objects.equals(porterDuffColorFilter2, this.f6350) && Objects.equals(porterDuffColorFilter3, this.f6351)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3721() {
        C1916 c1916 = this.f6332;
        float f = c1916.f6326 + 0.0f;
        c1916.f6328 = (int) Math.ceil(0.75f * f);
        this.f6332.f6329 = (int) Math.ceil(f * 0.25f);
        m3720();
        super.invalidateSelf();
    }

    public C1917(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2677.m4688(context, attributeSet, i, i2).m3876());
    }

    public C1917(C2677 c2677) {
        this(new C1916(c2677));
    }

    public C1917(C1916 c1916) {
        C2679 c2679;
        this.f6333 = new AbstractC2686[4];
        this.f6334 = new AbstractC2686[4];
        this.f6335 = new BitSet(8);
        this.f6337 = new Matrix();
        this.f6338 = new Path();
        this.f6339 = new Path();
        this.f6340 = new RectF();
        this.f6341 = new RectF();
        this.f6342 = new Region();
        this.f6343 = new Region();
        Paint paint = new Paint(1);
        this.f6345 = paint;
        Paint paint2 = new Paint(1);
        this.f6346 = paint2;
        this.f6347 = new C2676();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c2679 = AbstractC2678.f8640;
        } else {
            c2679 = new C2679();
        }
        this.f6349 = c2679;
        this.f6352 = new RectF();
        this.f6353 = true;
        this.f6332 = c1916;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m3720();
        m3719(getState());
        this.f6348 = new C1744(this);
    }
}
