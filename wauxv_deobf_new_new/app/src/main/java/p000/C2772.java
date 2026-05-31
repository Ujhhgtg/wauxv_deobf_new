package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2772 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1072 f8919;

    public C2772(C1072 c1072) {
        this.f8919 = c1072;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC3580.m5121().post(new RunnableC2771(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC3580.m5121().post(new RunnableC2771(this, false));
    }
}
