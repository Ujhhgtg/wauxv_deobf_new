package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳ要点脸ᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1191feyxiexzfUjhhgtg extends MenuC0355Ujhhgtgfeyxiexzf implements SubMenu {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final MenuC0355Ujhhgtgfeyxiexzf f4485Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final MenuItemC0357Ujhhgtgfeyxiexzf f4486Ujhhgtgfeyxiexzf;

    public SubMenuC1191feyxiexzfUjhhgtg(Context context, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        super(context);
        this.f4485Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
        this.f4486Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4486Ujhhgtgfeyxiexzf;
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f4485Ujhhgtgfeyxiexzf.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m1558Ujhhgtgfeyxiexzf(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m1558Ujhhgtgfeyxiexzf(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m1558Ujhhgtgfeyxiexzf(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4486Ujhhgtgfeyxiexzf.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4485Ujhhgtgfeyxiexzf.setQwertyMode(z);
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo1545Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        return this.f4485Ujhhgtgfeyxiexzf.mo1545Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo1546Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItem menuItem) {
        return super.mo1546Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItem) || this.f4485Ujhhgtgfeyxiexzf.mo1546Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItem);
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo1547Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        return this.f4485Ujhhgtgfeyxiexzf.mo1547Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final MenuC0355Ujhhgtgfeyxiexzf mo1551Ujhhgtgfeyxiexzf() {
        return this.f4485Ujhhgtgfeyxiexzf.mo1551Ujhhgtgfeyxiexzf();
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final boolean mo1553Ujhhgtgfeyxiexzf() {
        return this.f4485Ujhhgtgfeyxiexzf.mo1553Ujhhgtgfeyxiexzf();
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final boolean mo1554Ujhhgtgfeyxiexzf() {
        return this.f4485Ujhhgtgfeyxiexzf.mo1554Ujhhgtgfeyxiexzf();
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final boolean mo1555Ujhhgtgfeyxiexzf() {
        return this.f4485Ujhhgtgfeyxiexzf.mo1555Ujhhgtgfeyxiexzf();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m1558Ujhhgtgfeyxiexzf(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m1558Ujhhgtgfeyxiexzf(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4486Ujhhgtgfeyxiexzf.setIcon(i);
        return this;
    }
}
