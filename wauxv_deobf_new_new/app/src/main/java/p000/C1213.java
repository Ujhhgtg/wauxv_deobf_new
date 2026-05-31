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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᤞᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1213 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextInputLayout f4348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final FrameLayout f4349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final CheckableImageButton f4350;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ColorStateList f4351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f4352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public View.OnLongClickListener f4353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final CheckableImageButton f4354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0982 f4355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final LinkedHashSet f4357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ColorStateList f4358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f4359;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f4360;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public ImageView.ScaleType f4361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public View.OnLongClickListener f4362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public CharSequence f4363;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final C0246 f4364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f4365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public EditText f4366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final AccessibilityManager f4367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C0441 f4368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final C1211 f4369;

    public C1213(TextInputLayout textInputLayout, C0253 c0253) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4356 = 0;
        this.f4357 = new LinkedHashSet();
        this.f4369 = new C1211(this);
        C1212 c1212 = new C1212(this);
        this.f4367 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4348 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4349 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM2936 = m2936(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f4350 = checkableImageButtonM2936;
        CheckableImageButton checkableImageButtonM2937 = m2936(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f4354 = checkableImageButtonM2937;
        C0982 c0982 = new C0982();
        c0982.f3604 = new SparseArray();
        c0982.f3605 = this;
        TypedArray typedArray = (TypedArray) c0253.f1478;
        c0982.f3602 = typedArray.getResourceId(28, 0);
        c0982.f3603 = typedArray.getResourceId(52, 0);
        this.f4355 = c0982;
        C0246 c0246 = new C0246(getContext(), null);
        this.f4364 = c0246;
        TypedArray typedArray2 = (TypedArray) c0253.f1478;
        if (typedArray2.hasValue(38)) {
            this.f4351 = AbstractC1471.m3387(getContext(), c0253, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f4352 = AbstractC1471.m3403(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m2944(c0253.m1466(37));
        }
        checkableImageButtonM2936.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = AbstractC3638.f11333;
        checkableImageButtonM2936.setImportantForAccessibility(2);
        checkableImageButtonM2936.setClickable(false);
        checkableImageButtonM2936.setPressable(false);
        checkableImageButtonM2936.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f4358 = AbstractC1471.m3387(getContext(), c0253, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f4359 = AbstractC1471.m3403(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            m2942(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM2937.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM2937.setContentDescription(text);
            }
            checkableImageButtonM2937.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f4358 = AbstractC1471.m3387(getContext(), c0253, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f4359 = AbstractC1471.m3403(typedArray2.getInt(55, -1), null);
            }
            m2942(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM2937.getContentDescription() != text2) {
                checkableImageButtonM2937.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4360) {
            this.f4360 = dimensionPixelSize;
            checkableImageButtonM2937.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2937.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM2936.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2936.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM5330 = AbstractC3744.m5330(typedArray2.getInt(31, -1));
            this.f4361 = scaleTypeM5330;
            checkableImageButtonM2937.setScaleType(scaleTypeM5330);
            checkableImageButtonM2936.setScaleType(scaleTypeM5330);
        }
        c0246.setVisibility(8);
        c0246.setId(R.id.textinput_suffix_text);
        c0246.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0246.setAccessibilityLiveRegion(1);
        c0246.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c0246.setTextColor(c0253.m1465(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f4363 = TextUtils.isEmpty(text3) ? null : text3;
        c0246.setText(text3);
        m2949();
        frameLayout.addView(checkableImageButtonM2937);
        addView(c0246);
        addView(frameLayout);
        addView(checkableImageButtonM2936);
        textInputLayout.f905.add(c1212);
        if (textInputLayout.f855 != null) {
            c1212.m2935(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0546(this, 2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final CheckableImageButton m2936(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC1471.m3398(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1214 m2937() {
        AbstractC1214 c0947;
        int i = this.f4356;
        C0982 c0982 = this.f4355;
        SparseArray sparseArray = (SparseArray) c0982.f3604;
        AbstractC1214 abstractC1214 = (AbstractC1214) sparseArray.get(i);
        if (abstractC1214 != null) {
            return abstractC1214;
        }
        C1213 c1213 = (C1213) c0982.f3605;
        if (i == -1) {
            c0947 = new C0947(c1213, 0);
        } else if (i == 0) {
            c0947 = new C0947(c1213, 1);
        } else if (i == 1) {
            c0947 = new C2377(c1213, c0982.f3603);
        } else if (i == 2) {
            c0947 = new C0722(c1213);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1095.m2794(i, "Invalid end icon mode: "));
            }
            c0947 = new C1124(c1213);
        }
        sparseArray.append(i, c0947);
        return c0947;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m2938() {
        int marginStart;
        if (m2939() || m2940()) {
            CheckableImageButton checkableImageButton = this.f4354;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        Field field = AbstractC3638.f11333;
        return this.f4364.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m2939() {
        return this.f4349.getVisibility() == 0 && this.f4354.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m2940() {
        return this.f4350.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2941(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC1214 abstractC1214M2937 = m2937();
        boolean zMo2951 = abstractC1214M2937.mo2951();
        CheckableImageButton checkableImageButton = this.f4354;
        boolean z4 = true;
        if (!zMo2951 || (z3 = checkableImageButton.f790) == abstractC1214M2937.mo2838()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC1214M2937 instanceof C1124) || (zIsActivated = checkableImageButton.isActivated()) == ((C1124) abstractC1214M2937).f4183) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC3744.m5340(this.f4348, checkableImageButton, this.f4358);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2942(int i) {
        if (this.f4356 == i) {
            return;
        }
        AbstractC1214 abstractC1214M2937 = m2937();
        C0441 c0441 = this.f4368;
        AccessibilityManager accessibilityManager = this.f4367;
        if (c0441 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0087(c0441));
        }
        this.f4368 = null;
        abstractC1214M2937.mo2246();
        this.f4356 = i;
        Iterator it = this.f4357.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
        m2943(i != 0);
        AbstractC1214 abstractC1214M2938 = m2937();
        int iMo2239 = this.f4355.f3602;
        if (iMo2239 == 0) {
            iMo2239 = abstractC1214M2938.mo2239();
        }
        Drawable drawableM3667 = iMo2239 != 0 ? C1787.m3667(getContext(), iMo2239) : null;
        CheckableImageButton checkableImageButton = this.f4354;
        checkableImageButton.setImageDrawable(drawableM3667);
        TextInputLayout textInputLayout = this.f4348;
        if (drawableM3667 != null) {
            AbstractC3744.m5323(textInputLayout, checkableImageButton, this.f4358, this.f4359);
            AbstractC3744.m5340(textInputLayout, checkableImageButton, this.f4358);
        }
        int iMo2238 = abstractC1214M2938.mo2238();
        CharSequence text = iMo2238 != 0 ? getResources().getText(iMo2238) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC1214M2938.mo2951());
        if (!abstractC1214M2938.mo2837(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC1214M2938.mo2245();
        C0441 c0441Mo2836 = abstractC1214M2938.mo2836();
        this.f4368 = c0441Mo2836;
        if (c0441Mo2836 != null && accessibilityManager != null) {
            Field field = AbstractC3638.f11333;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0087(this.f4368));
            }
        }
        View.OnClickListener onClickListenerMo2241 = abstractC1214M2938.mo2241();
        View.OnLongClickListener onLongClickListener = this.f4362;
        checkableImageButton.setOnClickListener(onClickListenerMo2241);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
        EditText editText = this.f4366;
        if (editText != null) {
            abstractC1214M2938.mo2243(editText);
            m2945(abstractC1214M2938);
        }
        AbstractC3744.m5323(textInputLayout, checkableImageButton, this.f4358, this.f4359);
        m2941(true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2943(boolean z) {
        if (m2939() != z) {
            this.f4354.setVisibility(z ? 0 : 8);
            m2946();
            m2948();
            this.f4348.m852();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2944(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4350;
        checkableImageButton.setImageDrawable(drawable);
        m2947();
        AbstractC3744.m5323(this.f4348, checkableImageButton, this.f4351, this.f4352);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2945(AbstractC1214 abstractC1214) {
        if (this.f4366 == null) {
            return;
        }
        if (abstractC1214.mo2240() != null) {
            this.f4366.setOnFocusChangeListener(abstractC1214.mo2240());
        }
        if (abstractC1214.mo2242() != null) {
            this.f4354.setOnFocusChangeListener(abstractC1214.mo2242());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2946() {
        this.f4349.setVisibility((this.f4354.getVisibility() != 0 || m2940()) ? 8 : 0);
        setVisibility((m2939() || m2940() || ((this.f4363 == null || this.f4365) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2947() {
        CheckableImageButton checkableImageButton = this.f4350;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f4348;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f861.f5566 && textInputLayout.m848()) ? 0 : 8);
        m2946();
        m2948();
        if (this.f4356 != 0) {
            return;
        }
        textInputLayout.m852();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2948() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f4348;
        if (textInputLayout.f855 == null) {
            return;
        }
        if (m2939() || m2940()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f855;
            Field field = AbstractC3638.f11333;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f855.getPaddingTop();
        int paddingBottom = textInputLayout.f855.getPaddingBottom();
        Field field2 = AbstractC3638.f11333;
        this.f4364.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m2949() {
        C0246 c0246 = this.f4364;
        int visibility = c0246.getVisibility();
        int i = (this.f4363 == null || this.f4365) ? 8 : 0;
        if (visibility != i) {
            m2937().mo2244(i == 0);
        }
        m2946();
        c0246.setVisibility(i);
        this.f4348.m852();
    }
}
