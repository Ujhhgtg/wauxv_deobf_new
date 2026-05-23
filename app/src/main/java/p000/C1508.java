package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1508 implements InterfaceC2786 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public byte f5323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2477 f5324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Inflater f5325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1634 f5326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final CRC32 f5327;

    public C1508(InterfaceC2786 interfaceC2786) {
        C2477 c2477 = new C2477(interfaceC2786);
        this.f5324 = c2477;
        Inflater inflater = new Inflater(true);
        this.f5325 = inflater;
        this.f5326 = new C1634(c2477, inflater);
        this.f5327 = new CRC32();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3247(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5326.close();
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) throws IOException {
        long j2;
        C1508 c1508 = this;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c1508.f5323;
        CRC32 crc32 = c1508.f5327;
        C2477 c2477 = c1508.f5324;
        if (b == 0) {
            c2477.mo1790(10L);
            C0504 c0505 = c2477.f7914;
            byte bM1772 = c0505.m1772(3L);
            boolean z = ((bM1772 >> 1) & 1) == 1;
            if (z) {
                c1508.m3248(0L, c0505, 10L);
            }
            m3247(8075, c2477.readShort(), "ID1ID2");
            c2477.skip(8L);
            if (((bM1772 >> 2) & 1) == 1) {
                c2477.mo1790(2L);
                if (z) {
                    m3248(0L, c0505, 2L);
                }
                short s = c0505.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c2477.mo1790(j3);
                if (z) {
                    m3248(0L, c0505, j3);
                }
                c2477.skip(j3);
            }
            if (((bM1772 >> 3) & 1) == 1) {
                long jM4428 = c2477.m4428(0L, Long.MAX_VALUE, (byte) 0);
                if (jM4428 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m3248(0L, c0505, jM4428 + 1);
                } else {
                    j2 = 2;
                }
                c2477.skip(jM4428 + 1);
            } else {
                j2 = 2;
            }
            if (((bM1772 >> 4) & 1) == 1) {
                long j4 = j2;
                long jM4429 = c2477.m4428(0L, Long.MAX_VALUE, (byte) 0);
                if (jM4429 == -1) {
                    throw new EOFException();
                }
                j2 = j4;
                if (z) {
                    c1508 = this;
                    c1508.m3248(0L, c0505, jM4429 + 1);
                } else {
                    c1508 = this;
                }
                c2477.skip(jM4429 + 1);
            } else {
                c1508 = this;
            }
            if (z) {
                c2477.mo1790(j2);
                short s2 = c0505.readShort();
                m3247((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c1508.f5323 = (byte) 1;
        }
        if (c1508.f5323 == 1) {
            long j5 = c0504.f2172;
            long j6 = c1508.f5326.read(c0504, j);
            if (j6 != -1) {
                c1508.m3248(j5, c0504, j6);
                return j6;
            }
            c1508.f5323 = (byte) 2;
        }
        if (c1508.f5323 == 2) {
            m3247(c2477.m4429(), (int) crc32.getValue(), "CRC");
            m3247(c2477.m4429(), (int) c1508.f5325.getBytesWritten(), "ISIZE");
            c1508.f5323 = (byte) 3;
            if (!c2477.mo1766()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return this.f5324.f7913.timeout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3248(long j, C0504 c0504, long j2) {
        C2646 c2646 = c0504.f2171;
        while (true) {
            int i = c2646.f8541;
            int i2 = c2646.f8540;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c2646 = c2646.f8544;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c2646.f8540) + j);
            int iMin = (int) Math.min(c2646.f8541 - i3, j2);
            this.f5327.update(c2646.f8539, i3, iMin);
            j2 -= (long) iMin;
            c2646 = c2646.f8544;
            j = 0;
        }
    }
}
