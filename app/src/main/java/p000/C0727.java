package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0727 extends AbstractC1213 {

    public final int f2746;

    public final int f2747;

    public final TimeInterpolator f2748;

    public final TimeInterpolator f2749;

    public EditText f2750;

    public final ViewOnClickListenerC0103 f2751;

    public final ViewOnFocusChangeListenerC0724 f2752;

    public AnimatorSet f2753;

    public ValueAnimator f2754;

    public C0727(C1212 c1212) {
        super(c1212);
        this.f2751 = new ViewOnClickListenerC0103(2, this);
        this.f2752 = new ViewOnFocusChangeListenerC0724(this, 0);
        this.f2746 = AbstractC1574.m3308(c1212.getContext(), R.attr.motionDurationShort3, 100);
        this.f2747 = AbstractC1574.m3308(c1212.getContext(), R.attr.motionDurationShort3, 150);
        this.f2748 = AbstractC1574.m3309(c1212.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0164.f1185);
        this.f2749 = AbstractC1574.m3309(c1212.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1188);
    }

    @Override // p000.AbstractC1213
    public final void mo2145() {
        if (this.f4374.f4366 != null) {
            return;
        }
        m2155(m2156());
    }

    @Override // p000.AbstractC1213
    public final int mo2146() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC1213
    public final int mo2147() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC1213
    public final View.OnFocusChangeListener mo2148() {
        return this.f2752;
    }

    @Override // p000.AbstractC1213
    public final View.OnClickListener mo2149() {
        return this.f2751;
    }

    @Override // p000.AbstractC1213
    public final View.OnFocusChangeListener mo2150() {
        return this.f2752;
    }

    @Override // p000.AbstractC1213
    public final void mo2151(EditText editText) {
        this.f2750 = editText;
        this.f4373.setEndIconVisible(m2156());
    }

    @Override // p000.AbstractC1213
    public final void mo2152(boolean z) {
        if (this.f4374.f4366 == null) {
            return;
        }
        m2155(z);
    }

    @Override // p000.AbstractC1213
    public final void mo2153() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2749);
        valueAnimatorOfFloat.setDuration(this.f2747);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᤝᲀᲇ

            public final /* synthetic */ C0727 f2743;

            {
                this.f2743 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (1) {
                    case 0:
                        C0727 c0727 = this.f2743;
                        
                        c0727.f4376.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0727 c0728 = this.f2743;
                        
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0728.f4376;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2748;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f2746;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᤝᲀᲇ

            public final /* synthetic */ C0727 f2743;

            {
                this.f2743 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (0) {
                    case 0:
                        C0727 c0727 = this.f2743;
                        
                        c0727.f4376.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0727 c0728 = this.f2743;
                        
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0728.f4376;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2753 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2753.addListener(new C0726(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᤝᲀᲇ

            public final /* synthetic */ C0727 f2743;

            {
                this.f2743 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (0) {
                    case 0:
                        C0727 c0727 = this.f2743;
                        
                        c0727.f4376.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0727 c0728 = this.f2743;
                        
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0728.f4376;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2754 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0726(this, 1));
    }

    @Override // p000.AbstractC1213
    public final void mo2154() {
        EditText editText = this.f2750;
        if (editText != null) {
            editText.post(new RunnableC0563(1, this));
        }
    }

    public final void m2155(boolean z) {
        boolean z2 = this.f4374.m2817() == z;
        if (z && !this.f2753.isRunning()) {
            this.f2754.cancel();
            this.f2753.start();
            if (z2) {
                this.f2753.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f2753.cancel();
        this.f2754.start();
        if (z2) {
            this.f2754.end();
        }
    }

    public final boolean m2156() {
        EditText editText = this.f2750;
        if (editText != null) {
            return (editText.hasFocus() || this.f4376.hasFocus()) && this.f2750.getText().length() > 0;
        }
        return false;
    }
}
