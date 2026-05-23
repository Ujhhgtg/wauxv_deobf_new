package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0422 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0424 f1972;

    public C0422() {
        this.f1971 = 0;
        this.f1972 = new C0373(3);
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1209(Object obj, C2303 c2303) {
        switch (this.f1971) {
            case 0:
                AbstractC0080.m991(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        switch (this.f1971) {
            case 0:
                return m1615(AbstractC0080.m973(obj), i, i2, c2303);
            default:
                return C0425.m1628(this.f1972, ((C2807) obj).m4783());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0425 m1615(ImageDecoder.Source source, int i, int i2, C2303 c2303) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1001(i, i2, c2303));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0425((C0373) this.f1972, bitmapDecodeBitmap);
    }

    public C0422(InterfaceC0424 interfaceC0424) {
        this.f1971 = 1;
        this.f1972 = interfaceC0424;
    }
}
