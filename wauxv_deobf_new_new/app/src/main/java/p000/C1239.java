package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1239 extends InputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final ArrayDeque f4467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2534 f4468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public IOException f4469;

    static {
        char[] cArr = AbstractC3580.f11185;
        f4467 = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4468.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4468.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f4468.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f4468.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4468.read();
        } catch (IOException e) {
            this.f4469 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4468.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f4468.skip(j);
        } catch (IOException e) {
            this.f4469 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4468.read(bArr);
        } catch (IOException e) {
            this.f4469 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f4468.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4469 = e;
            throw e;
        }
    }
}
