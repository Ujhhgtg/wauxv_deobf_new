package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0234 extends RadioButton implements InterfaceC3463 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0224 f1431;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0154 f1432;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0242 f1433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0229 f1434;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC3460.m4988(context);
        AbstractC2977.m4979(this, getContext());
        C0224 c0224 = new C0224(this);
        this.f1431 = c0224;
        c0224.m1388(attributeSet, R.attr.radioButtonStyle);
        C0154 c0154 = new C0154(this);
        this.f1432 = c0154;
        c0154.m1321(attributeSet, R.attr.radioButtonStyle);
        C0242 c0242 = new C0242(this);
        this.f1433 = c0242;
        c0242.m1441(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m1400(attributeSet, R.attr.radioButtonStyle);
    }

    private C0229 getEmojiTextViewHelper() {
        if (this.f1434 == null) {
            this.f1434 = new C0229(this);
        }
        return this.f1434;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            c0154.m1300();
        }
        C0242 c0242 = this.f1433;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            return c0154.m1318();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            return c0154.m1319();
        }
        return null;
    }

    @Override // p000.InterfaceC3463
    public ColorStateList getSupportButtonTintList() {
        C0224 c0224 = this.f1431;
        if (c0224 != null) {
            return (ColorStateList) c0224.f1402;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0224 c0224 = this.f1431;
        if (c0224 != null) {
            return (PorterDuff.Mode) c0224.f1403;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1433.m1439();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1433.m1440();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2911(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            c0154.m1323();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            c0154.m1324(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0224 c0224 = this.f1431;
        if (c0224 != null) {
            if (c0224.f1400) {
                c0224.f1400 = false;
            } else {
                c0224.f1400 = true;
                c0224.m1386();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1433;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1433;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1401(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2909(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            c0154.m1332(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0154 c0154 = this.f1432;
        if (c0154 != null) {
            c0154.m1333(mode);
        }
    }

    @Override // p000.InterfaceC3463
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0224 c0224 = this.f1431;
        if (c0224 != null) {
            c0224.f1402 = colorStateList;
            c0224.f1398 = true;
            c0224.m1386();
        }
    }

    @Override // p000.InterfaceC3463
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0224 c0224 = this.f1431;
        if (c0224 != null) {
            c0224.f1403 = mode;
            c0224.f1399 = true;
            c0224.m1386();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0242 c0242 = this.f1433;
        c0242.m1443(colorStateList);
        c0242.m1438();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0242 c0242 = this.f1433;
        c0242.m1444(mode);
        c0242.m1438();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C1787.m3667(getContext(), i));
    }
}
