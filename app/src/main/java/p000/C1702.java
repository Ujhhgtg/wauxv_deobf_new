package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1702 extends C0558 {

    public final C1004 f5787;

    public C1702(InterfaceC0842 interfaceC0842, C1004 c1004) {
        super(interfaceC0842);
        this.f5787 = c1004;
    }

    @Override // p000.C0558
    public final Throwable mo1948(C1705 c1705) {
        Throwable thM3443;
        C1004 c1004 = this.f5787;
        
        Object obj = C1705.f5796.get(c1004);
        if (!(obj instanceof C1704) || (thM3443 = ((C1704) obj).m3443()) == null) {
            return obj instanceof C0760 ? ((C0760) obj).f2861 : c1705.mo3440();
        }
        return thM3443;
    }

    @Override // p000.C0558
    public final String mo1952() {
        return "AwaitContinuation";
    }
}
