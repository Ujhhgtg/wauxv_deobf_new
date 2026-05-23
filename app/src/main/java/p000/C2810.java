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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2810 extends LinearLayout {

    public final TextInputLayout f9000;

    public final C0236 f9001;

    public CharSequence f9002;

    public final CheckableImageButton f9003;

    public ColorStateList f9004;

    public PorterDuff.Mode f9005;

    public int f9006;

    public ImageView.ScaleType f9007;

    public View.OnLongClickListener f9008;

    public boolean f9009;

    public C2810(TextInputLayout textInputLayout, C0243 c0243) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f9000 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f9003 = checkableImageButton;
        C0236 c0236 = new C0236(getContext(), null);
        this.f9001 = c0236;
        if (AbstractC3453.m5001(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f9008;
        checkableImageButton.setOnClickListener(null);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
        this.f9008 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1574.m3311(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0243.f1404;
        if (typedArray.hasValue(69)) {
            this.f9004 = AbstractC3453.m4994(getContext(), c0243, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f9005 = AbstractC1459.m3195(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m4787(c0243.m1320(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9006) {
            this.f9006 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM3293 = AbstractC1574.m3293(typedArray.getInt(68, -1));
            this.f9007 = scaleTypeM3293;
            checkableImageButton.setScaleType(scaleTypeM3293);
        }
        c0236.setVisibility(8);
        c0236.setId(R.id.textinput_prefix_text);
        c0236.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = AbstractC3578.f11184;
        c0236.setAccessibilityLiveRegion(1);
        c0236.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0236.setTextColor(c0243.m1319(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f9002 = TextUtils.isEmpty(text2) ? null : text2;
        c0236.setText(text2);
        m4790();
        addView(checkableImageButton);
        addView(c0236);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4789();
    }

    public final int m4786() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f9003;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        Field field = AbstractC3578.f11184;
        return this.f9001.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void m4787(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9003;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f9004;
            PorterDuff.Mode mode = this.f9005;
            TextInputLayout textInputLayout = this.f9000;
            AbstractC1574.m3289(textInputLayout, checkableImageButton, colorStateList, mode);
            m4788(true);
            AbstractC1574.m3306(textInputLayout, checkableImageButton, this.f9004);
            return;
        }
        m4788(false);
        View.OnLongClickListener onLongClickListener = this.f9008;
        checkableImageButton.setOnClickListener(null);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
        this.f9008 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1574.m3311(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void m4788(boolean z) {
        CheckableImageButton checkableImageButton = this.f9003;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m4789();
            m4790();
        }
    }

    public final void m4789() {
        int paddingStart;
        EditText editText = this.f9000.f789;
        if (editText == null) {
            return;
        }
        if (this.f9003.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = AbstractC3578.f11184;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = AbstractC3578.f11184;
        this.f9001.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void m4790() {
        int i = (this.f9002 == null || this.f9009) ? 8 : 0;
        setVisibility((this.f9003.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f9001.setVisibility(i);
        this.f9000.m708();
    }
}
