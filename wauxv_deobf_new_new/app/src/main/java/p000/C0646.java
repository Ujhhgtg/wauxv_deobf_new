package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᲀᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0646 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f2517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f2518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1422 f2519;

    public C0646(int i, String str, InterfaceC1422 interfaceC1422) {
        this.f2517 = i;
        this.f2518 = str;
        this.f2519 = interfaceC1422;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0646)) {
            return false;
        }
        C0646 c0646 = (C0646) obj;
        return this.f2517 == c0646.f2517 && AbstractC1469.m3322(this.f2518, c0646.f2518) && AbstractC1469.m3322(this.f2519, c0646.f2519);
    }

    public final int hashCode() {
        return this.f2519.hashCode() + AbstractC2647.m4621(Integer.hashCode(this.f2517) * 31, 31, this.f2518);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("MenuBean(iconId=");
        sb.append(this.f2517);
        sb.append(", title=");
        sb.append(this.f2518);
        sb.append(", onClick=");
        sb.append(this.f2519);
        sb.append(')');
        return sb.toString();
    }
}
