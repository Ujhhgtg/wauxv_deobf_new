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
import p000.AbstractC0222;
import p000.AbstractC1095;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC1586;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC2646;
import p000.AbstractC3638;
import p000.C1681;
import p000.C1787;
import p000.C1933;
import p000.C1934;
import p000.C2737;
import p000.C2738;
import p000.InterfaceC1932;
import p000.InterfaceC2749;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AbstractC0222 implements Checkable, InterfaceC2749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final int[] f680 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final int[] f681 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1934 f682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC1932 f684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public PorterDuff.Mode f685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Drawable f687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f695;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f683 = new LinkedHashSet();
        this.f693 = false;
        this.f694 = false;
        Context context2 = getContext();
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context2, attributeSet, AbstractC2521.f7998, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f692 = typedArrayM4263.getDimensionPixelSize(12, 0);
        int i = typedArrayM4263.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f685 = AbstractC1471.m3403(i, mode);
        this.f686 = AbstractC1471.m3388(getContext(), typedArrayM4263, 14);
        this.f687 = AbstractC1471.m3390(getContext(), typedArrayM4263, 10);
        this.f695 = typedArrayM4263.getInteger(11, 1);
        this.f689 = typedArrayM4263.getDimensionPixelSize(13, 0);
        C1934 c1934 = new C1934(this, C2738.m4725(context2, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button).m4722());
        this.f682 = c1934;
        c1934.f6363 = typedArrayM4263.getDimensionPixelOffset(1, 0);
        c1934.f6364 = typedArrayM4263.getDimensionPixelOffset(2, 0);
        c1934.f6365 = typedArrayM4263.getDimensionPixelOffset(3, 0);
        c1934.f6366 = typedArrayM4263.getDimensionPixelOffset(4, 0);
        if (typedArrayM4263.hasValue(8)) {
            int dimensionPixelSize = typedArrayM4263.getDimensionPixelSize(8, -1);
            c1934.f6367 = dimensionPixelSize;
            C2737 c2737M4728 = c1934.f6362.m4728();
            c2737M4728.m4723(dimensionPixelSize);
            c1934.m3887(c2737M4728.m4722());
            c1934.f6376 = true;
        }
        c1934.f6368 = typedArrayM4263.getDimensionPixelSize(20, 0);
        c1934.f6369 = AbstractC1471.m3403(typedArrayM4263.getInt(7, -1), mode);
        c1934.f6370 = AbstractC1471.m3388(getContext(), typedArrayM4263, 6);
        c1934.f6371 = AbstractC1471.m3388(getContext(), typedArrayM4263, 19);
        c1934.f6372 = AbstractC1471.m3388(getContext(), typedArrayM4263, 16);
        c1934.f6377 = typedArrayM4263.getBoolean(5, false);
        c1934.f6380 = typedArrayM4263.getDimensionPixelSize(9, 0);
        c1934.f6378 = typedArrayM4263.getBoolean(21, true);
        Field field = AbstractC3638.f11333;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM4263.hasValue(0)) {
            c1934.f6375 = true;
            setSupportBackgroundTintList(c1934.f6370);
            setSupportBackgroundTintMode(c1934.f6369);
        } else {
            c1934.m3889();
        }
        setPaddingRelative(paddingStart + c1934.f6363, paddingTop + c1934.f6365, paddingEnd + c1934.f6364, paddingBottom + c1934.f6366);
        typedArrayM4263.recycle();
        setCompoundDrawablePadding(this.f692);
        m802(this.f687 != null);
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
        if (!TextUtils.isEmpty(this.f688)) {
            return this.f688;
        }
        C1934 c1934 = this.f682;
        return ((c1934 == null || !c1934.f6377) ? Button.class : CompoundButton.class).getName();
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
        if (m800()) {
            return this.f682.f6367;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f687;
    }

    public int getIconGravity() {
        return this.f695;
    }

    public int getIconPadding() {
        return this.f692;
    }

    public int getIconSize() {
        return this.f689;
    }

    public ColorStateList getIconTint() {
        return this.f686;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f685;
    }

    public int getInsetBottom() {
        return this.f682.f6366;
    }

    public int getInsetTop() {
        return this.f682.f6365;
    }

    public ColorStateList getRippleColor() {
        if (m800()) {
            return this.f682.f6372;
        }
        return null;
    }

    public C2738 getShapeAppearanceModel() {
        if (m800()) {
            return this.f682.f6362;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m800()) {
            return this.f682.f6371;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m800()) {
            return this.f682.f6368;
        }
        return 0;
    }

    @Override // p000.AbstractC0222
    public ColorStateList getSupportBackgroundTintList() {
        return m800() ? this.f682.f6370 : super.getSupportBackgroundTintList();
    }

    @Override // p000.AbstractC0222
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m800() ? this.f682.f6369 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f693;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m800()) {
            AbstractC1586.m3489(this, this.f682.m3886(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C1934 c1934 = this.f682;
        if (c1934 != null && c1934.f6377) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f680);
        }
        if (this.f693) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f681);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.AbstractC0222, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f693);
    }

    @Override // p000.AbstractC0222, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1934 c1934 = this.f682;
        accessibilityNodeInfo.setCheckable(c1934 != null && c1934.f6377);
        accessibilityNodeInfo.setChecked(this.f693);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.AbstractC0222, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m803(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1933)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1933 c1933 = (C1933) parcelable;
        super.onRestoreInstanceState(c1933.f1051);
        setChecked(c1933.f6360);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1933 c1933 = new C1933(super.onSaveInstanceState());
        c1933.f6360 = this.f693;
        return c1933;
    }

    @Override // p000.AbstractC0222, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m803(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f682.f6378) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f687 != null) {
            if (this.f687.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f688 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m800()) {
            super.setBackgroundColor(i);
            return;
        }
        C1934 c1934 = this.f682;
        if (c1934.m3886(false) != null) {
            c1934.m3886(false).setTint(i);
        }
    }

    @Override // p000.AbstractC0222, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m800()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1934 c1934 = this.f682;
        c1934.f6375 = true;
        MaterialButton materialButton = c1934.f6361;
        materialButton.setSupportBackgroundTintList(c1934.f6370);
        materialButton.setSupportBackgroundTintMode(c1934.f6369);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.AbstractC0222, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C1787.m3667(getContext(), i) : null);
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
        if (m800()) {
            this.f682.f6377 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C1934 c1934 = this.f682;
        if (c1934 == null || !c1934.f6377 || !isEnabled() || this.f693 == z) {
            return;
        }
        this.f693 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f693;
            if (!materialButtonToggleGroup.f702) {
                materialButtonToggleGroup.m805(getId(), z2);
            }
        }
        if (this.f694) {
            return;
        }
        this.f694 = true;
        Iterator it = this.f683.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
        this.f694 = false;
    }

    public void setCornerRadius(int i) {
        if (m800()) {
            C1934 c1934 = this.f682;
            if (c1934.f6376 && c1934.f6367 == i) {
                return;
            }
            c1934.f6367 = i;
            c1934.f6376 = true;
            C2737 c2737M4728 = c1934.f6362.m4728();
            c2737M4728.m4723(i);
            c1934.m3887(c2737M4728.m4722());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m800()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m800()) {
            this.f682.m3886(false).m3913(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f687 != drawable) {
            this.f687 = drawable;
            m802(true);
            m803(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f695 != i) {
            this.f695 = i;
            m803(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f692 != i) {
            this.f692 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C1787.m3667(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f689 != i) {
            this.f689 = i;
            m802(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f686 != colorStateList) {
            this.f686 = colorStateList;
            m802(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f685 != mode) {
            this.f685 = mode;
            m802(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC1469.m3333(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1934 c1934 = this.f682;
        c1934.m3888(c1934.f6365, i);
    }

    public void setInsetTop(int i) {
        C1934 c1934 = this.f682;
        c1934.m3888(i, c1934.f6366);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1932 interfaceC1932) {
        this.f684 = interfaceC1932;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1932 interfaceC1932 = this.f684;
        if (interfaceC1932 != null) {
            ((MaterialButtonToggleGroup) ((C1681) interfaceC1932).f5660).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m800()) {
            C1934 c1934 = this.f682;
            MaterialButton materialButton = c1934.f6361;
            if (c1934.f6372 != colorStateList) {
                c1934.f6372 = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC2646.m4619(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m800()) {
            setRippleColor(AbstractC1469.m3333(getContext(), i));
        }
    }

    @Override // p000.InterfaceC2749
    public void setShapeAppearanceModel(C2738 c2738) {
        if (!m800()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f682.m3887(c2738);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m800()) {
            C1934 c1934 = this.f682;
            c1934.f6374 = z;
            c1934.m3890();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m800()) {
            C1934 c1934 = this.f682;
            if (c1934.f6371 != colorStateList) {
                c1934.f6371 = colorStateList;
                c1934.m3890();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m800()) {
            setStrokeColor(AbstractC1469.m3333(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m800()) {
            C1934 c1934 = this.f682;
            if (c1934.f6368 != i) {
                c1934.f6368 = i;
                c1934.m3890();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m800()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.AbstractC0222
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m800()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1934 c1934 = this.f682;
        if (c1934.f6370 != colorStateList) {
            c1934.f6370 = colorStateList;
            if (c1934.m3886(false) != null) {
                c1934.m3886(false).setTintList(c1934.f6370);
            }
        }
    }

    @Override // p000.AbstractC0222
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m800()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1934 c1934 = this.f682;
        if (c1934.f6369 != mode) {
            c1934.f6369 = mode;
            if (c1934.m3886(false) == null || c1934.f6369 == null) {
                return;
            }
            c1934.m3886(false).setTintMode(c1934.f6369);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m803(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f682.f6378 = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f693);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m800() {
        C1934 c1934 = this.f682;
        return (c1934 == null || c1934.f6375) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m801() {
        int i = this.f695;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f687, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f687, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f687, null, null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m802(boolean z) {
        Drawable drawable = this.f687;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f687 = drawableMutate;
            drawableMutate.setTintList(this.f686);
            PorterDuff.Mode mode = this.f685;
            if (mode != null) {
                this.f687.setTintMode(mode);
            }
            int intrinsicWidth = this.f689;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f687.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f689;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f687.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f687;
            int i = this.f690;
            int i2 = this.f691;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f687.setVisible(true, z);
        }
        if (z) {
            m801();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f695;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f687) || (((i3 == 3 || i3 == 4) && drawable5 != this.f687) || ((i3 == 16 || i3 == 32) && drawable4 != this.f687))) {
            m801();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m803(int i, int i2) {
        if (this.f687 == null || getLayout() == null) {
            return;
        }
        int i3 = this.f695;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f690 = 0;
                if (i3 == 16) {
                    this.f691 = 0;
                    m802(false);
                    return;
                }
                int intrinsicHeight = this.f689;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f687.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f692) - getPaddingBottom()) / 2);
                if (this.f691 != iMax) {
                    this.f691 = iMax;
                    m802(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f691 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f695;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f690 = 0;
            m802(false);
            return;
        }
        int intrinsicWidth = this.f689;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f687.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        Field field = AbstractC3638.f11333;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f692) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f695 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f690 != paddingEnd) {
            this.f690 = paddingEnd;
            m802(false);
        }
    }
}
