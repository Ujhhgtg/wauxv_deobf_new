package p000;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2158 extends MenuC1975 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final Class f7144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int f7145;

    public C2158(Context context, Class cls, int i) {
        super(context);
        this.f7144 = cls;
        this.f7145 = i;
    }

    @Override // p000.MenuC1975, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f7144.getSimpleName().concat(" does not support submenus"));
    }

    @Override // p000.MenuC1975
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final MenuItemC1977 mo3948(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f6517.size() + 1;
        int i4 = this.f7145;
        if (size <= i4) {
            m3966();
            MenuItemC1977 menuItemC1977Mo3948 = super.mo3948(i, i2, i3, charSequence);
            menuItemC1977Mo3948.m3970(true);
            m3965();
            return menuItemC1977Mo3948;
        }
        String simpleName = this.f7144.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC2844.m4786(sb, simpleName, "#getMaxItemCount()"));
    }
}
