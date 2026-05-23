package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤝᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2303 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0545 f7419 = new C0545(0);

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C2303) {
            return this.f7419.equals(((C2303) obj).f7419);
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return this.f7419.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f7419 + '}';
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0545 c0545 = this.f7419;
            if (i >= c0545.f8716) {
                return;
            }
            C2301 c2301 = (C2301) c0545.m4706(i);
            Object objM4707 = this.f7419.m4707(i);
            InterfaceC2300 interfaceC2300 = c2301.f7414;
            if (c2301.f7416 == null) {
                c2301.f7416 = c2301.f7415.getBytes(InterfaceC1749.f5849);
            }
            interfaceC2300.mo1806(c2301.f7416, objM4707, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object m4165(C2301 c2301) {
        C0545 c0545 = this.f7419;
        return c0545.containsKey(c2301) ? c0545.get(c2301) : c2301.f7413;
    }
}
