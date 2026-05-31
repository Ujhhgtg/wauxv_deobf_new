package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3544 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final short f11138;

    public /* synthetic */ C3544(short s) {
        this.f11138 = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1469.m3327(this.f11138 & 65535, ((C3544) obj).f11138 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3544) {
            return this.f11138 == ((C3544) obj).f11138;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f11138);
    }

    public final String toString() {
        return String.valueOf(this.f11138 & 65535);
    }
}
