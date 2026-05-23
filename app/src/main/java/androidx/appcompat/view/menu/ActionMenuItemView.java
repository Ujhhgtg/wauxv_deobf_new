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
import p000.AbstractC0129;
import p000.AbstractC2470;
import p000.AbstractC3419;
import p000.C0236;
import p000.InterfaceC0137;
import p000.InterfaceC1943;
import p000.InterfaceC1956;
import p000.MenuC1944;
import p000.MenuItemC1946;
import p000.ViewOnTouchListenerC0128;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0236 implements InterfaceC1956, View.OnClickListener, InterfaceC0137 {

    public MenuItemC1946 f1;

    public CharSequence f2;

    public Drawable f3;

    public InterfaceC1943 f4;

    public ViewOnTouchListenerC0128 f5;

    public AbstractC0129 f6;

    public boolean f7;

    public boolean f8;

    public final int f9;

    public int f10;

    public final int f11;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f7 = m4();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2470.f7879, 0, 0);
        this.f9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f11 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC1956
    public MenuItemC1946 getItemData() {
        return this.f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1943 interfaceC1943 = this.f4;
        if (interfaceC1943 != null) {
            interfaceC1943.mo6(this.f1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7 = m4();
        m5();
    }

    @Override // p000.C0236, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f10) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f9;
        int iMin = mode == -2147483648 ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f3 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0128 viewOnTouchListenerC0128;
        if (this.f1.hasSubMenu() && (viewOnTouchListenerC0128 = this.f5) != null && viewOnTouchListenerC0128.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f8 != z) {
            this.f8 = z;
            MenuItemC1946 menuItemC1946 = this.f1;
            if (menuItemC1946 != null) {
                MenuC1944 menuC1944 = menuItemC1946.f6440;
                menuC1944.f6417 = true;
                menuC1944.m3768(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f11;
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
        m5();
    }

    public void setItemInvoker(InterfaceC1943 interfaceC1943) {
        this.f4 = interfaceC1943;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f10 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0129 abstractC0129) {
        this.f6 = abstractC0129;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2 = charSequence;
        m5();
    }

    @Override // p000.InterfaceC0137
    public final boolean mo1() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC1956
    public final void mo2(MenuItemC1946 menuItemC1946) {
        this.f1 = menuItemC1946;
        setIcon(menuItemC1946.getIcon());
        setTitle(menuItemC1946.getTitleCondensed());
        setId(menuItemC1946.f6427);
        setVisibility(menuItemC1946.isVisible() ? 0 : 8);
        setEnabled(menuItemC1946.isEnabled());
        if (menuItemC1946.hasSubMenu() && this.f5 == null) {
            this.f5 = new ViewOnTouchListenerC0128(this);
        }
    }

    @Override // p000.InterfaceC0137
    public final boolean mo3() {
        return !TextUtils.isEmpty(getText()) && this.f1.getIcon() == null;
    }

    public final boolean m4() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (false) || configuration.orientation == 2;
        }
        return true;
    }

    public final void m5() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2);
        if (this.f3 != null && ((this.f1.f6451 & 4) != 4 || (!this.f7 && !this.f8))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2 : null);
        CharSequence charSequence = this.f1.f6443;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f1.f6431);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1.f6444;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC3419.m4935(this, z3 ? null : this.f1.f6431);
        } else {
            AbstractC3419.m4935(this, charSequence2);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
