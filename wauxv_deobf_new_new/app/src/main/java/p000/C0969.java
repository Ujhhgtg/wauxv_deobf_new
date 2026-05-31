package p000;

import com.umeng.analytics.pro.bv;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᛸᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0969 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2436 f3510;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1855 f3511;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1026 f3513;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f3515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2492 f3516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f3517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0496 f3520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f3521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f3522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C1854[] f3523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f3518 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f3519 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0496 f3512 = new C0496();

    public C0969(C2436 c2436, C1855 c1855, C1026 c1026, int i, int i2, boolean z, C0912 c0912) {
        this.f3510 = c2436;
        this.f3511 = c1855;
        this.f3513 = c1026;
        this.f3516 = c0912.f3337;
        this.f3517 = z;
        this.f3514 = i;
        this.f3515 = i2;
        this.f3523 = new C1854[i2];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m2577(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return AbstractC2844.m4770(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m2578(C1854 c1854) {
        StringBuilder sb = new StringBuilder(bv.aE);
        C2581 c2581 = c1854.f6187;
        sb.append(c2581.f8205);
        sb.append(' ');
        C0916 c0916 = c2581.f8207.f6183;
        if (c0916 == null) {
            sb.append("null");
        } else {
            sb.append(c0916.mo1360());
        }
        sb.append(' ');
        C0917 c0917 = c1854.f6188;
        if (c0917 == null) {
            sb.append("null");
        } else {
            sb.append(c0917.f3408.mo1360());
        }
        C0916 c0916M3763 = c1854.m3763();
        if (c0916M3763 != null) {
            sb.append(' ');
            sb.append(c0916M3763.mo1360());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2579(int i, String str) {
        if (this.f3521 != null) {
            str = AbstractC2844.m4786(new StringBuilder(), this.f3521, str);
        }
        C0496 c0496 = this.f3520;
        if (c0496 != null) {
            if (!this.f3522) {
                i = 0;
            }
            c0496.m1925(i, str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final byte[] m2580() {
        C1026 c1026;
        C1854 c1854;
        C2436 c2436 = this.f3510;
        int length = c2436 == null ? 0 : c2436.f4833.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add((C2435) c2436.m3165(i));
        }
        Collections.sort(arrayList, new C0179(6));
        C2492 c2492 = this.f3516;
        ArrayList<C1854> arrayList2 = new ArrayList(c2492.f7900.f4833.length);
        int iM4830 = c2492.f7900.m4830();
        int i2 = this.f3515;
        boolean z = this.f3517;
        int i3 = (i2 - iM4830) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C1855 c1855 = this.f3511;
        int length2 = c1855.f4833.length;
        for (int i4 = 0; i4 < length2; i4++) {
            C1854 c1856 = (C1854) c1855.m3165(i4);
            int i5 = c1856.f6187.f8205;
            if (i5 >= i3) {
                int i6 = i5 - i3;
                if (!bitSet.get(i6)) {
                    bitSet.set(i6);
                    arrayList2.add(c1856);
                }
            }
        }
        Collections.sort(arrayList2, new C0179(7));
        boolean z2 = this.f3520 != null;
        C0496 c0496 = this.f3512;
        int i7 = c0496.f2152;
        if (arrayList.size() > 0) {
            this.f3519 = ((C2435) arrayList.get(0)).f7787.f9069;
        }
        c0496.m1936(this.f3519);
        if (z2) {
            m2579(c0496.f2152 - i7, "line_start: " + this.f3519);
        }
        int iM4831 = (i2 - c2492.f7900.m4830()) - (!z ? 1 : 0);
        C2879 c2879 = c2492.f7900;
        int length3 = c2879.f4833.length;
        C1854[] c1854Arr = this.f3523;
        if (!z) {
            for (C1854 c1857 : arrayList2) {
                if (iM4831 == c1857.f6187.f8205) {
                    c1854Arr[iM4831] = c1857;
                    break;
                }
            }
            iM4831++;
        }
        int i8 = c0496.f2152;
        c0496.m1936(length3);
        if (z2) {
            m2579(c0496.f2152 - i8, String.format("parameters_size: %04x", Integer.valueOf(length3)));
        }
        for (int i9 = 0; i9 < length3; i9++) {
            C3505 c3505 = (C3505) c2879.m3165(i9);
            int i10 = c0496.f2152;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1854 = null;
                    break;
                }
                c1854 = (C1854) it.next();
                if (iM4831 == c1854.f6187.f8205) {
                    if (c1854.m3763() != null) {
                        m2585(null);
                    } else {
                        m2585(c1854.f6187.f8207.f6183);
                    }
                    c1854Arr[iM4831] = c1854;
                    break;
                }
            }
            if (c1854 == null) {
                m2585(null);
            }
            if (z2) {
                m2579(c0496.f2152 - i10, "parameter " + ((c1854 == null || c1854.m3763() != null) ? "<unnamed>" : c1854.f6187.f8207.f6183.mo1360()) + " v" + iM4831);
            }
            iM4831 += c3505.m5028();
        }
        for (C1854 c1858 : c1854Arr) {
            if (c1858 != null && c1858.m3763() != null) {
                m2583(c1858);
            }
        }
        c0496.m1932(7);
        if (this.f3520 != null) {
            m2579(1, String.format("%04x: prologue end", Integer.valueOf(this.f3518)));
        }
        int size = arrayList.size();
        int length4 = c1855.f4833.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length5 = c1855.f4833.length;
            while (i11 < length5 && ((C1854) c1855.m3165(i11)).f6185 == this.f3518) {
                int i13 = i11 + 1;
                C1854 c1859 = (C1854) c1855.m3165(i11);
                C2581 c2581 = c1859.f6187;
                int i14 = c2581.f8205;
                C1854 c18510 = c1854Arr[i14];
                if (c1859 != c18510) {
                    c1854Arr[i14] = c1859;
                    int i15 = c1859.f6186;
                    if (i15 == 1) {
                        if (c18510 != null && c2581.m4561(c18510.f6187)) {
                            if (c18510.f6186 == 1) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int i16 = c0496.f2152;
                            c0496.m1932(6);
                            m2586(i14);
                            if (this.f3520 != null) {
                                m2579(c0496.f2152 - i16, String.format("%04x: +local restart %s", Integer.valueOf(this.f3518), m2578(c1859)));
                            }
                        } else if (c1859.m3763() != null) {
                            m2583(c1859);
                        } else {
                            int i17 = c0496.f2152;
                            c0496.m1932(3);
                            m2586(i14);
                            m2585(c2581.f8207.f6183);
                            C0917 c0917 = c1859.f6188;
                            if (c0917 == null || (c1026 = this.f3513) == null) {
                                c0496.m1936(0);
                            } else {
                                c0496.m1936(c1026.f3749.m4000(c0917) + 1);
                            }
                            if (this.f3520 != null) {
                                m2579(c0496.f2152 - i17, String.format("%04x: +local %s", Integer.valueOf(this.f3518), m2578(c1859)));
                            }
                        }
                    } else if (i15 != 3) {
                        int i18 = c0496.f2152;
                        c0496.m1932(5);
                        c0496.m1936(i14);
                        if (this.f3520 != null) {
                            m2579(c0496.f2152 - i18, String.format("%04x: -local %s", Integer.valueOf(this.f3518), m2578(c1859)));
                        }
                    }
                }
                i11 = i13;
            }
            int size2 = arrayList.size();
            while (i12 < size2 && ((C2435) arrayList.get(i12)).f7786 == this.f3518) {
                m2584((C2435) arrayList.get(i12));
                i12++;
            }
            int i19 = i11 < length4 ? ((C1854) c1855.m3165(i11)).f6185 : Integer.MAX_VALUE;
            int i20 = i12 < size ? ((C2435) arrayList.get(i12)).f7786 : Integer.MAX_VALUE;
            int iMin = Math.min(i20, i19);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f3514 && i19 == Integer.MAX_VALUE && i20 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == i20) {
                m2584((C2435) arrayList.get(i12));
                i12++;
            } else {
                m2582(iMin - this.f3518);
            }
        }
        c0496.m1932(0);
        if (this.f3520 != null) {
            m2579(1, "end sequence");
        }
        return c0496.m1930();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2581(int i) {
        C0496 c0496 = this.f3512;
        int i2 = c0496.f2152;
        c0496.m1932(2);
        c0496.m1935(i);
        int i3 = this.f3519 + i;
        this.f3519 = i3;
        if (this.f3520 == null) {
            return;
        }
        m2579(c0496.f2152 - i2, String.format("line = %d", Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2582(int i) {
        C0496 c0496 = this.f3512;
        int i2 = c0496.f2152;
        c0496.m1932(1);
        c0496.m1936(i);
        int i3 = this.f3518 + i;
        this.f3518 = i3;
        if (this.f3520 == null) {
            return;
        }
        m2579(c0496.f2152 - i2, String.format("%04x: advance pc", Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2583(C1854 c1854) {
        C1026 c1026;
        C0496 c0496 = this.f3512;
        int i = c0496.f2152;
        c0496.m1932(4);
        C2581 c2581 = c1854.f6187;
        m2586(c2581.f8205);
        m2585(c2581.f8207.f6183);
        C0917 c0917 = c1854.f6188;
        if (c0917 == null || (c1026 = this.f3513) == null) {
            c0496.m1936(0);
        } else {
            c0496.m1936(c1026.f3749.m4000(c0917) + 1);
        }
        m2585(c1854.m3763());
        if (this.f3520 == null) {
            return;
        }
        m2579(c0496.f2152 - i, String.format("%04x: +localx %s", Integer.valueOf(this.f3518), m2578(c1854)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2584(C2435 c2435) {
        int i = c2435.f7787.f9069;
        int i2 = c2435.f7786;
        int i3 = i - this.f3519;
        int i4 = i2 - this.f3518;
        if (i4 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        int i5 = 0;
        if (i3 < -4 || i3 > 10) {
            m2581(i3);
            i3 = 0;
        }
        int iM2577 = m2577(i3, i4);
        if ((iM2577 & (-256)) > 0) {
            m2582(i4);
            iM2577 = m2577(i3, 0);
            if ((iM2577 & (-256)) > 0) {
                m2581(i3);
                iM2577 = m2577(0, 0);
                i4 = 0;
            } else {
                i4 = 0;
                i5 = i3;
            }
        } else {
            i5 = i3;
        }
        this.f3512.m1932(iM2577);
        this.f3519 += i5;
        int i6 = this.f3518 + i4;
        this.f3518 = i6;
        if (this.f3520 == null) {
            return;
        }
        m2579(1, String.format("%04x: line %d", Integer.valueOf(i6), Integer.valueOf(this.f3519)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2585(C0916 c0916) {
        C1026 c1026;
        C0496 c0496 = this.f3512;
        if (c0916 == null || (c1026 = this.f3513) == null) {
            c0496.m1936(0);
        } else {
            c0496.m1936(c1026.f3748.m3999(c0916) + 1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2586(int i) {
        if (i < 0) {
            throw new RuntimeException(AbstractC1095.m2794(i, "Signed value where unsigned required: "));
        }
        this.f3512.m1936(i);
    }
}
