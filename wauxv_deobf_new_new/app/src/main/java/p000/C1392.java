package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1392 extends AbstractC1412 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1393 f5013;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392(InterfaceC2846 interfaceC2846, C1393 c1393) {
        super(interfaceC2846);
        this.f5013 = c1393;
    }

    @Override // p000.AbstractC1412, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5013.f5014.close();
        super.close();
    }
}
