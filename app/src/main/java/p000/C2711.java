package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 extends ConnectivityManager.NetworkCallback {

    public final /* synthetic */ C1067 f8756;

    public C2711(C1067 c1067) {
        this.f8756 = c1067;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC3522.m5109().post(new RunnableC2710(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC3522.m5109().post(new RunnableC2710(this, false));
    }
}
