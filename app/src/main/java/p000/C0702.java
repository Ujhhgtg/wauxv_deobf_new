package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0702 {

    public static final C0702 f2671 = new C0702(1, 3);

    public static final C0702 f2672 = new C0702(1, 2);

    public static final C0702 f2673 = new C0702(2, 3);

    public static final C0702 f2674 = new C0702(2, 2);

    public static final C0702 f2675;

    public int f2676;

    public int f2677;

    static {
        C0702 c0702 = new C0702();
        c0702.f2677 = 1;
        c0702.f2676 = 3;
        f2675 = c0702;
    }

    public C0702(int i, int i2) {
        this.f2676 = i;
        this.f2677 = i2;
    }

    public static boolean m2121(InterfaceC2225 interfaceC2225) {
        AbstractC2707 abstractC2707 = ((AbstractC2707) interfaceC2225).f8720.f8720;
        if ((abstractC2707 instanceof C0336) && ((C0336) abstractC2707).f1601 == EnumC0703.f2679) {
            return true;
        }
        if (interfaceC2225 instanceof C0357) {
            return ((C0357) interfaceC2225).f1671.m3864("static");
        }
        if (interfaceC2225 instanceof C0333) {
            return ((C0333) interfaceC2225).f1592;
        }
        return false;
    }

    public final boolean m2122(InterfaceC2225 interfaceC2225) {
        int i = this.f2677;
        int i2 = this.f2676;
        if (i2 == 3) {
            return interfaceC2225 instanceof C0336;
        }
        if (interfaceC2225 instanceof C0336) {
            return false;
        }
        if (i2 == 1) {
            if (i != 2) {
                return m2121(interfaceC2225);
            }
            if (interfaceC2225 instanceof C0345) {
                return ((C0345) interfaceC2225).f1641.m3864("static");
            }
        } else {
            if (i != 2) {
                if (interfaceC2225 instanceof C0345) {
                    return false;
                }
                return !m2121(interfaceC2225);
            }
            if (interfaceC2225 instanceof C0345) {
                return !((C0345) interfaceC2225).f1641.m3864("static");
            }
        }
        return false;
    }
}
