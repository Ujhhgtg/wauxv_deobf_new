package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C2352Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C2352Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final int[][] f834Ujhhgtgfeyxiexzf = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ColorStateList f835Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f836Ujhhgtgfeyxiexzf;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3133Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.radioButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(0)) {
            setButtonTintList(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayM2740Ujhhgtgfeyxiexzf, 0));
        }
        this.f836Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(1, false);
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f835Ujhhgtgfeyxiexzf == null) {
            int iM4211feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, me.hd.wauxv.R.attr.colorControlActivated);
            int iM4211feyxiexzfUjhhgtg2 = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, me.hd.wauxv.R.attr.colorOnSurface);
            int iM4211feyxiexzfUjhhgtg3 = AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, me.hd.wauxv.R.attr.colorSurface);
            this.f835Ujhhgtgfeyxiexzf = new ColorStateList(f834Ujhhgtgfeyxiexzf, new int[]{AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg, 1.0f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg2, 0.54f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg2, 0.38f), AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(iM4211feyxiexzfUjhhgtg3, iM4211feyxiexzfUjhhgtg2, 0.38f)});
        }
        return this.f835Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f836Ujhhgtgfeyxiexzf && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f836Ujhhgtgfeyxiexzf = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
