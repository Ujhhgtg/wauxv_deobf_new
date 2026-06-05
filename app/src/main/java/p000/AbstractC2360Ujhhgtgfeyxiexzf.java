package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2360Ujhhgtgfeyxiexzf extends Button {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7688Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2353Ujhhgtgfeyxiexzf f7689Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C2342Ujhhgtgfeyxiexzf f7690Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2360Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7688Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, R.attr.materialButtonStyle);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = new C2353Ujhhgtgfeyxiexzf(this);
        this.f7689Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3562Ujhhgtgfeyxiexzf(attributeSet, R.attr.materialButtonStyle);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        getEmojiTextViewHelper().m3532Ujhhgtgfeyxiexzf(attributeSet, R.attr.materialButtonStyle);
    }

    private C2342Ujhhgtgfeyxiexzf getEmojiTextViewHelper() {
        if (this.f7690Ujhhgtgfeyxiexzf == null) {
            this.f7690Ujhhgtgfeyxiexzf = new C2342Ujhhgtgfeyxiexzf(this);
        }
        return this.f7690Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC1976Ujhhgtgfeyxiexzf ? ((ActionModeCallbackC1976Ujhhgtgfeyxiexzf) customSelectionActionModeCallback).f6482Ujhhgtgfeyxiexzf : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7689Ujhhgtgfeyxiexzf.m3560Ujhhgtgfeyxiexzf();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7689Ujhhgtgfeyxiexzf.m3561Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2777Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1265feyxiexzfUjhhgtg.m2841Ujhhgtgfeyxiexzf(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m3533Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2775Ujhhgtgfeyxiexzf(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.f7670Ujhhgtgfeyxiexzf.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7688Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3564Ujhhgtgfeyxiexzf(colorStateList);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3565Ujhhgtgfeyxiexzf(mode);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7689Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3563Ujhhgtgfeyxiexzf(context, i);
        }
    }
}
