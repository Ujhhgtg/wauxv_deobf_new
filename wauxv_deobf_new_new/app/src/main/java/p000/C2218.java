package p000;

import android.util.Pair;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᤞᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2218 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7268;

    public /* synthetic */ C2218(int i) {
        this.f7268 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f7268) {
            case 0:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2218(1);
                c1023.f3740 = new C2218(2);
                break;
            case 1:
                C1334 c1334 = (C1334) obj;
                String[] strArr = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.modelsimple");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.NetSceneRevokeMsg", "/cgi-bin/micromsg-bin/revokemsg");
                c1334.f4791 = c0700;
                break;
            case 2:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                Class<String> cls = String.class;
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4232 == null) {
                    clsM4232 = cls;
                }
                Class<String> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                c2012M4773.m4017(null, clsM4232, clsM4233 != null ? clsM4233 : String.class);
                c1335.f4794 = c2012M4773;
                break;
            case 3:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C2218(4);
                c1024.f3740 = new C2218(5);
                break;
            case 4:
                ((C1334) obj).m3153(new C2218(6));
                break;
            case 5:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1336);
                Class<Pair> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(Pair.class));
                Class cls2 = clsM4234 != null ? clsM4234 : Pair.class;
                Class<String> cls3 = String.class;
                Class<String> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM4235 == null) {
                    clsM4235 = cls3;
                }
                Class<String> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                cls3 = clsM4236 != null ? clsM4236 : String.class;
                Class<Integer> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2012M4774.m4017(cls2, clsM4235, cls3, clsM4237 != null ? clsM4237 : Integer.class);
                c1336.f4794 = c2012M4774;
                break;
            case 6:
                String[] strArr2 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.NetSceneSendPat", "/cgi-bin/micromsg-bin/sendpat");
                break;
            case 7:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C2218(8);
                c1025.f3740 = new C2218(9);
                break;
            case 8:
                C1334 c1337 = (C1334) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1337.m3154("com.tencent.mm.plugin.remittance.model");
                C0700 c0701 = new C0700();
                c0701.m2220("Micromsg.NetSceneTenpayRemittanceConfirm", "/cgi-bin/mmpay-bin/transferoperation");
                c1337.f4791 = c0701;
                break;
            case 9:
                ((C1335) obj).m3155(new C2218(10));
                break;
            case 10:
                ((C2012) obj).m4021("account click info , key is %s, value is %s");
                break;
            case 11:
                C1023 c1026 = (C1023) obj;
                c1026.f3739 = new C2218(12);
                c1026.f3740 = new C2218(13);
                break;
            case Opcodes.FCONST_1 /* 12 */:
                C1334 c1338 = (C1334) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1338.m3154("com.tencent.mm.plugin.sport.model");
                C0700 c0702 = new C0700();
                c0702.m2220("MicroMsg.Sport.NetSceneUploadDeviceStep", "/cgi-bin/mmoc-bin/hardware/uploaddevicestep");
                c1338.f4791 = c0702;
                break;
            case 13:
                ((C1335) obj).m3155(new C2218(14));
                break;
            case Opcodes.DCONST_0 /* 14 */:
                C2012 c2012 = (C2012) obj;
                Class clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls4 = clsM4238 == null ? String.class : clsM4238;
                Class clsM4239 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls5 = clsM4239 == null ? String.class : clsM4239;
                Class clsM42310 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM42310 == null) {
                    clsM42310 = Integer.class;
                }
                Class clsM42311 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM42311 == null) {
                    clsM42311 = Integer.class;
                }
                Class clsM42312 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM42312 == null) {
                    clsM42312 = Integer.class;
                }
                Class clsM42313 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42313 == null) {
                    clsM42313 = String.class;
                }
                Class clsM42314 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2012.m4017(cls4, cls5, clsM42310, clsM42311, clsM42312, clsM42313, clsM42314 == null ? Integer.class : clsM42314);
                break;
            case 15:
                C1023 c1027 = (C1023) obj;
                c1027.f3739 = new C2218(16);
                c1027.f3740 = new C2218(17);
                break;
            case 16:
                C1334 c1339 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1339.m3154("com.tencent.mm.modelimage");
                C0700 c0703 = new C0700();
                c0703.m2220("MicroMsg.NetSceneUploadMsgImg", "/cgi-bin/micromsg-bin/uploadmsgimg");
                c1339.f4791 = c0703;
                break;
            case Opcodes.SIPUSH /* 17 */:
                ((C1335) obj).m3155(new C2218(18));
                break;
            case Opcodes.LDC /* 18 */:
                C2012 c2013 = (C2012) obj;
                Class clsM42315 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls6 = clsM42315 == null ? Integer.class : clsM42315;
                Class clsM42316 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42316 == null) {
                    clsM42316 = String.class;
                }
                Class clsM42317 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42317 == null) {
                    clsM42317 = String.class;
                }
                Class clsM42318 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42318 == null) {
                    clsM42318 = String.class;
                }
                Class clsM42319 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM42319 == null) {
                    clsM42319 = Integer.class;
                }
                Class clsM42320 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls7 = clsM42320 == null ? Integer.class : clsM42320;
                Class clsM42321 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls8 = clsM42321 == null ? String.class : clsM42321;
                Class clsM42322 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls9 = clsM42322 == null ? String.class : clsM42322;
                Class clsM42323 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                Class cls10 = clsM42323 == null ? Boolean.class : clsM42323;
                Class clsM42324 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2013.m4017(cls6, clsM42316, clsM42317, clsM42318, clsM42319, null, cls7, cls8, cls9, cls10, clsM42324 == null ? Integer.class : clsM42324);
                break;
            case 19:
                C1023 c1028 = (C1023) obj;
                c1028.f3739 = new C2218(20);
                c1028.f3740 = new C2218(21);
                break;
            case 20:
                ((C1334) obj).m3153(new C2218(22));
                break;
            case Opcodes.ILOAD /* 21 */:
                C1335 c13310 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c13310);
                Class<String> clsM42325 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls11 = clsM42325 != null ? clsM42325 : String.class;
                Class<Integer> clsM42326 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2012M4775.m4017(cls11, clsM42326 != null ? clsM42326 : Integer.class);
                c13310.f4794 = c2012M4775;
                break;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr6 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.NetSceneUploadVoice", "/cgi-bin/micromsg-bin/uploadvoice");
                break;
            case Opcodes.FLOAD /* 23 */:
                C1023 c1029 = (C1023) obj;
                c1029.f3739 = new C2218(26);
                c1029.f3740 = new C2218(27);
                break;
            case Opcodes.DLOAD /* 24 */:
                ((C1023) obj).f3740 = new C2218(25);
                break;
            case Opcodes.ALOAD /* 25 */:
                C1335 c13311 = (C1335) obj;
                C2012 c2012M4776 = AbstractC2844.m4773(c13311);
                C2233.f7283.getClass();
                c2012M4776.m4014(AbstractC0972.m2609(C2231.f7281).getDeclaringClass());
                c2012M4776.m4021("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK");
                c13311.f4794 = c2012M4776;
                break;
            case 26:
                C1334 c13312 = (C1334) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c13312.m3154("com.tencent.mm.pluginsdk.model");
                C0700 c0704 = new C0700();
                c0704.m2220("MicroMsg.NetSceneVerifyUser.dkverify", "/cgi-bin/micromsg-bin/verifyuser");
                c13312.f4791 = c0704;
                break;
            case 27:
                ((C1335) obj).m3155(new C2218(28));
                break;
            case 28:
                ((C2012) obj).m4021("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK");
                break;
            default:
                ((C1023) obj).f3740 = new C2262(0);
                break;
        }
        return C3554.UNIT;
    }
}
