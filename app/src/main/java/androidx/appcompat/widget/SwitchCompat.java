package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import p000.AbstractC1105;
import p000.AbstractC1460;
import p000.AbstractC2203;
import p000.AbstractC2470;
import p000.AbstractC2918;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.AbstractC3578;
import p000.ActionModeCallbackC2913;
import p000.C0149;
import p000.C0219;
import p000.C0232;
import p000.C0243;
import p000.C0583;
import p000.C1142;
import p000.C1180;
import p000.C3566;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public static final C0583 f103 = new C0583(Float.class, "thumbPos", 5);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static final int[] f104 = {16842912};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Drawable f105;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Drawable f110;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public PorterDuff.Mode f112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public CharSequence f119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public CharSequence f120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public CharSequence f121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public CharSequence f122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int f125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public float f126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public float f127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final VelocityTracker f128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final int f129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public float f130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public boolean f138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final TextPaint f139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final ColorStateList f140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public StaticLayout f141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public StaticLayout f142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final C0149 f143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public ObjectAnimator f144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public C0219 f145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public C1180 f146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public final Rect f147;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, me.hd.wauxv.R.attr.switchStyle);
    }

    private C0219 getEmojiTextViewHelper() {
        if (this.f145 == null) {
            this.f145 = new C0219(this);
        }
        return this.f145;
    }

    private boolean getTargetCheckedState() {
        return this.f130 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f130 : this.f130) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f110;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f147;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f105;
        Rect rectM2675 = drawable2 != null ? AbstractC1105.m2675(drawable2) : AbstractC1105.f4136;
        return ((((this.f131 - this.f133) - rect.left) - rect.right) - rectM2675.left) - rectM2675.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f121 = charSequence;
        TransformationMethod transformationMethodMo2769 = ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2769(this.f143);
        if (transformationMethodMo2769 != null) {
            charSequence = transformationMethodMo2769.getTransformation(charSequence, this);
        }
        this.f122 = charSequence;
        this.f142 = null;
        if (this.f123) {
            m30();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f119 = charSequence;
        TransformationMethod transformationMethodMo2769 = ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2769(this.f143);
        if (transformationMethodMo2769 != null) {
            charSequence = transformationMethodMo2769.getTransformation(charSequence, this);
        }
        this.f120 = charSequence;
        this.f141 = null;
        if (this.f123) {
            m30();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f134;
        int i4 = this.f135;
        int i5 = this.f136;
        int i6 = this.f137;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f105;
        Rect rectM2675 = drawable != null ? AbstractC1105.m2675(drawable) : AbstractC1105.f4136;
        Drawable drawable2 = this.f110;
        Rect rect = this.f147;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM2675 != null) {
                int i8 = rectM2675.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM2675.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM2675.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM2675.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f110.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f110.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f105;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f133 + rect.right;
            this.f105.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f105;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f110;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f105;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f110;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f131;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f117 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f131;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f117 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2913 ? ((ActionModeCallbackC2913) customSelectionActionModeCallback).f9362 : customSelectionActionModeCallback;
    }

    public boolean getShowText() {
        return this.f123;
    }

    public boolean getSplitTrack() {
        return this.f118;
    }

    public int getSwitchMinWidth() {
        return this.f116;
    }

    public int getSwitchPadding() {
        return this.f117;
    }

    public CharSequence getTextOff() {
        return this.f121;
    }

    public CharSequence getTextOn() {
        return this.f119;
    }

    public Drawable getThumbDrawable() {
        return this.f105;
    }

    public final float getThumbPosition() {
        return this.f130;
    }

    public int getThumbTextPadding() {
        return this.f115;
    }

    public ColorStateList getThumbTintList() {
        return this.f106;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f107;
    }

    public Drawable getTrackDrawable() {
        return this.f110;
    }

    public ColorStateList getTrackTintList() {
        return this.f111;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f112;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f105;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f110;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f144;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f144.end();
        this.f144 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f104);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f110;
        Rect rect = this.f147;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f135;
        int i2 = this.f137;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f105;
        if (drawable != null) {
            if (!this.f118 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM2675 = AbstractC1105.m2675(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM2675.left;
                rect.right -= rectM2675.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f141 : this.f142;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f139;
            ColorStateList colorStateList = this.f140;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f119 : this.f121;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f105 != null) {
            Drawable drawable = this.f110;
            Rect rect = this.f147;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM2675 = AbstractC1105.m2675(this.f105);
            iMax = Math.max(0, rectM2675.left - rect.left);
            iMax2 = Math.max(0, rectM2675.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f131 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f131) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f132;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f132 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f132;
        }
        this.f134 = paddingLeft;
        this.f135 = paddingTop;
        this.f137 = height;
        this.f136 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f123) {
            StaticLayout staticLayout = this.f141;
            TextPaint textPaint = this.f139;
            if (staticLayout == null) {
                CharSequence charSequence = this.f120;
                this.f141 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f142 == null) {
                CharSequence charSequence2 = this.f122;
                this.f142 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f105;
        Rect rect = this.f147;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f105.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f105.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f123) {
            iMax = (this.f115 * 2) + Math.max(this.f141.getWidth(), this.f142.getWidth());
        } else {
            iMax = 0;
        }
        this.f133 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f110;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f110.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f105;
        if (drawable3 != null) {
            Rect rectM2675 = AbstractC1105.m2675(drawable3);
            iMax2 = Math.max(iMax2, rectM2675.left);
            iMax3 = Math.max(iMax3, rectM2675.right);
        }
        int iMax4 = this.f138 ? Math.max(this.f116, (this.f133 * 2) + iMax2 + iMax3) : this.f116;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f131 = iMax4;
        this.f132 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f119 : this.f121;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.f128;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f125;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f124 == 2) {
                    this.f124 = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f129) {
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f124 = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f124;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.f126) > f3 || Math.abs(y - this.f127) > f3) {
                        this.f124 = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f126 = x;
                        this.f127 = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.f126;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.f130;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.f126 = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f124 == 2) {
                    this.f124 = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (false) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f129) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (false) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f124 = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f105 != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f105;
                Rect rect = this.f147;
                drawable.getPadding(rect);
                int i3 = this.f135 - i;
                int i4 = (this.f134 + thumbOffset) - i;
                int i5 = this.f133 + i4 + rect.left + rect.right + i;
                int i6 = this.f137 + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f124 = 1;
                    this.f126 = x3;
                    this.f127 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2767(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f119;
                if (string == null) {
                    string = getResources().getString(me.hd.wauxv.R.string.abc_capital_on);
                }
                Object obj = string;
                Field field = AbstractC3578.f11184;
                new C3566(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m3679(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f121;
            if (string2 == null) {
                string2 = getResources().getString(me.hd.wauxv.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            Field field2 = AbstractC3578.f11184;
            new C3566(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m3679(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f144;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f103, zIsChecked ? 1.0f : 0.0f);
        this.f144 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f144.setAutoCancel(true);
        this.f144.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3453.m5014(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1255(z);
        setTextOnInternal(this.f119);
        setTextOffInternal(this.f121);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f138 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2765(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f123 != z) {
            this.f123 = z;
            requestLayout();
            if (z) {
                m30();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f118 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f116 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f117 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f139;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f121;
        if (string == null) {
            string = getResources().getString(me.hd.wauxv.R.string.abc_capital_off);
        }
        Field field = AbstractC3578.f11184;
        new C3566(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m3679(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f119;
        if (string == null) {
            string = getResources().getString(me.hd.wauxv.R.string.abc_capital_on);
        }
        Field field = AbstractC3578.f11184;
        new C3566(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m3679(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f105;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f105 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f130 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f115 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f106 = colorStateList;
        this.f108 = true;
        m27();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f107 = mode;
        this.f109 = true;
        m27();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f110;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f110 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC3471.m5076(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f111 = colorStateList;
        this.f113 = true;
        m28();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f112 = mode;
        this.f114 = true;
        m28();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f105 || drawable == this.f110;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m27() {
        Drawable drawable = this.f105;
        if (drawable != null) {
            if (this.f108 || this.f109) {
                Drawable drawableMutate = drawable.mutate();
                this.f105 = drawableMutate;
                if (this.f108) {
                    drawableMutate.setTintList(this.f106);
                }
                if (this.f109) {
                    this.f105.setTintMode(this.f107);
                }
                if (this.f105.isStateful()) {
                    this.f105.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m28() {
        Drawable drawable = this.f110;
        if (drawable != null) {
            if (this.f113 || this.f114) {
                Drawable drawableMutate = drawable.mutate();
                this.f110 = drawableMutate;
                if (this.f113) {
                    drawableMutate.setTintList(this.f111);
                }
                if (this.f114) {
                    this.f110.setTintMode(this.f112);
                }
                if (this.f110.isStateful()) {
                    this.f110.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m29() {
        setTextOnInternal(this.f119);
        setTextOffInternal(this.f121);
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m30() {
        if (this.f146 == null && ((AbstractC1460) this.f145.f1347.f1049).mo2766() && C1142.f4236 != null) {
            C1142 c1142M2753 = C1142.m2753();
            int iM2754 = c1142M2753.m2754();
            if (iM2754 == 3 || iM2754 == 0) {
                C1180 c1180 = new C1180(this);
                this.f146 = c1180;
                c1142M2753.m2758(c1180);
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.f106 = null;
        this.f107 = null;
        this.f108 = false;
        this.f109 = false;
        this.f111 = null;
        this.f112 = null;
        this.f113 = false;
        this.f114 = false;
        this.f128 = VelocityTracker.obtain();
        this.f138 = true;
        this.f147 = new Rect();
        AbstractC2918.m4917(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f139 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC2470.f7894;
        C0243 c0243M1307 = C0243.m1307(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        AbstractC3578.m5176(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableM1320 = c0243M1307.m1320(2);
        this.f105 = drawableM1320;
        if (drawableM1320 != null) {
            drawableM1320.setCallback(this);
        }
        Drawable drawableM1321 = c0243M1307.m1320(11);
        this.f110 = drawableM1321;
        if (drawableM1321 != null) {
            drawableM1321.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f123 = typedArray.getBoolean(3, true);
        this.f115 = typedArray.getDimensionPixelSize(8, 0);
        this.f116 = typedArray.getDimensionPixelSize(5, 0);
        this.f117 = typedArray.getDimensionPixelSize(6, 0);
        this.f118 = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM1319 = c0243M1307.m1319(9);
        if (colorStateListM1319 != null) {
            this.f106 = colorStateListM1319;
            this.f108 = true;
        }
        PorterDuff.Mode modeM2676 = AbstractC1105.m2676(typedArray.getInt(10, -1), null);
        if (this.f107 != modeM2676) {
            this.f107 = modeM2676;
            this.f109 = true;
        }
        if (this.f108 || this.f109) {
            m27();
        }
        ColorStateList colorStateListM13110 = c0243M1307.m1319(12);
        if (colorStateListM13110 != null) {
            this.f111 = colorStateListM13110;
            this.f113 = true;
        }
        PorterDuff.Mode modeM2677 = AbstractC1105.m2676(typedArray.getInt(13, -1), null);
        if (this.f112 != modeM2677) {
            this.f112 = modeM2677;
            this.f114 = true;
        }
        if (this.f113 || this.f114) {
            m28();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC2470.f7895);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC2203.m4030(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f140 = colorStateList;
            } else {
                this.f140 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0149 c0149 = new C0149();
                c0149.f1158 = context2.getResources().getConfiguration().locale;
                this.f143 = c0149;
            } else {
                this.f143 = null;
            }
            setTextOnInternal(this.f119);
            setTextOffInternal(this.f121);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C0232(this).m1295(attributeSet, i);
        c0243M1307.m1329();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f125 = viewConfiguration.getScaledTouchSlop();
        this.f129 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m1254(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
