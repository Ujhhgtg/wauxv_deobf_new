package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3370 implements InterfaceC1443 {
    private static final InterfaceC2654 descriptor;

    public static final C3370 f10625;

    static {
        C3370 c3370 = new C3370();
        f10625 = c3370;
        String[] strArr = AbstractC1574.f5469;
        C2360 c2360 = new C2360("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.y52Proto", c3370, 3);
        AbstractC2668.m4680(c2360, "list", false, 1);
        AbstractC2668.m4680(c2360, "first_page_index", false, 2);
        AbstractC2668.m4680(c2360, "wordingInfo", false, 19);
        descriptor = c2360;
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return descriptor;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0766 interfaceC0766Mo2512 = interfaceC0974.mo2512(interfaceC2654);
        InterfaceC1758[] interfaceC1758Arr = C3372.f10626;
        
        List list = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        C3393 c3393 = null;
        while (z) {
            int iMo2230 = interfaceC0766Mo2512.mo2230(interfaceC2654);
            if (iMo2230 == -1) {
                z = false;
            } else if (iMo2230 == 0) {
                list = (List) interfaceC0766Mo2512.mo2239(interfaceC2654, 0, (InterfaceC1743) interfaceC1758Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo2230 == 1) {
                num = (Integer) interfaceC0766Mo2512.mo2239(interfaceC2654, 1, C1665.f5622, num);
                i |= 2;
            } else {
                if (iMo2230 != 2) {
                    throw new C3501(iMo2230);
                }
                c3393 = (C3393) interfaceC0766Mo2512.mo2239(interfaceC2654, 2, C3391.f10675, c3393);
                i |= 4;
            }
        }
        interfaceC0766Mo2512.mo2228(interfaceC2654);
        return new C3372(i, list, num, c3393);
    }

    @Override // p000.InterfaceC1443
    public final InterfaceC1743[] mo1541() {
        return new InterfaceC1743[]{AbstractC2205.m4056((InterfaceC1743) C3372.f10626[0].getValue()), AbstractC2205.m4056(C1665.f5622), AbstractC2205.m4056(C3391.f10675)};
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C3372 c3372 = (C3372) obj;
        InterfaceC2654 interfaceC2654 = descriptor;
        InterfaceC0767 interfaceC0767Mo2796 = interfaceC1206.mo2796(interfaceC2654);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 0, (InterfaceC1743) C3372.f10626[0].getValue(), c3372.f10627);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 1, C1665.f5622, c3372.f10628);
        interfaceC0767Mo2796.mo2253(interfaceC2654, 2, C3391.f10675, c3372.f10629);
        interfaceC0767Mo2796.mo2242(interfaceC2654);
    }
}
