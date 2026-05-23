package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2647 implements Comparable {

    public int f8546;

    public int f8547;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8546 - ((C2647) obj).f8546;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f8546);
        sb.append(", end=");
        return AbstractC2784.m4750(sb, this.f8547, '}');
    }
}
