package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲇᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3191 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3191 f10150;

    static {
        C3191 c3191 = new C3191();
        f10150 = c3191;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.lh1Proto", c3191, 4);
        AbstractC2647.m4626(c2405, "members", false, 1);
        AbstractC2647.m4626(c2405, "reward_wecoin", false, 2);
        AbstractC2647.m4626(c2405, "result", false, 3);
        AbstractC2647.m4626(c2405, "count", false, 4);
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
        InterfaceC1780[] interfaceC1780Arr = C3193.f10151;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        List list = null;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2331 == 1) {
                l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l);
                i |= 2;
            } else if (iMo2331 == 2) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1888.f6259, l2);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3193(i, list, l, num, l2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392((InterfaceC1767) C3193.f10151[0].getValue());
        C1888 c1888 = C1888.f6259;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1888), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(c1888)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3193 c3193 = (C3193) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) C3193.f10151[0].getValue(), c3193.f10152);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3193.f10153);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1680.f5658, c3193.f10154);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1888, c3193.f10155);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
