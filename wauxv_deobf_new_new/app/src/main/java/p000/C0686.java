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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲀᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 extends C1948 implements Drawable.Callback, InterfaceC2965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲈᲀ, reason: contains not printable characters */
    public static final int[] f2580 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
    public static final ShapeDrawable f2581 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public ColorStateList f2582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f2583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public float f2584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public float f2585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public ColorStateList f2586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public float f2587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public ColorStateList f2588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public CharSequence f2589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public boolean f2590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public Drawable f2591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public ColorStateList f2592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public float f2593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public boolean f2594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean f2595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public Drawable f2596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public RippleDrawable f2597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public ColorStateList f2598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public float f2599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public SpannableStringBuilder f2600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public boolean f2601;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public boolean f2602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public Drawable f2603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public ColorStateList f2604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public C2068 f2605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public C2068 f2606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public float f2607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public float f2608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public float f2609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public float f2610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public float f2611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public float f2612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public float f2613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public float f2614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public final Context f2615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public final Paint f2616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final Paint.FontMetrics f2617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final RectF f2618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final PointF f2619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final Path f2620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final C2966 f2621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public int f2622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f2623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public int f2624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public int f2625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public int f2626;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public int f2627;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public boolean f2628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public int f2629;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public int f2630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public ColorFilter f2631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public PorterDuffColorFilter f2632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public ColorStateList f2633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public PorterDuff.Mode f2634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public int[] f2635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public ColorStateList f2636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public WeakReference f2637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᲈᤞ, reason: contains not printable characters */
    public TextUtils.TruncateAt f2638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᤞᲁ, reason: contains not printable characters */
    public boolean f2639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
    public int f2640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
    public boolean f2641;

    public C0686(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2585 = -1.0f;
        this.f2616 = new Paint(1);
        this.f2617 = new Paint.FontMetrics();
        this.f2618 = new RectF();
        this.f2619 = new PointF();
        this.f2620 = new Path();
        this.f2630 = 255;
        this.f2634 = PorterDuff.Mode.SRC_IN;
        this.f2637 = new WeakReference(null);
        m3912(context);
        this.f2615 = context;
        C2966 c2966 = new C2966(this);
        this.f2621 = c2966;
        this.f2589 = "";
        c2966.f9516.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2580;
        setState(iArr);
        if (!Arrays.equals(this.f2635, iArr)) {
            this.f2635 = iArr;
            if (m2208()) {
                m2185(getState(), iArr);
            }
        }
        this.f2639 = true;
        int[] iArr2 = AbstractC2646.f8350;
        f2581.setTint(-1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m2176(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m2177(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public static void m2178(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f2630) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f2641;
        Paint paint = this.f2616;
        RectF rectF = this.f2618;
        if (!z) {
            paint.setColor(this.f2622);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2183(), m2183(), paint);
        }
        if (!this.f2641) {
            paint.setColor(this.f2623);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f2631;
            if (colorFilter == null) {
                colorFilter = this.f2632;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2183(), m2183(), paint);
        }
        if (this.f2641) {
            super.draw(canvas);
        }
        if (this.f2587 > 0.0f && !this.f2641) {
            paint.setColor(this.f2625);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f2641) {
                ColorFilter colorFilter2 = this.f2631;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f2632;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f2587 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f2585 - (this.f2587 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f2626);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f2641) {
            RectF rectF2 = new RectF(bounds);
            C1947 c1947 = this.f6437;
            C2738 c2738 = c1947.f6419;
            float f4 = c1947.f6427;
            C1681 c1681 = this.f6453;
            C2740 c2740 = this.f6454;
            Path path = this.f2620;
            c2740.m4729(c2738, f4, rectF2, c1681, path);
            m3908(canvas2, paint, path, this.f6437.f6419, m3909());
        } else {
            canvas2.drawRoundRect(rectF, m2183(), m2183(), paint);
        }
        if (m2207()) {
            m2180(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f2591.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2591.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m2206()) {
            m2180(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f2603.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2603.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f2639 && this.f2589 != null) {
            PointF pointF = this.f2619;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2589;
            C2966 c2966 = this.f2621;
            if (charSequence != null) {
                float fM2181 = m2181() + this.f2607 + this.f2610;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM2181;
                } else {
                    pointF.x = bounds.right - fM2181;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c2966.f9516;
                Paint.FontMetrics fontMetrics = this.f2617;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f2589 != null) {
                float fM2182 = m2181() + this.f2607 + this.f2610;
                float fM2183 = m2182() + this.f2614 + this.f2611;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM2182;
                    rectF.right = bounds.right - fM2183;
                } else {
                    rectF.left = bounds.left + fM2183;
                    rectF.right = bounds.right - fM2182;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C2963 c2963 = c2966.f9522;
            TextPaint textPaint2 = c2966.f9516;
            if (c2963 != null) {
                textPaint2.drawableState = getState();
                c2966.f9522.m4972(this.f2615, textPaint2, c2966.f9517);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c2966.m4975(this.f2589.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f2589;
            if (z2 && this.f2638 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f2638);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m2208()) {
            rectF.setEmpty();
            if (m2208()) {
                float f9 = this.f2614 + this.f2613;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f2599;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f2599;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f2599;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f2596.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC2646.f8350;
            this.f2597.setBounds(this.f2596.getBounds());
            this.f2597.jumpToCurrentState();
            this.f2597.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f2630 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2630;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2631;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2584;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m2182() + this.f2621.m4975(this.f2589.toString()) + m2181() + this.f2607 + this.f2610 + this.f2611 + this.f2614), this.f2640);
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f2641) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2584, this.f2585);
        } else {
            outline.setRoundRect(bounds, this.f2585);
            outline2 = outline;
        }
        outline2.setAlpha(this.f2630 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m2176(this.f2582) || m2176(this.f2583) || m2176(this.f2586)) {
            return true;
        }
        C2963 c2963 = this.f2621.f9522;
        if (c2963 == null || (colorStateList = c2963.f9507) == null || !colorStateList.isStateful()) {
            return (this.f2602 && this.f2603 != null && this.f2601) || m2177(this.f2591) || m2177(this.f2603) || m2176(this.f2633);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m2207()) {
            zOnLayoutDirectionChanged |= this.f2591.setLayoutDirection(i);
        }
        if (m2206()) {
            zOnLayoutDirectionChanged |= this.f2603.setLayoutDirection(i);
        }
        if (m2208()) {
            zOnLayoutDirectionChanged |= this.f2596.setLayoutDirection(i);
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
        if (m2207()) {
            zOnLevelChange |= this.f2591.setLevel(i);
        }
        if (m2206()) {
            zOnLevelChange |= this.f2603.setLevel(i);
        }
        if (m2208()) {
            zOnLevelChange |= this.f2596.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable, p000.InterfaceC2965
    public final boolean onStateChange(int[] iArr) {
        if (this.f2641) {
            super.onStateChange(iArr);
        }
        return m2185(iArr, this.f2635);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2630 != i) {
            this.f2630 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2631 != colorFilter) {
            this.f2631 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2633 != colorStateList) {
            this.f2633 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C1948, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f2634 != mode) {
            this.f2634 = mode;
            ColorStateList colorStateList = this.f2633;
            this.f2632 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m2207()) {
            visible |= this.f2591.setVisible(z, z2);
        }
        if (m2206()) {
            visible |= this.f2603.setVisible(z, z2);
        }
        if (m2208()) {
            visible |= this.f2596.setVisible(z, z2);
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

    @Override // p000.C1948, p000.InterfaceC2965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1580() {
        m2184();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m2179(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2596) {
            if (drawable.isStateful()) {
                drawable.setState(this.f2635);
            }
            drawable.setTintList(this.f2598);
            return;
        }
        Drawable drawable2 = this.f2591;
        if (drawable == drawable2 && this.f2594) {
            drawable2.setTintList(this.f2592);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m2180(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2207() || m2206()) {
            float f = this.f2607 + this.f2608;
            Drawable drawable = this.f2628 ? this.f2603 : this.f2591;
            float intrinsicWidth = this.f2593;
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
            Drawable drawable2 = this.f2628 ? this.f2603 : this.f2591;
            float fCeil = this.f2593;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(AbstractC1471.m3383(this.f2615, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final float m2181() {
        if (!m2207() && !m2206()) {
            return 0.0f;
        }
        float f = this.f2608;
        Drawable drawable = this.f2628 ? this.f2603 : this.f2591;
        float intrinsicWidth = this.f2593;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f2609;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final float m2182() {
        if (m2208()) {
            return this.f2612 + this.f2599 + this.f2613;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final float m2183() {
        return this.f2641 ? m3910() : this.f2585;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m2184() {
        InterfaceC0685 interfaceC0685 = (InterfaceC0685) this.f2637.get();
        if (interfaceC0685 != null) {
            Chip chip = (Chip) interfaceC0685;
            chip.m818(chip.f756);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m2185(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f2582;
        int iM3906 = m3906(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2622) : 0);
        boolean state = true;
        if (this.f2622 != iM3906) {
            this.f2622 = iM3906;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2583;
        int iM3907 = m3906(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2623) : 0);
        if (this.f2623 != iM3907) {
            this.f2623 = iM3907;
            zOnStateChange = true;
        }
        int iM2324 = AbstractC0747.m2324(iM3907, iM3906);
        if ((this.f2624 != iM2324) | (this.f6437.f6421 == null)) {
            this.f2624 = iM2324;
            m3914(ColorStateList.valueOf(iM2324));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f2586;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2625) : 0;
        if (this.f2625 != colorForState) {
            this.f2625 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f2636 == null || !AbstractC2646.m4620(iArr)) ? 0 : this.f2636.getColorForState(iArr, this.f2626);
        if (this.f2626 != colorForState2) {
            this.f2626 = colorForState2;
        }
        C2963 c2963 = this.f2621.f9522;
        int colorForState3 = (c2963 == null || (colorStateList = c2963.f9507) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2627);
        if (this.f2627 != colorForState3) {
            this.f2627 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.f2601) {
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
        if (this.f2628 == z || this.f2603 == null) {
            z2 = false;
        } else {
            float fM2181 = m2181();
            this.f2628 = z;
            if (fM2181 != m2181()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f2633;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f2629) : 0;
        if (this.f2629 != colorForState4) {
            this.f2629 = colorForState4;
            ColorStateList colorStateList6 = this.f2633;
            PorterDuff.Mode mode = this.f2634;
            this.f2632 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m2177(this.f2591)) {
            state |= this.f2591.setState(iArr);
        }
        if (m2177(this.f2603)) {
            state |= this.f2603.setState(iArr);
        }
        if (m2177(this.f2596)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f2596.setState(iArr3);
        }
        int[] iArr4 = AbstractC2646.f8350;
        if (m2177(this.f2597)) {
            state |= this.f2597.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m2184();
        }
        return state;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void m2186(boolean z) {
        if (this.f2601 != z) {
            this.f2601 = z;
            float fM2181 = m2181();
            if (!z && this.f2628) {
                this.f2628 = false;
            }
            float fM2182 = m2181();
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final void m2187(Drawable drawable) {
        if (this.f2603 != drawable) {
            float fM2181 = m2181();
            this.f2603 = drawable;
            float fM2182 = m2181();
            m2178(this.f2603);
            m2179(this.f2603);
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m2188(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f2604 != colorStateList) {
            this.f2604 = colorStateList;
            if (this.f2602 && (drawable = this.f2603) != null && this.f2601) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m2189(boolean z) {
        if (this.f2602 != z) {
            boolean zM2206 = m2206();
            this.f2602 = z;
            boolean zM2207 = m2206();
            if (zM2206 != zM2207) {
                if (zM2207) {
                    m2179(this.f2603);
                } else {
                    m2178(this.f2603);
                }
                invalidateSelf();
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m2190(float f) {
        if (this.f2585 != f) {
            this.f2585 = f;
            C2737 c2737M4728 = this.f6437.f6419.m4728();
            c2737M4728.m4723(f);
            setShapeAppearanceModel(c2737M4728.m4722());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m2191(Drawable drawable) {
        Drawable drawable2 = this.f2591;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM2181 = m2181();
            this.f2591 = drawable != null ? drawable.mutate() : null;
            float fM2182 = m2181();
            m2178(drawable2);
            if (m2207()) {
                m2179(this.f2591);
            }
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m2192(float f) {
        if (this.f2593 != f) {
            float fM2181 = m2181();
            this.f2593 = f;
            float fM2182 = m2181();
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m2193(ColorStateList colorStateList) {
        this.f2594 = true;
        if (this.f2592 != colorStateList) {
            this.f2592 = colorStateList;
            if (m2207()) {
                this.f2591.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m2194(boolean z) {
        if (this.f2590 != z) {
            boolean zM2207 = m2207();
            this.f2590 = z;
            boolean zM2208 = m2207();
            if (zM2207 != zM2208) {
                if (zM2208) {
                    m2179(this.f2591);
                } else {
                    m2178(this.f2591);
                }
                invalidateSelf();
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m2195(ColorStateList colorStateList) {
        if (this.f2586 != colorStateList) {
            this.f2586 = colorStateList;
            if (this.f2641) {
                m3918(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final void m2196(float f) {
        if (this.f2587 != f) {
            this.f2587 = f;
            this.f2616.setStrokeWidth(f);
            if (this.f2641) {
                this.f6437.f6428 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2197(Drawable drawable) {
        Drawable drawable2 = this.f2596;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM2182 = m2182();
            this.f2596 = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC2646.f8350;
            this.f2597 = new RippleDrawable(AbstractC2646.m4619(this.f2588), this.f2596, f2581);
            float fM2183 = m2182();
            m2178(drawable2);
            if (m2208()) {
                m2179(this.f2596);
            }
            invalidateSelf();
            if (fM2182 != fM2183) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m2198(float f) {
        if (this.f2613 != f) {
            this.f2613 = f;
            invalidateSelf();
            if (m2208()) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m2199(float f) {
        if (this.f2599 != f) {
            this.f2599 = f;
            invalidateSelf();
            if (m2208()) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m2200(float f) {
        if (this.f2612 != f) {
            this.f2612 = f;
            invalidateSelf();
            if (m2208()) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public final void m2201(ColorStateList colorStateList) {
        if (this.f2598 != colorStateList) {
            this.f2598 = colorStateList;
            if (m2208()) {
                this.f2596.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public final void m2202(boolean z) {
        if (this.f2595 != z) {
            boolean zM2208 = m2208();
            this.f2595 = z;
            boolean zM2209 = m2208();
            if (zM2208 != zM2209) {
                if (zM2209) {
                    m2179(this.f2596);
                } else {
                    m2178(this.f2596);
                }
                invalidateSelf();
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final void m2203(float f) {
        if (this.f2609 != f) {
            float fM2181 = m2181();
            this.f2609 = f;
            float fM2182 = m2181();
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public final void m2204(float f) {
        if (this.f2608 != f) {
            float fM2181 = m2181();
            this.f2608 = f;
            float fM2182 = m2181();
            invalidateSelf();
            if (fM2181 != fM2182) {
                m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public final void m2205(ColorStateList colorStateList) {
        if (this.f2588 != colorStateList) {
            this.f2588 = colorStateList;
            this.f2636 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m2206() {
        return this.f2602 && this.f2603 != null && this.f2628;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m2207() {
        return this.f2590 && this.f2591 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m2208() {
        return this.f2595 && this.f2596 != null;
    }
}
