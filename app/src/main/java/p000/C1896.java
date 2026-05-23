package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1896 extends AbstractC2270 {

    public final EnumC1683 f6264;

    public final AbstractC2643 f6265;

    public final AbstractC1675 f6266;

    public final int f6267;

    public C1896(EnumC1683 enumC1683, AbstractC2643 abstractC2643, AbstractC1675 abstractC1675, AbstractC1675 abstractC1676, int i) {
        super(4, 12);
        if (enumC1683 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC1675 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC1676 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f6264 = enumC1683;
        this.f6265 = abstractC2643;
        this.f6266 = abstractC1675;
        this.f6267 = i;
    }

    public static void m3690(AbstractC2643[] abstractC2643Arr, C1986 c1986) {
        if (abstractC2643Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (c1986.f6598.size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC2643 abstractC2643 : abstractC2643Arr) {
            int i = 0;
            EnumC1683 enumC1683 = null;
            AbstractC1675 abstractC1675 = null;
            AbstractC1675 abstractC1676 = null;
            for (AbstractC1675 abstractC1677 : abstractC2643.mo1923()) {
                EnumC1683 enumC1683Mo1222 = abstractC1677.mo1222();
                if (enumC1683Mo1222 != enumC1683) {
                    if (i != 0) {
                        arrayList.add(new C1896(enumC1683, abstractC2643, abstractC1675, abstractC1676, i));
                    }
                    i = 0;
                    abstractC1675 = abstractC1677;
                    enumC1683 = enumC1683Mo1222;
                }
                i++;
                abstractC1676 = abstractC1677;
            }
            if (i != 0) {
                arrayList.add(new C1896(enumC1683, abstractC2643, abstractC1675, abstractC1676, i));
            } else if (abstractC2643 == c1986) {
                arrayList.add(new C1896(c1986));
            }
        }
        c1986.m3854(new C3496(EnumC1683.f5722, arrayList));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1896.class.getName());
        sb.append('{');
        sb.append(this.f6265.toString());
        sb.append(' ');
        return AbstractC1194.m2786(sb, this.f6264.f5738, '}');
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5733;
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        EnumC1683 enumC1683 = this.f6264;
        int i = enumC1683.f5736;
        AbstractC2643 abstractC2643 = this.f6265;
        AbstractC1675 abstractC1675 = this.f6266;
        int iM4635 = abstractC1675 == null ? abstractC2643.m4635() : abstractC2643.mo3850(abstractC1675);
        boolean zM1833 = c0519.m1833();
        int i2 = this.f6267;
        if (zM1833) {
            c0519.m1831(0, m4151() + ' ' + enumC1683.f5737 + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(AbstractC1460.m3223(i));
            sb.append(" // ");
            sb.append(enumC1683.toString());
            c0519.m1831(2, sb.toString());
            c0519.m1831(2, "  unused: 0");
            c0519.m1831(4, "  size:   ".concat(AbstractC1460.m3224(i2)));
            c0519.m1831(4, "  offset: ".concat(AbstractC1460.m3224(iM4635)));
        }
        c0519.m1840(i);
        c0519.m1840(0);
        c0519.m1839(i2);
        c0519.m1839(iM4635);
    }

    public C1896(C1986 c1986) {
        super(4, 12);
        if (c1986 != null) {
            this.f6264 = EnumC1683.f5722;
            this.f6265 = c1986;
            this.f6266 = null;
            this.f6267 = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
    }
}
