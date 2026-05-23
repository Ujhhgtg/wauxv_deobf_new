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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1633 {

    public final int f5516;

    public final int f5517;

    public final int f5518;

    public final TimeInterpolator f5519;

    public final TimeInterpolator f5520;

    public final TimeInterpolator f5521;

    public final Context f5522;

    public final TextInputLayout f5523;

    public LinearLayout f5524;

    public int f5525;

    public FrameLayout f5526;

    public AnimatorSet f5527;

    public final float f5528;

    public int f5529;

    public int f5530;

    public CharSequence f5531;

    public boolean f5532;

    public C0236 f5533;

    public CharSequence f5534;

    public int f5535;

    public int f5536;

    public ColorStateList f5537;

    public CharSequence f5538;

    public boolean f5539;

    public C0236 f5540;

    public int f5541;

    public ColorStateList f5542;

    public Typeface f5543;

    public C1633(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5522 = context;
        this.f5523 = textInputLayout;
        this.f5528 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5516 = AbstractC1574.m3308(context, R.attr.motionDurationShort4, 217);
        this.f5517 = AbstractC1574.m3308(context, R.attr.motionDurationMedium4, 167);
        this.f5518 = AbstractC1574.m3308(context, R.attr.motionDurationShort4, 167);
        this.f5519 = AbstractC1574.m3309(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0164.f1188);
        LinearInterpolator linearInterpolator = AbstractC0164.f1185;
        this.f5520 = AbstractC1574.m3309(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5521 = AbstractC1574.m3309(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void m3348(C0236 c0236, int i) {
        if (this.f5524 == null && this.f5526 == null) {
            Context context = this.f5522;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5524 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5524;
            TextInputLayout textInputLayout = this.f5523;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5526 = new FrameLayout(context);
            this.f5524.addView(this.f5526, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m3349();
            }
        }
        if (i == 0 || i == 1) {
            this.f5526.setVisibility(0);
            this.f5526.addView(c0236);
        } else {
            this.f5524.addView(c0236, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5524.setVisibility(0);
        this.f5525++;
    }

    public final void m3349() {
        if (this.f5524 != null) {
            TextInputLayout textInputLayout = this.f5523;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f5522;
                boolean zM5001 = AbstractC3453.m5001(context);
                LinearLayout linearLayout = this.f5524;
                Field field = AbstractC3578.f11184;
                int paddingStart = editText.getPaddingStart();
                if (zM5001) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM5001) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM5001) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void m3350() {
        AnimatorSet animatorSet = this.f5527;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void m3351(ArrayList arrayList, boolean z, C0236 c0236, int i, int i2, int i3) {
        if (c0236 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0236, (Property<C0236, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f5518;
            objectAnimatorOfFloat.setDuration(z2 ? this.f5517 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f5520 : this.f5521);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0236, (Property<C0236, Float>) View.TRANSLATION_Y, -this.f5528, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f5516);
            objectAnimatorOfFloat2.setInterpolator(this.f5519);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView m3352(int i) {
        if (i == 1) {
            return this.f5533;
        }
        if (i != 2) {
            return null;
        }
        return this.f5540;
    }

    public final void m3353() {
        this.f5531 = null;
        m3350();
        if (this.f5529 == 1) {
            if (!this.f5539 || TextUtils.isEmpty(this.f5538)) {
                this.f5530 = 0;
            } else {
                this.f5530 = 2;
            }
        }
        m3356(this.f5529, this.f5530, m3355(this.f5533, ""));
    }

    public final void m3354(C0236 c0236, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f5524;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f5526) != null) {
            frameLayout.removeView(c0236);
        } else {
            linearLayout.removeView(c0236);
        }
        int i2 = this.f5525 - 1;
        this.f5525 = i2;
        LinearLayout linearLayout2 = this.f5524;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean m3355(C0236 c0236, CharSequence charSequence) {
        Field field = AbstractC3578.f11184;
        TextInputLayout textInputLayout = this.f5523;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f5530 == this.f5529 && c0236 != null && TextUtils.equals(c0236.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void m3356(int i, int i2, boolean z) {
        TextView textViewM3352;
        TextView textViewM3353;
        C1633 c1633 = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c1633.f5527 = animatorSet;
            ArrayList arrayList = new ArrayList();
            c1633.m3351(arrayList, c1633.f5539, c1633.f5540, 2, i, i2);
            c1633.m3351(arrayList, c1633.f5532, c1633.f5533, 1, i, i2);
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
            C1631 c1631 = new C1631(this, i2, m3352(i), i, c1633.m3352(i2));
            c1633 = this;
            animatorSet.addListener(c1631);
            animatorSet.start();
        } else if (true) {
            if (i2 != 0 && (textViewM3353 = c1633.m3352(i2)) != null) {
                textViewM3353.setVisibility(0);
                textViewM3353.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM3352 = m3352(i)) != null) {
                textViewM3352.setVisibility(4);
                if (i == 1) {
                    textViewM3352.setText((CharSequence) null);
                }
            }
            c1633.f5529 = i2;
        }
        TextInputLayout textInputLayout = c1633.f5523;
        textInputLayout.m709();
        textInputLayout.m712(z, false);
        textInputLayout.m715();
    }
}
