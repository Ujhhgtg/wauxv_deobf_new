package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3583 implements Comparable, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C3583 f11188 = new C3583(0, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f11189;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long f11190;

    public C3583(long j, long j2) {
        this.f11189 = j;
        this.f11190 = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        C3584 c3584 = new C3584();
        c3584.f11191 = this.f11189;
        c3584.f11192 = this.f11190;
        return c3584;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3583 c3583 = (C3583) obj;
        long j = c3583.f11189;
        long j2 = this.f11189;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f11190, c3583.f11190);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3583)) {
            return false;
        }
        C3583 c3583 = (C3583) obj;
        return this.f11189 == c3583.f11189 && this.f11190 == c3583.f11190;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11189 ^ this.f11190);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC0738.m2267(this.f11189, 0, 0, bArr, 4);
        bArr[8] = 45;
        AbstractC0738.m2267(this.f11189, 9, 4, bArr, 6);
        bArr[13] = 45;
        AbstractC0738.m2267(this.f11189, 14, 6, bArr, 8);
        bArr[18] = 45;
        AbstractC0738.m2267(this.f11190, 19, 0, bArr, 2);
        bArr[23] = 45;
        AbstractC0738.m2267(this.f11190, 24, 2, bArr, 8);
        return new String(bArr, AbstractC0580.UTF_8);
    }
}
