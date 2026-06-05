package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0357Ujhhgtgfeyxiexzf implements MenuItem {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f2024Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f2025Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f2026Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2027Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public CharSequence f2028Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public CharSequence f2029Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Intent f2030Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public char f2031Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public char f2033Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f2035Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final MenuC0355Ujhhgtgfeyxiexzf f2037Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public SubMenuC1191feyxiexzfUjhhgtg f2038Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f2039Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public CharSequence f2040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public CharSequence f2041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public View f2049feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f2050feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f2032Ujhhgtgfeyxiexzf = 4096;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f2034Ujhhgtgfeyxiexzf = 4096;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public int f2036Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public ColorStateList f2042Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public PorterDuff.Mode f2043Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f2044Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f2045Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f2046Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2047Ujhhgtgfeyxiexzf = 16;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f2051feyxiexzfUjhhgtg = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f2048feyxiexzfUjhhgtg = 0;

    public MenuItemC0357Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2037Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
        this.f2024Ujhhgtgfeyxiexzf = i2;
        this.f2025Ujhhgtgfeyxiexzf = i;
        this.f2026Ujhhgtgfeyxiexzf = i3;
        this.f2027Ujhhgtgfeyxiexzf = i4;
        this.f2028Ujhhgtgfeyxiexzf = charSequence;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m1561Ujhhgtgfeyxiexzf(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2048feyxiexzfUjhhgtg & 8) == 0) {
            return false;
        }
        if (this.f2049feyxiexzfUjhhgtg == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2050feyxiexzfUjhhgtg;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2037Ujhhgtgfeyxiexzf.mo1545Ujhhgtgfeyxiexzf(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f2048feyxiexzfUjhhgtg & 8) == 0 || this.f2049feyxiexzfUjhhgtg == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2050feyxiexzfUjhhgtg;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2037Ujhhgtgfeyxiexzf.mo1547Ujhhgtgfeyxiexzf(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2049feyxiexzfUjhhgtg;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2034Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2033Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2040Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2025Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2035Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            return m1562Ujhhgtgfeyxiexzf(drawable);
        }
        int i = this.f2036Ujhhgtgfeyxiexzf;
        if (i == 0) {
            return null;
        }
        Drawable drawableM2824Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(this.f2037Ujhhgtgfeyxiexzf.f2004Ujhhgtgfeyxiexzf, i);
        this.f2036Ujhhgtgfeyxiexzf = 0;
        this.f2035Ujhhgtgfeyxiexzf = drawableM2824Ujhhgtgfeyxiexzf;
        return m1562Ujhhgtgfeyxiexzf(drawableM2824Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2042Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2043Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2030Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2024Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2032Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2031Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2026Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2038Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2028Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2029Ujhhgtgfeyxiexzf;
        return charSequence != null ? charSequence : this.f2028Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2041Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2038Ujhhgtgfeyxiexzf != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2051feyxiexzfUjhhgtg;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2047Ujhhgtgfeyxiexzf & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2047Ujhhgtgfeyxiexzf & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2047Ujhhgtgfeyxiexzf & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2047Ujhhgtgfeyxiexzf & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2049feyxiexzfUjhhgtg = view;
        if (view != null && view.getId() == -1 && (i = this.f2024Ujhhgtgfeyxiexzf) > 0) {
            view.setId(i);
        }
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2037Ujhhgtgfeyxiexzf;
        menuC0355Ujhhgtgfeyxiexzf.f2014Ujhhgtgfeyxiexzf = true;
        menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2033Ujhhgtgfeyxiexzf == c) {
            return this;
        }
        this.f2033Ujhhgtgfeyxiexzf = Character.toLowerCase(c);
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f2047Ujhhgtgfeyxiexzf;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f2047Ujhhgtgfeyxiexzf = i2;
        if (i != i2) {
            this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f2047Ujhhgtgfeyxiexzf;
        int i2 = i & 4;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2037Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f2047Ujhhgtgfeyxiexzf = i3;
            if (i != i3) {
                menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
            }
            return this;
        }
        ArrayList arrayList = menuC0355Ujhhgtgfeyxiexzf.f2009Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        menuC0355Ujhhgtgfeyxiexzf.m1560Ujhhgtgfeyxiexzf();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = (MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i4);
            if (menuItemC0357Ujhhgtgfeyxiexzf.f2025Ujhhgtgfeyxiexzf == this.f2025Ujhhgtgfeyxiexzf && (menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf & 4) != 0 && menuItemC0357Ujhhgtgfeyxiexzf.isCheckable()) {
                boolean z2 = menuItemC0357Ujhhgtgfeyxiexzf == this;
                int i5 = menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                menuItemC0357Ujhhgtgfeyxiexzf.f2047Ujhhgtgfeyxiexzf = i6;
                if (i5 != i6) {
                    menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
                }
            }
        }
        menuC0355Ujhhgtgfeyxiexzf.m1559Ujhhgtgfeyxiexzf();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m1563Ujhhgtgfeyxiexzf(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2047Ujhhgtgfeyxiexzf |= 16;
        } else {
            this.f2047Ujhhgtgfeyxiexzf &= -17;
        }
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2036Ujhhgtgfeyxiexzf = 0;
        this.f2035Ujhhgtgfeyxiexzf = drawable;
        this.f2046Ujhhgtgfeyxiexzf = true;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2042Ujhhgtgfeyxiexzf = colorStateList;
        this.f2044Ujhhgtgfeyxiexzf = true;
        this.f2046Ujhhgtgfeyxiexzf = true;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2043Ujhhgtgfeyxiexzf = mode;
        this.f2045Ujhhgtgfeyxiexzf = true;
        this.f2046Ujhhgtgfeyxiexzf = true;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2030Ujhhgtgfeyxiexzf = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f2031Ujhhgtgfeyxiexzf == c) {
            return this;
        }
        this.f2031Ujhhgtgfeyxiexzf = c;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2050feyxiexzfUjhhgtg = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2039Ujhhgtgfeyxiexzf = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f2031Ujhhgtgfeyxiexzf = c;
        this.f2033Ujhhgtgfeyxiexzf = Character.toLowerCase(c2);
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2048feyxiexzfUjhhgtg = i;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2037Ujhhgtgfeyxiexzf;
        menuC0355Ujhhgtgfeyxiexzf.f2014Ujhhgtgfeyxiexzf = true;
        menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2028Ujhhgtgfeyxiexzf = charSequence;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg = this.f2038Ujhhgtgfeyxiexzf;
        if (subMenuC1191feyxiexzfUjhhgtg != null) {
            subMenuC1191feyxiexzfUjhhgtg.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2029Ujhhgtgfeyxiexzf = charSequence;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m1566Ujhhgtgfeyxiexzf(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f2047Ujhhgtgfeyxiexzf;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f2047Ujhhgtgfeyxiexzf = i2;
        if (i != i2) {
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2037Ujhhgtgfeyxiexzf;
            menuC0355Ujhhgtgfeyxiexzf.f2011Ujhhgtgfeyxiexzf = true;
            menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2028Ujhhgtgfeyxiexzf;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Drawable m1562Ujhhgtgfeyxiexzf(Drawable drawable) {
        if (drawable != null && this.f2046Ujhhgtgfeyxiexzf && (this.f2044Ujhhgtgfeyxiexzf || this.f2045Ujhhgtgfeyxiexzf)) {
            drawable = drawable.mutate();
            if (this.f2044Ujhhgtgfeyxiexzf) {
                drawable.setTintList(this.f2042Ujhhgtgfeyxiexzf);
            }
            if (this.f2045Ujhhgtgfeyxiexzf) {
                drawable.setTintMode(this.f2043Ujhhgtgfeyxiexzf);
            }
            this.f2046Ujhhgtgfeyxiexzf = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final MenuItemC0357Ujhhgtgfeyxiexzf m1563Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        this.f2040Ujhhgtgfeyxiexzf = charSequence;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1564Ujhhgtgfeyxiexzf(boolean z) {
        this.f2047Ujhhgtgfeyxiexzf = (z ? 4 : 0) | (this.f2047Ujhhgtgfeyxiexzf & (-5));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1565Ujhhgtgfeyxiexzf(boolean z) {
        if (z) {
            this.f2047Ujhhgtgfeyxiexzf |= 32;
        } else {
            this.f2047Ujhhgtgfeyxiexzf &= -33;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final MenuItemC0357Ujhhgtgfeyxiexzf m1566Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        this.f2041Ujhhgtgfeyxiexzf = charSequence;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2033Ujhhgtgfeyxiexzf == c && this.f2034Ujhhgtgfeyxiexzf == i) {
            return this;
        }
        this.f2033Ujhhgtgfeyxiexzf = Character.toLowerCase(c);
        this.f2034Ujhhgtgfeyxiexzf = KeyEvent.normalizeMetaState(i);
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f2031Ujhhgtgfeyxiexzf == c && this.f2032Ujhhgtgfeyxiexzf == i) {
            return this;
        }
        this.f2031Ujhhgtgfeyxiexzf = c;
        this.f2032Ujhhgtgfeyxiexzf = KeyEvent.normalizeMetaState(i);
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2031Ujhhgtgfeyxiexzf = c;
        this.f2032Ujhhgtgfeyxiexzf = KeyEvent.normalizeMetaState(i);
        this.f2033Ujhhgtgfeyxiexzf = Character.toLowerCase(c2);
        this.f2034Ujhhgtgfeyxiexzf = KeyEvent.normalizeMetaState(i2);
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2035Ujhhgtgfeyxiexzf = null;
        this.f2036Ujhhgtgfeyxiexzf = i;
        this.f2046Ujhhgtgfeyxiexzf = true;
        this.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2037Ujhhgtgfeyxiexzf.f2004Ujhhgtgfeyxiexzf.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2037Ujhhgtgfeyxiexzf;
        Context context = menuC0355Ujhhgtgfeyxiexzf.f2004Ujhhgtgfeyxiexzf;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2049feyxiexzfUjhhgtg = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f2024Ujhhgtgfeyxiexzf) > 0) {
            viewInflate.setId(i2);
        }
        menuC0355Ujhhgtgfeyxiexzf.f2014Ujhhgtgfeyxiexzf = true;
        menuC0355Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(true);
        return this;
    }
}
