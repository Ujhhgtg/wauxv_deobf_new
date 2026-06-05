package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0888feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC2361Ujhhgtgfeyxiexzf;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0193Ujhhgtgfeyxiexzf;
import p000.C0194Ujhhgtgfeyxiexzf;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2994Ujhhgtgfeyxiexzf;
import p000.C3029Ujhhgtgfeyxiexzf;
import p000.C3033feyxiexzfUjhhgtg;
import p000.C3034feyxiexzfUjhhgtg;
import p000.C3035Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AbstractC2361Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f731feyxiexzfUjhhgtg = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f732feyxiexzfUjhhgtg = {R.attr.state_error};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final int[][] f733feyxiexzfUjhhgtg = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int f734feyxiexzfUjhhgtg = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet f735Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final LinkedHashSet f736Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f737Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f739Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f740Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public CharSequence f741Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public Drawable f742Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Drawable f743Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f744Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ColorStateList f745Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f746Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public PorterDuff.Mode f747Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f748Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int[] f749Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f750Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public CharSequence f751Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f752Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3035Ujhhgtgfeyxiexzf f753feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0193Ujhhgtgfeyxiexzf f754feyxiexzfUjhhgtg;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f735Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f736Ujhhgtgfeyxiexzf = new LinkedHashSet();
        Context context2 = getContext();
        C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = new C3035Ujhhgtgfeyxiexzf(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf = drawable;
        drawable.setCallback(c3035Ujhhgtgfeyxiexzf.f9411Ujhhgtgfeyxiexzf);
        new C3034feyxiexzfUjhhgtg(0, c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf.getConstantState());
        this.f753feyxiexzfUjhhgtg = c3035Ujhhgtgfeyxiexzf;
        this.f754feyxiexzfUjhhgtg = new C0193Ujhhgtgfeyxiexzf(this);
        Context context3 = getContext();
        this.f742Ujhhgtgfeyxiexzf = getButtonDrawable();
        this.f745Ujhhgtgfeyxiexzf = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2741Ujhhgtgfeyxiexzf(context3, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3132Ujhhgtgfeyxiexzf, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f743Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(2);
        if (this.f742Ujhhgtgfeyxiexzf != null && C3052Ujhhgtgfeyxiexzf.m4525Ujhhgtgfeyxiexzf(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f734feyxiexzfUjhhgtg && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f742Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context3, R.drawable.mtrl_checkbox_button);
                this.f744Ujhhgtgfeyxiexzf = true;
                if (this.f743Ujhhgtgfeyxiexzf == null) {
                    this.f743Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f746Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4560Ujhhgtgfeyxiexzf(context3, c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf, 3);
        this.f747Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f738Ujhhgtgfeyxiexzf = typedArray.getBoolean(10, false);
        this.f739Ujhhgtgfeyxiexzf = typedArray.getBoolean(6, true);
        this.f740Ujhhgtgfeyxiexzf = typedArray.getBoolean(9, false);
        this.f741Ujhhgtgfeyxiexzf = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        m814Ujhhgtgfeyxiexzf();
    }

    private String getButtonStateDescription() {
        int i = this.f748Ujhhgtgfeyxiexzf;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f737Ujhhgtgfeyxiexzf == null) {
            int iM4211feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorControlActivated);
            int iM4211feyxiexzfUjhhgtg2 = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorError);
            int iM4211feyxiexzfUjhhgtg3 = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorSurface);
            int iM4211feyxiexzfUjhhgtg4 = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorOnSurface);
            this.f737Ujhhgtgfeyxiexzf = new ColorStateList(f733feyxiexzfUjhhgtg, new int[]{AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg2, 1.0f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg, 1.0f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg4, 0.54f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg4, 0.38f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg4, 0.38f)});
        }
        return this.f737Ujhhgtgfeyxiexzf;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f745Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f742Ujhhgtgfeyxiexzf;
    }

    public Drawable getButtonIconDrawable() {
        return this.f743Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f746Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f747Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f745Ujhhgtgfeyxiexzf;
    }

    public int getCheckedState() {
        return this.f748Ujhhgtgfeyxiexzf;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f741Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f748Ujhhgtgfeyxiexzf == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f738Ujhhgtgfeyxiexzf && this.f745Ujhhgtgfeyxiexzf == null && this.f746Ujhhgtgfeyxiexzf == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f731feyxiexzfUjhhgtg);
        }
        if (this.f740Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f732feyxiexzfUjhhgtg);
        }
        this.f749Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5156Ujhhgtgfeyxiexzf(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f739Ujhhgtgfeyxiexzf || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f740Ujhhgtgfeyxiexzf) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f741Ujhhgtgfeyxiexzf));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0194Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0194Ujhhgtgfeyxiexzf c0194Ujhhgtgfeyxiexzf = (C0194Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c0194Ujhhgtgfeyxiexzf.getSuperState());
        setCheckedState(c0194Ujhhgtgfeyxiexzf.f1421Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0194Ujhhgtgfeyxiexzf c0194Ujhhgtgfeyxiexzf = new C0194Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        c0194Ujhhgtgfeyxiexzf.f1421Ujhhgtgfeyxiexzf = getCheckedState();
        return c0194Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f743Ujhhgtgfeyxiexzf = drawable;
        m814Ujhhgtgfeyxiexzf();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f746Ujhhgtgfeyxiexzf == colorStateList) {
            return;
        }
        this.f746Ujhhgtgfeyxiexzf = colorStateList;
        m814Ujhhgtgfeyxiexzf();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f747Ujhhgtgfeyxiexzf == mode) {
            return;
        }
        this.f747Ujhhgtgfeyxiexzf = mode;
        m814Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f745Ujhhgtgfeyxiexzf == colorStateList) {
            return;
        }
        this.f745Ujhhgtgfeyxiexzf = colorStateList;
        m814Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m814Ujhhgtgfeyxiexzf();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f739Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f748Ujhhgtgfeyxiexzf != i) {
            this.f748Ujhhgtgfeyxiexzf = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f751Ujhhgtgfeyxiexzf == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f750Ujhhgtgfeyxiexzf) {
                return;
            }
            this.f750Ujhhgtgfeyxiexzf = true;
            LinkedHashSet linkedHashSet = this.f736Ujhhgtgfeyxiexzf;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
                }
            }
            if (this.f748Ujhhgtgfeyxiexzf != 2 && (onCheckedChangeListener = this.f752Ujhhgtgfeyxiexzf) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f750Ujhhgtgfeyxiexzf = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f741Ujhhgtgfeyxiexzf = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f740Ujhhgtgfeyxiexzf == z) {
            return;
        }
        this.f740Ujhhgtgfeyxiexzf = z;
        refreshDrawableState();
        Iterator it = this.f735Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f752Ujhhgtgfeyxiexzf = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f751Ujhhgtgfeyxiexzf = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f738Ujhhgtgfeyxiexzf = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m814Ujhhgtgfeyxiexzf() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2994Ujhhgtgfeyxiexzf c2994Ujhhgtgfeyxiexzf;
        this.f742Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f742Ujhhgtgfeyxiexzf, this.f745Ujhhgtgfeyxiexzf, getButtonTintMode());
        this.f743Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f743Ujhhgtgfeyxiexzf, this.f746Ujhhgtgfeyxiexzf, this.f747Ujhhgtgfeyxiexzf);
        if (this.f744Ujhhgtgfeyxiexzf) {
            C3035Ujhhgtgfeyxiexzf c3035Ujhhgtgfeyxiexzf = this.f753feyxiexzfUjhhgtg;
            if (c3035Ujhhgtgfeyxiexzf != null) {
                C3033feyxiexzfUjhhgtg c3033feyxiexzfUjhhgtg = c3035Ujhhgtgfeyxiexzf.f9407Ujhhgtgfeyxiexzf;
                Drawable drawable = c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf;
                C0193Ujhhgtgfeyxiexzf c0193Ujhhgtgfeyxiexzf = this.f754feyxiexzfUjhhgtg;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf == null) {
                        c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf = new C3029Ujhhgtgfeyxiexzf(c0193Ujhhgtgfeyxiexzf);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf);
                }
                ArrayList arrayList = c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf;
                if (arrayList != null && c0193Ujhhgtgfeyxiexzf != null) {
                    arrayList.remove(c0193Ujhhgtgfeyxiexzf);
                    if (c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf.size() == 0 && (c2994Ujhhgtgfeyxiexzf = c3035Ujhhgtgfeyxiexzf.f9409Ujhhgtgfeyxiexzf) != null) {
                        c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.removeListener(c2994Ujhhgtgfeyxiexzf);
                        c3035Ujhhgtgfeyxiexzf.f9409Ujhhgtgfeyxiexzf = null;
                    }
                }
                Drawable drawable2 = c3035Ujhhgtgfeyxiexzf.f6219Ujhhgtgfeyxiexzf;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf == null) {
                        c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf = new C3029Ujhhgtgfeyxiexzf(c0193Ujhhgtgfeyxiexzf);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0193Ujhhgtgfeyxiexzf.f1419Ujhhgtgfeyxiexzf);
                } else if (c0193Ujhhgtgfeyxiexzf != null) {
                    if (c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf == null) {
                        c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf = new ArrayList();
                    }
                    if (!c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf.contains(c0193Ujhhgtgfeyxiexzf)) {
                        c3035Ujhhgtgfeyxiexzf.f9410Ujhhgtgfeyxiexzf.add(c0193Ujhhgtgfeyxiexzf);
                        if (c3035Ujhhgtgfeyxiexzf.f9409Ujhhgtgfeyxiexzf == null) {
                            c3035Ujhhgtgfeyxiexzf.f9409Ujhhgtgfeyxiexzf = new C2994Ujhhgtgfeyxiexzf(1, c3035Ujhhgtgfeyxiexzf);
                        }
                        c3033feyxiexzfUjhhgtg.f9402Ujhhgtgfeyxiexzf.addListener(c3035Ujhhgtgfeyxiexzf.f9409Ujhhgtgfeyxiexzf);
                    }
                }
            }
            Drawable drawable3 = this.f742Ujhhgtgfeyxiexzf;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c3035Ujhhgtgfeyxiexzf != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c3035Ujhhgtgfeyxiexzf, false);
                ((AnimatedStateListDrawable) this.f742Ujhhgtgfeyxiexzf).addTransition(R.id.indeterminate, R.id.unchecked, c3035Ujhhgtgfeyxiexzf, false);
            }
        }
        Drawable drawable4 = this.f742Ujhhgtgfeyxiexzf;
        if (drawable4 != null && (colorStateList2 = this.f745Ujhhgtgfeyxiexzf) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f743Ujhhgtgfeyxiexzf;
        if (drawable5 != null && (colorStateList = this.f746Ujhhgtgfeyxiexzf) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(AbstractC3593Ujhhgtgfeyxiexzf.m5152Ujhhgtgfeyxiexzf(this.f742Ujhhgtgfeyxiexzf, this.f743Ujhhgtgfeyxiexzf, -1, -1));
        refreshDrawableState();
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f742Ujhhgtgfeyxiexzf = drawable;
        this.f744Ujhhgtgfeyxiexzf = false;
        m814Ujhhgtgfeyxiexzf();
    }
}
