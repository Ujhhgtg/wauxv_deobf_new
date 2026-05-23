package p000;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2858 implements MenuItem.OnMenuItemClickListener {

    public static final Class[] f9129 = {MenuItem.class};

    public Object f9130;

    public Method f9131;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f9130;
        Method method = this.f9131;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
