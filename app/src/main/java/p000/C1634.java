package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1634 implements InterfaceC2786 {

    public final C2477 f5544;

    public final Inflater f5545;

    public int f5546;

    public boolean f5547;

    public C1634(C2477 c2477, Inflater inflater) {
        this.f5544 = c2477;
        this.f5545 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5547) {
            return;
        }
        this.f5545.end();
        this.f5547 = true;
        this.f5544.close();
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) throws IOException {
        do {
            long jM3357 = m3357(c0504, j);
            if (jM3357 > 0) {
                return jM3357;
            }
            Inflater inflater = this.f5545;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f5544.mo1766());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return this.f5544.f7913.timeout();
    }

    public final long m3357(C0504 c0504, long j) throws IOException {
        Inflater inflater = this.f5545;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
        }
        if (this.f5547) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C2646 c2646M1794 = c0504.m1794(1);
                int iMin = (int) Math.min(j, 8192 - c2646M1794.f8541);
                boolean zNeedsInput = inflater.needsInput();
                C2477 c2477 = this.f5544;
                if (zNeedsInput && !c2477.mo1766()) {
                    C2646 c2646 = c2477.f7914.f2171;
                    int i = c2646.f8541;
                    int i2 = c2646.f8540;
                    int i3 = i - i2;
                    this.f5546 = i3;
                    inflater.setInput(c2646.f8539, i2, i3);
                }
                int iInflate = inflater.inflate(c2646M1794.f8539, c2646M1794.f8541, iMin);
                int i4 = this.f5546;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f5546 -= remaining;
                    c2477.skip(remaining);
                }
                if (iInflate > 0) {
                    c2646M1794.f8541 += iInflate;
                    long j2 = iInflate;
                    c0504.f2172 += j2;
                    return j2;
                }
                if (c2646M1794.f8540 == c2646M1794.f8541) {
                    c0504.f2171 = c2646M1794.m4645();
                    AbstractC2648.m4649(c2646M1794);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
