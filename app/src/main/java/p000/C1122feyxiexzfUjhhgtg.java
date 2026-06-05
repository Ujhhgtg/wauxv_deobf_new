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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1122feyxiexzfUjhhgtg extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final TextInputLayout f4224Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2384Ujhhgtgfeyxiexzf f4225Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public CharSequence f4226Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final CheckableImageButton f4227Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ColorStateList f4228Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public PorterDuff.Mode f4229Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f4230Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ImageView.ScaleType f4231Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public View.OnLongClickListener f4232Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f4233Ujhhgtgfeyxiexzf;

    public C1122feyxiexzfUjhhgtg(TextInputLayout textInputLayout, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4224Ujhhgtgfeyxiexzf = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4227Ujhhgtgfeyxiexzf = checkableImageButton;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(getContext(), null);
        this.f4225Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf;
        if (AbstractC3085Ujhhgtgfeyxiexzf.m4567Ujhhgtgfeyxiexzf(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f4232Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(null);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
        this.f4232Ujhhgtgfeyxiexzf = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        if (typedArray.hasValue(69)) {
            this.f4228Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(getContext(), c2366Ujhhgtgfeyxiexzf, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f4229Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m2592Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4230Ujhhgtgfeyxiexzf) {
            this.f4230Ujhhgtgfeyxiexzf = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM2763Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2763Ujhhgtgfeyxiexzf(typedArray.getInt(68, -1));
            this.f4231Ujhhgtgfeyxiexzf = scaleTypeM2763Ujhhgtgfeyxiexzf;
            checkableImageButton.setScaleType(scaleTypeM2763Ujhhgtgfeyxiexzf);
        }
        c2384Ujhhgtgfeyxiexzf.setVisibility(8);
        c2384Ujhhgtgfeyxiexzf.setId(R.id.textinput_prefix_text);
        c2384Ujhhgtgfeyxiexzf.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        c2384Ujhhgtgfeyxiexzf.setAccessibilityLiveRegion(1);
        c2384Ujhhgtgfeyxiexzf.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c2384Ujhhgtgfeyxiexzf.setTextColor(c2366Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f4226Ujhhgtgfeyxiexzf = TextUtils.isEmpty(text2) ? null : text2;
        c2384Ujhhgtgfeyxiexzf.setText(text2);
        m2595Ujhhgtgfeyxiexzf();
        addView(checkableImageButton);
        addView(c2384Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2594Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m2591Ujhhgtgfeyxiexzf() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f4227Ujhhgtgfeyxiexzf;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        return this.f4225Ujhhgtgfeyxiexzf.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2592Ujhhgtgfeyxiexzf(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4227Ujhhgtgfeyxiexzf;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f4228Ujhhgtgfeyxiexzf;
            PorterDuff.Mode mode = this.f4229Ujhhgtgfeyxiexzf;
            TextInputLayout textInputLayout = this.f4224Ujhhgtgfeyxiexzf;
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, colorStateList, mode);
            m2593Ujhhgtgfeyxiexzf(true);
            AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, this.f4228Ujhhgtgfeyxiexzf);
            return;
        }
        m2593Ujhhgtgfeyxiexzf(false);
        View.OnLongClickListener onLongClickListener = this.f4232Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(null);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
        this.f4232Ujhhgtgfeyxiexzf = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2593Ujhhgtgfeyxiexzf(boolean z) {
        CheckableImageButton checkableImageButton = this.f4227Ujhhgtgfeyxiexzf;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m2594Ujhhgtgfeyxiexzf();
            m2595Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2594Ujhhgtgfeyxiexzf() {
        int paddingStart;
        EditText editText = this.f4224Ujhhgtgfeyxiexzf.f869Ujhhgtgfeyxiexzf;
        if (editText == null) {
            return;
        }
        if (this.f4227Ujhhgtgfeyxiexzf.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        this.f4225Ujhhgtgfeyxiexzf.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m2595Ujhhgtgfeyxiexzf() {
        int i = (this.f4226Ujhhgtgfeyxiexzf == null || this.f4233Ujhhgtgfeyxiexzf) ? 8 : 0;
        setVisibility((this.f4227Ujhhgtgfeyxiexzf.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f4225Ujhhgtgfeyxiexzf.setVisibility(i);
        this.f4224Ujhhgtgfeyxiexzf.m851Ujhhgtgfeyxiexzf();
    }
}
