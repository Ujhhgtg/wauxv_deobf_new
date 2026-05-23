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
import p000.AbstractC1395;
import p000.AbstractC2582;
import p000.AbstractC3419;
import p000.AbstractC3578;
import p000.C0684;
import p000.C1784;
import p000.InterfaceC1956;
import p000.MenuItemC1946;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1395 implements InterfaceC1956 {

    public static final int[] f727 = {16842912};

    public int f728;

    public boolean f729;

    public boolean f730;

    public final boolean f731;

    public final CheckedTextView f732;

    public FrameLayout f733;

    public MenuItemC1946 f734;

    public ColorStateList f735;

    public boolean f736;

    public Drawable f737;

    public final C0684 f738;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f731 = true;
        C0684 c0684 = new C0684(this, 2);
        this.f738 = c0684;
        setOrientation(0);
        LayoutInflater.from(context).inflate(me.hd.wauxv.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(me.hd.wauxv.R.id.design_menu_item_text);
        this.f732 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC3578.m5177(checkedTextView, c0684);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f733 == null) {
                this.f733 = (FrameLayout) ((ViewStub) findViewById(me.hd.wauxv.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f733.removeAllViews();
            this.f733.addView(view);
        }
    }

    @Override // p000.InterfaceC1956
    public MenuItemC1946 getItemData() {
        return this.f734;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC1946 menuItemC1946 = this.f734;
        if (menuItemC1946 != null && menuItemC1946.isCheckable() && this.f734.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f727);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f730 != z) {
            this.f730 = z;
            this.f738.mo967(this.f732, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f732;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f731) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f736) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f735);
            }
            int i = this.f728;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f729) {
            if (this.f737 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC2582.f8187;
                Drawable drawable2 = resources.getDrawable(me.hd.wauxv.R.drawable.navigation_empty_icon, theme);
                this.f737 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f728;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f737;
        }
        this.f732.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f732.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f728 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f735 = colorStateList;
        this.f736 = colorStateList != null;
        MenuItemC1946 menuItemC1946 = this.f734;
        if (menuItemC1946 != null) {
            setIcon(menuItemC1946.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f732.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f729 = z;
    }

    public void setTextAppearance(int i) {
        this.f732.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f732.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f732.setText(charSequence);
    }

    @Override // p000.InterfaceC1956
    public final void mo2(MenuItemC1946 menuItemC1946) {
        StateListDrawable stateListDrawable;
        this.f734 = menuItemC1946;
        int i = menuItemC1946.f6427;
        if (i > 0) {
            setId(i);
        }
        setVisibility(menuItemC1946.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f727, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = AbstractC3578.f11184;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemC1946.isCheckable());
        setChecked(menuItemC1946.isChecked());
        setEnabled(menuItemC1946.isEnabled());
        setTitle(menuItemC1946.f6431);
        setIcon(menuItemC1946.getIcon());
        View view = menuItemC1946.f6452;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(menuItemC1946.f6443);
        AbstractC3419.m4935(this, menuItemC1946.f6444);
        MenuItemC1946 menuItemC1947 = this.f734;
        CharSequence charSequence = menuItemC1947.f6431;
        CheckedTextView checkedTextView = this.f732;
        if (charSequence == null && menuItemC1947.getIcon() == null) {
            View view2 = this.f734.f6452;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f733;
                if (frameLayout != null) {
                    C1784 c1784 = (C1784) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) c1784).width = -1;
                    this.f733.setLayoutParams(c1784);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f733;
        if (frameLayout2 != null) {
            C1784 c1785 = (C1784) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1785).width = -2;
            this.f733.setLayoutParams(c1785);
        }
    }
}
