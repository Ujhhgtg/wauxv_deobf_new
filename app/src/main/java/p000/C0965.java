package p000;

import com.umeng.analytics.pro.bv;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2383 f3493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1828 f3494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1023 f3496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3497;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f3498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2440 f3499;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f3500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0519 f3503;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f3504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C1827[] f3506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f3501 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f3502 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0519 f3495 = new C0519();

    public C0965(C2383 c2383, C1828 c1828, C1023 c1023, int i, int i2, boolean z, C0913 c0913) {
        this.f3493 = c2383;
        this.f3494 = c1828;
        this.f3496 = c1023;
        this.f3499 = c0913.f3330;
        this.f3500 = z;
        this.f3497 = i;
        this.f3498 = i2;
        this.f3506 = new C1827[i2];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m2458(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return AbstractC2784.m4736(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m2459(C1827 c1827) {
        StringBuilder sb = new StringBuilder("v");
        C2525 c2525 = c1827.f6112;
        sb.append(c2525.f8055);
        sb.append(' ');
        C0917 c0917 = c2525.f8057.f6108;
        if (c0917 == null) {
            sb.append("null");
        } else {
            sb.append(c0917.mo1214());
        }
        sb.append(' ');
        C0918 c0918 = c1827.f6113;
        if (c0918 == null) {
            sb.append("null");
        } else {
            sb.append(c0918.f3401.mo1214());
        }
        C0917 c0917M3585 = c1827.m3585();
        if (c0917M3585 != null) {
            sb.append(' ');
            sb.append(c0917M3585.mo1214());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2460(int i, String str) {
        if (this.f3504 != null) {
            str = AbstractC2784.m4752(new StringBuilder(), this.f3504, str);
        }
        C0519 c0519 = this.f3503;
        if (c0519 != null) {
            if (!this.f3505) {
                i = 0;
            }
            c0519.m1831(i, str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final byte[] m2461() {
        C1023 c1023;
        C1827 c1827;
        C2383 c2383 = this.f3493;
        int length = c2383 == null ? 0 : c2383.f4836.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add((C2382) c2383.m3062(i));
        }
        Collections.sort(arrayList, new C0171(3));
        C2440 c2440 = this.f3499;
        ArrayList<C1827> arrayList2 = new ArrayList(c2440.f7756.f4836.length);
        int iM4797 = c2440.f7756.m4797();
        int i2 = this.f3498;
        boolean z = this.f3500;
        int i3 = (i2 - iM4797) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C1828 c1828 = this.f3494;
        int length2 = c1828.f4836.length;
        for (int i4 = 0; i4 < length2; i4++) {
            C1827 c1829 = (C1827) c1828.m3062(i4);
            int i5 = c1829.f6112.f8055;
            if (i5 >= i3) {
                int i6 = i5 - i3;
                if (!bitSet.get(i6)) {
                    bitSet.set(i6);
                    arrayList2.add(c1829);
                }
            }
        }
        Collections.sort(arrayList2, new C0171(4));
        boolean z2 = this.f3503 != null;
        C0519 c0519 = this.f3495;
        int i7 = c0519.f2196;
        if (arrayList.size() > 0) {
            this.f3502 = ((C2382) arrayList.get(0)).f7643.f8907;
        }
        c0519.m1842(this.f3502);
        if (z2) {
            m2460(c0519.f2196 - i7, "line_start: " + this.f3502);
        }
        int iM4798 = (i2 - c2440.f7756.m4797()) - (!z ? 1 : 0);
        C2819 c2819 = c2440.f7756;
        int length3 = c2819.f4836.length;
        C1827[] c1827Arr = this.f3506;
        if (!z) {
            for (C1827 c18210 : arrayList2) {
                if (iM4798 == c18210.f6112.f8055) {
                    c1827Arr[iM4798] = c18210;
                    break;
                }
            }
            iM4798++;
        }
        int i8 = c0519.f2196;
        c0519.m1842(length3);
        if (z2) {
            m2460(c0519.f2196 - i8, String.format("parameters_size: %04x", Integer.valueOf(length3)));
        }
        for (int i9 = 0; i9 < length3; i9++) {
            C3448 c3448 = (C3448) c2819.m3062(i9);
            int i10 = c0519.f2196;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1827 = null;
                    break;
                }
                c1827 = (C1827) it.next();
                if (iM4798 == c1827.f6112.f8055) {
                    if (c1827.m3585() != null) {
                        m2466(null);
                    } else {
                        m2466(c1827.f6112.f8057.f6108);
                    }
                    c1827Arr[iM4798] = c1827;
                    break;
                }
            }
            if (c1827 == null) {
                m2466(null);
            }
            if (z2) {
                m2460(c0519.f2196 - i10, "parameter " + ((c1827 == null || c1827.m3585() != null) ? "<unnamed>" : c1827.f6112.f8057.f6108.mo1214()) + " v" + iM4798);
            }
            iM4798 += c3448.m4966();
        }
        for (C1827 c18211 : c1827Arr) {
            if (c18211 != null && c18211.m3585() != null) {
                m2464(c18211);
            }
        }
        c0519.m1838(7);
        if (this.f3503 != null) {
            m2460(1, String.format("%04x: prologue end", Integer.valueOf(this.f3501)));
        }
        int size = arrayList.size();
        int length4 = c1828.f4836.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length5 = c1828.f4836.length;
            while (i11 < length5 && ((C1827) c1828.m3062(i11)).f6110 == this.f3501) {
                int i13 = i11 + 1;
                C1827 c18212 = (C1827) c1828.m3062(i11);
                C2525 c2525 = c18212.f6112;
                int i14 = c2525.f8055;
                C1827 c18213 = c1827Arr[i14];
                if (c18212 != c18213) {
                    c1827Arr[i14] = c18212;
                    int i15 = c18212.f6111;
                    if (i15 == 1) {
                        if (c18213 != null && c2525.m4539(c18213.f6112)) {
                            if (c18213.f6111 == 1) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int i16 = c0519.f2196;
                            c0519.m1838(6);
                            m2467(i14);
                            if (this.f3503 != null) {
                                m2460(c0519.f2196 - i16, String.format("%04x: +local restart %s", Integer.valueOf(this.f3501), m2459(c18212)));
                            }
                        } else if (c18212.m3585() != null) {
                            m2464(c18212);
                        } else {
                            int i17 = c0519.f2196;
                            c0519.m1838(3);
                            m2467(i14);
                            m2466(c2525.f8057.f6108);
                            C0918 c0918 = c18212.f6113;
                            if (false || (c1023 = this.f3496) == null) {
                                c0519.m1842(0);
                            } else {
                                c0519.m1842(c1023.f3742.m3806(c0918) + 1);
                            }
                            if (this.f3503 != null) {
                                m2460(c0519.f2196 - i17, String.format("%04x: +local %s", Integer.valueOf(this.f3501), m2459(c18212)));
                            }
                        }
                    } else if (i15 != 3) {
                        int i18 = c0519.f2196;
                        c0519.m1838(5);
                        c0519.m1842(i14);
                        if (this.f3503 != null) {
                            m2460(c0519.f2196 - i18, String.format("%04x: -local %s", Integer.valueOf(this.f3501), m2459(c18212)));
                        }
                    }
                }
                i11 = i13;
            }
            int size2 = arrayList.size();
            while (i12 < size2 && ((C2382) arrayList.get(i12)).f7642 == this.f3501) {
                m2465((C2382) arrayList.get(i12));
                i12++;
            }
            int i19 = i11 < length4 ? ((C1827) c1828.m3062(i11)).f6110 : 2147483647;
            int i20 = i12 < size ? ((C2382) arrayList.get(i12)).f7642 : 2147483647;
            int iMin = Math.min(i20, i19);
            if (iMin == 2147483647 || (false)) {
                break;
            }
            if (iMin == i20) {
                m2465((C2382) arrayList.get(i12));
                i12++;
            } else {
                m2463(iMin - this.f3501);
            }
        }
        c0519.m1838(0);
        if (this.f3503 != null) {
            m2460(1, "end sequence");
        }
        return c0519.m1836();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2462(int i) {
        C0519 c0519 = this.f3495;
        int i2 = c0519.f2196;
        c0519.m1838(2);
        c0519.m1841(i);
        int i3 = this.f3502 + i;
        this.f3502 = i3;
        if (this.f3503 == null) {
            return;
        }
        m2460(c0519.f2196 - i2, String.format("line = %d", Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2463(int i) {
        C0519 c0519 = this.f3495;
        int i2 = c0519.f2196;
        c0519.m1838(1);
        c0519.m1842(i);
        int i3 = this.f3501 + i;
        this.f3501 = i3;
        if (this.f3503 == null) {
            return;
        }
        m2460(c0519.f2196 - i2, String.format("%04x: advance pc", Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2464(C1827 c1827) {
        C1023 c1023;
        C0519 c0519 = this.f3495;
        int i = c0519.f2196;
        c0519.m1838(4);
        C2525 c2525 = c1827.f6112;
        m2467(c2525.f8055);
        m2466(c2525.f8057.f6108);
        C0918 c0918 = c1827.f6113;
        if (false || (c1023 = this.f3496) == null) {
            c0519.m1842(0);
        } else {
            c0519.m1842(c1023.f3742.m3806(c0918) + 1);
        }
        m2466(c1827.m3585());
        if (this.f3503 == null) {
            return;
        }
        m2460(c0519.f2196 - i, String.format("%04x: +localx %s", Integer.valueOf(this.f3501), m2459(c1827)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2465(C2382 c2382) {
        int i = c2382.f7643.f8907;
        int i2 = c2382.f7642;
        int i3 = i - this.f3502;
        int i4 = i2 - this.f3501;
        if (i4 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        int i5 = 0;
        if (i3 < -4 || i3 > 10) {
            m2462(i3);
            i3 = 0;
        }
        int iM2458 = m2458(i3, i4);
        if ((iM2458 & (-256)) > 0) {
            m2463(i4);
            iM2458 = m2458(i3, 0);
            if ((iM2458 & (-256)) > 0) {
                m2462(i3);
                iM2458 = m2458(0, 0);
                i4 = 0;
            } else {
                i4 = 0;
                i5 = i3;
            }
        } else {
            i5 = i3;
        }
        this.f3495.m1838(iM2458);
        this.f3502 += i5;
        int i6 = this.f3501 + i4;
        this.f3501 = i6;
        if (this.f3503 == null) {
            return;
        }
        m2460(1, String.format("%04x: line %d", Integer.valueOf(i6), Integer.valueOf(this.f3502)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2466(C0917 c0917) {
        C1023 c1023;
        C0519 c0519 = this.f3495;
        if (c0917 == null || (c1023 = this.f3496) == null) {
            c0519.m1842(0);
        } else {
            c0519.m1842(c1023.f3741.m3805(c0917) + 1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2467(int i) {
        if (i < 0) {
            throw new RuntimeException(AbstractC1194.m2779(i, "Signed value where unsigned required: "));
        }
        this.f3495.m1842(i);
    }
}
