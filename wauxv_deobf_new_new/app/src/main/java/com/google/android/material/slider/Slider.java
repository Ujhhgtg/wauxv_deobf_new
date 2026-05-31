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
import p000.AbstractC0364;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC1586;
import p000.C0060;
import p000.C1139;
import p000.C1948;
import p000.C2738;
import p000.InterfaceC1775;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Slider extends AbstractC0364 {
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
        return this.f1815;
    }

    public int getFocusedThumbIndex() {
        return this.f1816;
    }

    public int getHaloRadius() {
        return this.f1802;
    }

    public ColorStateList getHaloTintList() {
        return this.f1825;
    }

    public int getLabelBehavior() {
        return this.f1797;
    }

    public float getStepSize() {
        return this.f1817;
    }

    public float getThumbElevation() {
        return this.f1833.f6437.f6431;
    }

    public int getThumbHeight() {
        return this.f1801;
    }

    @Override // p000.AbstractC0364
    public int getThumbRadius() {
        return this.f1800 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f1833.f6437.f6422;
    }

    public float getThumbStrokeWidth() {
        return this.f1833.f6437.f6428;
    }

    public ColorStateList getThumbTintList() {
        return this.f1833.f6437.f6421;
    }

    public int getThumbTrackGapSize() {
        return this.f1803;
    }

    public int getThumbWidth() {
        return this.f1800;
    }

    public int getTickActiveRadius() {
        return this.f1820;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f1826;
    }

    public int getTickInactiveRadius() {
        return this.f1821;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f1827;
    }

    public ColorStateList getTickTintList() {
        if (this.f1827.equals(this.f1826)) {
            return this.f1826;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f1828;
    }

    public int getTrackHeight() {
        return this.f1798;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f1829;
    }

    public int getTrackInsideCornerSize() {
        return this.f1807;
    }

    public int getTrackSidePadding() {
        return this.f1799;
    }

    public int getTrackStopIndicatorSize() {
        return this.f1806;
    }

    public ColorStateList getTrackTintList() {
        if (this.f1829.equals(this.f1828)) {
            return this.f1828;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f1822;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f1812;
    }

    public float getValueTo() {
        return this.f1813;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // p000.AbstractC0364, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f1814.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f1816 = i;
        this.f1777.m3066(i);
        postInvalidate();
    }

    @Override // p000.AbstractC0364
    public void setHaloRadius(int i) {
        if (i == this.f1802) {
            return;
        }
        this.f1802 = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f1802);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC0364
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1825)) {
            return;
        }
        this.f1825 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iM1660 = m1660(colorStateList);
        Paint paint = this.f1773;
        paint.setColor(iM1660);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setLabelBehavior(int i) {
        if (this.f1797 != i) {
            this.f1797 = i;
            requestLayout();
        }
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f1817 != f) {
                this.f1817 = f;
                this.f1824 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f1812 + ")-valueTo(" + this.f1813 + ") range");
    }

    @Override // p000.AbstractC0364
    public void setThumbElevation(float f) {
        this.f1833.m3913(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // p000.AbstractC0364
    public void setThumbHeight(int i) {
        if (i == this.f1801) {
            return;
        }
        this.f1801 = i;
        this.f1833.setBounds(0, 0, this.f1800, i);
        Drawable drawable = this.f1834;
        if (drawable != null) {
            m1653(drawable);
        }
        Iterator it = this.f1835.iterator();
        while (it.hasNext()) {
            m1653((Drawable) it.next());
        }
        m1677();
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

    @Override // p000.AbstractC0364
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f1833.m3918(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(AbstractC1469.m3333(getContext(), i));
        }
    }

    @Override // p000.AbstractC0364
    public void setThumbStrokeWidth(float f) {
        C1948 c1948 = this.f1833;
        c1948.f6437.f6428 = f;
        c1948.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        C1948 c1948 = this.f1833;
        if (colorStateList.equals(c1948.f6437.f6421)) {
            return;
        }
        c1948.m3914(colorStateList);
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setThumbTrackGapSize(int i) {
        if (this.f1803 == i) {
            return;
        }
        this.f1803 = i;
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setThumbWidth(int i) {
        if (i == this.f1800) {
            return;
        }
        this.f1800 = i;
        C1139 c1139 = new C1139();
        C1139 c11310 = new C1139();
        C1139 c11311 = new C1139();
        C1139 c11312 = new C1139();
        float f = this.f1800 / 2.0f;
        AbstractC1471 abstractC1471M3474 = AbstractC1586.m3474(0);
        C0060 c0060 = new C0060(f);
        C0060 c0061 = new C0060(f);
        C0060 c0062 = new C0060(f);
        C0060 c0063 = new C0060(f);
        C2738 c2738 = new C2738();
        c2738.f8798 = abstractC1471M3474;
        c2738.f8799 = abstractC1471M3474;
        c2738.f8800 = abstractC1471M3474;
        c2738.f8801 = abstractC1471M3474;
        c2738.f8802 = c0060;
        c2738.f8803 = c0061;
        c2738.f8804 = c0062;
        c2738.f8805 = c0063;
        c2738.f8806 = c1139;
        c2738.f8807 = c11310;
        c2738.f8808 = c11311;
        c2738.f8809 = c11312;
        C1948 c1948 = this.f1833;
        c1948.setShapeAppearanceModel(c2738);
        c1948.setBounds(0, 0, this.f1800, this.f1801);
        Drawable drawable = this.f1834;
        if (drawable != null) {
            m1653(drawable);
        }
        Iterator it = this.f1835.iterator();
        while (it.hasNext()) {
            m1653((Drawable) it.next());
        }
        m1677();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC0364
    public void setTickActiveRadius(int i) {
        if (this.f1820 != i) {
            this.f1820 = i;
            this.f1775.setStrokeWidth(i * 2);
            m1677();
        }
    }

    @Override // p000.AbstractC0364
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1826)) {
            return;
        }
        this.f1826 = colorStateList;
        this.f1775.setColor(m1660(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setTickInactiveRadius(int i) {
        if (this.f1821 != i) {
            this.f1821 = i;
            this.f1774.setStrokeWidth(i * 2);
            m1677();
        }
    }

    @Override // p000.AbstractC0364
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1827)) {
            return;
        }
        this.f1827 = colorStateList;
        this.f1774.setColor(m1660(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f1819 != z) {
            this.f1819 = z;
            postInvalidate();
        }
    }

    @Override // p000.AbstractC0364
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1828)) {
            return;
        }
        this.f1828 = colorStateList;
        this.f1771.setColor(m1660(colorStateList));
        this.f1776.setColor(m1660(this.f1828));
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setTrackHeight(int i) {
        if (this.f1798 != i) {
            this.f1798 = i;
            this.f1770.setStrokeWidth(i);
            this.f1771.setStrokeWidth(this.f1798);
            m1677();
        }
    }

    @Override // p000.AbstractC0364
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1829)) {
            return;
        }
        this.f1829 = colorStateList;
        this.f1770.setColor(m1660(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setTrackInsideCornerSize(int i) {
        if (this.f1807 == i) {
            return;
        }
        this.f1807 = i;
        invalidate();
    }

    @Override // p000.AbstractC0364
    public void setTrackStopIndicatorSize(int i) {
        if (this.f1806 == i) {
            return;
        }
        this.f1806 = i;
        this.f1776.setStrokeWidth(i);
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
        this.f1812 = f;
        this.f1824 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f1813 = f;
        this.f1824 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m1653(drawableNewDrawable);
        this.f1834 = drawableNewDrawable;
        this.f1835.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(InterfaceC1775 interfaceC1775) {
    }
}
