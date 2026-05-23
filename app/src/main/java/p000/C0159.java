package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1171;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0542 f1172;

    public /* synthetic */ C0159(C0542 c0542, int i) {
        this.f1171 = i;
        this.f1172 = c0542;
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo1209(Object obj, C2303 c2303) throws IOException {
        switch (this.f1171) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3973 = AbstractC2201.m3973((ArrayList) this.f1172.f2252, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeM3973 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM3973 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                C0542 c0542 = this.f1172;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3972 = AbstractC2201.m3972((ArrayList) c0542.f2252, (InputStream) obj, (C1867) c0542.f2253);
                return imageHeaderParser$ImageTypeM3972 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM3972 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f1171) {
            case 0:
                return C0542.m1879(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2303);
            default:
                return C0542.m1879(ImageDecoder.createSource(AbstractC0534.m1864((InputStream) obj)), i, i2, c2303);
        }
    }
}
