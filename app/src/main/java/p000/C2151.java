package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2151 extends AbstractC1403 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2152 f7103;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2151(InterfaceC0507 interfaceC0507, C2152 c2152) {
        super(interfaceC0507);
        this.f7103 = c2152;
    }

    @Override // p000.AbstractC1403, p000.InterfaceC2713
    public final void write(C0504 c0504, long j) {
        super.write(c0504, j);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f7103.f7105;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        SystemClock.elapsedRealtime();
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
    }
}
