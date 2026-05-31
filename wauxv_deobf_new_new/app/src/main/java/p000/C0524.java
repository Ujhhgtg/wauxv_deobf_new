package p000;

import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 extends AbstractC1641 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0894 f2214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0526 f2215 = null;

    public C0524(C0894 c0894) {
        this.f2214 = c0894;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2214.compareTo(((C0524) obj).f2214);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C0893 c0893 = this.f2214.f3342.f3368;
        C0525 c0525 = c1026.f3755;
        if (c0893 == null) {
            c0525.getClass();
            throw new NullPointerException("callSite == null");
        }
        C0526 c0526 = (C0526) ((TreeMap) c0525.f2218).get(c0893);
        if (c0526 == null) {
            C2017 c2017 = c1026.f3757;
            c0526 = new C0526(c0893);
            c2017.m4048(c0526);
            ((TreeMap) c0525.f2218).put(c0893, c0526);
        }
        this.f2215 = c0526;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5763;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo2016() {
        return 4;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        int iM4279 = this.f2215.m4279();
        if (c0496.m1927()) {
            c0496.m1925(0, m3510() + ' ' + this.f2214.toString());
            c0496.m1925(4, "call_site_off: ".concat(AbstractC2902.m4907(iM4279)));
        }
        c0496.m1933(iM4279);
    }
}
