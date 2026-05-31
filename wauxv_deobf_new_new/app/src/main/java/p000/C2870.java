package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2870 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextInputLayout f9162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0246 f9163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public CharSequence f9164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final CheckableImageButton f9165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ColorStateList f9166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public PorterDuff.Mode f9167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f9168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ImageView.ScaleType f9169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View.OnLongClickListener f9170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f9171;

    public C2870(TextInputLayout textInputLayout, C0253 c0253) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f9162 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f9165 = checkableImageButton;
        C0246 c0246 = new C0246(getContext(), null);
        this.f9163 = c0246;
        if (AbstractC1471.m3398(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f9170;
        checkableImageButton.setOnClickListener(null);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
        this.f9170 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC3744.m5346(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0253.f1478;
        if (typedArray.hasValue(69)) {
            this.f9166 = AbstractC1471.m3387(getContext(), c0253, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f9167 = AbstractC1471.m3403(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m4820(c0253.m1466(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9168) {
            this.f9168 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM5330 = AbstractC3744.m5330(typedArray.getInt(68, -1));
            this.f9169 = scaleTypeM5330;
            checkableImageButton.setScaleType(scaleTypeM5330);
        }
        c0246.setVisibility(8);
        c0246.setId(R.id.textinput_prefix_text);
        c0246.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = AbstractC3638.f11333;
        c0246.setAccessibilityLiveRegion(1);
        c0246.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0246.setTextColor(c0253.m1465(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f9164 = TextUtils.isEmpty(text2) ? null : text2;
        c0246.setText(text2);
        m4823();
        addView(checkableImageButton);
        addView(c0246);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4822();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4819() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f9165;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        Field field = AbstractC3638.f11333;
        return this.f9163.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4820(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9165;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f9166;
            PorterDuff.Mode mode = this.f9167;
            TextInputLayout textInputLayout = this.f9162;
            AbstractC3744.m5323(textInputLayout, checkableImageButton, colorStateList, mode);
            m4821(true);
            AbstractC3744.m5340(textInputLayout, checkableImageButton, this.f9166);
            return;
        }
        m4821(false);
        View.OnLongClickListener onLongClickListener = this.f9170;
        checkableImageButton.setOnClickListener(null);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
        this.f9170 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC3744.m5346(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4821(boolean z) {
        CheckableImageButton checkableImageButton = this.f9165;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m4822();
            m4823();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4822() {
        int paddingStart;
        EditText editText = this.f9162.f855;
        if (editText == null) {
            return;
        }
        if (this.f9165.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = AbstractC3638.f11333;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = AbstractC3638.f11333;
        this.f9163.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4823() {
        int i = (this.f9164 == null || this.f9171) ? 8 : 0;
        setVisibility((this.f9165.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f9163.setVisibility(i);
        this.f9162.m852();
    }
}
