package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2154 extends AbstractC1404 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2155 f7110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154(InterfaceC0508 interfaceC0508, C2155 c2155) {
        super(interfaceC0508);
        this.f7110 = c2155;
    }

    @Override // p000.AbstractC1404, p000.InterfaceC2786
    public final long read(C0504 c0504, long j) throws Exception {
        C2155 c2155 = this.f7110;
        C2148 c2148 = c2155.f7113;
        ConcurrentLinkedQueue concurrentLinkedQueue = c2155.f7112;
        try {
            long j2 = super.read(c0504, j);
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
            if (j2 == -1 && c2148 != null) {
                c2148.invoke();
            }
            return j2;
        } catch (Exception e) {
            if (c2148 != null) {
                c2148.invoke();
            }
            throw e;
        }
    }
}
