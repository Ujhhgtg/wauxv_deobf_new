package p000;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC2751 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f8836;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC2751(int i, Object obj) {
        this.f8835 = i;
        this.f8836 = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, InvocationTargetException {
        switch (this.f8835) {
            case 0:
                ((C2750) this.f8836).invoke(menuItem);
                return Boolean.TRUE.booleanValue();
            default:
                new C2675((Activity) this.f8836).m4686();
                return true;
        }
    }
}
