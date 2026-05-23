package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1550 extends AbstractC1351 {

    public C2706[] f5413;

    public C1550(C2788 c2788, C2526 c2526) {
        super(c2788, c2526);
        if (c2526.f4836.length == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f5413 = null;
    }

    @Override // p000.AbstractC0950
    public final String mo1343() {
        return null;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final int mo1344() {
        m3260();
        int iMo1344 = 0;
        for (C2706 c2706 : this.f5413) {
            iMo1344 += c2706.mo1344();
        }
        return iMo1344;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final String mo1345() {
        C2526 c2526 = this.f3470;
        int length = c2526.f4836.length;
        StringBuilder sb = new StringBuilder(100);
        int iM4540 = 0;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = (C2525) c2526.m3062(i);
            C2706 c2706M2441 = AbstractC0950.m2441(C2788.f8904, C2525.m4532(iM4540, c2525.f8056.getType(), null), c2525);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c2706M2441.mo1345());
            iM4540 += c2525.m4540();
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0950
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C1550(this.f3469, c2526);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    public final void mo1347(C0519 c0519) {
        m3260();
        for (C2706 c2706 : this.f5413) {
            c2706.mo1347(c0519);
        }
    }

    public final void m3260() {
        if (this.f5413 != null) {
            return;
        }
        C2526 c2526 = this.f3470;
        int length = c2526.f4836.length;
        this.f5413 = new C2706[length];
        int iM4540 = 0;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = (C2525) c2526.m3062(i);
            this.f5413[i] = AbstractC0950.m2441(C2788.f8904, C2525.m4532(iM4540, c2525.f8056.getType(), null), c2525);
            iM4540 += c2525.m4540();
        }
    }
}
