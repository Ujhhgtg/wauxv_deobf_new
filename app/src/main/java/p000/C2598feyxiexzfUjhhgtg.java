package p000;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛴ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2598feyxiexzfUjhhgtg implements InterfaceC2595feyxiexzfUjhhgtg, InterfaceC2596feyxiexzfUjhhgtg, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C1086feyxiexzfUjhhgtg f8400Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f8401Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598feyxiexzfUjhhgtg)) {
            return false;
        }
        long j = this.f8401Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = (C2598feyxiexzfUjhhgtg) obj;
        if (j != c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf;
        long j2 = 0;
        while (j2 < this.f8401Ujhhgtgfeyxiexzf) {
            long jMin = Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - i, c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf[i] != c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            }
            if (i2 == c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf) {
                c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf;
                i2 = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            for (int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf; i3 < i2; i3++) {
                i = (i * 31) + c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf[i3];
            }
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
        } while (c1086feyxiexzfUjhhgtg != this.f8400Ujhhgtgfeyxiexzf);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final C0789feyxiexzfUjhhgtg peek() {
        return new C0789feyxiexzfUjhhgtg(new C1394feyxiexzfUjhhgtg(this));
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f8401Ujhhgtgfeyxiexzf;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c2598feyxiexzfUjhhgtg.write(this, j);
        return j;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final byte readByte() throws EOFException {
        long j = this.f8401Ujhhgtgfeyxiexzf;
        if (j == 0) {
            throw new EOFException();
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        int i3 = i + 1;
        byte b = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf[i];
        this.f8401Ujhhgtgfeyxiexzf = j - 1;
        if (i3 != i2) {
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i3;
            return b;
        }
        this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
        AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        return b;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final int readInt() throws EOFException {
        long j = this.f8401Ujhhgtgfeyxiexzf;
        if (j < 4) {
            throw new EOFException();
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f8401Ujhhgtgfeyxiexzf = j - 4;
        if (i5 != i2) {
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i5;
            return i6;
        }
        this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
        AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        return i6;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final long readLong() throws EOFException {
        long j = this.f8401Ujhhgtgfeyxiexzf;
        if (j < 8) {
            throw new EOFException();
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f8401Ujhhgtgfeyxiexzf = j - 8;
        if (i4 != i2) {
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i4;
            return j3;
        }
        this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
        AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        return j3;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final short readShort() throws EOFException {
        long j = this.f8401Ujhhgtgfeyxiexzf;
        if (j < 2) {
            throw new EOFException();
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f8401Ujhhgtgfeyxiexzf = j - 2;
        if (i5 == i2) {
            this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        } else {
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i5;
        }
        return (short) i6;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final String readString(Charset charset) {
        return m3864feyxiexzfUjhhgtg(this.f8401Ujhhgtgfeyxiexzf, charset);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
            if (c1086feyxiexzfUjhhgtg == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            long j2 = iMin;
            this.f8401Ujhhgtgfeyxiexzf -= j2;
            j -= j2;
            int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf + iMin;
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i;
            if (i == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
                this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return C1744Ujhhgtgfeyxiexzf.NONE;
    }

    public final String toString() {
        long j = this.f8401Ujhhgtgfeyxiexzf;
        if (j <= 2147483647L) {
            return m3866feyxiexzfUjhhgtg((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f8401Ujhhgtgfeyxiexzf).toString());
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
        if (c2598feyxiexzfUjhhgtg == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, 0L, j);
        while (j > 0) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
            int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            if (j < i) {
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = this.f8400Ujhhgtgfeyxiexzf;
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = c1086feyxiexzfUjhhgtg2 != null ? c1086feyxiexzfUjhhgtg2.f4165Ujhhgtgfeyxiexzf : null;
                if (c1086feyxiexzfUjhhgtg3 != null && c1086feyxiexzfUjhhgtg3.f4163Ujhhgtgfeyxiexzf) {
                    if ((((long) c1086feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf) + j) - ((long) (c1086feyxiexzfUjhhgtg3.f4162Ujhhgtgfeyxiexzf ? 0 : c1086feyxiexzfUjhhgtg3.f4160Ujhhgtgfeyxiexzf)) <= JSONWriter.MASK_WRITE_ENUMS_USING_NAME) {
                        c1086feyxiexzfUjhhgtg.m2558Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg3, (int) j);
                        c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf -= j;
                        this.f8401Ujhhgtgfeyxiexzf += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2557Ujhhgtgfeyxiexzf();
                } else {
                    c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf = AbstractC1088feyxiexzfUjhhgtg.m2560Ujhhgtgfeyxiexzf();
                    byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                    byte[] bArr2 = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf.f4159Ujhhgtgfeyxiexzf;
                    int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                    AbstractC2391Ujhhgtgfeyxiexzf.m3646feyxiexzfUjhhgtg(bArr, i3, i3 + i2, bArr2, 2);
                }
                c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf.f4161Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf.f4160Ujhhgtgfeyxiexzf + i2;
                c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf += i2;
                c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf);
                c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
            }
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg4 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
            long j2 = c1086feyxiexzfUjhhgtg4.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg4.f4160Ujhhgtgfeyxiexzf;
            c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg4.m2555Ujhhgtgfeyxiexzf();
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg5 = this.f8400Ujhhgtgfeyxiexzf;
            if (c1086feyxiexzfUjhhgtg5 == null) {
                this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg4;
                c1086feyxiexzfUjhhgtg4.f4165Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg4;
                c1086feyxiexzfUjhhgtg4.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg4;
            } else {
                c1086feyxiexzfUjhhgtg5.f4165Ujhhgtgfeyxiexzf.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg4);
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg6 = c1086feyxiexzfUjhhgtg4.f4165Ujhhgtgfeyxiexzf;
                if (c1086feyxiexzfUjhhgtg6 == c1086feyxiexzfUjhhgtg4) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c1086feyxiexzfUjhhgtg6.f4163Ujhhgtgfeyxiexzf) {
                    int i4 = c1086feyxiexzfUjhhgtg4.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg4.f4160Ujhhgtgfeyxiexzf;
                    if (i4 <= (8192 - c1086feyxiexzfUjhhgtg6.f4161Ujhhgtgfeyxiexzf) + (c1086feyxiexzfUjhhgtg6.f4162Ujhhgtgfeyxiexzf ? 0 : c1086feyxiexzfUjhhgtg6.f4160Ujhhgtgfeyxiexzf)) {
                        c1086feyxiexzfUjhhgtg4.m2558Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg6, i4);
                        c1086feyxiexzfUjhhgtg4.m2555Ujhhgtgfeyxiexzf();
                        AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg4);
                    }
                }
            }
            c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf -= j2;
            this.f8401Ujhhgtgfeyxiexzf += j2;
            j -= j2;
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg writeByte(int i) {
        m3869feyxiexzfUjhhgtg(i);
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg writeInt(int i) {
        m3872feyxiexzfUjhhgtg(i);
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg writeShort(int i) {
        m3874feyxiexzfUjhhgtg(i);
        return this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3856Ujhhgtgfeyxiexzf() throws EOFException {
        skip(this.f8401Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final C2633Ujhhgtgfeyxiexzf mo2106Ujhhgtgfeyxiexzf(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount: ").toString());
        }
        if (this.f8401Ujhhgtgfeyxiexzf < j) {
            throw new EOFException();
        }
        if (j < JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) {
            return new C2633Ujhhgtgfeyxiexzf(m3863feyxiexzfUjhhgtg(j));
        }
        C2633Ujhhgtgfeyxiexzf c2633UjhhgtgfeyxiexzfM3866feyxiexzfUjhhgtg = m3866feyxiexzfUjhhgtg((int) j);
        skip(j);
        return c2633UjhhgtgfeyxiexzfM3866feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final byte[] mo2107Ujhhgtgfeyxiexzf() {
        return m3863feyxiexzfUjhhgtg(this.f8401Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2598feyxiexzfUjhhgtg clone() {
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        if (this.f8401Ujhhgtgfeyxiexzf == 0) {
            return c2598feyxiexzfUjhhgtg;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2557Ujhhgtgfeyxiexzf();
        c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
        c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
        c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
        for (C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf; c1086feyxiexzfUjhhgtg2 != c1086feyxiexzfUjhhgtg; c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf) {
            c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg2.m2557Ujhhgtgfeyxiexzf());
        }
        c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf = this.f8401Ujhhgtgfeyxiexzf;
        return c2598feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo2109Ujhhgtgfeyxiexzf() {
        return this.f8401Ujhhgtgfeyxiexzf == 0;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo2110Ujhhgtgfeyxiexzf(C1470feyxiexzfUjhhgtg c1470feyxiexzfUjhhgtg) throws EOFException {
        int iM4287Ujhhgtgfeyxiexzf = AbstractC2918Ujhhgtgfeyxiexzf.m4287Ujhhgtgfeyxiexzf(this, c1470feyxiexzfUjhhgtg, false);
        if (iM4287Ujhhgtgfeyxiexzf == -1) {
            return -1;
        }
        skip(c1470feyxiexzfUjhhgtg.f5108Ujhhgtgfeyxiexzf[iM4287Ujhhgtgfeyxiexzf].mo2578Ujhhgtgfeyxiexzf());
        return iM4287Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3858Ujhhgtgfeyxiexzf(long j, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j2) {
        long j3 = j;
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(this.f8401Ujhhgtgfeyxiexzf, j3, j2);
        if (j2 == 0) {
            return;
        }
        c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf += j2;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        while (true) {
            long j4 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg;
        long j5 = j2;
        while (j5 > 0) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg2.m2557Ujhhgtgfeyxiexzf();
            int i = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4160Ujhhgtgfeyxiexzf + ((int) j3);
            c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4160Ujhhgtgfeyxiexzf = i;
            c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4161Ujhhgtgfeyxiexzf = Math.min(i + ((int) j5), c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4161Ujhhgtgfeyxiexzf);
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
            if (c1086feyxiexzfUjhhgtg3 == null) {
                c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
                c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
                c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf;
            } else {
                c1086feyxiexzfUjhhgtg3.f4165Ujhhgtgfeyxiexzf.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf);
            }
            j5 -= (long) (c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtgM2557Ujhhgtgfeyxiexzf.f4160Ujhhgtgfeyxiexzf);
            c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf;
            j3 = 0;
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final long mo2147Ujhhgtgfeyxiexzf(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        long j = 0;
        while (true) {
            long j2 = interfaceC1227feyxiexzfUjhhgtg.read(this, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final long mo2111Ujhhgtgfeyxiexzf() throws EOFException {
        long j;
        char c;
        int i;
        byte b;
        long j2 = 0;
        if (this.f8401Ujhhgtgfeyxiexzf == 0) {
            throw new EOFException();
        }
        long j3 = -7;
        long j4 = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
            byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            int i4 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            while (true) {
                if (i3 >= i4) {
                    j = j2;
                    c = 0;
                    i = 1;
                    break;
                }
                c = 0;
                b = bArr[i3];
                i = 1;
                if (b >= 48 && b <= 57) {
                    int i5 = 48 - b;
                    if (j4 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j4 == -922337203685477580L && i5 < j3) {
                        break loop0;
                    }
                    j4 = (j4 * 10) + ((long) i5);
                } else {
                    j = j2;
                    if (b != 45 || i2 != 0) {
                        z2 = true;
                        break;
                    }
                    j3--;
                    z = true;
                }
                i3++;
                i2++;
                j2 = j;
            }
            if (i3 == i4) {
                this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
            } else {
                c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i3;
            }
            if (z2 || this.f8400Ujhhgtgfeyxiexzf == null) {
                long j5 = this.f8401Ujhhgtgfeyxiexzf - ((long) i2);
                this.f8401Ujhhgtgfeyxiexzf = j5;
                if (i2 >= (z ? 2 : i)) {
                    return z ? j4 : -j4;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                byte bM3859Ujhhgtgfeyxiexzf = m3859Ujhhgtgfeyxiexzf(j);
                char[] cArr = AbstractC2855feyxiexzfUjhhgtg.f9109Ujhhgtgfeyxiexzf;
                char c2 = cArr[(bM3859Ujhhgtgfeyxiexzf >> 4) & 15];
                char c3 = cArr[bM3859Ujhhgtgfeyxiexzf & ek.m];
                char[] cArr2 = new char[2];
                cArr2[c] = c2;
                cArr2[i] = c3;
                sbM4805Ujhhgtgfeyxiexzf.append(new String(cArr2));
                throw new NumberFormatException(sbM4805Ujhhgtgfeyxiexzf.toString());
            }
            j2 = j;
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg.m3870feyxiexzfUjhhgtg(j4);
        c2598feyxiexzfUjhhgtg.m3869feyxiexzfUjhhgtg(b);
        if (!z) {
            c2598feyxiexzfUjhhgtg.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c2598feyxiexzfUjhhgtg.m3865feyxiexzfUjhhgtg()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final byte m3859Ujhhgtgfeyxiexzf(long j) {
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(this.f8401Ujhhgtgfeyxiexzf, j, 1L);
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        c1086feyxiexzfUjhhgtg.getClass();
        long j2 = this.f8401Ujhhgtgfeyxiexzf;
        if (j2 - j < j) {
            while (j2 > j) {
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
                j2 -= (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            }
            return c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf[(int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            int i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf[(int) ((((long) i2) + j) - j3)];
            }
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
            j3 = j4;
        }
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final String mo2112Ujhhgtgfeyxiexzf(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM3860Ujhhgtgfeyxiexzf = m3860Ujhhgtgfeyxiexzf(0L, j2, (byte) 10);
        if (jM3860Ujhhgtgfeyxiexzf != -1) {
            return AbstractC2918Ujhhgtgfeyxiexzf.m4286Ujhhgtgfeyxiexzf(this, jM3860Ujhhgtgfeyxiexzf);
        }
        if (j2 < this.f8401Ujhhgtgfeyxiexzf && m3859Ujhhgtgfeyxiexzf(j2 - 1) == 13 && m3859Ujhhgtgfeyxiexzf(j2) == 10) {
            return AbstractC2918Ujhhgtgfeyxiexzf.m4286Ujhhgtgfeyxiexzf(this, j2);
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        m3858Ujhhgtgfeyxiexzf(0L, c2598feyxiexzfUjhhgtg, Math.min(32, this.f8401Ujhhgtgfeyxiexzf));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f8401Ujhhgtgfeyxiexzf, j) + " content=" + c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf).mo2579Ujhhgtgfeyxiexzf() + (char) 8230);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final long m3860Ujhhgtgfeyxiexzf(long j, long j2, byte b) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f8401Ujhhgtgfeyxiexzf + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f8401Ujhhgtgfeyxiexzf;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
                j4 -= (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            }
            while (j4 < j2) {
                byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                int iMin = (int) Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, (((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j4);
                for (int i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j4;
                    }
                }
                j4 += (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j3;
            if (j5 > j) {
                break;
            }
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            int iMin2 = (int) Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, (((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j3);
            for (int i2 = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j3;
                }
            }
            j3 += (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
            j = j3;
        }
        return -1L;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg mo2149Ujhhgtgfeyxiexzf(String str) {
        m3877feyxiexzfUjhhgtg(str);
        return this;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo2113Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws EOFException {
        long j2 = this.f8401Ujhhgtgfeyxiexzf;
        if (j2 >= j) {
            c2598feyxiexzfUjhhgtg.write(this, j);
        } else {
            c2598feyxiexzfUjhhgtg.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg mo2150Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        m3868feyxiexzfUjhhgtg(c2633Ujhhgtgfeyxiexzf);
        return this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final long m3861Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        int i;
        int i2;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg == null) {
            return -1L;
        }
        long j = this.f8401Ujhhgtgfeyxiexzf;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
                j -= (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            }
            if (c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() == 2) {
                byte bMo2581Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(0);
                byte bMo2581Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(1);
                while (j < this.f8401Ujhhgtgfeyxiexzf) {
                    byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                    i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j);
                    int i3 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j;
                            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bMo2581Ujhhgtgfeyxiexzf || b == bMo2581Ujhhgtgfeyxiexzf2) {
                                i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo2580Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2580Ujhhgtgfeyxiexzf();
            while (j < this.f8401Ujhhgtgfeyxiexzf) {
                byte[] bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j);
                int i4 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrMo2580Ujhhgtgfeyxiexzf.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrMo2580Ujhhgtgfeyxiexzf[i5]) {
                                i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j;
                        c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j;
            if (j3 > 0) {
                break;
            }
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
            j = j3;
        }
        if (c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() == 2) {
            byte bMo2581Ujhhgtgfeyxiexzf3 = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(0);
            byte bMo2581Ujhhgtgfeyxiexzf4 = c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(1);
            while (j < this.f8401Ujhhgtgfeyxiexzf) {
                byte[] bArr3 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j);
                int i6 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j;
                        c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bMo2581Ujhhgtgfeyxiexzf3 || b3 == bMo2581Ujhhgtgfeyxiexzf4) {
                            i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo2580Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2580Ujhhgtgfeyxiexzf();
        while (j < this.f8401Ujhhgtgfeyxiexzf) {
            byte[] bArr4 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j2) - j);
            int i7 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrMo2580Ujhhgtgfeyxiexzf2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrMo2580Ujhhgtgfeyxiexzf2[i8]) {
                            i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j;
                    c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg mo2151Ujhhgtgfeyxiexzf(long j) {
        m3871feyxiexzfUjhhgtg(j);
        return this;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final C2633Ujhhgtgfeyxiexzf mo2114Ujhhgtgfeyxiexzf() {
        return mo2106Ujhhgtgfeyxiexzf(this.f8401Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public final boolean mo2115Ujhhgtgfeyxiexzf(long j) {
        return this.f8401Ujhhgtgfeyxiexzf >= j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C2589feyxiexzfUjhhgtg m3862Ujhhgtgfeyxiexzf(C2589feyxiexzfUjhhgtg c2589feyxiexzfUjhhgtg) {
        byte[] bArr = AbstractC2918Ujhhgtgfeyxiexzf.f9202Ujhhgtgfeyxiexzf;
        if (c2589feyxiexzfUjhhgtg == AbstractC3085Ujhhgtgfeyxiexzf.f9538Ujhhgtgfeyxiexzf) {
            c2589feyxiexzfUjhhgtg = new C2589feyxiexzfUjhhgtg();
        }
        if (c2589feyxiexzfUjhhgtg.f8378Ujhhgtgfeyxiexzf != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c2589feyxiexzfUjhhgtg.f8378Ujhhgtgfeyxiexzf = this;
        c2589feyxiexzfUjhhgtg.f8379Ujhhgtgfeyxiexzf = true;
        return c2589feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public final String mo2116Ujhhgtgfeyxiexzf() {
        return mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final byte[] m3863feyxiexzfUjhhgtg(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount: ").toString());
        }
        if (this.f8401Ujhhgtgfeyxiexzf < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m3864feyxiexzfUjhhgtg(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount: ").toString());
        }
        if (this.f8401Ujhhgtgfeyxiexzf < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        if (((long) i) + j > c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
            return new String(m3863feyxiexzfUjhhgtg(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, i, i2, charset);
        int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf + i2;
        c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i3;
        this.f8401Ujhhgtgfeyxiexzf -= j;
        if (i3 == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
            this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        }
        return str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String m3865feyxiexzfUjhhgtg() {
        return m3864feyxiexzfUjhhgtg(this.f8401Ujhhgtgfeyxiexzf, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ */
    public final boolean mo2117feyxiexzfUjhhgtg(long j, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
        if (j >= 0 && iMo2578Ujhhgtgfeyxiexzf >= 0 && this.f8401Ujhhgtgfeyxiexzf - j >= iMo2578Ujhhgtgfeyxiexzf && c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() >= iMo2578Ujhhgtgfeyxiexzf) {
            for (int i = 0; i < iMo2578Ujhhgtgfeyxiexzf; i++) {
                if (m3859Ujhhgtgfeyxiexzf(((long) i) + j) == c2633Ujhhgtgfeyxiexzf.mo2581Ujhhgtgfeyxiexzf(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ */
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg mo2152feyxiexzfUjhhgtg(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf m3866feyxiexzfUjhhgtg(int i) {
        if (i == 0) {
            return C2633Ujhhgtgfeyxiexzf.f8466Ujhhgtgfeyxiexzf;
        }
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(this.f8401Ujhhgtgfeyxiexzf, 0L, i);
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            int i6 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = this.f8400Ujhhgtgfeyxiexzf;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
            i2 += c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf;
            c1086feyxiexzfUjhhgtg2.f4162Ujhhgtgfeyxiexzf = true;
            i7++;
            c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf;
        }
        return new C1116feyxiexzfUjhhgtg(bArr, iArr);
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo2118feyxiexzfUjhhgtg(long j) throws EOFException {
        if (this.f8401Ujhhgtgfeyxiexzf < j) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public final /* bridge */ /* synthetic */ InterfaceC2596feyxiexzfUjhhgtg mo2153feyxiexzfUjhhgtg(long j) {
        m3870feyxiexzfUjhhgtg(j);
        return this;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final long mo2119feyxiexzfUjhhgtg() throws EOFException {
        int i;
        if (this.f8401Ujhhgtgfeyxiexzf == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
            byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
            int i4 = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b + JSONB.Constants.BC_INT64_BYTE_ZERO;
                } else if (b >= 97 && b <= 102) {
                    i = b + JSONB.Constants.BC_LOCAL_DATE;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC2855feyxiexzfUjhhgtg.f9109Ujhhgtgfeyxiexzf;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & ek.m]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
                    c2598feyxiexzfUjhhgtg.m3871feyxiexzfUjhhgtg(j);
                    c2598feyxiexzfUjhhgtg.m3869feyxiexzfUjhhgtg(b);
                    throw new NumberFormatException("Number too large: ".concat(c2598feyxiexzfUjhhgtg.m3865feyxiexzfUjhhgtg()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
            } else {
                c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i3;
            }
            if (z) {
                break;
            }
        } while (this.f8400Ujhhgtgfeyxiexzf != null);
        this.f8401Ujhhgtgfeyxiexzf -= (long) i2;
        return j;
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final InputStream mo2120feyxiexzfUjhhgtg() {
        return new C2597feyxiexzfUjhhgtg(this, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final C1086feyxiexzfUjhhgtg m3867feyxiexzfUjhhgtg(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg == null) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf = AbstractC1088feyxiexzfUjhhgtg.m2560Ujhhgtgfeyxiexzf();
            this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
            c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf.f4165Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
            c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
            return c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf + i <= 8192 && c1086feyxiexzfUjhhgtg2.f4163Ujhhgtgfeyxiexzf) {
            return c1086feyxiexzfUjhhgtg2;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf2 = AbstractC1088feyxiexzfUjhhgtg.m2560Ujhhgtgfeyxiexzf();
        c1086feyxiexzfUjhhgtg2.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf2);
        return c1086feyxiexzfUjhhgtgM2560Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3868feyxiexzfUjhhgtg(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf) {
        c2633Ujhhgtgfeyxiexzf.mo2585Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf(), this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m3869feyxiexzfUjhhgtg(int i) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(1);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i2 + 1;
        bArr[i2] = (byte) i;
        this.f8401Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m3870feyxiexzfUjhhgtg(long j) {
        if (j == 0) {
            m3869feyxiexzfUjhhgtg(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m3876feyxiexzfUjhhgtg(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(i);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC2918Ujhhgtgfeyxiexzf.f9202Ujhhgtgfeyxiexzf[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += i;
        this.f8401Ujhhgtgfeyxiexzf += (long) i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m3871feyxiexzfUjhhgtg(long j) {
        if (j == 0) {
            m3869feyxiexzfUjhhgtg(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(i);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC2918Ujhhgtgfeyxiexzf.f9202Ujhhgtgfeyxiexzf[(int) (15 & j)];
            j >>>= 4;
        }
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += i;
        this.f8401Ujhhgtgfeyxiexzf += (long) i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3872feyxiexzfUjhhgtg(int i) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(4);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i2 + 4;
        this.f8401Ujhhgtgfeyxiexzf += 4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m3873feyxiexzfUjhhgtg(long j) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(8);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i + 8;
        this.f8401Ujhhgtgfeyxiexzf += 8;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3874feyxiexzfUjhhgtg(int i) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(2);
        byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i2 + 2;
        this.f8401Ujhhgtgfeyxiexzf += 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void m3875feyxiexzfUjhhgtg(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i2, "endIndex > string.length: ", " > ");
            sbM4804Ujhhgtgfeyxiexzf.append(str.length());
            throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString().toString());
        }
        if (charset.equals(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf)) {
            m3876feyxiexzfUjhhgtg(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final void m3876feyxiexzfUjhhgtg(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i2, "endIndex < beginIndex: ", " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i2, "endIndex > string.length: ", " > ");
            sbM4804Ujhhgtgfeyxiexzf.append(str.length());
            throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(1);
                byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                int i3 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                int i6 = (i3 + i) - i5;
                c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i5 + i6;
                this.f8401Ujhhgtgfeyxiexzf += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2 = m3867feyxiexzfUjhhgtg(2);
                    byte[] bArr2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
                    int i7 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf = i7 + 2;
                    this.f8401Ujhhgtgfeyxiexzf += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3 = m3867feyxiexzfUjhhgtg(3);
                    byte[] bArr3 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4159Ujhhgtgfeyxiexzf;
                    int i8 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf = i8 + 3;
                    this.f8401Ujhhgtgfeyxiexzf += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m3869feyxiexzfUjhhgtg(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg4 = m3867feyxiexzfUjhhgtg(4);
                        byte[] bArr4 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg4.f4159Ujhhgtgfeyxiexzf;
                        int i11 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg4.f4161Ujhhgtgfeyxiexzf;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg4.f4161Ujhhgtgfeyxiexzf = i11 + 4;
                        this.f8401Ujhhgtgfeyxiexzf += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m3877feyxiexzfUjhhgtg(String str) {
        m3876feyxiexzfUjhhgtg(0, str.length(), str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3878feyxiexzfUjhhgtg(int i) {
        String str;
        if (i < 128) {
            m3869feyxiexzfUjhhgtg(i);
            return;
        }
        if (i < 2048) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(2);
            byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
            bArr[i2] = (byte) ((i >> 6) | Opcodes.CHECKCAST);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i2 + 2;
            this.f8401Ujhhgtgfeyxiexzf += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m3869feyxiexzfUjhhgtg(63);
            return;
        }
        if (i < 65536) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2 = m3867feyxiexzfUjhhgtg(3);
            byte[] bArr2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf;
            int i3 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf = i3 + 3;
            this.f8401Ujhhgtgfeyxiexzf += 3;
            return;
        }
        if (i <= 1114111) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3 = m3867feyxiexzfUjhhgtg(4);
            byte[] bArr3 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4159Ujhhgtgfeyxiexzf;
            int i4 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf = i4 + 4;
            this.f8401Ujhhgtgfeyxiexzf += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC2855feyxiexzfUjhhgtg.f9109Ujhhgtgfeyxiexzf;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            AbstractC3516feyxiexzfUjhhgtg.m5052Ujhhgtgfeyxiexzf(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
        byteBuffer.put(c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf, iMin);
        int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf + iMin;
        c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i;
        this.f8401Ujhhgtgfeyxiexzf -= (long) iMin;
        if (i == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
            this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(bArr.length, i, i2);
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = this.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg == null) {
            return -1;
        }
        int iMin = Math.min(i2, c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
        byte[] bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
        int i3 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
        AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(bArr2, i, i3, bArr, i3 + iMin);
        int i4 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf + iMin;
        c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i4;
        this.f8401Ujhhgtgfeyxiexzf -= (long) iMin;
        if (i4 == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
            this.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void close() {
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC2595feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final C2598feyxiexzfUjhhgtg mo2104Ujhhgtgfeyxiexzf() {
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2146Ujhhgtgfeyxiexzf() {
        return this;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final InterfaceC2596feyxiexzfUjhhgtg mo2148Ujhhgtgfeyxiexzf() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(1);
            int iMin = Math.min(i, 8192 - c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf);
            byteBuffer.get(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, iMin);
            i -= iMin;
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += iMin;
        }
        this.f8401Ujhhgtgfeyxiexzf += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.InterfaceC2596feyxiexzfUjhhgtg
    public final InterfaceC2596feyxiexzfUjhhgtg write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = m3867feyxiexzfUjhhgtg(1);
            int iMin = Math.min(i3 - i, 8192 - c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf);
            int i4 = i + iMin;
            AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(bArr, c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, i, c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, i4);
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += iMin;
            i = i4;
        }
        this.f8401Ujhhgtgfeyxiexzf += j;
    }
}
