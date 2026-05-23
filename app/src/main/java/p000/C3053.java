package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3053 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3053 f9771;

    static {
        C3053 c3053 = new C3053();
        f9771 = c3053;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.df1Proto", c3053, 17);
        AbstractC2668.m4680(c2360, "live_mic_id", false, 1);
        AbstractC2668.m4680(c2360, "mic_type", false, 2);
        AbstractC2668.m4680(c2360, "apply_contact", false, 3);
        AbstractC2668.m4680(c2360, "accept_live_contact", false, 4);
        AbstractC2668.m4680(c2360, "status", false, 5);
        AbstractC2668.m4680(c2360, "mic_live_room_data", false, 6);
        AbstractC2668.m4680(c2360, "mic_audience_list", false, 7);
        AbstractC2668.m4680(c2360, "mic_pk_info", false, 8);
        AbstractC2668.m4680(c2360, "battle_info", false, 9);
        AbstractC2668.m4680(c2360, "enable_cross_live_room_mic", false, 10);
        AbstractC2668.m4680(c2360, "box_intercom_mic_info", false, 11);
        AbstractC2668.m4680(c2360, "wording", false, 12);
        AbstractC2668.m4680(c2360, "meet_info", false, 13);
        AbstractC2668.m4680(c2360, "new_pk_mic_infos", false, 14);
        AbstractC2668.m4680(c2360, "anchor_new_pk_info", false, 15);
        AbstractC2668.m4680(c2360, "battle_setting_info", false, 16);
        AbstractC2668.m4680(c2360, "mic_config", false, 17);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        int i;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3055.f9772;
        interfaceC0766Mo2512.getClass();
        C3302 c3302 = null;
        List list = null;
        C3061 c3061 = null;
        C3224 c3224 = null;
        Boolean bool = null;
        C3131 c3131 = null;
        C3236 c3236 = null;
        C3329 c3329 = null;
        C3037 c3037 = null;
        Integer num = null;
        C3103 c3103 = null;
        List list2 = null;
        C3070 c3070 = null;
        String str = null;
        Integer num2 = null;
        C3106 c3106 = null;
        C3106 c3107 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Integer num3 = num;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    c3061 = c3061;
                    num = num3;
                    c3103 = c3103;
                    list = list;
                    c3106 = c3106;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i2 |= 1;
                    c3061 = c3061;
                    num = num3;
                    c3103 = c3103;
                    list = list;
                    c3106 = c3106;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                    i2 |= 2;
                    c3106 = c3106;
                    num = num3;
                    c3103 = c3103;
                    list = list;
                    break;
                case 2:
                    c3106 = (C3106) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3104.f9908, c3106);
                    i2 |= 4;
                    num = num3;
                    c3103 = c3103;
                    list = list;
                    break;
                case 3:
                    c3107 = (C3106) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3104.f9908, c3107);
                    i2 |= 8;
                    num = num3;
                    c3103 = c3103;
                    list = list;
                    break;
                case 4:
                    list = list;
                    c3103 = c3103;
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num3);
                    i2 |= 16;
                    c3103 = c3103;
                    list = list;
                    break;
                case 5:
                    list = list;
                    c3103 = (C3103) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C3101.f9904, c3103);
                    i2 |= 32;
                    num = num3;
                    list = list;
                    break;
                case 6:
                    c3103 = c3103;
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), list2);
                    i2 |= 64;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 7:
                    c3103 = c3103;
                    c3070 = (C3070) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C3068.f9827, c3070);
                    i2 |= 128;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 8:
                    c3103 = c3103;
                    c3302 = (C3302) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C3300.f10478, c3302);
                    i2 |= bc.e;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 9:
                    c3103 = c3103;
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, C0441.f2008, bool);
                    i2 |= 512;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 10:
                    c3103 = c3103;
                    c3131 = (C3131) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C3129.f9980, c3131);
                    i2 |= 1024;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 11:
                    c3103 = c3103;
                    c3224 = (C3224) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, C3222.f10255, c3224);
                    i2 |= 2048;
                    num = num3;
                    c3103 = c3103;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c3103 = c3103;
                    c3061 = (C3061) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, C3059.f9809, c3061);
                    i2 |= 4096;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 13:
                    c3103 = c3103;
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 13, (InterfaceC1743) interfaceC1758Arr[13].getValue(), list);
                    i2 |= 8192;
                    num = num3;
                    c3103 = c3103;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c3103 = c3103;
                    c3236 = (C3236) interfaceC0766Mo2512.mo2239(interfaceC2654, 14, C3234.f10274, c3236);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 15:
                    c3329 = (C3329) interfaceC0766Mo2512.mo2239(interfaceC2654, 15, C3327.f10528, c3329);
                    i = 32768;
                    i2 |= i;
                    num = num3;
                    c3103 = c3103;
                    break;
                case 16:
                    c3037 = (C3037) interfaceC0766Mo2512.mo2239(interfaceC2654, 16, C3035.f9737, c3037);
                    i = 65536;
                    i2 |= i;
                    num = num3;
                    c3103 = c3103;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        List list3 = list;
        C3103 c3104 = c3103;
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3055(i2, str, num2, c3106, c3107, num, c3104, list2, c3070, c3302, bool, c3131, c3224, c3061, list3, c3236, c3329, c3037);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3055.f9772;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C2839.f9108);
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        C3104 c3104 = C3104.f9908;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c3104), AbstractC2205.m4056(c3104), AbstractC2205.m4056(c1665), AbstractC2205.m4056(C3101.f9904), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[6].getValue()), AbstractC2205.m4056(C3068.f9827), AbstractC2205.m4056(C3300.f10478), AbstractC2205.m4056(C0441.f2008), AbstractC2205.m4056(C3129.f9980), AbstractC2205.m4056(C3222.f10255), AbstractC2205.m4056(C3059.f9809), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[13].getValue()), AbstractC2205.m4056(C3234.f10274), AbstractC2205.m4056(C3327.f10528), AbstractC2205.m4056(C3035.f9737)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3055 c3055 = (C3055) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3055.f9772;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C2839.f9108, c3055.f9773);
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3055.f9774);
        C3104 c3104 = C3104.f9908;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c3104, c3055.f9775);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c3104, c3055.f9776);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3055.f9777);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, C3101.f9904, c3055.f9778);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), c3055.f9779);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, C3068.f9827, c3055.f9780);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C3300.f10478, c3055.f9781);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, C0441.f2008, c3055.f9782);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, C3129.f9980, c3055.f9783);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, C3222.f10255, c3055.f9784);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, C3059.f9809, c3055.f9785);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 13, (InterfaceC1743) interfaceC1758Arr[13].getValue(), c3055.f9786);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 14, C3234.f10274, c3055.f9787);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 15, C3327.f10528, c3055.f9788);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 16, C3035.f9737, c3055.f9789);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
