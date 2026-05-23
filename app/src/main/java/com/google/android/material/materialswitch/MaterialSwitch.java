package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import me.hd.wauxv.R;
import p000.AbstractC0752;
import p000.AbstractC1459;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC3471;
import p000.C0243;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    public static final int[] f740 = {R.attr.state_with_icon};

    public Drawable f741;

    public Drawable f742;

    public int f743;

    public Drawable f744;

    public Drawable f745;

    public ColorStateList f746;

    public ColorStateList f747;

    public PorterDuff.Mode f748;

    public ColorStateList f749;

    public ColorStateList f750;

    public PorterDuff.Mode f751;

    public int[] f752;

    public int[] f753;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, R.attr.materialSwitchStyle);
        this.f743 = -1;
        Context context2 = getContext();
        this.f741 = super.getThumbDrawable();
        this.f746 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f744 = super.getTrackDrawable();
        this.f749 = super.getTrackTintList();
        super.setTrackTintList(null);
        C0243 c0243M5083 = AbstractC3471.m5083(context2, attributeSet, AbstractC2467.f7854, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f742 = c0243M5083.m1320(0);
        TypedArray typedArray = (TypedArray) c0243M5083.f1404;
        this.f743 = typedArray.getDimensionPixelSize(1, -1);
        this.f747 = c0243M5083.m1319(2);
        int i = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f748 = AbstractC1459.m3195(i, PorterDuff.Mode.SRC_IN);
        this.f745 = c0243M5083.m1320(4);
        this.f750 = c0243M5083.m1319(5);
        this.f751 = AbstractC1459.m3195(typedArray.getInt(6, -1), PorterDuff.Mode.SRC_IN);
        c0243M5083.m1329();
        setEnforceSwitchWidth(false);
        m684();
        m685();
    }

    public static void m683(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(AbstractC0752.m2223(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f741;
    }

    public Drawable getThumbIconDrawable() {
        return this.f742;
    }

    public int getThumbIconSize() {
        return this.f743;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f747;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f748;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f746;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f745;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f750;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f751;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f744;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f749;
    }

    @Override // android.view.View
    public final void invalidate() {
        m686();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f742 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f740);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f752 = iArr;
        this.f753 = AbstractC3471.m5074(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f741 = drawable;
        m684();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f742 = drawable;
        m684();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.f743 != i) {
            this.f743 = i;
            m684();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f747 = colorStateList;
        m684();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f748 = mode;
        m684();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f746 = colorStateList;
        m684();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m684();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f745 = drawable;
        m685();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f750 = colorStateList;
        m685();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f751 = mode;
        m685();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f744 = drawable;
        m685();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f749 = colorStateList;
        m685();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m685();
    }

    public final void m684() {
        this.f741 = AbstractC3471.m5073(this.f741, this.f746, getThumbTintMode());
        this.f742 = AbstractC3471.m5073(this.f742, this.f747, this.f748);
        m686();
        Drawable drawable = this.f741;
        Drawable drawable2 = this.f742;
        int i = this.f743;
        super.setThumbDrawable(AbstractC3471.m5069(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void m685() {
        this.f744 = AbstractC3471.m5073(this.f744, this.f749, getTrackTintMode());
        this.f745 = AbstractC3471.m5073(this.f745, this.f750, this.f751);
        m686();
        Drawable layerDrawable = this.f744;
        if (layerDrawable != null && this.f745 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f744, this.f745});
        } else if (layerDrawable == null) {
            layerDrawable = this.f745;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    public final void m686() {
        if (this.f746 == null && this.f747 == null && this.f749 == null && this.f750 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f746;
        if (colorStateList != null) {
            m683(this.f741, colorStateList, this.f752, this.f753, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f747;
        if (colorStateList2 != null) {
            m683(this.f742, colorStateList2, this.f752, this.f753, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f749;
        if (colorStateList3 != null) {
            m683(this.f744, colorStateList3, this.f752, this.f753, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f750;
        if (colorStateList4 != null) {
            m683(this.f745, colorStateList4, this.f752, this.f753, thumbPosition);
        }
    }
}
