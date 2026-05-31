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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᤝᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC1977 implements MenuItem {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f6532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f6533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public CharSequence f6536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public CharSequence f6537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Intent f6538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public char f6539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public char f6541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f6543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final MenuC1975 f6545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public SubMenuC2913 f6546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f6547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public CharSequence f6548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public CharSequence f6549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public View f6557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f6558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6540 = 4096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6542 = 4096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f6544 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public ColorStateList f6550 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f6551 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f6552 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f6553 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public boolean f6554 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f6555 = 16;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public boolean f6559 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f6556 = 0;

    public MenuItemC1977(MenuC1975 menuC1975, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f6545 = menuC1975;
        this.f6532 = i2;
        this.f6533 = i;
        this.f6534 = i3;
        this.f6535 = i4;
        this.f6536 = charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3967(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6556 & 8) == 0) {
            return false;
        }
        if (this.f6557 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6558;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6545.mo3951(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f6556 & 8) == 0 || this.f6557 == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6558;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6545.mo3953(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6557;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6542;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6541;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6548;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6533;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6543;
        if (drawable != null) {
            return m3968(drawable);
        }
        int i = this.f6544;
        if (i == 0) {
            return null;
        }
        Drawable drawableM3667 = C1787.m3667(this.f6545.f6512, i);
        this.f6544 = 0;
        this.f6543 = drawableM3667;
        return m3968(drawableM3667);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6550;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6551;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6538;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6532;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6540;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6539;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6534;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6546;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6536;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6537;
        return charSequence != null ? charSequence : this.f6536;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6549;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6546 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6559;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6555 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6555 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6555 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6555 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f6557 = view;
        if (view != null && view.getId() == -1 && (i = this.f6532) > 0) {
            view.setId(i);
        }
        MenuC1975 menuC1975 = this.f6545;
        menuC1975.f6522 = true;
        menuC1975.m3962(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f6541 == c) {
            return this;
        }
        this.f6541 = Character.toLowerCase(c);
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f6555;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f6555 = i2;
        if (i != i2) {
            this.f6545.m3962(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f6555;
        int i2 = i & 4;
        MenuC1975 menuC1975 = this.f6545;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f6555 = i3;
            if (i != i3) {
                menuC1975.m3962(false);
            }
            return this;
        }
        ArrayList arrayList = menuC1975.f6517;
        int size = arrayList.size();
        menuC1975.m3966();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC1977 menuItemC1977 = (MenuItemC1977) arrayList.get(i4);
            if (menuItemC1977.f6533 == this.f6533 && (menuItemC1977.f6555 & 4) != 0 && menuItemC1977.isCheckable()) {
                boolean z2 = menuItemC1977 == this;
                int i5 = menuItemC1977.f6555;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                menuItemC1977.f6555 = i6;
                if (i5 != i6) {
                    menuItemC1977.f6545.m3962(false);
                }
            }
        }
        menuC1975.m3965();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m3969(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f6555 |= 16;
        } else {
            this.f6555 &= -17;
        }
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6544 = 0;
        this.f6543 = drawable;
        this.f6554 = true;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6550 = colorStateList;
        this.f6552 = true;
        this.f6554 = true;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6551 = mode;
        this.f6553 = true;
        this.f6554 = true;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6538 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f6539 == c) {
            return this;
        }
        this.f6539 = c;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6558 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6547 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6539 = c;
        this.f6541 = Character.toLowerCase(c2);
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6556 = i;
        MenuC1975 menuC1975 = this.f6545;
        menuC1975.f6522 = true;
        menuC1975.m3962(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6536 = charSequence;
        this.f6545.m3962(false);
        SubMenuC2913 subMenuC2913 = this.f6546;
        if (subMenuC2913 != null) {
            subMenuC2913.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6537 = charSequence;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m3972(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f6555;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f6555 = i2;
        if (i != i2) {
            MenuC1975 menuC1975 = this.f6545;
            menuC1975.f6519 = true;
            menuC1975.m3962(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6536;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Drawable m3968(Drawable drawable) {
        if (drawable != null && this.f6554 && (this.f6552 || this.f6553)) {
            drawable = drawable.mutate();
            if (this.f6552) {
                drawable.setTintList(this.f6550);
            }
            if (this.f6553) {
                drawable.setTintMode(this.f6551);
            }
            this.f6554 = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MenuItemC1977 m3969(CharSequence charSequence) {
        this.f6548 = charSequence;
        this.f6545.m3962(false);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3970(boolean z) {
        this.f6555 = (z ? 4 : 0) | (this.f6555 & (-5));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3971(boolean z) {
        if (z) {
            this.f6555 |= 32;
        } else {
            this.f6555 &= -33;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final MenuItemC1977 m3972(CharSequence charSequence) {
        this.f6549 = charSequence;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f6541 == c && this.f6542 == i) {
            return this;
        }
        this.f6541 = Character.toLowerCase(c);
        this.f6542 = KeyEvent.normalizeMetaState(i);
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f6539 == c && this.f6540 == i) {
            return this;
        }
        this.f6539 = c;
        this.f6540 = KeyEvent.normalizeMetaState(i);
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6539 = c;
        this.f6540 = KeyEvent.normalizeMetaState(i);
        this.f6541 = Character.toLowerCase(c2);
        this.f6542 = KeyEvent.normalizeMetaState(i2);
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6543 = null;
        this.f6544 = i;
        this.f6554 = true;
        this.f6545.m3962(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f6545.f6512.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC1975 menuC1975 = this.f6545;
        Context context = menuC1975.f6512;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f6557 = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f6532) > 0) {
            viewInflate.setId(i2);
        }
        menuC1975.f6522 = true;
        menuC1975.m3962(true);
        return this;
    }
}
