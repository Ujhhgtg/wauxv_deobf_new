package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3411 implements InterfaceC0139, InterfaceC1942 {

    public final /* synthetic */ Toolbar f10754;

    public /* synthetic */ C3411(Toolbar toolbar) {
        this.f10754 = toolbar;
    }

    @Override // p000.InterfaceC1942
    public boolean mo1101(MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC1942
    public void mo1113(MenuC1944 menuC1944) {
        C0130 c0130;
        Toolbar toolbar = this.f10754;
        C0136 c0136 = toolbar.f148.f82;
        if (c0136 == null || (c0130 = c0136.f1122) == null || !c0130.m3781()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f180.f5843).iterator();
            if (it.hasNext()) {
                
                throw null;
            }
        }
    }
}
