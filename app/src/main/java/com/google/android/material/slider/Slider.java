package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.Iterator;
import p000.AbstractC0389;
import p000.AbstractC2203;
import p000.AbstractC2207;
import p000.AbstractC3471;
import p000.C0053;
import p000.C1133;
import p000.C1917;
import p000.C2677;
import p000.InterfaceC1753;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Slider extends AbstractC0389 {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f1844;
    }

    public int getFocusedThumbIndex() {
        return this.f1845;
    }

    public int getHaloRadius() {
        return this.f1831;
    }

    public ColorStateList getHaloTintList() {
        return this.f1854;
    }

    public int getLabelBehavior() {
        return this.f1826;
    }

    public float getStepSize() {
        return this.f1846;
    }

    public float getThumbElevation() {
        return this.f1862.f6332.f6326;
    }

    public int getThumbHeight() {
        return this.f1830;
    }

    @Override // p000.AbstractC0389
    public int getThumbRadius() {
        return this.f1829 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f1862.f6332.f6317;
    }

    public float getThumbStrokeWidth() {
        return this.f1862.f6332.f6323;
    }

    public ColorStateList getThumbTintList() {
        return this.f1862.f6332.f6316;
    }

    public int getThumbTrackGapSize() {
        return this.f1832;
    }

    public int getThumbWidth() {
        return this.f1829;
    }

    public int getTickActiveRadius() {
        return this.f1849;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f1855;
    }

    public int getTickInactiveRadius() {
        return this.f1850;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f1856;
    }

    public ColorStateList getTickTintList() {
        if (this.f1856.equals(this.f1855)) {
            return this.f1855;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f1857;
    }

    public int getTrackHeight() {
        return this.f1827;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f1858;
    }

    public int getTrackInsideCornerSize() {
        return this.f1836;
    }

    public int getTrackSidePadding() {
        return this.f1828;
    }

    public int getTrackStopIndicatorSize() {
        return this.f1835;
    }

    public ColorStateList getTrackTintList() {
        if (this.f1858.equals(this.f1857)) {
            return this.f1857;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f1851;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f1841;
    }

    public float getValueTo() {
        return this.f1842;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // p000.AbstractC0389, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f1843.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f1845 = i;
        this.f1806.m2947(i);
        postInvalidate();
    }

    @Override // p000.AbstractC0389
    public void setHaloRadius(int i) {
        if (i == this.f1831) {
            return;
        }
        this.f1831 = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f1831);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC0389
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1854)) {
            return;
        }
        this.f1854 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iM1554 = m1554(colorStateList);
        Paint paint = this.f1802;
        paint.setColor(iM1554);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setLabelBehavior(int i) {
        if (this.f1826 != i) {
            this.f1826 = i;
            requestLayout();
        }
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f1846 != f) {
                this.f1846 = f;
                this.f1853 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f1841 + ")-valueTo(" + this.f1842 + ") range");
    }

    @Override // p000.AbstractC0389
    public void setThumbElevation(float f) {
        this.f1862.m3715(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // p000.AbstractC0389
    public void setThumbHeight(int i) {
        if (i == this.f1830) {
            return;
        }
        this.f1830 = i;
        this.f1862.setBounds(0, 0, this.f1829, i);
        Drawable drawable = this.f1863;
        if (drawable != null) {
            m1547(drawable);
        }
        Iterator it = this.f1864.iterator();
        while (it.hasNext()) {
            m1547((Drawable) it.next());
        }
        m1571();
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC0389
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f1862.m3718(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(AbstractC2203.m4030(getContext(), i));
        }
    }

    @Override // p000.AbstractC0389
    public void setThumbStrokeWidth(float f) {
        C1917 c1917 = this.f1862;
        c1917.f6332.f6323 = f;
        c1917.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        C1917 c1917 = this.f1862;
        if (colorStateList.equals(c1917.f6332.f6316)) {
            return;
        }
        c1917.m3716(colorStateList);
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setThumbTrackGapSize(int i) {
        if (this.f1832 == i) {
            return;
        }
        this.f1832 = i;
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setThumbWidth(int i) {
        if (i == this.f1829) {
            return;
        }
        this.f1829 = i;
        C1133 c1133 = new C1133();
        C1133 c1134 = new C1133();
        C1133 c1135 = new C1133();
        C1133 c1136 = new C1133();
        float f = this.f1829 / 2.0f;
        AbstractC2207 abstractC2207M5071 = AbstractC3471.m5071(0);
        C0053 c0053 = new C0053(f);
        C0053 c0054 = new C0053(f);
        C0053 c0055 = new C0053(f);
        C0053 c0056 = new C0053(f);
        C2677 c2677 = new C2677();
        c2677.f8628 = abstractC2207M5071;
        c2677.f8629 = abstractC2207M5071;
        c2677.f8630 = abstractC2207M5071;
        c2677.f8631 = abstractC2207M5071;
        c2677.f8632 = c0053;
        c2677.f8633 = c0054;
        c2677.f8634 = c0055;
        c2677.f8635 = c0056;
        c2677.f8636 = c1133;
        c2677.f8637 = c1134;
        c2677.f8638 = c1135;
        c2677.f8639 = c1136;
        C1917 c1917 = this.f1862;
        c1917.setShapeAppearanceModel(c2677);
        c1917.setBounds(0, 0, this.f1829, this.f1830);
        Drawable drawable = this.f1863;
        if (drawable != null) {
            m1547(drawable);
        }
        Iterator it = this.f1864.iterator();
        while (it.hasNext()) {
            m1547((Drawable) it.next());
        }
        m1571();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC0389
    public void setTickActiveRadius(int i) {
        if (this.f1849 != i) {
            this.f1849 = i;
            this.f1804.setStrokeWidth(i * 2);
            m1571();
        }
    }

    @Override // p000.AbstractC0389
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1855)) {
            return;
        }
        this.f1855 = colorStateList;
        this.f1804.setColor(m1554(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setTickInactiveRadius(int i) {
        if (this.f1850 != i) {
            this.f1850 = i;
            this.f1803.setStrokeWidth(i * 2);
            m1571();
        }
    }

    @Override // p000.AbstractC0389
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1856)) {
            return;
        }
        this.f1856 = colorStateList;
        this.f1803.setColor(m1554(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f1848 != z) {
            this.f1848 = z;
            postInvalidate();
        }
    }

    @Override // p000.AbstractC0389
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1857)) {
            return;
        }
        this.f1857 = colorStateList;
        this.f1800.setColor(m1554(colorStateList));
        this.f1805.setColor(m1554(this.f1857));
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setTrackHeight(int i) {
        if (this.f1827 != i) {
            this.f1827 = i;
            this.f1799.setStrokeWidth(i);
            this.f1800.setStrokeWidth(this.f1827);
            m1571();
        }
    }

    @Override // p000.AbstractC0389
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1858)) {
            return;
        }
        this.f1858 = colorStateList;
        this.f1799.setColor(m1554(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setTrackInsideCornerSize(int i) {
        if (this.f1836 == i) {
            return;
        }
        this.f1836 = i;
        invalidate();
    }

    @Override // p000.AbstractC0389
    public void setTrackStopIndicatorSize(int i) {
        if (this.f1835 == i) {
            return;
        }
        this.f1835 = i;
        this.f1805.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.f1841 = f;
        this.f1853 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f1842 = f;
        this.f1853 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m1547(drawableNewDrawable);
        this.f1863 = drawableNewDrawable;
        this.f1864.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(InterfaceC1753 interfaceC1753) {
    }
}
