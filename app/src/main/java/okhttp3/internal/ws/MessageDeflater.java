package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.C2589feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3124Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final C2598feyxiexzfUjhhgtg deflatedBytes;
    private final Deflater deflater;
    private final C3124Ujhhgtgfeyxiexzf deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        this.deflatedBytes = c2598feyxiexzfUjhhgtg;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C3124Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, deflater);
    }

    private final boolean endsWith(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        return c2598feyxiexzfUjhhgtg.mo2117feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf - ((long) c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf()), c2633Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) throws IOException {
        if (this.deflatedBytes.f8401Ujhhgtgfeyxiexzf != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c2598feyxiexzfUjhhgtg, c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.deflatedBytes;
            long j = c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf - ((long) 4);
            C2589feyxiexzfUjhhgtg c2589feyxiexzfUjhhgtgM3862Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg2.m3862Ujhhgtgfeyxiexzf(AbstractC3085Ujhhgtgfeyxiexzf.f9538Ujhhgtgfeyxiexzf);
            try {
                c2589feyxiexzfUjhhgtgM3862Ujhhgtgfeyxiexzf.m3845Ujhhgtgfeyxiexzf(j);
                c2589feyxiexzfUjhhgtgM3862Ujhhgtgfeyxiexzf.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(c2589feyxiexzfUjhhgtgM3862Ujhhgtgfeyxiexzf, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.m3869feyxiexzfUjhhgtg(0);
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg3 = this.deflatedBytes;
        c2598feyxiexzfUjhhgtg.write(c2598feyxiexzfUjhhgtg3, c2598feyxiexzfUjhhgtg3.f8401Ujhhgtgfeyxiexzf);
    }
}
