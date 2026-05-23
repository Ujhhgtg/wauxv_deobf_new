package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import p000.C0504;
import p000.C1634;
import p000.C2477;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final C0504 deflatedBytes;
    private final Inflater inflater;
    private final C1634 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C0504 c0504 = new C0504();
        this.deflatedBytes = c0504;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new C1634(new C2477(c0504), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(C0504 c0504) throws IOException {
        if (this.deflatedBytes.f2172 != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.mo1769(c0504);
        this.deflatedBytes.m1799(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f2172;
        do {
            this.inflaterSource.m3357(c0504, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
