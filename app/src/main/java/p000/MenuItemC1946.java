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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC1946 implements MenuItem {

    public final int f6427;

    public final int f6428;

    public final int f6429;

    public final int f6430;

    public CharSequence f6431;

    public CharSequence f6432;

    public Intent f6433;

    public char f6434;

    public char f6436;

    public Drawable f6438;

    public final MenuC1944 f6440;

    public SubMenuC2853 f6441;

    public MenuItem.OnMenuItemClickListener f6442;

    public CharSequence f6443;

    public CharSequence f6444;

    public View f6452;

    public MenuItem.OnActionExpandListener f6453;

    public int f6435 = 4096;

    public int f6437 = 4096;

    public int f6439 = 0;

    public ColorStateList f6445 = null;

    public PorterDuff.Mode f6446 = null;

    public boolean f6447 = false;

    public boolean f6448 = false;

    public boolean f6449 = false;

    public int f6450 = 16;

    public boolean f6454 = false;

    public int f6451 = 0;

    public MenuItemC1946(MenuC1944 menuC1944, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f6440 = menuC1944;
        this.f6427 = i2;
        this.f6428 = i;
        this.f6429 = i3;
        this.f6430 = i4;
        this.f6431 = charSequence;
    }

    public static void m3773(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6451 & 8) == 0) {
            return false;
        }
        if (this.f6452 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6453;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6440.mo3757(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f6451 & 8) == 0 || this.f6452 == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6453;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6440.mo3759(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6452;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6437;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6436;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6443;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6428;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6438;
        if (drawable != null) {
            return m3774(drawable);
        }
        int i = this.f6439;
        if (i == 0) {
            return null;
        }
        Drawable drawableM5076 = AbstractC3471.m5076(this.f6440.f6407, i);
        this.f6439 = 0;
        this.f6438 = drawableM5076;
        return m3774(drawableM5076);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6445;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6446;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6433;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6427;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6435;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6434;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6429;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6441;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6431;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6432;
        return charSequence != null ? charSequence : this.f6431;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6444;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6441 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6454;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6450 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6450 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6450 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6450 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f6452 = view;
        if (view != null && view.getId() == -1 && (i = this.f6427) > 0) {
            view.setId(i);
        }
        MenuC1944 menuC1944 = this.f6440;
        menuC1944.f6417 = true;
        menuC1944.m3768(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f6436 == c) {
            return this;
        }
        this.f6436 = Character.toLowerCase(c);
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f6450;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f6450 = i2;
        if (i != i2) {
            this.f6440.m3768(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f6450;
        int i2 = i & 4;
        MenuC1944 menuC1944 = this.f6440;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f6450 = i3;
            if (i != i3) {
                menuC1944.m3768(false);
            }
            return this;
        }
        ArrayList arrayList = menuC1944.f6412;
        int size = arrayList.size();
        menuC1944.m3772();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1946 menuItemC1946 = (MenuItemC1946) arrayList.get(i4);
            if (menuItemC1946.f6428 == this.f6428 && (menuItemC1946.f6450 & 4) != 0 && menuItemC1946.isCheckable()) {
                boolean z2 = menuItemC1946 == this;
                int i5 = menuItemC1946.f6450;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                menuItemC1946.f6450 = i6;
                if (i5 != i6) {
                    menuItemC1946.f6440.m3768(false);
                }
            }
        }
        menuC1944.m3771();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m3775(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f6450 |= 16;
        } else {
            this.f6450 &= -17;
        }
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6439 = 0;
        this.f6438 = drawable;
        this.f6449 = true;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6445 = colorStateList;
        this.f6447 = true;
        this.f6449 = true;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6446 = mode;
        this.f6448 = true;
        this.f6449 = true;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6433 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f6434 == c) {
            return this;
        }
        this.f6434 = c;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6453 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6442 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6434 = c;
        this.f6436 = Character.toLowerCase(c2);
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6451 = i;
        MenuC1944 menuC1944 = this.f6440;
        menuC1944.f6417 = true;
        menuC1944.m3768(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6431 = charSequence;
        this.f6440.m3768(false);
        SubMenuC2853 subMenuC2853 = this.f6441;
        if (subMenuC2853 != null) {
            subMenuC2853.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6432 = charSequence;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m3778(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f6450;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f6450 = i2;
        if (i != i2) {
            MenuC1944 menuC1944 = this.f6440;
            menuC1944.f6414 = true;
            menuC1944.m3768(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6431;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final Drawable m3774(Drawable drawable) {
        if (drawable != null && this.f6449 && (this.f6447 || this.f6448)) {
            drawable = drawable.mutate();
            if (this.f6447) {
                drawable.setTintList(this.f6445);
            }
            if (this.f6448) {
                drawable.setTintMode(this.f6446);
            }
            this.f6449 = false;
        }
        return drawable;
    }

    public final MenuItemC1946 m3775(CharSequence charSequence) {
        this.f6443 = charSequence;
        this.f6440.m3768(false);
        return this;
    }

    public final void m3776(boolean z) {
        this.f6450 = (z ? 4 : 0) | (this.f6450 & (-5));
    }

    public final void m3777(boolean z) {
        if (z) {
            this.f6450 |= 32;
        } else {
            this.f6450 &= -33;
        }
    }

    public final MenuItemC1946 m3778(CharSequence charSequence) {
        this.f6444 = charSequence;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f6436 == c && this.f6437 == i) {
            return this;
        }
        this.f6436 = Character.toLowerCase(c);
        this.f6437 = KeyEvent.normalizeMetaState(i);
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f6434 == c && this.f6435 == i) {
            return this;
        }
        this.f6434 = c;
        this.f6435 = KeyEvent.normalizeMetaState(i);
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6434 = c;
        this.f6435 = KeyEvent.normalizeMetaState(i);
        this.f6436 = Character.toLowerCase(c2);
        this.f6437 = KeyEvent.normalizeMetaState(i2);
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6438 = null;
        this.f6439 = i;
        this.f6449 = true;
        this.f6440.m3768(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f6440.f6407.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC1944 menuC1944 = this.f6440;
        Context context = menuC1944.f6407;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f6452 = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f6427) > 0) {
            viewInflate.setId(i2);
        }
        menuC1944.f6417 = true;
        menuC1944.m3768(true);
        return this;
    }
}
