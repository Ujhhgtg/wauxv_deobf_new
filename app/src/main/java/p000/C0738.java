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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 {

    public final TextInputLayout f2773;

    public float f2774;

    public final Rect f2775;

    public final Rect f2776;

    public final RectF f2777;

    public ColorStateList f2782;

    public ColorStateList f2783;

    public float f2784;

    public float f2785;

    public float f2786;

    public float f2787;

    public float f2788;

    public float f2789;

    public Typeface f2790;

    public Typeface f2791;

    public Typeface f2792;

    public Typeface f2793;

    public Typeface f2794;

    public Typeface f2795;

    public Typeface f2796;

    public C0556 f2797;

    public CharSequence f2799;

    public CharSequence f2800;

    public boolean f2801;

    public Bitmap f2803;

    public float f2804;

    public float f2805;

    public float f2806;

    public float f2807;

    public float f2808;

    public int f2809;

    public int[] f2810;

    public boolean f2811;

    public final TextPaint f2812;

    public final TextPaint f2813;

    public TimeInterpolator f2814;

    public TimeInterpolator f2815;

    public float f2816;

    public float f2817;

    public float f2818;

    public ColorStateList f2819;

    public float f2820;

    public float f2821;

    public float f2822;

    public StaticLayout f2823;

    public float f2824;

    public float f2825;

    public float f2826;

    public CharSequence f2827;

    public int f2778 = 16;

    public int f2779 = 16;

    public float f2780 = 15.0f;

    public float f2781 = 15.0f;

    public final TextUtils.TruncateAt f2798 = TextUtils.TruncateAt.END;

    public final boolean f2802 = true;

    public final int f2828 = 1;

    public final float f2829 = 1.0f;

    public final int f2830 = 1;

    public C0738(TextInputLayout textInputLayout) {
        this.f2773 = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f2812 = textPaint;
        this.f2813 = new TextPaint(textPaint);
        this.f2776 = new Rect();
        this.f2775 = new Rect();
        this.f2777 = new RectF();
        m2164(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int m2158(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float m2159(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0164.m1211(f, f2, f3);
    }

    public final boolean m2160(CharSequence charSequence) {
        Field field = AbstractC3578.f11184;
        boolean z = this.f2773.getLayoutDirection() == 1;
        if (this.f2802) {
            return (z ? AbstractC2905.f9348 : AbstractC2905.f9347).m1671(charSequence.length(), charSequence);
        }
        return z;
    }

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
            int i = 1;
            if (true) {
                i = 1;
            }
            if (true) {
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
            c2814.f9017 = Layout.Alignment.ALIGN_NORMAL;
            c2814.f9021 = false;
            c2814.f9018 = 1;
            c2814.f9019 = 1.0f;
            c2814.f9020 = 1;
            StaticLayout staticLayoutM4792 = c2814.m4792();
            
            this.f2823 = staticLayoutM4792;
            this.f2800 = staticLayoutM4792.getText();
        }
    }

    public final float m2162() {
        float f = this.f2781;
        TextPaint textPaint = this.f2813;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f2790);
        textPaint.setLetterSpacing(this.f2820);
        return -textPaint.ascent();
    }

    public final int m2163(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2810;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

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
        if (true) {
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

    public final void m2166(ColorStateList colorStateList) {
        if (this.f2783 == colorStateList && this.f2782 == colorStateList) {
            return;
        }
        this.f2783 = colorStateList;
        this.f2782 = colorStateList;
        m2165(false);
    }

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

    public final void m2169(float f) {
        m2161(f, false);
        Field field = AbstractC3578.f11184;
        this.f2773.postInvalidateOnAnimation();
    }

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
