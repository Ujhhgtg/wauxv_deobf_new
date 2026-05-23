package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1661 implements Iterable, InterfaceC1737 {

    public final int f5612;

    public final int f5613;

    public final int f5614;

    public C1661(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == -2147483648) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5612 = i;
        this.f5613 = AbstractC2201.m3971(i, i2, i3);
        this.f5614 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1661)) {
            return false;
        }
        if (isEmpty() && ((C1661) obj).isEmpty()) {
            return true;
        }
        C1661 c1661 = (C1661) obj;
        return this.f5612 == c1661.f5612 && this.f5613 == c1661.f5613 && this.f5614 == c1661.f5614;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5612 * 31) + this.f5613) * 31) + this.f5614;
    }

    public boolean isEmpty() {
        int i = this.f5614;
        int i2 = this.f5613;
        int i3 = this.f5612;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1662(this.f5612, this.f5613, this.f5614);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f5613;
        int i2 = this.f5612;
        int i3 = this.f5614;
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
