package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1148feyxiexzfUjhhgtg implements Closeable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final FileInputStream f4339Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Charset f4340Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public byte[] f4341Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f4342Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f4343Ujhhgtgfeyxiexzf;

    public C1148feyxiexzfUjhhgtg(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC1861Ujhhgtgfeyxiexzf.f6242Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4339Ujhhgtgfeyxiexzf = fileInputStream;
        this.f4340Ujhhgtgfeyxiexzf = charset;
        this.f4341Ujhhgtgfeyxiexzf = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4339Ujhhgtgfeyxiexzf) {
            try {
                if (this.f4341Ujhhgtgfeyxiexzf != null) {
                    this.f4341Ujhhgtgfeyxiexzf = null;
                    this.f4339Ujhhgtgfeyxiexzf.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m2614Ujhhgtgfeyxiexzf() {
        int i;
        synchronized (this.f4339Ujhhgtgfeyxiexzf) {
            try {
                byte[] bArr = this.f4341Ujhhgtgfeyxiexzf;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f4342Ujhhgtgfeyxiexzf >= this.f4343Ujhhgtgfeyxiexzf) {
                    int i2 = this.f4339Ujhhgtgfeyxiexzf.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f4342Ujhhgtgfeyxiexzf = 0;
                    this.f4343Ujhhgtgfeyxiexzf = i2;
                }
                for (int i3 = this.f4342Ujhhgtgfeyxiexzf; i3 != this.f4343Ujhhgtgfeyxiexzf; i3++) {
                    byte[] bArr2 = this.f4341Ujhhgtgfeyxiexzf;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f4342Ujhhgtgfeyxiexzf;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.f4340Ujhhgtgfeyxiexzf.name());
                        this.f4342Ujhhgtgfeyxiexzf = i3 + 1;
                        return str;
                    }
                }
                C1149feyxiexzfUjhhgtg c1149feyxiexzfUjhhgtg = new C1149feyxiexzfUjhhgtg(this, (this.f4343Ujhhgtgfeyxiexzf - this.f4342Ujhhgtgfeyxiexzf) + 80);
                while (true) {
                    byte[] bArr3 = this.f4341Ujhhgtgfeyxiexzf;
                    int i5 = this.f4342Ujhhgtgfeyxiexzf;
                    c1149feyxiexzfUjhhgtg.write(bArr3, i5, this.f4343Ujhhgtgfeyxiexzf - i5);
                    this.f4343Ujhhgtgfeyxiexzf = -1;
                    FileInputStream fileInputStream = this.f4339Ujhhgtgfeyxiexzf;
                    byte[] bArr4 = this.f4341Ujhhgtgfeyxiexzf;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f4342Ujhhgtgfeyxiexzf = 0;
                    this.f4343Ujhhgtgfeyxiexzf = i6;
                    for (int i7 = 0; i7 != this.f4343Ujhhgtgfeyxiexzf; i7++) {
                        byte[] bArr5 = this.f4341Ujhhgtgfeyxiexzf;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f4342Ujhhgtgfeyxiexzf;
                            if (i7 != i8) {
                                c1149feyxiexzfUjhhgtg.write(bArr5, i8, i7 - i8);
                            }
                            this.f4342Ujhhgtgfeyxiexzf = i7 + 1;
                            return c1149feyxiexzfUjhhgtg.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
