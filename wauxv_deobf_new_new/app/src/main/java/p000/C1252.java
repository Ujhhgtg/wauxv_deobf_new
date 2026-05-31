package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1252 extends C1248 {
    public C1252(byte[] bArr) {
        super(bArr);
        this.f4514.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3030(long j) throws IOException {
        int i = this.f4516;
        if (i > j) {
            this.f4516 = 0;
            this.f4514.reset();
        } else {
            j -= (long) i;
        }
        m3022((int) j);
    }

    public C1252(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4514.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
