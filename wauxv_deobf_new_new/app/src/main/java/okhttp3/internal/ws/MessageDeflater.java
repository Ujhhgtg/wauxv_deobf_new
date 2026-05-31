package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import p000.AbstractC0972;
import p000.AbstractC3528;
import p000.C0479;
import p000.C0481;
import p000.C0516;
import p000.C1009;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final C0481 deflatedBytes;
    private final Deflater deflater;
    private final C1009 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C0481 c0481 = new C0481();
        this.deflatedBytes = c0481;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C1009(c0481, deflater);
    }

    private final boolean endsWith(C0481 c0481, C0516 c0516) {
        return c0481.mo1881(c0481.f2128 - ((long) c0516.mo1964()), c0516);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C0481 c0481) throws IOException {
        if (this.deflatedBytes.f2128 != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c0481, c0481.f2128);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            C0481 c0482 = this.deflatedBytes;
            long j = c0482.f2128 - ((long) 4);
            C0479 c0479M1876 = c0482.m1876(AbstractC0972.f3528);
            try {
                c0479M1876.m1851(j);
                c0479M1876.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(c0479M1876, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.m1890(0);
        }
        C0481 c0483 = this.deflatedBytes;
        c0481.write(c0483, c0483.f2128);
    }
}
