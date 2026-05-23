package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1893 extends C2436 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final long f6259;

    public C1893(C2427 c2427, C2439 c2439, long j, InterfaceC2654 interfaceC2654) {
        super(c2427, c2439, interfaceC2654);
        this.f6259 = j;
    }

    @Override // p000.C2436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public final long mo3689(InterfaceC2654 interfaceC2654, int i) {
        int i2 = i % 2;
        long j = this.f6259;
        if (i2 == 0) {
            return AbstractC1459.m3187(j).f7726 | ((long) 1);
        }
        return ((long) 2) | AbstractC1459.m3187(j).f7726;
    }
}
