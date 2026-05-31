package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1647 implements InterfaceC2846 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2531 f5578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Inflater f5579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f5581;

    public C1647(C2531 c2531, Inflater inflater) {
        this.f5578 = c2531;
        this.f5579 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5581) {
            return;
        }
        this.f5579.end();
        this.f5581 = true;
        this.f5578.close();
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) throws IOException {
        do {
            long jM3521 = m3521(c0481, j);
            if (jM3521 > 0) {
                return jM3521;
            }
            Inflater inflater = this.f5579;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f5578.mo1860());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return this.f5578.f8064.timeout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long m3521(C0481 c0481, long j) throws IOException {
        Inflater inflater = this.f5579;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
        }
        if (this.f5581) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C2707 c2707M1888 = c0481.m1888(1);
                int iMin = (int) Math.min(j, 8192 - c2707M1888.f8706);
                boolean zNeedsInput = inflater.needsInput();
                C2531 c2531 = this.f5578;
                if (zNeedsInput && !c2531.mo1860()) {
                    C2707 c2707 = c2531.f8065.f2127;
                    int i = c2707.f8706;
                    int i2 = c2707.f8705;
                    int i3 = i - i2;
                    this.f5580 = i3;
                    inflater.setInput(c2707.f8704, i2, i3);
                }
                int iInflate = inflater.inflate(c2707M1888.f8704, c2707M1888.f8706, iMin);
                int i4 = this.f5580;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f5580 -= remaining;
                    c2531.skip(remaining);
                }
                if (iInflate > 0) {
                    c2707M1888.f8706 += iInflate;
                    long j2 = iInflate;
                    c0481.f2128 += j2;
                    return j2;
                }
                if (c2707M1888.f8705 == c2707M1888.f8706) {
                    c0481.f2127 = c2707M1888.m4679();
                    AbstractC2709.m4683(c2707M1888);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
