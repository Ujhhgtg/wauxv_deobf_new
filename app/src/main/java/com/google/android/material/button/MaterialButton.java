package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0212;
import p000.AbstractC1194;
import p000.AbstractC1459;
import p000.AbstractC2203;
import p000.AbstractC2467;
import p000.AbstractC2589;
import p000.AbstractC2665;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.C0053;
import p000.C1744;
import p000.C1906;
import p000.C1907;
import p000.C2021;
import p000.C2677;
import p000.InterfaceC1905;
import p000.InterfaceC2688;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AbstractC0212 implements Checkable, InterfaceC2688 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final int[] f628 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final int[] f629 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1907 f630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final LinkedHashSet f631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InterfaceC1905 f632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public PorterDuff.Mode f633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ColorStateList f634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f635;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public String f636;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f640;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f643;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f631 = new LinkedHashSet();
        this.f641 = false;
        this.f642 = false;
        Context context2 = getContext();
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context2, attributeSet, AbstractC2467.f7849, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f640 = typedArrayM5082.getDimensionPixelSize(12, 0);
        int i = typedArrayM5082.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f633 = AbstractC1459.m3195(i, mode);
        this.f634 = AbstractC3453.m4995(getContext(), typedArrayM5082, 14);
        this.f635 = AbstractC3453.m4997(getContext(), typedArrayM5082, 10);
        this.f643 = typedArrayM5082.getInteger(11, 1);
        this.f637 = typedArrayM5082.getDimensionPixelSize(13, 0);
        C1907 c1907 = new C1907(this, C2677.m4688(context2, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button).m3876());
        this.f630 = c1907;
        c1907.f6284 = typedArrayM5082.getDimensionPixelOffset(1, 0);
        c1907.f6285 = typedArrayM5082.getDimensionPixelOffset(2, 0);
        c1907.f6286 = typedArrayM5082.getDimensionPixelOffset(3, 0);
        c1907.f6287 = typedArrayM5082.getDimensionPixelOffset(4, 0);
        if (typedArrayM5082.hasValue(8)) {
            int dimensionPixelSize = typedArrayM5082.getDimensionPixelSize(8, -1);
            c1907.f6288 = dimensionPixelSize;
            float f = dimensionPixelSize;
            C2021 c2021M4691 = c1907.f6283.m4691();
            c2021M4691.f6766 = new C0053(f);
            c2021M4691.f6767 = new C0053(f);
            c2021M4691.f6768 = new C0053(f);
            c2021M4691.f6769 = new C0053(f);
            c1907.m3703(c2021M4691.m3876());
            c1907.f6297 = true;
        }
        c1907.f6289 = typedArrayM5082.getDimensionPixelSize(20, 0);
        c1907.f6290 = AbstractC1459.m3195(typedArrayM5082.getInt(7, -1), mode);
        c1907.f6291 = AbstractC3453.m4995(getContext(), typedArrayM5082, 6);
        c1907.f6292 = AbstractC3453.m4995(getContext(), typedArrayM5082, 19);
        c1907.f6293 = AbstractC3453.m4995(getContext(), typedArrayM5082, 16);
        c1907.f6298 = typedArrayM5082.getBoolean(5, false);
        c1907.f6301 = typedArrayM5082.getDimensionPixelSize(9, 0);
        c1907.f6299 = typedArrayM5082.getBoolean(21, true);
        Field field = AbstractC3578.f11184;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM5082.hasValue(0)) {
            c1907.f6296 = true;
            setSupportBackgroundTintList(c1907.f6291);
            setSupportBackgroundTintMode(c1907.f6290);
        } else {
            c1907.m3705();
        }
        setPaddingRelative(paddingStart + c1907.f6284, paddingTop + c1907.f6286, paddingEnd + c1907.f6285, paddingBottom + c1907.f6287);
        typedArrayM5082.recycle();
        setCompoundDrawablePadding(this.f640);
        m659(this.f635 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f636)) {
            return this.f636;
        }
        C1907 c1907 = this.f630;
        return ((c1907 == null || !c1907.f6298) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m657()) {
            return this.f630.f6288;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f635;
    }

    public int getIconGravity() {
        return this.f643;
    }

    public int getIconPadding() {
        return this.f640;
    }

    public int getIconSize() {
        return this.f637;
    }

    public ColorStateList getIconTint() {
        return this.f634;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f633;
    }

    public int getInsetBottom() {
        return this.f630.f6287;
    }

    public int getInsetTop() {
        return this.f630.f6286;
    }

    public ColorStateList getRippleColor() {
        if (m657()) {
            return this.f630.f6293;
        }
        return null;
    }

    public C2677 getShapeAppearanceModel() {
        if (m657()) {
            return this.f630.f6283;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m657()) {
            return this.f630.f6292;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m657()) {
            return this.f630.f6289;
        }
        return 0;
    }

    @Override // p000.AbstractC0212
    public ColorStateList getSupportBackgroundTintList() {
        return m657() ? this.f630.f6291 : super.getSupportBackgroundTintList();
    }

    @Override // p000.AbstractC0212
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m657() ? this.f630.f6290 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f641;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m657()) {
            AbstractC3471.m5086(this, this.f630.m3702(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C1907 c1907 = this.f630;
        if (c1907 != null && c1907.f6298) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f628);
        }
        if (this.f641) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f629);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.AbstractC0212, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f641);
    }

    @Override // p000.AbstractC0212, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1907 c1907 = this.f630;
        accessibilityNodeInfo.setCheckable(c1907 != null && c1907.f6298);
        accessibilityNodeInfo.setChecked(this.f641);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.AbstractC0212, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m660(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1906)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1906 c1906 = (C1906) parcelable;
        super.onRestoreInstanceState(c1906.f986);
        setChecked(c1906.f6281);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1906 c1906 = new C1906(super.onSaveInstanceState());
        c1906.f6281 = this.f641;
        return c1906;
    }

    @Override // p000.AbstractC0212, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m660(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f630.f6299) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f635 != null) {
            if (this.f635.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f636 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m657()) {
            super.setBackgroundColor(i);
            return;
        }
        C1907 c1907 = this.f630;
        if (c1907.m3702(false) != null) {
            c1907.m3702(false).setTint(i);
        }
    }

    @Override // p000.AbstractC0212, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m657()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1907 c1907 = this.f630;
        c1907.f6296 = true;
        MaterialButton materialButton = c1907.f6282;
        materialButton.setSupportBackgroundTintList(c1907.f6291);
        materialButton.setSupportBackgroundTintMode(c1907.f6290);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.AbstractC0212, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC3471.m5076(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m657()) {
            this.f630.f6298 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C1907 c1907 = this.f630;
        if (c1907 == null || !c1907.f6298 || !isEnabled() || this.f641 == z) {
            return;
        }
        this.f641 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f641;
            if (!materialButtonToggleGroup.f650) {
                materialButtonToggleGroup.m662(getId(), z2);
            }
        }
        if (this.f642) {
            return;
        }
        this.f642 = true;
        Iterator it = this.f631.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
        this.f642 = false;
    }

    public void setCornerRadius(int i) {
        if (m657()) {
            C1907 c1907 = this.f630;
            if (c1907.f6297 && c1907.f6288 == i) {
                return;
            }
            c1907.f6288 = i;
            c1907.f6297 = true;
            float f = i;
            C2021 c2021M4691 = c1907.f6283.m4691();
            c2021M4691.f6766 = new C0053(f);
            c2021M4691.f6767 = new C0053(f);
            c2021M4691.f6768 = new C0053(f);
            c2021M4691.f6769 = new C0053(f);
            c1907.m3703(c2021M4691.m3876());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m657()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m657()) {
            this.f630.m3702(false).m3715(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f635 != drawable) {
            this.f635 = drawable;
            m659(true);
            m660(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f643 != i) {
            this.f643 = i;
            m660(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f640 != i) {
            this.f640 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC3471.m5076(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f637 != i) {
            this.f637 = i;
            m659(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f634 != colorStateList) {
            this.f634 = colorStateList;
            m659(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f633 != mode) {
            this.f633 = mode;
            m659(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC2203.m4030(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1907 c1907 = this.f630;
        c1907.m3704(c1907.f6286, i);
    }

    public void setInsetTop(int i) {
        C1907 c1907 = this.f630;
        c1907.m3704(i, c1907.f6287);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1905 interfaceC1905) {
        this.f632 = interfaceC1905;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1905 interfaceC1905 = this.f632;
        if (interfaceC1905 != null) {
            ((MaterialButtonToggleGroup) ((C1744) interfaceC1905).f5843).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m657()) {
            C1907 c1907 = this.f630;
            MaterialButton materialButton = c1907.f6282;
            if (c1907.f6293 != colorStateList) {
                c1907.f6293 = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC2589.m4597(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m657()) {
            setRippleColor(AbstractC2203.m4030(getContext(), i));
        }
    }

    @Override // p000.InterfaceC2688
    public void setShapeAppearanceModel(C2677 c2677) {
        if (!m657()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f630.m3703(c2677);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m657()) {
            C1907 c1907 = this.f630;
            c1907.f6295 = z;
            c1907.m3706();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m657()) {
            C1907 c1907 = this.f630;
            if (c1907.f6292 != colorStateList) {
                c1907.f6292 = colorStateList;
                c1907.m3706();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m657()) {
            setStrokeColor(AbstractC2203.m4030(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m657()) {
            C1907 c1907 = this.f630;
            if (c1907.f6289 != i) {
                c1907.f6289 = i;
                c1907.m3706();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m657()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.AbstractC0212
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m657()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1907 c1907 = this.f630;
        if (c1907.f6291 != colorStateList) {
            c1907.f6291 = colorStateList;
            if (c1907.m3702(false) != null) {
                c1907.m3702(false).setTintList(c1907.f6291);
            }
        }
    }

    @Override // p000.AbstractC0212
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m657()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1907 c1907 = this.f630;
        if (c1907.f6290 != mode) {
            c1907.f6290 = mode;
            if (c1907.m3702(false) == null || c1907.f6290 == null) {
                return;
            }
            c1907.m3702(false).setTintMode(c1907.f6290);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m660(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f630.f6299 = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f641);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m657() {
        C1907 c1907 = this.f630;
        return (c1907 == null || c1907.f6296) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m658() {
        int i = this.f643;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f635, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f635, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f635, null, null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m659(boolean z) {
        Drawable drawable = this.f635;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f635 = drawableMutate;
            drawableMutate.setTintList(this.f634);
            PorterDuff.Mode mode = this.f633;
            if (mode != null) {
                this.f635.setTintMode(mode);
            }
            int intrinsicWidth = this.f637;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f635.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f637;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f635.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f635;
            int i = this.f638;
            int i2 = this.f639;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f635.setVisible(true, z);
        }
        if (z) {
            m658();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f643;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f635) || (((i3 == 3 || i3 == 4) && drawable5 != this.f635) || ((i3 == 16 || i3 == 32) && drawable4 != this.f635))) {
            m658();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m660(int i, int i2) {
        if (this.f635 == null || getLayout() == null) {
            return;
        }
        int i3 = this.f643;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f638 = 0;
                if (i3 == 16) {
                    this.f639 = 0;
                    m659(false);
                    return;
                }
                int intrinsicHeight = this.f637;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f635.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f640) - getPaddingBottom()) / 2);
                if (this.f639 != iMax) {
                    this.f639 = iMax;
                    m659(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f639 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f643;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f638 = 0;
            m659(false);
            return;
        }
        int intrinsicWidth = this.f637;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f635.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        Field field = AbstractC3578.f11184;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f640) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f643 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f638 != paddingEnd) {
            this.f638 = paddingEnd;
            m659(false);
        }
    }
}
