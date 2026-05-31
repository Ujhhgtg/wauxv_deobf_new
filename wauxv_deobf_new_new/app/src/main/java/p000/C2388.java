package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᤞᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2388 implements InterfaceC2846 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0485 f7661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0481 f7662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2707 f7663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f7665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public long f7666;

    public C2388(InterfaceC0485 interfaceC0485) {
        this.f7661 = interfaceC0485;
        C0481 c0481Mo1854 = interfaceC0485.mo1854();
        this.f7662 = c0481Mo1854;
        C2707 c2707 = c0481Mo1854.f2127;
        this.f7663 = c2707;
        this.f7664 = c2707 != null ? c2707.f8705 : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7665 = true;
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) {
        C2707 c2707;
        C2707 c2708;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
        }
        if (this.f7665) {
            throw new IllegalStateException("closed");
        }
        C2707 c2709 = this.f7663;
        C0481 c0482 = this.f7662;
        if (c2709 != null && (c2709 != (c2708 = c0482.f2127) || this.f7664 != c2708.f8705)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f7661.mo1875(this.f7666 + 1)) {
            return -1L;
        }
        if (this.f7663 == null && (c2707 = c0482.f2127) != null) {
            this.f7663 = c2707;
            this.f7664 = c2707.f8705;
        }
        long jMin = Math.min(j, c0482.f2128 - this.f7666);
        this.f7662.m1862(this.f7666, c0481, jMin);
        this.f7666 += jMin;
        return jMin;
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return this.f7661.timeout();
    }
}
