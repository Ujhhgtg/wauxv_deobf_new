package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲁᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1411 implements InterfaceC2774 {
    private final InterfaceC2774 delegate;

    public AbstractC1411(InterfaceC2774 interfaceC2774) {
        this.delegate = interfaceC2774;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC2774 m3223deprecated_delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC2774 delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2774, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p000.InterfaceC2774
    public C3459 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p000.InterfaceC2774
    public void write(C0481 c0481, long j) {
        this.delegate.write(c0481, j);
    }
}
