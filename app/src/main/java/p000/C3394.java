package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3394 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3394 f10688;

    static {
        C3394 c3394 = new C3394();
        f10688 = c3394;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.zt1Proto", c3394, 7);
        AbstractC2668.m4680(c2360, "rich_text_json", false, 1);
        AbstractC2668.m4680(c2360, "rich_text_title", false, 2);
        AbstractC2668.m4680(c2360, "picture_cut_ratio", false, 4);
        AbstractC2668.m4680(c2360, "from_rich_publisher", false, 5);
        AbstractC2668.m4680(c2360, "secretly_push_chatroom_name", false, 6);
        AbstractC2668.m4680(c2360, "comment_egg_info", false, 7);
        AbstractC2668.m4680(c2360, "picture_cut_ratio_for_finder", false, 8);
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
        InterfaceC1758[] interfaceC1758Arr = C3396.f10689;
        interfaceC0766Mo2512.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        Double d = null;
        Integer num = null;
        List list = null;
        List list2 = null;
        Double d2 = null;
        boolean z = true;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C2839.f9108, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C2839.f9108, str2);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C1093.f4103, d);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C1665.f5622, num);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C1093.f4103, d2);
                    i |= 64;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3396(i, str, str2, d, num, list, list2, d2);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3396.f10689;
        C2839 c2839 = C2839.f9108;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c2839);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c2839);
        C1093 c1093 = C1093.f4103;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, AbstractC2205.m4056(c1093), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[4].getValue()), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[5].getValue()), AbstractC2205.m4056(c1093)};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3396 c3396 = (C3396) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3396.f10689;
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c2839, c3396.f10690);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c2839, c3396.f10691);
        C1093 c1093 = C1093.f4103;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, c1093, c3396.f10692);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, C1665.f5622, c3396.f10693);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, (InterfaceC1743) interfaceC1758Arr[4].getValue(), c3396.f10694);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, (InterfaceC1743) interfaceC1758Arr[5].getValue(), c3396.f10695);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c1093, c3396.f10696);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
