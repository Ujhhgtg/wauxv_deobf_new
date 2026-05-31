package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲈᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 implements InterfaceC1929 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3302;

    public /* synthetic */ C0867(int i) {
        this.f3302 = i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0169  */
    @Override // p000.InterfaceC1929
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo2502(C2136 c2136, AbstractC2254 abstractC2254) {
        boolean z;
        switch (this.f3302) {
            case 0:
                AbstractC2254 abstractC2255 = (C2976) abstractC2254;
                c2136.m4098();
                int iM4102 = c2136.m4102();
                ((C2852) c2136.f7061).m4802((char) 160);
                c2136.m4105(abstractC2255, iM4102);
                c2136.m4093(abstractC2255);
                break;
            case 1:
                C1535 c1535 = (C1535) abstractC2254;
                c2136.m4098();
                int iM4103 = c2136.m4102();
                c2136.m4107(c1535);
                AbstractC1470.f5228.m4406((C0967) c2136.f7060, Integer.valueOf(c1535.f5390));
                c2136.m4105(c1535, iM4103);
                c2136.m4093(c1535);
                break;
            case 2:
                ((C2852) c2136.f7061).m4802(' ');
                break;
            case 3:
                c2136.m4098();
                break;
            case 4:
                AbstractC2254 abstractC2256 = (C2362) abstractC2254;
                AbstractC0403 abstractC0403 = (AbstractC0403) abstractC2256.f7333;
                if (abstractC0403 != null) {
                    AbstractC0403 abstractC0404 = (AbstractC0403) abstractC0403.f7333;
                    if (abstractC0404 instanceof AbstractC1831) {
                        z = ((AbstractC1831) abstractC0404).f6102;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    c2136.m4098();
                }
                int iM4104 = c2136.m4102();
                c2136.m4107(abstractC2256);
                AbstractC1470.f5230.m4406((C0967) c2136.f7060, Boolean.valueOf(z));
                c2136.m4105(abstractC2256, iM4104);
                if (!z) {
                    c2136.m4093(abstractC2256);
                }
                break;
            case 5:
                C1816 c1816 = (C1816) abstractC2254;
                int iM4105 = c2136.m4102();
                c2136.m4107(c1816);
                AbstractC1470.f5229.m4406((C0967) c2136.f7060, c1816.f6046);
                c2136.m4105(c1816, iM4105);
                break;
            case 6:
                AbstractC2254 abstractC2257 = (C2910) abstractC2254;
                int iM4106 = c2136.m4102();
                c2136.m4107(abstractC2257);
                c2136.m4105(abstractC2257, iM4106);
                break;
            case 7:
                AbstractC2254 abstractC2258 = (C1185) abstractC2254;
                int iM4107 = c2136.m4102();
                c2136.m4107(abstractC2258);
                c2136.m4105(abstractC2258, iM4107);
                break;
            case 8:
                AbstractC2254 abstractC2259 = (C0406) abstractC2254;
                c2136.m4098();
                int iM4108 = c2136.m4102();
                c2136.m4107(abstractC2259);
                c2136.m4105(abstractC2259, iM4108);
                c2136.m4093(abstractC2259);
                break;
            case 9:
                C0728 c0728 = (C0728) abstractC2254;
                int iM4109 = c2136.m4102();
                C2852 c2852 = (C2852) c2136.f7061;
                StringBuilder sb = c2852.f9076;
                sb.append((char) 160);
                sb.append(c0728.f2755);
                c2852.m4802((char) 160);
                c2136.m4105(c0728, iM4109);
                break;
            case 10:
                C1296 c1296 = (C1296) abstractC2254;
                C0869.m2503(c2136, c1296.f4713, c1296.f4714, c1296);
                break;
            case 11:
                C1639 c1639 = (C1639) abstractC2254;
                C0869.m2503(c2136, null, c1639.f5532, c1639);
                break;
            case Opcodes.FCONST_1 /* 12 */:
                C2852 c2853 = (C2852) c2136.f7061;
                C1618 c1618 = (C1618) abstractC2254;
                C1927 c1927 = (C1927) c2136.f7059;
                C0410 c0410 = (C0410) ((C1477) c1927.f6348).f5263.get(C1618.class);
                if (c0410 == null) {
                    c2136.m4107(c1618);
                    break;
                } else {
                    int iM41010 = c2136.m4102();
                    c2136.m4107(c1618);
                    if (iM41010 == c2136.m4102()) {
                        c2853.m4802((char) 65532);
                    }
                    boolean z2 = c1618.f7333 instanceof C1816;
                    C1224 c1224 = (C1224) c1927.f6347;
                    String str = c1618.f5510;
                    c1224.getClass();
                    C0967 c0967 = (C0967) c2136.f7060;
                    AbstractC0738.f2832.m4406(c0967, str);
                    AbstractC0738.f2833.m4406(c0967, Boolean.valueOf(z2));
                    AbstractC0738.f2834.m4406(c0967, null);
                    Object objM1743 = c0410.m1743(c1927, c0967);
                    StringBuilder sb2 = c2853.f9076;
                    int length = sb2.length();
                    int length2 = sb2.length();
                    if (length > iM41010 && iM41010 >= 0 && length <= length2) {
                        C2852.m4801(c2853, objM1743, iM41010, length);
                        break;
                    }
                }
                break;
            case 13:
                AbstractC2254 abstractC22510 = (C1838) abstractC2254;
                C2469 c2469 = AbstractC1470.f5225;
                int iM41011 = c2136.m4102();
                C0967 c0968 = (C0967) c2136.f7060;
                c2136.m4107(abstractC22510);
                AbstractC0403 abstractC0405 = (AbstractC0403) abstractC22510.f7333;
                if (abstractC0405 instanceof C2337) {
                    C2337 c2337 = (C2337) abstractC0405;
                    int i = c2337.f7542;
                    c2469.m4406(c0968, EnumC0870.f3307);
                    AbstractC1470.f5227.m4406(c0968, Integer.valueOf(i));
                    c2337.f7542++;
                } else {
                    c2469.m4406(c0968, EnumC0870.f3306);
                    C2469 c24610 = AbstractC1470.f5226;
                    int i2 = 0;
                    for (AbstractC2254 abstractC2254Mo1738 = (AbstractC0403) abstractC22510.f7333; abstractC2254Mo1738 != null; abstractC2254Mo1738 = abstractC2254Mo1738.mo1738()) {
                        if (abstractC2254Mo1738 instanceof C1838) {
                            i2++;
                        }
                    }
                    c24610.m4406(c0968, Integer.valueOf(i2));
                }
                c2136.m4105(abstractC22510, iM41011);
                if (abstractC22510.f7337 != null) {
                    c2136.m4098();
                }
                break;
            default:
                c2136.m4098();
                int iM41012 = c2136.m4102();
                c2136.m4107(abstractC2254);
                c2136.m4105(abstractC2254, iM41012);
                c2136.m4093(abstractC2254);
                break;
        }
    }
}
