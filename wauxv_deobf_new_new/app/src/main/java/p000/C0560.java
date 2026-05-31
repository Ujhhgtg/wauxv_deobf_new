package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᤝᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0560 extends AbstractC0401 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f2318 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC1772.f5911);

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        return obj instanceof C0560;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return -670243078;
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        messageDigest.update(f2318);
    }

    @Override // p000.AbstractC0401
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1737(InterfaceC0399 interfaceC0399, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC3486.f10961;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC3486.m5003(interfaceC0399, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }
}
