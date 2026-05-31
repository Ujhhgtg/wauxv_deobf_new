package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᲁᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1373 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f4900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0778 f4903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0778 f4904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0778 f4905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0778 f4906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f4907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f4908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f4916;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1374 f4917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C0792 f4901 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4902 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f4911 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f4912 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f4913 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f4914 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f4915 = 0;

    public C1373(C1374 c1374, int i, C0778 c0778, C0778 c0779, C0778 c07710, C0778 c07711, int i2) {
        this.f4917 = c1374;
        this.f4907 = 0;
        this.f4908 = 0;
        this.f4909 = 0;
        this.f4910 = 0;
        this.f4916 = 0;
        this.f4900 = i;
        this.f4903 = c0778;
        this.f4904 = c0779;
        this.f4905 = c07710;
        this.f4906 = c07711;
        this.f4907 = c1374.f4922;
        this.f4908 = c1374.f4918;
        this.f4909 = c1374.f4923;
        this.f4910 = c1374.f4919;
        this.f4916 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3188(C0792 c0792) {
        int i = this.f4900;
        C1374 c1374 = this.f4917;
        if (i == 0) {
            int iM3196 = c1374.m3196(c0792, this.f4916);
            if (c0792.f3141[0] == 3) {
                this.f4915++;
                iM3196 = 0;
            }
            this.f4911 = iM3196 + (c0792.f3132 != 8 ? c1374.f4941 : 0) + this.f4911;
            int iM3195 = c1374.m3195(c0792, this.f4916);
            if (this.f4901 == null || this.f4902 < iM3195) {
                this.f4901 = c0792;
                this.f4902 = iM3195;
                this.f4912 = iM3195;
            }
        } else {
            int iM3197 = c1374.m3196(c0792, this.f4916);
            int iM3198 = c1374.m3195(c0792, this.f4916);
            if (c0792.f3141[1] == 3) {
                this.f4915++;
                iM3198 = 0;
            }
            this.f4912 = iM3198 + (c0792.f3132 != 8 ? c1374.f4942 : 0) + this.f4912;
            if (this.f4901 == null || this.f4902 < iM3197) {
                this.f4901 = c0792;
                this.f4902 = iM3197;
                this.f4911 = iM3197;
            }
        }
        this.f4914++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3189(int i, boolean z, boolean z2) {
        C1374 c1374;
        int i2;
        C0792 c0792;
        char c;
        int i3;
        int i4;
        int i5;
        int i6 = this.f4914;
        int i7 = 0;
        while (true) {
            c1374 = this.f4917;
            if (i7 >= i6 || (i5 = this.f4913 + i7) >= c1374.f4953) {
                break;
            }
            C0792 c0793 = c1374.f4952[i5];
            if (c0793 != null) {
                c0793.m2441();
            }
            i7++;
        }
        if (i6 == 0 || this.f4901 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f4913 + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= c1374.f4953) {
                break;
            }
            if (c1374.f4952[i11].f3132 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.f4900 != 0) {
            C0792 c0794 = this.f4901;
            c0794.f3134 = c1374.f4929;
            C0778 c0778 = c0794.f3108;
            C0778 c0779 = c0794.f3110;
            int i12 = this.f4907;
            if (i > 0) {
                i12 += c1374.f4941;
            }
            if (z) {
                c0779.m2385(this.f4905, i12);
                if (z2) {
                    c0778.m2385(this.f4903, this.f4909);
                }
                if (i > 0) {
                    this.f4905.f2886.f3108.m2385(c0779, 0);
                }
            } else {
                c0778.m2385(this.f4903, i12);
                if (z2) {
                    c0779.m2385(this.f4905, this.f4909);
                }
                if (i > 0) {
                    this.f4903.f2886.f3110.m2385(c0778, 0);
                }
            }
            C0792 c0795 = null;
            int i13 = 0;
            while (i13 < i6) {
                int i14 = this.f4913 + i13;
                if (i14 >= c1374.f4953) {
                    return;
                }
                C0792 c0796 = c1374.f4952[i14];
                if (i13 == 0) {
                    c0796.m2423(c0796.f3109, this.f4904, this.f4908);
                    int i15 = c1374.f4930;
                    float f = c1374.f4936;
                    if (this.f4913 == 0) {
                        int i16 = c1374.f4932;
                        i2 = -1;
                        if (i16 != -1) {
                            f = c1374.f4938;
                        }
                        i15 = i16;
                        c0796.f3135 = i15;
                        c0796.f3130 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i16 = c1374.f4934) != i2) {
                        f = c1374.f4940;
                        i15 = i16;
                    }
                    c0796.f3135 = i15;
                    c0796.f3130 = f;
                }
                if (i13 == i6 - 1) {
                    c0796.m2423(c0796.f3111, this.f4906, this.f4910);
                }
                if (c0795 != null) {
                    C0778 c07710 = c0795.f3111;
                    C0778 c07711 = c0796.f3109;
                    c07711.m2385(c07710, c1374.f4942);
                    if (i13 == i8) {
                        int i17 = this.f4908;
                        if (c07711.m2392()) {
                            c07711.f2890 = i17;
                        }
                    }
                    c07710.m2385(c07711, 0);
                    if (i13 == i9 + 1) {
                        int i18 = this.f4910;
                        if (c07710.m2392()) {
                            c07710.f2890 = i18;
                        }
                    }
                }
                if (c0796 != c0794) {
                    if (z) {
                        int i19 = c1374.f4943;
                        if (i19 == 0) {
                            c0796.f3110.m2385(c0779, 0);
                        } else if (i19 == 1) {
                            c0796.f3108.m2385(c0778, 0);
                        } else if (i19 == 2) {
                            c0796.f3108.m2385(c0778, 0);
                            c0796.f3110.m2385(c0779, 0);
                        }
                    } else {
                        int i20 = c1374.f4943;
                        if (i20 == 0) {
                            c0796.f3108.m2385(c0778, 0);
                        } else if (i20 == 1) {
                            c0796.f3110.m2385(c0779, 0);
                        } else if (i20 == 2) {
                            if (z3) {
                                c0796.f3108.m2385(this.f4903, this.f4907);
                                c0796.f3110.m2385(this.f4905, this.f4909);
                            } else {
                                c0796.f3108.m2385(c0778, 0);
                                c0796.f3110.m2385(c0779, 0);
                            }
                        }
                    }
                }
                i13++;
                c0795 = c0796;
            }
            return;
        }
        C0792 c0797 = this.f4901;
        c0797.f3135 = c1374.f4930;
        C0778 c07712 = c0797.f3111;
        C0778 c07713 = c0797.f3109;
        int i21 = this.f4908;
        if (i > 0) {
            i21 += c1374.f4942;
        }
        c07713.m2385(this.f4904, i21);
        if (z2) {
            c07712.m2385(this.f4906, this.f4910);
        }
        if (i > 0) {
            this.f4904.f2886.f3111.m2385(c07713, 0);
        }
        if (c1374.f4944 != 3 || c0797.f3104) {
            c0792 = c0797;
            break;
        }
        int i22 = 0;
        while (true) {
            if (i22 < i6) {
                int i23 = this.f4913 + (z ? (i6 - 1) - i22 : i22);
                if (i23 < c1374.f4953) {
                    c0792 = c1374.f4952[i23];
                    if (c0792.f3104) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            c0792 = c0797;
            break;
        }
        int i24 = 0;
        C0792 c0798 = null;
        while (i24 < i6) {
            int i25 = z ? (i6 - 1) - i24 : i24;
            int i26 = this.f4913 + i25;
            if (i26 >= c1374.f4953) {
                return;
            }
            C0792 c0799 = c1374.f4952[i26];
            if (i24 == 0) {
                c0799.m2423(c0799.f3108, this.f4903, this.f4907);
            }
            if (i25 == 0) {
                int i27 = c1374.f4929;
                float f2 = c1374.f4935;
                if (this.f4913 == 0) {
                    int i28 = c1374.f4931;
                    i3 = -1;
                    if (i28 != -1) {
                        f2 = c1374.f4937;
                    }
                    i4 = i28;
                    c0799.f3134 = i4;
                    c0799.f3129 = f2;
                } else {
                    i3 = -1;
                }
                if (!z2 || (i28 = c1374.f4933) == i3) {
                    i4 = i27;
                } else {
                    f2 = c1374.f4939;
                    i4 = i28;
                }
                c0799.f3134 = i4;
                c0799.f3129 = f2;
            }
            if (i24 == i6 - 1) {
                c0799.m2423(c0799.f3110, this.f4905, this.f4909);
            }
            if (c0798 != null) {
                C0778 c07714 = c0798.f3110;
                C0778 c07715 = c0799.f3108;
                c07715.m2385(c07714, c1374.f4941);
                if (i24 == i8) {
                    int i29 = this.f4907;
                    if (c07715.m2392()) {
                        c07715.f2890 = i29;
                    }
                }
                c07714.m2385(c07715, 0);
                if (i24 == i9 + 1) {
                    int i30 = this.f4909;
                    if (c07714.m2392()) {
                        c07714.f2890 = i30;
                    }
                }
            }
            if (c0799 != c0797) {
                int i31 = c1374.f4944;
                c = 3;
                if (i31 == 3 && c0792.f3104 && c0799 != c0792 && c0799.f3104) {
                    c0799.f3112.m2385(c0792.f3112, 0);
                } else if (i31 == 0) {
                    c0799.f3109.m2385(c07713, 0);
                } else if (i31 == 1) {
                    c0799.f3111.m2385(c07712, 0);
                } else if (z3) {
                    c0799.f3109.m2385(this.f4904, this.f4908);
                    c0799.f3111.m2385(this.f4906, this.f4910);
                } else {
                    c0799.f3109.m2385(c07713, 0);
                    c0799.f3111.m2385(c07712, 0);
                }
            } else {
                c = 3;
            }
            i24++;
            c0798 = c0799;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m3190() {
        return this.f4900 == 1 ? this.f4912 - this.f4917.f4942 : this.f4912;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m3191() {
        return this.f4900 == 0 ? this.f4911 - this.f4917.f4941 : this.f4911;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3192(int i) {
        C1374 c1374;
        int i2;
        int i3 = this.f4915;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4914;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c1374 = this.f4917;
            if (i6 >= i4 || (i2 = this.f4913 + i6) >= c1374.f4953) {
                break;
            }
            C0792 c0792 = c1374.f4952[i2];
            if (this.f4900 == 0) {
                if (c0792 != null) {
                    int[] iArr = c0792.f3141;
                    if (iArr[0] == 3 && c0792.f3091 == 0) {
                        c1374.m3197(1, i5, iArr[1], c0792.m2428(), c0792);
                    }
                }
            } else if (c0792 != null) {
                int[] iArr2 = c0792.f3141;
                if (iArr2[1] == 3 && c0792.f3092 == 0) {
                    int i7 = i5;
                    c1374.m3197(iArr2[0], c0792.m2431(), 1, i7, c0792);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f4911 = 0;
        this.f4912 = 0;
        this.f4901 = null;
        this.f4902 = 0;
        int i8 = this.f4914;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f4913 + i9;
            if (i10 >= c1374.f4953) {
                return;
            }
            C0792 c0793 = c1374.f4952[i10];
            if (this.f4900 == 0) {
                int iM2431 = c0793.m2431();
                int i11 = c1374.f4941;
                if (c0793.f3132 == 8) {
                    i11 = 0;
                }
                this.f4911 = iM2431 + i11 + this.f4911;
                int iM3195 = c1374.m3195(c0793, this.f4916);
                if (this.f4901 == null || this.f4902 < iM3195) {
                    this.f4901 = c0793;
                    this.f4902 = iM3195;
                    this.f4912 = iM3195;
                }
            } else {
                int iM3196 = c1374.m3196(c0793, this.f4916);
                int iM3197 = c1374.m3195(c0793, this.f4916);
                int i12 = c1374.f4942;
                if (c0793.f3132 == 8) {
                    i12 = 0;
                }
                this.f4912 = iM3197 + i12 + this.f4912;
                if (this.f4901 == null || this.f4902 < iM3196) {
                    this.f4901 = c0793;
                    this.f4902 = iM3196;
                    this.f4911 = iM3196;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3193(int i, C0778 c0778, C0778 c0779, C0778 c07710, C0778 c07711, int i2, int i3, int i4, int i5, int i6) {
        this.f4900 = i;
        this.f4903 = c0778;
        this.f4904 = c0779;
        this.f4905 = c07710;
        this.f4906 = c07711;
        this.f4907 = i2;
        this.f4908 = i3;
        this.f4909 = i4;
        this.f4910 = i5;
        this.f4916 = i6;
    }
}
