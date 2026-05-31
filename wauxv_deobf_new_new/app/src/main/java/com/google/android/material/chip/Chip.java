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
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC0223;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC1586;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC2646;
import p000.AbstractC2964;
import p000.AbstractC3638;
import p000.C0099;
import p000.C0393;
import p000.C0427;
import p000.C0681;
import p000.C0682;
import p000.C0683;
import p000.C0684;
import p000.C0686;
import p000.C1787;
import p000.C2068;
import p000.C2738;
import p000.C2963;
import p000.C2966;
import p000.InterfaceC0685;
import p000.InterfaceC1944;
import p000.InterfaceC1945;
import p000.InterfaceC2749;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends AbstractC0223 implements InterfaceC0685, InterfaceC2749, InterfaceC1945 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Rect f741 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f742 = {R.attr.state_selected};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f743 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0686 f744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InsetDrawable f745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public RippleDrawable f746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public View.OnClickListener f747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public InterfaceC1944 f749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f752;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f753;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public CharSequence f757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C0684 f758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final Rect f760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final RectF f761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final C0682 f762;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC1469.m3354(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, me.hd.wauxv.R.attr.chipStyle);
        this.f760 = new Rect();
        this.f761 = new RectF();
        this.f762 = new C0682(this, 0);
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
        C0686 c0686 = new C0686(context2, attributeSet);
        Context context3 = c0686.f2615;
        int[] iArr = AbstractC2521.f7990;
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context3, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0686.f2641 = typedArrayM4263.hasValue(37);
        Context context4 = c0686.f2615;
        ColorStateList colorStateListM3388 = AbstractC1471.m3388(context4, typedArrayM4263, 24);
        if (c0686.f2582 != colorStateListM3388) {
            c0686.f2582 = colorStateListM3388;
            c0686.onStateChange(c0686.getState());
        }
        ColorStateList colorStateListM3389 = AbstractC1471.m3388(context4, typedArrayM4263, 11);
        if (c0686.f2583 != colorStateListM3389) {
            c0686.f2583 = colorStateListM3389;
            c0686.onStateChange(c0686.getState());
        }
        float dimension = typedArrayM4263.getDimension(19, 0.0f);
        if (c0686.f2584 != dimension) {
            c0686.f2584 = dimension;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        if (typedArrayM4263.hasValue(12)) {
            c0686.m2190(typedArrayM4263.getDimension(12, 0.0f));
        }
        c0686.m2195(AbstractC1471.m3388(context4, typedArrayM4263, 22));
        c0686.m2196(typedArrayM4263.getDimension(23, 0.0f));
        c0686.m2205(AbstractC1471.m3388(context4, typedArrayM4263, 36));
        String text = typedArrayM4263.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c0686.f2589, text);
        C2966 c2966 = c0686.f2621;
        if (!zEquals) {
            c0686.f2589 = text;
            c2966.f9520 = true;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        C2963 c2963 = (!typedArrayM4263.hasValue(0) || (resourceId3 = typedArrayM4263.getResourceId(0, 0)) == 0) ? null : new C2963(context4, resourceId3);
        c2963.f9508 = typedArrayM4263.getDimension(1, c2963.f9508);
        c2966.m4977(c2963, context4);
        int i = typedArrayM4263.getInt(3, 0);
        if (i == 1) {
            c0686.f2638 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0686.f2638 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0686.f2638 = TextUtils.TruncateAt.END;
        }
        c0686.m2194(typedArrayM4263.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0686.m2194(typedArrayM4263.getBoolean(15, false));
        }
        c0686.m2191(AbstractC1471.m3390(context4, typedArrayM4263, 14));
        if (typedArrayM4263.hasValue(17)) {
            c0686.m2193(AbstractC1471.m3388(context4, typedArrayM4263, 17));
        }
        c0686.m2192(typedArrayM4263.getDimension(16, -1.0f));
        c0686.m2202(typedArrayM4263.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0686.m2202(typedArrayM4263.getBoolean(26, false));
        }
        c0686.m2197(AbstractC1471.m3390(context4, typedArrayM4263, 25));
        c0686.m2201(AbstractC1471.m3388(context4, typedArrayM4263, 30));
        c0686.m2199(typedArrayM4263.getDimension(28, 0.0f));
        c0686.m2186(typedArrayM4263.getBoolean(6, false));
        c0686.m2189(typedArrayM4263.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0686.m2189(typedArrayM4263.getBoolean(8, false));
        }
        c0686.m2187(AbstractC1471.m3390(context4, typedArrayM4263, 7));
        if (typedArrayM4263.hasValue(9)) {
            c0686.m2188(AbstractC1471.m3388(context4, typedArrayM4263, 9));
        }
        c0686.f2605 = (!typedArrayM4263.hasValue(39) || (resourceId2 = typedArrayM4263.getResourceId(39, 0)) == 0) ? null : C2068.m4060(context4, resourceId2);
        c0686.f2606 = (!typedArrayM4263.hasValue(33) || (resourceId = typedArrayM4263.getResourceId(33, 0)) == 0) ? null : C2068.m4060(context4, resourceId);
        float dimension2 = typedArrayM4263.getDimension(21, 0.0f);
        if (c0686.f2607 != dimension2) {
            c0686.f2607 = dimension2;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        c0686.m2204(typedArrayM4263.getDimension(35, 0.0f));
        c0686.m2203(typedArrayM4263.getDimension(34, 0.0f));
        float dimension3 = typedArrayM4263.getDimension(41, 0.0f);
        if (c0686.f2610 != dimension3) {
            c0686.f2610 = dimension3;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        float dimension4 = typedArrayM4263.getDimension(40, 0.0f);
        if (c0686.f2611 != dimension4) {
            c0686.f2611 = dimension4;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        c0686.m2200(typedArrayM4263.getDimension(29, 0.0f));
        c0686.m2198(typedArrayM4263.getDimension(27, 0.0f));
        float dimension5 = typedArrayM4263.getDimension(13, 0.0f);
        if (c0686.f2614 != dimension5) {
            c0686.f2614 = dimension5;
            c0686.invalidateSelf();
            c0686.m2184();
        }
        c0686.f2640 = typedArrayM4263.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM4263.recycle();
        AbstractC2240.m4241(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2240.m4243(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f754 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f756 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC1471.m3383(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0686);
        c0686.m3913(getElevation());
        AbstractC2240.m4241(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2240.m4243(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f758 = new C0684(this, this);
        m820();
        if (!zHasValue) {
            setOutlineProvider(new C0683(this, 0));
        }
        setChecked(this.f750);
        setText(c0686.f2589);
        setEllipsize(c0686.f2638);
        m823();
        if (!this.f744.f2639) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m822();
        if (this.f754) {
            setMinHeight(this.f756);
        }
        this.f755 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C0681(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f761;
        rectF.setEmpty();
        if (m819() && this.f747 != null) {
            C0686 c0686 = this.f744;
            Rect bounds = c0686.getBounds();
            rectF.setEmpty();
            if (c0686.m2208()) {
                float f = c0686.f2614 + c0686.f2613 + c0686.f2599 + c0686.f2612 + c0686.f2611;
                if (c0686.getLayoutDirection() == 0) {
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
        Rect rect = this.f760;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C2963 getTextAppearance() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2621.f9522;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f752 != z) {
            this.f752 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f751 != z) {
            this.f751 = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f759) {
            return this.f758.m3062(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f759) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0684 c0684 = this.f758;
        c0684.getClass();
        boolean zM3064 = false;
        int i2 = 0;
        zM3064 = false;
        zM3064 = false;
        zM3064 = false;
        zM3064 = false;
        zM3064 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case Opcodes.ILOAD /* 21 */:
                        case Opcodes.LLOAD /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = Opcodes.IXOR;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c0684.m3064(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM3064 = z;
                            }
                            break;
                        case Opcodes.FLOAD /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c0684.f4587;
                                if (i != Integer.MIN_VALUE) {
                                    c0684.mo1651(i, 16, null);
                                }
                                zM3064 = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c0684.f4587;
                    if (i != Integer.MIN_VALUE) {
                        c0684.mo1651(i, 16, null);
                    }
                    zM3064 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM3064 = c0684.m3064(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM3064 = c0684.m3064(1, null);
            }
        }
        if (!zM3064 || c0684.f4587 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.AbstractC0223, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        C0686 c0686 = this.f744;
        boolean zM2185 = false;
        if (c0686 != null && C0686.m2177(c0686.f2596)) {
            C0686 c0687 = this.f744;
            ?? IsEnabled = isEnabled();
            if (this.f753) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f752) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f751) {
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
            if (this.f753) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f752) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f751) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c0687.f2635, iArr)) {
                c0687.f2635 = iArr;
                if (c0687.m2208()) {
                    zM2185 = c0687.m2185(c0687.getState(), iArr);
                }
            }
        }
        if (zM2185) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f757)) {
            return this.f757;
        }
        C0686 c0686 = this.f744;
        if (c0686 == null || !c0686.f2601) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f766.f2563) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f745;
        return insetDrawable == null ? this.f744 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2603;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2604;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2583;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return Math.max(0.0f, c0686.m2183());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f744;
    }

    public float getChipEndPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2614;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C0686 c0686 = this.f744;
        if (c0686 == null || (drawable = c0686.f2591) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2593;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2592;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2584;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2607;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2586;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2587;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C0686 c0686 = this.f744;
        if (c0686 == null || (drawable = c0686.f2596) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2600;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2613;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2599;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2612;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2598;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2638;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f759) {
            C0684 c0684 = this.f758;
            if (c0684.f4587 == 1 || c0684.f4586 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C2068 getHideMotionSpec() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2606;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2609;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2608;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2588;
        }
        return null;
    }

    public C2738 getShapeAppearanceModel() {
        return this.f744.f6437.f6419;
    }

    public C2068 getShowMotionSpec() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2605;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2611;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            return c0686.f2610;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1586.m3489(this, this.f744);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f742);
        }
        C0686 c0686 = this.f744;
        if (c0686 != null && c0686.f2601) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f743);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f759) {
            C0684 c0684 = this.f758;
            int i2 = c0684.f4587;
            if (i2 != Integer.MIN_VALUE) {
                c0684.m3059(i2);
            }
            if (z) {
                c0684.m3064(i, rect);
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
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0686 c0686 = this.f744;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(c0686 != null && c0686.f2601);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f4956) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = chipGroup.getChildAt(i2);
                if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                    if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(me.hd.wauxv.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0099.m1231(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f1112);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f755 != i) {
            this.f755 = i;
            m822();
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
                } else if (this.f751) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f751) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f747;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f759) {
                        this.f758.m3067(1, 1);
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
        this.f757 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f746) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000.AbstractC0223, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f746) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000.AbstractC0223, android.view.View
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2186(z);
        }
    }

    public void setCheckableResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2186(c0686.f2615.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0686 c0686 = this.f744;
        if (c0686 == null) {
            this.f750 = z;
        } else if (c0686.f2601) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2187(drawable);
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2187(C1787.m3667(c0686.f2615, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2188(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2188(AbstractC1469.m3333(c0686.f2615, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2189(c0686.f2615.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2583 == colorStateList) {
            return;
        }
        c0686.f2583 = colorStateList;
        c0686.onStateChange(c0686.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM3333;
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2583 == (colorStateListM3333 = AbstractC1469.m3333(c0686.f2615, i))) {
            return;
        }
        c0686.f2583 = colorStateListM3333;
        c0686.onStateChange(c0686.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2190(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2190(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0686 c0686) {
        C0686 c0687 = this.f744;
        if (c0687 != c0686) {
            if (c0687 != null) {
                c0687.f2637 = new WeakReference(null);
            }
            this.f744 = c0686;
            c0686.f2639 = false;
            c0686.f2637 = new WeakReference(this);
            m818(this.f756);
        }
    }

    public void setChipEndPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2614 == f) {
            return;
        }
        c0686.f2614 = f;
        c0686.invalidateSelf();
        c0686.m2184();
    }

    public void setChipEndPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float dimension = c0686.f2615.getResources().getDimension(i);
            if (c0686.f2614 != dimension) {
                c0686.f2614 = dimension;
                c0686.invalidateSelf();
                c0686.m2184();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2191(drawable);
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2191(C1787.m3667(c0686.f2615, i));
        }
    }

    public void setChipIconSize(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2192(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2192(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2193(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2193(AbstractC1469.m3333(c0686.f2615, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2194(c0686.f2615.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2584 == f) {
            return;
        }
        c0686.f2584 = f;
        c0686.invalidateSelf();
        c0686.m2184();
    }

    public void setChipMinHeightResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float dimension = c0686.f2615.getResources().getDimension(i);
            if (c0686.f2584 != dimension) {
                c0686.f2584 = dimension;
                c0686.invalidateSelf();
                c0686.m2184();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2607 == f) {
            return;
        }
        c0686.f2607 = f;
        c0686.invalidateSelf();
        c0686.m2184();
    }

    public void setChipStartPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float dimension = c0686.f2615.getResources().getDimension(i);
            if (c0686.f2607 != dimension) {
                c0686.f2607 = dimension;
                c0686.invalidateSelf();
                c0686.m2184();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2195(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2195(AbstractC1469.m3333(c0686.f2615, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2196(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2196(c0686.f2615.getResources().getDimension(i));
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2197(drawable);
        }
        m820();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2600 == charSequence) {
            return;
        }
        String str = C0393.f1930;
        C0393 c0393 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0393.f1933 : C0393.f1932;
        c0393.getClass();
        C0427 c0427 = AbstractC2964.f9512;
        c0686.f2600 = c0393.m1719(charSequence);
        c0686.invalidateSelf();
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2198(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2198(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2197(C1787.m3667(c0686.f2615, i));
        }
        m820();
    }

    public void setCloseIconSize(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2199(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2199(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2200(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2200(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2201(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2201(AbstractC1469.m3333(c0686.f2615, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.AbstractC0223, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.AbstractC0223, android.widget.TextView
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
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m3913(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f744 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2638 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f754 = z;
        m818(this.f756);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C2068 c2068) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2606 = c2068;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2606 = C2068.m4060(c0686.f2615, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2203(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2203(c0686.f2615.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2204(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2204(c0686.f2615.getResources().getDimension(i));
        }
    }

    @Override // p000.InterfaceC1945
    public void setInternalOnCheckedChangeListener(InterfaceC1944 interfaceC1944) {
        this.f749 = interfaceC1944;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f744 == null) {
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2640 = i;
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
        this.f748 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f747 = onClickListener;
        m820();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2205(colorStateList);
        }
        this.f744.getClass();
        m821();
    }

    public void setRippleColorResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2205(AbstractC1469.m3333(c0686.f2615, i));
            this.f744.getClass();
            m821();
        }
    }

    @Override // p000.InterfaceC2749
    public void setShapeAppearanceModel(C2738 c2738) {
        this.f744.setShapeAppearanceModel(c2738);
    }

    public void setShowMotionSpec(C2068 c2068) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2605 = c2068;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2605 = C2068.m4060(c0686.f2615, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0686 c0686 = this.f744;
        if (c0686 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0686.f2639 ? null : charSequence, bufferType);
        C0686 c0687 = this.f744;
        if (c0687 == null || TextUtils.equals(c0687.f2589, charSequence)) {
            return;
        }
        c0687.f2589 = charSequence;
        c0687.f2621.f9520 = true;
        c0687.invalidateSelf();
        c0687.m2184();
    }

    public void setTextAppearance(C2963 c2963) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.f2621.m4977(c2963, c0686.f2615);
        }
        m823();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2611 == f) {
            return;
        }
        c0686.f2611 = f;
        c0686.invalidateSelf();
        c0686.m2184();
    }

    public void setTextEndPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float dimension = c0686.f2615.getResources().getDimension(i);
            if (c0686.f2611 != dimension) {
                c0686.f2611 = dimension;
                c0686.invalidateSelf();
                c0686.m2184();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C2966 c2966 = c0686.f2621;
            C2963 c2963 = c2966.f9522;
            if (c2963 != null) {
                c2963.f9508 = fApplyDimension;
                c2966.f9516.setTextSize(fApplyDimension);
                c0686.mo1580();
            }
        }
        m823();
    }

    public void setTextStartPadding(float f) {
        C0686 c0686 = this.f744;
        if (c0686 == null || c0686.f2610 == f) {
            return;
        }
        c0686.f2610 = f;
        c0686.invalidateSelf();
        c0686.m2184();
    }

    public void setTextStartPaddingResource(int i) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            float dimension = c0686.f2615.getResources().getDimension(i);
            if (c0686.f2610 != dimension) {
                c0686.f2610 = dimension;
                c0686.invalidateSelf();
                c0686.m2184();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m818(int i) {
        this.f756 = i;
        if (!this.f754) {
            InsetDrawable insetDrawable = this.f745;
            if (insetDrawable == null) {
                int[] iArr = AbstractC2646.f8350;
                m821();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f745 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC2646.f8350;
                    m821();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f744.f2584));
        int iMax2 = Math.max(0, i - this.f744.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f745;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC2646.f8350;
                m821();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f745 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC2646.f8350;
                    m821();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f745 != null) {
            Rect rect = new Rect();
            this.f745.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = AbstractC2646.f8350;
                m821();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f745 = new InsetDrawable((Drawable) this.f744, i2, i3, i2, i3);
        int[] iArr6 = AbstractC2646.f8350;
        m821();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m819() {
        C0686 c0686 = this.f744;
        if (c0686 == null) {
            return false;
        }
        Drawable drawable = c0686.f2596;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m820() {
        C0686 c0686;
        if (!m819() || (c0686 = this.f744) == null || !c0686.f2595 || this.f747 == null) {
            AbstractC3638.m5183(this, null);
            this.f759 = false;
        } else {
            AbstractC3638.m5183(this, this.f758);
            this.f759 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m821() {
        this.f746 = new RippleDrawable(AbstractC2646.m4619(this.f744.f2588), getBackgroundDrawable(), null);
        this.f744.getClass();
        RippleDrawable rippleDrawable = this.f746;
        Field field = AbstractC3638.f11333;
        setBackground(rippleDrawable);
        m822();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m822() {
        C0686 c0686;
        if (TextUtils.isEmpty(getText()) || (c0686 = this.f744) == null) {
            return;
        }
        int iM2182 = (int) (c0686.m2182() + c0686.f2614 + c0686.f2611);
        C0686 c0687 = this.f744;
        int iM2181 = (int) (c0687.m2181() + c0687.f2607 + c0687.f2610);
        if (this.f745 != null) {
            Rect rect = new Rect();
            this.f745.getPadding(rect);
            iM2181 += rect.left;
            iM2182 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC3638.f11333;
        setPaddingRelative(iM2181, paddingTop, iM2182, paddingBottom);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m823() {
        TextPaint paint = getPaint();
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            paint.drawableState = c0686.getState();
        }
        C2963 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4972(getContext(), paint, this.f762);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2202(z);
        }
        m820();
    }

    public void setCheckedIconVisible(boolean z) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2189(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            c0686.m2194(z);
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
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            Context context2 = c0686.f2615;
            c0686.f2621.m4977(new C2963(context2, i), context2);
        }
        m823();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0686 c0686 = this.f744;
        if (c0686 != null) {
            Context context = c0686.f2615;
            c0686.f2621.m4977(new C2963(context, i), context);
        }
        m823();
    }
}
