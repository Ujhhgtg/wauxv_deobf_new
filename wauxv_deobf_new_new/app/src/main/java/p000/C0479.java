package p000;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0479 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0481 f2118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2707 f2120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public byte[] f2122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public long f2121 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f2123 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f2124 = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2118 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f2118 = null;
        this.f2120 = null;
        this.f2121 = -1L;
        this.f2122 = null;
        this.f2123 = -1;
        this.f2124 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1851(long j) {
        C0481 c0481 = this.f2118;
        if (c0481 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f2119) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = c0481.f2128;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2844.m4780(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                C2707 c2707 = c0481.f2127.f8710;
                int i = c2707.f8706;
                long j4 = i - c2707.f8705;
                if (j4 > j3) {
                    c2707.f8706 = i - ((int) j3);
                    break;
                } else {
                    c0481.f2127 = c2707.m4679();
                    AbstractC2709.m4683(c2707);
                    j3 -= j4;
                }
            }
            this.f2120 = null;
            this.f2121 = j;
            this.f2122 = null;
            this.f2123 = -1;
            this.f2124 = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                C2707 c2707M1888 = c0481.m1888(i2);
                int iMin = (int) Math.min(j5, 8192 - c2707M1888.f8706);
                int i3 = c2707M1888.f8706 + iMin;
                c2707M1888.f8706 = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.f2120 = c2707M1888;
                    this.f2121 = j2;
                    this.f2122 = c2707M1888.f8704;
                    this.f2123 = i3 - iMin;
                    this.f2124 = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        c0481.f2128 = j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m1852(long j) {
        C0481 c0481 = this.f2118;
        if (c0481 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = c0481.f2128;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.f2120 = null;
                    this.f2121 = j;
                    this.f2122 = null;
                    this.f2123 = -1;
                    this.f2124 = -1;
                    return -1;
                }
                C2707 c2707 = c0481.f2127;
                C2707 c2708 = this.f2120;
                long j3 = 0;
                if (c2708 != null) {
                    long j4 = this.f2121 - ((long) (this.f2123 - c2708.f8705));
                    if (j4 > j) {
                        c2708 = c2707;
                        c2707 = c2708;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    c2708 = c2707;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = ((long) (c2708.f8706 - c2708.f8705)) + j3;
                        if (j < j5) {
                            break;
                        }
                        c2708 = c2708.f8709;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        c2707 = c2707.f8710;
                        j2 -= (long) (c2707.f8706 - c2707.f8705);
                    }
                    c2708 = c2707;
                    j3 = j2;
                }
                if (this.f2119 && c2708.f8707) {
                    byte[] bArr = c2708.f8704;
                    C2707 c2709 = new C2707(Arrays.copyOf(bArr, bArr.length), c2708.f8705, c2708.f8706, false, true);
                    if (c0481.f2127 == c2708) {
                        c0481.f2127 = c2709;
                    }
                    c2708.m4680(c2709);
                    c2709.f8710.m4679();
                    c2708 = c2709;
                }
                this.f2120 = c2708;
                this.f2121 = j;
                this.f2122 = c2708.f8704;
                int i = c2708.f8705 + ((int) (j - j3));
                this.f2123 = i;
                int i2 = c2708.f8706;
                this.f2124 = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c0481.f2128);
    }
}
