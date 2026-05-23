package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1403 implements InterfaceC2713 {
    private final InterfaceC2713 delegate;

    public AbstractC1403(InterfaceC2713 interfaceC2713) {
        this.delegate = interfaceC2713;
    }

    public final InterfaceC2713 m3115deprecated_delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC2713 delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2713, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p000.InterfaceC2713
    public C3400 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p000.InterfaceC2713
    public void write(C0504 c0504, long j) {
        this.delegate.write(c0504, j);
    }
}
