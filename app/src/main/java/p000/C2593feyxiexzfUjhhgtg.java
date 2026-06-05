package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2593feyxiexzfUjhhgtg extends OutputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final FileOutputStream f8392Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public byte[] f8393Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f8394Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f8395Ujhhgtgfeyxiexzf;

    public C2593feyxiexzfUjhhgtg(FileOutputStream fileOutputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f8392Ujhhgtgfeyxiexzf = fileOutputStream;
        this.f8394Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        this.f8393Ujhhgtgfeyxiexzf = (byte[]) c0271Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f8392Ujhhgtgfeyxiexzf;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f8393Ujhhgtgfeyxiexzf;
            if (bArr != null) {
                this.f8394Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
                this.f8393Ujhhgtgfeyxiexzf = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f8395Ujhhgtgfeyxiexzf;
        FileOutputStream fileOutputStream = this.f8392Ujhhgtgfeyxiexzf;
        if (i > 0) {
            fileOutputStream.write(this.f8393Ujhhgtgfeyxiexzf, 0, i);
            this.f8395Ujhhgtgfeyxiexzf = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f8393Ujhhgtgfeyxiexzf;
        int i2 = this.f8395Ujhhgtgfeyxiexzf;
        int i3 = i2 + 1;
        this.f8395Ujhhgtgfeyxiexzf = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f8392Ujhhgtgfeyxiexzf.write(bArr, 0, i3);
        this.f8395Ujhhgtgfeyxiexzf = 0;
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
            int i6 = this.f8395Ujhhgtgfeyxiexzf;
            FileOutputStream fileOutputStream = this.f8392Ujhhgtgfeyxiexzf;
            if (i6 == 0 && i4 >= this.f8393Ujhhgtgfeyxiexzf.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f8393Ujhhgtgfeyxiexzf.length - i6);
            System.arraycopy(bArr, i5, this.f8393Ujhhgtgfeyxiexzf, this.f8395Ujhhgtgfeyxiexzf, iMin);
            int i7 = this.f8395Ujhhgtgfeyxiexzf + iMin;
            this.f8395Ujhhgtgfeyxiexzf = i7;
            i3 += iMin;
            byte[] bArr2 = this.f8393Ujhhgtgfeyxiexzf;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f8395Ujhhgtgfeyxiexzf = 0;
            }
        } while (i3 < i2);
    }
}
