package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᛸᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3444 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3444 f10831;

    static {
        C3444 c3444 = new C3444();
        f10831 = c3444;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ze1Proto", c3444, 4);
        AbstractC2647.m4626(c2405, "cdnTransInfo", false, 1);
        AbstractC2647.m4626(c2405, "anchor_video_params", false, 2);
        AbstractC2647.m4626(c2405, "audience_cdn_quality_cfg", false, 3);
        AbstractC2647.m4626(c2405, "audience_cdn_url", false, 4);
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
        InterfaceC1780[] interfaceC1780Arr = C3446.f10832;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        List list = null;
        C3214 c3214 = null;
        Integer num = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2331 == 1) {
                c3214 = (C3214) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3212.f10209, c3214);
                i |= 2;
            } else if (iMo2331 == 2) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3446(i, list, c3214, num, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392((InterfaceC1767) C3446.f10832[0].getValue()), AbstractC1471.m3392(C3212.f10209), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C2899.f9270)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3446 c3446 = (C3446) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) C3446.f10832[0].getValue(), c3446.f10833);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3212.f10209, c3446.f10834);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1680.f5658, c3446.f10835);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C2899.f9270, c3446.f10836);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
