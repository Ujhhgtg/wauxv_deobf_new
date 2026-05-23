package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1019 {

    public final String f3730;

    public C1019(String str) {
        this.f3730 = AbstractC1028.m2602(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1019)) {
            return false;
        }
        return AbstractC2207.m4087(this.f3730, ((C1019) obj).f3730);
    }

    public final int hashCode() {
        return this.f3730.hashCode();
    }

    public final String toString() {
        return AbstractC1028.m2604(this.f3730);
    }
}
