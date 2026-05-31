package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0397 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0399 f1944;

    public C0397() {
        this.f1943 = 0;
        this.f1944 = new C0348(3);
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1355(Object obj, C2336 c2336) {
        switch (this.f1943) {
            case 0:
                AbstractC0088.m1136(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f1943) {
            case 0:
                return m1721(AbstractC0088.m1118(obj), i, i2, c2336);
            default:
                return C0400.m1734(this.f1944, ((C2866) obj).m4816());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0400 m1721(ImageDecoder.Source source, int i, int i2, C2336 c2336) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1005(i, i2, c2336));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0400((C0348) this.f1944, bitmapDecodeBitmap);
    }

    public C0397(InterfaceC0399 interfaceC0399) {
        this.f1943 = 1;
        this.f1944 = interfaceC0399;
    }
}
