package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0789feyxiexzfUjhhgtg implements InterfaceC2595feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC1227feyxiexzfUjhhgtg f3096Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2598feyxiexzfUjhhgtg f3097Ujhhgtgfeyxiexzf = new C2598feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f3098Ujhhgtgfeyxiexzf;

    public C0789feyxiexzfUjhhgtg(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        this.f3096Ujhhgtgfeyxiexzf = interfaceC1227feyxiexzfUjhhgtg;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f3098Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f3098Ujhhgtgfeyxiexzf = true;
        this.f3096Ujhhgtgfeyxiexzf.close();
        this.f3097Ujhhgtgfeyxiexzf.m3856Ujhhgtgfeyxiexzf();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3098Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final C0789feyxiexzfUjhhgtg peek() {
        return new C0789feyxiexzfUjhhgtg(new C1394feyxiexzfUjhhgtg(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf == 0 && this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
            return -1;
        }
        return c2598feyxiexzfUjhhgtg.read(byteBuffer);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final byte readByte() throws EOFException {
        mo2118feyxiexzfUjhhgtg(1L);
        return this.f3097Ujhhgtgfeyxiexzf.readByte();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final void readFully(byte[] bArr) throws EOFException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        try {
            mo2118feyxiexzfUjhhgtg(bArr.length);
            c2598feyxiexzfUjhhgtg.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c2598feyxiexzfUjhhgtg.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final int readInt() throws EOFException {
        mo2118feyxiexzfUjhhgtg(4L);
        return this.f3097Ujhhgtgfeyxiexzf.readInt();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final long readLong() throws EOFException {
        mo2118feyxiexzfUjhhgtg(8L);
        return this.f3097Ujhhgtgfeyxiexzf.readLong();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final short readShort() throws EOFException {
        mo2118feyxiexzfUjhhgtg(2L);
        return this.f3097Ujhhgtgfeyxiexzf.readShort();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final String readString(Charset charset) {
        InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = this.f3096Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(interfaceC1227feyxiexzfUjhhgtg);
        return c2598feyxiexzfUjhhgtg.m3864feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, charset);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final void skip(long j) throws EOFException {
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf == 0 && this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
            c2598feyxiexzfUjhhgtg.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f3096Ujhhgtgfeyxiexzf.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f3096Ujhhgtgfeyxiexzf + ')';
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2598feyxiexzfUjhhgtg mo2104Ujhhgtgfeyxiexzf() {
        return this.f3097Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final long m2105Ujhhgtgfeyxiexzf(long j, long j2, byte b) {
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            long j3 = j2;
            byte b2 = b;
            long jM3860Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3860Ujhhgtgfeyxiexzf(jMax, j3, b2);
            if (jM3860Ujhhgtgfeyxiexzf != -1) {
                return jM3860Ujhhgtgfeyxiexzf;
            }
            long j4 = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
            if (j4 >= j3 || this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            j2 = j3;
            b = b2;
        }
        return -1L;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf mo2106Ujhhgtgfeyxiexzf(long j) throws EOFException {
        mo2118feyxiexzfUjhhgtg(j);
        return this.f3097Ujhhgtgfeyxiexzf.mo2106Ujhhgtgfeyxiexzf(j);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final byte[] mo2107Ujhhgtgfeyxiexzf() {
        InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = this.f3096Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(interfaceC1227feyxiexzfUjhhgtg);
        return c2598feyxiexzfUjhhgtg.m3863feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m2108Ujhhgtgfeyxiexzf() throws EOFException {
        mo2118feyxiexzfUjhhgtg(4L);
        int i = this.f3097Ujhhgtgfeyxiexzf.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean mo2109Ujhhgtgfeyxiexzf() {
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        return c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf() && this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int mo2110Ujhhgtgfeyxiexzf(C1470feyxiexzfUjhhgtg c1470feyxiexzfUjhhgtg) throws EOFException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg;
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        do {
            c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            int iM4287Ujhhgtgfeyxiexzf = AbstractC2918Ujhhgtgfeyxiexzf.m4287Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, c1470feyxiexzfUjhhgtg, true);
            if (iM4287Ujhhgtgfeyxiexzf != -2) {
                if (iM4287Ujhhgtgfeyxiexzf == -1) {
                    break;
                }
                c2598feyxiexzfUjhhgtg.skip(c1470feyxiexzfUjhhgtg.f5108Ujhhgtgfeyxiexzf[iM4287Ujhhgtgfeyxiexzf].mo2578Ujhhgtgfeyxiexzf());
                return iM4287Ujhhgtgfeyxiexzf;
            }
        } while (this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1);
        return -1;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final long mo2111Ujhhgtgfeyxiexzf() throws EOFException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg;
        mo2118feyxiexzfUjhhgtg(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zMo2115Ujhhgtgfeyxiexzf = mo2115Ujhhgtgfeyxiexzf(j2);
            c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            if (!zMo2115Ujhhgtgfeyxiexzf) {
                break;
            }
            byte bM3859Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(j);
            if ((bM3859Ujhhgtgfeyxiexzf < 48 || bM3859Ujhhgtgfeyxiexzf > 57) && !(j == 0 && bM3859Ujhhgtgfeyxiexzf == 45)) {
                if (j != 0) {
                    break;
                }
                AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
                AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(Integer.toString(bM3859Ujhhgtgfeyxiexzf, 16)));
            }
            j = j2;
        }
        return c2598feyxiexzfUjhhgtg.mo2111Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final String mo2112Ujhhgtgfeyxiexzf(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM2105Ujhhgtgfeyxiexzf = m2105Ujhhgtgfeyxiexzf(0L, j2, (byte) 10);
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        if (jM2105Ujhhgtgfeyxiexzf != -1) {
            return AbstractC2918Ujhhgtgfeyxiexzf.m4286Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, jM2105Ujhhgtgfeyxiexzf);
        }
        if (j2 < Long.MAX_VALUE && mo2115Ujhhgtgfeyxiexzf(j2) && c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(j2 - 1) == 13 && mo2115Ujhhgtgfeyxiexzf(j2 + 1) && c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(j2) == 10) {
            return AbstractC2918Ujhhgtgfeyxiexzf.m4286Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, j2);
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg.m3858Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg2, Math.min(32, c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf));
        throw new EOFException("\\n not found: limit=" + Math.min(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, j) + " content=" + c2598feyxiexzfUjhhgtg2.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf).mo2579Ujhhgtgfeyxiexzf() + (char) 8230);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo2113Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws EOFException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.f3097Ujhhgtgfeyxiexzf;
        try {
            mo2118feyxiexzfUjhhgtg(j);
            c2598feyxiexzfUjhhgtg2.mo2113Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, j);
        } catch (EOFException e) {
            c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2);
            throw e;
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf mo2114Ujhhgtgfeyxiexzf() {
        InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = this.f3096Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
        c2598feyxiexzfUjhhgtg.mo2147Ujhhgtgfeyxiexzf(interfaceC1227feyxiexzfUjhhgtg);
        return c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo2115Ujhhgtgfeyxiexzf(long j) {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
        }
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        do {
            c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf >= j) {
                return true;
            }
        } while (this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) != -1);
        return false;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final String mo2116Ujhhgtgfeyxiexzf() {
        return mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean mo2117feyxiexzfUjhhgtg(long j, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        if (this.f3098Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        if (iMo2578Ujhhgtgfeyxiexzf >= 0 && c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() >= iMo2578Ujhhgtgfeyxiexzf) {
            for (int i = 0; i < iMo2578Ujhhgtgfeyxiexzf; i++) {
                long j2 = i;
                if (mo2115Ujhhgtgfeyxiexzf(1 + j2) && this.f3097Ujhhgtgfeyxiexzf.m3859Ujhhgtgfeyxiexzf(j2) == c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void mo2118feyxiexzfUjhhgtg(long j) throws EOFException {
        if (!mo2115Ujhhgtgfeyxiexzf(j)) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final long mo2119feyxiexzfUjhhgtg() throws EOFException {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg;
        mo2118feyxiexzfUjhhgtg(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zMo2115Ujhhgtgfeyxiexzf = mo2115Ujhhgtgfeyxiexzf(i2);
            c2598feyxiexzfUjhhgtg = this.f3097Ujhhgtgfeyxiexzf;
            if (!zMo2115Ujhhgtgfeyxiexzf) {
                break;
            }
            byte bM3859Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(i);
            if ((bM3859Ujhhgtgfeyxiexzf < 48 || bM3859Ujhhgtgfeyxiexzf > 57) && ((bM3859Ujhhgtgfeyxiexzf < 97 || bM3859Ujhhgtgfeyxiexzf > 102) && (bM3859Ujhhgtgfeyxiexzf < 65 || bM3859Ujhhgtgfeyxiexzf > 70))) {
                if (i != 0) {
                    break;
                }
                AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
                AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(16);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM3859Ujhhgtgfeyxiexzf, 16)));
            }
            i = i2;
        }
        return c2598feyxiexzfUjhhgtg.mo2119feyxiexzfUjhhgtg();
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final InputStream mo2120feyxiexzfUjhhgtg() {
        return new C2597feyxiexzfUjhhgtg(this, 1);
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        if (j >= 0) {
            if (!this.f3098Ujhhgtgfeyxiexzf) {
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = this.f3097Ujhhgtgfeyxiexzf;
                if (c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf == 0 && this.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg2, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                    return -1L;
                }
                return c2598feyxiexzfUjhhgtg2.read(c2598feyxiexzfUjhhgtg, Math.min(j, c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
    }
}
