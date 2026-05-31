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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0733 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextInputLayout f2767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f2768;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Rect f2769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect f2770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final RectF f2771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f2776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f2777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f2778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f2779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f2780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public float f2781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public float f2782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public float f2783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public Typeface f2784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Typeface f2785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Typeface f2786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Typeface f2787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Typeface f2788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public Typeface f2789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Typeface f2790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C0533 f2791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public CharSequence f2793;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public CharSequence f2794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public Bitmap f2797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public float f2798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public float f2799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public float f2800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public float f2801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public float f2802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public int f2803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int[] f2804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public boolean f2805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final TextPaint f2806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final TextPaint f2807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public TimeInterpolator f2808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public TimeInterpolator f2809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public float f2810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public float f2811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public float f2812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public ColorStateList f2813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public float f2814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public float f2815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public float f2816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public StaticLayout f2817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public float f2818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public float f2819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public float f2820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public CharSequence f2821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2772 = 16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f2773 = 16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f2774 = 15.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f2775 = 15.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final TextUtils.TruncateAt f2792 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f2796 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final int f2822 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public final float f2823 = 1.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public final int f2824 = 1;

    public C0733(TextInputLayout textInputLayout) {
        this.f2767 = textInputLayout;
        TextPaint textPaint = new TextPaint(Opcodes.LOR);
        this.f2806 = textPaint;
        this.f2807 = new TextPaint(textPaint);
        this.f2770 = new Rect();
        this.f2769 = new Rect();
        this.f2771 = new RectF();
        m2256(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static int m2250(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static float m2251(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0172.m1357(f, f2, f3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m2252(CharSequence charSequence) {
        Field field = AbstractC3638.f11333;
        boolean z = this.f2767.getLayoutDirection() == 1;
        if (this.f2796) {
            return (z ? AbstractC2964.f9515 : AbstractC2964.f9514).m1778(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2253(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f2793 == null) {
            return;
        }
        float fWidth = this.f2770.width();
        float fWidth2 = this.f2769.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f2775;
            f3 = this.f2814;
            this.f2798 = 1.0f;
            typeface = this.f2784;
        } else {
            float f4 = this.f2774;
            float f5 = this.f2815;
            Typeface typeface2 = this.f2787;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f2798 = 1.0f;
            } else {
                this.f2798 = m2251(this.f2774, this.f2775, f, this.f2809) / this.f2774;
            }
            float f6 = this.f2775 / this.f2774;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2806;
        if (fWidth > 0.0f) {
            boolean z3 = this.f2799 != f2;
            boolean z4 = this.f2816 != f3;
            boolean z5 = this.f2790 != typeface;
            StaticLayout staticLayout = this.f2817;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f2805;
            this.f2799 = f2;
            this.f2816 = f3;
            this.f2790 = typeface;
            this.f2805 = false;
            textPaint.setLinearText(this.f2798 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f2794 == null || z2) {
            textPaint.setTextSize(this.f2799);
            textPaint.setTypeface(this.f2790);
            textPaint.setLetterSpacing(this.f2816);
            boolean zM2252 = m2252(this.f2793);
            this.f2795 = zM2252;
            int i = this.f2822;
            if (i <= 1 || zM2252) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2772, zM2252 ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f2795 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f2795 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            C2874 c2874 = new C2874(this.f2793, textPaint, (int) fWidth);
            c2874.f9185 = this.f2792;
            c2874.f9184 = zM2252;
            c2874.f9179 = alignment;
            c2874.f9183 = false;
            c2874.f9180 = i;
            c2874.f9181 = this.f2823;
            c2874.f9182 = this.f2824;
            StaticLayout staticLayoutM4825 = c2874.m4825();
            staticLayoutM4825.getClass();
            this.f2817 = staticLayoutM4825;
            this.f2794 = staticLayoutM4825.getText();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float m2254() {
        float f = this.f2775;
        TextPaint textPaint = this.f2807;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f2784);
        textPaint.setLetterSpacing(this.f2814);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m2255(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2804;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2256(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2786;
            if (typeface != null) {
                this.f2785 = AbstractC2235.m4204(configuration, typeface);
            }
            Typeface typeface2 = this.f2789;
            if (typeface2 != null) {
                this.f2788 = AbstractC2235.m4204(configuration, typeface2);
            }
            Typeface typeface3 = this.f2785;
            if (typeface3 == null) {
                typeface3 = this.f2786;
            }
            this.f2784 = typeface3;
            Typeface typeface4 = this.f2788;
            if (typeface4 == null) {
                typeface4 = this.f2789;
            }
            this.f2787 = typeface4;
            m2257(true);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2257(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2767;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m2253(1.0f, z);
        CharSequence charSequence = this.f2794;
        TextPaint textPaint = this.f2806;
        if (charSequence != null && (staticLayout = this.f2817) != null) {
            this.f2821 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2792);
        }
        CharSequence charSequence2 = this.f2821;
        if (charSequence2 != null) {
            this.f2818 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2818 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2773, this.f2795 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f2770;
        if (i == 48) {
            this.f2779 = rect.top;
        } else if (i != 80) {
            this.f2779 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2779 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f2781 = rect.centerX() - (this.f2818 / 2.0f);
        } else if (i2 != 5) {
            this.f2781 = rect.left;
        } else {
            this.f2781 = rect.right - this.f2818;
        }
        m2253(0.0f, z);
        StaticLayout staticLayout2 = this.f2817;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f2817;
        if (staticLayout3 == null || this.f2822 <= 1) {
            CharSequence charSequence3 = this.f2794;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f2817;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2772, this.f2795 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f2769;
        if (i3 == 48) {
            this.f2778 = rect2.top;
        } else if (i3 != 80) {
            this.f2778 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2778 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f2780 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f2780 = rect2.left;
        } else {
            this.f2780 = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f2797;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2797 = null;
        }
        m2261(this.f2768);
        float f = this.f2768;
        float fM2251 = m2251(rect2.left, rect.left, f, this.f2808);
        RectF rectF = this.f2771;
        rectF.left = fM2251;
        rectF.top = m2251(this.f2778, this.f2779, f, this.f2808);
        rectF.right = m2251(rect2.right, rect.right, f, this.f2808);
        rectF.bottom = m2251(rect2.bottom, rect.bottom, f, this.f2808);
        this.f2782 = m2251(this.f2780, this.f2781, f, this.f2808);
        this.f2783 = m2251(this.f2778, this.f2779, f, this.f2808);
        m2261(f);
        C1273 c1273 = AbstractC0172.f1254;
        this.f2819 = 1.0f - m2251(0.0f, 1.0f, 1.0f - f, c1273);
        Field field = AbstractC3638.f11333;
        textInputLayout.postInvalidateOnAnimation();
        this.f2820 = m2251(1.0f, 0.0f, f, c1273);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f2777;
        ColorStateList colorStateList2 = this.f2776;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m2250(m2255(colorStateList2), m2255(this.f2777), f));
        } else {
            textPaint.setColor(m2255(colorStateList));
        }
        float f2 = this.f2814;
        float f3 = this.f2815;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m2251(f3, f2, f, c1273));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f2800 = AbstractC0172.m1357(0.0f, this.f2810, f);
        this.f2801 = AbstractC0172.m1357(0.0f, this.f2811, f);
        this.f2802 = AbstractC0172.m1357(0.0f, this.f2812, f);
        int iM2250 = m2250(0, m2255(this.f2813), f);
        this.f2803 = iM2250;
        textPaint.setShadowLayer(this.f2800, this.f2801, this.f2802, iM2250);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2258(ColorStateList colorStateList) {
        if (this.f2777 == colorStateList && this.f2776 == colorStateList) {
            return;
        }
        this.f2777 = colorStateList;
        this.f2776 = colorStateList;
        m2257(false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m2259(Typeface typeface) {
        C0533 c0533 = this.f2791;
        if (c0533 != null) {
            c0533.f2239 = true;
        }
        if (this.f2786 == typeface) {
            return false;
        }
        this.f2786 = typeface;
        Typeface typefaceM4204 = AbstractC2235.m4204(this.f2767.getContext().getResources().getConfiguration(), typeface);
        this.f2785 = typefaceM4204;
        if (typefaceM4204 == null) {
            typefaceM4204 = this.f2786;
        }
        this.f2784 = typefaceM4204;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2260(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f2768) {
            this.f2768 = f;
            Rect rect = this.f2769;
            float f2 = rect.left;
            Rect rect2 = this.f2770;
            float fM2251 = m2251(f2, rect2.left, f, this.f2808);
            RectF rectF = this.f2771;
            rectF.left = fM2251;
            rectF.top = m2251(this.f2778, this.f2779, f, this.f2808);
            rectF.right = m2251(rect.right, rect2.right, f, this.f2808);
            rectF.bottom = m2251(rect.bottom, rect2.bottom, f, this.f2808);
            this.f2782 = m2251(this.f2780, this.f2781, f, this.f2808);
            this.f2783 = m2251(this.f2778, this.f2779, f, this.f2808);
            m2261(f);
            C1273 c1273 = AbstractC0172.f1254;
            this.f2819 = 1.0f - m2251(0.0f, 1.0f, 1.0f - f, c1273);
            Field field = AbstractC3638.f11333;
            TextInputLayout textInputLayout = this.f2767;
            textInputLayout.postInvalidateOnAnimation();
            this.f2820 = m2251(1.0f, 0.0f, f, c1273);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f2777;
            ColorStateList colorStateList2 = this.f2776;
            TextPaint textPaint = this.f2806;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m2250(m2255(colorStateList2), m2255(this.f2777), f));
            } else {
                textPaint.setColor(m2255(colorStateList));
            }
            float f3 = this.f2814;
            float f4 = this.f2815;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m2251(f4, f3, f, c1273));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f2800 = AbstractC0172.m1357(0.0f, this.f2810, f);
            this.f2801 = AbstractC0172.m1357(0.0f, this.f2811, f);
            this.f2802 = AbstractC0172.m1357(0.0f, this.f2812, f);
            int iM2250 = m2250(0, m2255(this.f2813), f);
            this.f2803 = iM2250;
            textPaint.setShadowLayer(this.f2800, this.f2801, this.f2802, iM2250);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2261(float f) {
        m2253(f, false);
        Field field = AbstractC3638.f11333;
        this.f2767.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2262(Typeface typeface) {
        boolean z;
        boolean zM2259 = m2259(typeface);
        if (this.f2789 != typeface) {
            this.f2789 = typeface;
            Typeface typefaceM4204 = AbstractC2235.m4204(this.f2767.getContext().getResources().getConfiguration(), typeface);
            this.f2788 = typefaceM4204;
            if (typefaceM4204 == null) {
                typefaceM4204 = this.f2789;
            }
            this.f2787 = typefaceM4204;
            z = true;
        } else {
            z = false;
        }
        if (zM2259 || z) {
            m2257(false);
        }
    }
}
