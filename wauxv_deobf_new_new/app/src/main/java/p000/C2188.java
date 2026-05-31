package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2188 extends AbstractC1412 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2189 f7234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2188(InterfaceC0485 interfaceC0485, C2189 c2189) {
        super(interfaceC0485);
        this.f7234 = c2189;
    }

    @Override // p000.AbstractC1412, p000.InterfaceC2846
    public final long read(C0481 c0481, long j) throws Exception {
        C2189 c2189 = this.f7234;
        C2182 c2182 = c2189.f7237;
        ConcurrentLinkedQueue concurrentLinkedQueue = c2189.f7236;
        try {
            long j2 = super.read(c0481, j);
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
            if (j2 == -1 && c2182 != null) {
                c2182.invoke();
            }
            return j2;
        } catch (Exception e) {
            if (c2182 != null) {
                c2182.invoke();
            }
            throw e;
        }
    }
}
