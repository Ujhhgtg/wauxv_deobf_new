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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC2857Ujhhgtgfeyxiexzf;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final int[] f820Ujhhgtgfeyxiexzf = {R.attr.state_with_icon};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public Drawable f821feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Drawable f822Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f823Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Drawable f824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f825Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ColorStateList f826Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f827Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public PorterDuff.Mode f828feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public ColorStateList f829feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public ColorStateList f830feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public PorterDuff.Mode f831feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int[] f832feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int[] f833feyxiexzfUjhhgtg;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, R.attr.materialSwitchStyle);
        this.f823Ujhhgtgfeyxiexzf = -1;
        Context context2 = getContext();
        this.f821feyxiexzfUjhhgtg = super.getThumbDrawable();
        this.f826Ujhhgtgfeyxiexzf = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f824Ujhhgtgfeyxiexzf = super.getTrackDrawable();
        this.f829feyxiexzfUjhhgtg = super.getTrackTintList();
        super.setTrackTintList(null);
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2741Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3135Ujhhgtgfeyxiexzf, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f822Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(0);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f823Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(1, -1);
        this.f827Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(2);
        int i = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f828feyxiexzfUjhhgtg = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(i, mode);
        this.f825Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(4);
        this.f830feyxiexzfUjhhgtg = c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(5);
        this.f831feyxiexzfUjhhgtg = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArray.getInt(6, -1), mode);
        c2366UjhhgtgfeyxiexzfM2741Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        setEnforceSwitchWidth(false);
        m827Ujhhgtgfeyxiexzf();
        m828Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m826Ujhhgtgfeyxiexzf(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(AbstractC2857Ujhhgtgfeyxiexzf.m4259Ujhhgtgfeyxiexzf(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.f821feyxiexzfUjhhgtg;
    }

    public Drawable getThumbIconDrawable() {
        return this.f822Ujhhgtgfeyxiexzf;
    }

    public int getThumbIconSize() {
        return this.f823Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f827Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f828feyxiexzfUjhhgtg;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f826Ujhhgtgfeyxiexzf;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f825Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f830feyxiexzfUjhhgtg;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f831feyxiexzfUjhhgtg;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f824Ujhhgtgfeyxiexzf;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f829feyxiexzfUjhhgtg;
    }

    @Override // android.view.View
    public final void invalidate() {
        m829Ujhhgtgfeyxiexzf();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f822Ujhhgtgfeyxiexzf != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f820Ujhhgtgfeyxiexzf);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f832feyxiexzfUjhhgtg = iArr;
        this.f833feyxiexzfUjhhgtg = AbstractC3593Ujhhgtgfeyxiexzf.m5156Ujhhgtgfeyxiexzf(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.f821feyxiexzfUjhhgtg = drawable;
        m827Ujhhgtgfeyxiexzf();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f822Ujhhgtgfeyxiexzf = drawable;
        m827Ujhhgtgfeyxiexzf();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.f823Ujhhgtgfeyxiexzf != i) {
            this.f823Ujhhgtgfeyxiexzf = i;
            m827Ujhhgtgfeyxiexzf();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f827Ujhhgtgfeyxiexzf = colorStateList;
        m827Ujhhgtgfeyxiexzf();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f828feyxiexzfUjhhgtg = mode;
        m827Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f826Ujhhgtgfeyxiexzf = colorStateList;
        m827Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m827Ujhhgtgfeyxiexzf();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f825Ujhhgtgfeyxiexzf = drawable;
        m828Ujhhgtgfeyxiexzf();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f830feyxiexzfUjhhgtg = colorStateList;
        m828Ujhhgtgfeyxiexzf();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f831feyxiexzfUjhhgtg = mode;
        m828Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f824Ujhhgtgfeyxiexzf = drawable;
        m828Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f829feyxiexzfUjhhgtg = colorStateList;
        m828Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m828Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m827Ujhhgtgfeyxiexzf() {
        this.f821feyxiexzfUjhhgtg = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f821feyxiexzfUjhhgtg, this.f826Ujhhgtgfeyxiexzf, getThumbTintMode());
        this.f822Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f822Ujhhgtgfeyxiexzf, this.f827Ujhhgtgfeyxiexzf, this.f828feyxiexzfUjhhgtg);
        m829Ujhhgtgfeyxiexzf();
        Drawable drawable = this.f821feyxiexzfUjhhgtg;
        Drawable drawable2 = this.f822Ujhhgtgfeyxiexzf;
        int i = this.f823Ujhhgtgfeyxiexzf;
        super.setThumbDrawable(AbstractC3593Ujhhgtgfeyxiexzf.m5152Ujhhgtgfeyxiexzf(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m828Ujhhgtgfeyxiexzf() {
        this.f824Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f824Ujhhgtgfeyxiexzf, this.f829feyxiexzfUjhhgtg, getTrackTintMode());
        this.f825Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5153Ujhhgtgfeyxiexzf(this.f825Ujhhgtgfeyxiexzf, this.f830feyxiexzfUjhhgtg, this.f831feyxiexzfUjhhgtg);
        m829Ujhhgtgfeyxiexzf();
        Drawable layerDrawable = this.f824Ujhhgtgfeyxiexzf;
        if (layerDrawable != null && this.f825Ujhhgtgfeyxiexzf != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f824Ujhhgtgfeyxiexzf, this.f825Ujhhgtgfeyxiexzf});
        } else if (layerDrawable == null) {
            layerDrawable = this.f825Ujhhgtgfeyxiexzf;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m829Ujhhgtgfeyxiexzf() {
        if (this.f826Ujhhgtgfeyxiexzf == null && this.f827Ujhhgtgfeyxiexzf == null && this.f829feyxiexzfUjhhgtg == null && this.f830feyxiexzfUjhhgtg == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f826Ujhhgtgfeyxiexzf;
        if (colorStateList != null) {
            m826Ujhhgtgfeyxiexzf(this.f821feyxiexzfUjhhgtg, colorStateList, this.f832feyxiexzfUjhhgtg, this.f833feyxiexzfUjhhgtg, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f827Ujhhgtgfeyxiexzf;
        if (colorStateList2 != null) {
            m826Ujhhgtgfeyxiexzf(this.f822Ujhhgtgfeyxiexzf, colorStateList2, this.f832feyxiexzfUjhhgtg, this.f833feyxiexzfUjhhgtg, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f829feyxiexzfUjhhgtg;
        if (colorStateList3 != null) {
            m826Ujhhgtgfeyxiexzf(this.f824Ujhhgtgfeyxiexzf, colorStateList3, this.f832feyxiexzfUjhhgtg, this.f833feyxiexzfUjhhgtg, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f830feyxiexzfUjhhgtg;
        if (colorStateList4 != null) {
            m826Ujhhgtgfeyxiexzf(this.f825Ujhhgtgfeyxiexzf, colorStateList4, this.f832feyxiexzfUjhhgtg, this.f833feyxiexzfUjhhgtg, thumbPosition);
        }
    }
}
