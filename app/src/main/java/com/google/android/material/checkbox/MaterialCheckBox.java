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
import p000.AbstractC0213;
import p000.AbstractC1194;
import p000.AbstractC1459;
import p000.AbstractC2207;
import p000.AbstractC2209;
import p000.AbstractC2467;
import p000.AbstractC2582;
import p000.AbstractC2665;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.C0123;
import p000.C0157;
import p000.C0161;
import p000.C0162;
import p000.C0163;
import p000.C0243;
import p000.C1912;
import p000.C1913;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AbstractC0213 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f658 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f659 = {R.attr.state_error};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final int[][] f660 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final int f661 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final LinkedHashSet f662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final LinkedHashSet f663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public CharSequence f668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Drawable f669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Drawable f670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ColorStateList f672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public ColorStateList f673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int[] f676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public CharSequence f678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final C0163 f680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final C1912 f681;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f662 = new LinkedHashSet();
        this.f663 = new LinkedHashSet();
        Context context2 = getContext();
        C0163 c0163 = new C0163(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC2582.f8187;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0163.f11066 = drawable;
        drawable.setCallback(c0163.f1184);
        new C0162(0, c0163.f11066.getConstantState());
        this.f680 = c0163;
        this.f681 = new C1912(this);
        Context context3 = getContext();
        this.f669 = getButtonDrawable();
        this.f672 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0243 c0243M5083 = AbstractC3471.m5083(context3, attributeSet, AbstractC2467.f7851, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) c0243M5083.f1404;
        this.f670 = c0243M5083.m1320(2);
        if (this.f669 != null && AbstractC2207.m4110(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f661 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f669 = AbstractC3471.m5076(context3, R.drawable.mtrl_checkbox_button);
                this.f671 = true;
                if (this.f670 == null) {
                    this.f670 = AbstractC3471.m5076(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f673 = AbstractC3453.m4994(context3, c0243M5083, 3);
        this.f674 = AbstractC1459.m3195(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f665 = typedArray.getBoolean(10, false);
        this.f666 = typedArray.getBoolean(6, true);
        this.f667 = typedArray.getBoolean(9, false);
        this.f668 = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        c0243M5083.m1329();
        m671();
    }

    private String getButtonStateDescription() {
        int i = this.f675;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f664 == null) {
            int iM4131 = AbstractC2209.m4131(this, R.attr.colorControlActivated);
            int iM4132 = AbstractC2209.m4131(this, R.attr.colorError);
            int iM4133 = AbstractC2209.m4131(this, R.attr.colorSurface);
            int iM4134 = AbstractC2209.m4131(this, R.attr.colorOnSurface);
            this.f664 = new ColorStateList(f660, new int[]{AbstractC2209.m4137(iM4133, iM4132, 1.0f), AbstractC2209.m4137(iM4133, iM4131, 1.0f), AbstractC2209.m4137(iM4133, iM4134, 0.54f), AbstractC2209.m4137(iM4133, iM4134, 0.38f), AbstractC2209.m4137(iM4133, iM4134, 0.38f)});
        }
        return this.f664;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f672;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f669;
    }

    public Drawable getButtonIconDrawable() {
        return this.f670;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f673;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f674;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f672;
    }

    public int getCheckedState() {
        return this.f675;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f668;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f675 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f665 && this.f672 == null && this.f673 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f658);
        }
        if (this.f667) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f659);
        }
        this.f676 = AbstractC3471.m5074(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f666 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC1459.m3191(this) ? -1 : 1);
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
        if (accessibilityNodeInfo != null && this.f667) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f668));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1913)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1913 c1913 = (C1913) parcelable;
        super.onRestoreInstanceState(c1913.getSuperState());
        setCheckedState(c1913.f6311);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1913 c1913 = new C1913(super.onSaveInstanceState());
        c1913.f6311 = getCheckedState();
        return c1913;
    }

    @Override // p000.AbstractC0213, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f670 = drawable;
        m671();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f673 == colorStateList) {
            return;
        }
        this.f673 = colorStateList;
        m671();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f674 == mode) {
            return;
        }
        this.f674 = mode;
        m671();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f672 == colorStateList) {
            return;
        }
        this.f672 = colorStateList;
        m671();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m671();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f666 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f675 != i) {
            this.f675 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f678 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f677) {
                return;
            }
            this.f677 = true;
            LinkedHashSet linkedHashSet = this.f663;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC1194.m2777(it);
                }
            }
            if (this.f675 != 2 && (onCheckedChangeListener = this.f679) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f677 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f668 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f667 == z) {
            return;
        }
        this.f667 = z;
        refreshDrawableState();
        Iterator it = this.f662.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f679 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f678 = charSequence;
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
        this.f665 = z;
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
    public final void m671() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0123 c0123;
        this.f669 = AbstractC3471.m5073(this.f669, this.f672, getButtonTintMode());
        this.f670 = AbstractC3471.m5073(this.f670, this.f673, this.f674);
        if (this.f671) {
            C0163 c0163 = this.f680;
            if (c0163 != null) {
                C0161 c0161 = c0163.f1180;
                Drawable drawable = c0163.f11066;
                C1912 c1912 = this.f681;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1912.f6309 == null) {
                        c1912.f6309 = new C0157(c1912);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1912.f6309);
                }
                ArrayList arrayList = c0163.f1183;
                if (arrayList != null && c1912 != null) {
                    arrayList.remove(c1912);
                    if (c0163.f1183.size() == 0 && (c0123 = c0163.f1182) != null) {
                        c0161.f1175.removeListener(c0123);
                        c0163.f1182 = null;
                    }
                }
                Drawable drawable2 = c0163.f11066;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1912.f6309 == null) {
                        c1912.f6309 = new C0157(c1912);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1912.f6309);
                } else if (c1912 != null) {
                    if (c0163.f1183 == null) {
                        c0163.f1183 = new ArrayList();
                    }
                    if (!c0163.f1183.contains(c1912)) {
                        c0163.f1183.add(c1912);
                        if (c0163.f1182 == null) {
                            c0163.f1182 = new C0123(1, c0163);
                        }
                        c0161.f1175.addListener(c0163.f1182);
                    }
                }
            }
            Drawable drawable3 = this.f669;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0163 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0163, false);
                ((AnimatedStateListDrawable) this.f669).addTransition(R.id.indeterminate, R.id.unchecked, c0163, false);
            }
        }
        Drawable drawable4 = this.f669;
        if (drawable4 != null && (colorStateList2 = this.f672) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f670;
        if (drawable5 != null && (colorStateList = this.f673) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(AbstractC3471.m5069(this.f669, this.f670, -1, -1));
        refreshDrawableState();
    }

    @Override // p000.AbstractC0213, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f669 = drawable;
        this.f671 = false;
        m671();
    }
}
