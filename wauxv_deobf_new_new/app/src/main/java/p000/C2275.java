package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲇᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2275 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f7383;

    public C2275(Object obj) {
        AbstractC2727.m4693(obj, "Argument must not be null");
        this.f7383 = obj;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C2275) {
            return this.f7383.equals(((C2275) obj).f7383);
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return this.f7383.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f7383 + '}';
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        messageDigest.update(this.f7383.toString().getBytes(InterfaceC1772.f5911));
    }
}
