package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0980 implements InterfaceC0776 {

    public final Context f3592;

    public final C2562 f3593;

    public C0980(Context context, C2562 c2562) {
        this.f3592 = context.getApplicationContext();
        this.f3593 = c2562;
    }

    @Override // p000.InterfaceC1775
    public final void mo1622() {
        C2712 c2712M4718 = C2712.m4718(this.f3592);
        C2562 c2562 = this.f3593;
        synchronized (c2712M4718) {
            ((HashSet) c2712M4718.f8761).remove(c2562);
            if (c2712M4718.f8759 && ((HashSet) c2712M4718.f8761).isEmpty()) {
                C1067 c1067 = (C1067) c2712M4718.f8760;
                ((ConnectivityManager) ((C1215) c1067.f3857).get()).unregisterNetworkCallback((C2711) c1067.f3858);
                c2712M4718.f8759 = false;
            }
        }
    }

    @Override // p000.InterfaceC1775
    public final void mo1626() {
        C2712 c2712M4718 = C2712.m4718(this.f3592);
        C2562 c2562 = this.f3593;
        synchronized (c2712M4718) {
            ((HashSet) c2712M4718.f8761).add(c2562);
            c2712M4718.m4720();
        }
    }

    @Override // p000.InterfaceC1775
    public final void mo1620() {
    }
}
