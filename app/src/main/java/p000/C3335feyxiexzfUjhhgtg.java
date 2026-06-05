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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3335feyxiexzfUjhhgtg extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final TextInputLayout f10390Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final FrameLayout f10391Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final CheckableImageButton f10392Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public ColorStateList f10393Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public PorterDuff.Mode f10394Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public View.OnLongClickListener f10395Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final CheckableImageButton f10396Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3102Ujhhgtgfeyxiexzf f10397Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10398Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final LinkedHashSet f10399Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public ColorStateList f10400Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public PorterDuff.Mode f10401Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f10402Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ImageView.ScaleType f10403Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public View.OnLongClickListener f10404Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CharSequence f10405Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final C2384Ujhhgtgfeyxiexzf f10406Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public boolean f10407Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public EditText f10408Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AccessibilityManager f10409Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C2579Ujhhgtgfeyxiexzf f10410Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3328Ujhhgtgfeyxiexzf f10411Ujhhgtgfeyxiexzf;

    public C3335feyxiexzfUjhhgtg(TextInputLayout textInputLayout, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f10398Ujhhgtgfeyxiexzf = 0;
        this.f10399Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f10411Ujhhgtgfeyxiexzf = new C3328Ujhhgtgfeyxiexzf(this);
        C3327Ujhhgtgfeyxiexzf c3327Ujhhgtgfeyxiexzf = new C3327Ujhhgtgfeyxiexzf(this);
        this.f10409Ujhhgtgfeyxiexzf = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10390Ujhhgtgfeyxiexzf = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10391Ujhhgtgfeyxiexzf = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM4826Ujhhgtgfeyxiexzf = m4826Ujhhgtgfeyxiexzf(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f10392Ujhhgtgfeyxiexzf = checkableImageButtonM4826Ujhhgtgfeyxiexzf;
        CheckableImageButton checkableImageButtonM4826Ujhhgtgfeyxiexzf2 = m4826Ujhhgtgfeyxiexzf(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f10396Ujhhgtgfeyxiexzf = checkableImageButtonM4826Ujhhgtgfeyxiexzf2;
        C3102Ujhhgtgfeyxiexzf c3102Ujhhgtgfeyxiexzf = new C3102Ujhhgtgfeyxiexzf();
        c3102Ujhhgtgfeyxiexzf.f9647Ujhhgtgfeyxiexzf = new SparseArray();
        c3102Ujhhgtgfeyxiexzf.f9648Ujhhgtgfeyxiexzf = this;
        TypedArray typedArray = (TypedArray) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        c3102Ujhhgtgfeyxiexzf.f9645Ujhhgtgfeyxiexzf = typedArray.getResourceId(28, 0);
        c3102Ujhhgtgfeyxiexzf.f9646Ujhhgtgfeyxiexzf = typedArray.getResourceId(52, 0);
        this.f10397Ujhhgtgfeyxiexzf = c3102Ujhhgtgfeyxiexzf;
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = new C2384Ujhhgtgfeyxiexzf(getContext(), null);
        this.f10406Ujhhgtgfeyxiexzf = c2384Ujhhgtgfeyxiexzf;
        TypedArray typedArray2 = (TypedArray) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        if (typedArray2.hasValue(38)) {
            this.f10393Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(getContext(), c2366Ujhhgtgfeyxiexzf, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f10394Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m4834Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(37));
        }
        checkableImageButtonM4826Ujhhgtgfeyxiexzf.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        checkableImageButtonM4826Ujhhgtgfeyxiexzf.setImportantForAccessibility(2);
        checkableImageButtonM4826Ujhhgtgfeyxiexzf.setClickable(false);
        checkableImageButtonM4826Ujhhgtgfeyxiexzf.setPressable(false);
        checkableImageButtonM4826Ujhhgtgfeyxiexzf.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f10400Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(getContext(), c2366Ujhhgtgfeyxiexzf, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f10401Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            m4832Ujhhgtgfeyxiexzf(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM4826Ujhhgtgfeyxiexzf2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setContentDescription(text);
            }
            checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f10400Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(getContext(), c2366Ujhhgtgfeyxiexzf, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f10401Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray2.getInt(55, -1), null);
            }
            m4832Ujhhgtgfeyxiexzf(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM4826Ujhhgtgfeyxiexzf2.getContentDescription() != text2) {
                checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f10402Ujhhgtgfeyxiexzf) {
            this.f10402Ujhhgtgfeyxiexzf = dimensionPixelSize;
            checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM4826Ujhhgtgfeyxiexzf.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM4826Ujhhgtgfeyxiexzf.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM2763Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2763Ujhhgtgfeyxiexzf(typedArray2.getInt(31, -1));
            this.f10403Ujhhgtgfeyxiexzf = scaleTypeM2763Ujhhgtgfeyxiexzf;
            checkableImageButtonM4826Ujhhgtgfeyxiexzf2.setScaleType(scaleTypeM2763Ujhhgtgfeyxiexzf);
            checkableImageButtonM4826Ujhhgtgfeyxiexzf.setScaleType(scaleTypeM2763Ujhhgtgfeyxiexzf);
        }
        c2384Ujhhgtgfeyxiexzf.setVisibility(8);
        c2384Ujhhgtgfeyxiexzf.setId(R.id.textinput_suffix_text);
        c2384Ujhhgtgfeyxiexzf.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c2384Ujhhgtgfeyxiexzf.setAccessibilityLiveRegion(1);
        c2384Ujhhgtgfeyxiexzf.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c2384Ujhhgtgfeyxiexzf.setTextColor(c2366Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f10405Ujhhgtgfeyxiexzf = TextUtils.isEmpty(text3) ? null : text3;
        c2384Ujhhgtgfeyxiexzf.setText(text3);
        m4839Ujhhgtgfeyxiexzf();
        frameLayout.addView(checkableImageButtonM4826Ujhhgtgfeyxiexzf2);
        addView(c2384Ujhhgtgfeyxiexzf);
        addView(frameLayout);
        addView(checkableImageButtonM4826Ujhhgtgfeyxiexzf);
        textInputLayout.f919feyxiexzfUjhhgtg.add(c3327Ujhhgtgfeyxiexzf);
        if (textInputLayout.f869Ujhhgtgfeyxiexzf != null) {
            c3327Ujhhgtgfeyxiexzf.m4817Ujhhgtgfeyxiexzf(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(2, this));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final CheckableImageButton m4826Ujhhgtgfeyxiexzf(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC3085Ujhhgtgfeyxiexzf.m4567Ujhhgtgfeyxiexzf(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractC3336feyxiexzfUjhhgtg m4827Ujhhgtgfeyxiexzf() {
        AbstractC3336feyxiexzfUjhhgtg c3062Ujhhgtgfeyxiexzf;
        int i = this.f10398Ujhhgtgfeyxiexzf;
        C3102Ujhhgtgfeyxiexzf c3102Ujhhgtgfeyxiexzf = this.f10397Ujhhgtgfeyxiexzf;
        SparseArray sparseArray = (SparseArray) c3102Ujhhgtgfeyxiexzf.f9647Ujhhgtgfeyxiexzf;
        AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtg = (AbstractC3336feyxiexzfUjhhgtg) sparseArray.get(i);
        if (abstractC3336feyxiexzfUjhhgtg != null) {
            return abstractC3336feyxiexzfUjhhgtg;
        }
        C3335feyxiexzfUjhhgtg c3335feyxiexzfUjhhgtg = (C3335feyxiexzfUjhhgtg) c3102Ujhhgtgfeyxiexzf.f9648Ujhhgtgfeyxiexzf;
        if (i == -1) {
            c3062Ujhhgtgfeyxiexzf = new C3062Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg, 0);
        } else if (i == 0) {
            c3062Ujhhgtgfeyxiexzf = new C3062Ujhhgtgfeyxiexzf(c3335feyxiexzfUjhhgtg, 1);
        } else if (i == 1) {
            c3062Ujhhgtgfeyxiexzf = new C1390feyxiexzfUjhhgtg(c3335feyxiexzfUjhhgtg, c3102Ujhhgtgfeyxiexzf.f9646Ujhhgtgfeyxiexzf);
        } else if (i == 2) {
            c3062Ujhhgtgfeyxiexzf = new C2834feyxiexzfUjhhgtg(c3335feyxiexzfUjhhgtg);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Invalid end icon mode: "));
            }
            c3062Ujhhgtgfeyxiexzf = new C3245feyxiexzfUjhhgtg(c3335feyxiexzfUjhhgtg);
        }
        sparseArray.append(i, c3062Ujhhgtgfeyxiexzf);
        return c3062Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int m4828Ujhhgtgfeyxiexzf() {
        int marginStart;
        if (m4829Ujhhgtgfeyxiexzf() || m4830Ujhhgtgfeyxiexzf()) {
            CheckableImageButton checkableImageButton = this.f10396Ujhhgtgfeyxiexzf;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        return this.f10406Ujhhgtgfeyxiexzf.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m4829Ujhhgtgfeyxiexzf() {
        return this.f10391Ujhhgtgfeyxiexzf.getVisibility() == 0 && this.f10396Ujhhgtgfeyxiexzf.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m4830Ujhhgtgfeyxiexzf() {
        return this.f10392Ujhhgtgfeyxiexzf.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4831Ujhhgtgfeyxiexzf(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf = m4827Ujhhgtgfeyxiexzf();
        boolean zMo2882Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf.mo2882Ujhhgtgfeyxiexzf();
        CheckableImageButton checkableImageButton = this.f10396Ujhhgtgfeyxiexzf;
        boolean z4 = true;
        if (!zMo2882Ujhhgtgfeyxiexzf || (z3 = checkableImageButton.f804Ujhhgtgfeyxiexzf) == abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf.mo2883Ujhhgtgfeyxiexzf()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf instanceof C3245feyxiexzfUjhhgtg) || (zIsActivated = checkableImageButton.isActivated()) == ((C3245feyxiexzfUjhhgtg) abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf).f10177Ujhhgtgfeyxiexzf) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(this.f10390Ujhhgtgfeyxiexzf, checkableImageButton, this.f10400Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m4832Ujhhgtgfeyxiexzf(int i) {
        if (this.f10398Ujhhgtgfeyxiexzf == i) {
            return;
        }
        AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf = m4827Ujhhgtgfeyxiexzf();
        C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf = this.f10410Ujhhgtgfeyxiexzf;
        AccessibilityManager accessibilityManager = this.f10409Ujhhgtgfeyxiexzf;
        if (c2579Ujhhgtgfeyxiexzf != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg(c2579Ujhhgtgfeyxiexzf));
        }
        this.f10410Ujhhgtgfeyxiexzf = null;
        abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf.mo2886Ujhhgtgfeyxiexzf();
        this.f10398Ujhhgtgfeyxiexzf = i;
        Iterator it = this.f10399Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
        m4833Ujhhgtgfeyxiexzf(i != 0);
        AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2 = m4827Ujhhgtgfeyxiexzf();
        int iMo2880Ujhhgtgfeyxiexzf = this.f10397Ujhhgtgfeyxiexzf.f9645Ujhhgtgfeyxiexzf;
        if (iMo2880Ujhhgtgfeyxiexzf == 0) {
            iMo2880Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2880Ujhhgtgfeyxiexzf();
        }
        Drawable drawableM2824Ujhhgtgfeyxiexzf = iMo2880Ujhhgtgfeyxiexzf != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), iMo2880Ujhhgtgfeyxiexzf) : null;
        CheckableImageButton checkableImageButton = this.f10396Ujhhgtgfeyxiexzf;
        checkableImageButton.setImageDrawable(drawableM2824Ujhhgtgfeyxiexzf);
        TextInputLayout textInputLayout = this.f10390Ujhhgtgfeyxiexzf;
        if (drawableM2824Ujhhgtgfeyxiexzf != null) {
            AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, this.f10400Ujhhgtgfeyxiexzf, this.f10401Ujhhgtgfeyxiexzf);
            AbstractC1246feyxiexzfUjhhgtg.m2769Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, this.f10400Ujhhgtgfeyxiexzf);
        }
        int iMo2879Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2879Ujhhgtgfeyxiexzf();
        CharSequence text = iMo2879Ujhhgtgfeyxiexzf != 0 ? getResources().getText(iMo2879Ujhhgtgfeyxiexzf) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2882Ujhhgtgfeyxiexzf());
        if (!abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo4742Ujhhgtgfeyxiexzf(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2885Ujhhgtgfeyxiexzf();
        C2579Ujhhgtgfeyxiexzf c2579UjhhgtgfeyxiexzfMo4741Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo4741Ujhhgtgfeyxiexzf();
        this.f10410Ujhhgtgfeyxiexzf = c2579UjhhgtgfeyxiexzfMo4741Ujhhgtgfeyxiexzf;
        if (c2579UjhhgtgfeyxiexzfMo4741Ujhhgtgfeyxiexzf != null && accessibilityManager != null) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2950feyxiexzfUjhhgtg(this.f10410Ujhhgtgfeyxiexzf));
            }
        }
        View.OnClickListener onClickListenerMo2881Ujhhgtgfeyxiexzf = abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2881Ujhhgtgfeyxiexzf();
        View.OnLongClickListener onLongClickListener = this.f10404Ujhhgtgfeyxiexzf;
        checkableImageButton.setOnClickListener(onClickListenerMo2881Ujhhgtgfeyxiexzf);
        AbstractC1246feyxiexzfUjhhgtg.m2773Ujhhgtgfeyxiexzf(checkableImageButton, onLongClickListener);
        EditText editText = this.f10408Ujhhgtgfeyxiexzf;
        if (editText != null) {
            abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2.mo2884Ujhhgtgfeyxiexzf(editText);
            m4835Ujhhgtgfeyxiexzf(abstractC3336feyxiexzfUjhhgtgM4827Ujhhgtgfeyxiexzf2);
        }
        AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(textInputLayout, checkableImageButton, this.f10400Ujhhgtgfeyxiexzf, this.f10401Ujhhgtgfeyxiexzf);
        m4831Ujhhgtgfeyxiexzf(true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4833Ujhhgtgfeyxiexzf(boolean z) {
        if (m4829Ujhhgtgfeyxiexzf() != z) {
            this.f10396Ujhhgtgfeyxiexzf.setVisibility(z ? 0 : 8);
            m4836Ujhhgtgfeyxiexzf();
            m4838Ujhhgtgfeyxiexzf();
            this.f10390Ujhhgtgfeyxiexzf.m851Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4834Ujhhgtgfeyxiexzf(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10392Ujhhgtgfeyxiexzf;
        checkableImageButton.setImageDrawable(drawable);
        m4837Ujhhgtgfeyxiexzf();
        AbstractC1246feyxiexzfUjhhgtg.m2762Ujhhgtgfeyxiexzf(this.f10390Ujhhgtgfeyxiexzf, checkableImageButton, this.f10393Ujhhgtgfeyxiexzf, this.f10394Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4835Ujhhgtgfeyxiexzf(AbstractC3336feyxiexzfUjhhgtg abstractC3336feyxiexzfUjhhgtg) {
        if (this.f10408Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if (abstractC3336feyxiexzfUjhhgtg.mo4160Ujhhgtgfeyxiexzf() != null) {
            this.f10408Ujhhgtgfeyxiexzf.setOnFocusChangeListener(abstractC3336feyxiexzfUjhhgtg.mo4160Ujhhgtgfeyxiexzf());
        }
        if (abstractC3336feyxiexzfUjhhgtg.mo4161Ujhhgtgfeyxiexzf() != null) {
            this.f10396Ujhhgtgfeyxiexzf.setOnFocusChangeListener(abstractC3336feyxiexzfUjhhgtg.mo4161Ujhhgtgfeyxiexzf());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4836Ujhhgtgfeyxiexzf() {
        this.f10391Ujhhgtgfeyxiexzf.setVisibility((this.f10396Ujhhgtgfeyxiexzf.getVisibility() != 0 || m4830Ujhhgtgfeyxiexzf()) ? 8 : 0);
        setVisibility((m4829Ujhhgtgfeyxiexzf() || m4830Ujhhgtgfeyxiexzf() || ((this.f10405Ujhhgtgfeyxiexzf == null || this.f10407Ujhhgtgfeyxiexzf) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4837Ujhhgtgfeyxiexzf() {
        CheckableImageButton checkableImageButton = this.f10392Ujhhgtgfeyxiexzf;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f10390Ujhhgtgfeyxiexzf;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f875Ujhhgtgfeyxiexzf.f2732Ujhhgtgfeyxiexzf && textInputLayout.m847Ujhhgtgfeyxiexzf()) ? 0 : 8);
        m4836Ujhhgtgfeyxiexzf();
        m4838Ujhhgtgfeyxiexzf();
        if (this.f10398Ujhhgtgfeyxiexzf != 0) {
            return;
        }
        textInputLayout.m851Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m4838Ujhhgtgfeyxiexzf() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f10390Ujhhgtgfeyxiexzf;
        if (textInputLayout.f869Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if (m4829Ujhhgtgfeyxiexzf() || m4830Ujhhgtgfeyxiexzf()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f869Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f869Ujhhgtgfeyxiexzf.getPaddingTop();
        int paddingBottom = textInputLayout.f869Ujhhgtgfeyxiexzf.getPaddingBottom();
        Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        this.f10406Ujhhgtgfeyxiexzf.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m4839Ujhhgtgfeyxiexzf() {
        C2384Ujhhgtgfeyxiexzf c2384Ujhhgtgfeyxiexzf = this.f10406Ujhhgtgfeyxiexzf;
        int visibility = c2384Ujhhgtgfeyxiexzf.getVisibility();
        int i = (this.f10405Ujhhgtgfeyxiexzf == null || this.f10407Ujhhgtgfeyxiexzf) ? 8 : 0;
        if (visibility != i) {
            m4827Ujhhgtgfeyxiexzf().mo4162Ujhhgtgfeyxiexzf(i == 0);
        }
        m4836Ujhhgtgfeyxiexzf();
        c2384Ujhhgtgfeyxiexzf.setVisibility(i);
        this.f10390Ujhhgtgfeyxiexzf.m851Ujhhgtgfeyxiexzf();
    }
}
