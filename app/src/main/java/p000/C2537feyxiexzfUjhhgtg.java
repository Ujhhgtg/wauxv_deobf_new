package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2537feyxiexzfUjhhgtg extends AbstractC2482feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f8261Ujhhgtgfeyxiexzf;

    public C2537feyxiexzfUjhhgtg(InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg) {
        super("Exceptions");
        try {
            if (interfaceC1790feyxiexzfUjhhgtg.mo3128Ujhhgtgfeyxiexzf()) {
                throw new C3267feyxiexzfUjhhgtg("exceptions.isMutable()", null);
            }
            this.f8261Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // p000.AbstractC2482feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2154Ujhhgtgfeyxiexzf() {
        return (this.f8261Ujhhgtgfeyxiexzf.size() * 2) + 8;
    }
}
