package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲀᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0736 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0913 f2766;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0215 f2767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0575 f2768;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean f2769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final InterfaceC3454 f2770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0966 f2771;

    public C0736(C0913 c0913, C0215 c0215, boolean z, InterfaceC3454 interfaceC3454) {
        super(4, -1);
        if (c0215 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC3454 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f2766 = c0913;
        this.f2767 = c0215;
        this.f2769 = z;
        this.f2770 = interfaceC3454;
        this.f2768 = null;
        this.f2771 = null;
    }

    public final String toString() {
        return "CodeItem{" + this.f2766.mo1214() + "}";
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C1986 c1986 = c1023.f3750;
        C1977 c1977 = c1023.f3742;
        C0215 c0215 = this.f2767;
        c0215.getClass();
        C2308 c2308 = (C2308) c0215.f1330;
        if (c2308.f7432 || c2308.f7433) {
            C0966 c0966 = new C0966(c0215, this.f2769, this.f2766);
            this.f2771 = c0966;
            c1986.m3854(c0966);
        }
        C0404 c0404 = (C0404) ((C0662) ((C0243) c0215.f1331).f1404).f2530;
        int length = c0404.f4836.length;
        for (int i = 0; i < length; i++) {
            if (((C0402) c0404.m3062(i)).f1898.m1645().mo3047().size() != 0) {
                C0243 c0243 = (C0243) c0215.f1331;
                c0243.getClass();
                HashSet hashSet = new HashSet(20);
                C0404 c0405 = (C0404) ((C0662) c0243.f1404).f2530;
                int length2 = c0405.f4836.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    InterfaceC3454 interfaceC3454Mo3047 = ((C0402) c0405.m3062(i2)).f1898.m1645().mo3047();
                    int size = interfaceC3454Mo3047.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hashSet.add(interfaceC3454Mo3047.getType(i3));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c1977.m3813((C3448) it.next());
                }
                this.f2768 = new C0575(c0215);
                break;
            }
        }
        C2308 c2309 = (C2308) c0215.f1330;
        c2309.getClass();
        HashSet hashSet2 = new HashSet(20);
        for (AbstractC0950 abstractC0950 : c2309.f7431) {
            if (abstractC0950 instanceof C0902) {
                hashSet2.add(((C0902) abstractC0950).f3345);
            } else if (abstractC0950 instanceof C2099) {
                C2099 c2099 = (C2099) abstractC0950;
                int i4 = 0;
                while (true) {
                    AbstractC0777[] abstractC0777Arr = c2099.f6917;
                    if (i4 < abstractC0777Arr.length) {
                        hashSet2.add(abstractC0777Arr[i4]);
                        i4++;
                    }
                }
            } else {
                if (abstractC0950 instanceof AbstractC1829) {
                    throw null;
                }
                boolean z = abstractC0950 instanceof AbstractC1830;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c1023.m2595((AbstractC0777) it2.next());
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5727;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1224(C1986 c1986, int i) {
        int iM1121;
        C1023 c1023 = c1986.f8534;
        C0094 c0094 = new C0094(6, c1023);
        C0215 c0215 = this.f2767;
        Iterator it = ((C2308) c0215.f1330).f7431.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                C0575 c0575 = this.f2768;
                if (c0575 != null) {
                    c0575.m1992();
                    C1977 c1977 = c1023.f3742;
                    int length2 = ((C0577) c0575.f2344).f4836.length;
                    c0575.f2346 = new TreeMap();
                    for (int i2 = 0; i2 < length2; i2++) {
                        ((TreeMap) c0575.f2346).put(((C0576) ((C0577) c0575.f2344).m3062(i2)).f2349, null);
                    }
                    if (((TreeMap) c0575.f2346).size() > 65535) {
                        throw new UnsupportedOperationException("too many catch handlers");
                    }
                    C0519 c0519 = new C0519();
                    c0575.f2342 = c0519.m1842(((TreeMap) c0575.f2346).size());
                    for (Map.Entry entry : ((TreeMap) c0575.f2346).entrySet()) {
                        C0574 c0574 = (C0574) entry.getKey();
                        Object[] objArr = c0574.f4836;
                        int length3 = objArr.length;
                        int length4 = objArr.length;
                        boolean zEquals = length4 == 0 ? false : ((C0573) c0574.m3062(length4 - 1)).f2338.equals(C0918.f3381);
                        entry.setValue(Integer.valueOf(c0519.f2196));
                        if (zEquals) {
                            c0519.m1841(-(length3 - 1));
                            length3--;
                        } else {
                            c0519.m1841(length3);
                        }
                        for (int i3 = 0; i3 < length3; i3++) {
                            C0573 c0573 = (C0573) c0574.m3062(i3);
                            c0519.m1842(c1977.m3806(c0573.f2338));
                            c0519.m1842(c0573.f2339);
                        }
                        if (zEquals) {
                            c0519.m1842(((C0573) c0574.m3062(length3)).f2339);
                        }
                    }
                    c0575.f2345 = c0519.m1836();
                    C0575 c0576 = this.f2768;
                    c0576.m1992();
                    length = (((C0577) c0576.f2344).f4836.length * 8) + ((byte[]) c0576.f2345).length;
                }
                c0215.m1247();
                int iM2445 = ((C0951) c0215.f1335).m2445();
                if ((iM2445 & 1) != 0) {
                    iM2445++;
                }
                m4153((iM2445 * 2) + 16 + length);
                return;
            }
            AbstractC0950 abstractC0950 = (AbstractC0950) it.next();
            if (abstractC0950 instanceof C0902) {
                C0902 c0902 = (C0902) abstractC0950;
                AbstractC0777 abstractC0777 = c0902.f3345;
                int iM1122 = c0094.m1121(abstractC0777);
                if (iM1122 >= 0) {
                    c0902.m2419(iM1122);
                }
                if ((abstractC0777 instanceof AbstractC0911) && (iM1121 = c0094.m1121(((AbstractC0911) abstractC0777).f3368)) >= 0) {
                    c0902.m2418(iM1121);
                }
            } else if (abstractC0950 instanceof C2099) {
                C2099 c2099 = (C2099) abstractC0950;
                while (true) {
                    AbstractC0777[] abstractC0777Arr = c2099.f6917;
                    if (length >= abstractC0777Arr.length) {
                        break;
                    }
                    AbstractC0777 abstractC0778 = abstractC0777Arr[length];
                    int iM1123 = c0094.m1121(abstractC0778);
                    if (iM1123 < 0) {
                        throw new IllegalArgumentException("index < 0");
                    }
                    int[] iArr = c2099.f6918;
                    if (iArr[length] != -1) {
                        throw new IllegalStateException("index already set");
                    }
                    iArr[length] = iM1123;
                    if (abstractC0778 instanceof AbstractC0911) {
                        int iM1124 = c0094.m1121(((AbstractC0911) abstractC0778).f3368);
                        if (iM1124 < 0) {
                            throw new IllegalArgumentException("index < 0");
                        }
                        if (c2099.f6919 != -1) {
                            throw new IllegalStateException("class index already set");
                        }
                        c2099.f6919 = iM1124;
                    }
                    length++;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        boolean z;
        int length;
        C0913 c0913;
        String string;
        int iM4797;
        boolean zM1833 = c0519.m1833();
        C0215 c0215 = this.f2767;
        c0215.m1247();
        int i = ((C0951) c0215.f1335).f3471;
        c0215.m1247();
        C0951 c0951 = (C0951) c0215.f1335;
        int length2 = c0951.f4836.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                C0913 c0914 = this.f2766;
                C2440 c2440 = c0914.f3330;
                if (!this.f2769) {
                    if (c0914.f3331 == null) {
                        c0914.f3331 = c2440.m4423(c0914.f3368.f3401);
                    }
                    c2440 = c0914.f3331;
                }
                int iM4798 = c2440.f7756.m4797();
                c0215.m1247();
                int iM2445 = ((C0951) c0215.f1335).m2445();
                z = (iM2445 & 1) != 0;
                C0575 c0575 = this.f2768;
                if (c0575 == null) {
                    length = 0;
                } else {
                    c0575.m1992();
                    length = ((C0577) c0575.f2344).f4836.length;
                }
                C0966 c0966 = this.f2771;
                int iM4150 = c0966 == null ? 0 : c0966.m4150();
                if (zM1833) {
                    c0519.m1831(0, m4151() + ' ' + c0914.mo1214());
                    c0519.m1831(2, "  registers_size: ".concat(AbstractC1460.m3223(i)));
                    c0519.m1831(2, "  ins_size:       ".concat(AbstractC1460.m3223(iM4798)));
                    c0519.m1831(2, "  outs_size:      ".concat(AbstractC1460.m3223(i3)));
                    c0519.m1831(2, "  tries_size:     ".concat(AbstractC1460.m3223(length)));
                    c0519.m1831(4, "  debug_off:      ".concat(AbstractC1460.m3224(iM4150)));
                    c0519.m1831(4, "  insns_size:     ".concat(AbstractC1460.m3224(iM2445)));
                    InterfaceC3454 interfaceC3454 = this.f2770;
                    if (interfaceC3454.size() != 0) {
                        StringBuilder sb = new StringBuilder("  throws ");
                        int size = interfaceC3454.size();
                        if (size == 0) {
                            string = "<empty>";
                            c0913 = c0914;
                        } else {
                            StringBuilder sb2 = new StringBuilder(100);
                            int i4 = 0;
                            while (i4 < size) {
                                C0913 c0915 = c0914;
                                if (i4 != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(interfaceC3454.getType(i4).mo1214());
                                i4++;
                                c0914 = c0915;
                            }
                            c0913 = c0914;
                            string = sb2.toString();
                        }
                        sb.append(string);
                        c0519.m1831(0, sb.toString());
                    } else {
                        zM1833 = zM1833;
                        c0913 = c0914;
                    }
                } else {
                    zM1833 = zM1833;
                    c0913 = c0914;
                }
                c0519.m1840(i);
                c0519.m1840(iM4798);
                c0519.m1840(i3);
                c0519.m1840(length);
                c0519.m1839(iM4150);
                c0519.m1839(iM2445);
                c0215.m1247();
                try {
                    ((C0951) c0215.f1335).m2446(c0519);
                    if (this.f2768 != null) {
                        if (z) {
                            if (zM1833) {
                                c0519.m1831(2, "  padding: 0");
                            }
                            c0519.m1840(0);
                        }
                        C0575 c0576 = this.f2768;
                        c0576.m1992();
                        if (c0519.m1833()) {
                            c0576.m1992();
                            int length3 = ((C0577) c0576.f2344).f4836.length;
                            c0519.m1831(0, "  tries:");
                            for (int i5 = 0; i5 < length3; i5++) {
                                C0576 c0577 = (C0576) ((C0577) c0576.f2344).m3062(i5);
                                C0574 c0574 = c0577.f2349;
                                StringBuilder sb3 = new StringBuilder("    try ");
                                int i6 = c0577.f2347;
                                sb3.append(i6 == ((char) i6) ? AbstractC1460.m3223(i6) : AbstractC1460.m3224(i6));
                                sb3.append("..");
                                int i7 = c0577.f2348;
                                sb3.append(i7 == ((char) i7) ? AbstractC1460.m3223(i7) : AbstractC1460.m3224(i7));
                                String string2 = sb3.toString();
                                String strM1981 = c0574.m1981("    ", "");
                                c0519.m1831(6, string2);
                                c0519.m1831(2, strM1981);
                            }
                            c0519.m1831(0, "  handlers:");
                            c0519.m1831(c0576.f2342, "    size: ".concat(AbstractC1460.m3223(((TreeMap) c0576.f2346).size())));
                            C0574 c0578 = null;
                            int i8 = 0;
                            for (Map.Entry entry : ((TreeMap) c0576.f2346).entrySet()) {
                                C0574 c0579 = (C0574) entry.getKey();
                                int iIntValue = ((Integer) entry.getValue()).intValue();
                                if (c0578 != null) {
                                    c0519.m1831(iIntValue - i8, c0578.m1981("    ", AbstractC1460.m3223(i8).concat(": ")));
                                }
                                i8 = iIntValue;
                                c0578 = c0579;
                            }
                            c0519.m1831(((byte[]) c0576.f2345).length - i8, c0578.m1981("    ", AbstractC1460.m3223(i8).concat(": ")));
                        }
                        int length4 = ((C0577) c0576.f2344).f4836.length;
                        for (int i9 = 0; i9 < length4; i9++) {
                            C0576 c05710 = (C0576) ((C0577) c0576.f2344).m3062(i9);
                            int i10 = c05710.f2347;
                            int i11 = c05710.f2348;
                            int i12 = i11 - i10;
                            if (i12 >= 65536) {
                                throw new UnsupportedOperationException("bogus exception range: " + AbstractC1460.m3224(i10) + ".." + AbstractC1460.m3224(i11));
                            }
                            c0519.m1839(i10);
                            c0519.m1840(i12);
                            c0519.m1840(((Integer) ((TreeMap) c0576.f2346).get(c05710.f2349)).intValue());
                        }
                        c0519.m1837((byte[]) c0576.f2345);
                    }
                    if (!zM1833 || this.f2771 == null) {
                        return;
                    }
                    c0519.m1831(0, "  debug info");
                    this.f2771.m2468(c1023, "    ", c0519, false);
                    return;
                } catch (RuntimeException e) {
                    throw C1238.m2884("...while writing instructions for " + c0913.mo1214(), e);
                }
            }
            AbstractC0950 abstractC0950 = (AbstractC0950) c0951.m3062(i2);
            if (abstractC0950 instanceof C0902) {
                AbstractC0777 abstractC0777 = ((C0902) abstractC0950).f3345;
                if (abstractC0777 instanceof AbstractC0891) {
                    AbstractC0891 abstractC0891 = (AbstractC0891) abstractC0777;
                    z = abstractC0950.f3468.f3927 == 113;
                    C2440 c2441 = abstractC0891.f3330;
                    if (!z) {
                        if (abstractC0891.f3331 == null) {
                            abstractC0891.f3331 = c2441.m4423(abstractC0891.f3368.f3401);
                        }
                        c2441 = abstractC0891.f3331;
                    }
                    iM4797 = c2441.f7756.m4797();
                } else {
                    iM4797 = abstractC0777 instanceof C0895 ? ((C0895) abstractC0777).f3335.f3359.f7756.m4797() : 0;
                }
            } else {
                if (!(abstractC0950 instanceof C2099)) {
                    continue;
                } else {
                    if (abstractC0950.f3468.f3927 != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM4797 = 1 + ((C0915) ((C2099) abstractC0950).f6917[1]).f3376.f7756.m4797();
                }
                i2++;
            }
            if (iM4797 > i3) {
                i3 = iM4797;
            }
            i2++;
        }
    }
}
