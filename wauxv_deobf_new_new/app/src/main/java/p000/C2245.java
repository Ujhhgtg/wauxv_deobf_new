package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲁᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2245 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2245 f7313;

    static {
        C2245 c2245 = new C2245();
        f7313 = c2245;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.NewSendMsgResp", c2245, 4);
        c2405.m4350("baseResponse", false);
        c2405.m4351(new C0355(1, 8));
        c2405.m4350("count", false);
        c2405.m4351(new C0355(2, 8));
        c2405.m4350("list", false);
        c2405.m4351(new C0355(3, 8));
        c2405.m4350("noKnow", false);
        c2405.m4351(new C0355(4, 8));
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
        InterfaceC1780[] interfaceC1780Arr = C2250.f7323;
        interfaceC0764Mo2636.getClass();
        int i = 0;
        C0358 c0358 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                c0358 = (C0358) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C0356.f1754, c0358);
                i |= 1;
            } else if (iMo2331 == 1) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num);
                i |= 2;
            } else if (iMo2331 == 2) {
                list = (List) interfaceC0764Mo2636.mo2338(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo2331 != 3) {
                    throw new C3558(iMo2331);
                }
                num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num2);
                i |= 8;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C2250(i, c0358, num, list, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C2250.f7323;
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(C0356.f1754), AbstractC1471.m3392(c1680), interfaceC1780Arr[2].getValue(), AbstractC1471.m3392(c1680)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C2250 c2250 = (C2250) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C2250.f7323;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C0356.f1754, c2250.f7324);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c2250.f7325);
        interfaceC0765Mo2918.mo2346(interfaceC2715, 2, (InterfaceC1767) interfaceC1780Arr[2].getValue(), c2250.f7326);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c2250.f7327);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
