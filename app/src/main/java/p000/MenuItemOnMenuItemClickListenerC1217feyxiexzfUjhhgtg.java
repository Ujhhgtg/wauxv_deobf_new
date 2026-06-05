package p000;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4526Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4527Ujhhgtgfeyxiexzf;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg(int i, Object obj) {
        this.f4526Ujhhgtgfeyxiexzf = i;
        this.f4527Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, InvocationTargetException {
        switch (this.f4526Ujhhgtgfeyxiexzf) {
            case 0:
                ((C1216feyxiexzfUjhhgtg) this.f4527Ujhhgtgfeyxiexzf).invoke(menuItem);
                return Boolean.TRUE.booleanValue();
            default:
                new C1019feyxiexzfUjhhgtg((Activity) this.f4527Ujhhgtgfeyxiexzf).m2518Ujhhgtgfeyxiexzf();
                return true;
        }
    }
}
