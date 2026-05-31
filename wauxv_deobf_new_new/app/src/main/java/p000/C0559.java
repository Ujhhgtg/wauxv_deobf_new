package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᤝᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 extends AbstractC0401 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f2317 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC1772.f5911);

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        return obj instanceof C0559;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return -599754482;
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2098(MessageDigest messageDigest) {
        messageDigest.update(f2317);
    }

    @Override // p000.AbstractC0401
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1737(InterfaceC0399 interfaceC0399, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC3486.f10961;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1618 = interfaceC0399.mo1618(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1618.setHasAlpha(bitmap.hasAlpha());
        AbstractC3486.m5002(bitmap, bitmapMo1618, matrix);
        return bitmapMo1618;
    }
}
