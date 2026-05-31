package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0483 extends OutputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final FileOutputStream f2131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public byte[] f2132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1893 f2133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2134;

    public C0483(FileOutputStream fileOutputStream, C1893 c1893) {
        this.f2131 = fileOutputStream;
        this.f2133 = c1893;
        this.f2132 = (byte[]) c1893.m3818(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2131;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2132;
            if (bArr != null) {
                this.f2133.m3823(bArr);
                this.f2132 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2134;
        FileOutputStream fileOutputStream = this.f2131;
        if (i > 0) {
            fileOutputStream.write(this.f2132, 0, i);
            this.f2134 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2132;
        int i2 = this.f2134;
        int i3 = i2 + 1;
        this.f2134 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f2131.write(bArr, 0, i3);
        this.f2134 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f2134;
            FileOutputStream fileOutputStream = this.f2131;
            if (i6 == 0 && i4 >= this.f2132.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f2132.length - i6);
            System.arraycopy(bArr, i5, this.f2132, this.f2134, iMin);
            int i7 = this.f2134 + iMin;
            this.f2134 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f2132;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f2134 = 0;
            }
        } while (i3 < i2);
    }
}
