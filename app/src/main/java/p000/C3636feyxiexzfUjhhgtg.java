package p000;

import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3636feyxiexzfUjhhgtg extends AbstractC3530Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3535Ujhhgtgfeyxiexzf f11366Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636feyxiexzfUjhhgtg(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg, C3535Ujhhgtgfeyxiexzf c3535Ujhhgtgfeyxiexzf) {
        super(interfaceC1227feyxiexzfUjhhgtg);
        this.f11366Ujhhgtgfeyxiexzf = c3535Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3530Ujhhgtgfeyxiexzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11366Ujhhgtgfeyxiexzf.f11036Ujhhgtgfeyxiexzf.close();
        super.close();
    }
}
