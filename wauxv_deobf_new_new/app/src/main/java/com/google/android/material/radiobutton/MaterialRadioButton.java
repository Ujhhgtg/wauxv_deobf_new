package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC1469;
import p000.AbstractC1470;
import p000.AbstractC1471;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.C0234;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C0234 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int[][] f820 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ColorStateList f821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f822;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context2, attributeSet, AbstractC2521.f8002, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM4263.hasValue(0)) {
            setButtonTintList(AbstractC1471.m3388(context2, typedArrayM4263, 0));
        }
        this.f822 = typedArrayM4263.getBoolean(1, false);
        typedArrayM4263.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f821 == null) {
            int iM3363 = AbstractC1470.m3363(this, me.hd.wauxv.R.attr.colorControlActivated);
            int iM3364 = AbstractC1470.m3363(this, me.hd.wauxv.R.attr.colorOnSurface);
            int iM3365 = AbstractC1470.m3363(this, me.hd.wauxv.R.attr.colorSurface);
            this.f821 = new ColorStateList(f820, new int[]{AbstractC1470.m3368(iM3365, iM3363, 1.0f), AbstractC1470.m3368(iM3365, iM3364, 0.54f), AbstractC1470.m3368(iM3365, iM3364, 0.38f), AbstractC1470.m3368(iM3365, iM3364, 0.38f)});
        }
        return this.f821;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f822 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f822 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
