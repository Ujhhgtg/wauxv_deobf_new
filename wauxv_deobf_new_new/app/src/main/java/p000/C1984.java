package p000;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲀᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1984 extends AbstractC1848 implements InterfaceC1976 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final Method f6577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C0102 f6578;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6577 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.InterfaceC1976
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1245(MenuC1975 menuC1975, MenuItem menuItem) {
        C0102 c0102 = this.f6578;
        if (c0102 != null) {
            c0102.mo1245(menuC1975, menuItem);
        }
    }

    @Override // p000.InterfaceC1976
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final void mo1253(MenuC1975 menuC1975, MenuItemC1977 menuItemC1977) {
        C0102 c0102 = this.f6578;
        if (c0102 != null) {
            c0102.mo1253(menuC1975, menuItemC1977);
        }
    }
}
