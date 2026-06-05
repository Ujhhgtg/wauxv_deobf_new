package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3356feyxiexzfUjhhgtg extends InputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final ArrayDeque f10473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0790feyxiexzfUjhhgtg f10474Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public IOException f10475Ujhhgtgfeyxiexzf;

    static {
        char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
        f10473Ujhhgtgfeyxiexzf = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10474Ujhhgtgfeyxiexzf.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10474Ujhhgtgfeyxiexzf.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f10474Ujhhgtgfeyxiexzf.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f10474Ujhhgtgfeyxiexzf.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f10474Ujhhgtgfeyxiexzf.read();
        } catch (IOException e) {
            this.f10475Ujhhgtgfeyxiexzf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f10474Ujhhgtgfeyxiexzf.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f10474Ujhhgtgfeyxiexzf.skip(j);
        } catch (IOException e) {
            this.f10475Ujhhgtgfeyxiexzf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f10474Ujhhgtgfeyxiexzf.read(bArr);
        } catch (IOException e) {
            this.f10475Ujhhgtgfeyxiexzf = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f10474Ujhhgtgfeyxiexzf.read(bArr, i, i2);
        } catch (IOException e) {
            this.f10475Ujhhgtgfeyxiexzf = e;
            throw e;
        }
    }
}
