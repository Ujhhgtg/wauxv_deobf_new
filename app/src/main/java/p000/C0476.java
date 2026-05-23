package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0476 extends BroadcastReceiver {

    public final /* synthetic */ InterfaceC1430 f2083;

    public C0476(InterfaceC1430 interfaceC1430) {
        this.f2083 = interfaceC1430;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        this.f2083.mo3133(this, context, intent);
    }
}
