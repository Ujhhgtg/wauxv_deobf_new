package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0915 extends AbstractC3458 {

    public final C2440 f3376;

    public C0915(C2440 c2440) {
        this.f3376 = c2440;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0915) {
            return this.f3376.equals(((C0915) obj).f3376);
        }
        return false;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10880;
    }

    public final int hashCode() {
        return this.f3376.f7754.hashCode();
    }

    public final String toString() {
        return AbstractC1194.m2786(new StringBuilder("proto{"), this.f3376.f7754, '}');
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f3376.f7754;
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        return this.f3376.compareTo(((C0915) abstractC0777).f3376);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "proto";
    }
}
