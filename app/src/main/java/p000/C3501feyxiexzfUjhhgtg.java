package p000;

import com.alibaba.fastjson2.JSONB;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3501feyxiexzfUjhhgtg extends FilterInputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final byte[] f10897Ujhhgtgfeyxiexzf = {-1, -31, 0, 28, 69, JSONB.Constants.BC_STR_ASCII_FIX_MAX, JSONB.Constants.BC_STR_ASCII_FIX_32, 102, 0, 0, JSONB.Constants.BC_STR_ASCII_FIX_4, JSONB.Constants.BC_STR_ASCII_FIX_4, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int f10898Ujhhgtgfeyxiexzf = 31;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final byte f10899Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10900Ujhhgtgfeyxiexzf;

    public C3501feyxiexzfUjhhgtg(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Cannot add invalid orientation: "));
        }
        this.f10899Ujhhgtgfeyxiexzf = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f10900Ujhhgtgfeyxiexzf;
        if (i3 < 2 || i3 > (i2 = f10898Ujhhgtgfeyxiexzf)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f10899Ujhhgtgfeyxiexzf : f10897Ujhhgtgfeyxiexzf[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f10900Ujhhgtgfeyxiexzf++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f10900Ujhhgtgfeyxiexzf = (int) (((long) this.f10900Ujhhgtgfeyxiexzf) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f10900Ujhhgtgfeyxiexzf;
        int i5 = f10898Ujhhgtgfeyxiexzf;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f10899Ujhhgtgfeyxiexzf;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f10897Ujhhgtgfeyxiexzf, this.f10900Ujhhgtgfeyxiexzf - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f10900Ujhhgtgfeyxiexzf += i3;
        }
        return i3;
    }
}
