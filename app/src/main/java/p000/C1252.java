package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1252 implements InterfaceC1607 {
    @Override // p000.InterfaceC1607
    public final ImageHeaderParser$ImageType mo2558(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1607
    public final boolean mo2559(ByteBuffer byteBuffer, C1867 c1867) {
        return false;
    }

    @Override // p000.InterfaceC1607
    public final int mo2560(ByteBuffer byteBuffer, C1867 c1867) {
        AtomicReference atomicReference = AbstractC0534.f2234;
        return mo2562(new C0533(byteBuffer), c1867);
    }

    @Override // p000.InterfaceC1607
    public final ImageHeaderParser$ImageType mo2561(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1607
    public final int mo2562(InputStream inputStream, C1867 c1867) {
        int iM2908;
        C1251 c1251 = new C1251(inputStream);
        C1247 c1247M2915 = c1251.m2915("Orientation");
        if (c1247M2915 == null) {
            iM2908 = 1;
        } else {
            try {
                iM2908 = c1247M2915.m2908(c1251.f4563);
            } catch (NumberFormatException unused) {
                iM2908 = 1;
            }
        }
        if (iM2908 == 0) {
            return -1;
        }
        return iM2908;
    }

    @Override // p000.InterfaceC1607
    public final boolean mo2563(InputStream inputStream, C1867 c1867) {
        return false;
    }
}
