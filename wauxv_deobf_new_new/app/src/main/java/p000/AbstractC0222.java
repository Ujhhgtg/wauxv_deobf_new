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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᤝᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222 extends Button {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0154 f1391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0242 f1392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0229 f1393;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0222(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        AbstractC3460.m4988(context);
        AbstractC2977.m4979(this, getContext());
        C0154 c0154 = new C0154(this);
        this.f1391 = c0154;
        c0154.m1321(attributeSet, R.attr.materialButtonStyle);
        C0242 c0242 = new C0242(this);
        this.f1392 = c0242;
        c0242.m1441(attributeSet, R.attr.materialButtonStyle);
        c0242.m1438();
        getEmojiTextViewHelper().m1400(attributeSet, R.attr.materialButtonStyle);
    }

    private C0229 getEmojiTextViewHelper() {
        if (this.f1393 == null) {
            this.f1393 = new C0229(this);
        }
        return this.f1393;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            c0154.m1300();
        }
        C0242 c0242 = this.f1392;
        if (c0242 != null) {
            c0242.m1438();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2972 ? ((ActionModeCallbackC2972) customSelectionActionModeCallback).f9529 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            return c0154.m1318();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            return c0154.m1319();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1392.m1439();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1392.m1440();
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
        C0242 c0242 = this.f1392;
        if (c0242 != null) {
            c0242.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2911(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            c0154.m1323();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            c0154.m1324(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0972.m2613(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1401(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2909(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0242 c0242 = this.f1392;
        if (c0242 != null) {
            c0242.f1443.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            c0154.m1332(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0154 c0154 = this.f1391;
        if (c0154 != null) {
            c0154.m1333(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0242 c0242 = this.f1392;
        c0242.m1443(colorStateList);
        c0242.m1438();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0242 c0242 = this.f1392;
        c0242.m1444(mode);
        c0242.m1438();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0242 c0242 = this.f1392;
        if (c0242 != null) {
            c0242.m1442(context, i);
        }
    }
}
