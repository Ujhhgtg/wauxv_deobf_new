package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ要点脸ᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0790feyxiexzfUjhhgtg extends FilterInputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile byte[] f3099Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f3100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f3102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f3103Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f3104Ujhhgtgfeyxiexzf;

    public C0790feyxiexzfUjhhgtg(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        super(inputStream);
        this.f3102Ujhhgtgfeyxiexzf = -1;
        this.f3104Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        this.f3099Ujhhgtgfeyxiexzf = (byte[]) c0271Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(65536, byte[].class);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static void m2121Ujhhgtgfeyxiexzf() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3099Ujhhgtgfeyxiexzf == null || inputStream == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        return (this.f3100Ujhhgtgfeyxiexzf - this.f3103Ujhhgtgfeyxiexzf) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3099Ujhhgtgfeyxiexzf != null) {
            this.f3104Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(this.f3099Ujhhgtgfeyxiexzf);
            this.f3099Ujhhgtgfeyxiexzf = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f3101Ujhhgtgfeyxiexzf = Math.max(this.f3101Ujhhgtgfeyxiexzf, i);
        this.f3102Ujhhgtgfeyxiexzf = this.f3103Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f3099Ujhhgtgfeyxiexzf;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        if (this.f3103Ujhhgtgfeyxiexzf >= this.f3100Ujhhgtgfeyxiexzf && m2122Ujhhgtgfeyxiexzf(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3099Ujhhgtgfeyxiexzf && (bArr = this.f3099Ujhhgtgfeyxiexzf) == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        int i = this.f3100Ujhhgtgfeyxiexzf;
        int i2 = this.f3103Ujhhgtgfeyxiexzf;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f3103Ujhhgtgfeyxiexzf = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f3099Ujhhgtgfeyxiexzf == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f3102Ujhhgtgfeyxiexzf;
        if (-1 == i) {
            throw new C0791feyxiexzfUjhhgtg("Mark has been invalidated, pos: " + this.f3103Ujhhgtgfeyxiexzf + " markLimit: " + this.f3101Ujhhgtgfeyxiexzf);
        }
        this.f3103Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f3099Ujhhgtgfeyxiexzf;
        if (bArr == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        int i = this.f3100Ujhhgtgfeyxiexzf;
        int i2 = this.f3103Ujhhgtgfeyxiexzf;
        if (i - i2 >= j) {
            this.f3103Ujhhgtgfeyxiexzf = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f3103Ujhhgtgfeyxiexzf = i;
        if (this.f3102Ujhhgtgfeyxiexzf == -1 || j > this.f3101Ujhhgtgfeyxiexzf) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f3102Ujhhgtgfeyxiexzf = -1;
            }
            return j2 + jSkip;
        }
        if (m2122Ujhhgtgfeyxiexzf(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f3100Ujhhgtgfeyxiexzf;
        int i4 = this.f3103Ujhhgtgfeyxiexzf;
        if (i3 - i4 >= j - j2) {
            this.f3103Ujhhgtgfeyxiexzf = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f3103Ujhhgtgfeyxiexzf = i3;
        return j3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m2122Ujhhgtgfeyxiexzf(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f3102Ujhhgtgfeyxiexzf;
        if (i != -1) {
            int i2 = this.f3103Ujhhgtgfeyxiexzf - i;
            int i3 = this.f3101Ujhhgtgfeyxiexzf;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f3100Ujhhgtgfeyxiexzf == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3104Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3099Ujhhgtgfeyxiexzf = bArr2;
                    this.f3104Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f3103Ujhhgtgfeyxiexzf - this.f3102Ujhhgtgfeyxiexzf;
                this.f3103Ujhhgtgfeyxiexzf = i4;
                this.f3102Ujhhgtgfeyxiexzf = 0;
                this.f3100Ujhhgtgfeyxiexzf = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f3103Ujhhgtgfeyxiexzf;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f3100Ujhhgtgfeyxiexzf = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f3102Ujhhgtgfeyxiexzf = -1;
            this.f3103Ujhhgtgfeyxiexzf = 0;
            this.f3100Ujhhgtgfeyxiexzf = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized void m2123Ujhhgtgfeyxiexzf() {
        if (this.f3099Ujhhgtgfeyxiexzf != null) {
            this.f3104Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(this.f3099Ujhhgtgfeyxiexzf);
            this.f3099Ujhhgtgfeyxiexzf = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f3099Ujhhgtgfeyxiexzf;
        if (bArr2 == null) {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f3103Ujhhgtgfeyxiexzf;
            int i6 = this.f3100Ujhhgtgfeyxiexzf;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f3103Ujhhgtgfeyxiexzf += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f3102Ujhhgtgfeyxiexzf == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m2122Ujhhgtgfeyxiexzf(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f3099Ujhhgtgfeyxiexzf && (bArr2 = this.f3099Ujhhgtgfeyxiexzf) == null) {
                        m2121Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    int i8 = this.f3100Ujhhgtgfeyxiexzf;
                    int i9 = this.f3103Ujhhgtgfeyxiexzf;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f3103Ujhhgtgfeyxiexzf += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            m2121Ujhhgtgfeyxiexzf();
            throw null;
        }
    }
}
