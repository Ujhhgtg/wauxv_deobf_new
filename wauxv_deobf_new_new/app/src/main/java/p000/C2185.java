package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2185 extends AbstractC1411 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2186 f7227;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185(InterfaceC0484 interfaceC0484, C2186 c2186) {
        super(interfaceC0484);
        this.f7227 = c2186;
    }

    @Override // p000.AbstractC1411, p000.InterfaceC2774
    public final void write(C0481 c0481, long j) {
        super.write(c0481, j);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f7227.f7229;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        SystemClock.elapsedRealtime();
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
    }
}
