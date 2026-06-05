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
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.AbstractC1246feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2008feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3252feyxiexzfUjhhgtg;
import p000.ActionModeCallbackC1976Ujhhgtgfeyxiexzf;
import p000.C1909Ujhhgtgfeyxiexzf;
import p000.C2342Ujhhgtgfeyxiexzf;
import p000.C2353Ujhhgtgfeyxiexzf;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2700Ujhhgtgfeyxiexzf;
import p000.C3020feyxiexzfUjhhgtg;
import p000.C3323feyxiexzfUjhhgtg;
import p000.C3391Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C2700Ujhhgtgfeyxiexzf f104feyxiexzfUjhhgtg = new C2700Ujhhgtgfeyxiexzf(Float.class, "thumbPos", 5);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static final int[] f105feyxiexzfUjhhgtg = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Drawable f106Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ColorStateList f107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public PorterDuff.Mode f108Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f110Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Drawable f111Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f112Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PorterDuff.Mode f113Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f114Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f115Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f116Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f117Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f118Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public CharSequence f120Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CharSequence f121Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public CharSequence f122Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public CharSequence f123Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f124Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f125Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f126Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f127Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public float f128feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final VelocityTracker f129feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f130feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f131feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f132feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f133feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f134feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public int f135feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f136feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f137feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public int f138feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f139feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final TextPaint f140feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final ColorStateList f141feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public StaticLayout f142feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public StaticLayout f143feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final C3020feyxiexzfUjhhgtg f144feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public ObjectAnimator f145feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public C2342Ujhhgtgfeyxiexzf f146feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public C3323feyxiexzfUjhhgtg f147feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final Rect f148feyxiexzfUjhhgtg;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, me.hd.wauxv.R.attr.switchStyle);
    }

    private C2342Ujhhgtgfeyxiexzf getEmojiTextViewHelper() {
        if (this.f146feyxiexzfUjhhgtg == null) {
            this.f146feyxiexzfUjhhgtg = new C2342Ujhhgtgfeyxiexzf(this);
        }
        return this.f146feyxiexzfUjhhgtg;
    }

    private boolean getTargetCheckedState() {
        return this.f131feyxiexzfUjhhgtg > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f131feyxiexzfUjhhgtg : this.f131feyxiexzfUjhhgtg) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f111Ujhhgtgfeyxiexzf;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f148feyxiexzfUjhhgtg;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f106Ujhhgtgfeyxiexzf;
        Rect rectM4757Ujhhgtgfeyxiexzf = drawable2 != null ? AbstractC3252feyxiexzfUjhhgtg.m4757Ujhhgtgfeyxiexzf(drawable2) : AbstractC3252feyxiexzfUjhhgtg.f10199Ujhhgtgfeyxiexzf;
        return ((((this.f132feyxiexzfUjhhgtg - this.f134feyxiexzfUjhhgtg) - rect.left) - rect.right) - rectM4757Ujhhgtgfeyxiexzf.left) - rectM4757Ujhhgtgfeyxiexzf.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f122Ujhhgtgfeyxiexzf = charSequence;
        TransformationMethod transformationMethodMo2779Ujhhgtgfeyxiexzf = ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2779Ujhhgtgfeyxiexzf(this.f144feyxiexzfUjhhgtg);
        if (transformationMethodMo2779Ujhhgtgfeyxiexzf != null) {
            charSequence = transformationMethodMo2779Ujhhgtgfeyxiexzf.getTransformation(charSequence, this);
        }
        this.f123Ujhhgtgfeyxiexzf = charSequence;
        this.f143feyxiexzfUjhhgtg = null;
        if (this.f124Ujhhgtgfeyxiexzf) {
            m30Ujhhgtgfeyxiexzf();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f120Ujhhgtgfeyxiexzf = charSequence;
        TransformationMethod transformationMethodMo2779Ujhhgtgfeyxiexzf = ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2779Ujhhgtgfeyxiexzf(this.f144feyxiexzfUjhhgtg);
        if (transformationMethodMo2779Ujhhgtgfeyxiexzf != null) {
            charSequence = transformationMethodMo2779Ujhhgtgfeyxiexzf.getTransformation(charSequence, this);
        }
        this.f121Ujhhgtgfeyxiexzf = charSequence;
        this.f142feyxiexzfUjhhgtg = null;
        if (this.f124Ujhhgtgfeyxiexzf) {
            m30Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f135feyxiexzfUjhhgtg;
        int i4 = this.f136feyxiexzfUjhhgtg;
        int i5 = this.f137feyxiexzfUjhhgtg;
        int i6 = this.f138feyxiexzfUjhhgtg;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        Rect rectM4757Ujhhgtgfeyxiexzf = drawable != null ? AbstractC3252feyxiexzfUjhhgtg.m4757Ujhhgtgfeyxiexzf(drawable) : AbstractC3252feyxiexzfUjhhgtg.f10199Ujhhgtgfeyxiexzf;
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
        Rect rect = this.f148feyxiexzfUjhhgtg;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM4757Ujhhgtgfeyxiexzf != null) {
                int i8 = rectM4757Ujhhgtgfeyxiexzf.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM4757Ujhhgtgfeyxiexzf.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM4757Ujhhgtgfeyxiexzf.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM4757Ujhhgtgfeyxiexzf.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f111Ujhhgtgfeyxiexzf.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f111Ujhhgtgfeyxiexzf.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f106Ujhhgtgfeyxiexzf;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f134feyxiexzfUjhhgtg + rect.right;
            this.f106Ujhhgtgfeyxiexzf.setBounds(i15, i4, i16, i6);
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
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
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
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f132feyxiexzfUjhhgtg;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f118Ujhhgtgfeyxiexzf : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f132feyxiexzfUjhhgtg;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f118Ujhhgtgfeyxiexzf : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC1976Ujhhgtgfeyxiexzf ? ((ActionModeCallbackC1976Ujhhgtgfeyxiexzf) customSelectionActionModeCallback).f6482Ujhhgtgfeyxiexzf : customSelectionActionModeCallback;
    }

    public boolean getShowText() {
        return this.f124Ujhhgtgfeyxiexzf;
    }

    public boolean getSplitTrack() {
        return this.f119Ujhhgtgfeyxiexzf;
    }

    public int getSwitchMinWidth() {
        return this.f117Ujhhgtgfeyxiexzf;
    }

    public int getSwitchPadding() {
        return this.f118Ujhhgtgfeyxiexzf;
    }

    public CharSequence getTextOff() {
        return this.f122Ujhhgtgfeyxiexzf;
    }

    public CharSequence getTextOn() {
        return this.f120Ujhhgtgfeyxiexzf;
    }

    public Drawable getThumbDrawable() {
        return this.f106Ujhhgtgfeyxiexzf;
    }

    public final float getThumbPosition() {
        return this.f131feyxiexzfUjhhgtg;
    }

    public int getThumbTextPadding() {
        return this.f116Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getThumbTintList() {
        return this.f107Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f108Ujhhgtgfeyxiexzf;
    }

    public Drawable getTrackDrawable() {
        return this.f111Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getTrackTintList() {
        return this.f112Ujhhgtgfeyxiexzf;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f113Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f145feyxiexzfUjhhgtg;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f145feyxiexzfUjhhgtg.end();
        this.f145feyxiexzfUjhhgtg = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f105feyxiexzfUjhhgtg);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f111Ujhhgtgfeyxiexzf;
        Rect rect = this.f148feyxiexzfUjhhgtg;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f136feyxiexzfUjhhgtg;
        int i2 = this.f138feyxiexzfUjhhgtg;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f106Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            if (!this.f119Ujhhgtgfeyxiexzf || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM4757Ujhhgtgfeyxiexzf = AbstractC3252feyxiexzfUjhhgtg.m4757Ujhhgtgfeyxiexzf(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM4757Ujhhgtgfeyxiexzf.left;
                rect.right -= rectM4757Ujhhgtgfeyxiexzf.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f142feyxiexzfUjhhgtg : this.f143feyxiexzfUjhhgtg;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f140feyxiexzfUjhhgtg;
            ColorStateList colorStateList = this.f141feyxiexzfUjhhgtg;
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
            CharSequence charSequence = isChecked() ? this.f120Ujhhgtgfeyxiexzf : this.f122Ujhhgtgfeyxiexzf;
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
        if (this.f106Ujhhgtgfeyxiexzf != null) {
            Drawable drawable = this.f111Ujhhgtgfeyxiexzf;
            Rect rect = this.f148feyxiexzfUjhhgtg;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM4757Ujhhgtgfeyxiexzf = AbstractC3252feyxiexzfUjhhgtg.m4757Ujhhgtgfeyxiexzf(this.f106Ujhhgtgfeyxiexzf);
            iMax = Math.max(0, rectM4757Ujhhgtgfeyxiexzf.left - rect.left);
            iMax2 = Math.max(0, rectM4757Ujhhgtgfeyxiexzf.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f132feyxiexzfUjhhgtg + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f132feyxiexzfUjhhgtg) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f133feyxiexzfUjhhgtg;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f133feyxiexzfUjhhgtg + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f133feyxiexzfUjhhgtg;
        }
        this.f135feyxiexzfUjhhgtg = paddingLeft;
        this.f136feyxiexzfUjhhgtg = paddingTop;
        this.f138feyxiexzfUjhhgtg = height;
        this.f137feyxiexzfUjhhgtg = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f124Ujhhgtgfeyxiexzf) {
            StaticLayout staticLayout = this.f142feyxiexzfUjhhgtg;
            TextPaint textPaint = this.f140feyxiexzfUjhhgtg;
            if (staticLayout == null) {
                CharSequence charSequence = this.f121Ujhhgtgfeyxiexzf;
                this.f142feyxiexzfUjhhgtg = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f143feyxiexzfUjhhgtg == null) {
                CharSequence charSequence2 = this.f123Ujhhgtgfeyxiexzf;
                this.f143feyxiexzfUjhhgtg = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        Rect rect = this.f148feyxiexzfUjhhgtg;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f106Ujhhgtgfeyxiexzf.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f106Ujhhgtgfeyxiexzf.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f124Ujhhgtgfeyxiexzf) {
            iMax = (this.f116Ujhhgtgfeyxiexzf * 2) + Math.max(this.f142feyxiexzfUjhhgtg.getWidth(), this.f143feyxiexzfUjhhgtg.getWidth());
        } else {
            iMax = 0;
        }
        this.f134feyxiexzfUjhhgtg = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f111Ujhhgtgfeyxiexzf.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f106Ujhhgtgfeyxiexzf;
        if (drawable3 != null) {
            Rect rectM4757Ujhhgtgfeyxiexzf = AbstractC3252feyxiexzfUjhhgtg.m4757Ujhhgtgfeyxiexzf(drawable3);
            iMax2 = Math.max(iMax2, rectM4757Ujhhgtgfeyxiexzf.left);
            iMax3 = Math.max(iMax3, rectM4757Ujhhgtgfeyxiexzf.right);
        }
        int iMax4 = this.f139feyxiexzfUjhhgtg ? Math.max(this.f117Ujhhgtgfeyxiexzf, (this.f134feyxiexzfUjhhgtg * 2) + iMax2 + iMax3) : this.f117Ujhhgtgfeyxiexzf;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f132feyxiexzfUjhhgtg = iMax4;
        this.f133feyxiexzfUjhhgtg = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f120Ujhhgtgfeyxiexzf : this.f122Ujhhgtgfeyxiexzf;
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
        VelocityTracker velocityTracker = this.f129feyxiexzfUjhhgtg;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f126Ujhhgtgfeyxiexzf;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f125Ujhhgtgfeyxiexzf == 2) {
                    this.f125Ujhhgtgfeyxiexzf = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f130feyxiexzfUjhhgtg) {
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
                this.f125Ujhhgtgfeyxiexzf = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f125Ujhhgtgfeyxiexzf;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.f127Ujhhgtgfeyxiexzf) > f3 || Math.abs(y - this.f128feyxiexzfUjhhgtg) > f3) {
                        this.f125Ujhhgtgfeyxiexzf = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f127Ujhhgtgfeyxiexzf = x;
                        this.f128feyxiexzfUjhhgtg = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.f127Ujhhgtgfeyxiexzf;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.f131feyxiexzfUjhhgtg;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.f127Ujhhgtgfeyxiexzf = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f125Ujhhgtgfeyxiexzf == 2) {
                    this.f125Ujhhgtgfeyxiexzf = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f130feyxiexzfUjhhgtg) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
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
                this.f125Ujhhgtgfeyxiexzf = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f106Ujhhgtgfeyxiexzf != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
                Rect rect = this.f148feyxiexzfUjhhgtg;
                drawable.getPadding(rect);
                int i3 = this.f136feyxiexzfUjhhgtg - i;
                int i4 = (this.f135feyxiexzfUjhhgtg + thumbOffset) - i;
                int i5 = this.f134feyxiexzfUjhhgtg + i4 + rect.left + rect.right + i;
                int i6 = this.f138feyxiexzfUjhhgtg + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f125Ujhhgtgfeyxiexzf = 1;
                    this.f127Ujhhgtgfeyxiexzf = x3;
                    this.f128feyxiexzfUjhhgtg = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2777Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f120Ujhhgtgfeyxiexzf;
                if (string == null) {
                    string = getResources().getString(me.hd.wauxv.R.string.abc_capital_on);
                }
                Object obj = string;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                new C1909Ujhhgtgfeyxiexzf(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m1231Ujhhgtgfeyxiexzf(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f122Ujhhgtgfeyxiexzf;
            if (string2 == null) {
                string2 = getResources().getString(me.hd.wauxv.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            new C1909Ujhhgtgfeyxiexzf(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m1231Ujhhgtgfeyxiexzf(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f145feyxiexzfUjhhgtg;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f104feyxiexzfUjhhgtg, zIsChecked ? 1.0f : 0.0f);
        this.f145feyxiexzfUjhhgtg = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f145feyxiexzfUjhhgtg.setAutoCancel(true);
        this.f145feyxiexzfUjhhgtg.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1265feyxiexzfUjhhgtg.m2841Ujhhgtgfeyxiexzf(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m3533Ujhhgtgfeyxiexzf(z);
        setTextOnInternal(this.f120Ujhhgtgfeyxiexzf);
        setTextOffInternal(this.f122Ujhhgtgfeyxiexzf);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f139feyxiexzfUjhhgtg = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2775Ujhhgtgfeyxiexzf(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f124Ujhhgtgfeyxiexzf != z) {
            this.f124Ujhhgtgfeyxiexzf = z;
            requestLayout();
            if (z) {
                m30Ujhhgtgfeyxiexzf();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f119Ujhhgtgfeyxiexzf = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f117Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f118Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f140feyxiexzfUjhhgtg;
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
        Object string = this.f122Ujhhgtgfeyxiexzf;
        if (string == null) {
            string = getResources().getString(me.hd.wauxv.R.string.abc_capital_off);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        new C1909Ujhhgtgfeyxiexzf(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m1231Ujhhgtgfeyxiexzf(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f120Ujhhgtgfeyxiexzf;
        if (string == null) {
            string = getResources().getString(me.hd.wauxv.R.string.abc_capital_on);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        new C1909Ujhhgtgfeyxiexzf(me.hd.wauxv.R.id.tag_state_description, CharSequence.class, 64, 30, 1).m1231Ujhhgtgfeyxiexzf(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f106Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f106Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f131feyxiexzfUjhhgtg = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f116Ujhhgtgfeyxiexzf = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f107Ujhhgtgfeyxiexzf = colorStateList;
        this.f109Ujhhgtgfeyxiexzf = true;
        m27Ujhhgtgfeyxiexzf();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f108Ujhhgtgfeyxiexzf = mode;
        this.f110Ujhhgtgfeyxiexzf = true;
        m27Ujhhgtgfeyxiexzf();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f111Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f111Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f112Ujhhgtgfeyxiexzf = colorStateList;
        this.f114Ujhhgtgfeyxiexzf = true;
        m28Ujhhgtgfeyxiexzf();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f113Ujhhgtgfeyxiexzf = mode;
        this.f115Ujhhgtgfeyxiexzf = true;
        m28Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f106Ujhhgtgfeyxiexzf || drawable == this.f111Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m27Ujhhgtgfeyxiexzf() {
        Drawable drawable = this.f106Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            if (this.f109Ujhhgtgfeyxiexzf || this.f110Ujhhgtgfeyxiexzf) {
                Drawable drawableMutate = drawable.mutate();
                this.f106Ujhhgtgfeyxiexzf = drawableMutate;
                if (this.f109Ujhhgtgfeyxiexzf) {
                    drawableMutate.setTintList(this.f107Ujhhgtgfeyxiexzf);
                }
                if (this.f110Ujhhgtgfeyxiexzf) {
                    this.f106Ujhhgtgfeyxiexzf.setTintMode(this.f108Ujhhgtgfeyxiexzf);
                }
                if (this.f106Ujhhgtgfeyxiexzf.isStateful()) {
                    this.f106Ujhhgtgfeyxiexzf.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m28Ujhhgtgfeyxiexzf() {
        Drawable drawable = this.f111Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            if (this.f114Ujhhgtgfeyxiexzf || this.f115Ujhhgtgfeyxiexzf) {
                Drawable drawableMutate = drawable.mutate();
                this.f111Ujhhgtgfeyxiexzf = drawableMutate;
                if (this.f114Ujhhgtgfeyxiexzf) {
                    drawableMutate.setTintList(this.f112Ujhhgtgfeyxiexzf);
                }
                if (this.f115Ujhhgtgfeyxiexzf) {
                    this.f111Ujhhgtgfeyxiexzf.setTintMode(this.f113Ujhhgtgfeyxiexzf);
                }
                if (this.f111Ujhhgtgfeyxiexzf.isStateful()) {
                    this.f111Ujhhgtgfeyxiexzf.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m29Ujhhgtgfeyxiexzf() {
        setTextOnInternal(this.f120Ujhhgtgfeyxiexzf);
        setTextOffInternal(this.f122Ujhhgtgfeyxiexzf);
        requestLayout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m30Ujhhgtgfeyxiexzf() {
        if (this.f147feyxiexzfUjhhgtg == null && ((AbstractC1246feyxiexzfUjhhgtg) this.f146feyxiexzfUjhhgtg.f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2776Ujhhgtgfeyxiexzf() && C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) {
            C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
            int iM4908Ujhhgtgfeyxiexzf = c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4908Ujhhgtgfeyxiexzf();
            if (iM4908Ujhhgtgfeyxiexzf == 3 || iM4908Ujhhgtgfeyxiexzf == 0) {
                C3323feyxiexzfUjhhgtg c3323feyxiexzfUjhhgtg = new C3323feyxiexzfUjhhgtg(this);
                this.f147feyxiexzfUjhhgtg = c3323feyxiexzfUjhhgtg;
                c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4912Ujhhgtgfeyxiexzf(c3323feyxiexzfUjhhgtg);
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.f107Ujhhgtgfeyxiexzf = null;
        this.f108Ujhhgtgfeyxiexzf = null;
        this.f109Ujhhgtgfeyxiexzf = false;
        this.f110Ujhhgtgfeyxiexzf = false;
        this.f112Ujhhgtgfeyxiexzf = null;
        this.f113Ujhhgtgfeyxiexzf = null;
        this.f114Ujhhgtgfeyxiexzf = false;
        this.f115Ujhhgtgfeyxiexzf = false;
        this.f129feyxiexzfUjhhgtg = VelocityTracker.obtain();
        this.f139feyxiexzfUjhhgtg = true;
        this.f148feyxiexzfUjhhgtg = new Rect();
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f140feyxiexzfUjhhgtg = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3175Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableM3602Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(2);
        this.f106Ujhhgtgfeyxiexzf = drawableM3602Ujhhgtgfeyxiexzf;
        if (drawableM3602Ujhhgtgfeyxiexzf != null) {
            drawableM3602Ujhhgtgfeyxiexzf.setCallback(this);
        }
        Drawable drawableM3602Ujhhgtgfeyxiexzf2 = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(11);
        this.f111Ujhhgtgfeyxiexzf = drawableM3602Ujhhgtgfeyxiexzf2;
        if (drawableM3602Ujhhgtgfeyxiexzf2 != null) {
            drawableM3602Ujhhgtgfeyxiexzf2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f124Ujhhgtgfeyxiexzf = typedArray.getBoolean(3, true);
        this.f116Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(8, 0);
        this.f117Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(5, 0);
        this.f118Ujhhgtgfeyxiexzf = typedArray.getDimensionPixelSize(6, 0);
        this.f119Ujhhgtgfeyxiexzf = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM3601Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(9);
        if (colorStateListM3601Ujhhgtgfeyxiexzf != null) {
            this.f107Ujhhgtgfeyxiexzf = colorStateListM3601Ujhhgtgfeyxiexzf;
            this.f109Ujhhgtgfeyxiexzf = true;
        }
        PorterDuff.Mode modeM4758Ujhhgtgfeyxiexzf = AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArray.getInt(10, -1), null);
        if (this.f108Ujhhgtgfeyxiexzf != modeM4758Ujhhgtgfeyxiexzf) {
            this.f108Ujhhgtgfeyxiexzf = modeM4758Ujhhgtgfeyxiexzf;
            this.f110Ujhhgtgfeyxiexzf = true;
        }
        if (this.f109Ujhhgtgfeyxiexzf || this.f110Ujhhgtgfeyxiexzf) {
            m27Ujhhgtgfeyxiexzf();
        }
        ColorStateList colorStateListM3601Ujhhgtgfeyxiexzf2 = c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(12);
        if (colorStateListM3601Ujhhgtgfeyxiexzf2 != null) {
            this.f112Ujhhgtgfeyxiexzf = colorStateListM3601Ujhhgtgfeyxiexzf2;
            this.f114Ujhhgtgfeyxiexzf = true;
        }
        PorterDuff.Mode modeM4758Ujhhgtgfeyxiexzf2 = AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArray.getInt(13, -1), null);
        if (this.f113Ujhhgtgfeyxiexzf != modeM4758Ujhhgtgfeyxiexzf2) {
            this.f113Ujhhgtgfeyxiexzf = modeM4758Ujhhgtgfeyxiexzf2;
            this.f115Ujhhgtgfeyxiexzf = true;
        }
        if (this.f114Ujhhgtgfeyxiexzf || this.f115Ujhhgtgfeyxiexzf) {
            m28Ujhhgtgfeyxiexzf();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0801feyxiexzfUjhhgtg.f3176Ujhhgtgfeyxiexzf);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f141feyxiexzfUjhhgtg = colorStateList;
            } else {
                this.f141feyxiexzfUjhhgtg = getTextColors();
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
                C3020feyxiexzfUjhhgtg c3020feyxiexzfUjhhgtg = new C3020feyxiexzfUjhhgtg();
                c3020feyxiexzfUjhhgtg.f9385Ujhhgtgfeyxiexzf = context2.getResources().getConfiguration().locale;
                this.f144feyxiexzfUjhhgtg = c3020feyxiexzfUjhhgtg;
            } else {
                this.f144feyxiexzfUjhhgtg = null;
            }
            setTextOnInternal(this.f120Ujhhgtgfeyxiexzf);
            setTextOffInternal(this.f122Ujhhgtgfeyxiexzf);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C2353Ujhhgtgfeyxiexzf(this).m3562Ujhhgtgfeyxiexzf(attributeSet, i);
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f126Ujhhgtgfeyxiexzf = viewConfiguration.getScaledTouchSlop();
        this.f130feyxiexzfUjhhgtg = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m3532Ujhhgtgfeyxiexzf(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
