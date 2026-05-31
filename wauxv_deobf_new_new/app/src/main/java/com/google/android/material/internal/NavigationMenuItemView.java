package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import p000.AbstractC1403;
import p000.AbstractC2638;
import p000.AbstractC3477;
import p000.AbstractC3638;
import p000.C0675;
import p000.C1807;
import p000.InterfaceC1987;
import p000.MenuItemC1977;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1403 implements InterfaceC1987 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final int[] f793 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public boolean f796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final CheckedTextView f798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public FrameLayout f799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public MenuItemC1977 f800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public ColorStateList f801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public Drawable f803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final C0675 f804;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f797 = true;
        C0675 c0675 = new C0675(this, 2);
        this.f804 = c0675;
        setOrientation(0);
        LayoutInflater.from(context).inflate(me.hd.wauxv.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(me.hd.wauxv.R.id.design_menu_item_text);
        this.f798 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC3638.m5183(checkedTextView, c0675);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f799 == null) {
                this.f799 = (FrameLayout) ((ViewStub) findViewById(me.hd.wauxv.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f799.removeAllViews();
            this.f799.addView(view);
        }
    }

    @Override // p000.InterfaceC1987
    public MenuItemC1977 getItemData() {
        return this.f800;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC1977 menuItemC1977 = this.f800;
        if (menuItemC1977 != null && menuItemC1977.isCheckable() && this.f800.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f793);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f796 != z) {
            this.f796 = z;
            this.f804.mo1112(this.f798, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f798;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f797) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f802) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f801);
            }
            int i = this.f794;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f795) {
            if (this.f803 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC2638.f8340;
                Drawable drawable2 = resources.getDrawable(me.hd.wauxv.R.drawable.navigation_empty_icon, theme);
                this.f803 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f794;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f803;
        }
        this.f798.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f798.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f794 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f801 = colorStateList;
        this.f802 = colorStateList != null;
        MenuItemC1977 menuItemC1977 = this.f800;
        if (menuItemC1977 != null) {
            setIcon(menuItemC1977.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f798.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f795 = z;
    }

    public void setTextAppearance(int i) {
        this.f798.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f798.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f798.setText(charSequence);
    }

    @Override // p000.InterfaceC1987
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2(MenuItemC1977 menuItemC1977) {
        StateListDrawable stateListDrawable;
        this.f800 = menuItemC1977;
        int i = menuItemC1977.f6532;
        if (i > 0) {
            setId(i);
        }
        setVisibility(menuItemC1977.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f793, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = AbstractC3638.f11333;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemC1977.isCheckable());
        setChecked(menuItemC1977.isChecked());
        setEnabled(menuItemC1977.isEnabled());
        setTitle(menuItemC1977.f6536);
        setIcon(menuItemC1977.getIcon());
        View view = menuItemC1977.f6557;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(menuItemC1977.f6548);
        AbstractC3477.m4997(this, menuItemC1977.f6549);
        MenuItemC1977 menuItemC1978 = this.f800;
        CharSequence charSequence = menuItemC1978.f6536;
        CheckedTextView checkedTextView = this.f798;
        if (charSequence == null && menuItemC1978.getIcon() == null) {
            View view2 = this.f800.f6557;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f799;
                if (frameLayout != null) {
                    C1807 c1807 = (C1807) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) c1807).width = -1;
                    this.f799.setLayoutParams(c1807);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f799;
        if (frameLayout2 != null) {
            C1807 c1808 = (C1807) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1808).width = -2;
            this.f799.setLayoutParams(c1808);
        }
    }
}
