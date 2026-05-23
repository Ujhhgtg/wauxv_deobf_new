package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0578 extends AbstractC0426 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f2351 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC1749.f5849);

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        return obj instanceof C0578;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return -599754482;
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2001(MessageDigest messageDigest) {
        messageDigest.update(f2351);
    }

    @Override // p000.AbstractC0426
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1631(InterfaceC0424 interfaceC0424, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC3429.f10801;
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
        Bitmap bitmapMo1513 = interfaceC0424.mo1513(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1513.setHasAlpha(bitmap.hasAlpha());
        AbstractC3429.m4940(bitmap, bitmapMo1513, matrix);
        return bitmapMo1513;
    }
}
