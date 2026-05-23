package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2636 extends AbstractC0057 implements InterfaceC0885 {

    public final AbstractC2862 f8530;

    public C2636(InterfaceC0877 interfaceC0877, AbstractC2862 abstractC2862) {
        super(interfaceC0877, true);
        this.f8530 = abstractC2862;
    }

    @Override // p000.InterfaceC0885
    public final InterfaceC0885 mo1491() {
        AbstractC2862 abstractC2862 = this.f8530;
        if (abstractC2862 != null) {
            return abstractC2862;
        }
        return null;
    }

    @Override // p000.C1705
    public void mo2635(Object obj) {
        AbstractC2203.m4038(AbstractC2209.m4135(this.f8530), AbstractC2201.m3983(obj));
    }

    @Override // p000.C1705
    public void mo2636(Object obj) {
        this.f8530.mo933(AbstractC2201.m3983(obj));
    }

    @Override // p000.C1705
    public final boolean mo3459() {
        return true;
    }

    public void mo4634() {
    }
}
