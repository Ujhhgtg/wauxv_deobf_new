package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤝᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3299 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3299 f10452;

    static {
        C3299 c3299 = new C3299();
        f10452 = c3299;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.rj3Proto", c3299, 10);
        AbstractC2647.m4626(c2405, "objectId", false, 1);
        AbstractC2647.m4626(c2405, "username", false, 2);
        AbstractC2647.m4626(c2405, "nickname", false, 3);
        AbstractC2647.m4626(c2405, "avatar", false, 4);
        AbstractC2647.m4626(c2405, "desc", false, 5);
        AbstractC2647.m4626(c2405, "mediaCount", false, 6);
        AbstractC2647.m4626(c2405, "mediaList", false, 7);
        AbstractC2647.m4626(c2405, "objectNonceId", false, 8);
        AbstractC2647.m4626(c2405, "finderId", false, 9);
        AbstractC2647.m4626(c2405, "finderObjectNonceId", false, 10);
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
        InterfaceC1780[] interfaceC1780Arr2 = C3301.f10453;
        interfaceC0764Mo2636.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num = null;
        List list = null;
        String str8 = null;
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
                    str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str3);
                    i |= 1;
                    break;
                case 1:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str4 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2899.f9270, str4);
                    i |= 2;
                    break;
                case 2:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str5 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str5);
                    i |= 4;
                    break;
                case 3:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str6 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C2899.f9270, str6);
                    i |= 8;
                    break;
                case 4:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str7 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str7);
                    i |= 16;
                    break;
                case 5:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num);
                    i |= 32;
                    break;
                case 6:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str8 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C2899.f9270, str8);
                    i |= 128;
                    break;
                case 8:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str);
                    i |= bc.e;
                    break;
                case 9:
                    interfaceC1780Arr = interfaceC1780Arr2;
                    str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C2899.f9270, str2);
                    i |= 512;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            interfaceC1780Arr2 = interfaceC1780Arr;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3301(i, str3, str4, str5, str6, str7, num, list, str8, str, str2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3301.f10453;
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[6].getValue()), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3301 c3301 = (C3301) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3301.f10453;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3301.f10454);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c2899, c3301.f10455);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3301.f10456);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c2899, c3301.f10457);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3301.f10458);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C1680.f5658, c3301.f10459);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, (InterfaceC1767) interfaceC1780Arr[6].getValue(), c3301.f10460);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c2899, c3301.f10461);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c2899, c3301.f10462);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c2899, c3301.f10463);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
