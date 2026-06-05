package p000;

import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3530Ujhhgtgfeyxiexzf implements InterfaceC1227feyxiexzfUjhhgtg {
    private final InterfaceC1227feyxiexzfUjhhgtg delegate;

    public AbstractC3530Ujhhgtgfeyxiexzf(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) {
        this.delegate = interfaceC1227feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC1227feyxiexzfUjhhgtg m5082deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC1227feyxiexzfUjhhgtg delegate() {
        return this.delegate;
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        return this.delegate.read(c2598feyxiexzfUjhhgtg, j);
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public C1744Ujhhgtgfeyxiexzf timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
