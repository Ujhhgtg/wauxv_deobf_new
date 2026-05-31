package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲀᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3185 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3185 f10134;

    static {
        C3185 c3185 = new C3185();
        f10134 = c3185;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.ko1Proto", c3185, 11);
        AbstractC2647.m4626(c2405, "tab_id", false, 1);
        AbstractC2647.m4626(c2405, "tab_name", false, 2);
        AbstractC2647.m4626(c2405, "prefech_this_tab", false, 3);
        AbstractC2647.m4626(c2405, "prefech_next_tab", false, 4);
        AbstractC2647.m4626(c2405, "prefech_pre_tab", false, 5);
        AbstractC2647.m4626(c2405, "play_voice", false, 6);
        AbstractC2647.m4626(c2405, "sub_tab_list", false, 7);
        AbstractC2647.m4626(c2405, "tab_scene", false, 8);
        AbstractC2647.m4626(c2405, "object_id", false, 9);
        AbstractC2647.m4626(c2405, "icon_url", false, 10);
        AbstractC2647.m4626(c2405, "icon_wording", false, 11);
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
        InterfaceC1780[] interfaceC1780Arr;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0764 interfaceC0764Mo2636 = interfaceC0978.mo2636(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr2 = C3187.f10135;
        interfaceC0764Mo2636.getClass();
        Long l = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        Integer num2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str3);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C0416.f1980, bool);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C0416.f1980, bool2);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    bool3 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C0416.f1980, bool3);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    bool4 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C0416.f1980, bool4);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num2);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1888.f6259, l);
                    i |= bc.e;
                    break;
                case 9:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    break;
                case 10:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C2899.f9270, str2);
                    i |= 1024;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            interfaceC1780Arr2 = interfaceC1780Arr;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3187(i, num, str3, bool, bool2, bool3, bool4, list, num2, l, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3187.f10135;
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c2899);
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[6].getValue()), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3187 c3187 = (C3187) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3187.f10135;
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3187.f10136);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3187.f10137);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c0416, c3187.f10138);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c0416, c3187.f10139);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c0416, c3187.f10140);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c0416, c3187.f10141);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), c3187.f10142);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3187.f10143);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C1888.f6259, c3187.f10144);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3187.f10145);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c2899, c3187.f10146);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
