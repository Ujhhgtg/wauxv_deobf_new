package p000;

import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1384 extends AbstractC1404 {

    public final /* synthetic */ C1385 f4984;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384(InterfaceC2786 interfaceC2786, C1385 c1385) {
        super(interfaceC2786);
        this.f4984 = c1385;
    }

    @Override // p000.AbstractC1404, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4984.f4985.close();
        super.close();
    }
}
