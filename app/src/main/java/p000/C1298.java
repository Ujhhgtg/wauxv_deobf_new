package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1298 implements InterfaceC3407, Comparable {

    public final C0899 f4723;

    public C0174 f4724;

    public C1298(C0899 c0899, C0174 c0174) {
        this.f4723 = c0899;
        this.f4724 = c0174;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4723.compareTo(((C1298) obj).f4723);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1298)) {
            return false;
        }
        return this.f4723.equals(((C1298) obj).f4723);
    }

    public final int hashCode() {
        return this.f4723.hashCode();
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f4723.mo1214() + ": " + this.f4724;
    }
}
