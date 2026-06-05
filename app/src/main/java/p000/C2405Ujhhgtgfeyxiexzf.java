package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛳ要点脸ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2405Ujhhgtgfeyxiexzf extends Thread {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7801Ujhhgtgfeyxiexzf = 1;

    public /* synthetic */ C2405Ujhhgtgfeyxiexzf(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f7801Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C2401Ujhhgtgfeyxiexzf.Companion.getClass();
                ReentrantLock reentrantLock = C2401Ujhhgtgfeyxiexzf.lock;
                reentrantLock.lock();
                try {
                    C2401Ujhhgtgfeyxiexzf c2401UjhhgtgfeyxiexzfM3662Ujhhgtgfeyxiexzf = C2397Ujhhgtgfeyxiexzf.m3662Ujhhgtgfeyxiexzf();
                    if (c2401UjhhgtgfeyxiexzfM3662Ujhhgtgfeyxiexzf == C2401Ujhhgtgfeyxiexzf.head) {
                        C2401Ujhhgtgfeyxiexzf.head = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c2401UjhhgtgfeyxiexzfM3662Ujhhgtgfeyxiexzf != null) {
                            c2401UjhhgtgfeyxiexzfM3662Ujhhgtgfeyxiexzf.timedOut();
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

    public /* synthetic */ C2405Ujhhgtgfeyxiexzf(String str) {
        super(str);
    }
}
