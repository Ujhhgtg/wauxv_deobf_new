package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᛸᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2650 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0776 f8364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0253 f8365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0519 f8366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2136 f8367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f8368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int[] f8369 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f8370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f8371;

    public C2650(C0776 c0776, int i, C0561 c0561) {
        this.f8364 = c0776;
        this.f8365 = new C0253(c0776);
        this.f8370 = i;
        boolean[] zArr = {true};
        C0379 c0379 = (C0379) c0776.f2879;
        C0784 c0784 = new C0784(zArr, c0379.m1702(), i);
        int length = c0379.f4833.length;
        for (int i2 = 0; i2 < length; i2++) {
            C0417 c0417 = ((C0377) c0379.m3165(i2)).f1870;
            int length2 = c0417.f4833.length;
            for (int i3 = 0; i3 < length2; i3++) {
                ((AbstractC1663) c0417.m3165(i3)).mo3149(c0784);
            }
        }
        boolean z = zArr[0];
        this.f8371 = z;
        Object[] objArr = c0379.f4833;
        int length3 = objArr.length * 3;
        int length4 = objArr.length;
        int length5 = 0;
        for (int i4 = 0; i4 < length4; i4++) {
            C0377 c0377 = (C0377) c0379.f4833[i4];
            if (c0377 != null) {
                length5 += c0377.f1870.f4833.length;
            }
        }
        int i5 = length5 + length3;
        int iM1702 = c0379.m1702() + (z ? 0 : i);
        this.f8368 = iM1702;
        C0519 c0519 = new C0519(c0561, i5, length3, iM1702, i);
        this.f8366 = c0519;
        this.f8367 = new C2136(this, c0519);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2582 m4631(AbstractC1663 abstractC1663, C2581 c2581) {
        C2582 c2582M4569 = abstractC1663.f5626;
        int i = abstractC1663.f5623.f8356;
        if (i != 14 && i != 16) {
            switch (i) {
                case 20:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                    if (c2582M4569.f4833.length == 2) {
                        c2582M4569 = C2582.m4569((C2581) c2582M4569.m3165(1), (C2581) c2582M4569.m3165(0));
                    }
                    break;
            }
        } else if (c2582M4569.f4833.length == 2 && c2581.f8205 == ((C2581) c2582M4569.m3165(1)).f8205) {
            c2582M4569 = C2582.m4569((C2581) c2582M4569.m3165(1), (C2581) c2582M4569.m3165(0));
        }
        if (c2581 == null) {
            return c2582M4569;
        }
        int length = c2582M4569.f4833.length;
        C2582 c2582 = new C2582(length + 1);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            c2582.m3166(i3, c2582M4569.m3165(i2));
            i2 = i3;
        }
        c2582.m3166(0, c2581);
        if (!c2582M4569.f7068) {
            c2582.f7068 = false;
        }
        return c2582;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0225 m4632(C0776 c0776, int i, C0561 c0561) {
        int i2;
        int i3;
        C0377 c0377M1703;
        int iM3548;
        C1676 c1676;
        int i4 = c0776.f2878;
        C2650 c2650 = new C2650(c0776, i, c0561);
        C0379 c0379 = (C0379) c0776.f2879;
        int length = c0379.f4833.length;
        int iM3658 = c0379.m3658();
        int[] iArrM3279 = AbstractC1467.m3279(iM3658);
        int[] iArrM32710 = AbstractC1467.m3279(iM3658);
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC1467.m3287(iArrM3279, ((C0377) c0379.m3165(i5)).f1869);
        }
        int[] iArr = new int[length];
        int iM3270 = i4;
        int i6 = 0;
        while (iM3270 != -1) {
            while (true) {
                if (((C1676) c0776.f2881) == null) {
                    int iM3659 = c0379.m3658();
                    C1676[] c1676Arr = new C1676[iM3659];
                    C1676 c1677 = new C1676(10);
                    int i7 = 0;
                    for (int length2 = c0379.f4833.length; i7 < length2; length2 = length2) {
                        C0377 c0377 = (C0377) c0379.m3165(i7);
                        int i8 = i4;
                        int i9 = c0377.f1869;
                        C1676 c1678 = c0377.f1871;
                        int i10 = i7;
                        int i11 = c1678.f5648;
                        if (i11 == 0) {
                            c1677.m3546(i9);
                        } else {
                            int i12 = 0;
                            while (i12 < i11) {
                                int iM3549 = c1678.m3548(i12);
                                C1676 c1679 = c1676Arr[iM3549];
                                int i13 = i11;
                                if (c1679 == null) {
                                    c1676 = new C1676(10);
                                    c1676Arr[iM3549] = c1676;
                                } else {
                                    c1676 = c1679;
                                }
                                c1676.m3546(i9);
                                i12++;
                                i11 = i13;
                            }
                        }
                        i7 = i10 + 1;
                        i4 = i8;
                    }
                    i2 = i4;
                    for (int i14 = 0; i14 < iM3659; i14++) {
                        C1676 c16710 = c1676Arr[i14];
                        if (c16710 != null) {
                            c16710.m3552();
                            c16710.f7068 = false;
                        }
                    }
                    c1677.m3552();
                    c1677.f7068 = false;
                    if (c1676Arr[i2] == null) {
                        c1676Arr[i2] = C1676.f5646;
                    }
                    c0776.f2880 = c1676Arr;
                    c0776.f2881 = c1677;
                } else {
                    i2 = i4;
                }
                C1676 c16711 = ((C1676[]) c0776.f2880)[iM3270];
                if (c16711 == null) {
                    throw new RuntimeException("no such block: ".concat(AbstractC2902.m4906(iM3270)));
                }
                int i15 = c16711.f5648;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        break;
                    }
                    iM3548 = c16711.m3548(i16);
                    if (AbstractC1467.m3271(iArrM32710, iM3548)) {
                        break;
                    }
                    if (AbstractC1467.m3271(iArrM3279, iM3548) && c0379.m1703(iM3548).f1872 == iM3270) {
                        break;
                    }
                    i16++;
                }
                AbstractC1467.m3287(iArrM32710, iM3548);
                iM3270 = iM3548;
                i4 = i2;
            }
            int i17 = -1;
            while (iM3270 != i17) {
                AbstractC1467.m3265(iArrM3279, iM3270);
                AbstractC1467.m3265(iArrM32710, iM3270);
                iArr[i6] = iM3270;
                i6++;
                C0377 c0377M1704 = c0379.m1703(iM3270);
                C1676 c16712 = c0377M1704.f1871;
                int i18 = c0377M1704.f1872;
                int i19 = c16712.f5648;
                if (i19 == 0) {
                    i3 = -1;
                    c0377M1703 = null;
                } else if (i19 != 1) {
                    i3 = -1;
                    c0377M1703 = i18 != -1 ? c0379.m1703(i18) : c0379.m1703(c16712.m3548(0));
                } else {
                    i3 = -1;
                    c0377M1703 = c0379.m1703(c16712.m3548(0));
                }
                if (c0377M1703 == null) {
                    break;
                }
                int i20 = c0377M1703.f1869;
                if (AbstractC1467.m3271(iArrM3279, i20)) {
                    i18 = i20;
                } else if (i18 == i20 || i18 < 0 || !AbstractC1467.m3271(iArrM3279, i18)) {
                    int i21 = c16712.f5648;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= i21) {
                            i18 = i3;
                            break;
                        }
                        int iM35410 = c16712.m3548(i22);
                        if (AbstractC1467.m3271(iArrM3279, iM35410)) {
                            i18 = iM35410;
                            break;
                        }
                        i22++;
                    }
                }
                int i23 = i3;
                iM3270 = i18;
                i17 = i23;
            }
            iM3270 = AbstractC1467.m3270(iArrM3279, 0);
            i4 = i2;
        }
        int i24 = -1;
        if (i6 != length) {
            throw new RuntimeException("shouldn't happen");
        }
        c2650.f8369 = iArr;
        int i25 = 0;
        while (true) {
            C0519 c0519 = c2650.f8366;
            C0253 c0253 = c2650.f8365;
            if (i25 >= length) {
                C0253 c0254 = new C0253(c0776, c2650.f8369, c0253);
                C2341 c2341 = (C2341) c0519.f2208;
                ArrayList arrayList = (ArrayList) c0519.f2209;
                if (arrayList == null) {
                    throw new UnsupportedOperationException("already processed");
                }
                int size = arrayList.size();
                for (int i26 = 0; i26 < size; i26++) {
                    c2341.m4295((AbstractC0953) ((ArrayList) c0519.f2209).get(i26));
                }
                c0519.f2209 = null;
                C0225 c0225 = new C0225();
                if (c2341 == null) {
                    throw new NullPointerException("unprocessedInsns == null");
                }
                c0225.f1404 = c2341;
                c0225.f1405 = c0254;
                c0225.f1406 = null;
                c0225.f1407 = null;
                c0225.f1408 = null;
                c0225.f1409 = null;
                return c0225;
            }
            int i27 = i25 + 1;
            int i28 = i27 == length ? i24 : iArr[i27];
            C0377 c0377M1705 = c0379.m1703(iArr[i25]);
            C0729[] c0729Arr = (C0729[]) c0253.f1478;
            int i29 = c0377M1705.f1869;
            int i30 = c0377M1705.f1872;
            C0417 c0417 = c0377M1705.f1870;
            C0729 c0729 = c0729Arr[i29];
            C2341 c2342 = (C2341) c0519.f2208;
            C2341 c2343 = (C2341) c0519.f2208;
            c2342.m4295(c0729);
            C0729 c07210 = ((C0729[]) c0253.f1479)[i29];
            C2136 c2136 = c2650.f8367;
            c2136.f7060 = c0377M1705;
            c2136.f7061 = c07210;
            int length3 = c0417.f4833.length;
            C0379 c03710 = c0379;
            for (int i31 = 0; i31 < length3; i31++) {
                ((AbstractC1663) c0417.m3165(i31)).mo3149(c2136);
            }
            c2343.m4295(((C0729[]) c0253.f1480)[i29]);
            AbstractC1663 abstractC1663M1751 = c0417.m1751();
            if (i30 >= 0 && i30 != i28) {
                if (abstractC1663M1751.f5623.f8360 == 4) {
                    C1676 c16713 = c0377M1705.f1871;
                    if (c16713.f5648 != 2) {
                        throw new UnsupportedOperationException("block doesn't have exactly two successors");
                    }
                    int iM35411 = c16713.m3548(0);
                    if (iM35411 == i30) {
                        iM35411 = c16713.m3548(1);
                    }
                    if (iM35411 == i28) {
                        C0729 c07211 = c0729Arr[i30];
                        int size2 = c2343.f7553.size() - 2;
                        try {
                            c2343.f7553.set(size2, ((C2955) c2343.f7553.get(size2)).m4967(c07211));
                        } catch (ClassCastException unused) {
                            throw new IllegalArgumentException("non-reversible instruction");
                        } catch (IndexOutOfBoundsException unused2) {
                            throw new IllegalArgumentException("too few instructions");
                        }
                    }
                }
                c2343.m4295(new C2955(AbstractC1096.f3976, abstractC1663M1751.f5624, C2582.f8208, c0729Arr[i30]));
            }
            i25 = i27;
            c0379 = c03710;
            i24 = -1;
        }
    }
}
