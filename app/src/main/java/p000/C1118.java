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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1118 extends AbstractC1213 {

    public final int f4165;

    public final int f4166;

    public final TimeInterpolator f4167;

    public AutoCompleteTextView f4168;

    public final ViewOnClickListenerC0103 f4169;

    public final ViewOnFocusChangeListenerC0724 f4170;

    public final C0466 f4171;

    public boolean f4172;

    public boolean f4173;

    public boolean f4174;

    public long f4175;

    public AccessibilityManager f4176;

    public ValueAnimator f4177;

    public ValueAnimator f4178;

    public C1118(C1212 c1212) {
        super(c1212);
        this.f4169 = new ViewOnClickListenerC0103(4, this);
        this.f4170 = new ViewOnFocusChangeListenerC0724(this, 1);
        this.f4171 = new C0466(this);
        this.f4175 = 9223372036854775807L;
        this.f4166 = AbstractC1574.m3308(c1212.getContext(), R.attr.motionDurationShort3, 67);
        this.f4165 = AbstractC1574.m3308(c1212.getContext(), R.attr.motionDurationShort3, 50);
        this.f4167 = AbstractC1574.m3309(c1212.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0164.f1185);
    }

    @Override // p000.AbstractC1213
    public final void mo2145() {
        if (this.f4176.isTouchExplorationEnabled() && this.f4168.getInputType() != 0 && !this.f4376.hasFocus()) {
            this.f4168.dismissDropDown();
        }
        this.f4168.post(new RunnableC0563(2, this));
    }

    @Override // p000.AbstractC1213
    public final int mo2146() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC1213
    public final int mo2147() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC1213
    public final View.OnFocusChangeListener mo2148() {
        return this.f4170;
    }

    @Override // p000.AbstractC1213
    public final View.OnClickListener mo2149() {
        return this.f4169;
    }

    @Override // p000.AbstractC1213
    public final C0466 mo2687() {
        return this.f4171;
    }

    @Override // p000.AbstractC1213
    public final boolean mo2688(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC1213
    public final boolean mo2689() {
        return this.f4174;
    }

    @Override // p000.AbstractC1213
    public final void mo2151(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f4168 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᛸᲇᤞ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1118 c1118 = this.f4163;
                    long j = jCurrentTimeMillis - c1118.f4175;
                    if (j < 0 || j > 300) {
                        c1118.f4173 = false;
                    }
                    c1118.m2693();
                    c1118.f4173 = true;
                    c1118.f4175 = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f4168.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᤞᛸᲇ
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C1118 c1118 = this.f4164;
                c1118.f4173 = true;
                c1118.f4175 = System.currentTimeMillis();
                c1118.m2692(false);
            }
        });
        this.f4168.setThreshold(0);
        TextInputLayout textInputLayout = this.f4373;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f4176.isTouchExplorationEnabled()) {
            Field field = AbstractC3578.f11184;
            this.f4376.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC1213
    public final void mo2690(C0092 c0092) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0092.f1045;
        if (this.f4168.getInputType() == 0) {
            c0092.m1095(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC1213
    public final void mo2691(AccessibilityEvent accessibilityEvent) {
        if (this.f4176.isEnabled() && this.f4168.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f4174 && !this.f4168.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m2693();
                this.f4173 = true;
                this.f4175 = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.AbstractC1213
    public final void mo2153() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4167;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f4166);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new C1115(0, this));
        this.f4178 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f4165);
        valueAnimatorOfFloat2.addUpdateListener(new C1115(0, this));
        this.f4177 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0123(3, this));
        this.f4176 = (AccessibilityManager) this.f4375.getSystemService("accessibility");
    }

    @Override // p000.AbstractC1213
    public final void mo2154() {
        AutoCompleteTextView autoCompleteTextView = this.f4168;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f4168.setOnDismissListener(null);
        }
    }

    public final void m2692(boolean z) {
        if (this.f4174 != z) {
            this.f4174 = z;
            this.f4178.cancel();
            this.f4177.start();
        }
    }

    public final void m2693() {
        if (this.f4168 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4175;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f4173 = false;
        }
        if (this.f4173) {
            this.f4173 = false;
            return;
        }
        m2692(!this.f4174);
        if (!this.f4174) {
            this.f4168.dismissDropDown();
        } else {
            this.f4168.requestFocus();
            this.f4168.showDropDown();
        }
    }
}
