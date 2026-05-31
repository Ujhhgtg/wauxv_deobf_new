package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᛸᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2892 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final FileInputStream f9255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Charset f9256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public byte[] f9257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f9258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f9259;

    public C2892(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC3579.f11184)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f9255 = fileInputStream;
        this.f9256 = charset;
        this.f9257 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9255) {
            try {
                if (this.f9257 != null) {
                    this.f9257 = null;
                    this.f9255.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m4849() {
        int i;
        synchronized (this.f9255) {
            try {
                byte[] bArr = this.f9257;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f9258 >= this.f9259) {
                    int i2 = this.f9255.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f9258 = 0;
                    this.f9259 = i2;
                }
                for (int i3 = this.f9258; i3 != this.f9259; i3++) {
                    byte[] bArr2 = this.f9257;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f9258;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.f9256.name());
                        this.f9258 = i3 + 1;
                        return str;
                    }
                }
                C2891 c2891 = new C2891(this, (this.f9259 - this.f9258) + 80);
                while (true) {
                    byte[] bArr3 = this.f9257;
                    int i5 = this.f9258;
                    c2891.write(bArr3, i5, this.f9259 - i5);
                    this.f9259 = -1;
                    FileInputStream fileInputStream = this.f9255;
                    byte[] bArr4 = this.f9257;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f9258 = 0;
                    this.f9259 = i6;
                    for (int i7 = 0; i7 != this.f9259; i7++) {
                        byte[] bArr5 = this.f9257;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f9258;
                            if (i7 != i8) {
                                c2891.write(bArr5, i8, i7 - i8);
                            }
                            this.f9258 = i7 + 1;
                            return c2891.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
