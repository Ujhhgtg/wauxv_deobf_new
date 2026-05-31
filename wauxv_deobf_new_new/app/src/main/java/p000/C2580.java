package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤝᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2580 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f8200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public InterfaceC3507 f8201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1853 f8202;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2581)) {
            return false;
        }
        int i = this.f8200;
        InterfaceC3507 interfaceC3507 = this.f8201;
        C1853 c1853 = this.f8202;
        ConcurrentHashMap concurrentHashMap = C2581.f8203;
        return ((C2581) obj).m4559(i, interfaceC3507, c1853);
    }

    public final int hashCode() {
        int i = this.f8200;
        InterfaceC3507 interfaceC3507 = this.f8201;
        C1853 c1853 = this.f8202;
        ConcurrentHashMap concurrentHashMap = C2581.f8203;
        return ((interfaceC3507.hashCode() + ((c1853 != null ? c1853.hashCode() : 0) * 31)) * 31) + i;
    }
}
