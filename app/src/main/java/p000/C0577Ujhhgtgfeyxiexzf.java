package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛲᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0577Ujhhgtgfeyxiexzf extends AbstractC2229feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final int[] f2596Ujhhgtgfeyxiexzf = new int[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static void m1846Ujhhgtgfeyxiexzf(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.f7255Ujhhgtgfeyxiexzf.f11623Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p000.InterfaceC3257feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1820Ujhhgtgfeyxiexzf(InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg) {
        float f;
        int iM3394Ujhhgtgfeyxiexzf;
        int i;
        int iM3394Ujhhgtgfeyxiexzf2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(this.f7263Ujhhgtgfeyxiexzf) == 3) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf;
            m3396Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg, c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg, 0);
            return;
        }
        C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg = this.f7258Ujhhgtgfeyxiexzf;
        boolean z = c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7262Ujhhgtgfeyxiexzf;
        if (z || this.f7257Ujhhgtgfeyxiexzf != 3) {
            f = 0.5f;
        } else {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = this.f7255Ujhhgtgfeyxiexzf;
            int i3 = c3655Ujhhgtgfeyxiexzf2.f11581Ujhhgtgfeyxiexzf;
            if (i3 == 2) {
                f = 0.5f;
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf2.f11609feyxiexzfUjhhgtg;
                if (c3655Ujhhgtgfeyxiexzf3 != null) {
                    C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg2 = c3655Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf;
                    if (c3160feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf) {
                        c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf((int) ((c3160feyxiexzfUjhhgtg2.f10230Ujhhgtgfeyxiexzf * c3655Ujhhgtgfeyxiexzf2.f11586Ujhhgtgfeyxiexzf) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c3655Ujhhgtgfeyxiexzf2.f11582Ujhhgtgfeyxiexzf;
                if (i4 == 0 || i4 == 3) {
                    C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg = c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf;
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg3 = c1868feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf;
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg4 = c1868feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf;
                    boolean z2 = c3655Ujhhgtgfeyxiexzf2.f11598feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null;
                    boolean z3 = c3655Ujhhgtgfeyxiexzf2.f11599feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null;
                    boolean z4 = c3655Ujhhgtgfeyxiexzf2.f11600feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null;
                    boolean z5 = c3655Ujhhgtgfeyxiexzf2.f11601feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null;
                    f = 0.5f;
                    int i5 = c3655Ujhhgtgfeyxiexzf2.f11613feyxiexzfUjhhgtg;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                        boolean z6 = c3259feyxiexzfUjhhgtg3.f10233Ujhhgtgfeyxiexzf;
                        ArrayList arrayList = c3259feyxiexzfUjhhgtg3.f10235Ujhhgtgfeyxiexzf;
                        int[] iArr = f2596Ujhhgtgfeyxiexzf;
                        if (z6 && c3259feyxiexzfUjhhgtg4.f10233Ujhhgtgfeyxiexzf) {
                            if (c3259feyxiexzfUjhhgtg.f10226Ujhhgtgfeyxiexzf && c3259feyxiexzfUjhhgtg2.f10226Ujhhgtgfeyxiexzf) {
                                m1846Ujhhgtgfeyxiexzf(iArr, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg2.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf, c3259feyxiexzfUjhhgtg3.f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf, c3259feyxiexzfUjhhgtg4.f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf, f5, i5);
                                c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iArr[0]);
                                this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf && c3259feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf) {
                            if (!c3259feyxiexzfUjhhgtg3.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg4.f10226Ujhhgtgfeyxiexzf) {
                                return;
                            }
                            m1846Ujhhgtgfeyxiexzf(iArr, c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf, c3259feyxiexzfUjhhgtg2.f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) arrayList.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg4.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf, f5, i5);
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iArr[0]);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iArr[1]);
                        }
                        if (!c3259feyxiexzfUjhhgtg.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg2.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg3.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg4.f10226Ujhhgtgfeyxiexzf) {
                            return;
                        }
                        m1846Ujhhgtgfeyxiexzf(iArr, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg2.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) arrayList.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf, ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg4.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf, f5, i5);
                        c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iArr[0]);
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c3259feyxiexzfUjhhgtg.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg2.f10226Ujhhgtgfeyxiexzf) {
                            return;
                        }
                        float f6 = c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                        int i6 = ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf;
                        int i7 = ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg2.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf;
                        if (i5 == -1 || i5 == 0) {
                            int iM3394Ujhhgtgfeyxiexzf3 = m3394Ujhhgtgfeyxiexzf(i7 - i6, 0);
                            int i8 = (int) ((iM3394Ujhhgtgfeyxiexzf3 * f6) + 0.5f);
                            int iM3394Ujhhgtgfeyxiexzf4 = m3394Ujhhgtgfeyxiexzf(i8, 1);
                            if (i8 != iM3394Ujhhgtgfeyxiexzf4) {
                                iM3394Ujhhgtgfeyxiexzf3 = (int) ((iM3394Ujhhgtgfeyxiexzf4 / f6) + 0.5f);
                            }
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf3);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf4);
                        } else if (i5 == 1) {
                            int iM3394Ujhhgtgfeyxiexzf5 = m3394Ujhhgtgfeyxiexzf(i7 - i6, 0);
                            int i9 = (int) ((iM3394Ujhhgtgfeyxiexzf5 / f6) + 0.5f);
                            int iM3394Ujhhgtgfeyxiexzf6 = m3394Ujhhgtgfeyxiexzf(i9, 1);
                            if (i9 != iM3394Ujhhgtgfeyxiexzf6) {
                                iM3394Ujhhgtgfeyxiexzf5 = (int) ((iM3394Ujhhgtgfeyxiexzf6 * f6) + 0.5f);
                            }
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf5);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf6);
                        }
                    } else if (z3 && z5) {
                        if (!c3259feyxiexzfUjhhgtg3.f10226Ujhhgtgfeyxiexzf || !c3259feyxiexzfUjhhgtg4.f10226Ujhhgtgfeyxiexzf) {
                            return;
                        }
                        float f7 = c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                        int i10 = ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg3.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg3.f10229Ujhhgtgfeyxiexzf;
                        int i11 = ((C3259feyxiexzfUjhhgtg) c3259feyxiexzfUjhhgtg4.f10235Ujhhgtgfeyxiexzf.get(0)).f10230Ujhhgtgfeyxiexzf - c3259feyxiexzfUjhhgtg4.f10229Ujhhgtgfeyxiexzf;
                        if (i5 == -1) {
                            iM3394Ujhhgtgfeyxiexzf = m3394Ujhhgtgfeyxiexzf(i11 - i10, 1);
                            i = (int) ((iM3394Ujhhgtgfeyxiexzf / f7) + 0.5f);
                            iM3394Ujhhgtgfeyxiexzf2 = m3394Ujhhgtgfeyxiexzf(i, 0);
                            if (i != iM3394Ujhhgtgfeyxiexzf2) {
                                iM3394Ujhhgtgfeyxiexzf = (int) ((iM3394Ujhhgtgfeyxiexzf2 * f7) + 0.5f);
                            }
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf2);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf);
                        } else if (i5 == 0) {
                            int iM3394Ujhhgtgfeyxiexzf7 = m3394Ujhhgtgfeyxiexzf(i11 - i10, 1);
                            int i12 = (int) ((iM3394Ujhhgtgfeyxiexzf7 * f7) + 0.5f);
                            int iM3394Ujhhgtgfeyxiexzf8 = m3394Ujhhgtgfeyxiexzf(i12, 0);
                            if (i12 != iM3394Ujhhgtgfeyxiexzf8) {
                                iM3394Ujhhgtgfeyxiexzf7 = (int) ((iM3394Ujhhgtgfeyxiexzf8 / f7) + 0.5f);
                            }
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf8);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf7);
                        } else if (i5 == 1) {
                            iM3394Ujhhgtgfeyxiexzf = m3394Ujhhgtgfeyxiexzf(i11 - i10, 1);
                            i = (int) ((iM3394Ujhhgtgfeyxiexzf / f7) + 0.5f);
                            iM3394Ujhhgtgfeyxiexzf2 = m3394Ujhhgtgfeyxiexzf(i, 0);
                            if (i != iM3394Ujhhgtgfeyxiexzf2) {
                                iM3394Ujhhgtgfeyxiexzf = (int) ((iM3394Ujhhgtgfeyxiexzf2 * f7) + 0.5f);
                            }
                            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf2);
                            this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.mo4674Ujhhgtgfeyxiexzf(iM3394Ujhhgtgfeyxiexzf);
                        }
                    }
                } else {
                    int i13 = c3655Ujhhgtgfeyxiexzf2.f11613feyxiexzfUjhhgtg;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10230Ujhhgtgfeyxiexzf / c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10230Ujhhgtgfeyxiexzf;
                            f3 = c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                        }
                        c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i2);
                        f = 0.5f;
                    } else {
                        f2 = c3655Ujhhgtgfeyxiexzf2.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10230Ujhhgtgfeyxiexzf;
                        f3 = c3655Ujhhgtgfeyxiexzf2.f11612feyxiexzfUjhhgtg;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = c3259feyxiexzfUjhhgtg.f10226Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf;
        if (z7) {
            boolean z8 = c3259feyxiexzfUjhhgtg2.f10226Ujhhgtgfeyxiexzf;
            ArrayList arrayList3 = c3259feyxiexzfUjhhgtg2.f10235Ujhhgtgfeyxiexzf;
            if (z8) {
                if (c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf && c3259feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf && c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
                    return;
                }
                if (!c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf && this.f7257Ujhhgtgfeyxiexzf == 3) {
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4 = this.f7255Ujhhgtgfeyxiexzf;
                    if (c3655Ujhhgtgfeyxiexzf4.f11581Ujhhgtgfeyxiexzf == 0 && !c3655Ujhhgtgfeyxiexzf4.m5335Ujhhgtgfeyxiexzf()) {
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg5 = (C3259feyxiexzfUjhhgtg) arrayList2.get(0);
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg6 = (C3259feyxiexzfUjhhgtg) arrayList3.get(0);
                        int i14 = c3259feyxiexzfUjhhgtg5.f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf;
                        int i15 = c3259feyxiexzfUjhhgtg6.f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf;
                        c3259feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i14);
                        c3259feyxiexzfUjhhgtg2.mo4674Ujhhgtgfeyxiexzf(i15);
                        c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i15 - i14);
                        return;
                    }
                }
                if (!c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf && this.f7257Ujhhgtgfeyxiexzf == 3 && this.f7254Ujhhgtgfeyxiexzf == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C3259feyxiexzfUjhhgtg) arrayList3.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf) - (((C3259feyxiexzfUjhhgtg) arrayList2.get(0)).f10230Ujhhgtgfeyxiexzf + c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf), c3160feyxiexzfUjhhgtg.f9789Ujhhgtgfeyxiexzf);
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5 = this.f7255Ujhhgtgfeyxiexzf;
                    int i16 = c3655Ujhhgtgfeyxiexzf5.f11585Ujhhgtgfeyxiexzf;
                    int iMax = Math.max(c3655Ujhhgtgfeyxiexzf5.f11584Ujhhgtgfeyxiexzf, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iMax);
                }
                if (c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg7 = (C3259feyxiexzfUjhhgtg) arrayList2.get(0);
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg8 = (C3259feyxiexzfUjhhgtg) arrayList3.get(0);
                    int i17 = c3259feyxiexzfUjhhgtg7.f10230Ujhhgtgfeyxiexzf;
                    int i18 = c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf + i17;
                    int i19 = c3259feyxiexzfUjhhgtg8.f10230Ujhhgtgfeyxiexzf;
                    int i20 = c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf + i19;
                    float f8 = this.f7255Ujhhgtgfeyxiexzf.f11619Ujhhgtgfeyxiexzf;
                    if (c3259feyxiexzfUjhhgtg7 == c3259feyxiexzfUjhhgtg8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c3259feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf((int) ((((i19 - i17) - c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf) * f8) + i17 + f));
                    c3259feyxiexzfUjhhgtg2.mo4674Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf + c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf);
                }
            }
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1821Ujhhgtgfeyxiexzf() {
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4;
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5 = this.f7255Ujhhgtgfeyxiexzf;
        boolean z = c3655Ujhhgtgfeyxiexzf5.f11570Ujhhgtgfeyxiexzf;
        C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg = this.f7258Ujhhgtgfeyxiexzf;
        if (z) {
            c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf5.m5329Ujhhgtgfeyxiexzf());
        }
        boolean z2 = c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c3160feyxiexzfUjhhgtg.f10234Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = c3160feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7262Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7261Ujhhgtgfeyxiexzf;
        if (!z2) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf6 = this.f7255Ujhhgtgfeyxiexzf;
            int i = c3655Ujhhgtgfeyxiexzf6.f11631Ujhhgtgfeyxiexzf[0];
            this.f7257Ujhhgtgfeyxiexzf = i;
            if (i != 3) {
                if (i == 4 && (((c3655Ujhhgtgfeyxiexzf4 = c3655Ujhhgtgfeyxiexzf6.f11609feyxiexzfUjhhgtg) != null && c3655Ujhhgtgfeyxiexzf4.f11631Ujhhgtgfeyxiexzf[0] == 1) || c3655Ujhhgtgfeyxiexzf4.f11631Ujhhgtgfeyxiexzf[0] == 4)) {
                    int iM5329Ujhhgtgfeyxiexzf = (c3655Ujhhgtgfeyxiexzf4.m5329Ujhhgtgfeyxiexzf() - this.f7255Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf()) - this.f7255Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf();
                    AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3655Ujhhgtgfeyxiexzf4.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf, this.f7255Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf());
                    AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3655Ujhhgtgfeyxiexzf4.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf, -this.f7255Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf());
                    c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(iM5329Ujhhgtgfeyxiexzf);
                    return;
                }
                if (i == 1) {
                    c3160feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf6.m5329Ujhhgtgfeyxiexzf());
                }
            }
        } else if (this.f7257Ujhhgtgfeyxiexzf == 4 && (((c3655Ujhhgtgfeyxiexzf2 = (c3655Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf).f11609feyxiexzfUjhhgtg) != null && c3655Ujhhgtgfeyxiexzf2.f11631Ujhhgtgfeyxiexzf[0] == 1) || c3655Ujhhgtgfeyxiexzf2.f11631Ujhhgtgfeyxiexzf[0] == 4)) {
            AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf());
            AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf, -this.f7255Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg.m5289Ujhhgtgfeyxiexzf());
            return;
        }
        if (c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf7 = this.f7255Ujhhgtgfeyxiexzf;
            if (c3655Ujhhgtgfeyxiexzf7.f11570Ujhhgtgfeyxiexzf) {
                C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr = c3655Ujhhgtgfeyxiexzf7.f11606feyxiexzfUjhhgtg;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = c3641UjhhgtgfeyxiexzfArr[0];
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = c3641Ujhhgtgfeyxiexzf.f11378Ujhhgtgfeyxiexzf;
                if (c3641Ujhhgtgfeyxiexzf2 != null && c3641UjhhgtgfeyxiexzfArr[1].f11378Ujhhgtgfeyxiexzf != null) {
                    if (c3655Ujhhgtgfeyxiexzf7.m5335Ujhhgtgfeyxiexzf()) {
                        c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0].m5289Ujhhgtgfeyxiexzf();
                        c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf = -this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1].m5289Ujhhgtgfeyxiexzf();
                        return;
                    }
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0]);
                    if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf != null) {
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf, this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0].m5289Ujhhgtgfeyxiexzf());
                    }
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf2 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1]);
                    if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf2 != null) {
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf2, -this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1].m5289Ujhhgtgfeyxiexzf());
                    }
                    c3259feyxiexzfUjhhgtg2.f10225Ujhhgtgfeyxiexzf = true;
                    c3259feyxiexzfUjhhgtg.f10225Ujhhgtgfeyxiexzf = true;
                    return;
                }
                if (c3641Ujhhgtgfeyxiexzf2 != null) {
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf3 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf);
                    if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf3 != null) {
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf3, this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0].m5289Ujhhgtgfeyxiexzf());
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtg2, c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf);
                        return;
                    }
                    return;
                }
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3 = c3641UjhhgtgfeyxiexzfArr[1];
                if (c3641Ujhhgtgfeyxiexzf3.f11378Ujhhgtgfeyxiexzf != null) {
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf4 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3);
                    if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf4 != null) {
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf4, -this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1].m5289Ujhhgtgfeyxiexzf());
                        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtg, -c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf);
                        return;
                    }
                    return;
                }
                if ((c3655Ujhhgtgfeyxiexzf7 instanceof AbstractC0548Ujhhgtgfeyxiexzf) || c3655Ujhhgtgfeyxiexzf7.f11609feyxiexzfUjhhgtg == null || c3655Ujhhgtgfeyxiexzf7.mo1814Ujhhgtgfeyxiexzf(7).f11378Ujhhgtgfeyxiexzf != null) {
                    return;
                }
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf8 = this.f7255Ujhhgtgfeyxiexzf;
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3655Ujhhgtgfeyxiexzf8.f11609feyxiexzfUjhhgtg.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf8.m5330Ujhhgtgfeyxiexzf());
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtg2, c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf);
                return;
            }
        }
        if (this.f7257Ujhhgtgfeyxiexzf == 3) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf9 = this.f7255Ujhhgtgfeyxiexzf;
            int i2 = c3655Ujhhgtgfeyxiexzf9.f11581Ujhhgtgfeyxiexzf;
            if (i2 == 2) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf10 = c3655Ujhhgtgfeyxiexzf9.f11609feyxiexzfUjhhgtg;
                if (c3655Ujhhgtgfeyxiexzf10 != null) {
                    C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg2 = c3655Ujhhgtgfeyxiexzf10.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf;
                    arrayList2.add(c3160feyxiexzfUjhhgtg2);
                    c3160feyxiexzfUjhhgtg2.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    c3160feyxiexzfUjhhgtg.f10225Ujhhgtgfeyxiexzf = true;
                    arrayList.add(c3259feyxiexzfUjhhgtg2);
                    arrayList.add(c3259feyxiexzfUjhhgtg);
                }
            } else if (i2 == 3) {
                if (c3655Ujhhgtgfeyxiexzf9.f11582Ujhhgtgfeyxiexzf == 3) {
                    c3259feyxiexzfUjhhgtg2.f10224Ujhhgtgfeyxiexzf = this;
                    c3259feyxiexzfUjhhgtg.f10224Ujhhgtgfeyxiexzf = this;
                    C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg = c3655Ujhhgtgfeyxiexzf9.f11574Ujhhgtgfeyxiexzf;
                    c1868feyxiexzfUjhhgtg.f7261Ujhhgtgfeyxiexzf.f10224Ujhhgtgfeyxiexzf = this;
                    c1868feyxiexzfUjhhgtg.f7262Ujhhgtgfeyxiexzf.f10224Ujhhgtgfeyxiexzf = this;
                    c3160feyxiexzfUjhhgtg.f10224Ujhhgtgfeyxiexzf = this;
                    if (c3655Ujhhgtgfeyxiexzf9.m5336Ujhhgtgfeyxiexzf()) {
                        arrayList2.add(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf);
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                        C1868feyxiexzfUjhhgtg c1868feyxiexzfUjhhgtg2 = this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf;
                        c1868feyxiexzfUjhhgtg2.f7258Ujhhgtgfeyxiexzf.f10224Ujhhgtgfeyxiexzf = this;
                        arrayList2.add(c1868feyxiexzfUjhhgtg2.f7261Ujhhgtgfeyxiexzf);
                        arrayList2.add(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf);
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    } else if (this.f7255Ujhhgtgfeyxiexzf.m5335Ujhhgtgfeyxiexzf()) {
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10235Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                        arrayList.add(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf);
                    } else {
                        this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf.f10235Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    }
                } else {
                    C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg3 = c3655Ujhhgtgfeyxiexzf9.f11574Ujhhgtgfeyxiexzf.f7258Ujhhgtgfeyxiexzf;
                    arrayList2.add(c3160feyxiexzfUjhhgtg3);
                    c3160feyxiexzfUjhhgtg3.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf.f10234Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    c3160feyxiexzfUjhhgtg.f10225Ujhhgtgfeyxiexzf = true;
                    arrayList.add(c3259feyxiexzfUjhhgtg2);
                    arrayList.add(c3259feyxiexzfUjhhgtg);
                    c3259feyxiexzfUjhhgtg2.f10235Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                    c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.add(c3160feyxiexzfUjhhgtg);
                }
            }
        }
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf11 = this.f7255Ujhhgtgfeyxiexzf;
        C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr2 = c3655Ujhhgtgfeyxiexzf11.f11606feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4 = c3641UjhhgtgfeyxiexzfArr2[0];
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5 = c3641Ujhhgtgfeyxiexzf4.f11378Ujhhgtgfeyxiexzf;
        if (c3641Ujhhgtgfeyxiexzf5 != null && c3641UjhhgtgfeyxiexzfArr2[1].f11378Ujhhgtgfeyxiexzf != null) {
            if (c3655Ujhhgtgfeyxiexzf11.m5335Ujhhgtgfeyxiexzf()) {
                c3259feyxiexzfUjhhgtg2.f10229Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0].m5289Ujhhgtgfeyxiexzf();
                c3259feyxiexzfUjhhgtg.f10229Ujhhgtgfeyxiexzf = -this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1].m5289Ujhhgtgfeyxiexzf();
                return;
            }
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf5 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0]);
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf6 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1]);
            c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf5.m4767Ujhhgtgfeyxiexzf(this);
            c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf6.m4767Ujhhgtgfeyxiexzf(this);
            this.f7263Ujhhgtgfeyxiexzf = 4;
            return;
        }
        if (c3641Ujhhgtgfeyxiexzf5 != null) {
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf7 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4);
            if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf7 != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf7, this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[0].m5289Ujhhgtgfeyxiexzf());
                m3393Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtg2, 1, c3160feyxiexzfUjhhgtg);
                return;
            }
            return;
        }
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf6 = c3641UjhhgtgfeyxiexzfArr2[1];
        if (c3641Ujhhgtgfeyxiexzf6.f11378Ujhhgtgfeyxiexzf != null) {
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf8 = AbstractC2229feyxiexzfUjhhgtg.m3391Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf6);
            if (c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf8 != null) {
                AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtgM3391Ujhhgtgfeyxiexzf8, -this.f7255Ujhhgtgfeyxiexzf.f11606feyxiexzfUjhhgtg[1].m5289Ujhhgtgfeyxiexzf());
                m3393Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3259feyxiexzfUjhhgtg, -1, c3160feyxiexzfUjhhgtg);
                return;
            }
            return;
        }
        if ((c3655Ujhhgtgfeyxiexzf11 instanceof AbstractC0548Ujhhgtgfeyxiexzf) || (c3655Ujhhgtgfeyxiexzf3 = c3655Ujhhgtgfeyxiexzf11.f11609feyxiexzfUjhhgtg) == null) {
            return;
        }
        AbstractC2229feyxiexzfUjhhgtg.m3390Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg2, c3655Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf, c3655Ujhhgtgfeyxiexzf11.m5330Ujhhgtgfeyxiexzf());
        m3393Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg, c3259feyxiexzfUjhhgtg2, 1, c3160feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1822Ujhhgtgfeyxiexzf() {
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
        if (c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
            this.f7255Ujhhgtgfeyxiexzf.f11614feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1823Ujhhgtgfeyxiexzf() {
        this.f7256Ujhhgtgfeyxiexzf = null;
        this.f7261Ujhhgtgfeyxiexzf.m4768Ujhhgtgfeyxiexzf();
        this.f7262Ujhhgtgfeyxiexzf.m4768Ujhhgtgfeyxiexzf();
        this.f7258Ujhhgtgfeyxiexzf.m4768Ujhhgtgfeyxiexzf();
        this.f7260Ujhhgtgfeyxiexzf = false;
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo1824Ujhhgtgfeyxiexzf() {
        return this.f7257Ujhhgtgfeyxiexzf != 3 || this.f7255Ujhhgtgfeyxiexzf.f11581Ujhhgtgfeyxiexzf == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m1847Ujhhgtgfeyxiexzf() {
        this.f7260Ujhhgtgfeyxiexzf = false;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
        c3259feyxiexzfUjhhgtg.m4768Ujhhgtgfeyxiexzf();
        c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf = false;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7262Ujhhgtgfeyxiexzf;
        c3259feyxiexzfUjhhgtg2.m4768Ujhhgtgfeyxiexzf();
        c3259feyxiexzfUjhhgtg2.f10233Ujhhgtgfeyxiexzf = false;
        this.f7258Ujhhgtgfeyxiexzf.f10233Ujhhgtgfeyxiexzf = false;
    }
}
