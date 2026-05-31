package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1658 implements InterfaceC0965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1893 f5613;

    public C1658(C1893 c1893) {
        this.f5613 = c1893;
    }

    @Override // p000.InterfaceC0965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1955() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0966 mo1956(Object obj) {
        return new C0102((InputStream) obj, this.f5613);
    }
}
