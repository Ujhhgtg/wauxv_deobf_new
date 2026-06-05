package p000;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ能不能要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0443Ujhhgtgfeyxiexzf extends MenuC0355Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Class f2308Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int f2309Ujhhgtgfeyxiexzf;

    public C0443Ujhhgtgfeyxiexzf(Context context, Class cls, int i) {
        super(context);
        this.f2308Ujhhgtgfeyxiexzf = cls;
        this.f2309Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f2308Ujhhgtgfeyxiexzf.getSimpleName().concat(" does not support submenus"));
    }

    @Override // p000.MenuC0355Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final MenuItemC0357Ujhhgtgfeyxiexzf mo1542Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f2009Ujhhgtgfeyxiexzf.size() + 1;
        int i4 = this.f2309Ujhhgtgfeyxiexzf;
        if (size <= i4) {
            m1560Ujhhgtgfeyxiexzf();
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf = super.mo1542Ujhhgtgfeyxiexzf(i, i2, i3, charSequence);
            menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf.m1564Ujhhgtgfeyxiexzf(true);
            m1559Ujhhgtgfeyxiexzf();
            return menuItemC0357UjhhgtgfeyxiexzfMo1542Ujhhgtgfeyxiexzf;
        }
        String simpleName = this.f2308Ujhhgtgfeyxiexzf.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, simpleName, "#getMaxItemCount()"));
    }
}
