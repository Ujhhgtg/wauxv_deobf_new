package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0553 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f2309;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f2310;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0551 f2311;

    public C0553(int i, int i2, C0551 c0551) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c0551.f7068) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f2309 = i;
        this.f2310 = i2;
        this.f2311 = c0551;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0553) && compareTo((C0553) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2311.f4833) + (((this.f2309 * 31) + this.f2310) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0553 c0553) {
        int i = c0553.f2309;
        int i2 = this.f2309;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c0553.f2310;
        int i4 = this.f2310;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f2311.compareTo(c0553.f2311);
    }
}
