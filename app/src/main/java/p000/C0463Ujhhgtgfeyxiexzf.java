package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ能不能ᛱfeyxiexzfᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0463Ujhhgtgfeyxiexzf extends AbstractC3534Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0466Ujhhgtgfeyxiexzf f2366Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463Ujhhgtgfeyxiexzf(InterfaceC2596feyxiexzfUjhhgtg interfaceC2596feyxiexzfUjhhgtg, C0466Ujhhgtgfeyxiexzf c0466Ujhhgtgfeyxiexzf) {
        super(interfaceC2596feyxiexzfUjhhgtg);
        this.f2366Ujhhgtgfeyxiexzf = c0466Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3534Ujhhgtgfeyxiexzf, p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
        super.write(c2598feyxiexzfUjhhgtg, j);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f2366Ujhhgtgfeyxiexzf.f2372Ujhhgtgfeyxiexzf;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        SystemClock.elapsedRealtime();
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
        }
    }
}
