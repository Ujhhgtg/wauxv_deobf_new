package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲈᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0953 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1749 f3481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1749 f3482;

    public C0953(InterfaceC1749 interfaceC1749, InterfaceC1749 interfaceC17410) {
        this.f3481 = interfaceC1749;
        this.f3482 = interfaceC17410;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C0953) {
            C0953 c0953 = (C0953) obj;
            if (this.f3481.equals(c0953.f3481) && this.f3482.equals(c0953.f3482)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return this.f3482.hashCode() + (this.f3481.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f3481 + ", signature=" + this.f3482 + '}';
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        this.f3481.mo2001(messageDigest);
        this.f3482.mo2001(messageDigest);
    }
}
