package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᛸᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1283 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1283 f4687;

    static {
        C1283 c1283 = new C1283();
        f4687 = c1283;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.FavInfoProto.VoiceInfoProto", c1283, 6);
        c2405.m4350("duration", false);
        c2405.m4351(new C0355(10, 3));
        c2405.m4350("fileCacheType", false);
        c2405.m4351(new C0355(16, 3));
        c2405.m4350("md5Checksum", false);
        c2405.m4351(new C0355(17, 3));
        c2405.m4350("fileSize", false);
        c2405.m4351(new C0355(19, 3));
        c2405.m4350("fileCacheName", false);
        c2405.m4351(new C0355(20, 3));
        c2405.m4350("filePath", true);
        c2405.m4351(new C0355(21, 3));
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
        int iMo2339 = 0;
        int iMo23310 = 0;
        String strMo2336 = null;
        String strMo2337 = null;
        String strMo2338 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo2339 = interfaceC0764Mo2636.mo2339(interfaceC2715, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo2336 = interfaceC0764Mo2636.mo2336(interfaceC2715, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo2337 = interfaceC0764Mo2636.mo2336(interfaceC2715, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo23310 = interfaceC0764Mo2636.mo2339(interfaceC2715, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo2338 = interfaceC0764Mo2636.mo2336(interfaceC2715, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C2899.f9270, str);
                    i |= 32;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C1285(i, iMo2339, strMo2336, strMo2337, iMo23310, strMo2338, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C2899 c2899 = C2899.f9270;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c2899);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{c1680, c2899, c2899, c1680, c2899, interfaceC1767M3392};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1285 c1285 = (C1285) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        int i = c1285.f4688;
        String str = c1285.f4693;
        interfaceC0765Mo2918.mo2350(0, i, interfaceC2715);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 1, c1285.f4689);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 2, c1285.f4690);
        interfaceC0765Mo2918.mo2350(3, c1285.f4691, interfaceC2715);
        interfaceC0765Mo2918.mo2351(interfaceC2715, 4, c1285.f4692);
        if (interfaceC0765Mo2918.mo2355() || str != null) {
            interfaceC0765Mo2918.mo2354(interfaceC2715, 5, C2899.f9270, str);
        }
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
