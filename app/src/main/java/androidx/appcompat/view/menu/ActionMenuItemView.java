package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.AbstractC1763feyxiexzfUjhhgtg;
import p000.AbstractC3000feyxiexzfUjhhgtg;
import p000.C2384Ujhhgtgfeyxiexzf;
import p000.InterfaceC0356Ujhhgtgfeyxiexzf;
import p000.InterfaceC0367Ujhhgtgfeyxiexzf;
import p000.InterfaceC3008Ujhhgtgfeyxiexzf;
import p000.MenuC0355Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;
import p000.ViewOnTouchListenerC2999feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C2384Ujhhgtgfeyxiexzf implements InterfaceC0367Ujhhgtgfeyxiexzf, View.OnClickListener, InterfaceC3008Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f2Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public CharSequence f3Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f4Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public InterfaceC0356Ujhhgtgfeyxiexzf f5Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public ViewOnTouchListenerC2999feyxiexzfUjhhgtg f6Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public AbstractC3000feyxiexzfUjhhgtg f7Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f8Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f9Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f10Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f11Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f12Ujhhgtgfeyxiexzf;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f8Ujhhgtgfeyxiexzf = m4Ujhhgtgfeyxiexzf();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3160Ujhhgtgfeyxiexzf, 0, 0);
        this.f10Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f12Ujhhgtgfeyxiexzf = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f11Ujhhgtgfeyxiexzf = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    public MenuItemC0357Ujhhgtgfeyxiexzf getItemData() {
        return this.f2Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0356Ujhhgtgfeyxiexzf interfaceC0356Ujhhgtgfeyxiexzf = this.f5Ujhhgtgfeyxiexzf;
        if (interfaceC0356Ujhhgtgfeyxiexzf != null) {
            interfaceC0356Ujhhgtgfeyxiexzf.mo6Ujhhgtgfeyxiexzf(this.f2Ujhhgtgfeyxiexzf);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8Ujhhgtgfeyxiexzf = m4Ujhhgtgfeyxiexzf();
        m5Ujhhgtgfeyxiexzf();
    }

    @Override // p000.C2384Ujhhgtgfeyxiexzf, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f11Ujhhgtgfeyxiexzf) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f10Ujhhgtgfeyxiexzf;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f4Ujhhgtgfeyxiexzf == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4Ujhhgtgfeyxiexzf.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC2999feyxiexzfUjhhgtg viewOnTouchListenerC2999feyxiexzfUjhhgtg;
        if (this.f2Ujhhgtgfeyxiexzf.hasSubMenu() && (viewOnTouchListenerC2999feyxiexzfUjhhgtg = this.f6Ujhhgtgfeyxiexzf) != null && viewOnTouchListenerC2999feyxiexzfUjhhgtg.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f9Ujhhgtgfeyxiexzf != z) {
            this.f9Ujhhgtgfeyxiexzf = z;
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2Ujhhgtgfeyxiexzf;
            if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
                MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf;
                menuC0355Ujhhgtgfeyxiexzf.f2014Ujhhgtgfeyxiexzf = true;
                menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f12Ujhhgtgfeyxiexzf;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m5Ujhhgtgfeyxiexzf();
    }

    public void setItemInvoker(InterfaceC0356Ujhhgtgfeyxiexzf interfaceC0356Ujhhgtgfeyxiexzf) {
        this.f5Ujhhgtgfeyxiexzf = interfaceC0356Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f11Ujhhgtgfeyxiexzf = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC3000feyxiexzfUjhhgtg abstractC3000feyxiexzfUjhhgtg) {
        this.f7Ujhhgtgfeyxiexzf = abstractC3000feyxiexzfUjhhgtg;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3Ujhhgtgfeyxiexzf = charSequence;
        m5Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3008Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo1Ujhhgtgfeyxiexzf() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo2Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        this.f2Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        setIcon(menuItemC0357Ujhhgtgfeyxiexzf.getIcon());
        setTitle(menuItemC0357Ujhhgtgfeyxiexzf.getTitleCondensed());
        setId(menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf);
        setVisibility(menuItemC0357Ujhhgtgfeyxiexzf.isVisible() ? 0 : 8);
        setEnabled(menuItemC0357Ujhhgtgfeyxiexzf.isEnabled());
        if (menuItemC0357Ujhhgtgfeyxiexzf.hasSubMenu() && this.f6Ujhhgtgfeyxiexzf == null) {
            this.f6Ujhhgtgfeyxiexzf = new ViewOnTouchListenerC2999feyxiexzfUjhhgtg(this);
        }
    }

    @Override // p000.InterfaceC3008Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean mo3Ujhhgtgfeyxiexzf() {
        return !TextUtils.isEmpty(getText()) && this.f2Ujhhgtgfeyxiexzf.getIcon() == null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m4Ujhhgtgfeyxiexzf() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m5Ujhhgtgfeyxiexzf() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3Ujhhgtgfeyxiexzf);
        if (this.f4Ujhhgtgfeyxiexzf != null && ((this.f2Ujhhgtgfeyxiexzf.f2048feyxiexzfUjhhgtg & 4) != 4 || (!this.f8Ujhhgtgfeyxiexzf && !this.f9Ujhhgtgfeyxiexzf))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f3Ujhhgtgfeyxiexzf : null);
        CharSequence charSequence = this.f2Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f2Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2Ujhhgtgfeyxiexzf.f2041Ujhhgtgfeyxiexzf;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, z3 ? null : this.f2Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        } else {
            AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, charSequence2);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
