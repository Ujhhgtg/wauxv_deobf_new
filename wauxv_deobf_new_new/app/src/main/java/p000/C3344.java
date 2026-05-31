package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᛸᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3344 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3344 f10587;

    static {
        C3344 c3344 = new C3344();
        f10587 = c3344;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.u51Proto", c3344, 2);
        AbstractC2647.m4626(c2405, "current_extra_times_multi_100", false, 1);
        AbstractC2647.m4626(c2405, "extra_items", false, 2);
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
        InterfaceC1780[] interfaceC1780Arr = C3346.f10588;
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
        return new C3346(i, num, list);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        return new InterfaceC1767[]{AbstractC1471.m3392(C1680.f5658), AbstractC1471.m3392((InterfaceC1767) C3346.f10588[1].getValue())};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3346 c3346 = (C3346) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3346.f10588;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C1680.f5658, c3346.f10589);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, (InterfaceC1767) interfaceC1780Arr[1].getValue(), c3346.f10590);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
