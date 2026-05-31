package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1677 implements Iterable, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f5652;

    public C1677(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5650 = i;
        this.f5651 = AbstractC2902.m4891(i, i2, i3);
        this.f5652 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1677)) {
            return false;
        }
        if (isEmpty() && ((C1677) obj).isEmpty()) {
            return true;
        }
        C1677 c1677 = (C1677) obj;
        return this.f5650 == c1677.f5650 && this.f5651 == c1677.f5651 && this.f5652 == c1677.f5652;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5650 * 31) + this.f5651) * 31) + this.f5652;
    }

    public boolean isEmpty() {
        int i = this.f5652;
        int i2 = this.f5651;
        int i3 = this.f5650;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1678(this.f5650, this.f5651, this.f5652);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f5651;
        int i2 = this.f5650;
        int i3 = this.f5652;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
