package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1871feyxiexzfUjhhgtg extends MediaDataSource {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ ByteBuffer f6248Ujhhgtgfeyxiexzf;

    public C1871feyxiexzfUjhhgtg(ByteBuffer byteBuffer) {
        this.f6248Ujhhgtgfeyxiexzf = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6248Ujhhgtgfeyxiexzf.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f6248Ujhhgtgfeyxiexzf;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
