package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3477 implements Comparable {

    public final int f10972;

    public /* synthetic */ C3477(int i) {
        this.f10972 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC2207.m4089(this.f10972 ^ -2147483648, ((C3477) obj).f10972 ^ -2147483648);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3477) {
            return this.f10972 == ((C3477) obj).f10972;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10972);
    }

    public final String toString() {
        return String.valueOf(((long) this.f10972) & 4294967295L);
    }
}
