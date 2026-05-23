package p000;

import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404 implements InterfaceC2786 {
    private final InterfaceC2786 delegate;

    public AbstractC1404(InterfaceC2786 interfaceC2786) {
        this.delegate = interfaceC2786;
    }

    public final InterfaceC2786 m3116deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC2786 delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC2786
    public long read(C0504 c0504, long j) {
        return this.delegate.read(c0504, j);
    }

    @Override // p000.InterfaceC2786
    public C3400 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
