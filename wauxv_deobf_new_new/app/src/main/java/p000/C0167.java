package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0167 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0519 f1240;

    public /* synthetic */ C0167(C0519 c0519, int i) {
        this.f1239 = i;
        this.f1240 = c0519;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo1355(Object obj, C2336 c2336) throws IOException {
        switch (this.f1239) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2274 = AbstractC0738.m2274((ArrayList) this.f1240.f2208, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeM2274 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2274 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                C0519 c0519 = this.f1240;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2273 = AbstractC0738.m2273((ArrayList) c0519.f2208, (InputStream) obj, (C1893) c0519.f2209);
                return imageHeaderParser$ImageTypeM2273 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2273 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f1239) {
            case 0:
                return C0519.m1973(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2336);
            default:
                return C0519.m1973(ImageDecoder.createSource(AbstractC0511.m1958((InputStream) obj)), i, i2, c2336);
        }
    }
}
