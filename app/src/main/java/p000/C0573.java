package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0573 implements Comparable {

    public final C0918 f2338;

    public final int f2339;

    public C0573(C0918 c0918, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f2339 = i;
        this.f2338 = c0918;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0573) && compareTo((C0573) obj) == 0;
    }

    public final int hashCode() {
        return this.f2338.hashCode() + (this.f2339 * 31);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0573 c0573) {
        int i = c0573.f2339;
        int i2 = this.f2339;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f2338.compareTo(c0573.f2338);
    }
}
