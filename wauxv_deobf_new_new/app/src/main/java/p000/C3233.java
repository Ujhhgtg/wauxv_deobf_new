package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᤝᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3233 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3233 f10335;

    static {
        C3233 c3233 = new C3233();
        f10335 = c3233;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.n84Proto", c3233, 9);
        AbstractC2647.m4626(c2405, "finder_username", false, 1);
        AbstractC2647.m4626(c2405, "reward_wecoin", false, 2);
        AbstractC2647.m4626(c2405, "winning_streak_count", false, 3);
        AbstractC2647.m4626(c2405, "is_accepted", false, 4);
        AbstractC2647.m4626(c2405, "crit_quest_info", false, 5);
        AbstractC2647.m4626(c2405, "extra_reward_wecoin", false, 6);
        AbstractC2647.m4626(c2405, "is_applicant", false, 7);
        AbstractC2647.m4626(c2405, "count", false, 8);
        AbstractC2647.m4626(c2405, "sdk_user_id", false, 11);
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
        interfaceC0764Mo2636.getClass();
        String str = null;
        Long l = null;
        Integer num = null;
        Boolean bool = null;
        C3208 c3208 = null;
        Long l2 = null;
        Boolean bool2 = null;
        Long l3 = null;
        Long l4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C0416.f1980, bool);
                    i |= 8;
                    break;
                case 4:
                    c3208 = (C3208) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3206.f10189, c3208);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1888.f6259, l2);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C0416.f1980, bool2);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1888.f6259, l3);
                    i |= 128;
                    break;
                case 8:
                    l4 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1888.f6259, l4);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3235(i, str, l, num, bool, c3208, l2, bool2, l3, l4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C2899.f9270);
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(C1680.f5658);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, AbstractC1471.m3392(c0416), AbstractC1471.m3392(C3206.f10189), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1888)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3235 c3235 = (C3235) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C2899.f9270, c3235.f10336);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3235.f10337);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1680.f5658, c3235.f10338);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c0416, c3235.f10339);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C3206.f10189, c3235.f10340);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1888, c3235.f10341);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c0416, c3235.f10342);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1888, c3235.f10343);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1888, c3235.f10344);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
