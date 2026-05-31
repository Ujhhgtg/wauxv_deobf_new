package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲇᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1919 extends C2488 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final long f6333;

    public C1919(C2480 c2480, C2491 c2491, long j, InterfaceC2715 interfaceC2715) {
        super(c2480, c2491, interfaceC2715);
        this.f6333 = j;
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public final long mo3868(InterfaceC2715 interfaceC2715, int i) {
        int i2 = i % 2;
        long j = this.f6333;
        if (i2 == 0) {
            return AbstractC2240.m4252(j).f7870 | ((long) 1);
        }
        return ((long) 2) | AbstractC2240.m4252(j).f7870;
    }
}
