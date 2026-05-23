package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤝᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3487 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final short f10986;

    public /* synthetic */ C3487(short s) {
        this.f10986 = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC2207.m4089(this.f10986 & 65535, ((C3487) obj).f10986 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3487) {
            return this.f10986 == ((C3487) obj).f10986;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f10986);
    }

    public final String toString() {
        return String.valueOf(this.f10986 & 65535);
    }
}
