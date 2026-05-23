package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1388 extends AbstractC1403 {

    public final /* synthetic */ C1391 f5001;

    public final /* synthetic */ C1389 f5002;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388(C1391 c1391, C1389 c1389, InterfaceC2713 interfaceC2713) {
        super(interfaceC2713);
        this.f5001 = c1391;
        this.f5002 = c1389;
    }

    @Override // p000.AbstractC1403, p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1391 c1391 = this.f5001;
        C1389 c1389 = this.f5002;
        synchronized (c1391) {
            if (c1389.f5006) {
                return;
            }
            c1389.f5006 = true;
            super.close();
            this.f5002.f5003.commit();
        }
    }
}
