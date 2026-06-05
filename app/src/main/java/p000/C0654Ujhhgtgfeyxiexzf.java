package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0654Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f2716Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f2717Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2718Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final TimeInterpolator f2719Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final TimeInterpolator f2720Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final TimeInterpolator f2721Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Context f2722Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final TextInputLayout f2723Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public LinearLayout f2724Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2725Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public FrameLayout f2726Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AnimatorSet f2727Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final float f2728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f2729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f2730Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CharSequence f2731Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f2732Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f2733Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public CharSequence f2734Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f2735Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f2736Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f2737Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public CharSequence f2738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f2739Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public C2384Ujhhgtgfeyxiexzf f2740feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f2741feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public ColorStateList f2742feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public Typeface f2743feyxiexzfUjhhgtg;

    public C0654Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2722Ujhhgtgfeyxiexzf = context;
        this.f2723Ujhhgtgfeyxiexzf = textInputLayout;
        this.f2728Ujhhgtgfeyxiexzf = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2716Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort4, 217);
        this.f2717Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationMedium4, Opcodes.GOTO);
        this.f2718Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationShort4, Opcodes.GOTO);
        this.f2719Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9415Ujhhgtgfeyxiexzf);
        LinearInterpolator linearInterpolator = AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf;
        this.f2720Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2721Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1914Ujhhgtgfeyxiexzf(C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf, int i) {
        if (this.f2724Ujhhgtgfeyxiexzf == null && this.f2726Ujhhgtgfeyxiexzf == null) {
            Context context = this.f2722Ujhhgtgfeyxiexzf;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2724Ujhhgtgfeyxiexzf = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2724Ujhhgtgfeyxiexzf;
            TextInputLayout textInputLayout = this.f2723Ujhhgtgfeyxiexzf;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2726Ujhhgtgfeyxiexzf = new FrameLayout(context);
            this.f2724Ujhhgtgfeyxiexzf.addView(this.f2726Ujhhgtgfeyxiexzf, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m1915Ujhhgtgfeyxiexzf();
            }
        }
        if (i == 0 || i == 1) {
            this.f2726Ujhhgtgfeyxiexzf.setVisibility(0);
            this.f2726Ujhhgtgfeyxiexzf.addView(c2384Ujhhgtgfeyxiexzf);
        } else {
            this.f2724Ujhhgtgfeyxiexzf.addView(c2384Ujhhgtgfeyxiexzf, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2724Ujhhgtgfeyxiexzf.setVisibility(0);
        this.f2725Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1915Ujhhgtgfeyxiexzf() {
        if (this.f2724Ujhhgtgfeyxiexzf != null) {
            TextInputLayout textInputLayout = this.f2723Ujhhgtgfeyxiexzf;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2722Ujhhgtgfeyxiexzf;
                boolean zM4567Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4567Ujhhgtgfeyxiexzf(context);
                LinearLayout linearLayout = this.f2724Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                int paddingStart = editText.getPaddingStart();
                if (zM4567Ujhhgtgfeyxiexzf) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM4567Ujhhgtgfeyxiexzf) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM4567Ujhhgtgfeyxiexzf) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1916Ujhhgtgfeyxiexzf() {
        AnimatorSet animatorSet = this.f2727Ujhhgtgfeyxiexzf;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1917Ujhhgtgfeyxiexzf(ArrayList arrayList, boolean z, C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf, int i, int i2, int i3) {
        if (c2384Ujhhgtgfeyxiexzf == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2384Ujhhgtgfeyxiexzf, (Property<C2384Ujhhgtgfeyxiexzf, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f2718Ujhhgtgfeyxiexzf;
            objectAnimatorOfFloat.setDuration(z2 ? this.f2717Ujhhgtgfeyxiexzf : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f2720Ujhhgtgfeyxiexzf : this.f2721Ujhhgtgfeyxiexzf);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c2384Ujhhgtgfeyxiexzf, (Property<C2384Ujhhgtgfeyxiexzf, Float>) View.TRANSLATION_Y, -this.f2728Ujhhgtgfeyxiexzf, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f2716Ujhhgtgfeyxiexzf);
            objectAnimatorOfFloat2.setInterpolator(this.f2719Ujhhgtgfeyxiexzf);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final TextView m1918Ujhhgtgfeyxiexzf(int i) {
        if (i == 1) {
            return this.f2733Ujhhgtgfeyxiexzf;
        }
        if (i != 2) {
            return null;
        }
        return this.f2740feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1919Ujhhgtgfeyxiexzf() {
        this.f2731Ujhhgtgfeyxiexzf = null;
        m1916Ujhhgtgfeyxiexzf();
        if (this.f2729Ujhhgtgfeyxiexzf == 1) {
            if (!this.f2739Ujhhgtgfeyxiexzf || TextUtils.isEmpty(this.f2738Ujhhgtgfeyxiexzf)) {
                this.f2730Ujhhgtgfeyxiexzf = 0;
            } else {
                this.f2730Ujhhgtgfeyxiexzf = 2;
            }
        }
        m1922Ujhhgtgfeyxiexzf(this.f2729Ujhhgtgfeyxiexzf, this.f2730Ujhhgtgfeyxiexzf, m1921Ujhhgtgfeyxiexzf(this.f2733Ujhhgtgfeyxiexzf, ""));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1920Ujhhgtgfeyxiexzf(C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2724Ujhhgtgfeyxiexzf;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f2726Ujhhgtgfeyxiexzf) != null) {
            frameLayout.removeView(c2384Ujhhgtgfeyxiexzf);
        } else {
            linearLayout.removeView(c2384Ujhhgtgfeyxiexzf);
        }
        int i2 = this.f2725Ujhhgtgfeyxiexzf - 1;
        this.f2725Ujhhgtgfeyxiexzf = i2;
        LinearLayout linearLayout2 = this.f2724Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m1921Ujhhgtgfeyxiexzf(C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf, CharSequence charSequence) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        TextInputLayout textInputLayout = this.f2723Ujhhgtgfeyxiexzf;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2730Ujhhgtgfeyxiexzf == this.f2729Ujhhgtgfeyxiexzf && c2384Ujhhgtgfeyxiexzf != null && TextUtils.equals(c2384Ujhhgtgfeyxiexzf.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1922Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        TextView textViewM1918Ujhhgtgfeyxiexzf;
        TextView textViewM1918Ujhhgtgfeyxiexzf2;
        C0654Ujhhgtgfeyxiexzf c0654Ujhhgtgfeyxiexzf = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0654Ujhhgtgfeyxiexzf.f2727Ujhhgtgfeyxiexzf = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0654Ujhhgtgfeyxiexzf.m1917Ujhhgtgfeyxiexzf(arrayList, c0654Ujhhgtgfeyxiexzf.f2739Ujhhgtgfeyxiexzf, c0654Ujhhgtgfeyxiexzf.f2740feyxiexzfUjhhgtg, 2, i, i2);
            c0654Ujhhgtgfeyxiexzf.m1917Ujhhgtgfeyxiexzf(arrayList, c0654Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf, c0654Ujhhgtgfeyxiexzf.f2733Ujhhgtgfeyxiexzf, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C0645Ujhhgtgfeyxiexzf c0645Ujhhgtgfeyxiexzf = new C0645Ujhhgtgfeyxiexzf(this, i2, m1918Ujhhgtgfeyxiexzf(i), i, c0654Ujhhgtgfeyxiexzf.m1918Ujhhgtgfeyxiexzf(i2));
            c0654Ujhhgtgfeyxiexzf = this;
            animatorSet.addListener(c0645Ujhhgtgfeyxiexzf);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM1918Ujhhgtgfeyxiexzf2 = c0654Ujhhgtgfeyxiexzf.m1918Ujhhgtgfeyxiexzf(i2)) != null) {
                textViewM1918Ujhhgtgfeyxiexzf2.setVisibility(0);
                textViewM1918Ujhhgtgfeyxiexzf2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM1918Ujhhgtgfeyxiexzf = m1918Ujhhgtgfeyxiexzf(i)) != null) {
                textViewM1918Ujhhgtgfeyxiexzf.setVisibility(4);
                if (i == 1) {
                    textViewM1918Ujhhgtgfeyxiexzf.setText((CharSequence) null);
                }
            }
            c0654Ujhhgtgfeyxiexzf.f2729Ujhhgtgfeyxiexzf = i2;
        }
        TextInputLayout textInputLayout = c0654Ujhhgtgfeyxiexzf.f2723Ujhhgtgfeyxiexzf;
        textInputLayout.m852Ujhhgtgfeyxiexzf();
        textInputLayout.m855Ujhhgtgfeyxiexzf(z, false);
        textInputLayout.m858Ujhhgtgfeyxiexzf();
    }
}
