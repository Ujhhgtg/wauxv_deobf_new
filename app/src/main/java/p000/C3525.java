package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᤝᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3525 implements Comparable, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3525 f11035 = new C3525(0, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long f11036;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final long f11037;

    public C3525(long j, long j2) {
        this.f11036 = j;
        this.f11037 = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3525 c3525 = (C3525) obj;
        long j = c3525.f11036;
        long j2 = this.f11036;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f11037, c3525.f11037);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3525)) {
            return false;
        }
        C3525 c3525 = (C3525) obj;
        return this.f11036 == c3525.f11036 && this.f11037 == c3525.f11037;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11036 ^ this.f11037);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC3453.m4993(this.f11036, 0, 0, bArr, 4);
        bArr[8] = 45;
        AbstractC3453.m4993(this.f11036, 9, 4, bArr, 6);
        bArr[13] = 45;
        AbstractC3453.m4993(this.f11036, 14, 6, bArr, 8);
        bArr[18] = 45;
        AbstractC3453.m4993(this.f11037, 19, 0, bArr, 2);
        bArr[23] = 45;
        AbstractC3453.m4993(this.f11037, 24, 2, bArr, 8);
        return new String(bArr, AbstractC0599.f2413);
    }
}
