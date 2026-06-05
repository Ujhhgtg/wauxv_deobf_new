package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳ能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3534Ujhhgtgfeyxiexzf implements InterfaceC1026feyxiexzfUjhhgtg {
    private final InterfaceC1026feyxiexzfUjhhgtg delegate;

    public AbstractC3534Ujhhgtgfeyxiexzf(InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg) {
        this.delegate = interfaceC1026feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC1026feyxiexzfUjhhgtg m5084deprecated_delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC1026feyxiexzfUjhhgtg delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public C1744Ujhhgtgfeyxiexzf timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        this.delegate.write(c2598feyxiexzfUjhhgtg, j);
    }
}
