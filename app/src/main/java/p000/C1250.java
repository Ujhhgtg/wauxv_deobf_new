package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 extends C1246 {
    public C1250(byte[] bArr) {
        super(bArr);
        this.f4515.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2911(long j) throws IOException {
        int i = this.f4517;
        if (i > j) {
            this.f4517 = 0;
            this.f4515.reset();
        } else {
            j -= (long) i;
        }
        m2903((int) j);
    }

    public C1250(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4515.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
