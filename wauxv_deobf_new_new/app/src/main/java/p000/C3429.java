package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲀᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3429 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3429 f10792;

    static {
        C3429 c3429 = new C3429();
        f10792 = c3429;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.y52Proto", c3429, 3);
        AbstractC2647.m4626(c2405, "list", false, 1);
        AbstractC2647.m4626(c2405, "first_page_index", false, 2);
        AbstractC2647.m4626(c2405, "wordingInfo", false, 19);
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
        InterfaceC1780[] interfaceC1780Arr = C3431.f10793;
        interfaceC0764Mo2636.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        C3452 c3452 = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, (InterfaceC1767) interfaceC1780Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2331 == 1) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                c3452 = (C3452) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C3450.f10842, c3452);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3431(i, list, num, c3452);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392((InterfaceC1767) C3431.f10793[0].getValue()), AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392(C3450.f10842)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3431 c3431 = (C3431) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, (InterfaceC1767) C3431.f10793[0].getValue(), c3431.f10794);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C1680.f5658, c3431.f10795);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C3450.f10842, c3431.f10796);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
