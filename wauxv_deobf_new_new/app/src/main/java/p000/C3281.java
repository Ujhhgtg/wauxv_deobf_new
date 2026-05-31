package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᤝᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3281 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3281 f10422;

    static {
        C3281 c3281 = new C3281();
        f10422 = c3281;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.pk3Proto", c3281, 9);
        AbstractC2647.m4626(c2405, "adaptive_pattern_wording", false, 1);
        AbstractC2647.m4626(c2405, "seat_pattern_wording", false, 2);
        AbstractC2647.m4626(c2405, "leader_pattern_wording", false, 3);
        AbstractC2647.m4626(c2405, "solo_battle_mode_wording", false, 4);
        AbstractC2647.m4626(c2405, "teamup_battle_mode_wording", false, 5);
        AbstractC2647.m4626(c2405, "battle_indicator_reward_heat_wording", false, 6);
        AbstractC2647.m4626(c2405, "battle_indicator_specific_gift_num_wording", false, 7);
        AbstractC2647.m4626(c2405, "audience_solo_battle_pattern_wording", false, 8);
        AbstractC2647.m4626(c2405, "audience_teamup_battle_pattern_wording", false, 9);
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
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
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
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C2899.f9270, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str8);
                    i |= 128;
                    break;
                case 8:
                    str9 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str9);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3283(i, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3283 c3283 = (C3283) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3283.f10423);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3283.f10424);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3283.f10425);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3283.f10426);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3283.f10427);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3283.f10428);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c2899, c3283.f10429);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3283.f10430);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3283.f10431);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
