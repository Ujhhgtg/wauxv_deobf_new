package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲀᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3017 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3017 f9698;

    static {
        C3017 c3017 = new C3017();
        f9698 = c3017;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.au1Proto", c3017, 9);
        AbstractC2668.m4680(c2360, "newlife_type", false, 1);
        AbstractC2668.m4680(c2360, "post_guide_info", false, 3);
        AbstractC2668.m4680(c2360, "topic_info", false, 4);
        AbstractC2668.m4680(c2360, "biz_picture_desc", false, 5);
        AbstractC2668.m4680(c2360, "secretly_push_chatroom_wording", false, 6);
        AbstractC2668.m4680(c2360, "chatroom_push_oneline_wording", false, 7);
        AbstractC2668.m4680(c2360, "chatroom_push_list", false, 8);
        AbstractC2668.m4680(c2360, "chatroom_push_wording", false, 9);
        AbstractC2668.m4680(c2360, "is_need_display_comment_egg", false, 10);
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
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3019.f9699;
        
        Boolean bool = null;
        Integer num = null;
        C3046 c3046 = null;
        C3381 c3381 = null;
        C3097 c3097 = null;
        String str = null;
        String str2 = null;
        List list = null;
        C3281 c3281 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num);
                    i |= 1;
                    break;
                case 1:
                    c3046 = (C3046) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C3044.f9755, c3046);
                    i |= 2;
                    break;
                case 2:
                    c3381 = (C3381) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3379.f10636, c3381);
                    i |= 4;
                    break;
                case 3:
                    c3097 = (C3097) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C3095.f9892, c3097);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C2839.f9108, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    c3281 = (C3281) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, C3279.f10407, c3281);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C0441.f2008, bool);
                    i |= 256;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3019(i, num, c3046, c3381, c3097, str, str2, list, c3281, bool);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3019.f9699;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(C1665.f5622);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(C3044.f9755);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056(C3379.f10636);
        InterfaceC1743 interfaceC1743M4059 = AbstractC2205.m4056(C3095.f9892);
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, interfaceC1743M4059, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[6].getValue()), AbstractC2205.m4056(C3279.f10407), AbstractC2205.m4056(C0441.f2008)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3019 c3019 = (C3019) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3019.f9699;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, C1665.f5622, c3019.f9700);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C3044.f9755, c3019.f9701);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C3379.f10636, c3019.f9702);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C3095.f9892, c3019.f9703);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c2839, c3019.f9704);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3019.f9705);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, (InterfaceC1743) interfaceC1758Arr[6].getValue(), c3019.f9706);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, C3279.f10407, c3019.f9707);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C0441.f2008, c3019.f9708);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
