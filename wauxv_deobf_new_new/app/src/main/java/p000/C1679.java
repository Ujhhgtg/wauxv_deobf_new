package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1679 extends C1677 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1679 f5657 = new C1679(1, 0, 1);

    @Override // p000.C1677
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1679)) {
            return false;
        }
        if (isEmpty() && ((C1679) obj).isEmpty()) {
            return true;
        }
        C1679 c1679 = (C1679) obj;
        return this.f5650 == c1679.f5650 && this.f5651 == c1679.f5651;
    }

    @Override // p000.C1677
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5650 * 31) + this.f5651;
    }

    @Override // p000.C1677
    public final boolean isEmpty() {
        return this.f5650 > this.f5651;
    }

    @Override // p000.C1677
    public final String toString() {
        return this.f5650 + ".." + this.f5651;
    }
}
