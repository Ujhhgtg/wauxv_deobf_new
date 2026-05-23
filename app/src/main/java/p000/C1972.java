package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1972 implements InterfaceC3407, Comparable {

    public final C0913 f6541;

    public C0174 f6542;

    public C1972(C0913 c0913, C0174 c0174) {
        this.f6541 = c0913;
        this.f6542 = c0174;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6541.compareTo(((C1972) obj).f6541);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1972)) {
            return false;
        }
        return this.f6541.equals(((C1972) obj).f6541);
    }

    public final int hashCode() {
        return this.f6541.hashCode();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f6541.mo1214() + ": " + this.f6542;
    }
}
