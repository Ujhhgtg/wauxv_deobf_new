package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0695 extends C1917 implements Drawable.Callback, InterfaceC2906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public static final int[] f2582 = {16842910};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᲈᤞ, reason: contains not printable characters */
    public static final ShapeDrawable f2583 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f2584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f2585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public float f2586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public float f2587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public ColorStateList f2588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public float f2589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public ColorStateList f2590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public CharSequence f2591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public boolean f2592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public Drawable f2593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public ColorStateList f2594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public float f2595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean f2596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public boolean f2597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public Drawable f2598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public RippleDrawable f2599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public ColorStateList f2600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public float f2601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public SpannableStringBuilder f2602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public boolean f2603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public boolean f2604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public Drawable f2605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public ColorStateList f2606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public C2035 f2607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public C2035 f2608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public float f2609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public float f2610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public float f2611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public float f2612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public float f2613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public float f2614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public float f2615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public float f2616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public final Context f2617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final Paint f2618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final Paint.FontMetrics f2619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final RectF f2620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final PointF f2621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final Path f2622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public final C2907 f2623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f2624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public int f2625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public int f2626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public int f2627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public int f2628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public int f2629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public boolean f2630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public int f2631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public int f2632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public ColorFilter f2633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public PorterDuffColorFilter f2634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public ColorStateList f2635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f2636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public int[] f2637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public ColorStateList f2638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
    public WeakReference f2639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
    public TextUtils.TruncateAt f2640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
    public boolean f2641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
    public int f2642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public boolean f2643;

    public C0695(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2587 = -1.0f;
        this.f2618 = new Paint(1);
        this.f2619 = new Paint.FontMetrics();
        this.f2620 = new RectF();
        this.f2621 = new PointF();
        this.f2622 = new Path();
        this.f2632 = 255;
        this.f2636 = PorterDuff.Mode.SRC_IN;
        this.f2639 = new WeakReference(null);
        m3714(context);
        this.f2617 = context;
        C2907 c2907 = new C2907(this);
        this.f2623 = c2907;
        this.f2591 = "";
        c2907.f9349.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2582;
        setState(iArr);
        if (!Arrays.equals(this.f2637, iArr)) {
            this.f2637 = iArr;
            if (m2113()) {
                m2090(getState(), iArr);
            }
        }
        this.f2641 = true;
        int[] iArr2 = AbstractC2589.f8198;
        f2583.setTint(-1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static boolean m2081(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static boolean m2082(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public static void m2083(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f2632) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f2643;
        Paint paint = this.f2618;
        RectF rectF = this.f2620;
        if (!z) {
            paint.setColor(this.f2624);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2088(), m2088(), paint);
        }
        if (!this.f2643) {
            paint.setColor(this.f2625);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f2633;
            if (colorFilter == null) {
                colorFilter = this.f2634;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2088(), m2088(), paint);
        }
        if (this.f2643) {
            super.draw(canvas);
        }
        if (this.f2589 > 0.0f && !this.f2643) {
            paint.setColor(this.f2627);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f2643) {
                ColorFilter colorFilter2 = this.f2633;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f2634;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f2589 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f2587 - (this.f2589 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f2628);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f2643) {
            RectF rectF2 = new RectF(bounds);
            C1916 c1916 = this.f6332;
            C2677 c2677 = c1916.f6314;
            float f4 = c1916.f6322;
            C1744 c1744 = this.f6348;
            C2679 c2679 = this.f6349;
            Path path = this.f2622;
            c2679.m4692(c2677, f4, rectF2, c1744, path);
            m3711(canvas2, paint, path, this.f6332.f6314, m3712());
        } else {
            canvas2.drawRoundRect(rectF, m2088(), m2088(), paint);
        }
        if (m2112()) {
            m2085(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f2593.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2593.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m2111()) {
            m2085(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f2605.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2605.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f2641 && this.f2591 != null) {
            PointF pointF = this.f2621;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2591;
            C2907 c2907 = this.f2623;
            if (charSequence != null) {
                float fM2086 = m2086() + this.f2609 + this.f2612;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM2086;
                } else {
                    pointF.x = bounds.right - fM2086;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c2907.f9349;
                Paint.FontMetrics fontMetrics = this.f2619;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f2591 != null) {
                float fM2087 = m2086() + this.f2609 + this.f2612;
                float fM2088 = m2087() + this.f2616 + this.f2613;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM2087;
                    rectF.right = bounds.right - fM2088;
                } else {
                    rectF.left = bounds.left + fM2088;
                    rectF.right = bounds.right - fM2087;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C2904 c2904 = c2907.f9355;
            TextPaint textPaint2 = c2907.f9349;
            if (c2904 != null) {
                textPaint2.drawableState = getState();
                c2907.f9355.m4910(this.f2617, textPaint2, c2907.f9350);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c2907.m4913(this.f2591.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f2591;
            if (z2 && this.f2640 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f2640);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m2113()) {
            rectF.setEmpty();
            if (m2113()) {
                float f9 = this.f2616 + this.f2615;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f2601;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f2601;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f2601;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f2598.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC2589.f8198;
            this.f2599.setBounds(this.f2598.getBounds());
            this.f2599.jumpToCurrentState();
            this.f2599.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f2632 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2632;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2633;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2586;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m2087() + this.f2623.m4913(this.f2591.toString()) + m2086() + this.f2609 + this.f2612 + this.f2613 + this.f2616), this.f2642);
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f2643) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2586, this.f2587);
        } else {
            outline.setRoundRect(bounds, this.f2587);
            outline2 = outline;
        }
        outline2.setAlpha(this.f2632 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m2081(this.f2584) || m2081(this.f2585) || m2081(this.f2588)) {
            return true;
        }
        C2904 c2904 = this.f2623.f9355;
        if (c2904 == null || (colorStateList = c2904.f9340) == null || !colorStateList.isStateful()) {
            return (this.f2604 && this.f2605 != null && this.f2603) || m2082(this.f2593) || m2082(this.f2605) || m2081(this.f2635);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m2112()) {
            zOnLayoutDirectionChanged |= this.f2593.setLayoutDirection(i);
        }
        if (m2111()) {
            zOnLayoutDirectionChanged |= this.f2605.setLayoutDirection(i);
        }
        if (m2113()) {
            zOnLayoutDirectionChanged |= this.f2598.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m2112()) {
            zOnLevelChange |= this.f2593.setLevel(i);
        }
        if (m2111()) {
            zOnLevelChange |= this.f2605.setLevel(i);
        }
        if (m2113()) {
            zOnLevelChange |= this.f2598.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable, p000.InterfaceC2906
    public final boolean onStateChange(int[] iArr) {
        if (this.f2643) {
            super.onStateChange(iArr);
        }
        return m2090(iArr, this.f2637);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2632 != i) {
            this.f2632 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2633 != colorFilter) {
            this.f2633 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2635 != colorStateList) {
            this.f2635 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C1917, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f2636 != mode) {
            this.f2636 = mode;
            ColorStateList colorStateList = this.f2635;
            this.f2634 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m2112()) {
            visible |= this.f2593.setVisible(z, z2);
        }
        if (m2111()) {
            visible |= this.f2605.setVisible(z, z2);
        }
        if (m2113()) {
            visible |= this.f2598.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // p000.C1917, p000.InterfaceC2906
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1475() {
        m2089();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m2084(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2598) {
            if (drawable.isStateful()) {
                drawable.setState(this.f2637);
            }
            drawable.setTintList(this.f2600);
            return;
        }
        Drawable drawable2 = this.f2593;
        if (drawable == drawable2 && this.f2596) {
            drawable2.setTintList(this.f2594);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m2085(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2112() || m2111()) {
            float f = this.f2609 + this.f2610;
            Drawable drawable = this.f2630 ? this.f2605 : this.f2593;
            float intrinsicWidth = this.f2595;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f2630 ? this.f2605 : this.f2593;
            float fCeil = this.f2595;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(AbstractC1459.m3180(this.f2617, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final float m2086() {
        if (!m2112() && !m2111()) {
            return 0.0f;
        }
        float f = this.f2610;
        Drawable drawable = this.f2630 ? this.f2605 : this.f2593;
        float intrinsicWidth = this.f2595;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f2611;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final float m2087() {
        if (m2113()) {
            return this.f2614 + this.f2601 + this.f2615;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final float m2088() {
        return this.f2643 ? this.f6332.f6314.f8632.mo916(m3712()) : this.f2587;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m2089() {
        InterfaceC0694 interfaceC0694 = (InterfaceC0694) this.f2639.get();
        if (interfaceC0694 != null) {
            Chip chip = (Chip) interfaceC0694;
            chip.m674(chip.f696);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m2090(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f2584;
        int iM3709 = m3709(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2624) : 0);
        boolean state = true;
        if (this.f2624 != iM3709) {
            this.f2624 = iM3709;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2585;
        int iM37010 = m3709(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2625) : 0);
        if (this.f2625 != iM37010) {
            this.f2625 = iM37010;
            zOnStateChange = true;
        }
        int iM2224 = AbstractC0752.m2224(iM37010, iM3709);
        if ((this.f2626 != iM2224) | (this.f6332.f6316 == null)) {
            this.f2626 = iM2224;
            m3716(ColorStateList.valueOf(iM2224));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f2588;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2627) : 0;
        if (this.f2627 != colorForState) {
            this.f2627 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f2638 == null || !AbstractC2589.m4598(iArr)) ? 0 : this.f2638.getColorForState(iArr, this.f2628);
        if (this.f2628 != colorForState2) {
            this.f2628 = colorForState2;
        }
        C2904 c2904 = this.f2623.f9355;
        int colorForState3 = (c2904 == null || (colorStateList = c2904.f9340) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2629);
        if (this.f2629 != colorForState3) {
            this.f2629 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (true) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (0 < length) {
                    if (state2[0] != 16842912) {
                        0++;
                    } else if (this.f2603) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.f2630 == z || this.f2605 == null) {
            z2 = false;
        } else {
            float fM2086 = m2086();
            this.f2630 = z;
            if (fM2086 != m2086()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f2635;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f2631) : 0;
        if (this.f2631 != colorForState4) {
            this.f2631 = colorForState4;
            ColorStateList colorStateList6 = this.f2635;
            PorterDuff.Mode mode = this.f2636;
            this.f2634 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m2082(this.f2593)) {
            state |= this.f2593.setState(iArr);
        }
        if (m2082(this.f2605)) {
            state |= this.f2605.setState(iArr);
        }
        if (m2082(this.f2598)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f2598.setState(iArr3);
        }
        int[] iArr4 = AbstractC2589.f8198;
        if (m2082(this.f2599)) {
            state |= this.f2599.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m2089();
        }
        return state;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void m2091(boolean z) {
        if (this.f2603 != z) {
            this.f2603 = z;
            float fM2086 = m2086();
            if (!z && this.f2630) {
                this.f2630 = false;
            }
            float fM2087 = m2086();
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m2092(Drawable drawable) {
        if (this.f2605 != drawable) {
            float fM2086 = m2086();
            this.f2605 = drawable;
            float fM2087 = m2086();
            m2083(this.f2605);
            m2084(this.f2605);
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m2093(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f2606 != colorStateList) {
            this.f2606 = colorStateList;
            if (this.f2604 && (drawable = this.f2605) != null && this.f2603) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void m2094(boolean z) {
        if (this.f2604 != z) {
            boolean zM2111 = m2111();
            this.f2604 = z;
            boolean zM2112 = m2111();
            if (zM2111 != zM2112) {
                if (zM2112) {
                    m2084(this.f2605);
                } else {
                    m2083(this.f2605);
                }
                invalidateSelf();
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m2095(float f) {
        if (this.f2587 != f) {
            this.f2587 = f;
            C2021 c2021M4691 = this.f6332.f6314.m4691();
            c2021M4691.f6766 = new C0053(f);
            c2021M4691.f6767 = new C0053(f);
            c2021M4691.f6768 = new C0053(f);
            c2021M4691.f6769 = new C0053(f);
            setShapeAppearanceModel(c2021M4691.m3876());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m2096(Drawable drawable) {
        Drawable drawable2 = this.f2593;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM2086 = m2086();
            this.f2593 = drawable != null ? drawable.mutate() : null;
            float fM2087 = m2086();
            m2083(drawable2);
            if (m2112()) {
                m2084(this.f2593);
            }
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m2097(float f) {
        if (this.f2595 != f) {
            float fM2086 = m2086();
            this.f2595 = f;
            float fM2087 = m2086();
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m2098(ColorStateList colorStateList) {
        this.f2596 = true;
        if (this.f2594 != colorStateList) {
            this.f2594 = colorStateList;
            if (m2112()) {
                this.f2593.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m2099(boolean z) {
        if (this.f2592 != z) {
            boolean zM2112 = m2112();
            this.f2592 = z;
            boolean zM2113 = m2112();
            if (zM2112 != zM2113) {
                if (zM2113) {
                    m2084(this.f2593);
                } else {
                    m2083(this.f2593);
                }
                invalidateSelf();
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m2100(ColorStateList colorStateList) {
        if (this.f2588 != colorStateList) {
            this.f2588 = colorStateList;
            if (this.f2643) {
                m3718(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m2101(float f) {
        if (this.f2589 != f) {
            this.f2589 = f;
            this.f2618.setStrokeWidth(f);
            if (this.f2643) {
                this.f6332.f6323 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m2102(Drawable drawable) {
        Drawable drawable2 = this.f2598;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM2087 = m2087();
            this.f2598 = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC2589.f8198;
            this.f2599 = new RippleDrawable(AbstractC2589.m4597(this.f2590), this.f2598, f2583);
            float fM2088 = m2087();
            m2083(drawable2);
            if (m2113()) {
                m2084(this.f2598);
            }
            invalidateSelf();
            if (fM2087 != fM2088) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m2103(float f) {
        if (this.f2615 != f) {
            this.f2615 = f;
            invalidateSelf();
            if (m2113()) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final void m2104(float f) {
        if (this.f2601 != f) {
            this.f2601 = f;
            invalidateSelf();
            if (m2113()) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2105(float f) {
        if (this.f2614 != f) {
            this.f2614 = f;
            invalidateSelf();
            if (m2113()) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m2106(ColorStateList colorStateList) {
        if (this.f2600 != colorStateList) {
            this.f2600 = colorStateList;
            if (m2113()) {
                this.f2598.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m2107(boolean z) {
        if (this.f2597 != z) {
            boolean zM2113 = m2113();
            this.f2597 = z;
            boolean zM2114 = m2113();
            if (zM2113 != zM2114) {
                if (zM2114) {
                    m2084(this.f2598);
                } else {
                    m2083(this.f2598);
                }
                invalidateSelf();
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m2108(float f) {
        if (this.f2611 != f) {
            float fM2086 = m2086();
            this.f2611 = f;
            float fM2087 = m2086();
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m2109(float f) {
        if (this.f2610 != f) {
            float fM2086 = m2086();
            this.f2610 = f;
            float fM2087 = m2086();
            invalidateSelf();
            if (fM2086 != fM2087) {
                m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void m2110(ColorStateList colorStateList) {
        if (this.f2590 != colorStateList) {
            this.f2590 = colorStateList;
            this.f2638 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final boolean m2111() {
        return this.f2604 && this.f2605 != null && this.f2630;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final boolean m2112() {
        return this.f2592 && this.f2593 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final boolean m2113() {
        return this.f2597 && this.f2598 != null;
    }
}
