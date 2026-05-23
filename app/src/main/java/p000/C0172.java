package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0172 extends AbstractC2270 {

    public static final C0171 f1203 = new C0171(0);

    public final C0165 f1204;

    public C3452 f1205;

    public byte[] f1206;

    public C0172(C0165 c0165, C1023 c1023) {
        super(1, -1);
        if (c0165 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f1204 = c0165;
        this.f1205 = null;
        this.f1206 = null;
        mo1221(c1023);
    }

    public final int hashCode() {
        return this.f1204.hashCode();
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        C1977 c1977 = c1023.f3742;
        C0165 c0165 = this.f1204;
        this.f1205 = c1977.m3809(c0165.f1190);
        C2825.m4799(c0165, c1023);
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5730;
    }

    @Override // p000.AbstractC2270
    public final int mo1223(AbstractC2270 abstractC2270) {
        return this.f1204.compareTo(((C0172) abstractC2270).f1204);
    }

    @Override // p000.AbstractC2270
    public final void mo1224(C1986 c1986, int i) {
        C0519 c0519 = new C0519();
        new C2825(c1986.f8534, c0519).m4809(this.f1204, false);
        byte[] bArrM1836 = c0519.m1836();
        this.f1206 = bArrM1836;
        m4153(bArrM1836.length + 1);
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        String str;
        boolean zM1833 = c0519.m1833();
        C0165 c0165 = this.f1204;
        int i = c0165.f1191;
        if (zM1833) {
            c0519.m1831(0, m4151() + " annotation");
            if (i == 1) {
                str = "RUNTIME";
            } else if (i == 2) {
                str = "BUILD";
            } else if (i != 3) {
                str = i != 4 ? "null" : "EMBEDDED";
            } else {
                str = "SYSTEM";
            }
            c0519.m1831(1, "  visibility: VISBILITY_".concat(str));
        }
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 0) {
            c0519.m1838(1);
        } else if (iM4759 == 1) {
            c0519.m1838(0);
        } else {
            if (iM4759 != 2) {
                throw new RuntimeException("shouldn't happen");
            }
            c0519.m1838(2);
        }
        if (zM1833) {
            new C2825(c1023, c0519).m4809(c0165, true);
        } else {
            c0519.m1837(this.f1206);
        }
    }
}
