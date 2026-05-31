package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲀᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1670 implements InterfaceC1671 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final long f5637;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5638;

    public C1670(long j, int i) {
        this.f5637 = j;
        this.f5638 = i;
    }

    @Override // p000.InterfaceC1671
    public final C1666 toInstant() {
        long j = C1666.f5630.f5632;
        long j2 = this.f5637;
        if (j2 >= j && j2 <= C1666.f5631.f5632) {
            return AbstractC1468.m3305(this.f5638, j2);
        }
        throw new C1667("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
