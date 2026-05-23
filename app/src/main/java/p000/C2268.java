package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2268 extends AbstractC1351 {
    public C2268(C2788 c2788) {
        super(c2788, C2526.f8058);
    }

    @Override // p000.AbstractC0950
    public final String mo1343() {
        return null;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final int mo1344() {
        return m2442() & 1;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final String mo1345() {
        if (mo1344() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // p000.AbstractC0950
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C2268(this.f3469);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final void mo1347(C0519 c0519) {
        if (mo1344() != 0) {
            c0519.m1840(AbstractC2205.m4049(0, 0));
        }
    }
}
