package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import p000.C0481;
import p000.C1647;
import p000.C2531;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final C0481 deflatedBytes;
    private final Inflater inflater;
    private final C1647 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C0481 c0481 = new C0481();
        this.deflatedBytes = c0481;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new C1647(new C2531(c0481), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(C0481 c0481) throws IOException {
        if (this.deflatedBytes.f2128 != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.mo1863(c0481);
        this.deflatedBytes.m1893(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f2128;
        do {
            this.inflaterSource.m3521(c0481, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
