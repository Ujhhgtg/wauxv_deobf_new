package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC2209;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.C0224;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C0224 {

    public static final int[][] f754 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public ColorStateList f755;

    public boolean f756;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context2, attributeSet, AbstractC2467.f7852, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM5082.hasValue(0)) {
            setButtonTintList(AbstractC3453.m4995(context2, typedArrayM5082, 0));
        }
        this.f756 = typedArrayM5082.getBoolean(1, false);
        typedArrayM5082.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f755 == null) {
            int iM4131 = AbstractC2209.m4131(this, me.hd.wauxv.R.attr.colorControlActivated);
            int iM4132 = AbstractC2209.m4131(this, me.hd.wauxv.R.attr.colorOnSurface);
            int iM4133 = AbstractC2209.m4131(this, me.hd.wauxv.R.attr.colorSurface);
            this.f755 = new ColorStateList(f754, new int[]{AbstractC2209.m4137(iM4133, iM4131, 1.0f), AbstractC2209.m4137(iM4133, iM4132, 0.54f), AbstractC2209.m4137(iM4133, iM4132, 0.38f), AbstractC2209.m4137(iM4133, iM4132, 0.38f)});
        }
        return this.f755;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f756 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f756 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
