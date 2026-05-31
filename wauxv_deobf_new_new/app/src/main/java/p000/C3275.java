package p000;

import com.umeng.analytics.pro.bc;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᛸᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3275 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3275 f10408;

    static {
        C3275 c3275 = new C3275();
        f10408 = c3275;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.p61Proto", c3275, 9);
        AbstractC2647.m4626(c2405, "video_quality_level", false, 1);
        AbstractC2647.m4626(c2405, "preload_file_size_percent", false, 2);
        AbstractC2647.m4626(c2405, "preload_file_bytes", false, 3);
        AbstractC2647.m4626(c2405, "file_total_bytes", false, 4);
        AbstractC2647.m4626(c2405, "preload_file_duration_percent", false, 5);
        AbstractC2647.m4626(c2405, "preload_file_duration", false, 6);
        AbstractC2647.m4626(c2405, "preload_file_total_duration", false, 7);
        AbstractC2647.m4626(c2405, "preload_start_time", false, 11);
        AbstractC2647.m4626(c2405, "tag_name", false, 21);
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
        Float f = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l = null;
        String str = null;
        int i = 0;
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
                    f = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1372.f4898, f);
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
                    f2 = (Float) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, C1372.f4898, f2);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num4);
                    i |= 32;
                    break;
                case 6:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1680.f5658, num5);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1888.f6259, l);
                    i |= 128;
                    break;
                case 8:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C2899.f9270, str);
                    i |= bc.e;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3277(i, num, f, num2, num3, f2, num4, num5, l, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1680);
        C1372 c1372 = C1372.f4898;
        return new InterfaceC1767[]{interfaceC1767M3392, AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1372), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C1888.f6259), AbstractC1471.m3392(C2899.f9270)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3277 c3277 = (C3277) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1680, c3277.f10409);
        C1372 c1372 = C1372.f4898;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1372, c3277.f10410);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3277.f10411);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3277.f10412);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, c1372, c3277.f10413);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3277.f10414);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1680, c3277.f10415);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, C1888.f6259, c3277.f10416);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, C2899.f9270, c3277.f10417);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
