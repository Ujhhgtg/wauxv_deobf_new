package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0175 extends AbstractC2270 {

    public C0174 f1211;

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        this.f1211 = (C0174) c1023.f3737.m3855(this.f1211);
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5734;
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        int iM4150 = this.f1211.m4150();
        if (c0519.m1833()) {
            c0519.m1831(4, "  annotations_off: ".concat(AbstractC1460.m3224(iM4150)));
        }
        c0519.m1839(iM4150);
    }
}
