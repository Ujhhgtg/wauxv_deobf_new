package p000;

import android.util.Pair;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2174 implements InterfaceC1425 {

    public final /* synthetic */ int f7135;

    public /* synthetic */ C2174(int i) {
        this.f7135 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f7135) {
            case 0:
                C1981 c1981 = (C1981) obj;
                Class clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls = clsM2183 == null ? Integer.class : clsM2183;
                Class clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls2 = clsM2184 == null ? Integer.class : clsM2184;
                Class clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls3 = clsM2185 == null ? String.class : clsM2185;
                Class clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls4 = clsM2186 == null ? String.class : clsM2186;
                Class clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls5 = clsM2187 == null ? String.class : clsM2187;
                Class clsM2188 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls6 = clsM2188 == null ? String.class : clsM2188;
                Class clsM2189 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls7 = clsM2189 == null ? String.class : clsM2189;
                Class clsM21810 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls8 = clsM21810 == null ? String.class : clsM21810;
                Class clsM21811 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                c1981.paramTypes(cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, clsM21811 == null ? String.class : clsM21811);
                break;
            case 1:
                ((C1020) obj).thisMethodMatcher = new C2174(3);
                break;
            case 2:
                ((C1020) obj).thisMethodMatcher = new C2174(4);
                break;
            case 3:
                ((C1333) obj).m3052(new C2174(6));
                break;
            case 4:
                ((C1333) obj).m3052(new C2174(5));
                break;
            case 5:
                C1981 c1982 = (C1981) obj;
                
                c1982.m3820(AbstractC1574.dexToMethod(C2178.f7139).getDeclaringClass());
                C1984 c1984 = new C1984(4);
                C1981 c1983 = new C1981(4);
                String[] strArr = AbstractC1574.f5469;
                c1983.m3827("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv pcKeyStr len:%d, content[%s] pcId[%s]");
                c1984.m3848(c1983);
                C1981 c1985 = new C1981(4);
                c1985.m3827("MicroMsg.CommandProcessor", "summer processed log level[%s], need open debug ret false");
                c1984.m3848(c1985);
                c1982.f6565 = c1984;
                break;
            case 6:
                String[] strArr2 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.NetSceneQueue", "forbid in waiting: type=", "forbid in running: type=");
                break;
            case 7:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C2174(8);
                c1020.thisMethodMatcher = new C2174(9);
                break;
            case 8:
                C1332 c1332 = (C1332) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.plugin.luckymoney.model");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.NetSceneReceiveLuckyMoney", "/cgi-bin/mmpay-bin/receivewxhb");
                c1332.f4791 = c0705;
                break;
            case 9:
                ((C1333) obj).m3052(new C2174(10));
                break;
            case 10:
                C1981 c1986 = (C1981) obj;
                Class clsM21812 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls9 = clsM21812 == null ? Integer.class : clsM21812;
                Class clsM21813 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                Class cls10 = clsM21813 == null ? Integer.class : clsM21813;
                Class clsM21814 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM21814 == null) {
                    clsM21814 = String.class;
                }
                Class clsM21815 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM21815 == null) {
                    clsM21815 = String.class;
                }
                Class clsM21816 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                if (clsM21816 == null) {
                    clsM21816 = Integer.class;
                }
                Class clsM21817 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls11 = clsM21817 == null ? String.class : clsM21817;
                Class clsM21818 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                c1986.paramTypes(cls9, cls10, clsM21814, clsM21815, clsM21816, cls11, clsM21818 == null ? String.class : clsM21818);
                break;
            case 11:
                C1020 c1021 = (C1020) obj;
                c1021.declaringClassMatcher = new C2174(12);
                c1021.thisMethodMatcher = new C2174(13);
                break;
            case 12 /* 12 */:
                C1332 c1333 = (C1332) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1333.m3051("com.tencent.mm.plugin.remittance.model");
                C0705 c0706 = new C0705(4);
                c0706.m2127("Micromsg.NetSceneTenpayRemittanceGen", "/cgi-bin/mmpay-bin/f2fplaceorder", "/cgi-bin/mmpay-bin/transferplaceorder");
                c1333.f4791 = c0706;
                break;
            case 13:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1334);
                c1981M4739.m3822(new C1664(29, 30, 1));
                c1334.f4794 = c1981M4739;
                break;
            case 14 /* 14 */:
                C1020 c1022 = (C1020) obj;
                c1022.declaringClassMatcher = new C2174(15);
                c1022.thisMethodMatcher = new C2174(16);
                break;
            case 15:
                C1332 c1335 = (C1332) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1335.m3051("com.tencent.mm.modelsimple");
                C0705 c0707 = new C0705(4);
                c0707.m2127("MicroMsg.NetSceneRevokeMsg", "/cgi-bin/micromsg-bin/revokemsg");
                c1335.f4791 = c0707;
                break;
            case 16:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1336);
                Class<String> cls12 = String.class;
                Class<String> clsM21819 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM21819 == null) {
                    clsM21819 = String.class;
                }
                Class<String> clsM21820 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                c1981M47310.paramTypes(null, clsM21819, clsM21820 != null ? clsM21820 : String.class);
                c1336.f4794 = c1981M47310;
                break;
            case 17 /* 17 */:
                C1020 c1023 = (C1020) obj;
                c1023.declaringClassMatcher = new C2174(18);
                c1023.thisMethodMatcher = new C2174(19);
                break;
            case 18 /* 18 */:
                ((C1332) obj).m3050(new C2174(20));
                break;
            case 19:
                C1333 c1337 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1337);
                Class<Pair> clsM21821 = AbstractC0743.m2183(AbstractC2519.classToKClass(Pair.class));
                Class cls13 = clsM21821 != null ? clsM21821 : Pair.class;
                Class<String> cls14 = String.class;
                Class<String> clsM21822 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM21822 == null) {
                    clsM21822 = String.class;
                }
                Class<String> clsM21823 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                cls14 = clsM21823 != null ? clsM21823 : String.class;
                Class<Integer> clsM21824 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                c1981M47311.paramTypes(cls13, clsM21822, cls14, clsM21824 != null ? clsM21824 : Integer.class);
                c1337.f4794 = c1981M47311;
                break;
            case 20:
                String[] strArr6 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.NetSceneSendPat", "/cgi-bin/micromsg-bin/sendpat");
                break;
            case 21 /* 21 */:
                C1020 c1024 = (C1020) obj;
                c1024.declaringClassMatcher = new C2174(22);
                c1024.thisMethodMatcher = new C2174(23);
                break;
            case 22 /* 22 */:
                C1332 c1338 = (C1332) obj;
                String[] strArr7 = AbstractC1574.f5469;
                c1338.m3051("com.tencent.mm.plugin.remittance.model");
                C0705 c0708 = new C0705(4);
                c0708.m2127("Micromsg.NetSceneTenpayRemittanceConfirm", "/cgi-bin/mmpay-bin/transferoperation");
                c1338.f4791 = c0708;
                break;
            case 23 /* 23 */:
                ((C1333) obj).m3052(new C2174(24));
                break;
            case 24 /* 24 */:
                ((C1981) obj).m3827("account click info , key is %s, value is %s");
                break;
            case 25 /* 25 */:
                C1020 c1025 = (C1020) obj;
                c1025.declaringClassMatcher = new C2174(26);
                c1025.thisMethodMatcher = new C2174(27);
                break;
            case 26:
                C1332 c1339 = (C1332) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1339.m3051("com.tencent.mm.plugin.sport.model");
                C0705 c0709 = new C0705(4);
                c0709.m2127("MicroMsg.Sport.NetSceneUploadDeviceStep", "/cgi-bin/mmoc-bin/hardware/uploaddevicestep");
                c1339.f4791 = c0709;
                break;
            case 27:
                ((C1333) obj).m3052(new C2174(28));
                break;
            case 28:
                C1981 c1987 = (C1981) obj;
                Class clsM21825 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls15 = clsM21825 == null ? String.class : clsM21825;
                Class clsM21826 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                Class cls16 = clsM21826 == null ? String.class : clsM21826;
                Class clsM21827 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                if (clsM21827 == null) {
                    clsM21827 = Integer.class;
                }
                Class clsM21828 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                if (clsM21828 == null) {
                    clsM21828 = Integer.class;
                }
                Class clsM21829 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                if (clsM21829 == null) {
                    clsM21829 = Integer.class;
                }
                Class clsM21830 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM21830 == null) {
                    clsM21830 = String.class;
                }
                Class clsM21831 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                c1987.paramTypes(cls15, cls16, clsM21827, clsM21828, clsM21829, clsM21830, clsM21831 == null ? Integer.class : clsM21831);
                break;
            default:
                C1020 c1026 = (C1020) obj;
                c1026.declaringClassMatcher = new C2193(0);
                c1026.thisMethodMatcher = new C2193(1);
                break;
        }
        return Unit.INSTANCE;
    }
}
