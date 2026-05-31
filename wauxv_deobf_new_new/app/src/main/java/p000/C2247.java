package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲁᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2247 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2247 f7314;

    static {
        C2247 c2247 = new C2247();
        f7314 = c2247;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.proto.resp.NewSendMsgResp.MicroMsgRespNew", c2247, 8);
        c2405.m4350("ret", false);
        c2405.m4351(new C0355(1, 8));
        c2405.m4350("toUserName", false);
        c2405.m4351(new C0355(2, 8));
        c2405.m4350("msgId", false);
        c2405.m4351(new C0355(3, 8));
        c2405.m4350("clientMsgId", false);
        c2405.m4351(new C0355(4, 8));
        c2405.m4350("createTime", false);
        c2405.m4351(new C0355(5, 8));
        c2405.m4350("serverTime", false);
        c2405.m4351(new C0355(6, 8));
        c2405.m4350("type", false);
        c2405.m4351(new C0355(7, 8));
        c2405.m4350("newMsgId", false);
        c2405.m4351(new C0355(8, 8));
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
        interfaceC0764Mo2636.getClass();
        int i = 0;
        Integer num = null;
        C2676 c2676 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                    i |= 1;
                    break;
                case 1:
                    c2676 = (C2676) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C2674.f8656, c2676);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1680.f5658, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num6);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1888.f6259, l);
                    i |= 128;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C2249(i, num, c2676, num2, num3, num4, num5, num6, l);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1680), AbstractC1471.m3392(C2674.f8656), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C2249 c2249 = (C2249) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c2249.f7315);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, C2674.f8656, c2249.f7316);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c2249.f7317);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c2249.f7318);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1680, c2249.f7319);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c2249.f7320);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c2249.f7321);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, C1888.f6259, c2249.f7322);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
