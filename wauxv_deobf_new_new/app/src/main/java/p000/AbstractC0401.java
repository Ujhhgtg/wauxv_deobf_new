package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0027;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0401 implements InterfaceC3484 {
    @Override // p000.InterfaceC3484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2624 mo1736(Context context, InterfaceC2624 interfaceC2624, int i, int i2) {
        if (!AbstractC3580.m5124(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0399 interfaceC0399 = ComponentCallbacks2C0027.m757(context).f589;
        Bitmap bitmap = (Bitmap) interfaceC2624.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo1737 = mo1737(interfaceC0399, bitmap, i, i2);
        return bitmap.equals(bitmapMo1737) ? interfaceC2624 : C0400.m1734(interfaceC0399, bitmapMo1737);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public abstract Bitmap mo1737(InterfaceC0399 interfaceC0399, Bitmap bitmap, int i, int i2);
}
