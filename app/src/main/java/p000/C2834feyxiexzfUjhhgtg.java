package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2834feyxiexzfUjhhgtg extends AbstractC3336feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f9006Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f9007Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final TimeInterpolator f9008Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final TimeInterpolator f9009Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public EditText f9010Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewOnClickListenerC2974feyxiexzfUjhhgtg f9011Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg f9012Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AnimatorSet f9013Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public ValueAnimator f9014Ujhhgtgfeyxiexzf;

    public C2834feyxiexzfUjhhgtg(C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg) {
        super(c3335feyxiexzfUjhhgtg);
        this.f9011Ujhhgtgfeyxiexzf = new ViewOnClickListenerC2974feyxiexzfUjhhgtg(2, this);
        this.f9012Ujhhgtgfeyxiexzf = new ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg(this, 0);
        this.f9006Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionDurationShort3, 100);
        this.f9007Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionDurationShort3, Opcodes.FCMPG);
        this.f9008Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf);
        this.f9009Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9415Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo4159Ujhhgtgfeyxiexzf() {
        if (this.f10413Ujhhgtgfeyxiexzf.f10405Ujhhgtgfeyxiexzf != null) {
            return;
        }
        m4163Ujhhgtgfeyxiexzf(m4164Ujhhgtgfeyxiexzf());
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2879Ujhhgtgfeyxiexzf() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo2880Ujhhgtgfeyxiexzf() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo4160Ujhhgtgfeyxiexzf() {
        return this.f9012Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final View.OnClickListener mo2881Ujhhgtgfeyxiexzf() {
        return this.f9011Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo4161Ujhhgtgfeyxiexzf() {
        return this.f9012Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo2884Ujhhgtgfeyxiexzf(EditText editText) {
        this.f9010Ujhhgtgfeyxiexzf = editText;
        this.f10412Ujhhgtgfeyxiexzf.setEndIconVisible(m4164Ujhhgtgfeyxiexzf());
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo4162Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f10413Ujhhgtgfeyxiexzf.f10405Ujhhgtgfeyxiexzf == null) {
            return;
        }
        m4163Ujhhgtgfeyxiexzf(z);
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo2885Ujhhgtgfeyxiexzf() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f9009Ujhhgtgfeyxiexzf);
        valueAnimatorOfFloat.setDuration(this.f9007Ujhhgtgfeyxiexzf);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛲ

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
            public final /* synthetic */ C2834feyxiexzfUjhhgtg f9016Ujhhgtgfeyxiexzf;

            {
                this.f9016Ujhhgtgfeyxiexzf = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg.getClass();
                        c2834feyxiexzfUjhhgtg.f10415Ujhhgtgfeyxiexzf.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg2 = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c2834feyxiexzfUjhhgtg2.f10415Ujhhgtgfeyxiexzf;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f9008Ujhhgtgfeyxiexzf;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f9006Ujhhgtgfeyxiexzf;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛲ

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
            public final /* synthetic */ C2834feyxiexzfUjhhgtg f9016Ujhhgtgfeyxiexzf;

            {
                this.f9016Ujhhgtgfeyxiexzf = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg.getClass();
                        c2834feyxiexzfUjhhgtg.f10415Ujhhgtgfeyxiexzf.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg2 = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c2834feyxiexzfUjhhgtg2.f10415Ujhhgtgfeyxiexzf;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9013Ujhhgtgfeyxiexzf = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f9013Ujhhgtgfeyxiexzf.addListener(new C2838feyxiexzfUjhhgtg(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛲ

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
            public final /* synthetic */ C2834feyxiexzfUjhhgtg f9016Ujhhgtgfeyxiexzf;

            {
                this.f9016Ujhhgtgfeyxiexzf = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg.getClass();
                        c2834feyxiexzfUjhhgtg.f10415Ujhhgtgfeyxiexzf.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2834feyxiexzfUjhhgtg c2834feyxiexzfUjhhgtg2 = this.f9016Ujhhgtgfeyxiexzf;
                        c2834feyxiexzfUjhhgtg2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c2834feyxiexzfUjhhgtg2.f10415Ujhhgtgfeyxiexzf;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f9014Ujhhgtgfeyxiexzf = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C2838feyxiexzfUjhhgtg(this, i));
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo2886Ujhhgtgfeyxiexzf() {
        EditText editText = this.f9010Ujhhgtgfeyxiexzf;
        if (editText != null) {
            editText.post(new RunnableC2779feyxiexzfUjhhgtg(1, this));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4163Ujhhgtgfeyxiexzf(boolean z) {
        boolean z2 = this.f10413Ujhhgtgfeyxiexzf.m4829Ujhhgtgfeyxiexzf() == z;
        if (z && !this.f9013Ujhhgtgfeyxiexzf.isRunning()) {
            this.f9014Ujhhgtgfeyxiexzf.cancel();
            this.f9013Ujhhgtgfeyxiexzf.start();
            if (z2) {
                this.f9013Ujhhgtgfeyxiexzf.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f9013Ujhhgtgfeyxiexzf.cancel();
        this.f9014Ujhhgtgfeyxiexzf.start();
        if (z2) {
            this.f9014Ujhhgtgfeyxiexzf.end();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final boolean m4164Ujhhgtgfeyxiexzf() {
        EditText editText = this.f9010Ujhhgtgfeyxiexzf;
        if (editText != null) {
            return (editText.hasFocus() || this.f10415Ujhhgtgfeyxiexzf.hasFocus()) && this.f9010Ujhhgtgfeyxiexzf.getText().length() > 0;
        }
        return false;
    }
}
