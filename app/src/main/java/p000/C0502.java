package p000;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0502 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0504 f2162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f2163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2646 f2164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public byte[] f2166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public long f2165 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f2167 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f2168 = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2162 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f2162 = null;
        this.f2164 = null;
        this.f2165 = -1L;
        this.f2166 = null;
        this.f2167 = -1;
        this.f2168 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1757(long j) {
        C0504 c0504 = this.f2162;
        if (c0504 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f2163) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = c0504.f2172;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2784.m4746(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                C2646 c2646 = c0504.f2171.f8545;
                int i = c2646.f8541;
                long j4 = i - c2646.f8540;
                if (j4 > j3) {
                    c2646.f8541 = i - ((int) j3);
                    break;
                } else {
                    c0504.f2171 = c2646.m4645();
                    AbstractC2648.m4649(c2646);
                    j3 -= j4;
                }
            }
            this.f2164 = null;
            this.f2165 = j;
            this.f2166 = null;
            this.f2167 = -1;
            this.f2168 = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                C2646 c2646M1794 = c0504.m1794(i2);
                int iMin = (int) Math.min(j5, 8192 - c2646M1794.f8541);
                int i3 = c2646M1794.f8541 + iMin;
                c2646M1794.f8541 = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.f2164 = c2646M1794;
                    this.f2165 = j2;
                    this.f2166 = c2646M1794.f8539;
                    this.f2167 = i3 - iMin;
                    this.f2168 = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        c0504.f2172 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m1758(long j) {
        C0504 c0504 = this.f2162;
        if (c0504 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = c0504.f2172;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.f2164 = null;
                    this.f2165 = j;
                    this.f2166 = null;
                    this.f2167 = -1;
                    this.f2168 = -1;
                    return -1;
                }
                C2646 c2646 = c0504.f2171;
                C2646 c2647 = this.f2164;
                long j3 = 0;
                if (c2647 != null) {
                    long j4 = this.f2165 - ((long) (this.f2167 - c2647.f8540));
                    if (j4 > j) {
                        c2647 = c2646;
                        c2646 = c2647;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    c2647 = c2646;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = ((long) (c2647.f8541 - c2647.f8540)) + j3;
                        if (j < j5) {
                            break;
                        }
                        c2647 = c2647.f8544;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        c2646 = c2646.f8545;
                        j2 -= (long) (c2646.f8541 - c2646.f8540);
                    }
                    c2647 = c2646;
                    j3 = j2;
                }
                if (this.f2163 && c2647.f8542) {
                    byte[] bArr = c2647.f8539;
                    C2646 c2648 = new C2646(Arrays.copyOf(bArr, bArr.length), c2647.f8540, c2647.f8541, false, true);
                    if (c0504.f2171 == c2647) {
                        c0504.f2171 = c2648;
                    }
                    c2647.m4646(c2648);
                    c2648.f8545.m4645();
                    c2647 = c2648;
                }
                this.f2164 = c2647;
                this.f2165 = j;
                this.f2166 = c2647.f8539;
                int i = c2647.f8540 + ((int) (j - j3));
                this.f2167 = i;
                int i2 = c2647.f8541;
                this.f2168 = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c0504.f2172);
    }
}
