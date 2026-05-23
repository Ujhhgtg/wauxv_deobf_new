package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲇᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextInputLayout f2773;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f2774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Rect f2775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect f2776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final RectF f2777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f2782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f2783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f2784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f2785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f2786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public float f2787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public float f2788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public float f2789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public Typeface f2790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Typeface f2791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Typeface f2792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Typeface f2793;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Typeface f2794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public Typeface f2795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Typeface f2796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C0556 f2797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public CharSequence f2799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public CharSequence f2800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public Bitmap f2803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public float f2804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public float f2805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public float f2806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public float f2807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public float f2808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public int f2809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int[] f2810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean f2811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final TextPaint f2812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final TextPaint f2813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public TimeInterpolator f2814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public TimeInterpolator f2815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public float f2816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public float f2817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public float f2818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public ColorStateList f2819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public float f2820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public float f2821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public float f2822;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public StaticLayout f2823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public float f2824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public float f2825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public float f2826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public CharSequence f2827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2778 = 16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f2779 = 16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f2780 = 15.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f2781 = 15.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final TextUtils.TruncateAt f2798 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f2802 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final int f2828 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public final float f2829 = 1.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public final int f2830 = 1;

    public C0738(TextInputLayout textInputLayout) {
        this.f2773 = textInputLayout;
        TextPaint textPaint = new TextPaint(Opcodes.LOR);
        this.f2812 = textPaint;
        this.f2813 = new TextPaint(textPaint);
        this.f2776 = new Rect();
        this.f2775 = new Rect();
        this.f2777 = new RectF();
        m2164(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m2158(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static float m2159(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0164.m1211(f, f2, f3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m2160(CharSequence charSequence) {
        Field field = AbstractC3578.f11184;
        boolean z = this.f2773.getLayoutDirection() == 1;
        if (this.f2802) {
            return (z ? AbstractC2905.f9348 : AbstractC2905.f9347).m1671(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2161(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f2799 == null) {
            return;
        }
        float fWidth = this.f2776.width();
        float fWidth2 = this.f2775.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f2781;
            f3 = this.f2820;
            this.f2804 = 1.0f;
            typeface = this.f2790;
        } else {
            float f4 = this.f2780;
            float f5 = this.f2821;
            Typeface typeface2 = this.f2793;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f2804 = 1.0f;
            } else {
                this.f2804 = m2159(this.f2780, this.f2781, f, this.f2815) / this.f2780;
            }
            float f6 = this.f2781 / this.f2780;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2812;
        if (fWidth > 0.0f) {
            boolean z3 = this.f2805 != f2;
            boolean z4 = this.f2822 != f3;
            boolean z5 = this.f2796 != typeface;
            StaticLayout staticLayout = this.f2823;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f2811;
            this.f2805 = f2;
            this.f2822 = f3;
            this.f2796 = typeface;
            this.f2811 = false;
            textPaint.setLinearText(this.f2804 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f2800 == null || z2) {
            textPaint.setTextSize(this.f2805);
            textPaint.setTypeface(this.f2796);
            textPaint.setLetterSpacing(this.f2822);
            boolean zM2160 = m2160(this.f2799);
            this.f2801 = zM2160;
            int i = this.f2828;
            if (i <= 1 || zM2160) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2778, zM2160 ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f2801 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f2801 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            C2814 c2814 = new C2814(this.f2799, textPaint, (int) fWidth);
            c2814.f9023 = this.f2798;
            c2814.f9022 = zM2160;
            c2814.f9017 = alignment;
            c2814.f9021 = false;
            c2814.f9018 = i;
            c2814.f9019 = this.f2829;
            c2814.f9020 = this.f2830;
            StaticLayout staticLayoutM4792 = c2814.m4792();
            staticLayoutM4792.getClass();
            this.f2823 = staticLayoutM4792;
            this.f2800 = staticLayoutM4792.getText();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float m2162() {
        float f = this.f2781;
        TextPaint textPaint = this.f2813;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f2790);
        textPaint.setLetterSpacing(this.f2820);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m2163(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2810;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2164(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2792;
            if (typeface != null) {
                this.f2791 = AbstractC2665.m4668(configuration, typeface);
            }
            Typeface typeface2 = this.f2795;
            if (typeface2 != null) {
                this.f2794 = AbstractC2665.m4668(configuration, typeface2);
            }
            Typeface typeface3 = this.f2791;
            if (typeface3 == null) {
                typeface3 = this.f2792;
            }
            this.f2790 = typeface3;
            Typeface typeface4 = this.f2794;
            if (typeface4 == null) {
                typeface4 = this.f2795;
            }
            this.f2793 = typeface4;
            m2165(true);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2165(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2773;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m2161(1.0f, z);
        CharSequence charSequence = this.f2800;
        TextPaint textPaint = this.f2812;
        if (charSequence != null && (staticLayout = this.f2823) != null) {
            this.f2827 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2798);
        }
        CharSequence charSequence2 = this.f2827;
        if (charSequence2 != null) {
            this.f2824 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2824 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2779, this.f2801 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f2776;
        if (i == 48) {
            this.f2785 = rect.top;
        } else if (i != 80) {
            this.f2785 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2785 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f2787 = rect.centerX() - (this.f2824 / 2.0f);
        } else if (i2 != 5) {
            this.f2787 = rect.left;
        } else {
            this.f2787 = rect.right - this.f2824;
        }
        m2161(0.0f, z);
        StaticLayout staticLayout2 = this.f2823;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f2823;
        if (staticLayout3 == null || this.f2828 <= 1) {
            CharSequence charSequence3 = this.f2800;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f2823;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2778, this.f2801 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f2775;
        if (i3 == 48) {
            this.f2784 = rect2.top;
        } else if (i3 != 80) {
            this.f2784 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2784 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f2786 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f2786 = rect2.left;
        } else {
            this.f2786 = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f2803;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2803 = null;
        }
        m2169(this.f2774);
        float f = this.f2774;
        float fM2159 = m2159(rect2.left, rect.left, f, this.f2814);
        RectF rectF = this.f2777;
        rectF.left = fM2159;
        rectF.top = m2159(this.f2784, this.f2785, f, this.f2814);
        rectF.right = m2159(rect2.right, rect.right, f, this.f2814);
        rectF.bottom = m2159(rect2.bottom, rect.bottom, f, this.f2814);
        this.f2788 = m2159(this.f2786, this.f2787, f, this.f2814);
        this.f2789 = m2159(this.f2784, this.f2785, f, this.f2814);
        m2169(f);
        C1271 c1271 = AbstractC0164.f1186;
        this.f2825 = 1.0f - m2159(0.0f, 1.0f, 1.0f - f, c1271);
        Field field = AbstractC3578.f11184;
        textInputLayout.postInvalidateOnAnimation();
        this.f2826 = m2159(1.0f, 0.0f, f, c1271);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f2783;
        ColorStateList colorStateList2 = this.f2782;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m2158(m2163(colorStateList2), m2163(this.f2783), f));
        } else {
            textPaint.setColor(m2163(colorStateList));
        }
        float f2 = this.f2820;
        float f3 = this.f2821;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m2159(f3, f2, f, c1271));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f2806 = AbstractC0164.m1211(0.0f, this.f2816, f);
        this.f2807 = AbstractC0164.m1211(0.0f, this.f2817, f);
        this.f2808 = AbstractC0164.m1211(0.0f, this.f2818, f);
        int iM2158 = m2158(0, m2163(this.f2819), f);
        this.f2809 = iM2158;
        textPaint.setShadowLayer(this.f2806, this.f2807, this.f2808, iM2158);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2166(ColorStateList colorStateList) {
        if (this.f2783 == colorStateList && this.f2782 == colorStateList) {
            return;
        }
        this.f2783 = colorStateList;
        this.f2782 = colorStateList;
        m2165(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m2167(Typeface typeface) {
        C0556 c0556 = this.f2797;
        if (c0556 != null) {
            c0556.f2283 = true;
        }
        if (this.f2792 == typeface) {
            return false;
        }
        this.f2792 = typeface;
        Typeface typefaceM4668 = AbstractC2665.m4668(this.f2773.getContext().getResources().getConfiguration(), typeface);
        this.f2791 = typefaceM4668;
        if (typefaceM4668 == null) {
            typefaceM4668 = this.f2792;
        }
        this.f2790 = typefaceM4668;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2168(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f2774) {
            this.f2774 = f;
            Rect rect = this.f2775;
            float f2 = rect.left;
            Rect rect2 = this.f2776;
            float fM2159 = m2159(f2, rect2.left, f, this.f2814);
            RectF rectF = this.f2777;
            rectF.left = fM2159;
            rectF.top = m2159(this.f2784, this.f2785, f, this.f2814);
            rectF.right = m2159(rect.right, rect2.right, f, this.f2814);
            rectF.bottom = m2159(rect.bottom, rect2.bottom, f, this.f2814);
            this.f2788 = m2159(this.f2786, this.f2787, f, this.f2814);
            this.f2789 = m2159(this.f2784, this.f2785, f, this.f2814);
            m2169(f);
            C1271 c1271 = AbstractC0164.f1186;
            this.f2825 = 1.0f - m2159(0.0f, 1.0f, 1.0f - f, c1271);
            Field field = AbstractC3578.f11184;
            TextInputLayout textInputLayout = this.f2773;
            textInputLayout.postInvalidateOnAnimation();
            this.f2826 = m2159(1.0f, 0.0f, f, c1271);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f2783;
            ColorStateList colorStateList2 = this.f2782;
            TextPaint textPaint = this.f2812;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m2158(m2163(colorStateList2), m2163(this.f2783), f));
            } else {
                textPaint.setColor(m2163(colorStateList));
            }
            float f3 = this.f2820;
            float f4 = this.f2821;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m2159(f4, f3, f, c1271));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f2806 = AbstractC0164.m1211(0.0f, this.f2816, f);
            this.f2807 = AbstractC0164.m1211(0.0f, this.f2817, f);
            this.f2808 = AbstractC0164.m1211(0.0f, this.f2818, f);
            int iM2158 = m2158(0, m2163(this.f2819), f);
            this.f2809 = iM2158;
            textPaint.setShadowLayer(this.f2806, this.f2807, this.f2808, iM2158);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2169(float f) {
        m2161(f, false);
        Field field = AbstractC3578.f11184;
        this.f2773.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2170(Typeface typeface) {
        boolean z;
        boolean zM2167 = m2167(typeface);
        if (this.f2795 != typeface) {
            this.f2795 = typeface;
            Typeface typefaceM4668 = AbstractC2665.m4668(this.f2773.getContext().getResources().getConfiguration(), typeface);
            this.f2794 = typefaceM4668;
            if (typefaceM4668 == null) {
                typefaceM4668 = this.f2795;
            }
            this.f2793 = typefaceM4668;
            z = true;
        } else {
            z = false;
        }
        if (zM2167 || z) {
            m2165(false);
        }
    }
}
