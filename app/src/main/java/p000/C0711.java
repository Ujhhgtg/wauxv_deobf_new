package p000;

import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0711 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f2699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f2703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int[] f2705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1316 f2706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1316 f2707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1983 f2708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1983 f2709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f2710;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2870 f2700 = new C2870(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f2711 = 4;

    /* JADX WARN: Code duplicated, block: B:160:0x0326  */
    /* JADX WARN: Code duplicated, block: B:162:0x033f A[LOOP:8: B:161:0x033d->B:162:0x033f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0358  */
    /* JADX WARN: Code duplicated, block: B:169:0x0368  */
    /* JADX WARN: Code duplicated, block: B:215:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x0326, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] m2136() {
        int i;
        int i2;
        int i3;
        C2870 c2870;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 2;
        int i13 = (this.f2704 * 2) + 24;
        C1316 c1316 = this.f2706;
        int i14 = 0;
        while (true) {
            i = 131072;
            if (c1316 == null) {
                break;
            }
            i14++;
            int i15 = c1316.f4757;
            C2870 c2871 = (C2870) c1316.f4762;
            if (c1316.f4760 != 0) {
                c2871.m4871("ConstantValue");
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & 4096) != 0 && c2871.f9200 < 49) {
                c2871.m4871("Synthetic");
                i11 += 6;
            }
            if ((i15 & 131072) != 0) {
                c2871.m4871("Deprecated");
                i11 += 6;
            }
            i13 += i11;
            c1316 = (C1316) c1316.f4761;
        }
        C1983 c1983 = this.f2708;
        int i16 = 0;
        while (true) {
            String str = "StackMap";
            int i17 = 131072;
            int i18 = 8;
            if (c1983 == null) {
                int i19 = i13;
                int i20 = 2;
                int i21 = this.f2701 & 4096;
                C2870 c2872 = this.f2700;
                if (i21 == 0 || (this.f2699 & 65535) >= 49) {
                    i2 = i19;
                    i3 = 0;
                } else {
                    i2 = i19 + 6;
                    c2872.m4871("Synthetic");
                    i3 = 1;
                }
                if (this.f2710 != 0) {
                    i3++;
                    i2 += 8;
                    c2872.m4871("Signature");
                }
                if ((this.f2701 & 131072) != 0) {
                    i3++;
                    i2 += 6;
                    c2872.m4871("Deprecated");
                }
                
                C0516 c0516 = c2872.f9205;
                int i22 = i2 + c0516.f2191;
                if (c2872.f9204 > 65535) {
                    throw new IndexOutOfBoundsException("Class file too large!");
                }
                C0516 c0517 = new C0516();
                c0517.f2190 = new byte[i22];
                c0517.m1823(-889275714);
                c0517.m1823(this.f2699);
                c0517.m1824(c2872.f9204);
                c0517.m1822(c0516.f2191, c0516.f2190);
                c0517.m1824((~((this.f2699 & 65535) < 49 ? 4096 : 0)) & this.f2701);
                c0517.m1824(this.f2702);
                c0517.m1824(this.f2703);
                c0517.m1824(this.f2704);
                for (int i23 = 0; i23 < this.f2704; i23++) {
                    c0517.m1824(this.f2705[i23]);
                }
                c0517.m1824(i14);
                C1316 c1317 = this.f2706;
                while (c1317 != null) {
                    int i24 = c1317.f4760;
                    int i25 = c1317.f4757;
                    C2870 c2873 = (C2870) c1317.f4762;
                    String str2 = "StackMap";
                    C2870 c2874 = c2872;
                    boolean z = c2873.f9200 < 49;
                    c0517.m1824((~(z ? 4096 : 0)) & i25);
                    c0517.m1824(c1317.f4758);
                    c0517.m1824(c1317.f4759);
                    int i26 = i24 != 0 ? 1 : 0;
                    boolean z2 = z;
                    int i27 = i25 & 4096;
                    if (i27 != 0 && z2) {
                        i26++;
                    }
                    int i28 = i25 & 131072;
                    if (i28 != 0) {
                        i26++;
                    }
                    c0517.m1824(i26);
                    if (i24 != 0) {
                        c0517.m1824(c2873.m4871("ConstantValue"));
                        c0517.m1823(2);
                        c0517.m1824(i24);
                    }
                    if (i27 == 0 || !z2) {
                        i9 = 0;
                    } else {
                        c0517.m1824(c2873.m4871("Synthetic"));
                        i9 = 0;
                        c0517.m1823(0);
                    }
                    if (i28 != 0) {
                        c0517.m1824(c2873.m4871("Deprecated"));
                        c0517.m1823(0);
                    }
                    c1317 = (C1316) c1317.f4761;
                    str = "StackMap";
                    c2872 = c2874;
                    i20 = 2;
                }
                C2870 c2875 = c2872;
                String str3 = "StackMap";
                c0517.m1824(i16);
                C1983 c1984 = this.f2708;
                boolean z3 = false;
                boolean z4 = false;
                while (c1984 != null) {
                    boolean z5 = z3 | (c1984.f6578 > 0);
                    boolean z6 = z4 | c1984.f6592;
                    int i29 = c1984.f6582;
                    int i30 = c1984.f6580;
                    C0516 c0518 = c1984.f6576;
                    int i31 = c1984.f6570;
                    C2870 c2876 = c1984.f6569;
                    boolean z7 = c2876.f9200 < 49;
                    c0517.m1824((~(z7 ? 4096 : 0)) & i31);
                    c0517.m1824(c1984.f6571);
                    c0517.m1824(c1984.f6572);
                    int i32 = c0518.f2191 > 0 ? 1 : 0;
                    if (i30 > 0) {
                        i32++;
                    }
                    boolean z8 = z7;
                    int i33 = i31 & 4096;
                    if (i33 != 0 && z8) {
                        i32++;
                    }
                    if (i29 != 0) {
                        i32++;
                    }
                    int i34 = i31 & 131072;
                    if (i34 != 0) {
                        i32++;
                    }
                    c0517.m1824(i32);
                    int i35 = c0518.f2191;
                    if (i35 > 0) {
                        int i36 = i35 + 10;
                        i4 = i33;
                        i5 = i34;
                        int i37 = 0;
                        for (C0243 c0243 = c1984.f6577; c0243 != null; c0243 = (C0243) c0243.f1406) {
                            i37++;
                        }
                        i6 = 8;
                        int iM4736 = AbstractC2784.m4736(i37, 8, 2, i36);
                        C0516 c0519 = c1984.f6579;
                        if (c0519 != null) {
                            iM4736 += c0519.f2191 + 8;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        c0517.m1824(c2876.m4871("Code"));
                        c0517.m1823(iM4736);
                        c0517.m1824(c1984.f6574);
                        c0517.m1824(c1984.f6575);
                        c0517.m1823(c0518.f2191);
                        c0517.m1822(c0518.f2191, c0518.f2190);
                        C0243 c0244 = c1984.f6577;
                        int i38 = 0;
                        for (C0243 c0245 = c0244; c0245 != null; c0245 = (C0243) c0245.f1406) {
                            i38++;
                        }
                        c0517.m1824(i38);
                        if (c0244 != null) {
                            c0517.m1824(((C1752) c0244.f1404).f5861);
                            c0517.m1824(((C1752) c0244.f1405).f5861);
                            throw null;
                        }
                        c0517.m1824(i8);
                        if (c1984.f6579 != null) {
                            c0517.m1824(c2876.m4871(c2876.f9200 >= 50 ? "StackMapTable" : "StackMap"));
                            c0517.m1823(c1984.f6579.f2191 + 2);
                            c0517.m1824(c1984.f6578);
                            C0516 c05110 = c1984.f6579;
                            c0517.m1822(c05110.f2191, c05110.f2190);
                        }
                        if (i30 > 0) {
                            c0517.m1824(c2876.m4871("Exceptions"));
                            c0517.m1823((i30 * 2) + 2);
                            c0517.m1824(i30);
                            for (int i39 : c1984.f6581) {
                                c0517.m1824(i39);
                            }
                        }
                        if (i4 != 0 && z8) {
                            c0517.m1824(c2876.m4871("Synthetic"));
                            c0517.m1823(0);
                        }
                        if (i29 != 0) {
                            c0517.m1824(c2876.m4871("Signature"));
                            c0517.m1823(2);
                            c0517.m1824(i29);
                        }
                        if (i5 != 0) {
                            c0517.m1824(c2876.m4871("Deprecated"));
                            c0517.m1823(0);
                        }
                        c1984 = c1984.f6568;
                        i18 = 8;
                        z3 = z5;
                        z4 = z6;
                    } else {
                        i4 = i33;
                        i5 = i34;
                        i6 = 8;
                    }
                    if (i30 > 0) {
                        c0517.m1824(c2876.m4871("Exceptions"));
                        c0517.m1823((i30 * 2) + 2);
                        c0517.m1824(i30);
                        while (i7 < r5) {
                            c0517.m1824(i39);
                        }
                    }
                    if (i4 != 0) {
                        c0517.m1824(c2876.m4871("Synthetic"));
                        c0517.m1823(0);
                    }
                    if (i29 != 0) {
                        c0517.m1824(c2876.m4871("Signature"));
                        c0517.m1823(2);
                        c0517.m1824(i29);
                    }
                    if (i5 != 0) {
                        c0517.m1824(c2876.m4871("Deprecated"));
                        c0517.m1823(0);
                    }
                    c1984 = c1984.f6568;
                    i18 = 8;
                    z3 = z5;
                    z4 = z6;
                }
                c0517.m1824(i3);
                if ((this.f2701 & 4096) == 0 || (this.f2699 & 65535) >= 49) {
                    c2870 = c2875;
                } else {
                    c2870 = c2875;
                    c0517.m1824(c2870.m4871("Synthetic"));
                    c0517.m1823(0);
                }
                if (this.f2710 != 0) {
                    c0517.m1824(c2870.m4871("Signature"));
                    c0517.m1823(2);
                    c0517.m1824(this.f2710);
                }
                if ((this.f2701 & 131072) != 0) {
                    c0517.m1824(c2870.m4871("Deprecated"));
                    c0517.m1823(0);
                }
                if (!z4) {
                    return c0517.f2190;
                }
                AbstractC1270[] abstractC1270Arr = new AbstractC1270[6];
                for (C1316 c1318 = this.f2706; c1318 != null; c1318 = (C1316) c1318.f4761) {
                }
                for (C1983 c1985 = this.f2708; c1985 != null; c1985 = c1985.f6568) {
                }
                System.arraycopy(abstractC1270Arr, 0, new AbstractC1270[0], 0, 0);
                this.f2706 = null;
                this.f2707 = null;
                this.f2708 = null;
                this.f2709 = null;
                this.f2711 = z3 ? 3 : 0;
                return m2136();
            }
            i16++;
            int i40 = 2;
            int i41 = c1983.f6570;
            int i42 = c1983.f6580;
            C2870 c2877 = c1983.f6569;
            C0516 c05111 = c1983.f6576;
            int i43 = i13;
            int i44 = c05111.f2191;
            if (i44 <= 0) {
                i10 = 8;
            } else {
                if (i44 > 65535) {
                    throw new IndexOutOfBoundsException("Method code too large!");
                }
                c2877.m4871("Code");
                int i45 = c05111.f2191 + 16;
                int i46 = 0;
                for (C0243 c0246 = c1983.f6577; c0246 != null; c0246 = (C0243) c0246.f1406) {
                    i46++;
                }
                i10 = (i46 * 8) + 2 + i45 + 8;
                if (c1983.f6579 != null) {
                    c2877.m4871(c2877.f9200 >= 50 ? "StackMapTable" : "StackMap");
                    i10 += c1983.f6579.f2191 + 8;
                }
            }
            if (i42 > 0) {
                c2877.m4871("Exceptions");
                i10 += (i42 * 2) + 8;
            }
            boolean z9 = c2877.f9200 < 49;
            if ((i41 & 4096) != 0 && z9) {
                c2877.m4871("Synthetic");
                i10 += 6;
            }
            if (c1983.f6582 != 0) {
                c2877.m4871("Signature");
                i10 += 8;
            }
            if ((i41 & 131072) != 0) {
                c2877.m4871("Deprecated");
                i10 += 6;
            }
            i13 = i43 + i10;
            c1983 = c1983.f6568;
            i = 131072;
            i12 = 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2137(int i, String str, String str2, String str3, String[] strArr) {
        this.f2699 = 52;
        this.f2701 = i;
        C2870 c2870 = this.f2700;
        c2870.f9200 = 52;
        c2870.f9201 = str;
        this.f2702 = c2870.m4872(7, str).f9191;
        if (str2 != null) {
            this.f2710 = c2870.m4871(str2);
        }
        this.f2703 = str3 == null ? 0 : c2870.m4872(7, str3).f9191;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f2704 = length;
            this.f2705 = new int[length];
            for (int i2 = 0; i2 < this.f2704; i2++) {
                this.f2705[i2] = c2870.m4872(7, strArr[i2]).f9191;
            }
        }
        if (this.f2711 == 1) {
            this.f2711 = 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2138(int i, String str, String str2, String str3) {
        C1316 c1316 = new C1316(this.f2700, i, str, str2, str3);
        if (this.f2706 == null) {
            this.f2706 = c1316;
        } else {
            this.f2707.f4761 = c1316;
        }
        this.f2707 = c1316;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1983 m2139(int i, String str, String str2, String str3, String[] strArr) {
        C1983 c1983 = new C1983(this.f2700, i, str, str2, str3, strArr, this.f2711);
        if (this.f2708 == null) {
            this.f2708 = c1983;
        } else {
            this.f2709.f6568 = c1983;
        }
        this.f2709 = c1983;
        return c1983;
    }
}
