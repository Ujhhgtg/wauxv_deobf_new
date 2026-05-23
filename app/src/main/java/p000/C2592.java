package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2592 {

    public final C0662 f8212;

    public final C0243 f8213;

    public final C0542 f8214;

    public final C2103 f8215;

    public final int f8216;

    public int[] f8217 = null;

    public final int f8218;

    public final boolean f8219;

    public C2592(C0662 c0662, int i, C0580 c0580) {
        this.f8212 = c0662;
        this.f8213 = new C0243(c0662);
        this.f8218 = i;
        boolean[] zArr = {true};
        C0404 c0404 = (C0404) c0662.f2530;
        C0785 c0785 = new C0785(zArr, c0404.m1596(), i);
        int length = c0404.f4836.length;
        for (int i2 = 0; i2 < length; i2++) {
            C0442 c0442 = ((C0402) c0404.m3062(i2)).f1898;
            int length2 = c0442.f4836.length;
            for (int i3 = 0; i3 < length2; i3++) {
                ((AbstractC1649) c0442.m3062(i3)).mo3046(c0785);
            }
        }
        boolean z = zArr[0];
        this.f8219 = z;
        Object[] objArr = c0404.f4836;
        int length3 = objArr.length * 3;
        int length4 = objArr.length;
        int length5 = 0;
        for (int i4 = 0; i4 < length4; i4++) {
            C0402 c0402 = (C0402) c0404.f4836[i4];
            if (c0402 != null) {
                length5 += c0402.f1898.f4836.length;
            }
        }
        int i5 = length5 + length3;
        int iM1596 = c0404.m1596() + (z ? 0 : i);
        this.f8216 = iM1596;
        C0542 c0542 = new C0542(c0580, i5, length3, iM1596, i);
        this.f8214 = c0542;
        this.f8215 = new C2103(this, c0542);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public static C2526 m4601(AbstractC1649 abstractC1649, C2525 c2525) {
        C2526 c2526M4547 = abstractC1649.f5591;
        int i = abstractC1649.f5588.f8204;
        if (i != 14 && i != 16) {
            switch (i) {
                case 20:
                case 21 /* 21 */:
                case 22 /* 22 */:
                    if (c2526M4547.f4836.length == 2) {
                        c2526M4547 = C2526.m4547((C2525) c2526M4547.m3062(1), (C2525) c2526M4547.m3062(0));
                    }
                    break;
            }
        } else if (c2526M4547.f4836.length == 2 && c2525.f8055 == ((C2525) c2526M4547.m3062(1)).f8055) {
            c2526M4547 = C2526.m4547((C2525) c2526M4547.m3062(1), (C2525) c2526M4547.m3062(0));
        }
        if (c2525 == null) {
            return c2526M4547;
        }
        int length = c2526M4547.f4836.length;
        C2526 c2526 = new C2526(length + 1);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            c2526.m3063(i3, c2526M4547.m3062(i2));
            i2 = i3;
        }
        c2526.m3063(0, c2525);
        if (!c2526M4547.f6944) {
            c2526.f6944 = false;
        }
        return c2526;
    }

    public static C0215 m4602(C0662 c0662, int i, C0580 c0580) {
        int i2;
        int i3;
        C0402 c0402M1597;
        int iM3384;
        C1660 c1660;
        int i4 = c0662.f2529;
        C2592 c2592 = new C2592(c0662, i, c0580);
        C0404 c0404 = (C0404) c0662.f2530;
        int length = c0404.f4836.length;
        int iM3506 = c0404.m3506();
        int[] iArrM3302 = AbstractC1574.m3302(iM3506);
        int[] iArrM3303 = AbstractC1574.m3302(iM3506);
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC1574.m3310(iArrM3302, ((C0402) c0404.m3062(i5)).f1897);
        }
        int[] iArr = new int[length];
        int iM3296 = i4;
        int i6 = 0;
        while (iM3296 != -1) {
            while (true) {
                if (((C1660) c0662.f2532) == null) {
                    int iM3507 = c0404.m3506();
                    C1660[] c1660Arr = new C1660[iM3507];
                    C1660 c1661 = new C1660(10);
                    int i7 = 0;
                    for (int length2 = c0404.f4836.length; i7 < length2; length2 = length2) {
                        C0402 c0402 = (C0402) c0404.m3062(i7);
                        int i8 = i4;
                        int i9 = c0402.f1897;
                        C1660 c1662 = c0402.f1899;
                        int i10 = i7;
                        int i11 = c1662.f5610;
                        if (i11 == 0) {
                            c1661.m3382(i9);
                        } else {
                            int i12 = 0;
                            while (i12 < i11) {
                                int iM3385 = c1662.m3384(i12);
                                C1660 c1663 = c1660Arr[iM3385];
                                int i13 = i11;
                                if (c1663 == null) {
                                    c1660 = new C1660(10);
                                    c1660Arr[iM3385] = c1660;
                                } else {
                                    c1660 = c1663;
                                }
                                c1660.m3382(i9);
                                i12++;
                                i11 = i13;
                            }
                        }
                        i7 = i10 + 1;
                        i4 = i8;
                    }
                    i2 = i4;
                    for (int i14 = 0; i14 < iM3507; i14++) {
                        C1660 c1664 = c1660Arr[i14];
                        if (c1664 != null) {
                            c1664.m3388();
                            c1664.f6944 = false;
                        }
                    }
                    c1661.m3388();
                    c1661.f6944 = false;
                    if (c1660Arr[i2] == null) {
                        c1660Arr[i2] = C1660.f5608;
                    }
                    c0662.f2531 = c1660Arr;
                    c0662.f2532 = c1661;
                } else {
                    i2 = i4;
                }
                C1660 c1665 = ((C1660[]) c0662.f2531)[iM3296];
                if (c1665 == null) {
                    throw new RuntimeException("no such block: ".concat(AbstractC1460.m3223(iM3296)));
                }
                int i15 = c1665.f5610;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        break;
                    }
                    iM3384 = c1665.m3384(i16);
                    if (AbstractC1574.m3297(iArrM3303, iM3384)) {
                        break;
                    }
                    if (AbstractC1574.m3297(iArrM3302, iM3384) && c0404.m1597(iM3384).f1900 == iM3296) {
                        break;
                    }
                    i16++;
                }
                AbstractC1574.m3310(iArrM3303, iM3384);
                iM3296 = iM3384;
                i4 = i2;
            }
            int i17 = -1;
            while (iM3296 != i17) {
                AbstractC1574.m3290(iArrM3302, iM3296);
                AbstractC1574.m3290(iArrM3303, iM3296);
                iArr[i6] = iM3296;
                i6++;
                C0402 c0402M1598 = c0404.m1597(iM3296);
                C1660 c1666 = c0402M1598.f1899;
                int i18 = c0402M1598.f1900;
                int i19 = c1666.f5610;
                if (i19 == 0) {
                    i3 = -1;
                    c0402M1597 = null;
                } else if (i19 != 1) {
                    i3 = -1;
                    c0402M1597 = i18 != -1 ? c0404.m1597(i18) : c0404.m1597(c1666.m3384(0));
                } else {
                    i3 = -1;
                    c0402M1597 = c0404.m1597(c1666.m3384(0));
                }
                if (c0402M1597 == null) {
                    break;
                }
                int i20 = c0402M1597.f1897;
                if (AbstractC1574.m3297(iArrM3302, i20)) {
                    i18 = i20;
                } else if (i18 == i20 || i18 < 0 || !AbstractC1574.m3297(iArrM3302, i18)) {
                    int i21 = c1666.f5610;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= i21) {
                            i18 = i3;
                            break;
                        }
                        int iM3386 = c1666.m3384(i22);
                        if (AbstractC1574.m3297(iArrM3302, iM3386)) {
                            i18 = iM3386;
                            break;
                        }
                        i22++;
                    }
                }
                int i23 = i3;
                iM3296 = i18;
                i17 = i23;
            }
            iM3296 = AbstractC1574.m3296(iArrM3302, 0);
            i4 = i2;
        }
        int i24 = -1;
        if (0 != length) {
            throw new RuntimeException("shouldn't happen");
        }
        c2592.f8217 = iArr;
        int i25 = 0;
        while (true) {
            C0542 c0542 = c2592.f8214;
            C0243 c0243 = c2592.f8213;
            if (true) {
                C0243 c0244 = new C0243(c0662, c2592.f8217, c0243);
                C2308 c2308 = (C2308) c0542.f2252;
                ArrayList arrayList = (ArrayList) c0542.f2253;
                if (arrayList == null) {
                    throw new UnsupportedOperationException("already processed");
                }
                int size = arrayList.size();
                for (int i26 = 0; i26 < size; i26++) {
                    c2308.m4166((AbstractC0950) ((ArrayList) c0542.f2253).get(i26));
                }
                c0542.f2253 = null;
                C0215 c0215 = new C0215();
                if (c2308 == null) {
                    throw new NullPointerException("unprocessedInsns == null");
                }
                c0215.f1330 = c2308;
                c0215.f1331 = c0244;
                c0215.f1332 = null;
                c0215.f1333 = null;
                c0215.f1334 = null;
                c0215.f1335 = null;
                return c0215;
            }
            int i27 = i25 + 1;
            int i28 = i27 == length ? i24 : iArr[i27];
            C0402 c0402M1599 = c0404.m1597(iArr[i25]);
            C0734[] c0734Arr = (C0734[]) c0243.f1404;
            int i29 = c0402M1599.f1897;
            int i30 = c0402M1599.f1900;
            C0442 c0442 = c0402M1599.f1898;
            C0734 c0734 = c0734Arr[i29];
            C2308 c2309 = (C2308) c0542.f2252;
            C2308 c23010 = (C2308) c0542.f2252;
            c2309.m4166(c0734);
            C0734 c0735 = ((C0734[]) c0243.f1405)[i29];
            C2103 c2103 = c2592.f8215;
            c2103.f6936 = c0402M1599;
            c2103.f6937 = c0735;
            int length3 = c0442.f4836.length;
            C0404 c0405 = c0404;
            for (int i31 = 0; i31 < length3; i31++) {
                ((AbstractC1649) c0442.m3062(i31)).mo3046(c2103);
            }
            c23010.m4166(((C0734[]) c0243.f1406)[i29]);
            AbstractC1649 abstractC1649M1645 = c0442.m1645();
            if (i30 >= 0 && i30 != i28) {
                if (abstractC1649M1645.f5588.f8208 == 4) {
                    C1660 c1667 = c0402M1599.f1899;
                    if (c1667.f5610 != 2) {
                        throw new UnsupportedOperationException("block doesn't have exactly two successors");
                    }
                    int iM3387 = c1667.m3384(0);
                    if (iM3387 == i30) {
                        iM3387 = c1667.m3384(1);
                    }
                    if (iM3387 == i28) {
                        C0734 c0736 = c0734Arr[i30];
                        int size2 = c23010.f7431.size() - 2;
                        try {
                            c23010.f7431.set(size2, ((C2896) c23010.f7431.get(size2)).m4905(c0736));
                        } catch (ClassCastException unused) {
                            throw new IllegalArgumentException("non-reversible instruction");
                        } catch (IndexOutOfBoundsException unused2) {
                            throw new IllegalArgumentException("too few instructions");
                        }
                    }
                }
                c23010.m4166(new C2896(AbstractC1090.f3965, abstractC1649M1645.f5589, C2526.f8058, c0734Arr[i30]));
            }
            i25 = i27;
            c0404 = c0405;
            i24 = -1;
        }
    }
}
