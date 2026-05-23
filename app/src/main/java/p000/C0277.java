package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0277 extends Thread {

    public final /* synthetic */ int f1482 = 1;

    public /* synthetic */ C0277(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (1) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                
                ReentrantLock reentrantLock = C0280.lock;
                reentrantLock.lock();
                try {
                    C0280 c0280M1401 = C0276.m1401();
                    if (c0280M1401 == C0280.head) {
                        C0280.head = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c0280M1401 != null) {
                            c0280M1401.timedOut();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public /* synthetic */ C0277(String str) {
        super(str);
    }
}
