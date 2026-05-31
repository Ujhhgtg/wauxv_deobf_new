package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲈᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1344 extends AbstractC0401 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4811 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC1772.f5911);

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        return obj instanceof C1344;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return 1572326941;
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        messageDigest.update(f4811);
    }

    @Override // p000.AbstractC0401
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1737(InterfaceC0399 interfaceC0399, Bitmap bitmap, int i, int i2) {
        return AbstractC3486.m5003(interfaceC0399, bitmap, i, i2);
    }
}
