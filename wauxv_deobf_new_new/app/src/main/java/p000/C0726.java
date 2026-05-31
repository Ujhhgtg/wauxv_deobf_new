package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤝᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0726 implements InterfaceC0727 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float f2753;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float f2754;

    public C0726(float f, float f2) {
        this.f2753 = f;
        this.f2754 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0726)) {
            return false;
        }
        float f = this.f2753;
        float f2 = this.f2754;
        if (f > f2) {
            C0726 c0726 = (C0726) obj;
            if (c0726.f2753 > c0726.f2754) {
                return true;
            }
        }
        C0726 c0727 = (C0726) obj;
        return f == c0727.f2753 && f2 == c0727.f2754;
    }

    public final int hashCode() {
        float f = this.f2753;
        float f2 = this.f2754;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.f2753 + ".." + this.f2754;
    }
}
