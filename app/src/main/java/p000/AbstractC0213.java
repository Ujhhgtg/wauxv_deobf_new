package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲈᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0213 extends CheckBox implements InterfaceC3404 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0214 f1320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0146 f1321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0232 f1322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0219 f1323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0213(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3401.m4926(context);
        AbstractC2918.m4917(this, getContext());
        C0214 c0214 = new C0214(this);
        this.f1320 = c0214;
        c0214.m1242(attributeSet, i);
        C0146 c0146 = new C0146(this);
        this.f1321 = c0146;
        c0146.m1175(attributeSet, i);
        C0232 c0232 = new C0232(this);
        this.f1322 = c0232;
        c0232.m1295(attributeSet, i);
        getEmojiTextViewHelper().m1254(attributeSet, i);
    }

    private C0219 getEmojiTextViewHelper() {
        if (this.f1323 == null) {
            this.f1323 = new C0219(this);
        }
        return this.f1323;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            c0146.m1154();
        }
        C0232 c0232 = this.f1322;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            return c0146.m1172();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            return c0146.m1173();
        }
        return null;
    }

    @Override // p000.InterfaceC3404
    public ColorStateList getSupportButtonTintList() {
        C0214 c0214 = this.f1320;
        if (c0214 != null) {
            return (ColorStateList) c0214.f1328;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0214 c0214 = this.f1320;
        if (c0214 != null) {
            return (PorterDuff.Mode) c0214.f1329;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1322.m1293();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1322.m1294();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2767(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            c0146.m1177();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            c0146.m1178(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0214 c0214 = this.f1320;
        if (c0214 != null) {
            if (c0214.f1326) {
                c0214.f1326 = false;
            } else {
                c0214.f1326 = true;
                c0214.m1240();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1322;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1322;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1255(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2765(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            c0146.m1186(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0146 c0146 = this.f1321;
        if (c0146 != null) {
            c0146.m1187(mode);
        }
    }

    @Override // p000.InterfaceC3404
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0214 c0214 = this.f1320;
        if (c0214 != null) {
            c0214.f1328 = colorStateList;
            c0214.f1324 = true;
            c0214.m1240();
        }
    }

    @Override // p000.InterfaceC3404
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0214 c0214 = this.f1320;
        if (c0214 != null) {
            c0214.f1329 = mode;
            c0214.f1325 = true;
            c0214.m1240();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0232 c0232 = this.f1322;
        c0232.m1297(colorStateList);
        c0232.m1292();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0232 c0232 = this.f1322;
        c0232.m1298(mode);
        c0232.m1292();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3471.m5076(getContext(), i));
    }
}
