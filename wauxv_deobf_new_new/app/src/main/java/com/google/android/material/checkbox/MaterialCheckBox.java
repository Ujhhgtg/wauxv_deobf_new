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
import p000.AbstractC0223;
import p000.AbstractC1095;
import p000.AbstractC1469;
import p000.AbstractC1470;
import p000.AbstractC1471;
import p000.AbstractC2234;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC2638;
import p000.C0131;
import p000.C0165;
import p000.C0169;
import p000.C0170;
import p000.C0171;
import p000.C0253;
import p000.C1787;
import p000.C1942;
import p000.C1943;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AbstractC0223 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f717 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f718 = {R.attr.state_error};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[][] f719 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final int f720 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f721;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final LinkedHashSet f722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ColorStateList f723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public CharSequence f727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Drawable f728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Drawable f729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public ColorStateList f731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ColorStateList f732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public PorterDuff.Mode f733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int[] f735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public CharSequence f737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C0171 f739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final C1942 f740;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f721 = new LinkedHashSet();
        this.f722 = new LinkedHashSet();
        Context context2 = getContext();
        C0171 c0171 = new C0171(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC2638.f8340;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0171.f11215 = drawable;
        drawable.setCallback(c0171.f1252);
        new C0170(c0171.f11215.getConstantState(), 0);
        this.f739 = c0171;
        this.f740 = new C1942(this);
        Context context3 = getContext();
        this.f728 = getButtonDrawable();
        this.f731 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0253 c0253M4264 = AbstractC2240.m4264(context3, attributeSet, AbstractC2521.f8001, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) c0253M4264.f1478;
        this.f729 = c0253M4264.m1466(2);
        if (this.f728 != null && AbstractC1469.m3346(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f720 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f728 = C1787.m3667(context3, R.drawable.mtrl_checkbox_button);
                this.f730 = true;
                if (this.f729 == null) {
                    this.f729 = C1787.m3667(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f732 = AbstractC1471.m3387(context3, c0253M4264, 3);
        this.f733 = AbstractC1471.m3403(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f724 = typedArray.getBoolean(10, false);
        this.f725 = typedArray.getBoolean(6, true);
        this.f726 = typedArray.getBoolean(9, false);
        this.f727 = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        c0253M4264.m1475();
        m815();
    }

    private String getButtonStateDescription() {
        int i = this.f734;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f723 == null) {
            int iM3363 = AbstractC1470.m3363(this, R.attr.colorControlActivated);
            int iM3364 = AbstractC1470.m3363(this, R.attr.colorError);
            int iM3365 = AbstractC1470.m3363(this, R.attr.colorSurface);
            int iM3366 = AbstractC1470.m3363(this, R.attr.colorOnSurface);
            this.f723 = new ColorStateList(f719, new int[]{AbstractC1470.m3368(iM3365, iM3364, 1.0f), AbstractC1470.m3368(iM3365, iM3363, 1.0f), AbstractC1470.m3368(iM3365, iM3366, 0.54f), AbstractC1470.m3368(iM3365, iM3366, 0.38f), AbstractC1470.m3368(iM3365, iM3366, 0.38f)});
        }
        return this.f723;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f731;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f728;
    }

    public Drawable getButtonIconDrawable() {
        return this.f729;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f732;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f733;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f731;
    }

    public int getCheckedState() {
        return this.f734;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f727;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f734 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f724 && this.f731 == null && this.f732 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f717);
        }
        if (this.f726) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f718);
        }
        this.f735 = AbstractC2234.m4169(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f725 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC1471.m3399(this) ? -1 : 1);
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
        if (accessibilityNodeInfo != null && this.f726) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f727));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1943)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1943 c1943 = (C1943) parcelable;
        super.onRestoreInstanceState(c1943.getSuperState());
        setCheckedState(c1943.f6416);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1943 c1943 = new C1943(super.onSaveInstanceState());
        c1943.f6416 = getCheckedState();
        return c1943;
    }

    @Override // p000.AbstractC0223, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C1787.m3667(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f729 = drawable;
        m815();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C1787.m3667(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f732 == colorStateList) {
            return;
        }
        this.f732 = colorStateList;
        m815();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f733 == mode) {
            return;
        }
        this.f733 = mode;
        m815();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f731 == colorStateList) {
            return;
        }
        this.f731 = colorStateList;
        m815();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m815();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f725 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f734 != i) {
            this.f734 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f737 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f736) {
                return;
            }
            this.f736 = true;
            LinkedHashSet linkedHashSet = this.f722;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC1095.m2792(it);
                }
            }
            if (this.f734 != 2 && (onCheckedChangeListener = this.f738) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f736 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f727 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f726 == z) {
            return;
        }
        this.f726 = z;
        refreshDrawableState();
        Iterator it = this.f721.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f738 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f737 = charSequence;
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
        this.f724 = z;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m815() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0131 c0131;
        this.f728 = AbstractC2234.m4162(this.f728, this.f731, getButtonTintMode());
        this.f729 = AbstractC2234.m4162(this.f729, this.f732, this.f733);
        if (this.f730) {
            C0171 c0171 = this.f739;
            if (c0171 != null) {
                C0169 c0169 = c0171.f1248;
                Drawable drawable = c0171.f11215;
                C1942 c1942 = this.f740;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1942.f6414 == null) {
                        c1942.f6414 = new C0165(c1942);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1942.f6414);
                }
                ArrayList arrayList = c0171.f1251;
                if (arrayList != null && c1942 != null) {
                    arrayList.remove(c1942);
                    if (c0171.f1251.size() == 0 && (c0131 = c0171.f1250) != null) {
                        c0169.f1243.removeListener(c0131);
                        c0171.f1250 = null;
                    }
                }
                Drawable drawable2 = c0171.f11215;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1942.f6414 == null) {
                        c1942.f6414 = new C0165(c1942);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1942.f6414);
                } else if (c1942 != null) {
                    if (c0171.f1251 == null) {
                        c0171.f1251 = new ArrayList();
                    }
                    if (!c0171.f1251.contains(c1942)) {
                        c0171.f1251.add(c1942);
                        if (c0171.f1250 == null) {
                            c0171.f1250 = new C0131(c0171, 1);
                        }
                        c0169.f1243.addListener(c0171.f1250);
                    }
                }
            }
            Drawable drawable3 = this.f728;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0171 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0171, false);
                ((AnimatedStateListDrawable) this.f728).addTransition(R.id.indeterminate, R.id.unchecked, c0171, false);
            }
        }
        Drawable drawable4 = this.f728;
        if (drawable4 != null && (colorStateList2 = this.f731) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f729;
        if (drawable5 != null && (colorStateList = this.f732) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(AbstractC2234.m4159(this.f728, this.f729, -1, -1));
        refreshDrawableState();
    }

    @Override // p000.AbstractC0223, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f728 = drawable;
        this.f730 = false;
        m815();
    }
}
