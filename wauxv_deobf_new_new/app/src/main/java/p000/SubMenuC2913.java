package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC2913 extends MenuC1975 implements SubMenu {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final MenuC1975 f9284;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final MenuItemC1977 f9285;

    public SubMenuC2913(Context context, MenuC1975 menuC1975, MenuItemC1977 menuItemC1977) {
        super(context);
        this.f9284 = menuC1975;
        this.f9285 = menuItemC1977;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9285;
    }

    @Override // p000.MenuC1975, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f9284.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3964(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3964(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3964(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9285.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC1975, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f9284.setQwertyMode(z);
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo3951(MenuItemC1977 menuItemC1977) {
        return this.f9284.mo3951(menuItemC1977);
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo3952(MenuC1975 menuC1975, MenuItem menuItem) {
        return super.mo3952(menuC1975, menuItem) || this.f9284.mo3952(menuC1975, menuItem);
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo3953(MenuItemC1977 menuItemC1977) {
        return this.f9284.mo3953(menuItemC1977);
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final MenuC1975 mo3957() {
        return this.f9284.mo3957();
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final boolean mo3959() {
        return this.f9284.mo3959();
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final boolean mo3960() {
        return this.f9284.mo3960();
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final boolean mo3961() {
        return this.f9284.mo3961();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3964(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3964(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f9285.setIcon(i);
        return this;
    }
}
