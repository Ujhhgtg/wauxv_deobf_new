package p000;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᲁᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2117 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7016;

    public /* synthetic */ C2117(int i) {
        this.f7016 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        int i = this.f7016;
        int i2 = 2;
        Class<List> cls = List.class;
        Class<Integer> cls2 = Integer.class;
        Class<String> cls3 = String.class;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1334 c1334 = (C1334) obj;
                String[] strArr = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.ui.chatting.viewitems");
                C0700 c0700 = new C0700();
                c0700.m2220("wx91d27dbf599dff74");
                c1334.f4791 = c0700;
                return c3554;
            case 1:
                C1334 c1335 = (C1334) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1335.m3154("com.tencent.mm.ui.chatting.viewitems");
                C0700 c0701 = new C0700();
                c0701.m2220("MicroMsg.ChattingItemVoice", "[voice interrupt] set continue play visible ");
                c1335.f4791 = c0701;
                return c3554;
            case 2:
                C1334 c1336 = (C1334) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1336.m3154("com.tencent.mm.ui.chatting.viewitems");
                C0700 c0702 = new C0700();
                c0702.m2220("voip_content_voice", "voip_content_video");
                c1336.f4791 = c0702;
                return c3554;
            case 3:
                String[] strArr4 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_msg_tv_color, null, false);
                int i6 = R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgTvColorLeftDarkTextColor);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtMsgTvColorLeftLightTextColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgTvColorLeftLightTextColor);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogEdtMsgTvColorRightDarkTextColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgTvColorRightDarkTextColor);
                        if (textInputEditText3 != null) {
                            i6 = R.id.moduleDialogEdtMsgTvColorRightLightTextColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtMsgTvColorRightLightTextColor);
                            if (textInputEditText4 != null) {
                                i6 = R.id.moduleDialogInputMsgTvColorLeftDarkTextColor;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgTvColorLeftDarkTextColor)) != null) {
                                    i6 = R.id.moduleDialogInputMsgTvColorLeftLightTextColor;
                                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgTvColorLeftLightTextColor)) != null) {
                                        i6 = R.id.moduleDialogInputMsgTvColorRightDarkTextColor;
                                        if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgTvColorRightDarkTextColor)) != null) {
                                            i6 = R.id.moduleDialogInputMsgTvColorRightLightTextColor;
                                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputMsgTvColorRightLightTextColor)) != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewM4622;
                                                C2049 c2049 = new C2049(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, 2);
                                                textInputEditText2.setText(C2126.f7028.m2666());
                                                textInputEditText4.setText(C2128.f7030.m2666());
                                                textInputEditText.setText(C2125.f7027.m2666());
                                                textInputEditText3.setText(C2127.f7029.m2666());
                                                C2037 c2037 = new C2037();
                                                C2129.f7031.getClass();
                                                c2037.f6779 = C2129.f7033;
                                                c2037.f6781 = linearLayout;
                                                c2037.m4057("保存", new C2070(c2049, 4));
                                                c2037.m4056("重置", new C2096(i3));
                                                C2037.m4053(c2037, null, 3);
                                                c2037.m4055().m3985();
                                                return c3554;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i6)));
            case 4:
                ((C1023) obj).f3740 = new C2117(5);
                return c3554;
            case 5:
                ((C1335) obj).m3155(new C2117(7));
                return c3554;
            case 6:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[2];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                String str = (String) c2641;
                if (str == null) {
                    str = "";
                }
                if (str.equals(".ui.timeline.preload.ui.TmplWebViewMMUI")) {
                    try {
                        c2642 = c1574.m3447()[3];
                        if (c2642 == null) {
                            c2642 = null;
                        }
                    } catch (Throwable th2) {
                        c2642 = new C2641(th2);
                    }
                    Intent intent = (Intent) (c2642 instanceof C2641 ? null : c2642);
                    intent.addFlags(524288);
                    intent.addFlags(134217728);
                }
                return c3554;
            case 7:
                String[] strArr5 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
                return c3554;
            case 8:
                int i7 = AbstractC1768.f5906;
                C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
                String[] strArr6 = AbstractC1471.f5234;
                c1300M3558.f6475 = "field_type";
                if (((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).intValue() == 3) {
                    C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
                    c1300M3559.f6475 = "field_favProto";
                    C2004 c2004M3560 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M3559)).m3126()).m3560();
                    c2004M3560.f6475 = "getData";
                    byte[] bArr = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                    C2480 c2480 = C2480.f7862;
                    c2480.getClass();
                    C1285 c1285 = ((C1286) c2480.m4408(C1286.Companion.serializer(), bArr)).f4695;
                    String string = c1285.f4693;
                    String str2 = c1285.f4692;
                    if (string == null) {
                        String strM4702 = AbstractC2727.m4702();
                        String strValueOf = String.valueOf(str2.hashCode() & 255);
                        StringBuilder sbM4787 = AbstractC2844.m4787(strM4702);
                        sbM4787.append("/favorite/");
                        sbM4787.append(strValueOf);
                        sbM4787.append('/');
                        sbM4787.append(str2);
                        sbM4787.append('.');
                        sbM4787.append(c1285.f4689);
                        string = sbM4787.toString();
                    }
                    if (new File(string).exists()) {
                        C1787.m3673(C2145.f7082, new C2143(string, c1285, i5));
                    } else {
                        AbstractC2894.m4856(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC2894.m4856(null, 3, "暂不支持的转发类型");
                }
                return c3554;
            case 9:
                int i8 = AbstractC1768.f5906;
                C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
                String[] strArr7 = AbstractC1471.f5234;
                c1300M35510.f6475 = "field_type";
                Integer num = (Integer) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
                if (num != null && num.intValue() == 3) {
                    C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
                    c1300M35511.f6475 = "field_favProto";
                    C2004 c2004M3561 = AbstractC2727.m4713(((C1316) AbstractC2844.m4775(c1300M35511)).m3126()).m3560();
                    c2004M3561.f6475 = "getData";
                    byte[] bArr2 = (byte[]) ((C2013) AbstractC2844.m4776(c2004M3561)).m4026(new Object[0]);
                    C2480 c2481 = C2480.f7862;
                    c2481.getClass();
                    C1285 c1286 = ((C1286) c2481.m4408(C1286.Companion.serializer(), bArr2)).f4695;
                    String string2 = c1286.f4693;
                    String str3 = c1286.f4692;
                    if (string2 == null) {
                        String strM4703 = AbstractC2727.m4702();
                        String strValueOf2 = String.valueOf(str3.hashCode() & 255);
                        StringBuilder sbM4788 = AbstractC2844.m4787(strM4703);
                        sbM4788.append("/favorite/");
                        sbM4788.append(strValueOf2);
                        sbM4788.append('/');
                        sbM4788.append(str3);
                        sbM4788.append('.');
                        sbM4788.append(c1286.f4689);
                        string2 = sbM4788.toString();
                    }
                    if (new File(string2).exists()) {
                        C1787.m3673(C2146.f7086, new C2143(string2, c1286, i2));
                    } else {
                        AbstractC2894.m4856(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                } else {
                    AbstractC2894.m4856(null, 3, "暂不支持的转发类型");
                }
                return c3554;
            case 10:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2117(11);
                c1023.f3740 = new C2117(12);
                return c3554;
            case 11:
                ((C1334) obj).m3153(new C2117(13));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1337);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM4232 == null) {
                    clsM4232 = cls3;
                }
                Class<List> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                cls = clsM4233 != null ? clsM4233 : List.class;
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                cls3 = clsM4234 != null ? clsM4234 : String.class;
                Class<Object> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Object.class));
                c2012M4773.m4017(clsM4232, cls, cls3, clsM4235 != null ? clsM4235 : Object.class);
                c1337.f4794 = c2012M4773;
                return c3554;
            case 13:
                String[] strArr8 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.NetSceneAddChatRoomMember", "/cgi-bin/micromsg-bin/addchatroommember");
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C2117(15);
                c1024.f3740 = new C2117(16);
                return c3554;
            case 15:
                C1334 c1338 = (C1334) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1338.m3154("com.tencent.mm.plugin.remittance.model");
                C0700 c0703 = new C0700();
                c0703.m2220("MicroMsg.NetSceneBeforeTransfer", "/cgi-bin/mmpay-bin/beforetransfer");
                c1338.f4791 = c0703;
                return c3554;
            case 16:
                C1335 c1339 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1339);
                Class<String> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM4236 == null) {
                    clsM4236 = cls3;
                }
                Class<String> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                c2012M4774.m4017(clsM4236, clsM4237 != null ? clsM4237 : String.class);
                c1339.f4794 = c2012M4774;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C2117(18);
                c1025.f3740 = new C2117(19);
                return c3554;
            case Opcodes.LDC /* 18 */:
                ((C1334) obj).m3153(new C2117(20));
                return c3554;
            case 19:
                C1335 c13310 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c13310);
                Class<String> clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                cls3 = clsM4238 != null ? clsM4238 : String.class;
                Class<List> clsM4239 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                cls = clsM4239 != null ? clsM4239 : List.class;
                Class<Integer> clsM42310 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                c2012M4775.m4017(cls3, cls, clsM42310 != null ? clsM42310 : Integer.class);
                c13310.f4794 = c2012M4775;
                return c3554;
            case 20:
                String[] strArr10 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ChatroomMembersLogic", "/cgi-bin/micromsg-bin/delchatroommember");
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1023 c1026 = (C1023) obj;
                c1026.f3739 = new C2117(22);
                c1026.f3740 = new C2117(23);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1334 c13311 = (C1334) obj;
                String[] strArr11 = AbstractC1471.f5234;
                c13311.m3154("com.tencent.mm.plugin.luckymoney.model");
                C0700 c0704 = new C0700();
                c0704.m2220("MicroMsg.NetSceneLuckyMoneyDetail", "/cgi-bin/mmpay-bin/qrydetailwxhb");
                c13311.f4791 = c0704;
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1335) obj).m3155(new C2117(24));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C2012 c2012 = (C2012) obj;
                Class<String> clsM42311 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM42311 == null) {
                    clsM42311 = cls3;
                }
                Class<Integer> clsM42312 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                if (clsM42312 == null) {
                    clsM42312 = cls2;
                }
                Class<Integer> clsM42313 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                cls2 = clsM42313 != null ? clsM42313 : Integer.class;
                Class<String> clsM42314 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                if (clsM42314 == null) {
                    clsM42314 = cls3;
                }
                Class<String> clsM42315 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                c2012.m4017(clsM42311, clsM42312, cls2, clsM42314, clsM42315 != null ? clsM42315 : String.class);
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                return (String) ((C1930) ((C1931) obj).m3883()).get(1);
            case 26:
                String str4 = (String) ((C1930) ((C1931) obj).m3883()).get(1);
                String[] strArr12 = AbstractC1471.f5234;
                if (AbstractC1469.m3322(str4, "notify@all")) {
                    return "@所有人";
                }
                C0818.f3214.getClass();
                return AbstractC2844.m4790("@", C0818.m2488(str4));
            case 27:
                return (String) ((C1930) ((C1931) obj).m3883()).get(1);
            case 28:
                String str5 = (String) ((C1930) ((C1931) obj).m3883()).get(1);
                String[] strArr13 = AbstractC1471.f5234;
                if (AbstractC1469.m3322(str5, "notify@all")) {
                    return "@所有人";
                }
                C0818.f3214.getClass();
                return AbstractC2844.m4790("@", C0818.m2488(str5));
            default:
                C1023 c1027 = (C1023) obj;
                c1027.f3739 = new C2200(i5);
                c1027.f3740 = new C2200(i4);
                return c3554;
        }
    }
}
