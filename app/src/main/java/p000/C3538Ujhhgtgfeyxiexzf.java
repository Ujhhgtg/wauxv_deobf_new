package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛲᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3538Ujhhgtgfeyxiexzf extends AbstractC3534Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C3521Ujhhgtgfeyxiexzf f11052Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3539Ujhhgtgfeyxiexzf f11053Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3538Ujhhgtgfeyxiexzf(C3521Ujhhgtgfeyxiexzf c3521Ujhhgtgfeyxiexzf, C3539Ujhhgtgfeyxiexzf c3539Ujhhgtgfeyxiexzf, InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg) {
        super(interfaceC1026feyxiexzfUjhhgtg);
        this.f11052Ujhhgtgfeyxiexzf = c3521Ujhhgtgfeyxiexzf;
        this.f11053Ujhhgtgfeyxiexzf = c3539Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3521Ujhhgtgfeyxiexzf c3521Ujhhgtgfeyxiexzf = this.f11052Ujhhgtgfeyxiexzf;
        C3539Ujhhgtgfeyxiexzf c3539Ujhhgtgfeyxiexzf = this.f11053Ujhhgtgfeyxiexzf;
        synchronized (c3521Ujhhgtgfeyxiexzf) {
            if (c3539Ujhhgtgfeyxiexzf.f11057Ujhhgtgfeyxiexzf) {
                return;
            }
            c3539Ujhhgtgfeyxiexzf.f11057Ujhhgtgfeyxiexzf = true;
            super.close();
            this.f11053Ujhhgtgfeyxiexzf.f11054Ujhhgtgfeyxiexzf.commit();
        }
    }
}
