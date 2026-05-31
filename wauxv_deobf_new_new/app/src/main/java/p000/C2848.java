package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᤞᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2848 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2848 f9066 = new C2848(null, -1, -1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0916 f9067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f9068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f9069;

    public C2848(C0916 c0916, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f9067 = c0916;
        this.f9068 = i;
        this.f9069 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f9067;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C0916 c0916;
        if (!(obj instanceof C2848)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2848 c2848 = (C2848) obj;
        return this.f9068 == c2848.f9068 && this.f9069 == c2848.f9069 && ((c0916 = this.f9067) == obj2 || (c0916 != null && c0916.equals(obj2)));
    }

    public final int hashCode() {
        return this.f9067.f3385.hashCode() + this.f9068 + this.f9069;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C0916 c0916 = this.f9067;
        if (c0916 != null) {
            sb.append(c0916.mo1360());
            sb.append(":");
        }
        int i = this.f9069;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f9068;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(AbstractC2902.m4906(i2));
        }
        return sb.toString();
    }
}
