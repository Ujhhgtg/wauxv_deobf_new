package p000;

import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲀᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3206 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3206 f10189;

    static {
        C3206 c3206 = new C3206();
        f10189 = c3206;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.m40Proto", c3206, 12);
        AbstractC2647.m4626(c2405, "start_time", false, 1);
        AbstractC2647.m4626(c2405, "end_time", false, 2);
        AbstractC2647.m4626(c2405, "quest_duration", false, 3);
        AbstractC2647.m4626(c2405, "time_interval_before_quest", false, 4);
        AbstractC2647.m4626(c2405, "progress", false, 5);
        AbstractC2647.m4626(c2405, "reward", false, 6);
        AbstractC2647.m4626(c2405, "delivery_crit_quest", false, 7);
        AbstractC2647.m4626(c2405, "is_crit_quest_accomplished", false, 8);
        AbstractC2647.m4626(c2405, "current_stage", false, 9);
        AbstractC2647.m4626(c2405, "stage_time_left", false, 10);
        AbstractC2647.m4626(c2405, "current_stage_duration", false, 11);
        AbstractC2647.m4626(c2405, "crit_quest_id", false, 12);
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
        InterfaceC1780[] interfaceC1780Arr = C3208.f10190;
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        Long l2 = null;
        Integer num4 = null;
        Integer num5 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            interfaceC1780Arr = interfaceC1780Arr;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C1888.f6259, l);
                    i |= 1;
                    continue;
                case 1:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l2);
                    i |= 2;
                    break;
                case 2:
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num4);
                    i |= 4;
                    break;
                case 3:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num5);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C0416.f1980, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C0416.f1980, bool2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num);
                    i |= bc.e;
                    break;
                case 9:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, C1680.f5658, num2);
                    i |= 512;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num3);
                    i |= 1024;
                    break;
                case 11:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C2899.f9270, str);
                    i |= 2048;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
            l = l;
        }
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3208(i, l, l2, num4, num5, list, list2, bool, bool2, num, num2, num3, str);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3208.f10190;
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(c1888);
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        C1680 c1680 = C1680.f5658;
        InterfaceC1767 interfaceC1767M3394 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3395 = AbstractC1471.m3392(c1680);
        InterfaceC1767 interfaceC1767M3396 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[4].getValue());
        InterfaceC1767 interfaceC1767M3397 = AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[5].getValue());
        C0416 c0416 = C0416.f1980;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, interfaceC1767M3394, interfaceC1767M3395, interfaceC1767M3396, interfaceC1767M3397, AbstractC1471.m3392(c0416), AbstractC1471.m3392(c0416), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C2899.f9270)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3208 c3208 = (C3208) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3208.f10190;
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, c1888, c3208.f10191);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3208.f10192);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3208.f10193);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3208.f10194);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), c3208.f10195);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, (InterfaceC1767) interfaceC1780Arr[5].getValue(), c3208.f10196);
        C0416 c0416 = C0416.f1980;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c0416, c3208.f10197);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c0416, c3208.f10198);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3208.f10199);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, c1680, c3208.f10200);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3208.f10201);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, C2899.f9270, c3208.f10202);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
