package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3354 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3354 f10576;

    static {
        C3354 c3354 = new C3354();
        f10576 = c3354;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.x93Proto", c3354, 13);
        AbstractC2668.m4680(c2360, "start_timestamp", false, 1);
        AbstractC2668.m4680(c2360, "end_timestamp", false, 2);
        AbstractC2668.m4680(c2360, "item_list", false, 3);
        AbstractC2668.m4680(c2360, "content_text", false, 4);
        AbstractC2668.m4680(c2360, "sync_interval", false, 5);
        AbstractC2668.m4680(c2360, "task_id", false, 6);
        AbstractC2668.m4680(c2360, "finish_content_text", false, 7);
        AbstractC2668.m4680(c2360, "animation_list", false, 8);
        AbstractC2668.m4680(c2360, "cancel", false, 9);
        AbstractC2668.m4680(c2360, "landscape_animation_list", false, 10);
        AbstractC2668.m4680(c2360, "finish_carousel_text", false, 11);
        AbstractC2668.m4680(c2360, "animation_ext_info_list", false, 12);
        AbstractC2668.m4680(c2360, "landscape_animation_ext_info_list", false, 13);
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
        InterfaceC1758[] interfaceC1758Arr = C3356.f10577;
        
        Boolean bool = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        List list4 = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        List list5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Integer num4 = num;
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            switch (iMo2230) {
                case -1:
                    num = num4;
                    z = false;
                    i = i;
                    list = list;
                    break;
                case 0:
                    num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, C1665.f5622, num4);
                    i |= 1;
                    list = list;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num2);
                    i |= 2;
                    num = num4;
                    break;
                case 2:
                    list4 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), list4);
                    i |= 4;
                    num = num4;
                    num2 = num2;
                    break;
                case 3:
                    str2 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 3, C2839.f9108, str2);
                    i |= 8;
                    num = num4;
                    num2 = num2;
                    break;
                case 4:
                    num3 = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 4, C1665.f5622, num3);
                    i |= 16;
                    num = num4;
                    num2 = num2;
                    break;
                case 5:
                    str3 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 5, C2839.f9108, str3);
                    i |= 32;
                    num = num4;
                    num2 = num2;
                    break;
                case 6:
                    str4 = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 6, C2839.f9108, str4);
                    i |= 64;
                    num = num4;
                    num2 = num2;
                    break;
                case 7:
                    list5 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 7, (InterfaceC1743) interfaceC1758Arr[7].getValue(), list5);
                    i |= 128;
                    num = num4;
                    num2 = num2;
                    break;
                case 8:
                    bool = (Boolean) interfaceC0766Mo2512.mo2239(interfaceC2654, 8, C0441.f2008, bool);
                    i |= 256;
                    num = num4;
                    num2 = num2;
                    break;
                case 9:
                    list3 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), list3);
                    i |= 512;
                    num = num4;
                    num2 = num2;
                    break;
                case 10:
                    str = (String) interfaceC0766Mo2512.mo2239(interfaceC2654, 10, C2839.f9108, str);
                    i |= 1024;
                    num = num4;
                    num2 = num2;
                    break;
                case 11:
                    list2 = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 11, (InterfaceC1743) interfaceC1758Arr[11].getValue(), list2);
                    i |= 2048;
                    num = num4;
                    num2 = num2;
                    break;
                case 12 /* 12 */:
                    list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 12, (InterfaceC1743) interfaceC1758Arr[12].getValue(), list);
                    i |= 4096;
                    num = num4;
                    num2 = num2;
                    break;
                default:
                    throw new C3501(iMo2230);
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3356(i, num, num2, list4, str2, num3, str3, str4, list5, bool, list3, str, list2, list);
    }

    @Override // p000.InterfaceC1443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1743[] mo1541() {
        InterfaceC1758[] interfaceC1758Arr = C3356.f10577;
        C1665 c1665 = C1665.f5622;
        InterfaceC1743 interfaceC1743M4056 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4057 = AbstractC2205.m4056(c1665);
        InterfaceC1743 interfaceC1743M4058 = AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[2].getValue());
        C2839 c2839 = C2839.f9108;
        return new InterfaceC1743[]{interfaceC1743M4056, interfaceC1743M4057, interfaceC1743M4058, AbstractC2205.m4056(c2839), AbstractC2205.m4056(c1665), AbstractC2205.m4056(c2839), AbstractC2205.m4056(c2839), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[7].getValue()), AbstractC2205.m4056(C0441.f2008), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[9].getValue()), AbstractC2205.m4056(c2839), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[11].getValue()), AbstractC2205.m4056((InterfaceC1743) interfaceC1758Arr[12].getValue())};
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3356 c3356 = (C3356) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3356.f10577;
        C1665 c1665 = C1665.f5622;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, c1665, c3356.f10578);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, c1665, c3356.f10579);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, (InterfaceC1743) interfaceC1758Arr[2].getValue(), c3356.f10580);
        C2839 c2839 = C2839.f9108;
        interfaceC0767Mo2796.mo2253(interfaceC2654, 3, c2839, c3356.f10581);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 4, c1665, c3356.f10582);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 5, c2839, c3356.f10583);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 6, c2839, c3356.f10584);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 7, (InterfaceC1743) interfaceC1758Arr[7].getValue(), c3356.f10585);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 8, C0441.f2008, c3356.f10586);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 9, (InterfaceC1743) interfaceC1758Arr[9].getValue(), c3356.f10587);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 10, c2839, c3356.f10588);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 11, (InterfaceC1743) interfaceC1758Arr[11].getValue(), c3356.f10589);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 12, (InterfaceC1743) interfaceC1758Arr[12].getValue(), c3356.f10590);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
