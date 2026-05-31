package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1922 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final EnumC1701 f6338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC2704 f6339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final AbstractC1690 f6340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f6341;

    public C1922(EnumC1701 enumC1701, AbstractC2704 abstractC2704, AbstractC1690 abstractC1690, AbstractC1690 abstractC1691, int i) {
        super(4, 12);
        if (enumC1701 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC1690 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC1691 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f6338 = enumC1701;
        this.f6339 = abstractC2704;
        this.f6340 = abstractC1690;
        this.f6341 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m3869(AbstractC2704[] abstractC2704Arr, C2017 c2017) {
        if (abstractC2704Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (c2017.f6703.size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC2704 abstractC2704 : abstractC2704Arr) {
            int i = 0;
            EnumC1701 enumC1701 = null;
            AbstractC1690 abstractC1690 = null;
            AbstractC1690 abstractC1691 = null;
            for (AbstractC1690 abstractC1692 : abstractC2704.mo2018()) {
                EnumC1701 enumC1701Mo1368 = abstractC1692.mo1368();
                if (enumC1701Mo1368 != enumC1701) {
                    if (i != 0) {
                        arrayList.add(new C1922(enumC1701, abstractC2704, abstractC1690, abstractC1691, i));
                    }
                    i = 0;
                    abstractC1690 = abstractC1692;
                    enumC1701 = enumC1701Mo1368;
                }
                i++;
                abstractC1691 = abstractC1692;
            }
            if (i != 0) {
                arrayList.add(new C1922(enumC1701, abstractC2704, abstractC1690, abstractC1691, i));
            } else if (abstractC2704 == c2017) {
                arrayList.add(new C1922(c2017));
            }
        }
        c2017.m4048(new C3553(EnumC1701.f5765, arrayList));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1922.class.getName());
        sb.append('{');
        sb.append(this.f6339.toString());
        sb.append(' ');
        return AbstractC1095.m2801(sb, this.f6338.f5781, '}');
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5776;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        EnumC1701 enumC1701 = this.f6338;
        int i = enumC1701.f5779;
        AbstractC2704 abstractC2704 = this.f6339;
        AbstractC1690 abstractC1690 = this.f6340;
        int iM4669 = abstractC1690 == null ? abstractC2704.m4669() : abstractC2704.mo4044(abstractC1690);
        boolean zM1927 = c0496.m1927();
        int i2 = this.f6341;
        if (zM1927) {
            c0496.m1925(0, m4280() + ' ' + enumC1701.f5780 + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(AbstractC2902.m4906(i));
            sb.append(" // ");
            sb.append(enumC1701.toString());
            c0496.m1925(2, sb.toString());
            c0496.m1925(2, "  unused: 0");
            c0496.m1925(4, "  size:   ".concat(AbstractC2902.m4907(i2)));
            c0496.m1925(4, "  offset: ".concat(AbstractC2902.m4907(iM4669)));
        }
        c0496.m1934(i);
        c0496.m1934(0);
        c0496.m1933(i2);
        c0496.m1933(iM4669);
    }

    public C1922(C2017 c2017) {
        super(4, 12);
        if (c2017 != null) {
            this.f6338 = EnumC1701.f5765;
            this.f6339 = c2017;
            this.f6340 = null;
            this.f6341 = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
    }
}
