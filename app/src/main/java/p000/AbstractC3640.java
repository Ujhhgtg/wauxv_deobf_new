package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3640 implements InterfaceC1012 {

    public int f11386;

    public C0793 f11387;

    public C2608 f11388;

    public int f11389;

    public final C1042 f11390 = new C1042(this);

    public int f11391 = 0;

    public boolean f11392 = false;

    public final C1014 f11393 = new C1014(this);

    public final C1014 f11394 = new C1014(this);

    public int f11395 = 1;

    public AbstractC3640(C0793 c0793) {
        this.f11387 = c0793;
    }

    public static void m5227(C1014 c1014, C1014 c1015, int i) {
        c1014.f3712.add(c1015);
        c1014.f3706 = i;
        c1015.f3711.add(c1014);
    }

    public static C1014 m5228(C0779 c0779) {
        C0779 c07710 = c0779.f2881;
        if (c07710 == null) {
            return null;
        }
        C0793 c0793 = c07710.f2879;
        int iM4759 = AbstractC2784.m4759(c07710.f2880);
        if (iM4759 == 1) {
            return c0793.f3076.f11393;
        }
        if (iM4759 == 2) {
            return c0793.f3077.f11393;
        }
        if (iM4759 == 3) {
            return c0793.f3076.f11394;
        }
        if (iM4759 == 4) {
            return c0793.f3077.f11394;
        }
        if (iM4759 != 5) {
            return null;
        }
        return c0793.f3077.f11148;
    }

    public static C1014 m5229(C0779 c0779, int i) {
        C0779 c07710 = c0779.f2881;
        if (c07710 == null) {
            return null;
        }
        C0793 c0793 = c07710.f2879;
        AbstractC3640 abstractC3640 = i == 0 ? c0793.f3076 : c0793.f3077;
        int iM4759 = AbstractC2784.m4759(c07710.f2880);
        if (iM4759 == 1 || iM4759 == 2) {
            return abstractC3640.f11393;
        }
        if (iM4759 == 3 || iM4759 == 4) {
            return abstractC3640.f11394;
        }
        return null;
    }

    public final void m5230(C1014 c1014, C1014 c1015, int i, C1042 c1042) {
        c1014.f3712.add(c1015);
        c1014.f3712.add(this.f11390);
        c1014.f3708 = i;
        c1014.f3709 = c1042;
        c1015.f3711.add(c1014);
        c1042.f3711.add(c1014);
    }

    public abstract void mo2004();

    public abstract void mo2005();

    public abstract void mo2006();

    public final int m5231(int i, int i2) {
        if (i2 == 0) {
            C0793 c0793 = this.f11387;
            int i3 = c0793.f3088;
            int iMax = Math.max(c0793.f3087, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0793 c0794 = this.f11387;
            int i4 = c0794.f3091;
            int iMax2 = Math.max(c0794.f3090, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long mo2007() {
        C1042 c1042 = this.f11390;
        if (c1042.f3710) {
            return c1042.f3707;
        }
        return 0L;
    }

    public abstract boolean mo2008();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void m5232(C0779 c0779, C0779 c07710, int i) {
        C1042 c1042;
        float f;
        int i2;
        C1014 c1014M5228 = m5228(c0779);
        C1014 c1014M5229 = m5228(c07710);
        if (c1014M5228.f3710 && c1014M5229.f3710) {
            int iM2274 = c0779.m2274() + c1014M5228.f3707;
            int iM2275 = c1014M5229.f3707 - c07710.m2274();
            int i3 = iM2275 - iM2274;
            C1042 c1043 = this.f11390;
            if (!c1043.f3710 && this.f11389 == 3) {
                int i4 = this.f11386;
                if (i4 == 0) {
                    c1043.mo2588(m5231(i3, i));
                } else if (i4 == 1) {
                    c1043.mo2588(Math.min(m5231(c1043.f3794, i), i3));
                } else if (i4 == 2) {
                    C0793 c0793 = this.f11387;
                    C0793 c0794 = c0793.f3112;
                    if (c0794 != null) {
                        C1042 c1044 = (i == 0 ? c0794.f3076 : c0794.f3077).f11390;
                        if (c1044.f3710) {
                            c1043.mo2588(m5231((int) ((c1044.f3707 * (i == 0 ? c0793.f3089 : c0793.f3092)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    C0793 c0795 = this.f11387;
                    AbstractC3640 abstractC3640 = c0795.f3076;
                    if (abstractC3640.f11389 == 3 && abstractC3640.f11386 == 3) {
                        C3549 c3549 = c0795.f3077;
                        if (c3549.f11389 != 3 || c3549.f11386 != 3) {
                            if (i == 0) {
                                abstractC3640 = c0795.f3077;
                            }
                            c1042 = abstractC3640.f11390;
                            if (c1042.f3710) {
                                f = c0795.f3115;
                                if (i == 1) {
                                    i2 = (int) ((c1042.f3707 / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c1042.f3707) + 0.5f);
                                }
                                c1043.mo2588(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            abstractC3640 = c0795.f3077;
                        }
                        c1042 = abstractC3640.f11390;
                        if (c1042.f3710) {
                            f = c0795.f3115;
                            if (i == 1) {
                                i2 = (int) ((c1042.f3707 / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * c1042.f3707) + 0.5f);
                            }
                            c1043.mo2588(i2);
                        }
                    }
                }
            }
            if (c1043.f3710) {
                int i5 = c1043.f3707;
                C1014 c1014 = this.f11394;
                C1014 c1015 = this.f11393;
                if (i5 == i3) {
                    c1015.mo2588(iM2274);
                    c1014.mo2588(iM2275);
                    return;
                }
                C0793 c0796 = this.f11387;
                float f2 = i == 0 ? c0796.f3122 : c0796.f3123;
                if (c1014M5228 == c1014M5229) {
                    iM2274 = c1014M5228.f3707;
                    iM2275 = c1014M5229.f3707;
                    f2 = 0.5f;
                }
                c1015.mo2588((int) ((((iM2275 - iM2274) - i5) * f2) + iM2274 + 0.5f));
                c1014.mo2588(c1015.f3707 + c1043.f3707);
            }
        }
    }
}
