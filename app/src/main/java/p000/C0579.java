package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0579 extends AbstractC0426 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f2352 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC1749.f5849);

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        return obj instanceof C0579;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return -670243078;
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        messageDigest.update(f2352);
    }

    @Override // p000.AbstractC0426
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1631(InterfaceC0424 interfaceC0424, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC3429.f10801;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC3429.m4941(interfaceC0424, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }
}
