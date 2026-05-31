package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᛸᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1642 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f5540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f5541;

    public C1642(int i, Object obj) {
        this.f5540 = i;
        this.f5541 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1642)) {
            return false;
        }
        C1642 c1642 = (C1642) obj;
        return this.f5540 == c1642.f5540 && AbstractC1469.m3322(this.f5541, c1642.f5541);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5540) * 31;
        Object obj = this.f5541;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5540 + ", value=" + this.f5541 + ')';
    }
}
