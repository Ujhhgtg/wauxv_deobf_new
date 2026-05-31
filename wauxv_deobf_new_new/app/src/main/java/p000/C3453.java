package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3453 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3453 f10855;

    static {
        C3453 c3453 = new C3453();
        f10855 = c3453;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.zt1Proto", c3453, 7);
        AbstractC2647.m4626(c2405, "rich_text_json", false, 1);
        AbstractC2647.m4626(c2405, "rich_text_title", false, 2);
        AbstractC2647.m4626(c2405, "picture_cut_ratio", false, 4);
        AbstractC2647.m4626(c2405, "from_rich_publisher", false, 5);
        AbstractC2647.m4626(c2405, "secretly_push_chatroom_name", false, 6);
        AbstractC2647.m4626(c2405, "comment_egg_info", false, 7);
        AbstractC2647.m4626(c2405, "picture_cut_ratio_for_finder", false, 8);
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
        InterfaceC1780[] interfaceC1780Arr = C3455.f10856;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        Double d = null;
        Integer num = null;
        List list = null;
        List list2 = null;
        Double d2 = null;
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
                    d = (Double) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1099.f4114, d);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1099.f4114, d2);
                    i |= 64;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3455(i, str, str2, d, num, list, list2, d2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3455.f10856;
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        C1099 c1099 = C1099.f4114;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1099), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[4].getValue()), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[5].getValue()), AbstractC1471.m3392(c1099)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3455 c3455 = (C3455) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3455.f10856;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3455.f10857);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3455.f10858);
        C1099 c1099 = C1099.f4114;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1099, c3455.f10859);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1680.f5658, c3455.f10860);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), c3455.f10861);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), c3455.f10862);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1099, c3455.f10863);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
