package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᤞᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3112 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3112 f9938;

    static {
        C3112 c3112 = new C3112();
        f9938 = c3112;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.df1Proto", c3112, 17);
        AbstractC2647.m4626(c2405, "live_mic_id", false, 1);
        AbstractC2647.m4626(c2405, "mic_type", false, 2);
        AbstractC2647.m4626(c2405, "apply_contact", false, 3);
        AbstractC2647.m4626(c2405, "accept_live_contact", false, 4);
        AbstractC2647.m4626(c2405, "status", false, 5);
        AbstractC2647.m4626(c2405, "mic_live_room_data", false, 6);
        AbstractC2647.m4626(c2405, "mic_audience_list", false, 7);
        AbstractC2647.m4626(c2405, "mic_pk_info", false, 8);
        AbstractC2647.m4626(c2405, "battle_info", false, 9);
        AbstractC2647.m4626(c2405, "enable_cross_live_room_mic", false, 10);
        AbstractC2647.m4626(c2405, "box_intercom_mic_info", false, 11);
        AbstractC2647.m4626(c2405, "wording", false, 12);
        AbstractC2647.m4626(c2405, "meet_info", false, 13);
        AbstractC2647.m4626(c2405, "new_pk_mic_infos", false, 14);
        AbstractC2647.m4626(c2405, "anchor_new_pk_info", false, 15);
        AbstractC2647.m4626(c2405, "battle_setting_info", false, 16);
        AbstractC2647.m4626(c2405, "mic_config", false, 17);
        descriptor = c2405;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return descriptor;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        int i;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3114.f9939;
        interfaceC0764Mo2636.getClass();
        C3361 c3361 = null;
        List list = null;
        C3120 c3120 = null;
        C3283 c3283 = null;
        Boolean bool = null;
        C3190 c3190 = null;
        C3295 c3295 = null;
        C3388 c3388 = null;
        C3096 c3096 = null;
        Integer num = null;
        C3162 c3162 = null;
        List list2 = null;
        C3129 c3129 = null;
        String str = null;
        Integer num2 = null;
        C3166 c3166 = null;
        C3166 c3167 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            Integer num3 = num;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    c3120 = c3120;
                    num = num3;
                    c3162 = c3162;
                    list = list;
                    c3166 = c3166;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i2 |= 1;
                    c3120 = c3120;
                    num = num3;
                    c3162 = c3162;
                    list = list;
                    c3166 = c3166;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                    i2 |= 2;
                    c3166 = c3166;
                    num = num3;
                    c3162 = c3162;
                    list = list;
                    break;
                case 2:
                    c3166 = (C3166) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3164.f10076, c3166);
                    i2 |= 4;
                    num = num3;
                    c3162 = c3162;
                    list = list;
                    break;
                case 3:
                    c3167 = (C3166) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3164.f10076, c3167);
                    i2 |= 8;
                    num = num3;
                    c3162 = c3162;
                    list = list;
                    break;
                case 4:
                    list = list;
                    c3162 = c3162;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num3);
                    i2 |= 16;
                    c3162 = c3162;
                    list = list;
                    break;
                case 5:
                    list = list;
                    c3162 = (C3162) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3160.f10071, c3162);
                    i2 |= 32;
                    num = num3;
                    list = list;
                    break;
                case 6:
                    c3162 = c3162;
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), list2);
                    i2 |= 64;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 7:
                    c3162 = c3162;
                    c3129 = (C3129) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C3127.f9994, c3129);
                    i2 |= 128;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 8:
                    c3162 = c3162;
                    c3361 = (C3361) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C3359.f10645, c3361);
                    i2 |= bc.e;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 9:
                    c3162 = c3162;
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C0416.f1980, bool);
                    i2 |= 512;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 10:
                    c3162 = c3162;
                    c3190 = (C3190) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C3188.f10147, c3190);
                    i2 |= 1024;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 11:
                    c3162 = c3162;
                    c3283 = (C3283) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C3281.f10422, c3283);
                    i2 |= 2048;
                    num = num3;
                    c3162 = c3162;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c3162 = c3162;
                    c3120 = (C3120) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C3118.f9976, c3120);
                    i2 |= 4096;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 13:
                    c3162 = c3162;
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, (InterfaceC1767) interfaceC1780Arr[13].getValue(), list);
                    i2 |= 8192;
                    num = num3;
                    c3162 = c3162;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c3162 = c3162;
                    c3295 = (C3295) interfaceC0764Mo2636.mo2340(interfaceC2715, 14, C3293.f10441, c3295);
                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 15:
                    c3388 = (C3388) interfaceC0764Mo2636.mo2340(interfaceC2715, 15, C3386.f10695, c3388);
                    i = 32768;
                    i2 |= i;
                    num = num3;
                    c3162 = c3162;
                    break;
                case 16:
                    c3096 = (C3096) interfaceC0764Mo2636.mo2340(interfaceC2715, 16, C3094.f9904, c3096);
                    i = 65536;
                    i2 |= i;
                    num = num3;
                    c3162 = c3162;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        List list3 = list;
        C3162 c3163 = c3162;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3114(i2, str, num2, c3166, c3167, num, c3163, list2, c3129, c3361, bool, c3190, c3283, c3120, list3, c3295, c3388, c3096);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3114.f9939;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C2899.f9270);
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1680);
        C3164 c3164 = C3164.f10076;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c3164), AbstractC1471.m3392(c3164), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3160.f10071), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[6].getValue()), AbstractC1471.m3392(C3127.f9994), AbstractC1471.m3392(C3359.f10645), AbstractC1471.m3392(C0416.f1980), AbstractC1471.m3392(C3188.f10147), AbstractC1471.m3392(C3281.f10422), AbstractC1471.m3392(C3118.f9976), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[13].getValue()), AbstractC1471.m3392(C3293.f10441), AbstractC1471.m3392(C3386.f10695), AbstractC1471.m3392(C3094.f9904)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3114 c3114 = (C3114) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3114.f9939;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C2899.f9270, c3114.f9940);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3114.f9941);
        C3164 c3164 = C3164.f10076;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c3164, c3114.f9942);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c3164, c3114.f9943);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3114.f9944);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C3160.f10071, c3114.f9945);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), c3114.f9946);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, C3127.f9994, c3114.f9947);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C3359.f10645, c3114.f9948);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, C0416.f1980, c3114.f9949);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, C3188.f10147, c3114.f9950);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, C3281.f10422, c3114.f9951);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, C3118.f9976, c3114.f9952);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, (InterfaceC1767) interfaceC1780Arr[13].getValue(), c3114.f9953);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 14, C3293.f10441, c3114.f9954);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 15, C3386.f10695, c3114.f9955);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 16, C3094.f9904, c3114.f9956);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
