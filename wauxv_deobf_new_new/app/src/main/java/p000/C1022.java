package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲁᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1022 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3737;

    public C1022(String str) {
        this.f3737 = AbstractC1031.m2726(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1022)) {
            return false;
        }
        return AbstractC1469.m3322(this.f3737, ((C1022) obj).f3737);
    }

    public final int hashCode() {
        return this.f3737.hashCode();
    }

    public final String toString() {
        return AbstractC1031.m2728(this.f3737);
    }
}
