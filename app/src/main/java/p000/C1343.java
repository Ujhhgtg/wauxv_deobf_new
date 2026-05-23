package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 extends AbstractC0426 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4812 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC1749.f5849);

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        return obj instanceof C1343;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return 1572326941;
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        messageDigest.update(f4812);
    }

    @Override // p000.AbstractC0426
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1631(InterfaceC0424 interfaceC0424, Bitmap bitmap, int i, int i2) {
        return AbstractC3429.m4941(interfaceC0424, bitmap, i, i2);
    }
}
