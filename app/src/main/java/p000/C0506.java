package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᤝᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0506 extends OutputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final FileOutputStream f2175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public byte[] f2176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1867 f2177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f2178;

    public C0506(FileOutputStream fileOutputStream, C1867 c1867) {
        this.f2175 = fileOutputStream;
        this.f2177 = c1867;
        this.f2176 = (byte[]) c1867.m3640(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2175;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2176;
            if (bArr != null) {
                this.f2177.m3645(bArr);
                this.f2176 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2178;
        FileOutputStream fileOutputStream = this.f2175;
        if (i > 0) {
            fileOutputStream.write(this.f2176, 0, i);
            this.f2178 = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2176;
        int i2 = this.f2178;
        int i3 = i2 + 1;
        this.f2178 = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || false) {
            return;
        }
        this.f2175.write(bArr, 0, i3);
        this.f2178 = 0;
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
            int i6 = this.f2178;
            FileOutputStream fileOutputStream = this.f2175;
            if (i6 == 0 && i4 >= this.f2176.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f2176.length - i6);
            System.arraycopy(bArr, i5, this.f2176, this.f2178, iMin);
            int i7 = this.f2178 + iMin;
            this.f2178 = i7;
            i3 += iMin;
            byte[] bArr2 = this.f2176;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f2178 = 0;
            }
        } while (i3 < i2);
    }
}
