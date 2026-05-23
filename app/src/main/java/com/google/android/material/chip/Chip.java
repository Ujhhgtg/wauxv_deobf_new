package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC0213;
import p000.AbstractC1459;
import p000.AbstractC2203;
import p000.AbstractC2467;
import p000.AbstractC2589;
import p000.AbstractC2665;
import p000.AbstractC2905;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.C0418;
import p000.C0452;
import p000.C0690;
import p000.C0691;
import p000.C0692;
import p000.C0693;
import p000.C0695;
import p000.C2035;
import p000.C2677;
import p000.C2904;
import p000.C2907;
import p000.InterfaceC0694;
import p000.InterfaceC1914;
import p000.InterfaceC2688;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends AbstractC0213 implements InterfaceC0694, InterfaceC2688, Checkable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Rect f682 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f683 = {16842913};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f684 = {16842911};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0695 f685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InsetDrawable f686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public RippleDrawable f687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public View.OnClickListener f688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public CharSequence f697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C0693 f698;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final Rect f700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final RectF f701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C0691 f702;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC2665.m4673(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, me.hd.wauxv.R.attr.chipStyle);
        this.f700 = new Rect();
        this.f701 = new RectF();
        this.f702 = new C0691(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C0695 c0695 = new C0695(context2, attributeSet);
        Context context3 = c0695.f2617;
        int[] iArr = AbstractC2467.f7843;
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context3, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0695.f2643 = typedArrayM5082.hasValue(37);
        Context context4 = c0695.f2617;
        ColorStateList colorStateListM4995 = AbstractC3453.m4995(context4, typedArrayM5082, 24);
        if (c0695.f2584 != colorStateListM4995) {
            c0695.f2584 = colorStateListM4995;
            c0695.onStateChange(c0695.getState());
        }
        ColorStateList colorStateListM4996 = AbstractC3453.m4995(context4, typedArrayM5082, 11);
        if (c0695.f2585 != colorStateListM4996) {
            c0695.f2585 = colorStateListM4996;
            c0695.onStateChange(c0695.getState());
        }
        float dimension = typedArrayM5082.getDimension(19, 0.0f);
        if (c0695.f2586 != dimension) {
            c0695.f2586 = dimension;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        if (typedArrayM5082.hasValue(12)) {
            c0695.m2095(typedArrayM5082.getDimension(12, 0.0f));
        }
        c0695.m2100(AbstractC3453.m4995(context4, typedArrayM5082, 22));
        c0695.m2101(typedArrayM5082.getDimension(23, 0.0f));
        c0695.m2110(AbstractC3453.m4995(context4, typedArrayM5082, 36));
        String text = typedArrayM5082.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c0695.f2591, text);
        C2907 c2907 = c0695.f2623;
        if (!zEquals) {
            c0695.f2591 = text;
            c2907.f9353 = true;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        C2904 c2904 = (!typedArrayM5082.hasValue(0) || (resourceId3 = typedArrayM5082.getResourceId(0, 0)) == 0) ? null : new C2904(context4, resourceId3);
        c2904.f9341 = typedArrayM5082.getDimension(1, c2904.f9341);
        c2907.m4915(c2904, context4);
        int i = typedArrayM5082.getInt(3, 0);
        if (i == 1) {
            c0695.f2640 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0695.f2640 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0695.f2640 = TextUtils.TruncateAt.END;
        }
        c0695.m2099(typedArrayM5082.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0695.m2099(typedArrayM5082.getBoolean(15, false));
        }
        c0695.m2096(AbstractC3453.m4997(context4, typedArrayM5082, 14));
        if (typedArrayM5082.hasValue(17)) {
            c0695.m2098(AbstractC3453.m4995(context4, typedArrayM5082, 17));
        }
        c0695.m2097(typedArrayM5082.getDimension(16, -1.0f));
        c0695.m2107(typedArrayM5082.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0695.m2107(typedArrayM5082.getBoolean(26, false));
        }
        c0695.m2102(AbstractC3453.m4997(context4, typedArrayM5082, 25));
        c0695.m2106(AbstractC3453.m4995(context4, typedArrayM5082, 30));
        c0695.m2104(typedArrayM5082.getDimension(28, 0.0f));
        c0695.m2091(typedArrayM5082.getBoolean(6, false));
        c0695.m2094(typedArrayM5082.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0695.m2094(typedArrayM5082.getBoolean(8, false));
        }
        c0695.m2092(AbstractC3453.m4997(context4, typedArrayM5082, 7));
        if (typedArrayM5082.hasValue(9)) {
            c0695.m2093(AbstractC3453.m4995(context4, typedArrayM5082, 9));
        }
        c0695.f2607 = (!typedArrayM5082.hasValue(39) || (resourceId2 = typedArrayM5082.getResourceId(39, 0)) == 0) ? null : C2035.m3877(context4, resourceId2);
        c0695.f2608 = (!typedArrayM5082.hasValue(33) || (resourceId = typedArrayM5082.getResourceId(33, 0)) == 0) ? null : C2035.m3877(context4, resourceId);
        float dimension2 = typedArrayM5082.getDimension(21, 0.0f);
        if (c0695.f2609 != dimension2) {
            c0695.f2609 = dimension2;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        c0695.m2109(typedArrayM5082.getDimension(35, 0.0f));
        c0695.m2108(typedArrayM5082.getDimension(34, 0.0f));
        float dimension3 = typedArrayM5082.getDimension(41, 0.0f);
        if (c0695.f2612 != dimension3) {
            c0695.f2612 = dimension3;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        float dimension4 = typedArrayM5082.getDimension(40, 0.0f);
        if (c0695.f2613 != dimension4) {
            c0695.f2613 = dimension4;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        c0695.m2105(typedArrayM5082.getDimension(29, 0.0f));
        c0695.m2103(typedArrayM5082.getDimension(27, 0.0f));
        float dimension5 = typedArrayM5082.getDimension(13, 0.0f);
        if (c0695.f2616 != dimension5) {
            c0695.f2616 = dimension5;
            c0695.invalidateSelf();
            c0695.m2089();
        }
        c0695.f2642 = typedArrayM5082.getDimensionPixelSize(4, 2147483647);
        typedArrayM5082.recycle();
        AbstractC3471.m5066(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3471.m5067(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f694 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f696 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC1459.m3180(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0695);
        c0695.m3715(getElevation());
        AbstractC3471.m5066(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC3471.m5067(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f698 = new C0693(this, this);
        m676();
        if (!zHasValue) {
            setOutlineProvider(new C0692(0, this));
        }
        setChecked(this.f690);
        setText(c0695.f2591);
        setEllipsize(c0695.f2640);
        m679();
        if (!this.f685.f2641) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m678();
        if (this.f694) {
            setMinHeight(this.f696);
        }
        this.f695 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C0690(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f701;
        rectF.setEmpty();
        if (m675() && this.f688 != null) {
            C0695 c0695 = this.f685;
            Rect bounds = c0695.getBounds();
            rectF.setEmpty();
            if (c0695.m2113()) {
                float f = c0695.f2616 + c0695.f2615 + c0695.f2601 + c0695.f2614 + c0695.f2613;
                if (c0695.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f700;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C2904 getTextAppearance() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2623.f9355;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f692 != z) {
            this.f692 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f691 != z) {
            this.f691 = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f699) {
            return this.f698.m2943(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f699) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0693 c0693 = this.f698;
        c0693.getClass();
        boolean zM2945 = false;
        int i2 = 0;
        zM2945 = false;
        zM2945 = false;
        zM2945 = false;
        zM2945 = false;
        zM2945 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21 /* 21 */:
                        case 22 /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c0693.m2945(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM2945 = z;
                            }
                            break;
                        case 23 /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c0693.f4588;
                                if (i != -2147483648) {
                                    c0693.mo1545(i, 16, null);
                                }
                                zM2945 = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c0693.f4588;
                    if (i != -2147483648) {
                        c0693.mo1545(i, 16, null);
                    }
                    zM2945 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM2945 = c0693.m2945(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM2945 = c0693.m2945(1, null);
            }
        }
        if (!zM2945 || c0693.f4588 == -2147483648) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.AbstractC0213, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        C0695 c0695 = this.f685;
        boolean zM2090 = false;
        if (c0695 != null && C0695.m2082(c0695.f2598)) {
            C0695 c0696 = this.f685;
            ?? IsEnabled = isEnabled();
            if (this.f693) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f692) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f691) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f693) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f692) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f691) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c0696.f2637, iArr)) {
                c0696.f2637 = iArr;
                if (c0696.m2113()) {
                    zM2090 = c0696.m2090(c0696.getState(), iArr);
                }
            }
        }
        if (zM2090) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f697)) {
            return this.f697;
        }
        C0695 c0695 = this.f685;
        if (c0695 == null || !c0695.f2603) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f686;
        return insetDrawable == null ? this.f685 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2605;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2606;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2585;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return Math.max(0.0f, c0695.m2088());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f685;
    }

    public float getChipEndPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2616;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C0695 c0695 = this.f685;
        if (c0695 == null || (drawable = c0695.f2593) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2595;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2594;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2586;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2609;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2588;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2589;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C0695 c0695 = this.f685;
        if (c0695 == null || (drawable = c0695.f2598) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2602;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2615;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2601;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2614;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2600;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2640;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f699) {
            C0693 c0693 = this.f698;
            if (c0693.f4588 == 1 || c0693.f4587 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C2035 getHideMotionSpec() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2608;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2611;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2610;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2590;
        }
        return null;
    }

    public C2677 getShapeAppearanceModel() {
        return this.f685.f6332.f6314;
    }

    public C2035 getShowMotionSpec() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2607;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2613;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            return c0695.f2612;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3471.m5086(this, this.f685);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f683);
        }
        C0695 c0695 = this.f685;
        if (c0695 != null && c0695.f2603) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f684);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f699) {
            C0693 c0693 = this.f698;
            int i2 = c0693.f4588;
            if (i2 != -2147483648) {
                c0693.m2940(i2);
            }
            if (z) {
                c0693.m2945(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0695 c0695 = this.f685;
        accessibilityNodeInfo.setCheckable(c0695 != null && c0695.f2603);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f695 != i) {
            this.f695 = i;
            m678();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f691) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f691) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f688;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f699) {
                        this.f698.m2948(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f697 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f687) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000.AbstractC0213, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f687) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000.AbstractC0213, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2091(z);
        }
    }

    public void setCheckableResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2091(c0695.f2617.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0695 c0695 = this.f685;
        if (c0695 == null) {
            this.f690 = z;
        } else if (c0695.f2603) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2092(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2092(AbstractC3471.m5076(c0695.f2617, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2093(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2093(AbstractC2203.m4030(c0695.f2617, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2094(c0695.f2617.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2585 == colorStateList) {
            return;
        }
        c0695.f2585 = colorStateList;
        c0695.onStateChange(c0695.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM4030;
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2585 == (colorStateListM4030 = AbstractC2203.m4030(c0695.f2617, i))) {
            return;
        }
        c0695.f2585 = colorStateListM4030;
        c0695.onStateChange(c0695.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2095(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2095(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0695 c0695) {
        C0695 c0696 = this.f685;
        if (c0696 != c0695) {
            if (c0696 != null) {
                c0696.f2639 = new WeakReference(null);
            }
            this.f685 = c0695;
            c0695.f2641 = false;
            c0695.f2639 = new WeakReference(this);
            m674(this.f696);
        }
    }

    public void setChipEndPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2616 == f) {
            return;
        }
        c0695.f2616 = f;
        c0695.invalidateSelf();
        c0695.m2089();
    }

    public void setChipEndPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float dimension = c0695.f2617.getResources().getDimension(i);
            if (c0695.f2616 != dimension) {
                c0695.f2616 = dimension;
                c0695.invalidateSelf();
                c0695.m2089();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2096(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2096(AbstractC3471.m5076(c0695.f2617, i));
        }
    }

    public void setChipIconSize(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2097(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2097(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2098(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2098(AbstractC2203.m4030(c0695.f2617, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2099(c0695.f2617.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2586 == f) {
            return;
        }
        c0695.f2586 = f;
        c0695.invalidateSelf();
        c0695.m2089();
    }

    public void setChipMinHeightResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float dimension = c0695.f2617.getResources().getDimension(i);
            if (c0695.f2586 != dimension) {
                c0695.f2586 = dimension;
                c0695.invalidateSelf();
                c0695.m2089();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2609 == f) {
            return;
        }
        c0695.f2609 = f;
        c0695.invalidateSelf();
        c0695.m2089();
    }

    public void setChipStartPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float dimension = c0695.f2617.getResources().getDimension(i);
            if (c0695.f2609 != dimension) {
                c0695.f2609 = dimension;
                c0695.invalidateSelf();
                c0695.m2089();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2100(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2100(AbstractC2203.m4030(c0695.f2617, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2101(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2101(c0695.f2617.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2102(drawable);
        }
        m676();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2602 == charSequence) {
            return;
        }
        String str = C0418.f1958;
        C0418 c0418 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0418.f1961 : C0418.f1960;
        c0418.getClass();
        C0452 c0452 = AbstractC2905.f9345;
        c0695.f2602 = c0418.m1613(charSequence);
        c0695.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2103(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2103(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2102(AbstractC3471.m5076(c0695.f2617, i));
        }
        m676();
    }

    public void setCloseIconSize(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2104(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2104(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2105(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2105(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2106(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2106(AbstractC2203.m4030(c0695.f2617, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.AbstractC0213, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.AbstractC0213, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m3715(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f685 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2640 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f694 = z;
        m674(this.f696);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    public void setHideMotionSpec(C2035 c2035) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2608 = c2035;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2608 = C2035.m3877(c0695.f2617, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2108(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2108(c0695.f2617.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2109(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2109(c0695.f2617.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f685 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2642 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f689 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f688 = onClickListener;
        m676();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2110(colorStateList);
        }
        this.f685.getClass();
        m677();
    }

    public void setRippleColorResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2110(AbstractC2203.m4030(c0695.f2617, i));
            this.f685.getClass();
            m677();
        }
    }

    @Override // p000.InterfaceC2688
    public void setShapeAppearanceModel(C2677 c2677) {
        this.f685.setShapeAppearanceModel(c2677);
    }

    public void setShowMotionSpec(C2035 c2035) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2607 = c2035;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2607 = C2035.m3877(c0695.f2617, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0695 c0695 = this.f685;
        if (c0695 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0695.f2641 ? null : charSequence, bufferType);
        C0695 c0696 = this.f685;
        if (c0696 == null || TextUtils.equals(c0696.f2591, charSequence)) {
            return;
        }
        c0696.f2591 = charSequence;
        c0696.f2623.f9353 = true;
        c0696.invalidateSelf();
        c0696.m2089();
    }

    public void setTextAppearance(C2904 c2904) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.f2623.m4915(c2904, c0695.f2617);
        }
        m679();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2613 == f) {
            return;
        }
        c0695.f2613 = f;
        c0695.invalidateSelf();
        c0695.m2089();
    }

    public void setTextEndPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float dimension = c0695.f2617.getResources().getDimension(i);
            if (c0695.f2613 != dimension) {
                c0695.f2613 = dimension;
                c0695.invalidateSelf();
                c0695.m2089();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C2907 c2907 = c0695.f2623;
            C2904 c2904 = c2907.f9355;
            if (c2904 != null) {
                c2904.f9341 = fApplyDimension;
                c2907.f9349.setTextSize(fApplyDimension);
                c0695.mo1475();
            }
        }
        m679();
    }

    public void setTextStartPadding(float f) {
        C0695 c0695 = this.f685;
        if (c0695 == null || c0695.f2612 == f) {
            return;
        }
        c0695.f2612 = f;
        c0695.invalidateSelf();
        c0695.m2089();
    }

    public void setTextStartPaddingResource(int i) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            float dimension = c0695.f2617.getResources().getDimension(i);
            if (c0695.f2612 != dimension) {
                c0695.f2612 = dimension;
                c0695.invalidateSelf();
                c0695.m2089();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m674(int i) {
        this.f696 = i;
        if (!this.f694) {
            InsetDrawable insetDrawable = this.f686;
            if (insetDrawable == null) {
                int[] iArr = AbstractC2589.f8198;
                m677();
                return;
            } else {
                if (true) {
                    this.f686 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC2589.f8198;
                    m677();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f685.f2586));
        int iMax2 = Math.max(0, i - this.f685.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f686;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC2589.f8198;
                m677();
                return;
            } else {
                if (true) {
                    this.f686 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC2589.f8198;
                    m677();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f686 != null) {
            Rect rect = new Rect();
            this.f686.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = AbstractC2589.f8198;
                m677();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f686 = new InsetDrawable((Drawable) this.f685, i2, i3, i2, i3);
        int[] iArr6 = AbstractC2589.f8198;
        m677();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m675() {
        C0695 c0695 = this.f685;
        if (c0695 == null) {
            return false;
        }
        Drawable drawable = c0695.f2598;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m676() {
        C0695 c0695;
        if (!m675() || (c0695 = this.f685) == null || !c0695.f2597 || this.f688 == null) {
            AbstractC3578.m5177(this, null);
            this.f699 = false;
        } else {
            AbstractC3578.m5177(this, this.f698);
            this.f699 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m677() {
        this.f687 = new RippleDrawable(AbstractC2589.m4597(this.f685.f2590), getBackgroundDrawable(), null);
        this.f685.getClass();
        RippleDrawable rippleDrawable = this.f687;
        Field field = AbstractC3578.f11184;
        setBackground(rippleDrawable);
        m678();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m678() {
        C0695 c0695;
        if (TextUtils.isEmpty(getText()) || (c0695 = this.f685) == null) {
            return;
        }
        int iM2087 = (int) (c0695.m2087() + c0695.f2616 + c0695.f2613);
        C0695 c0696 = this.f685;
        int iM2086 = (int) (c0696.m2086() + c0696.f2609 + c0696.f2612);
        if (this.f686 != null) {
            Rect rect = new Rect();
            this.f686.getPadding(rect);
            iM2086 += rect.left;
            iM2087 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC3578.f11184;
        setPaddingRelative(iM2086, paddingTop, iM2087, paddingBottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m679() {
        TextPaint paint = getPaint();
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            paint.drawableState = c0695.getState();
        }
        C2904 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4910(getContext(), paint, this.f702);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2107(z);
        }
        m676();
    }

    public void setCheckedIconVisible(boolean z) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2094(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            c0695.m2099(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            Context context2 = c0695.f2617;
            c0695.f2623.m4915(new C2904(context2, i), context2);
        }
        m679();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0695 c0695 = this.f685;
        if (c0695 != null) {
            Context context = c0695.f2617;
            c0695.f2623.m4915(new C2904(context, i), context);
        }
        m679();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1914 interfaceC1914) {
    }
}
