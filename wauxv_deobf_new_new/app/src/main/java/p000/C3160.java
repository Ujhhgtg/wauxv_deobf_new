package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᤞᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3160 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3160 f10071;

    static {
        C3160 c3160 = new C3160();
        f10071 = c3160;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.il1Proto", c3160, 3);
        AbstractC2647.m4626(c2405, "online_member_count", false, 1);
        AbstractC2647.m4626(c2405, "like_count", false, 2);
        AbstractC2647.m4626(c2405, "update_time", false, 3);
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
        Integer num = null;
        boolean z = true;
        int i = 0;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            if (iMo2331 == -1) {
                z = false;
            } else if (iMo2331 == 0) {
                num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1680.f5658, num);
                i |= 1;
            } else if (iMo2331 == 1) {
                num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1680.f5658, num2);
                i |= 2;
            } else {
                if (iMo2331 != 2) {
                    throw new C3558(iMo2331);
                }
                l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1888.f6259, l);
                i |= 4;
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3162(i, num, num2, l);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3162 c3162 = (C3162) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3162.f10072);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1680, c3162.f10073);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, C1888.f6259, c3162.f10074);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
