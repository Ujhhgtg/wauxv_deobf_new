package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛲ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2520feyxiexzfUjhhgtg implements InterfaceC1026feyxiexzfUjhhgtg {
    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return C1744Ujhhgtgfeyxiexzf.NONE;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws EOFException {
        c2598feyxiexzfUjhhgtg.skip(j);
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public final void flush() {
    }
}
