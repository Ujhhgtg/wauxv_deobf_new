package p000;

import android.os.Process;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2559 extends Thread {

    public final int f8125;

    public C2559(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f8125 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f8125);
        super.run();
    }
}
