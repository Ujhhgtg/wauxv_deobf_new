package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0868 implements InterfaceC1902 {

    public final /* synthetic */ int f3295;

    public /* synthetic */ C0868(int i) {
        this.f3295 = i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0169  */
    @Override // p000.InterfaceC1902
    public final void mo2385(C2103 c2103, AbstractC2224 abstractC2224) {
        boolean z;
        switch (this.f3295) {
            case 0:
                AbstractC2224 abstractC2225 = (C2917) abstractC2224;
                c2103.m3914();
                int iM3918 = c2103.m3918();
                ((C2792) c2103.f6937).m4769((char) 160);
                c2103.m3921(abstractC2225, iM3918);
                c2103.m3910(abstractC2225);
                break;
            case 1:
                C1523 c1523 = (C1523) abstractC2224;
                c2103.m3914();
                int iM3919 = c2103.m3918();
                c2103.m3923(c1523);
                AbstractC2665.f8583.m4385((C0963) c2103.f6936, Integer.valueOf(c1523.f5359));
                c2103.m3921(c1523, iM3919);
                c2103.m3910(c1523);
                break;
            case 2:
                ((C2792) c2103.f6937).m4769(' ');
                break;
            case 3:
                c2103.m3914();
                break;
            case 4:
                AbstractC2224 abstractC2226 = (C2322) abstractC2224;
                AbstractC0428 abstractC0428 = (AbstractC0428) abstractC2226.f7218;
                if (abstractC0428 != null) {
                    AbstractC0428 abstractC0429 = (AbstractC0428) abstractC0428.f7218;
                    if (abstractC0429 instanceof AbstractC1804) {
                        z = ((AbstractC1804) abstractC0429).f6027;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    c2103.m3914();
                }
                int iM39110 = c2103.m3918();
                c2103.m3923(abstractC2226);
                AbstractC2665.f8585.m4385((C0963) c2103.f6936, Boolean.valueOf(z));
                c2103.m3921(abstractC2226, iM39110);
                if (!z) {
                    c2103.m3910(abstractC2226);
                }
                break;
            case 5:
                C1793 c1793 = (C1793) abstractC2224;
                int iM39111 = c2103.m3918();
                c2103.m3923(c1793);
                AbstractC2665.f8584.m4385((C0963) c2103.f6936, c1793.f5990);
                c2103.m3921(c1793, iM39111);
                break;
            case 6:
                AbstractC2224 abstractC2227 = (C2850) abstractC2224;
                int iM39112 = c2103.m3918();
                c2103.m3923(abstractC2227);
                c2103.m3921(abstractC2227, iM39112);
                break;
            case 7:
                AbstractC2224 abstractC2228 = (C1183) abstractC2224;
                int iM39113 = c2103.m3918();
                c2103.m3923(abstractC2228);
                c2103.m3921(abstractC2228, iM39113);
                break;
            case 8:
                AbstractC2224 abstractC2229 = (C0431) abstractC2224;
                c2103.m3914();
                int iM39114 = c2103.m3918();
                c2103.m3923(abstractC2229);
                c2103.m3921(abstractC2229, iM39114);
                c2103.m3910(abstractC2229);
                break;
            case 9:
                C0733 c0733 = (C0733) abstractC2224;
                int iM39115 = c2103.m3918();
                C2792 c2792 = (C2792) c2103.f6937;
                StringBuilder sb = c2792.f8914;
                sb.append((char) 160);
                sb.append(c0733.f2761);
                c2792.m4769((char) 160);
                c2103.m3921(c0733, iM39115);
                break;
            case 10:
                C1295 c1295 = (C1295) abstractC2224;
                C0870.m2386(c2103, c1295.f4714, c1295.f4715, c1295);
                break;
            case 11:
                C1626 c1626 = (C1626) abstractC2224;
                C0870.m2386(c2103, null, c1626.f5498, c1626);
                break;
            case 12 /* 12 */:
                C2792 c2793 = (C2792) c2103.f6937;
                C1605 c1605 = (C1605) abstractC2224;
                C1676 c1676 = (C1676) c2103.f6935;
                C0435 c0435 = (C0435) ((C1466) c1676.f5660).f5231.get(C1605.class);
                if (c0435 == null) {
                    c2103.m3923(c1605);
                    break;
                } else {
                    int iM39116 = c2103.m3918();
                    c2103.m3923(c1605);
                    if (iM39116 == c2103.m3918()) {
                        c2793.m4769((char) 65532);
                    }
                    boolean z2 = c1605.f7218 instanceof C1793;
                    C1227 c1227 = (C1227) c1676.f5659;
                    String str = c1605.f5476;
                    
                    C0963 c0963 = (C0963) c2103.f6936;
                    AbstractC0968.f3512.m4385(c0963, str);
                    AbstractC0968.f3513.m4385(c0963, Boolean.valueOf(z2));
                    AbstractC0968.f3514.m4385(c0963, null);
                    Object objM1637 = c0435.m1637(c1676, c0963);
                    StringBuilder sb2 = c2793.f8914;
                    int length = sb2.length();
                    int length2 = sb2.length();
                    if (length > iM39116 && iM39116 >= 0 && length <= length2) {
                        C2792.m4768(c2793, objM1637, iM39116, length);
                        break;
                    }
                }
                break;
            case 13:
                AbstractC2224 abstractC22210 = (C1811) abstractC2224;
                C2416 c2416 = AbstractC2665.f8580;
                int iM39117 = c2103.m3918();
                C0963 c0964 = (C0963) c2103.f6936;
                c2103.m3923(abstractC22210);
                AbstractC0428 abstractC04210 = (AbstractC0428) abstractC22210.f7218;
                if (abstractC04210 instanceof C2304) {
                    C2304 c2304 = (C2304) abstractC04210;
                    int i = c2304.f7420;
                    c2416.m4385(c0964, EnumC0871.f3300);
                    AbstractC2665.f8582.m4385(c0964, Integer.valueOf(i));
                    c2304.f7420++;
                } else {
                    c2416.m4385(c0964, EnumC0871.f3299);
                    C2416 c2417 = AbstractC2665.f8581;
                    int i2 = 0;
                    for (AbstractC2224 abstractC2224Mo1632 = (AbstractC0428) abstractC22210.f7218; abstractC2224Mo1632 != null; abstractC2224Mo1632 = abstractC2224Mo1632.mo1632()) {
                        if (abstractC2224Mo1632 instanceof C1811) {
                            i2++;
                        }
                    }
                    c2417.m4385(c0964, Integer.valueOf(i2));
                }
                c2103.m3921(abstractC22210, iM39117);
                if (abstractC22210.f7222 != null) {
                    c2103.m3914();
                }
                break;
            default:
                c2103.m3914();
                int iM39118 = c2103.m3918();
                c2103.m3923(abstractC2224);
                c2103.m3921(abstractC2224, iM39118);
                c2103.m3910(abstractC2224);
                break;
        }
    }
}
