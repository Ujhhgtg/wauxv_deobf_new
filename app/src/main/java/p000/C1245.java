package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1245 extends MediaDataSource {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long f4511;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1250 f4512;

    public C1245(C1250 c1250) {
        this.f4512 = c1250;
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
            long j2 = this.f4511;
            C1250 c1250 = this.f4512;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) c1250.f4515.available())) {
                    return -1;
                }
                c1250.m2911(j);
                this.f4511 = j;
            }
            if (i2 > c1250.f4515.available()) {
                i2 = c1250.f4515.available();
            }
            int i3 = c1250.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f4511 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f4511 = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
