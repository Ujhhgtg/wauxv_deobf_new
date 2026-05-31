package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3109 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3109 f9930;

    static {
        C3109 c3109 = new C3109();
        f9930 = c3109;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.dc5Proto", c3109, 6);
        AbstractC2647.m4626(c2405, "switch_skin_info_list", false, 1);
        AbstractC2647.m4626(c2405, "default_skin_id", false, 2);
        AbstractC2647.m4626(c2405, "selected_skin_id", false, 3);
        AbstractC2647.m4626(c2405, "custom_text", false, 4);
        AbstractC2647.m4626(c2405, "specific_custom_text", false, 5);
        AbstractC2647.m4626(c2405, "antispam_custom_text", false, 6);
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
        InterfaceC1780[] interfaceC1780Arr = C3111.f9931;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C0416.f1980, bool);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str4);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3111(i, list, str, str2, str3, bool, str4);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392((InterfaceC1767) C3111.f9931[0].getValue());
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C0416.f1980), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3111 c3111 = (C3111) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) C3111.f9931[0].getValue(), c3111.f9932);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3111.f9933);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3111.f9934);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3111.f9935);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, C0416.f1980, c3111.f9936);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c2899, c3111.f9937);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
