package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3359 implements InterfaceC1451 {
    private static final InterfaceC2715 descriptor;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3359 f10645;

    static {
        C3359 c3359 = new C3359();
        f10645 = c3359;
        String[] strArr = AbstractC1471.f5234;
        C2405 c2405 = new C2405("me.hd.wauxv.hook.micromsg.core.protobuf.old.proto.TimeLineObjectProto.v51Proto", c3359, 14);
        AbstractC2647.m4626(c2405, "battle_id", false, 1);
        AbstractC2647.m4626(c2405, "battle_seq", false, 2);
        AbstractC2647.m4626(c2405, "status", false, 3);
        AbstractC2647.m4626(c2405, "time_left", false, 4);
        AbstractC2647.m4626(c2405, "player_info", false, 6);
        AbstractC2647.m4626(c2405, "result", false, 7);
        AbstractC2647.m4626(c2405, "delay_ms", false, 8);
        AbstractC2647.m4626(c2405, "battle_type", false, 9);
        AbstractC2647.m4626(c2405, "battle_mode", false, 10);
        AbstractC2647.m4626(c2405, "battle_teams", false, 11);
        AbstractC2647.m4626(c2405, "indicator_type", false, 12);
        AbstractC2647.m4626(c2405, "extra_info", false, 14);
        AbstractC2647.m4626(c2405, "battle_scope", false, 15);
        AbstractC2647.m4626(c2405, "is_disable_next_battle", false, 16);
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
        InterfaceC1780[] interfaceC1780Arr = C3361.f10646;
        interfaceC0764Mo2636.getClass();
        Integer num = null;
        Boolean bool = null;
        Integer num2 = null;
        C3346 c3346 = null;
        List list = null;
        Integer num3 = null;
        Long l = null;
        Integer num4 = null;
        Integer num5 = null;
        List list2 = null;
        Integer num6 = null;
        Long l2 = null;
        Integer num7 = null;
        String str = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Long l3 = l;
            int iMo2331 = interfaceC0764Mo2636.mo2331(interfaceC2715);
            switch (iMo2331) {
                case -1:
                    z = false;
                    l = l3;
                    num2 = num2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 0:
                    str = (String) interfaceC0764Mo2636.mo2340(interfaceC2715, 0, C2899.f9270, str);
                    i |= 1;
                    l = l3;
                    num2 = num2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    num4 = num4;
                    l = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 1, C1888.f6259, l3);
                    i |= 2;
                    num4 = num4;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    num4 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 2, C1680.f5658, num4);
                    i |= 4;
                    l = l3;
                    bool = bool;
                    break;
                case 3:
                    num5 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 3, C1680.f5658, num5);
                    i |= 8;
                    l = l3;
                    num4 = num4;
                    break;
                case 4:
                    list2 = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), list2);
                    i |= 16;
                    l = l3;
                    num4 = num4;
                    break;
                case 5:
                    num6 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 5, C1680.f5658, num6);
                    i |= 32;
                    l = l3;
                    num4 = num4;
                    break;
                case 6:
                    l2 = (Long) interfaceC0764Mo2636.mo2340(interfaceC2715, 6, C1888.f6259, l2);
                    i |= 64;
                    l = l3;
                    num4 = num4;
                    break;
                case 7:
                    num7 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 7, C1680.f5658, num7);
                    i |= 128;
                    l = l3;
                    num4 = num4;
                    break;
                case 8:
                    num = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 8, C1680.f5658, num);
                    i |= bc.e;
                    l = l3;
                    num4 = num4;
                    break;
                case 9:
                    list = (List) interfaceC0764Mo2636.mo2340(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), list);
                    i |= 512;
                    l = l3;
                    num4 = num4;
                    break;
                case 10:
                    num3 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 10, C1680.f5658, num3);
                    i |= 1024;
                    l = l3;
                    num4 = num4;
                    break;
                case 11:
                    c3346 = (C3346) interfaceC0764Mo2636.mo2340(interfaceC2715, 11, C3344.f10587, c3346);
                    i |= 2048;
                    l = l3;
                    num4 = num4;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    num2 = (Integer) interfaceC0764Mo2636.mo2340(interfaceC2715, 12, C1680.f5658, num2);
                    i |= 4096;
                    l = l3;
                    num4 = num4;
                    break;
                case 13:
                    bool = (Boolean) interfaceC0764Mo2636.mo2340(interfaceC2715, 13, C0416.f1980, bool);
                    i |= 8192;
                    l = l3;
                    num4 = num4;
                    break;
                default:
                    throw new C3558(iMo2331);
            }
        }
        Boolean bool2 = bool;
        Integer num8 = num4;
        String str2 = str;
        interfaceC0764Mo2636.mo2329(interfaceC2715);
        return new C3361(i, str2, l, num8, num5, list2, num6, l2, num7, num, list, num3, c3346, num2, bool2);
    }

    @Override // p000.InterfaceC1451
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final InterfaceC1767[] mo1647() {
        InterfaceC1780[] interfaceC1780Arr = C3361.f10646;
        InterfaceC1767 interfaceC1767M3392 = AbstractC1471.m3392(C2899.f9270);
        C1888 c1888 = C1888.f6259;
        InterfaceC1767 interfaceC1767M3393 = AbstractC1471.m3392(c1888);
        C1680 c1680 = C1680.f5658;
        return new InterfaceC1767[]{interfaceC1767M3392, interfaceC1767M3393, AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[4].getValue()), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1888), AbstractC1471.m3392(c1680), AbstractC1471.m3392(c1680), AbstractC1471.m3392((InterfaceC1767) interfaceC1780Arr[9].getValue()), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C3344.f10587), AbstractC1471.m3392(c1680), AbstractC1471.m3392(C0416.f1980)};
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C3361 c3361 = (C3361) obj;
        InterfaceC2715 interfaceC2715 = descriptor;
        InterfaceC0765 interfaceC0765Mo2918 = interfaceC1207.mo2918(interfaceC2715);
        InterfaceC1780[] interfaceC1780Arr = C3361.f10646;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 0, C2899.f9270, c3361.f10647);
        C1888 c1888 = C1888.f6259;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 1, c1888, c3361.f10648);
        C1680 c1680 = C1680.f5658;
        interfaceC0765Mo2918.mo2354(interfaceC2715, 2, c1680, c3361.f10649);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 3, c1680, c3361.f10650);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 4, (InterfaceC1767) interfaceC1780Arr[4].getValue(), c3361.f10651);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 5, c1680, c3361.f10652);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 6, c1888, c3361.f10653);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 7, c1680, c3361.f10654);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 8, c1680, c3361.f10655);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 9, (InterfaceC1767) interfaceC1780Arr[9].getValue(), c3361.f10656);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 10, c1680, c3361.f10657);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 11, C3344.f10587, c3361.f10658);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 12, c1680, c3361.f10659);
        interfaceC0765Mo2918.mo2354(interfaceC2715, 13, C0416.f1980, c3361.f10660);
        interfaceC0765Mo2918.mo2343(interfaceC2715);
    }
}
