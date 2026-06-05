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
import p000.AbstractC0888feyxiexzfUjhhgtg;
import p000.AbstractC1763feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3520Ujhhgtgfeyxiexzf;
import p000.C0090Ujhhgtgfeyxiexzf;
import p000.C2913feyxiexzfUjhhgtg;
import p000.InterfaceC0367Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC3520Ujhhgtgfeyxiexzf implements InterfaceC0367Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final int[] f807feyxiexzfUjhhgtg = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public boolean f809feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f810feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f811feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final CheckedTextView f812feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public FrameLayout f813feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f814feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public ColorStateList f815feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f816feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public Drawable f817feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final C2913feyxiexzfUjhhgtg f818feyxiexzfUjhhgtg;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f811feyxiexzfUjhhgtg = true;
        C2913feyxiexzfUjhhgtg c2913feyxiexzfUjhhgtg = new C2913feyxiexzfUjhhgtg(this, 2);
        this.f818feyxiexzfUjhhgtg = c2913feyxiexzfUjhhgtg;
        setOrientation(0);
        LayoutInflater.from(context).inflate(me.hd.wauxv.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(me.hd.wauxv.R.id.design_menu_item_text);
        this.f812feyxiexzfUjhhgtg = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(checkedTextView, c2913feyxiexzfUjhhgtg);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f813feyxiexzfUjhhgtg == null) {
                this.f813feyxiexzfUjhhgtg = (FrameLayout) ((ViewStub) findViewById(me.hd.wauxv.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f813feyxiexzfUjhhgtg.removeAllViews();
            this.f813feyxiexzfUjhhgtg.addView(view);
        }
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    public MenuItemC0357Ujhhgtgfeyxiexzf getItemData() {
        return this.f814feyxiexzfUjhhgtg;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f814feyxiexzfUjhhgtg;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null && menuItemC0357Ujhhgtgfeyxiexzf.isCheckable() && this.f814feyxiexzfUjhhgtg.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f807feyxiexzfUjhhgtg);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f810feyxiexzfUjhhgtg != z) {
            this.f810feyxiexzfUjhhgtg = z;
            this.f818feyxiexzfUjhhgtg.mo2168Ujhhgtgfeyxiexzf(this.f812feyxiexzfUjhhgtg, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f812feyxiexzfUjhhgtg;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f811feyxiexzfUjhhgtg) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f816feyxiexzfUjhhgtg) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f815feyxiexzfUjhhgtg);
            }
            int i = this.f808Ujhhgtgfeyxiexzf;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f809feyxiexzfUjhhgtg) {
            if (this.f817feyxiexzfUjhhgtg == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
                Drawable drawable2 = resources.getDrawable(me.hd.wauxv.R.drawable.navigation_empty_icon, theme);
                this.f817feyxiexzfUjhhgtg = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f808Ujhhgtgfeyxiexzf;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f817feyxiexzfUjhhgtg;
        }
        this.f812feyxiexzfUjhhgtg.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f812feyxiexzfUjhhgtg.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f808Ujhhgtgfeyxiexzf = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f815feyxiexzfUjhhgtg = colorStateList;
        this.f816feyxiexzfUjhhgtg = colorStateList != null;
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f814feyxiexzfUjhhgtg;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
            setIcon(menuItemC0357Ujhhgtgfeyxiexzf.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f812feyxiexzfUjhhgtg.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f809feyxiexzfUjhhgtg = z;
    }

    public void setTextAppearance(int i) {
        this.f812feyxiexzfUjhhgtg.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f812feyxiexzfUjhhgtg.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f812feyxiexzfUjhhgtg.setText(charSequence);
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        StateListDrawable stateListDrawable;
        this.f814feyxiexzfUjhhgtg = menuItemC0357Ujhhgtgfeyxiexzf;
        int i = menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf;
        if (i > 0) {
            setId(i);
        }
        setVisibility(menuItemC0357Ujhhgtgfeyxiexzf.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(me.hd.wauxv.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f807feyxiexzfUjhhgtg, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemC0357Ujhhgtgfeyxiexzf.isCheckable());
        setChecked(menuItemC0357Ujhhgtgfeyxiexzf.isChecked());
        setEnabled(menuItemC0357Ujhhgtgfeyxiexzf.isEnabled());
        setTitle(menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        setIcon(menuItemC0357Ujhhgtgfeyxiexzf.getIcon());
        View view = menuItemC0357Ujhhgtgfeyxiexzf.f2049feyxiexzfUjhhgtg;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf);
        AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, menuItemC0357Ujhhgtgfeyxiexzf.f2041Ujhhgtgfeyxiexzf);
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf2 = this.f814feyxiexzfUjhhgtg;
        CharSequence charSequence = menuItemC0357Ujhhgtgfeyxiexzf2.f2028Ujhhgtgfeyxiexzf;
        CheckedTextView checkedTextView = this.f812feyxiexzfUjhhgtg;
        if (charSequence == null && menuItemC0357Ujhhgtgfeyxiexzf2.getIcon() == null) {
            View view2 = this.f814feyxiexzfUjhhgtg.f2049feyxiexzfUjhhgtg;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f813feyxiexzfUjhhgtg;
                if (frameLayout != null) {
                    C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf = (C0090Ujhhgtgfeyxiexzf) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf).width = -1;
                    this.f813feyxiexzfUjhhgtg.setLayoutParams(c0090Ujhhgtgfeyxiexzf);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f813feyxiexzfUjhhgtg;
        if (frameLayout2 != null) {
            C0090Ujhhgtgfeyxiexzf c0090Ujhhgtgfeyxiexzf2 = (C0090Ujhhgtgfeyxiexzf) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0090Ujhhgtgfeyxiexzf2).width = -2;
            this.f813feyxiexzfUjhhgtg.setLayoutParams(c0090Ujhhgtgfeyxiexzf2);
        }
    }
}
