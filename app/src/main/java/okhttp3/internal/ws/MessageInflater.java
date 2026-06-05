package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import p000.C0650Ujhhgtgfeyxiexzf;
import p000.C0789feyxiexzfUjhhgtg;
import p000.C2598feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final C2598feyxiexzfUjhhgtg deflatedBytes;
    private final Inflater inflater;
    private final C0650Ujhhgtgfeyxiexzf inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        this.deflatedBytes = c2598feyxiexzfUjhhgtg;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new C0650Ujhhgtgfeyxiexzf(new C0789feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) throws IOException {
        if (this.deflatedBytes.f8401Ujhhgtgfeyxiexzf != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.mo2147Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg);
        this.deflatedBytes.m3872feyxiexzfUjhhgtg(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f8401Ujhhgtgfeyxiexzf;
        do {
            this.inflaterSource.m1913Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
