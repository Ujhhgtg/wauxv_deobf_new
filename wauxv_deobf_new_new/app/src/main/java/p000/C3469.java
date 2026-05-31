package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3469 implements InterfaceC0147, InterfaceC1973 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f10915;

    public /* synthetic */ C3469(Toolbar toolbar) {
        this.f10915 = toolbar;
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo1247(MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC1973
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public void mo1259(MenuC1975 menuC1975) {
        C0138 c0138;
        Toolbar toolbar = this.f10915;
        C0144 c0144 = toolbar.f148.f82;
        if (c0144 == null || (c0138 = c0144.f1190) == null || !c0138.m3975()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f180.f5660).iterator();
            if (it.hasNext()) {
                ((AbstractC1417) it.next()).getClass();
                throw null;
            }
        }
    }
}
