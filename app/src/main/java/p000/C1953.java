package p000;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1953 extends AbstractC1821 implements InterfaceC1945 {

    public static final Method f6472;

    public C0094 f6473;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6472 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.InterfaceC1945
    public final void mo1099(MenuC1944 menuC1944, MenuItem menuItem) {
        C0094 c0094 = this.f6473;
        if (c0094 != null) {
            c0094.mo1099(menuC1944, menuItem);
        }
    }

    @Override // p000.InterfaceC1945
    public final void mo1107(MenuC1944 menuC1944, MenuItemC1946 menuItemC1946) {
        C0094 c0094 = this.f6473;
        if (c0094 != null) {
            c0094.mo1107(menuC1944, menuItemC1946);
        }
    }
}
