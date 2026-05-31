package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1412 implements InterfaceC2846 {
    private final InterfaceC2846 delegate;

    public AbstractC1412(InterfaceC2846 interfaceC2846) {
        this.delegate = interfaceC2846;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC2846 m3224deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC2846 delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2846
    public long read(C0481 c0481, long j) {
        return this.delegate.read(c0481, j);
    }

    @Override // p000.InterfaceC2846
    public C3459 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
