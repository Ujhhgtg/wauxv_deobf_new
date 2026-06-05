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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2850Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextInputLayout f9050Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public float f9051Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Rect f9052Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f9053Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final RectF f9054Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f9059Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ColorStateList f9060Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f9061Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public float f9062Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public float f9063Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f9064Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f9065Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public float f9066Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Typeface f9067Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public Typeface f9068Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public Typeface f9069Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Typeface f9070Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Typeface f9071Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public Typeface f9072Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Typeface f9073Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2643feyxiexzfUjhhgtg f9074feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public CharSequence f9076feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public CharSequence f9077feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f9078feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public Bitmap f9080feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public float f9081feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public float f9082feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f9083feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public float f9084feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f9085feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public int f9086feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int[] f9087feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public boolean f9088feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final TextPaint f9089feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final TextPaint f9090feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public TimeInterpolator f9091feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public TimeInterpolator f9092feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public float f9093feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public float f9094feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f9095feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public ColorStateList f9096feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f9097feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f9098Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f9099Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public StaticLayout f9100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f9101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f9102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f9103Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public CharSequence f9104feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f9055Ujhhgtgfeyxiexzf = 16;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f9056Ujhhgtgfeyxiexzf = 16;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f9057Ujhhgtgfeyxiexzf = 15.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f9058Ujhhgtgfeyxiexzf = 15.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final TextUtils.TruncateAt f9075feyxiexzfUjhhgtg = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f9079feyxiexzfUjhhgtg = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final int f9105feyxiexzfUjhhgtg = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final float f9106feyxiexzfUjhhgtg = 1.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int f9107feyxiexzfUjhhgtg = 1;

    public C2850Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout) {
        this.f9050Ujhhgtgfeyxiexzf = textInputLayout;
        TextPaint textPaint = new TextPaint(Opcodes.LOR);
        this.f9089feyxiexzfUjhhgtg = textPaint;
        this.f9090feyxiexzfUjhhgtg = new TextPaint(textPaint);
        this.f9053Ujhhgtgfeyxiexzf = new Rect();
        this.f9052Ujhhgtgfeyxiexzf = new Rect();
        this.f9054Ujhhgtgfeyxiexzf = new RectF();
        m4183Ujhhgtgfeyxiexzf(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static int m4177Ujhhgtgfeyxiexzf(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static float m4178Ujhhgtgfeyxiexzf(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(f, f2, f3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m4179Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean z = this.f9050Ujhhgtgfeyxiexzf.getLayoutDirection() == 1;
        if (this.f9079feyxiexzfUjhhgtg) {
            return (z ? AbstractC1968Ujhhgtgfeyxiexzf.f6452Ujhhgtgfeyxiexzf : AbstractC1968Ujhhgtgfeyxiexzf.f6451Ujhhgtgfeyxiexzf).m4011Ujhhgtgfeyxiexzf(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4180Ujhhgtgfeyxiexzf(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f9076feyxiexzfUjhhgtg == null) {
            return;
        }
        float fWidth = this.f9053Ujhhgtgfeyxiexzf.width();
        float fWidth2 = this.f9052Ujhhgtgfeyxiexzf.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f9058Ujhhgtgfeyxiexzf;
            f3 = this.f9097feyxiexzfUjhhgtg;
            this.f9081feyxiexzfUjhhgtg = 1.0f;
            typeface = this.f9067Ujhhgtgfeyxiexzf;
        } else {
            float f4 = this.f9057Ujhhgtgfeyxiexzf;
            float f5 = this.f9098Ujhhgtgfeyxiexzf;
            Typeface typeface2 = this.f9070Ujhhgtgfeyxiexzf;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f9081feyxiexzfUjhhgtg = 1.0f;
            } else {
                this.f9081feyxiexzfUjhhgtg = m4178Ujhhgtgfeyxiexzf(this.f9057Ujhhgtgfeyxiexzf, this.f9058Ujhhgtgfeyxiexzf, f, this.f9092feyxiexzfUjhhgtg) / this.f9057Ujhhgtgfeyxiexzf;
            }
            float f6 = this.f9058Ujhhgtgfeyxiexzf / this.f9057Ujhhgtgfeyxiexzf;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f9089feyxiexzfUjhhgtg;
        if (fWidth > 0.0f) {
            boolean z3 = this.f9082feyxiexzfUjhhgtg != f2;
            boolean z4 = this.f9099Ujhhgtgfeyxiexzf != f3;
            boolean z5 = this.f9073Ujhhgtgfeyxiexzf != typeface;
            StaticLayout staticLayout = this.f9100Ujhhgtgfeyxiexzf;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f9088feyxiexzfUjhhgtg;
            this.f9082feyxiexzfUjhhgtg = f2;
            this.f9099Ujhhgtgfeyxiexzf = f3;
            this.f9073Ujhhgtgfeyxiexzf = typeface;
            this.f9088feyxiexzfUjhhgtg = false;
            textPaint.setLinearText(this.f9081feyxiexzfUjhhgtg != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f9077feyxiexzfUjhhgtg == null || z2) {
            textPaint.setTextSize(this.f9082feyxiexzfUjhhgtg);
            textPaint.setTypeface(this.f9073Ujhhgtgfeyxiexzf);
            textPaint.setLetterSpacing(this.f9099Ujhhgtgfeyxiexzf);
            boolean zM4179Ujhhgtgfeyxiexzf = m4179Ujhhgtgfeyxiexzf(this.f9076feyxiexzfUjhhgtg);
            this.f9078feyxiexzfUjhhgtg = zM4179Ujhhgtgfeyxiexzf;
            int i = this.f9105feyxiexzfUjhhgtg;
            if (i <= 1 || zM4179Ujhhgtgfeyxiexzf) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f9055Ujhhgtgfeyxiexzf, zM4179Ujhhgtgfeyxiexzf ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f9078feyxiexzfUjhhgtg ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f9078feyxiexzfUjhhgtg ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            C1133feyxiexzfUjhhgtg c1133feyxiexzfUjhhgtg = new C1133feyxiexzfUjhhgtg(this.f9076feyxiexzfUjhhgtg, textPaint, (int) fWidth);
            c1133feyxiexzfUjhhgtg.f4294Ujhhgtgfeyxiexzf = this.f9075feyxiexzfUjhhgtg;
            c1133feyxiexzfUjhhgtg.f4293Ujhhgtgfeyxiexzf = zM4179Ujhhgtgfeyxiexzf;
            c1133feyxiexzfUjhhgtg.f4288Ujhhgtgfeyxiexzf = alignment;
            c1133feyxiexzfUjhhgtg.f4292Ujhhgtgfeyxiexzf = false;
            c1133feyxiexzfUjhhgtg.f4289Ujhhgtgfeyxiexzf = i;
            c1133feyxiexzfUjhhgtg.f4290Ujhhgtgfeyxiexzf = this.f9106feyxiexzfUjhhgtg;
            c1133feyxiexzfUjhhgtg.f4291Ujhhgtgfeyxiexzf = this.f9107feyxiexzfUjhhgtg;
            StaticLayout staticLayoutM2602Ujhhgtgfeyxiexzf = c1133feyxiexzfUjhhgtg.m2602Ujhhgtgfeyxiexzf();
            staticLayoutM2602Ujhhgtgfeyxiexzf.getClass();
            this.f9100Ujhhgtgfeyxiexzf = staticLayoutM2602Ujhhgtgfeyxiexzf;
            this.f9077feyxiexzfUjhhgtg = staticLayoutM2602Ujhhgtgfeyxiexzf.getText();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float m4181Ujhhgtgfeyxiexzf() {
        float f = this.f9058Ujhhgtgfeyxiexzf;
        TextPaint textPaint = this.f9090feyxiexzfUjhhgtg;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f9067Ujhhgtgfeyxiexzf);
        textPaint.setLetterSpacing(this.f9097feyxiexzfUjhhgtg);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m4182Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f9087feyxiexzfUjhhgtg;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m4183Ujhhgtgfeyxiexzf(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9069Ujhhgtgfeyxiexzf;
            if (typeface != null) {
                this.f9068Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5065Ujhhgtgfeyxiexzf(configuration, typeface);
            }
            Typeface typeface2 = this.f9072Ujhhgtgfeyxiexzf;
            if (typeface2 != null) {
                this.f9071Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5065Ujhhgtgfeyxiexzf(configuration, typeface2);
            }
            Typeface typeface3 = this.f9068Ujhhgtgfeyxiexzf;
            if (typeface3 == null) {
                typeface3 = this.f9069Ujhhgtgfeyxiexzf;
            }
            this.f9067Ujhhgtgfeyxiexzf = typeface3;
            Typeface typeface4 = this.f9071Ujhhgtgfeyxiexzf;
            if (typeface4 == null) {
                typeface4 = this.f9072Ujhhgtgfeyxiexzf;
            }
            this.f9070Ujhhgtgfeyxiexzf = typeface4;
            m4184Ujhhgtgfeyxiexzf(true);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4184Ujhhgtgfeyxiexzf(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f9050Ujhhgtgfeyxiexzf;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m4180Ujhhgtgfeyxiexzf(1.0f, z);
        CharSequence charSequence = this.f9077feyxiexzfUjhhgtg;
        TextPaint textPaint = this.f9089feyxiexzfUjhhgtg;
        if (charSequence != null && (staticLayout = this.f9100Ujhhgtgfeyxiexzf) != null) {
            this.f9104feyxiexzfUjhhgtg = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f9075feyxiexzfUjhhgtg);
        }
        CharSequence charSequence2 = this.f9104feyxiexzfUjhhgtg;
        if (charSequence2 != null) {
            this.f9101Ujhhgtgfeyxiexzf = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f9101Ujhhgtgfeyxiexzf = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f9056Ujhhgtgfeyxiexzf, this.f9078feyxiexzfUjhhgtg ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f9053Ujhhgtgfeyxiexzf;
        if (i == 48) {
            this.f9062Ujhhgtgfeyxiexzf = rect.top;
        } else if (i != 80) {
            this.f9062Ujhhgtgfeyxiexzf = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f9062Ujhhgtgfeyxiexzf = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f9064Ujhhgtgfeyxiexzf = rect.centerX() - (this.f9101Ujhhgtgfeyxiexzf / 2.0f);
        } else if (i2 != 5) {
            this.f9064Ujhhgtgfeyxiexzf = rect.left;
        } else {
            this.f9064Ujhhgtgfeyxiexzf = rect.right - this.f9101Ujhhgtgfeyxiexzf;
        }
        m4180Ujhhgtgfeyxiexzf(0.0f, z);
        StaticLayout staticLayout2 = this.f9100Ujhhgtgfeyxiexzf;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f9100Ujhhgtgfeyxiexzf;
        if (staticLayout3 == null || this.f9105feyxiexzfUjhhgtg <= 1) {
            CharSequence charSequence3 = this.f9077feyxiexzfUjhhgtg;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f9100Ujhhgtgfeyxiexzf;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9055Ujhhgtgfeyxiexzf, this.f9078feyxiexzfUjhhgtg ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f9052Ujhhgtgfeyxiexzf;
        if (i3 == 48) {
            this.f9061Ujhhgtgfeyxiexzf = rect2.top;
        } else if (i3 != 80) {
            this.f9061Ujhhgtgfeyxiexzf = rect2.centerY() - (height / 2.0f);
        } else {
            this.f9061Ujhhgtgfeyxiexzf = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f9063Ujhhgtgfeyxiexzf = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f9063Ujhhgtgfeyxiexzf = rect2.left;
        } else {
            this.f9063Ujhhgtgfeyxiexzf = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f9080feyxiexzfUjhhgtg;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9080feyxiexzfUjhhgtg = null;
        }
        m4188Ujhhgtgfeyxiexzf(this.f9051Ujhhgtgfeyxiexzf);
        float f = this.f9051Ujhhgtgfeyxiexzf;
        float fM4178Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(rect2.left, rect.left, f, this.f9091feyxiexzfUjhhgtg);
        RectF rectF = this.f9054Ujhhgtgfeyxiexzf;
        rectF.left = fM4178Ujhhgtgfeyxiexzf;
        rectF.top = m4178Ujhhgtgfeyxiexzf(this.f9061Ujhhgtgfeyxiexzf, this.f9062Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
        rectF.right = m4178Ujhhgtgfeyxiexzf(rect2.right, rect.right, f, this.f9091feyxiexzfUjhhgtg);
        rectF.bottom = m4178Ujhhgtgfeyxiexzf(rect2.bottom, rect.bottom, f, this.f9091feyxiexzfUjhhgtg);
        this.f9065Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(this.f9063Ujhhgtgfeyxiexzf, this.f9064Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
        this.f9066Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(this.f9061Ujhhgtgfeyxiexzf, this.f9062Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
        m4188Ujhhgtgfeyxiexzf(f);
        C3415Ujhhgtgfeyxiexzf c3415Ujhhgtgfeyxiexzf = AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf;
        this.f9102Ujhhgtgfeyxiexzf = 1.0f - m4178Ujhhgtgfeyxiexzf(0.0f, 1.0f, 1.0f - f, c3415Ujhhgtgfeyxiexzf);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        textInputLayout.postInvalidateOnAnimation();
        this.f9103Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(1.0f, 0.0f, f, c3415Ujhhgtgfeyxiexzf);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f9060Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList2 = this.f9059Ujhhgtgfeyxiexzf;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m4177Ujhhgtgfeyxiexzf(m4182Ujhhgtgfeyxiexzf(colorStateList2), m4182Ujhhgtgfeyxiexzf(this.f9060Ujhhgtgfeyxiexzf), f));
        } else {
            textPaint.setColor(m4182Ujhhgtgfeyxiexzf(colorStateList));
        }
        float f2 = this.f9097feyxiexzfUjhhgtg;
        float f3 = this.f9098Ujhhgtgfeyxiexzf;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m4178Ujhhgtgfeyxiexzf(f3, f2, f, c3415Ujhhgtgfeyxiexzf));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f9083feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9093feyxiexzfUjhhgtg, f);
        this.f9084feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9094feyxiexzfUjhhgtg, f);
        this.f9085feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9095feyxiexzfUjhhgtg, f);
        int iM4177Ujhhgtgfeyxiexzf = m4177Ujhhgtgfeyxiexzf(0, m4182Ujhhgtgfeyxiexzf(this.f9096feyxiexzfUjhhgtg), f);
        this.f9086feyxiexzfUjhhgtg = iM4177Ujhhgtgfeyxiexzf;
        textPaint.setShadowLayer(this.f9083feyxiexzfUjhhgtg, this.f9084feyxiexzfUjhhgtg, this.f9085feyxiexzfUjhhgtg, iM4177Ujhhgtgfeyxiexzf);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4185Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        if (this.f9060Ujhhgtgfeyxiexzf == colorStateList && this.f9059Ujhhgtgfeyxiexzf == colorStateList) {
            return;
        }
        this.f9060Ujhhgtgfeyxiexzf = colorStateList;
        this.f9059Ujhhgtgfeyxiexzf = colorStateList;
        m4184Ujhhgtgfeyxiexzf(false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m4186Ujhhgtgfeyxiexzf(Typeface typeface) {
        C2643feyxiexzfUjhhgtg c2643feyxiexzfUjhhgtg = this.f9074feyxiexzfUjhhgtg;
        if (c2643feyxiexzfUjhhgtg != null) {
            c2643feyxiexzfUjhhgtg.f8490Ujhhgtgfeyxiexzf = true;
        }
        if (this.f9069Ujhhgtgfeyxiexzf == typeface) {
            return false;
        }
        this.f9069Ujhhgtgfeyxiexzf = typeface;
        Typeface typefaceM5065Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5065Ujhhgtgfeyxiexzf(this.f9050Ujhhgtgfeyxiexzf.getContext().getResources().getConfiguration(), typeface);
        this.f9068Ujhhgtgfeyxiexzf = typefaceM5065Ujhhgtgfeyxiexzf;
        if (typefaceM5065Ujhhgtgfeyxiexzf == null) {
            typefaceM5065Ujhhgtgfeyxiexzf = this.f9069Ujhhgtgfeyxiexzf;
        }
        this.f9067Ujhhgtgfeyxiexzf = typefaceM5065Ujhhgtgfeyxiexzf;
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4187Ujhhgtgfeyxiexzf(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f9051Ujhhgtgfeyxiexzf) {
            this.f9051Ujhhgtgfeyxiexzf = f;
            Rect rect = this.f9052Ujhhgtgfeyxiexzf;
            float f2 = rect.left;
            Rect rect2 = this.f9053Ujhhgtgfeyxiexzf;
            float fM4178Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(f2, rect2.left, f, this.f9091feyxiexzfUjhhgtg);
            RectF rectF = this.f9054Ujhhgtgfeyxiexzf;
            rectF.left = fM4178Ujhhgtgfeyxiexzf;
            rectF.top = m4178Ujhhgtgfeyxiexzf(this.f9061Ujhhgtgfeyxiexzf, this.f9062Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
            rectF.right = m4178Ujhhgtgfeyxiexzf(rect.right, rect2.right, f, this.f9091feyxiexzfUjhhgtg);
            rectF.bottom = m4178Ujhhgtgfeyxiexzf(rect.bottom, rect2.bottom, f, this.f9091feyxiexzfUjhhgtg);
            this.f9065Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(this.f9063Ujhhgtgfeyxiexzf, this.f9064Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
            this.f9066Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(this.f9061Ujhhgtgfeyxiexzf, this.f9062Ujhhgtgfeyxiexzf, f, this.f9091feyxiexzfUjhhgtg);
            m4188Ujhhgtgfeyxiexzf(f);
            C3415Ujhhgtgfeyxiexzf c3415Ujhhgtgfeyxiexzf = AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf;
            this.f9102Ujhhgtgfeyxiexzf = 1.0f - m4178Ujhhgtgfeyxiexzf(0.0f, 1.0f, 1.0f - f, c3415Ujhhgtgfeyxiexzf);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            TextInputLayout textInputLayout = this.f9050Ujhhgtgfeyxiexzf;
            textInputLayout.postInvalidateOnAnimation();
            this.f9103Ujhhgtgfeyxiexzf = m4178Ujhhgtgfeyxiexzf(1.0f, 0.0f, f, c3415Ujhhgtgfeyxiexzf);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f9060Ujhhgtgfeyxiexzf;
            ColorStateList colorStateList2 = this.f9059Ujhhgtgfeyxiexzf;
            TextPaint textPaint = this.f9089feyxiexzfUjhhgtg;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m4177Ujhhgtgfeyxiexzf(m4182Ujhhgtgfeyxiexzf(colorStateList2), m4182Ujhhgtgfeyxiexzf(this.f9060Ujhhgtgfeyxiexzf), f));
            } else {
                textPaint.setColor(m4182Ujhhgtgfeyxiexzf(colorStateList));
            }
            float f3 = this.f9097feyxiexzfUjhhgtg;
            float f4 = this.f9098Ujhhgtgfeyxiexzf;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m4178Ujhhgtgfeyxiexzf(f4, f3, f, c3415Ujhhgtgfeyxiexzf));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f9083feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9093feyxiexzfUjhhgtg, f);
            this.f9084feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9094feyxiexzfUjhhgtg, f);
            this.f9085feyxiexzfUjhhgtg = AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.0f, this.f9095feyxiexzfUjhhgtg, f);
            int iM4177Ujhhgtgfeyxiexzf = m4177Ujhhgtgfeyxiexzf(0, m4182Ujhhgtgfeyxiexzf(this.f9096feyxiexzfUjhhgtg), f);
            this.f9086feyxiexzfUjhhgtg = iM4177Ujhhgtgfeyxiexzf;
            textPaint.setShadowLayer(this.f9083feyxiexzfUjhhgtg, this.f9084feyxiexzfUjhhgtg, this.f9085feyxiexzfUjhhgtg, iM4177Ujhhgtgfeyxiexzf);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4188Ujhhgtgfeyxiexzf(float f) {
        m4180Ujhhgtgfeyxiexzf(f, false);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        this.f9050Ujhhgtgfeyxiexzf.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4189Ujhhgtgfeyxiexzf(Typeface typeface) {
        boolean z;
        boolean zM4186Ujhhgtgfeyxiexzf = m4186Ujhhgtgfeyxiexzf(typeface);
        if (this.f9072Ujhhgtgfeyxiexzf != typeface) {
            this.f9072Ujhhgtgfeyxiexzf = typeface;
            Typeface typefaceM5065Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5065Ujhhgtgfeyxiexzf(this.f9050Ujhhgtgfeyxiexzf.getContext().getResources().getConfiguration(), typeface);
            this.f9071Ujhhgtgfeyxiexzf = typefaceM5065Ujhhgtgfeyxiexzf;
            if (typefaceM5065Ujhhgtgfeyxiexzf == null) {
                typefaceM5065Ujhhgtgfeyxiexzf = this.f9072Ujhhgtgfeyxiexzf;
            }
            this.f9070Ujhhgtgfeyxiexzf = typefaceM5065Ujhhgtgfeyxiexzf;
            z = true;
        } else {
            z = false;
        }
        if (zM4186Ujhhgtgfeyxiexzf || z) {
            m4184Ujhhgtgfeyxiexzf(false);
        }
    }
}
