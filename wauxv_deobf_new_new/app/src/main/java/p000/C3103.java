package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲈᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3103 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3103 f9922;

    static {
        C3103 c3103 = new C3103();
        f9922 = c3103;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.cy1Proto", c3103, 3);
        AbstractC2647.m4626(c2405, "post_guide_topic_tags", false, 1);
        AbstractC2647.m4626(c2405, "bg_color_top_hex", false, 2);
        AbstractC2647.m4626(c2405, "bg_color_bottom_hex", false, 3);
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
        InterfaceC1780[] interfaceC1780Arr = C3105.f9923;
        interfaceC0764Mo2636.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2331 == 1) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3105(i, list, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392((InterfaceC1767) C3105.f9923[0].getValue());
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3105 c3105 = (C3105) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) C3105.f9923[0].getValue(), c3105.f9924);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3105.f9925);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3105.f9926);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
