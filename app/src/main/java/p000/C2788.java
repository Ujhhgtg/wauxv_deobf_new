package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲈᛸᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2788 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2788 f8904 = new C2788(null, -1, -1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0917 f8905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f8906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f8907;

    public C2788(C0917 c0917, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f8905 = c0917;
        this.f8906 = i;
        this.f8907 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f8905;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C0917 c0917;
        if (!(obj instanceof C2788)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2788 c2788 = (C2788) obj;
        return this.f8906 == c2788.f8906 && this.f8907 == c2788.f8907 && ((c0917 = this.f8905) == obj2 || (c0917 != null && c0917.equals(obj2)));
    }

    public final int hashCode() {
        return this.f8905.f3378.hashCode() + this.f8906 + this.f8907;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C0917 c0917 = this.f8905;
        if (c0917 != null) {
            sb.append(c0917.mo1214());
            sb.append(":");
        }
        int i = this.f8907;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f8906;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(AbstractC1460.m3223(i2));
        }
        return sb.toString();
    }
}
