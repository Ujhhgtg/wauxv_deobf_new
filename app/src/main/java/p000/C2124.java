package p000;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2124 extends MenuC1944 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final Class f7020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int f7021;

    public C2124(Context context, Class cls, int i) {
        super(context);
        this.f7020 = cls;
        this.f7021 = i;
    }

    @Override // p000.MenuC1944, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f7020.getSimpleName().concat(" does not support submenus"));
    }

    @Override // p000.MenuC1944
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final MenuItemC1946 mo3754(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f6412.size() + 1;
        int i4 = this.f7021;
        if (size <= i4) {
            m3772();
            MenuItemC1946 menuItemC1946Mo3754 = super.mo3754(i, i2, i3, charSequence);
            menuItemC1946Mo3754.m3776(true);
            m3771();
            return menuItemC1946Mo3754;
        }
        String simpleName = this.f7020.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC2784.m4752(sb, simpleName, "#getMaxItemCount()"));
    }
}
