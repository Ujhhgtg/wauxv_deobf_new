package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1572 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2301 f5462 = C2301.m4164(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1744 f5463;

    public C1572(C1744 c1744) {
        this.f5463 = c1744;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1394(Object obj) {
        return true;
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        C1468 c1468 = (C1468) obj;
        C1744 c1744 = this.f5463;
        if (c1744 != null) {
            C1993 c1993 = (C1993) c1744.f5843;
            C1994 c1994M3857 = C1994.m3857(c1468);
            Object objM3649 = c1993.m3649(c1994M3857);
            ArrayDeque arrayDeque = C1994.f6653;
            synchronized (arrayDeque) {
                arrayDeque.offer(c1994M3857);
            }
            C1468 c1469 = (C1468) objM3649;
            if (c1469 == null) {
                c1993.m3652(C1994.m3857(c1468), c1468);
            } else {
                c1468 = c1469;
            }
        }
        return new C1995(c1468, new C1573(c1468, ((Integer) c2303.m4165(f5462)).intValue()));
    }
}
