package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲇᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0956 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1772 f3496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1772 f3497;

    public C0956(InterfaceC1772 interfaceC1772, InterfaceC1772 interfaceC1773) {
        this.f3496 = interfaceC1772;
        this.f3497 = interfaceC1773;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C0956) {
            C0956 c0956 = (C0956) obj;
            if (this.f3496.equals(c0956.f3496) && this.f3497.equals(c0956.f3497)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return this.f3497.hashCode() + (this.f3496.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f3496 + ", signature=" + this.f3497 + '}';
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        this.f3496.mo2098(messageDigest);
        this.f3497.mo2098(messageDigest);
    }
}
