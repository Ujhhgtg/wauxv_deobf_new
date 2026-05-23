package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import bsh.Primitive;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0331 extends C0357 {

    public Class f1585;

    public String f1586;

    public AutoCloseable f1587;

    public C3532 f1588;

    @Override // p000.C0357, p000.AbstractC2707, p000.InterfaceC2225
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        if (m4710().length == 1) {
            C0356 c0356 = new C0356();
            InterfaceC2225 interfaceC2225 = this.f8721[0];
            do {
                AbstractC2707 abstractC2707 = (AbstractC2707) interfaceC2225;
                if (abstractC2707.m4710().length <= 0) {
                    break;
                }
                interfaceC2225 = abstractC2707.f8721[0];
            } while (!(interfaceC2225 instanceof C0326));
            C0326 c0326 = new C0326(14);
            c0326.f8720 = c0356;
            c0326.f1577 = ((C0326) interfaceC2225).f1577;
            c0356.m4709(c0326, 0);
            c0356.f8720 = this;
            this.f8721 = new InterfaceC2225[]{c0356, this.f8721[0]};
        }
        Class clsM1467 = ((C0356) this.f8721[0]).m1467(c0550, runnableC1668);
        this.f1585 = clsM1467;
        if (!AutoCloseable.class.isAssignableFrom(clsM1467)) {
            throw new C1230("The resource type " + this.f1585.getName() + " does not implement java.lang.AutoCloseable.", this, c0550);
        }
        this.f1586 = m1469()[0].f1675;
        super.mo306(c0550, runnableC1668);
        try {
            this.f1588 = c0550.m1929().m357(this.f1586, true);
            return Primitive.VOID;
        } catch (C3523 e) {
            throw e.mo4644("Unable to evaluate the try-with-resource " + this.f1586 + ". With message:" + e.getMessage(), this, c0550);
        }
    }

    public final void m1442() throws Exception {
        boolean zIsTerminated;
        C3532 c3532 = this.f1588;
        if (c3532 != null) {
            this.f1587 = (AutoCloseable) c3532.m5124();
        }
        AutoCloseable autoCloseable = this.f1587;
        if (autoCloseable != null) {
            if (true) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
