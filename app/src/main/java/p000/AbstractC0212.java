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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212 extends Button {

    public final C0146 f1317;

    public final C0232 f1318;

    public C0219 f1319;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0212(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        AbstractC3401.m4926(context);
        AbstractC2918.m4917(this, getContext());
        C0146 c0146 = new C0146(this);
        this.f1317 = c0146;
        c0146.m1175(attributeSet, R.attr.materialButtonStyle);
        C0232 c0232 = new C0232(this);
        this.f1318 = c0232;
        c0232.m1295(attributeSet, R.attr.materialButtonStyle);
        c0232.m1292();
        getEmojiTextViewHelper().m1254(attributeSet, R.attr.materialButtonStyle);
    }

    private C0219 getEmojiTextViewHelper() {
        if (this.f1319 == null) {
            this.f1319 = new C0219(this);
        }
        return this.f1319;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            c0146.m1154();
        }
        C0232 c0232 = this.f1318;
        if (c0232 != null) {
            c0232.m1292();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2913 ? ((ActionModeCallbackC2913) customSelectionActionModeCallback).f9362 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            return c0146.m1172();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            return c0146.m1173();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1318.m1293();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1318.m1294();
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
        C0232 c0232 = this.f1318;
        if (c0232 != null) {
            
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2767(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            c0146.m1177();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            c0146.m1178(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3453.m5014(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1255(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2765(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0232 c0232 = this.f1318;
        if (c0232 != null) {
            c0232.f1369.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            c0146.m1186(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0146 c0146 = this.f1317;
        if (c0146 != null) {
            c0146.m1187(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0232 c0232 = this.f1318;
        c0232.m1297(colorStateList);
        c0232.m1292();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0232 c0232 = this.f1318;
        c0232.m1298(mode);
        c0232.m1292();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0232 c0232 = this.f1318;
        if (c0232 != null) {
            c0232.m1296(context, i);
        }
    }
}
