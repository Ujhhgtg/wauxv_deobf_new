package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1962Ujhhgtgfeyxiexzf extends AbstractRunnableC1963Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Runnable f6437Ujhhgtgfeyxiexzf;

    public C1962Ujhhgtgfeyxiexzf(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.f6437Ujhhgtgfeyxiexzf = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6437Ujhhgtgfeyxiexzf.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f6437Ujhhgtgfeyxiexzf;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(runnable));
        sb.append(", ");
        sb.append(this.f6438Ujhhgtgfeyxiexzf);
        sb.append(", ");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6439Ujhhgtgfeyxiexzf ? "Blocking" : "Non-blocking", ']');
    }
}
