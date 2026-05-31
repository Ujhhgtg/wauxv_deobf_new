package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᤝᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1814 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean f6024 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static int f6025 = 1000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2456 f6028;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0276[] f6031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0253 f6037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C0276 f6040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f6026 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f6027 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6029 = 32;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6030 = 32;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f6032 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean[] f6033 = new boolean[32];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6034 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f6035 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6036 = 32;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C2845[] f6038 = new C2845[f6025];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f6039 = 0;

    public C1814() {
        this.f6031 = null;
        this.f6031 = new C0276[32];
        m3719();
        C0253 c0253 = new C0253(4);
        c0253.f1478 = new C2432();
        c0253.f1479 = new C2432();
        c0253.f1480 = new C2845[32];
        this.f6037 = c0253;
        C2456 c2456 = new C2456(c0253);
        c2456.f7823 = new C2845[128];
        c2456.f7824 = new C2845[128];
        c2456.f7825 = 0;
        c2456.f7826 = new C2455(c2456);
        this.f6028 = c2456;
        this.f6040 = new C0276(c0253);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static int m3701(Object obj) {
        C2845 c2845 = ((C0778) obj).f2891;
        if (c2845 != null) {
            return (int) (c2845.f9051 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2845 m3702(int i) {
        C2432 c2432 = (C2432) this.f6037.f1479;
        int i2 = c2432.f7778;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c2432.f7777;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c2432.f7778 = i3;
            obj = obj2;
        }
        C2845 c2845 = (C2845) obj;
        if (c2845 == null) {
            c2845 = new C2845(i);
            c2845.f9058 = i;
        } else {
            c2845.m4797();
            c2845.f9058 = i;
        }
        int i4 = this.f6039;
        int i5 = f6025;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f6025 = i6;
            this.f6038 = (C2845[]) Arrays.copyOf(this.f6038, i6);
        }
        C2845[] c2845Arr = this.f6038;
        int i7 = this.f6039;
        this.f6039 = i7 + 1;
        c2845Arr[i7] = c2845;
        return c2845;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3703(C2845 c2845, C2845 c2846, int i, float f, C2845 c2847, C2845 c2848, int i2, int i3) {
        C0276 c0276M3713 = m3713();
        if (c2846 == c2847) {
            c0276M3713.f1539.m1507(c2845, 1.0f);
            c0276M3713.f1539.m1507(c2848, 1.0f);
            c0276M3713.f1539.m1507(c2846, -2.0f);
        } else if (f == 0.5f) {
            c0276M3713.f1539.m1507(c2845, 1.0f);
            c0276M3713.f1539.m1507(c2846, -1.0f);
            c0276M3713.f1539.m1507(c2847, -1.0f);
            c0276M3713.f1539.m1507(c2848, 1.0f);
            if (i > 0 || i2 > 0) {
                c0276M3713.f1537 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0276M3713.f1539.m1507(c2845, -1.0f);
            c0276M3713.f1539.m1507(c2846, 1.0f);
            c0276M3713.f1537 = i;
        } else if (f >= 1.0f) {
            c0276M3713.f1539.m1507(c2848, -1.0f);
            c0276M3713.f1539.m1507(c2847, 1.0f);
            c0276M3713.f1537 = -i2;
        } else {
            float f2 = 1.0f - f;
            c0276M3713.f1539.m1507(c2845, f2 * 1.0f);
            c0276M3713.f1539.m1507(c2846, f2 * (-1.0f));
            c0276M3713.f1539.m1507(c2847, (-1.0f) * f);
            c0276M3713.f1539.m1507(c2848, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0276M3713.f1537 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0276M3713.m1513(this, i3);
        }
        m3704(c0276M3713);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3704(C0276 c0276) {
        boolean z;
        boolean z2;
        C2845 c2845M1518;
        if (this.f6035 + 1 >= this.f6036 || this.f6034 + 1 >= this.f6030) {
            m3715();
        }
        if (c0276.f1540) {
            z = false;
        } else {
            ArrayList arrayList = c0276.f1538;
            if (this.f6031.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM1504 = c0276.f1539.m1504();
                    for (int i = 0; i < iM1504; i++) {
                        C2845 c2845M1505 = c0276.f1539.m1505(i);
                        if (c2845M1505.f9049 != -1 || c2845M1505.f9052) {
                            arrayList.add(c2845M1505);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C2845 c2845 = (C2845) arrayList.get(i2);
                            if (c2845.f9052) {
                                c0276.m1520(this, c2845, true);
                            } else {
                                c0276.mo1521(this, this.f6031[c2845.f9049], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0276.f1536 != null && c0276.f1539.m1504() == 0) {
                    c0276.f1540 = true;
                    this.f6026 = true;
                }
            }
            if (c0276.mo1517()) {
                return;
            }
            float f = c0276.f1537;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c0276.f1537 = f * (-1.0f);
                C0267 c0267 = c0276.f1539;
                int i3 = c0267.f1515;
                for (int i4 = 0; i3 != -1 && i4 < c0267.f1508; i4++) {
                    float[] fArr = c0267.f1514;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0267.f1513[i3];
                }
            }
            int iM1505 = c0276.f1539.m1504();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C2845 c2846 = null;
            C2845 c2847 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM1505) {
                float fM1506 = c0276.f1539.m1506(i5);
                C2845 c2845M1506 = c0276.f1539.m1505(i5);
                float f5 = f2;
                if (c2845M1506.f9058 == 1) {
                    if (c2846 == null) {
                        if (c2845M1506.f9057 <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c2846 = c2845M1506;
                        f3 = fM1506;
                    } else {
                        if (f3 > fM1506) {
                            if (c2845M1506.f9057 > 1) {
                                z4 = false;
                            }
                            c2846 = c2845M1506;
                            f3 = fM1506;
                        } else if (z4 || c2845M1506.f9057 > 1) {
                        }
                        z4 = true;
                        c2846 = c2845M1506;
                        f3 = fM1506;
                    }
                } else if (c2846 == null && fM1506 < f5) {
                    if (c2847 == null) {
                        if (c2845M1506.f9057 <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c2847 = c2845M1506;
                        f4 = fM1506;
                    } else {
                        if (f4 > fM1506) {
                            if (c2845M1506.f9057 > 1) {
                                z5 = false;
                            }
                            c2847 = c2845M1506;
                            f4 = fM1506;
                        } else if (z5 || c2845M1506.f9057 > 1) {
                        }
                        z5 = true;
                        c2847 = c2845M1506;
                        f4 = fM1506;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (c2846 == null) {
                c2846 = c2847;
            }
            if (c2846 == null) {
                z2 = true;
            } else {
                c0276.m1519(c2846);
                z2 = false;
            }
            if (c0276.f1539.m1504() == 0) {
                c0276.f1540 = true;
            }
            if (z2) {
                if (this.f6034 + 1 >= this.f6030) {
                    m3715();
                }
                C2845 c2845M3702 = m3702(3);
                int i6 = this.f6027 + 1;
                this.f6027 = i6;
                this.f6034++;
                c2845M3702.f9048 = i6;
                C0253 c0253 = this.f6037;
                ((C2845[]) c0253.f1480)[i6] = c2845M3702;
                c0276.f1536 = c2845M3702;
                int i7 = this.f6035;
                m3709(c0276);
                if (this.f6035 == i7 + 1) {
                    C0276 c0277 = this.f6040;
                    c0277.f1536 = null;
                    c0277.f1539.m1502();
                    for (int i8 = 0; i8 < c0276.f1539.m1504(); i8++) {
                        c0277.f1539.m1501(c0276.f1539.m1505(i8), c0276.f1539.m1506(i8), true);
                    }
                    m3718(this.f6040);
                    if (c2845M3702.f9049 == -1) {
                        if (c0276.f1536 == c2845M3702 && (c2845M1518 = c0276.m1518(null, c2845M3702)) != null) {
                            c0276.m1519(c2845M1518);
                        }
                        if (!c0276.f1540) {
                            c0276.f1536.m4799(this, c0276);
                        }
                        ((C2432) c0253.f1478).m4364(c0276);
                        this.f6035--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            C2845 c2848 = c0276.f1536;
            if (c2848 == null) {
                return;
            }
            if (c2848.f9058 != 1 && c0276.f1537 < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        m3709(c0276);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3705(C2845 c2845, int i) {
        int i2 = c2845.f9049;
        if (i2 == -1) {
            c2845.m4798(this, i);
            for (int i3 = 0; i3 < this.f6027 + 1; i3++) {
                C2845 c2846 = ((C2845[]) this.f6037.f1480)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0276 c0276M3713 = m3713();
            c0276M3713.f1536 = c2845;
            float f = i;
            c2845.f9051 = f;
            c0276M3713.f1537 = f;
            c0276M3713.f1540 = true;
            m3704(c0276M3713);
            return;
        }
        C0276 c0276 = this.f6031[i2];
        if (c0276.f1540) {
            c0276.f1537 = i;
            return;
        }
        if (c0276.f1539.m1504() == 0) {
            c0276.f1540 = true;
            c0276.f1537 = i;
            return;
        }
        C0276 c0276M3714 = m3713();
        if (i < 0) {
            c0276M3714.f1537 = i * (-1);
            c0276M3714.f1539.m1507(c2845, 1.0f);
        } else {
            c0276M3714.f1537 = i;
            c0276M3714.f1539.m1507(c2845, -1.0f);
        }
        m3704(c0276M3714);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3706(C2845 c2845, C2845 c2846, int i, int i2) {
        if (i2 == 8 && c2846.f9052 && c2845.f9049 == -1) {
            c2845.m4798(this, c2846.f9051 + i);
            return;
        }
        C0276 c0276M3713 = m3713();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0276M3713.f1537 = i;
        }
        if (z) {
            c0276M3713.f1539.m1507(c2845, 1.0f);
            c0276M3713.f1539.m1507(c2846, -1.0f);
        } else {
            c0276M3713.f1539.m1507(c2845, -1.0f);
            c0276M3713.f1539.m1507(c2846, 1.0f);
        }
        if (i2 != 8) {
            c0276M3713.m1513(this, i2);
        }
        m3704(c0276M3713);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3707(C2845 c2845, C2845 c2846, int i, int i2) {
        C0276 c0276M3713 = m3713();
        C2845 c2845M3714 = m3714();
        c2845M3714.f9050 = 0;
        c0276M3713.m1514(c2845, c2846, c2845M3714, i);
        if (i2 != 8) {
            c0276M3713.f1539.m1507(m3711(i2), (int) (c0276M3713.f1539.m1503(c2845M3714) * (-1.0f)));
        }
        m3704(c0276M3713);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3708(C2845 c2845, C2845 c2846, int i, int i2) {
        C0276 c0276M3713 = m3713();
        C2845 c2845M3714 = m3714();
        c2845M3714.f9050 = 0;
        c0276M3713.m1515(c2845, c2846, c2845M3714, i);
        if (i2 != 8) {
            c0276M3713.f1539.m1507(m3711(i2), (int) (c0276M3713.f1539.m1503(c2845M3714) * (-1.0f)));
        }
        m3704(c0276M3713);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3709(C0276 c0276) {
        int i;
        if (c0276.f1540) {
            c0276.f1536.m4798(this, c0276.f1537);
        } else {
            C0276[] c0276Arr = this.f6031;
            int i2 = this.f6035;
            c0276Arr[i2] = c0276;
            C2845 c2845 = c0276.f1536;
            c2845.f9049 = i2;
            this.f6035 = i2 + 1;
            c2845.m4799(this, c0276);
        }
        if (this.f6026) {
            int i3 = 0;
            while (i3 < this.f6035) {
                if (this.f6031[i3] == null) {
                    System.out.println("WTF");
                }
                C0276 c0277 = this.f6031[i3];
                if (c0277 != null && c0277.f1540) {
                    c0277.f1536.m4798(this, c0277.f1537);
                    ((C2432) this.f6037.f1478).m4364(c0277);
                    this.f6031[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f6035;
                        if (i4 >= i) {
                            break;
                        }
                        C0276[] c0276Arr2 = this.f6031;
                        int i6 = i4 - 1;
                        C0276 c0278 = c0276Arr2[i4];
                        c0276Arr2[i6] = c0278;
                        C2845 c2846 = c0278.f1536;
                        if (c2846.f9049 == i4) {
                            c2846.f9049 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f6031[i5] = null;
                    }
                    this.f6035 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f6026 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3710() {
        for (int i = 0; i < this.f6035; i++) {
            C0276 c0276 = this.f6031[i];
            c0276.f1536.f9051 = c0276.f1537;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2845 m3711(int i) {
        if (this.f6034 + 1 >= this.f6030) {
            m3715();
        }
        C2845 c2845M3702 = m3702(4);
        float[] fArr = c2845M3702.f9054;
        int i2 = this.f6027 + 1;
        this.f6027 = i2;
        this.f6034++;
        c2845M3702.f9048 = i2;
        c2845M3702.f9050 = i;
        ((C2845[]) this.f6037.f1480)[i2] = c2845M3702;
        C2456 c2456 = this.f6028;
        c2456.f7826.f7821 = c2845M3702;
        Arrays.fill(fArr, 0.0f);
        fArr[c2845M3702.f9050] = 1.0f;
        c2456.m4393(c2845M3702);
        return c2845M3702;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2845 m3712(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f6034 + 1 >= this.f6030) {
            m3715();
        }
        if (!(obj instanceof C0778)) {
            return null;
        }
        C0778 c0778 = (C0778) obj;
        C2845 c2845 = c0778.f2891;
        if (c2845 == null) {
            c0778.m2395();
            c2845 = c0778.f2891;
        }
        int i = c2845.f9048;
        C0253 c0253 = this.f6037;
        if (i != -1 && i <= this.f6027 && ((C2845[]) c0253.f1480)[i] != null) {
            return c2845;
        }
        if (i != -1) {
            c2845.m4797();
        }
        int i2 = this.f6027 + 1;
        this.f6027 = i2;
        this.f6034++;
        c2845.f9048 = i2;
        c2845.f9058 = 1;
        ((C2845[]) c0253.f1480)[i2] = c2845;
        return c2845;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0276 m3713() {
        Object obj;
        C0253 c0253 = this.f6037;
        C2432 c2432 = (C2432) c0253.f1478;
        int i = c2432.f7778;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2432.f7777;
            obj = objArr[i2];
            objArr[i2] = null;
            c2432.f7778 = i2;
        } else {
            obj = null;
        }
        C0276 c0276 = (C0276) obj;
        if (c0276 == null) {
            return new C0276(c0253);
        }
        c0276.f1536 = null;
        c0276.f1539.m1502();
        c0276.f1537 = 0.0f;
        c0276.f1540 = false;
        return c0276;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C2845 m3714() {
        if (this.f6034 + 1 >= this.f6030) {
            m3715();
        }
        C2845 c2845M3702 = m3702(3);
        int i = this.f6027 + 1;
        this.f6027 = i;
        this.f6034++;
        c2845M3702.f9048 = i;
        ((C2845[]) this.f6037.f1480)[i] = c2845M3702;
        return c2845M3702;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3715() {
        int i = this.f6029 * 2;
        this.f6029 = i;
        this.f6031 = (C0276[]) Arrays.copyOf(this.f6031, i);
        C0253 c0253 = this.f6037;
        c0253.f1480 = (C2845[]) Arrays.copyOf((C2845[]) c0253.f1480, this.f6029);
        int i2 = this.f6029;
        this.f6033 = new boolean[i2];
        this.f6030 = i2;
        this.f6036 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3716() {
        C2456 c2456 = this.f6028;
        if (c2456.mo1517()) {
            m3710();
            return;
        }
        if (!this.f6032) {
            m3717(c2456);
            return;
        }
        for (int i = 0; i < this.f6035; i++) {
            if (!this.f6031[i].f1540) {
                m3717(c2456);
                return;
            }
        }
        m3710();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3717(C2456 c2456) {
        for (int i = 0; i < this.f6035; i++) {
            C0276 c0276 = this.f6031[i];
            int i2 = 1;
            if (c0276.f1536.f9058 != 1) {
                float f = 0.0f;
                if (c0276.f1537 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f6035) {
                            C0276 c0277 = this.f6031[i6];
                            if (c0277.f1536.f9058 != i2 && !c0277.f1540 && c0277.f1537 < f) {
                                int iM1504 = c0277.f1539.m1504();
                                int i8 = 0;
                                while (i8 < iM1504) {
                                    C2845 c2845M1505 = c0277.f1539.m1505(i8);
                                    float fM1503 = c0277.f1539.m1503(c2845M1505);
                                    if (fM1503 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c2845M1505.f9053[i9] / fM1503;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c2845M1505.f9048;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0276 c0278 = this.f6031[i4];
                            c0278.f1536.f9049 = -1;
                            c0278.m1519(((C2845[]) this.f6037.f1480)[i5]);
                            C2845 c2845 = c0278.f1536;
                            c2845.f9049 = i4;
                            c2845.m4799(this, c0278);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f6034 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        m3718(c2456);
        m3710();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3718(C0276 c0276) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f6034; i2++) {
            this.f6033[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f6034 * 2) {
                return;
            }
            C2845 c2845 = c0276.f1536;
            if (c2845 != null) {
                this.f6033[c2845.f9048] = true;
            }
            C2845 c2845Mo1516 = c0276.mo1516(this.f6033);
            if (c2845Mo1516 != null) {
                boolean[] zArr = this.f6033;
                int i5 = c2845Mo1516.f9048;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (c2845Mo1516 != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f6035) {
                    C0276 c0277 = this.f6031[i6];
                    if (c0277.f1536.f9058 != i4 && !c0277.f1540) {
                        C0267 c0267 = c0277.f1539;
                        int i8 = c0267.f1515;
                        if (i8 == -1) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i8 == -1 || i9 >= c0267.f1508) {
                                z = false;
                                break;
                            } else if (c0267.f1512[i8] == c2845Mo1516.f9048) {
                                z = true;
                                break;
                            } else {
                                i8 = c0267.f1513[i8];
                                i9++;
                            }
                        }
                        if (z) {
                            float fM1503 = c0277.f1539.m1503(c2845Mo1516);
                            if (fM1503 < 0.0f) {
                                float f2 = (-c0277.f1537) / fM1503;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0276 c0278 = this.f6031[i7];
                    c0278.f1536.f9049 = -1;
                    c0278.m1519(c2845Mo1516);
                    C2845 c2846 = c0278.f1536;
                    c2846.f9049 = i7;
                    c2846.m4799(this, c0278);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m3719() {
        for (int i = 0; i < this.f6035; i++) {
            C0276 c0276 = this.f6031[i];
            if (c0276 != null) {
                ((C2432) this.f6037.f1478).m4364(c0276);
            }
            this.f6031[i] = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m3720() {
        C0253 c0253;
        int i = 0;
        while (true) {
            c0253 = this.f6037;
            C2845[] c2845Arr = (C2845[]) c0253.f1480;
            if (i >= c2845Arr.length) {
                break;
            }
            C2845 c2845 = c2845Arr[i];
            if (c2845 != null) {
                c2845.m4797();
            }
            i++;
        }
        C2432 c2432 = (C2432) c0253.f1479;
        C2845[] c2845Arr2 = this.f6038;
        int length = this.f6039;
        c2432.getClass();
        if (length > c2845Arr2.length) {
            length = c2845Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C2845 c2846 = c2845Arr2[i2];
            int i3 = c2432.f7778;
            Object[] objArr = c2432.f7777;
            if (i3 < objArr.length) {
                objArr[i3] = c2846;
                c2432.f7778 = i3 + 1;
            }
        }
        this.f6039 = 0;
        Arrays.fill((C2845[]) c0253.f1480, (Object) null);
        this.f6027 = 0;
        C2456 c2456 = this.f6028;
        c2456.f7825 = 0;
        c2456.f1537 = 0.0f;
        this.f6034 = 1;
        for (int i4 = 0; i4 < this.f6035; i4++) {
            C0276 c0276 = this.f6031[i4];
        }
        m3719();
        this.f6035 = 0;
        this.f6040 = new C0276(c0253);
    }
}
