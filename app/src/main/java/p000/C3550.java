package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3550 extends MediaDataSource {

    public final /* synthetic */ ByteBuffer f11150;

    public C3550(ByteBuffer byteBuffer) {
        this.f11150 = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f11150.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f11150;
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
