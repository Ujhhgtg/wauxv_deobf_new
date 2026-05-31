package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1584 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2334 f5492 = C2334.m4293(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1681 f5493;

    public C1584(C1681 c1681) {
        this.f5493 = c1681;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1540(Object obj) {
        return true;
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        C1479 c1479 = (C1479) obj;
        C1681 c1681 = this.f5493;
        if (c1681 != null) {
            C2024 c2024 = (C2024) c1681.f5660;
            C2025 c2025M4051 = C2025.m4051(c1479);
            Object objM3827 = c2024.m3827(c2025M4051);
            ArrayDeque arrayDeque = C2025.f6758;
            synchronized (arrayDeque) {
                arrayDeque.offer(c2025M4051);
            }
            C1479 c14710 = (C1479) objM3827;
            if (c14710 == null) {
                c2024.m3830(C2025.m4051(c1479), c1479);
            } else {
                c1479 = c14710;
            }
        }
        return new C2026(c1479, new C1585(c1479, ((Integer) c2336.m4294(f5492)).intValue()));
    }
}
