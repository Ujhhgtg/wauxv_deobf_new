package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛲ能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3240feyxiexzfUjhhgtg implements InterfaceC1117feyxiexzfUjhhgtg, InterfaceC3236feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1117feyxiexzfUjhhgtg f10157Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f10158Ujhhgtgfeyxiexzf;

    public C3240feyxiexzfUjhhgtg(InterfaceC1117feyxiexzfUjhhgtg interfaceC1117feyxiexzfUjhhgtg, int i) {
        this.f10157Ujhhgtgfeyxiexzf = interfaceC1117feyxiexzfUjhhgtg;
        this.f10158Ujhhgtgfeyxiexzf = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p000.InterfaceC1117feyxiexzfUjhhgtg
    public final Iterator iterator() {
        return new C3239feyxiexzfUjhhgtg(this);
    }

    @Override // p000.InterfaceC3236feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1117feyxiexzfUjhhgtg mo4740Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f10158Ujhhgtgfeyxiexzf + i;
        return i2 < 0 ? new C3240feyxiexzfUjhhgtg(this, i) : new C3240feyxiexzfUjhhgtg(this.f10157Ujhhgtgfeyxiexzf, i2);
    }
}
