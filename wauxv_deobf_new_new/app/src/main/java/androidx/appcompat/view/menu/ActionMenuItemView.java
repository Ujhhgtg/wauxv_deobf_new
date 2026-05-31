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
import p000.AbstractC0137;
import p000.AbstractC2523;
import p000.AbstractC3477;
import p000.C0246;
import p000.InterfaceC0145;
import p000.InterfaceC1974;
import p000.InterfaceC1987;
import p000.MenuC1975;
import p000.MenuItemC1977;
import p000.ViewOnTouchListenerC0136;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0246 implements InterfaceC1987, View.OnClickListener, InterfaceC0145 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public MenuItemC1977 f1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public CharSequence f2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f3;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public InterfaceC1974 f4;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ViewOnTouchListenerC0136 f5;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public AbstractC0137 f6;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f7;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f8;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final int f9;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f10;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f11;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f7 = m4();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2523.f8028, 0, 0);
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

    @Override // p000.InterfaceC1987
    public MenuItemC1977 getItemData() {
        return this.f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1974 interfaceC1974 = this.f4;
        if (interfaceC1974 != null) {
            interfaceC1974.mo6(this.f1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7 = m4();
        m5();
    }

    @Override // p000.C0246, android.widget.TextView, android.view.View
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
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
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
        ViewOnTouchListenerC0136 viewOnTouchListenerC0136;
        if (this.f1.hasSubMenu() && (viewOnTouchListenerC0136 = this.f5) != null && viewOnTouchListenerC0136.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f8 != z) {
            this.f8 = z;
            MenuItemC1977 menuItemC1977 = this.f1;
            if (menuItemC1977 != null) {
                MenuC1975 menuC1975 = menuItemC1977.f6545;
                menuC1975.f6522 = true;
                menuC1975.m3962(true);
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

    public void setItemInvoker(InterfaceC1974 interfaceC1974) {
        this.f4 = interfaceC1974;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f10 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0137 abstractC0137) {
        this.f6 = abstractC0137;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2 = charSequence;
        m5();
    }

    @Override // p000.InterfaceC0145
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo1() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC1987
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2(MenuItemC1977 menuItemC1977) {
        this.f1 = menuItemC1977;
        setIcon(menuItemC1977.getIcon());
        setTitle(menuItemC1977.getTitleCondensed());
        setId(menuItemC1977.f6532);
        setVisibility(menuItemC1977.isVisible() ? 0 : 8);
        setEnabled(menuItemC1977.isEnabled());
        if (menuItemC1977.hasSubMenu() && this.f5 == null) {
            this.f5 = new ViewOnTouchListenerC0136(this);
        }
    }

    @Override // p000.InterfaceC0145
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo3() {
        return !TextUtils.isEmpty(getText()) && this.f1.getIcon() == null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m4() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m5() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2);
        if (this.f3 != null && ((this.f1.f6556 & 4) != 4 || (!this.f7 && !this.f8))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2 : null);
        CharSequence charSequence = this.f1.f6548;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f1.f6536);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1.f6549;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC3477.m4997(this, z3 ? null : this.f1.f6536);
        } else {
            AbstractC3477.m4997(this, charSequence2);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
