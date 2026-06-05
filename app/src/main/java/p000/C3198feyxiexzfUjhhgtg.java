package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛴ能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3198feyxiexzfUjhhgtg extends Exception {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Throwable f9884Ujhhgtgfeyxiexzf;

    public C3198feyxiexzfUjhhgtg(Throwable th, AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        super("Coroutine dispatcher " + abstractC3740feyxiexzfUjhhgtg + " threw an exception, context = " + interfaceC3739feyxiexzfUjhhgtg, th);
        this.f9884Ujhhgtgfeyxiexzf = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f9884Ujhhgtgfeyxiexzf;
    }
}
