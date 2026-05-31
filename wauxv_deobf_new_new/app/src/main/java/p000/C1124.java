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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1124 extends AbstractC1214 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f4176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f4177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final TimeInterpolator f4178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public AutoCompleteTextView f4179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ViewOnClickListenerC0111 f4180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC0719 f4181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C0441 f4182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f4183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f4184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f4185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public long f4186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public AccessibilityManager f4187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public ValueAnimator f4188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ValueAnimator f4189;

    public C1124(C1213 c1213) {
        super(c1213);
        this.f4180 = new ViewOnClickListenerC0111(this, 4);
        this.f4181 = new ViewOnFocusChangeListenerC0719(this, 1);
        this.f4182 = new C0441(this);
        this.f4186 = Long.MAX_VALUE;
        this.f4177 = AbstractC3744.m5341(c1213.getContext(), R.attr.motionDurationShort3, 67);
        this.f4176 = AbstractC3744.m5341(c1213.getContext(), R.attr.motionDurationShort3, 50);
        this.f4178 = AbstractC3744.m5342(c1213.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0172.f1253);
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2237() {
        if (this.f4187.isTouchExplorationEnabled() && this.f4179.getInputType() != 0 && !this.f4373.hasFocus()) {
            this.f4179.dismissDropDown();
        }
        this.f4179.post(new RunnableC0541(this, 2));
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2238() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo2239() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final View.OnFocusChangeListener mo2240() {
        return this.f4181;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final View.OnClickListener mo2241() {
        return this.f4180;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0441 mo2836() {
        return this.f4182;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean mo2837(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean mo2838() {
        return this.f4185;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo2243(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f4179 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᛸᤞᲇ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1124 c1124 = this.f4174;
                    long j = jCurrentTimeMillis - c1124.f4186;
                    if (j < 0 || j > 300) {
                        c1124.f4184 = false;
                    }
                    c1124.m2842();
                    c1124.f4184 = true;
                    c1124.f4186 = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f4179.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᛸᲇᤞ
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C1124 c1124 = this.f4175;
                c1124.f4184 = true;
                c1124.f4186 = System.currentTimeMillis();
                c1124.m2841(false);
            }
        });
        this.f4179.setThreshold(0);
        TextInputLayout textInputLayout = this.f4370;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f4187.isTouchExplorationEnabled()) {
            Field field = AbstractC3638.f11333;
            this.f4373.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void mo2839(C0100 c0100) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0100.f1113;
        if (this.f4179.getInputType() == 0) {
            c0100.m1241(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2840(AccessibilityEvent accessibilityEvent) {
        if (this.f4187.isEnabled() && this.f4179.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f4185 && !this.f4179.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m2842();
                this.f4184 = true;
                this.f4186 = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2245() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4178;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f4177);
        valueAnimatorOfFloat.addUpdateListener(new C1121(this, 0));
        this.f4189 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f4176);
        valueAnimatorOfFloat2.addUpdateListener(new C1121(this, 0));
        this.f4188 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0131(this, 3));
        this.f4187 = (AccessibilityManager) this.f4372.getSystemService("accessibility");
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo2246() {
        AutoCompleteTextView autoCompleteTextView = this.f4179;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f4179.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m2841(boolean z) {
        if (this.f4185 != z) {
            this.f4185 = z;
            this.f4189.cancel();
            this.f4188.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m2842() {
        if (this.f4179 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4186;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f4184 = false;
        }
        if (this.f4184) {
            this.f4184 = false;
            return;
        }
        m2841(!this.f4185);
        if (!this.f4185) {
            this.f4179.dismissDropDown();
        } else {
            this.f4179.requestFocus();
            this.f4179.showDropDown();
        }
    }
}
