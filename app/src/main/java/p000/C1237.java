package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1237 extends InputStream {

    public static final ArrayDeque f4468;

    public C2479 f4469;

    public IOException f4470;

    static {
        char[] cArr = AbstractC3522.f11032;
        f4468 = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4469.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4469.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f4469.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4469.read();
        } catch (IOException e) {
            this.f4470 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4469.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f4469.skip(j);
        } catch (IOException e) {
            this.f4470 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4469.read(bArr);
        } catch (IOException e) {
            this.f4470 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f4469.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4470 = e;
            throw e;
        }
    }
}
