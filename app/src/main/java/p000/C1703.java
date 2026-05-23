package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1703 extends AbstractC1701 {

    public final C1705 f5788;

    public final C1704 f5789;

    public final C0688 f5790;

    public final Object f5791;

    public C1703(C1705 c1705, C1704 c1704, C0688 c0688, Object obj) {
        this.f5788 = c1705;
        this.f5789 = c1704;
        this.f5790 = c0688;
        this.f5791 = obj;
    }

    @Override // p000.AbstractC1701
    public final boolean mo2067() {
        return false;
    }

    @Override // p000.AbstractC1701
    public final void mo2068(Throwable th) {
        C0688 c0688 = this.f5790;
        C0688 c0688M3446 = C1705.m3446(c0688);
        C1705 c1705 = this.f5788;
        C1704 c1704 = this.f5789;
        Object obj = this.f5791;
        if (c0688M3446 == null || !c1705.m3467(c1704, c0688M3446, obj)) {
            c1704.f5795.m3606(new C1810(2), 2);
            C0688 c0688M3447 = C1705.m3446(c0688);
            if (c0688M3447 == null || !c1705.m3467(c1704, c0688M3447, obj)) {
                c1705.mo2635(c1705.m3453(c1704, obj));
            }
        }
    }
}
