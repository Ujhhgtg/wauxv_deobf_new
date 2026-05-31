package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤝᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0731 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0912 f2760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0225 f2761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0552 f2762;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean f2763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final InterfaceC3510 f2764;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0970 f2765;

    public C0731(C0912 c0912, C0225 c0225, boolean z, InterfaceC3510 interfaceC3510) {
        super(4, -1);
        if (c0225 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC3510 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f2760 = c0912;
        this.f2761 = c0225;
        this.f2763 = z;
        this.f2764 = interfaceC3510;
        this.f2762 = null;
        this.f2765 = null;
    }

    public final String toString() {
        return "CodeItem{" + this.f2760.mo1360() + "}";
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2017 c2017 = c1026.f3757;
        C2008 c2008 = c1026.f3749;
        C0225 c0225 = this.f2761;
        c0225.getClass();
        C2341 c2341 = (C2341) c0225.f1404;
        if (c2341.f7554 || c2341.f7555) {
            C0970 c0970 = new C0970(c0225, this.f2763, this.f2760);
            this.f2765 = c0970;
            c2017.m4048(c0970);
        }
        C0379 c0379 = (C0379) ((C0776) ((C0253) c0225.f1405).f1478).f2879;
        int length = c0379.f4833.length;
        for (int i = 0; i < length; i++) {
            if (((C0377) c0379.m3165(i)).f1870.m1751().mo3150().size() != 0) {
                C0253 c0253 = (C0253) c0225.f1405;
                c0253.getClass();
                HashSet hashSet = new HashSet(20);
                C0379 c03710 = (C0379) ((C0776) c0253.f1478).f2879;
                int length2 = c03710.f4833.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    InterfaceC3510 interfaceC3510Mo3150 = ((C0377) c03710.m3165(i2)).f1870.m1751().mo3150();
                    int size = interfaceC3510Mo3150.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hashSet.add(interfaceC3510Mo3150.getType(i3));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c2008.m4007((C3505) it.next());
                }
                this.f2762 = new C0552(c0225);
                break;
            }
        }
        C2341 c2342 = (C2341) c0225.f1404;
        c2342.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (AbstractC0953 abstractC0953 : c2342.f7553) {
            if (abstractC0953 instanceof C0901) {
                hashSet2.add(((C0901) abstractC0953).f3352);
            } else if (abstractC0953 instanceof C2132) {
                C2132 c2132 = (C2132) abstractC0953;
                int i4 = 0;
                while (true) {
                    AbstractC0775[] abstractC0775Arr = c2132.f7041;
                    if (i4 < abstractC0775Arr.length) {
                        hashSet2.add(abstractC0775Arr[i4]);
                        i4++;
                    }
                }
            } else {
                if (abstractC0953 instanceof AbstractC1856) {
                    throw null;
                }
                boolean z = abstractC0953 instanceof AbstractC1857;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c1026.m2719((AbstractC0775) it2.next());
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5770;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        int iM1267;
        C1026 c1026 = c2017.f8699;
        C0102 c0102 = new C0102(c1026, 7);
        C0225 c0225 = this.f2761;
        Iterator it = ((C2341) c0225.f1404).f7553.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                C0552 c0552 = this.f2762;
                if (c0552 != null) {
                    c0552.m2089();
                    C2008 c2008 = c1026.f3749;
                    int length2 = ((C0554) c0552.f2306).f4833.length;
                    c0552.f2308 = new TreeMap();
                    for (int i2 = 0; i2 < length2; i2++) {
                        ((TreeMap) c0552.f2308).put(((C0553) ((C0554) c0552.f2306).m3165(i2)).f2311, null);
                    }
                    if (((TreeMap) c0552.f2308).size() > 65535) {
                        throw new UnsupportedOperationException("too many catch handlers");
                    }
                    C0496 c0496 = new C0496();
                    c0552.f2304 = c0496.m1936(((TreeMap) c0552.f2308).size());
                    for (Map.Entry entry : ((TreeMap) c0552.f2308).entrySet()) {
                        C0551 c0551 = (C0551) entry.getKey();
                        Object[] objArr = c0551.f4833;
                        int length3 = objArr.length;
                        int length4 = objArr.length;
                        boolean zEquals = length4 == 0 ? false : ((C0550) c0551.m3165(length4 - 1)).f2300.equals(C0917.f3388);
                        entry.setValue(Integer.valueOf(c0496.f2152));
                        if (zEquals) {
                            c0496.m1935(-(length3 - 1));
                            length3--;
                        } else {
                            c0496.m1935(length3);
                        }
                        for (int i3 = 0; i3 < length3; i3++) {
                            C0550 c0550 = (C0550) c0551.m3165(i3);
                            c0496.m1936(c2008.m4000(c0550.f2300));
                            c0496.m1936(c0550.f2301);
                        }
                        if (zEquals) {
                            c0496.m1936(((C0550) c0551.m3165(length3)).f2301);
                        }
                    }
                    c0552.f2307 = c0496.m1930();
                    C0552 c0553 = this.f2762;
                    c0553.m2089();
                    length = (((C0554) c0553.f2306).f4833.length * 8) + ((byte[]) c0553.f2307).length;
                }
                c0225.m1393();
                int iM2564 = ((C0954) c0225.f1409).m2564();
                if ((iM2564 & 1) != 0) {
                    iM2564++;
                }
                m4282((iM2564 * 2) + 16 + length);
                return;
            }
            AbstractC0953 abstractC0953 = (AbstractC0953) it.next();
            if (abstractC0953 instanceof C0901) {
                C0901 c0901 = (C0901) abstractC0953;
                AbstractC0775 abstractC0775 = c0901.f3352;
                int iM1268 = c0102.m1267(abstractC0775);
                if (iM1268 >= 0) {
                    c0901.m2536(iM1268);
                }
                if ((abstractC0775 instanceof AbstractC0910) && (iM1267 = c0102.m1267(((AbstractC0910) abstractC0775).f3375)) >= 0) {
                    c0901.m2535(iM1267);
                }
            } else if (abstractC0953 instanceof C2132) {
                C2132 c2132 = (C2132) abstractC0953;
                while (true) {
                    AbstractC0775[] abstractC0775Arr = c2132.f7041;
                    if (length >= abstractC0775Arr.length) {
                        break;
                    }
                    AbstractC0775 abstractC0776 = abstractC0775Arr[length];
                    int iM1269 = c0102.m1267(abstractC0776);
                    if (iM1269 < 0) {
                        throw new IllegalArgumentException("index < 0");
                    }
                    int[] iArr = c2132.f7042;
                    if (iArr[length] != -1) {
                        throw new IllegalStateException("index already set");
                    }
                    iArr[length] = iM1269;
                    if (abstractC0776 instanceof AbstractC0910) {
                        int iM12610 = c0102.m1267(((AbstractC0910) abstractC0776).f3375);
                        if (iM12610 < 0) {
                            throw new IllegalArgumentException("index < 0");
                        }
                        if (c2132.f7043 != -1) {
                            throw new IllegalStateException("class index already set");
                        }
                        c2132.f7043 = iM12610;
                    }
                    length++;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        boolean z;
        int length;
        C0912 c0912;
        String string;
        int iM4830;
        boolean zM1927 = c0496.m1927();
        C0225 c0225 = this.f2761;
        c0225.m1393();
        int i = ((C0954) c0225.f1409).f3486;
        c0225.m1393();
        C0954 c0954 = (C0954) c0225.f1409;
        int length2 = c0954.f4833.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                C0912 c0913 = this.f2760;
                C2492 c2492 = c0913.f3337;
                if (!this.f2763) {
                    if (c0913.f3338 == null) {
                        c0913.f3338 = c2492.m4444(c0913.f3375.f3408);
                    }
                    c2492 = c0913.f3338;
                }
                int iM4831 = c2492.f7900.m4830();
                c0225.m1393();
                int iM2564 = ((C0954) c0225.f1409).m2564();
                z = (iM2564 & 1) != 0;
                C0552 c0552 = this.f2762;
                if (c0552 == null) {
                    length = 0;
                } else {
                    c0552.m2089();
                    length = ((C0554) c0552.f2306).f4833.length;
                }
                C0970 c0970 = this.f2765;
                int iM4279 = c0970 == null ? 0 : c0970.m4279();
                if (zM1927) {
                    c0496.m1925(0, m4280() + ' ' + c0913.mo1360());
                    c0496.m1925(2, "  registers_size: ".concat(AbstractC2902.m4906(i)));
                    c0496.m1925(2, "  ins_size:       ".concat(AbstractC2902.m4906(iM4831)));
                    c0496.m1925(2, "  outs_size:      ".concat(AbstractC2902.m4906(i3)));
                    c0496.m1925(2, "  tries_size:     ".concat(AbstractC2902.m4906(length)));
                    c0496.m1925(4, "  debug_off:      ".concat(AbstractC2902.m4907(iM4279)));
                    c0496.m1925(4, "  insns_size:     ".concat(AbstractC2902.m4907(iM2564)));
                    InterfaceC3510 interfaceC3510 = this.f2764;
                    if (interfaceC3510.size() != 0) {
                        StringBuilder sb = new StringBuilder("  throws ");
                        int size = interfaceC3510.size();
                        if (size == 0) {
                            string = "<empty>";
                            c0912 = c0913;
                        } else {
                            StringBuilder sb2 = new StringBuilder(100);
                            int i4 = 0;
                            while (i4 < size) {
                                C0912 c0914 = c0913;
                                if (i4 != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(interfaceC3510.getType(i4).mo1360());
                                i4++;
                                c0913 = c0914;
                            }
                            c0912 = c0913;
                            string = sb2.toString();
                        }
                        sb.append(string);
                        c0496.m1925(0, sb.toString());
                    } else {
                        zM1927 = zM1927;
                        c0912 = c0913;
                    }
                } else {
                    zM1927 = zM1927;
                    c0912 = c0913;
                }
                c0496.m1934(i);
                c0496.m1934(iM4831);
                c0496.m1934(i3);
                c0496.m1934(length);
                c0496.m1933(iM4279);
                c0496.m1933(iM2564);
                c0225.m1393();
                try {
                    ((C0954) c0225.f1409).m2565(c0496);
                    if (this.f2762 != null) {
                        if (z) {
                            if (zM1927) {
                                c0496.m1925(2, "  padding: 0");
                            }
                            c0496.m1934(0);
                        }
                        C0552 c0553 = this.f2762;
                        c0553.m2089();
                        if (c0496.m1927()) {
                            c0553.m2089();
                            int length3 = ((C0554) c0553.f2306).f4833.length;
                            c0496.m1925(0, "  tries:");
                            for (int i5 = 0; i5 < length3; i5++) {
                                C0553 c0554 = (C0553) ((C0554) c0553.f2306).m3165(i5);
                                C0551 c0551 = c0554.f2311;
                                StringBuilder sb3 = new StringBuilder("    try ");
                                int i6 = c0554.f2309;
                                sb3.append(i6 == ((char) i6) ? AbstractC2902.m4906(i6) : AbstractC2902.m4907(i6));
                                sb3.append("..");
                                int i7 = c0554.f2310;
                                sb3.append(i7 == ((char) i7) ? AbstractC2902.m4906(i7) : AbstractC2902.m4907(i7));
                                String string2 = sb3.toString();
                                String strM2078 = c0551.m2078("    ", "");
                                c0496.m1925(6, string2);
                                c0496.m1925(2, strM2078);
                            }
                            c0496.m1925(0, "  handlers:");
                            c0496.m1925(c0553.f2304, "    size: ".concat(AbstractC2902.m4906(((TreeMap) c0553.f2308).size())));
                            C0551 c0555 = null;
                            int i8 = 0;
                            for (Map.Entry entry : ((TreeMap) c0553.f2308).entrySet()) {
                                C0551 c0556 = (C0551) entry.getKey();
                                int iIntValue = ((Integer) entry.getValue()).intValue();
                                if (c0555 != null) {
                                    c0496.m1925(iIntValue - i8, c0555.m2078("    ", AbstractC2902.m4906(i8).concat(": ")));
                                }
                                i8 = iIntValue;
                                c0555 = c0556;
                            }
                            c0496.m1925(((byte[]) c0553.f2307).length - i8, c0555.m2078("    ", AbstractC2902.m4906(i8).concat(": ")));
                        }
                        int length4 = ((C0554) c0553.f2306).f4833.length;
                        for (int i9 = 0; i9 < length4; i9++) {
                            C0553 c0557 = (C0553) ((C0554) c0553.f2306).m3165(i9);
                            int i10 = c0557.f2309;
                            int i11 = c0557.f2310;
                            int i12 = i11 - i10;
                            if (i12 >= 65536) {
                                throw new UnsupportedOperationException("bogus exception range: " + AbstractC2902.m4907(i10) + ".." + AbstractC2902.m4907(i11));
                            }
                            c0496.m1933(i10);
                            c0496.m1934(i12);
                            c0496.m1934(((Integer) ((TreeMap) c0553.f2308).get(c0557.f2311)).intValue());
                        }
                        c0496.m1931((byte[]) c0553.f2307);
                    }
                    if (!zM1927 || this.f2765 == null) {
                        return;
                    }
                    c0496.m1925(0, "  debug info");
                    this.f2765.m2587(c1026, "    ", c0496, false);
                    return;
                } catch (RuntimeException e) {
                    throw C1240.m3003("...while writing instructions for " + c0912.mo1360(), e);
                }
            }
            AbstractC0953 abstractC0953 = (AbstractC0953) c0954.m3165(i2);
            if (abstractC0953 instanceof C0901) {
                AbstractC0775 abstractC0775 = ((C0901) abstractC0953).f3352;
                if (abstractC0775 instanceof AbstractC0890) {
                    AbstractC0890 abstractC0890 = (AbstractC0890) abstractC0775;
                    z = abstractC0953.f3483.f3938 == 113;
                    C2492 c2493 = abstractC0890.f3337;
                    if (!z) {
                        if (abstractC0890.f3338 == null) {
                            abstractC0890.f3338 = c2493.m4444(abstractC0890.f3375.f3408);
                        }
                        c2493 = abstractC0890.f3338;
                    }
                    iM4830 = c2493.f7900.m4830();
                } else {
                    iM4830 = abstractC0775 instanceof C0894 ? ((C0894) abstractC0775).f3342.f3366.f7900.m4830() : 0;
                }
            } else {
                if (!(abstractC0953 instanceof C2132)) {
                    continue;
                } else {
                    if (abstractC0953.f3483.f3938 != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM4830 = 1 + ((C0914) ((C2132) abstractC0953).f7041[1]).f3383.f7900.m4830();
                }
                i2++;
            }
            if (iM4830 > i3) {
                i3 = iM4830;
            }
            i2++;
        }
    }
}
