package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᤞᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3329 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3329 f10557;

    static {
        C3329 c3329 = new C3329();
        f10557 = c3329;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.t40Proto", c3329, 11);
        AbstractC2647.m4626(c2405, "reward_product_id", false, 1);
        AbstractC2647.m4626(c2405, "business_type", false, 2);
        AbstractC2647.m4626(c2405, "thumbnail_file_url", false, 3);
        AbstractC2647.m4626(c2405, "preview_pag_url", false, 4);
        AbstractC2647.m4626(c2405, "animation_pag_url", false, 5);
        AbstractC2647.m4626(c2405, "thumbnail_file_md5", false, 6);
        AbstractC2647.m4626(c2405, "preview_pag_md5", false, 7);
        AbstractC2647.m4626(c2405, "animation_pag_md5", false, 8);
        AbstractC2647.m4626(c2405, "name", false, 9);
        AbstractC2647.m4626(c2405, "price", false, 10);
        AbstractC2647.m4626(c2405, "gift_type", false, 11);
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
        InterfaceC1780[] interfaceC1780Arr2 = C3331.f10558;
        interfaceC0764Mo2636.getClass();
        C3102 c3102 = null;
        String str = null;
        Boolean bool = null;
        List list = null;
        C3358 c3358 = null;
        List list2 = null;
        C3102 c3103 = null;
        C3102 c3104 = null;
        C3102 c3105 = null;
        C3102 c3106 = null;
        String str2 = null;
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
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3358 = (C3358) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C3356.f10636, c3358);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3103 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C3100.f9919, c3103);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3104 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C3100.f9919, c3104);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3105 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C3100.f9919, c3105);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3106 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C3100.f9919, c3106);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str2);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    c3102 = (C3102) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C3100.f9919, c3102);
                    i |= bc.e;
                    break;
                case 9:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str);
                    i |= 512;
                    break;
                case 10:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C0416.f1980, bool);
                    i |= 1024;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            interfaceC1780Arr2 = interfaceC1780Arr;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3331(i, list, c3358, list2, c3103, c3104, c3105, c3106, str2, c3102, str, bool);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3331.f10558;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[0].getValue());
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(C3356.f10636);
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[2].getValue());
        C3100 c3100 = C3100.f9919;
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392(c3100);
        InterfaceC1767 interfaceC1767M3398 = AbstractC1471.m3392(c3100);
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, interfaceC1767M3398, AbstractC1471.m3392(c2899), AbstractC1471.m3392(c3100), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C0416.f1980)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3331 c3331 = (C3331) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3331.f10558;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), c3331.f10559);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C3356.f10636, c3331.f10560);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), c3331.f10561);
        C3100 c3100 = C3100.f9919;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c3100, c3331.f10562);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c3100, c3331.f10563);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c3100, c3331.f10564);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c3100, c3331.f10565);
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3331.f10566);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c3100, c3331.f10567);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3331.f10568);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, C0416.f1980, c3331.f10569);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
