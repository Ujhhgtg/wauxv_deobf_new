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
import p000.AbstractC2475feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C2923Ujhhgtgfeyxiexzf;
import p000.C3382feyxiexzfUjhhgtg;
import p000.InterfaceC0153Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Slider extends AbstractC2475feyxiexzfUjhhgtg {
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
        return this.f8072feyxiexzfUjhhgtg;
    }

    public int getFocusedThumbIndex() {
        return this.f8073Ujhhgtgfeyxiexzf;
    }

    public int getHaloRadius() {
        return this.f8059feyxiexzfUjhhgtg;
    }

    public ColorStateList getHaloTintList() {
        return this.f8082feyxiexzfUjhhgtg;
    }

    public int getLabelBehavior() {
        return this.f8054feyxiexzfUjhhgtg;
    }

    public float getStepSize() {
        return this.f8074Ujhhgtgfeyxiexzf;
    }

    public float getThumbElevation() {
        return this.f8090feyxiexzfUjhhgtg.f1527Ujhhgtgfeyxiexzf.f1518Ujhhgtgfeyxiexzf;
    }

    public int getThumbHeight() {
        return this.f8058feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public int getThumbRadius() {
        return this.f8057feyxiexzfUjhhgtg / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f8090feyxiexzfUjhhgtg.f1527Ujhhgtgfeyxiexzf.f1509Ujhhgtgfeyxiexzf;
    }

    public float getThumbStrokeWidth() {
        return this.f8090feyxiexzfUjhhgtg.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getThumbTintList() {
        return this.f8090feyxiexzfUjhhgtg.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf;
    }

    public int getThumbTrackGapSize() {
        return this.f8060feyxiexzfUjhhgtg;
    }

    public int getThumbWidth() {
        return this.f8057feyxiexzfUjhhgtg;
    }

    public int getTickActiveRadius() {
        return this.f8077Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f8083feyxiexzfUjhhgtg;
    }

    public int getTickInactiveRadius() {
        return this.f8078Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f8084feyxiexzfUjhhgtg;
    }

    public ColorStateList getTickTintList() {
        if (this.f8084feyxiexzfUjhhgtg.equals(this.f8083feyxiexzfUjhhgtg)) {
            return this.f8083feyxiexzfUjhhgtg;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f8085Ujhhgtgfeyxiexzf;
    }

    public int getTrackHeight() {
        return this.f8055feyxiexzfUjhhgtg;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f8086Ujhhgtgfeyxiexzf;
    }

    public int getTrackInsideCornerSize() {
        return this.f8064feyxiexzfUjhhgtg;
    }

    public int getTrackSidePadding() {
        return this.f8056feyxiexzfUjhhgtg;
    }

    public int getTrackStopIndicatorSize() {
        return this.f8063feyxiexzfUjhhgtg;
    }

    public ColorStateList getTrackTintList() {
        if (this.f8086Ujhhgtgfeyxiexzf.equals(this.f8085Ujhhgtgfeyxiexzf)) {
            return this.f8085Ujhhgtgfeyxiexzf;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f8079feyxiexzfUjhhgtg;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f8069feyxiexzfUjhhgtg;
    }

    public float getValueTo() {
        return this.f8070feyxiexzfUjhhgtg;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f8071feyxiexzfUjhhgtg.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f8073Ujhhgtgfeyxiexzf = i;
        this.f8034Ujhhgtgfeyxiexzf.m5024Ujhhgtgfeyxiexzf(i);
        postInvalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setHaloRadius(int i) {
        if (i == this.f8059feyxiexzfUjhhgtg) {
            return;
        }
        this.f8059feyxiexzfUjhhgtg = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f8059feyxiexzfUjhhgtg);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f8082feyxiexzfUjhhgtg)) {
            return;
        }
        this.f8082feyxiexzfUjhhgtg = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iM3739Ujhhgtgfeyxiexzf = m3739Ujhhgtgfeyxiexzf(colorStateList);
        Paint paint = this.f8030Ujhhgtgfeyxiexzf;
        paint.setColor(iM3739Ujhhgtgfeyxiexzf);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setLabelBehavior(int i) {
        if (this.f8054feyxiexzfUjhhgtg != i) {
            this.f8054feyxiexzfUjhhgtg = i;
            requestLayout();
        }
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f8074Ujhhgtgfeyxiexzf != f) {
                this.f8074Ujhhgtgfeyxiexzf = f;
                this.f8081feyxiexzfUjhhgtg = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f8069feyxiexzfUjhhgtg + ")-valueTo(" + this.f8070feyxiexzfUjhhgtg + ") range");
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbElevation(float f) {
        this.f8090feyxiexzfUjhhgtg.m1368Ujhhgtgfeyxiexzf(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbHeight(int i) {
        if (i == this.f8058feyxiexzfUjhhgtg) {
            return;
        }
        this.f8058feyxiexzfUjhhgtg = i;
        this.f8090feyxiexzfUjhhgtg.setBounds(0, 0, this.f8057feyxiexzfUjhhgtg, i);
        Drawable drawable = this.f8091Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            m3732Ujhhgtgfeyxiexzf(drawable);
        }
        Iterator it = this.f8092Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            m3732Ujhhgtgfeyxiexzf((Drawable) it.next());
        }
        m3756feyxiexzfUjhhgtg();
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

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f8090feyxiexzfUjhhgtg.m1373Ujhhgtgfeyxiexzf(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
        }
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbStrokeWidth(float f) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f8090feyxiexzfUjhhgtg;
        c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = f;
        c0226Ujhhgtgfeyxiexzf.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f8090feyxiexzfUjhhgtg;
        if (colorStateList.equals(c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf)) {
            return;
        }
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateList);
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbTrackGapSize(int i) {
        if (this.f8060feyxiexzfUjhhgtg == i) {
            return;
        }
        this.f8060feyxiexzfUjhhgtg = i;
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setThumbWidth(int i) {
        if (i == this.f8057feyxiexzfUjhhgtg) {
            return;
        }
        this.f8057feyxiexzfUjhhgtg = i;
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg2 = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg3 = new C3382feyxiexzfUjhhgtg();
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg4 = new C3382feyxiexzfUjhhgtg();
        float f = this.f8057feyxiexzfUjhhgtg / 2.0f;
        AbstractC3612feyxiexzfUjhhgtg abstractC3612feyxiexzfUjhhgtgM5055Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5055Ujhhgtgfeyxiexzf(0);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf = new C2923Ujhhgtgfeyxiexzf(f);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf2 = new C2923Ujhhgtgfeyxiexzf(f);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf3 = new C2923Ujhhgtgfeyxiexzf(f);
        C2923Ujhhgtgfeyxiexzf c2923Ujhhgtgfeyxiexzf4 = new C2923Ujhhgtgfeyxiexzf(f);
        C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = new C1017feyxiexzfUjhhgtg();
        c1017feyxiexzfUjhhgtg.f3973Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtgM5055Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3974Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtgM5055Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3975Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtgM5055Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3976Ujhhgtgfeyxiexzf = abstractC3612feyxiexzfUjhhgtgM5055Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3977Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf;
        c1017feyxiexzfUjhhgtg.f3978Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf2;
        c1017feyxiexzfUjhhgtg.f3979Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf3;
        c1017feyxiexzfUjhhgtg.f3980Ujhhgtgfeyxiexzf = c2923Ujhhgtgfeyxiexzf4;
        c1017feyxiexzfUjhhgtg.f3981Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        c1017feyxiexzfUjhhgtg.f3982Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg2;
        c1017feyxiexzfUjhhgtg.f3983Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg3;
        c1017feyxiexzfUjhhgtg.f3984Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg4;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f8090feyxiexzfUjhhgtg;
        c0226Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
        c0226Ujhhgtgfeyxiexzf.setBounds(0, 0, this.f8057feyxiexzfUjhhgtg, this.f8058feyxiexzfUjhhgtg);
        Drawable drawable = this.f8091Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            m3732Ujhhgtgfeyxiexzf(drawable);
        }
        Iterator it = this.f8092Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            m3732Ujhhgtgfeyxiexzf((Drawable) it.next());
        }
        m3756feyxiexzfUjhhgtg();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTickActiveRadius(int i) {
        if (this.f8077Ujhhgtgfeyxiexzf != i) {
            this.f8077Ujhhgtgfeyxiexzf = i;
            this.f8032Ujhhgtgfeyxiexzf.setStrokeWidth(i * 2);
            m3756feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f8083feyxiexzfUjhhgtg)) {
            return;
        }
        this.f8083feyxiexzfUjhhgtg = colorStateList;
        this.f8032Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTickInactiveRadius(int i) {
        if (this.f8078Ujhhgtgfeyxiexzf != i) {
            this.f8078Ujhhgtgfeyxiexzf = i;
            this.f8031Ujhhgtgfeyxiexzf.setStrokeWidth(i * 2);
            m3756feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f8084feyxiexzfUjhhgtg)) {
            return;
        }
        this.f8084feyxiexzfUjhhgtg = colorStateList;
        this.f8031Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f8076Ujhhgtgfeyxiexzf != z) {
            this.f8076Ujhhgtgfeyxiexzf = z;
            postInvalidate();
        }
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f8085Ujhhgtgfeyxiexzf)) {
            return;
        }
        this.f8085Ujhhgtgfeyxiexzf = colorStateList;
        this.f8028Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(colorStateList));
        this.f8033Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(this.f8085Ujhhgtgfeyxiexzf));
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTrackHeight(int i) {
        if (this.f8055feyxiexzfUjhhgtg != i) {
            this.f8055feyxiexzfUjhhgtg = i;
            this.f8027Ujhhgtgfeyxiexzf.setStrokeWidth(i);
            this.f8028Ujhhgtgfeyxiexzf.setStrokeWidth(this.f8055feyxiexzfUjhhgtg);
            m3756feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f8086Ujhhgtgfeyxiexzf)) {
            return;
        }
        this.f8086Ujhhgtgfeyxiexzf = colorStateList;
        this.f8027Ujhhgtgfeyxiexzf.setColor(m3739Ujhhgtgfeyxiexzf(colorStateList));
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTrackInsideCornerSize(int i) {
        if (this.f8064feyxiexzfUjhhgtg == i) {
            return;
        }
        this.f8064feyxiexzfUjhhgtg = i;
        invalidate();
    }

    @Override // p000.AbstractC2475feyxiexzfUjhhgtg
    public void setTrackStopIndicatorSize(int i) {
        if (this.f8063feyxiexzfUjhhgtg == i) {
            return;
        }
        this.f8063feyxiexzfUjhhgtg = i;
        this.f8033Ujhhgtgfeyxiexzf.setStrokeWidth(i);
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
        this.f8069feyxiexzfUjhhgtg = f;
        this.f8081feyxiexzfUjhhgtg = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f8070feyxiexzfUjhhgtg = f;
        this.f8081feyxiexzfUjhhgtg = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m3732Ujhhgtgfeyxiexzf(drawableNewDrawable);
        this.f8091Ujhhgtgfeyxiexzf = drawableNewDrawable;
        this.f8092Ujhhgtgfeyxiexzf.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(InterfaceC0153Ujhhgtgfeyxiexzf interfaceC0153Ujhhgtgfeyxiexzf) {
    }
}
