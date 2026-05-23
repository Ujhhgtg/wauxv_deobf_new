package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1212 extends LinearLayout {

    public final TextInputLayout f4351;

    public final FrameLayout f4352;

    public final CheckableImageButton f4353;

    public ColorStateList f4354;

    public PorterDuff.Mode f4355;

    public View.OnLongClickListener f4356;

    public final CheckableImageButton f4357;

    public final C0978 f4358;

    public int f4359;

    public final LinkedHashSet f4360;

    public ColorStateList f4361;

    public PorterDuff.Mode f4362;

    public int f4363;

    public ImageView.ScaleType f4364;

    public View.OnLongClickListener f4365;

    public CharSequence f4366;

    public final C0236 f4367;

    public boolean f4368;

    public EditText f4369;

    public final AccessibilityManager f4370;

    public C0466 f4371;

    public final C1210 f4372;

    public C1212(TextInputLayout textInputLayout, C0243 c0243) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4359 = 0;
        this.f4360 = new LinkedHashSet();
        this.f4372 = new C1210(this);
        C1211 c1211 = new C1211(this);
        this.f4370 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4351 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4352 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM2814 = m2814(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f4353 = checkableImageButtonM2814;
        CheckableImageButton checkableImageButtonM2815 = m2814(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f4357 = checkableImageButtonM2815;
        C0978 c0978 = new C0978();
        c0978.f3588 = new SparseArray();
        c0978.f3589 = this;
        TypedArray typedArray = (TypedArray) c0243.f1404;
        c0978.f3586 = typedArray.getResourceId(28, 0);
        c0978.f3587 = typedArray.getResourceId(52, 0);
        this.f4358 = c0978;
        C0236 c0236 = new C0236(getContext(), null);
        this.f4367 = c0236;
        TypedArray typedArray2 = (TypedArray) c0243.f1404;
        if (typedArray2.hasValue(38)) {
            this.f4354 = AbstractC3453.m4994(getContext(), c0243, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f4355 = AbstractC1459.m3195(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m2822(c0243.m1320(37));
        }
        checkableImageButtonM2814.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = AbstractC3578.f11184;
        checkableImageButtonM2814.setImportantForAccessibility(2);
        checkableImageButtonM2814.setClickable(false);
        checkableImageButtonM2814.setPressable(false);
        checkableImageButtonM2814.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f4361 = AbstractC3453.m4994(getContext(), c0243, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f4362 = AbstractC1459.m3195(typedArray2.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray2.hasValue(30)) {
            m2820(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM2815.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM2815.setContentDescription(text);
            }
            checkableImageButtonM2815.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f4361 = AbstractC3453.m4994(getContext(), c0243, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f4362 = AbstractC1459.m3195(typedArray2.getInt(55, -1), null);
            }
            m2820(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM2815.getContentDescription() != text2) {
                checkableImageButtonM2815.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4363) {
            this.f4363 = dimensionPixelSize;
            checkableImageButtonM2815.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2815.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM2814.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2814.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM3293 = AbstractC1574.m3293(typedArray2.getInt(31, -1));
            this.f4364 = scaleTypeM3293;
            checkableImageButtonM2815.setScaleType(scaleTypeM3293);
            checkableImageButtonM2814.setScaleType(scaleTypeM3293);
        }
        c0236.setVisibility(8);
        c0236.setId(R.id.textinput_suffix_text);
        c0236.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0236.setAccessibilityLiveRegion(1);
        c0236.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c0236.setTextColor(c0243.m1319(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f4366 = TextUtils.isEmpty(text3) ? null : text3;
        c0236.setText(text3);
        m2827();
        frameLayout.addView(checkableImageButtonM2815);
        addView(c0236);
        addView(frameLayout);
        addView(checkableImageButtonM2814);
        textInputLayout.f839.add(c1211);
        if (textInputLayout.f789 != null) {
            c1211.m2813(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0569(1, this));
    }

    public final CheckableImageButton m2814(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC3453.m5001(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC1213 m2815() {
        AbstractC1213 c0944;
        int i = this.f4359;
        C0978 c0978 = this.f4358;
        SparseArray sparseArray = (SparseArray) c0978.f3588;
        AbstractC1213 abstractC1213 = (AbstractC1213) sparseArray.get(i);
        if (abstractC1213 != null) {
            return abstractC1213;
        }
        C1212 c1212 = (C1212) c0978.f3589;
        if (i == -1) {
            c0944 = new C0944(c1212, 0);
        } else if (i == 0) {
            c0944 = new C0944(c1212, 1);
        } else if (i == 1) {
            c0944 = new C2338(c1212, c0978.f3587);
        } else if (i == 2) {
            c0944 = new C0727(c1212);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1194.m2779(i, "Invalid end icon mode: "));
            }
            c0944 = new C1118(c1212);
        }
        sparseArray.append(i, c0944);
        return c0944;
    }

    public final int m2816() {
        int marginStart;
        if (m2817() || m2818()) {
            CheckableImageButton checkableImageButton = this.f4357;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        Field field = AbstractC3578.f11184;
        return this.f4367.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean m2817() {
        return this.f4352.getVisibility() == 0 && this.f4357.getVisibility() == 0;
    }

    public final boolean m2818() {
        return this.f4353.getVisibility() == 0;
    }

    public final void m2819(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC1213 abstractC1213M2815 = m2815();
        boolean zMo2829 = abstractC1213M2815.mo2829();
        CheckableImageButton checkableImageButton = this.f4357;
        boolean z4 = true;
        if (!zMo2829 || (z3 = checkableImageButton.f724) == abstractC1213M2815.mo2689()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC1213M2815 instanceof C1118) || (zIsActivated = checkableImageButton.isActivated()) == ((C1118) abstractC1213M2815).f4172) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC1574.m3306(this.f4351, checkableImageButton, this.f4361);
        }
    }

    public final void m2820(int i) {
        if (this.f4359 == i) {
            return;
        }
        AbstractC1213 abstractC1213M2815 = m2815();
        C0466 c0466 = this.f4371;
        AccessibilityManager accessibilityManager = this.f4370;
        if (c0466 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0079(c0466));
        }
        this.f4371 = null;
        abstractC1213M2815.mo2154();
        this.f4359 = i;
        Iterator it = this.f4360.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
        m2821(i != 0);
        AbstractC1213 abstractC1213M2816 = m2815();
        int iMo2147 = this.f4358.f3586;
        if (iMo2147 == 0) {
            iMo2147 = abstractC1213M2816.mo2147();
        }
        Drawable drawableM5076 = iMo2147 != 0 ? AbstractC3471.m5076(getContext(), iMo2147) : null;
        CheckableImageButton checkableImageButton = this.f4357;
        checkableImageButton.setImageDrawable(drawableM5076);
        TextInputLayout textInputLayout = this.f4351;
        if (drawableM5076 != null) {
            AbstractC1574.m3289(textInputLayout, checkableImageButton, this.f4361, this.f4362);
            AbstractC1574.m3306(textInputLayout, checkableImageButton, this.f4361);
        }
        int iMo2146 = abstractC1213M2816.mo2146();
        CharSequence text = iMo2146 != 0 ? getResources().getText(iMo2146) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC1213M2816.mo2829());
        if (!abstractC1213M2816.mo2688(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC1213M2816.mo2153();
        C0466 c0466Mo2687 = abstractC1213M2816.mo2687();
        this.f4371 = c0466Mo2687;
        if (c0466Mo2687 != null && accessibilityManager != null) {
            Field field = AbstractC3578.f11184;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0079(this.f4371));
            }
        }
        View.OnClickListener onClickListenerMo2149 = abstractC1213M2816.mo2149();
        View.OnLongClickListener onLongClickListener = this.f4365;
        checkableImageButton.setOnClickListener(onClickListenerMo2149);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
        EditText editText = this.f4369;
        if (editText != null) {
            abstractC1213M2816.mo2151(editText);
            m2823(abstractC1213M2816);
        }
        AbstractC1574.m3289(textInputLayout, checkableImageButton, this.f4361, this.f4362);
        m2819(true);
    }

    public final void m2821(boolean z) {
        if (m2817() != z) {
            this.f4357.setVisibility(z ? 0 : 8);
            m2824();
            m2826();
            this.f4351.m708();
        }
    }

    public final void m2822(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4353;
        checkableImageButton.setImageDrawable(drawable);
        m2825();
        AbstractC1574.m3289(this.f4351, checkableImageButton, this.f4354, this.f4355);
    }

    public final void m2823(AbstractC1213 abstractC1213) {
        if (this.f4369 == null) {
            return;
        }
        if (abstractC1213.mo2148() != null) {
            this.f4369.setOnFocusChangeListener(abstractC1213.mo2148());
        }
        if (abstractC1213.mo2150() != null) {
            this.f4357.setOnFocusChangeListener(abstractC1213.mo2150());
        }
    }

    public final void m2824() {
        this.f4352.setVisibility((this.f4357.getVisibility() != 0 || m2818()) ? 8 : 0);
        setVisibility((m2817() || m2818() || ((this.f4366 == null || this.f4368) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void m2825() {
        CheckableImageButton checkableImageButton = this.f4353;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f4351;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f795.f5532 && textInputLayout.m704()) ? 0 : 8);
        m2824();
        m2826();
        if (this.f4359 != 0) {
            return;
        }
        textInputLayout.m708();
    }

    public final void m2826() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f4351;
        if (textInputLayout.f789 == null) {
            return;
        }
        if (m2817() || m2818()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f789;
            Field field = AbstractC3578.f11184;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f789.getPaddingTop();
        int paddingBottom = textInputLayout.f789.getPaddingBottom();
        Field field2 = AbstractC3578.f11184;
        this.f4367.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m2827() {
        C0236 c0236 = this.f4367;
        int visibility = c0236.getVisibility();
        int i = (this.f4366 == null || this.f4368) ? 8 : 0;
        if (visibility != i) {
            m2815().mo2152(i == 0);
        }
        m2824();
        c0236.setVisibility(i);
        this.f4351.m708();
    }
}
