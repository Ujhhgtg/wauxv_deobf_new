package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1254 implements InterfaceC1620 {
    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final ImageHeaderParser$ImageType mo2682(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2683(ByteBuffer byteBuffer, C1893 c1893) {
        return false;
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2684(ByteBuffer byteBuffer, C1893 c1893) {
        AtomicReference atomicReference = AbstractC0511.f2190;
        return mo2686(new C0510(byteBuffer), c1893);
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final ImageHeaderParser$ImageType mo2685(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo2686(InputStream inputStream, C1893 c1893) throws Throwable {
        int iM3027;
        C1253 c1253 = new C1253(inputStream);
        C1249 c1249M3034 = c1253.m3034("Orientation");
        if (c1249M3034 == null) {
            iM3027 = 1;
        } else {
            try {
                iM3027 = c1249M3034.m3027(c1253.f4562);
            } catch (NumberFormatException unused) {
                iM3027 = 1;
            }
        }
        if (iM3027 == 0) {
            return -1;
        }
        return iM3027;
    }

    @Override // p000.InterfaceC1620
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo2687(InputStream inputStream, C1893 c1893) {
        return false;
    }
}
