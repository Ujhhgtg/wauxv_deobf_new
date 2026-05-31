package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᤝᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2534 extends FilterInputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile byte[] f8068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f8070;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8071;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f8072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1893 f8073;

    public C2534(InputStream inputStream, C1893 c1893) {
        super(inputStream);
        this.f8071 = -1;
        this.f8073 = c1893;
        this.f8068 = (byte[]) c1893.m3818(65536, byte[].class);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static void m4451() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f8068 == null || inputStream == null) {
            m4451();
            throw null;
        }
        return (this.f8069 - this.f8072) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8068 != null) {
            this.f8073.m3823(this.f8068);
            this.f8068 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f8070 = Math.max(this.f8070, i);
        this.f8071 = this.f8072;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f8068;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m4451();
            throw null;
        }
        if (this.f8072 >= this.f8069 && m4452(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f8068 && (bArr = this.f8068) == null) {
            m4451();
            throw null;
        }
        int i = this.f8069;
        int i2 = this.f8072;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f8072 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f8068 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f8071;
        if (-1 == i) {
            throw new C2533("Mark has been invalidated, pos: " + this.f8072 + " markLimit: " + this.f8070);
        }
        this.f8072 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f8068;
        if (bArr == null) {
            m4451();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m4451();
            throw null;
        }
        int i = this.f8069;
        int i2 = this.f8072;
        if (i - i2 >= j) {
            this.f8072 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f8072 = i;
        if (this.f8071 == -1 || j > this.f8070) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f8071 = -1;
            }
            return j2 + jSkip;
        }
        if (m4452(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f8069;
        int i4 = this.f8072;
        if (i3 - i4 >= j - j2) {
            this.f8072 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f8072 = i3;
        return j3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4452(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f8071;
        if (i != -1) {
            int i2 = this.f8072 - i;
            int i3 = this.f8070;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f8069 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f8073.m3818(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f8068 = bArr2;
                    this.f8073.m3823(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f8072 - this.f8071;
                this.f8072 = i4;
                this.f8071 = 0;
                this.f8069 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f8072;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f8069 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f8071 = -1;
            this.f8072 = 0;
            this.f8069 = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized void m4453() {
        if (this.f8068 != null) {
            this.f8073.m3823(this.f8068);
            this.f8068 = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f8068;
        if (bArr2 == null) {
            m4451();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f8072;
            int i6 = this.f8069;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f8072 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f8071 == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m4452(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f8068 && (bArr2 = this.f8068) == null) {
                        m4451();
                        throw null;
                    }
                    int i8 = this.f8069;
                    int i9 = this.f8072;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f8072 += i4;
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
            m4451();
            throw null;
        }
    }
}
