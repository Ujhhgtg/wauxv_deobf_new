package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3700 implements InterfaceC1015 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f11535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C0792 f11536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2669 f11537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f11538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1045 f11539 = new C1045(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f11540 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f11541 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1017 f11542 = new C1017(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1017 f11543 = new C1017(this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11544 = 1;

    public AbstractC3700(C0792 c0792) {
        this.f11536 = c0792;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m5233(C1017 c1017, C1017 c1018, int i) {
        c1017.f3719.add(c1018);
        c1017.f3713 = i;
        c1018.f3718.add(c1017);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C1017 m5234(C0778 c0778) {
        C0778 c0779 = c0778.f2888;
        if (c0779 == null) {
            return null;
        }
        C0792 c0792 = c0779.f2886;
        int iM4792 = AbstractC2844.m4792(c0779.f2887);
        if (iM4792 == 1) {
            return c0792.f3083.f11542;
        }
        if (iM4792 == 2) {
            return c0792.f3084.f11542;
        }
        if (iM4792 == 3) {
            return c0792.f3083.f11543;
        }
        if (iM4792 == 4) {
            return c0792.f3084.f11543;
        }
        if (iM4792 != 5) {
            return null;
        }
        return c0792.f3084.f11297;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static C1017 m5235(C0778 c0778, int i) {
        C0778 c0779 = c0778.f2888;
        if (c0779 == null) {
            return null;
        }
        C0792 c0792 = c0779.f2886;
        AbstractC3700 abstractC3700 = i == 0 ? c0792.f3083 : c0792.f3084;
        int iM4792 = AbstractC2844.m4792(c0779.f2887);
        if (iM4792 == 1 || iM4792 == 2) {
            return abstractC3700.f11542;
        }
        if (iM4792 == 3 || iM4792 == 4) {
            return abstractC3700.f11543;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m5236(C1017 c1017, C1017 c1018, int i, C1045 c1045) {
        c1017.f3719.add(c1018);
        c1017.f3719.add(this.f11539);
        c1017.f3715 = i;
        c1017.f3716 = c1045;
        c1018.f3718.add(c1017);
        c1045.f3718.add(c1017);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo2101();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public abstract void mo2102();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract void mo2103();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m5237(int i, int i2) {
        if (i2 == 0) {
            C0792 c0792 = this.f11536;
            int i3 = c0792.f3095;
            int iMax = Math.max(c0792.f3094, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0792 c0793 = this.f11536;
            int i4 = c0793.f3098;
            int iMax2 = Math.max(c0793.f3097, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public long mo2104() {
        C1045 c1045 = this.f11539;
        if (c1045.f3717) {
            return c1045.f3714;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract boolean mo2105();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m5238(C0778 c0778, C0778 c0779, int i) {
        C1045 c1045;
        float f;
        int i2;
        C1017 c1017M5234 = m5234(c0778);
        C1017 c1017M5235 = m5234(c0779);
        if (c1017M5234.f3717 && c1017M5235.f3717) {
            int iM2389 = c0778.m2389() + c1017M5234.f3714;
            int iM23810 = c1017M5235.f3714 - c0779.m2389();
            int i3 = iM23810 - iM2389;
            C1045 c1046 = this.f11539;
            if (!c1046.f3717 && this.f11538 == 3) {
                int i4 = this.f11535;
                if (i4 == 0) {
                    c1046.mo2712(m5237(i3, i));
                } else if (i4 == 1) {
                    c1046.mo2712(Math.min(m5237(c1046.f3801, i), i3));
                } else if (i4 == 2) {
                    C0792 c0792 = this.f11536;
                    C0792 c0793 = c0792.f3119;
                    if (c0793 != null) {
                        C1045 c1047 = (i == 0 ? c0793.f3083 : c0793.f3084).f11539;
                        if (c1047.f3717) {
                            c1046.mo2712(m5237((int) ((c1047.f3714 * (i == 0 ? c0792.f3096 : c0792.f3099)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    C0792 c0794 = this.f11536;
                    AbstractC3700 abstractC3700 = c0794.f3083;
                    if (abstractC3700.f11538 == 3 && abstractC3700.f11535 == 3) {
                        C3607 c3607 = c0794.f3084;
                        if (c3607.f11538 != 3 || c3607.f11535 != 3) {
                            if (i == 0) {
                                abstractC3700 = c0794.f3084;
                            }
                            c1045 = abstractC3700.f11539;
                            if (c1045.f3717) {
                                f = c0794.f3122;
                                if (i == 1) {
                                    i2 = (int) ((c1045.f3714 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c1045.f3714) + 0.5f);
                                }
                                c1046.mo2712(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            abstractC3700 = c0794.f3084;
                        }
                        c1045 = abstractC3700.f11539;
                        if (c1045.f3717) {
                            f = c0794.f3122;
                            if (i == 1) {
                                i2 = (int) ((c1045.f3714 / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * c1045.f3714) + 0.5f);
                            }
                            c1046.mo2712(i2);
                        }
                    }
                }
            }
            if (c1046.f3717) {
                int i5 = c1046.f3714;
                C1017 c1017 = this.f11543;
                C1017 c1018 = this.f11542;
                if (i5 == i3) {
                    c1018.mo2712(iM2389);
                    c1017.mo2712(iM23810);
                    return;
                }
                C0792 c0795 = this.f11536;
                float f2 = i == 0 ? c0795.f3129 : c0795.f3130;
                if (c1017M5234 == c1017M5235) {
                    iM2389 = c1017M5234.f3714;
                    iM23810 = c1017M5235.f3714;
                    f2 = 0.5f;
                }
                c1018.mo2712((int) ((((iM23810 - iM2389) - i5) * f2) + iM2389 + 0.5f));
                c1017.mo2712(c1018.f3714 + c1046.f3714);
            }
        }
    }
}
