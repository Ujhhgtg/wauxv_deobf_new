package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2361Ujhhgtgfeyxiexzf extends CheckBox implements InterfaceC1743Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2362Ujhhgtgfeyxiexzf f7691Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7692Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2353Ujhhgtgfeyxiexzf f7693Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2342Ujhhgtgfeyxiexzf f7694Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2361Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = new C2362Ujhhgtgfeyxiexzf(this);
        this.f7691Ujhhgtgfeyxiexzf = c2362Ujhhgtgfeyxiexzf;
        c2362Ujhhgtgfeyxiexzf.m3579Ujhhgtgfeyxiexzf(attributeSet, i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7692Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = new C2353Ujhhgtgfeyxiexzf(this);
        this.f7693Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3562Ujhhgtgfeyxiexzf(attributeSet, i);
        getEmojiTextViewHelper().m3532Ujhhgtgfeyxiexzf(attributeSet, i);
    }

    private C2342Ujhhgtgfeyxiexzf getEmojiTextViewHelper() {
        if (this.f7694Ujhhgtgfeyxiexzf == null) {
            this.f7694Ujhhgtgfeyxiexzf = new C2342Ujhhgtgfeyxiexzf(this);
        }
        return this.f7694Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7693Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    @Override // p000.InterfaceC1743Ujhhgtgfeyxiexzf
    public ColorStateList getSupportButtonTintList() {
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = this.f7691Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf != null) {
            return (ColorStateList) c2362Ujhhgtgfeyxiexzf.f7699Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = this.f7691Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf != null) {
            return (PorterDuff.Mode) c2362Ujhhgtgfeyxiexzf.f7700Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7693Ujhhgtgfeyxiexzf.m3560Ujhhgtgfeyxiexzf();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7693Ujhhgtgfeyxiexzf.m3561Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2777Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = this.f7691Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf != null) {
            if (c2362Ujhhgtgfeyxiexzf.f7697Ujhhgtgfeyxiexzf) {
                c2362Ujhhgtgfeyxiexzf.f7697Ujhhgtgfeyxiexzf = false;
            } else {
                c2362Ujhhgtgfeyxiexzf.f7697Ujhhgtgfeyxiexzf = true;
                c2362Ujhhgtgfeyxiexzf.m3577Ujhhgtgfeyxiexzf();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7693Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7693Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m3533Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2775Ujhhgtgfeyxiexzf(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7692Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    @Override // p000.InterfaceC1743Ujhhgtgfeyxiexzf
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = this.f7691Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf != null) {
            c2362Ujhhgtgfeyxiexzf.f7699Ujhhgtgfeyxiexzf = colorStateList;
            c2362Ujhhgtgfeyxiexzf.f7695Ujhhgtgfeyxiexzf = true;
            c2362Ujhhgtgfeyxiexzf.m3577Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC1743Ujhhgtgfeyxiexzf
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2362Ujhhgtgfeyxiexzf c2362Ujhhgtgfeyxiexzf = this.f7691Ujhhgtgfeyxiexzf;
        if (c2362Ujhhgtgfeyxiexzf != null) {
            c2362Ujhhgtgfeyxiexzf.f7700Ujhhgtgfeyxiexzf = mode;
            c2362Ujhhgtgfeyxiexzf.f7696Ujhhgtgfeyxiexzf = true;
            c2362Ujhhgtgfeyxiexzf.m3577Ujhhgtgfeyxiexzf();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7693Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3564Ujhhgtgfeyxiexzf(colorStateList);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7693Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3565Ujhhgtgfeyxiexzf(mode);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }
}
