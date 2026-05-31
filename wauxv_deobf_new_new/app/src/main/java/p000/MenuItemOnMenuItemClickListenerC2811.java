package p000;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᲁᛸᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC2811 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f8998;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC2811(Object obj, int i) {
        this.f8997 = i;
        this.f8998 = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        switch (this.f8997) {
            case 0:
                ((C2810) this.f8998).invoke(menuItem);
                return Boolean.TRUE.booleanValue();
            default:
                new C2735((Activity) this.f8998).m4720();
                return true;
        }
    }
}
