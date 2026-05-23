package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2343 implements InterfaceC2786 {

    public final InterfaceC0508 f7531;

    public final C0504 f7532;

    public C2646 f7533;

    public int f7534;

    public boolean f7535;

    public long f7536;

    public C2343(InterfaceC0508 interfaceC0508) {
        this.f7531 = interfaceC0508;
        C0504 c0504Mo1760 = interfaceC0508.mo1760();
        this.f7532 = c0504Mo1760;
        C2646 c2646 = c0504Mo1760.f2171;
        this.f7533 = c2646;
        this.f7534 = c2646 != null ? c2646.f8540 : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7535 = true;
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) {
        C2646 c2646;
        C2646 c2647;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
        }
        if (this.f7535) {
            throw new IllegalStateException("closed");
        }
        C2646 c2648 = this.f7533;
        C0504 c0505 = this.f7532;
        if (c2648 != null && (c2648 != (c2647 = c0505.f2171) || this.f7534 != c2647.f8540)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f7531.mo1781(this.f7536 + 1)) {
            return -1L;
        }
        if (this.f7533 == null && (c2646 = c0505.f2171) != null) {
            this.f7533 = c2646;
            this.f7534 = c2646.f8540;
        }
        long jMin = Math.min(j, c0505.f2172 - this.f7536);
        this.f7532.m1768(this.f7536, c0504, jMin);
        this.f7536 += jMin;
        return jMin;
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return this.f7531.timeout();
    }
}
