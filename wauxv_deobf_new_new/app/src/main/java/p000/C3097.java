package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲇᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3097 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3097 f9907;

    static {
        C3097 c3097 = new C3097();
        f9907 = c3097;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.cp1Proto", c3097, 10);
        AbstractC2647.m4626(c2405, "live_ad_id", false, 1);
        AbstractC2647.m4626(c2405, "start_time_ms", false, 2);
        AbstractC2647.m4626(c2405, "video_duration_ms", false, 3);
        AbstractC2647.m4626(c2405, "video_url", false, 4);
        AbstractC2647.m4626(c2405, "bg_img_url", false, 5);
        AbstractC2647.m4626(c2405, "end_time_ms", false, 6);
        AbstractC2647.m4626(c2405, "need_watch_multi_entrance_ad", false, 7);
        AbstractC2647.m4626(c2405, "need_preload", false, 8);
        AbstractC2647.m4626(c2405, "preload_percent", false, 9);
        AbstractC2647.m4626(c2405, "show_time_intervals", false, 10);
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
        InterfaceC1780[] interfaceC1780Arr = C3099.f9908;
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        List list = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1888.f6259, l2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str3);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1888.f6259, l3);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C0416.f1980, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C0416.f1980, bool2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num);
                    i |= bc.e;
                    break;
                case 9:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            interfaceC1780Arr = interfaceC1780Arr;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3099(i, str, l, l2, str2, str3, l3, bool, bool2, num, list);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3099.f9908;
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c1888);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[9].getValue())};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3099 c3099 = (C3099) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3099.f9908;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3099.f9909);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3099.f9910);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1888, c3099.f9911);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3099.f9912);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3099.f9913);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1888, c3099.f9914);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c0416, c3099.f9915);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c0416, c3099.f9916);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C1680.f5658, c3099.f9917);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), c3099.f9918);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
