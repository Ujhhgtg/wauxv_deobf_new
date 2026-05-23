package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.BitSet;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1396 extends AbstractC2205 {

    public static final C1396 f5022 = new C1396(0);

    public static final C1396 f5023 = new C1396(1);

    public static final C1396 f5024 = new C1396(2);

    public static final C1396 f5025 = new C1396(3);

    public static final C1396 f5026 = new C1396(4);

    public static final C1396 f5027 = new C1396(5);

    public static final C1396 f5028 = new C1396(6);

    public static final C1396 f5029 = new C1396(7);

    public static final C1396 f5030 = new C1396(8);

    public static final C1396 f5031 = new C1396(9);

    public static final C1396 f5032 = new C1396(10);

    public static final C1396 f5033 = new C1396(11);

    public static final C1396 f5034 = new C1396(12);

    public static final C1396 f5035 = new C1396(13);

    public static final C1396 f5036 = new C1396(14);

    public static final C1396 f5037 = new C1396(15);

    public static final C1396 f5038 = new C1396(16);

    public static final C1396 f5039 = new C1396(17);

    public static final C1396 f5040 = new C1396(18);

    public static final C1396 f5041 = new C1396(19);

    public static final C1396 f5042 = new C1396(20);

    public static final C1396 f5043 = new C1396(21);

    public static final C1396 f5044 = new C1396(22);

    public static final C1396 f5045 = new C1396(23);

    public static final C1396 f5046 = new C1396(24);

    public static final C1396 f5047 = new C1396(25);

    public final /* synthetic */ int f5048;

    public /* synthetic */ C1396(int i) {
        this.f5048 = i;
    }

    public static C2526 m3104(C2526 c2526) {
        int iM3106 = m3106(c2526);
        int length = c2526.f4836.length;
        if (iM3106 == length) {
            return c2526;
        }
        C2526 c2527 = new C2526(iM3106);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C2525 c2525 = (C2525) c2526.m3062(i2);
            c2527.m3063(i, c2525);
            if (c2525.m4540() == 2) {
                c2527.m3063(i + 1, C2525.m4532(c2525.f8055 + 1, C3448.f10874, null));
                i += 2;
            } else {
                i++;
            }
        }
        c2527.f6944 = false;
        return c2527;
    }

    public static C2526 m3105(C2526 c2526) {
        int iM3107 = m3107(c2526);
        int length = c2526.f4836.length;
        if (iM3107 == length) {
            return c2526;
        }
        C2526 c2527 = new C2526(iM3107);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C2525 c2525 = (C2525) c2526.m3062(i2);
            c2527.m3063(i, c2525);
            if (c2525.m4540() == 2) {
                c2527.m3063(i + 1, C2525.m4532(c2525.f8055 + 1, C3448.f10874, null));
                i += 2;
            } else {
                i++;
            }
        }
        c2527.f6944 = false;
        return c2527;
    }

    public static int m3106(C2526 c2526) {
        int length = c2526.f4836.length;
        if (length > 5) {
            return -1;
        }
        int iM4540 = 0;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = (C2525) c2526.m3062(i);
            iM4540 += c2525.m4540();
            if (!AbstractC2205.m4081((c2525.m4540() + c2525.f8055) - 1)) {
                return -1;
            }
        }
        if (iM4540 <= 5) {
            return iM4540;
        }
        return -1;
    }

    public static int m3107(C2526 c2526) {
        int length = c2526.f4836.length;
        if (length > 5) {
            return -1;
        }
        int iM4540 = 0;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = (C2525) c2526.m3062(i);
            iM4540 += c2525.m4540();
            if (!AbstractC2205.m4081((c2525.m4540() + c2525.f8055) - 1)) {
                return -1;
            }
        }
        if (iM4540 <= 5) {
            return iM4540;
        }
        return -1;
    }

    @Override // p000.AbstractC2205
    public boolean mo3108(C2896 c2896) {
        switch (this.f5048) {
            case 0:
                int iM4903 = c2896.m4903();
                return iM4903 != 0 && ((byte) iM4903) == iM4903;
            case 5:
                int iM4904 = c2896.m4903();
                return iM4904 != 0 && ((short) iM4904) == iM4904;
            case 9:
                int iM4905 = c2896.m4903();
                return iM4905 != 0 && ((short) iM4905) == iM4905;
            case 13:
                int iM4906 = c2896.m4903();
                return iM4906 != 0 && ((short) iM4906) == iM4906;
            case 18 /* 18 */:
                return true;
            default:
                return super.mo3108(c2896);
        }
    }

    @Override // p000.AbstractC2205
    public final int mo3109() {
        switch (this.f5048) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 2;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 2;
            case 11:
                return 2;
            case 12 /* 12 */:
                return 2;
            case 13:
                return 2;
            case 14 /* 14 */:
                return 2;
            case 15:
                return 2;
            case 16:
                return 3;
            case 17 /* 17 */:
                return 3;
            case 18 /* 18 */:
                return 3;
            case 19:
                return 3;
            case 20:
                return 3;
            case 21 /* 21 */:
                return 3;
            case 22 /* 22 */:
                return 4;
            case 23 /* 23 */:
                return 4;
            case 24 /* 24 */:
                return 5;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.AbstractC2205
    public BitSet mo3110(AbstractC0950 abstractC0950) {
        switch (this.f5048) {
            case 2:
                C2526 c2526 = abstractC0950.f3470;
                BitSet bitSet = new BitSet(1);
                bitSet.set(0, AbstractC2205.m4081(((C2525) c2526.m3062(0)).f8055));
                return bitSet;
            case 3:
                C2526 c2527 = abstractC0950.f3470;
                BitSet bitSet2 = new BitSet(1);
                bitSet2.set(0, AbstractC2205.m4080(((C2525) c2527.m3062(0)).f8055));
                return bitSet2;
            case 4:
                C2526 c2528 = abstractC0950.f3470;
                BitSet bitSet3 = new BitSet(2);
                int i = ((C2525) c2528.m3062(0)).f8055;
                int i2 = ((C2525) c2528.m3062(1)).f8055;
                int length = c2528.f4836.length;
                if (length == 2) {
                    bitSet3.set(0, AbstractC2205.m4081(i));
                    bitSet3.set(1, AbstractC2205.m4081(i2));
                } else {
                    if (length != 3) {
                        throw new AssertionError();
                    }
                    if (i != i2) {
                        bitSet3.set(0, false);
                        bitSet3.set(1, false);
                    } else {
                        boolean zM4081 = AbstractC2205.m4081(i2);
                        bitSet3.set(0, zM4081);
                        bitSet3.set(1, zM4081);
                    }
                    bitSet3.set(2, AbstractC2205.m4081(((C2525) c2528.m3062(2)).f8055));
                }
                return bitSet3;
            case 5:
            case 21 /* 21 */:
            case 23 /* 23 */:
            default:
                return super.mo3110(abstractC0950);
            case 6:
                C2526 c2529 = abstractC0950.f3470;
                int length2 = c2529.f4836.length;
                BitSet bitSet4 = new BitSet(length2);
                boolean zM4080 = AbstractC2205.m4080(((C2525) c2529.m3062(0)).f8055);
                if (length2 == 1) {
                    bitSet4.set(0, zM4080);
                } else if (((C2525) c2529.m3062(0)).f8055 == ((C2525) c2529.m3062(1)).f8055) {
                    bitSet4.set(0, zM4080);
                    bitSet4.set(1, zM4080);
                }
                return bitSet4;
            case 7:
                C2526 c25210 = abstractC0950.f3470;
                BitSet bitSet5 = new BitSet(1);
                bitSet5.set(0, AbstractC2205.m4080(((C2525) c25210.m3062(0)).f8055));
                return bitSet5;
            case 8:
                C2526 c25211 = abstractC0950.f3470;
                BitSet bitSet6 = new BitSet(1);
                bitSet6.set(0, AbstractC2205.m4080(((C2525) c25211.m3062(0)).f8055));
                return bitSet6;
            case 9:
                C2526 c25212 = abstractC0950.f3470;
                BitSet bitSet7 = new BitSet(1);
                bitSet7.set(0, AbstractC2205.m4080(((C2525) c25212.m3062(0)).f8055));
                return bitSet7;
            case 10:
                C2526 c25213 = abstractC0950.f3470;
                BitSet bitSet8 = new BitSet(2);
                bitSet8.set(0, AbstractC2205.m4080(((C2525) c25213.m3062(0)).f8055));
                bitSet8.set(1, AbstractC2205.m4080(((C2525) c25213.m3062(1)).f8055));
                return bitSet8;
            case 11:
                C2526 c25214 = abstractC0950.f3470;
                BitSet bitSet9 = new BitSet(2);
                bitSet9.set(0, AbstractC2205.m4081(((C2525) c25214.m3062(0)).f8055));
                bitSet9.set(1, AbstractC2205.m4081(((C2525) c25214.m3062(1)).f8055));
                return bitSet9;
            case 12 /* 12 */:
                C2526 c25215 = abstractC0950.f3470;
                BitSet bitSet10 = new BitSet(2);
                bitSet10.set(0, AbstractC2205.m4081(((C2525) c25215.m3062(0)).f8055));
                bitSet10.set(1, AbstractC2205.m4081(((C2525) c25215.m3062(1)).f8055));
                return bitSet10;
            case 13:
                C2526 c25216 = abstractC0950.f3470;
                BitSet bitSet11 = new BitSet(2);
                bitSet11.set(0, AbstractC2205.m4081(((C2525) c25216.m3062(0)).f8055));
                bitSet11.set(1, AbstractC2205.m4081(((C2525) c25216.m3062(1)).f8055));
                return bitSet11;
            case 14 /* 14 */:
                C2526 c25217 = abstractC0950.f3470;
                BitSet bitSet12 = new BitSet(2);
                bitSet12.set(0, AbstractC2205.m4080(((C2525) c25217.m3062(0)).f8055));
                bitSet12.set(1, AbstractC2205.m4082(((C2525) c25217.m3062(1)).f8055));
                return bitSet12;
            case 15:
                C2526 c25218 = abstractC0950.f3470;
                BitSet bitSet13 = new BitSet(3);
                bitSet13.set(0, AbstractC2205.m4080(((C2525) c25218.m3062(0)).f8055));
                bitSet13.set(1, AbstractC2205.m4080(((C2525) c25218.m3062(1)).f8055));
                bitSet13.set(2, AbstractC2205.m4080(((C2525) c25218.m3062(2)).f8055));
                return bitSet13;
            case 16:
                C2526 c25219 = abstractC0950.f3470;
                int length3 = c25219.f4836.length;
                BitSet bitSet14 = new BitSet(length3);
                boolean zM4082 = AbstractC2205.m4080(((C2525) c25219.m3062(0)).f8055);
                if (length3 == 1) {
                    bitSet14.set(0, zM4082);
                } else if (((C2525) c25219.m3062(0)).f8055 == ((C2525) c25219.m3062(1)).f8055) {
                    bitSet14.set(0, zM4082);
                    bitSet14.set(1, zM4082);
                }
                return bitSet14;
            case 17 /* 17 */:
                C2526 c25220 = abstractC0950.f3470;
                BitSet bitSet15 = new BitSet(1);
                bitSet15.set(0, AbstractC2205.m4080(((C2525) c25220.m3062(0)).f8055));
                return bitSet15;
            case 18 /* 18 */:
                C2526 c25221 = abstractC0950.f3470;
                BitSet bitSet16 = new BitSet(1);
                bitSet16.set(0, AbstractC2205.m4080(((C2525) c25221.m3062(0)).f8055));
                return bitSet16;
            case 19:
                C2526 c25222 = abstractC0950.f3470;
                BitSet bitSet17 = new BitSet(2);
                bitSet17.set(0, AbstractC2205.m4082(((C2525) c25222.m3062(0)).f8055));
                bitSet17.set(1, AbstractC2205.m4082(((C2525) c25222.m3062(1)).f8055));
                return bitSet17;
            case 20:
                C2526 c25223 = abstractC0950.f3470;
                int length4 = c25223.f4836.length;
                BitSet bitSet18 = new BitSet(length4);
                for (int i3 = 0; i3 < length4; i3++) {
                    C2525 c2525 = (C2525) c25223.m3062(i3);
                    bitSet18.set(i3, AbstractC2205.m4081((c2525.m4540() + c2525.f8055) - 1));
                }
                return bitSet18;
            case 22 /* 22 */:
                C2526 c25224 = abstractC0950.f3470;
                int length5 = c25224.f4836.length;
                BitSet bitSet19 = new BitSet(length5);
                for (int i4 = 0; i4 < length5; i4++) {
                    C2525 c25225 = (C2525) c25224.m3062(i4);
                    bitSet19.set(i4, AbstractC2205.m4081((c25225.m4540() + c25225.f8055) - 1));
                }
                return bitSet19;
            case 24 /* 24 */:
                C2526 c25226 = abstractC0950.f3470;
                BitSet bitSet20 = new BitSet(1);
                bitSet20.set(0, AbstractC2205.m4080(((C2525) c25226.m3062(0)).f8055));
                return bitSet20;
        }
    }

    @Override // p000.AbstractC2205
    public final String mo3111(AbstractC1351 abstractC1351) {
        switch (this.f5048) {
            case 0:
                return AbstractC2205.m4048(abstractC1351);
            case 1:
                return "";
            case 2:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 3:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542();
            case 4:
                C2526 c2526 = abstractC1351.f3470;
                int length = c2526.f4836.length;
                return ((C2525) c2526.m3062(length - 2)).m4542() + ", " + ((C2525) c2526.m3062(length - 1)).m4542();
            case 5:
                return AbstractC2205.m4048(abstractC1351);
            case 6:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + abstractC1351.mo2415();
            case 7:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 8:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 9:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4048(abstractC1351);
            case 10:
                C2526 c2527 = abstractC1351.f3470;
                return ((C2525) c2527.m3062(0)).m4542() + ", " + ((C2525) c2527.m3062(1)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 11:
                C2526 c2528 = abstractC1351.f3470;
                return ((C2525) c2528.m3062(0)).m4542() + ", " + ((C2525) c2528.m3062(1)).m4542() + ", " + abstractC1351.mo2415();
            case 12 /* 12 */:
                C2526 c2529 = abstractC1351.f3470;
                return ((C2525) c2529.m3062(0)).m4542() + ", " + ((C2525) c2529.m3062(1)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 13:
                C2526 c25210 = abstractC1351.f3470;
                return ((C2525) c25210.m3062(0)).m4542() + ", " + ((C2525) c25210.m3062(1)).m4542() + ", " + AbstractC2205.m4048(abstractC1351);
            case 14 /* 14 */:
                C2526 c25211 = abstractC1351.f3470;
                return ((C2525) c25211.m3062(0)).m4542() + ", " + ((C2525) c25211.m3062(1)).m4542();
            case 15:
                C2526 c25212 = abstractC1351.f3470;
                return ((C2525) c25212.m3062(0)).m4542() + ", " + ((C2525) c25212.m3062(1)).m4542() + ", " + ((C2525) c25212.m3062(2)).m4542();
            case 16:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + abstractC1351.mo2415();
            case 17 /* 17 */:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            case 18 /* 18 */:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4048(abstractC1351);
            case 19:
                C2526 c25213 = abstractC1351.f3470;
                return ((C2525) c25213.m3062(0)).m4542() + ", " + ((C2525) c25213.m3062(1)).m4542();
            case 20:
                return AbstractC2205.m4073(m3104(abstractC1351.f3470)) + ", " + abstractC1351.mo2415();
            case 21 /* 21 */:
                return AbstractC2205.m4074(abstractC1351.f3470) + ", " + abstractC1351.mo2415();
            case 22 /* 22 */:
                return AbstractC2205.m4073(m3105(abstractC1351.f3470)) + ", " + abstractC1351.mo2415();
            case 23 /* 23 */:
                return AbstractC2205.m4074(abstractC1351.f3470) + ", " + abstractC1351.mo2415();
            case 24 /* 24 */:
                return ((C2525) abstractC1351.f3470.m3062(0)).m4542() + ", " + AbstractC2205.m4064((AbstractC0909) ((C0902) abstractC1351).f3345);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.AbstractC2205
    public final String mo3112(AbstractC1351 abstractC1351) {
        switch (this.f5048) {
            case 0:
                return AbstractC2205.m4047(abstractC1351);
            case 1:
                return "";
            case 2:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 4);
            case 3:
                return "";
            case 4:
                return "";
            case 5:
                return AbstractC2205.m4047(abstractC1351);
            case 6:
                return abstractC1351.mo2414();
            case 7:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, ((C2525) abstractC1351.f3470.m3062(0)).m4540() == 1 ? 32 : 64);
            case 8:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 16);
            case 9:
                return AbstractC2205.m4047(abstractC1351);
            case 10:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 8);
            case 11:
                return abstractC1351.mo2414();
            case 12 /* 12 */:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 16);
            case 13:
                return AbstractC2205.m4047(abstractC1351);
            case 14 /* 14 */:
                return "";
            case 15:
                return "";
            case 16:
                return abstractC1351.mo2414();
            case 17 /* 17 */:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 32);
            case 18 /* 18 */:
                return AbstractC2205.m4047(abstractC1351);
            case 19:
                return "";
            case 20:
                return abstractC1351.mo2414();
            case 21 /* 21 */:
                return abstractC1351.mo2414();
            case 22 /* 22 */:
                return abstractC1351.mo2414();
            case 23 /* 23 */:
                return abstractC1351.mo2414();
            case 24 /* 24 */:
                return AbstractC2205.m4063((AbstractC0909) ((C0902) abstractC1351).f3345, 64);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    @Override // p000.AbstractC2205
    public final boolean mo3113(AbstractC0950 abstractC0950) {
        int iMo2424;
        C2525 c2525;
        C2525 c2526;
        C2525 c2527;
        C2525 c2528;
        switch (this.f5048) {
            case 0:
                if (!(abstractC0950 instanceof C2896) || abstractC0950.f3470.f4836.length != 0) {
                    return false;
                }
                C2896 c2896 = (C2896) abstractC0950;
                if (c2896.m4904()) {
                    return mo3108(c2896);
                }
                return true;
            case 1:
                return (abstractC0950 instanceof C2706) && abstractC0950.f3470.f4836.length == 0;
            case 2:
                C2526 c2529 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c2529.f4836.length != 1 || !AbstractC2205.m4081(((C2525) c2529.m3062(0)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC0777 = ((C0902) abstractC0950).f3345;
                if (!(abstractC0777 instanceof AbstractC0909)) {
                    return false;
                }
                AbstractC0909 abstractC0909 = (AbstractC0909) abstractC0777;
                return abstractC0909.mo2423() && (iMo2424 = abstractC0909.mo2424()) >= -8 && iMo2424 <= 7;
            case 3:
                C2526 c25210 = abstractC0950.f3470;
                return (abstractC0950 instanceof C2706) && c25210.f4836.length == 1 && AbstractC2205.m4080(((C2525) c25210.m3062(0)).f8055);
            case 4:
                if (!(abstractC0950 instanceof C2706)) {
                    return false;
                }
                C2526 c25211 = abstractC0950.f3470;
                int length = c25211.f4836.length;
                if (length == 2) {
                    c2525 = (C2525) c25211.m3062(0);
                    c2526 = (C2525) c25211.m3062(1);
                } else {
                    if (length != 3) {
                        return false;
                    }
                    c2525 = (C2525) c25211.m3062(1);
                    c2526 = (C2525) c25211.m3062(2);
                    if (c2525.f8055 != ((C2525) c25211.m3062(0)).f8055) {
                        return false;
                    }
                }
                return AbstractC2205.m4081(c2525.f8055) && AbstractC2205.m4081(c2526.f8055);
            case 5:
                if (!(abstractC0950 instanceof C2896) || abstractC0950.f3470.f4836.length != 0) {
                    return false;
                }
                C2896 c2897 = (C2896) abstractC0950;
                if (c2897.m4904()) {
                    return mo3108(c2897);
                }
                return true;
            case 6:
                if (!(abstractC0950 instanceof C0902)) {
                    return false;
                }
                C2526 c25212 = abstractC0950.f3470;
                int length2 = c25212.f4836.length;
                if (length2 == 1) {
                    c2527 = (C2525) c25212.m3062(0);
                } else {
                    if (length2 != 2) {
                        return false;
                    }
                    c2527 = (C2525) c25212.m3062(0);
                    if (c2527.f8055 != ((C2525) c25212.m3062(1)).f8055) {
                        return false;
                    }
                }
                if (!AbstractC2205.m4080(c2527.f8055)) {
                    return false;
                }
                C0902 c0902 = (C0902) abstractC0950;
                int iM2417 = c0902.m2417();
                AbstractC0777 abstractC0778 = c0902.f3345;
                if (AbstractC2205.m4082(iM2417)) {
                    return (abstractC0778 instanceof C0918) || (abstractC0778 instanceof C0899) || (abstractC0778 instanceof C0917) || (abstractC0778 instanceof C0912) || (abstractC0778 instanceof C0915);
                }
                return false;
            case 7:
                C2526 c25213 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25213.f4836.length != 1 || !AbstractC2205.m4080(((C2525) c25213.m3062(0)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC0779 = ((C0902) abstractC0950).f3345;
                if (!(abstractC0779 instanceof AbstractC0909)) {
                    return false;
                }
                AbstractC0909 abstractC09010 = (AbstractC0909) abstractC0779;
                if (((C2525) c25213.m3062(0)).m4540() == 1) {
                    if ((abstractC09010.mo2424() & 65535) != 0) {
                        return false;
                    }
                } else if ((abstractC09010.mo2425() & 281474976710655L) != 0) {
                    return false;
                }
                return true;
            case 8:
                C2526 c25214 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25214.f4836.length != 1 || !AbstractC2205.m4080(((C2525) c25214.m3062(0)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC07710 = ((C0902) abstractC0950).f3345;
                if (!(abstractC07710 instanceof AbstractC0909)) {
                    return false;
                }
                AbstractC0909 abstractC09011 = (AbstractC0909) abstractC07710;
                if (!abstractC09011.mo2423()) {
                    return false;
                }
                int iMo2425 = abstractC09011.mo2424();
                return ((short) iMo2425) == iMo2425;
            case 9:
                C2526 c25215 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C2896) || c25215.f4836.length != 1 || !AbstractC2205.m4080(((C2525) c25215.m3062(0)).f8055)) {
                    return false;
                }
                C2896 c2898 = (C2896) abstractC0950;
                if (c2898.m4904()) {
                    return mo3108(c2898);
                }
                return true;
            case 10:
                C2526 c25216 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25216.f4836.length != 2 || !AbstractC2205.m4080(((C2525) c25216.m3062(0)).f8055) || !AbstractC2205.m4080(((C2525) c25216.m3062(1)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC07711 = ((C0902) abstractC0950).f3345;
                if (!(abstractC07711 instanceof AbstractC0909)) {
                    return false;
                }
                AbstractC0909 abstractC09012 = (AbstractC0909) abstractC07711;
                if (!abstractC09012.mo2423()) {
                    return false;
                }
                int iMo2426 = abstractC09012.mo2424();
                return ((byte) iMo2426) == iMo2426;
            case 11:
                C2526 c25217 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25217.f4836.length != 2 || !AbstractC2205.m4081(((C2525) c25217.m3062(0)).f8055) || !AbstractC2205.m4081(((C2525) c25217.m3062(1)).f8055)) {
                    return false;
                }
                C0902 c0903 = (C0902) abstractC0950;
                if (!AbstractC2205.m4082(c0903.m2417())) {
                    return false;
                }
                AbstractC0777 abstractC07712 = c0903.f3345;
                return (abstractC07712 instanceof C0918) || (abstractC07712 instanceof C0899);
            case 12 /* 12 */:
                C2526 c25218 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25218.f4836.length != 2 || !AbstractC2205.m4081(((C2525) c25218.m3062(0)).f8055) || !AbstractC2205.m4081(((C2525) c25218.m3062(1)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC07713 = ((C0902) abstractC0950).f3345;
                if (!(abstractC07713 instanceof AbstractC0909)) {
                    return false;
                }
                AbstractC0909 abstractC09013 = (AbstractC0909) abstractC07713;
                if (!abstractC09013.mo2423()) {
                    return false;
                }
                int iMo2427 = abstractC09013.mo2424();
                return ((short) iMo2427) == iMo2427;
            case 13:
                C2526 c25219 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C2896) || c25219.f4836.length != 2 || !AbstractC2205.m4081(((C2525) c25219.m3062(0)).f8055) || !AbstractC2205.m4081(((C2525) c25219.m3062(1)).f8055)) {
                    return false;
                }
                C2896 c2899 = (C2896) abstractC0950;
                if (c2899.m4904()) {
                    return mo3108(c2899);
                }
                return true;
            case 14 /* 14 */:
                C2526 c25220 = abstractC0950.f3470;
                return (abstractC0950 instanceof C2706) && c25220.f4836.length == 2 && AbstractC2205.m4080(((C2525) c25220.m3062(0)).f8055) && AbstractC2205.m4082(((C2525) c25220.m3062(1)).f8055);
            case 15:
                C2526 c25221 = abstractC0950.f3470;
                return (abstractC0950 instanceof C2706) && c25221.f4836.length == 3 && AbstractC2205.m4080(((C2525) c25221.m3062(0)).f8055) && AbstractC2205.m4080(((C2525) c25221.m3062(1)).f8055) && AbstractC2205.m4080(((C2525) c25221.m3062(2)).f8055);
            case 16:
                if (!(abstractC0950 instanceof C0902)) {
                    return false;
                }
                C2526 c25222 = abstractC0950.f3470;
                int length3 = c25222.f4836.length;
                if (length3 == 1) {
                    c2528 = (C2525) c25222.m3062(0);
                } else {
                    if (length3 != 2) {
                        return false;
                    }
                    c2528 = (C2525) c25222.m3062(0);
                    if (c2528.f8055 != ((C2525) c25222.m3062(1)).f8055) {
                        return false;
                    }
                }
                if (!AbstractC2205.m4080(c2528.f8055)) {
                    return false;
                }
                AbstractC0777 abstractC07714 = ((C0902) abstractC0950).f3345;
                return (abstractC07714 instanceof C0918) || (abstractC07714 instanceof C0899) || (abstractC07714 instanceof C0917);
            case 17 /* 17 */:
                C2526 c25223 = abstractC0950.f3470;
                if (!(abstractC0950 instanceof C0902) || c25223.f4836.length != 1 || !AbstractC2205.m4080(((C2525) c25223.m3062(0)).f8055)) {
                    return false;
                }
                AbstractC0777 abstractC07715 = ((C0902) abstractC0950).f3345;
                if (abstractC07715 instanceof AbstractC0909) {
                    return ((AbstractC0909) abstractC07715).mo2423();
                }
                return false;
            case 18 /* 18 */:
                C2526 c25224 = abstractC0950.f3470;
                return (abstractC0950 instanceof C2896) && c25224.f4836.length == 1 && AbstractC2205.m4080(((C2525) c25224.m3062(0)).f8055);
            case 19:
                C2526 c25225 = abstractC0950.f3470;
                return (abstractC0950 instanceof C2706) && c25225.f4836.length == 2 && AbstractC2205.m4082(((C2525) c25225.m3062(0)).f8055) && AbstractC2205.m4082(((C2525) c25225.m3062(1)).f8055);
            case 20:
                if (!(abstractC0950 instanceof C0902)) {
                    return false;
                }
                C0902 c0904 = (C0902) abstractC0950;
                if (!AbstractC2205.m4082(c0904.m2417())) {
                    return false;
                }
                AbstractC0777 abstractC07716 = c0904.f3345;
                return ((abstractC07716 instanceof C0913) || (abstractC07716 instanceof C0918) || (abstractC07716 instanceof C0895)) && m3106(c0904.f3470) >= 0;
            case 21 /* 21 */:
                if (!(abstractC0950 instanceof C0902)) {
                    return false;
                }
                C0902 c0905 = (C0902) abstractC0950;
                int iM2418 = c0905.m2417();
                AbstractC0777 abstractC07717 = c0905.f3345;
                if (!AbstractC2205.m4082(iM2418)) {
                    return false;
                }
                if (!(abstractC07717 instanceof C0913) && !(abstractC07717 instanceof C0918) && !(abstractC07717 instanceof C0895)) {
                    return false;
                }
                C2526 c25226 = c0905.f3470;
                Object[] objArr = c25226.f4836;
                int length4 = objArr.length;
                return objArr.length == 0 || (AbstractC2205.m4061(c25226) && AbstractC2205.m4082(((C2525) c25226.m3062(0)).f8055) && AbstractC2205.m4080(c25226.m4548()));
            case 22 /* 22 */:
                if (!(abstractC0950 instanceof C2099)) {
                    return false;
                }
                C2099 c2099 = (C2099) abstractC0950;
                AbstractC0777[] abstractC0777Arr = c2099.f6917;
                if (abstractC0777Arr.length != 2) {
                    return false;
                }
                return AbstractC2205.m4082(c2099.m3891(0)) && AbstractC2205.m4082(c2099.m3891(1)) && (abstractC0777Arr[0] instanceof C0913) && (abstractC0777Arr[1] instanceof C0915) && m3107(c2099.f3470) >= 0;
            case 23 /* 23 */:
                if (!(abstractC0950 instanceof C2099)) {
                    return false;
                }
                C2099 c20910 = (C2099) abstractC0950;
                int iM3891 = c20910.m3891(0);
                int iM3892 = c20910.m3891(1);
                if (!AbstractC2205.m4082(iM3891) || !AbstractC2205.m4082(iM3892)) {
                    return false;
                }
                AbstractC0777[] abstractC0777Arr2 = c20910.f6917;
                if (!(abstractC0777Arr2[0] instanceof C0913) || !(abstractC0777Arr2[1] instanceof C0915)) {
                    return false;
                }
                C2526 c25227 = c20910.f3470;
                int length5 = c25227.f4836.length;
                return length5 == 0 || (AbstractC2205.m4080(c25227.m4548()) && AbstractC2205.m4082(length5) && AbstractC2205.m4082(((C2525) c25227.m3062(0)).f8055) && AbstractC2205.m4061(c25227));
            case 24 /* 24 */:
                C2526 c25228 = abstractC0950.f3470;
                if ((abstractC0950 instanceof C0902) && c25228.f4836.length == 1 && AbstractC2205.m4080(((C2525) c25228.m3062(0)).f8055)) {
                    return ((C0902) abstractC0950).f3345 instanceof AbstractC0908;
                }
                return false;
            default:
                return true;
        }
    }

    @Override // p000.AbstractC2205
    public final void mo3114(C0519 c0519, AbstractC1351 abstractC1351) {
        switch (this.f5048) {
            case 0:
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2896) abstractC1351).m4903() & 255));
                return;
            case 1:
                c0519.m1840(AbstractC2205.m4066(abstractC1351, 0));
                return;
            case 2:
                c0519.m1840(AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(((C2525) abstractC1351.f3470.m3062(0)).f8055, ((AbstractC0909) ((C0902) abstractC1351).f3345).mo2424() & 15)));
                return;
            case 3:
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) abstractC1351.f3470.m3062(0)).f8055));
                return;
            case 4:
                C2526 c2526 = abstractC1351.f3470;
                int length = c2526.f4836.length;
                c0519.m1840(AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(((C2525) c2526.m3062(length - 2)).f8055, ((C2525) c2526.m3062(length - 1)).f8055)));
                return;
            case 5:
                int iM4903 = ((C2896) abstractC1351).m4903();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, 0));
                c0519.m1840((short) iM4903);
                return;
            case 6:
                C2526 c2527 = abstractC1351.f3470;
                int iM2417 = ((C0902) abstractC1351).m2417();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c2527.m3062(0)).f8055));
                c0519.m1840((short) iM2417);
                return;
            case 7:
                C2526 c2528 = abstractC1351.f3470;
                AbstractC0909 abstractC0909 = (AbstractC0909) ((C0902) abstractC1351).f3345;
                short sMo2424 = (short) (((C2525) c2528.m3062(0)).m4540() == 1 ? abstractC0909.mo2424() >>> 16 : (int) (abstractC0909.mo2425() >>> 48));
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c2528.m3062(0)).f8055));
                c0519.m1840(sMo2424);
                return;
            case 8:
                C2526 c2529 = abstractC1351.f3470;
                int iMo2424 = ((AbstractC0909) ((C0902) abstractC1351).f3345).mo2424();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c2529.m3062(0)).f8055));
                c0519.m1840((short) iMo2424);
                return;
            case 9:
                C2526 c25210 = abstractC1351.f3470;
                int iM4904 = ((C2896) abstractC1351).m4903();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c25210.m3062(0)).f8055));
                c0519.m1840((short) iM4904);
                return;
            case 10:
                C2526 c25211 = abstractC1351.f3470;
                int iMo2425 = ((AbstractC0909) ((C0902) abstractC1351).f3345).mo2424();
                short sM4066 = AbstractC2205.m4066(abstractC1351, ((C2525) c25211.m3062(0)).f8055);
                short sM4049 = AbstractC2205.m4049(((C2525) c25211.m3062(1)).f8055, iMo2425 & 255);
                c0519.m1840(sM4066);
                c0519.m1840(sM4049);
                return;
            case 11:
                C2526 c25212 = abstractC1351.f3470;
                int iM2418 = ((C0902) abstractC1351).m2417();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(((C2525) c25212.m3062(0)).f8055, ((C2525) c25212.m3062(1)).f8055)));
                c0519.m1840((short) iM2418);
                return;
            case 12 /* 12 */:
                C2526 c25213 = abstractC1351.f3470;
                int iMo2426 = ((AbstractC0909) ((C0902) abstractC1351).f3345).mo2424();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(((C2525) c25213.m3062(0)).f8055, ((C2525) c25213.m3062(1)).f8055)));
                c0519.m1840((short) iMo2426);
                return;
            case 13:
                C2526 c25214 = abstractC1351.f3470;
                int iM4905 = ((C2896) abstractC1351).m4903();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(((C2525) c25214.m3062(0)).f8055, ((C2525) c25214.m3062(1)).f8055)));
                c0519.m1840((short) iM4905);
                return;
            case 14 /* 14 */:
                C2526 c25215 = abstractC1351.f3470;
                short sM4067 = AbstractC2205.m4066(abstractC1351, ((C2525) c25215.m3062(0)).f8055);
                short s = (short) ((C2525) c25215.m3062(1)).f8055;
                c0519.m1840(sM4067);
                c0519.m1840(s);
                return;
            case 15:
                C2526 c25216 = abstractC1351.f3470;
                short sM4068 = AbstractC2205.m4066(abstractC1351, ((C2525) c25216.m3062(0)).f8055);
                short sM40410 = AbstractC2205.m4049(((C2525) c25216.m3062(1)).f8055, ((C2525) c25216.m3062(2)).f8055);
                c0519.m1840(sM4068);
                c0519.m1840(sM40410);
                return;
            case 16:
                C2526 c25217 = abstractC1351.f3470;
                int iM2419 = ((C0902) abstractC1351).m2417();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c25217.m3062(0)).f8055));
                c0519.m1840((short) iM2419);
                c0519.m1840((short) (iM2419 >> 16));
                return;
            case 17 /* 17 */:
                C2526 c25218 = abstractC1351.f3470;
                int iMo2427 = ((AbstractC0909) ((C0902) abstractC1351).f3345).mo2424();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c25218.m3062(0)).f8055));
                c0519.m1840((short) iMo2427);
                c0519.m1840((short) (iMo2427 >> 16));
                return;
            case 18 /* 18 */:
                C2526 c25219 = abstractC1351.f3470;
                int iM4906 = ((C2896) abstractC1351).m4903();
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c25219.m3062(0)).f8055));
                c0519.m1840((short) iM4906);
                c0519.m1840((short) (iM4906 >> 16));
                return;
            case 19:
                C2526 c25220 = abstractC1351.f3470;
                short sM4069 = AbstractC2205.m4066(abstractC1351, 0);
                short s2 = (short) ((C2525) c25220.m3062(0)).f8055;
                short s3 = (short) ((C2525) c25220.m3062(1)).f8055;
                c0519.m1840(sM4069);
                c0519.m1840(s2);
                c0519.m1840(s3);
                return;
            case 20:
                int iM24110 = ((C0902) abstractC1351).m2417();
                C2526 c2526M3104 = m3104(abstractC1351.f3470);
                int length2 = c2526M3104.f4836.length;
                int i = length2 > 0 ? ((C2525) c2526M3104.m3062(0)).f8055 : 0;
                int i2 = length2 > 1 ? ((C2525) c2526M3104.m3062(1)).f8055 : 0;
                int i3 = length2 > 2 ? ((C2525) c2526M3104.m3062(2)).f8055 : 0;
                int i4 = length2 > 3 ? ((C2525) c2526M3104.m3062(3)).f8055 : 0;
                short sM40610 = AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(length2 > 4 ? ((C2525) c2526M3104.m3062(4)).f8055 : 0, length2));
                short sM4050 = AbstractC2205.m4050(i, i2, i3, i4);
                c0519.m1840(sM40610);
                c0519.m1840((short) iM24110);
                c0519.m1840(sM4050);
                return;
            case 21 /* 21 */:
                C2526 c25221 = abstractC1351.f3470;
                int iM24111 = ((C0902) abstractC1351).m2417();
                int i5 = c25221.f4836.length != 0 ? ((C2525) c25221.m3062(0)).f8055 : 0;
                c0519.m1840(AbstractC2205.m4066(abstractC1351, c25221.m4548()));
                c0519.m1840((short) iM24111);
                c0519.m1840((short) i5);
                return;
            case 22 /* 22 */:
                C2099 c2099 = (C2099) abstractC1351;
                short sM3891 = (short) c2099.m3891(0);
                short sM3892 = (short) c2099.m3891(1);
                C2526 c2526M3105 = m3105(abstractC1351.f3470);
                int length3 = c2526M3105.f4836.length;
                int i6 = length3 > 0 ? ((C2525) c2526M3105.m3062(0)).f8055 : 0;
                int i7 = length3 > 1 ? ((C2525) c2526M3105.m3062(1)).f8055 : 0;
                int i8 = length3 > 2 ? ((C2525) c2526M3105.m3062(2)).f8055 : 0;
                int i9 = length3 > 3 ? ((C2525) c2526M3105.m3062(3)).f8055 : 0;
                short sM40611 = AbstractC2205.m4066(abstractC1351, AbstractC2205.m4065(length3 > 4 ? ((C2525) c2526M3105.m3062(4)).f8055 : 0, length3));
                short sM4051 = AbstractC2205.m4050(i6, i7, i8, i9);
                c0519.m1840(sM40611);
                c0519.m1840(sM3891);
                c0519.m1840(sM4051);
                c0519.m1840(sM3892);
                return;
            case 23 /* 23 */:
                C2099 c20910 = (C2099) abstractC1351;
                short sM3893 = (short) c20910.m3891(0);
                short sM3894 = (short) c20910.m3891(1);
                C2526 c25222 = abstractC1351.f3470;
                short s4 = c25222.f4836.length > 0 ? (short) ((C2525) c25222.m3062(0)).f8055 : (short) 0;
                c0519.m1840(AbstractC2205.m4066(abstractC1351, c25222.m4548()));
                c0519.m1840(sM3893);
                c0519.m1840(s4);
                c0519.m1840(sM3894);
                return;
            case 24 /* 24 */:
                C2526 c25223 = abstractC1351.f3470;
                long j = ((AbstractC0908) ((C0902) abstractC1351).f3345).f3365;
                c0519.m1840(AbstractC2205.m4066(abstractC1351, ((C2525) c25223.m3062(0)).f8055));
                c0519.m1840((short) j);
                c0519.m1840((short) (j >> 16));
                c0519.m1840((short) (j >> 32));
                c0519.m1840((short) (j >> 48));
                return;
            default:
                throw new RuntimeException("unsupported");
        }
    }
}
