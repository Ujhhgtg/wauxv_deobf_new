package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1367 extends AbstractC1532 {

    public int f4893;

    public int f4894;

    public int f4895;

    public int f4896;

    public int f4897;

    public int f4898;

    public boolean f4899;

    public int f4900;

    public int f4901;

    public C0407 f4902;

    public C0784 f4903;

    public int f4904;

    public int f4905;

    public int f4906;

    public int f4907;

    public int f4908;

    public int f4909;

    public float f4910;

    public float f4911;

    public float f4912;

    public float f4913;

    public float f4914;

    public float f4915;

    public int f4916;

    public int f4917;

    public int f4918;

    public int f4919;

    public int f4920;

    public int f4921;

    public int f4922;

    public ArrayList f4923;

    public C0793[] f4924;

    public C0793[] f4925;

    public int[] f4926;

    public C0793[] f4927;

    public int f4928;

    @Override // p000.C0793
    public final void mo1485(C1791 c1791, boolean z) {
        C0793 c0793;
        ArrayList arrayList = this.f4923;
        super.mo1485(c1791, z);
        C0793 c0794 = this.f3112;
        boolean z2 = c0794 != null ? ((C0794) c0794).f3139 : false;
        int i = this.f4920;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C1366) arrayList.get(i2)).m3081(i2, z2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.f4926 != null && this.f4925 != null && this.f4924 != null) {
                for (int i3 = 0; i3 < this.f4928; i3++) {
                    this.f4927[i3].m2326();
                }
                int[] iArr = this.f4926;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C0793 c0795 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C0793 c0796 = this.f4925[z2 ? (i4 - i6) - 1 : i6];
                    if (c0796 != null) {
                        C0779 c0779 = c0796.f3101;
                        if (c0796.f3125 != 8) {
                            if (i6 == 0) {
                                c0796.m2308(c0779, this.f3101, this.f4897);
                                c0796.f3127 = this.f4904;
                                c0796.f3122 = this.f4910;
                            }
                            if (i6 == i4 - 1) {
                                c0796.m2308(c0796.f3103, this.f3103, this.f4898);
                            }
                            if (i6 > 0) {
                                c0796.m2308(c0779, c0795.f3103, this.f4916);
                                c0795.m2308(c0795.f3103, c0779, 0);
                            }
                            c0795 = c0796;
                        }
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C0793 c0797 = this.f4924[i7];
                    if (c0797 != null) {
                        C0779 c07710 = c0797.f3102;
                        if (c0797.f3125 != 8) {
                            if (i7 == 0) {
                                c0797.m2308(c07710, this.f3102, this.f4893);
                                c0797.f3128 = this.f4905;
                                c0797.f3123 = this.f4911;
                            }
                            if (i7 == i5 - 1) {
                                c0797.m2308(c0797.f3104, this.f3104, this.f4894);
                            }
                            if (i7 > 0) {
                                c0797.m2308(c07710, c0795.f3104, this.f4917);
                                c0795.m2308(c0795.f3104, c07710, 0);
                            }
                            c0795 = c0797;
                        }
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f4922 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C0793[] c0793Arr = this.f4927;
                        if (i10 < c0793Arr.length && (c0793 = c0793Arr[i10]) != null && c0793.f3125 != 8) {
                            C0793 c0798 = this.f4925[i8];
                            C0793 c0799 = this.f4924[i9];
                            if (c0793 != c0798) {
                                c0793.m2308(c0793.f3101, c0798.f3101, 0);
                                c0793.m2308(c0793.f3103, c0798.f3103, 0);
                            }
                            if (c0793 != c0799) {
                                c0793.m2308(c0793.f3102, c0799.f3102, 0);
                                c0793.m2308(c0793.f3104, c0799.f3104, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1366) arrayList.get(0)).m3081(0, z2, true);
        }
        this.f4899 = false;
    }

    @Override // p000.AbstractC1532
    public final void mo3086() {
        for (int i = 0; i < this.f5368; i++) {
            C0793 c0793 = this.f5367[i];
            if (c0793 != null) {
                c0793.f3098 = true;
            }
        }
    }

    public final int m3087(C0793 c0793, int i) {
        C0793 c0794;
        if (c0793 != null) {
            int[] iArr = c0793.f3134;
            if (iArr[1] == 3) {
                int i2 = c0793.f3085;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0793.f3092 * i);
                        if (i3 != c0793.m2313()) {
                            c0793.f3079 = true;
                            m3089(iArr[0], c0793.m2316(), 1, i3, c0793);
                        }
                        return i3;
                    }
                    c0794 = c0793;
                    if (i2 == 1) {
                        return c0794.m2313();
                    }
                    if (i2 == 3) {
                        return (int) ((c0794.m2316() * c0794.f3115) + 0.5f);
                    }
                }
            } else {
                c0794 = c0793;
            }
            return c0794.m2313();
        }
        return 0;
    }

    public final int m3088(C0793 c0793, int i) {
        C0793 c0794;
        if (c0793 != null) {
            int[] iArr = c0793.f3134;
            if (iArr[0] == 3) {
                int i2 = c0793.f3084;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0793.f3089 * i);
                        if (i3 != c0793.m2316()) {
                            c0793.f3079 = true;
                            m3089(1, i3, iArr[1], c0793.m2313(), c0793);
                        }
                        return i3;
                    }
                    c0794 = c0793;
                    if (i2 == 1) {
                        return c0794.m2316();
                    }
                    if (i2 == 3) {
                        return (int) ((c0794.m2313() * c0794.f3115) + 0.5f);
                    }
                }
            } else {
                c0794 = c0793;
            }
            return c0794.m2316();
        }
        return 0;
    }

    public final void m3089(int i, int i2, int i3, int i4, C0793 c0793) {
        C0784 c0784;
        C0793 c0794;
        C0407 c0407 = this.f4902;
        while (true) {
            c0784 = this.f4903;
            if (c0784 != null || (c0794 = this.f3112) == null) {
                break;
            } else {
                this.f4903 = ((C0794) c0794).f3138;
            }
        }
        c0407.f1910 = i;
        c0407.f1911 = i3;
        c0407.f1912 = i2;
        c0407.f1913 = i4;
        c0784.m2293(c0793, c0407);
        c0793.m2334(c0407.f1914);
        c0793.m2331(c0407.f1915);
        c0793.f3097 = c0407.f1917;
        c0793.m2328(c0407.f1916);
    }
}
