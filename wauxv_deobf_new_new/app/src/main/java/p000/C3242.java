package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲈᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3242 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3242 f10351;

    static {
        C3242 c3242 = new C3242();
        f10351 = c3242;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.nk1Proto", c3242, 6);
        AbstractC2647.m4626(c2405, "cdn_trans_info", false, 1);
        AbstractC2647.m4626(c2405, "recommend_video_quality_level", false, 2);
        AbstractC2647.m4626(c2405, "force_recommend", false, 3);
        AbstractC2647.m4626(c2405, "replay_transition_video_id", false, 4);
        AbstractC2647.m4626(c2405, "replay_transition_url", false, 5);
        AbstractC2647.m4626(c2405, "disable_replay_transition", false, 6);
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
        int i = 0;
        C3409 c3409 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        String str = null;
        Integer num3 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c3409 = (C3409) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C3407.f10721, c3409);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1888.f6259, l);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num3);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3244(i, c3409, num, num2, l, str, num3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C3407.f10721);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392(C2899.f9270), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3244 c3244 = (C3244) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C3407.f10721, c3244.f10352);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3244.f10353);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3244.f10354);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1888.f6259, c3244.f10355);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C2899.f9270, c3244.f10356);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3244.f10357);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
