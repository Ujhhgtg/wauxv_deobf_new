package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2699Ujhhgtgfeyxiexzf extends AbstractC2229feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ArrayList f8615Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8616Ujhhgtgfeyxiexzf;

    public C2699Ujhhgtgfeyxiexzf(C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, int i) {
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2;
        super(c3655Ujhhgtgfeyxiexzf);
        ArrayList<AbstractC2229feyxiexzfUjhhgtg> arrayList = new ArrayList();
        this.f8615Ujhhgtgfeyxiexzf = arrayList;
        this.f7259Ujhhgtgfeyxiexzf = i;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = this.f7255Ujhhgtgfeyxiexzf;
        C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM5328Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf3.m5328Ujhhgtgfeyxiexzf(i);
        while (true) {
            c3655Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf3;
            c3655Ujhhgtgfeyxiexzf3 = c3655UjhhgtgfeyxiexzfM5328Ujhhgtgfeyxiexzf;
            if (c3655Ujhhgtgfeyxiexzf3 == null) {
                break;
            } else {
                c3655UjhhgtgfeyxiexzfM5328Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf3.m5328Ujhhgtgfeyxiexzf(this.f7259Ujhhgtgfeyxiexzf);
            }
        }
        this.f7255Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2;
        int i2 = this.f7259Ujhhgtgfeyxiexzf;
        arrayList.add(i2 == 0 ? c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf : i2 == 1 ? c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf : null);
        C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf2.m5327Ujhhgtgfeyxiexzf(this.f7259Ujhhgtgfeyxiexzf);
        while (c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf != null) {
            int i3 = this.f7259Ujhhgtgfeyxiexzf;
            arrayList.add(i3 == 0 ? c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf.f11573Ujhhgtgfeyxiexzf : i3 == 1 ? c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf : null);
            c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf = c3655UjhhgtgfeyxiexzfM5327Ujhhgtgfeyxiexzf.m5327Ujhhgtgfeyxiexzf(this.f7259Ujhhgtgfeyxiexzf);
        }
        for (AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg : arrayList) {
            int i4 = this.f7259Ujhhgtgfeyxiexzf;
            if (i4 == 0) {
                abstractC2229feyxiexzfUjhhgtg.f7255Ujhhgtgfeyxiexzf.f11571Ujhhgtgfeyxiexzf = this;
            } else if (i4 == 1) {
                abstractC2229feyxiexzfUjhhgtg.f7255Ujhhgtgfeyxiexzf.f11572Ujhhgtgfeyxiexzf = this;
            }
        }
        if (this.f7259Ujhhgtgfeyxiexzf == 0 && ((C3656Ujhhgtgfeyxiexzf) this.f7255Ujhhgtgfeyxiexzf.f11609feyxiexzfUjhhgtg).f11636Ujhhgtgfeyxiexzf && arrayList.size() > 1) {
            this.f7255Ujhhgtgfeyxiexzf = ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(arrayList.size() - 1)).f7255Ujhhgtgfeyxiexzf;
        }
        this.f8616Ujhhgtgfeyxiexzf = this.f7259Ujhhgtgfeyxiexzf == 0 ? this.f7255Ujhhgtgfeyxiexzf.f11624feyxiexzfUjhhgtg : this.f7255Ujhhgtgfeyxiexzf.f11625feyxiexzfUjhhgtg;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f7259Ujhhgtgfeyxiexzf == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg : this.f8615Ujhhgtgfeyxiexzf) {
            strConcat = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strConcat, "<") + abstractC2229feyxiexzfUjhhgtg, "> ");
        }
        return strConcat;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01bc A[PHI: r1 r26
      0x01bc: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r26v1 int) = (r26v0 int), (r26v3 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:302:0x00ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[ADDED_TO_REGION] */
    @Override // p000.InterfaceC3257feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1820Ujhhgtgfeyxiexzf(InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        float f3;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
        if (c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7262Ujhhgtgfeyxiexzf;
            if (c3259feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf.f11609feyxiexzfUjhhgtg;
                boolean z2 = (c3655Ujhhgtgfeyxiexzf == null || !(c3655Ujhhgtgfeyxiexzf instanceof C3656Ujhhgtgfeyxiexzf)) ? false : ((C3656Ujhhgtgfeyxiexzf) c3655Ujhhgtgfeyxiexzf).f11636Ujhhgtgfeyxiexzf;
                int i12 = c3259feyxiexzfUjhhgtg2.f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
                ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i13)).f7255Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i15)).f7255Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) {
                        i = i15;
                        break;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i17 = 0;
                    i5 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < size) {
                        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i17);
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = abstractC2229feyxiexzfUjhhgtg.f7255Ujhhgtgfeyxiexzf;
                        boolean z3 = z2;
                        if (c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf == i2) {
                            i10 = i16;
                        } else {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i5 += abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf;
                            }
                            C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg = abstractC2229feyxiexzfUjhhgtg.f7258Ujhhgtgfeyxiexzf;
                            int i20 = c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
                            i10 = i16;
                            boolean z4 = abstractC2229feyxiexzfUjhhgtg.f7257Ujhhgtgfeyxiexzf != 3;
                            if (z4) {
                                int i21 = this.f7259Ujhhgtgfeyxiexzf;
                                if (i21 == 0 && !c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf) {
                                    return;
                                }
                                if (i21 == 1 && !c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf) {
                                    return;
                                }
                            } else {
                                if (abstractC2229feyxiexzfUjhhgtg.f7254Ujhhgtgfeyxiexzf == 1 && i10 == 0) {
                                    i11 = c3160feyxiexzfUjhhgtg.f9789Ujhhgtgfeyxiexzf;
                                    i18++;
                                } else {
                                    if (c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
                                        i11 = i20;
                                    }
                                    if (z4) {
                                        i5 += i11;
                                    } else {
                                        i18++;
                                        f3 = c3655Ujhhgtgfeyxiexzf2.f11626feyxiexzfUjhhgtg[this.f7259Ujhhgtgfeyxiexzf];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i17 >= i14 && i17 < i) {
                                        i5 += -abstractC2229feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i18++;
                                    f3 = c3655Ujhhgtgfeyxiexzf2.f11626feyxiexzfUjhhgtg[this.f7259Ujhhgtgfeyxiexzf];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i11;
                                }
                                if (i17 >= i14) {
                                }
                            }
                            i11 = i20;
                            if (z4) {
                                i18++;
                                f3 = c3655Ujhhgtgfeyxiexzf2.f11626feyxiexzfUjhhgtg[this.f7259Ujhhgtgfeyxiexzf];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i17++;
                        z2 = z3;
                        i16 = i10;
                        i2 = 8;
                    }
                    z = z2;
                    int i22 = i16;
                    if (i5 < i12 || i18 == 0) {
                        i3 = i18;
                        i4 = i19;
                        break;
                    } else {
                        i16 = i22 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i23 = c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
                if (z) {
                    i23 = c3259feyxiexzfUjhhgtg2.f10230Ujhhgtgfeyxiexzf;
                }
                float f4 = 0.5f;
                if (i5 > i12) {
                    i23 = z ? i23 + ((int) (((i5 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i5 - i12) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i12 - i5;
                    int i24 = (int) ((f5 / i3) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        float f6 = f4;
                        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg2 = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i25);
                        int i27 = i23;
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = abstractC2229feyxiexzfUjhhgtg2.f7255Ujhhgtgfeyxiexzf;
                        int i28 = i3;
                        C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg2 = abstractC2229feyxiexzfUjhhgtg2.f7258Ujhhgtgfeyxiexzf;
                        float f7 = f5;
                        int i29 = i24;
                        if (c3655Ujhhgtgfeyxiexzf3.f11622Ujhhgtgfeyxiexzf == 8 || abstractC2229feyxiexzfUjhhgtg2.f7257Ujhhgtgfeyxiexzf != 3 || c3160feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf) {
                            i9 = i25;
                        } else {
                            int i30 = f > 0.0f ? (int) (((c3655Ujhhgtgfeyxiexzf3.f11626feyxiexzfUjhhgtg[this.f7259Ujhhgtgfeyxiexzf] * f7) / f) + f6) : i29;
                            if (this.f7259Ujhhgtgfeyxiexzf == 0) {
                                int i31 = c3655Ujhhgtgfeyxiexzf3.f11585Ujhhgtgfeyxiexzf;
                                i9 = i25;
                                iMax = Math.max(c3655Ujhhgtgfeyxiexzf3.f11584Ujhhgtgfeyxiexzf, abstractC2229feyxiexzfUjhhgtg2.f7254Ujhhgtgfeyxiexzf == 1 ? Math.min(i30, c3160feyxiexzfUjhhgtg2.f9789Ujhhgtgfeyxiexzf) : i30);
                                if (i31 > 0) {
                                    iMax = Math.min(i31, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            } else {
                                i9 = i25;
                                int i32 = c3655Ujhhgtgfeyxiexzf3.f11588Ujhhgtgfeyxiexzf;
                                iMax = Math.max(c3655Ujhhgtgfeyxiexzf3.f11587Ujhhgtgfeyxiexzf, abstractC2229feyxiexzfUjhhgtg2.f7254Ujhhgtgfeyxiexzf == 1 ? Math.min(i30, c3160feyxiexzfUjhhgtg2.f9789Ujhhgtgfeyxiexzf) : i30);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            }
                            c3160feyxiexzfUjhhgtg2.mo4674Ujhhgtgfeyxiexzf(i30);
                        }
                        i25 = i9 + 1;
                        i23 = i27;
                        f4 = f6;
                        i3 = i28;
                        f5 = f7;
                        i24 = i29;
                    }
                    i6 = i23;
                    f2 = f4;
                    int i33 = i3;
                    if (i26 > 0) {
                        i3 = i33 - i26;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg3 = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i34);
                            if (abstractC2229feyxiexzfUjhhgtg3.f7255Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) {
                                if (i34 > 0 && i34 >= i13) {
                                    i5 += abstractC2229feyxiexzfUjhhgtg3.f7261Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf;
                                }
                                i5 += abstractC2229feyxiexzfUjhhgtg3.f7258Ujhhgtgfeyxiexzf.f10230Ujhhgtgfeyxiexzf;
                                if (i34 < i14 && i34 < i) {
                                    i5 += -abstractC2229feyxiexzfUjhhgtg3.f7262Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.f8616Ujhhgtgfeyxiexzf == 2 && i26 == 0) {
                        i7 = 0;
                        this.f8616Ujhhgtgfeyxiexzf = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i23;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i12) {
                    this.f8616Ujhhgtgfeyxiexzf = i8;
                }
                if (i4 > 0 && i3 == 0 && i13 == i) {
                    this.f8616Ujhhgtgfeyxiexzf = i8;
                }
                int i35 = this.f8616Ujhhgtgfeyxiexzf;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i12 - i5) / (i4 - 1) : i4 == 1 ? (i12 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg4 = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(z ? size - (i38 + 1) : i38);
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4 = abstractC2229feyxiexzfUjhhgtg4.f7255Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg3 = abstractC2229feyxiexzfUjhhgtg4.f7262Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg4 = abstractC2229feyxiexzfUjhhgtg4.f7261Ujhhgtgfeyxiexzf;
                        if (c3655Ujhhgtgfeyxiexzf4.f11622Ujhhgtgfeyxiexzf == 8) {
                            c3259feyxiexzfUjhhgtg4.mo4674Ujhhgtgfeyxiexzf(i37);
                            c3259feyxiexzfUjhhgtg3.mo4674Ujhhgtgfeyxiexzf(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i13) {
                                i37 = z ? i37 - c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf : i37 + c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf;
                            }
                            if (z) {
                                c3259feyxiexzfUjhhgtg3.mo4674Ujhhgtgfeyxiexzf(i37);
                            } else {
                                c3259feyxiexzfUjhhgtg4.mo4674Ujhhgtgfeyxiexzf(i37);
                            }
                            C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg3 = abstractC2229feyxiexzfUjhhgtg4.f7258Ujhhgtgfeyxiexzf;
                            int i39 = c3160feyxiexzfUjhhgtg3.f10230Ujhhgtgfeyxiexzf;
                            if (abstractC2229feyxiexzfUjhhgtg4.f7257Ujhhgtgfeyxiexzf == 3 && abstractC2229feyxiexzfUjhhgtg4.f7254Ujhhgtgfeyxiexzf == 1) {
                                i39 = c3160feyxiexzfUjhhgtg3.f9789Ujhhgtgfeyxiexzf;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c3259feyxiexzfUjhhgtg4.mo4674Ujhhgtgfeyxiexzf(i37);
                            } else {
                                c3259feyxiexzfUjhhgtg3.mo4674Ujhhgtgfeyxiexzf(i37);
                            }
                            abstractC2229feyxiexzfUjhhgtg4.f7260Ujhhgtgfeyxiexzf = true;
                            if (i38 < i14 && i38 < i) {
                                i37 = z ? i37 - (-c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf) : i37 + (-c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i12 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg5 = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(z ? size - (i42 + 1) : i42);
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5 = abstractC2229feyxiexzfUjhhgtg5.f7255Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg5 = abstractC2229feyxiexzfUjhhgtg5.f7262Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg6 = abstractC2229feyxiexzfUjhhgtg5.f7261Ujhhgtgfeyxiexzf;
                        if (c3655Ujhhgtgfeyxiexzf5.f11622Ujhhgtgfeyxiexzf == 8) {
                            c3259feyxiexzfUjhhgtg6.mo4674Ujhhgtgfeyxiexzf(i41);
                            c3259feyxiexzfUjhhgtg5.mo4674Ujhhgtgfeyxiexzf(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i13) {
                                i43 = z ? i43 - c3259feyxiexzfUjhhgtg6.f10229Ujhhgtgfeyxiexzf : i43 + c3259feyxiexzfUjhhgtg6.f10229Ujhhgtgfeyxiexzf;
                            }
                            if (z) {
                                c3259feyxiexzfUjhhgtg5.mo4674Ujhhgtgfeyxiexzf(i43);
                            } else {
                                c3259feyxiexzfUjhhgtg6.mo4674Ujhhgtgfeyxiexzf(i43);
                            }
                            C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg4 = abstractC2229feyxiexzfUjhhgtg5.f7258Ujhhgtgfeyxiexzf;
                            int iMin = c3160feyxiexzfUjhhgtg4.f10230Ujhhgtgfeyxiexzf;
                            if (abstractC2229feyxiexzfUjhhgtg5.f7257Ujhhgtgfeyxiexzf == 3 && abstractC2229feyxiexzfUjhhgtg5.f7254Ujhhgtgfeyxiexzf == 1) {
                                iMin = Math.min(iMin, c3160feyxiexzfUjhhgtg4.f9789Ujhhgtgfeyxiexzf);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c3259feyxiexzfUjhhgtg6.mo4674Ujhhgtgfeyxiexzf(i41);
                            } else {
                                c3259feyxiexzfUjhhgtg5.mo4674Ujhhgtgfeyxiexzf(i41);
                            }
                            if (i42 < i14 && i42 < i) {
                                i41 = z ? i41 - (-c3259feyxiexzfUjhhgtg5.f10229Ujhhgtgfeyxiexzf) : i41 + (-c3259feyxiexzfUjhhgtg5.f10229Ujhhgtgfeyxiexzf);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f8 = this.f7259Ujhhgtgfeyxiexzf == 0 ? this.f7255Ujhhgtgfeyxiexzf.f11619Ujhhgtgfeyxiexzf : this.f7255Ujhhgtgfeyxiexzf.f11620Ujhhgtgfeyxiexzf;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i12 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg6 = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(z ? size - (i46 + 1) : i46);
                        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf6 = abstractC2229feyxiexzfUjhhgtg6.f7255Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg7 = abstractC2229feyxiexzfUjhhgtg6.f7262Ujhhgtgfeyxiexzf;
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg8 = abstractC2229feyxiexzfUjhhgtg6.f7261Ujhhgtgfeyxiexzf;
                        if (c3655Ujhhgtgfeyxiexzf6.f11622Ujhhgtgfeyxiexzf == 8) {
                            c3259feyxiexzfUjhhgtg8.mo4674Ujhhgtgfeyxiexzf(i45);
                            c3259feyxiexzfUjhhgtg7.mo4674Ujhhgtgfeyxiexzf(i45);
                        } else {
                            if (i46 > 0 && i46 >= i13) {
                                i45 = z ? i45 - c3259feyxiexzfUjhhgtg8.f10229Ujhhgtgfeyxiexzf : i45 + c3259feyxiexzfUjhhgtg8.f10229Ujhhgtgfeyxiexzf;
                            }
                            if (z) {
                                c3259feyxiexzfUjhhgtg7.mo4674Ujhhgtgfeyxiexzf(i45);
                            } else {
                                c3259feyxiexzfUjhhgtg8.mo4674Ujhhgtgfeyxiexzf(i45);
                            }
                            C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg5 = abstractC2229feyxiexzfUjhhgtg6.f7258Ujhhgtgfeyxiexzf;
                            int i47 = c3160feyxiexzfUjhhgtg5.f10230Ujhhgtgfeyxiexzf;
                            if (abstractC2229feyxiexzfUjhhgtg6.f7257Ujhhgtgfeyxiexzf == 3 && abstractC2229feyxiexzfUjhhgtg6.f7254Ujhhgtgfeyxiexzf == 1) {
                                i47 = c3160feyxiexzfUjhhgtg5.f9789Ujhhgtgfeyxiexzf;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c3259feyxiexzfUjhhgtg8.mo4674Ujhhgtgfeyxiexzf(i45);
                            } else {
                                c3259feyxiexzfUjhhgtg7.mo4674Ujhhgtgfeyxiexzf(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-c3259feyxiexzfUjhhgtg7.f10229Ujhhgtgfeyxiexzf) : i45 + (-c3259feyxiexzfUjhhgtg7.f10229Ujhhgtgfeyxiexzf);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1821Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2229feyxiexzfUjhhgtg) it.next()).mo1821Ujhhgtgfeyxiexzf();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(0)).f7255Ujhhgtgfeyxiexzf;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(size - 1)).f7255Ujhhgtgfeyxiexzf;
        int i = this.f7259Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7262Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7261Ujhhgtgfeyxiexzf;
        if (i == 0) {
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg;
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3655Ujhhgtgfeyxiexzf2.f11600feyxiexzfUjhhgtg;
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf = AbstractC2229feyxiexzfUjhhgtg.m3392Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf, 0);
            int iM5289Ujhhgtgfeyxiexzf = c3641Ujhhgtgfeyxiexzf.m5289Ujhhgtgfeyxiexzf();
            C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf = m4030Ujhhgtgfeyxiexzf();
            if (c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf != null) {
                iM5289Ujhhgtgfeyxiexzf = c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf();
            }
            if (c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf, iM5289Ujhhgtgfeyxiexzf);
            }
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf2 = AbstractC2229feyxiexzfUjhhgtg.m3392Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2, 0);
            int iM5289Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf2.m5289Ujhhgtgfeyxiexzf();
            C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf = m4031Ujhhgtgfeyxiexzf();
            if (c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf != null) {
                iM5289Ujhhgtgfeyxiexzf2 = c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf();
            }
            if (c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf2 != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf2, -iM5289Ujhhgtgfeyxiexzf2);
            }
        } else {
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg;
            C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4 = c3655Ujhhgtgfeyxiexzf2.f11601feyxiexzfUjhhgtg;
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf3 = AbstractC2229feyxiexzfUjhhgtg.m3392Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3, 1);
            int iM5289Ujhhgtgfeyxiexzf3 = c3641Ujhhgtgfeyxiexzf3.m5289Ujhhgtgfeyxiexzf();
            C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf2 = m4030Ujhhgtgfeyxiexzf();
            if (c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf2 != null) {
                iM5289Ujhhgtgfeyxiexzf3 = c3655UjhhgtgfeyxiexzfM4030Ujhhgtgfeyxiexzf2.f11599feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf();
            }
            if (c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf3 != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf3, iM5289Ujhhgtgfeyxiexzf3);
            }
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf4 = AbstractC2229feyxiexzfUjhhgtg.m3392Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4, 1);
            int iM5289Ujhhgtgfeyxiexzf4 = c3641Ujhhgtgfeyxiexzf4.m5289Ujhhgtgfeyxiexzf();
            C3655Ujhhgtgfeyxiexzf c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf2 = m4031Ujhhgtgfeyxiexzf();
            if (c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf2 != null) {
                iM5289Ujhhgtgfeyxiexzf4 = c3655UjhhgtgfeyxiexzfM4031Ujhhgtgfeyxiexzf2.f11601feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf();
            }
            if (c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf4 != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtgM3392Ujhhgtgfeyxiexzf4, -iM5289Ujhhgtgfeyxiexzf4);
            }
        }
        c3259feyxiexzfUjhhgtg2.f10224Ujhhgtgfeyxiexzf = this;
        c3259feyxiexzfUjhhgtg.f10224Ujhhgtgfeyxiexzf = this;
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1822Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i)).mo1822Ujhhgtgfeyxiexzf();
            i++;
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1823Ujhhgtgfeyxiexzf() {
        this.f7256Ujhhgtgfeyxiexzf = null;
        Iterator it = this.f8615Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((AbstractC2229feyxiexzfUjhhgtg) it.next()).mo1823Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final long mo3395Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        long jMo3395Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg = (AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i);
            jMo3395Ujhhgtgfeyxiexzf = ((long) abstractC2229feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf) + abstractC2229feyxiexzfUjhhgtg.mo3395Ujhhgtgfeyxiexzf() + jMo3395Ujhhgtgfeyxiexzf + ((long) abstractC2229feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf.f10229Ujhhgtgfeyxiexzf);
        }
        return jMo3395Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo1824Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i)).mo1824Ujhhgtgfeyxiexzf()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C3655Ujhhgtgfeyxiexzf m4030Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
            if (i >= arrayList.size()) {
                return null;
            }
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(i)).f7255Ujhhgtgfeyxiexzf;
            if (c3655Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) {
                return c3655Ujhhgtgfeyxiexzf;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final C3655Ujhhgtgfeyxiexzf m4031Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = this.f8615Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = ((AbstractC2229feyxiexzfUjhhgtg) arrayList.get(size)).f7255Ujhhgtgfeyxiexzf;
            if (c3655Ujhhgtgfeyxiexzf.f11622Ujhhgtgfeyxiexzf != 8) {
                return c3655Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }
}
