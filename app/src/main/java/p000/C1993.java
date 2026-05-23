package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᛸᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1993 extends C1870 {
    @Override // p000.C1870
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo3651(Object obj, Object obj2) {
        C1994 c1994 = (C1994) obj;
        
        ArrayDeque arrayDeque = C1994.f6653;
        synchronized (arrayDeque) {
            arrayDeque.offer(c1994);
        }
    }
}
