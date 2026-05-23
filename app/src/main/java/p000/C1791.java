package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1791 {

    public static boolean f5968 = false;

    public static int f5969 = 1000;

    public final C2403 f5972;

    public C0266[] f5975;

    public final C0243 f5981;

    public C0266 f5984;

    public boolean f5970 = false;

    public int f5971 = 0;

    public int f5973 = 32;

    public int f5974 = 32;

    public boolean f5976 = false;

    public boolean[] f5977 = new boolean[32];

    public int f5978 = 1;

    public int f5979 = 0;

    public int f5980 = 32;

    public C2785[] f5982 = new C2785[f5969];

    public int f5983 = 0;

    public C1791() {
        this.f5975 = null;
        this.f5975 = new C0266[32];
        m3547();
        C0243 c0243 = new C0243(4);
        c0243.f1404 = new C2379();
        c0243.f1405 = new C2379();
        c0243.f1406 = new C2785[32];
        this.f5981 = c0243;
        C2403 c2403 = new C2403(c0243);
        c2403.f7679 = new C2785[128];
        c2403.f7680 = new C2785[128];
        c2403.f7681 = 0;
        c2403.f7682 = new C2402(c2403);
        this.f5972 = c2403;
        this.f5984 = new C0266(c0243);
    }

    public static int m3529(Object obj) {
        C2785 c2785 = ((C0779) obj).f2884;
        if (c2785 != null) {
            return (int) (c2785.f8889 + 0.5f);
        }
        return 0;
    }

    public final C2785 m3530(int i) {
        C2379 c2379 = (C2379) this.f5981.f1405;
        int i2 = c2379.f7634;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c2379.f7633;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c2379.f7634 = i3;
            obj = obj2;
        }
        C2785 c2785 = (C2785) obj;
        if (c2785 == null) {
            c2785 = new C2785(i);
            c2785.f8896 = i;
        } else {
            c2785.m4764();
            c2785.f8896 = i;
        }
        int i4 = this.f5983;
        int i5 = f5969;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f5969 = i6;
            this.f5982 = (C2785[]) Arrays.copyOf(this.f5982, i6);
        }
        C2785[] c2785Arr = this.f5982;
        int i7 = this.f5983;
        this.f5983 = i7 + 1;
        c2785Arr[i7] = c2785;
        return c2785;
    }

    public final void m3531(C2785 c2785, C2785 c2786, int i, float f, C2785 c2787, C2785 c2788, int i2, int i3) {
        C0266 c0266M3541 = m3541();
        if (c2786 == c2787) {
            c0266M3541.f1465.m1361(c2785, 1.0f);
            c0266M3541.f1465.m1361(c2788, 1.0f);
            c0266M3541.f1465.m1361(c2786, -2.0f);
        } else if (f == 0.5f) {
            c0266M3541.f1465.m1361(c2785, 1.0f);
            c0266M3541.f1465.m1361(c2786, -1.0f);
            c0266M3541.f1465.m1361(c2787, -1.0f);
            c0266M3541.f1465.m1361(c2788, 1.0f);
            if (i > 0 || i2 > 0) {
                c0266M3541.f1463 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0266M3541.f1465.m1361(c2785, -1.0f);
            c0266M3541.f1465.m1361(c2786, 1.0f);
            c0266M3541.f1463 = i;
        } else if (f >= 1.0f) {
            c0266M3541.f1465.m1361(c2788, -1.0f);
            c0266M3541.f1465.m1361(c2787, 1.0f);
            c0266M3541.f1463 = -i2;
        } else {
            float f2 = 1.0f - f;
            c0266M3541.f1465.m1361(c2785, f2 * 1.0f);
            c0266M3541.f1465.m1361(c2786, f2 * (-1.0f));
            c0266M3541.f1465.m1361(c2787, (-1.0f) * f);
            c0266M3541.f1465.m1361(c2788, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0266M3541.f1463 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0266M3541.m1367(this, i3);
        }
        m3532(c0266M3541);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void m3532(C0266 c0266) {
        boolean z;
        boolean z2;
        C2785 c2785M1372;
        if (this.f5979 + 1 >= this.f5980 || this.f5978 + 1 >= this.f5974) {
            m3543();
        }
        if (c0266.f1466) {
            z = false;
        } else {
            ArrayList arrayList = c0266.f1464;
            if (this.f5975.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM1358 = c0266.f1465.m1358();
                    for (int i = 0; i < iM1358; i++) {
                        C2785 c2785M1359 = c0266.f1465.m1359(i);
                        if (c2785M1359.f8887 != -1 || c2785M1359.f8890) {
                            arrayList.add(c2785M1359);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C2785 c2785 = (C2785) arrayList.get(i2);
                            if (c2785.f8890) {
                                c0266.m1374(this, c2785, true);
                            } else {
                                c0266.mo1375(this, this.f5975[c2785.f8887], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0266.f1462 != null && c0266.f1465.m1358() == 0) {
                    c0266.f1466 = true;
                    this.f5970 = true;
                }
            }
            if (c0266.mo1371()) {
                return;
            }
            float f = c0266.f1463;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c0266.f1463 = f * (-1.0f);
                C0257 c0257 = c0266.f1465;
                int i3 = c0257.f1441;
                for (int i4 = 0; i3 != -1 && i4 < c0257.f1434; i4++) {
                    float[] fArr = c0257.f1440;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0257.f1439[i3];
                }
            }
            int iM1359 = c0266.f1465.m1358();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C2785 c2786 = null;
            C2785 c2787 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM1359) {
                float fM1360 = c0266.f1465.m1360(i5);
                C2785 c2785M13510 = c0266.f1465.m1359(i5);
                float f5 = 0.0f;
                if (c2785M13510.f8896 == 1) {
                    if (c2786 == null) {
                        if (c2785M13510.f8895 <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c2786 = c2785M13510;
                        f3 = fM1360;
                    } else {
                        if (f3 > fM1360) {
                            if (c2785M13510.f8895 > 1) {
                                z4 = false;
                            }
                            c2786 = c2785M13510;
                            f3 = fM1360;
                        } else if (z4 || c2785M13510.f8895 > 1) {
                        }
                        z4 = true;
                        c2786 = c2785M13510;
                        f3 = fM1360;
                    }
                } else if (c2786 == null && fM1360 < 0.0f) {
                    if (c2787 == null) {
                        if (c2785M13510.f8895 <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c2787 = c2785M13510;
                        f4 = fM1360;
                    } else {
                        if (f4 > fM1360) {
                            if (c2785M13510.f8895 > 1) {
                                z5 = false;
                            }
                            c2787 = c2785M13510;
                            f4 = fM1360;
                        } else if (z5 || c2785M13510.f8895 > 1) {
                        }
                        z5 = true;
                        c2787 = c2785M13510;
                        f4 = fM1360;
                    }
                }
                i5++;
                f2 = 0.0f;
            }
            float f6 = 0.0f;
            if (c2786 == null) {
                c2786 = c2787;
            }
            if (c2786 == null) {
                z2 = true;
            } else {
                c0266.m1373(c2786);
                z2 = false;
            }
            if (c0266.f1465.m1358() == 0) {
                c0266.f1466 = true;
            }
            if (z2) {
                if (this.f5978 + 1 >= this.f5974) {
                    m3543();
                }
                C2785 c2785M3530 = m3530(3);
                int i6 = this.f5971 + 1;
                this.f5971 = i6;
                this.f5978++;
                c2785M3530.f8886 = i6;
                C0243 c0243 = this.f5981;
                ((C2785[]) c0243.f1406)[i6] = c2785M3530;
                c0266.f1462 = c2785M3530;
                int i7 = this.f5979;
                m3537(c0266);
                if (this.f5979 == i7 + 1) {
                    C0266 c0267 = this.f5984;
                    c0267.f1462 = null;
                    c0267.f1465.m1356();
                    for (int i8 = 0; i8 < c0266.f1465.m1358(); i8++) {
                        c0267.f1465.m1355(c0266.f1465.m1359(i8), c0266.f1465.m1360(i8), true);
                    }
                    m3546(this.f5984);
                    if (c2785M3530.f8887 == -1) {
                        if (c0266.f1462 == c2785M3530 && (c2785M1372 = c0266.m1372(null, c2785M3530)) != null) {
                            c0266.m1373(c2785M1372);
                        }
                        if (!c0266.f1466) {
                            c0266.f1462.m4766(this, c0266);
                        }
                        ((C2379) c0243.f1404).m4343(c0266);
                        this.f5979--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            C2785 c2788 = c0266.f1462;
            if (c2788 == null) {
                return;
            }
            if (c2788.f8896 != 1 && c0266.f1463 < 0.0f) {
                return;
            }
        }
        if (z) {
            return;
        }
        m3537(c0266);
    }

    public final void m3533(C2785 c2785, int i) {
        int i2 = c2785.f8887;
        if (i2 == -1) {
            c2785.m4765(this, i);
            for (int i3 = 0; i3 < this.f5971 + 1; i3++) {
                C2785 c2786 = ((C2785[]) this.f5981.f1406)[i3];
            }
            return;
        }
        if (false) {
            C0266 c0266M3541 = m3541();
            c0266M3541.f1462 = c2785;
            float f = i;
            c2785.f8889 = f;
            c0266M3541.f1463 = f;
            c0266M3541.f1466 = true;
            m3532(c0266M3541);
            return;
        }
        C0266 c0266 = this.f5975[i2];
        if (c0266.f1466) {
            c0266.f1463 = i;
            return;
        }
        if (c0266.f1465.m1358() == 0) {
            c0266.f1466 = true;
            c0266.f1463 = i;
            return;
        }
        C0266 c0266M3542 = m3541();
        if (i < 0) {
            c0266M3542.f1463 = i * (-1);
            c0266M3542.f1465.m1361(c2785, 1.0f);
        } else {
            c0266M3542.f1463 = i;
            c0266M3542.f1465.m1361(c2785, -1.0f);
        }
        m3532(c0266M3542);
    }

    public final void m3534(C2785 c2785, C2785 c2786, int i, int i2) {
        if (i2 == 8 && c2786.f8890 && c2785.f8887 == -1) {
            c2785.m4765(this, c2786.f8889 + i);
            return;
        }
        C0266 c0266M3541 = m3541();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0266M3541.f1463 = i;
        }
        if (z) {
            c0266M3541.f1465.m1361(c2785, 1.0f);
            c0266M3541.f1465.m1361(c2786, -1.0f);
        } else {
            c0266M3541.f1465.m1361(c2785, -1.0f);
            c0266M3541.f1465.m1361(c2786, 1.0f);
        }
        if (i2 != 8) {
            c0266M3541.m1367(this, i2);
        }
        m3532(c0266M3541);
    }

    public final void m3535(C2785 c2785, C2785 c2786, int i, int i2) {
        C0266 c0266M3541 = m3541();
        C2785 c2785M3542 = m3542();
        c2785M3542.f8888 = 0;
        c0266M3541.m1368(c2785, c2786, c2785M3542, i);
        if (i2 != 8) {
            c0266M3541.f1465.m1361(m3539(i2), (int) (c0266M3541.f1465.m1357(c2785M3542) * (-1.0f)));
        }
        m3532(c0266M3541);
    }

    public final void m3536(C2785 c2785, C2785 c2786, int i, int i2) {
        C0266 c0266M3541 = m3541();
        C2785 c2785M3542 = m3542();
        c2785M3542.f8888 = 0;
        c0266M3541.m1369(c2785, c2786, c2785M3542, i);
        if (i2 != 8) {
            c0266M3541.f1465.m1361(m3539(i2), (int) (c0266M3541.f1465.m1357(c2785M3542) * (-1.0f)));
        }
        m3532(c0266M3541);
    }

    public final void m3537(C0266 c0266) {
        int i;
        if (c0266.f1466) {
            c0266.f1462.m4765(this, c0266.f1463);
        } else {
            C0266[] c0266Arr = this.f5975;
            int i2 = this.f5979;
            c0266Arr[i2] = c0266;
            C2785 c2785 = c0266.f1462;
            c2785.f8887 = i2;
            this.f5979 = i2 + 1;
            c2785.m4766(this, c0266);
        }
        if (this.f5970) {
            int i3 = 0;
            while (i3 < this.f5979) {
                if (this.f5975[i3] == null) {
                    System.out.println("WTF");
                }
                C0266 c0267 = this.f5975[i3];
                if (c0267 != null && c0267.f1466) {
                    c0267.f1462.m4765(this, c0267.f1463);
                    ((C2379) this.f5981.f1404).m4343(c0267);
                    this.f5975[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f5979;
                        if (i4 >= i) {
                            break;
                        }
                        C0266[] c0266Arr2 = this.f5975;
                        int i6 = i4 - 1;
                        C0266 c0268 = c0266Arr2[i4];
                        c0266Arr2[i6] = c0268;
                        C2785 c2786 = c0268.f1462;
                        if (c2786.f8887 == i4) {
                            c2786.f8887 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f5975[i5] = null;
                    }
                    this.f5979 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f5970 = false;
        }
    }

    public final void m3538() {
        for (int i = 0; i < this.f5979; i++) {
            C0266 c0266 = this.f5975[i];
            c0266.f1462.f8889 = c0266.f1463;
        }
    }

    public final C2785 m3539(int i) {
        if (this.f5978 + 1 >= this.f5974) {
            m3543();
        }
        C2785 c2785M3530 = m3530(4);
        float[] fArr = c2785M3530.f8892;
        int i2 = this.f5971 + 1;
        this.f5971 = i2;
        this.f5978++;
        c2785M3530.f8886 = i2;
        c2785M3530.f8888 = i;
        ((C2785[]) this.f5981.f1406)[i2] = c2785M3530;
        C2403 c2403 = this.f5972;
        c2403.f7682.f7677 = c2785M3530;
        Arrays.fill(fArr, 0.0f);
        fArr[c2785M3530.f8888] = 1.0f;
        c2403.m4372(c2785M3530);
        return c2785M3530;
    }

    public final C2785 m3540(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f5978 + 1 >= this.f5974) {
            m3543();
        }
        if (!(obj instanceof C0779)) {
            return null;
        }
        C0779 c0779 = (C0779) obj;
        C2785 c2785 = c0779.f2884;
        if (c2785 == null) {
            c0779.m2280();
            c2785 = c0779.f2884;
        }
        int i = c2785.f8886;
        C0243 c0243 = this.f5981;
        if (i != -1 && i <= this.f5971 && ((C2785[]) c0243.f1406)[i] != null) {
            return c2785;
        }
        if (i != -1) {
            c2785.m4764();
        }
        int i2 = this.f5971 + 1;
        this.f5971 = i2;
        this.f5978++;
        c2785.f8886 = i2;
        c2785.f8896 = 1;
        ((C2785[]) c0243.f1406)[i2] = c2785;
        return c2785;
    }

    public final C0266 m3541() {
        Object obj;
        C0243 c0243 = this.f5981;
        C2379 c2379 = (C2379) c0243.f1404;
        int i = c2379.f7634;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2379.f7633;
            obj = objArr[i2];
            objArr[i2] = null;
            c2379.f7634 = i2;
        } else {
            obj = null;
        }
        C0266 c0266 = (C0266) obj;
        if (c0266 == null) {
            return new C0266(c0243);
        }
        c0266.f1462 = null;
        c0266.f1465.m1356();
        c0266.f1463 = 0.0f;
        c0266.f1466 = false;
        return c0266;
    }

    public final C2785 m3542() {
        if (this.f5978 + 1 >= this.f5974) {
            m3543();
        }
        C2785 c2785M3530 = m3530(3);
        int i = this.f5971 + 1;
        this.f5971 = i;
        this.f5978++;
        c2785M3530.f8886 = i;
        ((C2785[]) this.f5981.f1406)[i] = c2785M3530;
        return c2785M3530;
    }

    public final void m3543() {
        int i = this.f5973 * 2;
        this.f5973 = i;
        this.f5975 = (C0266[]) Arrays.copyOf(this.f5975, i);
        C0243 c0243 = this.f5981;
        c0243.f1406 = (C2785[]) Arrays.copyOf((C2785[]) c0243.f1406, this.f5973);
        int i2 = this.f5973;
        this.f5977 = new boolean[i2];
        this.f5974 = i2;
        this.f5980 = i2;
    }

    public final void m3544() {
        C2403 c2403 = this.f5972;
        if (c2403.mo1371()) {
            m3538();
            return;
        }
        if (!this.f5976) {
            m3545(c2403);
            return;
        }
        for (int i = 0; i < this.f5979; i++) {
            if (!this.f5975[i].f1466) {
                m3545(c2403);
                return;
            }
        }
        m3538();
    }

    public final void m3545(C2403 c2403) {
        for (int i = 0; i < this.f5979; i++) {
            C0266 c0266 = this.f5975[i];
            int i2 = 1;
            if (c0266.f1462.f8896 != 1) {
                float f = 0.0f;
                if (c0266.f1463 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += 1;
                        float f2 = 3.4028235E38f;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f5979) {
                            C0266 c0267 = this.f5975[i6];
                            if (c0267.f1462.f8896 != 1 && !c0267.f1466 && c0267.f1463 < 0.0f) {
                                int iM1358 = c0267.f1465.m1358();
                                int i8 = 0;
                                while (i8 < iM1358) {
                                    C2785 c2785M1359 = c0267.f1465.m1359(i8);
                                    float fM1357 = c0267.f1465.m1357(c2785M1359);
                                    if (fM1357 > 0.0f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c2785M1359.f8891[i9] / fM1357;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c2785M1359.f8886;
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
                            C0266 c0268 = this.f5975[i4];
                            c0268.f1462.f8887 = -1;
                            c0268.m1373(((C2785[]) this.f5981.f1406)[i5]);
                            C2785 c2785 = c0268.f1462;
                            c2785.f8887 = i4;
                            c2785.m4766(this, c0268);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f5978 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        m3546(c2403);
        m3538();
    }

    public final void m3546(C0266 c0266) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f5978; i2++) {
            this.f5977[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f5978 * 2) {
                return;
            }
            C2785 c2785 = c0266.f1462;
            if (c2785 != null) {
                this.f5977[c2785.f8886] = true;
            }
            C2785 c2785Mo1370 = c0266.mo1370(this.f5977);
            if (c2785Mo1370 != null) {
                boolean[] zArr = this.f5977;
                int i5 = c2785Mo1370.f8886;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (c2785Mo1370 != null) {
                float f = 3.4028235E38f;
                int i6 = 0;
                int i7 = -1;
                while (i6 < this.f5979) {
                    C0266 c0267 = this.f5975[i6];
                    if (c0267.f1462.f8896 != 1 && !c0267.f1466) {
                        C0257 c0257 = c0267.f1465;
                        int i8 = c0257.f1441;
                        if (i8 == -1) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i8 == -1 || i9 >= c0257.f1434) {
                                z = false;
                                break;
                            } else if (c0257.f1438[i8] == c2785Mo1370.f8886) {
                                z = true;
                                break;
                            } else {
                                i8 = c0257.f1439[i8];
                                i9++;
                            }
                        }
                        if (z) {
                            float fM1357 = c0267.f1465.m1357(c2785Mo1370);
                            if (fM1357 < 0.0f) {
                                float f2 = (-c0267.f1463) / fM1357;
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
                    C0266 c0268 = this.f5975[i7];
                    c0268.f1462.f8887 = -1;
                    c0268.m1373(c2785Mo1370);
                    C2785 c2786 = c0268.f1462;
                    c2786.f8887 = i7;
                    c2786.m4766(this, c0268);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void m3547() {
        for (int i = 0; i < this.f5979; i++) {
            C0266 c0266 = this.f5975[i];
            if (c0266 != null) {
                ((C2379) this.f5981.f1404).m4343(c0266);
            }
            this.f5975[i] = null;
        }
    }

    public final void m3548() {
        C0243 c0243;
        int i = 0;
        while (true) {
            c0243 = this.f5981;
            C2785[] c2785Arr = (C2785[]) c0243.f1406;
            if (i >= c2785Arr.length) {
                break;
            }
            C2785 c2785 = c2785Arr[i];
            if (c2785 != null) {
                c2785.m4764();
            }
            i++;
        }
        C2379 c2379 = (C2379) c0243.f1405;
        C2785[] c2785Arr2 = this.f5982;
        int length = this.f5983;
        
        if (length > c2785Arr2.length) {
            length = c2785Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C2785 c2786 = c2785Arr2[i2];
            int i3 = c2379.f7634;
            Object[] objArr = c2379.f7633;
            if (i3 < objArr.length) {
                objArr[i3] = c2786;
                c2379.f7634 = i3 + 1;
            }
        }
        this.f5983 = 0;
        Arrays.fill((C2785[]) c0243.f1406, (Object) null);
        this.f5971 = 0;
        C2403 c2403 = this.f5972;
        c2403.f7681 = 0;
        c2403.f1463 = 0.0f;
        this.f5978 = 1;
        for (int i4 = 0; i4 < this.f5979; i4++) {
            C0266 c0266 = this.f5975[i4];
        }
        m3547();
        this.f5979 = 0;
        this.f5984 = new C0266(c0243);
    }
}
