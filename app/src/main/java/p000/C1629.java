package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1629 {

    public final int f5506;

    public final Object f5507;

    public C1629(int i, Object obj) {
        this.f5506 = i;
        this.f5507 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1629)) {
            return false;
        }
        C1629 c1629 = (C1629) obj;
        return this.f5506 == c1629.f5506 && AbstractC2207.m4087(this.f5507, c1629.f5507);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5506) * 31;
        Object obj = this.f5507;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5506 + ", value=" + this.f5507 + ')';
    }
}
