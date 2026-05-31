package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3414 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3414 f10744;

    static {
        C3414 c3414 = new C3414();
        f10744 = c3414;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.x93Proto", c3414, 13);
        AbstractC2647.m4626(c2405, "start_timestamp", false, 1);
        AbstractC2647.m4626(c2405, "end_timestamp", false, 2);
        AbstractC2647.m4626(c2405, "item_list", false, 3);
        AbstractC2647.m4626(c2405, "content_text", false, 4);
        AbstractC2647.m4626(c2405, "sync_interval", false, 5);
        AbstractC2647.m4626(c2405, "task_id", false, 6);
        AbstractC2647.m4626(c2405, "finish_content_text", false, 7);
        AbstractC2647.m4626(c2405, "animation_list", false, 8);
        AbstractC2647.m4626(c2405, "cancel", false, 9);
        AbstractC2647.m4626(c2405, "landscape_animation_list", false, 10);
        AbstractC2647.m4626(c2405, "finish_carousel_text", false, 11);
        AbstractC2647.m4626(c2405, "animation_ext_info_list", false, 12);
        AbstractC2647.m4626(c2405, "landscape_animation_ext_info_list", false, 13);
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
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3416.f10745;
        interfaceC0764Mo2636.getClass();
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
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    num = num4;
                    z = false;
                    i = i;
                    list = list;
                    break;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num4);
                    i |= 1;
                    list = list;
                    break;
                case 1:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                    i |= 2;
                    num = num4;
                    break;
                case 2:
                    list4 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), list4);
                    i |= 4;
                    num = num4;
                    num2 = num2;
                    break;
                case 3:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
                    i |= 8;
                    num = num4;
                    num2 = num2;
                    break;
                case 4:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num3);
                    i |= 16;
                    num = num4;
                    num2 = num2;
                    break;
                case 5:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str3);
                    i |= 32;
                    num = num4;
                    num2 = num2;
                    break;
                case 6:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str4);
                    i |= 64;
                    num = num4;
                    num2 = num2;
                    break;
                case 7:
                    list5 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, (InterfaceC1767) interfaceC1780Arr[7].getValue(), list5);
                    i |= 128;
                    num = num4;
                    num2 = num2;
                    break;
                case 8:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C0416.f1980, bool);
                    i |= bc.e;
                    num = num4;
                    num2 = num2;
                    break;
                case 9:
                    list3 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), list3);
                    i |= 512;
                    num = num4;
                    num2 = num2;
                    break;
                case 10:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str);
                    i |= 1024;
                    num = num4;
                    num2 = num2;
                    break;
                case 11:
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, (InterfaceC1767) interfaceC1780Arr[11].getValue(), list2);
                    i |= 2048;
                    num = num4;
                    num2 = num2;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, (InterfaceC1767) interfaceC1780Arr[12].getValue(), list);
                    i |= 4096;
                    num = num4;
                    num2 = num2;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3416(i, num, num2, list4, str2, num3, str3, str4, list5, bool, list3, str, list2, list);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3416.f10745;
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[2].getValue());
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[7].getValue()), AbstractC1471.m3392(C0416.f1980), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[9].getValue()), AbstractC1471.m3392(c2899), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[11].getValue()), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[12].getValue())};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3416 c3416 = (C3416) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3416.f10745;
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3416.f10746);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3416.f10747);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), c3416.f10748);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3416.f10749);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c3416.f10750);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3416.f10751);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3416.f10752);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, (InterfaceC1767) interfaceC1780Arr[7].getValue(), c3416.f10753);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C0416.f1980, c3416.f10754);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), c3416.f10755);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3416.f10756);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, (InterfaceC1767) interfaceC1780Arr[11].getValue(), c3416.f10757);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, (InterfaceC1767) interfaceC1780Arr[12].getValue(), c3416.f10758);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
