package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1891 implements InterfaceC2429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1892 f6267;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f6268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Class f6269;

    public C1891(C1892 c1892) {
        this.f6267 = c1892;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1891) {
            C1891 c1891 = (C1891) obj;
            if (this.f6268 == c1891.f6268 && this.f6269 == c1891.f6269) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6268 * 31;
        Class cls = this.f6269;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f6268 + "array=" + this.f6269 + '}';
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo3814() {
        this.f6267.m1625(this);
    }
}
