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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲁᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1646 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f5550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final TimeInterpolator f5553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final TimeInterpolator f5554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TimeInterpolator f5555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Context f5556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final TextInputLayout f5557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public LinearLayout f5558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f5559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public FrameLayout f5560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public AnimatorSet f5561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final float f5562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f5563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f5564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public CharSequence f5565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f5566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C0246 f5567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public CharSequence f5568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f5569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f5570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public ColorStateList f5571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public CharSequence f5572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public boolean f5573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C0246 f5574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public int f5575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f5576;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public Typeface f5577;

    public C1646(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5556 = context;
        this.f5557 = textInputLayout;
        this.f5562 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5550 = AbstractC3744.m5341(context, R.attr.motionDurationShort4, 217);
        this.f5551 = AbstractC3744.m5341(context, R.attr.motionDurationMedium4, Opcodes.GOTO);
        this.f5552 = AbstractC3744.m5341(context, R.attr.motionDurationShort4, Opcodes.GOTO);
        this.f5553 = AbstractC3744.m5342(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0172.f1256);
        LinearInterpolator linearInterpolator = AbstractC0172.f1253;
        this.f5554 = AbstractC3744.m5342(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5555 = AbstractC3744.m5342(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3512(C0246 c0246, int i) {
        if (this.f5558 == null && this.f5560 == null) {
            Context context = this.f5556;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5558 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5558;
            TextInputLayout textInputLayout = this.f5557;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5560 = new FrameLayout(context);
            this.f5558.addView(this.f5560, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m3513();
            }
        }
        if (i == 0 || i == 1) {
            this.f5560.setVisibility(0);
            this.f5560.addView(c0246);
        } else {
            this.f5558.addView(c0246, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5558.setVisibility(0);
        this.f5559++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3513() {
        if (this.f5558 != null) {
            TextInputLayout textInputLayout = this.f5557;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f5556;
                boolean zM3398 = AbstractC1471.m3398(context);
                LinearLayout linearLayout = this.f5558;
                Field field = AbstractC3638.f11333;
                int paddingStart = editText.getPaddingStart();
                if (zM3398) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM3398) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM3398) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3514() {
        AnimatorSet animatorSet = this.f5561;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3515(ArrayList arrayList, boolean z, C0246 c0246, int i, int i2, int i3) {
        if (c0246 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0246, (Property<C0246, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f5552;
            objectAnimatorOfFloat.setDuration(z2 ? this.f5551 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f5554 : this.f5555);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0246, (Property<C0246, Float>) View.TRANSLATION_Y, -this.f5562, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f5550);
            objectAnimatorOfFloat2.setInterpolator(this.f5553);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final TextView m3516(int i) {
        if (i == 1) {
            return this.f5567;
        }
        if (i != 2) {
            return null;
        }
        return this.f5574;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3517() {
        this.f5565 = null;
        m3514();
        if (this.f5563 == 1) {
            if (!this.f5573 || TextUtils.isEmpty(this.f5572)) {
                this.f5564 = 0;
            } else {
                this.f5564 = 2;
            }
        }
        m3520(this.f5563, this.f5564, m3519(this.f5567, ""));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3518(C0246 c0246, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f5558;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f5560) != null) {
            frameLayout.removeView(c0246);
        } else {
            linearLayout.removeView(c0246);
        }
        int i2 = this.f5559 - 1;
        this.f5559 = i2;
        LinearLayout linearLayout2 = this.f5558;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m3519(C0246 c0246, CharSequence charSequence) {
        Field field = AbstractC3638.f11333;
        TextInputLayout textInputLayout = this.f5557;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f5564 == this.f5563 && c0246 != null && TextUtils.equals(c0246.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3520(int i, int i2, boolean z) {
        TextView textViewM3516;
        TextView textViewM3517;
        C1646 c1646 = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c1646.f5561 = animatorSet;
            ArrayList arrayList = new ArrayList();
            c1646.m3515(arrayList, c1646.f5573, c1646.f5574, 2, i, i2);
            c1646.m3515(arrayList, c1646.f5566, c1646.f5567, 1, i, i2);
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
            C1644 c1644 = new C1644(this, i2, m3516(i), i, c1646.m3516(i2));
            c1646 = this;
            animatorSet.addListener(c1644);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM3517 = c1646.m3516(i2)) != null) {
                textViewM3517.setVisibility(0);
                textViewM3517.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM3516 = m3516(i)) != null) {
                textViewM3516.setVisibility(4);
                if (i == 1) {
                    textViewM3516.setText((CharSequence) null);
                }
            }
            c1646.f5563 = i2;
        }
        TextInputLayout textInputLayout = c1646.f5557;
        textInputLayout.m853();
        textInputLayout.m856(z, false);
        textInputLayout.m859();
    }
}
