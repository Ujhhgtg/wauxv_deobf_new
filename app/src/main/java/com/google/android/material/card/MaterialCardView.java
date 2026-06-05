package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0925feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC2777Ujhhgtgfeyxiexzf;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0197Ujhhgtgfeyxiexzf;
import p000.C0226Ujhhgtgfeyxiexzf;
import p000.C1014feyxiexzfUjhhgtg;
import p000.C1017feyxiexzfUjhhgtg;
import p000.InterfaceC0195Ujhhgtgfeyxiexzf;
import p000.InterfaceC1006feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends AbstractC2777Ujhhgtgfeyxiexzf implements Checkable, InterfaceC1006feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final int[] f721Ujhhgtgfeyxiexzf = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final int[] f722Ujhhgtgfeyxiexzf = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final int[] f723Ujhhgtgfeyxiexzf = {me.hd.wauxv.R.attr.state_dragged};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0197Ujhhgtgfeyxiexzf f724Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean f725Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f726Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f727Ujhhgtgfeyxiexzf;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.f726Ujhhgtgfeyxiexzf = false;
        this.f727Ujhhgtgfeyxiexzf = false;
        this.f725Ujhhgtgfeyxiexzf = true;
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(getContext(), attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3131Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = new C0197Ujhhgtgfeyxiexzf(this, attributeSet);
        this.f724Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf;
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(cardBackgroundColor);
        c0197Ujhhgtgfeyxiexzf.f1426Ujhhgtgfeyxiexzf.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c0197Ujhhgtgfeyxiexzf.m1270Ujhhgtgfeyxiexzf();
        MaterialCardView materialCardView = c0197Ujhhgtgfeyxiexzf.f1425Ujhhgtgfeyxiexzf;
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(materialCardView.getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 11);
        c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf = colorStateListM4561Ujhhgtgfeyxiexzf;
        if (colorStateListM4561Ujhhgtgfeyxiexzf == null) {
            c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf = ColorStateList.valueOf(-1);
        }
        c0197Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(12, 0);
        boolean z = typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(0, false);
        c0197Ujhhgtgfeyxiexzf.f1443Ujhhgtgfeyxiexzf = z;
        materialCardView.setLongClickable(z);
        c0197Ujhhgtgfeyxiexzf.f1436Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(materialCardView.getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 6);
        c0197Ujhhgtgfeyxiexzf.m1265Ujhhgtgfeyxiexzf(AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(materialCardView.getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 2));
        c0197Ujhhgtgfeyxiexzf.f1430Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(5, 0);
        c0197Ujhhgtgfeyxiexzf.f1429Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(4, 0);
        c0197Ujhhgtgfeyxiexzf.f1431Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getInteger(3, 8388661);
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(materialCardView.getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 7);
        c0197Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf = colorStateListM4561Ujhhgtgfeyxiexzf2;
        if (colorStateListM4561Ujhhgtgfeyxiexzf2 == null) {
            c0197Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf = ColorStateList.valueOf(AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(materialCardView, me.hd.wauxv.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf3 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(materialCardView.getContext(), typedArrayM2740Ujhhgtgfeyxiexzf, 1);
        colorStateListM4561Ujhhgtgfeyxiexzf3 = colorStateListM4561Ujhhgtgfeyxiexzf3 == null ? ColorStateList.valueOf(0) : colorStateListM4561Ujhhgtgfeyxiexzf3;
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = c0197Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf;
        c0226Ujhhgtgfeyxiexzf2.m1369Ujhhgtgfeyxiexzf(colorStateListM4561Ujhhgtgfeyxiexzf3);
        int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        RippleDrawable rippleDrawable = c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c0197Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf);
        }
        c0226Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(materialCardView.getCardElevation());
        float f = c0197Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList = c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf;
        c0226Ujhhgtgfeyxiexzf2.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = f;
        c0226Ujhhgtgfeyxiexzf2.invalidateSelf();
        c0226Ujhhgtgfeyxiexzf2.m1373Ujhhgtgfeyxiexzf(colorStateList);
        materialCardView.setBackgroundInternal(c0197Ujhhgtgfeyxiexzf.m1262Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf));
        Drawable drawableM1261Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.m1268Ujhhgtgfeyxiexzf() ? c0197Ujhhgtgfeyxiexzf.m1261Ujhhgtgfeyxiexzf() : c0226Ujhhgtgfeyxiexzf2;
        c0197Ujhhgtgfeyxiexzf.f1433Ujhhgtgfeyxiexzf = drawableM1261Ujhhgtgfeyxiexzf;
        materialCardView.setForeground(c0197Ujhhgtgfeyxiexzf.m1262Ujhhgtgfeyxiexzf(drawableM1261Ujhhgtgfeyxiexzf));
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.getBounds());
        return rectF;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public ColorStateList getCardBackgroundColor() {
        return this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f724Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1508Ujhhgtgfeyxiexzf;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f724Ujhhgtgfeyxiexzf.f1434Ujhhgtgfeyxiexzf;
    }

    public int getCheckedIconGravity() {
        return this.f724Ujhhgtgfeyxiexzf.f1431Ujhhgtgfeyxiexzf;
    }

    public int getCheckedIconMargin() {
        return this.f724Ujhhgtgfeyxiexzf.f1429Ujhhgtgfeyxiexzf;
    }

    public int getCheckedIconSize() {
        return this.f724Ujhhgtgfeyxiexzf.f1430Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f724Ujhhgtgfeyxiexzf.f1436Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public int getContentPaddingBottom() {
        return this.f724Ujhhgtgfeyxiexzf.f1426Ujhhgtgfeyxiexzf.bottom;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public int getContentPaddingLeft() {
        return this.f724Ujhhgtgfeyxiexzf.f1426Ujhhgtgfeyxiexzf.left;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public int getContentPaddingRight() {
        return this.f724Ujhhgtgfeyxiexzf.f1426Ujhhgtgfeyxiexzf.right;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public int getContentPaddingTop() {
        return this.f724Ujhhgtgfeyxiexzf.f1426Ujhhgtgfeyxiexzf.top;
    }

    public float getProgress() {
        return this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1514Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public float getRadius() {
        return this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.m1365Ujhhgtgfeyxiexzf();
    }

    public ColorStateList getRippleColor() {
        return this.f724Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf;
    }

    public C1017feyxiexzfUjhhgtg getShapeAppearanceModel() {
        return this.f724Ujhhgtgfeyxiexzf.f1437Ujhhgtgfeyxiexzf;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f724Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f724Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf;
    }

    public int getStrokeWidth() {
        return this.f724Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f726Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.m1269Ujhhgtgfeyxiexzf();
        AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, c0197Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (c0197Ujhhgtgfeyxiexzf != null && c0197Ujhhgtgfeyxiexzf.f1443Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f721Ujhhgtgfeyxiexzf);
        }
        if (this.f726Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f722Ujhhgtgfeyxiexzf);
        }
        if (this.f727Ujhhgtgfeyxiexzf) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f723Ujhhgtgfeyxiexzf);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f726Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        accessibilityNodeInfo.setCheckable(c0197Ujhhgtgfeyxiexzf != null && c0197Ujhhgtgfeyxiexzf.f1443Ujhhgtgfeyxiexzf);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f726Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f724Ujhhgtgfeyxiexzf.m1263Ujhhgtgfeyxiexzf(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f725Ujhhgtgfeyxiexzf) {
            C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
            if (!c0197Ujhhgtgfeyxiexzf.f1442Ujhhgtgfeyxiexzf) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c0197Ujhhgtgfeyxiexzf.f1442Ujhhgtgfeyxiexzf = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setCardBackgroundColor(int i) {
        this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(i));
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(c0197Ujhhgtgfeyxiexzf.f1425Ujhhgtgfeyxiexzf.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f724Ujhhgtgfeyxiexzf.f1443Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f726Ujhhgtgfeyxiexzf != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f724Ujhhgtgfeyxiexzf.m1265Ujhhgtgfeyxiexzf(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (c0197Ujhhgtgfeyxiexzf.f1431Ujhhgtgfeyxiexzf != i) {
            c0197Ujhhgtgfeyxiexzf.f1431Ujhhgtgfeyxiexzf = i;
            MaterialCardView materialCardView = c0197Ujhhgtgfeyxiexzf.f1425Ujhhgtgfeyxiexzf;
            c0197Ujhhgtgfeyxiexzf.m1263Ujhhgtgfeyxiexzf(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f724Ujhhgtgfeyxiexzf.f1429Ujhhgtgfeyxiexzf = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f724Ujhhgtgfeyxiexzf.f1429Ujhhgtgfeyxiexzf = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f724Ujhhgtgfeyxiexzf.m1265Ujhhgtgfeyxiexzf(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f724Ujhhgtgfeyxiexzf.f1430Ujhhgtgfeyxiexzf = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f724Ujhhgtgfeyxiexzf.f1430Ujhhgtgfeyxiexzf = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.f1436Ujhhgtgfeyxiexzf = colorStateList;
        Drawable drawable = c0197Ujhhgtgfeyxiexzf.f1434Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (c0197Ujhhgtgfeyxiexzf != null) {
            c0197Ujhhgtgfeyxiexzf.m1269Ujhhgtgfeyxiexzf();
        }
    }

    public void setDragged(boolean z) {
        if (this.f727Ujhhgtgfeyxiexzf != z) {
            this.f727Ujhhgtgfeyxiexzf = z;
            refreshDrawableState();
            m808Ujhhgtgfeyxiexzf();
            invalidate();
        }
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f724Ujhhgtgfeyxiexzf.m1271Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.m1271Ujhhgtgfeyxiexzf();
        c0197Ujhhgtgfeyxiexzf.m1270Ujhhgtgfeyxiexzf();
    }

    public void setProgress(float f) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.m1370Ujhhgtgfeyxiexzf(f);
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf;
        if (c0226Ujhhgtgfeyxiexzf != null) {
            c0226Ujhhgtgfeyxiexzf.m1370Ujhhgtgfeyxiexzf(f);
        }
        C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf2 = c0197Ujhhgtgfeyxiexzf.f1441Ujhhgtgfeyxiexzf;
        if (c0226Ujhhgtgfeyxiexzf2 != null) {
            c0226Ujhhgtgfeyxiexzf2.m1370Ujhhgtgfeyxiexzf(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setRadius(float f) {
        super.setRadius(f);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        C1014feyxiexzfUjhhgtg c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1437Ujhhgtgfeyxiexzf.m2514Ujhhgtgfeyxiexzf();
        c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2508Ujhhgtgfeyxiexzf(f);
        c0197Ujhhgtgfeyxiexzf.m1266Ujhhgtgfeyxiexzf(c1014feyxiexzfUjhhgtgM2514Ujhhgtgfeyxiexzf.m2507Ujhhgtgfeyxiexzf());
        c0197Ujhhgtgfeyxiexzf.f1433Ujhhgtgfeyxiexzf.invalidateSelf();
        if (c0197Ujhhgtgfeyxiexzf.m1267Ujhhgtgfeyxiexzf()) {
            c0197Ujhhgtgfeyxiexzf.m1270Ujhhgtgfeyxiexzf();
        } else if (c0197Ujhhgtgfeyxiexzf.f1425Ujhhgtgfeyxiexzf.getPreventCornerOverlap()) {
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf;
            if (!c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf.m2513Ujhhgtgfeyxiexzf(c0226Ujhhgtgfeyxiexzf.m1364Ujhhgtgfeyxiexzf())) {
                c0197Ujhhgtgfeyxiexzf.m1270Ujhhgtgfeyxiexzf();
            }
        }
        if (c0197Ujhhgtgfeyxiexzf.m1267Ujhhgtgfeyxiexzf()) {
            c0197Ujhhgtgfeyxiexzf.m1271Ujhhgtgfeyxiexzf();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf = colorStateList;
        int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        RippleDrawable rippleDrawable = c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(getContext(), i);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.f1435Ujhhgtgfeyxiexzf = colorStateListM4559Ujhhgtgfeyxiexzf;
        int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        RippleDrawable rippleDrawable = c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM4559Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC1006feyxiexzfUjhhgtg
    public void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        setClipToOutline(c1017feyxiexzfUjhhgtg.m2513Ujhhgtgfeyxiexzf(getBoundsAsRectF()));
        this.f724Ujhhgtgfeyxiexzf.m1266Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (i != c0197Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf) {
            c0197Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf = i;
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf;
            ColorStateList colorStateList = c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = i;
            c0226Ujhhgtgfeyxiexzf.invalidateSelf();
            c0226Ujhhgtgfeyxiexzf.m1373Ujhhgtgfeyxiexzf(colorStateList);
        }
        invalidate();
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        c0197Ujhhgtgfeyxiexzf.m1271Ujhhgtgfeyxiexzf();
        c0197Ujhhgtgfeyxiexzf.m1270Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (c0197Ujhhgtgfeyxiexzf != null && c0197Ujhhgtgfeyxiexzf.f1443Ujhhgtgfeyxiexzf && isEnabled()) {
            this.f726Ujhhgtgfeyxiexzf = !this.f726Ujhhgtgfeyxiexzf;
            refreshDrawableState();
            m808Ujhhgtgfeyxiexzf();
            c0197Ujhhgtgfeyxiexzf.m1264Ujhhgtgfeyxiexzf(this.f726Ujhhgtgfeyxiexzf, true);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m808Ujhhgtgfeyxiexzf() {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        RippleDrawable rippleDrawable = c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c0197Ujhhgtgfeyxiexzf.f1439Ujhhgtgfeyxiexzf.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C0197Ujhhgtgfeyxiexzf c0197Ujhhgtgfeyxiexzf = this.f724Ujhhgtgfeyxiexzf;
        if (c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf != colorStateList) {
            c0197Ujhhgtgfeyxiexzf.f1438Ujhhgtgfeyxiexzf = colorStateList;
            C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1428Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1515Ujhhgtgfeyxiexzf = c0197Ujhhgtgfeyxiexzf.f1432Ujhhgtgfeyxiexzf;
            c0226Ujhhgtgfeyxiexzf.invalidateSelf();
            c0226Ujhhgtgfeyxiexzf.m1373Ujhhgtgfeyxiexzf(colorStateList);
        }
        invalidate();
    }

    @Override // p000.AbstractC2777Ujhhgtgfeyxiexzf
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f724Ujhhgtgfeyxiexzf.f1427Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC0195Ujhhgtgfeyxiexzf interfaceC0195Ujhhgtgfeyxiexzf) {
    }
}
