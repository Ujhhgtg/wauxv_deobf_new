package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2647Ujhhgtgfeyxiexzf extends InputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ByteBuffer f8500Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f8501Ujhhgtgfeyxiexzf = -1;

    public C2647Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer) {
        this.f8500Ujhhgtgfeyxiexzf = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8500Ujhhgtgfeyxiexzf.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f8501Ujhhgtgfeyxiexzf = this.f8500Ujhhgtgfeyxiexzf.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f8500Ujhhgtgfeyxiexzf;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f8501Ujhhgtgfeyxiexzf;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f8500Ujhhgtgfeyxiexzf.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f8500Ujhhgtgfeyxiexzf;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f8500Ujhhgtgfeyxiexzf;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
