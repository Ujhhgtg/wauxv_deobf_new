package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᤞᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3529 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final byte f11117;

    public /* synthetic */ C3529(byte b) {
        this.f11117 = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1469.m3327(this.f11117 & 255, ((C3529) obj).f11117 & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3529) {
            return this.f11117 == ((C3529) obj).f11117;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f11117);
    }

    public final String toString() {
        return String.valueOf(this.f11117 & 255);
    }
}
