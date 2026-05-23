package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2479 extends FilterInputStream {

    public volatile byte[] f7917;

    public int f7918;

    public int f7919;

    public int f7920;

    public int f7921;

    public final C1867 f7922;

    public C2479(InputStream inputStream, C1867 c1867) {
        super(inputStream);
        this.f7920 = -1;
        this.f7922 = c1867;
        this.f7917 = (byte[]) c1867.m3640(65536, byte[].class);
    }

    public static void m4430() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f7917 == null || inputStream == null) {
            m4430();
            throw null;
        }
        return (this.f7918 - this.f7921) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7917 != null) {
            this.f7922.m3645(this.f7917);
            this.f7917 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f7919 = Math.max(this.f7919, i);
        this.f7920 = this.f7921;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f7917;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m4430();
            throw null;
        }
        if (this.f7921 >= this.f7918 && m4431(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f7917 && (bArr = this.f7917) == null) {
            m4430();
            throw null;
        }
        int i = this.f7918;
        int i2 = this.f7921;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f7921 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f7917 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f7920;
        if (-1 == i) {
            throw new C1327("Mark has been invalidated, pos: " + this.f7921 + " markLimit: " + this.f7919);
        }
        this.f7921 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f7917;
        if (bArr == null) {
            m4430();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m4430();
            throw null;
        }
        int i = this.f7918;
        int i2 = this.f7921;
        if (i - i2 >= j) {
            this.f7921 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f7921 = i;
        if (this.f7920 == -1 || j > this.f7919) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f7920 = -1;
            }
            return j2 + jSkip;
        }
        if (m4431(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f7918;
        int i4 = this.f7921;
        if (i3 - i4 >= j - j2) {
            this.f7921 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f7921 = i3;
        return j3;
    }

    public final int m4431(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f7920;
        if (i != -1) {
            int i2 = this.f7921 - i;
            int i3 = this.f7919;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f7918 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f7922.m3640(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f7917 = bArr2;
                    this.f7922.m3645(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f7921 - this.f7920;
                this.f7921 = i4;
                this.f7920 = 0;
                this.f7918 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f7921;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f7918 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f7920 = -1;
            this.f7921 = 0;
            this.f7918 = i7;
        }
        return i7;
    }

    public final synchronized void m4432() {
        if (this.f7917 != null) {
            this.f7922.m3645(this.f7917);
            this.f7917 = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f7917;
        if (bArr2 == null) {
            m4430();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f7921;
            int i6 = this.f7918;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f7921 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f7920 == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m4431(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f7917 && (bArr2 = this.f7917) == null) {
                        m4430();
                        throw null;
                    }
                    int i8 = this.f7918;
                    int i9 = this.f7921;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f7921 += i4;
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
            m4430();
            throw null;
        }
    }
}
