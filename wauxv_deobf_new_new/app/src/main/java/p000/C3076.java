package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲈᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3076 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3076 f9865;

    static {
        C3076 c3076 = new C3076();
        f9865 = c3076;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.au1Proto", c3076, 9);
        AbstractC2647.m4626(c2405, "newlife_type", false, 1);
        AbstractC2647.m4626(c2405, "post_guide_info", false, 3);
        AbstractC2647.m4626(c2405, "topic_info", false, 4);
        AbstractC2647.m4626(c2405, "biz_picture_desc", false, 5);
        AbstractC2647.m4626(c2405, "secretly_push_chatroom_wording", false, 6);
        AbstractC2647.m4626(c2405, "chatroom_push_oneline_wording", false, 7);
        AbstractC2647.m4626(c2405, "chatroom_push_list", false, 8);
        AbstractC2647.m4626(c2405, "chatroom_push_wording", false, 9);
        AbstractC2647.m4626(c2405, "is_need_display_comment_egg", false, 10);
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
        InterfaceC1780[] interfaceC1780Arr = C3078.f9866;
        interfaceC0764Mo2636.getClass();
        Boolean bool = null;
        Integer num = null;
        C3105 c3105 = null;
        C3440 c3440 = null;
        C3156 c3156 = null;
        String str = null;
        String str2 = null;
        List list = null;
        C3340 c3340 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    c3105 = (C3105) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3103.f9922, c3105);
                    i |= 2;
                    break;
                case 2:
                    c3440 = (C3440) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3438.f10803, c3440);
                    i |= 4;
                    break;
                case 3:
                    c3156 = (C3156) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3154.f10059, c3156);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    c3340 = (C3340) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C3338.f10574, c3340);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C0416.f1980, bool);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3078(i, num, c3105, c3440, c3156, str, str2, list, c3340, bool);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3078.f9866;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C1680.f5658);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C3103.f9922);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(C3438.f10803);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(C3154.f10059);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[6].getValue()), AbstractC1471.m3392(C3338.f10574), AbstractC1471.m3392(C0416.f1980)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3078 c3078 = (C3078) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3078.f9866;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c3078.f9867);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3103.f9922, c3078.f9868);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C3438.f10803, c3078.f9869);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C3154.f10059, c3078.f9870);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3078.f9871);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3078.f9872);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), c3078.f9873);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, C3338.f10574, c3078.f9874);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C0416.f1980, c3078.f9875);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
