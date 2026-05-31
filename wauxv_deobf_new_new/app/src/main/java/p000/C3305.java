package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3305 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3305 f10468;

    static {
        C3305 c3305 = new C3305();
        f10468 = c3305;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.s40Proto", c3305, 5);
        AbstractC2647.m4626(c2405, "component_name", false, 1);
        AbstractC2647.m4626(c2405, "component_value_list", false, 2);
        AbstractC2647.m4626(c2405, "select_component_key", false, 3);
        AbstractC2647.m4626(c2405, "seq", false, 4);
        AbstractC2647.m4626(c2405, "component_key", false, 5);
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
        InterfaceC1780[] interfaceC1780Arr = C3307.f10469;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                i |= 1;
            } else if (iMo2331 == 1) {
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, (InterfaceC1767) interfaceC1780Arr[1].getValue(), list);
                i |= 2;
            } else if (iMo2331 == 2) {
                str2 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C2899.f9270, str2);
                i |= 4;
            } else if (iMo2331 == 3) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num);
                i |= 8;
            } else {
                if (iMo2331 != 4) {
                    throw new C3558(iMo2331);
                }
                str3 = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C2899.f9270, str3);
                i |= 16;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3307(i, str, list, str2, num, str3);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3307.f10469;
        C2899 c2899 = C2899.f9270;
        return new InterfaceC1767[]{AbstractC1471.m3392(c2899), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[1].getValue()), AbstractC1471.m3392(c2899), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c2899)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3307 c3307 = (C3307) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3307.f10469;
        C2899 c2899 = C2899.f9270;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c2899, c3307.f10470);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, (InterfaceC1767) interfaceC1780Arr[1].getValue(), c3307.f10471);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c2899, c3307.f10472);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, C1680.f5658, c3307.f10473);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c2899, c3307.f10474);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
