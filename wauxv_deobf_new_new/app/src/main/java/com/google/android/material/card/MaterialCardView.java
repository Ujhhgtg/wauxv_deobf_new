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
import p000.AbstractC0539;
import p000.AbstractC1469;
import p000.AbstractC1470;
import p000.AbstractC1471;
import p000.AbstractC1586;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC2646;
import p000.C1787;
import p000.C1941;
import p000.C1948;
import p000.C2737;
import p000.C2738;
import p000.InterfaceC1939;
import p000.InterfaceC2749;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends AbstractC0539 implements Checkable, InterfaceC2749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final int[] f707 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final int[] f708 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final int[] f709 = {me.hd.wauxv.R.attr.state_dragged};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C1941 f710;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean f711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f712;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f713;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.f712 = false;
        this.f713 = false;
        this.f711 = true;
        TypedArray typedArrayM4263 = AbstractC2240.m4263(getContext(), attributeSet, AbstractC2521.f8000, me.hd.wauxv.R.attr.materialCardViewStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C1941 c1941 = new C1941(this, attributeSet);
        this.f710 = c1941;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C1948 c1948 = c1941.f6392;
        c1948.m3914(cardBackgroundColor);
        c1941.f6391.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c1941.m3902();
        MaterialCardView materialCardView = c1941.f6390;
        ColorStateList colorStateListM3388 = AbstractC1471.m3388(materialCardView.getContext(), typedArrayM4263, 11);
        c1941.f6403 = colorStateListM3388;
        if (colorStateListM3388 == null) {
            c1941.f6403 = ColorStateList.valueOf(-1);
        }
        c1941.f6397 = typedArrayM4263.getDimensionPixelSize(12, 0);
        boolean z = typedArrayM4263.getBoolean(0, false);
        c1941.f6408 = z;
        materialCardView.setLongClickable(z);
        c1941.f6401 = AbstractC1471.m3388(materialCardView.getContext(), typedArrayM4263, 6);
        c1941.m3897(AbstractC1471.m3390(materialCardView.getContext(), typedArrayM4263, 2));
        c1941.f6395 = typedArrayM4263.getDimensionPixelSize(5, 0);
        c1941.f6394 = typedArrayM4263.getDimensionPixelSize(4, 0);
        c1941.f6396 = typedArrayM4263.getInteger(3, 8388661);
        ColorStateList colorStateListM3389 = AbstractC1471.m3388(materialCardView.getContext(), typedArrayM4263, 7);
        c1941.f6400 = colorStateListM3389;
        if (colorStateListM3389 == null) {
            c1941.f6400 = ColorStateList.valueOf(AbstractC1470.m3363(materialCardView, me.hd.wauxv.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM33810 = AbstractC1471.m3388(materialCardView.getContext(), typedArrayM4263, 1);
        colorStateListM33810 = colorStateListM33810 == null ? ColorStateList.valueOf(0) : colorStateListM33810;
        C1948 c1949 = c1941.f6393;
        c1949.m3914(colorStateListM33810);
        int[] iArr = AbstractC2646.f8350;
        RippleDrawable rippleDrawable = c1941.f6404;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c1941.f6400);
        }
        c1948.m3913(materialCardView.getCardElevation());
        float f = c1941.f6397;
        ColorStateList colorStateList = c1941.f6403;
        c1949.f6437.f6428 = f;
        c1949.invalidateSelf();
        c1949.m3918(colorStateList);
        materialCardView.setBackgroundInternal(c1941.m3894(c1948));
        Drawable drawableM3893 = c1941.m3900() ? c1941.m3893() : c1949;
        c1941.f6398 = drawableM3893;
        materialCardView.setForeground(c1941.m3894(drawableM3893));
        typedArrayM4263.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f710.f6392.getBounds());
        return rectF;
    }

    @Override // p000.AbstractC0539
    public ColorStateList getCardBackgroundColor() {
        return this.f710.f6392.f6437.f6421;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f710.f6393.f6437.f6421;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f710.f6399;
    }

    public int getCheckedIconGravity() {
        return this.f710.f6396;
    }

    public int getCheckedIconMargin() {
        return this.f710.f6394;
    }

    public int getCheckedIconSize() {
        return this.f710.f6395;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f710.f6401;
    }

    @Override // p000.AbstractC0539
    public int getContentPaddingBottom() {
        return this.f710.f6391.bottom;
    }

    @Override // p000.AbstractC0539
    public int getContentPaddingLeft() {
        return this.f710.f6391.left;
    }

    @Override // p000.AbstractC0539
    public int getContentPaddingRight() {
        return this.f710.f6391.right;
    }

    @Override // p000.AbstractC0539
    public int getContentPaddingTop() {
        return this.f710.f6391.top;
    }

    public float getProgress() {
        return this.f710.f6392.f6437.f6427;
    }

    @Override // p000.AbstractC0539
    public float getRadius() {
        return this.f710.f6392.m3910();
    }

    public ColorStateList getRippleColor() {
        return this.f710.f6400;
    }

    public C2738 getShapeAppearanceModel() {
        return this.f710.f6402;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f710.f6403;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f710.f6403;
    }

    public int getStrokeWidth() {
        return this.f710.f6397;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f712;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1941 c1941 = this.f710;
        c1941.m3901();
        AbstractC1586.m3489(this, c1941.f6392);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C1941 c1941 = this.f710;
        if (c1941 != null && c1941.f6408) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f707);
        }
        if (this.f712) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f708);
        }
        if (this.f713) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f709);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f712);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C1941 c1941 = this.f710;
        accessibilityNodeInfo.setCheckable(c1941 != null && c1941.f6408);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f712);
    }

    @Override // p000.AbstractC0539, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f710.m3895(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f711) {
            C1941 c1941 = this.f710;
            if (!c1941.f6407) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c1941.f6407 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.AbstractC0539
    public void setCardBackgroundColor(int i) {
        this.f710.f6392.m3914(ColorStateList.valueOf(i));
    }

    @Override // p000.AbstractC0539
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C1941 c1941 = this.f710;
        c1941.f6392.m3913(c1941.f6390.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C1948 c1948 = this.f710.f6393;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c1948.m3914(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f710.f6408 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f712 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f710.m3897(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C1941 c1941 = this.f710;
        if (c1941.f6396 != i) {
            c1941.f6396 = i;
            MaterialCardView materialCardView = c1941.f6390;
            c1941.m3895(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f710.f6394 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f710.f6394 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f710.m3897(C1787.m3667(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f710.f6395 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f710.f6395 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1941 c1941 = this.f710;
        c1941.f6401 = colorStateList;
        Drawable drawable = c1941.f6399;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C1941 c1941 = this.f710;
        if (c1941 != null) {
            c1941.m3901();
        }
    }

    public void setDragged(boolean z) {
        if (this.f713 != z) {
            this.f713 = z;
            refreshDrawableState();
            m809();
            invalidate();
        }
    }

    @Override // p000.AbstractC0539
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f710.m3903();
    }

    @Override // p000.AbstractC0539
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C1941 c1941 = this.f710;
        c1941.m3903();
        c1941.m3902();
    }

    public void setProgress(float f) {
        C1941 c1941 = this.f710;
        c1941.f6392.m3915(f);
        C1948 c1948 = c1941.f6393;
        if (c1948 != null) {
            c1948.m3915(f);
        }
        C1948 c1949 = c1941.f6406;
        if (c1949 != null) {
            c1949.m3915(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // p000.AbstractC0539
    public void setRadius(float f) {
        super.setRadius(f);
        C1941 c1941 = this.f710;
        C2737 c2737M4728 = c1941.f6402.m4728();
        c2737M4728.m4723(f);
        c1941.m3898(c2737M4728.m4722());
        c1941.f6398.invalidateSelf();
        if (c1941.m3899()) {
            c1941.m3902();
        } else if (c1941.f6390.getPreventCornerOverlap()) {
            C1948 c1948 = c1941.f6392;
            if (!c1948.f6437.f6419.m4727(c1948.m3909())) {
                c1941.m3902();
            }
        }
        if (c1941.m3899()) {
            c1941.m3903();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1941 c1941 = this.f710;
        c1941.f6400 = colorStateList;
        int[] iArr = AbstractC2646.f8350;
        RippleDrawable rippleDrawable = c1941.f6404;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM3333 = AbstractC1469.m3333(getContext(), i);
        C1941 c1941 = this.f710;
        c1941.f6400 = colorStateListM3333;
        int[] iArr = AbstractC2646.f8350;
        RippleDrawable rippleDrawable = c1941.f6404;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM3333);
        }
    }

    @Override // p000.InterfaceC2749
    public void setShapeAppearanceModel(C2738 c2738) {
        setClipToOutline(c2738.m4727(getBoundsAsRectF()));
        this.f710.m3898(c2738);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C1941 c1941 = this.f710;
        if (i != c1941.f6397) {
            c1941.f6397 = i;
            C1948 c1948 = c1941.f6393;
            ColorStateList colorStateList = c1941.f6403;
            c1948.f6437.f6428 = i;
            c1948.invalidateSelf();
            c1948.m3918(colorStateList);
        }
        invalidate();
    }

    @Override // p000.AbstractC0539
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C1941 c1941 = this.f710;
        c1941.m3903();
        c1941.m3902();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C1941 c1941 = this.f710;
        if (c1941 != null && c1941.f6408 && isEnabled()) {
            this.f712 = !this.f712;
            refreshDrawableState();
            m809();
            c1941.m3896(this.f712, true);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m809() {
        C1941 c1941 = this.f710;
        RippleDrawable rippleDrawable = c1941.f6404;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            c1941.f6404.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c1941.f6404.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C1941 c1941 = this.f710;
        if (c1941.f6403 != colorStateList) {
            c1941.f6403 = colorStateList;
            C1948 c1948 = c1941.f6393;
            c1948.f6437.f6428 = c1941.f6397;
            c1948.invalidateSelf();
            c1948.m3918(colorStateList);
        }
        invalidate();
    }

    @Override // p000.AbstractC0539
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f710.f6392.m3914(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC1939 interfaceC1939) {
    }
}
