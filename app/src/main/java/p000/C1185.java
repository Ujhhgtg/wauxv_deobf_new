package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1185 implements InterfaceC1624 {

    public final boolean f4326;

    public C1185(boolean z) {
        this.f4326 = z;
    }

    public final String toString() {
        return AbstractC1194.m2786(new StringBuilder("Empty{"), this.f4326 ? "Active" : "New", '}');
    }

    @Override // p000.InterfaceC1624
    public final boolean mo2771() {
        return this.f4326;
    }

    @Override // p000.InterfaceC1624
    public final C2226 mo2772() {
        return null;
    }
}
