package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛳ能不能ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3245feyxiexzfUjhhgtg extends AbstractC3336feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f10170Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f10171Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final TimeInterpolator f10172Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public AutoCompleteTextView f10173Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ViewOnClickListenerC2974feyxiexzfUjhhgtg f10174Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg f10175Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C2579Ujhhgtgfeyxiexzf f10176Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f10177Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f10178Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f10179Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public long f10180Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AccessibilityManager f10181Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ValueAnimator f10182Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ValueAnimator f10183Ujhhgtgfeyxiexzf;

    public C3245feyxiexzfUjhhgtg(C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg) {
        super(c3335feyxiexzfUjhhgtg);
        this.f10174Ujhhgtgfeyxiexzf = new ViewOnClickListenerC2974feyxiexzfUjhhgtg(4, this);
        this.f10175Ujhhgtgfeyxiexzf = new ViewOnFocusChangeListenerC2829feyxiexzfUjhhgtg(this, 1);
        this.f10176Ujhhgtgfeyxiexzf = new C2579Ujhhgtgfeyxiexzf(this);
        this.f10180Ujhhgtgfeyxiexzf = Long.MAX_VALUE;
        this.f10171Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionDurationShort3, 67);
        this.f10170Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionDurationShort3, 50);
        this.f10172Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9412Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo4159Ujhhgtgfeyxiexzf() {
        if (this.f10181Ujhhgtgfeyxiexzf.isTouchExplorationEnabled() && this.f10173Ujhhgtgfeyxiexzf.getInputType() != 0 && !this.f10415Ujhhgtgfeyxiexzf.hasFocus()) {
            this.f10173Ujhhgtgfeyxiexzf.dismissDropDown();
        }
        this.f10173Ujhhgtgfeyxiexzf.post(new RunnableC2779feyxiexzfUjhhgtg(2, this));
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2879Ujhhgtgfeyxiexzf() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo2880Ujhhgtgfeyxiexzf() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final View.OnFocusChangeListener mo4160Ujhhgtgfeyxiexzf() {
        return this.f10175Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final View.OnClickListener mo2881Ujhhgtgfeyxiexzf() {
        return this.f10174Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2579Ujhhgtgfeyxiexzf mo4741Ujhhgtgfeyxiexzf() {
        return this.f10176Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean mo4742Ujhhgtgfeyxiexzf(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo2883Ujhhgtgfeyxiexzf() {
        return this.f10179Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo2884Ujhhgtgfeyxiexzf(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f10173Ujhhgtgfeyxiexzf = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛲᛳ能不能ᛱUjhhgtgᛱ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = this.f10153Ujhhgtgfeyxiexzf;
                    long j = jCurrentTimeMillis - c3245feyxiexzfUjhhgtg.f10180Ujhhgtgfeyxiexzf;
                    if (j < 0 || j > 300) {
                        c3245feyxiexzfUjhhgtg.f10178Ujhhgtgfeyxiexzf = false;
                    }
                    c3245feyxiexzfUjhhgtg.m4746Ujhhgtgfeyxiexzf();
                    c3245feyxiexzfUjhhgtg.f10178Ujhhgtgfeyxiexzf = true;
                    c3245feyxiexzfUjhhgtg.f10180Ujhhgtgfeyxiexzf = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f10173Ujhhgtgfeyxiexzf.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ能不能
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = this.f10152Ujhhgtgfeyxiexzf;
                c3245feyxiexzfUjhhgtg.f10178Ujhhgtgfeyxiexzf = true;
                c3245feyxiexzfUjhhgtg.f10180Ujhhgtgfeyxiexzf = System.currentTimeMillis();
                c3245feyxiexzfUjhhgtg.m4745Ujhhgtgfeyxiexzf(false);
            }
        });
        this.f10173Ujhhgtgfeyxiexzf.setThreshold(0);
        TextInputLayout textInputLayout = this.f10412Ujhhgtgfeyxiexzf;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f10181Ujhhgtgfeyxiexzf.isTouchExplorationEnabled()) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            this.f10415Ujhhgtgfeyxiexzf.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void mo4743Ujhhgtgfeyxiexzf(C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        if (this.f10173Ujhhgtgfeyxiexzf.getInputType() == 0) {
            c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void mo4744Ujhhgtgfeyxiexzf(AccessibilityEvent accessibilityEvent) {
        if (this.f10181Ujhhgtgfeyxiexzf.isEnabled() && this.f10173Ujhhgtgfeyxiexzf.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f10179Ujhhgtgfeyxiexzf && !this.f10173Ujhhgtgfeyxiexzf.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m4746Ujhhgtgfeyxiexzf();
                this.f10178Ujhhgtgfeyxiexzf = true;
                this.f10180Ujhhgtgfeyxiexzf = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo2885Ujhhgtgfeyxiexzf() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f10172Ujhhgtgfeyxiexzf;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f10171Ujhhgtgfeyxiexzf);
        valueAnimatorOfFloat.addUpdateListener(new C3235feyxiexzfUjhhgtg(0, this));
        this.f10183Ujhhgtgfeyxiexzf = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f10170Ujhhgtgfeyxiexzf);
        valueAnimatorOfFloat2.addUpdateListener(new C3235feyxiexzfUjhhgtg(0, this));
        this.f10182Ujhhgtgfeyxiexzf = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C2994Ujhhgtgfeyxiexzf(3, this));
        this.f10181Ujhhgtgfeyxiexzf = (AccessibilityManager) this.f10414Ujhhgtgfeyxiexzf.getSystemService("accessibility");
    }

    @Override // p000.AbstractC3336feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo2886Ujhhgtgfeyxiexzf() {
        AutoCompleteTextView autoCompleteTextView = this.f10173Ujhhgtgfeyxiexzf;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f10173Ujhhgtgfeyxiexzf.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4745Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f10179Ujhhgtgfeyxiexzf != z) {
            this.f10179Ujhhgtgfeyxiexzf = z;
            this.f10183Ujhhgtgfeyxiexzf.cancel();
            this.f10182Ujhhgtgfeyxiexzf.start();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m4746Ujhhgtgfeyxiexzf() {
        if (this.f10173Ujhhgtgfeyxiexzf == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f10180Ujhhgtgfeyxiexzf;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f10178Ujhhgtgfeyxiexzf = false;
        }
        if (this.f10178Ujhhgtgfeyxiexzf) {
            this.f10178Ujhhgtgfeyxiexzf = false;
            return;
        }
        m4745Ujhhgtgfeyxiexzf(!this.f10179Ujhhgtgfeyxiexzf);
        if (!this.f10179Ujhhgtgfeyxiexzf) {
            this.f10173Ujhhgtgfeyxiexzf.dismissDropDown();
        } else {
            this.f10173Ujhhgtgfeyxiexzf.requestFocus();
            this.f10173Ujhhgtgfeyxiexzf.showDropDown();
        }
    }
}
