package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0722 extends AbstractC1214 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f2740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final TimeInterpolator f2742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final TimeInterpolator f2743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public EditText f2744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ViewOnClickListenerC0111 f2745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC0719 f2746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public AnimatorSet f2747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ValueAnimator f2748;

    public C0722(C1213 c1213) {
        super(c1213);
        this.f2745 = new ViewOnClickListenerC0111(this, 2);
        this.f2746 = new ViewOnFocusChangeListenerC0719(this, 0);
        this.f2740 = AbstractC3744.m5341(c1213.getContext(), R.attr.motionDurationShort3, 100);
        this.f2741 = AbstractC3744.m5341(c1213.getContext(), R.attr.motionDurationShort3, Opcodes.FCMPG);
        this.f2742 = AbstractC3744.m5342(c1213.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0172.f1253);
        this.f2743 = AbstractC3744.m5342(c1213.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1256);
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo2237() {
        if (this.f4371.f4363 != null) {
            return;
        }
        m2247(m2248());
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo2238() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo2239() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo2240() {
        return this.f2746;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final View.OnClickListener mo2241() {
        return this.f2745;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo2242() {
        return this.f2746;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void mo2243(EditText editText) {
        this.f2744 = editText;
        this.f4370.setEndIconVisible(m2248());
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo2244(boolean z) {
        if (this.f4371.f4363 == null) {
            return;
        }
        m2247(z);
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void mo2245() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2743);
        valueAnimatorOfFloat.setDuration(this.f2741);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤝᤞᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0722 f2737;

            {
                this.f2737 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0722 c0722 = this.f2737;
                        c0722.getClass();
                        c0722.f4373.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0722 c0723 = this.f2737;
                        c0723.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0723.f4373;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2742;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f2740;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤝᤞᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0722 f2737;

            {
                this.f2737 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0722 c0722 = this.f2737;
                        c0722.getClass();
                        c0722.f4373.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0722 c0723 = this.f2737;
                        c0723.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0723.f4373;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2747 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2747.addListener(new C0721(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤝᤞᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
            public final /* synthetic */ C0722 f2737;

            {
                this.f2737 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0722 c0722 = this.f2737;
                        c0722.getClass();
                        c0722.f4373.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0722 c0723 = this.f2737;
                        c0723.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0723.f4373;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2748 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0721(this, i));
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo2246() {
        EditText editText = this.f2744;
        if (editText != null) {
            editText.post(new RunnableC0541(this, 1));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m2247(boolean z) {
        boolean z2 = this.f4371.m2939() == z;
        if (z && !this.f2747.isRunning()) {
            this.f2748.cancel();
            this.f2747.start();
            if (z2) {
                this.f2747.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f2747.cancel();
        this.f2748.start();
        if (z2) {
            this.f2748.end();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final boolean m2248() {
        EditText editText = this.f2744;
        if (editText != null) {
            return (editText.hasFocus() || this.f4373.hasFocus()) && this.f2744.getText().length() > 0;
        }
        return false;
    }
}
