package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0888 extends AbstractC0777 {

    public final C0165 f3328;

    public C0888(C0165 c0165) {
        c0165.m3926();
        this.f3328 = c0165;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0888)) {
            return false;
        }
        return this.f3328.equals(((C0888) obj).f3328);
    }

    public final int hashCode() {
        return this.f3328.hashCode();
    }

    public final String toString() {
        return this.f3328.mo1214();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f3328.mo1214();
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        return this.f3328.compareTo(((C0888) abstractC0777).f3328);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "annotation";
    }
}
