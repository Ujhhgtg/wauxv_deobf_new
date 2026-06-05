package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3496Ujhhgtgfeyxiexzf extends C3363feyxiexzfUjhhgtg {
    public C3496Ujhhgtgfeyxiexzf(byte[] bArr) {
        super(bArr);
        this.f10515Ujhhgtgfeyxiexzf.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4988Ujhhgtgfeyxiexzf(long j) throws IOException {
        int i = this.f10517Ujhhgtgfeyxiexzf;
        if (i > j) {
            this.f10517Ujhhgtgfeyxiexzf = 0;
            this.f10515Ujhhgtgfeyxiexzf.reset();
        } else {
            j -= (long) i;
        }
        m4867Ujhhgtgfeyxiexzf((int) j);
    }

    public C3496Ujhhgtgfeyxiexzf(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10515Ujhhgtgfeyxiexzf.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
