package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2832 implements Closeable {

    public final FileInputStream f9093;

    public final Charset f9094;

    public byte[] f9095;

    public int f9096;

    public int f9097;

    public C2832(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC3521.f11031)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f9093 = fileInputStream;
        this.f9094 = charset;
        this.f9095 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9093) {
            try {
                if (this.f9095 != null) {
                    this.f9095 = null;
                    this.f9093.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String m4816() {
        int i;
        synchronized (this.f9093) {
            try {
                byte[] bArr = this.f9095;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f9096 >= this.f9097) {
                    int i2 = this.f9093.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f9096 = 0;
                    this.f9097 = i2;
                }
                for (int i3 = this.f9096; i3 != this.f9097; i3++) {
                    byte[] bArr2 = this.f9095;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f9096;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.f9094.name());
                        this.f9096 = i3 + 1;
                        return str;
                    }
                }
                C2831 c2831 = new C2831(this, (this.f9097 - this.f9096) + 80);
                while (true) {
                    byte[] bArr3 = this.f9095;
                    int i5 = this.f9096;
                    c2831.write(bArr3, i5, this.f9097 - i5);
                    this.f9097 = -1;
                    FileInputStream fileInputStream = this.f9093;
                    byte[] bArr4 = this.f9095;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f9096 = 0;
                    this.f9097 = i6;
                    for (int i7 = 0; i7 != this.f9097; i7++) {
                        byte[] bArr5 = this.f9095;
                        if (bArr5[i7] == 10) {
                            int i8 = 0;
                            if (i7 != 0) {
                                c2831.write(bArr5, 0, i7 - 0);
                            }
                            this.f9096 = i7 + 1;
                            return c2831.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
