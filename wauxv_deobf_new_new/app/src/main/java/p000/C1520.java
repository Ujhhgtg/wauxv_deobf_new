package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1520 implements InterfaceC2846 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public byte f5354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2531 f5355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Inflater f5356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1647 f5357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final CRC32 f5358;

    public C1520(InterfaceC2846 interfaceC2846) {
        C2531 c2531 = new C2531(interfaceC2846);
        this.f5355 = c2531;
        Inflater inflater = new Inflater(true);
        this.f5356 = inflater;
        this.f5357 = new C1647(c2531, inflater);
        this.f5358 = new CRC32();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3428(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5357.close();
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) throws IOException {
        long j2;
        C1520 c1520 = this;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c1520.f5354;
        CRC32 crc32 = c1520.f5358;
        C2531 c2531 = c1520.f5355;
        if (b == 0) {
            c2531.mo1884(10L);
            C0481 c0482 = c2531.f8065;
            byte bM1866 = c0482.m1866(3L);
            boolean z = ((bM1866 >> 1) & 1) == 1;
            if (z) {
                c1520.m3429(0L, c0482, 10L);
            }
            m3428(8075, c2531.readShort(), "ID1ID2");
            c2531.skip(8L);
            if (((bM1866 >> 2) & 1) == 1) {
                c2531.mo1884(2L);
                if (z) {
                    m3429(0L, c0482, 2L);
                }
                short s = c0482.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c2531.mo1884(j3);
                if (z) {
                    m3429(0L, c0482, j3);
                }
                c2531.skip(j3);
            }
            if (((bM1866 >> 3) & 1) == 1) {
                long jM4449 = c2531.m4449(0L, Long.MAX_VALUE, (byte) 0);
                if (jM4449 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m3429(0L, c0482, jM4449 + 1);
                } else {
                    j2 = 2;
                }
                c2531.skip(jM4449 + 1);
            } else {
                j2 = 2;
            }
            if (((bM1866 >> 4) & 1) == 1) {
                long j4 = j2;
                long jM44410 = c2531.m4449(0L, Long.MAX_VALUE, (byte) 0);
                if (jM44410 == -1) {
                    throw new EOFException();
                }
                j2 = j4;
                if (z) {
                    c1520 = this;
                    c1520.m3429(0L, c0482, jM44410 + 1);
                } else {
                    c1520 = this;
                }
                c2531.skip(jM44410 + 1);
            } else {
                c1520 = this;
            }
            if (z) {
                c2531.mo1884(j2);
                short s2 = c0482.readShort();
                m3428((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c1520.f5354 = (byte) 1;
        }
        if (c1520.f5354 == 1) {
            long j5 = c0481.f2128;
            long j6 = c1520.f5357.read(c0481, j);
            if (j6 != -1) {
                c1520.m3429(j5, c0481, j6);
                return j6;
            }
            c1520.f5354 = (byte) 2;
        }
        if (c1520.f5354 == 2) {
            m3428(c2531.m4450(), (int) crc32.getValue(), "CRC");
            m3428(c2531.m4450(), (int) c1520.f5356.getBytesWritten(), "ISIZE");
            c1520.f5354 = (byte) 3;
            if (!c2531.mo1860()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return this.f5355.f8064.timeout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3429(long j, C0481 c0481, long j2) {
        C2707 c2707 = c0481.f2127;
        while (true) {
            int i = c2707.f8706;
            int i2 = c2707.f8705;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c2707 = c2707.f8709;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c2707.f8705) + j);
            int iMin = (int) Math.min(c2707.f8706 - i3, j2);
            this.f5358.update(c2707.f8704, i3, iMin);
            j2 -= (long) iMin;
            c2707 = c2707.f8709;
            j = 0;
        }
    }
}
