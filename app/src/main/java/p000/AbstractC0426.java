package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0020;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲈᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0426 implements InterfaceC3427 {
    @Override // p000.InterfaceC3427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2568 mo1630(Context context, InterfaceC2568 interfaceC2568, int i, int i2) {
        if (!AbstractC3522.m5112(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0424 interfaceC0424 = ComponentCallbacks2C0020.m614(context).f537;
        Bitmap bitmap = (Bitmap) interfaceC2568.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo1631 = mo1631(interfaceC0424, bitmap, i, i2);
        return bitmap.equals(bitmapMo1631) ? interfaceC2568 : C0425.m1628(interfaceC0424, bitmapMo1631);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public abstract Bitmap mo1631(InterfaceC0424 interfaceC0424, Bitmap bitmap, int i, int i2);
}
