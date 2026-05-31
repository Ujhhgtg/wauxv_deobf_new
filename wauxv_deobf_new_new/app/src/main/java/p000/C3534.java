package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3534 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f11124;

    public /* synthetic */ C3534(int i) {
        this.f11124 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1469.m3327(this.f11124 ^ Integer.MIN_VALUE, ((C3534) obj).f11124 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3534) {
            return this.f11124 == ((C3534) obj).f11124;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11124);
    }

    public final String toString() {
        return String.valueOf(((long) this.f11124) & 4294967295L);
    }
}
