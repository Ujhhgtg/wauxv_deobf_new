package p000;

import android.os.Process;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ要点脸ᛴᛳᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0992feyxiexzfUjhhgtg extends Thread {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f3902Ujhhgtgfeyxiexzf;

    public C0992feyxiexzfUjhhgtg(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3902Ujhhgtgfeyxiexzf = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3902Ujhhgtgfeyxiexzf);
        super.run();
    }
}
