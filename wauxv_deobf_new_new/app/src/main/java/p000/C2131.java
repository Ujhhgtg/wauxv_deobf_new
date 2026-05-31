package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2131 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Class f7038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Class f7039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Class f7040;

    public C2131(Class cls, Class cls2, Class cls3) {
        this.f7038 = cls;
        this.f7039 = cls2;
        this.f7040 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2131.class != obj.getClass()) {
            return false;
        }
        C2131 c2131 = (C2131) obj;
        return this.f7038.equals(c2131.f7038) && this.f7039.equals(c2131.f7039) && AbstractC3580.m5117(this.f7040, c2131.f7040);
    }

    public final int hashCode() {
        int iHashCode = (this.f7039.hashCode() + (this.f7038.hashCode() * 31)) * 31;
        Class cls = this.f7040;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f7038 + ", second=" + this.f7039 + '}';
    }
}
