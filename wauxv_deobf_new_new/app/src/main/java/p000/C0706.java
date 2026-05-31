package p000;

import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0706 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f2693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f2697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2698;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int[] f2699;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C1317 f2700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1317 f2701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C2014 f2702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C2014 f2703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f2704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2930 f2694 = new C2930(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f2705 = 4;

    /* JADX WARN: Code duplicated, block: B:160:0x0326  */
    /* JADX WARN: Code duplicated, block: B:162:0x033f A[LOOP:8: B:161:0x033d->B:162:0x033f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0358  */
    /* JADX WARN: Code duplicated, block: B:169:0x0368  */
    /* JADX WARN: Code duplicated, block: B:215:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x0326, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final byte[] m2229() {
        int i;
        int i2;
        int i3;
        C2930 c2930;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 2;
        int i13 = (this.f2698 * 2) + 24;
        C1317 c1317 = this.f2700;
        int i14 = 0;
        while (true) {
            i = 131072;
            if (c1317 == null) {
                break;
            }
            i14++;
            int i15 = c1317.f4756;
            C2930 c2931 = (C2930) c1317.f4761;
            if (c1317.f4759 != 0) {
                c2931.m4932("ConstantValue");
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & 4096) != 0 && c2931.f9370 < 49) {
                c2931.m4932("Synthetic");
                i11 += 6;
            }
            if ((i15 & 131072) != 0) {
                c2931.m4932("Deprecated");
                i11 += 6;
            }
            i13 += i11;
            c1317 = (C1317) c1317.f4760;
        }
        C2014 c2014 = this.f2702;
        int i16 = 0;
        while (true) {
            String str = "StackMap";
            int i17 = i;
            int i18 = 8;
            if (c2014 == null) {
                int i19 = i13;
                int i20 = i12;
                int i21 = this.f2695 & 4096;
                C2930 c2932 = this.f2694;
                if (i21 == 0 || (this.f2693 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 49) {
                    i2 = i19;
                    i3 = 0;
                } else {
                    i2 = i19 + 6;
                    c2932.m4932("Synthetic");
                    i3 = 1;
                }
                if (this.f2704 != 0) {
                    i3++;
                    i2 += 8;
                    c2932.m4932("Signature");
                }
                if ((this.f2695 & i17) != 0) {
                    i3++;
                    i2 += 6;
                    c2932.m4932("Deprecated");
                }
                c2932.getClass();
                C0493 c0493 = c2932.f9375;
                int i22 = i2 + c0493.f2147;
                if (c2932.f9374 > 65535) {
                    throw new IndexOutOfBoundsException("Class file too large!");
                }
                C0493 c0494 = new C0493();
                c0494.f2146 = new byte[i22];
                c0494.m1917(-889275714);
                c0494.m1917(this.f2693);
                c0494.m1918(c2932.f9374);
                c0494.m1916(c0493.f2147, c0493.f2146);
                c0494.m1918((~((this.f2693 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49 ? 4096 : 0)) & this.f2695);
                c0494.m1918(this.f2696);
                c0494.m1918(this.f2697);
                c0494.m1918(this.f2698);
                for (int i23 = 0; i23 < this.f2698; i23++) {
                    c0494.m1918(this.f2699[i23]);
                }
                c0494.m1918(i14);
                C1317 c1318 = this.f2700;
                while (c1318 != null) {
                    int i24 = c1318.f4759;
                    int i25 = c1318.f4756;
                    C2930 c2933 = (C2930) c1318.f4761;
                    String str2 = str;
                    C2930 c2934 = c2932;
                    boolean z = c2933.f9370 < 49;
                    c0494.m1918((~(z ? 4096 : 0)) & i25);
                    c0494.m1918(c1318.f4757);
                    c0494.m1918(c1318.f4758);
                    int i26 = i24 != 0 ? 1 : 0;
                    boolean z2 = z;
                    int i27 = i25 & 4096;
                    if (i27 != 0 && z2) {
                        i26++;
                    }
                    int i28 = i25 & i17;
                    if (i28 != 0) {
                        i26++;
                    }
                    c0494.m1918(i26);
                    if (i24 != 0) {
                        c0494.m1918(c2933.m4932("ConstantValue"));
                        c0494.m1917(i20);
                        c0494.m1918(i24);
                    }
                    if (i27 == 0 || !z2) {
                        i9 = 0;
                    } else {
                        c0494.m1918(c2933.m4932("Synthetic"));
                        i9 = 0;
                        c0494.m1917(0);
                    }
                    if (i28 != 0) {
                        c0494.m1918(c2933.m4932("Deprecated"));
                        c0494.m1917(i9);
                    }
                    c1318 = (C1317) c1318.f4760;
                    str = str2;
                    c2932 = c2934;
                    i20 = 2;
                }
                C2930 c2935 = c2932;
                String str3 = str;
                c0494.m1918(i16);
                C2014 c2015 = this.f2702;
                boolean z3 = false;
                boolean z4 = false;
                while (c2015 != null) {
                    boolean z5 = z3 | (c2015.f6683 > 0);
                    boolean z6 = z4 | c2015.f6697;
                    int i29 = c2015.f6687;
                    int i30 = c2015.f6685;
                    C0493 c0495 = c2015.f6681;
                    int i31 = c2015.f6675;
                    C2930 c2936 = c2015.f6674;
                    boolean z7 = c2936.f9370 < 49;
                    c0494.m1918((~(z7 ? 4096 : 0)) & i31);
                    c0494.m1918(c2015.f6676);
                    c0494.m1918(c2015.f6677);
                    int i32 = c0495.f2147 > 0 ? 1 : 0;
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
                    int i34 = i31 & i17;
                    if (i34 != 0) {
                        i32++;
                    }
                    c0494.m1918(i32);
                    int i35 = c0495.f2147;
                    if (i35 > 0) {
                        int i36 = i35 + 10;
                        i4 = i33;
                        i5 = i34;
                        int i37 = 0;
                        for (C0253 c0253 = c2015.f6682; c0253 != null; c0253 = (C0253) c0253.f1480) {
                            i37++;
                        }
                        i6 = i18;
                        int iM4770 = AbstractC2844.m4770(i37, i6, 2, i36);
                        C0493 c0496 = c2015.f6684;
                        if (c0496 != null) {
                            iM4770 += c0496.f2147 + i6;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        c0494.m1918(c2936.m4932("Code"));
                        c0494.m1917(iM4770);
                        c0494.m1918(c2015.f6679);
                        c0494.m1918(c2015.f6680);
                        c0494.m1917(c0495.f2147);
                        c0494.m1916(c0495.f2147, c0495.f2146);
                        C0253 c0254 = c2015.f6682;
                        int i38 = 0;
                        for (C0253 c0255 = c0254; c0255 != null; c0255 = (C0253) c0255.f1480) {
                            i38++;
                        }
                        c0494.m1918(i38);
                        if (c0254 != null) {
                            c0494.m1918(((C1774) c0254.f1478).f5914);
                            c0494.m1918(((C1774) c0254.f1479).f5914);
                            throw null;
                        }
                        c0494.m1918(i8);
                        if (c2015.f6684 != null) {
                            c0494.m1918(c2936.m4932(c2936.f9370 >= 50 ? "StackMapTable" : str3));
                            c0494.m1917(c2015.f6684.f2147 + 2);
                            c0494.m1918(c2015.f6683);
                            C0493 c0497 = c2015.f6684;
                            c0494.m1916(c0497.f2147, c0497.f2146);
                        }
                        if (i30 > 0) {
                            c0494.m1918(c2936.m4932("Exceptions"));
                            c0494.m1917((i30 * 2) + 2);
                            c0494.m1918(i30);
                            for (int i39 : c2015.f6686) {
                                c0494.m1918(i39);
                            }
                        }
                        if (i4 != 0 && z8) {
                            c0494.m1918(c2936.m4932("Synthetic"));
                            c0494.m1917(0);
                        }
                        if (i29 != 0) {
                            c0494.m1918(c2936.m4932("Signature"));
                            c0494.m1917(2);
                            c0494.m1918(i29);
                        }
                        if (i5 != 0) {
                            c0494.m1918(c2936.m4932("Deprecated"));
                            c0494.m1917(0);
                        }
                        c2015 = c2015.f6673;
                        i18 = i6;
                        z3 = z5;
                        z4 = z6;
                    } else {
                        i4 = i33;
                        i5 = i34;
                        i6 = i18;
                    }
                    if (i30 > 0) {
                        c0494.m1918(c2936.m4932("Exceptions"));
                        c0494.m1917((i30 * 2) + 2);
                        c0494.m1918(i30);
                        while (i7 < r5) {
                            c0494.m1918(i39);
                        }
                    }
                    if (i4 != 0) {
                        c0494.m1918(c2936.m4932("Synthetic"));
                        c0494.m1917(0);
                    }
                    if (i29 != 0) {
                        c0494.m1918(c2936.m4932("Signature"));
                        c0494.m1917(2);
                        c0494.m1918(i29);
                    }
                    if (i5 != 0) {
                        c0494.m1918(c2936.m4932("Deprecated"));
                        c0494.m1917(0);
                    }
                    c2015 = c2015.f6673;
                    i18 = i6;
                    z3 = z5;
                    z4 = z6;
                }
                c0494.m1918(i3);
                if ((this.f2695 & 4096) == 0 || (this.f2693 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 49) {
                    c2930 = c2935;
                } else {
                    c2930 = c2935;
                    c0494.m1918(c2930.m4932("Synthetic"));
                    c0494.m1917(0);
                }
                if (this.f2704 != 0) {
                    c0494.m1918(c2930.m4932("Signature"));
                    c0494.m1917(2);
                    c0494.m1918(this.f2704);
                }
                if ((this.f2695 & i17) != 0) {
                    c0494.m1918(c2930.m4932("Deprecated"));
                    c0494.m1917(0);
                }
                if (!z4) {
                    return c0494.f2146;
                }
                AbstractC3744[] abstractC3744Arr = new AbstractC3744[6];
                for (C1317 c1319 = this.f2700; c1319 != null; c1319 = (C1317) c1319.f4760) {
                }
                for (C2014 c2016 = this.f2702; c2016 != null; c2016 = c2016.f6673) {
                }
                System.arraycopy(abstractC3744Arr, 0, new AbstractC3744[0], 0, 0);
                this.f2700 = null;
                this.f2701 = null;
                this.f2702 = null;
                this.f2703 = null;
                this.f2705 = z3 ? 3 : 0;
                return m2229();
            }
            i16++;
            int i40 = i12;
            int i41 = c2014.f6675;
            int i42 = c2014.f6685;
            C2930 c2937 = c2014.f6674;
            C0493 c0498 = c2014.f6681;
            int i43 = i13;
            int i44 = c0498.f2147;
            if (i44 <= 0) {
                i10 = 8;
            } else {
                if (i44 > 65535) {
                    throw new IndexOutOfBoundsException("Method code too large!");
                }
                c2937.m4932("Code");
                int i45 = c0498.f2147 + 16;
                int i46 = 0;
                for (C0253 c0256 = c2014.f6682; c0256 != null; c0256 = (C0253) c0256.f1480) {
                    i46++;
                }
                i10 = (i46 * 8) + 2 + i45 + 8;
                if (c2014.f6684 != null) {
                    c2937.m4932(c2937.f9370 >= 50 ? "StackMapTable" : "StackMap");
                    i10 += c2014.f6684.f2147 + 8;
                }
            }
            if (i42 > 0) {
                c2937.m4932("Exceptions");
                i10 += (i42 * 2) + 8;
            }
            boolean z9 = c2937.f9370 < 49;
            if ((i41 & 4096) != 0 && z9) {
                c2937.m4932("Synthetic");
                i10 += 6;
            }
            if (c2014.f6687 != 0) {
                c2937.m4932("Signature");
                i10 += 8;
            }
            if ((i41 & i17) != 0) {
                c2937.m4932("Deprecated");
                i10 += 6;
            }
            i13 = i43 + i10;
            c2014 = c2014.f6673;
            i = i17;
            i12 = i40;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2230(int i, String str, String str2, String str3, String[] strArr) {
        this.f2693 = 52;
        this.f2695 = i;
        C2930 c2930 = this.f2694;
        c2930.f9370 = 52;
        c2930.f9371 = str;
        this.f2696 = c2930.m4933(7, str).f9361;
        if (str2 != null) {
            this.f2704 = c2930.m4932(str2);
        }
        this.f2697 = str3 == null ? 0 : c2930.m4933(7, str3).f9361;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f2698 = length;
            this.f2699 = new int[length];
            for (int i2 = 0; i2 < this.f2698; i2++) {
                this.f2699[i2] = c2930.m4933(7, strArr[i2]).f9361;
            }
        }
        if (this.f2705 == 1) {
            this.f2705 = 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2014 m2231(int i, String str, String str2) {
        C2014 c2014 = new C2014(this.f2694, i, str, str2, this.f2705);
        if (this.f2702 == null) {
            this.f2702 = c2014;
        } else {
            this.f2703.f6673 = c2014;
        }
        this.f2703 = c2014;
        return c2014;
    }
}
