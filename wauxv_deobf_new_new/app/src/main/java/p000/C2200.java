package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᤝᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2200 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7250;

    public /* synthetic */ C2200(int i) {
        this.f7250 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f7250) {
            case 0:
                ((C1334) obj).m3153(new C2200(2));
                break;
            case 1:
                C1335 c1335 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1335);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls = clsM4232 != null ? clsM4232 : String.class;
                Class<List> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(List.class));
                Class cls2 = clsM4233 != null ? clsM4233 : List.class;
                Class<Integer> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls3 = clsM4234 != null ? clsM4234 : Integer.class;
                Class<Object> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Object.class));
                c2012M4773.m4017(cls, cls2, cls3, clsM4235 != null ? clsM4235 : Object.class);
                c1335.f4794 = c2012M4773;
                break;
            case 2:
                String[] strArr = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.NetSceneInviteChatRoomMember", "/cgi-bin/micromsg-bin/invitechatroommember");
                break;
            case 3:
                ((C1023) obj).f3740 = new C2200(4);
                break;
            case 4:
                ((C1335) obj).m3155(new C2200(5));
                break;
            case 5:
                C2012 c2012 = (C2012) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c2012.m4021("MicroMsg.webview.NetSceneJSLogin", "/cgi-bin/mmbiz-bin/js-login");
                Class clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls4 = clsM4236 == null ? String.class : clsM4236;
                Class clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(LinkedList.class));
                if (clsM4237 == null) {
                    clsM4237 = LinkedList.class;
                }
                Class clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM4238 == null) {
                    clsM4238 = Integer.class;
                }
                Class clsM4239 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM4239 == null) {
                    clsM4239 = String.class;
                }
                Class clsM42310 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42310 == null) {
                    clsM42310 = String.class;
                }
                Class clsM42311 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls5 = clsM42311 == null ? Integer.class : clsM42311;
                Class clsM42312 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                c2012.m4017(cls4, clsM4237, clsM4238, clsM4239, clsM42310, cls5, clsM42312 == null ? Integer.class : clsM42312, null);
                break;
            case 6:
                ((C1023) obj).f3740 = new C2200(7);
                break;
            case 7:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1336);
                c2012M4774.m4021("/cgi-bin/micromsg-bin/modifycontactlabellist");
                Class<LinkedList> clsM42313 = AbstractC2236.m4232(AbstractC2574.m4549(LinkedList.class));
                c2012M4774.m4017(clsM42313 != null ? clsM42313 : LinkedList.class);
                c1336.f4794 = c2012M4774;
                break;
            case 8:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2200(9);
                c1023.f3740 = new C2200(10);
                break;
            case 9:
                ((C1334) obj).m3153(new C2200(11));
                break;
            case 10:
                ((C1335) obj).m3155(new C2200(12));
                break;
            case 11:
                String[] strArr3 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.NetSceneSendMsg", "/cgi-bin/micromsg-bin/newsendmsg", "NetSceneSendMsg:MsgSource:%s");
                break;
            case Opcodes.FCONST_1 /* 12 */:
                C2012 c2013 = (C2012) obj;
                Class<String> cls6 = String.class;
                Class<String> clsM42314 = AbstractC2236.m4232(AbstractC2574.m4549(cls6));
                if (clsM42314 == null) {
                    clsM42314 = cls6;
                }
                Class<String> clsM42315 = AbstractC2236.m4232(AbstractC2574.m4549(cls6));
                cls6 = clsM42315 != null ? clsM42315 : String.class;
                Class<Integer> cls7 = Integer.class;
                Class<Integer> clsM42316 = AbstractC2236.m4232(AbstractC2574.m4549(cls7));
                if (clsM42316 == null) {
                    clsM42316 = cls7;
                }
                Class<Integer> clsM42317 = AbstractC2236.m4232(AbstractC2574.m4549(cls7));
                cls7 = clsM42317 != null ? clsM42317 : Integer.class;
                Class<Object> clsM42318 = AbstractC2236.m4232(AbstractC2574.m4549(Object.class));
                c2013.m4017(clsM42314, cls6, clsM42316, cls7, clsM42318 != null ? clsM42318 : Object.class);
                break;
            case 13:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C2200(14);
                c1024.f3740 = new C2200(15);
                break;
            case Opcodes.DCONST_0 /* 14 */:
                C1334 c1334 = (C1334) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.plugin.luckymoney.model");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.NetSceneOpenLuckyMoney", "/cgi-bin/mmpay-bin/openwxhb");
                c1334.f4791 = c0700;
                break;
            case 15:
                ((C1335) obj).m3155(new C2200(16));
                break;
            case 16:
                C2012 c2014 = (C2012) obj;
                Class clsM42319 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls8 = clsM42319 == null ? Integer.class : clsM42319;
                Class clsM42320 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls9 = clsM42320 == null ? Integer.class : clsM42320;
                Class clsM42321 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls10 = clsM42321 == null ? String.class : clsM42321;
                Class clsM42322 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls11 = clsM42322 == null ? String.class : clsM42322;
                Class clsM42323 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls12 = clsM42323 == null ? String.class : clsM42323;
                Class clsM42324 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls13 = clsM42324 == null ? String.class : clsM42324;
                Class clsM42325 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls14 = clsM42325 == null ? String.class : clsM42325;
                Class clsM42326 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls15 = clsM42326 == null ? String.class : clsM42326;
                Class clsM42327 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2014.m4017(cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, clsM42327 == null ? String.class : clsM42327);
                break;
            case Opcodes.SIPUSH /* 17 */:
                ((C1023) obj).f3740 = new C2200(19);
                break;
            case Opcodes.LDC /* 18 */:
                ((C1023) obj).f3740 = new C2200(20);
                break;
            case 19:
                ((C1335) obj).m3155(new C2200(22));
                break;
            case 20:
                ((C1335) obj).m3155(new C2200(21));
                break;
            case Opcodes.ILOAD /* 21 */:
                C2012 c2015 = (C2012) obj;
                C2213.f7263.getClass();
                c2015.m4014(AbstractC0972.m2610(C2211.f7261).getDeclaringClass());
                C2015 c2016 = new C2015();
                C2012 c2017 = new C2012();
                String[] strArr5 = AbstractC1471.f5234;
                c2017.m4021("MicroMsg.BigBallSysCmdMsgConsumer", "summercck emotionkv pcKeyStr len:%d, content[%s] pcId[%s]");
                c2016.m4042(c2017);
                C2012 c2018 = new C2012();
                c2018.m4021("MicroMsg.CommandProcessor", "summer processed log level[%s], need open debug ret false");
                c2016.m4042(c2018);
                c2015.f6670 = c2016;
                break;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr6 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.NetSceneQueue", "forbid in waiting: type=", "forbid in running: type=");
                break;
            case Opcodes.FLOAD /* 23 */:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C2200(24);
                c1025.f3740 = new C2200(25);
                break;
            case Opcodes.DLOAD /* 24 */:
                C1334 c1337 = (C1334) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1337.m3154("com.tencent.mm.plugin.luckymoney.model");
                C0700 c0701 = new C0700();
                c0701.m2220("MicroMsg.NetSceneReceiveLuckyMoney", "/cgi-bin/mmpay-bin/receivewxhb");
                c1337.f4791 = c0701;
                break;
            case Opcodes.ALOAD /* 25 */:
                ((C1335) obj).m3155(new C2200(26));
                break;
            case 26:
                C2012 c2019 = (C2012) obj;
                Class clsM42328 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls16 = clsM42328 == null ? Integer.class : clsM42328;
                Class clsM42329 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls17 = clsM42329 == null ? Integer.class : clsM42329;
                Class clsM42330 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42330 == null) {
                    clsM42330 = String.class;
                }
                Class clsM42331 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                if (clsM42331 == null) {
                    clsM42331 = String.class;
                }
                Class clsM42332 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                if (clsM42332 == null) {
                    clsM42332 = Integer.class;
                }
                Class clsM42333 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls18 = clsM42333 == null ? String.class : clsM42333;
                Class clsM42334 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2019.m4017(cls16, cls17, clsM42330, clsM42331, clsM42332, cls18, clsM42334 == null ? String.class : clsM42334);
                break;
            case 27:
                C1023 c1026 = (C1023) obj;
                c1026.f3739 = new C2200(28);
                c1026.f3740 = new C2200(29);
                break;
            case 28:
                C1334 c1338 = (C1334) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1338.m3154("com.tencent.mm.plugin.remittance.model");
                C0700 c0702 = new C0700();
                c0702.m2220("Micromsg.NetSceneTenpayRemittanceGen", "/cgi-bin/mmpay-bin/f2fplaceorder", "/cgi-bin/mmpay-bin/transferplaceorder");
                c1338.f4791 = c0702;
                break;
            default:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c1339);
                c2012M4775.m4016(new C1679(29, 30, 1));
                c1339.f4794 = c2012M4775;
                break;
        }
        return C3554.UNIT;
    }
}
