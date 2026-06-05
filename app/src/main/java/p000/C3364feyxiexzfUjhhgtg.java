package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3364feyxiexzfUjhhgtg extends MediaDataSource {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f10519Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3496Ujhhgtgfeyxiexzf f10520Ujhhgtgfeyxiexzf;

    public C3364feyxiexzfUjhhgtg(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) {
        this.f10520Ujhhgtgfeyxiexzf = c3496Ujhhgtgfeyxiexzf;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f10519Ujhhgtgfeyxiexzf;
            C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf = this.f10520Ujhhgtgfeyxiexzf;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) c3496Ujhhgtgfeyxiexzf.f10515Ujhhgtgfeyxiexzf.available())) {
                    return -1;
                }
                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j);
                this.f10519Ujhhgtgfeyxiexzf = j;
            }
            if (i2 > c3496Ujhhgtgfeyxiexzf.f10515Ujhhgtgfeyxiexzf.available()) {
                i2 = c3496Ujhhgtgfeyxiexzf.f10515Ujhhgtgfeyxiexzf.available();
            }
            int i3 = c3496Ujhhgtgfeyxiexzf.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f10519Ujhhgtgfeyxiexzf += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f10519Ujhhgtgfeyxiexzf = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
