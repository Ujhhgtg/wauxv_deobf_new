package p000;

import android.os.Handler;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2561 implements Runnable {

    public CallableC1375 f8127;

    public C1376 f8128;

    public Handler f8129;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f8127.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f8129.post(new RunnableC0132(this.f8128, objCall, 5, false));
    }
}
