package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛲᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0524Ujhhgtgfeyxiexzf implements InterfaceC1227feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public byte f2477Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0789feyxiexzfUjhhgtg f2478Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Inflater f2479Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0650Ujhhgtgfeyxiexzf f2480Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final CRC32 f2481Ujhhgtgfeyxiexzf;

    public C0524Ujhhgtgfeyxiexzf(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = new C0789feyxiexzfUjhhgtg(interfaceC1227feyxiexzfUjhhgtg);
        this.f2478Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg;
        Inflater inflater = new Inflater(true);
        this.f2479Ujhhgtgfeyxiexzf = inflater;
        this.f2480Ujhhgtgfeyxiexzf = new C0650Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg, inflater);
        this.f2481Ujhhgtgfeyxiexzf = new CRC32();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m1810Ujhhgtgfeyxiexzf(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2480Ujhhgtgfeyxiexzf.close();
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        long j2;
        C0524Ujhhgtgfeyxiexzf c0524Ujhhgtgfeyxiexzf = this;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf;
        CRC32 crc32 = c0524Ujhhgtgfeyxiexzf.f2481Ujhhgtgfeyxiexzf;
        C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = c0524Ujhhgtgfeyxiexzf.f2478Ujhhgtgfeyxiexzf;
        if (b == 0) {
            c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(10L);
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf;
            byte bM3859Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg2.m3859Ujhhgtgfeyxiexzf(3L);
            boolean z = ((bM3859Ujhhgtgfeyxiexzf >> 1) & 1) == 1;
            if (z) {
                c0524Ujhhgtgfeyxiexzf.m1811Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, 10L);
            }
            m1810Ujhhgtgfeyxiexzf(8075, c0789feyxiexzfUjhhgtg.readShort(), "ID1ID2");
            c0789feyxiexzfUjhhgtg.skip(8L);
            if (((bM3859Ujhhgtgfeyxiexzf >> 2) & 1) == 1) {
                c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(2L);
                if (z) {
                    m1811Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, 2L);
                }
                short s = c2598feyxiexzfUjhhgtg2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(j3);
                if (z) {
                    m1811Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, j3);
                }
                c0789feyxiexzfUjhhgtg.skip(j3);
            }
            if (((bM3859Ujhhgtgfeyxiexzf >> 3) & 1) == 1) {
                long jM2105Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.m2105Ujhhgtgfeyxiexzf(0L, Long.MAX_VALUE, (byte) 0);
                if (jM2105Ujhhgtgfeyxiexzf == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    m1811Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, jM2105Ujhhgtgfeyxiexzf + 1);
                } else {
                    j2 = 2;
                }
                c0789feyxiexzfUjhhgtg.skip(jM2105Ujhhgtgfeyxiexzf + 1);
            } else {
                j2 = 2;
            }
            if (((bM3859Ujhhgtgfeyxiexzf >> 4) & 1) == 1) {
                long j4 = j2;
                long jM2105Ujhhgtgfeyxiexzf2 = c0789feyxiexzfUjhhgtg.m2105Ujhhgtgfeyxiexzf(0L, Long.MAX_VALUE, (byte) 0);
                if (jM2105Ujhhgtgfeyxiexzf2 == -1) {
                    throw new EOFException();
                }
                j2 = j4;
                if (z) {
                    c0524Ujhhgtgfeyxiexzf = this;
                    c0524Ujhhgtgfeyxiexzf.m1811Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, jM2105Ujhhgtgfeyxiexzf2 + 1);
                } else {
                    c0524Ujhhgtgfeyxiexzf = this;
                }
                c0789feyxiexzfUjhhgtg.skip(jM2105Ujhhgtgfeyxiexzf2 + 1);
            } else {
                c0524Ujhhgtgfeyxiexzf = this;
            }
            if (z) {
                c0789feyxiexzfUjhhgtg.mo2118feyxiexzfUjhhgtg(j2);
                short s2 = c2598feyxiexzfUjhhgtg2.readShort();
                m1810Ujhhgtgfeyxiexzf((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf = (byte) 1;
        }
        if (c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf == 1) {
            long j5 = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
            long j6 = c0524Ujhhgtgfeyxiexzf.f2480Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, j);
            if (j6 != -1) {
                c0524Ujhhgtgfeyxiexzf.m1811Ujhhgtgfeyxiexzf(j5, c2598feyxiexzfUjhhgtg, j6);
                return j6;
            }
            c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf = (byte) 2;
        }
        if (c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf == 2) {
            m1810Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg.m2108Ujhhgtgfeyxiexzf(), (int) crc32.getValue(), "CRC");
            m1810Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg.m2108Ujhhgtgfeyxiexzf(), (int) c0524Ujhhgtgfeyxiexzf.f2479Ujhhgtgfeyxiexzf.getBytesWritten(), "ISIZE");
            c0524Ujhhgtgfeyxiexzf.f2477Ujhhgtgfeyxiexzf = (byte) 3;
            if (!c0789feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f2478Ujhhgtgfeyxiexzf.f3096Ujhhgtgfeyxiexzf.timeout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1811Ujhhgtgfeyxiexzf(long j, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j2) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
        while (true) {
            int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            int i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j);
            int iMin = (int) Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - i3, j2);
            this.f2481Ujhhgtgfeyxiexzf.update(c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, i3, iMin);
            j2 -= (long) iMin;
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
            j = 0;
        }
    }
}
