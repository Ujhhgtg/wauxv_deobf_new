package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3302 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3302 f10464;

    static {
        C3302 c3302 = new C3302();
        f10464 = c3302;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.rn3Proto", c3302, 2);
        AbstractC2647.m4626(c2405, "live_mode", false, 1);
        AbstractC2647.m4626(c2405, "seat_info_list", false, 2);
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
        InterfaceC1780[] interfaceC1780Arr = C3304.f10465;
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else {
                if (iMo2331 != 1) {
                    throw new C3558(iMo2331);
                }
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, (InterfaceC1767) interfaceC1780Arr[1].getValue(), list);
                i |= 2;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3304(i, num, list);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392((InterfaceC1767) C3304.f10465[1].getValue())};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3304 c3304 = (C3304) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3304.f10465;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c3304.f10466);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, (InterfaceC1767) interfaceC1780Arr[1].getValue(), c3304.f10467);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
