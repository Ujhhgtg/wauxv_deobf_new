package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᲇᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC2853 extends MenuC1944 implements SubMenu {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final MenuC1944 f9115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final MenuItemC1946 f9116;

    public SubMenuC2853(Context context, MenuC1944 menuC1944, MenuItemC1946 menuItemC1946) {
        super(context);
        this.f9115 = menuC1944;
        this.f9116 = menuItemC1946;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9116;
    }

    @Override // p000.MenuC1944, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f9115.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3770(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3770(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3770(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9116.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC1944, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f9115.setQwertyMode(z);
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final boolean mo3757(MenuItemC1946 menuItemC1946) {
        return this.f9115.mo3757(menuItemC1946);
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo3758(MenuC1944 menuC1944, MenuItem menuItem) {
        return super.mo3758(menuC1944, menuItem) || this.f9115.mo3758(menuC1944, menuItem);
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo3759(MenuItemC1946 menuItemC1946) {
        return this.f9115.mo3759(menuItemC1946);
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final MenuC1944 mo3763() {
        return this.f9115.mo3763();
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final boolean mo3765() {
        return this.f9115.mo3765();
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final boolean mo3766() {
        return this.f9115.mo3766();
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final boolean mo3767() {
        return this.f9115.mo3767();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3770(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3770(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f9116.setIcon(i);
        return this;
    }
}
