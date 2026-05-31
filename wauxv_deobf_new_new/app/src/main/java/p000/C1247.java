package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲀᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1247 extends MediaDataSource {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public long f4510;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1252 f4511;

    public C1247(C1252 c1252) {
        this.f4511 = c1252;
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
            long j2 = this.f4510;
            C1252 c1252 = this.f4511;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) c1252.f4514.available())) {
                    return -1;
                }
                c1252.m3030(j);
                this.f4510 = j;
            }
            if (i2 > c1252.f4514.available()) {
                i2 = c1252.f4514.available();
            }
            int i3 = c1252.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f4510 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f4510 = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
