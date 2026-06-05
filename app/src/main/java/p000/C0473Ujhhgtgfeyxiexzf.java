package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ要点脸能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0473Ujhhgtgfeyxiexzf extends AbstractC3530Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0474Ujhhgtgfeyxiexzf f2381Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0473Ujhhgtgfeyxiexzf(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, C0474Ujhhgtgfeyxiexzf c0474Ujhhgtgfeyxiexzf) {
        super(interfaceC2595feyxiexzfUjhhgtg);
        this.f2381Ujhhgtgfeyxiexzf = c0474Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3530Ujhhgtgfeyxiexzf, p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws Exception {
        C0474Ujhhgtgfeyxiexzf c0474Ujhhgtgfeyxiexzf = this.f2381Ujhhgtgfeyxiexzf;
        C0467Ujhhgtgfeyxiexzf c0467Ujhhgtgfeyxiexzf = c0474Ujhhgtgfeyxiexzf.f2384Ujhhgtgfeyxiexzf;
        ConcurrentLinkedQueue concurrentLinkedQueue = c0474Ujhhgtgfeyxiexzf.f2383Ujhhgtgfeyxiexzf;
        try {
            long j2 = super.read(c2598feyxiexzfUjhhgtg, j);
            if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                SystemClock.elapsedRealtime();
                Iterator it = concurrentLinkedQueue.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            if (j2 == -1 && c0467Ujhhgtgfeyxiexzf != null) {
                c0467Ujhhgtgfeyxiexzf.invoke();
            }
            return j2;
        } catch (Exception e) {
            if (c0467Ujhhgtgfeyxiexzf != null) {
                c0467Ujhhgtgfeyxiexzf.invoke();
            }
            throw e;
        }
    }
}
