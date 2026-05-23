package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0914 extends AbstractC0777 {

    public static final C0914 f3373 = new C0914(new C0917("TYPE"), new C0917("Ljava/lang/Class;"));

    public final C0917 f3374;

    public final C0917 f3375;

    public C0914(C0917 c0917, C0917 c0918) {
        if (c0917 == null) {
            throw new NullPointerException("name == null");
        }
        if (c0918 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f3374 = c0917;
        this.f3375 = c0918;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0914)) {
            return false;
        }
        C0914 c0914 = (C0914) obj;
        return this.f3374.equals(c0914.f3374) && this.f3375.equals(c0914.f3375);
    }

    public final int hashCode() {
        return (this.f3374.f3378.hashCode() * 31) ^ this.f3375.f3378.hashCode();
    }

    public final String toString() {
        return "nat{" + mo1214() + '}';
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f3374.mo1214() + ':' + this.f3375.mo1214();
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        C0914 c0914 = (C0914) abstractC0777;
        int iCompareTo = this.f3374.compareTo(c0914.f3374);
        return iCompareTo != 0 ? iCompareTo : this.f3375.compareTo(c0914.f3375);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "nat";
    }

    public final C3448 m2428() {
        return C3448.m4961(this.f3375.f3378);
    }
}
