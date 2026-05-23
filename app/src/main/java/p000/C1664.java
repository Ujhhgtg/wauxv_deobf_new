package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 extends C1661 {

    public static final C1664 f5621 = new C1664(1, 0, 1);

    @Override // p000.C1661
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1664)) {
            return false;
        }
        if (isEmpty() && ((C1664) obj).isEmpty()) {
            return true;
        }
        C1664 c1664 = (C1664) obj;
        return this.f5612 == c1664.f5612 && this.f5613 == c1664.f5613;
    }

    @Override // p000.C1661
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5612 * 31) + this.f5613;
    }

    @Override // p000.C1661
    public final boolean isEmpty() {
        return this.f5612 > this.f5613;
    }

    @Override // p000.C1661
    public final String toString() {
        return this.f5612 + ".." + this.f5613;
    }
}
