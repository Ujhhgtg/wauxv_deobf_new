package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import p000.AbstractC0968;
import p000.AbstractC1458;
import p000.C0502;
import p000.C0504;
import p000.C0539;
import p000.C1005;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final C0504 deflatedBytes;
    private final Deflater deflater;
    private final C1005 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C0504 c0504 = new C0504();
        this.deflatedBytes = c0504;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C1005(c0504, deflater);
    }

    private final boolean endsWith(C0504 c0504, C0539 c0539) {
        return c0504.mo1787(c0504.f2172 - ((long) c0539.mo1870()), c0539);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C0504 c0504) throws IOException {
        if (this.deflatedBytes.f2172 != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c0504, c0504.f2172);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            C0504 c0505 = this.deflatedBytes;
            long j = c0505.f2172 - ((long) 4);
            C0502 c0502M1782 = c0505.m1782(AbstractC0968.f3511);
            try {
                c0502M1782.m1757(j);
                c0502M1782.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1458.m3154(c0502M1782, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.m1796(0);
        }
        C0504 c0506 = this.deflatedBytes;
        c0504.write(c0506, c0506.f2172);
    }
}
