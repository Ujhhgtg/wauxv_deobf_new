package p000;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛴ要点脸ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0371Ujhhgtgfeyxiexzf extends AbstractC0253Ujhhgtgfeyxiexzf implements InterfaceC0358Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final Method f2077feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2965Ujhhgtgfeyxiexzf f2078feyxiexzfUjhhgtg;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2077feyxiexzfUjhhgtg = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.InterfaceC0358Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1567Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItem menuItem) {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = this.f2078feyxiexzfUjhhgtg;
        if (c2965Ujhhgtgfeyxiexzf != null) {
            c2965Ujhhgtgfeyxiexzf.mo1567Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItem);
        }
    }

    @Override // p000.InterfaceC0358Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final void mo1568Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = this.f2078feyxiexzfUjhhgtg;
        if (c2965Ujhhgtgfeyxiexzf != null) {
            c2965Ujhhgtgfeyxiexzf.mo1568Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItemC0357Ujhhgtgfeyxiexzf);
        }
    }
}
