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
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0925feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC2360Ujhhgtgfeyxiexzf;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0189Ujhhgtgfeyxiexzf;
import p000.C0192Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C1014feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.InterfaceC0190Ujhhgtgfeyxiexzf;
import p000.InterfaceC1006feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AbstractC2360Ujhhgtgfeyxiexzf implements Checkable, InterfaceC1006feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final int[] f694Ujhhgtgfeyxiexzf = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final int[] f695Ujhhgtgfeyxiexzf = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0192Ujhhgtgfeyxiexzf f696Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet f697Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public InterfaceC0190Ujhhgtgfeyxiexzf f698Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public PorterDuff.Mode f699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList f700Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Drawable f701Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public String f702Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f703Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f707Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f709Ujhhgtgfeyxiexzf;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f697Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f707Ujhhgtgfeyxiexzf = false;
        this.f708Ujhhgtgfeyxiexzf = false;
        Context context2 = getContext();
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context2, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3129Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f706Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(12, 0);
        int i = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f699Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(i, mode);
        this.f700Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 14);
        this.f701Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 10);
        this.f709Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getInteger(11, 1);
        this.f703Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(13, 0);
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = new C0192Ujhhgtgfeyxiexzf(this, C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context2, attributeSet, me.hd.wauxv.R.attr.materialButtonStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Button).m2507Ujhhgtgfeyxiexzf());
        this.f696Ujhhgtgfeyxiexzf = c0192Ujhhgtgfeyxiexzf;
        c0192Ujhhgtgfeyxiexzf.f1401Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(1, 0);
        c0192Ujhhgtgfeyxiexzf.f1402Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(2, 0);
        c0192Ujhhgtgfeyxiexzf.f1403Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(3, 0);
        c0192Ujhhgtgfeyxiexzf.f1404Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(4, 0);
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(8)) {
            int dimensionPixelSize = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(8, -1);
            c0192Ujhhgtgfeyxiexzf.f1405Ujhhgtgfeyxiexzf = dimensionPixelSize;
            C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0192Ujhhgtgfeyxiexzf.f1400Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(dimensionPixelSize);
            c0192Ujhhgtgfeyxiexzf.m1254Ujhhgtgfeyxiexzf(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
            c0192Ujhhgtgfeyxiexzf.f1414Ujhhgtgfeyxiexzf = true;
        }
        c0192Ujhhgtgfeyxiexzf.f1406Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(20, 0);
        c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArrayM2740Ujhhgtgfeyxiexzf.getInt(7, -1), mode);
        c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 6);
        c0192Ujhhgtgfeyxiexzf.f1409Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 19);
        c0192Ujhhgtgfeyxiexzf.f1410Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 16);
        c0192Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(5, false);
        c0192Ujhhgtgfeyxiexzf.f1418Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(9, 0);
        c0192Ujhhgtgfeyxiexzf.f1416Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(21, true);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(0)) {
            c0192Ujhhgtgfeyxiexzf.f1413Ujhhgtgfeyxiexzf = true;
            setSupportBackgroundTintList(c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf);
            setSupportBackgroundTintMode(c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf);
        } else {
            c0192Ujhhgtgfeyxiexzf.m1256Ujhhgtgfeyxiexzf();
        }
        setPaddingRelative(paddingStart + c0192Ujhhgtgfeyxiexzf.f1401Ujhhgtgfeyxiexzf, paddingTop + c0192Ujhhgtgfeyxiexzf.f1403Ujhhgtgfeyxiexzf, paddingEnd + c0192Ujhhgtgfeyxiexzf.f1402Ujhhgtgfeyxiexzf, paddingBottom + c0192Ujhhgtgfeyxiexzf.f1404Ujhhgtgfeyxiexzf);
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        setCompoundDrawablePadding(this.f706Ujhhgtgfeyxiexzf);
        m801Ujhhgtgfeyxiexzf(this.f701Ujhhgtgfeyxiexzf != null);
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
        if (!TextUtils.isEmpty(this.f702Ujhhgtgfeyxiexzf)) {
            return this.f702Ujhhgtgfeyxiexzf;
        }
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        return ((c0192Ujhhgtgfeyxiexzf == null || !c0192Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf) ? Button.class : CompoundButton.class).getName();
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
        if (m799Ujhhgtgfeyxiexzf()) {
            return this.f696Ujhhgtgfeyxiexzf.f1405Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f701Ujhhgtgfeyxiexzf;
    }

    public int getIconGravity() {
        return this.f709Ujhhgtgfeyxiexzf;
    }

    public int getIconPadding() {
        return this.f706Ujhhgtgfeyxiexzf;
    }

    public int getIconSize() {
        return this.f703Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getIconTint() {
        return this.f700Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f699Ujhhgtgfeyxiexzf;
    }

    public int getInsetBottom() {
        return this.f696Ujhhgtgfeyxiexzf.f1404Ujhhgtgfeyxiexzf;
    }

    public int getInsetTop() {
        return this.f696Ujhhgtgfeyxiexzf.f1403Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getRippleColor() {
        if (m799Ujhhgtgfeyxiexzf()) {
            return this.f696Ujhhgtgfeyxiexzf.f1410Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public C1017feyxiexzfUjhhgtg getShapeAppearanceModel() {
        if (m799Ujhhgtgfeyxiexzf()) {
            return this.f696Ujhhgtgfeyxiexzf.f1400Ujhhgtgfeyxiexzf;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m799Ujhhgtgfeyxiexzf()) {
            return this.f696Ujhhgtgfeyxiexzf.f1409Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m799Ujhhgtgfeyxiexzf()) {
            return this.f696Ujhhgtgfeyxiexzf.f1406Ujhhgtgfeyxiexzf;
        }
        return 0;
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf
    public ColorStateList getSupportBackgroundTintList() {
        return m799Ujhhgtgfeyxiexzf() ? this.f696Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf : super.getSupportBackgroundTintList();
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m799Ujhhgtgfeyxiexzf() ? this.f696Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f707Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m799Ujhhgtgfeyxiexzf()) {
            AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, this.f696Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        if (c0192Ujhhgtgfeyxiexzf != null && c0192Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f694Ujhhgtgfeyxiexzf);
        }
        if (this.f707Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f695Ujhhgtgfeyxiexzf);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f707Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        accessibilityNodeInfo.setCheckable(c0192Ujhhgtgfeyxiexzf != null && c0192Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf);
        accessibilityNodeInfo.setChecked(this.f707Ujhhgtgfeyxiexzf);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m802Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0189Ujhhgtgfeyxiexzf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0189Ujhhgtgfeyxiexzf c0189Ujhhgtgfeyxiexzf = (C0189Ujhhgtgfeyxiexzf) parcelable;
        super.onRestoreInstanceState(c0189Ujhhgtgfeyxiexzf.f9210Ujhhgtgfeyxiexzf);
        setChecked(c0189Ujhhgtgfeyxiexzf.f1397Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0189Ujhhgtgfeyxiexzf c0189Ujhhgtgfeyxiexzf = new C0189Ujhhgtgfeyxiexzf(super.onSaveInstanceState());
        c0189Ujhhgtgfeyxiexzf.f1397Ujhhgtgfeyxiexzf = this.f707Ujhhgtgfeyxiexzf;
        return c0189Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m802Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f696Ujhhgtgfeyxiexzf.f1416Ujhhgtgfeyxiexzf) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f701Ujhhgtgfeyxiexzf != null) {
            if (this.f701Ujhhgtgfeyxiexzf.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f702Ujhhgtgfeyxiexzf = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m799Ujhhgtgfeyxiexzf()) {
            super.setBackgroundColor(i);
            return;
        }
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        if (c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false) != null) {
            c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false).setTint(i);
        }
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m799Ujhhgtgfeyxiexzf()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        c0192Ujhhgtgfeyxiexzf.f1413Ujhhgtgfeyxiexzf = true;
        MaterialButton materialButton = c0192Ujhhgtgfeyxiexzf.f1399Ujhhgtgfeyxiexzf;
        materialButton.setSupportBackgroundTintList(c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf);
        materialButton.setSupportBackgroundTintMode(c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i) : null);
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
        if (m799Ujhhgtgfeyxiexzf()) {
            this.f696Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        if (c0192Ujhhgtgfeyxiexzf == null || !c0192Ujhhgtgfeyxiexzf.f1415Ujhhgtgfeyxiexzf || !isEnabled() || this.f707Ujhhgtgfeyxiexzf == z) {
            return;
        }
        this.f707Ujhhgtgfeyxiexzf = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f707Ujhhgtgfeyxiexzf;
            if (!materialButtonToggleGroup.f716Ujhhgtgfeyxiexzf) {
                materialButtonToggleGroup.m804Ujhhgtgfeyxiexzf(getId(), z2);
            }
        }
        if (this.f708Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f708Ujhhgtgfeyxiexzf = true;
        Iterator it = this.f697Ujhhgtgfeyxiexzf.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
        this.f708Ujhhgtgfeyxiexzf = false;
    }

    public void setCornerRadius(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
            if (c0192Ujhhgtgfeyxiexzf.f1414Ujhhgtgfeyxiexzf && c0192Ujhhgtgfeyxiexzf.f1405Ujhhgtgfeyxiexzf == i) {
                return;
            }
            c0192Ujhhgtgfeyxiexzf.f1405Ujhhgtgfeyxiexzf = i;
            c0192Ujhhgtgfeyxiexzf.f1414Ujhhgtgfeyxiexzf = true;
            C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0192Ujhhgtgfeyxiexzf.f1400Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
            c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(i);
            c0192Ujhhgtgfeyxiexzf.m1254Ujhhgtgfeyxiexzf(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m799Ujhhgtgfeyxiexzf()) {
            this.f696Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false).m1368Ujhhgtgfeyxiexzf(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f701Ujhhgtgfeyxiexzf != drawable) {
            this.f701Ujhhgtgfeyxiexzf = drawable;
            m801Ujhhgtgfeyxiexzf(true);
            m802Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f709Ujhhgtgfeyxiexzf != i) {
            this.f709Ujhhgtgfeyxiexzf = i;
            m802Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f706Ujhhgtgfeyxiexzf != i) {
            this.f706Ujhhgtgfeyxiexzf = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f703Ujhhgtgfeyxiexzf != i) {
            this.f703Ujhhgtgfeyxiexzf = i;
            m801Ujhhgtgfeyxiexzf(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f700Ujhhgtgfeyxiexzf != colorStateList) {
            this.f700Ujhhgtgfeyxiexzf = colorStateList;
            m801Ujhhgtgfeyxiexzf(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f699Ujhhgtgfeyxiexzf != mode) {
            this.f699Ujhhgtgfeyxiexzf = mode;
            m801Ujhhgtgfeyxiexzf(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        c0192Ujhhgtgfeyxiexzf.m1255Ujhhgtgfeyxiexzf(c0192Ujhhgtgfeyxiexzf.f1403Ujhhgtgfeyxiexzf, i);
    }

    public void setInsetTop(int i) {
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        c0192Ujhhgtgfeyxiexzf.m1255Ujhhgtgfeyxiexzf(i, c0192Ujhhgtgfeyxiexzf.f1404Ujhhgtgfeyxiexzf);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0190Ujhhgtgfeyxiexzf interfaceC0190Ujhhgtgfeyxiexzf) {
        this.f698Ujhhgtgfeyxiexzf = interfaceC0190Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0190Ujhhgtgfeyxiexzf interfaceC0190Ujhhgtgfeyxiexzf = this.f698Ujhhgtgfeyxiexzf;
        if (interfaceC0190Ujhhgtgfeyxiexzf != null) {
            ((MaterialButtonToggleGroup) ((C0709Ujhhgtgfeyxiexzf) interfaceC0190Ujhhgtgfeyxiexzf).f2944Ujhhgtgfeyxiexzf).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m799Ujhhgtgfeyxiexzf()) {
            C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
            MaterialButton materialButton = c0192Ujhhgtgfeyxiexzf.f1399Ujhhgtgfeyxiexzf;
            if (c0192Ujhhgtgfeyxiexzf.f1410Ujhhgtgfeyxiexzf != colorStateList) {
                c0192Ujhhgtgfeyxiexzf.f1410Ujhhgtgfeyxiexzf = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0925feyxiexzfUjhhgtg.m2425Ujhhgtgfeyxiexzf(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            setRippleColor(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
        }
    }

    @Override // p000.InterfaceC1006feyxiexzfUjhhgtg
    public void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        if (!m799Ujhhgtgfeyxiexzf()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f696Ujhhgtgfeyxiexzf.m1254Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m799Ujhhgtgfeyxiexzf()) {
            C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
            c0192Ujhhgtgfeyxiexzf.f1412Ujhhgtgfeyxiexzf = z;
            c0192Ujhhgtgfeyxiexzf.m1257Ujhhgtgfeyxiexzf();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m799Ujhhgtgfeyxiexzf()) {
            C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
            if (c0192Ujhhgtgfeyxiexzf.f1409Ujhhgtgfeyxiexzf != colorStateList) {
                c0192Ujhhgtgfeyxiexzf.f1409Ujhhgtgfeyxiexzf = colorStateList;
                c0192Ujhhgtgfeyxiexzf.m1257Ujhhgtgfeyxiexzf();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            setStrokeColor(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
            if (c0192Ujhhgtgfeyxiexzf.f1406Ujhhgtgfeyxiexzf != i) {
                c0192Ujhhgtgfeyxiexzf.f1406Ujhhgtgfeyxiexzf = i;
                c0192Ujhhgtgfeyxiexzf.m1257Ujhhgtgfeyxiexzf();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m799Ujhhgtgfeyxiexzf()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m799Ujhhgtgfeyxiexzf()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        if (c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf != colorStateList) {
            c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf = colorStateList;
            if (c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false) != null) {
                c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false).setTintList(c0192Ujhhgtgfeyxiexzf.f1408Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // p000.AbstractC2360Ujhhgtgfeyxiexzf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m799Ujhhgtgfeyxiexzf()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        if (c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf != mode) {
            c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf = mode;
            if (c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false) == null || c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf == null) {
                return;
            }
            c0192Ujhhgtgfeyxiexzf.m1253Ujhhgtgfeyxiexzf(false).setTintMode(c0192Ujhhgtgfeyxiexzf.f1407Ujhhgtgfeyxiexzf);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m802Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f696Ujhhgtgfeyxiexzf.f1416Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f707Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m799Ujhhgtgfeyxiexzf() {
        C0192Ujhhgtgfeyxiexzf c0192Ujhhgtgfeyxiexzf = this.f696Ujhhgtgfeyxiexzf;
        return (c0192Ujhhgtgfeyxiexzf == null || c0192Ujhhgtgfeyxiexzf.f1413Ujhhgtgfeyxiexzf) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m800Ujhhgtgfeyxiexzf() {
        int i = this.f709Ujhhgtgfeyxiexzf;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f701Ujhhgtgfeyxiexzf, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f701Ujhhgtgfeyxiexzf, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f701Ujhhgtgfeyxiexzf, null, null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m801Ujhhgtgfeyxiexzf(boolean z) {
        Drawable drawable = this.f701Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f701Ujhhgtgfeyxiexzf = drawableMutate;
            drawableMutate.setTintList(this.f700Ujhhgtgfeyxiexzf);
            PorterDuff.Mode mode = this.f699Ujhhgtgfeyxiexzf;
            if (mode != null) {
                this.f701Ujhhgtgfeyxiexzf.setTintMode(mode);
            }
            int intrinsicWidth = this.f703Ujhhgtgfeyxiexzf;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f701Ujhhgtgfeyxiexzf.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f703Ujhhgtgfeyxiexzf;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f701Ujhhgtgfeyxiexzf.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f701Ujhhgtgfeyxiexzf;
            int i = this.f704Ujhhgtgfeyxiexzf;
            int i2 = this.f705Ujhhgtgfeyxiexzf;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f701Ujhhgtgfeyxiexzf.setVisible(true, z);
        }
        if (z) {
            m800Ujhhgtgfeyxiexzf();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f709Ujhhgtgfeyxiexzf;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f701Ujhhgtgfeyxiexzf) || (((i3 == 3 || i3 == 4) && drawable5 != this.f701Ujhhgtgfeyxiexzf) || ((i3 == 16 || i3 == 32) && drawable4 != this.f701Ujhhgtgfeyxiexzf))) {
            m800Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m802Ujhhgtgfeyxiexzf(int i, int i2) {
        if (this.f701Ujhhgtgfeyxiexzf == null || getLayout() == null) {
            return;
        }
        int i3 = this.f709Ujhhgtgfeyxiexzf;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f704Ujhhgtgfeyxiexzf = 0;
                if (i3 == 16) {
                    this.f705Ujhhgtgfeyxiexzf = 0;
                    m801Ujhhgtgfeyxiexzf(false);
                    return;
                }
                int intrinsicHeight = this.f703Ujhhgtgfeyxiexzf;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f701Ujhhgtgfeyxiexzf.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f706Ujhhgtgfeyxiexzf) - getPaddingBottom()) / 2);
                if (this.f705Ujhhgtgfeyxiexzf != iMax) {
                    this.f705Ujhhgtgfeyxiexzf = iMax;
                    m801Ujhhgtgfeyxiexzf(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f705Ujhhgtgfeyxiexzf = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f709Ujhhgtgfeyxiexzf;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f704Ujhhgtgfeyxiexzf = 0;
            m801Ujhhgtgfeyxiexzf(false);
            return;
        }
        int intrinsicWidth = this.f703Ujhhgtgfeyxiexzf;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f701Ujhhgtgfeyxiexzf.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f706Ujhhgtgfeyxiexzf) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f709Ujhhgtgfeyxiexzf == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f704Ujhhgtgfeyxiexzf != paddingEnd) {
            this.f704Ujhhgtgfeyxiexzf = paddingEnd;
            m801Ujhhgtgfeyxiexzf(false);
        }
    }
}
