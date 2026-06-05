package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2597feyxiexzfUjhhgtg extends InputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8398Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2595feyxiexzfUjhhgtg f8399Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2597feyxiexzfUjhhgtg(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, int i) {
        this.f8398Ujhhgtgfeyxiexzf = i;
        this.f8399Ujhhgtgfeyxiexzf = interfaceC2595feyxiexzfUjhhgtg;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f8398Ujhhgtgfeyxiexzf) {
            case 0:
                jMin = Math.min(((C2598feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf).f8401Ujhhgtgfeyxiexzf, Integer.MAX_VALUE);
                break;
            default:
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = (C0789feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf;
                if (c0789feyxiexzfUjhhgtg.f3098Ujhhgtgfeyxiexzf) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf.f8401Ujhhgtgfeyxiexzf, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8398Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                ((C0789feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f8398Ujhhgtgfeyxiexzf) {
            case 0:
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = (C2598feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf;
                if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf > 0) {
                    return c2598feyxiexzfUjhhgtg.readByte() & 255;
                }
                return -1;
            default:
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = (C0789feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf;
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf;
                if (c0789feyxiexzfUjhhgtg.f3098Ujhhgtgfeyxiexzf) {
                    throw new IOException("closed");
                }
                if (c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf == 0 && c0789feyxiexzfUjhhgtg.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg2, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                    return -1;
                }
                return c2598feyxiexzfUjhhgtg2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f8398Ujhhgtgfeyxiexzf) {
            case 0:
                return ((C2598feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf) + ".inputStream()";
            default:
                return ((C0789feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f8398Ujhhgtgfeyxiexzf) {
            case 0:
                return ((C2598feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf).read(bArr, i, i2);
            default:
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = (C0789feyxiexzfUjhhgtg) this.f8399Ujhhgtgfeyxiexzf;
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf;
                if (!c0789feyxiexzfUjhhgtg.f3098Ujhhgtgfeyxiexzf) {
                    AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(bArr.length, i, i2);
                    if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf == 0 && c0789feyxiexzfUjhhgtg.f3096Ujhhgtgfeyxiexzf.read(c2598feyxiexzfUjhhgtg, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                        return -1;
                    }
                    return c2598feyxiexzfUjhhgtg.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m3855Ujhhgtgfeyxiexzf() {
    }
}
