package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2336 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0522 f7541 = new C0522(0);

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C2336) {
            return this.f7541.equals(((C2336) obj).f7541);
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return this.f7541.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f7541 + '}';
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0522 c0522 = this.f7541;
            if (i >= c0522.f8887) {
                return;
            }
            C2334 c2334 = (C2334) c0522.m4743(i);
            Object objM4744 = this.f7541.m4744(i);
            InterfaceC2333 interfaceC2333 = c2334.f7536;
            if (c2334.f7538 == null) {
                c2334.f7538 = c2334.f7537.getBytes(InterfaceC1772.f5911);
            }
            interfaceC2333.mo1900(c2334.f7538, objM4744, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object m4294(C2334 c2334) {
        C0522 c0522 = this.f7541;
        return c0522.containsKey(c2334) ? c0522.get(c2334) : c2334.f7535;
    }
}
