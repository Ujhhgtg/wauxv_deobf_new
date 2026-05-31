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
import p000.AbstractC0747;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC2234;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.C0253;
import p000.C1787;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public static final int[] f806 = {R.attr.state_with_icon};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public Drawable f807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public Drawable f808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public int f809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public Drawable f810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public Drawable f811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public ColorStateList f813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public ColorStateList f815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public ColorStateList f816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public PorterDuff.Mode f817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public int[] f818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public int[] f819;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, R.attr.materialSwitchStyle);
        this.f809 = -1;
        Context context2 = getContext();
        this.f807 = super.getThumbDrawable();
        this.f812 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f810 = super.getTrackDrawable();
        this.f815 = super.getTrackTintList();
        super.setTrackTintList(null);
        C0253 c0253M4264 = AbstractC2240.m4264(context2, attributeSet, AbstractC2521.f8004, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f808 = c0253M4264.m1466(0);
        TypedArray typedArray = (TypedArray) c0253M4264.f1478;
        this.f809 = typedArray.getDimensionPixelSize(1, -1);
        this.f813 = c0253M4264.m1465(2);
        int i = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f814 = AbstractC1471.m3403(i, mode);
        this.f811 = c0253M4264.m1466(4);
        this.f816 = c0253M4264.m1465(5);
        this.f817 = AbstractC1471.m3403(typedArray.getInt(6, -1), mode);
        c0253M4264.m1475();
        setEnforceSwitchWidth(false);
        m828();
        m829();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m827(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(AbstractC0747.m2323(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f807;
    }

    public Drawable getThumbIconDrawable() {
        return this.f808;
    }

    public int getThumbIconSize() {
        return this.f809;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f813;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f814;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f812;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f811;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f816;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f817;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f810;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f815;
    }

    @Override // android.view.View
    public final void invalidate() {
        m830();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f808 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f806);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f818 = iArr;
        this.f819 = AbstractC2234.m4169(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f807 = drawable;
        m828();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f808 = drawable;
        m828();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(C1787.m3667(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.f809 != i) {
            this.f809 = i;
            m828();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f813 = colorStateList;
        m828();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f814 = mode;
        m828();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f812 = colorStateList;
        m828();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m828();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f811 = drawable;
        m829();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(C1787.m3667(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f816 = colorStateList;
        m829();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f817 = mode;
        m829();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f810 = drawable;
        m829();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f815 = colorStateList;
        m829();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m829();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m828() {
        this.f807 = AbstractC2234.m4162(this.f807, this.f812, getThumbTintMode());
        this.f808 = AbstractC2234.m4162(this.f808, this.f813, this.f814);
        m830();
        Drawable drawable = this.f807;
        Drawable drawable2 = this.f808;
        int i = this.f809;
        super.setThumbDrawable(AbstractC2234.m4159(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m829() {
        this.f810 = AbstractC2234.m4162(this.f810, this.f815, getTrackTintMode());
        this.f811 = AbstractC2234.m4162(this.f811, this.f816, this.f817);
        m830();
        Drawable layerDrawable = this.f810;
        if (layerDrawable != null && this.f811 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f810, this.f811});
        } else if (layerDrawable == null) {
            layerDrawable = this.f811;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m830() {
        if (this.f812 == null && this.f813 == null && this.f815 == null && this.f816 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f812;
        if (colorStateList != null) {
            m827(this.f807, colorStateList, this.f818, this.f819, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f813;
        if (colorStateList2 != null) {
            m827(this.f808, colorStateList2, this.f818, this.f819, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f815;
        if (colorStateList3 != null) {
            m827(this.f810, colorStateList3, this.f818, this.f819, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f816;
        if (colorStateList4 != null) {
            m827(this.f811, colorStateList4, this.f818, this.f819, thumbPosition);
        }
    }
}
