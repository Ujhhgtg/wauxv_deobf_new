package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1396 extends AbstractC1411 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1399 f5030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1397 f5031;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396(C1399 c1399, C1397 c1397, InterfaceC2774 interfaceC2774) {
        super(interfaceC2774);
        this.f5030 = c1399;
        this.f5031 = c1397;
    }

    @Override // p000.AbstractC1411, p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1399 c1399 = this.f5030;
        C1397 c1397 = this.f5031;
        synchronized (c1399) {
            if (c1397.f5035) {
                return;
            }
            c1397.f5035 = true;
            super.close();
            this.f5031.f5032.commit();
        }
    }
}
